package com.test.controller;

import com.test.Interface.DBConnector;
import com.test.domain.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Author: jianliangzhang
 * Date: 2017/11/23
 * Time: 14:26
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    ConfigBean configBean;
    @Autowired
    DBConnector dbConnector;

    @RequestMapping(value="/user")
    public String user() {
        dbConnector.configure();
        return configBean.getWish();
    }

    @RequestMapping(value="/name/{user}", method= RequestMethod.GET)
    public String getName(@PathVariable String user) {
        return user;
    }
}