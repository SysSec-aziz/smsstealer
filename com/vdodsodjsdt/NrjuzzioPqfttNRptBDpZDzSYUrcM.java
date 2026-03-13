package com.vdodsodjsdt;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase_Impl;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class NrjuzzioPqfttNRptBDpZDzSYUrcM implements qWuPVRr6hlUOfzGkjKs9 {
    public static volatile NrjuzzioPqfttNRptBDpZDzSYUrcM LaeGQIruHQu81hfJldjMOQSVblH3x;
    public static NrjuzzioPqfttNRptBDpZDzSYUrcM ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public static final Object zIvmSL0wzmmKGc3X39b2Gw2mUGE = new Object();
    public Object V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public Object zzpBGItXfub0yWj;

    public /* synthetic */ NrjuzzioPqfttNRptBDpZDzSYUrcM(Object obj, Object obj2, Object obj3, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = obj;
        this.V57tEvNfxZVVcOCAOih5PKr = obj2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj3;
    }

    public static boolean GI83zq0G8e7zkn(Editable editable, KeyEvent keyEvent, boolean z) {
        snK44eFCqPRHn60dk2IksCvvCD[] snk44efcqprhn60dk2ikscvvcdArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (snk44efcqprhn60dk2ikscvvcdArr = (snK44eFCqPRHn60dk2IksCvvCD[]) editable.getSpans(selectionStart, selectionEnd, snK44eFCqPRHn60dk2IksCvvCD.class)) != null && snk44efcqprhn60dk2ikscvvcdArr.length > 0) {
                for (snK44eFCqPRHn60dk2IksCvvCD snk44efcqprhn60dk2ikscvvcd : snk44efcqprhn60dk2ikscvvcdArr) {
                    int spanStart = editable.getSpanStart(snk44efcqprhn60dk2ikscvvcd);
                    int spanEnd = editable.getSpanEnd(snk44efcqprhn60dk2ikscvvcd);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static NrjuzzioPqfttNRptBDpZDzSYUrcM f6ZQsR6bPLvvCDNXOUc(Context context) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
            synchronized (zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                try {
                    if (LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
                        LaeGQIruHQu81hfJldjMOQSVblH3x = new NrjuzzioPqfttNRptBDpZDzSYUrcM(context);
                    }
                } finally {
                }
            }
        }
        return LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public static NrjuzzioPqfttNRptBDpZDzSYUrcM qNPQb1obP7(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new NrjuzzioPqfttNRptBDpZDzSYUrcM(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public int Ca81ebIan1u() {
        return ((IxShTNMvCWlbR) this.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m.getChildCount() - ((ArrayList) this.ZfQNn8hdWlEQ5cR94249PDsLR).size();
    }

    public void HVEwbdULInpTNa0IG(View view) {
        if (((ArrayList) this.ZfQNn8hdWlEQ5cR94249PDsLR).remove(view)) {
            IxShTNMvCWlbR ixShTNMvCWlbR = (IxShTNMvCWlbR) this.zzpBGItXfub0yWj;
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(view);
            if (wFEUpQgjHlQygqjTppWwx992 != null) {
                RecyclerView recyclerView = ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                int i = wFEUpQgjHlQygqjTppWwx992.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                if (recyclerView.d9zDyyznnp3oaDT1Ug()) {
                    wFEUpQgjHlQygqjTppWwx992.pYmKDYlAmhudp = i;
                    recyclerView.e1gEV3X9xwmHj.add(wFEUpQgjHlQygqjTppWwx992);
                } else {
                    View view2 = wFEUpQgjHlQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    view2.setImportantForAccessibility(i);
                }
                wFEUpQgjHlQygqjTppWwx992.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 0;
            }
        }
    }

    public void HzCpKshMOoaw76hFcbOVRYMeRd(Bundle bundle) {
        HashSet hashSet = (HashSet) this.V57tEvNfxZVVcOCAOih5PKr;
        String string = ((Context) this.ZfQNn8hdWlEQ5cR94249PDsLR).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (AO2JzxMx6g.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    KUYypEB4eNWOZWVDpH((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new Eyg9qHiQ9Ki1REKbbd3J(e);
            }
        }
    }

    public int Irh5auREsoeV1C1RaBamlmy() {
        return ((IxShTNMvCWlbR) this.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m.getChildCount();
    }

    public Object KUYypEB4eNWOZWVDpH(Class cls, HashSet hashSet) {
        Object objZzpBGItXfub0yWj;
        HashMap map = (HashMap) this.zzpBGItXfub0yWj;
        if (hRrPPME7ytOB7ba.f6ZQsR6bPLvvCDNXOUc()) {
            try {
                Trace.beginSection(hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objZzpBGItXfub0yWj = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                AO2JzxMx6g aO2JzxMx6g = (AO2JzxMx6g) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listVxUQ9tBhpHJ2AAEDNW8sghc4m = aO2JzxMx6g.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                if (!listVxUQ9tBhpHJ2AAEDNW8sghc4m.isEmpty()) {
                    for (Class cls2 : listVxUQ9tBhpHJ2AAEDNW8sghc4m) {
                        if (!map.containsKey(cls2)) {
                            KUYypEB4eNWOZWVDpH(cls2, hashSet);
                        }
                    }
                }
                objZzpBGItXfub0yWj = aO2JzxMx6g.zzpBGItXfub0yWj((Context) this.ZfQNn8hdWlEQ5cR94249PDsLR);
                hashSet.remove(cls);
                map.put(cls, objZzpBGItXfub0yWj);
            } catch (Throwable th2) {
                throw new Eyg9qHiQ9Ki1REKbbd3J(th2);
            }
        }
        Trace.endSection();
        return objZzpBGItXfub0yWj;
    }

    @Override // com.vdodsodjsdt.qWuPVRr6hlUOfzGkjKs9
    public Uri LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return (Uri) this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public void M9e7PWhFYLD2lOGMker(int i) {
        WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992;
        int iVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(i);
        ((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr).ZLZeBXTMq0zDztBxtRTuCHrapQ(iVBGA6pPLqSMuYGvprl270j7);
        RecyclerView recyclerView = ((IxShTNMvCWlbR) this.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m;
        View childAt = recyclerView.getChildAt(iVBGA6pPLqSMuYGvprl270j7);
        if (childAt != null && (wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(childAt)) != null) {
            if (wFEUpQgjHlQygqjTppWwx992.M9e7PWhFYLD2lOGMker() && !wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u()) {
                throw new IllegalArgumentException("called detach on an already detached child " + wFEUpQgjHlQygqjTppWwx992 + recyclerView.w0Wu95l8dVNw5rZMRu());
            }
            wFEUpQgjHlQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m(256);
        }
        recyclerView.detachViewFromParent(iVBGA6pPLqSMuYGvprl270j7);
    }

    public void NSjgqmGjEzuugn2SsG1mZFP(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = ((IxShTNMvCWlbR) this.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int childCount = i < 0 ? recyclerView.getChildCount() : vBGA6pPLqSMuYGvprl270j7(i);
        ((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr).LaeGQIruHQu81hfJldjMOQSVblH3x(childCount, z);
        if (z) {
            w0Wu95l8dVNw5rZMRu(view);
        }
        WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(view);
        if (wFEUpQgjHlQygqjTppWwx992 != null) {
            if (!wFEUpQgjHlQygqjTppWwx992.M9e7PWhFYLD2lOGMker() && !wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + wFEUpQgjHlQygqjTppWwx992 + recyclerView.w0Wu95l8dVNw5rZMRu());
            }
            wFEUpQgjHlQygqjTppWwx992.M9e7PWhFYLD2lOGMker &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public void O1xDAlBZZlZdoEf747lCFHld(rwLNq3eKZ2vnR0XP rwlnq3ekz2vnr0xp, int i, int i2, int i3) {
        rwlnq3ekz2vnr0xp.getClass();
        int i4 = rwlnq3ekz2vnr0xp.rERAmyEtGV6ANGszuKcQI;
        int i5 = rwlnq3ekz2vnr0xp.H2VFYNJEVGAX;
        rwlnq3ekz2vnr0xp.rERAmyEtGV6ANGszuKcQI = 0;
        rwlnq3ekz2vnr0xp.H2VFYNJEVGAX = 0;
        rwlnq3ekz2vnr0xp.YdNRGRc4rly(i2);
        rwlnq3ekz2vnr0xp.d9zDyyznnp3oaDT1Ug(i3);
        if (i4 < 0) {
            rwlnq3ekz2vnr0xp.rERAmyEtGV6ANGszuKcQI = 0;
        } else {
            rwlnq3ekz2vnr0xp.rERAmyEtGV6ANGszuKcQI = i4;
        }
        if (i5 < 0) {
            rwlnq3ekz2vnr0xp.H2VFYNJEVGAX = 0;
        } else {
            rwlnq3ekz2vnr0xp.H2VFYNJEVGAX = i5;
        }
        rwLNq3eKZ2vnR0XP rwlnq3ekz2vnr0xp2 = (rwLNq3eKZ2vnR0XP) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        rwlnq3ekz2vnr0xp2.VOvSEdhaZyc0oOGQ8 = i;
        rwlnq3ekz2vnr0xp2.ItrQwCXbty5PZtje5JS();
    }

    public boolean RhfGHxtXxy0M0grmp2jkRjQg(int i, lNG0v0TTGdvR lng0v0ttgdvr, IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD) {
        Cmxkosub3Ql97Ws cmxkosub3Ql97Ws = (Cmxkosub3Ql97Ws) this.V57tEvNfxZVVcOCAOih5PKr;
        int[] iArr = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.e1gEV3X9xwmHj;
        int[] iArr2 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.f6ZQsR6bPLvvCDNXOUc;
        cmxkosub3Ql97Ws.VxUQ9tBhpHJ2AAEDNW8sghc4m = iArr[0];
        cmxkosub3Ql97Ws.zzpBGItXfub0yWj = iArr[1];
        cmxkosub3Ql97Ws.V57tEvNfxZVVcOCAOih5PKr = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.pYmKDYlAmhudp();
        cmxkosub3Ql97Ws.ZfQNn8hdWlEQ5cR94249PDsLR = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.HzCpKshMOoaw76hFcbOVRYMeRd();
        cmxkosub3Ql97Ws.GI83zq0G8e7zkn = false;
        cmxkosub3Ql97Ws.M9e7PWhFYLD2lOGMker = i;
        boolean z = cmxkosub3Ql97Ws.VxUQ9tBhpHJ2AAEDNW8sghc4m == 3;
        boolean z2 = cmxkosub3Ql97Ws.zzpBGItXfub0yWj == 3;
        boolean z3 = z && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.vXWl0o6I4U59CgHs9 > 0.0f;
        boolean z4 = z2 && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.vXWl0o6I4U59CgHs9 > 0.0f;
        if (z3 && iArr2[0] == 4) {
            cmxkosub3Ql97Ws.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        }
        if (z4 && iArr2[1] == 4) {
            cmxkosub3Ql97Ws.zzpBGItXfub0yWj = 1;
        }
        lng0v0ttgdvr.zzpBGItXfub0yWj(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD, cmxkosub3Ql97Ws);
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.YdNRGRc4rly(cmxkosub3Ql97Ws.LaeGQIruHQu81hfJldjMOQSVblH3x);
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.d9zDyyznnp3oaDT1Ug(cmxkosub3Ql97Ws.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.vE4yDIjexsP2lGjLaTcB = cmxkosub3Ql97Ws.NSjgqmGjEzuugn2SsG1mZFP;
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.qygqjTppWwx992(cmxkosub3Ql97Ws.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        cmxkosub3Ql97Ws.M9e7PWhFYLD2lOGMker = 0;
        return cmxkosub3Ql97Ws.GI83zq0G8e7zkn;
    }

    public void SuB3hEmTmbbRGAhtvOOmfKEon(XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7) {
        OO7CP0LPEEly4 oO7CP0LPEEly4 = (OO7CP0LPEEly4) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (oO7CP0LPEEly4 != null) {
            oO7CP0LPEEly4.run();
        }
        OO7CP0LPEEly4 oO7CP0LPEEly42 = new OO7CP0LPEEly4((androidx.lifecycle.iVKrTMqOw0TqCeNN) this.zzpBGItXfub0yWj, xOTOHmUA5NYhlyOBh7);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = oO7CP0LPEEly42;
        ((Handler) this.V57tEvNfxZVVcOCAOih5PKr).postAtFrontOfQueue(oO7CP0LPEEly42);
    }

    public View TaDO7ogis3aEiWEtq(int i) {
        return ((IxShTNMvCWlbR) this.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m.getChildAt(i);
    }

    @Override // com.vdodsodjsdt.qWuPVRr6hlUOfzGkjKs9
    public Uri V57tEvNfxZVVcOCAOih5PKr() {
        return (Uri) this.zzpBGItXfub0yWj;
    }

    @Override // com.vdodsodjsdt.qWuPVRr6hlUOfzGkjKs9
    public ClipDescription VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return (ClipDescription) this.V57tEvNfxZVVcOCAOih5PKr;
    }

    public void ZLZeBXTMq0zDztBxtRTuCHrapQ(View view, int i, boolean z) {
        RecyclerView recyclerView = ((IxShTNMvCWlbR) this.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int childCount = i < 0 ? recyclerView.getChildCount() : vBGA6pPLqSMuYGvprl270j7(i);
        ((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr).LaeGQIruHQu81hfJldjMOQSVblH3x(childCount, z);
        if (z) {
            w0Wu95l8dVNw5rZMRu(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.qygqjTppWwx992(view);
    }

    public void aXO0LSrt8bKV() {
        ((TypedArray) this.V57tEvNfxZVVcOCAOih5PKr).recycle();
    }

    public ColorStateList h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int i) {
        int resourceId;
        ColorStateList colorStateListTaDO7ogis3aEiWEtq;
        TypedArray typedArray = (TypedArray) this.V57tEvNfxZVVcOCAOih5PKr;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListTaDO7ogis3aEiWEtq = zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq((Context) this.zzpBGItXfub0yWj, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListTaDO7ogis3aEiWEtq;
    }

    public Typeface jW7EiD0YL6xkbB158jMUzhWNWb1y(int i, int i2, LRBGbkrLq2DH2orV6 lRBGbkrLq2DH2orV6) {
        int resourceId = ((TypedArray) this.V57tEvNfxZVVcOCAOih5PKr).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.ZfQNn8hdWlEQ5cR94249PDsLR) == null) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = new TypedValue();
        }
        Context context = (Context) this.zzpBGItXfub0yWj;
        TypedValue typedValue = (TypedValue) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ThreadLocal threadLocal = h88a6weV7Lqlrc7J4ND8e7Rcl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (context.isRestricted()) {
            return null;
        }
        return h88a6weV7Lqlrc7J4ND8e7Rcl.VxUQ9tBhpHJ2AAEDNW8sghc4m(context, resourceId, typedValue, i2, lRBGbkrLq2DH2orV6, true, false);
    }

    public Drawable ko09zE6UAgwkV(int i) {
        int resourceId;
        Drawable drawableZfQNn8hdWlEQ5cR94249PDsLR;
        if (!((TypedArray) this.V57tEvNfxZVVcOCAOih5PKr).hasValue(i) || (resourceId = ((TypedArray) this.V57tEvNfxZVVcOCAOih5PKr).getResourceId(i, 0)) == 0) {
            return null;
        }
        aMdFkGJAdbLdAI00ZfKC7DaJw3k2 amdfkgjadbldai00zfkc7dajw3k2VxUQ9tBhpHJ2AAEDNW8sghc4m = aMdFkGJAdbLdAI00ZfKC7DaJw3k2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        Context context = (Context) this.zzpBGItXfub0yWj;
        synchronized (amdfkgjadbldai00zfkc7dajw3k2VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            drawableZfQNn8hdWlEQ5cR94249PDsLR = amdfkgjadbldai00zfkc7dajw3k2VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(context, resourceId, true);
        }
        return drawableZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public View p59rPv72J9(int i) {
        return ((IxShTNMvCWlbR) this.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m.getChildAt(vBGA6pPLqSMuYGvprl270j7(i));
    }

    public Drawable pYmKDYlAmhudp(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.V57tEvNfxZVVcOCAOih5PKr;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y((Context) this.zzpBGItXfub0yWj, resourceId);
    }

    public Object pzqP2AqKW6J5PO8zCKnW(CharSequence charSequence, int i, int i2, int i3, boolean z, eVkjm1F3XGhL0WhyMyqjLr evkjm1f3xghl0whymyqjlr) {
        int i4;
        char c;
        XUSWyRNRxWYl8s2kcKB9zScvHS2o6 xUSWyRNRxWYl8s2kcKB9zScvHS2o6 = new XUSWyRNRxWYl8s2kcKB9zScvHS2o6((knvMaeWXykSE5) ((nMRZPpfLCgJyuB) this.V57tEvNfxZVVcOCAOih5PKr).LaeGQIruHQu81hfJldjMOQSVblH3x);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zZzpBGItXfub0yWj = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zZzpBGItXfub0yWj) {
                SparseArray sparseArray = xUSWyRNRxWYl8s2kcKB9zScvHS2o6.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                knvMaeWXykSE5 knvmaewxykse5 = sparseArray == null ? null : (knvMaeWXykSE5) sparseArray.get(iCodePointAt);
                if (xUSWyRNRxWYl8s2kcKB9zScvHS2o6.VxUQ9tBhpHJ2AAEDNW8sghc4m == 2) {
                    if (knvmaewxykse5 != null) {
                        xUSWyRNRxWYl8s2kcKB9zScvHS2o6.V57tEvNfxZVVcOCAOih5PKr = knvmaewxykse5;
                        xUSWyRNRxWYl8s2kcKB9zScvHS2o6.zIvmSL0wzmmKGc3X39b2Gw2mUGE++;
                    } else {
                        if (iCodePointAt == 65038) {
                            xUSWyRNRxWYl8s2kcKB9zScvHS2o6.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        } else if (iCodePointAt != 65039) {
                            knvMaeWXykSE5 knvmaewxykse52 = xUSWyRNRxWYl8s2kcKB9zScvHS2o6.V57tEvNfxZVVcOCAOih5PKr;
                            if (knvmaewxykse52.zzpBGItXfub0yWj != null) {
                                if (xUSWyRNRxWYl8s2kcKB9zScvHS2o6.zIvmSL0wzmmKGc3X39b2Gw2mUGE != 1) {
                                    xUSWyRNRxWYl8s2kcKB9zScvHS2o6.ZfQNn8hdWlEQ5cR94249PDsLR = knvmaewxykse52;
                                    xUSWyRNRxWYl8s2kcKB9zScvHS2o6.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                                } else if (xUSWyRNRxWYl8s2kcKB9zScvHS2o6.zzpBGItXfub0yWj()) {
                                    xUSWyRNRxWYl8s2kcKB9zScvHS2o6.ZfQNn8hdWlEQ5cR94249PDsLR = xUSWyRNRxWYl8s2kcKB9zScvHS2o6.V57tEvNfxZVVcOCAOih5PKr;
                                    xUSWyRNRxWYl8s2kcKB9zScvHS2o6.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                                } else {
                                    xUSWyRNRxWYl8s2kcKB9zScvHS2o6.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                                }
                                c = 3;
                            } else {
                                xUSWyRNRxWYl8s2kcKB9zScvHS2o6.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (knvmaewxykse5 == null) {
                    xUSWyRNRxWYl8s2kcKB9zScvHS2o6.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    c = 1;
                } else {
                    xUSWyRNRxWYl8s2kcKB9zScvHS2o6.VxUQ9tBhpHJ2AAEDNW8sghc4m = 2;
                    xUSWyRNRxWYl8s2kcKB9zScvHS2o6.V57tEvNfxZVVcOCAOih5PKr = knvmaewxykse5;
                    xUSWyRNRxWYl8s2kcKB9zScvHS2o6.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 1;
                    c = 2;
                }
                xUSWyRNRxWYl8s2kcKB9zScvHS2o6.LaeGQIruHQu81hfJldjMOQSVblH3x = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !q11o1hieEkZDhF1MGOZI26oZiDT(charSequence, i4, iCharCount, xUSWyRNRxWYl8s2kcKB9zScvHS2o6.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj)) {
                        zZzpBGItXfub0yWj = evkjm1f3xghl0whymyqjlr.zzpBGItXfub0yWj(charSequence, i4, iCharCount, xUSWyRNRxWYl8s2kcKB9zScvHS2o6.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (xUSWyRNRxWYl8s2kcKB9zScvHS2o6.VxUQ9tBhpHJ2AAEDNW8sghc4m == 2 && xUSWyRNRxWYl8s2kcKB9zScvHS2o6.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj != null && ((xUSWyRNRxWYl8s2kcKB9zScvHS2o6.zIvmSL0wzmmKGc3X39b2Gw2mUGE > 1 || xUSWyRNRxWYl8s2kcKB9zScvHS2o6.zzpBGItXfub0yWj()) && i5 < i3 && zZzpBGItXfub0yWj && (z || !q11o1hieEkZDhF1MGOZI26oZiDT(charSequence, i4, iCharCount, xUSWyRNRxWYl8s2kcKB9zScvHS2o6.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj)))) {
            evkjm1f3xghl0whymyqjlr.zzpBGItXfub0yWj(charSequence, i4, iCharCount, xUSWyRNRxWYl8s2kcKB9zScvHS2o6.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj);
        }
        return evkjm1f3xghl0whymyqjlr.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public boolean q11o1hieEkZDhF1MGOZI26oZiDT(CharSequence charSequence, int i, int i2, oSxBDDVoR8J7pe6iX1zsMApcaW osxbddvor8j7pe6ix1zsmapcaw) {
        if ((osxbddvor8j7pe6ix1zsmapcaw.V57tEvNfxZVVcOCAOih5PKr & 3) == 0) {
            aHVsLUNi0fnjYEQaFgBGI ahvsluni0fnjyeqafgbgi = (aHVsLUNi0fnjYEQaFgBGI) this.ZfQNn8hdWlEQ5cR94249PDsLR;
            plKpuT2Rxr1dLc54nNo2wqG4RbP plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj = osxbddvor8j7pe6ix1zsmapcaw.zzpBGItXfub0yWj();
            int iVxUQ9tBhpHJ2AAEDNW8sghc4m = plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m(8);
            if (iVxUQ9tBhpHJ2AAEDNW8sghc4m != 0) {
                ((ByteBuffer) plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj.zIvmSL0wzmmKGc3X39b2Gw2mUGE).getShort(iVxUQ9tBhpHJ2AAEDNW8sghc4m + plkput2rxr1dlc54nno2wqg4rbpZzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr);
            }
            wsqHCLtouHBbS4err7j wsqhcltouhbbs4err7j = (wsqHCLtouHBbS4err7j) ahvsluni0fnjyeqafgbgi;
            wsqhcltouhbbs4err7j.getClass();
            ThreadLocal threadLocal = wsqHCLtouHBbS4err7j.zzpBGItXfub0yWj;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = wsqhcltouhbbs4err7j.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            String string = sb.toString();
            int i3 = W4XJ13l0UUzf75tYCvcCk3d9VEV.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i4 = osxbddvor8j7pe6ix1zsmapcaw.V57tEvNfxZVVcOCAOih5PKr & 4;
            osxbddvor8j7pe6ix1zsmapcaw.V57tEvNfxZVVcOCAOih5PKr = zHasGlyph ? i4 | 2 : i4 | 1;
        }
        return (osxbddvor8j7pe6ix1zsmapcaw.V57tEvNfxZVVcOCAOih5PKr & 3) == 2;
    }

    public l6xJVUTn99ZWyAVk q1wNbhk2O6(Class cls, String str) {
        l6xJVUTn99ZWyAVk l6xjvutn99zwyavkV57tEvNfxZVVcOCAOih5PKr;
        XGVgBiBsAB8XY xGVgBiBsAB8XY = (XGVgBiBsAB8XY) this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "key");
        cx2YoQOPZxuB1B0n1aU3M cx2yoqopzxub1b0n1au3m = (cx2YoQOPZxuB1B0n1aU3M) this.zzpBGItXfub0yWj;
        cx2yoqopzxub1b0n1au3m.getClass();
        LinkedHashMap linkedHashMap = cx2yoqopzxub1b0n1au3m.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        l6xJVUTn99ZWyAVk l6xjvutn99zwyavk = (l6xJVUTn99ZWyAVk) linkedHashMap.get(str);
        if (cls.isInstance(l6xjvutn99zwyavk)) {
            if (xGVgBiBsAB8XY instanceof Ou1N5agIDHYbroGViHdFHZ0Cxe) {
            }
            ej6unYlOWMDF.Ca81ebIan1u(l6xjvutn99zwyavk, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return l6xjvutn99zwyavk;
        }
        V9VO2k88X42B v9VO2k88X42B = new V9VO2k88X42B((qajJDo6ciXOFr7gO1jYELQiwO) this.ZfQNn8hdWlEQ5cR94249PDsLR);
        v9VO2k88X42B.VxUQ9tBhpHJ2AAEDNW8sghc4m.put(IN79WcIk5xB4t0GjRT43qPLs5.f6ZQsR6bPLvvCDNXOUc, str);
        try {
            l6xjvutn99zwyavkV57tEvNfxZVVcOCAOih5PKr = xGVgBiBsAB8XY.VxUQ9tBhpHJ2AAEDNW8sghc4m(cls, v9VO2k88X42B);
        } catch (AbstractMethodError unused) {
            l6xjvutn99zwyavkV57tEvNfxZVVcOCAOih5PKr = xGVgBiBsAB8XY.V57tEvNfxZVVcOCAOih5PKr(cls);
        }
        ej6unYlOWMDF.pYmKDYlAmhudp(l6xjvutn99zwyavkV57tEvNfxZVVcOCAOih5PKr, "viewModel");
        l6xJVUTn99ZWyAVk l6xjvutn99zwyavk2 = (l6xJVUTn99ZWyAVk) linkedHashMap.put(str, l6xjvutn99zwyavkV57tEvNfxZVVcOCAOih5PKr);
        if (l6xjvutn99zwyavk2 != null) {
            l6xjvutn99zwyavk2.zzpBGItXfub0yWj();
        }
        return l6xjvutn99zwyavkV57tEvNfxZVVcOCAOih5PKr;
    }

    public String toString() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return ((xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr).toString() + ", hidden list:" + ((ArrayList) this.ZfQNn8hdWlEQ5cR94249PDsLR).size();
            default:
                return super.toString();
        }
    }

    public int vBGA6pPLqSMuYGvprl270j7(int i) {
        xBkpwtKksCOQS xbkpwtkkscoqs = (xBkpwtKksCOQS) this.V57tEvNfxZVVcOCAOih5PKr;
        if (i < 0) {
            return -1;
        }
        int childCount = ((IxShTNMvCWlbR) this.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int iZzpBGItXfub0yWj = i - (i2 - xbkpwtkkscoqs.zzpBGItXfub0yWj(i2));
            if (iZzpBGItXfub0yWj == 0) {
                while (xbkpwtkkscoqs.ZfQNn8hdWlEQ5cR94249PDsLR(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iZzpBGItXfub0yWj;
        }
        return -1;
    }

    public void vE4yDIjexsP2lGjLaTcB(gILkjwpvkGF5oaalOyU gilkjwpvkgf5oaaloyu) {
        ej6unYlOWMDF.pYmKDYlAmhudp(gilkjwpvkgf5oaaloyu, "type");
        if (gilkjwpvkgf5oaaloyu.zzpBGItXfub0yWj.equals("multipart")) {
            this.V57tEvNfxZVVcOCAOih5PKr = gilkjwpvkgf5oaaloyu;
        } else {
            throw new IllegalArgumentException(("multipart != " + gilkjwpvkgf5oaaloyu).toString());
        }
    }

    public void w0Wu95l8dVNw5rZMRu(View view) {
        ((ArrayList) this.ZfQNn8hdWlEQ5cR94249PDsLR).add(view);
        IxShTNMvCWlbR ixShTNMvCWlbR = (IxShTNMvCWlbR) this.zzpBGItXfub0yWj;
        WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(view);
        if (wFEUpQgjHlQygqjTppWwx992 != null) {
            View view2 = wFEUpQgjHlQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            RecyclerView recyclerView = ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int i = wFEUpQgjHlQygqjTppWwx992.pYmKDYlAmhudp;
            if (i != -1) {
                wFEUpQgjHlQygqjTppWwx992.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = i;
            } else {
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                wFEUpQgjHlQygqjTppWwx992.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = view2.getImportantForAccessibility();
            }
            if (recyclerView.d9zDyyznnp3oaDT1Ug()) {
                wFEUpQgjHlQygqjTppWwx992.pYmKDYlAmhudp = 4;
                recyclerView.e1gEV3X9xwmHj.add(wFEUpQgjHlQygqjTppWwx992);
            } else {
                WeakHashMap weakHashMap2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void y1NaPKTl7R18DOr6e8i5(rwLNq3eKZ2vnR0XP rwlnq3ekz2vnr0xp) {
        ArrayList arrayList = (ArrayList) this.zzpBGItXfub0yWj;
        arrayList.clear();
        int size = rwlnq3ekz2vnr0xp.AFOcXGdvoTMuqwiG8tD.size();
        for (int i = 0; i < size; i++) {
            IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD = (IPwvkMKvXW4H2mJtQ4szs9vgoyzLD) rwlnq3ekz2vnr0xp.AFOcXGdvoTMuqwiG8tD.get(i);
            int[] iArr = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.e1gEV3X9xwmHj;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD);
            }
        }
        rwlnq3ekz2vnr0xp.lxWWbfAOLs4jWzd7PSIiIJ.zzpBGItXfub0yWj = true;
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(String str, qR4G0Ppspx4V2jaYTHnJ qr4g0ppspx4v2jaythnj) {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=");
        gILkjwpvkGF5oaalOyU gilkjwpvkgf5oaaloyu = rJU8vw74QW6FEAFs.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        zonOxHotd3BwAPJcwqr6I6uQNngg4.ZfQNn8hdWlEQ5cR94249PDsLR(sb, "file");
        if (str != null) {
            sb.append("; filename=");
            zonOxHotd3BwAPJcwqr6I6uQNngg4.ZfQNn8hdWlEQ5cR94249PDsLR(sb, str);
        }
        String string = sb.toString();
        yxp1I6Gr2tLDD3dH0UsMPMDr7 yxp1i6gr2tldd3dh0usmpmdr7 = new yxp1I6Gr2tLDD3dH0UsMPMDr7();
        ej6unYlOWMDF.pYmKDYlAmhudp(string, "value");
        zonOxHotd3BwAPJcwqr6I6uQNngg4.aXO0LSrt8bKV("Content-Disposition");
        zonOxHotd3BwAPJcwqr6I6uQNngg4.NSjgqmGjEzuugn2SsG1mZFP(yxp1i6gr2tldd3dh0usmpmdr7, "Content-Disposition", string);
        EUSG2RPrSQzuno7qTyOhv0Az eUSG2RPrSQzuno7qTyOhv0AzZzpBGItXfub0yWj = yxp1i6gr2tldd3dh0usmpmdr7.zzpBGItXfub0yWj();
        if (eUSG2RPrSQzuno7qTyOhv0AzZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (eUSG2RPrSQzuno7qTyOhv0AzZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) this.ZfQNn8hdWlEQ5cR94249PDsLR).add(new y7op5wlt8jKmN(eUSG2RPrSQzuno7qTyOhv0AzZzpBGItXfub0yWj, qr4g0ppspx4v2jaythnj));
    }

    @Override // com.vdodsodjsdt.qWuPVRr6hlUOfzGkjKs9
    public Object zzpBGItXfub0yWj() {
        return null;
    }

    public NrjuzzioPqfttNRptBDpZDzSYUrcM(FebcEr6HDzMxO4Tzw7bCSO57 febcEr6HDzMxO4Tzw7bCSO57) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 12;
        this.zzpBGItXfub0yWj = new androidx.lifecycle.iVKrTMqOw0TqCeNN(febcEr6HDzMxO4Tzw7bCSO57);
        this.V57tEvNfxZVVcOCAOih5PKr = new Handler();
    }

    public NrjuzzioPqfttNRptBDpZDzSYUrcM(WorkDatabase_Impl workDatabase_Impl) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        this.zzpBGItXfub0yWj = workDatabase_Impl;
        new xR0ZoYA1SdIBIre5oWm06m(workDatabase_Impl, 4);
        this.V57tEvNfxZVVcOCAOih5PKr = new FbuZzoqAiJLuQzTy(workDatabase_Impl, 2);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new FbuZzoqAiJLuQzTy(workDatabase_Impl, 3);
    }

    @Override // com.vdodsodjsdt.qWuPVRr6hlUOfzGkjKs9
    public void ZfQNn8hdWlEQ5cR94249PDsLR() {
    }

    public NrjuzzioPqfttNRptBDpZDzSYUrcM(cx2YoQOPZxuB1B0n1aU3M cx2yoqopzxub1b0n1au3m, XGVgBiBsAB8XY xGVgBiBsAB8XY, qajJDo6ciXOFr7gO1jYELQiwO qajjdo6cixofr7go1jyelqiwo) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 15;
        ej6unYlOWMDF.pYmKDYlAmhudp(cx2yoqopzxub1b0n1au3m, "store");
        ej6unYlOWMDF.pYmKDYlAmhudp(qajjdo6cixofr7go1jyelqiwo, "defaultCreationExtras");
        this.zzpBGItXfub0yWj = cx2yoqopzxub1b0n1au3m;
        this.V57tEvNfxZVVcOCAOih5PKr = xGVgBiBsAB8XY;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = qajjdo6cixofr7go1jyelqiwo;
    }

    public NrjuzzioPqfttNRptBDpZDzSYUrcM(IxShTNMvCWlbR ixShTNMvCWlbR) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 4;
        this.zzpBGItXfub0yWj = ixShTNMvCWlbR;
        this.V57tEvNfxZVVcOCAOih5PKr = new xBkpwtKksCOQS();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NrjuzzioPqfttNRptBDpZDzSYUrcM(cx2YoQOPZxuB1B0n1aU3M cx2yoqopzxub1b0n1au3m, XGVgBiBsAB8XY xGVgBiBsAB8XY) {
        this(cx2yoqopzxub1b0n1au3m, xGVgBiBsAB8XY, q0NrTGMX4C4J9WC1czCeMW9W7Dnrg.zzpBGItXfub0yWj);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 15;
        ej6unYlOWMDF.pYmKDYlAmhudp(cx2yoqopzxub1b0n1au3m, "store");
    }

    public NrjuzzioPqfttNRptBDpZDzSYUrcM(Context context, TypedArray typedArray) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 13;
        this.zzpBGItXfub0yWj = context;
        this.V57tEvNfxZVVcOCAOih5PKr = typedArray;
    }

    public NrjuzzioPqfttNRptBDpZDzSYUrcM(Runnable runnable) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 9;
        this.V57tEvNfxZVVcOCAOih5PKr = new CopyOnWriteArrayList();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new HashMap();
        this.zzpBGItXfub0yWj = runnable;
    }

    public NrjuzzioPqfttNRptBDpZDzSYUrcM(Context context, LocationManager locationManager) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 14;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new ybRhOpYXFhEPd();
        this.zzpBGItXfub0yWj = context;
        this.V57tEvNfxZVVcOCAOih5PKr = locationManager;
    }

    public NrjuzzioPqfttNRptBDpZDzSYUrcM(Context context) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = context.getApplicationContext();
        this.V57tEvNfxZVVcOCAOih5PKr = new HashSet();
        this.zzpBGItXfub0yWj = new HashMap();
    }

    public NrjuzzioPqfttNRptBDpZDzSYUrcM(rwLNq3eKZ2vnR0XP rwlnq3ekz2vnr0xp) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 2;
        this.zzpBGItXfub0yWj = new ArrayList();
        this.V57tEvNfxZVVcOCAOih5PKr = new Cmxkosub3Ql97Ws();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = rwlnq3ekz2vnr0xp;
    }

    public NrjuzzioPqfttNRptBDpZDzSYUrcM(nMRZPpfLCgJyuB nmrzppflcgjyub, FG8LIxsgYiLSfhN0jYKIKr fG8LIxsgYiLSfhN0jYKIKr, wsqHCLtouHBbS4err7j wsqhcltouhbbs4err7j, Set set) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 5;
        this.zzpBGItXfub0yWj = fG8LIxsgYiLSfhN0jYKIKr;
        this.V57tEvNfxZVVcOCAOih5PKr = nmrzppflcgjyub;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = wsqhcltouhbbs4err7j;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            pzqP2AqKW6J5PO8zCKnW(str, 0, str.length(), 1, true, new aqhhl68tQrgIjcMGB3dY2YLK3vN(str, 0));
        }
    }

    public NrjuzzioPqfttNRptBDpZDzSYUrcM(int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        switch (i) {
            case 11:
                String string = UUID.randomUUID().toString();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "toString(...)");
                oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = oA1WO3soICf8H1N6bgpG.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                this.zzpBGItXfub0yWj = IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd(string);
                this.V57tEvNfxZVVcOCAOih5PKr = rJU8vw74QW6FEAFs.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList();
                break;
        }
    }

    public NrjuzzioPqfttNRptBDpZDzSYUrcM(Matcher matcher, CharSequence charSequence) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 8;
        ej6unYlOWMDF.pYmKDYlAmhudp(charSequence, "input");
        this.zzpBGItXfub0yWj = matcher;
        this.V57tEvNfxZVVcOCAOih5PKr = new QW59YEFNB5tWX9c7WYp(this);
    }
}
