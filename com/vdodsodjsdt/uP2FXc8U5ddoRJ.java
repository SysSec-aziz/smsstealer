package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class uP2FXc8U5ddoRJ extends lzuj2xiOHpZAdsoZ1vJvxA {
    public static int ZLZeBXTMq0zDztBxtRTuCHrapQ(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i = 0; i < iArr.length && dimensionPixelSize < 0; i++) {
            int i2 = iArr[i];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i2, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // com.vdodsodjsdt.lzuj2xiOHpZAdsoZ1vJvxA, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (ej6unYlOWMDF.ItrQwCXbty5PZtje5JS(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, PGobtLpyfPC4TCnlq740.f6ZQsR6bPLvvCDNXOUc);
            int iZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ(getContext(), typedArrayObtainStyledAttributes, 2, 4);
            typedArrayObtainStyledAttributes.recycle();
            if (iZLZeBXTMq0zDztBxtRTuCHrapQ >= 0) {
                setLineHeight(iZLZeBXTMq0zDztBxtRTuCHrapQ);
            }
        }
    }
}
