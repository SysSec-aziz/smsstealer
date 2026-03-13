package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class eViaIsihfc0LZLsw7MU extends AnimatorListenerAdapter {
    public final /* synthetic */ OIQnrK0mzZ LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ View V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
    public final /* synthetic */ ViewPropertyAnimator ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ WFEUpQgjHl zzpBGItXfub0yWj;

    public eViaIsihfc0LZLsw7MU(OIQnrK0mzZ oIQnrK0mzZ, WFEUpQgjHl wFEUpQgjHl, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = oIQnrK0mzZ;
        this.zzpBGItXfub0yWj = wFEUpQgjHl;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = viewPropertyAnimator;
        this.V57tEvNfxZVVcOCAOih5PKr = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 1:
                this.V57tEvNfxZVVcOCAOih5PKr.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.setListener(null);
                this.V57tEvNfxZVVcOCAOih5PKr.setAlpha(1.0f);
                OIQnrK0mzZ oIQnrK0mzZ = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                WFEUpQgjHl wFEUpQgjHl = this.zzpBGItXfub0yWj;
                oIQnrK0mzZ.V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl);
                oIQnrK0mzZ.pYmKDYlAmhudp.remove(wFEUpQgjHl);
                oIQnrK0mzZ.GI83zq0G8e7zkn();
                break;
            default:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.setListener(null);
                OIQnrK0mzZ oIQnrK0mzZ2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                WFEUpQgjHl wFEUpQgjHl2 = this.zzpBGItXfub0yWj;
                oIQnrK0mzZ2.V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl2);
                oIQnrK0mzZ2.Ca81ebIan1u.remove(wFEUpQgjHl2);
                oIQnrK0mzZ2.GI83zq0G8e7zkn();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                this.LaeGQIruHQu81hfJldjMOQSVblH3x.getClass();
                break;
            default:
                this.LaeGQIruHQu81hfJldjMOQSVblH3x.getClass();
                break;
        }
    }

    public eViaIsihfc0LZLsw7MU(OIQnrK0mzZ oIQnrK0mzZ, WFEUpQgjHl wFEUpQgjHl, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = oIQnrK0mzZ;
        this.zzpBGItXfub0yWj = wFEUpQgjHl;
        this.V57tEvNfxZVVcOCAOih5PKr = view;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = viewPropertyAnimator;
    }
}
