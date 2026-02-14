package net.hypixel.data.type;

import java.util.Collection;
import java.util.EnumSet;

/**
 * A LobbyType is used for lobbies which do not have a gametype linked.
 */
public enum LobbyType implements ServerType {
    MAIN("Main Lobby"),
    TOURNAMENT("Tournament Hall"),
    ;

    private static final EnumSet<LobbyType> VALUES = EnumSet.allOf(LobbyType.class);
    private final String name;

    LobbyType(String name) {
        this.name = name;
    }

    public static Collection<LobbyType> getValues() {
        return VALUES;
    }

    @Override
    public String getName() {
        return name;
    }
}
