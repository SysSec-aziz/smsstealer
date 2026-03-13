package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class lNG0v0TTGdvR {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ ConstraintLayout NSjgqmGjEzuugn2SsG1mZFP;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public final ConstraintLayout VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj;

    public lNG0v0TTGdvR(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.NSjgqmGjEzuugn2SsG1mZFP = constraintLayout;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = constraintLayout2;
    }

    public static boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void zzpBGItXfub0yWj(IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD, Cmxkosub3Ql97Ws cmxkosub3Ql97Ws) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z;
        int measuredWidth;
        int baseline;
        int i;
        if (iPwvkMKvXW4H2mJtQ4szs9vgoyzLD == null) {
            return;
        }
        pySSTLZ4BX pysstlz4bx = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.TqcnImqkSWIKht;
        pySSTLZ4BX pysstlz4bx2 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.qygqjTppWwx992;
        if (iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.tFRdVJAePmTx77bP7FAN0uI == 8) {
            cmxkosub3Ql97Ws.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
            cmxkosub3Ql97Ws.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
            cmxkosub3Ql97Ws.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
            return;
        }
        if (iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.JUdwvN8LfOMa == null) {
            return;
        }
        UlQZeuagqs4TIUmXokyaAXI ulQZeuagqs4TIUmXokyaAXI = ConstraintLayout.ko09zE6UAgwkV;
        int i2 = cmxkosub3Ql97Ws.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i3 = cmxkosub3Ql97Ws.zzpBGItXfub0yWj;
        int i4 = cmxkosub3Ql97Ws.V57tEvNfxZVVcOCAOih5PKr;
        int i5 = cmxkosub3Ql97Ws.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i6 = this.zzpBGItXfub0yWj + this.V57tEvNfxZVVcOCAOih5PKr;
        int i7 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        View view = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.BJQHddi0Plr5ElWetCyaixWOg9;
        int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i2);
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, i7, -2);
        } else if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, i7, -2);
            boolean z2 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.ko09zE6UAgwkV == 1;
            int i8 = cmxkosub3Ql97Ws.M9e7PWhFYLD2lOGMker;
            if (i8 == 1 || i8 == 2) {
                boolean z3 = view.getMeasuredHeight() == iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.HzCpKshMOoaw76hFcbOVRYMeRd();
                if (cmxkosub3Ql97Ws.M9e7PWhFYLD2lOGMker == 2 || !z2 || ((z2 && z3) || iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.qNPQb1obP7())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.pYmKDYlAmhudp(), 1073741824);
                }
            }
        } else if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            int i10 = pysstlz4bx2 != null ? pysstlz4bx2.ZLZeBXTMq0zDztBxtRTuCHrapQ : 0;
            if (pysstlz4bx != null) {
                i10 += pysstlz4bx.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv2 = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i3);
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, i6, -2);
        } else if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, i6, -2);
            boolean z4 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.jW7EiD0YL6xkbB158jMUzhWNWb1y == 1;
            int i11 = cmxkosub3Ql97Ws.M9e7PWhFYLD2lOGMker;
            if (i11 == 1 || i11 == 2) {
                boolean z5 = view.getMeasuredWidth() == iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.pYmKDYlAmhudp();
                if (cmxkosub3Ql97Ws.M9e7PWhFYLD2lOGMker == 2 || !z4 || ((z4 && z5) || iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.SuB3hEmTmbbRGAhtvOOmfKEon())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.HzCpKshMOoaw76hFcbOVRYMeRd(), 1073741824);
                }
            }
        } else if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            int i13 = pysstlz4bx2 != null ? iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.iKANjmyTSxO6v6UuLPdu7DxOjlS.ZLZeBXTMq0zDztBxtRTuCHrapQ : 0;
            if (pysstlz4bx != null) {
                i13 += iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.d9zDyyznnp3oaDT1Ug.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        rwLNq3eKZ2vnR0XP rwlnq3ekz2vnr0xp = (rwLNq3eKZ2vnR0XP) iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.JUdwvN8LfOMa;
        ConstraintLayout constraintLayout = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (rwlnq3ekz2vnr0xp != null && F44whnLsbQ.pYmKDYlAmhudp(constraintLayout.HzCpKshMOoaw76hFcbOVRYMeRd, 256) && view.getMeasuredWidth() == iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.pYmKDYlAmhudp() && view.getMeasuredWidth() < rwlnq3ekz2vnr0xp.pYmKDYlAmhudp() && view.getMeasuredHeight() == iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.HzCpKshMOoaw76hFcbOVRYMeRd() && view.getMeasuredHeight() < rwlnq3ekz2vnr0xp.HzCpKshMOoaw76hFcbOVRYMeRd() && view.getBaseline() == iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.GE1sqSYiEYQO2ew7WEZwTtUeS5 && !iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.RhfGHxtXxy0M0grmp2jkRjQg() && VxUQ9tBhpHJ2AAEDNW8sghc4m(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.HVEwbdULInpTNa0IG, iMakeMeasureSpec, iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.pYmKDYlAmhudp()) && VxUQ9tBhpHJ2AAEDNW8sghc4m(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.y1NaPKTl7R18DOr6e8i5, iMakeMeasureSpec2, iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.HzCpKshMOoaw76hFcbOVRYMeRd())) {
            cmxkosub3Ql97Ws.LaeGQIruHQu81hfJldjMOQSVblH3x = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.pYmKDYlAmhudp();
            cmxkosub3Ql97Ws.zIvmSL0wzmmKGc3X39b2Gw2mUGE = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.HzCpKshMOoaw76hFcbOVRYMeRd();
            cmxkosub3Ql97Ws.ZLZeBXTMq0zDztBxtRTuCHrapQ = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.GE1sqSYiEYQO2ew7WEZwTtUeS5;
            return;
        }
        boolean z6 = i2 == 3;
        boolean z7 = i3 == 3;
        boolean z8 = i3 == 4 || i3 == 1;
        boolean z9 = i2 == 4 || i2 == 1;
        boolean z10 = z6 && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.vXWl0o6I4U59CgHs9 > 0.0f;
        boolean z11 = z7 && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.vXWl0o6I4U59CgHs9 > 0.0f;
        if (view == null) {
            return;
        }
        ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK = (ZtjVvctVhW3SMibpO0L8oqBK) view.getLayoutParams();
        int i14 = cmxkosub3Ql97Ws.M9e7PWhFYLD2lOGMker;
        if (i14 != 1 && i14 != 2 && z6 && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.ko09zE6UAgwkV == 0 && z7 && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.jW7EiD0YL6xkbB158jMUzhWNWb1y == 0) {
            z = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            iMax = 0;
        } else {
            if ((view instanceof GFeljEsbymBhGciw30II44) && (iPwvkMKvXW4H2mJtQ4szs9vgoyzLD instanceof ETGFvpcKttQxmnhLAuvWanREdFHb)) {
                ((GFeljEsbymBhGciw30II44) view).M9e7PWhFYLD2lOGMker((ETGFvpcKttQxmnhLAuvWanREdFHb) iPwvkMKvXW4H2mJtQ4szs9vgoyzLD, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.HVEwbdULInpTNa0IG = iMakeMeasureSpec;
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.y1NaPKTl7R18DOr6e8i5 = iMakeMeasureSpec2;
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.vBGA6pPLqSMuYGvprl270j7;
            int iMax2 = i15 > 0 ? Math.max(i15, measuredWidth2) : measuredWidth2;
            int i16 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.TaDO7ogis3aEiWEtq;
            if (i16 > 0) {
                iMax2 = Math.min(i16, iMax2);
            }
            int i17 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.q11o1hieEkZDhF1MGOZI26oZiDT;
            iMax = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.w0Wu95l8dVNw5rZMRu;
            if (i19 > 0) {
                iMax = Math.min(i19, iMax);
            }
            if (!F44whnLsbQ.pYmKDYlAmhudp(constraintLayout.HzCpKshMOoaw76hFcbOVRYMeRd, 1)) {
                if (z10 && z8) {
                    iMax2 = (int) ((iMax * iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.vXWl0o6I4U59CgHs9) + 0.5f);
                } else if (z11 && z9) {
                    iMax = (int) ((iMax2 / iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.vXWl0o6I4U59CgHs9) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.HVEwbdULInpTNa0IG = iMakeMeasureSpec;
                iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.y1NaPKTl7R18DOr6e8i5 = iMakeMeasureSpec3;
                z = false;
                iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i = -1;
        }
        boolean z12 = baseline != i ? true : z;
        cmxkosub3Ql97Ws.GI83zq0G8e7zkn = (measuredWidth == cmxkosub3Ql97Ws.V57tEvNfxZVVcOCAOih5PKr && iMax == cmxkosub3Ql97Ws.ZfQNn8hdWlEQ5cR94249PDsLR) ? z : true;
        boolean z13 = ztjVvctVhW3SMibpO0L8oqBK.H2VFYNJEVGAX ? true : z12;
        if (z13 && baseline != -1 && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.GE1sqSYiEYQO2ew7WEZwTtUeS5 != baseline) {
            cmxkosub3Ql97Ws.GI83zq0G8e7zkn = true;
        }
        cmxkosub3Ql97Ws.LaeGQIruHQu81hfJldjMOQSVblH3x = measuredWidth;
        cmxkosub3Ql97Ws.zIvmSL0wzmmKGc3X39b2Gw2mUGE = iMax;
        cmxkosub3Ql97Ws.NSjgqmGjEzuugn2SsG1mZFP = z13;
        cmxkosub3Ql97Ws.ZLZeBXTMq0zDztBxtRTuCHrapQ = baseline;
    }
}
