package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class l6LCOAKgjXiBR extends AnimatorListenerAdapter implements XYOHiAJNNnPEqr {
    public final /* synthetic */ Zx36ytjSPbRH1S3UCiHxPrB8TD LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final View V57tEvNfxZVVcOCAOih5PKr;
    public final ViewGroup VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR = true;
    public final View zzpBGItXfub0yWj;

    public l6LCOAKgjXiBR(Zx36ytjSPbRH1S3UCiHxPrB8TD zx36ytjSPbRH1S3UCiHxPrB8TD, ViewGroup viewGroup, View view, View view2) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = zx36ytjSPbRH1S3UCiHxPrB8TD;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = viewGroup;
        this.zzpBGItXfub0yWj = view;
        this.V57tEvNfxZVVcOCAOih5PKr = view2;
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(DyKKpKofUua1vK dyKKpKofUua1vK) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            ZLZeBXTMq0zDztBxtRTuCHrapQ();
        }
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        this.V57tEvNfxZVVcOCAOih5PKr.setTag(R.id.save_overlay_view, null);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getOverlay().remove(this.zzpBGItXfub0yWj);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(DyKKpKofUua1vK dyKKpKofUua1vK) {
        dyKKpKofUua1vK.q11o1hieEkZDhF1MGOZI26oZiDT(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getOverlay().remove(this.zzpBGItXfub0yWj);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.zzpBGItXfub0yWj;
        if (view.getParent() == null) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getOverlay().add(view);
        } else {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.V57tEvNfxZVVcOCAOih5PKr;
            View view2 = this.zzpBGItXfub0yWj;
            view.setTag(R.id.save_overlay_view, view2);
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getOverlay().add(view2);
            this.ZfQNn8hdWlEQ5cR94249PDsLR = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ();
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void V57tEvNfxZVVcOCAOih5PKr() {
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void zzpBGItXfub0yWj() {
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(DyKKpKofUua1vK dyKKpKofUua1vK) {
    }
}
