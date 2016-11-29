/**
 * Created by Finderhu on 2016/11/28.
 */

import React,{ Component } from 'react';
import { Row, Col, Button, Input } from 'antd';
import StringUtil from 'underscore.string';
import $ from 'jquery';


class Register extends Component{
    constructor(props) {
        super(props)
    }
    register(){
        let register = this;
        let user = this.getUserInfo();
        let passedCheck = this.checkUserInfo(user);
        if(passedCheck){
            $.ajax({
                url:"/account/register",
                data:user,
                success:register.registerCallback.bind(register)
                }
            )
        }
    }
    registerCallback(result){
        if(result == undefined){
            alert("注册失败");
            return;
        }
        if(result.success){
            alert("注册成功");
            return;
        }
    }
    getUserInfo(){
        let user = {
            username:this.refs.username.refs.input.value.trim(),
            gender:this.refs.gender.refs.input.value.trim(),
            age:this.refs.age.refs.input.value.trim(),
            email:this.refs.email.refs.input.value.trim(),
            password:this.refs.password.refs.input.value.trim(),
            repeatPassword:this.refs.repeatPassword.refs.input.value.trim(),
        }
        return user;
    }
    checkUserInfo(user){
        if(user == undefined)
            return false;
        if(StringUtil.isBlank(user.username)){
            alert("请填写用户名");
            return false;
        }
        if(StringUtil.isBlank(user.email)){
            alert("请填写电子邮箱");
            return false;
        }
        if(StringUtil.isBlank(user.password)){
            alert("请填写密码");
            return false;
        }
        if(StringUtil.isBlank(user.repeatPassword)){
            alert("请重复密码");
            return false;
        }
        if(user.password !== user.repeatPassword){
            alert("密码不一致");
            return false;
        }
        return true;
    }
    render(){
        return(
            <div>
                <Row type={'flex'} justify={'center'}>
                    <Col xs={14} sm={13} md={9} lg={5}>
                        <Row><Input addonBefore={'用户名:'} ref="username"/></Row>
                        <Row><Input addonBefore={'性别:'} ref="gender"/></Row>
                        <Row><Input addonBefore={'年龄:'} ref="age"/></Row>
                        <Row><Input addonBefore={'电子邮箱:'} ref="email"/></Row>
                        <Row><Input addonBefore={'密码:'} type={"password"} ref="password"/></Row>
                        <Row><Input addonBefore={'重复密码:'} type={'password'} ref="repeatPassword"/></Row>
                        <Row><Button onClick={this.register.bind(this)}>注册</Button></Row>
                    </Col>
                </Row>
            </div>
        )
    }
}

module.exports = Register;