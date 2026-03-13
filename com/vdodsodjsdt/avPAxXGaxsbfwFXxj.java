package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class avPAxXGaxsbfwFXxj extends EQz8nVyVxmIrHN6fNCQWutFG0b30O implements Drawable.Callback, AaHasH8flkLZBQQsSHyz0SQoWxm {
    public final Paint AFOcXGdvoTMuqwiG8tD;
    public final Paint.FontMetrics BDoqAMf0rlMRAnVghjC4qjG;
    public wxy8N6DDawGP6J BJQHddi0Plr5ElWetCyaixWOg9;
    public float ByTQIhgl7ezGvHXEd;
    public ColorStateList CixTK5ZX8oWXHz34qHYV;
    public int DNP7yXLsojH0rPMHr8fUY14M;
    public boolean DUIkOzkuF3hUt;
    public int G479XgNG9rK8jPPbSXr;
    public SpannableStringBuilder GE1sqSYiEYQO2ew7WEZwTtUeS5;
    public boolean H2VFYNJEVGAX;
    public float HAPpjhiCsV9ONY23505HCBI9IX;
    public int Hf6zp5JYLjGyFD2HXbpHA9;
    public boolean ItrQwCXbty5PZtje5JS;
    public float JUdwvN8LfOMa;
    public int KMiA9Sqk243eQkFNNoS;
    public ColorStateList KYZ9RyuOc42A2J;
    public Drawable L8DMw02rUTs2w;
    public TextUtils.TruncateAt MnclyDIMxkCs4NkUREm;
    public PorterDuffColorFilter N08cqkgagFuPYWJcTFAQVt;
    public int Pf1HsU8AK92buCoUaexm5AC;
    public boolean PfK8qHOJoCLG;
    public ColorStateList QwZcr6V7mfRUaij0Bp3zpr5ClBcxr;
    public int ScSj9HEorWkb3bIb1HyeKVoW;
    public int[] SdPSMGy13dYOH9CwolJVKu21val;
    public float TqcnImqkSWIKht;
    public ColorStateList VAUpruoPNdSAVh;
    public final PointF VOvSEdhaZyc0oOGQ8;
    public ColorStateList YdNRGRc4rly;
    public Drawable Z1FjjMJ0suz8AFI7gsA4GDLMXv;
    public ColorStateList bjhcQ0u7VT2OYYrwk96HrWoN;
    public float d9zDyyznnp3oaDT1Ug;
    public final Context e1gEV3X9xwmHj;
    public boolean gBaBUmihn5l4u;
    public final Path h2b7InwIaORKN91X7whfQh4;
    public boolean hKs1wlZyvtUNaW1f5ABIGacfPcvX;
    public ColorStateList iKANjmyTSxO6v6UuLPdu7DxOjlS;
    public ColorStateList lQ0rO9lhQIyVe7Rp6;
    public final RectF lxWWbfAOLs4jWzd7PSIiIJ;
    public float mhUCRR8ceqc7mAozW;
    public int nNOZCSz1a7S;
    public float p6bBrs4p3Ly;
    public ColorFilter pCrI77IVeIpJnmCUHd;
    public ColorStateList qygqjTppWwx992;
    public final ji7HCOeNEno1mYLq3Mn8d r0dB0ojIy6g8mnk1;
    public float rE05n5RsRkyWKIeA9cmLXAKv4Hze;
    public boolean rERAmyEtGV6ANGszuKcQI;
    public wxy8N6DDawGP6J tFRdVJAePmTx77bP7FAN0uI;
    public WeakReference tf2p6GzNN7uQY7Lun0pJ;
    public float tpEo0fy9FaoJYrSFHRfIK6;
    public boolean u04PSKYidgCYrHk5CAtyMkPOXcY;
    public PorterDuff.Mode uQ30BFNHbnwcS96Dk6jHUECPfOq;
    public float ubNpdCC1pl7L;
    public Drawable vXWl0o6I4U59CgHs9;
    public int w45GC0xYcf4u8gmC;
    public float wR7sbzHKf9hYV1lxoS6nqyszepWvN;
    public CharSequence wRCD0SdqWCowdYU7bmzN;
    public RippleDrawable wdI7vzA3Qmcwd;
    public float ymT6yQrus3w;
    public float zOk739gUM7zIZC25HHUxoiyixWFjn;
    public int zyiF0wv9HozxGOIDt8PvVp;
    public static final int[] dWgUTvLDR2aOE7pFLrMrHP = {android.R.attr.state_enabled};
    public static final ShapeDrawable W5cWMjmJv6kqhapkBbKZYxBWC2p = new ShapeDrawable(new OvalShape());

    public avPAxXGaxsbfwFXxj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, R.style.Widget_MaterialComponents_Chip_Action);
        this.d9zDyyznnp3oaDT1Ug = -1.0f;
        this.AFOcXGdvoTMuqwiG8tD = new Paint(1);
        this.BDoqAMf0rlMRAnVghjC4qjG = new Paint.FontMetrics();
        this.lxWWbfAOLs4jWzd7PSIiIJ = new RectF();
        this.VOvSEdhaZyc0oOGQ8 = new PointF();
        this.h2b7InwIaORKN91X7whfQh4 = new Path();
        this.Hf6zp5JYLjGyFD2HXbpHA9 = 255;
        this.uQ30BFNHbnwcS96Dk6jHUECPfOq = PorterDuff.Mode.SRC_IN;
        this.tf2p6GzNN7uQY7Lun0pJ = new WeakReference(null);
        HzCpKshMOoaw76hFcbOVRYMeRd(context);
        this.e1gEV3X9xwmHj = context;
        ji7HCOeNEno1mYLq3Mn8d ji7hcoeneno1mylq3mn8d = new ji7HCOeNEno1mYLq3Mn8d(this);
        this.r0dB0ojIy6g8mnk1 = ji7hcoeneno1mylq3mn8d;
        this.wRCD0SdqWCowdYU7bmzN = "";
        ji7hcoeneno1mylq3mn8d.VxUQ9tBhpHJ2AAEDNW8sghc4m.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = dWgUTvLDR2aOE7pFLrMrHP;
        setState(iArr);
        L8DMw02rUTs2w(iArr);
        this.DUIkOzkuF3hUt = true;
        W5cWMjmJv6kqhapkBbKZYxBWC2p.setTint(-1);
    }

    public static boolean RhfGHxtXxy0M0grmp2jkRjQg(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void rERAmyEtGV6ANGszuKcQI(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean w0Wu95l8dVNw5rZMRu(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public final void CixTK5ZX8oWXHz34qHYV(float f) {
        if (this.ymT6yQrus3w != f) {
            this.ymT6yQrus3w = f;
            this.AFOcXGdvoTMuqwiG8tD.setStrokeWidth(f);
            if (this.u04PSKYidgCYrHk5CAtyMkPOXcY) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR.HzCpKshMOoaw76hFcbOVRYMeRd = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final boolean GE1sqSYiEYQO2ew7WEZwTtUeS5() {
        return this.hKs1wlZyvtUNaW1f5ABIGacfPcvX && this.vXWl0o6I4U59CgHs9 != null;
    }

    public final void HVEwbdULInpTNa0IG(float f) {
        if (this.d9zDyyznnp3oaDT1Ug != f) {
            this.d9zDyyznnp3oaDT1Ug = f;
            jFJXX88X4vgYX5CG85l5EyqW8AAH jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE = this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x = new ZOzTbMJxsw(f);
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new ZOzTbMJxsw(f);
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ = new ZOzTbMJxsw(f);
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP = new ZOzTbMJxsw(f);
            setShapeAppearanceModel(jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m());
        }
    }

    public final float Irh5auREsoeV1C1RaBamlmy() {
        if (GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
            return this.HAPpjhiCsV9ONY23505HCBI9IX + this.zOk739gUM7zIZC25HHUxoiyixWFjn + this.ByTQIhgl7ezGvHXEd;
        }
        return 0.0f;
    }

    public final void ItrQwCXbty5PZtje5JS(float f) {
        if (this.p6bBrs4p3Ly != f) {
            float fTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
            this.p6bBrs4p3Ly = f;
            float fTaDO7ogis3aEiWEtq2 = TaDO7ogis3aEiWEtq();
            invalidateSelf();
            if (fTaDO7ogis3aEiWEtq != fTaDO7ogis3aEiWEtq2) {
                qNPQb1obP7();
            }
        }
    }

    public final void JUdwvN8LfOMa(boolean z) {
        if (this.hKs1wlZyvtUNaW1f5ABIGacfPcvX != z) {
            boolean zGE1sqSYiEYQO2ew7WEZwTtUeS5 = GE1sqSYiEYQO2ew7WEZwTtUeS5();
            this.hKs1wlZyvtUNaW1f5ABIGacfPcvX = z;
            boolean zGE1sqSYiEYQO2ew7WEZwTtUeS52 = GE1sqSYiEYQO2ew7WEZwTtUeS5();
            if (zGE1sqSYiEYQO2ew7WEZwTtUeS5 != zGE1sqSYiEYQO2ew7WEZwTtUeS52) {
                if (zGE1sqSYiEYQO2ew7WEZwTtUeS52) {
                    f6ZQsR6bPLvvCDNXOUc(this.vXWl0o6I4U59CgHs9);
                } else {
                    rERAmyEtGV6ANGszuKcQI(this.vXWl0o6I4U59CgHs9);
                }
                invalidateSelf();
                qNPQb1obP7();
            }
        }
    }

    public final boolean KYZ9RyuOc42A2J() {
        return this.H2VFYNJEVGAX && this.Z1FjjMJ0suz8AFI7gsA4GDLMXv != null && this.PfK8qHOJoCLG;
    }

    public final boolean L8DMw02rUTs2w(int[] iArr) {
        if (Arrays.equals(this.SdPSMGy13dYOH9CwolJVKu21val, iArr)) {
            return false;
        }
        this.SdPSMGy13dYOH9CwolJVKu21val = iArr;
        if (GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
            return SuB3hEmTmbbRGAhtvOOmfKEon(getState(), iArr);
        }
        return false;
    }

    public final void O1xDAlBZZlZdoEf747lCFHld(boolean z) {
        if (this.H2VFYNJEVGAX != z) {
            boolean zKYZ9RyuOc42A2J = KYZ9RyuOc42A2J();
            this.H2VFYNJEVGAX = z;
            boolean zKYZ9RyuOc42A2J2 = KYZ9RyuOc42A2J();
            if (zKYZ9RyuOc42A2J != zKYZ9RyuOc42A2J2) {
                if (zKYZ9RyuOc42A2J2) {
                    f6ZQsR6bPLvvCDNXOUc(this.Z1FjjMJ0suz8AFI7gsA4GDLMXv);
                } else {
                    rERAmyEtGV6ANGszuKcQI(this.Z1FjjMJ0suz8AFI7gsA4GDLMXv);
                }
                invalidateSelf();
                qNPQb1obP7();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean SuB3hEmTmbbRGAhtvOOmfKEon(int[] r10, int[] r11) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.avPAxXGaxsbfwFXxj.SuB3hEmTmbbRGAhtvOOmfKEon(int[], int[]):boolean");
    }

    public final float TaDO7ogis3aEiWEtq() {
        if (!zOk739gUM7zIZC25HHUxoiyixWFjn() && !KYZ9RyuOc42A2J()) {
            return 0.0f;
        }
        float f = this.rE05n5RsRkyWKIeA9cmLXAKv4Hze;
        Drawable drawable = this.PfK8qHOJoCLG ? this.Z1FjjMJ0suz8AFI7gsA4GDLMXv : this.L8DMw02rUTs2w;
        float intrinsicWidth = this.JUdwvN8LfOMa;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.p6bBrs4p3Ly;
    }

    public final void TqcnImqkSWIKht(boolean z) {
        if (this.gBaBUmihn5l4u != z) {
            boolean zZOk739gUM7zIZC25HHUxoiyixWFjn = zOk739gUM7zIZC25HHUxoiyixWFjn();
            this.gBaBUmihn5l4u = z;
            boolean zZOk739gUM7zIZC25HHUxoiyixWFjn2 = zOk739gUM7zIZC25HHUxoiyixWFjn();
            if (zZOk739gUM7zIZC25HHUxoiyixWFjn != zZOk739gUM7zIZC25HHUxoiyixWFjn2) {
                if (zZOk739gUM7zIZC25HHUxoiyixWFjn2) {
                    f6ZQsR6bPLvvCDNXOUc(this.L8DMw02rUTs2w);
                } else {
                    rERAmyEtGV6ANGszuKcQI(this.L8DMw02rUTs2w);
                }
                invalidateSelf();
                qNPQb1obP7();
            }
        }
    }

    public final void YdNRGRc4rly(float f) {
        if (this.ByTQIhgl7ezGvHXEd != f) {
            this.ByTQIhgl7ezGvHXEd = f;
            invalidateSelf();
            if (GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
                qNPQb1obP7();
            }
        }
    }

    public final void aXO0LSrt8bKV(Drawable drawable) {
        if (this.Z1FjjMJ0suz8AFI7gsA4GDLMXv != drawable) {
            float fTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
            this.Z1FjjMJ0suz8AFI7gsA4GDLMXv = drawable;
            float fTaDO7ogis3aEiWEtq2 = TaDO7ogis3aEiWEtq();
            rERAmyEtGV6ANGszuKcQI(this.Z1FjjMJ0suz8AFI7gsA4GDLMXv);
            f6ZQsR6bPLvvCDNXOUc(this.Z1FjjMJ0suz8AFI7gsA4GDLMXv);
            invalidateSelf();
            if (fTaDO7ogis3aEiWEtq != fTaDO7ogis3aEiWEtq2) {
                qNPQb1obP7();
            }
        }
    }

    public final void d9zDyyznnp3oaDT1Ug(ColorStateList colorStateList) {
        if (this.CixTK5ZX8oWXHz34qHYV != colorStateList) {
            this.CixTK5ZX8oWXHz34qHYV = colorStateList;
            if (this.u04PSKYidgCYrHk5CAtyMkPOXcY) {
                UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.LaeGQIruHQu81hfJldjMOQSVblH3x != colorStateList) {
                    uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.LaeGQIruHQu81hfJldjMOQSVblH3x = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    @Override // com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.Hf6zp5JYLjGyFD2HXbpHA9) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.u04PSKYidgCYrHk5CAtyMkPOXcY;
        Paint paint = this.AFOcXGdvoTMuqwiG8tD;
        RectF rectF = this.lxWWbfAOLs4jWzd7PSIiIJ;
        if (!z) {
            paint.setColor(this.G479XgNG9rK8jPPbSXr);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, q11o1hieEkZDhF1MGOZI26oZiDT(), q11o1hieEkZDhF1MGOZI26oZiDT(), paint);
        }
        if (!this.u04PSKYidgCYrHk5CAtyMkPOXcY) {
            paint.setColor(this.Pf1HsU8AK92buCoUaexm5AC);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.pCrI77IVeIpJnmCUHd;
            if (colorFilter == null) {
                colorFilter = this.N08cqkgagFuPYWJcTFAQVt;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, q11o1hieEkZDhF1MGOZI26oZiDT(), q11o1hieEkZDhF1MGOZI26oZiDT(), paint);
        }
        if (this.u04PSKYidgCYrHk5CAtyMkPOXcY) {
            super.draw(canvas);
        }
        if (this.ymT6yQrus3w > 0.0f && !this.u04PSKYidgCYrHk5CAtyMkPOXcY) {
            paint.setColor(this.KMiA9Sqk243eQkFNNoS);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.u04PSKYidgCYrHk5CAtyMkPOXcY) {
                ColorFilter colorFilter2 = this.pCrI77IVeIpJnmCUHd;
                if (colorFilter2 == null) {
                    colorFilter2 = this.N08cqkgagFuPYWJcTFAQVt;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.ymT6yQrus3w / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.d9zDyyznnp3oaDT1Ug - (this.ymT6yQrus3w / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.DNP7yXLsojH0rPMHr8fUY14M);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.u04PSKYidgCYrHk5CAtyMkPOXcY) {
            RectF rectF2 = new RectF(bounds);
            UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b = uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            float[] fArr = this.aXO0LSrt8bKV;
            float f5 = uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.M9e7PWhFYLD2lOGMker;
            UjGaonxlpbbHvs2pOnMd ujGaonxlpbbHvs2pOnMd = this.f6ZQsR6bPLvvCDNXOUc;
            Yl6XIohGSfgJzxL8v7MoePiWZ yl6XIohGSfgJzxL8v7MoePiWZ = this.vBGA6pPLqSMuYGvprl270j7;
            f = 2.0f;
            Path path = this.h2b7InwIaORKN91X7whfQh4;
            yl6XIohGSfgJzxL8v7MoePiWZ.VxUQ9tBhpHJ2AAEDNW8sghc4m(xdVIZOnOVHGi6uYUaae4zAI94b, fArr, f5, rectF2, ujGaonxlpbbHvs2pOnMd, path);
            LaeGQIruHQu81hfJldjMOQSVblH3x(canvas2, paint, path, this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.aXO0LSrt8bKV, ZLZeBXTMq0zDztBxtRTuCHrapQ());
        } else {
            canvas2.drawRoundRect(rectF, q11o1hieEkZDhF1MGOZI26oZiDT(), q11o1hieEkZDhF1MGOZI26oZiDT(), paint);
            f = 2.0f;
        }
        if (zOk739gUM7zIZC25HHUxoiyixWFjn()) {
            vBGA6pPLqSMuYGvprl270j7(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.L8DMw02rUTs2w.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.L8DMw02rUTs2w.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (KYZ9RyuOc42A2J()) {
            vBGA6pPLqSMuYGvprl270j7(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.Z1FjjMJ0suz8AFI7gsA4GDLMXv.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.Z1FjjMJ0suz8AFI7gsA4GDLMXv.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.DUIkOzkuF3hUt && this.wRCD0SdqWCowdYU7bmzN != null) {
            PointF pointF = this.VOvSEdhaZyc0oOGQ8;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.wRCD0SdqWCowdYU7bmzN;
            ji7HCOeNEno1mYLq3Mn8d ji7hcoeneno1mylq3mn8d = this.r0dB0ojIy6g8mnk1;
            if (charSequence != null) {
                float fTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq() + this.mhUCRR8ceqc7mAozW + this.ubNpdCC1pl7L;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fTaDO7ogis3aEiWEtq;
                } else {
                    pointF.x = bounds.right - fTaDO7ogis3aEiWEtq;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = ji7hcoeneno1mylq3mn8d.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                Paint.FontMetrics fontMetrics = this.BDoqAMf0rlMRAnVghjC4qjG;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.wRCD0SdqWCowdYU7bmzN != null) {
                float fTaDO7ogis3aEiWEtq2 = TaDO7ogis3aEiWEtq() + this.mhUCRR8ceqc7mAozW + this.ubNpdCC1pl7L;
                float fIrh5auREsoeV1C1RaBamlmy = Irh5auREsoeV1C1RaBamlmy() + this.tpEo0fy9FaoJYrSFHRfIK6 + this.wR7sbzHKf9hYV1lxoS6nqyszepWvN;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fTaDO7ogis3aEiWEtq2;
                    rectF.right = bounds.right - fIrh5auREsoeV1C1RaBamlmy;
                } else {
                    rectF.left = bounds.left + fIrh5auREsoeV1C1RaBamlmy;
                    rectF.right = bounds.right - fTaDO7ogis3aEiWEtq2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            GXZVLd372jtPv6 gXZVLd372jtPv6 = ji7hcoeneno1mylq3mn8d.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            TextPaint textPaint2 = ji7hcoeneno1mylq3mn8d.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (gXZVLd372jtPv6 != null) {
                textPaint2.drawableState = getState();
                ji7hcoeneno1mylq3mn8d.zIvmSL0wzmmKGc3X39b2Gw2mUGE.ZfQNn8hdWlEQ5cR94249PDsLR(this.e1gEV3X9xwmHj, textPaint2, ji7hcoeneno1mylq3mn8d.zzpBGItXfub0yWj);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(ji7hcoeneno1mylq3mn8d.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.wRCD0SdqWCowdYU7bmzN.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.wRCD0SdqWCowdYU7bmzN;
            if (z2 && this.MnclyDIMxkCs4NkUREm != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.MnclyDIMxkCs4NkUREm);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
            rectF.setEmpty();
            if (GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
                float f10 = this.tpEo0fy9FaoJYrSFHRfIK6 + this.ByTQIhgl7ezGvHXEd;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.zOk739gUM7zIZC25HHUxoiyixWFjn;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.zOk739gUM7zIZC25HHUxoiyixWFjn;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
                float f14 = fExactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.vXWl0o6I4U59CgHs9.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.wdI7vzA3Qmcwd.setBounds(this.vXWl0o6I4U59CgHs9.getBounds());
            this.wdI7vzA3Qmcwd.jumpToCurrentState();
            this.wdI7vzA3Qmcwd.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.Hf6zp5JYLjGyFD2HXbpHA9 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    public final void f6ZQsR6bPLvvCDNXOUc(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.vXWl0o6I4U59CgHs9) {
            if (drawable.isStateful()) {
                drawable.setState(this.SdPSMGy13dYOH9CwolJVKu21val);
            }
            drawable.setTintList(this.KYZ9RyuOc42A2J);
            return;
        }
        Drawable drawable2 = this.L8DMw02rUTs2w;
        if (drawable == drawable2 && this.ItrQwCXbty5PZtje5JS) {
            drawable2.setTintList(this.lQ0rO9lhQIyVe7Rp6);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void gBaBUmihn5l4u(float f) {
        if (this.HAPpjhiCsV9ONY23505HCBI9IX != f) {
            this.HAPpjhiCsV9ONY23505HCBI9IX = f;
            invalidateSelf();
            if (GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
                qNPQb1obP7();
            }
        }
    }

    @Override // com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.Hf6zp5JYLjGyFD2HXbpHA9;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.pCrI77IVeIpJnmCUHd;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.TqcnImqkSWIKht;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(Irh5auREsoeV1C1RaBamlmy() + this.r0dB0ojIy6g8mnk1.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.wRCD0SdqWCowdYU7bmzN.toString()) + TaDO7ogis3aEiWEtq() + this.mhUCRR8ceqc7mAozW + this.ubNpdCC1pl7L + this.wR7sbzHKf9hYV1lxoS6nqyszepWvN + this.tpEo0fy9FaoJYrSFHRfIK6), this.w45GC0xYcf4u8gmC);
    }

    @Override // com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.u04PSKYidgCYrHk5CAtyMkPOXcY) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.TqcnImqkSWIKht, this.d9zDyyznnp3oaDT1Ug);
        } else {
            outline.setRoundRect(bounds, this.d9zDyyznnp3oaDT1Ug);
            outline2 = outline;
        }
        outline2.setAlpha(this.Hf6zp5JYLjGyFD2HXbpHA9 / 255.0f);
    }

    public final void hKs1wlZyvtUNaW1f5ABIGacfPcvX(float f) {
        if (this.rE05n5RsRkyWKIeA9cmLXAKv4Hze != f) {
            float fTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
            this.rE05n5RsRkyWKIeA9cmLXAKv4Hze = f;
            float fTaDO7ogis3aEiWEtq2 = TaDO7ogis3aEiWEtq();
            invalidateSelf();
            if (fTaDO7ogis3aEiWEtq != fTaDO7ogis3aEiWEtq2) {
                qNPQb1obP7();
            }
        }
    }

    public final void iKANjmyTSxO6v6UuLPdu7DxOjlS(ColorStateList colorStateList) {
        this.ItrQwCXbty5PZtje5JS = true;
        if (this.lQ0rO9lhQIyVe7Rp6 != colorStateList) {
            this.lQ0rO9lhQIyVe7Rp6 = colorStateList;
            if (zOk739gUM7zIZC25HHUxoiyixWFjn()) {
                this.L8DMw02rUTs2w.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (w0Wu95l8dVNw5rZMRu(this.qygqjTppWwx992) || w0Wu95l8dVNw5rZMRu(this.iKANjmyTSxO6v6UuLPdu7DxOjlS) || w0Wu95l8dVNw5rZMRu(this.CixTK5ZX8oWXHz34qHYV)) {
            return true;
        }
        GXZVLd372jtPv6 gXZVLd372jtPv6 = this.r0dB0ojIy6g8mnk1.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (gXZVLd372jtPv6 == null || (colorStateList = gXZVLd372jtPv6.HzCpKshMOoaw76hFcbOVRYMeRd) == null || !colorStateList.isStateful()) {
            return (this.H2VFYNJEVGAX && this.Z1FjjMJ0suz8AFI7gsA4GDLMXv != null && this.rERAmyEtGV6ANGszuKcQI) || RhfGHxtXxy0M0grmp2jkRjQg(this.L8DMw02rUTs2w) || RhfGHxtXxy0M0grmp2jkRjQg(this.Z1FjjMJ0suz8AFI7gsA4GDLMXv) || w0Wu95l8dVNw5rZMRu(this.QwZcr6V7mfRUaij0Bp3zpr5ClBcxr);
        }
        return true;
    }

    public final void lQ0rO9lhQIyVe7Rp6(ColorStateList colorStateList) {
        if (this.KYZ9RyuOc42A2J != colorStateList) {
            this.KYZ9RyuOc42A2J = colorStateList;
            if (GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
                this.vXWl0o6I4U59CgHs9.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (zOk739gUM7zIZC25HHUxoiyixWFjn()) {
            zOnLayoutDirectionChanged |= this.L8DMw02rUTs2w.setLayoutDirection(i);
        }
        if (KYZ9RyuOc42A2J()) {
            zOnLayoutDirectionChanged |= this.Z1FjjMJ0suz8AFI7gsA4GDLMXv.setLayoutDirection(i);
        }
        if (GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
            zOnLayoutDirectionChanged |= this.vXWl0o6I4U59CgHs9.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (zOk739gUM7zIZC25HHUxoiyixWFjn()) {
            zOnLevelChange |= this.L8DMw02rUTs2w.setLevel(i);
        }
        if (KYZ9RyuOc42A2J()) {
            zOnLevelChange |= this.Z1FjjMJ0suz8AFI7gsA4GDLMXv.setLevel(i);
        }
        if (GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
            zOnLevelChange |= this.vXWl0o6I4U59CgHs9.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.u04PSKYidgCYrHk5CAtyMkPOXcY) {
            super.onStateChange(iArr);
        }
        return SuB3hEmTmbbRGAhtvOOmfKEon(iArr, this.SdPSMGy13dYOH9CwolJVKu21val);
    }

    public final void pzqP2AqKW6J5PO8zCKnW(boolean z) {
        if (this.rERAmyEtGV6ANGszuKcQI != z) {
            this.rERAmyEtGV6ANGszuKcQI = z;
            float fTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
            if (!z && this.PfK8qHOJoCLG) {
                this.PfK8qHOJoCLG = false;
            }
            float fTaDO7ogis3aEiWEtq2 = TaDO7ogis3aEiWEtq();
            invalidateSelf();
            if (fTaDO7ogis3aEiWEtq != fTaDO7ogis3aEiWEtq2) {
                qNPQb1obP7();
            }
        }
    }

    public final float q11o1hieEkZDhF1MGOZI26oZiDT() {
        if (!this.u04PSKYidgCYrHk5CAtyMkPOXcY) {
            return this.d9zDyyznnp3oaDT1Ug;
        }
        float[] fArr = this.aXO0LSrt8bKV;
        return fArr != null ? fArr[3] : this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(ZLZeBXTMq0zDztBxtRTuCHrapQ());
    }

    public final void qNPQb1obP7() {
        OCSrCLuM8BRmWzDT5ywLgVbh6OiHg oCSrCLuM8BRmWzDT5ywLgVbh6OiHg = (OCSrCLuM8BRmWzDT5ywLgVbh6OiHg) this.tf2p6GzNN7uQY7Lun0pJ.get();
        if (oCSrCLuM8BRmWzDT5ywLgVbh6OiHg != null) {
            Chip chip = (Chip) oCSrCLuM8BRmWzDT5ywLgVbh6OiHg;
            chip.zzpBGItXfub0yWj(chip.ko09zE6UAgwkV);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final void qygqjTppWwx992(float f) {
        if (this.JUdwvN8LfOMa != f) {
            float fTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
            this.JUdwvN8LfOMa = f;
            float fTaDO7ogis3aEiWEtq2 = TaDO7ogis3aEiWEtq();
            invalidateSelf();
            if (fTaDO7ogis3aEiWEtq != fTaDO7ogis3aEiWEtq2) {
                qNPQb1obP7();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.Hf6zp5JYLjGyFD2HXbpHA9 != i) {
            this.Hf6zp5JYLjGyFD2HXbpHA9 = i;
            invalidateSelf();
        }
    }

    @Override // com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.pCrI77IVeIpJnmCUHd != colorFilter) {
            this.pCrI77IVeIpJnmCUHd = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.QwZcr6V7mfRUaij0Bp3zpr5ClBcxr != colorStateList) {
            this.QwZcr6V7mfRUaij0Bp3zpr5ClBcxr = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.uQ30BFNHbnwcS96Dk6jHUECPfOq != mode) {
            this.uQ30BFNHbnwcS96Dk6jHUECPfOq = mode;
            ColorStateList colorStateList = this.QwZcr6V7mfRUaij0Bp3zpr5ClBcxr;
            this.N08cqkgagFuPYWJcTFAQVt = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (zOk739gUM7zIZC25HHUxoiyixWFjn()) {
            visible |= this.L8DMw02rUTs2w.setVisible(z, z2);
        }
        if (KYZ9RyuOc42A2J()) {
            visible |= this.Z1FjjMJ0suz8AFI7gsA4GDLMXv.setVisible(z, z2);
        }
        if (GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
            visible |= this.vXWl0o6I4U59CgHs9.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void vBGA6pPLqSMuYGvprl270j7(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (zOk739gUM7zIZC25HHUxoiyixWFjn() || KYZ9RyuOc42A2J()) {
            float f = this.mhUCRR8ceqc7mAozW + this.rE05n5RsRkyWKIeA9cmLXAKv4Hze;
            Drawable drawable = this.PfK8qHOJoCLG ? this.Z1FjjMJ0suz8AFI7gsA4GDLMXv : this.L8DMw02rUTs2w;
            float intrinsicWidth = this.JUdwvN8LfOMa;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.PfK8qHOJoCLG ? this.Z1FjjMJ0suz8AFI7gsA4GDLMXv : this.L8DMw02rUTs2w;
            float fCeil = this.JUdwvN8LfOMa;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.e1gEV3X9xwmHj.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final void vE4yDIjexsP2lGjLaTcB(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.bjhcQ0u7VT2OYYrwk96HrWoN != colorStateList) {
            this.bjhcQ0u7VT2OYYrwk96HrWoN = colorStateList;
            if (this.H2VFYNJEVGAX && (drawable = this.Z1FjjMJ0suz8AFI7gsA4GDLMXv) != null && this.rERAmyEtGV6ANGszuKcQI) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void vXWl0o6I4U59CgHs9(ColorStateList colorStateList) {
        if (this.YdNRGRc4rly != colorStateList) {
            this.YdNRGRc4rly = colorStateList;
            this.VAUpruoPNdSAVh = null;
            onStateChange(getState());
        }
    }

    public final void wRCD0SdqWCowdYU7bmzN(float f) {
        if (this.zOk739gUM7zIZC25HHUxoiyixWFjn != f) {
            this.zOk739gUM7zIZC25HHUxoiyixWFjn = f;
            invalidateSelf();
            if (GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
                qNPQb1obP7();
            }
        }
    }

    public final void wdI7vzA3Qmcwd(GXZVLd372jtPv6 gXZVLd372jtPv6) {
        ji7HCOeNEno1mYLq3Mn8d ji7hcoeneno1mylq3mn8d = this.r0dB0ojIy6g8mnk1;
        r3Z3A1GlT1xNo r3z3a1glt1xno = ji7hcoeneno1mylq3mn8d.zzpBGItXfub0yWj;
        TextPaint textPaint = ji7hcoeneno1mylq3mn8d.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (ji7hcoeneno1mylq3mn8d.zIvmSL0wzmmKGc3X39b2Gw2mUGE != gXZVLd372jtPv6) {
            ji7hcoeneno1mylq3mn8d.zIvmSL0wzmmKGc3X39b2Gw2mUGE = gXZVLd372jtPv6;
            if (gXZVLd372jtPv6 != null) {
                Context context = this.e1gEV3X9xwmHj;
                gXZVLd372jtPv6.LaeGQIruHQu81hfJldjMOQSVblH3x(context, textPaint, r3z3a1glt1xno);
                AaHasH8flkLZBQQsSHyz0SQoWxm aaHasH8flkLZBQQsSHyz0SQoWxm = (AaHasH8flkLZBQQsSHyz0SQoWxm) ji7hcoeneno1mylq3mn8d.LaeGQIruHQu81hfJldjMOQSVblH3x.get();
                if (aaHasH8flkLZBQQsSHyz0SQoWxm != null) {
                    textPaint.drawableState = aaHasH8flkLZBQQsSHyz0SQoWxm.getState();
                }
                gXZVLd372jtPv6.ZfQNn8hdWlEQ5cR94249PDsLR(context, textPaint, r3z3a1glt1xno);
                ji7hcoeneno1mylq3mn8d.ZfQNn8hdWlEQ5cR94249PDsLR = true;
            }
            AaHasH8flkLZBQQsSHyz0SQoWxm aaHasH8flkLZBQQsSHyz0SQoWxm2 = (AaHasH8flkLZBQQsSHyz0SQoWxm) ji7hcoeneno1mylq3mn8d.LaeGQIruHQu81hfJldjMOQSVblH3x.get();
            if (aaHasH8flkLZBQQsSHyz0SQoWxm2 != null) {
                avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = (avPAxXGaxsbfwFXxj) aaHasH8flkLZBQQsSHyz0SQoWxm2;
                avpaxxgaxsbfwfxxj.qNPQb1obP7();
                avpaxxgaxsbfwfxxj.invalidateSelf();
                avpaxxgaxsbfwfxxj.onStateChange(aaHasH8flkLZBQQsSHyz0SQoWxm2.getState());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void y1NaPKTl7R18DOr6e8i5(Drawable drawable) {
        ?? r0;
        Object obj = this.L8DMw02rUTs2w;
        if (obj != null) {
            boolean z = obj instanceof pDEkAB1gLwlZIS;
            r0 = obj;
            if (z) {
                r0 = 0;
            }
        } else {
            r0 = 0;
        }
        if (r0 != drawable) {
            float fTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
            this.L8DMw02rUTs2w = drawable != null ? drawable.mutate() : null;
            float fTaDO7ogis3aEiWEtq2 = TaDO7ogis3aEiWEtq();
            rERAmyEtGV6ANGszuKcQI(r0);
            if (zOk739gUM7zIZC25HHUxoiyixWFjn()) {
                f6ZQsR6bPLvvCDNXOUc(this.L8DMw02rUTs2w);
            }
            invalidateSelf();
            if (fTaDO7ogis3aEiWEtq != fTaDO7ogis3aEiWEtq2) {
                qNPQb1obP7();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void ymT6yQrus3w(Drawable drawable) {
        ?? r0;
        Object obj = this.vXWl0o6I4U59CgHs9;
        if (obj != null) {
            boolean z = obj instanceof pDEkAB1gLwlZIS;
            r0 = obj;
            if (z) {
                r0 = 0;
            }
        } else {
            r0 = 0;
        }
        if (r0 != drawable) {
            float fIrh5auREsoeV1C1RaBamlmy = Irh5auREsoeV1C1RaBamlmy();
            this.vXWl0o6I4U59CgHs9 = drawable != null ? drawable.mutate() : null;
            this.wdI7vzA3Qmcwd = new RippleDrawable(kuNd5HLEtGyow6v2XZnS.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.YdNRGRc4rly), this.vXWl0o6I4U59CgHs9, W5cWMjmJv6kqhapkBbKZYxBWC2p);
            float fIrh5auREsoeV1C1RaBamlmy2 = Irh5auREsoeV1C1RaBamlmy();
            rERAmyEtGV6ANGszuKcQI(r0);
            if (GE1sqSYiEYQO2ew7WEZwTtUeS5()) {
                f6ZQsR6bPLvvCDNXOUc(this.vXWl0o6I4U59CgHs9);
            }
            invalidateSelf();
            if (fIrh5auREsoeV1C1RaBamlmy != fIrh5auREsoeV1C1RaBamlmy2) {
                qNPQb1obP7();
            }
        }
    }

    public final boolean zOk739gUM7zIZC25HHUxoiyixWFjn() {
        return this.gBaBUmihn5l4u && this.L8DMw02rUTs2w != null;
    }
}
