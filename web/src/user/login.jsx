/**
 * Created by longhuai.hlh on 2016/11/25.
 */
//noinspection JSUnresolvedVariable
import React,{Component} from 'react';
import $ from 'jquery';
import {Button} from 'antd';

class Login extends Component{
  constructor(props){
    super(props);
  }

  sendMessage(){
      $.ajax({
          url:'/user',
          dataType: 'json',
          cache: false,
          success: function(data) {
              console.log(data);
          }.bind(this),
          error: function(xhr, status, err) {
              console.error('get no data');
          }.bind(this)
      });
  }

  render(){
    return(
        <div>
          <Button onClick={this.sendMessage.bind(this)}></Button>
        </div>
    )
  }
}

module.exports = Login;


