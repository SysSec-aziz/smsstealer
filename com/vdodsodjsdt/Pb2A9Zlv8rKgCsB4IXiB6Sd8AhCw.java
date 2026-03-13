package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw {
    public static final ThreadLocal VxUQ9tBhpHJ2AAEDNW8sghc4m = new ThreadLocal();
    public static final int[] zzpBGItXfub0yWj = {-16842910};
    public static final int[] V57tEvNfxZVVcOCAOih5PKr = {android.R.attr.state_focused};
    public static final int[] ZfQNn8hdWlEQ5cR94249PDsLR = {android.R.attr.state_pressed};
    public static final int[] LaeGQIruHQu81hfJldjMOQSVblH3x = {android.R.attr.state_checked};
    public static final int[] zIvmSL0wzmmKGc3X39b2Gw2mUGE = new int[0];
    public static final int[] ZLZeBXTMq0zDztBxtRTuCHrapQ = new int[1];

    public static int V57tEvNfxZVVcOCAOih5PKr(Context context, int i) {
        int[] iArr = ZLZeBXTMq0zDztBxtRTuCHrapQ;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AuEvIFo0QoYm1PHNG.M9e7PWhFYLD2lOGMker);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList ZfQNn8hdWlEQ5cR94249PDsLR(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = ZLZeBXTMq0zDztBxtRTuCHrapQ;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int zzpBGItXfub0yWj(Context context, int i) {
        ColorStateList colorStateListZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(context, i);
        if (colorStateListZfQNn8hdWlEQ5cR94249PDsLR != null && colorStateListZfQNn8hdWlEQ5cR94249PDsLR.isStateful()) {
            return colorStateListZfQNn8hdWlEQ5cR94249PDsLR.getColorForState(zzpBGItXfub0yWj, colorStateListZfQNn8hdWlEQ5cR94249PDsLR.getDefaultColor());
        }
        ThreadLocal threadLocal = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return PyYsF2FE67iANgZ0fDkVtNG5uhA.ZfQNn8hdWlEQ5cR94249PDsLR(V57tEvNfxZVVcOCAOih5PKr(context, i), Math.round(Color.alpha(r4) * f));
    }
}
