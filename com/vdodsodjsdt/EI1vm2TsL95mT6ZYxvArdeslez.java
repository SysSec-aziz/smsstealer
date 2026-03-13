package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class EI1vm2TsL95mT6ZYxvArdeslez implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final Runnable LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final View V57tEvNfxZVVcOCAOih5PKr;
    public ViewTreeObserver ZfQNn8hdWlEQ5cR94249PDsLR;

    public EI1vm2TsL95mT6ZYxvArdeslez(View view, Runnable runnable) {
        this.V57tEvNfxZVVcOCAOih5PKr = view;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = view.getViewTreeObserver();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = runnable;
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        EI1vm2TsL95mT6ZYxvArdeslez eI1vm2TsL95mT6ZYxvArdeslez = new EI1vm2TsL95mT6ZYxvArdeslez(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(eI1vm2TsL95mT6ZYxvArdeslez);
        view.addOnAttachStateChangeListener(eI1vm2TsL95mT6ZYxvArdeslez);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.ZfQNn8hdWlEQ5cR94249PDsLR.isAlive();
        View view = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zIsAlive) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.ZfQNn8hdWlEQ5cR94249PDsLR.isAlive();
        View view2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zIsAlive) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
