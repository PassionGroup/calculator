/**
 * Created by longhuai.hlh on 2016/11/25.
 */
import React,{Component} from 'react';
// import ajax from '@alipay/ajax';
import {Button} from 'antd';

class Login extends Component{
  constructor(props){
    super(props);
  }

  sendMessage(){
    // ajax({
    //     url:'users',
    //     type:'get',
    //     success: (result)=>{
    //         console.log('result is:' + result);
    //     }
    // })
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


