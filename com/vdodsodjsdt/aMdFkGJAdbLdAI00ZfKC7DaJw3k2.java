package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class aMdFkGJAdbLdAI00ZfKC7DaJw3k2 {
    public static aMdFkGJAdbLdAI00ZfKC7DaJw3k2 V57tEvNfxZVVcOCAOih5PKr;
    public static final PorterDuff.Mode zzpBGItXfub0yWj = PorterDuff.Mode.SRC_IN;
    public ZSO61OFnW5yAt VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public static void LaeGQIruHQu81hfJldjMOQSVblH3x(Drawable drawable, nK7IfeTXa4 nk7ifetxa4, int[] iArr) {
        PorterDuff.Mode mode = ZSO61OFnW5yAt.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = nk7ifetxa4.zzpBGItXfub0yWj;
        if (!z && !nk7ifetxa4.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterLaeGQIruHQu81hfJldjMOQSVblH3x = null;
        ColorStateList colorStateList = z ? (ColorStateList) nk7ifetxa4.V57tEvNfxZVVcOCAOih5PKr : null;
        PorterDuff.Mode mode2 = nk7ifetxa4.VxUQ9tBhpHJ2AAEDNW8sghc4m ? (PorterDuff.Mode) nk7ifetxa4.ZfQNn8hdWlEQ5cR94249PDsLR : ZSO61OFnW5yAt.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterLaeGQIruHQu81hfJldjMOQSVblH3x = ZSO61OFnW5yAt.LaeGQIruHQu81hfJldjMOQSVblH3x(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterLaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    public static synchronized PorterDuffColorFilter V57tEvNfxZVVcOCAOih5PKr(int i, PorterDuff.Mode mode) {
        return ZSO61OFnW5yAt.LaeGQIruHQu81hfJldjMOQSVblH3x(i, mode);
    }

    public static synchronized aMdFkGJAdbLdAI00ZfKC7DaJw3k2 VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        try {
            if (V57tEvNfxZVVcOCAOih5PKr == null) {
                ZfQNn8hdWlEQ5cR94249PDsLR();
            }
        } catch (Throwable th) {
            throw th;
        }
        return V57tEvNfxZVVcOCAOih5PKr;
    }

    public static synchronized void ZfQNn8hdWlEQ5cR94249PDsLR() {
        if (V57tEvNfxZVVcOCAOih5PKr == null) {
            aMdFkGJAdbLdAI00ZfKC7DaJw3k2 amdfkgjadbldai00zfkc7dajw3k2 = new aMdFkGJAdbLdAI00ZfKC7DaJw3k2();
            V57tEvNfxZVVcOCAOih5PKr = amdfkgjadbldai00zfkc7dajw3k2;
            amdfkgjadbldai00zfkc7dajw3k2.VxUQ9tBhpHJ2AAEDNW8sghc4m = ZSO61OFnW5yAt.zzpBGItXfub0yWj();
            ZSO61OFnW5yAt zSO61OFnW5yAt = V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            tpLngQCdAeyjjtxlI tplngqcdaeyjjtxli = new tpLngQCdAeyjjtxlI();
            synchronized (zSO61OFnW5yAt) {
                zSO61OFnW5yAt.LaeGQIruHQu81hfJldjMOQSVblH3x = tplngqcdaeyjjtxli;
            }
        }
    }

    public final synchronized Drawable zzpBGItXfub0yWj(Context context, int i) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr(context, i);
    }
}
