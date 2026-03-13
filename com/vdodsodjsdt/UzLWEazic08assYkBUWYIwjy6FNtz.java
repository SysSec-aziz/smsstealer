package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class UzLWEazic08assYkBUWYIwjy6FNtz extends AnimatorListenerAdapter implements XYOHiAJNNnPEqr {
    public final View VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean zzpBGItXfub0yWj = false;

    public UzLWEazic08assYkBUWYIwjy6FNtz(View view) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = view;
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void V57tEvNfxZVVcOCAOih5PKr() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        SHiEHYU4a1Haij.VxUQ9tBhpHJ2AAEDNW8sghc4m.SuB3hEmTmbbRGAhtvOOmfKEon(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.zzpBGItXfub0yWj = true;
            view.setLayerType(2, null);
        }
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void zzpBGItXfub0yWj() {
        View view = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? SHiEHYU4a1Haij.VxUQ9tBhpHJ2AAEDNW8sghc4m.Ca81ebIan1u(view) : 0.0f));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.zzpBGItXfub0yWj;
        View view = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        zRWCc8pV2W3JYgpEdFthQqzn6Ek zrwcc8pv2w3jygpedfthqqzn6ek = SHiEHYU4a1Haij.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        zrwcc8pv2w3jygpedfthqqzn6ek.SuB3hEmTmbbRGAhtvOOmfKEon(view, 1.0f);
        zrwcc8pv2w3jygpedfthqqzn6ek.getClass();
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(DyKKpKofUua1vK dyKKpKofUua1vK) {
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(DyKKpKofUua1vK dyKKpKofUua1vK) {
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(DyKKpKofUua1vK dyKKpKofUua1vK) {
    }

    @Override // com.vdodsodjsdt.XYOHiAJNNnPEqr
    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(DyKKpKofUua1vK dyKKpKofUua1vK) {
    }
}
