package com.vdodsodjsdt;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class KugVp8vzDXzRFw implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ m8WKJH6JbFg V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ View zzpBGItXfub0yWj;

    public /* synthetic */ KugVp8vzDXzRFw(m8WKJH6JbFg m8wkjh6jbfg, View view, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.V57tEvNfxZVVcOCAOih5PKr = m8wkjh6jbfg;
        this.zzpBGItXfub0yWj = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.V57tEvNfxZVVcOCAOih5PKr;
                if (z && hideBottomViewOnScrollBehavior.M9e7PWhFYLD2lOGMker == 1) {
                    hideBottomViewOnScrollBehavior.ko09zE6UAgwkV(this.zzpBGItXfub0yWj);
                    break;
                }
                break;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.V57tEvNfxZVVcOCAOih5PKr;
                if (z && hideViewOnScrollBehavior.M9e7PWhFYLD2lOGMker == 1) {
                    hideViewOnScrollBehavior.jW7EiD0YL6xkbB158jMUzhWNWb1y(this.zzpBGItXfub0yWj);
                    break;
                }
                break;
        }
    }
}
