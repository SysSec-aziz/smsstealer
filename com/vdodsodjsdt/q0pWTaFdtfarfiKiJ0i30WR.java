package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class q0pWTaFdtfarfiKiJ0i30WR extends OsPwQ64hJydE8PLvXR7MHKd implements Animatable {
    public final Context LaeGQIruHQu81hfJldjMOQSVblH3x;
    public LJ0avg2f37zqC zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
    public ArrayList ZLZeBXTMq0zDztBxtRTuCHrapQ = null;
    public final ga8J5J8RdhR74HWKt1zT4rxteJUo NSjgqmGjEzuugn2SsG1mZFP = new ga8J5J8RdhR74HWKt1zT4rxteJUo(this);
    public final lMWs8BoetIVDONVmx ZfQNn8hdWlEQ5cR94249PDsLR = new lMWs8BoetIVDONVmx();

    public q0pWTaFdtfarfiKiJ0i30WR(Context context, int i) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = context;
    }

    @Override // com.vdodsodjsdt.OsPwQ64hJydE8PLvXR7MHKd, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        lMWs8BoetIVDONVmx lmws8boetivdonvmx = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        lmws8boetivdonvmx.VxUQ9tBhpHJ2AAEDNW8sghc4m.draw(canvas);
        if (lmws8boetivdonvmx.zzpBGItXfub0yWj.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.getAlpha() : this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.getColorFilter() : this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.V57tEvNfxZVVcOCAOih5PKr != null) {
            return new uZkG4KR26RHbX77LZ98AY8m(this.V57tEvNfxZVVcOCAOih5PKr.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.getIntrinsicHeight() : this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.getIntrinsicWidth() : this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.getOpacity() : this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r3.zzpBGItXfub0yWj != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r3.zzpBGItXfub0yWj = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        r3.zzpBGItXfub0yWj.playTogether(r3.V57tEvNfxZVVcOCAOih5PKr);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.q0pWTaFdtfarfiKiJ0i30WR.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.isAutoMirrored() : this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.isStateful() : this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.setBounds(rect);
        }
    }

    @Override // com.vdodsodjsdt.OsPwQ64hJydE8PLvXR7MHKd, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.setLevel(i) : this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        return drawable != null ? drawable.setState(iArr) : this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            zonOxHotd3BwAPJcwqr6I6uQNngg4.gBaBUmihn5l4u(drawable, i);
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            zonOxHotd3BwAPJcwqr6I6uQNngg4.L8DMw02rUTs2w(drawable, colorStateList);
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            zonOxHotd3BwAPJcwqr6I6uQNngg4.lQ0rO9lhQIyVe7Rp6(drawable, mode);
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        lMWs8BoetIVDONVmx lmws8boetivdonvmx = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lmws8boetivdonvmx.zzpBGItXfub0yWj.isStarted()) {
            return;
        }
        lmws8boetivdonvmx.zzpBGItXfub0yWj.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
