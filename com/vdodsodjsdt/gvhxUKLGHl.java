package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class gvhxUKLGHl extends AnimatorListenerAdapter {
    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m = false;
    public final /* synthetic */ O23cBAsx5mVwcI zzpBGItXfub0yWj;

    public gvhxUKLGHl(O23cBAsx5mVwcI o23cBAsx5mVwcI) {
        this.zzpBGItXfub0yWj = o23cBAsx5mVwcI;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = false;
            return;
        }
        O23cBAsx5mVwcI o23cBAsx5mVwcI = this.zzpBGItXfub0yWj;
        if (((Float) o23cBAsx5mVwcI.RhfGHxtXxy0M0grmp2jkRjQg.getAnimatedValue()).floatValue() == 0.0f) {
            o23cBAsx5mVwcI.qNPQb1obP7 = 0;
            o23cBAsx5mVwcI.zIvmSL0wzmmKGc3X39b2Gw2mUGE(0);
        } else {
            o23cBAsx5mVwcI.qNPQb1obP7 = 2;
            o23cBAsx5mVwcI.jW7EiD0YL6xkbB158jMUzhWNWb1y.invalidate();
        }
    }
}
