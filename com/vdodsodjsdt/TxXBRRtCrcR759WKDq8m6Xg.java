package com.vdodsodjsdt;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class TxXBRRtCrcR759WKDq8m6Xg {
    public static final oPArt9CaBB TaDO7ogis3aEiWEtq = new oPArt9CaBB(1);
    public final int Ca81ebIan1u;
    public int[] GI83zq0G8e7zkn;
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public VelocityTracker KUYypEB4eNWOZWVDpH;
    public float[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int[] M9e7PWhFYLD2lOGMker;
    public int[] NSjgqmGjEzuugn2SsG1mZFP;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public float[] ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public float[] ZfQNn8hdWlEQ5cR94249PDsLR;
    public final CoordinatorLayout f6ZQsR6bPLvvCDNXOUc;
    public final OverScroller h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public View ko09zE6UAgwkV;
    public final float p59rPv72J9;
    public final F44whnLsbQ pYmKDYlAmhudp;
    public final float q1wNbhk2O6;
    public float[] zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final int zzpBGItXfub0yWj;
    public int V57tEvNfxZVVcOCAOih5PKr = -1;
    public final RfOSIaL6qUBGKJY9MSCBP5ba vBGA6pPLqSMuYGvprl270j7 = new RfOSIaL6qUBGKJY9MSCBP5ba(15, this);

    public TxXBRRtCrcR759WKDq8m6Xg(Context context, CoordinatorLayout coordinatorLayout, F44whnLsbQ f44whnLsbQ) {
        if (f44whnLsbQ == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f6ZQsR6bPLvvCDNXOUc = coordinatorLayout;
        this.pYmKDYlAmhudp = f44whnLsbQ;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.Ca81ebIan1u = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.zzpBGItXfub0yWj = viewConfiguration.getScaledTouchSlop();
        this.q1wNbhk2O6 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.p59rPv72J9 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new OverScroller(context, TaDO7ogis3aEiWEtq);
    }

    public final boolean Ca81ebIan1u(int i, int i2) {
        if (this.jW7EiD0YL6xkbB158jMUzhWNWb1y) {
            return NSjgqmGjEzuugn2SsG1mZFP(i, i2, (int) this.KUYypEB4eNWOZWVDpH.getXVelocity(this.V57tEvNfxZVVcOCAOih5PKr), (int) this.KUYypEB4eNWOZWVDpH.getYVelocity(this.V57tEvNfxZVVcOCAOih5PKr));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean GI83zq0G8e7zkn(int i) {
        if ((this.HzCpKshMOoaw76hFcbOVRYMeRd & (1 << i)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd() {
        VelocityTracker velocityTracker = this.KUYypEB4eNWOZWVDpH;
        float f = this.q1wNbhk2O6;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.KUYypEB4eNWOZWVDpH.getXVelocity(this.V57tEvNfxZVVcOCAOih5PKr);
        float fAbs = Math.abs(xVelocity);
        float f2 = this.p59rPv72J9;
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.KUYypEB4eNWOZWVDpH.getYVelocity(this.V57tEvNfxZVVcOCAOih5PKr);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f2) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = true;
        this.pYmKDYlAmhudp.L8DMw02rUTs2w(this.ko09zE6UAgwkV, xVelocity, f);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = false;
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1) {
            p59rPv72J9(0);
        }
    }

    public final void KUYypEB4eNWOZWVDpH(float f, float f2, int i) {
        float[] fArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.NSjgqmGjEzuugn2SsG1mZFP;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.GI83zq0G8e7zkn;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.M9e7PWhFYLD2lOGMker;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR = fArr2;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = fArr3;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = fArr4;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = fArr5;
            this.NSjgqmGjEzuugn2SsG1mZFP = iArr;
            this.GI83zq0G8e7zkn = iArr2;
            this.M9e7PWhFYLD2lOGMker = iArr3;
        }
        float[] fArr9 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.NSjgqmGjEzuugn2SsG1mZFP;
        int i3 = (int) f;
        int i4 = (int) f2;
        CoordinatorLayout coordinatorLayout = this.f6ZQsR6bPLvvCDNXOUc;
        int left = coordinatorLayout.getLeft();
        int i5 = this.Ca81ebIan1u;
        int i6 = i3 < left + i5 ? 1 : 0;
        if (i4 < coordinatorLayout.getTop() + i5) {
            i6 |= 4;
        }
        if (i3 > coordinatorLayout.getRight() - i5) {
            i6 |= 2;
        }
        if (i4 > coordinatorLayout.getBottom() - i5) {
            i6 |= 8;
        }
        iArr7[i] = i6;
        this.HzCpKshMOoaw76hFcbOVRYMeRd |= 1 << i;
    }

    public final int LaeGQIruHQu81hfJldjMOQSVblH3x(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.f6ZQsR6bPLvvCDNXOUc.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final void M9e7PWhFYLD2lOGMker(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        if (this.KUYypEB4eNWOZWVDpH == null) {
            this.KUYypEB4eNWOZWVDpH = VelocityTracker.obtain();
        }
        this.KUYypEB4eNWOZWVDpH.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ((int) x, (int) y);
            KUYypEB4eNWOZWVDpH(x, y, pointerId);
            pYmKDYlAmhudp(viewZLZeBXTMq0zDztBxtRTuCHrapQ, pointerId);
            int i3 = this.NSjgqmGjEzuugn2SsG1mZFP[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1) {
                HzCpKshMOoaw76hFcbOVRYMeRd();
            }
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
            return;
        }
        F44whnLsbQ f44whnLsbQ = this.pYmKDYlAmhudp;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1) {
                    this.jW7EiD0YL6xkbB158jMUzhWNWb1y = true;
                    f44whnLsbQ.L8DMw02rUTs2w(this.ko09zE6UAgwkV, 0.0f, 0.0f);
                    this.jW7EiD0YL6xkbB158jMUzhWNWb1y = false;
                    if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1) {
                        p59rPv72J9(0);
                    }
                }
                VxUQ9tBhpHJ2AAEDNW8sghc4m();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                KUYypEB4eNWOZWVDpH(x2, y2, pointerId2);
                if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 0) {
                    pYmKDYlAmhudp(ZLZeBXTMq0zDztBxtRTuCHrapQ((int) x2, (int) y2), pointerId2);
                    int i4 = this.NSjgqmGjEzuugn2SsG1mZFP[pointerId2];
                    return;
                }
                int i5 = (int) x2;
                int i6 = (int) y2;
                View view = this.ko09zE6UAgwkV;
                if (view != null && i5 >= view.getLeft() && i5 < view.getRight() && i6 >= view.getTop() && i6 < view.getBottom()) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    pYmKDYlAmhudp(this.ko09zE6UAgwkV, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1 && pointerId3 == this.V57tEvNfxZVVcOCAOih5PKr) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i2 >= pointerCount) {
                        i = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i2);
                    if (pointerId4 != this.V57tEvNfxZVVcOCAOih5PKr) {
                        View viewZLZeBXTMq0zDztBxtRTuCHrapQ2 = ZLZeBXTMq0zDztBxtRTuCHrapQ((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                        View view2 = this.ko09zE6UAgwkV;
                        if (viewZLZeBXTMq0zDztBxtRTuCHrapQ2 == view2 && pYmKDYlAmhudp(view2, pointerId4)) {
                            i = this.V57tEvNfxZVVcOCAOih5PKr;
                            break;
                        }
                    }
                    i2++;
                }
                if (i == -1) {
                    HzCpKshMOoaw76hFcbOVRYMeRd();
                }
            }
            ZfQNn8hdWlEQ5cR94249PDsLR(pointerId3);
            return;
        }
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1) {
            if (GI83zq0G8e7zkn(this.V57tEvNfxZVVcOCAOih5PKr)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.V57tEvNfxZVVcOCAOih5PKr);
                float x3 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                int i7 = this.V57tEvNfxZVVcOCAOih5PKr;
                int i8 = (int) (x3 - fArr[i7]);
                int i9 = (int) (y3 - this.ZLZeBXTMq0zDztBxtRTuCHrapQ[i7]);
                int left = this.ko09zE6UAgwkV.getLeft() + i8;
                int top = this.ko09zE6UAgwkV.getTop() + i9;
                int left2 = this.ko09zE6UAgwkV.getLeft();
                int top2 = this.ko09zE6UAgwkV.getTop();
                if (i8 != 0) {
                    left = f44whnLsbQ.ZLZeBXTMq0zDztBxtRTuCHrapQ(this.ko09zE6UAgwkV, left);
                    WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    this.ko09zE6UAgwkV.offsetLeftAndRight(left - left2);
                }
                if (i9 != 0) {
                    top = f44whnLsbQ.NSjgqmGjEzuugn2SsG1mZFP(this.ko09zE6UAgwkV, top);
                    WeakHashMap weakHashMap2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    this.ko09zE6UAgwkV.offsetTopAndBottom(top - top2);
                }
                if (i8 != 0 || i9 != 0) {
                    f44whnLsbQ.gBaBUmihn5l4u(this.ko09zE6UAgwkV, left, top);
                }
                q1wNbhk2O6(motionEvent);
                return;
            }
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        while (i2 < pointerCount2) {
            int pointerId5 = motionEvent.getPointerId(i2);
            if (GI83zq0G8e7zkn(pointerId5)) {
                float x4 = motionEvent.getX(i2);
                float y4 = motionEvent.getY(i2);
                float f = x4 - this.ZfQNn8hdWlEQ5cR94249PDsLR[pointerId5];
                float f2 = y4 - this.LaeGQIruHQu81hfJldjMOQSVblH3x[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i10 = this.NSjgqmGjEzuugn2SsG1mZFP[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i11 = this.NSjgqmGjEzuugn2SsG1mZFP[pointerId5];
                Math.abs(f);
                Math.abs(f2);
                int i12 = this.NSjgqmGjEzuugn2SsG1mZFP[pointerId5];
                Math.abs(f2);
                Math.abs(f);
                int i13 = this.NSjgqmGjEzuugn2SsG1mZFP[pointerId5];
                if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m != 1) {
                    View viewZLZeBXTMq0zDztBxtRTuCHrapQ3 = ZLZeBXTMq0zDztBxtRTuCHrapQ((int) x4, (int) y4);
                    if (V57tEvNfxZVVcOCAOih5PKr(viewZLZeBXTMq0zDztBxtRTuCHrapQ3, f, f2) && pYmKDYlAmhudp(viewZLZeBXTMq0zDztBxtRTuCHrapQ3, pointerId5)) {
                        break;
                    }
                } else {
                    break;
                }
            }
            i2++;
        }
        q1wNbhk2O6(motionEvent);
    }

    public final boolean NSjgqmGjEzuugn2SsG1mZFP(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.ko09zE6UAgwkV.getLeft();
        int top = this.ko09zE6UAgwkV.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            p59rPv72J9(0);
            return false;
        }
        View view = this.ko09zE6UAgwkV;
        int i7 = (int) this.p59rPv72J9;
        int i8 = (int) this.q1wNbhk2O6;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i7) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i9 = iAbs5 + iAbs6;
        int i10 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i9;
        } else {
            f = iAbs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i9;
        } else {
            f3 = iAbs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        F44whnLsbQ f44whnLsbQ = this.pYmKDYlAmhudp;
        overScroller.startScroll(left, top, i5, i6, (int) ((LaeGQIruHQu81hfJldjMOQSVblH3x(i6, i4, f44whnLsbQ.O1xDAlBZZlZdoEf747lCFHld()) * f6) + (LaeGQIruHQu81hfJldjMOQSVblH3x(i5, i3, f44whnLsbQ.vE4yDIjexsP2lGjLaTcB(view)) * f5)));
        p59rPv72J9(2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean V57tEvNfxZVVcOCAOih5PKr(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            com.vdodsodjsdt.F44whnLsbQ r1 = r3.pYmKDYlAmhudp
            int r4 = r1.vE4yDIjexsP2lGjLaTcB(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.O1xDAlBZZlZdoEf747lCFHld()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.zzpBGItXfub0yWj
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.zzpBGItXfub0yWj
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.zzpBGItXfub0yWj
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.TxXBRRtCrcR759WKDq8m6Xg.V57tEvNfxZVVcOCAOih5PKr(android.view.View, float, float):boolean");
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        this.V57tEvNfxZVVcOCAOih5PKr = -1;
        float[] fArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.LaeGQIruHQu81hfJldjMOQSVblH3x, 0.0f);
            Arrays.fill(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, 0.0f);
            Arrays.fill(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, 0.0f);
            Arrays.fill(this.NSjgqmGjEzuugn2SsG1mZFP, 0);
            Arrays.fill(this.GI83zq0G8e7zkn, 0);
            Arrays.fill(this.M9e7PWhFYLD2lOGMker, 0);
            this.HzCpKshMOoaw76hFcbOVRYMeRd = 0;
        }
        VelocityTracker velocityTracker = this.KUYypEB4eNWOZWVDpH;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.KUYypEB4eNWOZWVDpH = null;
        }
    }

    public final View ZLZeBXTMq0zDztBxtRTuCHrapQ(int i, int i2) {
        CoordinatorLayout coordinatorLayout = this.f6ZQsR6bPLvvCDNXOUc;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.pYmKDYlAmhudp.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(int i) {
        float[] fArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (fArr != null) {
            int i2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x[i] = 0.0f;
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i] = 0.0f;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ[i] = 0.0f;
                this.NSjgqmGjEzuugn2SsG1mZFP[i] = 0;
                this.GI83zq0G8e7zkn[i] = 0;
                this.M9e7PWhFYLD2lOGMker[i] = 0;
                this.HzCpKshMOoaw76hFcbOVRYMeRd = (~i3) & i2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.TxXBRRtCrcR759WKDq8m6Xg.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(android.view.MotionEvent):boolean");
    }

    public final void p59rPv72J9(int i) {
        this.f6ZQsR6bPLvvCDNXOUc.removeCallbacks(this.vBGA6pPLqSMuYGvprl270j7);
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m != i) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
            this.pYmKDYlAmhudp.wRCD0SdqWCowdYU7bmzN(i);
            if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 0) {
                this.ko09zE6UAgwkV = null;
            }
        }
    }

    public final boolean pYmKDYlAmhudp(View view, int i) {
        if (view == this.ko09zE6UAgwkV && this.V57tEvNfxZVVcOCAOih5PKr == i) {
            return true;
        }
        if (view == null || !this.pYmKDYlAmhudp.bjhcQ0u7VT2OYYrwk96HrWoN(view, i)) {
            return false;
        }
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        zzpBGItXfub0yWj(view, i);
        return true;
    }

    public final void q1wNbhk2O6(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (GI83zq0G8e7zkn(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[pointerId] = x;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ[pointerId] = y;
            }
        }
    }

    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 2) {
            OverScroller overScroller = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.ko09zE6UAgwkV.getLeft();
            int top = currY - this.ko09zE6UAgwkV.getTop();
            if (left != 0) {
                View view = this.ko09zE6UAgwkV;
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.ko09zE6UAgwkV;
                WeakHashMap weakHashMap2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.pYmKDYlAmhudp.gBaBUmihn5l4u(this.ko09zE6UAgwkV, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f6ZQsR6bPLvvCDNXOUc.post(this.vBGA6pPLqSMuYGvprl270j7);
            }
        }
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 2;
    }

    public final void zzpBGItXfub0yWj(View view, int i) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f6ZQsR6bPLvvCDNXOUc;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.ko09zE6UAgwkV = view;
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.pYmKDYlAmhudp.YdNRGRc4rly(view, i);
        p59rPv72J9(1);
    }
}
