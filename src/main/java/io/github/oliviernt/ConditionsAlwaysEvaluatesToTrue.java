package io.github.oliviernt;

import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ConditionsAlwaysEvaluatesToTrue {

    private static final Logger LOGGER = LogManager.getLogManager().getLogger(ConditionsAlwaysEvaluatesToTrue.class.getCanonicalName());


    public void thisIsAlwaysTrue() {

        String strA = getString();
        String strB = getString();

        if (!Objects.equals(strA, strB)) {
            if (strA == null && strB != null) {
                LOGGER.info("strA is null but strB is not");
            } else if (strA != null && strB == null) {
                LOGGER.info("strA is not null but strB is");
            } else {
                LOGGER.info("neither strA nor strB are null");
            }
        }
    }


    public static String getString() {
        return System.currentTimeMillis() % 2 == 0 ? null : "a string";
    }
}
