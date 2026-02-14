package net.hypixel.data.type;

import java.util.Optional;

public interface ServerType {

    static Optional<ServerType> valueOf(String value) {
        try {
            return Optional.of(GameType.valueOf(value));
        } catch (IllegalArgumentException e) {
            // ignored
        }

        try {
            return Optional.of(LobbyType.valueOf(value));
        } catch (IllegalArgumentException e) {
            // ignored
        }

        return Optional.empty();
    }

    String name();

    String getName();

}
