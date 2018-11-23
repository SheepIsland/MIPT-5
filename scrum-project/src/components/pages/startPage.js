import React, { Component } from 'react';
import logo from './explainMe.png';
import { 
  Button,
  ButtonToolbar 
} from 'reactstrap';

import '/Users/Violetta/dev/react/scrum-project/src/Assets/css/app.min.css';
import { 
  BrowserRouter as Router,
  Route,
  Link,
} from 'react-router-dom';

class Start extends Component {
  render() {
    return (
      <header className="App-header">
      <div className="App">
          <img src={logo} className="App-logo" alt="logo" />
          <div className="Links">
            <button type="button" class="btn btn-outline-light btn-lg">
            <Link to='/home' className="Link">Login</Link>
            </button>
            <button type="button" class="btn btn-outline-light btn-lg">
            <Link to='/home' className="Link">Registration</Link>
            </button>
          </div>
      </div>
      </header>
    );
  }
}

export default Start;
