package com.vdodsodjsdt;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ga8J5J8RdhR74HWKt1zT4rxteJUo implements Drawable.Callback {
    public final /* synthetic */ q0pWTaFdtfarfiKiJ0i30WR V57tEvNfxZVVcOCAOih5PKr;

    public ga8J5J8RdhR74HWKt1zT4rxteJUo(q0pWTaFdtfarfiKiJ0i30WR q0pwtafdtfarfikij0i30wr) {
        this.V57tEvNfxZVVcOCAOih5PKr = q0pwtafdtfarfikij0i30wr;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.V57tEvNfxZVVcOCAOih5PKr.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.V57tEvNfxZVVcOCAOih5PKr.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.V57tEvNfxZVVcOCAOih5PKr.unscheduleSelf(runnable);
    }
}
