package com.vdodsodjsdt;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Q55Zxcgh4evtHu7g7qq {
    public static void LaeGQIruHQu81hfJldjMOQSVblH3x(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static boolean V57tEvNfxZVVcOCAOih5PKr(View view) {
        return view.isScreenReaderFocusable();
    }

    public static CharSequence VxUQ9tBhpHJ2AAEDNW8sghc4m(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static void ZfQNn8hdWlEQ5cR94249PDsLR(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void zIvmSL0wzmmKGc3X39b2Gw2mUGE(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    public static boolean zzpBGItXfub0yWj(View view) {
        return view.isAccessibilityHeading();
    }
}
