package net.hypixel.data.region;

import java.util.Arrays;
import java.util.Collection;

public enum Environment {
    PRODUCTION, // The Production Hypixel Network - "mc.hypixel.net"
    BETA, // The Alpha Hypixel Network - "alpha.hypixel.net"
    TEST, // The Test Hypixel Network - For Hypixel Developers
    ;

    private static final Collection<Environment> VALUES = Arrays.asList(values());

    public static Collection<Environment> getValues() {
        return VALUES;
    }
}
