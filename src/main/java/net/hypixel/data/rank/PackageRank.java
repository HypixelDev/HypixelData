package net.hypixel.data.rank;

import java.util.Collection;
import java.util.EnumSet;
import java.util.Optional;

public enum PackageRank {
    NONE(1),
    VIP(2),
    VIP_PLUS(3),
    MVP(4),
    MVP_PLUS(5),
    ;

    private static final EnumSet<PackageRank> VALUES = EnumSet.allOf(PackageRank.class);
    private final int id;

    PackageRank(int id) {
        this.id = id;
    }

    public static Collection<PackageRank> getValues() {
        return VALUES;
    }

    public static Optional<PackageRank> getById(int id) {
        return getValues().stream()
                .filter((pr) -> pr.getId() == id)
                .findFirst();
    }

    public int getId() {
        return id;
    }

}
