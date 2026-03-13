package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.TQMQBENV49PLMwKLaeaEMWAtYlx;
import com.vdodsodjsdt.kgsQdhwZIxWHf0DwYluy7Jojhg9m;
import com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends kgsQdhwZIxWHf0DwYluy7Jojhg9m {
    public final int zzpBGItXfub0yWj;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void jW7EiD0YL6xkbB158jMUzhWNWb1y(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
        }
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void KUYypEB4eNWOZWVDpH(CoordinatorLayout coordinatorLayout, View view) {
        jW7EiD0YL6xkbB158jMUzhWNWb1y(coordinatorLayout.M9e7PWhFYLD2lOGMker(view));
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean NSjgqmGjEzuugn2SsG1mZFP(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 != -1 && i4 != -2) {
            return false;
        }
        jW7EiD0YL6xkbB158jMUzhWNWb1y(coordinatorLayout.M9e7PWhFYLD2lOGMker(view));
        return false;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (((TQMQBENV49PLMwKLaeaEMWAtYlx) view2.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            int i = this.zzpBGItXfub0yWj;
            int iKUYypEB4eNWOZWVDpH = bottom - (i == 0 ? 0 : sGipz63rTUmSj3uFDvOtzihao.KUYypEB4eNWOZWVDpH((int) (0.0f * i), 0, i));
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            view.offsetTopAndBottom(iKUYypEB4eNWOZWVDpH);
        }
        return false;
    }

    @Override // com.vdodsodjsdt.kgsQdhwZIxWHf0DwYluy7Jojhg9m
    public final void ko09zE6UAgwkV(CoordinatorLayout coordinatorLayout, View view, int i) {
        jW7EiD0YL6xkbB158jMUzhWNWb1y(coordinatorLayout.M9e7PWhFYLD2lOGMker(view));
        coordinatorLayout.pYmKDYlAmhudp(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PGobtLpyfPC4TCnlq740.q11o1hieEkZDhF1MGOZI26oZiDT);
        this.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void zzpBGItXfub0yWj(View view) {
    }
}
