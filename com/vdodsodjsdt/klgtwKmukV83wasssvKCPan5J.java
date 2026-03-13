package com.vdodsodjsdt;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class klgtwKmukV83wasssvKCPan5J extends tUXokta1kz8LOMVlvrJggS9nWYr3z {
    public final i4euwj2RC7G V57tEvNfxZVVcOCAOih5PKr;

    public klgtwKmukV83wasssvKCPan5J(i4euwj2RC7G i4euwj2rc7g) {
        this.V57tEvNfxZVVcOCAOih5PKr = i4euwj2rc7g;
    }

    @Override // com.vdodsodjsdt.tUXokta1kz8LOMVlvrJggS9nWYr3z
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Matrix matrix, RZFzCZImjJp0J rZFzCZImjJp0J, int i, Canvas canvas) {
        float f;
        i4euwj2RC7G i4euwj2rc7g = this.V57tEvNfxZVVcOCAOih5PKr;
        float f2 = i4euwj2rc7g.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        float f3 = i4euwj2rc7g.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        RectF rectF = new RectF(i4euwj2rc7g.zzpBGItXfub0yWj, i4euwj2rc7g.V57tEvNfxZVVcOCAOih5PKr, i4euwj2rc7g.ZfQNn8hdWlEQ5cR94249PDsLR, i4euwj2rc7g.LaeGQIruHQu81hfJldjMOQSVblH3x);
        Paint paint = rZFzCZImjJp0J.zzpBGItXfub0yWj;
        boolean z = f3 < 0.0f;
        Path path = rZFzCZImjJp0J.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int[] iArr = RZFzCZImjJp0J.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (z) {
            iArr[0] = 0;
            iArr[1] = rZFzCZImjJp0J.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            iArr[2] = rZFzCZImjJp0J.LaeGQIruHQu81hfJldjMOQSVblH3x;
            iArr[3] = rZFzCZImjJp0J.ZfQNn8hdWlEQ5cR94249PDsLR;
            f = 0.0f;
        } else {
            path.rewind();
            f = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = rZFzCZImjJp0J.ZfQNn8hdWlEQ5cR94249PDsLR;
            iArr[2] = rZFzCZImjJp0J.LaeGQIruHQu81hfJldjMOQSVblH3x;
            iArr[3] = rZFzCZImjJp0J.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f) {
            return;
        }
        float f5 = 1.0f - (i / fWidth);
        float[] fArr = RZFzCZImjJp0J.KUYypEB4eNWOZWVDpH;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, rZFzCZImjJp0J.NSjgqmGjEzuugn2SsG1mZFP);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
