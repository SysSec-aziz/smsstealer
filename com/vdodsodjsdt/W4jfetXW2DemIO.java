package com.vdodsodjsdt;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class W4jfetXW2DemIO extends Animatable2.AnimationCallback {
    public final /* synthetic */ gRx9aVOIySZIg2M5dXBALHfl VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public W4jfetXW2DemIO(gRx9aVOIySZIg2M5dXBALHfl grx9avoiyszig2m5dxbalhfl) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = grx9avoiyszig2m5dxbalhfl;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj.pYmKDYlAmhudp;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        UdolbJMuTFGlV udolbJMuTFGlV = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj;
        ColorStateList colorStateList = udolbJMuTFGlV.pYmKDYlAmhudp;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(udolbJMuTFGlV.vBGA6pPLqSMuYGvprl270j7, colorStateList.getDefaultColor()));
        }
    }
}
