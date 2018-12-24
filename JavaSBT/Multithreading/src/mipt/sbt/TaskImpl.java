package mipt.sbt;

import java.util.concurrent.Callable;

/**
 * Created by Violetta on 30/11/2018.
 */
public class TaskImpl<T> implements Task<T> {

    private final Callable<? extends T> callable;
    private volatile T result;

    public TaskImpl(Callable<T> callable) throws Exception {
        this.callable = callable;
    }

    //первый поток вызывает call Отсальные потоки сразу возвращают полученный результат
    //Если ошибка ТО сразу выкидывать ошибку
    //если get одновременно то выполнение callsble только один поток
    @Override
    public T get() {
        if (result == null){
            synchronized (this) {
                if (result == null) {
                    try {
                        result = callable.call();
                        System.out.println("Call!" + result);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {

                    }
                }
            }
        }
        return result;
    }
}
