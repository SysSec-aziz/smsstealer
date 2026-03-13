package com.vdodsodjsdt;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class VGwRvGhOWf9duTP8Dxb9PtsLAe1z {
    public static final int[] VxUQ9tBhpHJ2AAEDNW8sghc4m = {android.R.attr.state_checked};
    public static final int[] zzpBGItXfub0yWj = new int[0];

    static {
        new Rect();
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(VxUQ9tBhpHJ2AAEDNW8sghc4m);
        } else {
            drawable.setState(zzpBGItXfub0yWj);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode zzpBGItXfub0yWj(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
