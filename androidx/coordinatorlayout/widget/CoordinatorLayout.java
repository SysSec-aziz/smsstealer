package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.vdodsodjsdt.CSovRAL7IKDMzACrU8;
import com.vdodsodjsdt.ICdlMoh1kzcyhr3daSZZjQ2YyvSS;
import com.vdodsodjsdt.IvKCorY7e5IBMBU;
import com.vdodsodjsdt.L6NsbfO6KnE8o1cSViY8X;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.Skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
import com.vdodsodjsdt.T3RbnymT8IuKvnwatFNeNL7H;
import com.vdodsodjsdt.TQMQBENV49PLMwKLaeaEMWAtYlx;
import com.vdodsodjsdt.UFStPSj5DrcqcfR2RymfmG;
import com.vdodsodjsdt.VyBF7fhUIIa2YxT;
import com.vdodsodjsdt.c0wRuuzSWhroU44DpcN0ISNk;
import com.vdodsodjsdt.fteHovX23kcqjzpVgTB;
import com.vdodsodjsdt.hEYsqrbxMHwbqcHPUghYJ00k;
import com.vdodsodjsdt.lJgFFp37ou;
import com.vdodsodjsdt.m8WKJH6JbFg;
import com.vdodsodjsdt.mYybSD3X3KfsAbnorz7K;
import com.vdodsodjsdt.nMRZPpfLCgJyuB;
import com.vdodsodjsdt.pmJH8rqWIwRth8COqq;
import com.vdodsodjsdt.sSTjsLE9Ugp7iXfnwi18Akn1Jt;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import com.vdodsodjsdt.yh77kBiYEzPefn6koPeG9t8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements L6NsbfO6KnE8o1cSViY8X, fteHovX23kcqjzpVgTB {
    public static final Class[] Irh5auREsoeV1C1RaBamlmy;
    public static final yh77kBiYEzPefn6koPeG9t8 RhfGHxtXxy0M0grmp2jkRjQg;
    public static final String TaDO7ogis3aEiWEtq;
    public static final ThreadLocal q11o1hieEkZDhF1MGOZI26oZiDT;
    public static final T3RbnymT8IuKvnwatFNeNL7H w0Wu95l8dVNw5rZMRu;
    public boolean Ca81ebIan1u;
    public boolean GI83zq0G8e7zkn;
    public final int[] HzCpKshMOoaw76hFcbOVRYMeRd;
    public View KUYypEB4eNWOZWVDpH;
    public final ArrayList LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean M9e7PWhFYLD2lOGMker;
    public final int[] NSjgqmGjEzuugn2SsG1mZFP;
    public final ArrayList V57tEvNfxZVVcOCAOih5PKr;
    public final int[] ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final nMRZPpfLCgJyuB ZfQNn8hdWlEQ5cR94249PDsLR;
    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ f6ZQsR6bPLvvCDNXOUc;
    public pmJH8rqWIwRth8COqq h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public ViewGroup.OnHierarchyChangeListener jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public Drawable ko09zE6UAgwkV;
    public VyBF7fhUIIa2YxT p59rPv72J9;
    public boolean pYmKDYlAmhudp;
    public View q1wNbhk2O6;
    public final mYybSD3X3KfsAbnorz7K vBGA6pPLqSMuYGvprl270j7;
    public final ArrayList zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        TaDO7ogis3aEiWEtq = r0 != null ? r0.getName() : null;
        w0Wu95l8dVNw5rZMRu = new T3RbnymT8IuKvnwatFNeNL7H(1);
        Irh5auREsoeV1C1RaBamlmy = new Class[]{Context.class, AttributeSet.class};
        q11o1hieEkZDhF1MGOZI26oZiDT = new ThreadLocal();
        RhfGHxtXxy0M0grmp2jkRjQg = new yh77kBiYEzPefn6koPeG9t8();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.V57tEvNfxZVVcOCAOih5PKr = new ArrayList();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new nMRZPpfLCgJyuB(3);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new ArrayList();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new ArrayList();
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new int[2];
        this.NSjgqmGjEzuugn2SsG1mZFP = new int[2];
        this.vBGA6pPLqSMuYGvprl270j7 = new mYybSD3X3KfsAbnorz7K();
        int[] iArr = IvKCorY7e5IBMBU.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.HzCpKshMOoaw76hFcbOVRYMeRd = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.HzCpKshMOoaw76hFcbOVRYMeRd[i] = (int) (r1[i] * f);
            }
        }
        this.ko09zE6UAgwkV = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        Irh5auREsoeV1C1RaBamlmy();
        super.setOnHierarchyChangeListener(new CSovRAL7IKDMzACrU8(this));
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static void KUYypEB4eNWOZWVDpH(int i, Rect rect, Rect rect2, TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx, int i2, int i3) {
        int i4 = tQMQBENV49PLMwKLaeaEMWAtYlx.V57tEvNfxZVVcOCAOih5PKr;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = tQMQBENV49PLMwKLaeaEMWAtYlx.ZfQNn8hdWlEQ5cR94249PDsLR;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    public static void TaDO7ogis3aEiWEtq(View view, int i) {
        TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx = (TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams();
        int i2 = tQMQBENV49PLMwKLaeaEMWAtYlx.M9e7PWhFYLD2lOGMker;
        if (i2 != i) {
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            view.offsetTopAndBottom(i - i2);
            tQMQBENV49PLMwKLaeaEMWAtYlx.M9e7PWhFYLD2lOGMker = i;
        }
    }

    public static Rect ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        Rect rect = (Rect) RhfGHxtXxy0M0grmp2jkRjQg.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return rect == null ? new Rect() : rect;
    }

    public static TQMQBENV49PLMwKLaeaEMWAtYlx p59rPv72J9(View view) {
        TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx = (TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams();
        if (!tQMQBENV49PLMwKLaeaEMWAtYlx.zzpBGItXfub0yWj) {
            ICdlMoh1kzcyhr3daSZZjQ2YyvSS iCdlMoh1kzcyhr3daSZZjQ2YyvSS = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                iCdlMoh1kzcyhr3daSZZjQ2YyvSS = (ICdlMoh1kzcyhr3daSZZjQ2YyvSS) superclass.getAnnotation(ICdlMoh1kzcyhr3daSZZjQ2YyvSS.class);
                if (iCdlMoh1kzcyhr3daSZZjQ2YyvSS != null) {
                    break;
                }
            }
            if (iCdlMoh1kzcyhr3daSZZjQ2YyvSS != null) {
                try {
                    m8WKJH6JbFg m8wkjh6jbfg = (m8WKJH6JbFg) iCdlMoh1kzcyhr3daSZZjQ2YyvSS.value().getDeclaredConstructor(null).newInstance(null);
                    m8WKJH6JbFg m8wkjh6jbfg2 = tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    if (m8wkjh6jbfg2 != m8wkjh6jbfg) {
                        if (m8wkjh6jbfg2 != null) {
                            m8wkjh6jbfg2.LaeGQIruHQu81hfJldjMOQSVblH3x();
                        }
                        tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m = m8wkjh6jbfg;
                        tQMQBENV49PLMwKLaeaEMWAtYlx.zzpBGItXfub0yWj = true;
                        if (m8wkjh6jbfg != null) {
                            m8wkjh6jbfg.V57tEvNfxZVVcOCAOih5PKr(tQMQBENV49PLMwKLaeaEMWAtYlx);
                        }
                    }
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + iCdlMoh1kzcyhr3daSZZjQ2YyvSS.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            tQMQBENV49PLMwKLaeaEMWAtYlx.zzpBGItXfub0yWj = true;
        }
        return tQMQBENV49PLMwKLaeaEMWAtYlx;
    }

    public static void vBGA6pPLqSMuYGvprl270j7(View view, int i) {
        TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx = (TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams();
        int i2 = tQMQBENV49PLMwKLaeaEMWAtYlx.GI83zq0G8e7zkn;
        if (i2 != i) {
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            view.offsetLeftAndRight(i - i2);
            tQMQBENV49PLMwKLaeaEMWAtYlx.GI83zq0G8e7zkn = i;
        }
    }

    public final boolean Ca81ebIan1u(View view, int i, int i2) {
        yh77kBiYEzPefn6koPeG9t8 yh77kbiyezpefn6kopeg9t8 = RhfGHxtXxy0M0grmp2jkRjQg;
        Rect rectZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ();
        HzCpKshMOoaw76hFcbOVRYMeRd(view, rectZLZeBXTMq0zDztBxtRTuCHrapQ);
        try {
            return rectZLZeBXTMq0zDztBxtRTuCHrapQ.contains(i, i2);
        } finally {
            rectZLZeBXTMq0zDztBxtRTuCHrapQ.setEmpty();
            yh77kbiyezpefn6kopeg9t8.V57tEvNfxZVVcOCAOih5PKr(rectZLZeBXTMq0zDztBxtRTuCHrapQ);
        }
    }

    public final void GI83zq0G8e7zkn(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            HzCpKshMOoaw76hFcbOVRYMeRd(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd(View view, Rect rect) {
        ThreadLocal threadLocal = c0wRuuzSWhroU44DpcN0ISNk.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = c0wRuuzSWhroU44DpcN0ISNk.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        c0wRuuzSWhroU44DpcN0ISNk.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, view, matrix);
        ThreadLocal threadLocal3 = c0wRuuzSWhroU44DpcN0ISNk.zzpBGItXfub0yWj;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void Irh5auREsoeV1C1RaBamlmy() {
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (!getFitsSystemWindows()) {
            lJgFFp37ou.M9e7PWhFYLD2lOGMker(this, null);
            return;
        }
        if (this.f6ZQsR6bPLvvCDNXOUc == null) {
            this.f6ZQsR6bPLvvCDNXOUc = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(14, this);
        }
        lJgFFp37ou.M9e7PWhFYLD2lOGMker(this, this.f6ZQsR6bPLvvCDNXOUc);
        setSystemUiVisibility(1280);
    }

    @Override // com.vdodsodjsdt.L6NsbfO6KnE8o1cSViY8X
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(View view, int i, int i2, int i3, int i4, int i5) {
        ZfQNn8hdWlEQ5cR94249PDsLR(view, i, i2, i3, i4, 0, this.NSjgqmGjEzuugn2SsG1mZFP);
    }

    public final ArrayList M9e7PWhFYLD2lOGMker(View view) {
        sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = (sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i = sstjsle9ugp7ixfnwi18akn1jt.LaeGQIruHQu81hfJldjMOQSVblH3x;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) sstjsle9ugp7ixfnwi18akn1jt.GI83zq0G8e7zkn(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(sstjsle9ugp7ixfnwi18akn1jt.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2));
            }
        }
        ArrayList arrayList3 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP(TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    @Override // com.vdodsodjsdt.L6NsbfO6KnE8o1cSViY8X
    public final void V57tEvNfxZVVcOCAOih5PKr(View view, int i, int i2, int[] iArr, int i3) {
        m8WKJH6JbFg m8wkjh6jbfg;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx = (TQMQBENV49PLMwKLaeaEMWAtYlx) childAt.getLayoutParams();
                if (tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m(i3) && (m8wkjh6jbfg = tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m) != null) {
                    int[] iArr2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m8wkjh6jbfg.M9e7PWhFYLD2lOGMker(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            h3jnZRsdwYJfY9UhQCkbvWciwvFHv(1);
        }
    }

    @Override // com.vdodsodjsdt.L6NsbfO6KnE8o1cSViY8X
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(View view, View view2, int i, int i2) {
        mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k = this.vBGA6pPLqSMuYGvprl270j7;
        if (i2 == 1) {
            myybsd3x3kfsabnorz7k.zzpBGItXfub0yWj = i;
        } else {
            myybsd3x3kfsabnorz7k.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        }
        this.q1wNbhk2O6 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((TQMQBENV49PLMwKLaeaEMWAtYlx) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // com.vdodsodjsdt.fteHovX23kcqjzpVgTB
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m8WKJH6JbFg m8wkjh6jbfg;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx = (TQMQBENV49PLMwKLaeaEMWAtYlx) childAt.getLayoutParams();
                if (tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m(i5) && (m8wkjh6jbfg = tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m) != null) {
                    int[] iArr2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    m8wkjh6jbfg.HzCpKshMOoaw76hFcbOVRYMeRd(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            h3jnZRsdwYJfY9UhQCkbvWciwvFHv(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof TQMQBENV49PLMwKLaeaEMWAtYlx) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        m8WKJH6JbFg m8wkjh6jbfg = ((TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (m8wkjh6jbfg != null) {
            m8wkjh6jbfg.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.ko09zE6UAgwkV;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void f6ZQsR6bPLvvCDNXOUc(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            m8WKJH6JbFg m8wkjh6jbfg = ((TQMQBENV49PLMwKLaeaEMWAtYlx) childAt.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (m8wkjh6jbfg != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    m8wkjh6jbfg.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this, childAt, motionEventObtain);
                } else {
                    m8wkjh6jbfg.pYmKDYlAmhudp(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((TQMQBENV49PLMwKLaeaEMWAtYlx) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.KUYypEB4eNWOZWVDpH = null;
        this.GI83zq0G8e7zkn = false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new TQMQBENV49PLMwKLaeaEMWAtYlx();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new TQMQBENV49PLMwKLaeaEMWAtYlx(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        jW7EiD0YL6xkbB158jMUzhWNWb1y();
        return Collections.unmodifiableList(this.V57tEvNfxZVVcOCAOih5PKr);
    }

    public final pmJH8rqWIwRth8COqq getLastWindowInsets() {
        return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k = this.vBGA6pPLqSMuYGvprl270j7;
        return myybsd3x3kfsabnorz7k.zzpBGItXfub0yWj | myybsd3x3kfsabnorz7k.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public Drawable getStatusBarBackground() {
        return this.ko09zE6UAgwkV;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int r23) {
        /*
            Method dump skipped, instruction units count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void jW7EiD0YL6xkbB158jMUzhWNWb1y() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.jW7EiD0YL6xkbB158jMUzhWNWb1y():void");
    }

    public final boolean ko09zE6UAgwkV(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        T3RbnymT8IuKvnwatFNeNL7H t3RbnymT8IuKvnwatFNeNL7H = w0Wu95l8dVNw5rZMRu;
        if (t3RbnymT8IuKvnwatFNeNL7H != null) {
            Collections.sort(arrayList, t3RbnymT8IuKvnwatFNeNL7H);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zZIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            m8WKJH6JbFg m8wkjh6jbfg = ((TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (zZIvmSL0wzmmKGc3X39b2Gw2mUGE && actionMasked != 0) {
                if (m8wkjh6jbfg != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        m8wkjh6jbfg.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this, view, motionEventObtain);
                    } else if (i == 1) {
                        m8wkjh6jbfg.pYmKDYlAmhudp(view, motionEventObtain);
                    }
                }
            } else if (!zZIvmSL0wzmmKGc3X39b2Gw2mUGE && m8wkjh6jbfg != null) {
                if (i == 0) {
                    zZIvmSL0wzmmKGc3X39b2Gw2mUGE = m8wkjh6jbfg.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this, view, motionEvent);
                } else if (i == 1) {
                    zZIvmSL0wzmmKGc3X39b2Gw2mUGE = m8wkjh6jbfg.pYmKDYlAmhudp(view, motionEvent);
                }
                if (zZIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                    this.KUYypEB4eNWOZWVDpH = view;
                }
            }
        }
        arrayList.clear();
        return zZIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f6ZQsR6bPLvvCDNXOUc(false);
        if (this.Ca81ebIan1u) {
            if (this.p59rPv72J9 == null) {
                this.p59rPv72J9 = new VyBF7fhUIIa2YxT(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.p59rPv72J9);
        }
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == null) {
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (getFitsSystemWindows()) {
                UFStPSj5DrcqcfR2RymfmG.V57tEvNfxZVVcOCAOih5PKr(this);
            }
        }
        this.M9e7PWhFYLD2lOGMker = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f6ZQsR6bPLvvCDNXOUc(false);
        if (this.Ca81ebIan1u && this.p59rPv72J9 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.p59rPv72J9);
        }
        View view = this.q1wNbhk2O6;
        if (view != null) {
            zzpBGItXfub0yWj(view, 0);
        }
        this.M9e7PWhFYLD2lOGMker = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.pYmKDYlAmhudp || this.ko09zE6UAgwkV == null) {
            return;
        }
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int iZfQNn8hdWlEQ5cR94249PDsLR = pmjh8rqwiwrth8coqq != null ? pmjh8rqwiwrth8coqq.ZfQNn8hdWlEQ5cR94249PDsLR() : 0;
        if (iZfQNn8hdWlEQ5cR94249PDsLR > 0) {
            this.ko09zE6UAgwkV.setBounds(0, 0, getWidth(), iZfQNn8hdWlEQ5cR94249PDsLR);
            this.ko09zE6UAgwkV.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            f6ZQsR6bPLvvCDNXOUc(true);
        }
        boolean zKo09zE6UAgwkV = ko09zE6UAgwkV(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zKo09zE6UAgwkV;
        }
        f6ZQsR6bPLvvCDNXOUc(true);
        return zKo09zE6UAgwkV;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m8WKJH6JbFg m8wkjh6jbfg;
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.V57tEvNfxZVVcOCAOih5PKr;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((m8wkjh6jbfg = ((TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m) == null || !m8wkjh6jbfg.ZLZeBXTMq0zDztBxtRTuCHrapQ(this, view, layoutDirection))) {
                pYmKDYlAmhudp(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx = (TQMQBENV49PLMwKLaeaEMWAtYlx) childAt.getLayoutParams();
                if (tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m(0)) {
                    m8WKJH6JbFg m8wkjh6jbfg = tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        m8WKJH6JbFg m8wkjh6jbfg;
        int childCount = getChildCount();
        boolean zGI83zq0G8e7zkn = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx = (TQMQBENV49PLMwKLaeaEMWAtYlx) childAt.getLayoutParams();
                if (tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m(0) && (m8wkjh6jbfg = tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m) != null) {
                    zGI83zq0G8e7zkn |= m8wkjh6jbfg.GI83zq0G8e7zkn(view);
                }
            }
        }
        return zGI83zq0G8e7zkn;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        V57tEvNfxZVVcOCAOih5PKr(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        LaeGQIruHQu81hfJldjMOQSVblH3x(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof hEYsqrbxMHwbqcHPUghYJ00k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        hEYsqrbxMHwbqcHPUghYJ00k heysqrbxmhwbqchpughyj00k = (hEYsqrbxMHwbqcHPUghYJ00k) parcelable;
        super.onRestoreInstanceState(heysqrbxmhwbqchpughyj00k.V57tEvNfxZVVcOCAOih5PKr);
        SparseArray sparseArray = heysqrbxmhwbqchpughyj00k.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            m8WKJH6JbFg m8wkjh6jbfg = p59rPv72J9(childAt).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (id != -1 && m8wkjh6jbfg != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                m8wkjh6jbfg.q1wNbhk2O6(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableP59rPv72J9;
        hEYsqrbxMHwbqcHPUghYJ00k heysqrbxmhwbqchpughyj00k = new hEYsqrbxMHwbqcHPUghYJ00k(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            m8WKJH6JbFg m8wkjh6jbfg = ((TQMQBENV49PLMwKLaeaEMWAtYlx) childAt.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (id != -1 && m8wkjh6jbfg != null && (parcelableP59rPv72J9 = m8wkjh6jbfg.p59rPv72J9(childAt)) != null) {
                sparseArray.append(id, parcelableP59rPv72J9);
            }
        }
        heysqrbxmhwbqchpughyj00k.LaeGQIruHQu81hfJldjMOQSVblH3x = sparseArray;
        return heysqrbxmhwbqchpughyj00k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return zIvmSL0wzmmKGc3X39b2Gw2mUGE(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        zzpBGItXfub0yWj(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.KUYypEB4eNWOZWVDpH
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.ko09zE6UAgwkV(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.KUYypEB4eNWOZWVDpH
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.vdodsodjsdt.TQMQBENV49PLMwKLaeaEMWAtYlx r6 = (com.vdodsodjsdt.TQMQBENV49PLMwKLaeaEMWAtYlx) r6
            com.vdodsodjsdt.m8WKJH6JbFg r6 = r6.VxUQ9tBhpHJ2AAEDNW8sghc4m
            if (r6 == 0) goto L15
            android.view.View r7 = r0.KUYypEB4eNWOZWVDpH
            boolean r6 = r6.pYmKDYlAmhudp(r7, r1)
        L2a:
            android.view.View r7 = r0.KUYypEB4eNWOZWVDpH
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.f6ZQsR6bPLvvCDNXOUc(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void pYmKDYlAmhudp(View view, int i) {
        Rect rectZLZeBXTMq0zDztBxtRTuCHrapQ;
        Rect rectZLZeBXTMq0zDztBxtRTuCHrapQ2;
        TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx = (TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams();
        View view2 = tQMQBENV49PLMwKLaeaEMWAtYlx.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (view2 == null && tQMQBENV49PLMwKLaeaEMWAtYlx.zIvmSL0wzmmKGc3X39b2Gw2mUGE != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        yh77kBiYEzPefn6koPeG9t8 yh77kbiyezpefn6kopeg9t8 = RhfGHxtXxy0M0grmp2jkRjQg;
        if (view2 != null) {
            rectZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ();
            rectZLZeBXTMq0zDztBxtRTuCHrapQ2 = ZLZeBXTMq0zDztBxtRTuCHrapQ();
            try {
                HzCpKshMOoaw76hFcbOVRYMeRd(view2, rectZLZeBXTMq0zDztBxtRTuCHrapQ);
                TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx2 = (TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                KUYypEB4eNWOZWVDpH(i, rectZLZeBXTMq0zDztBxtRTuCHrapQ, rectZLZeBXTMq0zDztBxtRTuCHrapQ2, tQMQBENV49PLMwKLaeaEMWAtYlx2, measuredWidth, measuredHeight);
                NSjgqmGjEzuugn2SsG1mZFP(tQMQBENV49PLMwKLaeaEMWAtYlx2, rectZLZeBXTMq0zDztBxtRTuCHrapQ2, measuredWidth, measuredHeight);
                view.layout(rectZLZeBXTMq0zDztBxtRTuCHrapQ2.left, rectZLZeBXTMq0zDztBxtRTuCHrapQ2.top, rectZLZeBXTMq0zDztBxtRTuCHrapQ2.right, rectZLZeBXTMq0zDztBxtRTuCHrapQ2.bottom);
                return;
            } finally {
                rectZLZeBXTMq0zDztBxtRTuCHrapQ.setEmpty();
                yh77kbiyezpefn6kopeg9t8.V57tEvNfxZVVcOCAOih5PKr(rectZLZeBXTMq0zDztBxtRTuCHrapQ);
                rectZLZeBXTMq0zDztBxtRTuCHrapQ2.setEmpty();
                yh77kbiyezpefn6kopeg9t8.V57tEvNfxZVVcOCAOih5PKr(rectZLZeBXTMq0zDztBxtRTuCHrapQ2);
            }
        }
        int i2 = tQMQBENV49PLMwKLaeaEMWAtYlx.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i2 < 0) {
            TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx3 = (TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams();
            rectZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ();
            rectZLZeBXTMq0zDztBxtRTuCHrapQ.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx3).bottomMargin);
            if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv != null) {
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectZLZeBXTMq0zDztBxtRTuCHrapQ.left = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.zzpBGItXfub0yWj() + rectZLZeBXTMq0zDztBxtRTuCHrapQ.left;
                    rectZLZeBXTMq0zDztBxtRTuCHrapQ.top = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.ZfQNn8hdWlEQ5cR94249PDsLR() + rectZLZeBXTMq0zDztBxtRTuCHrapQ.top;
                    rectZLZeBXTMq0zDztBxtRTuCHrapQ.right -= this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.V57tEvNfxZVVcOCAOih5PKr();
                    rectZLZeBXTMq0zDztBxtRTuCHrapQ.bottom -= this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                }
            }
            rectZLZeBXTMq0zDztBxtRTuCHrapQ2 = ZLZeBXTMq0zDztBxtRTuCHrapQ();
            int i3 = tQMQBENV49PLMwKLaeaEMWAtYlx3.V57tEvNfxZVVcOCAOih5PKr;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectZLZeBXTMq0zDztBxtRTuCHrapQ, rectZLZeBXTMq0zDztBxtRTuCHrapQ2, i);
            view.layout(rectZLZeBXTMq0zDztBxtRTuCHrapQ2.left, rectZLZeBXTMq0zDztBxtRTuCHrapQ2.top, rectZLZeBXTMq0zDztBxtRTuCHrapQ2.right, rectZLZeBXTMq0zDztBxtRTuCHrapQ2.bottom);
            return;
        }
        TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx4 = (TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams();
        int i4 = tQMQBENV49PLMwKLaeaEMWAtYlx4.V57tEvNfxZVVcOCAOih5PKr;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int iQ1wNbhk2O6 = q1wNbhk2O6(i2) - measuredWidth2;
        if (i5 == 1) {
            iQ1wNbhk2O6 += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iQ1wNbhk2O6 += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx4).leftMargin, Math.min(iQ1wNbhk2O6, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) tQMQBENV49PLMwKLaeaEMWAtYlx4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final int q1wNbhk2O6(int i) {
        int[] iArr = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        m8WKJH6JbFg m8wkjh6jbfg = ((TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (m8wkjh6jbfg != null) {
            m8wkjh6jbfg.KUYypEB4eNWOZWVDpH(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.GI83zq0G8e7zkn) {
            return;
        }
        f6ZQsR6bPLvvCDNXOUc(false);
        this.GI83zq0G8e7zkn = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        Irh5auREsoeV1C1RaBamlmy();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.ko09zE6UAgwkV;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.ko09zE6UAgwkV = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.ko09zE6UAgwkV.setState(getDrawableState());
                }
                Drawable drawable3 = this.ko09zE6UAgwkV;
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.ko09zE6UAgwkV.setVisible(getVisibility() == 0, false);
                this.ko09zE6UAgwkV.setCallback(this);
            }
            WeakHashMap weakHashMap2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.ko09zE6UAgwkV;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.ko09zE6UAgwkV.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.ko09zE6UAgwkV;
    }

    @Override // com.vdodsodjsdt.L6NsbfO6KnE8o1cSViY8X
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx = (TQMQBENV49PLMwKLaeaEMWAtYlx) childAt.getLayoutParams();
                m8WKJH6JbFg m8wkjh6jbfg = tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (m8wkjh6jbfg != null) {
                    boolean zCa81ebIan1u = m8wkjh6jbfg.Ca81ebIan1u(childAt, i, i2);
                    z |= zCa81ebIan1u;
                    if (i2 == 0) {
                        tQMQBENV49PLMwKLaeaEMWAtYlx.q1wNbhk2O6 = zCa81ebIan1u;
                    } else if (i2 == 1) {
                        tQMQBENV49PLMwKLaeaEMWAtYlx.p59rPv72J9 = zCa81ebIan1u;
                    }
                } else if (i2 == 0) {
                    tQMQBENV49PLMwKLaeaEMWAtYlx.q1wNbhk2O6 = false;
                } else if (i2 == 1) {
                    tQMQBENV49PLMwKLaeaEMWAtYlx.p59rPv72J9 = false;
                }
            }
        }
        return z;
    }

    @Override // com.vdodsodjsdt.L6NsbfO6KnE8o1cSViY8X
    public final void zzpBGItXfub0yWj(View view, int i) {
        mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k = this.vBGA6pPLqSMuYGvprl270j7;
        if (i == 1) {
            myybsd3x3kfsabnorz7k.zzpBGItXfub0yWj = 0;
        } else {
            myybsd3x3kfsabnorz7k.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx = (TQMQBENV49PLMwKLaeaEMWAtYlx) childAt.getLayoutParams();
            if (tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m(i)) {
                m8WKJH6JbFg m8wkjh6jbfg = tQMQBENV49PLMwKLaeaEMWAtYlx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (m8wkjh6jbfg != null) {
                    m8wkjh6jbfg.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(childAt, view, i);
                }
                if (i == 0) {
                    tQMQBENV49PLMwKLaeaEMWAtYlx.q1wNbhk2O6 = false;
                } else if (i == 1) {
                    tQMQBENV49PLMwKLaeaEMWAtYlx.p59rPv72J9 = false;
                }
            }
        }
        this.q1wNbhk2O6 = null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof TQMQBENV49PLMwKLaeaEMWAtYlx ? new TQMQBENV49PLMwKLaeaEMWAtYlx((TQMQBENV49PLMwKLaeaEMWAtYlx) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new TQMQBENV49PLMwKLaeaEMWAtYlx((ViewGroup.MarginLayoutParams) layoutParams) : new TQMQBENV49PLMwKLaeaEMWAtYlx(layoutParams);
    }
}
