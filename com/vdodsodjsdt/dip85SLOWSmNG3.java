package com.vdodsodjsdt;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dip85SLOWSmNG3 implements ComponentCallbacks, View.OnCreateContextMenuListener, hCgEybj69le8, XL61XSHqyMdc1, zcuZ56coxbuAPrHfBRu, c6HqQbG2usib {
    public static final Object ItrQwCXbty5PZtje5JS = new Object();
    public boolean Ca81ebIan1u;
    public String CixTK5ZX8oWXHz34qHYV;
    public dip85SLOWSmNG3 GI83zq0G8e7zkn;
    public View HVEwbdULInpTNa0IG;
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public dip85SLOWSmNG3 Irh5auREsoeV1C1RaBamlmy;
    public final ZyiMPYAiYuUB4ZJmOsd04XEZd JUdwvN8LfOMa;
    public Khx5NlXjnBf0cIn8cBMdY4O4mD L8DMw02rUTs2w;
    public SparseArray LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Bundle NSjgqmGjEzuugn2SsG1mZFP;
    public ViewGroup O1xDAlBZZlZdoEf747lCFHld;
    public String RhfGHxtXxy0M0grmp2jkRjQg;
    public boolean SuB3hEmTmbbRGAhtvOOmfKEon;
    public boolean TqcnImqkSWIKht;
    public androidx.lifecycle.iVKrTMqOw0TqCeNN YdNRGRc4rly;
    public Bundle ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean d9zDyyznnp3oaDT1Ug;
    public okcUO69vEcgndIAn0R f6ZQsR6bPLvvCDNXOUc;
    public boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public Fxt4Rl0PdDlupwtv iKANjmyTSxO6v6UuLPdu7DxOjlS;
    public int jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public boolean ko09zE6UAgwkV;
    public final ArrayList lQ0rO9lhQIyVe7Rp6;
    public boolean p59rPv72J9;
    public boolean pYmKDYlAmhudp;
    public boolean pzqP2AqKW6J5PO8zCKnW;
    public int q11o1hieEkZDhF1MGOZI26oZiDT;
    public boolean q1wNbhk2O6;
    public boolean qNPQb1obP7;
    public Dqd3yw7CrPyec1dms6HVj vBGA6pPLqSMuYGvprl270j7;
    public boolean vE4yDIjexsP2lGjLaTcB;
    public int w0Wu95l8dVNw5rZMRu;
    public CsEvLVebpPqWiZ9 wRCD0SdqWCowdYU7bmzN;
    public boolean y1NaPKTl7R18DOr6e8i5;
    public Bundle zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int V57tEvNfxZVVcOCAOih5PKr = -1;
    public String ZLZeBXTMq0zDztBxtRTuCHrapQ = UUID.randomUUID().toString();
    public String M9e7PWhFYLD2lOGMker = null;
    public Boolean KUYypEB4eNWOZWVDpH = null;
    public okcUO69vEcgndIAn0R TaDO7ogis3aEiWEtq = new okcUO69vEcgndIAn0R();
    public final boolean aXO0LSrt8bKV = true;
    public boolean qygqjTppWwx992 = true;
    public Cg8BA4YSFFWr8 ymT6yQrus3w = Cg8BA4YSFFWr8.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final androidx.lifecycle.coyP1hCgJ7zr56eqQoO7H04E gBaBUmihn5l4u = new androidx.lifecycle.coyP1hCgJ7zr56eqQoO7H04E();

    public dip85SLOWSmNG3() {
        new AtomicInteger();
        this.lQ0rO9lhQIyVe7Rp6 = new ArrayList();
        this.JUdwvN8LfOMa = new ZyiMPYAiYuUB4ZJmOsd04XEZd(this);
        HzCpKshMOoaw76hFcbOVRYMeRd();
    }

    public void Ca81ebIan1u() {
        this.vE4yDIjexsP2lGjLaTcB = true;
    }

    public final int GI83zq0G8e7zkn() {
        Cg8BA4YSFFWr8 cg8BA4YSFFWr8 = this.ymT6yQrus3w;
        return (cg8BA4YSFFWr8 == Cg8BA4YSFFWr8.ZfQNn8hdWlEQ5cR94249PDsLR || this.Irh5auREsoeV1C1RaBamlmy == null) ? cg8BA4YSFFWr8.ordinal() : Math.min(cg8BA4YSFFWr8.ordinal(), this.Irh5auREsoeV1C1RaBamlmy.GI83zq0G8e7zkn());
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd() {
        this.YdNRGRc4rly = new androidx.lifecycle.iVKrTMqOw0TqCeNN(this);
        this.L8DMw02rUTs2w = new Khx5NlXjnBf0cIn8cBMdY4O4mD(this);
        ArrayList arrayList = this.lQ0rO9lhQIyVe7Rp6;
        ZyiMPYAiYuUB4ZJmOsd04XEZd zyiMPYAiYuUB4ZJmOsd04XEZd = this.JUdwvN8LfOMa;
        if (arrayList.contains(zyiMPYAiYuUB4ZJmOsd04XEZd)) {
            return;
        }
        if (this.V57tEvNfxZVVcOCAOih5PKr < 0) {
            arrayList.add(zyiMPYAiYuUB4ZJmOsd04XEZd);
            return;
        }
        dip85SLOWSmNG3 dip85slowsmng3 = zyiMPYAiYuUB4ZJmOsd04XEZd.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        dip85slowsmng3.L8DMw02rUTs2w.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        ej6unYlOWMDF.Irh5auREsoeV1C1RaBamlmy(dip85slowsmng3);
    }

    public abstract void Irh5auREsoeV1C1RaBamlmy(Bundle bundle);

    public final void KUYypEB4eNWOZWVDpH() {
        HzCpKshMOoaw76hFcbOVRYMeRd();
        this.CixTK5ZX8oWXHz34qHYV = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = UUID.randomUUID().toString();
        this.q1wNbhk2O6 = false;
        this.p59rPv72J9 = false;
        this.Ca81ebIan1u = false;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = false;
        this.pYmKDYlAmhudp = false;
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = 0;
        this.f6ZQsR6bPLvvCDNXOUc = null;
        this.TaDO7ogis3aEiWEtq = new okcUO69vEcgndIAn0R();
        this.vBGA6pPLqSMuYGvprl270j7 = null;
        this.q11o1hieEkZDhF1MGOZI26oZiDT = 0;
        this.w0Wu95l8dVNw5rZMRu = 0;
        this.RhfGHxtXxy0M0grmp2jkRjQg = null;
        this.qNPQb1obP7 = false;
        this.SuB3hEmTmbbRGAhtvOOmfKEon = false;
    }

    @Override // com.vdodsodjsdt.hCgEybj69le8
    public final androidx.lifecycle.iVKrTMqOw0TqCeNN LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.YdNRGRc4rly;
    }

    public final okcUO69vEcgndIAn0R M9e7PWhFYLD2lOGMker() {
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = this.f6ZQsR6bPLvvCDNXOUc;
        if (okcuo69vecgndian0r != null) {
            return okcuo69vecgndian0r;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Context NSjgqmGjEzuugn2SsG1mZFP() {
        Dqd3yw7CrPyec1dms6HVj dqd3yw7CrPyec1dms6HVj = this.vBGA6pPLqSMuYGvprl270j7;
        if (dqd3yw7CrPyec1dms6HVj == null) {
            return null;
        }
        return dqd3yw7CrPyec1dms6HVj.q1wNbhk2O6;
    }

    public void RhfGHxtXxy0M0grmp2jkRjQg(Bundle bundle) {
        this.vE4yDIjexsP2lGjLaTcB = true;
    }

    public final Context SuB3hEmTmbbRGAhtvOOmfKEon() {
        Context contextNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP();
        if (contextNSjgqmGjEzuugn2SsG1mZFP != null) {
            return contextNSjgqmGjEzuugn2SsG1mZFP;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public LayoutInflater TaDO7ogis3aEiWEtq(Bundle bundle) {
        Dqd3yw7CrPyec1dms6HVj dqd3yw7CrPyec1dms6HVj = this.vBGA6pPLqSMuYGvprl270j7;
        if (dqd3yw7CrPyec1dms6HVj == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo = dqd3yw7CrPyec1dms6HVj.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        LayoutInflater layoutInflaterCloneInContext = zf8a67a5zo524dlugofxsfo.getLayoutInflater().cloneInContext(zf8a67a5zo524dlugofxsfo);
        layoutInflaterCloneInContext.setFactory2(this.TaDO7ogis3aEiWEtq.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        return layoutInflaterCloneInContext;
    }

    @Override // com.vdodsodjsdt.zcuZ56coxbuAPrHfBRu
    public final V9VO2k88X42B V57tEvNfxZVVcOCAOih5PKr() {
        Application application;
        Context applicationContext = SuB3hEmTmbbRGAhtvOOmfKEon().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + SuB3hEmTmbbRGAhtvOOmfKEon().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        V9VO2k88X42B v9VO2k88X42B = new V9VO2k88X42B(0);
        LinkedHashMap linkedHashMap = v9VO2k88X42B.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (application != null) {
            linkedHashMap.put(IN79WcIk5xB4t0GjRT43qPLs5.jW7EiD0YL6xkbB158jMUzhWNWb1y, application);
        }
        linkedHashMap.put(ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP, this);
        linkedHashMap.put(ej6unYlOWMDF.GI83zq0G8e7zkn, this);
        Bundle bundle = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (bundle != null) {
            linkedHashMap.put(ej6unYlOWMDF.M9e7PWhFYLD2lOGMker, bundle);
        }
        return v9VO2k88X42B;
    }

    @Override // com.vdodsodjsdt.c6HqQbG2usib
    public final ALnH3AptNOGA7UbXGxOl2SnVeZ VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return (ALnH3AptNOGA7UbXGxOl2SnVeZ) this.L8DMw02rUTs2w.V57tEvNfxZVVcOCAOih5PKr;
    }

    public final okcUO69vEcgndIAn0R ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        if (this.vBGA6pPLqSMuYGvprl270j7 != null) {
            return this.TaDO7ogis3aEiWEtq;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Override // com.vdodsodjsdt.XL61XSHqyMdc1
    public final cx2YoQOPZxuB1B0n1aU3M ZfQNn8hdWlEQ5cR94249PDsLR() {
        if (this.f6ZQsR6bPLvvCDNXOUc == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (GI83zq0G8e7zkn() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f6ZQsR6bPLvvCDNXOUc.d9zDyyznnp3oaDT1Ug.LaeGQIruHQu81hfJldjMOQSVblH3x;
        cx2YoQOPZxuB1B0n1aU3M cx2yoqopzxub1b0n1au3m = (cx2YoQOPZxuB1B0n1aU3M) map.get(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        if (cx2yoqopzxub1b0n1au3m != null) {
            return cx2yoqopzxub1b0n1au3m;
        }
        cx2YoQOPZxuB1B0n1aU3M cx2yoqopzxub1b0n1au3m2 = new cx2YoQOPZxuB1B0n1aU3M();
        map.put(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, cx2yoqopzxub1b0n1au3m2);
        return cx2yoqopzxub1b0n1au3m2;
    }

    public final void aXO0LSrt8bKV(int i, int i2, int i3, int i4) {
        if (this.iKANjmyTSxO6v6UuLPdu7DxOjlS == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        zIvmSL0wzmmKGc3X39b2Gw2mUGE().zzpBGItXfub0yWj = i;
        zIvmSL0wzmmKGc3X39b2Gw2mUGE().V57tEvNfxZVVcOCAOih5PKr = i2;
        zIvmSL0wzmmKGc3X39b2Gw2mUGE().ZfQNn8hdWlEQ5cR94249PDsLR = i3;
        zIvmSL0wzmmKGc3X39b2Gw2mUGE().LaeGQIruHQu81hfJldjMOQSVblH3x = i4;
    }

    public void f6ZQsR6bPLvvCDNXOUc() {
        this.vE4yDIjexsP2lGjLaTcB = true;
    }

    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int i, int i2, Intent intent) {
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public View jW7EiD0YL6xkbB158jMUzhWNWb1y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void ko09zE6UAgwkV(Bundle bundle) {
        Parcelable parcelable;
        this.vE4yDIjexsP2lGjLaTcB = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.TaDO7ogis3aEiWEtq.L8DMw02rUTs2w(parcelable);
            okcUO69vEcgndIAn0R okcuo69vecgndian0r = this.TaDO7ogis3aEiWEtq;
            okcuo69vecgndian0r.vE4yDIjexsP2lGjLaTcB = false;
            okcuo69vecgndian0r.O1xDAlBZZlZdoEf747lCFHld = false;
            okcuo69vecgndian0r.d9zDyyznnp3oaDT1Ug.NSjgqmGjEzuugn2SsG1mZFP = false;
            okcuo69vecgndian0r.vBGA6pPLqSMuYGvprl270j7(1);
        }
        okcUO69vEcgndIAn0R okcuo69vecgndian0r2 = this.TaDO7ogis3aEiWEtq;
        if (okcuo69vecgndian0r2.jW7EiD0YL6xkbB158jMUzhWNWb1y >= 1) {
            return;
        }
        okcuo69vecgndian0r2.vE4yDIjexsP2lGjLaTcB = false;
        okcuo69vecgndian0r2.O1xDAlBZZlZdoEf747lCFHld = false;
        okcuo69vecgndian0r2.d9zDyyznnp3oaDT1Ug.NSjgqmGjEzuugn2SsG1mZFP = false;
        okcuo69vecgndian0r2.vBGA6pPLqSMuYGvprl270j7(1);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.vE4yDIjexsP2lGjLaTcB = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Dqd3yw7CrPyec1dms6HVj dqd3yw7CrPyec1dms6HVj = this.vBGA6pPLqSMuYGvprl270j7;
        zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo = dqd3yw7CrPyec1dms6HVj == null ? null : dqd3yw7CrPyec1dms6HVj.KUYypEB4eNWOZWVDpH;
        if (zf8a67a5zo524dlugofxsfo != null) {
            zf8a67a5zo524dlugofxsfo.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.vE4yDIjexsP2lGjLaTcB = true;
    }

    public final boolean p59rPv72J9() {
        return this.jW7EiD0YL6xkbB158jMUzhWNWb1y > 0;
    }

    public void pYmKDYlAmhudp(Context context) {
        this.vE4yDIjexsP2lGjLaTcB = true;
        Dqd3yw7CrPyec1dms6HVj dqd3yw7CrPyec1dms6HVj = this.vBGA6pPLqSMuYGvprl270j7;
        if ((dqd3yw7CrPyec1dms6HVj == null ? null : dqd3yw7CrPyec1dms6HVj.KUYypEB4eNWOZWVDpH) != null) {
            this.vE4yDIjexsP2lGjLaTcB = true;
        }
    }

    public final View pzqP2AqKW6J5PO8zCKnW() {
        View view = this.HVEwbdULInpTNa0IG;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void q11o1hieEkZDhF1MGOZI26oZiDT() {
        this.vE4yDIjexsP2lGjLaTcB = true;
    }

    public final boolean q1wNbhk2O6() {
        if (this.qNPQb1obP7) {
            return true;
        }
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = this.f6ZQsR6bPLvvCDNXOUc;
        if (okcuo69vecgndian0r != null) {
            dip85SLOWSmNG3 dip85slowsmng3 = this.Irh5auREsoeV1C1RaBamlmy;
            okcuo69vecgndian0r.getClass();
            if (dip85slowsmng3 == null ? false : dip85slowsmng3.q1wNbhk2O6()) {
                return true;
            }
        }
        return false;
    }

    public void qNPQb1obP7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.TaDO7ogis3aEiWEtq.d9zDyyznnp3oaDT1Ug();
        this.ko09zE6UAgwkV = true;
        this.wRCD0SdqWCowdYU7bmzN = new CsEvLVebpPqWiZ9(this, ZfQNn8hdWlEQ5cR94249PDsLR());
        View viewJW7EiD0YL6xkbB158jMUzhWNWb1y = jW7EiD0YL6xkbB158jMUzhWNWb1y(layoutInflater, viewGroup);
        this.HVEwbdULInpTNa0IG = viewJW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (viewJW7EiD0YL6xkbB158jMUzhWNWb1y == null) {
            if (this.wRCD0SdqWCowdYU7bmzN.LaeGQIruHQu81hfJldjMOQSVblH3x != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.wRCD0SdqWCowdYU7bmzN = null;
            return;
        }
        this.wRCD0SdqWCowdYU7bmzN.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        View view = this.HVEwbdULInpTNa0IG;
        CsEvLVebpPqWiZ9 csEvLVebpPqWiZ9 = this.wRCD0SdqWCowdYU7bmzN;
        ej6unYlOWMDF.pYmKDYlAmhudp(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, csEvLVebpPqWiZ9);
        View view2 = this.HVEwbdULInpTNa0IG;
        CsEvLVebpPqWiZ9 csEvLVebpPqWiZ92 = this.wRCD0SdqWCowdYU7bmzN;
        ej6unYlOWMDF.pYmKDYlAmhudp(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, csEvLVebpPqWiZ92);
        View view3 = this.HVEwbdULInpTNa0IG;
        CsEvLVebpPqWiZ9 csEvLVebpPqWiZ93 = this.wRCD0SdqWCowdYU7bmzN;
        ej6unYlOWMDF.pYmKDYlAmhudp(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, csEvLVebpPqWiZ93);
        this.gBaBUmihn5l4u.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this.wRCD0SdqWCowdYU7bmzN);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        if (this.q11o1hieEkZDhF1MGOZI26oZiDT != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.q11o1hieEkZDhF1MGOZI26oZiDT));
        }
        if (this.RhfGHxtXxy0M0grmp2jkRjQg != null) {
            sb.append(" tag=");
            sb.append(this.RhfGHxtXxy0M0grmp2jkRjQg);
        }
        sb.append(")");
        return sb.toString();
    }

    public void vBGA6pPLqSMuYGvprl270j7() {
        this.vE4yDIjexsP2lGjLaTcB = true;
    }

    public final void vE4yDIjexsP2lGjLaTcB(Bundle bundle) {
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = this.f6ZQsR6bPLvvCDNXOUc;
        if (okcuo69vecgndian0r != null && (okcuo69vecgndian0r.vE4yDIjexsP2lGjLaTcB || okcuo69vecgndian0r.O1xDAlBZZlZdoEf747lCFHld)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = bundle;
    }

    public void w0Wu95l8dVNw5rZMRu() {
        this.vE4yDIjexsP2lGjLaTcB = true;
    }

    public final Fxt4Rl0PdDlupwtv zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        if (this.iKANjmyTSxO6v6UuLPdu7DxOjlS == null) {
            Fxt4Rl0PdDlupwtv fxt4Rl0PdDlupwtv = new Fxt4Rl0PdDlupwtv();
            Object obj = ItrQwCXbty5PZtje5JS;
            fxt4Rl0PdDlupwtv.ZLZeBXTMq0zDztBxtRTuCHrapQ = obj;
            fxt4Rl0PdDlupwtv.NSjgqmGjEzuugn2SsG1mZFP = obj;
            fxt4Rl0PdDlupwtv.GI83zq0G8e7zkn = obj;
            fxt4Rl0PdDlupwtv.M9e7PWhFYLD2lOGMker = 1.0f;
            fxt4Rl0PdDlupwtv.HzCpKshMOoaw76hFcbOVRYMeRd = null;
            this.iKANjmyTSxO6v6UuLPdu7DxOjlS = fxt4Rl0PdDlupwtv;
        }
        return this.iKANjmyTSxO6v6UuLPdu7DxOjlS;
    }

    public ej6unYlOWMDF zzpBGItXfub0yWj() {
        return new uh2oy4CFwMxi4Tr3MBYYO0E(this);
    }
}
