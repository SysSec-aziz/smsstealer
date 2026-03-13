package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class OjNhSQff2yOfzldut {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zzpBGItXfub0yWj;

    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        int i = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i4 = this.zzpBGItXfub0yWj;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i6 = this.V57tEvNfxZVVcOCAOih5PKr;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i8 = this.zzpBGItXfub0yWj;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i10 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
