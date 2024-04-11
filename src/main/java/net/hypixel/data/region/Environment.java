package net.hypixel.data.region;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Environment {
    PRODUCTION(0), // The Production Hypixel Network - "mc.hypixel.net"
    BETA(1), // The Alpha Hypixel Network - "alpha.hypixel.net"
    TEST(2), // The Test Hypixel Network - For Hypixel Developers
    ;

    private static final Collection<Environment> VALUES = Arrays.asList(values());
    private static final Map<Integer, Environment> BY_ID = VALUES.stream().collect(Collectors.toMap(Environment::getId, Function.identity()));

    public static Collection<Environment> getValues() {
        return VALUES;
    }

    public static Optional<Environment> getById(int id) {
        return Optional.ofNullable(BY_ID.get(id));
    }

    private final int id;

    Environment(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
