package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BgrqKIfnM5xgG extends j6Xzcn6Ej3euYD {
    public boolean Irh5auREsoeV1C1RaBamlmy;
    public final boolean TaDO7ogis3aEiWEtq;
    public final Rect f6ZQsR6bPLvvCDNXOUc;
    public final Rect jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public Drawable ko09zE6UAgwkV;
    public int vBGA6pPLqSMuYGvprl270j7;

    public BgrqKIfnM5xgG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = new Rect();
        this.f6ZQsR6bPLvvCDNXOUc = new Rect();
        this.vBGA6pPLqSMuYGvprl270j7 = 119;
        this.TaDO7ogis3aEiWEtq = true;
        this.Irh5auREsoeV1C1RaBamlmy = false;
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.LaeGQIruHQu81hfJldjMOQSVblH3x(context, attributeSet, 0, 0);
        int[] iArr = PGobtLpyfPC4TCnlq740.NSjgqmGjEzuugn2SsG1mZFP;
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.NSjgqmGjEzuugn2SsG1mZFP(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.vBGA6pPLqSMuYGvprl270j7 = typedArrayObtainStyledAttributes.getInt(1, this.vBGA6pPLqSMuYGvprl270j7);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.TaDO7ogis3aEiWEtq = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.ko09zE6UAgwkV;
        if (drawable != null) {
            if (this.Irh5auREsoeV1C1RaBamlmy) {
                this.Irh5auREsoeV1C1RaBamlmy = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.TaDO7ogis3aEiWEtq;
                Rect rect = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.vBGA6pPLqSMuYGvprl270j7;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f6ZQsR6bPLvvCDNXOUc;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.ko09zE6UAgwkV;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.ko09zE6UAgwkV;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.ko09zE6UAgwkV.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.ko09zE6UAgwkV;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.vBGA6pPLqSMuYGvprl270j7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.ko09zE6UAgwkV;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // com.vdodsodjsdt.j6Xzcn6Ej3euYD, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.Irh5auREsoeV1C1RaBamlmy = z | this.Irh5auREsoeV1C1RaBamlmy;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.Irh5auREsoeV1C1RaBamlmy = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.ko09zE6UAgwkV;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.ko09zE6UAgwkV);
            }
            this.ko09zE6UAgwkV = drawable;
            this.Irh5auREsoeV1C1RaBamlmy = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.vBGA6pPLqSMuYGvprl270j7 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.vBGA6pPLqSMuYGvprl270j7 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.vBGA6pPLqSMuYGvprl270j7 = i;
            if (i == 119 && this.ko09zE6UAgwkV != null) {
                this.ko09zE6UAgwkV.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.ko09zE6UAgwkV;
    }
}
