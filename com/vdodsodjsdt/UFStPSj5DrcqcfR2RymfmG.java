package com.vdodsodjsdt;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class UFStPSj5DrcqcfR2RymfmG {
    public static void V57tEvNfxZVVcOCAOih5PKr(View view) {
        view.requestApplyInsets();
    }

    public static WindowInsets VxUQ9tBhpHJ2AAEDNW8sghc4m(View view, WindowInsets windowInsets) {
        int i = j9BydYCvOixDlRAp1F6Nd.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets zzpBGItXfub0yWj(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }
}
