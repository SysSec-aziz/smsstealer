package com.vdodsodjsdt;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class XTgu373Rjd8ehP4U3Nj extends WindowInsetsAnimation$Callback {
    public ArrayList V57tEvNfxZVVcOCAOih5PKr;
    public final hEzujSQMPyLOvX VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final HashMap ZfQNn8hdWlEQ5cR94249PDsLR;
    public List zzpBGItXfub0yWj;

    public XTgu373Rjd8ehP4U3Nj(hEzujSQMPyLOvX hezujsqmpylovx) {
        super(0);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new HashMap();
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = hezujsqmpylovx;
    }

    public final oh4pE3JpiN2OEnGMPzOmHa7Yqe VxUQ9tBhpHJ2AAEDNW8sghc4m(WindowInsetsAnimation windowInsetsAnimation) {
        oh4pE3JpiN2OEnGMPzOmHa7Yqe oh4pe3jpin2oengmpzomha7yqe = (oh4pE3JpiN2OEnGMPzOmHa7Yqe) this.ZfQNn8hdWlEQ5cR94249PDsLR.get(windowInsetsAnimation);
        if (oh4pe3jpin2oengmpzomha7yqe == null) {
            oh4pe3jpin2oengmpzomha7yqe = new oh4pE3JpiN2OEnGMPzOmHa7Yqe(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                oh4pe3jpin2oengmpzomha7yqe.VxUQ9tBhpHJ2AAEDNW8sghc4m = new SvzIeHhj05NbHzUgFakHP(windowInsetsAnimation);
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR.put(windowInsetsAnimation, oh4pe3jpin2oengmpzomha7yqe);
        }
        return oh4pe3jpin2oengmpzomha7yqe;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m(windowInsetsAnimation);
        ((View) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZLZeBXTMq0zDztBxtRTuCHrapQ).setTranslationY(0.0f);
        this.ZfQNn8hdWlEQ5cR94249PDsLR.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m(windowInsetsAnimation);
        hEzujSQMPyLOvX hezujsqmpylovx = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        View view = (View) hezujsqmpylovx.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int[] iArr = (int[]) hezujsqmpylovx.NSjgqmGjEzuugn2SsG1mZFP;
        view.getLocationOnScreen(iArr);
        hezujsqmpylovx.LaeGQIruHQu81hfJldjMOQSVblH3x = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.V57tEvNfxZVVcOCAOih5PKr;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.V57tEvNfxZVVcOCAOih5PKr = arrayList2;
            this.zzpBGItXfub0yWj = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationCa81ebIan1u = X0A7raLNhpDiM5P5rp83bU.Ca81ebIan1u(list.get(size));
            oh4pE3JpiN2OEnGMPzOmHa7Yqe oh4pe3jpin2oengmpzomha7yqeVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(windowInsetsAnimationCa81ebIan1u);
            oh4pe3jpin2oengmpzomha7yqeVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(windowInsetsAnimationCa81ebIan1u.getFraction());
            this.V57tEvNfxZVVcOCAOih5PKr.add(oh4pe3jpin2oengmpzomha7yqeVxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ = pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(null, windowInsets);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ, this.zzpBGItXfub0yWj);
        return pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m(windowInsetsAnimation);
        MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NV57tEvNfxZVVcOCAOih5PKr = MCkc9XaOBWJ3kr1ZFUGL46e9N.V57tEvNfxZVVcOCAOih5PKr(bounds.getLowerBound());
        MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NV57tEvNfxZVVcOCAOih5PKr2 = MCkc9XaOBWJ3kr1ZFUGL46e9N.V57tEvNfxZVVcOCAOih5PKr(bounds.getUpperBound());
        hEzujSQMPyLOvX hezujsqmpylovx = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        View view = (View) hezujsqmpylovx.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int[] iArr = (int[]) hezujsqmpylovx.NSjgqmGjEzuugn2SsG1mZFP;
        view.getLocationOnScreen(iArr);
        int i = hezujsqmpylovx.LaeGQIruHQu81hfJldjMOQSVblH3x - iArr[1];
        hezujsqmpylovx.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
        view.setTranslationY(i);
        X0A7raLNhpDiM5P5rp83bU.ko09zE6UAgwkV();
        return X0A7raLNhpDiM5P5rp83bU.q1wNbhk2O6(mCkc9XaOBWJ3kr1ZFUGL46e9NV57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR(), mCkc9XaOBWJ3kr1ZFUGL46e9NV57tEvNfxZVVcOCAOih5PKr2.ZfQNn8hdWlEQ5cR94249PDsLR());
    }
}
