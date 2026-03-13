package com.vdodsodjsdt;

import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TsD9eeztji4NblKmSt11 {
    public static boolean LaeGQIruHQu81hfJldjMOQSVblH3x(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static int V57tEvNfxZVVcOCAOih5PKr(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static int VxUQ9tBhpHJ2AAEDNW8sghc4m(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    public static CharSequence ZfQNn8hdWlEQ5cR94249PDsLR(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static long zzpBGItXfub0yWj(BackEvent backEvent) {
        return backEvent.getFrameTimeMillis();
    }
}
