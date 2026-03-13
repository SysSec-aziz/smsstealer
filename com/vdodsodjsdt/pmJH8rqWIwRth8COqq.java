package com.vdodsodjsdt;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class pmJH8rqWIwRth8COqq {
    public static final pmJH8rqWIwRth8COqq zzpBGItXfub0yWj;
    public final ueiyNUHTUsoj16g9F VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            zzpBGItXfub0yWj = v4yH3IoFqiqxFFg.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        } else if (i >= 30) {
            zzpBGItXfub0yWj = OMM5j2DzHjyOFtrUI.ko09zE6UAgwkV;
        } else {
            zzpBGItXfub0yWj = ueiyNUHTUsoj16g9F.zzpBGItXfub0yWj;
        }
    }

    public pmJH8rqWIwRth8COqq(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new v4yH3IoFqiqxFFg(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new Afk726tm0pHXyvxsrC(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new OMM5j2DzHjyOFtrUI(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new AgCatFu4MuH(this, windowInsets);
        } else if (i >= 28) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new STMtgT9EEB44eh4iSy30OYsZ(this, windowInsets);
        } else {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new QqFWwJ4NrJZKM5q3nnD(this, windowInsets);
        }
    }

    public static MCkc9XaOBWJ3kr1ZFUGL46e9N LaeGQIruHQu81hfJldjMOQSVblH3x(MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9N, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, mCkc9XaOBWJ3kr1ZFUGL46e9N.VxUQ9tBhpHJ2AAEDNW8sghc4m - i);
        int iMax2 = Math.max(0, mCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj - i2);
        int iMax3 = Math.max(0, mCkc9XaOBWJ3kr1ZFUGL46e9N.V57tEvNfxZVVcOCAOih5PKr - i3);
        int iMax4 = Math.max(0, mCkc9XaOBWJ3kr1ZFUGL46e9N.ZfQNn8hdWlEQ5cR94249PDsLR - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? mCkc9XaOBWJ3kr1ZFUGL46e9N : MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(iMax, iMax2, iMax3, iMax4);
    }

    public static pmJH8rqWIwRth8COqq ZLZeBXTMq0zDztBxtRTuCHrapQ(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq = new pmJH8rqWIwRth8COqq(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m = rNOK825VfWyyIg17blujknX8.VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
            ueiyNUHTUsoj16g9F ueiynuhtusoj16g9f = pmjh8rqwiwrth8coqq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            ueiynuhtusoj16g9f.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m);
            ueiynuhtusoj16g9f.ZfQNn8hdWlEQ5cR94249PDsLR(view.getRootView());
            ueiynuhtusoj16g9f.ko09zE6UAgwkV(view.getWindowSystemUiVisibility());
        }
        return pmjh8rqwiwrth8coqq;
    }

    public final int V57tEvNfxZVVcOCAOih5PKr() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker().V57tEvNfxZVVcOCAOih5PKr;
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker().ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final int ZfQNn8hdWlEQ5cR94249PDsLR() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker().zzpBGItXfub0yWj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pmJH8rqWIwRth8COqq) {
            return Objects.equals(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, ((pmJH8rqWIwRth8COqq) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        return false;
    }

    public final int hashCode() {
        ueiyNUHTUsoj16g9F ueiynuhtusoj16g9f = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (ueiynuhtusoj16g9f == null) {
            return 0;
        }
        return ueiynuhtusoj16g9f.hashCode();
    }

    public final WindowInsets zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        ueiyNUHTUsoj16g9F ueiynuhtusoj16g9f = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (ueiynuhtusoj16g9f instanceof ACHQH4O0M6xZgdzgI5gPCN435AVw) {
            return ((ACHQH4O0M6xZgdzgI5gPCN435AVw) ueiynuhtusoj16g9f).V57tEvNfxZVVcOCAOih5PKr;
        }
        return null;
    }

    public final int zzpBGItXfub0yWj() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker().VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public pmJH8rqWIwRth8COqq() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new ueiyNUHTUsoj16g9F(this);
    }
}
