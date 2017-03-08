package io.github.oliviernt;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ConditionsAlwaysEvaluatesToTrue {

    private static final Logger LOGGER = LogManager.getLogManager().getLogger(ConditionsAlwaysEvaluatesToTrue.class.getCanonicalName());


    public void thisIsAlwaysTrue() {

        if (System.currentTimeMillis() % 2 == 0) {
            message("% 2 == 0");
        } else {
            message("% 2 == 1");
        }

    }

    public static void message(String msg) {
        LOGGER.info(msg);
    }
}
