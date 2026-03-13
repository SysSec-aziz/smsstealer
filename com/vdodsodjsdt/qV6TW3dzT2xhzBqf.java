package com.vdodsodjsdt;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class qV6TW3dzT2xhzBqf implements WBbGwHQ7q5Zp0OIijyR {
    public final float VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public qV6TW3dzT2xhzBqf(float f) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = f;
    }

    @Override // com.vdodsodjsdt.WBbGwHQ7q5Zp0OIijyR
    public final float VxUQ9tBhpHJ2AAEDNW8sghc4m(RectF rectF) {
        float fMin = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (f < 0.0f) {
            return 0.0f;
        }
        return f > fMin ? fMin : f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qV6TW3dzT2xhzBqf) && this.VxUQ9tBhpHJ2AAEDNW8sghc4m == ((qV6TW3dzT2xhzBqf) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.VxUQ9tBhpHJ2AAEDNW8sghc4m)});
    }
}
