import React from 'react';
import ReactDOM from 'react-dom';
import '../index.css';
import { DatePicker } from 'antd';
import Login from './user/login';
import Register from './user/register';

function App() {
  return (
    <div style={{ margin: 100 }}>
      <h1>AntDesign Demo</h1>
      <hr /><br />
      <Login/>
      <Register/>
    </div>
  );
}

ReactDOM.render(<App />, document.getElementById('root'));
