package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class CSovRAL7IKDMzACrU8 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ CoordinatorLayout V57tEvNfxZVVcOCAOih5PKr;

    public CSovRAL7IKDMzACrU8(CoordinatorLayout coordinatorLayout) {
        this.V57tEvNfxZVVcOCAOih5PKr = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.V57tEvNfxZVVcOCAOih5PKr.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.V57tEvNfxZVVcOCAOih5PKr;
        coordinatorLayout.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
