package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class KqnFW0ungDb7eL8QE implements LayoutInflater.Factory2 {
    public final okcUO69vEcgndIAn0R V57tEvNfxZVVcOCAOih5PKr;

    public KqnFW0ungDb7eL8QE(okcUO69vEcgndIAn0R okcuo69vecgndian0r) {
        this.V57tEvNfxZVVcOCAOih5PKr = okcuo69vecgndian0r;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        dip85SLOWSmNG3 dip85slowsmng3;
        androidx.fragment.app.iVKrTMqOw0TqCeNN ivkrtmqow0tqcennZIvmSL0wzmmKGc3X39b2Gw2mUGE;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, okcuo69vecgndian0r);
        }
        dip85SLOWSmNG3 dip85slowsmng32 = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cNIeQoFtkP719MDlq5ja8Wvt.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = dip85SLOWSmNG3.class.isAssignableFrom(jdmWSds1UynWLk6T3nA00aPzo4XP.zzpBGItXfub0yWj(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    dip85SLOWSmNG3 dip85slowsmng3QNPQb1obP7 = resourceId != -1 ? okcuo69vecgndian0r.qNPQb1obP7(resourceId) : null;
                    if (dip85slowsmng3QNPQb1obP7 == null && string != null) {
                        nMRZPpfLCgJyuB nmrzppflcgjyub = okcuo69vecgndian0r.V57tEvNfxZVVcOCAOih5PKr;
                        ArrayList arrayList = (ArrayList) nmrzppflcgjyub.V57tEvNfxZVVcOCAOih5PKr;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                dip85slowsmng3 = dip85slowsmng32;
                                Iterator it = ((HashMap) nmrzppflcgjyub.ZfQNn8hdWlEQ5cR94249PDsLR).values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        dip85slowsmng3QNPQb1obP7 = dip85slowsmng3;
                                        break;
                                    }
                                    androidx.fragment.app.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = (androidx.fragment.app.iVKrTMqOw0TqCeNN) it.next();
                                    if (ivkrtmqow0tqcenn != null) {
                                        dip85slowsmng3QNPQb1obP7 = ivkrtmqow0tqcenn.V57tEvNfxZVVcOCAOih5PKr;
                                        if (string.equals(dip85slowsmng3QNPQb1obP7.RhfGHxtXxy0M0grmp2jkRjQg)) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                dip85SLOWSmNG3 dip85slowsmng33 = (dip85SLOWSmNG3) arrayList.get(size);
                                dip85slowsmng3 = dip85slowsmng32;
                                if (dip85slowsmng33 != null && string.equals(dip85slowsmng33.RhfGHxtXxy0M0grmp2jkRjQg)) {
                                    dip85slowsmng3QNPQb1obP7 = dip85slowsmng33;
                                    break;
                                }
                                size--;
                                dip85slowsmng32 = dip85slowsmng3;
                            }
                        }
                    } else {
                        dip85slowsmng3 = null;
                    }
                    if (dip85slowsmng3QNPQb1obP7 == null && id != -1) {
                        dip85slowsmng3QNPQb1obP7 = okcuo69vecgndian0r.qNPQb1obP7(id);
                    }
                    if (dip85slowsmng3QNPQb1obP7 == null) {
                        jdmWSds1UynWLk6T3nA00aPzo4XP jdmwsds1uynwlk6t3na00apzo4xpPzqP2AqKW6J5PO8zCKnW = okcuo69vecgndian0r.pzqP2AqKW6J5PO8zCKnW();
                        context.getClassLoader();
                        dip85slowsmng3QNPQb1obP7 = jdmwsds1uynwlk6t3na00apzo4xpPzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m(attributeValue);
                        dip85slowsmng3QNPQb1obP7.Ca81ebIan1u = true;
                        dip85slowsmng3QNPQb1obP7.q11o1hieEkZDhF1MGOZI26oZiDT = resourceId != 0 ? resourceId : id;
                        dip85slowsmng3QNPQb1obP7.w0Wu95l8dVNw5rZMRu = id;
                        dip85slowsmng3QNPQb1obP7.RhfGHxtXxy0M0grmp2jkRjQg = string;
                        dip85slowsmng3QNPQb1obP7.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = true;
                        dip85slowsmng3QNPQb1obP7.f6ZQsR6bPLvvCDNXOUc = okcuo69vecgndian0r;
                        Dqd3yw7CrPyec1dms6HVj dqd3yw7CrPyec1dms6HVj = okcuo69vecgndian0r.f6ZQsR6bPLvvCDNXOUc;
                        dip85slowsmng3QNPQb1obP7.vBGA6pPLqSMuYGvprl270j7 = dqd3yw7CrPyec1dms6HVj;
                        zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo = dqd3yw7CrPyec1dms6HVj.q1wNbhk2O6;
                        dip85slowsmng3QNPQb1obP7.vE4yDIjexsP2lGjLaTcB = true;
                        if ((dqd3yw7CrPyec1dms6HVj == null ? dip85slowsmng3 : dqd3yw7CrPyec1dms6HVj.KUYypEB4eNWOZWVDpH) != null) {
                            dip85slowsmng3QNPQb1obP7.vE4yDIjexsP2lGjLaTcB = true;
                        }
                        ivkrtmqow0tqcennZIvmSL0wzmmKGc3X39b2Gw2mUGE = okcuo69vecgndian0r.VxUQ9tBhpHJ2AAEDNW8sghc4m(dip85slowsmng3QNPQb1obP7);
                        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                            Log.v("FragmentManager", "Fragment " + dip85slowsmng3QNPQb1obP7 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (dip85slowsmng3QNPQb1obP7.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        dip85slowsmng3QNPQb1obP7.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = true;
                        dip85slowsmng3QNPQb1obP7.f6ZQsR6bPLvvCDNXOUc = okcuo69vecgndian0r;
                        Dqd3yw7CrPyec1dms6HVj dqd3yw7CrPyec1dms6HVj2 = okcuo69vecgndian0r.f6ZQsR6bPLvvCDNXOUc;
                        dip85slowsmng3QNPQb1obP7.vBGA6pPLqSMuYGvprl270j7 = dqd3yw7CrPyec1dms6HVj2;
                        zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo2 = dqd3yw7CrPyec1dms6HVj2.q1wNbhk2O6;
                        dip85slowsmng3QNPQb1obP7.vE4yDIjexsP2lGjLaTcB = true;
                        if ((dqd3yw7CrPyec1dms6HVj2 == null ? dip85slowsmng3 : dqd3yw7CrPyec1dms6HVj2.KUYypEB4eNWOZWVDpH) != null) {
                            dip85slowsmng3QNPQb1obP7.vE4yDIjexsP2lGjLaTcB = true;
                        }
                        ivkrtmqow0tqcennZIvmSL0wzmmKGc3X39b2Gw2mUGE = okcuo69vecgndian0r.zIvmSL0wzmmKGc3X39b2Gw2mUGE(dip85slowsmng3QNPQb1obP7);
                        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + dip85slowsmng3QNPQb1obP7 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    HBxHyNvfiHwkdcXsyY hBxHyNvfiHwkdcXsyY = K4LDBTJwLOCiiDq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    K4LDBTJwLOCiiDq.zzpBGItXfub0yWj(new A9YWKj9U1PEADap9aqV(dip85slowsmng3QNPQb1obP7, "Attempting to use <fragment> tag to add fragment " + dip85slowsmng3QNPQb1obP7 + " to container " + viewGroup));
                    K4LDBTJwLOCiiDq.VxUQ9tBhpHJ2AAEDNW8sghc4m(dip85slowsmng3QNPQb1obP7).getClass();
                    dip85slowsmng3QNPQb1obP7.O1xDAlBZZlZdoEf747lCFHld = viewGroup;
                    ivkrtmqow0tqcennZIvmSL0wzmmKGc3X39b2Gw2mUGE.HzCpKshMOoaw76hFcbOVRYMeRd();
                    ivkrtmqow0tqcennZIvmSL0wzmmKGc3X39b2Gw2mUGE.M9e7PWhFYLD2lOGMker();
                    View view2 = dip85slowsmng3QNPQb1obP7.HVEwbdULInpTNa0IG;
                    if (view2 == null) {
                        throw new IllegalStateException(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (dip85slowsmng3QNPQb1obP7.HVEwbdULInpTNa0IG.getTag() == null) {
                        dip85slowsmng3QNPQb1obP7.HVEwbdULInpTNa0IG.setTag(string);
                    }
                    dip85slowsmng3QNPQb1obP7.HVEwbdULInpTNa0IG.addOnAttachStateChangeListener(new XqiRGvLlkRVjjZpde1Zp(this, ivkrtmqow0tqcennZIvmSL0wzmmKGc3X39b2Gw2mUGE));
                    return dip85slowsmng3QNPQb1obP7.HVEwbdULInpTNa0IG;
                }
            }
        }
        return null;
    }
}
