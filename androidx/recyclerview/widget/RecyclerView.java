package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import com.vdodsodjsdt.CluohSX0eAQHylXJOFOnCXEf0C;
import com.vdodsodjsdt.FG8LIxsgYiLSfhN0jYKIKr;
import com.vdodsodjsdt.H73tKnp5B8;
import com.vdodsodjsdt.IxShTNMvCWlbR;
import com.vdodsodjsdt.LAiDD5zgtCnRDrgc;
import com.vdodsodjsdt.MSl7hPM6XqjxyBV5m;
import com.vdodsodjsdt.N2LAiRuyxj3sEvVYMse9;
import com.vdodsodjsdt.NrjuzzioPqfttNRptBDpZDzSYUrcM;
import com.vdodsodjsdt.O0SqJkZ6TdwXznZb0Nd;
import com.vdodsodjsdt.O23cBAsx5mVwcI;
import com.vdodsodjsdt.OIQnrK0mzZ;
import com.vdodsodjsdt.RAU9GtBZd7wl;
import com.vdodsodjsdt.RfOSIaL6qUBGKJY9MSCBP5ba;
import com.vdodsodjsdt.S2nN0Z2yP6NYzcJu8Sd;
import com.vdodsodjsdt.Skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
import com.vdodsodjsdt.SobBKwD5hB;
import com.vdodsodjsdt.TBOn1G6tgZKbOPI1mnHhsMX2mq3mV;
import com.vdodsodjsdt.UL4JI0eLnaD84py2JT;
import com.vdodsodjsdt.WFEUpQgjHl;
import com.vdodsodjsdt.WyxLGtS3Pb5NW7tq5LMcx;
import com.vdodsodjsdt.Y8unnL6HZ8WXVIsfrePA3V331ck;
import com.vdodsodjsdt.YoYMmBKQmkacZj7lMi9c;
import com.vdodsodjsdt.YrYFQ7bf7bxLdH;
import com.vdodsodjsdt.cCsw66b243HzgVzE4uRxrAcogfXx6;
import com.vdodsodjsdt.e20NJ5kD0wqGO3;
import com.vdodsodjsdt.ecw4qnyPnY9UWzcAo9wor;
import com.vdodsodjsdt.gyW4eNRmBwjuW3u2WIcISTc7kFD9;
import com.vdodsodjsdt.hWsX15LBWoRzT;
import com.vdodsodjsdt.km3hhVZDUIOp1cDFgeK9;
import com.vdodsodjsdt.kxD7lnfhVByiEwFdNtrRslxulbe;
import com.vdodsodjsdt.lJgFFp37ou;
import com.vdodsodjsdt.mYybSD3X3KfsAbnorz7K;
import com.vdodsodjsdt.nWfeFfb6D2ofx6xWm;
import com.vdodsodjsdt.o6OxmOsCD9HJ6LF8UTncnTX9Cf21;
import com.vdodsodjsdt.oHePsoiIXTc4hB;
import com.vdodsodjsdt.oPArt9CaBB;
import com.vdodsodjsdt.r7fKZGfezTdpRAhj;
import com.vdodsodjsdt.s1HWM1e1d8DbWRjBkwUg1fGy;
import com.vdodsodjsdt.sSTjsLE9Ugp7iXfnwi18Akn1Jt;
import com.vdodsodjsdt.u9SlVAuoWhQUfJ;
import com.vdodsodjsdt.vBbBrJPQxVfAKJPVGhF3v;
import com.vdodsodjsdt.vNbPG5KyhGfYLWoUO;
import com.vdodsodjsdt.wQvZok2Lu79;
import com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu;
import com.vdodsodjsdt.xBkpwtKksCOQS;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import com.vdodsodjsdt.xnjnd5YIMmACJ;
import com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final Class[] G479XgNG9rK8jPPbSXr;
    public static final oPArt9CaBB Pf1HsU8AK92buCoUaexm5AC;
    public static final int[] r0dB0ojIy6g8mnk1 = {R.attr.nestedScrollingEnabled};
    public final RfOSIaL6qUBGKJY9MSCBP5ba AFOcXGdvoTMuqwiG8tD;
    public boolean BDoqAMf0rlMRAnVghjC4qjG;
    public boolean BJQHddi0Plr5ElWetCyaixWOg9;
    public final int[] ByTQIhgl7ezGvHXEd;
    public final ArrayList Ca81ebIan1u;
    public int CixTK5ZX8oWXHz34qHYV;
    public SobBKwD5hB GE1sqSYiEYQO2ew7WEZwTtUeS5;
    public boolean GI83zq0G8e7zkn;
    public final e20NJ5kD0wqGO3 H2VFYNJEVGAX;
    public final int[] HAPpjhiCsV9ONY23505HCBI9IX;
    public EdgeEffect HVEwbdULInpTNa0IG;
    public final Rect HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean Irh5auREsoeV1C1RaBamlmy;
    public final int ItrQwCXbty5PZtje5JS;
    public vNbPG5KyhGfYLWoUO JUdwvN8LfOMa;
    public final RectF KUYypEB4eNWOZWVDpH;
    public boolean KYZ9RyuOc42A2J;
    public int L8DMw02rUTs2w;
    public s1HWM1e1d8DbWRjBkwUg1fGy LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Rect M9e7PWhFYLD2lOGMker;
    public final o6OxmOsCD9HJ6LF8UTncnTX9Cf21 NSjgqmGjEzuugn2SsG1mZFP;
    public LAiDD5zgtCnRDrgc O1xDAlBZZlZdoEf747lCFHld;
    public int RhfGHxtXxy0M0grmp2jkRjQg;
    public boolean SuB3hEmTmbbRGAhtvOOmfKEon;
    public int TaDO7ogis3aEiWEtq;
    public RAU9GtBZd7wl TqcnImqkSWIKht;
    public final FG8LIxsgYiLSfhN0jYKIKr V57tEvNfxZVVcOCAOih5PKr;
    public int VOvSEdhaZyc0oOGQ8;
    public int YdNRGRc4rly;
    public vBbBrJPQxVfAKJPVGhF3v Z1FjjMJ0suz8AFI7gsA4GDLMXv;
    public final NrjuzzioPqfttNRptBDpZDzSYUrcM ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final yhxKWuE1ZRi6a9VAU8HG9C ZfQNn8hdWlEQ5cR94249PDsLR;
    public int aXO0LSrt8bKV;
    public ArrayList bjhcQ0u7VT2OYYrwk96HrWoN;
    public int d9zDyyznnp3oaDT1Ug;
    public final ArrayList e1gEV3X9xwmHj;
    public boolean f6ZQsR6bPLvvCDNXOUc;
    public int gBaBUmihn5l4u;
    public final IxShTNMvCWlbR h2b7InwIaORKN91X7whfQh4;
    public final ArrayList h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final int hKs1wlZyvtUNaW1f5ABIGacfPcvX;
    public EdgeEffect iKANjmyTSxO6v6UuLPdu7DxOjlS;
    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public O23cBAsx5mVwcI ko09zE6UAgwkV;
    public int lQ0rO9lhQIyVe7Rp6;
    public int lxWWbfAOLs4jWzd7PSIiIJ;
    public final IxShTNMvCWlbR mhUCRR8ceqc7mAozW;
    public wbBBe1vAdVO1DmSg1odNaySAYTu p59rPv72J9;
    public cCsw66b243HzgVzE4uRxrAcogfXx6 p6bBrs4p3Ly;
    public final ArrayList pYmKDYlAmhudp;
    public boolean pzqP2AqKW6J5PO8zCKnW;
    public boolean q11o1hieEkZDhF1MGOZI26oZiDT;
    public YrYFQ7bf7bxLdH q1wNbhk2O6;
    public final AccessibilityManager qNPQb1obP7;
    public EdgeEffect qygqjTppWwx992;
    public boolean rE05n5RsRkyWKIeA9cmLXAKv4Hze;
    public final MSl7hPM6XqjxyBV5m rERAmyEtGV6ANGszuKcQI;
    public boolean tFRdVJAePmTx77bP7FAN0uI;
    public final int[] tpEo0fy9FaoJYrSFHRfIK6;
    public final int[] ubNpdCC1pl7L;
    public boolean vBGA6pPLqSMuYGvprl270j7;
    public int vE4yDIjexsP2lGjLaTcB;
    public final float vXWl0o6I4U59CgHs9;
    public boolean w0Wu95l8dVNw5rZMRu;
    public N2LAiRuyxj3sEvVYMse9 wR7sbzHKf9hYV1lxoS6nqyszepWvN;
    public int wRCD0SdqWCowdYU7bmzN;
    public final float wdI7vzA3Qmcwd;
    public EdgeEffect y1NaPKTl7R18DOr6e8i5;
    public VelocityTracker ymT6yQrus3w;
    public final UL4JI0eLnaD84py2JT zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final Y8unnL6HZ8WXVIsfrePA3V331ck zOk739gUM7zIZC25HHUxoiyixWFjn;

    static {
        Class cls = Integer.TYPE;
        G479XgNG9rK8jPPbSXr = new Class[]{Context.class, AttributeSet.class, cls, cls};
        Pf1HsU8AK92buCoUaexm5AC = new oPArt9CaBB(0);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.vdodsodjsdt.R.attr.recyclerViewStyle);
    }

    public static void M9e7PWhFYLD2lOGMker(WFEUpQgjHl wFEUpQgjHl) {
        WeakReference weakReference = wFEUpQgjHl.zzpBGItXfub0yWj;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            wFEUpQgjHl.zzpBGItXfub0yWj = null;
        }
    }

    public static RecyclerView aXO0LSrt8bKV(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewAXO0LSrt8bKV = aXO0LSrt8bKV(viewGroup.getChildAt(i));
            if (recyclerViewAXO0LSrt8bKV != null) {
                return recyclerViewAXO0LSrt8bKV;
            }
        }
        return null;
    }

    private N2LAiRuyxj3sEvVYMse9 getScrollingChildHelper() {
        if (this.wR7sbzHKf9hYV1lxoS6nqyszepWvN == null) {
            this.wR7sbzHKf9hYV1lxoS6nqyszepWvN = new N2LAiRuyxj3sEvVYMse9(this);
        }
        return this.wR7sbzHKf9hYV1lxoS6nqyszepWvN;
    }

    public static WFEUpQgjHl qygqjTppWwx992(View view) {
        if (view == null) {
            return null;
        }
        return ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b8  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Ca81ebIan1u() {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Ca81ebIan1u():void");
    }

    public final void CixTK5ZX8oWXHz34qHYV(int i) {
        if (this.p59rPv72J9 == null) {
            return;
        }
        setScrollState(2);
        this.p59rPv72J9.tpEo0fy9FaoJYrSFHRfIK6(i);
        awakenScrollBars();
    }

    public final void GE1sqSYiEYQO2ew7WEZwTtUeS5() {
        int i = this.TaDO7ogis3aEiWEtq + 1;
        this.TaDO7ogis3aEiWEtq = i;
        if (i != 1 || this.q11o1hieEkZDhF1MGOZI26oZiDT) {
            return;
        }
        this.Irh5auREsoeV1C1RaBamlmy = false;
    }

    public final void GI83zq0G8e7zkn(String str) {
        if (d9zDyyznnp3oaDT1Ug()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + w0Wu95l8dVNw5rZMRu());
        }
        if (this.vE4yDIjexsP2lGjLaTcB > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + w0Wu95l8dVNw5rZMRu()));
        }
    }

    public final void H2VFYNJEVGAX(int i) {
        getScrollingChildHelper().NSjgqmGjEzuugn2SsG1mZFP(i);
    }

    public final long HVEwbdULInpTNa0IG(WFEUpQgjHl wFEUpQgjHl) {
        return this.q1wNbhk2O6.zzpBGItXfub0yWj ? wFEUpQgjHl.LaeGQIruHQu81hfJldjMOQSVblH3x : wFEUpQgjHl.V57tEvNfxZVVcOCAOih5PKr;
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd() {
        int iIrh5auREsoeV1C1RaBamlmy = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.Irh5auREsoeV1C1RaBamlmy();
        for (int i = 0; i < iIrh5auREsoeV1C1RaBamlmy; i++) {
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = qygqjTppWwx992(this.ZLZeBXTMq0zDztBxtRTuCHrapQ.TaDO7ogis3aEiWEtq(i));
            if (!wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u()) {
                wFEUpQgjHlQygqjTppWwx992.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
                wFEUpQgjHlQygqjTppWwx992.ZLZeBXTMq0zDztBxtRTuCHrapQ = -1;
            }
        }
        yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ArrayList arrayList = yhxkwue1zri6a9vau8hg9c.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ArrayList arrayList2 = yhxkwue1zri6a9vau8hg9c.V57tEvNfxZVVcOCAOih5PKr;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            WFEUpQgjHl wFEUpQgjHl = (WFEUpQgjHl) arrayList2.get(i2);
            wFEUpQgjHl.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
            wFEUpQgjHl.ZLZeBXTMq0zDztBxtRTuCHrapQ = -1;
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            WFEUpQgjHl wFEUpQgjHl2 = (WFEUpQgjHl) arrayList.get(i3);
            wFEUpQgjHl2.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
            wFEUpQgjHl2.ZLZeBXTMq0zDztBxtRTuCHrapQ = -1;
        }
        ArrayList arrayList3 = yhxkwue1zri6a9vau8hg9c.zzpBGItXfub0yWj;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                WFEUpQgjHl wFEUpQgjHl3 = (WFEUpQgjHl) yhxkwue1zri6a9vau8hg9c.zzpBGItXfub0yWj.get(i4);
                wFEUpQgjHl3.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
                wFEUpQgjHl3.ZLZeBXTMq0zDztBxtRTuCHrapQ = -1;
            }
        }
    }

    public final void Irh5auREsoeV1C1RaBamlmy() {
        if (this.qygqjTppWwx992 != null) {
            return;
        }
        this.O1xDAlBZZlZdoEf747lCFHld.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.qygqjTppWwx992 = edgeEffect;
        if (this.GI83zq0G8e7zkn) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void ItrQwCXbty5PZtje5JS(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.M9e7PWhFYLD2lOGMker;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof YoYMmBKQmkacZj7lMi9c) {
            YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) layoutParams;
            if (!yoYMmBKQmkacZj7lMi9c.V57tEvNfxZVVcOCAOih5PKr) {
                Rect rect2 = yoYMmBKQmkacZj7lMi9c.zzpBGItXfub0yWj;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.p59rPv72J9.wR7sbzHKf9hYV1lxoS6nqyszepWvN(this, view, this.M9e7PWhFYLD2lOGMker, !this.vBGA6pPLqSMuYGvprl270j7, view2 == null);
    }

    public final void JUdwvN8LfOMa(WFEUpQgjHl wFEUpQgjHl, mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k) {
        wFEUpQgjHl.M9e7PWhFYLD2lOGMker &= -8193;
        boolean z = this.H2VFYNJEVGAX.NSjgqmGjEzuugn2SsG1mZFP;
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (z && wFEUpQgjHl.HzCpKshMOoaw76hFcbOVRYMeRd() && !wFEUpQgjHl.NSjgqmGjEzuugn2SsG1mZFP() && !wFEUpQgjHl.Ca81ebIan1u()) {
            ((kxD7lnfhVByiEwFdNtrRslxulbe) o6oxmoscd9hj6lf8utncntx9cf21.ZfQNn8hdWlEQ5cR94249PDsLR).ZfQNn8hdWlEQ5cR94249PDsLR(HVEwbdULInpTNa0IG(wFEUpQgjHl), wFEUpQgjHl);
        }
        sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = (sSTjsLE9Ugp7iXfnwi18Akn1Jt) o6oxmoscd9hj6lf8utncntx9cf21.V57tEvNfxZVVcOCAOih5PKr;
        xnjnd5YIMmACJ xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m = (xnjnd5YIMmACJ) sstjsle9ugp7ixfnwi18akn1jt.get(wFEUpQgjHl);
        if (xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m = xnjnd5YIMmACJ.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            sstjsle9ugp7ixfnwi18akn1jt.put(wFEUpQgjHl, xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj = myybsd3x3kfsabnorz7k;
        xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m |= 4;
    }

    public final void KUYypEB4eNWOZWVDpH(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.HVEwbdULInpTNa0IG;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.HVEwbdULInpTNa0IG.onRelease();
            zIsFinished = this.HVEwbdULInpTNa0IG.isFinished();
        }
        EdgeEffect edgeEffect2 = this.qygqjTppWwx992;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.qygqjTppWwx992.onRelease();
            zIsFinished |= this.qygqjTppWwx992.isFinished();
        }
        EdgeEffect edgeEffect3 = this.y1NaPKTl7R18DOr6e8i5;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.y1NaPKTl7R18DOr6e8i5.onRelease();
            zIsFinished |= this.y1NaPKTl7R18DOr6e8i5.isFinished();
        }
        EdgeEffect edgeEffect4 = this.iKANjmyTSxO6v6UuLPdu7DxOjlS;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.iKANjmyTSxO6v6UuLPdu7DxOjlS.onRelease();
            zIsFinished |= this.iKANjmyTSxO6v6UuLPdu7DxOjlS.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            postInvalidateOnAnimation();
        }
    }

    public final void KYZ9RyuOc42A2J(int i) {
        hWsX15LBWoRzT hwsx15lbworzt;
        if (this.q11o1hieEkZDhF1MGOZI26oZiDT) {
            return;
        }
        setScrollState(0);
        Y8unnL6HZ8WXVIsfrePA3V331ck y8unnL6HZ8WXVIsfrePA3V331ck = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
        y8unnL6HZ8WXVIsfrePA3V331ck.GI83zq0G8e7zkn.removeCallbacks(y8unnL6HZ8WXVIsfrePA3V331ck);
        y8unnL6HZ8WXVIsfrePA3V331ck.LaeGQIruHQu81hfJldjMOQSVblH3x.abortAnimation();
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null && (hwsx15lbworzt = wbbbe1vadvo1dmsg1odnaysaytu.LaeGQIruHQu81hfJldjMOQSVblH3x) != null) {
            hwsx15lbworzt.GI83zq0G8e7zkn();
        }
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu2 = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            wbbbe1vadvo1dmsg1odnaysaytu2.tpEo0fy9FaoJYrSFHRfIK6(i);
            awakenScrollBars();
        }
    }

    public final void L8DMw02rUTs2w(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.CixTK5ZX8oWXHz34qHYV) {
            int i = actionIndex == 0 ? 1 : 0;
            this.CixTK5ZX8oWXHz34qHYV = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.gBaBUmihn5l4u = x;
            this.YdNRGRc4rly = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.L8DMw02rUTs2w = y;
            this.wRCD0SdqWCowdYU7bmzN = y;
        }
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP(vBbBrJPQxVfAKJPVGhF3v vbbbrjpqxvfakjpvghf3v) {
        if (this.bjhcQ0u7VT2OYYrwk96HrWoN == null) {
            this.bjhcQ0u7VT2OYYrwk96HrWoN = new ArrayList();
        }
        this.bjhcQ0u7VT2OYYrwk96HrWoN.add(vbbbrjpqxvfakjpvghf3v);
    }

    public final int O1xDAlBZZlZdoEf747lCFHld(WFEUpQgjHl wFEUpQgjHl) {
        if ((wFEUpQgjHl.M9e7PWhFYLD2lOGMker & 524) == 0 && wFEUpQgjHl.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            int i = wFEUpQgjHl.V57tEvNfxZVVcOCAOih5PKr;
            ArrayList arrayList = (ArrayList) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                H73tKnp5B8 h73tKnp5B8 = (H73tKnp5B8) arrayList.get(i2);
                int i3 = h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (i3 != 1) {
                    if (i3 == 2) {
                        int i4 = h73tKnp5B8.zzpBGItXfub0yWj;
                        if (i4 <= i) {
                            int i5 = h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (i3 == 8) {
                        int i6 = h73tKnp5B8.zzpBGItXfub0yWj;
                        if (i6 == i) {
                            i = h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr <= i) {
                                i++;
                            }
                        }
                    }
                } else if (h73tKnp5B8.zzpBGItXfub0yWj <= i) {
                    i += h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr;
                }
            }
            return i;
        }
        return -1;
    }

    public final void RhfGHxtXxy0M0grmp2jkRjQg(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (getScrollState() != 2) {
            e20nj5kd0wqgo3.getClass();
            return;
        }
        OverScroller overScroller = this.zOk739gUM7zIZC25HHUxoiyixWFjn.LaeGQIruHQu81hfJldjMOQSVblH3x;
        overScroller.getFinalX();
        overScroller.getCurrX();
        e20nj5kd0wqgo3.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean SuB3hEmTmbbRGAhtvOOmfKEon(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.pYmKDYlAmhudp
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            com.vdodsodjsdt.O23cBAsx5mVwcI r5 = (com.vdodsodjsdt.O23cBAsx5mVwcI) r5
            int r6 = r5.TaDO7ogis3aEiWEtq
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.ZfQNn8hdWlEQ5cR94249PDsLR(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.V57tEvNfxZVVcOCAOih5PKr(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.Irh5auREsoeV1C1RaBamlmy = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.Irh5auREsoeV1C1RaBamlmy = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.q1wNbhk2O6 = r6
        L55:
            r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.ko09zE6UAgwkV = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.SuB3hEmTmbbRGAhtvOOmfKEon(android.view.MotionEvent):boolean");
    }

    public final void TaDO7ogis3aEiWEtq() {
        if (this.HVEwbdULInpTNa0IG != null) {
            return;
        }
        this.O1xDAlBZZlZdoEf747lCFHld.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.HVEwbdULInpTNa0IG = edgeEffect;
        if (this.GI83zq0G8e7zkn) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final boolean TqcnImqkSWIKht() {
        return !this.vBGA6pPLqSMuYGvprl270j7 || this.SuB3hEmTmbbRGAhtvOOmfKEon || this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
    }

    public final void YdNRGRc4rly(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iIrh5auREsoeV1C1RaBamlmy = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.Irh5auREsoeV1C1RaBamlmy();
        for (int i4 = 0; i4 < iIrh5auREsoeV1C1RaBamlmy; i4++) {
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = qygqjTppWwx992(this.ZLZeBXTMq0zDztBxtRTuCHrapQ.TaDO7ogis3aEiWEtq(i4));
            if (wFEUpQgjHlQygqjTppWwx992 != null && !wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u()) {
                int i5 = wFEUpQgjHlQygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr;
                e20NJ5kD0wqGO3 e20nj5kd0wqgo3 = this.H2VFYNJEVGAX;
                if (i5 >= i3) {
                    wFEUpQgjHlQygqjTppWwx992.KUYypEB4eNWOZWVDpH(-i2, z);
                    e20nj5kd0wqgo3.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
                } else if (i5 >= i) {
                    wFEUpQgjHlQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m(8);
                    wFEUpQgjHlQygqjTppWwx992.KUYypEB4eNWOZWVDpH(-i2, z);
                    wFEUpQgjHlQygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr = i - 1;
                    e20nj5kd0wqgo3.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
                }
            }
        }
        yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ArrayList arrayList = yhxkwue1zri6a9vau8hg9c.V57tEvNfxZVVcOCAOih5PKr;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WFEUpQgjHl wFEUpQgjHl = (WFEUpQgjHl) arrayList.get(size);
            if (wFEUpQgjHl != null) {
                int i6 = wFEUpQgjHl.V57tEvNfxZVVcOCAOih5PKr;
                if (i6 >= i3) {
                    wFEUpQgjHl.KUYypEB4eNWOZWVDpH(-i2, z);
                } else if (i6 >= i) {
                    wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m(8);
                    yhxkwue1zri6a9vau8hg9c.zIvmSL0wzmmKGc3X39b2Gw2mUGE(size);
                }
            }
        }
        requestLayout();
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(CluohSX0eAQHylXJOFOnCXEf0C cluohSX0eAQHylXJOFOnCXEf0C) {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null) {
            wbbbe1vadvo1dmsg1odnaysaytu.V57tEvNfxZVVcOCAOih5PKr("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(cluohSX0eAQHylXJOFOnCXEf0C);
        ymT6yQrus3w();
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null) {
            wbbbe1vadvo1dmsg1odnaysaytu.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof YoYMmBKQmkacZj7lMi9c) && this.p59rPv72J9.zIvmSL0wzmmKGc3X39b2Gw2mUGE((YoYMmBKQmkacZj7lMi9c) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null && wbbbe1vadvo1dmsg1odnaysaytu.ZfQNn8hdWlEQ5cR94249PDsLR()) {
            return this.p59rPv72J9.M9e7PWhFYLD2lOGMker(this.H2VFYNJEVGAX);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null && wbbbe1vadvo1dmsg1odnaysaytu.ZfQNn8hdWlEQ5cR94249PDsLR()) {
            return this.p59rPv72J9.HzCpKshMOoaw76hFcbOVRYMeRd(this.H2VFYNJEVGAX);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null && wbbbe1vadvo1dmsg1odnaysaytu.ZfQNn8hdWlEQ5cR94249PDsLR()) {
            return this.p59rPv72J9.KUYypEB4eNWOZWVDpH(this.H2VFYNJEVGAX);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null && wbbbe1vadvo1dmsg1odnaysaytu.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            return this.p59rPv72J9.q1wNbhk2O6(this.H2VFYNJEVGAX);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null && wbbbe1vadvo1dmsg1odnaysaytu.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            return this.p59rPv72J9.p59rPv72J9(this.H2VFYNJEVGAX);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null && wbbbe1vadvo1dmsg1odnaysaytu.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            return this.p59rPv72J9.Ca81ebIan1u(this.H2VFYNJEVGAX);
        }
        return 0;
    }

    public final boolean d9zDyyznnp3oaDT1Ug() {
        return this.aXO0LSrt8bKV > 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().VxUQ9tBhpHJ2AAEDNW8sghc4m(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().zzpBGItXfub0yWj(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().V57tEvNfxZVVcOCAOih5PKr(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().ZfQNn8hdWlEQ5cR94249PDsLR(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((CluohSX0eAQHylXJOFOnCXEf0C) arrayList.get(i)).zzpBGItXfub0yWj(canvas, this);
        }
        EdgeEffect edgeEffect = this.HVEwbdULInpTNa0IG;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.GI83zq0G8e7zkn ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.HVEwbdULInpTNa0IG;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.y1NaPKTl7R18DOr6e8i5;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.GI83zq0G8e7zkn) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.y1NaPKTl7R18DOr6e8i5;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.qygqjTppWwx992;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.GI83zq0G8e7zkn ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.qygqjTppWwx992;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.iKANjmyTSxO6v6UuLPdu7DxOjlS;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.GI83zq0G8e7zkn) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.iKANjmyTSxO6v6UuLPdu7DxOjlS;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.TqcnImqkSWIKht == null || arrayList.size() <= 0 || !this.TqcnImqkSWIKht.zIvmSL0wzmmKGc3X39b2Gw2mUGE()) ? z : true) {
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void f6ZQsR6bPLvvCDNXOUc(int i, int i2) {
        this.vE4yDIjexsP2lGjLaTcB++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        vBbBrJPQxVfAKJPVGhF3v vbbbrjpqxvfakjpvghf3v = this.Z1FjjMJ0suz8AFI7gsA4GDLMXv;
        if (vbbbrjpqxvfakjpvghf3v != null) {
            vbbbrjpqxvfakjpvghf3v.zzpBGItXfub0yWj(this, i, i2);
        }
        ArrayList arrayList = this.bjhcQ0u7VT2OYYrwk96HrWoN;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((vBbBrJPQxVfAKJPVGhF3v) this.bjhcQ0u7VT2OYYrwk96HrWoN.get(size)).zzpBGItXfub0yWj(this, i, i2);
            }
        }
        this.vE4yDIjexsP2lGjLaTcB--;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void gBaBUmihn5l4u(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.aXO0LSrt8bKV - 1;
        this.aXO0LSrt8bKV = i2;
        if (i2 < 1) {
            this.aXO0LSrt8bKV = 0;
            if (z) {
                int i3 = this.RhfGHxtXxy0M0grmp2jkRjQg;
                this.RhfGHxtXxy0M0grmp2jkRjQg = 0;
                if (i3 != 0 && (accessibilityManager = this.qNPQb1obP7) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.e1gEV3X9xwmHj;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WFEUpQgjHl wFEUpQgjHl = (WFEUpQgjHl) arrayList.get(size);
                    if (wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m.getParent() == this && !wFEUpQgjHl.Ca81ebIan1u() && (i = wFEUpQgjHl.pYmKDYlAmhudp) != -1) {
                        View view = wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        view.setImportantForAccessibility(i);
                        wFEUpQgjHl.pYmKDYlAmhudp = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null) {
            return wbbbe1vadvo1dmsg1odnaysaytu.ko09zE6UAgwkV();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + w0Wu95l8dVNw5rZMRu());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null) {
            return wbbbe1vadvo1dmsg1odnaysaytu.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + w0Wu95l8dVNw5rZMRu());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public YrYFQ7bf7bxLdH getAdapter() {
        return this.q1wNbhk2O6;
    }

    @Override // android.view.View
    public int getBaseline() {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu == null) {
            return super.getBaseline();
        }
        wbbbe1vadvo1dmsg1odnaysaytu.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.GI83zq0G8e7zkn;
    }

    public cCsw66b243HzgVzE4uRxrAcogfXx6 getCompatAccessibilityDelegate() {
        return this.p6bBrs4p3Ly;
    }

    public LAiDD5zgtCnRDrgc getEdgeEffectFactory() {
        return this.O1xDAlBZZlZdoEf747lCFHld;
    }

    public RAU9GtBZd7wl getItemAnimator() {
        return this.TqcnImqkSWIKht;
    }

    public int getItemDecorationCount() {
        return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.size();
    }

    public wbBBe1vAdVO1DmSg1odNaySAYTu getLayoutManager() {
        return this.p59rPv72J9;
    }

    public int getMaxFlingVelocity() {
        return this.hKs1wlZyvtUNaW1f5ABIGacfPcvX;
    }

    public int getMinFlingVelocity() {
        return this.ItrQwCXbty5PZtje5JS;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public vNbPG5KyhGfYLWoUO getOnFlingListener() {
        return this.JUdwvN8LfOMa;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.KYZ9RyuOc42A2J;
    }

    public S2nN0Z2yP6NYzcJu8Sd getRecycledViewPool() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr();
    }

    public int getScrollState() {
        return this.d9zDyyznnp3oaDT1Ug;
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv() {
        /*
            Method dump skipped, instruction units count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.h3jnZRsdwYJfY9UhQCkbvWciwvFHv():void");
    }

    public final void hKs1wlZyvtUNaW1f5ABIGacfPcvX() {
        VelocityTracker velocityTracker = this.ymT6yQrus3w;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        H2VFYNJEVGAX(0);
        EdgeEffect edgeEffect = this.HVEwbdULInpTNa0IG;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.HVEwbdULInpTNa0IG.isFinished();
        }
        EdgeEffect edgeEffect2 = this.y1NaPKTl7R18DOr6e8i5;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.y1NaPKTl7R18DOr6e8i5.isFinished();
        }
        EdgeEffect edgeEffect3 = this.qygqjTppWwx992;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.qygqjTppWwx992.isFinished();
        }
        EdgeEffect edgeEffect4 = this.iKANjmyTSxO6v6UuLPdu7DxOjlS;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.iKANjmyTSxO6v6UuLPdu7DxOjlS.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().zIvmSL0wzmmKGc3X39b2Gw2mUGE(0);
    }

    public final Rect iKANjmyTSxO6v6UuLPdu7DxOjlS(View view) {
        YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) view.getLayoutParams();
        boolean z = yoYMmBKQmkacZj7lMi9c.V57tEvNfxZVVcOCAOih5PKr;
        Rect rect = yoYMmBKQmkacZj7lMi9c.zzpBGItXfub0yWj;
        if (!z || (this.H2VFYNJEVGAX.ZLZeBXTMq0zDztBxtRTuCHrapQ && (yoYMmBKQmkacZj7lMi9c.VxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd() || yoYMmBKQmkacZj7lMi9c.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.M9e7PWhFYLD2lOGMker;
            rect2.set(0, 0, 0, 0);
            ((CluohSX0eAQHylXJOFOnCXEf0C) arrayList.get(i)).getClass();
            ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        yoYMmBKQmkacZj7lMi9c.V57tEvNfxZVVcOCAOih5PKr = false;
        return rect;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.q11o1hieEkZDhF1MGOZI26oZiDT;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final void jW7EiD0YL6xkbB158jMUzhWNWb1y(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().ZfQNn8hdWlEQ5cR94249PDsLR(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final boolean ko09zE6UAgwkV(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().V57tEvNfxZVVcOCAOih5PKr(i, i2, i3, iArr, iArr2);
    }

    public final void lQ0rO9lhQIyVe7Rp6() {
        if (this.rE05n5RsRkyWKIeA9cmLXAKv4Hze || !this.jW7EiD0YL6xkbB158jMUzhWNWb1y) {
            return;
        }
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        postOnAnimation(this.AFOcXGdvoTMuqwiG8tD);
        this.rE05n5RsRkyWKIeA9cmLXAKv4Hze = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.aXO0LSrt8bKV = r0
            r1 = 1
            r5.jW7EiD0YL6xkbB158jMUzhWNWb1y = r1
            boolean r2 = r5.vBGA6pPLqSMuYGvprl270j7
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.vBGA6pPLqSMuYGvprl270j7 = r2
            com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu r2 = r5.p59rPv72J9
            if (r2 == 0) goto L21
            r2.ZLZeBXTMq0zDztBxtRTuCHrapQ = r1
            r2.L8DMw02rUTs2w(r5)
        L21:
            r5.rE05n5RsRkyWKIeA9cmLXAKv4Hze = r0
            java.lang.ThreadLocal r0 = com.vdodsodjsdt.SobBKwD5hB.ZLZeBXTMq0zDztBxtRTuCHrapQ
            java.lang.Object r1 = r0.get()
            com.vdodsodjsdt.SobBKwD5hB r1 = (com.vdodsodjsdt.SobBKwD5hB) r1
            r5.GE1sqSYiEYQO2ew7WEZwTtUeS5 = r1
            if (r1 != 0) goto L6b
            com.vdodsodjsdt.SobBKwD5hB r1 = new com.vdodsodjsdt.SobBKwD5hB
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.V57tEvNfxZVVcOCAOih5PKr = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r2
            r5.GE1sqSYiEYQO2ew7WEZwTtUeS5 = r1
            java.util.WeakHashMap r1 = com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            com.vdodsodjsdt.SobBKwD5hB r2 = r5.GE1sqSYiEYQO2ew7WEZwTtUeS5
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.LaeGQIruHQu81hfJldjMOQSVblH3x = r3
            r0.set(r2)
        L6b:
            com.vdodsodjsdt.SobBKwD5hB r0 = r5.GE1sqSYiEYQO2ew7WEZwTtUeS5
            java.util.ArrayList r0 = r0.V57tEvNfxZVVcOCAOih5PKr
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        hWsX15LBWoRzT hwsx15lbworzt;
        super.onDetachedFromWindow();
        RAU9GtBZd7wl rAU9GtBZd7wl = this.TqcnImqkSWIKht;
        if (rAU9GtBZd7wl != null) {
            rAU9GtBZd7wl.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        setScrollState(0);
        Y8unnL6HZ8WXVIsfrePA3V331ck y8unnL6HZ8WXVIsfrePA3V331ck = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
        y8unnL6HZ8WXVIsfrePA3V331ck.GI83zq0G8e7zkn.removeCallbacks(y8unnL6HZ8WXVIsfrePA3V331ck);
        y8unnL6HZ8WXVIsfrePA3V331ck.LaeGQIruHQu81hfJldjMOQSVblH3x.abortAnimation();
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null && (hwsx15lbworzt = wbbbe1vadvo1dmsg1odnaysaytu.LaeGQIruHQu81hfJldjMOQSVblH3x) != null) {
            hwsx15lbworzt.GI83zq0G8e7zkn();
        }
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = false;
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu2 = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu2 != null) {
            wbbbe1vadvo1dmsg1odnaysaytu2.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
            wbbbe1vadvo1dmsg1odnaysaytu2.lQ0rO9lhQIyVe7Rp6(this);
        }
        this.e1gEV3X9xwmHj.clear();
        removeCallbacks(this.AFOcXGdvoTMuqwiG8tD);
        this.NSjgqmGjEzuugn2SsG1mZFP.getClass();
        while (xnjnd5YIMmACJ.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m() != null) {
        }
        SobBKwD5hB sobBKwD5hB = this.GE1sqSYiEYQO2ew7WEZwTtUeS5;
        if (sobBKwD5hB != null) {
            sobBKwD5hB.V57tEvNfxZVVcOCAOih5PKr.remove(this);
            this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((CluohSX0eAQHylXJOFOnCXEf0C) arrayList.get(i)).VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.q11o1hieEkZDhF1MGOZI26oZiDT) {
            this.ko09zE6UAgwkV = null;
            if (SuB3hEmTmbbRGAhtvOOmfKEon(motionEvent)) {
                hKs1wlZyvtUNaW1f5ABIGacfPcvX();
                setScrollState(0);
                return true;
            }
            wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
            if (wbbbe1vadvo1dmsg1odnaysaytu != null) {
                boolean zZfQNn8hdWlEQ5cR94249PDsLR = wbbbe1vadvo1dmsg1odnaysaytu.ZfQNn8hdWlEQ5cR94249PDsLR();
                boolean zLaeGQIruHQu81hfJldjMOQSVblH3x = this.p59rPv72J9.LaeGQIruHQu81hfJldjMOQSVblH3x();
                if (this.ymT6yQrus3w == null) {
                    this.ymT6yQrus3w = VelocityTracker.obtain();
                }
                this.ymT6yQrus3w.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.w0Wu95l8dVNw5rZMRu) {
                        this.w0Wu95l8dVNw5rZMRu = false;
                    }
                    this.CixTK5ZX8oWXHz34qHYV = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.gBaBUmihn5l4u = x;
                    this.YdNRGRc4rly = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.L8DMw02rUTs2w = y;
                    this.wRCD0SdqWCowdYU7bmzN = y;
                    if (this.d9zDyyznnp3oaDT1Ug == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        H2VFYNJEVGAX(1);
                    }
                    int[] iArr = this.ByTQIhgl7ezGvHXEd;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zZfQNn8hdWlEQ5cR94249PDsLR;
                    if (zLaeGQIruHQu81hfJldjMOQSVblH3x) {
                        i = (zZfQNn8hdWlEQ5cR94249PDsLR ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().ZLZeBXTMq0zDztBxtRTuCHrapQ(i, 0);
                } else if (actionMasked == 1) {
                    this.ymT6yQrus3w.clear();
                    H2VFYNJEVGAX(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.CixTK5ZX8oWXHz34qHYV);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.CixTK5ZX8oWXHz34qHYV + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.d9zDyyznnp3oaDT1Ug != 1) {
                        int i2 = x2 - this.YdNRGRc4rly;
                        int i3 = y2 - this.wRCD0SdqWCowdYU7bmzN;
                        if (!zZfQNn8hdWlEQ5cR94249PDsLR || Math.abs(i2) <= this.lQ0rO9lhQIyVe7Rp6) {
                            z = false;
                        } else {
                            this.gBaBUmihn5l4u = x2;
                            z = true;
                        }
                        if (zLaeGQIruHQu81hfJldjMOQSVblH3x && Math.abs(i3) > this.lQ0rO9lhQIyVe7Rp6) {
                            this.L8DMw02rUTs2w = y2;
                            z = true;
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    hKs1wlZyvtUNaW1f5ABIGacfPcvX();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.CixTK5ZX8oWXHz34qHYV = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.gBaBUmihn5l4u = x3;
                    this.YdNRGRc4rly = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.L8DMw02rUTs2w = y3;
                    this.wRCD0SdqWCowdYU7bmzN = y3;
                } else if (actionMasked == 6) {
                    L8DMw02rUTs2w(motionEvent);
                }
                if (this.d9zDyyznnp3oaDT1Ug == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = TBOn1G6tgZKbOPI1mnHhsMX2mq3mV.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Trace.beginSection("RV OnLayout");
        Ca81ebIan1u();
        Trace.endSection();
        this.vBGA6pPLqSMuYGvprl270j7 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu == null) {
            p59rPv72J9(i, i2);
            return;
        }
        boolean zD9zDyyznnp3oaDT1Ug = wbbbe1vadvo1dmsg1odnaysaytu.d9zDyyznnp3oaDT1Ug();
        boolean z = false;
        e20NJ5kD0wqGO3 e20nj5kd0wqgo3 = this.H2VFYNJEVGAX;
        if (!zD9zDyyznnp3oaDT1Ug) {
            if (this.f6ZQsR6bPLvvCDNXOUc) {
                this.p59rPv72J9.zzpBGItXfub0yWj.p59rPv72J9(i, i2);
                return;
            }
            if (e20nj5kd0wqgo3.HzCpKshMOoaw76hFcbOVRYMeRd) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            YrYFQ7bf7bxLdH yrYFQ7bf7bxLdH = this.q1wNbhk2O6;
            if (yrYFQ7bf7bxLdH != null) {
                e20nj5kd0wqgo3.LaeGQIruHQu81hfJldjMOQSVblH3x = yrYFQ7bf7bxLdH.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            } else {
                e20nj5kd0wqgo3.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
            }
            GE1sqSYiEYQO2ew7WEZwTtUeS5();
            this.p59rPv72J9.zzpBGItXfub0yWj.p59rPv72J9(i, i2);
            rERAmyEtGV6ANGszuKcQI(false);
            e20nj5kd0wqgo3.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.p59rPv72J9.zzpBGItXfub0yWj.p59rPv72J9(i, i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            z = true;
        }
        this.BDoqAMf0rlMRAnVghjC4qjG = z;
        if (z || this.q1wNbhk2O6 == null) {
            return;
        }
        if (e20nj5kd0wqgo3.ZfQNn8hdWlEQ5cR94249PDsLR == 1) {
            h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
        }
        this.p59rPv72J9.BDoqAMf0rlMRAnVghjC4qjG(i, i2);
        e20nj5kd0wqgo3.GI83zq0G8e7zkn = true;
        pYmKDYlAmhudp();
        this.p59rPv72J9.VOvSEdhaZyc0oOGQ8(i, i2);
        if (this.p59rPv72J9.G479XgNG9rK8jPPbSXr()) {
            this.p59rPv72J9.BDoqAMf0rlMRAnVghjC4qjG(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            e20nj5kd0wqgo3.GI83zq0G8e7zkn = true;
            pYmKDYlAmhudp();
            this.p59rPv72J9.VOvSEdhaZyc0oOGQ8(i, i2);
        }
        this.lxWWbfAOLs4jWzd7PSIiIJ = getMeasuredWidth();
        this.VOvSEdhaZyc0oOGQ8 = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (d9zDyyznnp3oaDT1Ug()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof s1HWM1e1d8DbWRjBkwUg1fGy)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        s1HWM1e1d8DbWRjBkwUg1fGy s1hwm1e1d8dbwrjbkwug1fgy = (s1HWM1e1d8DbWRjBkwUg1fGy) parcelable;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = s1hwm1e1d8dbwrjbkwug1fgy;
        super.onRestoreInstanceState(s1hwm1e1d8dbwrjbkwug1fgy.V57tEvNfxZVVcOCAOih5PKr);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        s1HWM1e1d8DbWRjBkwUg1fGy s1hwm1e1d8dbwrjbkwug1fgy = new s1HWM1e1d8DbWRjBkwUg1fGy(super.onSaveInstanceState());
        s1HWM1e1d8DbWRjBkwUg1fGy s1hwm1e1d8dbwrjbkwug1fgy2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (s1hwm1e1d8dbwrjbkwug1fgy2 != null) {
            s1hwm1e1d8dbwrjbkwug1fgy.LaeGQIruHQu81hfJldjMOQSVblH3x = s1hwm1e1d8dbwrjbkwug1fgy2.LaeGQIruHQu81hfJldjMOQSVblH3x;
            return s1hwm1e1d8dbwrjbkwug1fgy;
        }
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null) {
            s1hwm1e1d8dbwrjbkwug1fgy.LaeGQIruHQu81hfJldjMOQSVblH3x = wbbbe1vadvo1dmsg1odnaysaytu.BJQHddi0Plr5ElWetCyaixWOg9();
            return s1hwm1e1d8dbwrjbkwug1fgy;
        }
        s1hwm1e1d8dbwrjbkwug1fgy.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
        return s1hwm1e1d8dbwrjbkwug1fgy;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.iKANjmyTSxO6v6UuLPdu7DxOjlS = null;
        this.y1NaPKTl7R18DOr6e8i5 = null;
        this.qygqjTppWwx992 = null;
        this.HVEwbdULInpTNa0IG = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8 A[PHI: r1
      0x01f8: PHI (r1v53 int) = (r1v38 int), (r1v57 int) binds: [B:90:0x01e1, B:94:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fb  */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            Method dump skipped, instruction units count: 1193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p59rPv72J9(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        setMeasuredDimension(wbBBe1vAdVO1DmSg1odNaySAYTu.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, paddingRight, getMinimumWidth()), wbBBe1vAdVO1DmSg1odNaySAYTu.ZLZeBXTMq0zDztBxtRTuCHrapQ(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void pYmKDYlAmhudp() {
        GE1sqSYiEYQO2ew7WEZwTtUeS5();
        wRCD0SdqWCowdYU7bmzN();
        e20NJ5kD0wqGO3 e20nj5kd0wqgo3 = this.H2VFYNJEVGAX;
        e20nj5kd0wqgo3.VxUQ9tBhpHJ2AAEDNW8sghc4m(6);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj();
        e20nj5kd0wqgo3.LaeGQIruHQu81hfJldjMOQSVblH3x = this.q1wNbhk2O6.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        e20nj5kd0wqgo3.V57tEvNfxZVVcOCAOih5PKr = 0;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != null) {
            YrYFQ7bf7bxLdH yrYFQ7bf7bxLdH = this.q1wNbhk2O6;
            int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(yrYFQ7bf7bxLdH.V57tEvNfxZVVcOCAOih5PKr);
            if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1 ? yrYFQ7bf7bxLdH.VxUQ9tBhpHJ2AAEDNW8sghc4m() > 0 : iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 2) {
                Parcelable parcelable = this.LaeGQIruHQu81hfJldjMOQSVblH3x.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (parcelable != null) {
                    this.p59rPv72J9.bjhcQ0u7VT2OYYrwk96HrWoN(parcelable);
                }
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
            }
        }
        e20nj5kd0wqgo3.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
        this.p59rPv72J9.H2VFYNJEVGAX(this.ZfQNn8hdWlEQ5cR94249PDsLR, e20nj5kd0wqgo3);
        e20nj5kd0wqgo3.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
        e20nj5kd0wqgo3.M9e7PWhFYLD2lOGMker = e20nj5kd0wqgo3.M9e7PWhFYLD2lOGMker && this.TqcnImqkSWIKht != null;
        e20nj5kd0wqgo3.ZfQNn8hdWlEQ5cR94249PDsLR = 4;
        gBaBUmihn5l4u(true);
        rERAmyEtGV6ANGszuKcQI(false);
    }

    public final void pzqP2AqKW6J5PO8zCKnW(int[] iArr) {
        int iCa81ebIan1u = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.Ca81ebIan1u();
        if (iCa81ebIan1u == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iCa81ebIan1u; i3++) {
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = qygqjTppWwx992(this.ZLZeBXTMq0zDztBxtRTuCHrapQ.p59rPv72J9(i3));
            if (!wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u()) {
                int iZzpBGItXfub0yWj = wFEUpQgjHlQygqjTppWwx992.zzpBGItXfub0yWj();
                if (iZzpBGItXfub0yWj < i) {
                    i = iZzpBGItXfub0yWj;
                }
                if (iZzpBGItXfub0yWj > i2) {
                    i2 = iZzpBGItXfub0yWj;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final void q11o1hieEkZDhF1MGOZI26oZiDT() {
        if (this.y1NaPKTl7R18DOr6e8i5 != null) {
            return;
        }
        this.O1xDAlBZZlZdoEf747lCFHld.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.y1NaPKTl7R18DOr6e8i5 = edgeEffect;
        if (this.GI83zq0G8e7zkn) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void q1wNbhk2O6() {
        if (!this.vBGA6pPLqSMuYGvprl270j7 || this.SuB3hEmTmbbRGAhtvOOmfKEon) {
            int i = TBOn1G6tgZKbOPI1mnHhsMX2mq3mV.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            Trace.beginSection("RV FullInvalidate");
            Ca81ebIan1u();
            Trace.endSection();
            return;
        }
        UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (uL4JI0eLnaD84py2JT.zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
            uL4JI0eLnaD84py2JT.getClass();
            if (uL4JI0eLnaD84py2JT.zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
                int i2 = TBOn1G6tgZKbOPI1mnHhsMX2mq3mV.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                Trace.beginSection("RV FullInvalidate");
                Ca81ebIan1u();
                Trace.endSection();
            }
        }
    }

    public final View qNPQb1obP7(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final void rERAmyEtGV6ANGszuKcQI(boolean z) {
        if (this.TaDO7ogis3aEiWEtq < 1) {
            this.TaDO7ogis3aEiWEtq = 1;
        }
        if (!z && !this.q11o1hieEkZDhF1MGOZI26oZiDT) {
            this.Irh5auREsoeV1C1RaBamlmy = false;
        }
        if (this.TaDO7ogis3aEiWEtq == 1) {
            if (z && this.Irh5auREsoeV1C1RaBamlmy && !this.q11o1hieEkZDhF1MGOZI26oZiDT && this.p59rPv72J9 != null && this.q1wNbhk2O6 != null) {
                Ca81ebIan1u();
            }
            if (!this.q11o1hieEkZDhF1MGOZI26oZiDT) {
                this.Irh5auREsoeV1C1RaBamlmy = false;
            }
        }
        this.TaDO7ogis3aEiWEtq--;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = qygqjTppWwx992(view);
        if (wFEUpQgjHlQygqjTppWwx992 != null) {
            if (wFEUpQgjHlQygqjTppWwx992.M9e7PWhFYLD2lOGMker()) {
                wFEUpQgjHlQygqjTppWwx992.M9e7PWhFYLD2lOGMker &= -257;
            } else if (!wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + wFEUpQgjHlQygqjTppWwx992 + w0Wu95l8dVNw5rZMRu());
            }
        }
        view.clearAnimation();
        qygqjTppWwx992(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        hWsX15LBWoRzT hwsx15lbworzt = this.p59rPv72J9.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if ((hwsx15lbworzt == null || !hwsx15lbworzt.LaeGQIruHQu81hfJldjMOQSVblH3x) && !d9zDyyznnp3oaDT1Ug() && view2 != null) {
            ItrQwCXbty5PZtje5JS(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.p59rPv72J9.wR7sbzHKf9hYV1lxoS6nqyszepWvN(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.pYmKDYlAmhudp;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((O23cBAsx5mVwcI) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.TaDO7ogis3aEiWEtq != 0 || this.q11o1hieEkZDhF1MGOZI26oZiDT) {
            this.Irh5auREsoeV1C1RaBamlmy = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.q11o1hieEkZDhF1MGOZI26oZiDT) {
            return;
        }
        boolean zZfQNn8hdWlEQ5cR94249PDsLR = wbbbe1vadvo1dmsg1odnaysaytu.ZfQNn8hdWlEQ5cR94249PDsLR();
        boolean zLaeGQIruHQu81hfJldjMOQSVblH3x = this.p59rPv72J9.LaeGQIruHQu81hfJldjMOQSVblH3x();
        if (zZfQNn8hdWlEQ5cR94249PDsLR || zLaeGQIruHQu81hfJldjMOQSVblH3x) {
            if (!zZfQNn8hdWlEQ5cR94249PDsLR) {
                i = 0;
            }
            if (!zLaeGQIruHQu81hfJldjMOQSVblH3x) {
                i2 = 0;
            }
            vXWl0o6I4U59CgHs9(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!d9zDyyznnp3oaDT1Ug()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.RhfGHxtXxy0M0grmp2jkRjQg |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(cCsw66b243HzgVzE4uRxrAcogfXx6 ccsw66b243hzgvze4urxracogfxx6) {
        this.p6bBrs4p3Ly = ccsw66b243hzgvze4urxracogfxx6;
        xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(this, ccsw66b243hzgvze4urxracogfxx6);
    }

    public void setAdapter(YrYFQ7bf7bxLdH yrYFQ7bf7bxLdH) {
        setLayoutFrozen(false);
        YrYFQ7bf7bxLdH yrYFQ7bf7bxLdH2 = this.q1wNbhk2O6;
        FG8LIxsgYiLSfhN0jYKIKr fG8LIxsgYiLSfhN0jYKIKr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (yrYFQ7bf7bxLdH2 != null) {
            yrYFQ7bf7bxLdH2.VxUQ9tBhpHJ2AAEDNW8sghc4m.unregisterObserver(fG8LIxsgYiLSfhN0jYKIKr);
            this.q1wNbhk2O6.getClass();
        }
        RAU9GtBZd7wl rAU9GtBZd7wl = this.TqcnImqkSWIKht;
        if (rAU9GtBZd7wl != null) {
            rAU9GtBZd7wl.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null) {
            wbbbe1vadvo1dmsg1odnaysaytu.mhUCRR8ceqc7mAozW(yhxkwue1zri6a9vau8hg9c);
            this.p59rPv72J9.rE05n5RsRkyWKIeA9cmLXAKv4Hze(yhxkwue1zri6a9vau8hg9c);
        }
        yhxkwue1zri6a9vau8hg9c.VxUQ9tBhpHJ2AAEDNW8sghc4m.clear();
        yhxkwue1zri6a9vau8hg9c.LaeGQIruHQu81hfJldjMOQSVblH3x();
        UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        uL4JI0eLnaD84py2JT.q1wNbhk2O6((ArrayList) uL4JI0eLnaD84py2JT.zzpBGItXfub0yWj);
        uL4JI0eLnaD84py2JT.q1wNbhk2O6((ArrayList) uL4JI0eLnaD84py2JT.V57tEvNfxZVVcOCAOih5PKr);
        YrYFQ7bf7bxLdH yrYFQ7bf7bxLdH3 = this.q1wNbhk2O6;
        this.q1wNbhk2O6 = yrYFQ7bf7bxLdH;
        if (yrYFQ7bf7bxLdH != null) {
            yrYFQ7bf7bxLdH.VxUQ9tBhpHJ2AAEDNW8sghc4m.registerObserver(fG8LIxsgYiLSfhN0jYKIKr);
        }
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu2 = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu2 != null) {
            wbbbe1vadvo1dmsg1odnaysaytu2.gBaBUmihn5l4u();
        }
        YrYFQ7bf7bxLdH yrYFQ7bf7bxLdH4 = this.q1wNbhk2O6;
        yhxkwue1zri6a9vau8hg9c.VxUQ9tBhpHJ2AAEDNW8sghc4m.clear();
        yhxkwue1zri6a9vau8hg9c.LaeGQIruHQu81hfJldjMOQSVblH3x();
        S2nN0Z2yP6NYzcJu8Sd s2nN0Z2yP6NYzcJu8SdV57tEvNfxZVVcOCAOih5PKr = yhxkwue1zri6a9vau8hg9c.V57tEvNfxZVVcOCAOih5PKr();
        if (yrYFQ7bf7bxLdH3 != null) {
            s2nN0Z2yP6NYzcJu8SdV57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj--;
        }
        if (s2nN0Z2yP6NYzcJu8SdV57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj == 0) {
            SparseArray sparseArray = s2nN0Z2yP6NYzcJu8SdV57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((oHePsoiIXTc4hB) sparseArray.valueAt(i)).VxUQ9tBhpHJ2AAEDNW8sghc4m.clear();
            }
        }
        if (yrYFQ7bf7bxLdH4 != null) {
            s2nN0Z2yP6NYzcJu8SdV57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj++;
        }
        this.H2VFYNJEVGAX.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        this.pzqP2AqKW6J5PO8zCKnW |= false;
        this.SuB3hEmTmbbRGAhtvOOmfKEon = true;
        int iIrh5auREsoeV1C1RaBamlmy = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.Irh5auREsoeV1C1RaBamlmy();
        for (int i2 = 0; i2 < iIrh5auREsoeV1C1RaBamlmy; i2++) {
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = qygqjTppWwx992(this.ZLZeBXTMq0zDztBxtRTuCHrapQ.TaDO7ogis3aEiWEtq(i2));
            if (wFEUpQgjHlQygqjTppWwx992 != null && !wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u()) {
                wFEUpQgjHlQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m(6);
            }
        }
        ymT6yQrus3w();
        yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ArrayList arrayList = yhxkwue1zri6a9vau8hg9c2.V57tEvNfxZVVcOCAOih5PKr;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            WFEUpQgjHl wFEUpQgjHl = (WFEUpQgjHl) arrayList.get(i3);
            if (wFEUpQgjHl != null) {
                wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m(6);
                wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m(1024);
            }
        }
        YrYFQ7bf7bxLdH yrYFQ7bf7bxLdH5 = yhxkwue1zri6a9vau8hg9c2.NSjgqmGjEzuugn2SsG1mZFP.q1wNbhk2O6;
        if (yrYFQ7bf7bxLdH5 == null || !yrYFQ7bf7bxLdH5.zzpBGItXfub0yWj) {
            yhxkwue1zri6a9vau8hg9c2.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        requestLayout();
    }

    public void setChildDrawingOrderCallback(gyW4eNRmBwjuW3u2WIcISTc7kFD9 gyw4enrmbwjuw3u2wicistc7kfd9) {
        if (gyw4enrmbwjuw3u2wicistc7kfd9 == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.GI83zq0G8e7zkn) {
            this.iKANjmyTSxO6v6UuLPdu7DxOjlS = null;
            this.y1NaPKTl7R18DOr6e8i5 = null;
            this.qygqjTppWwx992 = null;
            this.HVEwbdULInpTNa0IG = null;
        }
        this.GI83zq0G8e7zkn = z;
        super.setClipToPadding(z);
        if (this.vBGA6pPLqSMuYGvprl270j7) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(LAiDD5zgtCnRDrgc lAiDD5zgtCnRDrgc) {
        lAiDD5zgtCnRDrgc.getClass();
        this.O1xDAlBZZlZdoEf747lCFHld = lAiDD5zgtCnRDrgc;
        this.iKANjmyTSxO6v6UuLPdu7DxOjlS = null;
        this.y1NaPKTl7R18DOr6e8i5 = null;
        this.qygqjTppWwx992 = null;
        this.HVEwbdULInpTNa0IG = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f6ZQsR6bPLvvCDNXOUc = z;
    }

    public void setItemAnimator(RAU9GtBZd7wl rAU9GtBZd7wl) {
        RAU9GtBZd7wl rAU9GtBZd7wl2 = this.TqcnImqkSWIKht;
        if (rAU9GtBZd7wl2 != null) {
            rAU9GtBZd7wl2.LaeGQIruHQu81hfJldjMOQSVblH3x();
            this.TqcnImqkSWIKht.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        }
        this.TqcnImqkSWIKht = rAU9GtBZd7wl;
        if (rAU9GtBZd7wl != null) {
            rAU9GtBZd7wl.VxUQ9tBhpHJ2AAEDNW8sghc4m = this.mhUCRR8ceqc7mAozW;
        }
    }

    public void setItemViewCacheSize(int i) {
        yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        yhxkwue1zri6a9vau8hg9c.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
        yhxkwue1zri6a9vau8hg9c.KUYypEB4eNWOZWVDpH();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu) {
        hWsX15LBWoRzT hwsx15lbworzt;
        if (wbbbe1vadvo1dmsg1odnaysaytu == this.p59rPv72J9) {
            return;
        }
        setScrollState(0);
        Y8unnL6HZ8WXVIsfrePA3V331ck y8unnL6HZ8WXVIsfrePA3V331ck = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
        y8unnL6HZ8WXVIsfrePA3V331ck.GI83zq0G8e7zkn.removeCallbacks(y8unnL6HZ8WXVIsfrePA3V331ck);
        y8unnL6HZ8WXVIsfrePA3V331ck.LaeGQIruHQu81hfJldjMOQSVblH3x.abortAnimation();
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu2 = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu2 != null && (hwsx15lbworzt = wbbbe1vadvo1dmsg1odnaysaytu2.LaeGQIruHQu81hfJldjMOQSVblH3x) != null) {
            hwsx15lbworzt.GI83zq0G8e7zkn();
        }
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu3 = this.p59rPv72J9;
        yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (wbbbe1vadvo1dmsg1odnaysaytu3 != null) {
            RAU9GtBZd7wl rAU9GtBZd7wl = this.TqcnImqkSWIKht;
            if (rAU9GtBZd7wl != null) {
                rAU9GtBZd7wl.LaeGQIruHQu81hfJldjMOQSVblH3x();
            }
            this.p59rPv72J9.mhUCRR8ceqc7mAozW(yhxkwue1zri6a9vau8hg9c);
            this.p59rPv72J9.rE05n5RsRkyWKIeA9cmLXAKv4Hze(yhxkwue1zri6a9vau8hg9c);
            yhxkwue1zri6a9vau8hg9c.VxUQ9tBhpHJ2AAEDNW8sghc4m.clear();
            yhxkwue1zri6a9vau8hg9c.LaeGQIruHQu81hfJldjMOQSVblH3x();
            if (this.jW7EiD0YL6xkbB158jMUzhWNWb1y) {
                wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu4 = this.p59rPv72J9;
                wbbbe1vadvo1dmsg1odnaysaytu4.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
                wbbbe1vadvo1dmsg1odnaysaytu4.lQ0rO9lhQIyVe7Rp6(this);
            }
            this.p59rPv72J9.h2b7InwIaORKN91X7whfQh4(null);
            this.p59rPv72J9 = null;
        } else {
            yhxkwue1zri6a9vau8hg9c.VxUQ9tBhpHJ2AAEDNW8sghc4m.clear();
            yhxkwue1zri6a9vau8hg9c.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        RecyclerView recyclerView = ((IxShTNMvCWlbR) nrjuzzioPqfttNRptBDpZDzSYUrcM.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ((xBkpwtKksCOQS) nrjuzzioPqfttNRptBDpZDzSYUrcM.V57tEvNfxZVVcOCAOih5PKr).NSjgqmGjEzuugn2SsG1mZFP();
        ArrayList arrayList = (ArrayList) nrjuzzioPqfttNRptBDpZDzSYUrcM.ZfQNn8hdWlEQ5cR94249PDsLR;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = qygqjTppWwx992((View) arrayList.get(size));
            if (wFEUpQgjHlQygqjTppWwx992 != null) {
                int i = wFEUpQgjHlQygqjTppWwx992.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                if (recyclerView.d9zDyyznnp3oaDT1Ug()) {
                    wFEUpQgjHlQygqjTppWwx992.pYmKDYlAmhudp = i;
                    recyclerView.e1gEV3X9xwmHj.add(wFEUpQgjHlQygqjTppWwx992);
                } else {
                    View view = wFEUpQgjHlQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    view.setImportantForAccessibility(i);
                }
                wFEUpQgjHlQygqjTppWwx992.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            qygqjTppWwx992(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.p59rPv72J9 = wbbbe1vadvo1dmsg1odnaysaytu;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null) {
            if (wbbbe1vadvo1dmsg1odnaysaytu.zzpBGItXfub0yWj != null) {
                throw new IllegalArgumentException("LayoutManager " + wbbbe1vadvo1dmsg1odnaysaytu + " is already attached to a RecyclerView:" + wbbbe1vadvo1dmsg1odnaysaytu.zzpBGItXfub0yWj.w0Wu95l8dVNw5rZMRu());
            }
            wbbbe1vadvo1dmsg1odnaysaytu.h2b7InwIaORKN91X7whfQh4(this);
            if (this.jW7EiD0YL6xkbB158jMUzhWNWb1y) {
                wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu5 = this.p59rPv72J9;
                wbbbe1vadvo1dmsg1odnaysaytu5.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
                wbbbe1vadvo1dmsg1odnaysaytu5.L8DMw02rUTs2w(this);
            }
        }
        yhxkwue1zri6a9vau8hg9c.KUYypEB4eNWOZWVDpH();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        N2LAiRuyxj3sEvVYMse9 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.ZfQNn8hdWlEQ5cR94249PDsLR) {
            ViewGroup viewGroup = scrollingChildHelper.V57tEvNfxZVVcOCAOih5PKr;
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            lJgFFp37ou.HzCpKshMOoaw76hFcbOVRYMeRd(viewGroup);
        }
        scrollingChildHelper.ZfQNn8hdWlEQ5cR94249PDsLR = z;
    }

    public void setOnFlingListener(vNbPG5KyhGfYLWoUO vnbpg5kyhgfylwouo) {
        this.JUdwvN8LfOMa = vnbpg5kyhgfylwouo;
    }

    @Deprecated
    public void setOnScrollListener(vBbBrJPQxVfAKJPVGhF3v vbbbrjpqxvfakjpvghf3v) {
        this.Z1FjjMJ0suz8AFI7gsA4GDLMXv = vbbbrjpqxvfakjpvghf3v;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.KYZ9RyuOc42A2J = z;
    }

    public void setRecycledViewPool(S2nN0Z2yP6NYzcJu8Sd s2nN0Z2yP6NYzcJu8Sd) {
        yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (yhxkwue1zri6a9vau8hg9c.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
            r1.zzpBGItXfub0yWj--;
        }
        yhxkwue1zri6a9vau8hg9c.ZLZeBXTMq0zDztBxtRTuCHrapQ = s2nN0Z2yP6NYzcJu8Sd;
        if (s2nN0Z2yP6NYzcJu8Sd == null || yhxkwue1zri6a9vau8hg9c.NSjgqmGjEzuugn2SsG1mZFP.getAdapter() == null) {
            return;
        }
        yhxkwue1zri6a9vau8hg9c.ZLZeBXTMq0zDztBxtRTuCHrapQ.zzpBGItXfub0yWj++;
    }

    public void setScrollState(int i) {
        hWsX15LBWoRzT hwsx15lbworzt;
        if (i == this.d9zDyyznnp3oaDT1Ug) {
            return;
        }
        this.d9zDyyznnp3oaDT1Ug = i;
        if (i != 2) {
            Y8unnL6HZ8WXVIsfrePA3V331ck y8unnL6HZ8WXVIsfrePA3V331ck = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
            y8unnL6HZ8WXVIsfrePA3V331ck.GI83zq0G8e7zkn.removeCallbacks(y8unnL6HZ8WXVIsfrePA3V331ck);
            y8unnL6HZ8WXVIsfrePA3V331ck.LaeGQIruHQu81hfJldjMOQSVblH3x.abortAnimation();
            wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
            if (wbbbe1vadvo1dmsg1odnaysaytu != null && (hwsx15lbworzt = wbbbe1vadvo1dmsg1odnaysaytu.LaeGQIruHQu81hfJldjMOQSVblH3x) != null) {
                hwsx15lbworzt.GI83zq0G8e7zkn();
            }
        }
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu2 = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu2 != null) {
            wbbbe1vadvo1dmsg1odnaysaytu2.tFRdVJAePmTx77bP7FAN0uI(i);
        }
        vBbBrJPQxVfAKJPVGhF3v vbbbrjpqxvfakjpvghf3v = this.Z1FjjMJ0suz8AFI7gsA4GDLMXv;
        if (vbbbrjpqxvfakjpvghf3v != null) {
            vbbbrjpqxvfakjpvghf3v.VxUQ9tBhpHJ2AAEDNW8sghc4m(i);
        }
        ArrayList arrayList = this.bjhcQ0u7VT2OYYrwk96HrWoN;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((vBbBrJPQxVfAKJPVGhF3v) this.bjhcQ0u7VT2OYYrwk96HrWoN.get(size)).VxUQ9tBhpHJ2AAEDNW8sghc4m(i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.lQ0rO9lhQIyVe7Rp6 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.lQ0rO9lhQIyVe7Rp6 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(WyxLGtS3Pb5NW7tq5LMcx wyxLGtS3Pb5NW7tq5LMcx) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().ZLZeBXTMq0zDztBxtRTuCHrapQ(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().NSjgqmGjEzuugn2SsG1mZFP(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        hWsX15LBWoRzT hwsx15lbworzt;
        if (z != this.q11o1hieEkZDhF1MGOZI26oZiDT) {
            GI83zq0G8e7zkn("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.q11o1hieEkZDhF1MGOZI26oZiDT = false;
                if (this.Irh5auREsoeV1C1RaBamlmy && this.p59rPv72J9 != null && this.q1wNbhk2O6 != null) {
                    requestLayout();
                }
                this.Irh5auREsoeV1C1RaBamlmy = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.q11o1hieEkZDhF1MGOZI26oZiDT = true;
            this.w0Wu95l8dVNw5rZMRu = true;
            setScrollState(0);
            Y8unnL6HZ8WXVIsfrePA3V331ck y8unnL6HZ8WXVIsfrePA3V331ck = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
            y8unnL6HZ8WXVIsfrePA3V331ck.GI83zq0G8e7zkn.removeCallbacks(y8unnL6HZ8WXVIsfrePA3V331ck);
            y8unnL6HZ8WXVIsfrePA3V331ck.LaeGQIruHQu81hfJldjMOQSVblH3x.abortAnimation();
            wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
            if (wbbbe1vadvo1dmsg1odnaysaytu == null || (hwsx15lbworzt = wbbbe1vadvo1dmsg1odnaysaytu.LaeGQIruHQu81hfJldjMOQSVblH3x) == null) {
                return;
            }
            hwsx15lbworzt.GI83zq0G8e7zkn();
        }
    }

    public final void vBGA6pPLqSMuYGvprl270j7() {
        if (this.iKANjmyTSxO6v6UuLPdu7DxOjlS != null) {
            return;
        }
        this.O1xDAlBZZlZdoEf747lCFHld.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.iKANjmyTSxO6v6UuLPdu7DxOjlS = edgeEffect;
        if (this.GI83zq0G8e7zkn) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final WFEUpQgjHl vE4yDIjexsP2lGjLaTcB(int i) {
        WFEUpQgjHl wFEUpQgjHl = null;
        if (this.SuB3hEmTmbbRGAhtvOOmfKEon) {
            return null;
        }
        int iIrh5auREsoeV1C1RaBamlmy = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.Irh5auREsoeV1C1RaBamlmy();
        for (int i2 = 0; i2 < iIrh5auREsoeV1C1RaBamlmy; i2++) {
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = qygqjTppWwx992(this.ZLZeBXTMq0zDztBxtRTuCHrapQ.TaDO7ogis3aEiWEtq(i2));
            if (wFEUpQgjHlQygqjTppWwx992 != null && !wFEUpQgjHlQygqjTppWwx992.NSjgqmGjEzuugn2SsG1mZFP() && O1xDAlBZZlZdoEf747lCFHld(wFEUpQgjHlQygqjTppWwx992) == i) {
                if (!((ArrayList) this.ZLZeBXTMq0zDztBxtRTuCHrapQ.ZfQNn8hdWlEQ5cR94249PDsLR).contains(wFEUpQgjHlQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m)) {
                    return wFEUpQgjHlQygqjTppWwx992;
                }
                wFEUpQgjHl = wFEUpQgjHlQygqjTppWwx992;
            }
        }
        return wFEUpQgjHl;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean vXWl0o6I4U59CgHs9(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.vXWl0o6I4U59CgHs9(int, int, android.view.MotionEvent, int):boolean");
    }

    public final String w0Wu95l8dVNw5rZMRu() {
        return " " + super.toString() + ", adapter:" + this.q1wNbhk2O6 + ", layout:" + this.p59rPv72J9 + ", context:" + getContext();
    }

    public final void wRCD0SdqWCowdYU7bmzN() {
        this.aXO0LSrt8bKV++;
    }

    public final void wdI7vzA3Qmcwd(int i, int i2, int[] iArr) {
        WFEUpQgjHl wFEUpQgjHl;
        GE1sqSYiEYQO2ew7WEZwTtUeS5();
        wRCD0SdqWCowdYU7bmzN();
        int i3 = TBOn1G6tgZKbOPI1mnHhsMX2mq3mV.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Trace.beginSection("RV Scroll");
        e20NJ5kD0wqGO3 e20nj5kd0wqgo3 = this.H2VFYNJEVGAX;
        RhfGHxtXxy0M0grmp2jkRjQg(e20nj5kd0wqgo3);
        yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int iByTQIhgl7ezGvHXEd = i != 0 ? this.p59rPv72J9.ByTQIhgl7ezGvHXEd(i, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3) : 0;
        int iE1gEV3X9xwmHj = i2 != 0 ? this.p59rPv72J9.e1gEV3X9xwmHj(i2, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3) : 0;
        Trace.endSection();
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int iCa81ebIan1u = nrjuzzioPqfttNRptBDpZDzSYUrcM.Ca81ebIan1u();
        for (int i4 = 0; i4 < iCa81ebIan1u; i4++) {
            View viewP59rPv72J9 = nrjuzzioPqfttNRptBDpZDzSYUrcM.p59rPv72J9(i4);
            WFEUpQgjHl wFEUpQgjHlY1NaPKTl7R18DOr6e8i5 = y1NaPKTl7R18DOr6e8i5(viewP59rPv72J9);
            if (wFEUpQgjHlY1NaPKTl7R18DOr6e8i5 != null && (wFEUpQgjHl = wFEUpQgjHlY1NaPKTl7R18DOr6e8i5.GI83zq0G8e7zkn) != null) {
                View view = wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                int left = viewP59rPv72J9.getLeft();
                int top = viewP59rPv72J9.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        gBaBUmihn5l4u(true);
        rERAmyEtGV6ANGszuKcQI(false);
        if (iArr != null) {
            iArr[0] = iByTQIhgl7ezGvHXEd;
            iArr[1] = iE1gEV3X9xwmHj;
        }
    }

    public final WFEUpQgjHl y1NaPKTl7R18DOr6e8i5(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return qygqjTppWwx992(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final void ymT6yQrus3w() {
        int iIrh5auREsoeV1C1RaBamlmy = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.Irh5auREsoeV1C1RaBamlmy();
        for (int i = 0; i < iIrh5auREsoeV1C1RaBamlmy; i++) {
            ((YoYMmBKQmkacZj7lMi9c) this.ZLZeBXTMq0zDztBxtRTuCHrapQ.TaDO7ogis3aEiWEtq(i).getLayoutParams()).V57tEvNfxZVVcOCAOih5PKr = true;
        }
        ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) ((WFEUpQgjHl) arrayList.get(i2)).VxUQ9tBhpHJ2AAEDNW8sghc4m.getLayoutParams();
            if (yoYMmBKQmkacZj7lMi9c != null) {
                yoYMmBKQmkacZj7lMi9c.V57tEvNfxZVVcOCAOih5PKr = true;
            }
        }
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(WFEUpQgjHl wFEUpQgjHl) {
        View view = wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        boolean z = view.getParent() == this;
        this.ZfQNn8hdWlEQ5cR94249PDsLR.HzCpKshMOoaw76hFcbOVRYMeRd(y1NaPKTl7R18DOr6e8i5(view));
        if (wFEUpQgjHl.M9e7PWhFYLD2lOGMker()) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.NSjgqmGjEzuugn2SsG1mZFP(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, -1, true);
            return;
        }
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int iIndexOfChild = ((IxShTNMvCWlbR) nrjuzzioPqfttNRptBDpZDzSYUrcM.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((xBkpwtKksCOQS) nrjuzzioPqfttNRptBDpZDzSYUrcM.V57tEvNfxZVVcOCAOih5PKr).GI83zq0G8e7zkn(iIndexOfChild);
            nrjuzzioPqfttNRptBDpZDzSYUrcM.w0Wu95l8dVNw5rZMRu(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void zOk739gUM7zIZC25HHUxoiyixWFjn(int i, int i2, boolean z) {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.q11o1hieEkZDhF1MGOZI26oZiDT) {
            return;
        }
        if (!wbbbe1vadvo1dmsg1odnaysaytu.ZfQNn8hdWlEQ5cR94249PDsLR()) {
            i = 0;
        }
        if (!this.p59rPv72J9.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            getScrollingChildHelper().ZLZeBXTMq0zDztBxtRTuCHrapQ(i3, 1);
        }
        this.zOk739gUM7zIZC25HHUxoiyixWFjn.zzpBGItXfub0yWj(i, i2, Integer.MIN_VALUE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        float fVxUQ9tBhpHJ2AAEDNW8sghc4m;
        char c;
        char c2;
        char c3;
        TypedArray typedArray;
        int i2;
        Constructor constructor;
        super(context, attributeSet, i);
        this.V57tEvNfxZVVcOCAOih5PKr = new FG8LIxsgYiLSfhN0jYKIKr(this);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new yhxKWuE1ZRi6a9VAU8HG9C(this);
        this.NSjgqmGjEzuugn2SsG1mZFP = new o6OxmOsCD9HJ6LF8UTncnTX9Cf21(8);
        this.M9e7PWhFYLD2lOGMker = new Rect();
        this.HzCpKshMOoaw76hFcbOVRYMeRd = new Rect();
        this.KUYypEB4eNWOZWVDpH = new RectF();
        this.Ca81ebIan1u = new ArrayList();
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new ArrayList();
        this.pYmKDYlAmhudp = new ArrayList();
        this.TaDO7ogis3aEiWEtq = 0;
        this.SuB3hEmTmbbRGAhtvOOmfKEon = false;
        this.pzqP2AqKW6J5PO8zCKnW = false;
        this.aXO0LSrt8bKV = 0;
        this.vE4yDIjexsP2lGjLaTcB = 0;
        this.O1xDAlBZZlZdoEf747lCFHld = new LAiDD5zgtCnRDrgc();
        OIQnrK0mzZ oIQnrK0mzZ = new OIQnrK0mzZ();
        Object[] objArr = null;
        oIQnrK0mzZ.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        oIQnrK0mzZ.zzpBGItXfub0yWj = new ArrayList();
        oIQnrK0mzZ.V57tEvNfxZVVcOCAOih5PKr = 120L;
        oIQnrK0mzZ.ZfQNn8hdWlEQ5cR94249PDsLR = 120L;
        oIQnrK0mzZ.LaeGQIruHQu81hfJldjMOQSVblH3x = 250L;
        oIQnrK0mzZ.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 250L;
        oIQnrK0mzZ.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        oIQnrK0mzZ.NSjgqmGjEzuugn2SsG1mZFP = new ArrayList();
        oIQnrK0mzZ.GI83zq0G8e7zkn = new ArrayList();
        oIQnrK0mzZ.M9e7PWhFYLD2lOGMker = new ArrayList();
        oIQnrK0mzZ.HzCpKshMOoaw76hFcbOVRYMeRd = new ArrayList();
        oIQnrK0mzZ.KUYypEB4eNWOZWVDpH = new ArrayList();
        oIQnrK0mzZ.q1wNbhk2O6 = new ArrayList();
        oIQnrK0mzZ.p59rPv72J9 = new ArrayList();
        oIQnrK0mzZ.Ca81ebIan1u = new ArrayList();
        oIQnrK0mzZ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new ArrayList();
        oIQnrK0mzZ.pYmKDYlAmhudp = new ArrayList();
        oIQnrK0mzZ.ko09zE6UAgwkV = new ArrayList();
        this.TqcnImqkSWIKht = oIQnrK0mzZ;
        this.d9zDyyznnp3oaDT1Ug = 0;
        this.CixTK5ZX8oWXHz34qHYV = -1;
        this.vXWl0o6I4U59CgHs9 = Float.MIN_VALUE;
        this.wdI7vzA3Qmcwd = Float.MIN_VALUE;
        this.KYZ9RyuOc42A2J = true;
        this.zOk739gUM7zIZC25HHUxoiyixWFjn = new Y8unnL6HZ8WXVIsfrePA3V331ck(this);
        this.rERAmyEtGV6ANGszuKcQI = new MSl7hPM6XqjxyBV5m();
        e20NJ5kD0wqGO3 e20nj5kd0wqgo3 = new e20NJ5kD0wqGO3();
        e20nj5kd0wqgo3.VxUQ9tBhpHJ2AAEDNW8sghc4m = -1;
        e20nj5kd0wqgo3.zzpBGItXfub0yWj = 0;
        e20nj5kd0wqgo3.V57tEvNfxZVVcOCAOih5PKr = 0;
        e20nj5kd0wqgo3.ZfQNn8hdWlEQ5cR94249PDsLR = 1;
        e20nj5kd0wqgo3.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        e20nj5kd0wqgo3.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
        e20nj5kd0wqgo3.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
        e20nj5kd0wqgo3.NSjgqmGjEzuugn2SsG1mZFP = false;
        e20nj5kd0wqgo3.GI83zq0G8e7zkn = false;
        e20nj5kd0wqgo3.M9e7PWhFYLD2lOGMker = false;
        e20nj5kd0wqgo3.HzCpKshMOoaw76hFcbOVRYMeRd = false;
        this.H2VFYNJEVGAX = e20nj5kd0wqgo3;
        this.BJQHddi0Plr5ElWetCyaixWOg9 = false;
        this.tFRdVJAePmTx77bP7FAN0uI = false;
        IxShTNMvCWlbR ixShTNMvCWlbR = new IxShTNMvCWlbR(this);
        this.mhUCRR8ceqc7mAozW = ixShTNMvCWlbR;
        this.rE05n5RsRkyWKIeA9cmLXAKv4Hze = false;
        this.ubNpdCC1pl7L = new int[2];
        this.HAPpjhiCsV9ONY23505HCBI9IX = new int[2];
        this.ByTQIhgl7ezGvHXEd = new int[2];
        this.tpEo0fy9FaoJYrSFHRfIK6 = new int[2];
        this.e1gEV3X9xwmHj = new ArrayList();
        this.AFOcXGdvoTMuqwiG8tD = new RfOSIaL6qUBGKJY9MSCBP5ba(9, this);
        this.lxWWbfAOLs4jWzd7PSIiIJ = 0;
        this.VOvSEdhaZyc0oOGQ8 = 0;
        this.h2b7InwIaORKN91X7whfQh4 = new IxShTNMvCWlbR(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.lQ0rO9lhQIyVe7Rp6 = viewConfiguration.getScaledTouchSlop();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = wQvZok2Lu79.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            fVxUQ9tBhpHJ2AAEDNW8sghc4m = r7fKZGfezTdpRAhj.VxUQ9tBhpHJ2AAEDNW8sghc4m(viewConfiguration);
        } else {
            fVxUQ9tBhpHJ2AAEDNW8sghc4m = wQvZok2Lu79.VxUQ9tBhpHJ2AAEDNW8sghc4m(viewConfiguration, context);
        }
        this.vXWl0o6I4U59CgHs9 = fVxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.wdI7vzA3Qmcwd = i3 >= 26 ? r7fKZGfezTdpRAhj.zzpBGItXfub0yWj(viewConfiguration) : wQvZok2Lu79.VxUQ9tBhpHJ2AAEDNW8sghc4m(viewConfiguration, context);
        this.ItrQwCXbty5PZtje5JS = viewConfiguration.getScaledMinimumFlingVelocity();
        this.hKs1wlZyvtUNaW1f5ABIGacfPcvX = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.TqcnImqkSWIKht.VxUQ9tBhpHJ2AAEDNW8sghc4m = ixShTNMvCWlbR;
        IxShTNMvCWlbR ixShTNMvCWlbR2 = new IxShTNMvCWlbR(this);
        UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT = new UL4JI0eLnaD84py2JT();
        uL4JI0eLnaD84py2JT.VxUQ9tBhpHJ2AAEDNW8sghc4m = new ecw4qnyPnY9UWzcAo9wor(30);
        uL4JI0eLnaD84py2JT.zzpBGItXfub0yWj = new ArrayList();
        uL4JI0eLnaD84py2JT.V57tEvNfxZVVcOCAOih5PKr = new ArrayList();
        uL4JI0eLnaD84py2JT.ZfQNn8hdWlEQ5cR94249PDsLR = ixShTNMvCWlbR2;
        uL4JI0eLnaD84py2JT.LaeGQIruHQu81hfJldjMOQSVblH3x = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(29, uL4JI0eLnaD84py2JT);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = uL4JI0eLnaD84py2JT;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new NrjuzzioPqfttNRptBDpZDzSYUrcM(new IxShTNMvCWlbR(this));
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if ((i3 >= 26 ? km3hhVZDUIOp1cDFgeK9.VxUQ9tBhpHJ2AAEDNW8sghc4m(this) : 0) == 0 && i3 >= 26) {
            km3hhVZDUIOp1cDFgeK9.zzpBGItXfub0yWj(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.qNPQb1obP7 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new cCsw66b243HzgVzE4uRxrAcogfXx6(this));
        int[] iArr = nWfeFfb6D2ofx6xWm.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        xb0r6yEzq0tw9m7nTWG5BFR8.KUYypEB4eNWOZWVDpH(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.GI83zq0G8e7zkn = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + w0Wu95l8dVNw5rZMRu());
            }
            Resources resources = getContext().getResources();
            c = 3;
            c3 = 2;
            c2 = 1;
            typedArray = typedArrayObtainStyledAttributes;
            i2 = 4;
            new O23cBAsx5mVwcI(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.vdodsodjsdt.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.vdodsodjsdt.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.vdodsodjsdt.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            c2 = 1;
            c3 = 2;
            typedArray = typedArrayObtainStyledAttributes;
            i2 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(wbBBe1vAdVO1DmSg1odNaySAYTu.class);
                    try {
                        Constructor constructor2 = clsAsSubclass.getConstructor(G479XgNG9rK8jPPbSXr);
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = context;
                        objArr2[c2] = attributeSet;
                        objArr2[c3] = Integer.valueOf(i);
                        objArr2[c] = 0;
                        objArr = objArr2;
                        constructor = constructor2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(c2);
                    setLayoutManager((wbBBe1vAdVO1DmSg1odNaySAYTu) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr2 = r0dB0ojIy6g8mnk1;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        xb0r6yEzq0tw9m7nTWG5BFR8.KUYypEB4eNWOZWVDpH(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.p59rPv72J9;
        if (wbbbe1vadvo1dmsg1odnaysaytu != null) {
            return wbbbe1vadvo1dmsg1odnaysaytu.f6ZQsR6bPLvvCDNXOUc(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + w0Wu95l8dVNw5rZMRu());
    }

    @Deprecated
    public void setRecyclerListener(O0SqJkZ6TdwXznZb0Nd o0SqJkZ6TdwXznZb0Nd) {
    }
}
