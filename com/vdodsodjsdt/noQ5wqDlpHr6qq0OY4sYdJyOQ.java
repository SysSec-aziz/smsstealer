package com.vdodsodjsdt;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class noQ5wqDlpHr6qq0OY4sYdJyOQ {
    public float Ca81ebIan1u;
    public int[] CixTK5ZX8oWXHz34qHYV;
    public float GE1sqSYiEYQO2ew7WEZwTtUeS5;
    public float H2VFYNJEVGAX;
    public float HVEwbdULInpTNa0IG;
    public ColorStateList HzCpKshMOoaw76hFcbOVRYMeRd;
    public Typeface Irh5auREsoeV1C1RaBamlmy;
    public float ItrQwCXbty5PZtje5JS;
    public float JUdwvN8LfOMa;
    public int KUYypEB4eNWOZWVDpH;
    public float KYZ9RyuOc42A2J;
    public TimeInterpolator L8DMw02rUTs2w;
    public final RectF LaeGQIruHQu81hfJldjMOQSVblH3x;
    public ColorStateList M9e7PWhFYLD2lOGMker;
    public float O1xDAlBZZlZdoEf747lCFHld;
    public p9IyQAUniR RhfGHxtXxy0M0grmp2jkRjQg;
    public CharSequence SuB3hEmTmbbRGAhtvOOmfKEon;
    public Typeface TaDO7ogis3aEiWEtq;
    public int TqcnImqkSWIKht;
    public final Rect V57tEvNfxZVVcOCAOih5PKr;
    public final TextInputLayout VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final TextPaint YdNRGRc4rly;
    public CharSequence Z1FjjMJ0suz8AFI7gsA4GDLMXv;
    public final Rect ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean aXO0LSrt8bKV;
    public int d9zDyyznnp3oaDT1Ug;
    public Typeface f6ZQsR6bPLvvCDNXOUc;
    public TimeInterpolator gBaBUmihn5l4u;
    public float h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public ColorStateList hKs1wlZyvtUNaW1f5ABIGacfPcvX;
    public float iKANjmyTSxO6v6UuLPdu7DxOjlS;
    public Typeface jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public float ko09zE6UAgwkV;
    public float lQ0rO9lhQIyVe7Rp6;
    public float p59rPv72J9;
    public float pYmKDYlAmhudp;
    public CharSequence pzqP2AqKW6J5PO8zCKnW;
    public Typeface q11o1hieEkZDhF1MGOZI26oZiDT;
    public float q1wNbhk2O6;
    public float qygqjTppWwx992;
    public float rERAmyEtGV6ANGszuKcQI;
    public boolean ubNpdCC1pl7L;
    public Typeface vBGA6pPLqSMuYGvprl270j7;
    public float vXWl0o6I4U59CgHs9;
    public Typeface w0Wu95l8dVNw5rZMRu;
    public final TextPaint wRCD0SdqWCowdYU7bmzN;
    public float wdI7vzA3Qmcwd;
    public float y1NaPKTl7R18DOr6e8i5;
    public boolean ymT6yQrus3w;
    public StaticLayout zOk739gUM7zIZC25HHUxoiyixWFjn;
    public float zzpBGItXfub0yWj;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE = 16;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ = 16;
    public float NSjgqmGjEzuugn2SsG1mZFP = 15.0f;
    public float GI83zq0G8e7zkn = 15.0f;
    public final TextUtils.TruncateAt qNPQb1obP7 = TextUtils.TruncateAt.END;
    public final boolean vE4yDIjexsP2lGjLaTcB = true;
    public int bjhcQ0u7VT2OYYrwk96HrWoN = 1;
    public int BJQHddi0Plr5ElWetCyaixWOg9 = 1;
    public final float tFRdVJAePmTx77bP7FAN0uI = 1.0f;
    public final int mhUCRR8ceqc7mAozW = 1;
    public int rE05n5RsRkyWKIeA9cmLXAKv4Hze = -1;
    public int p6bBrs4p3Ly = -1;

    public noQ5wqDlpHr6qq0OY4sYdJyOQ(TextInputLayout textInputLayout) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.YdNRGRc4rly = textPaint;
        this.wRCD0SdqWCowdYU7bmzN = new TextPaint(textPaint);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new Rect();
        this.V57tEvNfxZVVcOCAOih5PKr = new Rect();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new RectF();
        GI83zq0G8e7zkn(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static float NSjgqmGjEzuugn2SsG1mZFP(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return mlFPz0SY9o7oN.VxUQ9tBhpHJ2AAEDNW8sghc4m(f, f2, f3);
    }

    public static int VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public final boolean Ca81ebIan1u() {
        return this.BJQHddi0Plr5ElWetCyaixWOg9 == 1;
    }

    public final void GI83zq0G8e7zkn(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.vBGA6pPLqSMuYGvprl270j7;
            if (typeface != null) {
                this.f6ZQsR6bPLvvCDNXOUc = sGipz63rTUmSj3uFDvOtzihao.O1xDAlBZZlZdoEf747lCFHld(configuration, typeface);
            }
            Typeface typeface2 = this.q11o1hieEkZDhF1MGOZI26oZiDT;
            if (typeface2 != null) {
                this.Irh5auREsoeV1C1RaBamlmy = sGipz63rTUmSj3uFDvOtzihao.O1xDAlBZZlZdoEf747lCFHld(configuration, typeface2);
            }
            Typeface typeface3 = this.f6ZQsR6bPLvvCDNXOUc;
            if (typeface3 == null) {
                typeface3 = this.vBGA6pPLqSMuYGvprl270j7;
            }
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = typeface3;
            Typeface typeface4 = this.Irh5auREsoeV1C1RaBamlmy;
            if (typeface4 == null) {
                typeface4 = this.q11o1hieEkZDhF1MGOZI26oZiDT;
            }
            this.TaDO7ogis3aEiWEtq = typeface4;
            M9e7PWhFYLD2lOGMker(true);
        }
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd(ColorStateList colorStateList) {
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd == colorStateList && this.M9e7PWhFYLD2lOGMker == colorStateList) {
            return;
        }
        this.HzCpKshMOoaw76hFcbOVRYMeRd = colorStateList;
        this.M9e7PWhFYLD2lOGMker = colorStateList;
        M9e7PWhFYLD2lOGMker(false);
    }

    public final boolean KUYypEB4eNWOZWVDpH(Typeface typeface) {
        p9IyQAUniR p9iyqaunir = this.RhfGHxtXxy0M0grmp2jkRjQg;
        if (p9iyqaunir != null) {
            p9iyqaunir.q1wNbhk2O6 = true;
        }
        if (this.vBGA6pPLqSMuYGvprl270j7 == typeface) {
            return false;
        }
        this.vBGA6pPLqSMuYGvprl270j7 = typeface;
        Typeface typefaceO1xDAlBZZlZdoEf747lCFHld = sGipz63rTUmSj3uFDvOtzihao.O1xDAlBZZlZdoEf747lCFHld(this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getContext().getResources().getConfiguration(), typeface);
        this.f6ZQsR6bPLvvCDNXOUc = typefaceO1xDAlBZZlZdoEf747lCFHld;
        if (typefaceO1xDAlBZZlZdoEf747lCFHld == null) {
            typefaceO1xDAlBZZlZdoEf747lCFHld = this.vBGA6pPLqSMuYGvprl270j7;
        }
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = typefaceO1xDAlBZZlZdoEf747lCFHld;
        return true;
    }

    public final StaticLayout LaeGQIruHQu81hfJldjMOQSVblH3x(int i, TextPaint textPaint, CharSequence charSequence, float f, boolean z) {
        Layout.Alignment alignment;
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.aXO0LSrt8bKV ? 1 : 0) & 7;
            alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.aXO0LSrt8bKV ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.aXO0LSrt8bKV ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        }
        xPkmmA8xByE6WyLiH xpkmma8xbye6wylih = new xPkmmA8xByE6WyLiH(charSequence, textPaint, (int) f);
        xpkmma8xbye6wylih.KUYypEB4eNWOZWVDpH = this.qNPQb1obP7;
        xpkmma8xbye6wylih.HzCpKshMOoaw76hFcbOVRYMeRd = z;
        xpkmma8xbye6wylih.LaeGQIruHQu81hfJldjMOQSVblH3x = alignment;
        xpkmma8xbye6wylih.M9e7PWhFYLD2lOGMker = false;
        xpkmma8xbye6wylih.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
        float f2 = this.tFRdVJAePmTx77bP7FAN0uI;
        xpkmma8xbye6wylih.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0.0f;
        xpkmma8xbye6wylih.NSjgqmGjEzuugn2SsG1mZFP = f2;
        xpkmma8xbye6wylih.GI83zq0G8e7zkn = this.mhUCRR8ceqc7mAozW;
        xpkmma8xbye6wylih.q1wNbhk2O6 = null;
        StaticLayout staticLayoutVxUQ9tBhpHJ2AAEDNW8sghc4m = xpkmma8xbye6wylih.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        staticLayoutVxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
        return staticLayoutVxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public final void M9e7PWhFYLD2lOGMker(boolean z) {
        float fMeasureText;
        TextInputLayout textInputLayout = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z) {
            return;
        }
        ZfQNn8hdWlEQ5cR94249PDsLR(1.0f, z);
        CharSequence charSequence = this.pzqP2AqKW6J5PO8zCKnW;
        TextPaint textPaint = this.YdNRGRc4rly;
        if (charSequence != null && this.zOk739gUM7zIZC25HHUxoiyixWFjn != null) {
            this.Z1FjjMJ0suz8AFI7gsA4GDLMXv = Ca81ebIan1u() ? TextUtils.ellipsize(this.pzqP2AqKW6J5PO8zCKnW, textPaint, this.zOk739gUM7zIZC25HHUxoiyixWFjn.getWidth(), this.qNPQb1obP7) : this.pzqP2AqKW6J5PO8zCKnW;
        }
        CharSequence charSequence2 = this.Z1FjjMJ0suz8AFI7gsA4GDLMXv;
        if (charSequence2 != null) {
            this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, this.aXO0LSrt8bKV ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i == 48) {
            this.p59rPv72J9 = rect.top;
        } else if (i != 80) {
            this.p59rPv72J9 = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.p59rPv72J9 = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = rect.centerX() - (this.GE1sqSYiEYQO2ew7WEZwTtUeS5 / 2.0f);
        } else if (i2 != 5) {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = rect.left;
        } else {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = rect.right - this.GE1sqSYiEYQO2ew7WEZwTtUeS5;
        }
        if (this.GE1sqSYiEYQO2ew7WEZwTtUeS5 <= rect.width()) {
            float f = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            float fMax = Math.max(0.0f, rect.left - f) + f;
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = fMax;
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = Math.min(0.0f, rect.right - (this.GE1sqSYiEYQO2ew7WEZwTtUeS5 + fMax)) + fMax;
        }
        float f2 = this.GI83zq0G8e7zkn;
        TextPaint textPaint2 = this.wRCD0SdqWCowdYU7bmzN;
        textPaint2.setTextSize(f2);
        textPaint2.setTypeface(this.jW7EiD0YL6xkbB158jMUzhWNWb1y);
        textPaint2.setLetterSpacing(this.vXWl0o6I4U59CgHs9);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect.height()) {
            float f3 = this.p59rPv72J9;
            float fMax2 = Math.max(0.0f, rect.top - f3) + f3;
            this.p59rPv72J9 = fMax2;
            this.p59rPv72J9 = Math.min(0.0f, rect.bottom - (zIvmSL0wzmmKGc3X39b2Gw2mUGE() + fMax2)) + fMax2;
        }
        ZfQNn8hdWlEQ5cR94249PDsLR(0.0f, z);
        float height = this.zOk739gUM7zIZC25HHUxoiyixWFjn != null ? r15.getHeight() : 0.0f;
        StaticLayout staticLayout = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
        if (staticLayout == null || this.bjhcQ0u7VT2OYYrwk96HrWoN <= 1) {
            CharSequence charSequence3 = this.pzqP2AqKW6J5PO8zCKnW;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout.getWidth();
        }
        StaticLayout staticLayout2 = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
        this.KUYypEB4eNWOZWVDpH = staticLayout2 != null ? staticLayout2.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.aXO0LSrt8bKV ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i3 == 48) {
            this.q1wNbhk2O6 = rect2.top;
        } else if (i3 != 80) {
            this.q1wNbhk2O6 = rect2.centerY() - (height / 2.0f);
        } else {
            this.q1wNbhk2O6 = (rect2.bottom - height) + (this.ubNpdCC1pl7L ? textPaint.descent() : 0.0f);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.Ca81ebIan1u = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.Ca81ebIan1u = rect2.left;
        } else {
            this.Ca81ebIan1u = rect2.right - fMeasureText;
        }
        ZfQNn8hdWlEQ5cR94249PDsLR(this.zzpBGItXfub0yWj, false);
        textInputLayout.postInvalidateOnAnimation();
        zzpBGItXfub0yWj();
    }

    public final boolean V57tEvNfxZVVcOCAOih5PKr(CharSequence charSequence) {
        boolean z = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getLayoutDirection() == 1;
        if (this.vE4yDIjexsP2lGjLaTcB) {
            return (z ? Ace4xmNA0QbdiSLPz.ZfQNn8hdWlEQ5cR94249PDsLR : Ace4xmNA0QbdiSLPz.V57tEvNfxZVVcOCAOih5PKr).zzpBGItXfub0yWj(charSequence, charSequence.length());
        }
        return z;
    }

    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.CixTK5ZX8oWXHz34qHYV;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(float f, boolean z) {
        float f2;
        Typeface typeface;
        float f3;
        if (this.SuB3hEmTmbbRGAhtvOOmfKEon == null) {
            return;
        }
        float fWidth = this.ZfQNn8hdWlEQ5cR94249PDsLR.width();
        float fWidth2 = this.V57tEvNfxZVVcOCAOih5PKr.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = Ca81ebIan1u() ? this.GI83zq0G8e7zkn : this.NSjgqmGjEzuugn2SsG1mZFP;
            f3 = Ca81ebIan1u() ? this.vXWl0o6I4U59CgHs9 : this.wdI7vzA3Qmcwd;
            this.O1xDAlBZZlZdoEf747lCFHld = Ca81ebIan1u() ? 1.0f : NSjgqmGjEzuugn2SsG1mZFP(this.NSjgqmGjEzuugn2SsG1mZFP, this.GI83zq0G8e7zkn, f, this.L8DMw02rUTs2w) / this.NSjgqmGjEzuugn2SsG1mZFP;
            if (!Ca81ebIan1u()) {
                fWidth = fWidth2;
            }
            typeface = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
            fWidth2 = fWidth;
        } else {
            f2 = this.NSjgqmGjEzuugn2SsG1mZFP;
            float f4 = this.wdI7vzA3Qmcwd;
            typeface = this.TaDO7ogis3aEiWEtq;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.O1xDAlBZZlZdoEf747lCFHld = 1.0f;
            } else {
                this.O1xDAlBZZlZdoEf747lCFHld = NSjgqmGjEzuugn2SsG1mZFP(this.NSjgqmGjEzuugn2SsG1mZFP, this.GI83zq0G8e7zkn, f, this.L8DMw02rUTs2w) / this.NSjgqmGjEzuugn2SsG1mZFP;
            }
            float f5 = this.GI83zq0G8e7zkn / this.NSjgqmGjEzuugn2SsG1mZFP;
            float f6 = fWidth2 * f5;
            if (!z && f6 > fWidth && Ca81ebIan1u()) {
                fWidth2 = Math.min(fWidth / f5, fWidth2);
            }
            f3 = f4;
        }
        int i = f < 0.5f ? this.bjhcQ0u7VT2OYYrwk96HrWoN : this.BJQHddi0Plr5ElWetCyaixWOg9;
        TextPaint textPaint = this.YdNRGRc4rly;
        if (fWidth2 > 0.0f) {
            boolean z2 = this.HVEwbdULInpTNa0IG != f2;
            boolean z3 = this.KYZ9RyuOc42A2J != f3;
            boolean z4 = this.w0Wu95l8dVNw5rZMRu != typeface;
            StaticLayout staticLayout = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
            boolean z5 = z2 || z3 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z4 || (this.d9zDyyznnp3oaDT1Ug != i) || this.ymT6yQrus3w;
            this.HVEwbdULInpTNa0IG = f2;
            this.KYZ9RyuOc42A2J = f3;
            this.w0Wu95l8dVNw5rZMRu = typeface;
            this.ymT6yQrus3w = false;
            this.d9zDyyznnp3oaDT1Ug = i;
            textPaint.setLinearText(this.O1xDAlBZZlZdoEf747lCFHld != 1.0f);
            z = z5;
        }
        if (this.pzqP2AqKW6J5PO8zCKnW == null || z) {
            textPaint.setTextSize(this.HVEwbdULInpTNa0IG);
            textPaint.setTypeface(this.w0Wu95l8dVNw5rZMRu);
            textPaint.setLetterSpacing(this.KYZ9RyuOc42A2J);
            boolean zV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(this.SuB3hEmTmbbRGAhtvOOmfKEon);
            this.aXO0LSrt8bKV = zV57tEvNfxZVVcOCAOih5PKr;
            StaticLayout staticLayoutLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(((this.bjhcQ0u7VT2OYYrwk96HrWoN > 1 || this.BJQHddi0Plr5ElWetCyaixWOg9 > 1) && !zV57tEvNfxZVVcOCAOih5PKr) ? i : 1, textPaint, this.SuB3hEmTmbbRGAhtvOOmfKEon, fWidth2 * (Ca81ebIan1u() ? 1.0f : this.O1xDAlBZZlZdoEf747lCFHld), this.aXO0LSrt8bKV);
            this.zOk739gUM7zIZC25HHUxoiyixWFjn = staticLayoutLaeGQIruHQu81hfJldjMOQSVblH3x;
            this.pzqP2AqKW6J5PO8zCKnW = staticLayoutLaeGQIruHQu81hfJldjMOQSVblH3x.getText();
        }
    }

    public final void p59rPv72J9(Typeface typeface) {
        boolean z;
        boolean zKUYypEB4eNWOZWVDpH = KUYypEB4eNWOZWVDpH(typeface);
        if (this.q11o1hieEkZDhF1MGOZI26oZiDT != typeface) {
            this.q11o1hieEkZDhF1MGOZI26oZiDT = typeface;
            Typeface typefaceO1xDAlBZZlZdoEf747lCFHld = sGipz63rTUmSj3uFDvOtzihao.O1xDAlBZZlZdoEf747lCFHld(this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getContext().getResources().getConfiguration(), typeface);
            this.Irh5auREsoeV1C1RaBamlmy = typefaceO1xDAlBZZlZdoEf747lCFHld;
            if (typefaceO1xDAlBZZlZdoEf747lCFHld == null) {
                typefaceO1xDAlBZZlZdoEf747lCFHld = this.q11o1hieEkZDhF1MGOZI26oZiDT;
            }
            this.TaDO7ogis3aEiWEtq = typefaceO1xDAlBZZlZdoEf747lCFHld;
            z = true;
        } else {
            z = false;
        }
        if (zKUYypEB4eNWOZWVDpH || z) {
            M9e7PWhFYLD2lOGMker(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0005 A[PHI: r0
      0x0005: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q1wNbhk2O6(float r3) {
        /*
            r2 = this;
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto L7
        L5:
            r3 = r0
            goto Le
        L7:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto L5
        Le:
            float r0 = r2.zzpBGItXfub0yWj
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L19
            r2.zzpBGItXfub0yWj = r3
            r2.zzpBGItXfub0yWj()
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.noQ5wqDlpHr6qq0OY4sYdJyOQ.q1wNbhk2O6(float):void");
    }

    public final float zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        int i = this.rE05n5RsRkyWKIeA9cmLXAKv4Hze;
        if (i != -1) {
            return i;
        }
        float f = this.GI83zq0G8e7zkn;
        TextPaint textPaint = this.wRCD0SdqWCowdYU7bmzN;
        textPaint.setTextSize(f);
        textPaint.setTypeface(this.jW7EiD0YL6xkbB158jMUzhWNWb1y);
        textPaint.setLetterSpacing(this.vXWl0o6I4U59CgHs9);
        return -textPaint.ascent();
    }

    public final void zzpBGItXfub0yWj() {
        float f = this.zzpBGItXfub0yWj;
        float f2 = this.V57tEvNfxZVVcOCAOih5PKr.left;
        Rect rect = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        float fNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(f2, rect.left, f, this.gBaBUmihn5l4u);
        RectF rectF = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        rectF.left = fNSjgqmGjEzuugn2SsG1mZFP;
        rectF.top = NSjgqmGjEzuugn2SsG1mZFP(this.q1wNbhk2O6, this.p59rPv72J9, f, this.gBaBUmihn5l4u);
        rectF.right = NSjgqmGjEzuugn2SsG1mZFP(r1.right, rect.right, f, this.gBaBUmihn5l4u);
        rectF.bottom = NSjgqmGjEzuugn2SsG1mZFP(r1.bottom, rect.bottom, f, this.gBaBUmihn5l4u);
        this.pYmKDYlAmhudp = NSjgqmGjEzuugn2SsG1mZFP(this.Ca81ebIan1u, this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, f, this.gBaBUmihn5l4u);
        this.ko09zE6UAgwkV = NSjgqmGjEzuugn2SsG1mZFP(this.q1wNbhk2O6, this.p59rPv72J9, f, this.gBaBUmihn5l4u);
        ZfQNn8hdWlEQ5cR94249PDsLR(f, false);
        TextInputLayout textInputLayout = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        textInputLayout.postInvalidateOnAnimation();
        aAAXOJC11DloKmCeUHYKJBh aaaxojc11dlokmceuhykjbh = mlFPz0SY9o7oN.zzpBGItXfub0yWj;
        this.rERAmyEtGV6ANGszuKcQI = 1.0f - NSjgqmGjEzuugn2SsG1mZFP(0.0f, 1.0f, 1.0f - f, aaaxojc11dlokmceuhykjbh);
        textInputLayout.postInvalidateOnAnimation();
        this.H2VFYNJEVGAX = NSjgqmGjEzuugn2SsG1mZFP(1.0f, 0.0f, f, aaaxojc11dlokmceuhykjbh);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        ColorStateList colorStateList2 = this.M9e7PWhFYLD2lOGMker;
        TextPaint textPaint = this.YdNRGRc4rly;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(VxUQ9tBhpHJ2AAEDNW8sghc4m(ZLZeBXTMq0zDztBxtRTuCHrapQ(colorStateList2), ZLZeBXTMq0zDztBxtRTuCHrapQ(this.HzCpKshMOoaw76hFcbOVRYMeRd), f));
        } else {
            textPaint.setColor(ZLZeBXTMq0zDztBxtRTuCHrapQ(colorStateList));
        }
        float f3 = this.vXWl0o6I4U59CgHs9;
        float f4 = this.wdI7vzA3Qmcwd;
        if (f3 != f4) {
            textPaint.setLetterSpacing(NSjgqmGjEzuugn2SsG1mZFP(f4, f3, f, aaaxojc11dlokmceuhykjbh));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.y1NaPKTl7R18DOr6e8i5 = mlFPz0SY9o7oN.VxUQ9tBhpHJ2AAEDNW8sghc4m(0.0f, this.lQ0rO9lhQIyVe7Rp6, f);
        this.qygqjTppWwx992 = mlFPz0SY9o7oN.VxUQ9tBhpHJ2AAEDNW8sghc4m(0.0f, this.JUdwvN8LfOMa, f);
        this.iKANjmyTSxO6v6UuLPdu7DxOjlS = mlFPz0SY9o7oN.VxUQ9tBhpHJ2AAEDNW8sghc4m(0.0f, this.ItrQwCXbty5PZtje5JS, f);
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(0, ZLZeBXTMq0zDztBxtRTuCHrapQ(this.hKs1wlZyvtUNaW1f5ABIGacfPcvX), f);
        this.TqcnImqkSWIKht = iVxUQ9tBhpHJ2AAEDNW8sghc4m;
        textPaint.setShadowLayer(this.y1NaPKTl7R18DOr6e8i5, this.qygqjTppWwx992, this.iKANjmyTSxO6v6UuLPdu7DxOjlS, iVxUQ9tBhpHJ2AAEDNW8sghc4m);
        textInputLayout.postInvalidateOnAnimation();
    }
}
