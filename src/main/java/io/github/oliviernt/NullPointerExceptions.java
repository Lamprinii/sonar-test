package io.github.oliviernt;

import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class NullPointerExceptions {

    private static final Logger LOGGER = LogManager.getLogManager().getLogger(NullPointerExceptions.class.getCanonicalName());


    public void codeThatDoesNotThrowANullPointerException() {

        String string = null;
        if (System.currentTimeMillis() % 2 == 0) {
            string = "% 2 == 0";
        }

        Assertions.notNull(string);

        string = string.toUpperCase();

        LOGGER.info(string);
    }


    public void codeThatDoesNotThrowANullPointerExceptionWithObjects() {

        String string = null;
        if (System.currentTimeMillis() % 2 == 0) {
            string = "% 2 == 0";
        }

        Objects.requireNonNull(string);

        string = string.toUpperCase();

        LOGGER.info(string);
    }
}
