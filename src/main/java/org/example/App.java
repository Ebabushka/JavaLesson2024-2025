package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args){

        logger.debug("Debug log message");
        logger.info("Info log message");
        logger.error("Error log message");

    }
}
