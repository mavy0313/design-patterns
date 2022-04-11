package com.mavy0313.patterns.refactoring_guru.chainofresponsibility.logger;

public class App {
  public static void main(String[] args) {
    Logger logger, logger1, logger2;
    logger = new StdOutLogger(Logger.DEBUG);
    logger1 = logger.setNext(new EmailLogger(Logger.NOTICE));
    logger2 = logger1.setNext(new StdErrLogger(Logger.ERR));


    // output Sending to stderr: Error occurred
//    logger = new StdOutLogger(Logger.DEBUG)
//        .setNext(new EmailLogger(Logger.NOTICE))
//        .setNext(new StderrLogger(Logger.ERR));

    logger.message("Entering fun y", Logger.DEBUG);
    logger.message("Step1 completed", Logger.NOTICE);
    logger.message("Error occurred", Logger.ERR);
  }
}
