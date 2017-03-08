package io.github.oliviernt;

public final class Assertions {

    private Assertions() {
        // private utility constructor
    }

    public static void notNull(Object obj) {

        if (obj == null) {
            throw new IllegalArgumentException("Object must no be null!");
        }
    }
}
