package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class YKlOoXxkpyoAf0 {
    public final Object[] V57tEvNfxZVVcOCAOih5PKr;
    public final hKY45oVk0UzhW2UdRV VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final String zzpBGItXfub0yWj;

    public YKlOoXxkpyoAf0(EDuXvmY6CU2gSBB eDuXvmY6CU2gSBB, String str, Object[] objArr) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = eDuXvmY6CU2gSBB;
        this.zzpBGItXfub0yWj = str;
        this.V57tEvNfxZVVcOCAOih5PKr = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
