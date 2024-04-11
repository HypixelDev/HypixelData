package net.hypixel.data.type;

import java.util.Arrays;
import java.util.Collection;

/**
 * A LobbyType is used for lobbies which do not have a gametype linked.
 */
public enum LobbyType implements ServerType {
    MAIN("Main Lobby"),
    TOURNAMENT("Tournament Hall"),
    ;

    private static final Collection<LobbyType> VALUES = Arrays.asList(values());

    public static Collection<LobbyType> getValues() {
        return VALUES;
    }

    private final String name;

    LobbyType(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
