package com.vdodsodjsdt;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class l4Nor8ciznp7X7NENgLU8bBvEm extends AccessibilityNodeProvider {
    public final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public l4Nor8ciznp7X7NENgLU8bBvEm(Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyqF6ZQsR6bPLvvCDNXOUc = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.f6ZQsR6bPLvvCDNXOUc(i);
        if (wzeak8zkpnwhd4rkpyqF6ZQsR6bPLvvCDNXOUc == null) {
            return null;
        }
        return wzeak8zkpnwhd4rkpyqF6ZQsR6bPLvvCDNXOUc.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyqVBGA6pPLqSMuYGvprl270j7 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.vBGA6pPLqSMuYGvprl270j7(i);
        if (wzeak8zkpnwhd4rkpyqVBGA6pPLqSMuYGvprl270j7 == null) {
            return null;
        }
        return wzeak8zkpnwhd4rkpyqVBGA6pPLqSMuYGvprl270j7.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.q11o1hieEkZDhF1MGOZI26oZiDT(i, i2, bundle);
    }
}
