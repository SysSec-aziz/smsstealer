package com.vdodsodjsdt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class XOTOHmUA5NYhlyOBh7 {
    private static final /* synthetic */ XOTOHmUA5NYhlyOBh7[] $VALUES;
    public static final o1NoklOWF2A92NV1 Companion;
    public static final XOTOHmUA5NYhlyOBh7 ON_ANY;
    public static final XOTOHmUA5NYhlyOBh7 ON_CREATE;
    public static final XOTOHmUA5NYhlyOBh7 ON_DESTROY;
    public static final XOTOHmUA5NYhlyOBh7 ON_PAUSE;
    public static final XOTOHmUA5NYhlyOBh7 ON_RESUME;
    public static final XOTOHmUA5NYhlyOBh7 ON_START;
    public static final XOTOHmUA5NYhlyOBh7 ON_STOP;

    static {
        XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7 = new XOTOHmUA5NYhlyOBh7("ON_CREATE", 0);
        ON_CREATE = xOTOHmUA5NYhlyOBh7;
        XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh72 = new XOTOHmUA5NYhlyOBh7("ON_START", 1);
        ON_START = xOTOHmUA5NYhlyOBh72;
        XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh73 = new XOTOHmUA5NYhlyOBh7("ON_RESUME", 2);
        ON_RESUME = xOTOHmUA5NYhlyOBh73;
        XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh74 = new XOTOHmUA5NYhlyOBh7("ON_PAUSE", 3);
        ON_PAUSE = xOTOHmUA5NYhlyOBh74;
        XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh75 = new XOTOHmUA5NYhlyOBh7("ON_STOP", 4);
        ON_STOP = xOTOHmUA5NYhlyOBh75;
        XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh76 = new XOTOHmUA5NYhlyOBh7("ON_DESTROY", 5);
        ON_DESTROY = xOTOHmUA5NYhlyOBh76;
        XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh77 = new XOTOHmUA5NYhlyOBh7("ON_ANY", 6);
        ON_ANY = xOTOHmUA5NYhlyOBh77;
        $VALUES = new XOTOHmUA5NYhlyOBh7[]{xOTOHmUA5NYhlyOBh7, xOTOHmUA5NYhlyOBh72, xOTOHmUA5NYhlyOBh73, xOTOHmUA5NYhlyOBh74, xOTOHmUA5NYhlyOBh75, xOTOHmUA5NYhlyOBh76, xOTOHmUA5NYhlyOBh77};
        Companion = new o1NoklOWF2A92NV1();
    }

    public static XOTOHmUA5NYhlyOBh7 valueOf(String str) {
        return (XOTOHmUA5NYhlyOBh7) Enum.valueOf(XOTOHmUA5NYhlyOBh7.class, str);
    }

    public static XOTOHmUA5NYhlyOBh7[] values() {
        return (XOTOHmUA5NYhlyOBh7[]) $VALUES.clone();
    }

    public final Cg8BA4YSFFWr8 VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        switch (pm1aChq4hyRp9yU.VxUQ9tBhpHJ2AAEDNW8sghc4m[ordinal()]) {
            case 1:
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return Cg8BA4YSFFWr8.LaeGQIruHQu81hfJldjMOQSVblH3x;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return Cg8BA4YSFFWr8.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                return Cg8BA4YSFFWr8.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                return Cg8BA4YSFFWr8.V57tEvNfxZVVcOCAOih5PKr;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
