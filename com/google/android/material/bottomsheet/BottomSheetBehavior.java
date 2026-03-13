package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vdodsodjsdt.A98HZyzY3RCp6DiHu;
import com.vdodsodjsdt.BNoQqrcMvME0Kvh0ZlMVKK2;
import com.vdodsodjsdt.CjBKDKxRxbOUeFYdCfJaTPtG8dj1;
import com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O;
import com.vdodsodjsdt.F44whnLsbQ;
import com.vdodsodjsdt.LJI4giD1cT20DI;
import com.vdodsodjsdt.M9TaMBovb7u6bH;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.QXRsDWGmFmSzZT6WcvPRDxeKS8;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.TQMQBENV49PLMwKLaeaEMWAtYlx;
import com.vdodsodjsdt.TxXBRRtCrcR759WKDq8m6Xg;
import com.vdodsodjsdt.UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3;
import com.vdodsodjsdt.UtURWB5bbAd9;
import com.vdodsodjsdt.XTgu373Rjd8ehP4U3Nj;
import com.vdodsodjsdt.XdVIZOnOVHGi6uYUaae4zAI94b;
import com.vdodsodjsdt.XlWrlojquhLGe;
import com.vdodsodjsdt.bIfzvLMNoeNlsDciz;
import com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq;
import com.vdodsodjsdt.dXZw8zZnRXsRIYJEIdZC;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.hEzujSQMPyLOvX;
import com.vdodsodjsdt.hYBX8vZiJlAsljhv3;
import com.vdodsodjsdt.jj77w443kpEYEOqOOio;
import com.vdodsodjsdt.lJgFFp37ou;
import com.vdodsodjsdt.m8WKJH6JbFg;
import com.vdodsodjsdt.u9SlVAuoWhQUfJ;
import com.vdodsodjsdt.xEETVD81ziRcL5BcSKUT7ajvxHmaB;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import com.vdodsodjsdt.z8uyl4sTQr2O9dK1e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends m8WKJH6JbFg {
    public final LJI4giD1cT20DI BJQHddi0Plr5ElWetCyaixWOg9;
    public final boolean Ca81ebIan1u;
    public boolean CixTK5ZX8oWXHz34qHYV;
    public int GE1sqSYiEYQO2ew7WEZwTtUeS5;
    public final EQz8nVyVxmIrHN6fNCQWutFG0b30O GI83zq0G8e7zkn;
    public boolean H2VFYNJEVGAX;
    public int HVEwbdULInpTNa0IG;
    public final int HzCpKshMOoaw76hFcbOVRYMeRd;
    public int Irh5auREsoeV1C1RaBamlmy;
    public int ItrQwCXbty5PZtje5JS;
    public int JUdwvN8LfOMa;
    public final int KUYypEB4eNWOZWVDpH;
    public final ArrayList KYZ9RyuOc42A2J;
    public boolean L8DMw02rUTs2w;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final ColorStateList M9e7PWhFYLD2lOGMker;
    public final int NSjgqmGjEzuugn2SsG1mZFP;
    public final float O1xDAlBZZlZdoEf747lCFHld;
    public boolean RhfGHxtXxy0M0grmp2jkRjQg;
    public final ValueAnimator SuB3hEmTmbbRGAhtvOOmfKEon;
    public int TaDO7ogis3aEiWEtq;
    public final boolean TqcnImqkSWIKht;
    public final float V57tEvNfxZVVcOCAOih5PKr;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public TxXBRRtCrcR759WKDq8m6Xg YdNRGRc4rly;
    public HashMap Z1FjjMJ0suz8AFI7gsA4GDLMXv;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int aXO0LSrt8bKV;
    public final SparseIntArray bjhcQ0u7VT2OYYrwk96HrWoN;
    public final boolean d9zDyyznnp3oaDT1Ug;
    public final boolean f6ZQsR6bPLvvCDNXOUc;
    public int gBaBUmihn5l4u;
    public final boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public int hKs1wlZyvtUNaW1f5ABIGacfPcvX;
    public boolean iKANjmyTSxO6v6UuLPdu7DxOjlS;
    public final boolean jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final boolean ko09zE6UAgwkV;
    public final float lQ0rO9lhQIyVe7Rp6;
    public final boolean p59rPv72J9;
    public final boolean pYmKDYlAmhudp;
    public final int pzqP2AqKW6J5PO8zCKnW;
    public final boolean q11o1hieEkZDhF1MGOZI26oZiDT;
    public int q1wNbhk2O6;
    public final bIfzvLMNoeNlsDciz qNPQb1obP7;
    public boolean qygqjTppWwx992;
    public int rERAmyEtGV6ANGszuKcQI;
    public final boolean vBGA6pPLqSMuYGvprl270j7;
    public int vE4yDIjexsP2lGjLaTcB;
    public WeakReference vXWl0o6I4U59CgHs9;
    public final XdVIZOnOVHGi6uYUaae4zAI94b w0Wu95l8dVNw5rZMRu;
    public boolean wRCD0SdqWCowdYU7bmzN;
    public WeakReference wdI7vzA3Qmcwd;
    public final float y1NaPKTl7R18DOr6e8i5;
    public int ymT6yQrus3w;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public VelocityTracker zOk739gUM7zIZC25HHUxoiyixWFjn;
    public boolean zzpBGItXfub0yWj;

    public BottomSheetBehavior() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        this.zzpBGItXfub0yWj = true;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = -1;
        this.KUYypEB4eNWOZWVDpH = -1;
        this.qNPQb1obP7 = new bIfzvLMNoeNlsDciz(this);
        this.O1xDAlBZZlZdoEf747lCFHld = 0.5f;
        this.y1NaPKTl7R18DOr6e8i5 = -1.0f;
        this.TqcnImqkSWIKht = true;
        this.d9zDyyznnp3oaDT1Ug = true;
        this.ymT6yQrus3w = 4;
        this.lQ0rO9lhQIyVe7Rp6 = 0.1f;
        this.KYZ9RyuOc42A2J = new ArrayList();
        this.rERAmyEtGV6ANGszuKcQI = -1;
        this.bjhcQ0u7VT2OYYrwk96HrWoN = new SparseIntArray();
        this.BJQHddi0Plr5ElWetCyaixWOg9 = new LJI4giD1cT20DI(this, 0);
    }

    public static int Irh5auREsoeV1C1RaBamlmy(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static View TaDO7ogis3aEiWEtq(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq(viewGroup.getChildAt(i));
            if (viewTaDO7ogis3aEiWEtq != null) {
                return viewTaDO7ogis3aEiWEtq;
            }
        }
        return null;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean Ca81ebIan1u(View view, int i, int i2) {
        this.gBaBUmihn5l4u = 0;
        this.L8DMw02rUTs2w = false;
        return (i & 2) != 0;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean GI83zq0G8e7zkn(View view) {
        WeakReference weakReference = this.wdI7vzA3Qmcwd;
        return (weakReference == null || view != weakReference.get() || this.ymT6yQrus3w == 3 || this.CixTK5ZX8oWXHz34qHYV) ? false : true;
    }

    public final void HVEwbdULInpTNa0IG(int i, boolean z) {
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O;
        if (i == 2) {
            return;
        }
        boolean z2 = this.ymT6yQrus3w == 3 && (this.q11o1hieEkZDhF1MGOZI26oZiDT || RhfGHxtXxy0M0grmp2jkRjQg());
        if (this.RhfGHxtXxy0M0grmp2jkRjQg == z2 || (eQz8nVyVxmIrHN6fNCQWutFG0b30O = this.GI83zq0G8e7zkn) == null) {
            return;
        }
        this.RhfGHxtXxy0M0grmp2jkRjQg = z2;
        ValueAnimator valueAnimator = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        if (z && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(eQz8nVyVxmIrHN6fNCQWutFG0b30O.ZfQNn8hdWlEQ5cR94249PDsLR.M9e7PWhFYLD2lOGMker, z2 ? jW7EiD0YL6xkbB158jMUzhWNWb1y() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fJW7EiD0YL6xkbB158jMUzhWNWb1y = this.RhfGHxtXxy0M0grmp2jkRjQg ? jW7EiD0YL6xkbB158jMUzhWNWb1y() : 1.0f;
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = eQz8nVyVxmIrHN6fNCQWutFG0b30O.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.M9e7PWhFYLD2lOGMker != fJW7EiD0YL6xkbB158jMUzhWNWb1y) {
            uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.M9e7PWhFYLD2lOGMker = fJW7EiD0YL6xkbB158jMUzhWNWb1y;
            eQz8nVyVxmIrHN6fNCQWutFG0b30O.NSjgqmGjEzuugn2SsG1mZFP = true;
            eQz8nVyVxmIrHN6fNCQWutFG0b30O.GI83zq0G8e7zkn = true;
            eQz8nVyVxmIrHN6fNCQWutFG0b30O.invalidateSelf();
        }
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        this.vXWl0o6I4U59CgHs9 = null;
        this.YdNRGRc4rly = null;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void M9e7PWhFYLD2lOGMker(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.wdI7vzA3Qmcwd;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        boolean z = this.TqcnImqkSWIKht;
        boolean z2 = this.d9zDyyznnp3oaDT1Ug;
        if (i2 > 0) {
            if (!this.L8DMw02rUTs2w && !z2 && view2 == view3 && view2.canScrollVertically(1)) {
                this.CixTK5ZX8oWXHz34qHYV = true;
                return;
            }
            if (i4 < q11o1hieEkZDhF1MGOZI26oZiDT()) {
                int iQ11o1hieEkZDhF1MGOZI26oZiDT = top - q11o1hieEkZDhF1MGOZI26oZiDT();
                iArr[1] = iQ11o1hieEkZDhF1MGOZI26oZiDT;
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                view.offsetTopAndBottom(-iQ11o1hieEkZDhF1MGOZI26oZiDT);
                pzqP2AqKW6J5PO8zCKnW(3);
            } else {
                if (!z) {
                    return;
                }
                iArr[1] = i2;
                WeakHashMap weakHashMap2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                view.offsetTopAndBottom(-i2);
                pzqP2AqKW6J5PO8zCKnW(1);
            }
        } else if (i2 < 0) {
            boolean zCanScrollVertically = view2.canScrollVertically(-1);
            if (!this.L8DMw02rUTs2w && !z2 && view2 == view3 && zCanScrollVertically) {
                this.CixTK5ZX8oWXHz34qHYV = true;
                return;
            }
            if (!zCanScrollVertically) {
                int i5 = this.HVEwbdULInpTNa0IG;
                if (i4 > i5 && !this.qygqjTppWwx992) {
                    int i6 = top - i5;
                    iArr[1] = i6;
                    WeakHashMap weakHashMap3 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    view.offsetTopAndBottom(-i6);
                    pzqP2AqKW6J5PO8zCKnW(4);
                } else {
                    if (!z) {
                        return;
                    }
                    iArr[1] = i2;
                    WeakHashMap weakHashMap4 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    view.offsetTopAndBottom(-i2);
                    pzqP2AqKW6J5PO8zCKnW(1);
                }
            }
        }
        vBGA6pPLqSMuYGvprl270j7(view.getTop());
        this.gBaBUmihn5l4u = i2;
        this.L8DMw02rUTs2w = true;
        this.CixTK5ZX8oWXHz34qHYV = false;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean NSjgqmGjEzuugn2SsG1mZFP(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(Irh5auREsoeV1C1RaBamlmy(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.HzCpKshMOoaw76hFcbOVRYMeRd, marginLayoutParams.width), Irh5auREsoeV1C1RaBamlmy(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.KUYypEB4eNWOZWVDpH, marginLayoutParams.height));
        return true;
    }

    public final void O1xDAlBZZlZdoEf747lCFHld() {
        View view;
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m;
        WeakReference weakReference = this.vXWl0o6I4U59CgHs9;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        xb0r6yEzq0tw9m7nTWG5BFR8.M9e7PWhFYLD2lOGMker(view, 524288);
        xb0r6yEzq0tw9m7nTWG5BFR8.NSjgqmGjEzuugn2SsG1mZFP(view, 0);
        xb0r6yEzq0tw9m7nTWG5BFR8.M9e7PWhFYLD2lOGMker(view, 262144);
        xb0r6yEzq0tw9m7nTWG5BFR8.NSjgqmGjEzuugn2SsG1mZFP(view, 0);
        xb0r6yEzq0tw9m7nTWG5BFR8.M9e7PWhFYLD2lOGMker(view, 1048576);
        xb0r6yEzq0tw9m7nTWG5BFR8.NSjgqmGjEzuugn2SsG1mZFP(view, 0);
        SparseIntArray sparseIntArray = this.bjhcQ0u7VT2OYYrwk96HrWoN;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            xb0r6yEzq0tw9m7nTWG5BFR8.M9e7PWhFYLD2lOGMker(view, i);
            xb0r6yEzq0tw9m7nTWG5BFR8.NSjgqmGjEzuugn2SsG1mZFP(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.zzpBGItXfub0yWj && this.ymT6yQrus3w != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            z8uyl4sTQr2O9dK1e z8uyl4stqr2o9dk1e = new z8uyl4sTQr2O9dK1e(this, 6);
            ArrayList arrayListZIvmSL0wzmmKGc3X39b2Gw2mUGE = xb0r6yEzq0tw9m7nTWG5BFR8.zIvmSL0wzmmKGc3X39b2Gw2mUGE(view);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayListZIvmSL0wzmmKGc3X39b2Gw2mUGE.size()) {
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        int[] iArr = xb0r6yEzq0tw9m7nTWG5BFR8.ZfQNn8hdWlEQ5cR94249PDsLR;
                        if (i3 >= 32 || i4 != -1) {
                            break;
                        }
                        int i5 = iArr[i3];
                        boolean z = true;
                        for (int i6 = 0; i6 < arrayListZIvmSL0wzmmKGc3X39b2Gw2mUGE.size(); i6++) {
                            z &= ((jj77w443kpEYEOqOOio) arrayListZIvmSL0wzmmKGc3X39b2Gw2mUGE.get(i6)).VxUQ9tBhpHJ2AAEDNW8sghc4m() != i5;
                        }
                        if (z) {
                            i4 = i5;
                        }
                        i3++;
                    }
                    iVxUQ9tBhpHJ2AAEDNW8sghc4m = i4;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((jj77w443kpEYEOqOOio) arrayListZIvmSL0wzmmKGc3X39b2Gw2mUGE.get(i2)).VxUQ9tBhpHJ2AAEDNW8sghc4m).getLabel())) {
                        iVxUQ9tBhpHJ2AAEDNW8sghc4m = ((jj77w443kpEYEOqOOio) arrayListZIvmSL0wzmmKGc3X39b2Gw2mUGE.get(i2)).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        break;
                    }
                    i2++;
                }
            }
            if (iVxUQ9tBhpHJ2AAEDNW8sghc4m != -1) {
                jj77w443kpEYEOqOOio jj77w443kpeyeoqooio = new jj77w443kpEYEOqOOio(null, iVxUQ9tBhpHJ2AAEDNW8sghc4m, string, z8uyl4stqr2o9dk1e, null);
                View.AccessibilityDelegate accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR = xb0r6yEzq0tw9m7nTWG5BFR8.ZfQNn8hdWlEQ5cR94249PDsLR(view);
                dOYOTnFcxbQY9kd8M4lnq doyotnfcxbqy9kd8m4lnq = accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR == null ? null : accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR instanceof BNoQqrcMvME0Kvh0ZlMVKK2 ? ((BNoQqrcMvME0Kvh0ZlMVKK2) accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR).VxUQ9tBhpHJ2AAEDNW8sghc4m : new dOYOTnFcxbQY9kd8M4lnq(accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR);
                if (doyotnfcxbqy9kd8m4lnq == null) {
                    doyotnfcxbqy9kd8m4lnq = new dOYOTnFcxbQY9kd8M4lnq();
                }
                xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(view, doyotnfcxbqy9kd8m4lnq);
                xb0r6yEzq0tw9m7nTWG5BFR8.M9e7PWhFYLD2lOGMker(view, jj77w443kpeyeoqooio.VxUQ9tBhpHJ2AAEDNW8sghc4m());
                xb0r6yEzq0tw9m7nTWG5BFR8.zIvmSL0wzmmKGc3X39b2Gw2mUGE(view).add(jj77w443kpeyeoqooio);
                xb0r6yEzq0tw9m7nTWG5BFR8.NSjgqmGjEzuugn2SsG1mZFP(view, 0);
            }
            sparseIntArray.put(0, iVxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        if (this.qygqjTppWwx992 && this.ymT6yQrus3w != 5) {
            xb0r6yEzq0tw9m7nTWG5BFR8.HzCpKshMOoaw76hFcbOVRYMeRd(view, jj77w443kpEYEOqOOio.M9e7PWhFYLD2lOGMker, new z8uyl4sTQr2O9dK1e(this, 5));
        }
        int i7 = this.ymT6yQrus3w;
        if (i7 == 3) {
            xb0r6yEzq0tw9m7nTWG5BFR8.HzCpKshMOoaw76hFcbOVRYMeRd(view, jj77w443kpEYEOqOOio.GI83zq0G8e7zkn, new z8uyl4sTQr2O9dK1e(this, this.zzpBGItXfub0yWj ? 4 : 6));
            return;
        }
        if (i7 == 4) {
            xb0r6yEzq0tw9m7nTWG5BFR8.HzCpKshMOoaw76hFcbOVRYMeRd(view, jj77w443kpEYEOqOOio.NSjgqmGjEzuugn2SsG1mZFP, new z8uyl4sTQr2O9dK1e(this, this.zzpBGItXfub0yWj ? 3 : 6));
        } else {
            if (i7 != 6) {
                return;
            }
            xb0r6yEzq0tw9m7nTWG5BFR8.HzCpKshMOoaw76hFcbOVRYMeRd(view, jj77w443kpEYEOqOOio.GI83zq0G8e7zkn, new z8uyl4sTQr2O9dK1e(this, 4));
            xb0r6yEzq0tw9m7nTWG5BFR8.HzCpKshMOoaw76hFcbOVRYMeRd(view, jj77w443kpEYEOqOOio.NSjgqmGjEzuugn2SsG1mZFP, new z8uyl4sTQr2O9dK1e(this, 3));
        }
    }

    public final boolean RhfGHxtXxy0M0grmp2jkRjQg() {
        WeakReference weakReference = this.vXWl0o6I4U59CgHs9;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.vXWl0o6I4U59CgHs9.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public final void SuB3hEmTmbbRGAhtvOOmfKEon(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.qygqjTppWwx992 && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i2 = (i == 6 && this.zzpBGItXfub0yWj && w0Wu95l8dVNw5rZMRu(i) <= this.aXO0LSrt8bKV) ? 3 : i;
        WeakReference weakReference = this.vXWl0o6I4U59CgHs9;
        if (weakReference == null || weakReference.get() == null) {
            pzqP2AqKW6J5PO8zCKnW(i);
            return;
        }
        View view = (View) this.vXWl0o6I4U59CgHs9.get();
        QXRsDWGmFmSzZT6WcvPRDxeKS8 qXRsDWGmFmSzZT6WcvPRDxeKS8 = new QXRsDWGmFmSzZT6WcvPRDxeKS8(this, view, i2);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(qXRsDWGmFmSzZT6WcvPRDxeKS8);
        } else {
            qXRsDWGmFmSzZT6WcvPRDxeKS8.run();
        }
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void V57tEvNfxZVVcOCAOih5PKr(TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx) {
        this.vXWl0o6I4U59CgHs9 = null;
        this.YdNRGRc4rly = null;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.vXWl0o6I4U59CgHs9 == null) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i2 = Build.VERSION.SDK_INT;
            boolean z = (i2 < 29 || this.p59rPv72J9 || this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) ? false : true;
            if (this.Ca81ebIan1u || this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv || this.pYmKDYlAmhudp || this.jW7EiD0YL6xkbB158jMUzhWNWb1y || this.f6ZQsR6bPLvvCDNXOUc || this.vBGA6pPLqSMuYGvprl270j7 || z) {
                xEETVD81ziRcL5BcSKUT7ajvxHmaB xeetvd81zircl5bcskut7ajvxhmab = new xEETVD81ziRcL5BcSKUT7ajvxHmaB(this, z);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                A98HZyzY3RCp6DiHu a98HZyzY3RCp6DiHu = new A98HZyzY3RCp6DiHu();
                a98HZyzY3RCp6DiHu.VxUQ9tBhpHJ2AAEDNW8sghc4m = paddingStart;
                a98HZyzY3RCp6DiHu.zzpBGItXfub0yWj = paddingEnd;
                a98HZyzY3RCp6DiHu.V57tEvNfxZVVcOCAOih5PKr = paddingBottom;
                dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = new dXZw8zZnRXsRIYJEIdZC(xeetvd81zircl5bcskut7ajvxhmab, a98HZyzY3RCp6DiHu);
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                lJgFFp37ou.M9e7PWhFYLD2lOGMker(view, dxzw8zznrxsriyjeidzc);
                if (view.isAttachedToWindow()) {
                    view.requestApplyInsets();
                } else {
                    view.addOnAttachStateChangeListener(new XlWrlojquhLGe());
                }
            }
            hEzujSQMPyLOvX hezujsqmpylovx = new hEzujSQMPyLOvX(view);
            WeakHashMap weakHashMap2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (i2 >= 30) {
                view.setWindowInsetsAnimationCallback(new XTgu373Rjd8ehP4U3Nj(hezujsqmpylovx));
            } else {
                PathInterpolator pathInterpolator = M9TaMBovb7u6bH.LaeGQIruHQu81hfJldjMOQSVblH3x;
                View.OnApplyWindowInsetsListener hybx8vzijlasljhv3 = new hYBX8vZiJlAsljhv3(view, hezujsqmpylovx);
                view.setTag(R.id.tag_window_insets_animation_callback, hybx8vzijlasljhv3);
                if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    view.setOnApplyWindowInsetsListener(hybx8vzijlasljhv3);
                }
            }
            this.vXWl0o6I4U59CgHs9 = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(context, R.attr.motionDurationMedium2, 300);
            ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(context, R.attr.motionDurationShort3, 150);
            ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = this.GI83zq0G8e7zkn;
            if (eQz8nVyVxmIrHN6fNCQWutFG0b30O != null) {
                view.setBackground(eQz8nVyVxmIrHN6fNCQWutFG0b30O);
                float elevation = this.y1NaPKTl7R18DOr6e8i5;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                eQz8nVyVxmIrHN6fNCQWutFG0b30O.q1wNbhk2O6(elevation);
            } else {
                ColorStateList colorStateList = this.M9e7PWhFYLD2lOGMker;
                if (colorStateList != null) {
                    lJgFFp37ou.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, colorStateList);
                }
            }
            O1xDAlBZZlZdoEf747lCFHld();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.YdNRGRc4rly == null) {
            this.YdNRGRc4rly = new TxXBRRtCrcR759WKDq8m6Xg(coordinatorLayout.getContext(), coordinatorLayout, this.BJQHddi0Plr5ElWetCyaixWOg9);
        }
        int top = view.getTop();
        coordinatorLayout.pYmKDYlAmhudp(view, i);
        this.ItrQwCXbty5PZtje5JS = coordinatorLayout.getWidth();
        this.hKs1wlZyvtUNaW1f5ABIGacfPcvX = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.JUdwvN8LfOMa = height;
        int iMin = this.hKs1wlZyvtUNaW1f5ABIGacfPcvX;
        int i3 = iMin - height;
        int i4 = this.Irh5auREsoeV1C1RaBamlmy;
        if (i3 < i4) {
            boolean z2 = this.ko09zE6UAgwkV;
            int i5 = this.KUYypEB4eNWOZWVDpH;
            if (z2) {
                if (i5 != -1) {
                    iMin = Math.min(iMin, i5);
                }
                this.JUdwvN8LfOMa = iMin;
            } else {
                int iMin2 = iMin - i4;
                if (i5 != -1) {
                    iMin2 = Math.min(iMin2, i5);
                }
                this.JUdwvN8LfOMa = iMin2;
            }
        }
        this.aXO0LSrt8bKV = Math.max(0, this.hKs1wlZyvtUNaW1f5ABIGacfPcvX - this.JUdwvN8LfOMa);
        this.vE4yDIjexsP2lGjLaTcB = (int) ((1.0f - this.O1xDAlBZZlZdoEf747lCFHld) * this.hKs1wlZyvtUNaW1f5ABIGacfPcvX);
        ko09zE6UAgwkV();
        int i6 = this.ymT6yQrus3w;
        if (i6 == 3) {
            int iQ11o1hieEkZDhF1MGOZI26oZiDT = q11o1hieEkZDhF1MGOZI26oZiDT();
            WeakHashMap weakHashMap3 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            view.offsetTopAndBottom(iQ11o1hieEkZDhF1MGOZI26oZiDT);
        } else if (i6 == 6) {
            int i7 = this.vE4yDIjexsP2lGjLaTcB;
            WeakHashMap weakHashMap4 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            view.offsetTopAndBottom(i7);
        } else if (this.qygqjTppWwx992 && i6 == 5) {
            int i8 = this.hKs1wlZyvtUNaW1f5ABIGacfPcvX;
            WeakHashMap weakHashMap5 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            view.offsetTopAndBottom(i8);
        } else if (i6 == 4) {
            int i9 = this.HVEwbdULInpTNa0IG;
            WeakHashMap weakHashMap6 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            view.offsetTopAndBottom(i9);
        } else if (i6 == 1 || i6 == 2) {
            int top2 = top - view.getTop();
            WeakHashMap weakHashMap7 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            view.offsetTopAndBottom(top2);
        }
        HVEwbdULInpTNa0IG(this.ymT6yQrus3w, false);
        this.wdI7vzA3Qmcwd = new WeakReference(TaDO7ogis3aEiWEtq(view));
        ArrayList arrayList = this.KYZ9RyuOc42A2J;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final boolean aXO0LSrt8bKV(View view, float f) {
        if (this.iKANjmyTSxO6v6UuLPdu7DxOjlS) {
            return true;
        }
        if (view.getTop() < this.HVEwbdULInpTNa0IG) {
            return false;
        }
        return Math.abs(((f * this.lQ0rO9lhQIyVe7Rp6) + ((float) view.getTop())) - ((float) this.HVEwbdULInpTNa0IG)) / ((float) f6ZQsR6bPLvvCDNXOUc()) > 0.5f;
    }

    public final int f6ZQsR6bPLvvCDNXOUc() {
        int i;
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE ? Math.min(Math.max(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, this.hKs1wlZyvtUNaW1f5ABIGacfPcvX - ((this.ItrQwCXbty5PZtje5JS * 9) / 16)), this.JUdwvN8LfOMa) + this.TaDO7ogis3aEiWEtq : (this.p59rPv72J9 || this.Ca81ebIan1u || (i = this.q1wNbhk2O6) <= 0) ? this.LaeGQIruHQu81hfJldjMOQSVblH3x + this.TaDO7ogis3aEiWEtq : Math.max(this.LaeGQIruHQu81hfJldjMOQSVblH3x, i + this.NSjgqmGjEzuugn2SsG1mZFP);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.q11o1hieEkZDhF1MGOZI26oZiDT()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.pzqP2AqKW6J5PO8zCKnW(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.wdI7vzA3Qmcwd
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.L8DMw02rUTs2w
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.gBaBUmihn5l4u
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.zzpBGItXfub0yWj
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.vE4yDIjexsP2lGjLaTcB
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.qygqjTppWwx992
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.zOk739gUM7zIZC25HHUxoiyixWFjn
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.V57tEvNfxZVVcOCAOih5PKr
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.zOk739gUM7zIZC25HHUxoiyixWFjn
            int r0 = r3.GE1sqSYiEYQO2ew7WEZwTtUeS5
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.aXO0LSrt8bKV(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.gBaBUmihn5l4u
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.zzpBGItXfub0yWj
            if (r2 == 0) goto L74
            int r6 = r3.aXO0LSrt8bKV
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.HVEwbdULInpTNa0IG
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.vE4yDIjexsP2lGjLaTcB
            if (r5 >= r2) goto L83
            int r0 = r3.HVEwbdULInpTNa0IG
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.HVEwbdULInpTNa0IG
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.zzpBGItXfub0yWj
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.vE4yDIjexsP2lGjLaTcB
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.HVEwbdULInpTNa0IG
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.vE4yDIjexsP2lGjLaTcB(r4, r1, r5)
            r3.L8DMw02rUTs2w = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(android.view.View, android.view.View, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float jW7EiD0YL6xkbB158jMUzhWNWb1y() {
        /*
            r5 = this;
            com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O r0 = r5.GI83zq0G8e7zkn
            r1 = 0
            if (r0 == 0) goto L89
            java.lang.ref.WeakReference r0 = r5.vXWl0o6I4U59CgHs9
            if (r0 == 0) goto L89
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L89
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L89
            java.lang.ref.WeakReference r0 = r5.vXWl0o6I4U59CgHs9
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.RhfGHxtXxy0M0grmp2jkRjQg()
            if (r2 == 0) goto L89
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L89
            com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O r2 = r5.GI83zq0G8e7zkn
            float[] r3 = r2.aXO0LSrt8bKV
            if (r3 == 0) goto L33
            r2 = 3
            r2 = r3[r2]
            goto L41
        L33:
            com.vdodsodjsdt.UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 r3 = r2.ZfQNn8hdWlEQ5cR94249PDsLR
            com.vdodsodjsdt.XdVIZOnOVHGi6uYUaae4zAI94b r3 = r3.VxUQ9tBhpHJ2AAEDNW8sghc4m
            com.vdodsodjsdt.WBbGwHQ7q5Zp0OIijyR r3 = r3.LaeGQIruHQu81hfJldjMOQSVblH3x
            android.graphics.RectF r2 = r2.ZLZeBXTMq0zDztBxtRTuCHrapQ()
            float r2 = r3.VxUQ9tBhpHJ2AAEDNW8sghc4m(r2)
        L41:
            android.view.RoundedCorner r3 = com.vdodsodjsdt.T90IXCZZ40nlyyL0UJd.KUYypEB4eNWOZWVDpH(r0)
            if (r3 == 0) goto L56
            int r3 = com.vdodsodjsdt.T90IXCZZ40nlyyL0UJd.ZfQNn8hdWlEQ5cR94249PDsLR(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L56
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L56
            float r3 = r3 / r2
            goto L57
        L56:
            r3 = r1
        L57:
            com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O r2 = r5.GI83zq0G8e7zkn
            float[] r4 = r2.aXO0LSrt8bKV
            if (r4 == 0) goto L61
            r2 = 0
            r2 = r4[r2]
            goto L6f
        L61:
            com.vdodsodjsdt.UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 r4 = r2.ZfQNn8hdWlEQ5cR94249PDsLR
            com.vdodsodjsdt.XdVIZOnOVHGi6uYUaae4zAI94b r4 = r4.VxUQ9tBhpHJ2AAEDNW8sghc4m
            com.vdodsodjsdt.WBbGwHQ7q5Zp0OIijyR r4 = r4.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            android.graphics.RectF r2 = r2.ZLZeBXTMq0zDztBxtRTuCHrapQ()
            float r2 = r4.VxUQ9tBhpHJ2AAEDNW8sghc4m(r2)
        L6f:
            android.view.RoundedCorner r0 = com.vdodsodjsdt.T90IXCZZ40nlyyL0UJd.jW7EiD0YL6xkbB158jMUzhWNWb1y(r0)
            if (r0 == 0) goto L84
            int r0 = com.vdodsodjsdt.T90IXCZZ40nlyyL0UJd.ZfQNn8hdWlEQ5cR94249PDsLR(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L84
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L84
            float r1 = r0 / r2
        L84:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.jW7EiD0YL6xkbB158jMUzhWNWb1y():float");
    }

    public final void ko09zE6UAgwkV() {
        int iF6ZQsR6bPLvvCDNXOUc = f6ZQsR6bPLvvCDNXOUc();
        if (this.zzpBGItXfub0yWj) {
            this.HVEwbdULInpTNa0IG = Math.max(this.hKs1wlZyvtUNaW1f5ABIGacfPcvX - iF6ZQsR6bPLvvCDNXOUc, this.aXO0LSrt8bKV);
        } else {
            this.HVEwbdULInpTNa0IG = this.hKs1wlZyvtUNaW1f5ABIGacfPcvX - iF6ZQsR6bPLvvCDNXOUc;
        }
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final Parcelable p59rPv72J9(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new CjBKDKxRxbOUeFYdCfJaTPtG8dj1(this);
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean pYmKDYlAmhudp(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.ymT6yQrus3w;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        TxXBRRtCrcR759WKDq8m6Xg txXBRRtCrcR759WKDq8m6Xg = this.YdNRGRc4rly;
        if (txXBRRtCrcR759WKDq8m6Xg != null && (this.TqcnImqkSWIKht || i == 1)) {
            txXBRRtCrcR759WKDq8m6Xg.M9e7PWhFYLD2lOGMker(motionEvent);
        }
        if (actionMasked == 0) {
            this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = -1;
            this.rERAmyEtGV6ANGszuKcQI = -1;
            VelocityTracker velocityTracker = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.zOk739gUM7zIZC25HHUxoiyixWFjn = null;
            }
        }
        if (this.zOk739gUM7zIZC25HHUxoiyixWFjn == null) {
            this.zOk739gUM7zIZC25HHUxoiyixWFjn = VelocityTracker.obtain();
        }
        this.zOk739gUM7zIZC25HHUxoiyixWFjn.addMovement(motionEvent);
        if (this.YdNRGRc4rly != null && ((this.TqcnImqkSWIKht || this.ymT6yQrus3w == 1) && actionMasked == 2 && !this.wRCD0SdqWCowdYU7bmzN)) {
            float fAbs = Math.abs(this.rERAmyEtGV6ANGszuKcQI - motionEvent.getY());
            TxXBRRtCrcR759WKDq8m6Xg txXBRRtCrcR759WKDq8m6Xg2 = this.YdNRGRc4rly;
            if (fAbs > txXBRRtCrcR759WKDq8m6Xg2.zzpBGItXfub0yWj) {
                txXBRRtCrcR759WKDq8m6Xg2.zzpBGItXfub0yWj(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.wRCD0SdqWCowdYU7bmzN;
    }

    public final void pzqP2AqKW6J5PO8zCKnW(int i) {
        if (this.ymT6yQrus3w == i) {
            return;
        }
        this.ymT6yQrus3w = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z = this.qygqjTppWwx992;
        }
        WeakReference weakReference = this.vXWl0o6I4U59CgHs9;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            y1NaPKTl7R18DOr6e8i5(true);
        } else if (i == 6 || i == 5 || i == 4) {
            y1NaPKTl7R18DOr6e8i5(false);
        }
        HVEwbdULInpTNa0IG(i, true);
        ArrayList arrayList = this.KYZ9RyuOc42A2J;
        if (arrayList.size() <= 0) {
            O1xDAlBZZlZdoEf747lCFHld();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final int q11o1hieEkZDhF1MGOZI26oZiDT() {
        if (this.zzpBGItXfub0yWj) {
            return this.aXO0LSrt8bKV;
        }
        return Math.max(this.pzqP2AqKW6J5PO8zCKnW, this.ko09zE6UAgwkV ? 0 : this.Irh5auREsoeV1C1RaBamlmy);
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void q1wNbhk2O6(View view, Parcelable parcelable) {
        CjBKDKxRxbOUeFYdCfJaTPtG8dj1 cjBKDKxRxbOUeFYdCfJaTPtG8dj1 = (CjBKDKxRxbOUeFYdCfJaTPtG8dj1) parcelable;
        int i = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = cjBKDKxRxbOUeFYdCfJaTPtG8dj1.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            }
            if (i == -1 || (i & 2) == 2) {
                this.zzpBGItXfub0yWj = cjBKDKxRxbOUeFYdCfJaTPtG8dj1.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            }
            if (i == -1 || (i & 4) == 4) {
                this.qygqjTppWwx992 = cjBKDKxRxbOUeFYdCfJaTPtG8dj1.NSjgqmGjEzuugn2SsG1mZFP;
            }
            if (i == -1 || (i & 8) == 8) {
                this.iKANjmyTSxO6v6UuLPdu7DxOjlS = cjBKDKxRxbOUeFYdCfJaTPtG8dj1.GI83zq0G8e7zkn;
            }
        }
        int i2 = cjBKDKxRxbOUeFYdCfJaTPtG8dj1.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i2 == 1 || i2 == 2) {
            this.ymT6yQrus3w = 4;
        } else {
            this.ymT6yQrus3w = i2;
        }
    }

    public final void qNPQb1obP7(int i) {
        if (i == -1) {
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                return;
            } else {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
            }
        } else {
            if (!this.zIvmSL0wzmmKGc3X39b2Gw2mUGE && this.LaeGQIruHQu81hfJldjMOQSVblH3x == i) {
                return;
            }
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = Math.max(0, i);
        }
        qygqjTppWwx992();
    }

    public final void qygqjTppWwx992() {
        View view;
        if (this.vXWl0o6I4U59CgHs9 != null) {
            ko09zE6UAgwkV();
            if (this.ymT6yQrus3w != 4 || (view = (View) this.vXWl0o6I4U59CgHs9.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public final void vBGA6pPLqSMuYGvprl270j7(int i) {
        if (((View) this.vXWl0o6I4U59CgHs9.get()) != null) {
            ArrayList arrayList = this.KYZ9RyuOc42A2J;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.HVEwbdULInpTNa0IG;
            if (i <= i2 && i2 != q11o1hieEkZDhF1MGOZI26oZiDT()) {
                q11o1hieEkZDhF1MGOZI26oZiDT();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        pzqP2AqKW6J5PO8zCKnW(2);
        HVEwbdULInpTNa0IG(r4, true);
        r2.qNPQb1obP7.VxUQ9tBhpHJ2AAEDNW8sghc4m(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.Ca81ebIan1u(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void vE4yDIjexsP2lGjLaTcB(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.w0Wu95l8dVNw5rZMRu(r4)
            com.vdodsodjsdt.TxXBRRtCrcR759WKDq8m6Xg r1 = r2.YdNRGRc4rly
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.Ca81ebIan1u(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.ko09zE6UAgwkV = r3
            r3 = -1
            r1.V57tEvNfxZVVcOCAOih5PKr = r3
            r3 = 0
            boolean r3 = r1.NSjgqmGjEzuugn2SsG1mZFP(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.VxUQ9tBhpHJ2AAEDNW8sghc4m
            if (r5 != 0) goto L30
            android.view.View r5 = r1.ko09zE6UAgwkV
            if (r5 == 0) goto L30
            r5 = 0
            r1.ko09zE6UAgwkV = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.pzqP2AqKW6J5PO8zCKnW(r3)
            r3 = 1
            r2.HVEwbdULInpTNa0IG(r4, r3)
            com.vdodsodjsdt.bIfzvLMNoeNlsDciz r3 = r2.qNPQb1obP7
            r3.VxUQ9tBhpHJ2AAEDNW8sghc4m(r4)
            return
        L40:
            r2.pzqP2AqKW6J5PO8zCKnW(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.vE4yDIjexsP2lGjLaTcB(android.view.View, int, boolean):void");
    }

    public final int w0Wu95l8dVNw5rZMRu(int i) {
        if (i == 3) {
            return q11o1hieEkZDhF1MGOZI26oZiDT();
        }
        if (i == 4) {
            return this.HVEwbdULInpTNa0IG;
        }
        if (i == 5) {
            return this.hKs1wlZyvtUNaW1f5ABIGacfPcvX;
        }
        if (i == 6) {
            return this.vE4yDIjexsP2lGjLaTcB;
        }
        throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Invalid state to get top offset: ", i));
    }

    public final void y1NaPKTl7R18DOr6e8i5(boolean z) {
        WeakReference weakReference = this.vXWl0o6I4U59CgHs9;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.Z1FjjMJ0suz8AFI7gsA4GDLMXv != null) {
                    return;
                } else {
                    this.Z1FjjMJ0suz8AFI7gsA4GDLMXv = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.vXWl0o6I4U59CgHs9.get() && z) {
                    this.Z1FjjMJ0suz8AFI7gsA4GDLMXv.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.Z1FjjMJ0suz8AFI7gsA4GDLMXv = null;
        }
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        TxXBRRtCrcR759WKDq8m6Xg txXBRRtCrcR759WKDq8m6Xg;
        if (!view.isShown() || !this.TqcnImqkSWIKht) {
            this.wRCD0SdqWCowdYU7bmzN = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = -1;
            this.rERAmyEtGV6ANGszuKcQI = -1;
            VelocityTracker velocityTracker = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.zOk739gUM7zIZC25HHUxoiyixWFjn = null;
            }
        }
        if (this.zOk739gUM7zIZC25HHUxoiyixWFjn == null) {
            this.zOk739gUM7zIZC25HHUxoiyixWFjn = VelocityTracker.obtain();
        }
        this.zOk739gUM7zIZC25HHUxoiyixWFjn.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.rERAmyEtGV6ANGszuKcQI = y;
            if (this.ymT6yQrus3w != 2) {
                WeakReference weakReference = this.wdI7vzA3Qmcwd;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.Ca81ebIan1u(view2, x, y)) {
                    this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.H2VFYNJEVGAX = true;
                }
            }
            this.wRCD0SdqWCowdYU7bmzN = this.GE1sqSYiEYQO2ew7WEZwTtUeS5 == -1 && !coordinatorLayout.Ca81ebIan1u(view, x, this.rERAmyEtGV6ANGszuKcQI);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.H2VFYNJEVGAX = false;
            this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = -1;
            if (this.wRCD0SdqWCowdYU7bmzN) {
                this.wRCD0SdqWCowdYU7bmzN = false;
                return false;
            }
        }
        if (this.wRCD0SdqWCowdYU7bmzN || (txXBRRtCrcR759WKDq8m6Xg = this.YdNRGRc4rly) == null || !txXBRRtCrcR759WKDq8m6Xg.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(motionEvent)) {
            WeakReference weakReference2 = this.wdI7vzA3Qmcwd;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.wRCD0SdqWCowdYU7bmzN || this.ymT6yQrus3w == 1 || coordinatorLayout.Ca81ebIan1u(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.YdNRGRc4rly == null || (i = this.rERAmyEtGV6ANGszuKcQI) == -1 || Math.abs(i - motionEvent.getY()) <= this.YdNRGRc4rly.zzpBGItXfub0yWj) {
                return false;
            }
        }
        return true;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        int i2 = 0;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        this.zzpBGItXfub0yWj = true;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = -1;
        this.KUYypEB4eNWOZWVDpH = -1;
        this.qNPQb1obP7 = new bIfzvLMNoeNlsDciz(this);
        this.O1xDAlBZZlZdoEf747lCFHld = 0.5f;
        this.y1NaPKTl7R18DOr6e8i5 = -1.0f;
        this.TqcnImqkSWIKht = true;
        this.d9zDyyznnp3oaDT1Ug = true;
        this.ymT6yQrus3w = 4;
        this.lQ0rO9lhQIyVe7Rp6 = 0.1f;
        this.KYZ9RyuOc42A2J = new ArrayList();
        this.rERAmyEtGV6ANGszuKcQI = -1;
        this.bjhcQ0u7VT2OYYrwk96HrWoN = new SparseIntArray();
        this.BJQHddi0Plr5ElWetCyaixWOg9 = new LJI4giD1cT20DI(this, i2);
        this.NSjgqmGjEzuugn2SsG1mZFP = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PGobtLpyfPC4TCnlq740.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.M9e7PWhFYLD2lOGMker = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.w0Wu95l8dVNw5rZMRu = XdVIZOnOVHGi6uYUaae4zAI94b.zzpBGItXfub0yWj(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b = this.w0Wu95l8dVNw5rZMRu;
        if (xdVIZOnOVHGi6uYUaae4zAI94b != null) {
            EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = new EQz8nVyVxmIrHN6fNCQWutFG0b30O(xdVIZOnOVHGi6uYUaae4zAI94b);
            this.GI83zq0G8e7zkn = eQz8nVyVxmIrHN6fNCQWutFG0b30O;
            eQz8nVyVxmIrHN6fNCQWutFG0b30O.HzCpKshMOoaw76hFcbOVRYMeRd(context);
            ColorStateList colorStateList = this.M9e7PWhFYLD2lOGMker;
            if (colorStateList != null) {
                this.GI83zq0G8e7zkn.p59rPv72J9(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.GI83zq0G8e7zkn.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(jW7EiD0YL6xkbB158jMUzhWNWb1y(), 1.0f);
        this.SuB3hEmTmbbRGAhtvOOmfKEon = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.SuB3hEmTmbbRGAhtvOOmfKEon.addUpdateListener(new UtURWB5bbAd9(i2, this));
        this.y1NaPKTl7R18DOr6e8i5 = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.KUYypEB4eNWOZWVDpH = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            qNPQb1obP7(i);
        } else {
            qNPQb1obP7(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        if (this.qygqjTppWwx992 != z) {
            this.qygqjTppWwx992 = z;
            if (!z && this.ymT6yQrus3w == 5) {
                SuB3hEmTmbbRGAhtvOOmfKEon(4);
            }
            O1xDAlBZZlZdoEf747lCFHld();
        }
        this.p59rPv72J9 = typedArrayObtainStyledAttributes.getBoolean(14, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, true);
        if (this.zzpBGItXfub0yWj != z2) {
            this.zzpBGItXfub0yWj = z2;
            if (this.vXWl0o6I4U59CgHs9 != null) {
                ko09zE6UAgwkV();
            }
            pzqP2AqKW6J5PO8zCKnW((this.zzpBGItXfub0yWj && this.ymT6yQrus3w == 6) ? 3 : this.ymT6yQrus3w);
            HVEwbdULInpTNa0IG(this.ymT6yQrus3w, true);
            O1xDAlBZZlZdoEf747lCFHld();
        }
        this.iKANjmyTSxO6v6UuLPdu7DxOjlS = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.TqcnImqkSWIKht = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.d9zDyyznnp3oaDT1Ug = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = typedArrayObtainStyledAttributes.getInt(11, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.O1xDAlBZZlZdoEf747lCFHld = f;
            if (this.vXWl0o6I4U59CgHs9 != null) {
                this.vE4yDIjexsP2lGjLaTcB = (int) ((1.0f - f) * this.hKs1wlZyvtUNaW1f5ABIGacfPcvX);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i3 = typedValuePeekValue2.data;
                if (i3 >= 0) {
                    this.pzqP2AqKW6J5PO8zCKnW = i3;
                    HVEwbdULInpTNa0IG(this.ymT6yQrus3w, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.pzqP2AqKW6J5PO8zCKnW = dimensionPixelOffset;
                    HVEwbdULInpTNa0IG(this.ymT6yQrus3w, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getInt(12, 500);
            this.Ca81ebIan1u = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.pYmKDYlAmhudp = typedArrayObtainStyledAttributes.getBoolean(20, false);
            this.ko09zE6UAgwkV = typedArrayObtainStyledAttributes.getBoolean(21, true);
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f6ZQsR6bPLvvCDNXOUc = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.vBGA6pPLqSMuYGvprl270j7 = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.q11o1hieEkZDhF1MGOZI26oZiDT = typedArrayObtainStyledAttributes.getBoolean(24, true);
            typedArrayObtainStyledAttributes.recycle();
            this.V57tEvNfxZVVcOCAOih5PKr = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
    }
}
