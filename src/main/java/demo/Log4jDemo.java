package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

    //https://www.youtube.com/watch?v=rbuR9Q_55h4&list=PLhW3qG5bs-L8oRay6qeS70vJYZ3SBQnFa&index=16

    /**
     * log4j2   properties is taken from here ('Log4J2PropertiesConfTest.java" section) : https://springframework.guru/log4j-2-configuration-using-properties-file/
     * and put to the log4j2.properties file
     */

    private static Logger logger = LogManager.getLogger(Log4jDemo.class);  //I can log all situation and messages (test execution status) in a separate file from Log4jDemo.class

    public static void main(String[] args) {
        System.out.println("Hello Logger!!!");

        logger.info("This is information message");
        logger.error("This is an error message");
        logger.warn("This is a warning message");
        logger.fatal("This is a fatal message");

        System.out.println("Completed");
    }
}
