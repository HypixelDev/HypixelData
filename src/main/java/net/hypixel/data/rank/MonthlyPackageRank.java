package net.hypixel.data.rank;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Optional;

public enum MonthlyPackageRank {
    NONE(1),
    SUPERSTAR(2),
    ;

    private static final EnumSet<MonthlyPackageRank> VALUES = EnumSet.allOf(MonthlyPackageRank.class);
    private final int id;

    MonthlyPackageRank(int id) {
        this.id = id;
    }

    public static Collection<MonthlyPackageRank> getValues() {
        return VALUES;
    }

    public static Optional<MonthlyPackageRank> getById(int id) {
        return getValues().stream()
                .filter((mpr) -> mpr.getId() == id)
                .findFirst();
    }

    public int getId() {
        return id;
    }
}
