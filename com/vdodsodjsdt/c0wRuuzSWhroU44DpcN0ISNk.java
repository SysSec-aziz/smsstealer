package com.vdodsodjsdt;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0wRuuzSWhroU44DpcN0ISNk {
    public static final ThreadLocal VxUQ9tBhpHJ2AAEDNW8sghc4m = new ThreadLocal();
    public static final ThreadLocal zzpBGItXfub0yWj = new ThreadLocal();

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
