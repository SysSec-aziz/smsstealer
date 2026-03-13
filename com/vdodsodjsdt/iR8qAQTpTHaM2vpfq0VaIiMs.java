package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class iR8qAQTpTHaM2vpfq0VaIiMs extends AnimatorListenerAdapter implements XYOHiAJNNnPEqr {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final ViewGroup V57tEvNfxZVVcOCAOih5PKr;
    public final View VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int zzpBGItXfub0yWj;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR = true;

    public iR8qAQTpTHaM2vpfq0VaIiMs(View view, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = view;
        this.zzpBGItXfub0yWj = i;
        this.V57tEvNfxZVVcOCAOih5PKr = (ViewGroup) view.getParent();
        ZLZeBXTMq0zDztBxtRTuCHrapQ(true);
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void V57tEvNfxZVVcOCAOih5PKr() {
        ZLZeBXTMq0zDztBxtRTuCHrapQ(true);
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            return;
        }
        SHiEHYU4a1Haij.zzpBGItXfub0yWj(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, 0);
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(boolean z) {
        ViewGroup viewGroup;
        if (!this.ZfQNn8hdWlEQ5cR94249PDsLR || this.LaeGQIruHQu81hfJldjMOQSVblH3x == z || (viewGroup = this.V57tEvNfxZVVcOCAOih5PKr) == null) {
            return;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = z;
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.TqcnImqkSWIKht(viewGroup, z);
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(DyKKpKofUua1vK dyKKpKofUua1vK) {
        dyKKpKofUua1vK.q11o1hieEkZDhF1MGOZI26oZiDT(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            SHiEHYU4a1Haij.zzpBGItXfub0yWj(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj);
            ViewGroup viewGroup = this.V57tEvNfxZVVcOCAOih5PKr;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void zzpBGItXfub0yWj() {
        ZLZeBXTMq0zDztBxtRTuCHrapQ(false);
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            return;
        }
        SHiEHYU4a1Haij.zzpBGItXfub0yWj(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            SHiEHYU4a1Haij.zzpBGItXfub0yWj(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, 0);
            ViewGroup viewGroup = this.V57tEvNfxZVVcOCAOih5PKr;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        if (!this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            SHiEHYU4a1Haij.zzpBGItXfub0yWj(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj);
            ViewGroup viewGroup = this.V57tEvNfxZVVcOCAOih5PKr;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ(false);
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(DyKKpKofUua1vK dyKKpKofUua1vK) {
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(DyKKpKofUua1vK dyKKpKofUua1vK) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
