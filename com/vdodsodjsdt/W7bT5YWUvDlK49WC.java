package com.vdodsodjsdt;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class W7bT5YWUvDlK49WC implements View.OnTouchListener {
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Dialog V57tEvNfxZVVcOCAOih5PKr;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public W7bT5YWUvDlK49WC(Dialog dialog, Rect rect) {
        this.V57tEvNfxZVVcOCAOih5PKr = dialog;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = rect.left;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = rect.top;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(android.R.id.content);
        int left = viewFindViewById.getLeft() + this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.LaeGQIruHQu81hfJldjMOQSVblH3x, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.V57tEvNfxZVVcOCAOih5PKr.onTouchEvent(motionEventObtain);
    }
}
