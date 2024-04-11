package net.hypixel.data.rank;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum MonthlyPackageRank {
    NONE(1),
    SUPERSTAR(2),
    ;

    private static final Collection<MonthlyPackageRank> VALUES = Arrays.asList(values());
    private static final Map<Byte, MonthlyPackageRank> BY_ID = VALUES.stream().collect(Collectors.toMap(MonthlyPackageRank::getId, Function.identity()));

    public static Collection<MonthlyPackageRank> getValues() {
        return VALUES;
    }

    public static Optional<MonthlyPackageRank> getById(byte id) {
        return Optional.ofNullable(BY_ID.get(id));
    }

    private final byte id;

    MonthlyPackageRank(int id) {
        this.id = (byte) id;
    }

    public byte getId() {
        return id;
    }
}
