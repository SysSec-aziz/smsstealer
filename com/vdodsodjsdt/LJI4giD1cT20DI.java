package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class LJI4giD1cT20DI extends F44whnLsbQ {
    public final /* synthetic */ int HzCpKshMOoaw76hFcbOVRYMeRd;
    public final /* synthetic */ m8WKJH6JbFg KUYypEB4eNWOZWVDpH;

    public /* synthetic */ LJI4giD1cT20DI(m8WKJH6JbFg m8wkjh6jbfg, int i) {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i;
        this.KUYypEB4eNWOZWVDpH = m8wkjh6jbfg;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    @Override // com.vdodsodjsdt.F44whnLsbQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L8DMw02rUTs2w(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.LJI4giD1cT20DI.L8DMw02rUTs2w(android.view.View, float, float):void");
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final int NSjgqmGjEzuugn2SsG1mZFP(View view, int i) {
        switch (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            case 0:
                return sGipz63rTUmSj3uFDvOtzihao.KUYypEB4eNWOZWVDpH(i, ((BottomSheetBehavior) this.KUYypEB4eNWOZWVDpH).q11o1hieEkZDhF1MGOZI26oZiDT(), O1xDAlBZZlZdoEf747lCFHld());
            default:
                return view.getTop();
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public int O1xDAlBZZlZdoEf747lCFHld() {
        switch (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.KUYypEB4eNWOZWVDpH;
                return bottomSheetBehavior.qygqjTppWwx992 ? bottomSheetBehavior.hKs1wlZyvtUNaW1f5ABIGacfPcvX : bottomSheetBehavior.HVEwbdULInpTNa0IG;
            default:
                return super.O1xDAlBZZlZdoEf747lCFHld();
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ(View view, int i) {
        switch (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.KUYypEB4eNWOZWVDpH;
                return sGipz63rTUmSj3uFDvOtzihao.KUYypEB4eNWOZWVDpH(i, sideSheetBehavior.VxUQ9tBhpHJ2AAEDNW8sghc4m.Irh5auREsoeV1C1RaBamlmy(), sideSheetBehavior.VxUQ9tBhpHJ2AAEDNW8sghc4m.TaDO7ogis3aEiWEtq());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    @Override // com.vdodsodjsdt.F44whnLsbQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean bjhcQ0u7VT2OYYrwk96HrWoN(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.HzCpKshMOoaw76hFcbOVRYMeRd
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            com.vdodsodjsdt.m8WKJH6JbFg r6 = r4.KUYypEB4eNWOZWVDpH
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.NSjgqmGjEzuugn2SsG1mZFP
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r6 = r6.h3jnZRsdwYJfY9UhQCkbvWciwvFHv
            if (r6 == 0) goto L1b
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            com.vdodsodjsdt.m8WKJH6JbFg r0 = r4.KUYypEB4eNWOZWVDpH
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.ymT6yQrus3w
            r2 = 1
            if (r1 != r2) goto L26
            goto L56
        L26:
            boolean r3 = r0.H2VFYNJEVGAX
            if (r3 == 0) goto L2b
            goto L56
        L2b:
            r3 = 3
            if (r1 != r3) goto L48
            int r1 = r0.GE1sqSYiEYQO2ew7WEZwTtUeS5
            if (r1 != r6) goto L48
            java.lang.ref.WeakReference r6 = r0.wdI7vzA3Qmcwd
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L48
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L48
            goto L56
        L48:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r6 = r0.vXWl0o6I4U59CgHs9
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r2 = 0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.LJI4giD1cT20DI.bjhcQ0u7VT2OYYrwk96HrWoN(android.view.View, int):boolean");
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final void gBaBUmihn5l4u(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            case 0:
                ((BottomSheetBehavior) this.KUYypEB4eNWOZWVDpH).vBGA6pPLqSMuYGvprl270j7(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.KUYypEB4eNWOZWVDpH;
                WeakReference weakReference = sideSheetBehavior.pYmKDYlAmhudp;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.VxUQ9tBhpHJ2AAEDNW8sghc4m.zOk739gUM7zIZC25HHUxoiyixWFjn(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.vBGA6pPLqSMuYGvprl270j7;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.VxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public int vE4yDIjexsP2lGjLaTcB(View view) {
        switch (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.KUYypEB4eNWOZWVDpH;
                return sideSheetBehavior.KUYypEB4eNWOZWVDpH + sideSheetBehavior.Ca81ebIan1u;
            default:
                return super.vE4yDIjexsP2lGjLaTcB(view);
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final void wRCD0SdqWCowdYU7bmzN(int i) {
        switch (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.KUYypEB4eNWOZWVDpH;
                    if (bottomSheetBehavior.TqcnImqkSWIKht) {
                        bottomSheetBehavior.pzqP2AqKW6J5PO8zCKnW(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.KUYypEB4eNWOZWVDpH;
                    if (sideSheetBehavior.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                        sideSheetBehavior.ko09zE6UAgwkV(1);
                    }
                }
                break;
        }
    }
}
