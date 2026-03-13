package com.vdodsodjsdt;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class XKGmAVahBWpoo6PZSPEUzDf6iBnyu implements WBbGwHQ7q5Zp0OIijyR {
    public final WBbGwHQ7q5Zp0OIijyR VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final float zzpBGItXfub0yWj;

    public XKGmAVahBWpoo6PZSPEUzDf6iBnyu(float f, WBbGwHQ7q5Zp0OIijyR wBbGwHQ7q5Zp0OIijyR) {
        while (wBbGwHQ7q5Zp0OIijyR instanceof XKGmAVahBWpoo6PZSPEUzDf6iBnyu) {
            wBbGwHQ7q5Zp0OIijyR = ((XKGmAVahBWpoo6PZSPEUzDf6iBnyu) wBbGwHQ7q5Zp0OIijyR).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            f += ((XKGmAVahBWpoo6PZSPEUzDf6iBnyu) wBbGwHQ7q5Zp0OIijyR).zzpBGItXfub0yWj;
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = wBbGwHQ7q5Zp0OIijyR;
        this.zzpBGItXfub0yWj = f;
    }

    @Override // com.vdodsodjsdt.WBbGwHQ7q5Zp0OIijyR
    public final float VxUQ9tBhpHJ2AAEDNW8sghc4m(RectF rectF) {
        return Math.max(0.0f, this.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF) + this.zzpBGItXfub0yWj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XKGmAVahBWpoo6PZSPEUzDf6iBnyu)) {
            return false;
        }
        XKGmAVahBWpoo6PZSPEUzDf6iBnyu xKGmAVahBWpoo6PZSPEUzDf6iBnyu = (XKGmAVahBWpoo6PZSPEUzDf6iBnyu) obj;
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.equals(xKGmAVahBWpoo6PZSPEUzDf6iBnyu.VxUQ9tBhpHJ2AAEDNW8sghc4m) && this.zzpBGItXfub0yWj == xKGmAVahBWpoo6PZSPEUzDf6iBnyu.zzpBGItXfub0yWj;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.VxUQ9tBhpHJ2AAEDNW8sghc4m, Float.valueOf(this.zzpBGItXfub0yWj)});
    }
}
