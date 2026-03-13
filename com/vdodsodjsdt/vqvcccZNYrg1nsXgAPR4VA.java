package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class vqvcccZNYrg1nsXgAPR4VA extends AnimatorListenerAdapter {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ dyLlvOXBIY6 zzpBGItXfub0yWj;

    public /* synthetic */ vqvcccZNYrg1nsXgAPR4VA(dyLlvOXBIY6 dyllvoxbiy6, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = dyllvoxbiy6;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 1:
                this.zzpBGItXfub0yWj.zzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                this.zzpBGItXfub0yWj.zzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
