package com.vdodsodjsdt;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Y8unnL6HZ8WXVIsfrePA3V331ck implements Runnable {
    public final /* synthetic */ RecyclerView GI83zq0G8e7zkn;
    public OverScroller LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public Interpolator zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public Y8unnL6HZ8WXVIsfrePA3V331ck(RecyclerView recyclerView) {
        this.GI83zq0G8e7zkn = recyclerView;
        oPArt9CaBB opart9cabb = RecyclerView.Pf1HsU8AK92buCoUaexm5AC;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = opart9cabb;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
        this.NSjgqmGjEzuugn2SsG1mZFP = false;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new OverScroller(recyclerView.getContext(), opart9cabb);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            this.NSjgqmGjEzuugn2SsG1mZFP = true;
            return;
        }
        RecyclerView recyclerView = this.GI83zq0G8e7zkn;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        RecyclerView recyclerView = this.GI83zq0G8e7zkn;
        int[] iArr = recyclerView.tpEo0fy9FaoJYrSFHRfIK6;
        if (recyclerView.p59rPv72J9 == null) {
            recyclerView.removeCallbacks(this);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.abortAnimation();
            return;
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = false;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        recyclerView.q1wNbhk2O6();
        OverScroller overScroller = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.V57tEvNfxZVVcOCAOih5PKr;
            int i6 = currY - this.ZfQNn8hdWlEQ5cR94249PDsLR;
            this.V57tEvNfxZVVcOCAOih5PKr = currX;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = currY;
            int[] iArr2 = recyclerView.tpEo0fy9FaoJYrSFHRfIK6;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.ko09zE6UAgwkV(i5, i6, 1, iArr2, null)) {
                i = i5 - iArr[0];
                i2 = i6 - iArr[1];
            } else {
                i = i5;
                i2 = i6;
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.KUYypEB4eNWOZWVDpH(i, i2);
            }
            if (recyclerView.q1wNbhk2O6 != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.wdI7vzA3Qmcwd(i, i2, iArr);
                i3 = iArr[0];
                i4 = iArr[1];
                i -= i3;
                i2 -= i4;
                hWsX15LBWoRzT hwsx15lbworzt = recyclerView.p59rPv72J9.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (hwsx15lbworzt != null && !hwsx15lbworzt.ZfQNn8hdWlEQ5cR94249PDsLR && hwsx15lbworzt.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    int iZzpBGItXfub0yWj = recyclerView.H2VFYNJEVGAX.zzpBGItXfub0yWj();
                    if (iZzpBGItXfub0yWj == 0) {
                        hwsx15lbworzt.GI83zq0G8e7zkn();
                    } else if (hwsx15lbworzt.VxUQ9tBhpHJ2AAEDNW8sghc4m >= iZzpBGItXfub0yWj) {
                        hwsx15lbworzt.VxUQ9tBhpHJ2AAEDNW8sghc4m = iZzpBGItXfub0yWj - 1;
                        hwsx15lbworzt.ZLZeBXTMq0zDztBxtRTuCHrapQ(i3, i4);
                    } else {
                        hwsx15lbworzt.ZLZeBXTMq0zDztBxtRTuCHrapQ(i3, i4);
                    }
                }
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.tpEo0fy9FaoJYrSFHRfIK6;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.jW7EiD0YL6xkbB158jMUzhWNWb1y(i3, i4, i, i2, null, 1, iArr3);
            int i7 = i - iArr[0];
            int i8 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.f6ZQsR6bPLvvCDNXOUc(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i7 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i8 != 0));
            hWsX15LBWoRzT hwsx15lbworzt2 = recyclerView.p59rPv72J9.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if ((hwsx15lbworzt2 == null || !hwsx15lbworzt2.ZfQNn8hdWlEQ5cR94249PDsLR) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i9 = i7 < 0 ? -currVelocity : i7 > 0 ? currVelocity : 0;
                    if (i8 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i8 <= 0) {
                        currVelocity = 0;
                    }
                    if (i9 < 0) {
                        recyclerView.TaDO7ogis3aEiWEtq();
                        if (recyclerView.HVEwbdULInpTNa0IG.isFinished()) {
                            recyclerView.HVEwbdULInpTNa0IG.onAbsorb(-i9);
                        }
                    } else if (i9 > 0) {
                        recyclerView.Irh5auREsoeV1C1RaBamlmy();
                        if (recyclerView.qygqjTppWwx992.isFinished()) {
                            recyclerView.qygqjTppWwx992.onAbsorb(i9);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.q11o1hieEkZDhF1MGOZI26oZiDT();
                        if (recyclerView.y1NaPKTl7R18DOr6e8i5.isFinished()) {
                            recyclerView.y1NaPKTl7R18DOr6e8i5.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.vBGA6pPLqSMuYGvprl270j7();
                        if (recyclerView.iKANjmyTSxO6v6UuLPdu7DxOjlS.isFinished()) {
                            recyclerView.iKANjmyTSxO6v6UuLPdu7DxOjlS.onAbsorb(currVelocity);
                        }
                    }
                    if (i9 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                MSl7hPM6XqjxyBV5m mSl7hPM6XqjxyBV5m = recyclerView.rERAmyEtGV6ANGszuKcQI;
                int[] iArr4 = (int[]) mSl7hPM6XqjxyBV5m.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                mSl7hPM6XqjxyBV5m.V57tEvNfxZVVcOCAOih5PKr = 0;
            } else {
                VxUQ9tBhpHJ2AAEDNW8sghc4m();
                SobBKwD5hB sobBKwD5hB = recyclerView.GE1sqSYiEYQO2ew7WEZwTtUeS5;
                if (sobBKwD5hB != null) {
                    sobBKwD5hB.VxUQ9tBhpHJ2AAEDNW8sghc4m(recyclerView, i3, i4);
                }
            }
        }
        hWsX15LBWoRzT hwsx15lbworzt3 = recyclerView.p59rPv72J9.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (hwsx15lbworzt3 != null && hwsx15lbworzt3.ZfQNn8hdWlEQ5cR94249PDsLR) {
            hwsx15lbworzt3.ZLZeBXTMq0zDztBxtRTuCHrapQ(0, 0);
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
        if (!this.NSjgqmGjEzuugn2SsG1mZFP) {
            recyclerView.setScrollState(0);
            recyclerView.H2VFYNJEVGAX(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            recyclerView.postOnAnimation(this);
        }
    }

    public final void zzpBGItXfub0yWj(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.GI83zq0G8e7zkn;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.Pf1HsU8AK92buCoUaexm5AC;
        }
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE != interpolator) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = interpolator;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
        recyclerView.setScrollState(2);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.startScroll(0, 0, i, i2, i4);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }
}
