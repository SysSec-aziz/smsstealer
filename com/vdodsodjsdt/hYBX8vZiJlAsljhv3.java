package com.vdodsodjsdt;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hYBX8vZiJlAsljhv3 implements View.OnApplyWindowInsetsListener {
    public final hEzujSQMPyLOvX VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public pmJH8rqWIwRth8COqq zzpBGItXfub0yWj;

    public hYBX8vZiJlAsljhv3(View view, hEzujSQMPyLOvX hezujsqmpylovx) {
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqZzpBGItXfub0yWj;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = hezujsqmpylovx;
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m = rNOK825VfWyyIg17blujknX8.VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
        if (pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
            int i = Build.VERSION.SDK_INT;
            pmjh8rqwiwrth8coqqZzpBGItXfub0yWj = (i >= 34 ? new Fq3Bs0prQtLat6(pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m) : i >= 31 ? new fi6bazFdEnPBJ(pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m) : i >= 30 ? new pJLDv0icdTgj6BPWve3wUpnLp(pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m) : i >= 29 ? new p57FoMnk3HKM7uLVmLF1zeLl(pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m) : new NsOvxcOeb6vgXelqa7wP4(pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m)).zzpBGItXfub0yWj();
        } else {
            pmjh8rqwiwrth8coqqZzpBGItXfub0yWj = null;
        }
        this.zzpBGItXfub0yWj = pmjh8rqwiwrth8coqqZzpBGItXfub0yWj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.zzpBGItXfub0yWj = pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, windowInsets);
            return M9TaMBovb7u6bH.GI83zq0G8e7zkn(view, windowInsets);
        }
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ = pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, windowInsets);
        ueiyNUHTUsoj16g9F ueiynuhtusoj16g9f = pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (this.zzpBGItXfub0yWj == null) {
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            this.zzpBGItXfub0yWj = rNOK825VfWyyIg17blujknX8.VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
        }
        if (this.zzpBGItXfub0yWj == null) {
            this.zzpBGItXfub0yWj = pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ;
            return M9TaMBovb7u6bH.GI83zq0G8e7zkn(view, windowInsets);
        }
        hEzujSQMPyLOvX hezujsqmpylovxM9e7PWhFYLD2lOGMker = M9TaMBovb7u6bH.M9e7PWhFYLD2lOGMker(view);
        if (hezujsqmpylovxM9e7PWhFYLD2lOGMker != null && Objects.equals((pmJH8rqWIwRth8COqq) hezujsqmpylovxM9e7PWhFYLD2lOGMker.ZfQNn8hdWlEQ5cR94249PDsLR, pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ)) {
            return M9TaMBovb7u6bH.GI83zq0G8e7zkn(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq = this.zzpBGItXfub0yWj;
        int i = 1;
        while (i <= 512) {
            MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE = ueiynuhtusoj16g9f.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i);
            MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE2 = pmjh8rqwiwrth8coqq.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i);
            int i2 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int i3 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i4 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr;
            int i5 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj;
            int i6 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int i7 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE2.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i8 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE2.V57tEvNfxZVVcOCAOih5PKr;
            int i9 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE2.zzpBGItXfub0yWj;
            if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.zzpBGItXfub0yWj = pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ;
            return M9TaMBovb7u6bH.GI83zq0G8e7zkn(view, windowInsets);
        }
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq2 = this.zzpBGItXfub0yWj;
        oh4pE3JpiN2OEnGMPzOmHa7Yqe oh4pe3jpin2oengmpzomha7yqe = new oh4pE3JpiN2OEnGMPzOmHa7Yqe(i12, (i10 & 8) != 0 ? M9TaMBovb7u6bH.LaeGQIruHQu81hfJldjMOQSVblH3x : (i11 & 8) != 0 ? M9TaMBovb7u6bH.zIvmSL0wzmmKGc3X39b2Gw2mUGE : (i10 & 519) != 0 ? M9TaMBovb7u6bH.ZLZeBXTMq0zDztBxtRTuCHrapQ : (i11 & 519) != 0 ? M9TaMBovb7u6bH.NSjgqmGjEzuugn2SsG1mZFP : null, (i12 & 8) != 0 ? 160L : 250L);
        oh4pe3jpin2oengmpzomha7yqe.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(oh4pe3jpin2oengmpzomha7yqe.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m());
        MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE3 = ueiynuhtusoj16g9f.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i12);
        MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE4 = pmjh8rqwiwrth8coqq2.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i12);
        int iMin = Math.min(mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE3.VxUQ9tBhpHJ2AAEDNW8sghc4m, mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE4.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        int i13 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE3.zzpBGItXfub0yWj;
        int i14 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE4.zzpBGItXfub0yWj;
        int iMin2 = Math.min(i13, i14);
        int i15 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE3.V57tEvNfxZVVcOCAOih5PKr;
        int i16 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE4.V57tEvNfxZVVcOCAOih5PKr;
        int iMin3 = Math.min(i15, i16);
        int i17 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE3.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i18 = mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE4.ZfQNn8hdWlEQ5cR94249PDsLR;
        o0x3OWMw3He o0x3owmw3he = new o0x3OWMw3He(9, MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(iMin, iMin2, iMin3, Math.min(i17, i18)), MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(Math.max(mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE3.VxUQ9tBhpHJ2AAEDNW8sghc4m, mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE4.VxUQ9tBhpHJ2AAEDNW8sghc4m), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)));
        M9TaMBovb7u6bH.zIvmSL0wzmmKGc3X39b2Gw2mUGE(view, pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ, false);
        duration.addUpdateListener(new wdm3jSWvyIqdsVwVmKi(oh4pe3jpin2oengmpzomha7yqe, pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ, pmjh8rqwiwrth8coqq2, i12, view));
        duration.addListener(new eogwdH6zMZ(oh4pe3jpin2oengmpzomha7yqe, view));
        EI1vm2TsL95mT6ZYxvArdeslez.VxUQ9tBhpHJ2AAEDNW8sghc4m(view, new H4eSXfEApD4s6wLJPRvD(view, oh4pe3jpin2oengmpzomha7yqe, o0x3owmw3he, duration));
        this.zzpBGItXfub0yWj = pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ;
        return M9TaMBovb7u6bH.GI83zq0G8e7zkn(view, windowInsets);
    }
}
