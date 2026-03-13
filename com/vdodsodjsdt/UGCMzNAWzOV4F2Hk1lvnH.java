package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class UGCMzNAWzOV4F2Hk1lvnH {
    public static final oA1WO3soICf8H1N6bgpG VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = oA1WO3soICf8H1N6bgpG.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        VxUQ9tBhpHJ2AAEDNW8sghc4m = IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd("xn--");
    }

    public static int VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, int i2, boolean z) {
        int i3 = z ? i / 700 : i / 2;
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int zzpBGItXfub0yWj(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i).toString());
    }
}
