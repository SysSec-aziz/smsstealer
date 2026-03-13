package com.vdodsodjsdt;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class evze9VEkYMa2p1GH implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
    public final /* synthetic */ Object zzpBGItXfub0yWj;

    public /* synthetic */ evze9VEkYMa2p1GH(hbsUcFELqptC4ZZnom4xRs0eGoz hbsucfelqptc4zznom4xrs0egoz) {
        this.zzpBGItXfub0yWj = hbsucfelqptc4zznom4xrs0egoz;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                hbsUcFELqptC4ZZnom4xRs0eGoz hbsucfelqptc4zznom4xrs0egoz = (hbsUcFELqptC4ZZnom4xRs0eGoz) this.zzpBGItXfub0yWj;
                hbsucfelqptc4zznom4xrs0egoz.getClass();
                hbsucfelqptc4zznom4xrs0egoz.ZfQNn8hdWlEQ5cR94249PDsLR.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((View) ((L6YGERc84Mt1k8Qot) ((qF22Y620JkFyombtDYw0h0h8Rxpja) this.zzpBGItXfub0yWj).V57tEvNfxZVVcOCAOih5PKr).Ca81ebIan1u.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ evze9VEkYMa2p1GH(qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja, View view) {
        this.zzpBGItXfub0yWj = qf22y620jkfyombtdyw0h0h8rxpja;
    }
}
