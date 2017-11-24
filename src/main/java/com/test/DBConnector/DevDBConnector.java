package com.test.DBConnector;

import com.test.Interface.DBConnector;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Author: jianliangzhang
 * Date: 2017/11/23
 * Time: 15:13
 */
@Component
@Profile("dev")
public class DevDBConnector implements DBConnector{
    @Override
    public void configure() {
        System.out.println("dev db");
    }
}