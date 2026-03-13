package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class eogwdH6zMZ extends AnimatorListenerAdapter {
    public final /* synthetic */ Object V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
    public final /* synthetic */ Object zzpBGItXfub0yWj;

    public eogwdH6zMZ(oh4pE3JpiN2OEnGMPzOmHa7Yqe oh4pe3jpin2oengmpzomha7yqe, View view) {
        this.zzpBGItXfub0yWj = oh4pe3jpin2oengmpzomha7yqe;
        this.V57tEvNfxZVVcOCAOih5PKr = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                ((qKXCIJM1cKNm0a1RAvamOBOVLgp) this.zzpBGItXfub0yWj).remove(animator);
                ((DyKKpKofUua1vK) this.V57tEvNfxZVVcOCAOih5PKr).h3jnZRsdwYJfY9UhQCkbvWciwvFHv.remove(animator);
                break;
            default:
                ((oh4pE3JpiN2OEnGMPzOmHa7Yqe) this.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(1.0f);
                M9TaMBovb7u6bH.LaeGQIruHQu81hfJldjMOQSVblH3x((View) this.V57tEvNfxZVVcOCAOih5PKr);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                ((DyKKpKofUua1vK) this.V57tEvNfxZVVcOCAOih5PKr).h3jnZRsdwYJfY9UhQCkbvWciwvFHv.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public eogwdH6zMZ(DyKKpKofUua1vK dyKKpKofUua1vK, qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp) {
        this.V57tEvNfxZVVcOCAOih5PKr = dyKKpKofUua1vK;
        this.zzpBGItXfub0yWj = qkxcijm1cknm0a1ravamobovlgp;
    }
}
