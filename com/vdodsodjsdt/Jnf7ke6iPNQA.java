package com.vdodsodjsdt;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Jnf7ke6iPNQA implements View.OnTouchListener {
    public static final int f6ZQsR6bPLvvCDNXOUc = ViewConfiguration.getTapTimeout();
    public boolean Ca81ebIan1u;
    public final int GI83zq0G8e7zkn;
    public final float[] HzCpKshMOoaw76hFcbOVRYMeRd;
    public final float[] KUYypEB4eNWOZWVDpH;
    public final aVXgxTePUTvRAcd LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final int M9e7PWhFYLD2lOGMker;
    public final float[] NSjgqmGjEzuugn2SsG1mZFP;
    public final zbMNieF8U6MpcpVyFtbE V57tEvNfxZVVcOCAOih5PKr;
    public final float[] ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final AccelerateInterpolator ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final aVXgxTePUTvRAcd jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public boolean ko09zE6UAgwkV;
    public boolean p59rPv72J9;
    public boolean pYmKDYlAmhudp;
    public final float[] q1wNbhk2O6;
    public RfOSIaL6qUBGKJY9MSCBP5ba zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public Jnf7ke6iPNQA(aVXgxTePUTvRAcd avxgxteputvracd) {
        zbMNieF8U6MpcpVyFtbE zbmnief8u6mpcpvyftbe = new zbMNieF8U6MpcpVyFtbE();
        zbmnief8u6mpcpvyftbe.LaeGQIruHQu81hfJldjMOQSVblH3x = Long.MIN_VALUE;
        zbmnief8u6mpcpvyftbe.ZLZeBXTMq0zDztBxtRTuCHrapQ = -1L;
        zbmnief8u6mpcpvyftbe.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0L;
        this.V57tEvNfxZVVcOCAOih5PKr = zbmnief8u6mpcpvyftbe;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.NSjgqmGjEzuugn2SsG1mZFP = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.HzCpKshMOoaw76hFcbOVRYMeRd = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.KUYypEB4eNWOZWVDpH = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.q1wNbhk2O6 = fArr5;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = avxgxteputvracd;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.GI83zq0G8e7zkn = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.M9e7PWhFYLD2lOGMker = f6ZQsR6bPLvvCDNXOUc;
        zbmnief8u6mpcpvyftbe.VxUQ9tBhpHJ2AAEDNW8sghc4m = 500;
        zbmnief8u6mpcpvyftbe.zzpBGItXfub0yWj = 500;
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = avxgxteputvracd;
    }

    public static float zzpBGItXfub0yWj(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x() {
        aVXgxTePUTvRAcd avxgxteputvracd;
        int count;
        zbMNieF8U6MpcpVyFtbE zbmnief8u6mpcpvyftbe = this.V57tEvNfxZVVcOCAOih5PKr;
        float f = zbmnief8u6mpcpvyftbe.ZfQNn8hdWlEQ5cR94249PDsLR;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(zbmnief8u6mpcpvyftbe.V57tEvNfxZVVcOCAOih5PKr);
        if (iAbs != 0 && (count = (avxgxteputvracd = this.jW7EiD0YL6xkbB158jMUzhWNWb1y).getCount()) != 0) {
            int childCount = avxgxteputvracd.getChildCount();
            int firstVisiblePosition = avxgxteputvracd.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && avxgxteputvracd.getChildAt(0).getTop() >= 0)) : !(i >= count && avxgxteputvracd.getChildAt(childCount - 1).getBottom() <= avxgxteputvracd.getHeight())) {
                return true;
            }
        }
        return false;
    }

    public final float V57tEvNfxZVVcOCAOih5PKr(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.GI83zq0G8e7zkn;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.pYmKDYlAmhudp && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float VxUQ9tBhpHJ2AAEDNW8sghc4m(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.ZLZeBXTMq0zDztBxtRTuCHrapQ
            r0 = r0[r4]
            float[] r1 = r3.NSjgqmGjEzuugn2SsG1mZFP
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = zzpBGItXfub0yWj(r0, r2, r1)
            float r1 = r3.V57tEvNfxZVVcOCAOih5PKr(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.V57tEvNfxZVVcOCAOih5PKr(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.ZfQNn8hdWlEQ5cR94249PDsLR
            if (r6 >= 0) goto L25
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L2d
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L36
            float r5 = r0.getInterpolation(r5)
        L2d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = zzpBGItXfub0yWj(r5, r6, r0)
            goto L37
        L36:
            r5 = r2
        L37:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.HzCpKshMOoaw76hFcbOVRYMeRd
            r0 = r0[r4]
            float[] r1 = r3.KUYypEB4eNWOZWVDpH
            r1 = r1[r4]
            float[] r2 = r3.q1wNbhk2O6
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L51
            float r5 = r5 * r0
            float r4 = zzpBGItXfub0yWj(r5, r1, r4)
            return r4
        L51:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = zzpBGItXfub0yWj(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.Jnf7ke6iPNQA.VxUQ9tBhpHJ2AAEDNW8sghc4m(int, float, float, float):float");
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        int i = 0;
        if (this.Ca81ebIan1u) {
            this.pYmKDYlAmhudp = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        zbMNieF8U6MpcpVyFtbE zbmnief8u6mpcpvyftbe = this.V57tEvNfxZVVcOCAOih5PKr;
        int i2 = (int) (jCurrentAnimationTimeMillis - zbmnief8u6mpcpvyftbe.LaeGQIruHQu81hfJldjMOQSVblH3x);
        int i3 = zbmnief8u6mpcpvyftbe.zzpBGItXfub0yWj;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        zbmnief8u6mpcpvyftbe.GI83zq0G8e7zkn = i;
        zbmnief8u6mpcpvyftbe.NSjgqmGjEzuugn2SsG1mZFP = zbmnief8u6mpcpvyftbe.VxUQ9tBhpHJ2AAEDNW8sghc4m(jCurrentAnimationTimeMillis);
        zbmnief8u6mpcpvyftbe.ZLZeBXTMq0zDztBxtRTuCHrapQ = jCurrentAnimationTimeMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.ko09zE6UAgwkV
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.ZfQNn8hdWlEQ5cR94249PDsLR()
            return r1
        L1b:
            r7.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = r2
            r7.p59rPv72J9 = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            com.vdodsodjsdt.aVXgxTePUTvRAcd r4 = r7.LaeGQIruHQu81hfJldjMOQSVblH3x
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.VxUQ9tBhpHJ2AAEDNW8sghc4m(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.VxUQ9tBhpHJ2AAEDNW8sghc4m(r2, r9, r8, r3)
            com.vdodsodjsdt.zbMNieF8U6MpcpVyFtbE r9 = r7.V57tEvNfxZVVcOCAOih5PKr
            r9.V57tEvNfxZVVcOCAOih5PKr = r0
            r9.ZfQNn8hdWlEQ5cR94249PDsLR = r8
            boolean r8 = r7.pYmKDYlAmhudp
            if (r8 != 0) goto L7c
            boolean r8 = r7.LaeGQIruHQu81hfJldjMOQSVblH3x()
            if (r8 == 0) goto L7c
            com.vdodsodjsdt.RfOSIaL6qUBGKJY9MSCBP5ba r8 = r7.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            if (r8 != 0) goto L60
            com.vdodsodjsdt.RfOSIaL6qUBGKJY9MSCBP5ba r8 = new com.vdodsodjsdt.RfOSIaL6qUBGKJY9MSCBP5ba
            r8.<init>(r1, r7)
            r7.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r8
        L60:
            r7.pYmKDYlAmhudp = r2
            r7.Ca81ebIan1u = r2
            boolean r8 = r7.p59rPv72J9
            if (r8 != 0) goto L75
            int r8 = r7.M9e7PWhFYLD2lOGMker
            if (r8 <= 0) goto L75
            com.vdodsodjsdt.RfOSIaL6qUBGKJY9MSCBP5ba r9 = r7.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            long r5 = (long) r8
            java.util.WeakHashMap r8 = com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            com.vdodsodjsdt.RfOSIaL6qUBGKJY9MSCBP5ba r8 = r7.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            r8.run()
        L7a:
            r7.p59rPv72J9 = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.Jnf7ke6iPNQA.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
