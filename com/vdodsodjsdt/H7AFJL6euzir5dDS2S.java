package com.vdodsodjsdt;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class H7AFJL6euzir5dDS2S {
    public static void V57tEvNfxZVVcOCAOih5PKr(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void zzpBGItXfub0yWj(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
