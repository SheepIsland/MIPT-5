import React, { Component } from 'react';
import { 
  BrowserRouter as Router,
  Route,
  Link,
} from 'react-router-dom';

//components
import Header from './components/headerComponent/header'
import HomePage from './components/pages/homePage'
import Start from './components/pages/startPage'

class App extends Component {
  render() {
    return (
      <Router>
      <div className="App">
        <Route exact path='/' component={Start}/>
        <Route exact path='/home' component={HomePage}/>
      </div>  
      </Router>
    );
  }
}

export default App;
