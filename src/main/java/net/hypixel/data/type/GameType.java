package net.hypixel.data.type;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum GameType implements ServerType {
    QUAKECRAFT("Quakecraft", "Quake", 2),
    WALLS("Walls", "Walls", 3),
    PAINTBALL("Paintball", "Paintball", 4),
    SURVIVAL_GAMES("Blitz Survival Games", "HungerGames", 5),
    TNTGAMES("The TNT Games", "TNTGames", 6),
    VAMPIREZ("VampireZ", "VampireZ", 7),
    WALLS3("Mega Walls", "Walls3", 13),
    ARCADE("Arcade", "Arcade", 14),
    ARENA("Arena Brawl", "Arena", 17),
    MCGO("Cops and Crims", "MCGO", 21),
    UHC("UHC Champions", "UHC", 20),
    BATTLEGROUND("Warlords", "Battleground", 23),
    SUPER_SMASH("Smash Heroes", "SuperSmash", 24),
    GINGERBREAD("Turbo Kart Racers", "GingerBread", 25),
    HOUSING("Housing", "Housing", 26),
    SKYWARS("SkyWars", "SkyWars", 51),
    TRUE_COMBAT("Crazy Walls", "TrueCombat", 52),
    SPEED_UHC("Speed UHC", "SpeedUHC", 54),
    SKYCLASH("SkyClash", "SkyClash", 55),
    LEGACY("Classic Games", "Legacy", 56),
    PROTOTYPE("Prototype", "Prototype", 57),
    BEDWARS("Bed Wars", "Bedwars", 58),
    MURDER_MYSTERY("Murder Mystery", "MurderMystery", 59),
    BUILD_BATTLE("Build Battle", "BuildBattle", 60),
    DUELS("Duels", "Duels", 61),
    SKYBLOCK("SkyBlock", "SkyBlock", 63),
    PIT("Pit", "Pit", 64),
    REPLAY("Replay", "Replay", 65),
    SMP("SMP", "SMP", 67),
    WOOL_GAMES("Wool Wars", "WoolGames", 68),
    ;

    private static final Collection<GameType> VALUES = Arrays.asList(values());
    private static final Map<Integer, GameType> BY_ID = VALUES.stream().collect(Collectors.toMap(GameType::getId, Function.identity()));
    private static final Map<String, GameType> BY_DATABASE_NAME = VALUES.stream().collect(Collectors.toMap(GameType::getDatabaseName, Function.identity()));

    public static Collection<GameType> getValues() {
        return VALUES;
    }

    /**
     * @param id The internal id
     * @return An optional containing the GameType associated with that id, or empty if there isn't one.
     */
    public static Optional<GameType> getById(int id) {
        return Optional.ofNullable(BY_ID.get(id));
    }

    /**
     * @param databaseName The key used in the database
     * @return An optional containing the GameType associated with that key, or empty if there isn't one.
     */
    public static Optional<GameType> getByDatabaseName(String databaseName) {
        return Optional.ofNullable(BY_DATABASE_NAME.get(databaseName));
    }

    private final String name, databaseName;
    private final int id;

    GameType(String name, String databaseName, int id) {
        this.name = name;
        this.databaseName = databaseName;
        this.id = id;
    }

    /**
     * @return The official name of the GameType
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @return The internal ID that is occasionally used in various database schemas
     */
    public int getId() {
        return id;
    }

    public String getDatabaseName() {
        return databaseName;
    }
}
