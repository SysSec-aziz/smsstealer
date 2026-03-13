package com.vdodsodjsdt;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ji7HCOeNEno1mYLq3Mn8d {
    public final WeakReference LaeGQIruHQu81hfJldjMOQSVblH3x;
    public float V57tEvNfxZVVcOCAOih5PKr;
    public GXZVLd372jtPv6 zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final TextPaint VxUQ9tBhpHJ2AAEDNW8sghc4m = new TextPaint(1);
    public final r3Z3A1GlT1xNo zzpBGItXfub0yWj = new r3Z3A1GlT1xNo(1, this);
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR = true;

    public ji7HCOeNEno1mYLq3Mn8d(avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new WeakReference(null);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new WeakReference(avpaxxgaxsbfwfxxj);
    }

    public final float VxUQ9tBhpHJ2AAEDNW8sghc4m(String str) {
        if (!this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            return this.V57tEvNfxZVVcOCAOih5PKr;
        }
        TextPaint textPaint = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.V57tEvNfxZVVcOCAOih5PKr = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }
}
