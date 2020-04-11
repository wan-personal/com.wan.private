package com.wan.ex;

import org.apache.log4j.Logger;
import org.apache.log4j.helpers.OptionConverter;

public class Ex_Log4J {

    public static void main(String[] args) {
        System.out.println("Ex Log4J Test ...");

        System.out.println(OptionConverter.getSystemProperty(
                "log4j.configuratorClass",
                null));

        Logger logger = Logger.getLogger(Ex_Log4J.class);

        logger.info("");

    }
}
