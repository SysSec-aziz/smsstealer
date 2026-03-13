package com.vdodsodjsdt;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class PbjARyxARdIwoI {
    public static final Matrix h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new Matrix();
    public final qKXCIJM1cKNm0a1RAvamOBOVLgp Ca81ebIan1u;
    public float GI83zq0G8e7zkn;
    public float HzCpKshMOoaw76hFcbOVRYMeRd;
    public int KUYypEB4eNWOZWVDpH;
    public Paint LaeGQIruHQu81hfJldjMOQSVblH3x;
    public float M9e7PWhFYLD2lOGMker;
    public float NSjgqmGjEzuugn2SsG1mZFP;
    public final Matrix V57tEvNfxZVVcOCAOih5PKr;
    public final Path VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final xYz3m1dnq3cbKlXExPL22gclJkrjd ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public Paint ZfQNn8hdWlEQ5cR94249PDsLR;
    public Boolean p59rPv72J9;
    public String q1wNbhk2O6;
    public PathMeasure zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final Path zzpBGItXfub0yWj;

    public PbjARyxARdIwoI() {
        this.V57tEvNfxZVVcOCAOih5PKr = new Matrix();
        this.NSjgqmGjEzuugn2SsG1mZFP = 0.0f;
        this.GI83zq0G8e7zkn = 0.0f;
        this.M9e7PWhFYLD2lOGMker = 0.0f;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = 0.0f;
        this.KUYypEB4eNWOZWVDpH = 255;
        this.q1wNbhk2O6 = null;
        this.p59rPv72J9 = null;
        this.Ca81ebIan1u = new qKXCIJM1cKNm0a1RAvamOBOVLgp(0);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new xYz3m1dnq3cbKlXExPL22gclJkrjd();
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new Path();
        this.zzpBGItXfub0yWj = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(xYz3m1dnq3cbKlXExPL22gclJkrjd xyz3m1dnq3cbklxexpl22gcljkrjd, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = xyz3m1dnq3cbklxexpl22gcljkrjd.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ArrayList arrayList = xyz3m1dnq3cbklxexpl22gcljkrjd.zzpBGItXfub0yWj;
        matrix2.set(matrix);
        Matrix matrix3 = xyz3m1dnq3cbklxexpl22gcljkrjd.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        matrix3.preConcat(xyz3m1dnq3cbklxexpl22gcljkrjd.M9e7PWhFYLD2lOGMker);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            EM5Ueg4SS3xqKechziQvaSKq eM5Ueg4SS3xqKechziQvaSKq = (EM5Ueg4SS3xqKechziQvaSKq) arrayList.get(i5);
            if (eM5Ueg4SS3xqKechziQvaSKq instanceof xYz3m1dnq3cbKlXExPL22gclJkrjd) {
                VxUQ9tBhpHJ2AAEDNW8sghc4m((xYz3m1dnq3cbKlXExPL22gclJkrjd) eM5Ueg4SS3xqKechziQvaSKq, matrix3, canvas, i, i2);
            } else if (eM5Ueg4SS3xqKechziQvaSKq instanceof tGqXED78tOVJkBMS0QEJy) {
                tGqXED78tOVJkBMS0QEJy tgqxed78tovjkbms0qejy = (tGqXED78tOVJkBMS0QEJy) eM5Ueg4SS3xqKechziQvaSKq;
                float f3 = i / this.M9e7PWhFYLD2lOGMker;
                float f4 = i2 / this.HzCpKshMOoaw76hFcbOVRYMeRd;
                float fMin = Math.min(f3, f4);
                Matrix matrix4 = this.V57tEvNfxZVVcOCAOih5PKr;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f5) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    path.reset();
                    z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[] z0zmvfrihplpxe40lo7hy9qdkt8fjArr = tgqxed78tovjkbms0qejy.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    if (z0zmvfrihplpxe40lo7hy9qdkt8fjArr != null) {
                        z0zMVFrIHPlPXE40lO7hy9QDKt8FJ.zzpBGItXfub0yWj(z0zmvfrihplpxe40lo7hy9qdkt8fjArr, path);
                    }
                    Path path2 = this.zzpBGItXfub0yWj;
                    path2.reset();
                    if (tgqxed78tovjkbms0qejy instanceof G7gq4oPCUZ1wY) {
                        path2.setFillType(tgqxed78tovjkbms0qejy.V57tEvNfxZVVcOCAOih5PKr == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        QtoKMOQ86Bcawp0YPtt6VaR9oidpB qtoKMOQ86Bcawp0YPtt6VaR9oidpB = (QtoKMOQ86Bcawp0YPtt6VaR9oidpB) tgqxed78tovjkbms0qejy;
                        float f6 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.GI83zq0G8e7zkn;
                        if (f6 != 0.0f || qtoKMOQ86Bcawp0YPtt6VaR9oidpB.M9e7PWhFYLD2lOGMker != 1.0f) {
                            float f7 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.HzCpKshMOoaw76hFcbOVRYMeRd;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (qtoKMOQ86Bcawp0YPtt6VaR9oidpB.M9e7PWhFYLD2lOGMker + f7) % 1.0f;
                            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
                                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new PathMeasure();
                            }
                            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setPath(path, z);
                            float length = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            if (f10 > f11) {
                                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                        if (((Shader) eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.V57tEvNfxZVVcOCAOih5PKr) == null && eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.zzpBGItXfub0yWj == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.LaeGQIruHQu81hfJldjMOQSVblH3x = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                            Shader shader = (Shader) eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.V57tEvNfxZVVcOCAOih5PKr;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(qtoKMOQ86Bcawp0YPtt6VaR9oidpB.NSjgqmGjEzuugn2SsG1mZFP * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.zzpBGItXfub0yWj;
                                float f12 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.NSjgqmGjEzuugn2SsG1mZFP;
                                PorterDuff.Mode mode = z8EoQ1MhPC1NSqsZjhrc.KUYypEB4eNWOZWVDpH;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(qtoKMOQ86Bcawp0YPtt6VaR9oidpB.V57tEvNfxZVVcOCAOih5PKr == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb2 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.ZfQNn8hdWlEQ5cR94249PDsLR;
                        if (((Shader) eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb2.V57tEvNfxZVVcOCAOih5PKr) != null || eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb2.zzpBGItXfub0yWj != 0) {
                            if (this.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
                                Paint paint3 = new Paint(1);
                                this.ZfQNn8hdWlEQ5cR94249PDsLR = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                            Paint.Join join = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.q1wNbhk2O6;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.KUYypEB4eNWOZWVDpH;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(qtoKMOQ86Bcawp0YPtt6VaR9oidpB.p59rPv72J9);
                            Shader shader2 = (Shader) eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb2.V57tEvNfxZVVcOCAOih5PKr;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(qtoKMOQ86Bcawp0YPtt6VaR9oidpB.ZLZeBXTMq0zDztBxtRTuCHrapQ * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb2.zzpBGItXfub0yWj;
                                float f13 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                                PorterDuff.Mode mode2 = z8EoQ1MhPC1NSqsZjhrc.KUYypEB4eNWOZWVDpH;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(qtoKMOQ86Bcawp0YPtt6VaR9oidpB.LaeGQIruHQu81hfJldjMOQSVblH3x * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.KUYypEB4eNWOZWVDpH;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.KUYypEB4eNWOZWVDpH = i;
    }

    public PbjARyxARdIwoI(PbjARyxARdIwoI pbjARyxARdIwoI) {
        this.V57tEvNfxZVVcOCAOih5PKr = new Matrix();
        this.NSjgqmGjEzuugn2SsG1mZFP = 0.0f;
        this.GI83zq0G8e7zkn = 0.0f;
        this.M9e7PWhFYLD2lOGMker = 0.0f;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = 0.0f;
        this.KUYypEB4eNWOZWVDpH = 255;
        this.q1wNbhk2O6 = null;
        this.p59rPv72J9 = null;
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = new qKXCIJM1cKNm0a1RAvamOBOVLgp(0);
        this.Ca81ebIan1u = qkxcijm1cknm0a1ravamobovlgp;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new xYz3m1dnq3cbKlXExPL22gclJkrjd(pbjARyxARdIwoI.ZLZeBXTMq0zDztBxtRTuCHrapQ, qkxcijm1cknm0a1ravamobovlgp);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new Path(pbjARyxARdIwoI.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        this.zzpBGItXfub0yWj = new Path(pbjARyxARdIwoI.zzpBGItXfub0yWj);
        this.NSjgqmGjEzuugn2SsG1mZFP = pbjARyxARdIwoI.NSjgqmGjEzuugn2SsG1mZFP;
        this.GI83zq0G8e7zkn = pbjARyxARdIwoI.GI83zq0G8e7zkn;
        this.M9e7PWhFYLD2lOGMker = pbjARyxARdIwoI.M9e7PWhFYLD2lOGMker;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = pbjARyxARdIwoI.HzCpKshMOoaw76hFcbOVRYMeRd;
        this.KUYypEB4eNWOZWVDpH = pbjARyxARdIwoI.KUYypEB4eNWOZWVDpH;
        this.q1wNbhk2O6 = pbjARyxARdIwoI.q1wNbhk2O6;
        String str = pbjARyxARdIwoI.q1wNbhk2O6;
        if (str != null) {
            qkxcijm1cknm0a1ravamobovlgp.put(str, this);
        }
        this.p59rPv72J9 = pbjARyxARdIwoI.p59rPv72J9;
    }
}
