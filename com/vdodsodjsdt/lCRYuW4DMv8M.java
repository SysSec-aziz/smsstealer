package com.vdodsodjsdt;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lCRYuW4DMv8M {
    public static void GI83zq0G8e7zkn(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static float HzCpKshMOoaw76hFcbOVRYMeRd(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float KUYypEB4eNWOZWVDpH(BackEvent backEvent) {
        return backEvent.getTouchY();
    }

    public static int LaeGQIruHQu81hfJldjMOQSVblH3x(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int M9e7PWhFYLD2lOGMker(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float NSjgqmGjEzuugn2SsG1mZFP(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static void V57tEvNfxZVVcOCAOih5PKr(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static AccessibilityNodeInfo.AccessibilityAction VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static CharSequence ZfQNn8hdWlEQ5cR94249PDsLR(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int zIvmSL0wzmmKGc3X39b2Gw2mUGE(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static float zzpBGItXfub0yWj(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }
}
