package com.vdodsodjsdt;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zkhxzzwmal5x8WuJs0rdzIuG implements WBbGwHQ7q5Zp0OIijyR {
    public final float VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public zkhxzzwmal5x8WuJs0rdzIuG(float f) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = f;
    }

    @Override // com.vdodsodjsdt.WBbGwHQ7q5Zp0OIijyR
    public final float VxUQ9tBhpHJ2AAEDNW8sghc4m(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zkhxzzwmal5x8WuJs0rdzIuG) && this.VxUQ9tBhpHJ2AAEDNW8sghc4m == ((zkhxzzwmal5x8WuJs0rdzIuG) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.VxUQ9tBhpHJ2AAEDNW8sghc4m)});
    }

    public final String toString() {
        return ((int) (this.VxUQ9tBhpHJ2AAEDNW8sghc4m * 100.0f)) + "%";
    }
}
