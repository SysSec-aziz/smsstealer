package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ZSO61OFnW5yAt {
    public static ZSO61OFnW5yAt ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public tpLngQCdAeyjjtxlI LaeGQIruHQu81hfJldjMOQSVblH3x;
    public TypedValue V57tEvNfxZVVcOCAOih5PKr;
    public WeakHashMap VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public final WeakHashMap zzpBGItXfub0yWj = new WeakHashMap(0);
    public static final PorterDuff.Mode zIvmSL0wzmmKGc3X39b2Gw2mUGE = PorterDuff.Mode.SRC_IN;
    public static final b1Vm0eFanfL3 NSjgqmGjEzuugn2SsG1mZFP = new b1Vm0eFanfL3(6);

    public static synchronized PorterDuffColorFilter LaeGQIruHQu81hfJldjMOQSVblH3x(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        b1Vm0eFanfL3 b1vm0efanfl3 = NSjgqmGjEzuugn2SsG1mZFP;
        b1vm0efanfl3.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) b1vm0efanfl3.zIvmSL0wzmmKGc3X39b2Gw2mUGE(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static synchronized ZSO61OFnW5yAt zzpBGItXfub0yWj() {
        try {
            if (ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
                ZLZeBXTMq0zDztBxtRTuCHrapQ = new ZSO61OFnW5yAt();
            }
        } catch (Throwable th) {
            throw th;
        }
        return ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public final synchronized Drawable V57tEvNfxZVVcOCAOih5PKr(Context context, int i) {
        return ZfQNn8hdWlEQ5cR94249PDsLR(context, i, false);
    }

    public final Drawable VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, int i) {
        Drawable drawableNewDrawable;
        WeakReference weakReference;
        if (this.V57tEvNfxZVVcOCAOih5PKr == null) {
            this.V57tEvNfxZVVcOCAOih5PKr = new TypedValue();
        }
        TypedValue typedValue = this.V57tEvNfxZVVcOCAOih5PKr;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            kxD7lnfhVByiEwFdNtrRslxulbe kxd7lnfhvbyiewfdntrrslxulbe = (kxD7lnfhVByiEwFdNtrRslxulbe) this.zzpBGItXfub0yWj.get(context);
            drawableNewDrawable = null;
            if (kxd7lnfhvbyiewfdntrrslxulbe != null && (weakReference = (WeakReference) kxd7lnfhvbyiewfdntrrslxulbe.zzpBGItXfub0yWj(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    int iHzCpKshMOoaw76hFcbOVRYMeRd = ej6unYlOWMDF.HzCpKshMOoaw76hFcbOVRYMeRd(kxd7lnfhvbyiewfdntrrslxulbe.ZfQNn8hdWlEQ5cR94249PDsLR, kxd7lnfhvbyiewfdntrrslxulbe.zIvmSL0wzmmKGc3X39b2Gw2mUGE, j);
                    if (iHzCpKshMOoaw76hFcbOVRYMeRd >= 0) {
                        Object[] objArr = kxd7lnfhvbyiewfdntrrslxulbe.LaeGQIruHQu81hfJldjMOQSVblH3x;
                        Object obj = objArr[iHzCpKshMOoaw76hFcbOVRYMeRd];
                        Object obj2 = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.V57tEvNfxZVVcOCAOih5PKr;
                        if (obj != obj2) {
                            objArr[iHzCpKshMOoaw76hFcbOVRYMeRd] = obj2;
                            kxd7lnfhvbyiewfdntrrslxulbe.V57tEvNfxZVVcOCAOih5PKr = true;
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableV57tEvNfxZVVcOCAOih5PKr = null;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableV57tEvNfxZVVcOCAOih5PKr = new LayerDrawable(new Drawable[]{V57tEvNfxZVVcOCAOih5PKr(context, R.drawable.abc_cab_background_internal_bg), V57tEvNfxZVVcOCAOih5PKr(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableV57tEvNfxZVVcOCAOih5PKr = tpLngQCdAeyjjtxlI.V57tEvNfxZVVcOCAOih5PKr(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableV57tEvNfxZVVcOCAOih5PKr = tpLngQCdAeyjjtxlI.V57tEvNfxZVVcOCAOih5PKr(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableV57tEvNfxZVVcOCAOih5PKr = tpLngQCdAeyjjtxlI.V57tEvNfxZVVcOCAOih5PKr(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableV57tEvNfxZVVcOCAOih5PKr == null) {
            return layerDrawableV57tEvNfxZVVcOCAOih5PKr;
        }
        layerDrawableV57tEvNfxZVVcOCAOih5PKr.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableV57tEvNfxZVVcOCAOih5PKr.getConstantState();
                if (constantState2 != null) {
                    kxD7lnfhVByiEwFdNtrRslxulbe kxd7lnfhvbyiewfdntrrslxulbe2 = (kxD7lnfhVByiEwFdNtrRslxulbe) this.zzpBGItXfub0yWj.get(context);
                    if (kxd7lnfhvbyiewfdntrrslxulbe2 == null) {
                        kxd7lnfhvbyiewfdntrrslxulbe2 = new kxD7lnfhVByiEwFdNtrRslxulbe();
                        this.zzpBGItXfub0yWj.put(context, kxd7lnfhvbyiewfdntrrslxulbe2);
                    }
                    kxd7lnfhvbyiewfdntrrslxulbe2.ZfQNn8hdWlEQ5cR94249PDsLR(j, new WeakReference(constantState2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return layerDrawableV57tEvNfxZVVcOCAOih5PKr;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable ZLZeBXTMq0zDztBxtRTuCHrapQ(android.content.Context r8, int r9, boolean r10, android.graphics.drawable.Drawable r11) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.ZSO61OFnW5yAt.ZLZeBXTMq0zDztBxtRTuCHrapQ(android.content.Context, int, boolean, android.graphics.drawable.Drawable):android.graphics.drawable.Drawable");
    }

    public final synchronized Drawable ZfQNn8hdWlEQ5cR94249PDsLR(Context context, int i, boolean z) {
        Drawable drawableVxUQ9tBhpHJ2AAEDNW8sghc4m;
        try {
            if (!this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR = true;
                Drawable drawableV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(context, R.drawable.abc_vector_test);
                if (drawableV57tEvNfxZVVcOCAOih5PKr == null || (!(drawableV57tEvNfxZVVcOCAOih5PKr instanceof z8EoQ1MhPC1NSqsZjhrc) && !"android.graphics.drawable.VectorDrawable".equals(drawableV57tEvNfxZVVcOCAOih5PKr.getClass().getName()))) {
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(context, i);
            if (drawableVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
                drawableVxUQ9tBhpHJ2AAEDNW8sghc4m = context.getDrawable(i);
            }
            if (drawableVxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
                drawableVxUQ9tBhpHJ2AAEDNW8sghc4m = ZLZeBXTMq0zDztBxtRTuCHrapQ(context, i, z, drawableVxUQ9tBhpHJ2AAEDNW8sghc4m);
            }
            if (drawableVxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
                VGwRvGhOWf9duTP8Dxb9PtsLAe1z.VxUQ9tBhpHJ2AAEDNW8sghc4m(drawableVxUQ9tBhpHJ2AAEDNW8sghc4m);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableVxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public final synchronized ColorStateList zIvmSL0wzmmKGc3X39b2Gw2mUGE(Context context, int i) {
        ColorStateList colorStateList;
        z4fU9Yfox9E2RCcjwcP384m z4fu9yfox9e2rccjwcp384m;
        WeakHashMap weakHashMap = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ColorStateList colorStateListZfQNn8hdWlEQ5cR94249PDsLR = null;
        colorStateList = (weakHashMap == null || (z4fu9yfox9e2rccjwcp384m = (z4fU9Yfox9E2RCcjwcP384m) weakHashMap.get(context)) == null) ? null : (ColorStateList) z4fu9yfox9e2rccjwcp384m.zzpBGItXfub0yWj(i);
        if (colorStateList == null) {
            tpLngQCdAeyjjtxlI tplngqcdaeyjjtxli = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (tplngqcdaeyjjtxli != null) {
                colorStateListZfQNn8hdWlEQ5cR94249PDsLR = tplngqcdaeyjjtxli.ZfQNn8hdWlEQ5cR94249PDsLR(context, i);
            }
            if (colorStateListZfQNn8hdWlEQ5cR94249PDsLR != null) {
                if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
                    this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new WeakHashMap();
                }
                z4fU9Yfox9E2RCcjwcP384m z4fu9yfox9e2rccjwcp384m2 = (z4fU9Yfox9E2RCcjwcP384m) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(context);
                if (z4fu9yfox9e2rccjwcp384m2 == null) {
                    z4fu9yfox9e2rccjwcp384m2 = new z4fU9Yfox9E2RCcjwcP384m();
                    this.VxUQ9tBhpHJ2AAEDNW8sghc4m.put(context, z4fu9yfox9e2rccjwcp384m2);
                }
                z4fu9yfox9e2rccjwcp384m2.VxUQ9tBhpHJ2AAEDNW8sghc4m(i, colorStateListZfQNn8hdWlEQ5cR94249PDsLR);
            }
            colorStateList = colorStateListZfQNn8hdWlEQ5cR94249PDsLR;
        }
        return colorStateList;
    }
}
