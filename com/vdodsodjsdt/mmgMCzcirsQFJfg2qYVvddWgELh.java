package com.vdodsodjsdt;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mmgMCzcirsQFJfg2qYVvddWgELh {
    public static boolean V57tEvNfxZVVcOCAOih5PKr() {
        return Trace.isEnabled();
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public static void zzpBGItXfub0yWj(String str, int i) {
        Trace.endAsyncSection(str, i);
    }
}
