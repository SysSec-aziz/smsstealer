package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ngrtnJOmDSgUDx8bt extends dXZw8zZnRXsRIYJEIdZC {
    public PorterDuff.Mode GI83zq0G8e7zkn;
    public boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean M9e7PWhFYLD2lOGMker;
    public ColorStateList NSjgqmGjEzuugn2SsG1mZFP;
    public Drawable ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final LrKMomo0qmdJPymHGpWHGODLHcN zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public ngrtnJOmDSgUDx8bt(LrKMomo0qmdJPymHGpWHGODLHcN lrKMomo0qmdJPymHGpWHGODLHcN) {
        super(lrKMomo0qmdJPymHGpWHGODLHcN);
        this.NSjgqmGjEzuugn2SsG1mZFP = null;
        this.GI83zq0G8e7zkn = null;
        this.M9e7PWhFYLD2lOGMker = false;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = false;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = lrKMomo0qmdJPymHGpWHGODLHcN;
    }

    public final void Ca81ebIan1u(Canvas canvas) {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
            int max = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getMax();
            if (max > 1) {
                int intrinsicWidth = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getIntrinsicWidth();
                int intrinsicHeight = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // com.vdodsodjsdt.dXZw8zZnRXsRIYJEIdZC
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(AttributeSet attributeSet, int i) {
        super.LaeGQIruHQu81hfJldjMOQSVblH3x(attributeSet, R.attr.seekBarStyle);
        LrKMomo0qmdJPymHGpWHGODLHcN lrKMomo0qmdJPymHGpWHGODLHcN = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Context context = lrKMomo0qmdJPymHGpWHGODLHcN.getContext();
        int[] iArr = AuEvIFo0QoYm1PHNG.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7 = NrjuzzioPqfttNRptBDpZDzSYUrcM.qNPQb1obP7(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr;
        xb0r6yEzq0tw9m7nTWG5BFR8.KUYypEB4eNWOZWVDpH(lrKMomo0qmdJPymHGpWHGODLHcN, lrKMomo0qmdJPymHGpWHGODLHcN.getContext(), iArr, attributeSet, (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr, R.attr.seekBarStyle);
        Drawable drawableKo09zE6UAgwkV = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.ko09zE6UAgwkV(0);
        if (drawableKo09zE6UAgwkV != null) {
            lrKMomo0qmdJPymHGpWHGODLHcN.setThumb(drawableKo09zE6UAgwkV);
        }
        Drawable drawablePYmKDYlAmhudp = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(1);
        Drawable drawable = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = drawablePYmKDYlAmhudp;
        if (drawablePYmKDYlAmhudp != null) {
            drawablePYmKDYlAmhudp.setCallback(lrKMomo0qmdJPymHGpWHGODLHcN);
            drawablePYmKDYlAmhudp.setLayoutDirection(lrKMomo0qmdJPymHGpWHGODLHcN.getLayoutDirection());
            if (drawablePYmKDYlAmhudp.isStateful()) {
                drawablePYmKDYlAmhudp.setState(lrKMomo0qmdJPymHGpWHGODLHcN.getDrawableState());
            }
            p59rPv72J9();
        }
        lrKMomo0qmdJPymHGpWHGODLHcN.invalidate();
        if (typedArray.hasValue(3)) {
            this.GI83zq0G8e7zkn = VGwRvGhOWf9duTP8Dxb9PtsLAe1z.zzpBGItXfub0yWj(typedArray.getInt(3, -1), this.GI83zq0G8e7zkn);
            this.HzCpKshMOoaw76hFcbOVRYMeRd = true;
        }
        if (typedArray.hasValue(2)) {
            this.NSjgqmGjEzuugn2SsG1mZFP = nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(2);
            this.M9e7PWhFYLD2lOGMker = true;
        }
        nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
        p59rPv72J9();
    }

    public final void p59rPv72J9() {
        Drawable drawable = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (drawable != null) {
            if (this.M9e7PWhFYLD2lOGMker || this.HzCpKshMOoaw76hFcbOVRYMeRd) {
                Drawable drawableMutate = drawable.mutate();
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = drawableMutate;
                if (this.M9e7PWhFYLD2lOGMker) {
                    drawableMutate.setTintList(this.NSjgqmGjEzuugn2SsG1mZFP);
                }
                if (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setTintMode(this.GI83zq0G8e7zkn);
                }
                if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ.isStateful()) {
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ.setState(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getDrawableState());
                }
            }
        }
    }
}
