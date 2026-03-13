package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class coyP1hCgJ7zr56eqQoO7H04E implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView V57tEvNfxZVVcOCAOih5PKr;

    public coyP1hCgJ7zr56eqQoO7H04E(ClockFaceView clockFaceView) {
        this.V57tEvNfxZVVcOCAOih5PKr = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.V57tEvNfxZVVcOCAOih5PKr;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.TaDO7ogis3aEiWEtq.zIvmSL0wzmmKGc3X39b2Gw2mUGE) - clockFaceView.aXO0LSrt8bKV;
        if (height != clockFaceView.f6ZQsR6bPLvvCDNXOUc) {
            clockFaceView.f6ZQsR6bPLvvCDNXOUc = height;
            clockFaceView.q1wNbhk2O6();
            ClockHandView clockHandView = clockFaceView.TaDO7ogis3aEiWEtq;
            clockHandView.p59rPv72J9 = clockFaceView.f6ZQsR6bPLvvCDNXOUc;
            clockHandView.invalidate();
        }
        return true;
    }
}
