package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class EQz8nVyVxmIrHN6fNCQWutFG0b30O extends Drawable implements dqrRplqyPGe {
    public static final Paint HVEwbdULInpTNa0IG;
    public static final Phcb1m189Hn9[] y1NaPKTl7R18DOr6e8i5;
    public final Region Ca81ebIan1u;
    public boolean GI83zq0G8e7zkn;
    public final Path HzCpKshMOoaw76hFcbOVRYMeRd;
    public PorterDuffColorFilter Irh5auREsoeV1C1RaBamlmy;
    public final Path KUYypEB4eNWOZWVDpH;
    public final tUXokta1kz8LOMVlvrJggS9nWYr3z[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Matrix M9e7PWhFYLD2lOGMker;
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public Jc01di1Hsv O1xDAlBZZlZdoEf747lCFHld;
    public boolean RhfGHxtXxy0M0grmp2jkRjQg;
    public oWK0Apo0Nirk5BGlanOPFjcPKV7Bt SuB3hEmTmbbRGAhtvOOmfKEon;
    public PorterDuffColorFilter TaDO7ogis3aEiWEtq;
    public final UjGaonxlpbbHvs2pOnMd V57tEvNfxZVVcOCAOih5PKr;
    public final BitSet ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 ZfQNn8hdWlEQ5cR94249PDsLR;
    public float[] aXO0LSrt8bKV;
    public final UjGaonxlpbbHvs2pOnMd f6ZQsR6bPLvvCDNXOUc;
    public final Region h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final RZFzCZImjJp0J jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final Paint ko09zE6UAgwkV;
    public final RectF p59rPv72J9;
    public final Paint pYmKDYlAmhudp;
    public final GN4aJILnYJzlN5Sb[] pzqP2AqKW6J5PO8zCKnW;
    public final RectF q11o1hieEkZDhF1MGOZI26oZiDT;
    public final RectF q1wNbhk2O6;
    public XdVIZOnOVHGi6uYUaae4zAI94b qNPQb1obP7;
    public final Yl6XIohGSfgJzxL8v7MoePiWZ vBGA6pPLqSMuYGvprl270j7;
    public float[] vE4yDIjexsP2lGjLaTcB;
    public final boolean w0Wu95l8dVNw5rZMRu;
    public final tUXokta1kz8LOMVlvrJggS9nWYr3z[] zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    static {
        Paint paint = new Paint(1);
        HVEwbdULInpTNa0IG = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        y1NaPKTl7R18DOr6e8i5 = new Phcb1m189Hn9[4];
        int i = 0;
        while (true) {
            Phcb1m189Hn9[] phcb1m189Hn9Arr = y1NaPKTl7R18DOr6e8i5;
            if (i >= phcb1m189Hn9Arr.length) {
                return;
            }
            phcb1m189Hn9Arr[i] = new Phcb1m189Hn9(i);
            i++;
        }
    }

    public EQz8nVyVxmIrHN6fNCQWutFG0b30O() {
        this(new XdVIZOnOVHGi6uYUaae4zAI94b());
    }

    public static float zzpBGItXfub0yWj(RectF rectF, XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b, float[] fArr) {
        if (fArr == null) {
            if (xdVIZOnOVHGi6uYUaae4zAI94b.LaeGQIruHQu81hfJldjMOQSVblH3x(rectF)) {
                return xdVIZOnOVHGi6uYUaae4zAI94b.LaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (xdVIZOnOVHGi6uYUaae4zAI94b.ZfQNn8hdWlEQ5cR94249PDsLR()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void Ca81ebIan1u(wL6lQKsoxy wl6lqksoxy) {
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.zzpBGItXfub0yWj != wl6lqksoxy) {
            uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.zzpBGItXfub0yWj = wl6lqksoxy;
            pYmKDYlAmhudp(getState(), true);
            invalidateSelf();
        }
    }

    public final float GI83zq0G8e7zkn() {
        if (M9e7PWhFYLD2lOGMker()) {
            return this.ko09zE6UAgwkV.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd(Context context) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr = new kpVE7S4FrjjO5(context);
        jW7EiD0YL6xkbB158jMUzhWNWb1y();
    }

    public final void KUYypEB4eNWOZWVDpH(oWK0Apo0Nirk5BGlanOPFjcPKV7Bt owk0apo0nirk5bglanopfjcpkv7bt) {
        if (this.SuB3hEmTmbbRGAhtvOOmfKEon == owk0apo0nirk5bglanopfjcpkv7bt) {
            return;
        }
        this.SuB3hEmTmbbRGAhtvOOmfKEon = owk0apo0nirk5bglanopfjcpkv7bt;
        int i = 0;
        while (true) {
            GN4aJILnYJzlN5Sb[] gN4aJILnYJzlN5SbArr = this.pzqP2AqKW6J5PO8zCKnW;
            if (i >= gN4aJILnYJzlN5SbArr.length) {
                pYmKDYlAmhudp(getState(), true);
                invalidateSelf();
                return;
            }
            if (gN4aJILnYJzlN5SbArr[i] == null) {
                gN4aJILnYJzlN5SbArr[i] = new GN4aJILnYJzlN5Sb(this, y1NaPKTl7R18DOr6e8i5[i]);
            }
            GN4aJILnYJzlN5Sb gN4aJILnYJzlN5Sb = gN4aJILnYJzlN5SbArr[i];
            oWK0Apo0Nirk5BGlanOPFjcPKV7Bt owk0apo0nirk5bglanopfjcpkv7bt2 = new oWK0Apo0Nirk5BGlanOPFjcPKV7Bt();
            float f = (float) owk0apo0nirk5bglanopfjcpkv7bt.zzpBGItXfub0yWj;
            if (f < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            owk0apo0nirk5bglanopfjcpkv7bt2.zzpBGItXfub0yWj = f;
            owk0apo0nirk5bglanopfjcpkv7bt2.V57tEvNfxZVVcOCAOih5PKr = false;
            double d = owk0apo0nirk5bglanopfjcpkv7bt.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            float f2 = (float) (d * d);
            if (f2 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            owk0apo0nirk5bglanopfjcpkv7bt2.VxUQ9tBhpHJ2AAEDNW8sghc4m = Math.sqrt(f2);
            owk0apo0nirk5bglanopfjcpkv7bt2.V57tEvNfxZVVcOCAOih5PKr = false;
            gN4aJILnYJzlN5Sb.M9e7PWhFYLD2lOGMker = owk0apo0nirk5bglanopfjcpkv7bt2;
            i++;
        }
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(Canvas canvas, Paint paint, Path path, XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b, float[] fArr, RectF rectF) {
        float fZzpBGItXfub0yWj = zzpBGItXfub0yWj(rectF, xdVIZOnOVHGi6uYUaae4zAI94b, fArr);
        if (fZzpBGItXfub0yWj < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fZzpBGItXfub0yWj * this.ZfQNn8hdWlEQ5cR94249PDsLR.M9e7PWhFYLD2lOGMker;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final boolean M9e7PWhFYLD2lOGMker() {
        Paint.Style style = this.ZfQNn8hdWlEQ5cR94249PDsLR.pYmKDYlAmhudp;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.ko09zE6UAgwkV.getStrokeWidth() > 0.0f;
    }

    public final float NSjgqmGjEzuugn2SsG1mZFP() {
        float[] fArr = this.aXO0LSrt8bKV;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ();
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b = this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Yl6XIohGSfgJzxL8v7MoePiWZ yl6XIohGSfgJzxL8v7MoePiWZ = this.vBGA6pPLqSMuYGvprl270j7;
        yl6XIohGSfgJzxL8v7MoePiWZ.getClass();
        float fVxUQ9tBhpHJ2AAEDNW8sghc4m = xdVIZOnOVHGi6uYUaae4zAI94b.LaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectFZLZeBXTMq0zDztBxtRTuCHrapQ);
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b2 = this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        yl6XIohGSfgJzxL8v7MoePiWZ.getClass();
        float fVxUQ9tBhpHJ2AAEDNW8sghc4m2 = xdVIZOnOVHGi6uYUaae4zAI94b2.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectFZLZeBXTMq0zDztBxtRTuCHrapQ) + fVxUQ9tBhpHJ2AAEDNW8sghc4m;
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b3 = this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        yl6XIohGSfgJzxL8v7MoePiWZ.getClass();
        float fVxUQ9tBhpHJ2AAEDNW8sghc4m3 = fVxUQ9tBhpHJ2AAEDNW8sghc4m2 - xdVIZOnOVHGi6uYUaae4zAI94b3.ZLZeBXTMq0zDztBxtRTuCHrapQ.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectFZLZeBXTMq0zDztBxtRTuCHrapQ);
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b4 = this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        yl6XIohGSfgJzxL8v7MoePiWZ.getClass();
        return (fVxUQ9tBhpHJ2AAEDNW8sghc4m3 - xdVIZOnOVHGi6uYUaae4zAI94b4.zIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m(rectFZLZeBXTMq0zDztBxtRTuCHrapQ)) / 2.0f;
    }

    public final int V57tEvNfxZVVcOCAOih5PKr(int i) {
        int i2;
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        float f = uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.p59rPv72J9 + 0.0f + uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.q1wNbhk2O6;
        kpVE7S4FrjjO5 kpve7s4frjjo5 = uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.V57tEvNfxZVVcOCAOih5PKr;
        if (kpve7s4frjjo5 == null || !kpve7s4frjjo5.VxUQ9tBhpHJ2AAEDNW8sghc4m || PyYsF2FE67iANgZ0fDkVtNG5uhA.ZfQNn8hdWlEQ5cR94249PDsLR(i, 255) != kpve7s4frjjo5.ZfQNn8hdWlEQ5cR94249PDsLR) {
            return i;
        }
        float fMin = (kpve7s4frjjo5.LaeGQIruHQu81hfJldjMOQSVblH3x <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iIKANjmyTSxO6v6UuLPdu7DxOjlS = zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(PyYsF2FE67iANgZ0fDkVtNG5uhA.ZfQNn8hdWlEQ5cR94249PDsLR(i, 255), kpve7s4frjjo5.zzpBGItXfub0yWj, fMin);
        if (fMin > 0.0f && (i2 = kpve7s4frjjo5.V57tEvNfxZVVcOCAOih5PKr) != 0) {
            iIKANjmyTSxO6v6UuLPdu7DxOjlS = PyYsF2FE67iANgZ0fDkVtNG5uhA.zzpBGItXfub0yWj(PyYsF2FE67iANgZ0fDkVtNG5uhA.ZfQNn8hdWlEQ5cR94249PDsLR(i2, kpVE7S4FrjjO5.zIvmSL0wzmmKGc3X39b2Gw2mUGE), iIKANjmyTSxO6v6UuLPdu7DxOjlS);
        }
        return PyYsF2FE67iANgZ0fDkVtNG5uhA.ZfQNn8hdWlEQ5cR94249PDsLR(iIKANjmyTSxO6v6UuLPdu7DxOjlS, iAlpha);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(RectF rectF, Path path) {
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        this.vBGA6pPLqSMuYGvprl270j7.VxUQ9tBhpHJ2AAEDNW8sghc4m(uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.aXO0LSrt8bKV, uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.M9e7PWhFYLD2lOGMker, rectF, this.f6ZQsR6bPLvvCDNXOUc, path);
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR.GI83zq0G8e7zkn != 1.0f) {
            Matrix matrix = this.M9e7PWhFYLD2lOGMker;
            matrix.reset();
            float f = this.ZfQNn8hdWlEQ5cR94249PDsLR.GI83zq0G8e7zkn;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.q11o1hieEkZDhF1MGOZI26oZiDT, true);
    }

    public final RectF ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        Rect bounds = getBounds();
        RectF rectF = this.q1wNbhk2O6;
        rectF.set(bounds);
        return rectF;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(Canvas canvas) {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ.cardinality() > 0) {
            Log.w("EQz8nVyVxmIrHN6fNCQWutFG0b30O", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        Path path = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        RZFzCZImjJp0J rZFzCZImjJp0J = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (i != 0) {
            canvas.drawPath(path, rZFzCZImjJp0J.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            tUXokta1kz8LOMVlvrJggS9nWYr3z tuxokta1kz8lomvlvrjggs9nwyr3z = this.LaeGQIruHQu81hfJldjMOQSVblH3x[i2];
            int i3 = this.ZfQNn8hdWlEQ5cR94249PDsLR.Ca81ebIan1u;
            Matrix matrix = tUXokta1kz8LOMVlvrJggS9nWYr3z.zzpBGItXfub0yWj;
            tuxokta1kz8lomvlvrjggs9nwyr3z.VxUQ9tBhpHJ2AAEDNW8sghc4m(matrix, rZFzCZImjJp0J, i3, canvas);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i2].VxUQ9tBhpHJ2AAEDNW8sghc4m(matrix, rZFzCZImjJp0J, this.ZfQNn8hdWlEQ5cR94249PDsLR.Ca81ebIan1u, canvas);
        }
        if (this.w0Wu95l8dVNw5rZMRu) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * ((double) this.ZfQNn8hdWlEQ5cR94249PDsLR.h3jnZRsdwYJfY9UhQCkbvWciwvFHv));
            int iCos = (int) (Math.cos(Math.toRadians(d)) * ((double) this.ZfQNn8hdWlEQ5cR94249PDsLR.h3jnZRsdwYJfY9UhQCkbvWciwvFHv));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, HVEwbdULInpTNa0IG);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[EDGE_INSN: B:64:0x0097->B:30:0x0097 BREAK  A[LOOP:1: B:21:0x007e->B:26:0x0088]] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.KUYypEB4eNWOZWVDpH;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        RectF rectFZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ();
        if (rectFZLZeBXTMq0zDztBxtRTuCHrapQ.isEmpty()) {
            return;
        }
        float fZzpBGItXfub0yWj = zzpBGItXfub0yWj(rectFZLZeBXTMq0zDztBxtRTuCHrapQ, this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.aXO0LSrt8bKV);
        if (fZzpBGItXfub0yWj >= 0.0f) {
            outline.setRoundRect(getBounds(), fZzpBGItXfub0yWj * this.ZfQNn8hdWlEQ5cR94249PDsLR.M9e7PWhFYLD2lOGMker);
            return;
        }
        boolean z = this.NSjgqmGjEzuugn2SsG1mZFP;
        Path path = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (z) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m(rectFZLZeBXTMq0zDztBxtRTuCHrapQ, path);
            this.NSjgqmGjEzuugn2SsG1mZFP = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            u0EpR0veY0Xv42E.VxUQ9tBhpHJ2AAEDNW8sghc4m(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                dsCxyMhl3pnUTOzJ.VxUQ9tBhpHJ2AAEDNW8sghc4m(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            dsCxyMhl3pnUTOzJ.VxUQ9tBhpHJ2AAEDNW8sghc4m(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.ZfQNn8hdWlEQ5cR94249PDsLR.NSjgqmGjEzuugn2SsG1mZFP;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.Ca81ebIan1u;
        region.set(bounds);
        RectF rectFZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ();
        Path path = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        VxUQ9tBhpHJ2AAEDNW8sghc4m(rectFZLZeBXTMq0zDztBxtRTuCHrapQ, path);
        Region region2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR == null || color2 == (colorForState2 = this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR.getColorForState(iArr, (color2 = (paint2 = this.pYmKDYlAmhudp).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR.LaeGQIruHQu81hfJldjMOQSVblH3x == null || color == (colorForState = this.ZfQNn8hdWlEQ5cR94249PDsLR.LaeGQIruHQu81hfJldjMOQSVblH3x.getColorForState(iArr, (color = (paint = this.ko09zE6UAgwkV).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.NSjgqmGjEzuugn2SsG1mZFP = true;
        this.GI83zq0G8e7zkn = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        ColorStateList colorStateList2 = this.ZfQNn8hdWlEQ5cR94249PDsLR.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        wL6lQKsoxy wl6lqksoxy = this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj;
        return wl6lqksoxy != null && wl6lqksoxy.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public final void jW7EiD0YL6xkbB158jMUzhWNWb1y() {
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        float f = uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.p59rPv72J9 + 0.0f;
        uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.Ca81ebIan1u = (int) Math.ceil(0.75f * f);
        this.ZfQNn8hdWlEQ5cR94249PDsLR.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = (int) Math.ceil(f * 0.25f);
        ko09zE6UAgwkV();
        super.invalidateSelf();
    }

    public final boolean ko09zE6UAgwkV() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.TaDO7ogis3aEiWEtq;
        PorterDuffColorFilter porterDuffColorFilter3 = this.Irh5auREsoeV1C1RaBamlmy;
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ColorStateList colorStateList = uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        PorterDuff.Mode mode = uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (colorStateList == null || mode == null) {
            int color = this.pYmKDYlAmhudp.getColor();
            int iV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(color);
            porterDuffColorFilter = iV57tEvNfxZVVcOCAOih5PKr != color ? new PorterDuffColorFilter(iV57tEvNfxZVVcOCAOih5PKr, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(V57tEvNfxZVVcOCAOih5PKr(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.TaDO7ogis3aEiWEtq = porterDuffColorFilter;
        this.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        this.Irh5auREsoeV1C1RaBamlmy = null;
        this.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.TaDO7ogis3aEiWEtq) && Objects.equals(porterDuffColorFilter3, this.Irh5auREsoeV1C1RaBamlmy)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.NSjgqmGjEzuugn2SsG1mZFP = true;
        this.GI83zq0G8e7zkn = true;
        super.onBoundsChange(rect);
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj != null && !rect.isEmpty()) {
            pYmKDYlAmhudp(getState(), this.RhfGHxtXxy0M0grmp2jkRjQg);
        }
        this.RhfGHxtXxy0M0grmp2jkRjQg = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj != null) {
            pYmKDYlAmhudp(iArr, false);
        }
        boolean z = h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iArr) || ko09zE6UAgwkV();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p59rPv72J9(ColorStateList colorStateList) {
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.ZfQNn8hdWlEQ5cR94249PDsLR != colorStateList) {
            uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.ZfQNn8hdWlEQ5cR94249PDsLR = colorStateList;
            onStateChange(getState());
        }
    }

    public final void pYmKDYlAmhudp(int[] iArr, boolean z) {
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i;
        RectF rectFZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ();
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj == null || rectFZLZeBXTMq0zDztBxtRTuCHrapQ.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.SuB3hEmTmbbRGAhtvOOmfKEon == null);
        if (this.aXO0LSrt8bKV == null) {
            this.aXO0LSrt8bKV = new float[4];
        }
        wL6lQKsoxy wl6lqksoxy = this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj;
        XdVIZOnOVHGi6uYUaae4zAI94b[] xdVIZOnOVHGi6uYUaae4zAI94bArr = wl6lqksoxy.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = wl6lqksoxy.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int[][] iArr2 = wl6lqksoxy.V57tEvNfxZVVcOCAOih5PKr;
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e = wl6lqksoxy.NSjgqmGjEzuugn2SsG1mZFP;
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e2 = wl6lqksoxy.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e3 = wl6lqksoxy.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        p4ej2wQUoGVPNvYl4WCI1bg3E p4ej2wquogvpnvyl4wci1bg3e4 = wl6lqksoxy.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    i = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
            }
            i3 = i;
        }
        if (p4ej2wquogvpnvyl4wci1bg3e4 == null && p4ej2wquogvpnvyl4wci1bg3e3 == null && p4ej2wquogvpnvyl4wci1bg3e2 == null && p4ej2wquogvpnvyl4wci1bg3e == null) {
            xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m = xdVIZOnOVHGi6uYUaae4zAI94bArr[i3];
        } else {
            jFJXX88X4vgYX5CG85l5EyqW8AAH jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE = xdVIZOnOVHGi6uYUaae4zAI94bArr[i3].zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            if (p4ej2wquogvpnvyl4wci1bg3e4 != null) {
                jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x = p4ej2wquogvpnvyl4wci1bg3e4.V57tEvNfxZVVcOCAOih5PKr(iArr);
            }
            if (p4ej2wquogvpnvyl4wci1bg3e3 != null) {
                jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE = p4ej2wquogvpnvyl4wci1bg3e3.V57tEvNfxZVVcOCAOih5PKr(iArr);
            }
            if (p4ej2wquogvpnvyl4wci1bg3e2 != null) {
                jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP = p4ej2wquogvpnvyl4wci1bg3e2.V57tEvNfxZVVcOCAOih5PKr(iArr);
            }
            if (p4ej2wquogvpnvyl4wci1bg3e != null) {
                jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ = p4ej2wquogvpnvyl4wci1bg3e.V57tEvNfxZVVcOCAOih5PKr(iArr);
            }
            xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m = jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        int i5 = 0;
        while (i5 < 4) {
            this.vBGA6pPLqSMuYGvprl270j7.getClass();
            float fVxUQ9tBhpHJ2AAEDNW8sghc4m = (i5 != 1 ? i5 != 2 ? i5 != 3 ? xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE : xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x : xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP : xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m.ZLZeBXTMq0zDztBxtRTuCHrapQ).VxUQ9tBhpHJ2AAEDNW8sghc4m(rectFZLZeBXTMq0zDztBxtRTuCHrapQ);
            if (z2) {
                this.aXO0LSrt8bKV[i5] = fVxUQ9tBhpHJ2AAEDNW8sghc4m;
            }
            GN4aJILnYJzlN5Sb[] gN4aJILnYJzlN5SbArr = this.pzqP2AqKW6J5PO8zCKnW;
            GN4aJILnYJzlN5Sb gN4aJILnYJzlN5Sb = gN4aJILnYJzlN5SbArr[i5];
            if (gN4aJILnYJzlN5Sb != null) {
                gN4aJILnYJzlN5Sb.VxUQ9tBhpHJ2AAEDNW8sghc4m(fVxUQ9tBhpHJ2AAEDNW8sghc4m);
                if (z2) {
                    gN4aJILnYJzlN5SbArr[i5].ZfQNn8hdWlEQ5cR94249PDsLR();
                }
            }
            i5++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final void q1wNbhk2O6(float f) {
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.p59rPv72J9 != f) {
            uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.p59rPv72J9 = f;
            jW7EiD0YL6xkbB158jMUzhWNWb1y();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.KUYypEB4eNWOZWVDpH != i) {
            uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.KUYypEB4eNWOZWVDpH = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        super.invalidateSelf();
    }

    @Override // com.vdodsodjsdt.dqrRplqyPGe
    public final void setShapeAppearanceModel(XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b) {
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.VxUQ9tBhpHJ2AAEDNW8sghc4m = xdVIZOnOVHGi6uYUaae4zAI94b;
        uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.zzpBGItXfub0yWj = null;
        this.aXO0LSrt8bKV = null;
        this.vE4yDIjexsP2lGjLaTcB = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE = colorStateList;
        ko09zE6UAgwkV();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.ZLZeBXTMq0zDztBxtRTuCHrapQ != mode) {
            uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.ZLZeBXTMq0zDztBxtRTuCHrapQ = mode;
            ko09zE6UAgwkV();
            super.invalidateSelf();
        }
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Canvas canvas) {
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b = this.qNPQb1obP7;
        float[] fArr = this.vE4yDIjexsP2lGjLaTcB;
        RectF rectFZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ();
        RectF rectF = this.p59rPv72J9;
        rectF.set(rectFZLZeBXTMq0zDztBxtRTuCHrapQ);
        float fGI83zq0G8e7zkn = GI83zq0G8e7zkn();
        rectF.inset(fGI83zq0G8e7zkn, fGI83zq0G8e7zkn);
        LaeGQIruHQu81hfJldjMOQSVblH3x(canvas, this.ko09zE6UAgwkV, this.KUYypEB4eNWOZWVDpH, xdVIZOnOVHGi6uYUaae4zAI94b, fArr, rectF);
    }

    public EQz8nVyVxmIrHN6fNCQWutFG0b30O(Context context, AttributeSet attributeSet, int i, int i2) {
        this(XdVIZOnOVHGi6uYUaae4zAI94b.zzpBGItXfub0yWj(context, attributeSet, i, i2).VxUQ9tBhpHJ2AAEDNW8sghc4m());
    }

    public EQz8nVyVxmIrHN6fNCQWutFG0b30O(XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b) {
        this(new UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3(xdVIZOnOVHGi6uYUaae4zAI94b));
    }

    public EQz8nVyVxmIrHN6fNCQWutFG0b30O(UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3) {
        Yl6XIohGSfgJzxL8v7MoePiWZ yl6XIohGSfgJzxL8v7MoePiWZ;
        this.V57tEvNfxZVVcOCAOih5PKr = new UjGaonxlpbbHvs2pOnMd(this);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new tUXokta1kz8LOMVlvrJggS9nWYr3z[4];
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new tUXokta1kz8LOMVlvrJggS9nWYr3z[4];
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new BitSet(8);
        this.M9e7PWhFYLD2lOGMker = new Matrix();
        this.HzCpKshMOoaw76hFcbOVRYMeRd = new Path();
        this.KUYypEB4eNWOZWVDpH = new Path();
        this.q1wNbhk2O6 = new RectF();
        this.p59rPv72J9 = new RectF();
        this.Ca81ebIan1u = new Region();
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new Region();
        Paint paint = new Paint(1);
        this.pYmKDYlAmhudp = paint;
        Paint paint2 = new Paint(1);
        this.ko09zE6UAgwkV = paint2;
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = new RZFzCZImjJp0J();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            yl6XIohGSfgJzxL8v7MoePiWZ = jbAAh2dfa9imk6FU2sMc2tyTbT.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        } else {
            yl6XIohGSfgJzxL8v7MoePiWZ = new Yl6XIohGSfgJzxL8v7MoePiWZ();
        }
        this.vBGA6pPLqSMuYGvprl270j7 = yl6XIohGSfgJzxL8v7MoePiWZ;
        this.q11o1hieEkZDhF1MGOZI26oZiDT = new RectF();
        this.w0Wu95l8dVNw5rZMRu = true;
        this.RhfGHxtXxy0M0grmp2jkRjQg = true;
        this.pzqP2AqKW6J5PO8zCKnW = new GN4aJILnYJzlN5Sb[4];
        this.ZfQNn8hdWlEQ5cR94249PDsLR = uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        ko09zE6UAgwkV();
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(getState());
        this.f6ZQsR6bPLvvCDNXOUc = new UjGaonxlpbbHvs2pOnMd(this);
    }
}
