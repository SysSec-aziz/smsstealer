package com.vdodsodjsdt;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class wdm3jSWvyIqdsVwVmKi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ pmJH8rqWIwRth8COqq V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ oh4pE3JpiN2OEnGMPzOmHa7Yqe VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ pmJH8rqWIwRth8COqq zzpBGItXfub0yWj;

    public wdm3jSWvyIqdsVwVmKi(oh4pE3JpiN2OEnGMPzOmHa7Yqe oh4pe3jpin2oengmpzomha7yqe, pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq, pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq2, int i, View view) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = oh4pe3jpin2oengmpzomha7yqe;
        this.zzpBGItXfub0yWj = pmjh8rqwiwrth8coqq;
        this.V57tEvNfxZVVcOCAOih5PKr = pmjh8rqwiwrth8coqq2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        oh4pE3JpiN2OEnGMPzOmHa7Yqe oh4pe3jpin2oengmpzomha7yqe = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        GEjyy5i3b4KJYgsmKOT gEjyy5i3b4KJYgsmKOT = oh4pe3jpin2oengmpzomha7yqe.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        gEjyy5i3b4KJYgsmKOT.ZfQNn8hdWlEQ5cR94249PDsLR(animatedFraction);
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq = this.zzpBGItXfub0yWj;
        ueiyNUHTUsoj16g9F ueiynuhtusoj16g9f = pmjh8rqwiwrth8coqq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        float fZzpBGItXfub0yWj = gEjyy5i3b4KJYgsmKOT.zzpBGItXfub0yWj();
        PathInterpolator pathInterpolator = M9TaMBovb7u6bH.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i = Build.VERSION.SDK_INT;
        LVSdrptRp9 fq3Bs0prQtLat6 = i >= 34 ? new Fq3Bs0prQtLat6(pmjh8rqwiwrth8coqq) : i >= 31 ? new fi6bazFdEnPBJ(pmjh8rqwiwrth8coqq) : i >= 30 ? new pJLDv0icdTgj6BPWve3wUpnLp(pmjh8rqwiwrth8coqq) : i >= 29 ? new p57FoMnk3HKM7uLVmLF1zeLl(pmjh8rqwiwrth8coqq) : new NsOvxcOeb6vgXelqa7wP4(pmjh8rqwiwrth8coqq);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((this.ZfQNn8hdWlEQ5cR94249PDsLR & i2) == 0) {
                fq3Bs0prQtLat6.V57tEvNfxZVVcOCAOih5PKr(i2, ueiynuhtusoj16g9f.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2));
            } else {
                MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE = ueiynuhtusoj16g9f.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2);
                MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE2 = this.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2);
                float f = 1.0f - fZzpBGItXfub0yWj;
                fq3Bs0prQtLat6.V57tEvNfxZVVcOCAOih5PKr(i2, pmJH8rqWIwRth8COqq.LaeGQIruHQu81hfJldjMOQSVblH3x(mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE, (int) (((double) ((mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m - mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE2.VxUQ9tBhpHJ2AAEDNW8sghc4m) * f)) + 0.5d), (int) (((double) ((mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj - mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE2.zzpBGItXfub0yWj) * f)) + 0.5d), (int) (((double) ((mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr - mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE2.V57tEvNfxZVVcOCAOih5PKr) * f)) + 0.5d), (int) (((double) ((mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZfQNn8hdWlEQ5cR94249PDsLR - mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE2.ZfQNn8hdWlEQ5cR94249PDsLR) * f)) + 0.5d)));
            }
        }
        M9TaMBovb7u6bH.ZLZeBXTMq0zDztBxtRTuCHrapQ(this.LaeGQIruHQu81hfJldjMOQSVblH3x, fq3Bs0prQtLat6.zzpBGItXfub0yWj(), Collections.singletonList(oh4pe3jpin2oengmpzomha7yqe));
    }
}
