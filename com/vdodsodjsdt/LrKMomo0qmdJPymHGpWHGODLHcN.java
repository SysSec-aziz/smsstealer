package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class LrKMomo0qmdJPymHGpWHGODLHcN extends SeekBar {
    public final ngrtnJOmDSgUDx8bt V57tEvNfxZVVcOCAOih5PKr;

    public LrKMomo0qmdJPymHGpWHGODLHcN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, getContext());
        ngrtnJOmDSgUDx8bt ngrtnjomdsgudx8bt = new ngrtnJOmDSgUDx8bt(this);
        this.V57tEvNfxZVVcOCAOih5PKr = ngrtnjomdsgudx8bt;
        ngrtnjomdsgudx8bt.LaeGQIruHQu81hfJldjMOQSVblH3x(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ngrtnJOmDSgUDx8bt ngrtnjomdsgudx8bt = this.V57tEvNfxZVVcOCAOih5PKr;
        LrKMomo0qmdJPymHGpWHGODLHcN lrKMomo0qmdJPymHGpWHGODLHcN = ngrtnjomdsgudx8bt.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Drawable drawable = ngrtnjomdsgudx8bt.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (drawable != null && drawable.isStateful() && drawable.setState(lrKMomo0qmdJPymHGpWHGODLHcN.getDrawableState())) {
            lrKMomo0qmdJPymHGpWHGODLHcN.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.V57tEvNfxZVVcOCAOih5PKr.Ca81ebIan1u(canvas);
    }
}
