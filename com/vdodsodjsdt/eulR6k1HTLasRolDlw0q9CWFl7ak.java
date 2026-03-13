package com.vdodsodjsdt;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class eulR6k1HTLasRolDlw0q9CWFl7ak extends EQz8nVyVxmIrHN6fNCQWutFG0b30O {
    public static final /* synthetic */ int iKANjmyTSxO6v6UuLPdu7DxOjlS = 0;
    public MKLZoKw17XA qygqjTppWwx992;

    public final void f6ZQsR6bPLvvCDNXOUc(float f, float f2, float f3, float f4) {
        RectF rectF = this.qygqjTppWwx992.ko09zE6UAgwkV;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.qygqjTppWwx992 = new MKLZoKw17XA(this.qygqjTppWwx992);
        return this;
    }

    @Override // com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O
    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Canvas canvas) {
        if (this.qygqjTppWwx992.ko09zE6UAgwkV.isEmpty()) {
            super.zIvmSL0wzmmKGc3X39b2Gw2mUGE(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.qygqjTppWwx992.ko09zE6UAgwkV);
        } else {
            canvas.clipRect(this.qygqjTppWwx992.ko09zE6UAgwkV, Region.Op.DIFFERENCE);
        }
        super.zIvmSL0wzmmKGc3X39b2Gw2mUGE(canvas);
        canvas.restore();
    }
}
