package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xLT3F6QzeEg0g6xgRz3VW5gD extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewPropertyAnimator LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ View V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ WFEUpQgjHl VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ OIQnrK0mzZ zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final /* synthetic */ int zzpBGItXfub0yWj;

    public xLT3F6QzeEg0g6xgRz3VW5gD(OIQnrK0mzZ oIQnrK0mzZ, WFEUpQgjHl wFEUpQgjHl, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = oIQnrK0mzZ;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = wFEUpQgjHl;
        this.zzpBGItXfub0yWj = i;
        this.V57tEvNfxZVVcOCAOih5PKr = view;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.zzpBGItXfub0yWj;
        View view = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.setListener(null);
        OIQnrK0mzZ oIQnrK0mzZ = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        WFEUpQgjHl wFEUpQgjHl = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        oIQnrK0mzZ.V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl);
        oIQnrK0mzZ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.remove(wFEUpQgjHl);
        oIQnrK0mzZ.GI83zq0G8e7zkn();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getClass();
    }
}
