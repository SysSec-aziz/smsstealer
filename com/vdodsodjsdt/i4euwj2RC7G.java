package com.vdodsodjsdt;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class i4euwj2RC7G extends AX2t0nklNro2XY8nBuz {
    public static final RectF NSjgqmGjEzuugn2SsG1mZFP = new RectF();
    public final float LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final float V57tEvNfxZVVcOCAOih5PKr;
    public float ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final float ZfQNn8hdWlEQ5cR94249PDsLR;
    public float zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final float zzpBGItXfub0yWj;

    public i4euwj2RC7G(float f, float f2, float f3, float f4) {
        this.zzpBGItXfub0yWj = f;
        this.V57tEvNfxZVVcOCAOih5PKr = f2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = f3;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = f4;
    }

    @Override // com.vdodsodjsdt.AX2t0nklNro2XY8nBuz
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Matrix matrix, Path path) {
        Matrix matrix2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        float f2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        RectF rectF = NSjgqmGjEzuugn2SsG1mZFP;
        rectF.set(this.zzpBGItXfub0yWj, this.V57tEvNfxZVVcOCAOih5PKr, f, f2);
        path.arcTo(rectF, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZLZeBXTMq0zDztBxtRTuCHrapQ, false);
        path.transform(matrix);
    }
}
