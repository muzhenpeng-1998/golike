package com.project.logon.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author nameM
 */
@Controller
public class LogonController {

    final static Logger logger = LoggerFactory.getLogger(LogonController.class);

    @GetMapping("/logon")
    private String helloWorld(){
        logger.info("恭喜你 进入此系统 ");
        return "index";
    }
}
