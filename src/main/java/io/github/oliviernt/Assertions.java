package io.github.oliviernt;

public final class Assertions {

    private Assertions() {
        // private utility constructor
    }

    public static <T> T notNull(T obj) {

        if (obj == null) {
            throw new IllegalArgumentException("Object must no be null!");
        }

        return obj;
    }
}
