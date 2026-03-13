package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nNKLdBypjKp7Gh5eWaHxV53s4 extends AnimatorListenerAdapter {
    public final /* synthetic */ dlHQnQrSu4 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ boolean V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ ViewGroup VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ RD86Fssz0iKbf0t61L ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ View zzpBGItXfub0yWj;

    public nNKLdBypjKp7Gh5eWaHxV53s4(ViewGroup viewGroup, View view, boolean z, RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L, dlHQnQrSu4 dlhqnqrsu4) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = viewGroup;
        this.zzpBGItXfub0yWj = view;
        this.V57tEvNfxZVVcOCAOih5PKr = z;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = rD86Fssz0iKbf0t61L;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = dlhqnqrsu4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        View view = this.zzpBGItXfub0yWj;
        viewGroup.endViewTransition(view);
        boolean z = this.V57tEvNfxZVVcOCAOih5PKr;
        RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (z) {
            u9SlVAuoWhQUfJ.VxUQ9tBhpHJ2AAEDNW8sghc4m(view, rD86Fssz0iKbf0t61L.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR();
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "Animator from operation " + rD86Fssz0iKbf0t61L + " has ended.");
        }
    }
}
