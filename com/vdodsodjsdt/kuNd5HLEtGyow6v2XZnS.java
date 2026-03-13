package com.vdodsodjsdt;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kuNd5HLEtGyow6v2XZnS {
    public static final int[] VxUQ9tBhpHJ2AAEDNW8sghc4m = {android.R.attr.state_enabled, android.R.attr.state_pressed};
    public static final String zzpBGItXfub0yWj = kuNd5HLEtGyow6v2XZnS.class.getSimpleName();

    public static ColorStateList VxUQ9tBhpHJ2AAEDNW8sghc4m(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(VxUQ9tBhpHJ2AAEDNW8sghc4m, 0)) != 0) {
            Log.w(zzpBGItXfub0yWj, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }
}
