package com.vdodsodjsdt;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class z8EoQ1MhPC1NSqsZjhrc extends OsPwQ64hJydE8PLvXR7MHKd {
    public static final PorterDuff.Mode KUYypEB4eNWOZWVDpH = PorterDuff.Mode.SRC_IN;
    public final float[] GI83zq0G8e7zkn;
    public final Rect HzCpKshMOoaw76hFcbOVRYMeRd;
    public PorterDuffColorFilter LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Matrix M9e7PWhFYLD2lOGMker;
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public a2HfRJfwuPIdSI504891gm3zXOE ZfQNn8hdWlEQ5cR94249PDsLR;
    public ColorFilter zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public z8EoQ1MhPC1NSqsZjhrc() {
        this.NSjgqmGjEzuugn2SsG1mZFP = true;
        this.GI83zq0G8e7zkn = new float[9];
        this.M9e7PWhFYLD2lOGMker = new Matrix();
        this.HzCpKshMOoaw76hFcbOVRYMeRd = new Rect();
        a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe = new a2HfRJfwuPIdSI504891gm3zXOE();
        a2hfrjfwupidsi504891gm3zxoe.V57tEvNfxZVVcOCAOih5PKr = null;
        a2hfrjfwupidsi504891gm3zxoe.ZfQNn8hdWlEQ5cR94249PDsLR = KUYypEB4eNWOZWVDpH;
        a2hfrjfwupidsi504891gm3zxoe.zzpBGItXfub0yWj = new PbjARyxARdIwoI();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = a2hfrjfwupidsi504891gm3zxoe;
    }

    public final PorterDuffColorFilter VxUQ9tBhpHJ2AAEDNW8sghc4m(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (colorFilter == null) {
            colorFilter = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        Matrix matrix = this.M9e7PWhFYLD2lOGMker;
        canvas.getMatrix(matrix);
        float[] fArr = this.GI83zq0G8e7zkn;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Bitmap bitmap = a2hfrjfwupidsi504891gm3zxoe.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != a2hfrjfwupidsi504891gm3zxoe.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getHeight()) {
            a2hfrjfwupidsi504891gm3zxoe.zIvmSL0wzmmKGc3X39b2Gw2mUGE = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            a2hfrjfwupidsi504891gm3zxoe.HzCpKshMOoaw76hFcbOVRYMeRd = true;
        }
        if (this.NSjgqmGjEzuugn2SsG1mZFP) {
            a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (a2hfrjfwupidsi504891gm3zxoe2.HzCpKshMOoaw76hFcbOVRYMeRd || a2hfrjfwupidsi504891gm3zxoe2.ZLZeBXTMq0zDztBxtRTuCHrapQ != a2hfrjfwupidsi504891gm3zxoe2.V57tEvNfxZVVcOCAOih5PKr || a2hfrjfwupidsi504891gm3zxoe2.NSjgqmGjEzuugn2SsG1mZFP != a2hfrjfwupidsi504891gm3zxoe2.ZfQNn8hdWlEQ5cR94249PDsLR || a2hfrjfwupidsi504891gm3zxoe2.M9e7PWhFYLD2lOGMker != a2hfrjfwupidsi504891gm3zxoe2.LaeGQIruHQu81hfJldjMOQSVblH3x || a2hfrjfwupidsi504891gm3zxoe2.GI83zq0G8e7zkn != a2hfrjfwupidsi504891gm3zxoe2.zzpBGItXfub0yWj.getRootAlpha()) {
                a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                a2hfrjfwupidsi504891gm3zxoe3.zIvmSL0wzmmKGc3X39b2Gw2mUGE.eraseColor(0);
                Canvas canvas2 = new Canvas(a2hfrjfwupidsi504891gm3zxoe3.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                PbjARyxARdIwoI pbjARyxARdIwoI = a2hfrjfwupidsi504891gm3zxoe3.zzpBGItXfub0yWj;
                pbjARyxARdIwoI.VxUQ9tBhpHJ2AAEDNW8sghc4m(pbjARyxARdIwoI.ZLZeBXTMq0zDztBxtRTuCHrapQ, PbjARyxARdIwoI.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, canvas2, iMin, iMin2);
                a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                a2hfrjfwupidsi504891gm3zxoe4.ZLZeBXTMq0zDztBxtRTuCHrapQ = a2hfrjfwupidsi504891gm3zxoe4.V57tEvNfxZVVcOCAOih5PKr;
                a2hfrjfwupidsi504891gm3zxoe4.NSjgqmGjEzuugn2SsG1mZFP = a2hfrjfwupidsi504891gm3zxoe4.ZfQNn8hdWlEQ5cR94249PDsLR;
                a2hfrjfwupidsi504891gm3zxoe4.GI83zq0G8e7zkn = a2hfrjfwupidsi504891gm3zxoe4.zzpBGItXfub0yWj.getRootAlpha();
                a2hfrjfwupidsi504891gm3zxoe4.M9e7PWhFYLD2lOGMker = a2hfrjfwupidsi504891gm3zxoe4.LaeGQIruHQu81hfJldjMOQSVblH3x;
                a2hfrjfwupidsi504891gm3zxoe4.HzCpKshMOoaw76hFcbOVRYMeRd = false;
            }
        } else {
            a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe5 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            a2hfrjfwupidsi504891gm3zxoe5.zIvmSL0wzmmKGc3X39b2Gw2mUGE.eraseColor(0);
            Canvas canvas3 = new Canvas(a2hfrjfwupidsi504891gm3zxoe5.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
            PbjARyxARdIwoI pbjARyxARdIwoI2 = a2hfrjfwupidsi504891gm3zxoe5.zzpBGItXfub0yWj;
            pbjARyxARdIwoI2.VxUQ9tBhpHJ2AAEDNW8sghc4m(pbjARyxARdIwoI2.ZLZeBXTMq0zDztBxtRTuCHrapQ, PbjARyxARdIwoI.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, canvas3, iMin, iMin2);
        }
        a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe6 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (a2hfrjfwupidsi504891gm3zxoe6.zzpBGItXfub0yWj.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (a2hfrjfwupidsi504891gm3zxoe6.KUYypEB4eNWOZWVDpH == null) {
                Paint paint2 = new Paint();
                a2hfrjfwupidsi504891gm3zxoe6.KUYypEB4eNWOZWVDpH = paint2;
                paint2.setFilterBitmap(true);
            }
            a2hfrjfwupidsi504891gm3zxoe6.KUYypEB4eNWOZWVDpH.setAlpha(a2hfrjfwupidsi504891gm3zxoe6.zzpBGItXfub0yWj.getRootAlpha());
            a2hfrjfwupidsi504891gm3zxoe6.KUYypEB4eNWOZWVDpH.setColorFilter(colorFilter);
            paint = a2hfrjfwupidsi504891gm3zxoe6.KUYypEB4eNWOZWVDpH;
        }
        canvas.drawBitmap(a2hfrjfwupidsi504891gm3zxoe6.zIvmSL0wzmmKGc3X39b2Gw2mUGE, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.getAlpha() : this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.ZfQNn8hdWlEQ5cR94249PDsLR.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.getColorFilter() : this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.V57tEvNfxZVVcOCAOih5PKr != null) {
            return new d5LHQE9iP2XLBrvDAOHsjeUM3(this.V57tEvNfxZVVcOCAOih5PKr.getConstantState());
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m = getChangingConfigurations();
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj.GI83zq0G8e7zkn;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.isAutoMirrored() : this.ZfQNn8hdWlEQ5cR94249PDsLR.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (a2hfrjfwupidsi504891gm3zxoe == null) {
            return false;
        }
        PbjARyxARdIwoI pbjARyxARdIwoI = a2hfrjfwupidsi504891gm3zxoe.zzpBGItXfub0yWj;
        if (pbjARyxARdIwoI.p59rPv72J9 == null) {
            pbjARyxARdIwoI.p59rPv72J9 = Boolean.valueOf(pbjARyxARdIwoI.ZLZeBXTMq0zDztBxtRTuCHrapQ.VxUQ9tBhpHJ2AAEDNW8sghc4m());
        }
        if (pbjARyxARdIwoI.p59rPv72J9.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.ZLZeBXTMq0zDztBxtRTuCHrapQ && super.mutate() == this) {
            a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe2 = new a2HfRJfwuPIdSI504891gm3zXOE();
            a2hfrjfwupidsi504891gm3zxoe2.V57tEvNfxZVVcOCAOih5PKr = null;
            a2hfrjfwupidsi504891gm3zxoe2.ZfQNn8hdWlEQ5cR94249PDsLR = KUYypEB4eNWOZWVDpH;
            if (a2hfrjfwupidsi504891gm3zxoe != null) {
                a2hfrjfwupidsi504891gm3zxoe2.VxUQ9tBhpHJ2AAEDNW8sghc4m = a2hfrjfwupidsi504891gm3zxoe.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                PbjARyxARdIwoI pbjARyxARdIwoI = new PbjARyxARdIwoI(a2hfrjfwupidsi504891gm3zxoe.zzpBGItXfub0yWj);
                a2hfrjfwupidsi504891gm3zxoe2.zzpBGItXfub0yWj = pbjARyxARdIwoI;
                if (a2hfrjfwupidsi504891gm3zxoe.zzpBGItXfub0yWj.LaeGQIruHQu81hfJldjMOQSVblH3x != null) {
                    pbjARyxARdIwoI.LaeGQIruHQu81hfJldjMOQSVblH3x = new Paint(a2hfrjfwupidsi504891gm3zxoe.zzpBGItXfub0yWj.LaeGQIruHQu81hfJldjMOQSVblH3x);
                }
                if (a2hfrjfwupidsi504891gm3zxoe.zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR != null) {
                    a2hfrjfwupidsi504891gm3zxoe2.zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR = new Paint(a2hfrjfwupidsi504891gm3zxoe.zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR);
                }
                a2hfrjfwupidsi504891gm3zxoe2.V57tEvNfxZVVcOCAOih5PKr = a2hfrjfwupidsi504891gm3zxoe.V57tEvNfxZVVcOCAOih5PKr;
                a2hfrjfwupidsi504891gm3zxoe2.ZfQNn8hdWlEQ5cR94249PDsLR = a2hfrjfwupidsi504891gm3zxoe.ZfQNn8hdWlEQ5cR94249PDsLR;
                a2hfrjfwupidsi504891gm3zxoe2.LaeGQIruHQu81hfJldjMOQSVblH3x = a2hfrjfwupidsi504891gm3zxoe.LaeGQIruHQu81hfJldjMOQSVblH3x;
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR = a2hfrjfwupidsi504891gm3zxoe2;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ColorStateList colorStateList = a2hfrjfwupidsi504891gm3zxoe.V57tEvNfxZVVcOCAOih5PKr;
        if (colorStateList == null || (mode = a2hfrjfwupidsi504891gm3zxoe.ZfQNn8hdWlEQ5cR94249PDsLR) == null) {
            z = false;
        } else {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = VxUQ9tBhpHJ2AAEDNW8sghc4m(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        PbjARyxARdIwoI pbjARyxARdIwoI = a2hfrjfwupidsi504891gm3zxoe.zzpBGItXfub0yWj;
        if (pbjARyxARdIwoI.p59rPv72J9 == null) {
            pbjARyxARdIwoI.p59rPv72J9 = Boolean.valueOf(pbjARyxARdIwoI.ZLZeBXTMq0zDztBxtRTuCHrapQ.VxUQ9tBhpHJ2AAEDNW8sghc4m());
        }
        if (pbjARyxARdIwoI.p59rPv72J9.booleanValue()) {
            boolean zZzpBGItXfub0yWj = a2hfrjfwupidsi504891gm3zxoe.zzpBGItXfub0yWj.ZLZeBXTMq0zDztBxtRTuCHrapQ.zzpBGItXfub0yWj(iArr);
            a2hfrjfwupidsi504891gm3zxoe.HzCpKshMOoaw76hFcbOVRYMeRd |= zZzpBGItXfub0yWj;
            if (zZzpBGItXfub0yWj) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj.getRootAlpha() != i) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.LaeGQIruHQu81hfJldjMOQSVblH3x = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            zonOxHotd3BwAPJcwqr6I6uQNngg4.gBaBUmihn5l4u(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (a2hfrjfwupidsi504891gm3zxoe.V57tEvNfxZVVcOCAOih5PKr != colorStateList) {
            a2hfrjfwupidsi504891gm3zxoe.V57tEvNfxZVVcOCAOih5PKr = colorStateList;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = VxUQ9tBhpHJ2AAEDNW8sghc4m(colorStateList, a2hfrjfwupidsi504891gm3zxoe.ZfQNn8hdWlEQ5cR94249PDsLR);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (a2hfrjfwupidsi504891gm3zxoe.ZfQNn8hdWlEQ5cR94249PDsLR != mode) {
            a2hfrjfwupidsi504891gm3zxoe.ZfQNn8hdWlEQ5cR94249PDsLR = mode;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = VxUQ9tBhpHJ2AAEDNW8sghc4m(a2hfrjfwupidsi504891gm3zxoe.V57tEvNfxZVVcOCAOih5PKr, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c;
        int i2;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        a2hfrjfwupidsi504891gm3zxoe.zzpBGItXfub0yWj = new PbjARyxARdIwoI();
        TypedArray typedArrayTqcnImqkSWIKht = zonOxHotd3BwAPJcwqr6I6uQNngg4.TqcnImqkSWIKht(resources, theme, attributeSet, hRrPPME7ytOB7ba.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        PbjARyxARdIwoI pbjARyxARdIwoI = a2hfrjfwupidsi504891gm3zxoe2.zzpBGItXfub0yWj;
        int i3 = !zonOxHotd3BwAPJcwqr6I6uQNngg4.pzqP2AqKW6J5PO8zCKnW(xmlPullParser, "tintMode") ? -1 : typedArrayTqcnImqkSWIKht.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i3 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i3 != 5) {
            if (i3 != 9) {
                switch (i3) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        a2hfrjfwupidsi504891gm3zxoe2.ZfQNn8hdWlEQ5cR94249PDsLR = mode;
        ColorStateList colorStateListVxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        int i4 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayTqcnImqkSWIKht.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateListVxUQ9tBhpHJ2AAEDNW8sghc4m = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayTqcnImqkSWIKht.getResources();
                int resourceId = typedArrayTqcnImqkSWIKht.getResourceId(1, 0);
                ThreadLocal threadLocal = le0x3treps9yjYZ9hvxNbCrXl29i.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                try {
                    colorStateListVxUQ9tBhpHJ2AAEDNW8sghc4m = le0x3treps9yjYZ9hvxNbCrXl29i.VxUQ9tBhpHJ2AAEDNW8sghc4m(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListVxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (colorStateList != null) {
            a2hfrjfwupidsi504891gm3zxoe2.V57tEvNfxZVVcOCAOih5PKr = colorStateList;
        }
        boolean z = a2hfrjfwupidsi504891gm3zxoe2.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = typedArrayTqcnImqkSWIKht.getBoolean(5, z);
        }
        a2hfrjfwupidsi504891gm3zxoe2.LaeGQIruHQu81hfJldjMOQSVblH3x = z;
        float f = pbjARyxARdIwoI.M9e7PWhFYLD2lOGMker;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = typedArrayTqcnImqkSWIKht.getFloat(7, f);
        }
        pbjARyxARdIwoI.M9e7PWhFYLD2lOGMker = f;
        float f2 = pbjARyxARdIwoI.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = typedArrayTqcnImqkSWIKht.getFloat(8, f2);
        }
        pbjARyxARdIwoI.HzCpKshMOoaw76hFcbOVRYMeRd = f2;
        if (pbjARyxARdIwoI.M9e7PWhFYLD2lOGMker <= 0.0f) {
            throw new XmlPullParserException(typedArrayTqcnImqkSWIKht.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            pbjARyxARdIwoI.NSjgqmGjEzuugn2SsG1mZFP = typedArrayTqcnImqkSWIKht.getDimension(3, pbjARyxARdIwoI.NSjgqmGjEzuugn2SsG1mZFP);
            float dimension = typedArrayTqcnImqkSWIKht.getDimension(2, pbjARyxARdIwoI.GI83zq0G8e7zkn);
            pbjARyxARdIwoI.GI83zq0G8e7zkn = dimension;
            if (pbjARyxARdIwoI.NSjgqmGjEzuugn2SsG1mZFP <= 0.0f) {
                throw new XmlPullParserException(typedArrayTqcnImqkSWIKht.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = pbjARyxARdIwoI.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayTqcnImqkSWIKht.getFloat(4, alpha);
                }
                pbjARyxARdIwoI.setAlpha(alpha);
                String string = typedArrayTqcnImqkSWIKht.getString(0);
                if (string != null) {
                    pbjARyxARdIwoI.q1wNbhk2O6 = string;
                    pbjARyxARdIwoI.Ca81ebIan1u.put(string, pbjARyxARdIwoI);
                }
                typedArrayTqcnImqkSWIKht.recycle();
                a2hfrjfwupidsi504891gm3zxoe.VxUQ9tBhpHJ2AAEDNW8sghc4m = getChangingConfigurations();
                a2hfrjfwupidsi504891gm3zxoe.HzCpKshMOoaw76hFcbOVRYMeRd = true;
                a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                PbjARyxARdIwoI pbjARyxARdIwoI2 = a2hfrjfwupidsi504891gm3zxoe3.zzpBGItXfub0yWj;
                ArrayDeque arrayDeque = new ArrayDeque();
                xYz3m1dnq3cbKlXExPL22gclJkrjd xyz3m1dnq3cbklxexpl22gcljkrjd = pbjARyxARdIwoI2.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = pbjARyxARdIwoI2.Ca81ebIan1u;
                arrayDeque.push(xyz3m1dnq3cbklxexpl22gcljkrjd);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        xYz3m1dnq3cbKlXExPL22gclJkrjd xyz3m1dnq3cbklxexpl22gcljkrjd2 = (xYz3m1dnq3cbKlXExPL22gclJkrjd) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            QtoKMOQ86Bcawp0YPtt6VaR9oidpB qtoKMOQ86Bcawp0YPtt6VaR9oidpB = new QtoKMOQ86Bcawp0YPtt6VaR9oidpB();
                            qtoKMOQ86Bcawp0YPtt6VaR9oidpB.LaeGQIruHQu81hfJldjMOQSVblH3x = 0.0f;
                            qtoKMOQ86Bcawp0YPtt6VaR9oidpB.ZLZeBXTMq0zDztBxtRTuCHrapQ = 1.0f;
                            qtoKMOQ86Bcawp0YPtt6VaR9oidpB.NSjgqmGjEzuugn2SsG1mZFP = 1.0f;
                            qtoKMOQ86Bcawp0YPtt6VaR9oidpB.GI83zq0G8e7zkn = 0.0f;
                            qtoKMOQ86Bcawp0YPtt6VaR9oidpB.M9e7PWhFYLD2lOGMker = 1.0f;
                            qtoKMOQ86Bcawp0YPtt6VaR9oidpB.HzCpKshMOoaw76hFcbOVRYMeRd = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            qtoKMOQ86Bcawp0YPtt6VaR9oidpB.KUYypEB4eNWOZWVDpH = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            qtoKMOQ86Bcawp0YPtt6VaR9oidpB.q1wNbhk2O6 = join2;
                            qtoKMOQ86Bcawp0YPtt6VaR9oidpB.p59rPv72J9 = 4.0f;
                            TypedArray typedArrayTqcnImqkSWIKht2 = zonOxHotd3BwAPJcwqr6I6uQNngg4.TqcnImqkSWIKht(resources, theme, attributeSet, hRrPPME7ytOB7ba.V57tEvNfxZVVcOCAOih5PKr);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayTqcnImqkSWIKht2.getString(0);
                                if (string2 != null) {
                                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB.zzpBGItXfub0yWj = string2;
                                }
                                String string3 = typedArrayTqcnImqkSWIKht2.getString(2);
                                if (string3 != null) {
                                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB.VxUQ9tBhpHJ2AAEDNW8sghc4m = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ko09zE6UAgwkV(string3);
                                }
                                qtoKMOQ86Bcawp0YPtt6VaR9oidpB.zIvmSL0wzmmKGc3X39b2Gw2mUGE = zonOxHotd3BwAPJcwqr6I6uQNngg4.q11o1hieEkZDhF1MGOZI26oZiDT(typedArrayTqcnImqkSWIKht2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.NSjgqmGjEzuugn2SsG1mZFP;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f3 = typedArrayTqcnImqkSWIKht2.getFloat(12, f3);
                                }
                                qtoKMOQ86Bcawp0YPtt6VaR9oidpB.NSjgqmGjEzuugn2SsG1mZFP = f3;
                                int i6 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayTqcnImqkSWIKht2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.KUYypEB4eNWOZWVDpH;
                                if (i6 == 0) {
                                    cap = cap2;
                                } else if (i6 != 1) {
                                    cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                qtoKMOQ86Bcawp0YPtt6VaR9oidpB.KUYypEB4eNWOZWVDpH = cap;
                                int i7 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayTqcnImqkSWIKht2.getInt(9, -1) : -1;
                                Paint.Join join3 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.q1wNbhk2O6;
                                if (i7 == 0) {
                                    join = join2;
                                } else if (i7 != 1) {
                                    join = i7 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                qtoKMOQ86Bcawp0YPtt6VaR9oidpB.q1wNbhk2O6 = join;
                                float f4 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.p59rPv72J9;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f4 = typedArrayTqcnImqkSWIKht2.getFloat(10, f4);
                                }
                                qtoKMOQ86Bcawp0YPtt6VaR9oidpB.p59rPv72J9 = f4;
                                qtoKMOQ86Bcawp0YPtt6VaR9oidpB.ZfQNn8hdWlEQ5cR94249PDsLR = zonOxHotd3BwAPJcwqr6I6uQNngg4.q11o1hieEkZDhF1MGOZI26oZiDT(typedArrayTqcnImqkSWIKht2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f5 = typedArrayTqcnImqkSWIKht2.getFloat(11, f5);
                                }
                                qtoKMOQ86Bcawp0YPtt6VaR9oidpB.ZLZeBXTMq0zDztBxtRTuCHrapQ = f5;
                                float f6 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.LaeGQIruHQu81hfJldjMOQSVblH3x;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f6 = typedArrayTqcnImqkSWIKht2.getFloat(4, f6);
                                }
                                qtoKMOQ86Bcawp0YPtt6VaR9oidpB.LaeGQIruHQu81hfJldjMOQSVblH3x = f6;
                                float f7 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.M9e7PWhFYLD2lOGMker;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f7 = typedArrayTqcnImqkSWIKht2.getFloat(6, f7);
                                }
                                qtoKMOQ86Bcawp0YPtt6VaR9oidpB.M9e7PWhFYLD2lOGMker = f7;
                                float f8 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.HzCpKshMOoaw76hFcbOVRYMeRd;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f8 = typedArrayTqcnImqkSWIKht2.getFloat(7, f8);
                                }
                                qtoKMOQ86Bcawp0YPtt6VaR9oidpB.HzCpKshMOoaw76hFcbOVRYMeRd = f8;
                                float f9 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.GI83zq0G8e7zkn;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f9 = typedArrayTqcnImqkSWIKht2.getFloat(5, f9);
                                }
                                qtoKMOQ86Bcawp0YPtt6VaR9oidpB.GI83zq0G8e7zkn = f9;
                                int i8 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.V57tEvNfxZVVcOCAOih5PKr;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i8 = typedArrayTqcnImqkSWIKht2.getInt(13, i8);
                                }
                                qtoKMOQ86Bcawp0YPtt6VaR9oidpB.V57tEvNfxZVVcOCAOih5PKr = i8;
                            }
                            typedArrayTqcnImqkSWIKht2.recycle();
                            xyz3m1dnq3cbklxexpl22gcljkrjd2.zzpBGItXfub0yWj.add(qtoKMOQ86Bcawp0YPtt6VaR9oidpB);
                            if (qtoKMOQ86Bcawp0YPtt6VaR9oidpB.getPathName() != null) {
                                qkxcijm1cknm0a1ravamobovlgp.put(qtoKMOQ86Bcawp0YPtt6VaR9oidpB.getPathName(), qtoKMOQ86Bcawp0YPtt6VaR9oidpB);
                            }
                            a2hfrjfwupidsi504891gm3zxoe3.VxUQ9tBhpHJ2AAEDNW8sghc4m = a2hfrjfwupidsi504891gm3zxoe3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                            z2 = false;
                            c = '\b';
                        } else {
                            c = '\b';
                            if ("clip-path".equals(name)) {
                                G7gq4oPCUZ1wY g7gq4oPCUZ1wY = new G7gq4oPCUZ1wY();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayTqcnImqkSWIKht3 = zonOxHotd3BwAPJcwqr6I6uQNngg4.TqcnImqkSWIKht(resources, theme, attributeSet, hRrPPME7ytOB7ba.ZfQNn8hdWlEQ5cR94249PDsLR);
                                    String string4 = typedArrayTqcnImqkSWIKht3.getString(0);
                                    if (string4 != null) {
                                        g7gq4oPCUZ1wY.zzpBGItXfub0yWj = string4;
                                    }
                                    String string5 = typedArrayTqcnImqkSWIKht3.getString(1);
                                    if (string5 != null) {
                                        g7gq4oPCUZ1wY.VxUQ9tBhpHJ2AAEDNW8sghc4m = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ko09zE6UAgwkV(string5);
                                    }
                                    g7gq4oPCUZ1wY.V57tEvNfxZVVcOCAOih5PKr = !zonOxHotd3BwAPJcwqr6I6uQNngg4.pzqP2AqKW6J5PO8zCKnW(xmlPullParser, "fillType") ? 0 : typedArrayTqcnImqkSWIKht3.getInt(2, 0);
                                    typedArrayTqcnImqkSWIKht3.recycle();
                                }
                                xyz3m1dnq3cbklxexpl22gcljkrjd2.zzpBGItXfub0yWj.add(g7gq4oPCUZ1wY);
                                if (g7gq4oPCUZ1wY.getPathName() != null) {
                                    qkxcijm1cknm0a1ravamobovlgp.put(g7gq4oPCUZ1wY.getPathName(), g7gq4oPCUZ1wY);
                                }
                                a2hfrjfwupidsi504891gm3zxoe3.VxUQ9tBhpHJ2AAEDNW8sghc4m = a2hfrjfwupidsi504891gm3zxoe3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                            } else if ("group".equals(name)) {
                                xYz3m1dnq3cbKlXExPL22gclJkrjd xyz3m1dnq3cbklxexpl22gcljkrjd3 = new xYz3m1dnq3cbKlXExPL22gclJkrjd();
                                TypedArray typedArrayTqcnImqkSWIKht4 = zonOxHotd3BwAPJcwqr6I6uQNngg4.TqcnImqkSWIKht(resources, theme, attributeSet, hRrPPME7ytOB7ba.zzpBGItXfub0yWj);
                                float f10 = xyz3m1dnq3cbklxexpl22gcljkrjd3.V57tEvNfxZVVcOCAOih5PKr;
                                if (zonOxHotd3BwAPJcwqr6I6uQNngg4.pzqP2AqKW6J5PO8zCKnW(xmlPullParser, "rotation")) {
                                    f10 = typedArrayTqcnImqkSWIKht4.getFloat(5, f10);
                                }
                                xyz3m1dnq3cbklxexpl22gcljkrjd3.V57tEvNfxZVVcOCAOih5PKr = f10;
                                xyz3m1dnq3cbklxexpl22gcljkrjd3.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayTqcnImqkSWIKht4.getFloat(1, xyz3m1dnq3cbklxexpl22gcljkrjd3.ZfQNn8hdWlEQ5cR94249PDsLR);
                                xyz3m1dnq3cbklxexpl22gcljkrjd3.LaeGQIruHQu81hfJldjMOQSVblH3x = typedArrayTqcnImqkSWIKht4.getFloat(2, xyz3m1dnq3cbklxexpl22gcljkrjd3.LaeGQIruHQu81hfJldjMOQSVblH3x);
                                float f11 = xyz3m1dnq3cbklxexpl22gcljkrjd3.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f11 = typedArrayTqcnImqkSWIKht4.getFloat(3, f11);
                                }
                                xyz3m1dnq3cbklxexpl22gcljkrjd3.zIvmSL0wzmmKGc3X39b2Gw2mUGE = f11;
                                float f12 = xyz3m1dnq3cbklxexpl22gcljkrjd3.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f12 = typedArrayTqcnImqkSWIKht4.getFloat(4, f12);
                                }
                                xyz3m1dnq3cbklxexpl22gcljkrjd3.ZLZeBXTMq0zDztBxtRTuCHrapQ = f12;
                                float f13 = xyz3m1dnq3cbklxexpl22gcljkrjd3.NSjgqmGjEzuugn2SsG1mZFP;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f13 = typedArrayTqcnImqkSWIKht4.getFloat(6, f13);
                                }
                                xyz3m1dnq3cbklxexpl22gcljkrjd3.NSjgqmGjEzuugn2SsG1mZFP = f13;
                                float f14 = xyz3m1dnq3cbklxexpl22gcljkrjd3.GI83zq0G8e7zkn;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f14 = typedArrayTqcnImqkSWIKht4.getFloat(7, f14);
                                }
                                xyz3m1dnq3cbklxexpl22gcljkrjd3.GI83zq0G8e7zkn = f14;
                                String string6 = typedArrayTqcnImqkSWIKht4.getString(0);
                                if (string6 != null) {
                                    xyz3m1dnq3cbklxexpl22gcljkrjd3.HzCpKshMOoaw76hFcbOVRYMeRd = string6;
                                }
                                xyz3m1dnq3cbklxexpl22gcljkrjd3.V57tEvNfxZVVcOCAOih5PKr();
                                typedArrayTqcnImqkSWIKht4.recycle();
                                xyz3m1dnq3cbklxexpl22gcljkrjd2.zzpBGItXfub0yWj.add(xyz3m1dnq3cbklxexpl22gcljkrjd3);
                                arrayDeque.push(xyz3m1dnq3cbklxexpl22gcljkrjd3);
                                if (xyz3m1dnq3cbklxexpl22gcljkrjd3.getGroupName() != null) {
                                    qkxcijm1cknm0a1ravamobovlgp.put(xyz3m1dnq3cbklxexpl22gcljkrjd3.getGroupName(), xyz3m1dnq3cbklxexpl22gcljkrjd3);
                                }
                                a2hfrjfwupidsi504891gm3zxoe3.VxUQ9tBhpHJ2AAEDNW8sghc4m = a2hfrjfwupidsi504891gm3zxoe3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                            }
                        }
                        i2 = 1;
                    } else {
                        i = depth;
                        c = '\b';
                        i2 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i4 = i2;
                    depth = i;
                }
                if (!z2) {
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x = VxUQ9tBhpHJ2AAEDNW8sghc4m(a2hfrjfwupidsi504891gm3zxoe.V57tEvNfxZVVcOCAOih5PKr, a2hfrjfwupidsi504891gm3zxoe.ZfQNn8hdWlEQ5cR94249PDsLR);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayTqcnImqkSWIKht.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayTqcnImqkSWIKht.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public z8EoQ1MhPC1NSqsZjhrc(a2HfRJfwuPIdSI504891gm3zXOE a2hfrjfwupidsi504891gm3zxoe) {
        this.NSjgqmGjEzuugn2SsG1mZFP = true;
        this.GI83zq0G8e7zkn = new float[9];
        this.M9e7PWhFYLD2lOGMker = new Matrix();
        this.HzCpKshMOoaw76hFcbOVRYMeRd = new Rect();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = a2hfrjfwupidsi504891gm3zxoe;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = VxUQ9tBhpHJ2AAEDNW8sghc4m(a2hfrjfwupidsi504891gm3zxoe.V57tEvNfxZVVcOCAOih5PKr, a2hfrjfwupidsi504891gm3zxoe.ZfQNn8hdWlEQ5cR94249PDsLR);
    }
}
