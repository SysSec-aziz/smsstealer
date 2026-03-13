package com.vdodsodjsdt;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Yl6XIohGSfgJzxL8v7MoePiWZ {
    public final WS3PVV2SF0Y6GNPIPGhbLX[] VxUQ9tBhpHJ2AAEDNW8sghc4m = new WS3PVV2SF0Y6GNPIPGhbLX[4];
    public final Matrix[] zzpBGItXfub0yWj = new Matrix[4];
    public final Matrix[] V57tEvNfxZVVcOCAOih5PKr = new Matrix[4];
    public final PointF ZfQNn8hdWlEQ5cR94249PDsLR = new PointF();
    public final Path LaeGQIruHQu81hfJldjMOQSVblH3x = new Path();
    public final Path zIvmSL0wzmmKGc3X39b2Gw2mUGE = new Path();
    public final WS3PVV2SF0Y6GNPIPGhbLX ZLZeBXTMq0zDztBxtRTuCHrapQ = new WS3PVV2SF0Y6GNPIPGhbLX();
    public final float[] NSjgqmGjEzuugn2SsG1mZFP = new float[2];
    public final float[] GI83zq0G8e7zkn = new float[2];
    public final Path M9e7PWhFYLD2lOGMker = new Path();
    public final Path HzCpKshMOoaw76hFcbOVRYMeRd = new Path();
    public final boolean KUYypEB4eNWOZWVDpH = true;

    public Yl6XIohGSfgJzxL8v7MoePiWZ() {
        for (int i = 0; i < 4; i++) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m[i] = new WS3PVV2SF0Y6GNPIPGhbLX();
            this.zzpBGItXfub0yWj[i] = new Matrix();
            this.V57tEvNfxZVVcOCAOih5PKr[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b, float[] fArr, float f, RectF rectF, UjGaonxlpbbHvs2pOnMd ujGaonxlpbbHvs2pOnMd, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        WS3PVV2SF0Y6GNPIPGhbLX[] wS3PVV2SF0Y6GNPIPGhbLXArr;
        Matrix[] matrixArr2;
        char c;
        float f2;
        char c2;
        int i2;
        path.rewind();
        Path path2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        path2.rewind();
        Path path3 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.V57tEvNfxZVVcOCAOih5PKr;
            fArr2 = this.NSjgqmGjEzuugn2SsG1mZFP;
            wS3PVV2SF0Y6GNPIPGhbLXArr = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            matrixArr2 = this.zzpBGItXfub0yWj;
            c = 0;
            if (i3 >= 4) {
                break;
            }
            WBbGwHQ7q5Zp0OIijyR qv6tw3dzt2xhzbqf = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? xdVIZOnOVHGi6uYUaae4zAI94b.zIvmSL0wzmmKGc3X39b2Gw2mUGE : xdVIZOnOVHGi6uYUaae4zAI94b.LaeGQIruHQu81hfJldjMOQSVblH3x : xdVIZOnOVHGi6uYUaae4zAI94b.NSjgqmGjEzuugn2SsG1mZFP : xdVIZOnOVHGi6uYUaae4zAI94b.ZLZeBXTMq0zDztBxtRTuCHrapQ : new qV6TW3dzT2xhzBqf(fArr[i3]);
            FLWIoSaHb1q8TqFvEBgPyRGrzvi6 fLWIoSaHb1q8TqFvEBgPyRGrzvi6 = i3 != 1 ? i3 != 2 ? i3 != 3 ? xdVIZOnOVHGi6uYUaae4zAI94b.zzpBGItXfub0yWj : xdVIZOnOVHGi6uYUaae4zAI94b.VxUQ9tBhpHJ2AAEDNW8sghc4m : xdVIZOnOVHGi6uYUaae4zAI94b.ZfQNn8hdWlEQ5cR94249PDsLR : xdVIZOnOVHGi6uYUaae4zAI94b.V57tEvNfxZVVcOCAOih5PKr;
            WS3PVV2SF0Y6GNPIPGhbLX wS3PVV2SF0Y6GNPIPGhbLX = wS3PVV2SF0Y6GNPIPGhbLXArr[i3];
            fLWIoSaHb1q8TqFvEBgPyRGrzvi6.getClass();
            fLWIoSaHb1q8TqFvEBgPyRGrzvi6.w0Wu95l8dVNw5rZMRu(wS3PVV2SF0Y6GNPIPGhbLX, f, qv6tw3dzt2xhzbqf.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            WS3PVV2SF0Y6GNPIPGhbLX wS3PVV2SF0Y6GNPIPGhbLX2 = wS3PVV2SF0Y6GNPIPGhbLXArr[i2];
            fArr2[0] = wS3PVV2SF0Y6GNPIPGhbLX2.zzpBGItXfub0yWj;
            fArr2[1] = wS3PVV2SF0Y6GNPIPGhbLX2.V57tEvNfxZVVcOCAOih5PKr;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            WS3PVV2SF0Y6GNPIPGhbLX wS3PVV2SF0Y6GNPIPGhbLX3 = wS3PVV2SF0Y6GNPIPGhbLXArr[i5];
            wS3PVV2SF0Y6GNPIPGhbLX3.getClass();
            fArr2[c] = 0.0f;
            fArr2[1] = wS3PVV2SF0Y6GNPIPGhbLX3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[c], fArr2[1]);
            } else {
                path.lineTo(fArr2[c], fArr2[1]);
            }
            wS3PVV2SF0Y6GNPIPGhbLXArr[i5].zzpBGItXfub0yWj(matrixArr2[i5], path);
            if (ujGaonxlpbbHvs2pOnMd != null) {
                WS3PVV2SF0Y6GNPIPGhbLX wS3PVV2SF0Y6GNPIPGhbLX4 = wS3PVV2SF0Y6GNPIPGhbLXArr[i5];
                Matrix matrix = matrixArr2[i5];
                EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = ujGaonxlpbbHvs2pOnMd.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                f2 = 0.0f;
                BitSet bitSet = eQz8nVyVxmIrHN6fNCQWutFG0b30O.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                wS3PVV2SF0Y6GNPIPGhbLX4.getClass();
                bitSet.set(i5, (boolean) c);
                tUXokta1kz8LOMVlvrJggS9nWYr3z[] tuxokta1kz8lomvlvrjggs9nwyr3zArr = eQz8nVyVxmIrHN6fNCQWutFG0b30O.LaeGQIruHQu81hfJldjMOQSVblH3x;
                wS3PVV2SF0Y6GNPIPGhbLX4.VxUQ9tBhpHJ2AAEDNW8sghc4m(wS3PVV2SF0Y6GNPIPGhbLX4.LaeGQIruHQu81hfJldjMOQSVblH3x);
                tuxokta1kz8lomvlvrjggs9nwyr3zArr[i5] = new nWGIBkCEK796AQ8GzQmTQVnC(new ArrayList(wS3PVV2SF0Y6GNPIPGhbLX4.ZLZeBXTMq0zDztBxtRTuCHrapQ), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            WS3PVV2SF0Y6GNPIPGhbLX wS3PVV2SF0Y6GNPIPGhbLX5 = wS3PVV2SF0Y6GNPIPGhbLXArr[i5];
            fArr2[0] = wS3PVV2SF0Y6GNPIPGhbLX5.zzpBGItXfub0yWj;
            fArr2[1] = wS3PVV2SF0Y6GNPIPGhbLX5.V57tEvNfxZVVcOCAOih5PKr;
            matrixArr2[i5].mapPoints(fArr2);
            WS3PVV2SF0Y6GNPIPGhbLX wS3PVV2SF0Y6GNPIPGhbLX6 = wS3PVV2SF0Y6GNPIPGhbLXArr[i7];
            wS3PVV2SF0Y6GNPIPGhbLX6.getClass();
            float[] fArr3 = this.GI83zq0G8e7zkn;
            fArr3[0] = f2;
            fArr3[1] = wS3PVV2SF0Y6GNPIPGhbLX6.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            WS3PVV2SF0Y6GNPIPGhbLX[] wS3PVV2SF0Y6GNPIPGhbLXArr2 = wS3PVV2SF0Y6GNPIPGhbLXArr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            WS3PVV2SF0Y6GNPIPGhbLX wS3PVV2SF0Y6GNPIPGhbLX7 = wS3PVV2SF0Y6GNPIPGhbLXArr2[i5];
            fArr2[0] = wS3PVV2SF0Y6GNPIPGhbLX7.zzpBGItXfub0yWj;
            fArr2[1] = wS3PVV2SF0Y6GNPIPGhbLX7.V57tEvNfxZVVcOCAOih5PKr;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            WS3PVV2SF0Y6GNPIPGhbLX wS3PVV2SF0Y6GNPIPGhbLX8 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            wS3PVV2SF0Y6GNPIPGhbLX8.ZfQNn8hdWlEQ5cR94249PDsLR(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? xdVIZOnOVHGi6uYUaae4zAI94b.M9e7PWhFYLD2lOGMker : xdVIZOnOVHGi6uYUaae4zAI94b.GI83zq0G8e7zkn : xdVIZOnOVHGi6uYUaae4zAI94b.KUYypEB4eNWOZWVDpH : xdVIZOnOVHGi6uYUaae4zAI94b.HzCpKshMOoaw76hFcbOVRYMeRd).getClass();
            wS3PVV2SF0Y6GNPIPGhbLX8.V57tEvNfxZVVcOCAOih5PKr(fMax, 0.0f);
            Path path4 = this.M9e7PWhFYLD2lOGMker;
            path4.reset();
            wS3PVV2SF0Y6GNPIPGhbLX8.zzpBGItXfub0yWj(matrixArr3[i5], path4);
            if (this.KUYypEB4eNWOZWVDpH && (zzpBGItXfub0yWj(path4, i5) || zzpBGItXfub0yWj(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = wS3PVV2SF0Y6GNPIPGhbLX8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                wS3PVV2SF0Y6GNPIPGhbLX8.zzpBGItXfub0yWj(matrixArr3[i5], path2);
            } else {
                wS3PVV2SF0Y6GNPIPGhbLX8.zzpBGItXfub0yWj(matrixArr3[i5], path);
            }
            if (ujGaonxlpbbHvs2pOnMd != null) {
                Matrix matrix2 = matrixArr3[i5];
                EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O2 = ujGaonxlpbbHvs2pOnMd.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                c2 = 0;
                eQz8nVyVxmIrHN6fNCQWutFG0b30O2.ZLZeBXTMq0zDztBxtRTuCHrapQ.set(i5 + 4, false);
                tUXokta1kz8LOMVlvrJggS9nWYr3z[] tuxokta1kz8lomvlvrjggs9nwyr3zArr2 = eQz8nVyVxmIrHN6fNCQWutFG0b30O2.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                wS3PVV2SF0Y6GNPIPGhbLX8.VxUQ9tBhpHJ2AAEDNW8sghc4m(wS3PVV2SF0Y6GNPIPGhbLX8.LaeGQIruHQu81hfJldjMOQSVblH3x);
                tuxokta1kz8lomvlvrjggs9nwyr3zArr2[i5] = new nWGIBkCEK796AQ8GzQmTQVnC(new ArrayList(wS3PVV2SF0Y6GNPIPGhbLX8.ZLZeBXTMq0zDztBxtRTuCHrapQ), new Matrix(matrix2));
            } else {
                c2 = 0;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            c = c2;
            wS3PVV2SF0Y6GNPIPGhbLXArr = wS3PVV2SF0Y6GNPIPGhbLXArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean zzpBGItXfub0yWj(Path path, int i) {
        Path path2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        path2.reset();
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m[i].zzpBGItXfub0yWj(this.zzpBGItXfub0yWj[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
