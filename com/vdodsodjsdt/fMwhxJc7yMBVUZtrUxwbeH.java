package com.vdodsodjsdt;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class fMwhxJc7yMBVUZtrUxwbeH extends Drawable implements Drawable.Callback {
    public Drawable V57tEvNfxZVVcOCAOih5PKr;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;

    public final void V57tEvNfxZVVcOCAOih5PKr(int i, int i2, int i3, int i4) {
        this.V57tEvNfxZVVcOCAOih5PKr.setHotspotBounds(i, i2, i3, i4);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Canvas canvas) {
        this.V57tEvNfxZVVcOCAOih5PKr.draw(canvas);
    }

    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.V57tEvNfxZVVcOCAOih5PKr.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.V57tEvNfxZVVcOCAOih5PKr.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.V57tEvNfxZVVcOCAOih5PKr.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.V57tEvNfxZVVcOCAOih5PKr.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.V57tEvNfxZVVcOCAOih5PKr.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.V57tEvNfxZVVcOCAOih5PKr.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            zzpBGItXfub0yWj(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            V57tEvNfxZVVcOCAOih5PKr(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            return this.V57tEvNfxZVVcOCAOih5PKr.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.V57tEvNfxZVVcOCAOih5PKr.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.V57tEvNfxZVVcOCAOih5PKr.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            return ZfQNn8hdWlEQ5cR94249PDsLR(z, z2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void zzpBGItXfub0yWj(float f, float f2) {
        this.V57tEvNfxZVVcOCAOih5PKr.setHotspot(f, f2);
    }
}
