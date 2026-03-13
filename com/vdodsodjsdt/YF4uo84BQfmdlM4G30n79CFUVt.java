package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class YF4uo84BQfmdlM4G30n79CFUVt extends AnimatorListenerAdapter {
    public final /* synthetic */ OIQnrK0mzZ LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ ViewPropertyAnimator V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ View ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ Vczceu2rJSZiaaey04LCv zzpBGItXfub0yWj;

    public /* synthetic */ YF4uo84BQfmdlM4G30n79CFUVt(OIQnrK0mzZ oIQnrK0mzZ, Vczceu2rJSZiaaey04LCv vczceu2rJSZiaaey04LCv, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = oIQnrK0mzZ;
        this.zzpBGItXfub0yWj = vczceu2rJSZiaaey04LCv;
        this.V57tEvNfxZVVcOCAOih5PKr = viewPropertyAnimator;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                this.V57tEvNfxZVVcOCAOih5PKr.setListener(null);
                View view = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                Vczceu2rJSZiaaey04LCv vczceu2rJSZiaaey04LCv = this.zzpBGItXfub0yWj;
                WFEUpQgjHl wFEUpQgjHl = vczceu2rJSZiaaey04LCv.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                OIQnrK0mzZ oIQnrK0mzZ = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                oIQnrK0mzZ.V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl);
                oIQnrK0mzZ.ko09zE6UAgwkV.remove(vczceu2rJSZiaaey04LCv.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                oIQnrK0mzZ.GI83zq0G8e7zkn();
                break;
            default:
                this.V57tEvNfxZVVcOCAOih5PKr.setListener(null);
                View view2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                Vczceu2rJSZiaaey04LCv vczceu2rJSZiaaey04LCv2 = this.zzpBGItXfub0yWj;
                WFEUpQgjHl wFEUpQgjHl2 = vczceu2rJSZiaaey04LCv2.zzpBGItXfub0yWj;
                OIQnrK0mzZ oIQnrK0mzZ2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                oIQnrK0mzZ2.V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl2);
                oIQnrK0mzZ2.ko09zE6UAgwkV.remove(vczceu2rJSZiaaey04LCv2.zzpBGItXfub0yWj);
                oIQnrK0mzZ2.GI83zq0G8e7zkn();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                WFEUpQgjHl wFEUpQgjHl = this.zzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x.getClass();
                break;
            default:
                WFEUpQgjHl wFEUpQgjHl2 = this.zzpBGItXfub0yWj.zzpBGItXfub0yWj;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x.getClass();
                break;
        }
    }
}
