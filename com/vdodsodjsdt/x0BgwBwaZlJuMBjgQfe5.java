package com.vdodsodjsdt;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class x0BgwBwaZlJuMBjgQfe5 extends tUXokta1kz8LOMVlvrJggS9nWYr3z {
    public final float LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final skGrJUpGDGTSq1YORq V57tEvNfxZVVcOCAOih5PKr;
    public final float ZfQNn8hdWlEQ5cR94249PDsLR;

    public x0BgwBwaZlJuMBjgQfe5(skGrJUpGDGTSq1YORq skgrjupgdgtsq1yorq, float f, float f2) {
        this.V57tEvNfxZVVcOCAOih5PKr = skgrjupgdgtsq1yorq;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = f;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = f2;
    }

    @Override // com.vdodsodjsdt.tUXokta1kz8LOMVlvrJggS9nWYr3z
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Matrix matrix, RZFzCZImjJp0J rZFzCZImjJp0J, int i, Canvas canvas) {
        skGrJUpGDGTSq1YORq skgrjupgdgtsq1yorq = this.V57tEvNfxZVVcOCAOih5PKr;
        float f = skgrjupgdgtsq1yorq.V57tEvNfxZVVcOCAOih5PKr;
        float f2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        float f3 = skgrjupgdgtsq1yorq.zzpBGItXfub0yWj;
        float f4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(zzpBGItXfub0yWj());
        rZFzCZImjJp0J.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = rZFzCZImjJp0J.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int[] iArr = RZFzCZImjJp0J.GI83zq0G8e7zkn;
        iArr[0] = i2;
        iArr[1] = rZFzCZImjJp0J.LaeGQIruHQu81hfJldjMOQSVblH3x;
        iArr[2] = rZFzCZImjJp0J.ZfQNn8hdWlEQ5cR94249PDsLR;
        Paint paint = rZFzCZImjJp0J.V57tEvNfxZVVcOCAOih5PKr;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, RZFzCZImjJp0J.M9e7PWhFYLD2lOGMker, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float zzpBGItXfub0yWj() {
        skGrJUpGDGTSq1YORq skgrjupgdgtsq1yorq = this.V57tEvNfxZVVcOCAOih5PKr;
        return (float) Math.toDegrees(Math.atan((skgrjupgdgtsq1yorq.V57tEvNfxZVVcOCAOih5PKr - this.LaeGQIruHQu81hfJldjMOQSVblH3x) / (skgrjupgdgtsq1yorq.zzpBGItXfub0yWj - this.ZfQNn8hdWlEQ5cR94249PDsLR)));
    }
}
