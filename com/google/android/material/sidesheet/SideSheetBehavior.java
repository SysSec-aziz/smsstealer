package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O;
import com.vdodsodjsdt.F44whnLsbQ;
import com.vdodsodjsdt.KfeOQNOupsCg6878zi4e;
import com.vdodsodjsdt.LJI4giD1cT20DI;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.TQMQBENV49PLMwKLaeaEMWAtYlx;
import com.vdodsodjsdt.TxXBRRtCrcR759WKDq8m6Xg;
import com.vdodsodjsdt.VuErrZ1Qc06j3Yz6WPhU99s5vNLl;
import com.vdodsodjsdt.XdVIZOnOVHGi6uYUaae4zAI94b;
import com.vdodsodjsdt.ZOzTbMJxsw;
import com.vdodsodjsdt.bIfzvLMNoeNlsDciz;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.jFJXX88X4vgYX5CG85l5EyqW8AAH;
import com.vdodsodjsdt.jj77w443kpEYEOqOOio;
import com.vdodsodjsdt.l84brpRrcI8X30BdJPQkPqvLG;
import com.vdodsodjsdt.lJgFFp37ou;
import com.vdodsodjsdt.m8WKJH6JbFg;
import com.vdodsodjsdt.u9SlVAuoWhQUfJ;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import com.vdodsodjsdt.zExWRrZVrGf1BX;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends m8WKJH6JbFg {
    public int Ca81ebIan1u;
    public TxXBRRtCrcR759WKDq8m6Xg GI83zq0G8e7zkn;
    public final float HzCpKshMOoaw76hFcbOVRYMeRd;
    public int KUYypEB4eNWOZWVDpH;
    public final bIfzvLMNoeNlsDciz LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean M9e7PWhFYLD2lOGMker;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final LJI4giD1cT20DI TaDO7ogis3aEiWEtq;
    public final ColorStateList V57tEvNfxZVVcOCAOih5PKr;
    public KfeOQNOupsCg6878zi4e VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final XdVIZOnOVHGi6uYUaae4zAI94b ZfQNn8hdWlEQ5cR94249PDsLR;
    public int f6ZQsR6bPLvvCDNXOUc;
    public WeakReference h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public VelocityTracker jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final int ko09zE6UAgwkV;
    public int p59rPv72J9;
    public WeakReference pYmKDYlAmhudp;
    public int q1wNbhk2O6;
    public final LinkedHashSet vBGA6pPLqSMuYGvprl270j7;
    public final float zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final EQz8nVyVxmIrHN6fNCQWutFG0b30O zzpBGItXfub0yWj;

    public SideSheetBehavior() {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new bIfzvLMNoeNlsDciz(this);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        this.NSjgqmGjEzuugn2SsG1mZFP = 5;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = 0.1f;
        this.ko09zE6UAgwkV = -1;
        this.vBGA6pPLqSMuYGvprl270j7 = new LinkedHashSet();
        this.TaDO7ogis3aEiWEtq = new LJI4giD1cT20DI(this, 1);
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = null;
        this.GI83zq0G8e7zkn = null;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean NSjgqmGjEzuugn2SsG1mZFP(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void V57tEvNfxZVVcOCAOih5PKr(TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = null;
        this.GI83zq0G8e7zkn = null;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i2;
        View viewFindViewById;
        int i3 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = this.zzpBGItXfub0yWj;
        int iQ11o1hieEkZDhF1MGOZI26oZiDT = 0;
        if (weakReference == null) {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new WeakReference(view);
            new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
            Context context = view.getContext();
            ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(context, R.attr.motionDurationMedium2, 300);
            ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(context, R.attr.motionDurationShort3, 150);
            ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (eQz8nVyVxmIrHN6fNCQWutFG0b30O != null) {
                view.setBackground(eQz8nVyVxmIrHN6fNCQWutFG0b30O);
                float elevation = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                eQz8nVyVxmIrHN6fNCQWutFG0b30O.q1wNbhk2O6(elevation);
            } else {
                ColorStateList colorStateList = this.V57tEvNfxZVVcOCAOih5PKr;
                if (colorStateList != null) {
                    WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    lJgFFp37ou.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, colorStateList);
                }
            }
            int i4 = this.NSjgqmGjEzuugn2SsG1mZFP == 5 ? 4 : 0;
            if (view.getVisibility() != i4) {
                view.setVisibility(i4);
            }
            vBGA6pPLqSMuYGvprl270j7();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (xb0r6yEzq0tw9m7nTWG5BFR8.LaeGQIruHQu81hfJldjMOQSVblH3x(view) == null) {
                xb0r6yEzq0tw9m7nTWG5BFR8.p59rPv72J9(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i5 = Gravity.getAbsoluteGravity(((TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams()).V57tEvNfxZVVcOCAOih5PKr, i) == 3 ? 1 : 0;
        KfeOQNOupsCg6878zi4e kfeOQNOupsCg6878zi4e = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (kfeOQNOupsCg6878zi4e == null || kfeOQNOupsCg6878zi4e.RhfGHxtXxy0M0grmp2jkRjQg() != i5) {
            TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx = null;
            XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i5 == 0) {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new zExWRrZVrGf1BX(this, i3);
                if (xdVIZOnOVHGi6uYUaae4zAI94b != null) {
                    WeakReference weakReference2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof TQMQBENV49PLMwKLaeaEMWAtYlx)) {
                        tQMQBENV49PLMwKLaeaEMWAtYlx = (TQMQBENV49PLMwKLaeaEMWAtYlx) view3.getLayoutParams();
                    }
                    if (tQMQBENV49PLMwKLaeaEMWAtYlx == null || ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx).rightMargin <= 0) {
                        jFJXX88X4vgYX5CG85l5EyqW8AAH jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE = xdVIZOnOVHGi6uYUaae4zAI94b.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new ZOzTbMJxsw(0.0f);
                        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ = new ZOzTbMJxsw(0.0f);
                        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m = jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        if (eQz8nVyVxmIrHN6fNCQWutFG0b30O != null) {
                            eQz8nVyVxmIrHN6fNCQWutFG0b30O.setShapeAppearanceModel(xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m);
                        }
                    }
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i5, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new zExWRrZVrGf1BX(this, iQ11o1hieEkZDhF1MGOZI26oZiDT);
                if (xdVIZOnOVHGi6uYUaae4zAI94b != null) {
                    WeakReference weakReference3 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof TQMQBENV49PLMwKLaeaEMWAtYlx)) {
                        tQMQBENV49PLMwKLaeaEMWAtYlx = (TQMQBENV49PLMwKLaeaEMWAtYlx) view2.getLayoutParams();
                    }
                    if (tQMQBENV49PLMwKLaeaEMWAtYlx == null || ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx).leftMargin <= 0) {
                        jFJXX88X4vgYX5CG85l5EyqW8AAH jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE2 = xdVIZOnOVHGi6uYUaae4zAI94b.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE2.LaeGQIruHQu81hfJldjMOQSVblH3x = new ZOzTbMJxsw(0.0f);
                        jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE2.NSjgqmGjEzuugn2SsG1mZFP = new ZOzTbMJxsw(0.0f);
                        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m2 = jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        if (eQz8nVyVxmIrHN6fNCQWutFG0b30O != null) {
                            eQz8nVyVxmIrHN6fNCQWutFG0b30O.setShapeAppearanceModel(xdVIZOnOVHGi6uYUaae4zAI94bVxUQ9tBhpHJ2AAEDNW8sghc4m2);
                        }
                    }
                }
            }
        }
        if (this.GI83zq0G8e7zkn == null) {
            this.GI83zq0G8e7zkn = new TxXBRRtCrcR759WKDq8m6Xg(coordinatorLayout.getContext(), coordinatorLayout, this.TaDO7ogis3aEiWEtq);
        }
        int iQ11o1hieEkZDhF1MGOZI26oZiDT2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.q11o1hieEkZDhF1MGOZI26oZiDT(view);
        coordinatorLayout.pYmKDYlAmhudp(view, i);
        this.q1wNbhk2O6 = coordinatorLayout.getWidth();
        this.p59rPv72J9 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.w0Wu95l8dVNw5rZMRu(coordinatorLayout);
        this.KUYypEB4eNWOZWVDpH = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.Ca81ebIan1u = marginLayoutParams != null ? this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(marginLayoutParams) : 0;
        int i6 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (i6 == 1 || i6 == 2) {
            iQ11o1hieEkZDhF1MGOZI26oZiDT = iQ11o1hieEkZDhF1MGOZI26oZiDT2 - this.VxUQ9tBhpHJ2AAEDNW8sghc4m.q11o1hieEkZDhF1MGOZI26oZiDT(view);
        } else if (i6 != 3) {
            if (i6 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.NSjgqmGjEzuugn2SsG1mZFP);
            }
            iQ11o1hieEkZDhF1MGOZI26oZiDT = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.vBGA6pPLqSMuYGvprl270j7();
        }
        WeakHashMap weakHashMap2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        view.offsetLeftAndRight(iQ11o1hieEkZDhF1MGOZI26oZiDT);
        if (this.pYmKDYlAmhudp == null && (i2 = this.ko09zE6UAgwkV) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i2)) != null) {
            this.pYmKDYlAmhudp = new WeakReference(viewFindViewById);
        }
        Iterator it = this.vBGA6pPLqSMuYGvprl270j7.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.Ca81ebIan1u(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        ko09zE6UAgwkV(2);
        r2.LaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f6ZQsR6bPLvvCDNXOUc(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            com.vdodsodjsdt.KfeOQNOupsCg6878zi4e r0 = r2.VxUQ9tBhpHJ2AAEDNW8sghc4m
            int r0 = r0.vBGA6pPLqSMuYGvprl270j7()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = com.vdodsodjsdt.u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP(r5, r4)
            r3.<init>(r4)
            throw r3
        L19:
            com.vdodsodjsdt.KfeOQNOupsCg6878zi4e r0 = r2.VxUQ9tBhpHJ2AAEDNW8sghc4m
            int r0 = r0.f6ZQsR6bPLvvCDNXOUc()
        L1f:
            com.vdodsodjsdt.TxXBRRtCrcR759WKDq8m6Xg r1 = r2.GI83zq0G8e7zkn
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.Ca81ebIan1u(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.ko09zE6UAgwkV = r3
            r3 = -1
            r1.V57tEvNfxZVVcOCAOih5PKr = r3
            r3 = 0
            boolean r3 = r1.NSjgqmGjEzuugn2SsG1mZFP(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.VxUQ9tBhpHJ2AAEDNW8sghc4m
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.ko09zE6UAgwkV
            if (r5 == 0) goto L4b
            r5 = 0
            r1.ko09zE6UAgwkV = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.ko09zE6UAgwkV(r3)
            com.vdodsodjsdt.bIfzvLMNoeNlsDciz r3 = r2.LaeGQIruHQu81hfJldjMOQSVblH3x
            r3.VxUQ9tBhpHJ2AAEDNW8sghc4m(r4)
            return
        L57:
            r2.ko09zE6UAgwkV(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.f6ZQsR6bPLvvCDNXOUc(android.view.View, int, boolean):void");
    }

    public final boolean jW7EiD0YL6xkbB158jMUzhWNWb1y() {
        if (this.GI83zq0G8e7zkn != null) {
            return this.ZLZeBXTMq0zDztBxtRTuCHrapQ || this.NSjgqmGjEzuugn2SsG1mZFP == 1;
        }
        return false;
    }

    public final void ko09zE6UAgwkV(int i) {
        View view;
        if (this.NSjgqmGjEzuugn2SsG1mZFP == i) {
            return;
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = i;
        WeakReference weakReference = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i2 = this.NSjgqmGjEzuugn2SsG1mZFP == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.vBGA6pPLqSMuYGvprl270j7.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        vBGA6pPLqSMuYGvprl270j7();
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final Parcelable p59rPv72J9(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new VuErrZ1Qc06j3Yz6WPhU99s5vNLl(this);
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean pYmKDYlAmhudp(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.NSjgqmGjEzuugn2SsG1mZFP == 1 && actionMasked == 0) {
            return true;
        }
        if (jW7EiD0YL6xkbB158jMUzhWNWb1y()) {
            this.GI83zq0G8e7zkn.M9e7PWhFYLD2lOGMker(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.jW7EiD0YL6xkbB158jMUzhWNWb1y) != null) {
            velocityTracker.recycle();
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = null;
        }
        if (this.jW7EiD0YL6xkbB158jMUzhWNWb1y == null) {
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = VelocityTracker.obtain();
        }
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y.addMovement(motionEvent);
        if (jW7EiD0YL6xkbB158jMUzhWNWb1y() && actionMasked == 2 && !this.M9e7PWhFYLD2lOGMker && jW7EiD0YL6xkbB158jMUzhWNWb1y()) {
            float fAbs = Math.abs(this.f6ZQsR6bPLvvCDNXOUc - motionEvent.getX());
            TxXBRRtCrcR759WKDq8m6Xg txXBRRtCrcR759WKDq8m6Xg = this.GI83zq0G8e7zkn;
            if (fAbs > txXBRRtCrcR759WKDq8m6Xg.zzpBGItXfub0yWj) {
                txXBRRtCrcR759WKDq8m6Xg.zzpBGItXfub0yWj(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.M9e7PWhFYLD2lOGMker;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void q1wNbhk2O6(View view, Parcelable parcelable) {
        int i = ((VuErrZ1Qc06j3Yz6WPhU99s5vNLl) parcelable).LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = i;
    }

    public final void vBGA6pPLqSMuYGvprl270j7() {
        View view;
        WeakReference weakReference = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        xb0r6yEzq0tw9m7nTWG5BFR8.M9e7PWhFYLD2lOGMker(view, 262144);
        xb0r6yEzq0tw9m7nTWG5BFR8.NSjgqmGjEzuugn2SsG1mZFP(view, 0);
        xb0r6yEzq0tw9m7nTWG5BFR8.M9e7PWhFYLD2lOGMker(view, 1048576);
        xb0r6yEzq0tw9m7nTWG5BFR8.NSjgqmGjEzuugn2SsG1mZFP(view, 0);
        final int i = 5;
        if (this.NSjgqmGjEzuugn2SsG1mZFP != 5) {
            xb0r6yEzq0tw9m7nTWG5BFR8.HzCpKshMOoaw76hFcbOVRYMeRd(view, jj77w443kpEYEOqOOio.M9e7PWhFYLD2lOGMker, new l84brpRrcI8X30BdJPQkPqvLG() { // from class: com.vdodsodjsdt.QqSdMWcj9BMpKNmbBeSriSwEagdx
                @Override // com.vdodsodjsdt.l84brpRrcI8X30BdJPQkPqvLG
                public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(View view2) {
                    int i2 = i;
                    if (i2 == 1 || i2 == 2) {
                        throw new IllegalArgumentException(u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(new StringBuilder("STATE_"), i2 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.V57tEvNfxZVVcOCAOih5PKr;
                    WeakReference weakReference2 = sideSheetBehavior.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.ko09zE6UAgwkV(i2);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.get();
                    CD5GcvNfXO cD5GcvNfXO = new CD5GcvNfXO(sideSheetBehavior, i2, 1);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(cD5GcvNfXO);
                        return true;
                    }
                    cD5GcvNfXO.run();
                    return true;
                }
            });
        }
        final int i2 = 3;
        if (this.NSjgqmGjEzuugn2SsG1mZFP != 3) {
            xb0r6yEzq0tw9m7nTWG5BFR8.HzCpKshMOoaw76hFcbOVRYMeRd(view, jj77w443kpEYEOqOOio.NSjgqmGjEzuugn2SsG1mZFP, new l84brpRrcI8X30BdJPQkPqvLG() { // from class: com.vdodsodjsdt.QqSdMWcj9BMpKNmbBeSriSwEagdx
                @Override // com.vdodsodjsdt.l84brpRrcI8X30BdJPQkPqvLG
                public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(View view2) {
                    int i22 = i2;
                    if (i22 == 1 || i22 == 2) {
                        throw new IllegalArgumentException(u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(new StringBuilder("STATE_"), i22 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.V57tEvNfxZVVcOCAOih5PKr;
                    WeakReference weakReference2 = sideSheetBehavior.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.ko09zE6UAgwkV(i22);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.get();
                    CD5GcvNfXO cD5GcvNfXO = new CD5GcvNfXO(sideSheetBehavior, i22, 1);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested() && view3.isAttachedToWindow()) {
                        view3.post(cD5GcvNfXO);
                        return true;
                    }
                    cD5GcvNfXO.run();
                    return true;
                }
            });
        }
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        TxXBRRtCrcR759WKDq8m6Xg txXBRRtCrcR759WKDq8m6Xg;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && xb0r6yEzq0tw9m7nTWG5BFR8.LaeGQIruHQu81hfJldjMOQSVblH3x(view) == null) || !this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            this.M9e7PWhFYLD2lOGMker = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.jW7EiD0YL6xkbB158jMUzhWNWb1y) != null) {
            velocityTracker.recycle();
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = null;
        }
        if (this.jW7EiD0YL6xkbB158jMUzhWNWb1y == null) {
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = VelocityTracker.obtain();
        }
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f6ZQsR6bPLvvCDNXOUc = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.M9e7PWhFYLD2lOGMker) {
            this.M9e7PWhFYLD2lOGMker = false;
            return false;
        }
        return (this.M9e7PWhFYLD2lOGMker || (txXBRRtCrcR759WKDq8m6Xg = this.GI83zq0G8e7zkn) == null || !txXBRRtCrcR759WKDq8m6Xg.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(motionEvent)) ? false : true;
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new bIfzvLMNoeNlsDciz(this);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        this.NSjgqmGjEzuugn2SsG1mZFP = 5;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = 0.1f;
        this.ko09zE6UAgwkV = -1;
        this.vBGA6pPLqSMuYGvprl270j7 = new LinkedHashSet();
        this.TaDO7ogis3aEiWEtq = new LJI4giD1cT20DI(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PGobtLpyfPC4TCnlq740.RhfGHxtXxy0M0grmp2jkRjQg);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.V57tEvNfxZVVcOCAOih5PKr = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = XdVIZOnOVHGi6uYUaae4zAI94b.zzpBGItXfub0yWj(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.ko09zE6UAgwkV = resourceId;
            WeakReference weakReference = this.pYmKDYlAmhudp;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.pYmKDYlAmhudp = null;
            WeakReference weakReference2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1 && view.isLaidOut()) {
                    view.requestLayout();
                }
            }
        }
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (xdVIZOnOVHGi6uYUaae4zAI94b != null) {
            EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = new EQz8nVyVxmIrHN6fNCQWutFG0b30O(xdVIZOnOVHGi6uYUaae4zAI94b);
            this.zzpBGItXfub0yWj = eQz8nVyVxmIrHN6fNCQWutFG0b30O;
            eQz8nVyVxmIrHN6fNCQWutFG0b30O.HzCpKshMOoaw76hFcbOVRYMeRd(context);
            ColorStateList colorStateList = this.V57tEvNfxZVVcOCAOih5PKr;
            if (colorStateList != null) {
                this.zzpBGItXfub0yWj.p59rPv72J9(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.zzpBGItXfub0yWj.setTint(typedValue.data);
            }
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
