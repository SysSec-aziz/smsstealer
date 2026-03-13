package com.vdodsodjsdt;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class NsOvxcOeb6vgXelqa7wP4 extends LVSdrptRp9 {
    public static Field LaeGQIruHQu81hfJldjMOQSVblH3x = null;
    public static boolean NSjgqmGjEzuugn2SsG1mZFP = false;
    public static Constructor ZLZeBXTMq0zDztBxtRTuCHrapQ = null;
    public static boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
    public WindowInsets V57tEvNfxZVVcOCAOih5PKr;
    public MCkc9XaOBWJ3kr1ZFUGL46e9N ZfQNn8hdWlEQ5cR94249PDsLR;

    public NsOvxcOeb6vgXelqa7wP4() {
        this.V57tEvNfxZVVcOCAOih5PKr = GI83zq0G8e7zkn();
    }

    private static WindowInsets GI83zq0G8e7zkn() {
        if (!zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            try {
                LaeGQIruHQu81hfJldjMOQSVblH3x = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        }
        Field field = LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!NSjgqmGjEzuugn2SsG1mZFP) {
            try {
                ZLZeBXTMq0zDztBxtRTuCHrapQ = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            NSjgqmGjEzuugn2SsG1mZFP = true;
        }
        Constructor constructor = ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // com.vdodsodjsdt.LVSdrptRp9
    public void LaeGQIruHQu81hfJldjMOQSVblH3x(MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9N) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = mCkc9XaOBWJ3kr1ZFUGL46e9N;
    }

    @Override // com.vdodsodjsdt.LVSdrptRp9
    public void ZLZeBXTMq0zDztBxtRTuCHrapQ(MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9N) {
        WindowInsets windowInsets = this.V57tEvNfxZVVcOCAOih5PKr;
        if (windowInsets != null) {
            this.V57tEvNfxZVVcOCAOih5PKr = windowInsets.replaceSystemWindowInsets(mCkc9XaOBWJ3kr1ZFUGL46e9N.VxUQ9tBhpHJ2AAEDNW8sghc4m, mCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj, mCkc9XaOBWJ3kr1ZFUGL46e9N.V57tEvNfxZVVcOCAOih5PKr, mCkc9XaOBWJ3kr1ZFUGL46e9N.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
    }

    @Override // com.vdodsodjsdt.LVSdrptRp9
    public pmJH8rqWIwRth8COqq zzpBGItXfub0yWj() {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ = pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(null, this.V57tEvNfxZVVcOCAOih5PKr);
        MCkc9XaOBWJ3kr1ZFUGL46e9N[] mCkc9XaOBWJ3kr1ZFUGL46e9NArr = this.zzpBGItXfub0yWj;
        ueiyNUHTUsoj16g9F ueiynuhtusoj16g9f = pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ueiynuhtusoj16g9f.Ca81ebIan1u(mCkc9XaOBWJ3kr1ZFUGL46e9NArr);
        ueiynuhtusoj16g9f.pYmKDYlAmhudp(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        return pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public NsOvxcOeb6vgXelqa7wP4(pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq) {
        super(pmjh8rqwiwrth8coqq);
        this.V57tEvNfxZVVcOCAOih5PKr = pmjh8rqwiwrth8coqq.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
    }
}
