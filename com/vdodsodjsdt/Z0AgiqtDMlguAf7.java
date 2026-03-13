package com.vdodsodjsdt;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Z0AgiqtDMlguAf7 implements Comparator {
    public final boolean V57tEvNfxZVVcOCAOih5PKr;
    public final FG8LIxsgYiLSfhN0jYKIKr ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Rect VxUQ9tBhpHJ2AAEDNW8sghc4m = new Rect();
    public final Rect zzpBGItXfub0yWj = new Rect();

    public Z0AgiqtDMlguAf7(boolean z, FG8LIxsgYiLSfhN0jYKIKr fG8LIxsgYiLSfhN0jYKIKr) {
        this.V57tEvNfxZVVcOCAOih5PKr = z;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = fG8LIxsgYiLSfhN0jYKIKr;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        Rect rect = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ((wzEak8ZKpNWHd4RKPYQ) obj).zIvmSL0wzmmKGc3X39b2Gw2mUGE(rect);
        Rect rect2 = this.zzpBGItXfub0yWj;
        ((wzEak8ZKpNWHd4RKPYQ) obj2).zIvmSL0wzmmKGc3X39b2Gw2mUGE(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
