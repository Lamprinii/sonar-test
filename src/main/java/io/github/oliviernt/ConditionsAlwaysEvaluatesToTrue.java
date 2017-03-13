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
            if (strA == null && strB != null) { // not a false positive as the Objects.equals check asserts that if strA is null, strB is not.
                LOGGER.info("strA is null but strB is not");
            } else if (strA != null && strB == null) { // not a false positive as Object.equals and the previous if conditions already asserted that strA is not null
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
