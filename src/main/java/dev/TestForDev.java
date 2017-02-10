package dev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Igor on 13.12.15.
 */
public class TestForDev {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestForDev.class.getName());

    public void printInfo() {
        LOGGER.trace("Trace message");
        LOGGER.debug("Debug message");
        LOGGER.info("Info message");
        LOGGER.warn("Warn message");
        LOGGER.error("Error message");
    }
}
