package com.example.logdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
    private static final Logger log = LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] agrs){
        log.info("--info---");
        log.debug("---debug--");
    }
}
