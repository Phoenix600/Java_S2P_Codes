package javaLogger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Example1.class.getSimpleName());
        logger.setLevel(Level.FINE);
    }
}
