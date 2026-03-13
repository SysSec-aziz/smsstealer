package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class GXZVLd372jtPv6 {
    public final boolean GI83zq0G8e7zkn;
    public final ColorStateList HzCpKshMOoaw76hFcbOVRYMeRd;
    public float KUYypEB4eNWOZWVDpH;
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final float M9e7PWhFYLD2lOGMker;
    public final float NSjgqmGjEzuugn2SsG1mZFP;
    public final String V57tEvNfxZVVcOCAOih5PKr;
    public final ColorStateList VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final float ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public Typeface h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final int q1wNbhk2O6;
    public final float zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final String zzpBGItXfub0yWj;
    public boolean p59rPv72J9 = false;
    public boolean Ca81ebIan1u = false;

    public GXZVLd372jtPv6(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AuEvIFo0QoYm1PHNG.TaDO7ogis3aEiWEtq);
        this.KUYypEB4eNWOZWVDpH = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context, typedArrayObtainStyledAttributes, 3);
        F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context, typedArrayObtainStyledAttributes, 4);
        F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context, typedArrayObtainStyledAttributes, 5);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.q1wNbhk2O6 = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context, typedArrayObtainStyledAttributes, 6);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.NSjgqmGjEzuugn2SsG1mZFP = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, PGobtLpyfPC4TCnlq740.f6ZQsR6bPLvvCDNXOUc);
        this.GI83zq0G8e7zkn = typedArrayObtainStyledAttributes2.hasValue(0);
        this.M9e7PWhFYLD2lOGMker = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(Context context, TextPaint textPaint, F44whnLsbQ f44whnLsbQ) {
        Typeface typeface;
        if (V57tEvNfxZVVcOCAOih5PKr(context) && this.p59rPv72J9 && (typeface = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) != null) {
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(context, textPaint, typeface);
            return;
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(context, textPaint, this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
        zzpBGItXfub0yWj(context, new HvECEjqTCzZTVaIWqTWAH5(this, context, textPaint, f44whnLsbQ));
    }

    public final boolean V57tEvNfxZVVcOCAOih5PKr(Context context) throws Exception {
        Context context2;
        Typeface typefaceVxUQ9tBhpHJ2AAEDNW8sghc4m;
        String string;
        Typeface typefaceCreate;
        XmlResourceParser xml;
        if (this.p59rPv72J9) {
            return true;
        }
        int i = this.q1wNbhk2O6;
        if (i != 0) {
            ThreadLocal threadLocal = h88a6weV7Lqlrc7J4ND8e7Rcl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceVxUQ9tBhpHJ2AAEDNW8sghc4m = null;
            } else {
                context2 = context;
                typefaceVxUQ9tBhpHJ2AAEDNW8sghc4m = h88a6weV7Lqlrc7J4ND8e7Rcl.VxUQ9tBhpHJ2AAEDNW8sghc4m(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (typefaceVxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
                this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = typefaceVxUQ9tBhpHJ2AAEDNW8sghc4m;
                this.p59rPv72J9 = true;
                return true;
            }
            if (!this.Ca81ebIan1u) {
                this.Ca81ebIan1u = true;
                Resources resources = context2.getResources();
                int i2 = this.q1wNbhk2O6;
                if (i2 == 0 || !resources.getResourceTypeName(i2).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.ZfQNn8hdWlEQ5cR94249PDsLR);
                    }
                } else {
                    try {
                        xml = resources.getXml(i2);
                    } catch (Throwable unused) {
                    }
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), RrI8Zoa01Rzzfa.zzpBGItXfub0yWj);
                            string = typedArrayObtainAttributes.getString(7);
                            typedArrayObtainAttributes.recycle();
                            break;
                        }
                        xml.next();
                        string = null;
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.ZfQNn8hdWlEQ5cR94249PDsLR);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = typefaceCreate2;
                this.p59rPv72J9 = true;
                return true;
            }
        }
        return false;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        String str;
        Typeface typeface = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (typeface == null && (str = this.zzpBGItXfub0yWj) != null) {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = Typeface.create(str, i);
        }
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == null) {
            int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (i2 == 1) {
                this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = Typeface.SERIF;
            } else if (i2 != 3) {
                this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = Typeface.DEFAULT;
            } else {
                this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = Typeface.MONOSPACE;
            }
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = Typeface.create(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, i);
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(Context context, TextPaint textPaint, F44whnLsbQ f44whnLsbQ) {
        LaeGQIruHQu81hfJldjMOQSVblH3x(context, textPaint, f44whnLsbQ);
        ColorStateList colorStateList = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        textPaint.setShadowLayer(this.NSjgqmGjEzuugn2SsG1mZFP, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZLZeBXTMq0zDztBxtRTuCHrapQ, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceO1xDAlBZZlZdoEf747lCFHld = sGipz63rTUmSj3uFDvOtzihao.O1xDAlBZZlZdoEf747lCFHld(context.getResources().getConfiguration(), typeface);
        if (typefaceO1xDAlBZZlZdoEf747lCFHld != null) {
            typeface = typefaceO1xDAlBZZlZdoEf747lCFHld;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.ZfQNn8hdWlEQ5cR94249PDsLR;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.KUYypEB4eNWOZWVDpH);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.V57tEvNfxZVVcOCAOih5PKr);
        }
        if (this.GI83zq0G8e7zkn) {
            textPaint.setLetterSpacing(this.M9e7PWhFYLD2lOGMker);
        }
    }

    public final void zzpBGItXfub0yWj(Context context, F44whnLsbQ f44whnLsbQ) {
        if (!V57tEvNfxZVVcOCAOih5PKr(context)) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        int i = this.q1wNbhk2O6;
        if (i == 0) {
            this.p59rPv72J9 = true;
        }
        if (this.p59rPv72J9) {
            f44whnLsbQ.ymT6yQrus3w(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, true);
            return;
        }
        try {
            j7cAGohYDeOaTRfuE6nH j7cagohydeoatrfue6nh = new j7cAGohYDeOaTRfuE6nH(this, f44whnLsbQ);
            ThreadLocal threadLocal = h88a6weV7Lqlrc7J4ND8e7Rcl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (context.isRestricted()) {
                j7cagohydeoatrfue6nh.zIvmSL0wzmmKGc3X39b2Gw2mUGE(-4);
            } else {
                h88a6weV7Lqlrc7J4ND8e7Rcl.VxUQ9tBhpHJ2AAEDNW8sghc4m(context, i, new TypedValue(), 0, j7cagohydeoatrfue6nh, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.p59rPv72J9 = true;
            f44whnLsbQ.CixTK5ZX8oWXHz34qHYV(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.zzpBGItXfub0yWj, e);
            this.p59rPv72J9 = true;
            f44whnLsbQ.CixTK5ZX8oWXHz34qHYV(-3);
        }
    }
}
