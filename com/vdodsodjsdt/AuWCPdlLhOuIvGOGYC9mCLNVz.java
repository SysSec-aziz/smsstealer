package com.vdodsodjsdt;

import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AuWCPdlLhOuIvGOGYC9mCLNVz {
    public static void LaeGQIruHQu81hfJldjMOQSVblH3x(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void V57tEvNfxZVVcOCAOih5PKr(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static CharSequence VxUQ9tBhpHJ2AAEDNW8sghc4m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void ZfQNn8hdWlEQ5cR94249PDsLR(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void zzpBGItXfub0yWj(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }
}
