package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wbBBe1vAdVO1DmSg1odNaySAYTu {
    public int Ca81ebIan1u;
    public final boolean GI83zq0G8e7zkn;
    public boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public int KUYypEB4eNWOZWVDpH;
    public hWsX15LBWoRzT LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int M9e7PWhFYLD2lOGMker;
    public final boolean NSjgqmGjEzuugn2SsG1mZFP;
    public final o0x3OWMw3He V57tEvNfxZVVcOCAOih5PKr;
    public NrjuzzioPqfttNRptBDpZDzSYUrcM VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final o0x3OWMw3He ZfQNn8hdWlEQ5cR94249PDsLR;
    public int p59rPv72J9;
    public int q1wNbhk2O6;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public RecyclerView zzpBGItXfub0yWj;

    public wbBBe1vAdVO1DmSg1odNaySAYTu() {
        v0TUlllCd5A1AKhbyZO v0tulllcd5a1akhbyzo = new v0TUlllCd5A1AKhbyZO(this, 0);
        v0TUlllCd5A1AKhbyZO v0tulllcd5a1akhbyzo2 = new v0TUlllCd5A1AKhbyZO(this, 1);
        this.V57tEvNfxZVVcOCAOih5PKr = new o0x3OWMw3He(v0tulllcd5a1akhbyzo);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new o0x3OWMw3He(v0tulllcd5a1akhbyzo2);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
        this.NSjgqmGjEzuugn2SsG1mZFP = true;
        this.GI83zq0G8e7zkn = true;
    }

    public static boolean CixTK5ZX8oWXHz34qHYV(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int Irh5auREsoeV1C1RaBamlmy(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(boolean, int, int, int, int):int");
    }

    public static int RhfGHxtXxy0M0grmp2jkRjQg(View view) {
        Rect rect = ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).zzpBGItXfub0yWj;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int ZLZeBXTMq0zDztBxtRTuCHrapQ(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    public static int qNPQb1obP7(View view) {
        Rect rect = ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).zzpBGItXfub0yWj;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static iN4YUnyuDZ qygqjTppWwx992(Context context, AttributeSet attributeSet, int i, int i2) {
        iN4YUnyuDZ in4yunyudz = new iN4YUnyuDZ();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nWfeFfb6D2ofx6xWm.VxUQ9tBhpHJ2AAEDNW8sghc4m, i, i2);
        in4yunyudz.VxUQ9tBhpHJ2AAEDNW8sghc4m = typedArrayObtainStyledAttributes.getInt(0, 1);
        in4yunyudz.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getInt(10, 1);
        in4yunyudz.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getBoolean(9, false);
        in4yunyudz.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return in4yunyudz;
    }

    public static int y1NaPKTl7R18DOr6e8i5(View view) {
        return ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj();
    }

    public static void ymT6yQrus3w(View view, int i, int i2, int i3, int i4) {
        YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) view.getLayoutParams();
        Rect rect = yoYMmBKQmkacZj7lMi9c.zzpBGItXfub0yWj;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).bottomMargin);
    }

    public final void AFOcXGdvoTMuqwiG8tD(RecyclerView recyclerView) {
        BDoqAMf0rlMRAnVghjC4qjG(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void BDoqAMf0rlMRAnVghjC4qjG(int i, int i2) {
        this.p59rPv72J9 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.KUYypEB4eNWOZWVDpH = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.r0dB0ojIy6g8mnk1;
        }
        this.Ca81ebIan1u = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.q1wNbhk2O6 = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.r0dB0ojIy6g8mnk1;
        }
    }

    public Parcelable BJQHddi0Plr5ElWetCyaixWOg9() {
        return null;
    }

    public abstract int ByTQIhgl7ezGvHXEd(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3);

    public abstract int Ca81ebIan1u(e20NJ5kD0wqGO3 e20nj5kd0wqgo3);

    public boolean DNP7yXLsojH0rPMHr8fUY14M() {
        return false;
    }

    public boolean G479XgNG9rK8jPPbSXr() {
        return false;
    }

    public abstract void H2VFYNJEVGAX(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3);

    public final void HAPpjhiCsV9ONY23505HCBI9IX() {
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final int HVEwbdULInpTNa0IG() {
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public abstract int HzCpKshMOoaw76hFcbOVRYMeRd(e20NJ5kD0wqGO3 e20nj5kd0wqgo3);

    public void ItrQwCXbty5PZtje5JS(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c = recyclerView.ZfQNn8hdWlEQ5cR94249PDsLR;
        e20NJ5kD0wqGO3 e20nj5kd0wqgo3 = recyclerView.H2VFYNJEVGAX;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.zzpBGItXfub0yWj.canScrollVertically(-1) && !this.zzpBGItXfub0yWj.canScrollHorizontally(-1) && !this.zzpBGItXfub0yWj.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        YrYFQ7bf7bxLdH yrYFQ7bf7bxLdH = this.zzpBGItXfub0yWj.q1wNbhk2O6;
        if (yrYFQ7bf7bxLdH != null) {
            accessibilityEvent.setItemCount(yrYFQ7bf7bxLdH.VxUQ9tBhpHJ2AAEDNW8sghc4m());
        }
    }

    public abstract View JUdwvN8LfOMa(View view, int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3);

    public final void KMiA9Sqk243eQkFNNoS(hWsX15LBWoRzT hwsx15lbworzt) {
        hWsX15LBWoRzT hwsx15lbworzt2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (hwsx15lbworzt2 != null && hwsx15lbworzt != hwsx15lbworzt2 && hwsx15lbworzt2.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            hwsx15lbworzt2.GI83zq0G8e7zkn();
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = hwsx15lbworzt;
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        Y8unnL6HZ8WXVIsfrePA3V331ck y8unnL6HZ8WXVIsfrePA3V331ck = recyclerView.zOk739gUM7zIZC25HHUxoiyixWFjn;
        y8unnL6HZ8WXVIsfrePA3V331ck.GI83zq0G8e7zkn.removeCallbacks(y8unnL6HZ8WXVIsfrePA3V331ck);
        y8unnL6HZ8WXVIsfrePA3V331ck.LaeGQIruHQu81hfJldjMOQSVblH3x.abortAnimation();
        if (hwsx15lbworzt.NSjgqmGjEzuugn2SsG1mZFP) {
            Log.w("RecyclerView", "An instance of " + hwsx15lbworzt.getClass().getSimpleName() + " was started more than once. Each instance of" + hwsx15lbworzt.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        hwsx15lbworzt.zzpBGItXfub0yWj = recyclerView;
        hwsx15lbworzt.V57tEvNfxZVVcOCAOih5PKr = this;
        int i = hwsx15lbworzt.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.H2VFYNJEVGAX.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        hwsx15lbworzt.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        hwsx15lbworzt.ZfQNn8hdWlEQ5cR94249PDsLR = true;
        hwsx15lbworzt.zIvmSL0wzmmKGc3X39b2Gw2mUGE = recyclerView.p59rPv72J9.pYmKDYlAmhudp(i);
        hwsx15lbworzt.zzpBGItXfub0yWj.zOk739gUM7zIZC25HHUxoiyixWFjn.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        hwsx15lbworzt.NSjgqmGjEzuugn2SsG1mZFP = true;
    }

    public abstract int KUYypEB4eNWOZWVDpH(e20NJ5kD0wqGO3 e20nj5kd0wqgo3);

    public abstract boolean LaeGQIruHQu81hfJldjMOQSVblH3x();

    public abstract int M9e7PWhFYLD2lOGMker(e20NJ5kD0wqGO3 e20nj5kd0wqgo3);

    public final int O1xDAlBZZlZdoEf747lCFHld() {
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final boolean Pf1HsU8AK92buCoUaexm5AC(View view, int i, int i2, YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c) {
        return (this.NSjgqmGjEzuugn2SsG1mZFP && CixTK5ZX8oWXHz34qHYV(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).width) && CixTK5ZX8oWXHz34qHYV(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).height)) ? false : true;
    }

    public final int SuB3hEmTmbbRGAhtvOOmfKEon() {
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        YrYFQ7bf7bxLdH adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        return 0;
    }

    public final int TaDO7ogis3aEiWEtq() {
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (nrjuzzioPqfttNRptBDpZDzSYUrcM != null) {
            return nrjuzzioPqfttNRptBDpZDzSYUrcM.Ca81ebIan1u();
        }
        return 0;
    }

    public final void TqcnImqkSWIKht(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).zzpBGItXfub0yWj;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.zzpBGItXfub0yWj != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.zzpBGItXfub0yWj.KUYypEB4eNWOZWVDpH;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public void V57tEvNfxZVVcOCAOih5PKr(String str) {
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        if (recyclerView != null) {
            recyclerView.GI83zq0G8e7zkn(str);
        }
    }

    public final void VOvSEdhaZyc0oOGQ8(int i, int i2) {
        int iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
        if (iTaDO7ogis3aEiWEtq == 0) {
            this.zzpBGItXfub0yWj.p59rPv72J9(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iTaDO7ogis3aEiWEtq; i7++) {
            View viewVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(i7);
            Rect rect = this.zzpBGItXfub0yWj.M9e7PWhFYLD2lOGMker;
            w0Wu95l8dVNw5rZMRu(viewVBGA6pPLqSMuYGvprl270j7, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.zzpBGItXfub0yWj.M9e7PWhFYLD2lOGMker.set(i6, i4, i3, i5);
        lxWWbfAOLs4jWzd7PSIiIJ(this.zzpBGItXfub0yWj.M9e7PWhFYLD2lOGMker, i, i2);
    }

    public void YdNRGRc4rly(int i) {
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        if (recyclerView != null) {
            int iCa81ebIan1u = recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.Ca81ebIan1u();
            for (int i2 = 0; i2 < iCa81ebIan1u; i2++) {
                recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.p59rPv72J9(i2).offsetLeftAndRight(i);
            }
        }
    }

    public abstract void Z1FjjMJ0suz8AFI7gsA4GDLMXv(e20NJ5kD0wqGO3 e20nj5kd0wqgo3);

    public abstract boolean ZfQNn8hdWlEQ5cR94249PDsLR();

    public final int aXO0LSrt8bKV() {
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public abstract boolean d9zDyyznnp3oaDT1Ug();

    public abstract int e1gEV3X9xwmHj(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3);

    public YoYMmBKQmkacZj7lMi9c f6ZQsR6bPLvvCDNXOUc(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof YoYMmBKQmkacZj7lMi9c ? new YoYMmBKQmkacZj7lMi9c((YoYMmBKQmkacZj7lMi9c) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new YoYMmBKQmkacZj7lMi9c((ViewGroup.MarginLayoutParams) layoutParams) : new YoYMmBKQmkacZj7lMi9c(layoutParams);
    }

    public final void h2b7InwIaORKN91X7whfQh4(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.zzpBGItXfub0yWj = null;
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
            this.p59rPv72J9 = 0;
            this.Ca81ebIan1u = 0;
        } else {
            this.zzpBGItXfub0yWj = recyclerView;
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            this.p59rPv72J9 = recyclerView.getWidth();
            this.Ca81ebIan1u = recyclerView.getHeight();
        }
        this.KUYypEB4eNWOZWVDpH = 1073741824;
        this.q1wNbhk2O6 = 1073741824;
    }

    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c) {
        for (int iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq() - 1; iTaDO7ogis3aEiWEtq >= 0; iTaDO7ogis3aEiWEtq--) {
            View viewVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(iTaDO7ogis3aEiWEtq);
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(viewVBGA6pPLqSMuYGvprl270j7);
            if (!wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u()) {
                if (!wFEUpQgjHlQygqjTppWwx992.zIvmSL0wzmmKGc3X39b2Gw2mUGE() || wFEUpQgjHlQygqjTppWwx992.NSjgqmGjEzuugn2SsG1mZFP() || this.zzpBGItXfub0yWj.q1wNbhk2O6.zzpBGItXfub0yWj) {
                    vBGA6pPLqSMuYGvprl270j7(iTaDO7ogis3aEiWEtq);
                    this.VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker(iTaDO7ogis3aEiWEtq);
                    yhxkwue1zri6a9vau8hg9c.GI83zq0G8e7zkn(viewVBGA6pPLqSMuYGvprl270j7);
                    this.zzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP.HzCpKshMOoaw76hFcbOVRYMeRd(wFEUpQgjHlQygqjTppWwx992);
                } else {
                    ubNpdCC1pl7L(iTaDO7ogis3aEiWEtq);
                    yhxkwue1zri6a9vau8hg9c.NSjgqmGjEzuugn2SsG1mZFP(wFEUpQgjHlQygqjTppWwx992);
                }
            }
        }
    }

    public final void hKs1wlZyvtUNaW1f5ABIGacfPcvX(View view, wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq) {
        WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(view);
        if (wFEUpQgjHlQygqjTppWwx992 == null || wFEUpQgjHlQygqjTppWwx992.NSjgqmGjEzuugn2SsG1mZFP()) {
            return;
        }
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (((ArrayList) nrjuzzioPqfttNRptBDpZDzSYUrcM.ZfQNn8hdWlEQ5cR94249PDsLR).contains(wFEUpQgjHlQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m)) {
            return;
        }
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        vXWl0o6I4U59CgHs9(recyclerView.ZfQNn8hdWlEQ5cR94249PDsLR, recyclerView.H2VFYNJEVGAX, view, wzeak8zkpnwhd4rkpyq);
    }

    public int iKANjmyTSxO6v6UuLPdu7DxOjlS(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return -1;
    }

    public YoYMmBKQmkacZj7lMi9c jW7EiD0YL6xkbB158jMUzhWNWb1y(Context context, AttributeSet attributeSet) {
        return new YoYMmBKQmkacZj7lMi9c(context, attributeSet);
    }

    public abstract YoYMmBKQmkacZj7lMi9c ko09zE6UAgwkV();

    public abstract void lQ0rO9lhQIyVe7Rp6(RecyclerView recyclerView);

    public void lxWWbfAOLs4jWzd7PSIiIJ(Rect rect, int i, int i2) {
        int iO1xDAlBZZlZdoEf747lCFHld = O1xDAlBZZlZdoEf747lCFHld() + vE4yDIjexsP2lGjLaTcB() + rect.width();
        int iAXO0LSrt8bKV = aXO0LSrt8bKV() + HVEwbdULInpTNa0IG() + rect.height();
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.zzpBGItXfub0yWj.setMeasuredDimension(ZLZeBXTMq0zDztBxtRTuCHrapQ(i, iO1xDAlBZZlZdoEf747lCFHld, recyclerView.getMinimumWidth()), ZLZeBXTMq0zDztBxtRTuCHrapQ(i2, iAXO0LSrt8bKV, this.zzpBGItXfub0yWj.getMinimumHeight()));
    }

    public final void mhUCRR8ceqc7mAozW(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c) {
        for (int iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq() - 1; iTaDO7ogis3aEiWEtq >= 0; iTaDO7ogis3aEiWEtq--) {
            if (!RecyclerView.qygqjTppWwx992(vBGA6pPLqSMuYGvprl270j7(iTaDO7ogis3aEiWEtq)).Ca81ebIan1u()) {
                View viewVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(iTaDO7ogis3aEiWEtq);
                ubNpdCC1pl7L(iTaDO7ogis3aEiWEtq);
                yhxkwue1zri6a9vau8hg9c.ZLZeBXTMq0zDztBxtRTuCHrapQ(viewVBGA6pPLqSMuYGvprl270j7);
            }
        }
    }

    public abstract int p59rPv72J9(e20NJ5kD0wqGO3 e20nj5kd0wqgo3);

    public final void p6bBrs4p3Ly(View view, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c) {
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        IxShTNMvCWlbR ixShTNMvCWlbR = (IxShTNMvCWlbR) nrjuzzioPqfttNRptBDpZDzSYUrcM.zzpBGItXfub0yWj;
        int iIndexOfChild = ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (((xBkpwtKksCOQS) nrjuzzioPqfttNRptBDpZDzSYUrcM.V57tEvNfxZVVcOCAOih5PKr).ZLZeBXTMq0zDztBxtRTuCHrapQ(iIndexOfChild)) {
                nrjuzzioPqfttNRptBDpZDzSYUrcM.HVEwbdULInpTNa0IG(view);
            }
            ixShTNMvCWlbR.NSjgqmGjEzuugn2SsG1mZFP(iIndexOfChild);
        }
        yhxkwue1zri6a9vau8hg9c.ZLZeBXTMq0zDztBxtRTuCHrapQ(view);
    }

    public View pYmKDYlAmhudp(int i) {
        int iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
        for (int i2 = 0; i2 < iTaDO7ogis3aEiWEtq; i2++) {
            View viewVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(i2);
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(viewVBGA6pPLqSMuYGvprl270j7);
            if (wFEUpQgjHlQygqjTppWwx992 != null && wFEUpQgjHlQygqjTppWwx992.zzpBGItXfub0yWj() == i && !wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u() && (this.zzpBGItXfub0yWj.H2VFYNJEVGAX.ZLZeBXTMq0zDztBxtRTuCHrapQ || !wFEUpQgjHlQygqjTppWwx992.NSjgqmGjEzuugn2SsG1mZFP())) {
                return viewVBGA6pPLqSMuYGvprl270j7;
            }
        }
        return null;
    }

    public final int pzqP2AqKW6J5PO8zCKnW() {
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        return recyclerView.getLayoutDirection();
    }

    public int q11o1hieEkZDhF1MGOZI26oZiDT(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return -1;
    }

    public abstract int q1wNbhk2O6(e20NJ5kD0wqGO3 e20nj5kd0wqgo3);

    public final boolean r0dB0ojIy6g8mnk1(View view, int i, int i2, YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c) {
        return (!view.isLayoutRequested() && this.NSjgqmGjEzuugn2SsG1mZFP && CixTK5ZX8oWXHz34qHYV(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).width) && CixTK5ZX8oWXHz34qHYV(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).height)) ? false : true;
    }

    public final void rE05n5RsRkyWKIeA9cmLXAKv4Hze(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c) {
        ArrayList arrayList = yhxkwue1zri6a9vau8hg9c.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((WFEUpQgjHl) arrayList.get(i)).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(view);
            if (!wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u()) {
                wFEUpQgjHlQygqjTppWwx992.p59rPv72J9(false);
                if (wFEUpQgjHlQygqjTppWwx992.M9e7PWhFYLD2lOGMker()) {
                    this.zzpBGItXfub0yWj.removeDetachedView(view, false);
                }
                RAU9GtBZd7wl rAU9GtBZd7wl = this.zzpBGItXfub0yWj.TqcnImqkSWIKht;
                if (rAU9GtBZd7wl != null) {
                    rAU9GtBZd7wl.ZfQNn8hdWlEQ5cR94249PDsLR(wFEUpQgjHlQygqjTppWwx992);
                }
                wFEUpQgjHlQygqjTppWwx992.p59rPv72J9(true);
                WFEUpQgjHl wFEUpQgjHlQygqjTppWwx9922 = RecyclerView.qygqjTppWwx992(view);
                wFEUpQgjHlQygqjTppWwx9922.p59rPv72J9 = null;
                wFEUpQgjHlQygqjTppWwx9922.Ca81ebIan1u = false;
                wFEUpQgjHlQygqjTppWwx9922.M9e7PWhFYLD2lOGMker &= -33;
                yhxkwue1zri6a9vau8hg9c.NSjgqmGjEzuugn2SsG1mZFP(wFEUpQgjHlQygqjTppWwx9922);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = yhxkwue1zri6a9vau8hg9c.zzpBGItXfub0yWj;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.zzpBGItXfub0yWj.invalidate();
        }
    }

    public abstract void tpEo0fy9FaoJYrSFHRfIK6(int i);

    public final void ubNpdCC1pl7L(int i) {
        if (vBGA6pPLqSMuYGvprl270j7(i) != null) {
            NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int iVBGA6pPLqSMuYGvprl270j7 = nrjuzzioPqfttNRptBDpZDzSYUrcM.vBGA6pPLqSMuYGvprl270j7(i);
            IxShTNMvCWlbR ixShTNMvCWlbR = (IxShTNMvCWlbR) nrjuzzioPqfttNRptBDpZDzSYUrcM.zzpBGItXfub0yWj;
            View childAt = ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m.getChildAt(iVBGA6pPLqSMuYGvprl270j7);
            if (childAt == null) {
                return;
            }
            if (((xBkpwtKksCOQS) nrjuzzioPqfttNRptBDpZDzSYUrcM.V57tEvNfxZVVcOCAOih5PKr).ZLZeBXTMq0zDztBxtRTuCHrapQ(iVBGA6pPLqSMuYGvprl270j7)) {
                nrjuzzioPqfttNRptBDpZDzSYUrcM.HVEwbdULInpTNa0IG(childAt);
            }
            ixShTNMvCWlbR.NSjgqmGjEzuugn2SsG1mZFP(iVBGA6pPLqSMuYGvprl270j7);
        }
    }

    public final View vBGA6pPLqSMuYGvprl270j7(int i) {
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (nrjuzzioPqfttNRptBDpZDzSYUrcM != null) {
            return nrjuzzioPqfttNRptBDpZDzSYUrcM.p59rPv72J9(i);
        }
        return null;
    }

    public final int vE4yDIjexsP2lGjLaTcB() {
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public void w0Wu95l8dVNw5rZMRu(View view, Rect rect) {
        int[] iArr = RecyclerView.r0dB0ojIy6g8mnk1;
        YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) view.getLayoutParams();
        Rect rect2 = yoYMmBKQmkacZj7lMi9c.zzpBGItXfub0yWj;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).bottomMargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean wR7sbzHKf9hYV1lxoS6nqyszepWvN(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.vE4yDIjexsP2lGjLaTcB()
            int r1 = r8.HVEwbdULInpTNa0IG()
            int r2 = r8.p59rPv72J9
            int r3 = r8.O1xDAlBZZlZdoEf747lCFHld()
            int r2 = r2 - r3
            int r3 = r8.Ca81ebIan1u
            int r4 = r8.aXO0LSrt8bKV()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.pzqP2AqKW6J5PO8zCKnW()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lae
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7c
            goto Lb3
        L7c:
            int r1 = r8.vE4yDIjexsP2lGjLaTcB()
            int r2 = r8.HVEwbdULInpTNa0IG()
            int r3 = r8.p59rPv72J9
            int r4 = r8.O1xDAlBZZlZdoEf747lCFHld()
            int r3 = r3 - r4
            int r4 = r8.Ca81ebIan1u
            int r5 = r8.aXO0LSrt8bKV()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.zzpBGItXfub0yWj
            android.graphics.Rect r5 = r5.M9e7PWhFYLD2lOGMker
            r8.w0Wu95l8dVNw5rZMRu(r13, r5)
            int r13 = r5.left
            int r13 = r13 - r11
            if (r13 >= r3) goto Lb3
            int r13 = r5.right
            int r13 = r13 - r11
            if (r13 <= r1) goto Lb3
            int r13 = r5.top
            int r13 = r13 - r10
            if (r13 >= r4) goto Lb3
            int r13 = r5.bottom
            int r13 = r13 - r10
            if (r13 > r2) goto Lae
            goto Lb3
        Lae:
            if (r11 != 0) goto Lb4
            if (r10 == 0) goto Lb3
            goto Lb4
        Lb3:
            return r0
        Lb4:
            if (r12 == 0) goto Lba
            r9.scrollBy(r11, r10)
            return r7
        Lba:
            r9.zOk739gUM7zIZC25HHUxoiyixWFjn(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu.wR7sbzHKf9hYV1lxoS6nqyszepWvN(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public void wRCD0SdqWCowdYU7bmzN(int i) {
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        if (recyclerView != null) {
            int iCa81ebIan1u = recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.Ca81ebIan1u();
            for (int i2 = 0; i2 < iCa81ebIan1u; i2++) {
                recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.p59rPv72J9(i2).offsetTopAndBottom(i);
            }
        }
    }

    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c) {
        return yoYMmBKQmkacZj7lMi9c != null;
    }

    public abstract void zyiF0wv9HozxGOIDt8PvVp(RecyclerView recyclerView, int i);

    public final void zzpBGItXfub0yWj(View view, int i, boolean z) {
        WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(view);
        if (z || wFEUpQgjHlQygqjTppWwx992.NSjgqmGjEzuugn2SsG1mZFP()) {
            sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = (sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.zzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP.V57tEvNfxZVVcOCAOih5PKr;
            xnjnd5YIMmACJ xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m = (xnjnd5YIMmACJ) sstjsle9ugp7ixfnwi18akn1jt.get(wFEUpQgjHlQygqjTppWwx992);
            if (xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
                xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m = xnjnd5YIMmACJ.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                sstjsle9ugp7ixfnwi18akn1jt.put(wFEUpQgjHlQygqjTppWwx992, xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m);
            }
            xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m |= 1;
        } else {
            this.zzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP.HzCpKshMOoaw76hFcbOVRYMeRd(wFEUpQgjHlQygqjTppWwx992);
        }
        YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) view.getLayoutParams();
        if (wFEUpQgjHlQygqjTppWwx992.h3jnZRsdwYJfY9UhQCkbvWciwvFHv() || wFEUpQgjHlQygqjTppWwx992.GI83zq0G8e7zkn()) {
            if (wFEUpQgjHlQygqjTppWwx992.GI83zq0G8e7zkn()) {
                wFEUpQgjHlQygqjTppWwx992.p59rPv72J9.HzCpKshMOoaw76hFcbOVRYMeRd(wFEUpQgjHlQygqjTppWwx992);
            } else {
                wFEUpQgjHlQygqjTppWwx992.M9e7PWhFYLD2lOGMker &= -33;
            }
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.zzpBGItXfub0yWj) {
                NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                xBkpwtKksCOQS xbkpwtkkscoqs = (xBkpwtKksCOQS) nrjuzzioPqfttNRptBDpZDzSYUrcM.V57tEvNfxZVVcOCAOih5PKr;
                int iIndexOfChild = ((IxShTNMvCWlbR) nrjuzzioPqfttNRptBDpZDzSYUrcM.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m.indexOfChild(view);
                int iZzpBGItXfub0yWj = (iIndexOfChild == -1 || xbkpwtkkscoqs.ZfQNn8hdWlEQ5cR94249PDsLR(iIndexOfChild)) ? -1 : iIndexOfChild - xbkpwtkkscoqs.zzpBGItXfub0yWj(iIndexOfChild);
                if (i == -1) {
                    i = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.Ca81ebIan1u();
                }
                if (iZzpBGItXfub0yWj == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.zzpBGItXfub0yWj.indexOfChild(view) + this.zzpBGItXfub0yWj.w0Wu95l8dVNw5rZMRu());
                }
                if (iZzpBGItXfub0yWj != i) {
                    wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.zzpBGItXfub0yWj.p59rPv72J9;
                    View viewVBGA6pPLqSMuYGvprl270j7 = wbbbe1vadvo1dmsg1odnaysaytu.vBGA6pPLqSMuYGvprl270j7(iZzpBGItXfub0yWj);
                    if (viewVBGA6pPLqSMuYGvprl270j7 == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iZzpBGItXfub0yWj + wbbbe1vadvo1dmsg1odnaysaytu.zzpBGItXfub0yWj.toString());
                    }
                    wbbbe1vadvo1dmsg1odnaysaytu.vBGA6pPLqSMuYGvprl270j7(iZzpBGItXfub0yWj);
                    wbbbe1vadvo1dmsg1odnaysaytu.VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker(iZzpBGItXfub0yWj);
                    YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c2 = (YoYMmBKQmkacZj7lMi9c) viewVBGA6pPLqSMuYGvprl270j7.getLayoutParams();
                    WFEUpQgjHl wFEUpQgjHlQygqjTppWwx9922 = RecyclerView.qygqjTppWwx992(viewVBGA6pPLqSMuYGvprl270j7);
                    if (wFEUpQgjHlQygqjTppWwx9922.NSjgqmGjEzuugn2SsG1mZFP()) {
                        sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt2 = (sSTjsLE9Ugp7iXfnwi18Akn1Jt) wbbbe1vadvo1dmsg1odnaysaytu.zzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP.V57tEvNfxZVVcOCAOih5PKr;
                        xnjnd5YIMmACJ xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m2 = (xnjnd5YIMmACJ) sstjsle9ugp7ixfnwi18akn1jt2.get(wFEUpQgjHlQygqjTppWwx9922);
                        if (xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m2 == null) {
                            xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m2 = xnjnd5YIMmACJ.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                            sstjsle9ugp7ixfnwi18akn1jt2.put(wFEUpQgjHlQygqjTppWwx9922, xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m2);
                        }
                        xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m2.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1 | xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    } else {
                        wbbbe1vadvo1dmsg1odnaysaytu.zzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP.HzCpKshMOoaw76hFcbOVRYMeRd(wFEUpQgjHlQygqjTppWwx9922);
                    }
                    wbbbe1vadvo1dmsg1odnaysaytu.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP(viewVBGA6pPLqSMuYGvprl270j7, i, yoYMmBKQmkacZj7lMi9c2, wFEUpQgjHlQygqjTppWwx9922.NSjgqmGjEzuugn2SsG1mZFP());
                }
            } else {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, i, false);
                yoYMmBKQmkacZj7lMi9c.V57tEvNfxZVVcOCAOih5PKr = true;
                hWsX15LBWoRzT hwsx15lbworzt = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (hwsx15lbworzt != null && hwsx15lbworzt.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    hwsx15lbworzt.zzpBGItXfub0yWj.getClass();
                    WFEUpQgjHl wFEUpQgjHlQygqjTppWwx9923 = RecyclerView.qygqjTppWwx992(view);
                    if ((wFEUpQgjHlQygqjTppWwx9923 != null ? wFEUpQgjHlQygqjTppWwx9923.zzpBGItXfub0yWj() : -1) == hwsx15lbworzt.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                        hwsx15lbworzt.zIvmSL0wzmmKGc3X39b2Gw2mUGE = view;
                    }
                }
            }
        }
        if (yoYMmBKQmkacZj7lMi9c.ZfQNn8hdWlEQ5cR94249PDsLR) {
            wFEUpQgjHlQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m.invalidate();
            yoYMmBKQmkacZj7lMi9c.ZfQNn8hdWlEQ5cR94249PDsLR = false;
        }
    }

    public void KYZ9RyuOc42A2J() {
    }

    public void gBaBUmihn5l4u() {
    }

    public void L8DMw02rUTs2w(RecyclerView recyclerView) {
    }

    public void bjhcQ0u7VT2OYYrwk96HrWoN(Parcelable parcelable) {
    }

    public void tFRdVJAePmTx77bP7FAN0uI(int i) {
    }

    public void GE1sqSYiEYQO2ew7WEZwTtUeS5(int i, int i2) {
    }

    public void GI83zq0G8e7zkn(int i, MSl7hPM6XqjxyBV5m mSl7hPM6XqjxyBV5m) {
    }

    public void rERAmyEtGV6ANGszuKcQI(int i, int i2) {
    }

    public void wdI7vzA3Qmcwd(int i, int i2) {
    }

    public void zOk739gUM7zIZC25HHUxoiyixWFjn(int i, int i2) {
    }

    public void NSjgqmGjEzuugn2SsG1mZFP(int i, int i2, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, MSl7hPM6XqjxyBV5m mSl7hPM6XqjxyBV5m) {
    }

    public void vXWl0o6I4U59CgHs9(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, View view, wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq) {
    }
}
