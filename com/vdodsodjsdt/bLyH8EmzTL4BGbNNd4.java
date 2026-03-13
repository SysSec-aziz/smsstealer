package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class bLyH8EmzTL4BGbNNd4 {
    public nK7IfeTXa4 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final View VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public nK7IfeTXa4 ZfQNn8hdWlEQ5cR94249PDsLR;
    public nK7IfeTXa4 zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int V57tEvNfxZVVcOCAOih5PKr = -1;
    public final aMdFkGJAdbLdAI00ZfKC7DaJw3k2 zzpBGItXfub0yWj = aMdFkGJAdbLdAI00ZfKC7DaJw3k2.VxUQ9tBhpHJ2AAEDNW8sghc4m();

    public bLyH8EmzTL4BGbNNd4(View view) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = view;
    }

    public final void GI83zq0G8e7zkn(PorterDuff.Mode mode) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = new nK7IfeTXa4();
        }
        nK7IfeTXa4 nk7ifetxa4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        nk7ifetxa4.ZfQNn8hdWlEQ5cR94249PDsLR = mode;
        nk7ifetxa4.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        this.V57tEvNfxZVVcOCAOih5PKr = -1;
        ZLZeBXTMq0zDztBxtRTuCHrapQ(null);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP(ColorStateList colorStateList) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = new nK7IfeTXa4();
        }
        nK7IfeTXa4 nk7ifetxa4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        nk7ifetxa4.V57tEvNfxZVVcOCAOih5PKr = colorStateList;
        nk7ifetxa4.zzpBGItXfub0yWj = true;
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final PorterDuff.Mode V57tEvNfxZVVcOCAOih5PKr() {
        nK7IfeTXa4 nk7ifetxa4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (nk7ifetxa4 != null) {
            return (PorterDuff.Mode) nk7ifetxa4.ZfQNn8hdWlEQ5cR94249PDsLR;
        }
        return null;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        View view = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR != null) {
                if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new nK7IfeTXa4();
                }
                nK7IfeTXa4 nk7ifetxa4 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                nk7ifetxa4.V57tEvNfxZVVcOCAOih5PKr = null;
                nk7ifetxa4.zzpBGItXfub0yWj = false;
                nk7ifetxa4.ZfQNn8hdWlEQ5cR94249PDsLR = null;
                nk7ifetxa4.VxUQ9tBhpHJ2AAEDNW8sghc4m = false;
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                ColorStateList colorStateListV57tEvNfxZVVcOCAOih5PKr = lJgFFp37ou.V57tEvNfxZVVcOCAOih5PKr(view);
                if (colorStateListV57tEvNfxZVVcOCAOih5PKr != null) {
                    nk7ifetxa4.zzpBGItXfub0yWj = true;
                    nk7ifetxa4.V57tEvNfxZVVcOCAOih5PKr = colorStateListV57tEvNfxZVVcOCAOih5PKr;
                }
                PorterDuff.Mode modeZfQNn8hdWlEQ5cR94249PDsLR = lJgFFp37ou.ZfQNn8hdWlEQ5cR94249PDsLR(view);
                if (modeZfQNn8hdWlEQ5cR94249PDsLR != null) {
                    nk7ifetxa4.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
                    nk7ifetxa4.ZfQNn8hdWlEQ5cR94249PDsLR = modeZfQNn8hdWlEQ5cR94249PDsLR;
                }
                if (nk7ifetxa4.zzpBGItXfub0yWj || nk7ifetxa4.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                    aMdFkGJAdbLdAI00ZfKC7DaJw3k2.LaeGQIruHQu81hfJldjMOQSVblH3x(background, nk7ifetxa4, view.getDrawableState());
                    return;
                }
            }
            nK7IfeTXa4 nk7ifetxa42 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (nk7ifetxa42 != null) {
                aMdFkGJAdbLdAI00ZfKC7DaJw3k2.LaeGQIruHQu81hfJldjMOQSVblH3x(background, nk7ifetxa42, view.getDrawableState());
                return;
            }
            nK7IfeTXa4 nk7ifetxa43 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (nk7ifetxa43 != null) {
                aMdFkGJAdbLdAI00ZfKC7DaJw3k2.LaeGQIruHQu81hfJldjMOQSVblH3x(background, nk7ifetxa43, view.getDrawableState());
            }
        }
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR = new nK7IfeTXa4();
            }
            nK7IfeTXa4 nk7ifetxa4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            nk7ifetxa4.V57tEvNfxZVVcOCAOih5PKr = colorStateList;
            nk7ifetxa4.zzpBGItXfub0yWj = true;
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = null;
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListZIvmSL0wzmmKGc3X39b2Gw2mUGE;
        View view = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Context context = view.getContext();
        int[] iArr = AuEvIFo0QoYm1PHNG.w0Wu95l8dVNw5rZMRu;
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7 = NrjuzzioPqfttNRptBDpZDzSYUrcM.qNPQb1obP7(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr;
        View view2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        xb0r6yEzq0tw9m7nTWG5BFR8.KUYypEB4eNWOZWVDpH(view2, view2.getContext(), iArr, attributeSet, (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr, i);
        try {
            if (typedArray.hasValue(0)) {
                this.V57tEvNfxZVVcOCAOih5PKr = typedArray.getResourceId(0, -1);
                aMdFkGJAdbLdAI00ZfKC7DaJw3k2 amdfkgjadbldai00zfkc7dajw3k2 = this.zzpBGItXfub0yWj;
                Context context2 = view.getContext();
                int i2 = this.V57tEvNfxZVVcOCAOih5PKr;
                synchronized (amdfkgjadbldai00zfkc7dajw3k2) {
                    colorStateListZIvmSL0wzmmKGc3X39b2Gw2mUGE = amdfkgjadbldai00zfkc7dajw3k2.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(context2, i2);
                }
                if (colorStateListZIvmSL0wzmmKGc3X39b2Gw2mUGE != null) {
                    ZLZeBXTMq0zDztBxtRTuCHrapQ(colorStateListZIvmSL0wzmmKGc3X39b2Gw2mUGE);
                }
            }
            if (typedArray.hasValue(1)) {
                lJgFFp37ou.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(1));
            }
            if (typedArray.hasValue(2)) {
                lJgFFp37ou.NSjgqmGjEzuugn2SsG1mZFP(view, VGwRvGhOWf9duTP8Dxb9PtsLAe1z.zzpBGItXfub0yWj(typedArray.getInt(2, -1), null));
            }
            nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
        } catch (Throwable th) {
            nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
            throw th;
        }
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        ColorStateList colorStateListZIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        aMdFkGJAdbLdAI00ZfKC7DaJw3k2 amdfkgjadbldai00zfkc7dajw3k2 = this.zzpBGItXfub0yWj;
        if (amdfkgjadbldai00zfkc7dajw3k2 != null) {
            Context context = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getContext();
            synchronized (amdfkgjadbldai00zfkc7dajw3k2) {
                colorStateListZIvmSL0wzmmKGc3X39b2Gw2mUGE = amdfkgjadbldai00zfkc7dajw3k2.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(context, i);
            }
        } else {
            colorStateListZIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ(colorStateListZIvmSL0wzmmKGc3X39b2Gw2mUGE);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final ColorStateList zzpBGItXfub0yWj() {
        nK7IfeTXa4 nk7ifetxa4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (nk7ifetxa4 != null) {
            return (ColorStateList) nk7ifetxa4.V57tEvNfxZVVcOCAOih5PKr;
        }
        return null;
    }
}
