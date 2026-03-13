package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class JK8x1CtpctMwmBhP8R9 extends AnimatorListenerAdapter {
    public final /* synthetic */ uGIIbcq05l2iYyEa2AaeeYA LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ TextView ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ TextView zzpBGItXfub0yWj;

    public JK8x1CtpctMwmBhP8R9(uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya, int i, TextView textView, int i2, TextView textView2) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = ugiibcq05l2iyyea2aaeeya;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = textView;
        this.V57tEvNfxZVVcOCAOih5PKr = i2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa;
        int i = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        ugiibcq05l2iyyea2aaeeya.p59rPv72J9 = i;
        ugiibcq05l2iyyea2aaeeya.KUYypEB4eNWOZWVDpH = null;
        TextView textView = this.zzpBGItXfub0yWj;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.V57tEvNfxZVVcOCAOih5PKr == 1 && (lzuj2xiohpzadsoz1vjvxa = ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV) != null) {
                lzuj2xiohpzadsoz1vjvxa.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
