package com.vdodsodjsdt;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class QiHQb47dV2g7 {
    public static void V57tEvNfxZVVcOCAOih5PKr(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedDispatcher VxUQ9tBhpHJ2AAEDNW8sghc4m(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static void ZfQNn8hdWlEQ5cR94249PDsLR(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static OnBackInvokedCallback zzpBGItXfub0yWj(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new EdfWbt9ctq5AGWMF3kpLJDSdqhku(2, runnable);
    }
}
