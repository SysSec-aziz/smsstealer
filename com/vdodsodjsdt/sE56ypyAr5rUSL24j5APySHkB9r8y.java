package com.vdodsodjsdt;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class sE56ypyAr5rUSL24j5APySHkB9r8y {
    public static final sE56ypyAr5rUSL24j5APySHkB9r8y zIvmSL0wzmmKGc3X39b2Gw2mUGE = new sE56ypyAr5rUSL24j5APySHkB9r8y(0, new int[0], new Object[0], false);
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Object[] V57tEvNfxZVVcOCAOih5PKr;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int ZfQNn8hdWlEQ5cR94249PDsLR = -1;
    public int[] zzpBGItXfub0yWj;

    public sE56ypyAr5rUSL24j5APySHkB9r8y(int i, int[] iArr, Object[] objArr, boolean z) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = iArr;
        this.V57tEvNfxZVVcOCAOih5PKr = objArr;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = z;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(int i, Object obj) {
        if (!this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new UnsupportedOperationException();
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m(this.VxUQ9tBhpHJ2AAEDNW8sghc4m + 1);
        int[] iArr = this.zzpBGItXfub0yWj;
        int i2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        iArr[i2] = i;
        this.V57tEvNfxZVVcOCAOih5PKr[i2] = obj;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i2 + 1;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        int[] iArr = this.zzpBGItXfub0yWj;
        if (i > iArr.length) {
            int i2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzpBGItXfub0yWj = Arrays.copyOf(iArr, i);
            this.V57tEvNfxZVVcOCAOih5PKr = Arrays.copyOf(this.V57tEvNfxZVVcOCAOih5PKr, i);
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ) {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 0) {
            return;
        }
        skgk8FYn8b4TvRiBOsElZw4XkNLhQ.getClass();
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        for (int i = 0; i < this.VxUQ9tBhpHJ2AAEDNW8sghc4m; i++) {
            int i2 = this.zzpBGItXfub0yWj[i];
            Object obj = this.V57tEvNfxZVVcOCAOih5PKr[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                fmipvc9gfhawh7dxz8.dWgUTvLDR2aOE7pFLrMrHP(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                fmipvc9gfhawh7dxz8.N08cqkgagFuPYWJcTFAQVt(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                fmipvc9gfhawh7dxz8.PfK8qHOJoCLG(i3, (uDRHTE5hsm7JpGOnK7F) obj);
            } else if (i4 == 3) {
                fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i3, 3);
                ((sE56ypyAr5rUSL24j5APySHkB9r8y) obj).ZfQNn8hdWlEQ5cR94249PDsLR(skgk8FYn8b4TvRiBOsElZw4XkNLhQ);
                fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(tabhAwpQKyJhu24Q.zzpBGItXfub0yWj());
                }
                fmipvc9gfhawh7dxz8.Hf6zp5JYLjGyFD2HXbpHA9(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof sE56ypyAr5rUSL24j5APySHkB9r8y)) {
            return false;
        }
        sE56ypyAr5rUSL24j5APySHkB9r8y se56ypyar5rusl24j5apyshkb9r8y = (sE56ypyAr5rUSL24j5APySHkB9r8y) obj;
        int i = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i == se56ypyar5rusl24j5apyshkb9r8y.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            int[] iArr = this.zzpBGItXfub0yWj;
            int[] iArr2 = se56ypyar5rusl24j5apyshkb9r8y.zzpBGItXfub0yWj;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
                    Object[] objArr2 = se56ypyar5rusl24j5apyshkb9r8y.V57tEvNfxZVVcOCAOih5PKr;
                    int i3 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = (527 + i) * 31;
        int[] iArr = this.zzpBGItXfub0yWj;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.V57tEvNfxZVVcOCAOih5PKr;
        int i6 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zzpBGItXfub0yWj() {
        int iH2b7InwIaORKN91X7whfQh4;
        int iG479XgNG9rK8jPPbSXr;
        int iH2b7InwIaORKN91X7whfQh42;
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.VxUQ9tBhpHJ2AAEDNW8sghc4m; i3++) {
            int i4 = this.zzpBGItXfub0yWj[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.V57tEvNfxZVVcOCAOih5PKr[i3]).getClass();
                    iH2b7InwIaORKN91X7whfQh42 = fMipVc9GFHAwh7dXz8.h2b7InwIaORKN91X7whfQh4(i5) + 8;
                } else if (i6 == 2) {
                    iH2b7InwIaORKN91X7whfQh42 = fMipVc9GFHAwh7dXz8.lxWWbfAOLs4jWzd7PSIiIJ(i5, (uDRHTE5hsm7JpGOnK7F) this.V57tEvNfxZVVcOCAOih5PKr[i3]);
                } else if (i6 == 3) {
                    iH2b7InwIaORKN91X7whfQh4 = fMipVc9GFHAwh7dXz8.h2b7InwIaORKN91X7whfQh4(i5) * 2;
                    iG479XgNG9rK8jPPbSXr = ((sE56ypyAr5rUSL24j5APySHkB9r8y) this.V57tEvNfxZVVcOCAOih5PKr[i3]).zzpBGItXfub0yWj();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(tabhAwpQKyJhu24Q.zzpBGItXfub0yWj());
                    }
                    ((Integer) this.V57tEvNfxZVVcOCAOih5PKr[i3]).getClass();
                    iH2b7InwIaORKN91X7whfQh42 = fMipVc9GFHAwh7dXz8.h2b7InwIaORKN91X7whfQh4(i5) + 4;
                }
                i2 = iH2b7InwIaORKN91X7whfQh42 + i2;
            } else {
                long jLongValue = ((Long) this.V57tEvNfxZVVcOCAOih5PKr[i3]).longValue();
                iH2b7InwIaORKN91X7whfQh4 = fMipVc9GFHAwh7dXz8.h2b7InwIaORKN91X7whfQh4(i5);
                iG479XgNG9rK8jPPbSXr = fMipVc9GFHAwh7dXz8.G479XgNG9rK8jPPbSXr(jLongValue);
            }
            i2 = iG479XgNG9rK8jPPbSXr + iH2b7InwIaORKN91X7whfQh4 + i2;
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
        return i2;
    }
}
