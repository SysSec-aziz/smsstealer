package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.vdodsodjsdt.DerC1yFc8TaMSlgxC6TqZtz9;
import com.vdodsodjsdt.Dqd3yw7CrPyec1dms6HVj;
import com.vdodsodjsdt.K4LDBTJwLOCiiDq;
import com.vdodsodjsdt.QOMlgg2N3CPFvlf;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.UFStPSj5DrcqcfR2RymfmG;
import com.vdodsodjsdt.cNIeQoFtkP719MDlq5ja8Wvt;
import com.vdodsodjsdt.dip85SLOWSmNG3;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.jdmWSds1UynWLk6T3nA00aPzo4XP;
import com.vdodsodjsdt.okcUO69vEcgndIAn0R;
import com.vdodsodjsdt.pmJH8rqWIwRth8COqq;
import com.vdodsodjsdt.u9SlVAuoWhQUfJ;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import com.vdodsodjsdt.zf8a67a5ZO524dLUgOFxsfO;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public View.OnApplyWindowInsetsListener LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final ArrayList V57tEvNfxZVVcOCAOih5PKr;
    public final ArrayList ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        this.V57tEvNfxZVVcOCAOih5PKr = new ArrayList();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cNIeQoFtkP719MDlq5ja8Wvt.zzpBGItXfub0yWj, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(View view) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR.contains(view)) {
            this.V57tEvNfxZVVcOCAOih5PKr.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ej6unYlOWMDF.pYmKDYlAmhudp(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof dip85SLOWSmNG3 ? (dip85SLOWSmNG3) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ;
        ej6unYlOWMDF.pYmKDYlAmhudp(windowInsets, "insets");
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ2 = pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ = pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            WindowInsets windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE = pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ2.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            if (windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE != null) {
                WindowInsets windowInsetsZzpBGItXfub0yWj = UFStPSj5DrcqcfR2RymfmG.zzpBGItXfub0yWj(this, windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE);
                if (!windowInsetsZzpBGItXfub0yWj.equals(windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
                    pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ2 = pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(this, windowInsetsZzpBGItXfub0yWj);
                }
            }
            pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ = pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ2;
        }
        if (!pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ.VxUQ9tBhpHJ2AAEDNW8sghc4m.q1wNbhk2O6()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                xb0r6yEzq0tw9m7nTWG5BFR8.zzpBGItXfub0yWj(getChildAt(i), pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ej6unYlOWMDF.pYmKDYlAmhudp(canvas, "canvas");
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            ArrayList arrayList = this.V57tEvNfxZVVcOCAOih5PKr;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ej6unYlOWMDF.pYmKDYlAmhudp(canvas, "canvas");
        ej6unYlOWMDF.pYmKDYlAmhudp(view, "child");
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            ArrayList arrayList = this.V57tEvNfxZVVcOCAOih5PKr;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ej6unYlOWMDF.pYmKDYlAmhudp(view, "view");
        this.ZfQNn8hdWlEQ5cR94249PDsLR.remove(view);
        if (this.V57tEvNfxZVVcOCAOih5PKr.remove(view)) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends dip85SLOWSmNG3> F getFragment() {
        zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo;
        dip85SLOWSmNG3 dip85slowsmng3;
        okcUO69vEcgndIAn0R okcuo69vecgndian0rZLZeBXTMq0zDztBxtRTuCHrapQ;
        View view = this;
        while (true) {
            zf8a67a5zo524dlugofxsfo = null;
            if (view == null) {
                dip85slowsmng3 = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            dip85slowsmng3 = tag instanceof dip85SLOWSmNG3 ? (dip85SLOWSmNG3) tag : null;
            if (dip85slowsmng3 != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (dip85slowsmng3 == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof zf8a67a5ZO524dLUgOFxsfO) {
                    zf8a67a5zo524dlugofxsfo = (zf8a67a5ZO524dLUgOFxsfO) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (zf8a67a5zo524dlugofxsfo == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            okcuo69vecgndian0rZLZeBXTMq0zDztBxtRTuCHrapQ = ((Dqd3yw7CrPyec1dms6HVj) zf8a67a5zo524dlugofxsfo.TaDO7ogis3aEiWEtq.ZfQNn8hdWlEQ5cR94249PDsLR).Ca81ebIan1u;
        } else {
            if (dip85slowsmng3.vBGA6pPLqSMuYGvprl270j7 == null || !dip85slowsmng3.q1wNbhk2O6) {
                throw new IllegalStateException("The Fragment " + dip85slowsmng3 + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            okcuo69vecgndian0rZLZeBXTMq0zDztBxtRTuCHrapQ = dip85slowsmng3.ZLZeBXTMq0zDztBxtRTuCHrapQ();
        }
        return (F) okcuo69vecgndian0rZLZeBXTMq0zDztBxtRTuCHrapQ.qNPQb1obP7(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        ej6unYlOWMDF.pYmKDYlAmhudp(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(childAt, "view");
                VxUQ9tBhpHJ2AAEDNW8sghc4m(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        ej6unYlOWMDF.pYmKDYlAmhudp(view, "view");
        VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(childAt, "view");
        VxUQ9tBhpHJ2AAEDNW8sghc4m(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        ej6unYlOWMDF.pYmKDYlAmhudp(view, "view");
        VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(childAt, "view");
            VxUQ9tBhpHJ2AAEDNW8sghc4m(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(childAt, "view");
            VxUQ9tBhpHJ2AAEDNW8sghc4m(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        ej6unYlOWMDF.pYmKDYlAmhudp(onApplyWindowInsetsListener, "listener");
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        ej6unYlOWMDF.pYmKDYlAmhudp(view, "view");
        if (view.getParent() == this) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, okcUO69vEcgndIAn0R okcuo69vecgndian0r) {
        View view;
        super(context, attributeSet);
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        ej6unYlOWMDF.pYmKDYlAmhudp(attributeSet, "attrs");
        this.V57tEvNfxZVVcOCAOih5PKr = new ArrayList();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cNIeQoFtkP719MDlq5ja8Wvt.zzpBGItXfub0yWj, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        dip85SLOWSmNG3 dip85slowsmng3QNPQb1obP7 = okcuo69vecgndian0r.qNPQb1obP7(id);
        if (classAttribute != null && dip85slowsmng3QNPQb1obP7 == null) {
            if (id == -1) {
                throw new IllegalStateException(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            jdmWSds1UynWLk6T3nA00aPzo4XP jdmwsds1uynwlk6t3na00apzo4xpPzqP2AqKW6J5PO8zCKnW = okcuo69vecgndian0r.pzqP2AqKW6J5PO8zCKnW();
            context.getClassLoader();
            dip85SLOWSmNG3 dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m = jdmwsds1uynwlk6t3na00apzo4xpPzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m(classAttribute);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.vE4yDIjexsP2lGjLaTcB = true;
            Dqd3yw7CrPyec1dms6HVj dqd3yw7CrPyec1dms6HVj = dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.vBGA6pPLqSMuYGvprl270j7;
            if ((dqd3yw7CrPyec1dms6HVj == null ? null : dqd3yw7CrPyec1dms6HVj.KUYypEB4eNWOZWVDpH) != null) {
                dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.vE4yDIjexsP2lGjLaTcB = true;
            }
            DerC1yFc8TaMSlgxC6TqZtz9 derC1yFc8TaMSlgxC6TqZtz9 = new DerC1yFc8TaMSlgxC6TqZtz9(okcuo69vecgndian0r);
            derC1yFc8TaMSlgxC6TqZtz9.Ca81ebIan1u = true;
            dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.O1xDAlBZZlZdoEf747lCFHld = this;
            int id2 = getId();
            String str = dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.CixTK5ZX8oWXHz34qHYV;
            if (str != null) {
                K4LDBTJwLOCiiDq.V57tEvNfxZVVcOCAOih5PKr(dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m, str);
            }
            Class<?> cls = dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
            int modifiers = cls.getModifiers();
            if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                if (string != null) {
                    String str2 = dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.RhfGHxtXxy0M0grmp2jkRjQg;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m + ": was " + dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.RhfGHxtXxy0M0grmp2jkRjQg + " now " + string);
                    }
                    dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.RhfGHxtXxy0M0grmp2jkRjQg = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m + " with tag " + string + " to container view with no id");
                    }
                    int i2 = dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.q11o1hieEkZDhF1MGOZI26oZiDT;
                    if (i2 != 0 && i2 != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m + ": was " + dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.q11o1hieEkZDhF1MGOZI26oZiDT + " now " + id2);
                    }
                    dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.q11o1hieEkZDhF1MGOZI26oZiDT = id2;
                    dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.w0Wu95l8dVNw5rZMRu = id2;
                }
                derC1yFc8TaMSlgxC6TqZtz9.zzpBGItXfub0yWj(new QOMlgg2N3CPFvlf(1, dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m));
                okcUO69vEcgndIAn0R okcuo69vecgndian0r2 = derC1yFc8TaMSlgxC6TqZtz9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.f6ZQsR6bPLvvCDNXOUc = okcuo69vecgndian0r2;
                if (!derC1yFc8TaMSlgxC6TqZtz9.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                    if (okcuo69vecgndian0r2.f6ZQsR6bPLvvCDNXOUc != null && !okcuo69vecgndian0r2.HVEwbdULInpTNa0IG) {
                        okcuo69vecgndian0r2.q11o1hieEkZDhF1MGOZI26oZiDT(true);
                        derC1yFc8TaMSlgxC6TqZtz9.VxUQ9tBhpHJ2AAEDNW8sghc4m(okcuo69vecgndian0r2.qygqjTppWwx992, okcuo69vecgndian0r2.iKANjmyTSxO6v6UuLPdu7DxOjlS);
                        okcuo69vecgndian0r2.zzpBGItXfub0yWj = true;
                        try {
                            okcuo69vecgndian0r2.gBaBUmihn5l4u(okcuo69vecgndian0r2.qygqjTppWwx992, okcuo69vecgndian0r2.iKANjmyTSxO6v6UuLPdu7DxOjlS);
                            okcuo69vecgndian0r2.ZfQNn8hdWlEQ5cR94249PDsLR();
                            okcuo69vecgndian0r2.rERAmyEtGV6ANGszuKcQI();
                            if (okcuo69vecgndian0r2.y1NaPKTl7R18DOr6e8i5) {
                                okcuo69vecgndian0r2.y1NaPKTl7R18DOr6e8i5 = false;
                                okcuo69vecgndian0r2.zOk739gUM7zIZC25HHUxoiyixWFjn();
                            }
                            ((HashMap) okcuo69vecgndian0r2.V57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR).values().removeAll(Collections.singleton(null));
                        } catch (Throwable th) {
                            okcuo69vecgndian0r2.ZfQNn8hdWlEQ5cR94249PDsLR();
                            throw th;
                        }
                    }
                } else {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
            } else {
                throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
            }
        }
        ArrayList arrayListM9e7PWhFYLD2lOGMker = okcuo69vecgndian0r.V57tEvNfxZVVcOCAOih5PKr.M9e7PWhFYLD2lOGMker();
        int size = arrayListM9e7PWhFYLD2lOGMker.size();
        while (i < size) {
            Object obj = arrayListM9e7PWhFYLD2lOGMker.get(i);
            i++;
            iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = (iVKrTMqOw0TqCeNN) obj;
            dip85SLOWSmNG3 dip85slowsmng3 = ivkrtmqow0tqcenn.V57tEvNfxZVVcOCAOih5PKr;
            if (dip85slowsmng3.w0Wu95l8dVNw5rZMRu == getId() && (view = dip85slowsmng3.HVEwbdULInpTNa0IG) != null && view.getParent() == null) {
                dip85slowsmng3.O1xDAlBZZlZdoEf747lCFHld = this;
                ivkrtmqow0tqcenn.zzpBGItXfub0yWj();
            }
        }
    }
}
