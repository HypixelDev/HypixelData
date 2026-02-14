package net.hypixel.data.region;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Optional;

public enum Environment {
    PRODUCTION(0), // The Production Hypixel Network - "mc.hypixel.net"
    BETA(1), // The Alpha Hypixel Network - "alpha.hypixel.net"
    TEST(2), // The Test Hypixel Network - For Hypixel Developers
    ;

    private static final EnumSet<Environment> VALUES = EnumSet.allOf(Environment.class);
    private final int id;

    Environment(int id) {
        this.id = id;
    }

    public static Collection<Environment> getValues() {
        return VALUES;
    }

    public static Optional<Environment> getById(int id) {
        return getValues().stream()
                .filter((env) -> env.getId() == id)
                .findFirst();
    }

    public int getId() {
        return id;
    }
}
