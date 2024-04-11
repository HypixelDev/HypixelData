package net.hypixel.data.rank;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum PackageRank {
    NONE(1),
    VIP(2),
    VIP_PLUS(3),
    MVP(4),
    MVP_PLUS(5),
    ;

    private static final Collection<PackageRank> VALUES = Arrays.asList(values());
    private static final Map<Byte, PackageRank> BY_ID = VALUES.stream().collect(Collectors.toMap(PackageRank::getId, Function.identity()));

    public static Collection<PackageRank> getValues() {
        return VALUES;
    }

    public static Optional<PackageRank> getById(byte id) {
        return Optional.ofNullable(BY_ID.get(id));
    }

    private final byte id;

    PackageRank(int id) {
        this.id = (byte) id;
    }

    public byte getId() {
        return id;
    }

}
