package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class hWsX15LBWoRzT {
    public int Ca81ebIan1u;
    public final LinearInterpolator GI83zq0G8e7zkn;
    public PointF HzCpKshMOoaw76hFcbOVRYMeRd;
    public final DisplayMetrics KUYypEB4eNWOZWVDpH;
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final DecelerateInterpolator M9e7PWhFYLD2lOGMker;
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public wbBBe1vAdVO1DmSg1odNaySAYTu V57tEvNfxZVVcOCAOih5PKr;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m = -1;
    public final b2njgckk3JkU43cI67 ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public int h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public float p59rPv72J9;
    public boolean q1wNbhk2O6;
    public View zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public RecyclerView zzpBGItXfub0yWj;

    public hWsX15LBWoRzT(Context context) {
        b2njgckk3JkU43cI67 b2njgckk3jku43ci67 = new b2njgckk3JkU43cI67();
        b2njgckk3jku43ci67.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
        b2njgckk3jku43ci67.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
        b2njgckk3jku43ci67.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        b2njgckk3jku43ci67.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        b2njgckk3jku43ci67.zzpBGItXfub0yWj = 0;
        b2njgckk3jku43ci67.V57tEvNfxZVVcOCAOih5PKr = Integer.MIN_VALUE;
        b2njgckk3jku43ci67.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = b2njgckk3jku43ci67;
        this.GI83zq0G8e7zkn = new LinearInterpolator();
        this.M9e7PWhFYLD2lOGMker = new DecelerateInterpolator();
        this.q1wNbhk2O6 = false;
        this.Ca81ebIan1u = 0;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 0;
        this.KUYypEB4eNWOZWVDpH = context.getResources().getDisplayMetrics();
    }

    public static int VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public final void GI83zq0G8e7zkn() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 0;
            this.Ca81ebIan1u = 0;
            this.HzCpKshMOoaw76hFcbOVRYMeRd = null;
            this.zzpBGItXfub0yWj.H2VFYNJEVGAX.VxUQ9tBhpHJ2AAEDNW8sghc4m = -1;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = -1;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
            wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.V57tEvNfxZVVcOCAOih5PKr;
            if (wbbbe1vadvo1dmsg1odnaysaytu.LaeGQIruHQu81hfJldjMOQSVblH3x == this) {
                wbbbe1vadvo1dmsg1odnaysaytu.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
            }
            this.V57tEvNfxZVVcOCAOih5PKr = null;
            this.zzpBGItXfub0yWj = null;
        }
    }

    public int LaeGQIruHQu81hfJldjMOQSVblH3x(int i) {
        float fAbs = Math.abs(i);
        if (!this.q1wNbhk2O6) {
            this.p59rPv72J9 = ZfQNn8hdWlEQ5cR94249PDsLR(this.KUYypEB4eNWOZWVDpH);
            this.q1wNbhk2O6 = true;
        }
        return (int) Math.ceil(fAbs * this.p59rPv72J9);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void NSjgqmGjEzuugn2SsG1mZFP(android.view.View r7, com.vdodsodjsdt.b2njgckk3JkU43cI67 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.HzCpKshMOoaw76hFcbOVRYMeRd
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r3
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r0 = r6.zzpBGItXfub0yWj(r7, r0)
            android.graphics.PointF r5 = r6.HzCpKshMOoaw76hFcbOVRYMeRd
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r7 = r6.V57tEvNfxZVVcOCAOih5PKr(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.LaeGQIruHQu81hfJldjMOQSVblH3x(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.VxUQ9tBhpHJ2AAEDNW8sghc4m = r0
            r8.zzpBGItXfub0yWj = r7
            r8.V57tEvNfxZVVcOCAOih5PKr = r1
            android.view.animation.DecelerateInterpolator r7 = r6.M9e7PWhFYLD2lOGMker
            r8.LaeGQIruHQu81hfJldjMOQSVblH3x = r7
            r8.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.hWsX15LBWoRzT.NSjgqmGjEzuugn2SsG1mZFP(android.view.View, com.vdodsodjsdt.b2njgckk3JkU43cI67):void");
    }

    public int V57tEvNfxZVVcOCAOih5PKr(View view, int i) {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.V57tEvNfxZVVcOCAOih5PKr;
        if (wbbbe1vadvo1dmsg1odnaysaytu == null || !wbbbe1vadvo1dmsg1odnaysaytu.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            return 0;
        }
        YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) view.getLayoutParams();
        return VxUQ9tBhpHJ2AAEDNW8sghc4m((view.getTop() - ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).zzpBGItXfub0yWj.top) - ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).topMargin, view.getBottom() + ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).zzpBGItXfub0yWj.bottom + ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).bottomMargin, wbbbe1vadvo1dmsg1odnaysaytu.HVEwbdULInpTNa0IG(), wbbbe1vadvo1dmsg1odnaysaytu.Ca81ebIan1u - wbbbe1vadvo1dmsg1odnaysaytu.aXO0LSrt8bKV(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.hWsX15LBWoRzT.ZLZeBXTMq0zDztBxtRTuCHrapQ(int, int):void");
    }

    public float ZfQNn8hdWlEQ5cR94249PDsLR(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public PointF zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        Object obj = this.V57tEvNfxZVVcOCAOih5PKr;
        if (obj instanceof HwNYcAGldMPcCAM0eNF) {
            return ((HwNYcAGldMPcCAM0eNF) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + HwNYcAGldMPcCAM0eNF.class.getCanonicalName());
        return null;
    }

    public int zzpBGItXfub0yWj(View view, int i) {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.V57tEvNfxZVVcOCAOih5PKr;
        if (wbbbe1vadvo1dmsg1odnaysaytu == null || !wbbbe1vadvo1dmsg1odnaysaytu.ZfQNn8hdWlEQ5cR94249PDsLR()) {
            return 0;
        }
        YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) view.getLayoutParams();
        return VxUQ9tBhpHJ2AAEDNW8sghc4m((view.getLeft() - ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).zzpBGItXfub0yWj.left) - ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).leftMargin, view.getRight() + ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).zzpBGItXfub0yWj.right + ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).rightMargin, wbbbe1vadvo1dmsg1odnaysaytu.vE4yDIjexsP2lGjLaTcB(), wbbbe1vadvo1dmsg1odnaysaytu.p59rPv72J9 - wbbbe1vadvo1dmsg1odnaysaytu.O1xDAlBZZlZdoEf747lCFHld(), i);
    }
}
