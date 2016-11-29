/**
 * Created by Finderhu on 2016/11/28.
 */

import React,{ Component } from 'react';
import { Row, Col, Button, Input } from 'antd';

class Register extends Component{
    constructor(props){
        super(props)
    }

    render(){
        return(
            <div>
                <Row>
                    {/*<Col span={8}></Col>*/}
                    <Col span={8}>
                        <Row><Input addonBefore={'用户名'}/></Row>
                        <Row><Input addonBefore={'性别'}/></Row>
                        <Row><Input addonBefore={'年龄'}/></Row>
                        <Row><Input addonBefore={'电子邮箱'}/></Row>
                        <Row><Input addonBefore={'密码：'} type={"password"}/></Row>
                        <Row><Input addonBefore={'重复密码：'} type={'password'}/></Row>
                        <Row><Button>注册</Button></Row>
                    </Col>
                    {/*<Col span={8}></Col>*/}

                </Row>



            </div>
        )
    }
}

module.exports = Register;