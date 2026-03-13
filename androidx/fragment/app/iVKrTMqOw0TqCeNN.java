package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vdodsodjsdt.A9YWKj9U1PEADap9aqV;
import com.vdodsodjsdt.Cg8BA4YSFFWr8;
import com.vdodsodjsdt.Dqd3yw7CrPyec1dms6HVj;
import com.vdodsodjsdt.HBxHyNvfiHwkdcXsyY;
import com.vdodsodjsdt.K4LDBTJwLOCiiDq;
import com.vdodsodjsdt.LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm;
import com.vdodsodjsdt.NrjuzzioPqfttNRptBDpZDzSYUrcM;
import com.vdodsodjsdt.QlGb8EPtaoCCLt3z12;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.RD86Fssz0iKbf0t61L;
import com.vdodsodjsdt.RsM2tiFklbbxTcN;
import com.vdodsodjsdt.UFStPSj5DrcqcfR2RymfmG;
import com.vdodsodjsdt.W3ZqXaAE9m3wS;
import com.vdodsodjsdt.XOTOHmUA5NYhlyOBh7;
import com.vdodsodjsdt.ZyiMPYAiYuUB4ZJmOsd04XEZd;
import com.vdodsodjsdt.dip85SLOWSmNG3;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.g8kevnL6UKpr15IYtcPJXuLo1L4;
import com.vdodsodjsdt.gElQ3Q9ZHXy5F6j;
import com.vdodsodjsdt.hCgEybj69le8;
import com.vdodsodjsdt.iFKXVhXhX8FyZGUEP1rAer7;
import com.vdodsodjsdt.irdDsom9QAllWlNFwJgRUGIJ;
import com.vdodsodjsdt.jdmWSds1UynWLk6T3nA00aPzo4XP;
import com.vdodsodjsdt.nMRZPpfLCgJyuB;
import com.vdodsodjsdt.o0x3OWMw3He;
import com.vdodsodjsdt.okcUO69vEcgndIAn0R;
import com.vdodsodjsdt.rKxIESZHGMtLLUBIOcPgVA5go9R;
import com.vdodsodjsdt.u9SlVAuoWhQUfJ;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import com.vdodsodjsdt.z4fU9Yfox9E2RCcjwcP384m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class iVKrTMqOw0TqCeNN {
    public final dip85SLOWSmNG3 V57tEvNfxZVVcOCAOih5PKr;
    public final o0x3OWMw3He VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final nMRZPpfLCgJyuB zzpBGItXfub0yWj;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR = false;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x = -1;

    public iVKrTMqOw0TqCeNN(o0x3OWMw3He o0x3owmw3he, nMRZPpfLCgJyuB nmrzppflcgjyub, dip85SLOWSmNG3 dip85slowsmng3) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = o0x3owmw3he;
        this.zzpBGItXfub0yWj = nmrzppflcgjyub;
        this.V57tEvNfxZVVcOCAOih5PKr = dip85slowsmng3;
    }

    public final void Ca81ebIan1u() {
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (dip85slowsmng3.HVEwbdULInpTNa0IG == null) {
            return;
        }
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + dip85slowsmng3 + " with view " + dip85slowsmng3.HVEwbdULInpTNa0IG);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        dip85slowsmng3.HVEwbdULInpTNa0IG.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            dip85slowsmng3.LaeGQIruHQu81hfJldjMOQSVblH3x = sparseArray;
        }
        Bundle bundle = new Bundle();
        dip85slowsmng3.wRCD0SdqWCowdYU7bmzN.zIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        dip85slowsmng3.zIvmSL0wzmmKGc3X39b2Gw2mUGE = bundle;
    }

    public final void GI83zq0G8e7zkn() {
        boolean zO1xDAlBZZlZdoEf747lCFHld = okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3);
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zO1xDAlBZZlZdoEf747lCFHld) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + dip85slowsmng3);
        }
        dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = -1;
        dip85slowsmng3.vE4yDIjexsP2lGjLaTcB = false;
        dip85slowsmng3.vBGA6pPLqSMuYGvprl270j7();
        if (!dip85slowsmng3.vE4yDIjexsP2lGjLaTcB) {
            throw new irdDsom9QAllWlNFwJgRUGIJ("Fragment " + dip85slowsmng3 + " did not call through to super.onDetach()");
        }
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = dip85slowsmng3.TaDO7ogis3aEiWEtq;
        if (!okcuo69vecgndian0r.HVEwbdULInpTNa0IG) {
            okcuo69vecgndian0r.KUYypEB4eNWOZWVDpH();
            dip85slowsmng3.TaDO7ogis3aEiWEtq = new okcUO69vEcgndIAn0R();
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(false);
        dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = -1;
        dip85slowsmng3.vBGA6pPLqSMuYGvprl270j7 = null;
        dip85slowsmng3.Irh5auREsoeV1C1RaBamlmy = null;
        dip85slowsmng3.f6ZQsR6bPLvvCDNXOUc = null;
        if (!dip85slowsmng3.p59rPv72J9 || dip85slowsmng3.p59rPv72J9()) {
            LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm = (LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm) this.zzpBGItXfub0yWj.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (!((lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm.V57tEvNfxZVVcOCAOih5PKr.containsKey(dip85slowsmng3.ZLZeBXTMq0zDztBxtRTuCHrapQ) && lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm.zIvmSL0wzmmKGc3X39b2Gw2mUGE) ? lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm.ZLZeBXTMq0zDztBxtRTuCHrapQ : true)) {
                return;
            }
        }
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + dip85slowsmng3);
        }
        dip85slowsmng3.KUYypEB4eNWOZWVDpH();
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        nMRZPpfLCgJyuB nmrzppflcgjyub = this.zzpBGItXfub0yWj;
        boolean z = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (z) {
            if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + dip85slowsmng3);
                return;
            }
            return;
        }
        try {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = true;
            boolean z2 = false;
            while (true) {
                int iZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR();
                int i = dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr;
                if (iZfQNn8hdWlEQ5cR94249PDsLR == i) {
                    if (!z2 && i == -1 && dip85slowsmng3.p59rPv72J9 && !dip85slowsmng3.p59rPv72J9()) {
                        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + dip85slowsmng3);
                        }
                        ((LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm) nmrzppflcgjyub.zIvmSL0wzmmKGc3X39b2Gw2mUGE).V57tEvNfxZVVcOCAOih5PKr(dip85slowsmng3);
                        nmrzppflcgjyub.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(this);
                        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + dip85slowsmng3);
                        }
                        dip85slowsmng3.KUYypEB4eNWOZWVDpH();
                    }
                    if (dip85slowsmng3.TqcnImqkSWIKht) {
                        if (dip85slowsmng3.HVEwbdULInpTNa0IG != null && (viewGroup = dip85slowsmng3.O1xDAlBZZlZdoEf747lCFHld) != null) {
                            iFKXVhXhX8FyZGUEP1rAer7 ifkxvhxhx8fyzguep1raer7ZIvmSL0wzmmKGc3X39b2Gw2mUGE = iFKXVhXhX8FyZGUEP1rAer7.zIvmSL0wzmmKGc3X39b2Gw2mUGE(viewGroup, dip85slowsmng3.M9e7PWhFYLD2lOGMker().aXO0LSrt8bKV());
                            if (dip85slowsmng3.qNPQb1obP7) {
                                if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + dip85slowsmng3);
                                }
                                ifkxvhxhx8fyzguep1raer7ZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m(3, 1, this);
                            } else {
                                if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + dip85slowsmng3);
                                }
                                ifkxvhxhx8fyzguep1raer7ZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m(2, 1, this);
                            }
                        }
                        okcUO69vEcgndIAn0R okcuo69vecgndian0r = dip85slowsmng3.f6ZQsR6bPLvvCDNXOUc;
                        if (okcuo69vecgndian0r != null && dip85slowsmng3.q1wNbhk2O6 && okcUO69vEcgndIAn0R.HVEwbdULInpTNa0IG(dip85slowsmng3)) {
                            okcuo69vecgndian0r.aXO0LSrt8bKV = true;
                        }
                        dip85slowsmng3.TqcnImqkSWIKht = false;
                        dip85slowsmng3.TaDO7ogis3aEiWEtq.Ca81ebIan1u();
                    }
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
                    return;
                }
                if (iZfQNn8hdWlEQ5cR94249PDsLR <= i) {
                    switch (i - 1) {
                        case -1:
                            GI83zq0G8e7zkn();
                            break;
                        case 0:
                            ZLZeBXTMq0zDztBxtRTuCHrapQ();
                            break;
                        case 1:
                            NSjgqmGjEzuugn2SsG1mZFP();
                            dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 1;
                            break;
                        case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                            dip85slowsmng3.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = false;
                            dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 2;
                            break;
                        case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                            if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + dip85slowsmng3);
                            }
                            if (dip85slowsmng3.HVEwbdULInpTNa0IG != null && dip85slowsmng3.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
                                Ca81ebIan1u();
                            }
                            if (dip85slowsmng3.HVEwbdULInpTNa0IG != null && (viewGroup2 = dip85slowsmng3.O1xDAlBZZlZdoEf747lCFHld) != null) {
                                iFKXVhXhX8FyZGUEP1rAer7 ifkxvhxhx8fyzguep1raer7ZIvmSL0wzmmKGc3X39b2Gw2mUGE2 = iFKXVhXhX8FyZGUEP1rAer7.zIvmSL0wzmmKGc3X39b2Gw2mUGE(viewGroup2, dip85slowsmng3.M9e7PWhFYLD2lOGMker().aXO0LSrt8bKV());
                                if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + dip85slowsmng3);
                                }
                                ifkxvhxhx8fyzguep1raer7ZIvmSL0wzmmKGc3X39b2Gw2mUGE2.VxUQ9tBhpHJ2AAEDNW8sghc4m(1, 3, this);
                            }
                            dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 3;
                            break;
                        case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                            pYmKDYlAmhudp();
                            break;
                        case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                            dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 5;
                            break;
                        case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                            KUYypEB4eNWOZWVDpH();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            V57tEvNfxZVVcOCAOih5PKr();
                            break;
                        case 1:
                            LaeGQIruHQu81hfJldjMOQSVblH3x();
                            break;
                        case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                            M9e7PWhFYLD2lOGMker();
                            zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                            break;
                        case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                            VxUQ9tBhpHJ2AAEDNW8sghc4m();
                            break;
                        case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                            if (dip85slowsmng3.HVEwbdULInpTNa0IG != null && (viewGroup3 = dip85slowsmng3.O1xDAlBZZlZdoEf747lCFHld) != null) {
                                iFKXVhXhX8FyZGUEP1rAer7 ifkxvhxhx8fyzguep1raer7ZIvmSL0wzmmKGc3X39b2Gw2mUGE3 = iFKXVhXhX8FyZGUEP1rAer7.zIvmSL0wzmmKGc3X39b2Gw2mUGE(viewGroup3, dip85slowsmng3.M9e7PWhFYLD2lOGMker().aXO0LSrt8bKV());
                                int iZzpBGItXfub0yWj = u9SlVAuoWhQUfJ.zzpBGItXfub0yWj(dip85slowsmng3.HVEwbdULInpTNa0IG.getVisibility());
                                if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + dip85slowsmng3);
                                }
                                ifkxvhxhx8fyzguep1raer7ZIvmSL0wzmmKGc3X39b2Gw2mUGE3.VxUQ9tBhpHJ2AAEDNW8sghc4m(iZzpBGItXfub0yWj, 2, this);
                            }
                            dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 4;
                            break;
                        case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                            h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
                            break;
                        case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                            dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 6;
                            break;
                        case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                            p59rPv72J9();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
            throw th;
        }
    }

    public final void KUYypEB4eNWOZWVDpH() {
        boolean zO1xDAlBZZlZdoEf747lCFHld = okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3);
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zO1xDAlBZZlZdoEf747lCFHld) {
            Log.d("FragmentManager", "movefrom RESUMED: " + dip85slowsmng3);
        }
        dip85slowsmng3.TaDO7ogis3aEiWEtq.vBGA6pPLqSMuYGvprl270j7(5);
        if (dip85slowsmng3.HVEwbdULInpTNa0IG != null) {
            dip85slowsmng3.wRCD0SdqWCowdYU7bmzN.zzpBGItXfub0yWj(XOTOHmUA5NYhlyOBh7.ON_PAUSE);
        }
        dip85slowsmng3.YdNRGRc4rly.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_PAUSE);
        dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 6;
        dip85slowsmng3.vE4yDIjexsP2lGjLaTcB = true;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZLZeBXTMq0zDztBxtRTuCHrapQ(false);
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        Parcelable parcelable;
        boolean zO1xDAlBZZlZdoEf747lCFHld = okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3);
        final dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zO1xDAlBZZlZdoEf747lCFHld) {
            Log.d("FragmentManager", "moveto CREATED: " + dip85slowsmng3);
        }
        if (dip85slowsmng3.d9zDyyznnp3oaDT1Ug) {
            Bundle bundle = dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                dip85slowsmng3.TaDO7ogis3aEiWEtq.L8DMw02rUTs2w(parcelable);
                okcUO69vEcgndIAn0R okcuo69vecgndian0r = dip85slowsmng3.TaDO7ogis3aEiWEtq;
                okcuo69vecgndian0r.vE4yDIjexsP2lGjLaTcB = false;
                okcuo69vecgndian0r.O1xDAlBZZlZdoEf747lCFHld = false;
                okcuo69vecgndian0r.d9zDyyznnp3oaDT1Ug.NSjgqmGjEzuugn2SsG1mZFP = false;
                okcuo69vecgndian0r.vBGA6pPLqSMuYGvprl270j7(1);
            }
            dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 1;
            return;
        }
        o0x3OWMw3He o0x3owmw3he = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        o0x3owmw3he.GI83zq0G8e7zkn(false);
        Bundle bundle2 = dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR;
        dip85slowsmng3.TaDO7ogis3aEiWEtq.d9zDyyznnp3oaDT1Ug();
        dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 1;
        dip85slowsmng3.vE4yDIjexsP2lGjLaTcB = false;
        dip85slowsmng3.YdNRGRc4rly.VxUQ9tBhpHJ2AAEDNW8sghc4m(new W3ZqXaAE9m3wS() { // from class: androidx.fragment.app.Fragment$6
            @Override // com.vdodsodjsdt.W3ZqXaAE9m3wS
            public final void zzpBGItXfub0yWj(hCgEybj69le8 hcgeybj69le8, XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7) {
                View view;
                if (xOTOHmUA5NYhlyOBh7 != XOTOHmUA5NYhlyOBh7.ON_STOP || (view = dip85slowsmng3.HVEwbdULInpTNa0IG) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        dip85slowsmng3.L8DMw02rUTs2w.zzpBGItXfub0yWj(bundle2);
        dip85slowsmng3.ko09zE6UAgwkV(bundle2);
        dip85slowsmng3.d9zDyyznnp3oaDT1Ug = true;
        if (dip85slowsmng3.vE4yDIjexsP2lGjLaTcB) {
            dip85slowsmng3.YdNRGRc4rly.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_CREATE);
            o0x3owmw3he.ZfQNn8hdWlEQ5cR94249PDsLR(false);
        } else {
            throw new irdDsom9QAllWlNFwJgRUGIJ("Fragment " + dip85slowsmng3 + " did not call through to super.onCreate()");
        }
    }

    public final void M9e7PWhFYLD2lOGMker() {
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (dip85slowsmng3.Ca81ebIan1u && dip85slowsmng3.h3jnZRsdwYJfY9UhQCkbvWciwvFHv && !dip85slowsmng3.ko09zE6UAgwkV) {
            if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + dip85slowsmng3);
            }
            dip85slowsmng3.qNPQb1obP7(dip85slowsmng3.TaDO7ogis3aEiWEtq(dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR), null, dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR);
            View view = dip85slowsmng3.HVEwbdULInpTNa0IG;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                dip85slowsmng3.HVEwbdULInpTNa0IG.setTag(R.id.fragment_container_view_tag, dip85slowsmng3);
                if (dip85slowsmng3.qNPQb1obP7) {
                    dip85slowsmng3.HVEwbdULInpTNa0IG.setVisibility(8);
                }
                dip85slowsmng3.TaDO7ogis3aEiWEtq.vBGA6pPLqSMuYGvprl270j7(2);
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.p59rPv72J9(false);
                dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 2;
            }
        }
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP() {
        View view;
        boolean zO1xDAlBZZlZdoEf747lCFHld = okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3);
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zO1xDAlBZZlZdoEf747lCFHld) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + dip85slowsmng3);
        }
        ViewGroup viewGroup = dip85slowsmng3.O1xDAlBZZlZdoEf747lCFHld;
        if (viewGroup != null && (view = dip85slowsmng3.HVEwbdULInpTNa0IG) != null) {
            viewGroup.removeView(view);
        }
        dip85slowsmng3.TaDO7ogis3aEiWEtq.vBGA6pPLqSMuYGvprl270j7(1);
        if (dip85slowsmng3.HVEwbdULInpTNa0IG != null && dip85slowsmng3.wRCD0SdqWCowdYU7bmzN.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr.compareTo(Cg8BA4YSFFWr8.LaeGQIruHQu81hfJldjMOQSVblH3x) >= 0) {
            dip85slowsmng3.wRCD0SdqWCowdYU7bmzN.zzpBGItXfub0yWj(XOTOHmUA5NYhlyOBh7.ON_DESTROY);
        }
        dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 1;
        dip85slowsmng3.vE4yDIjexsP2lGjLaTcB = false;
        dip85slowsmng3.f6ZQsR6bPLvvCDNXOUc();
        if (!dip85slowsmng3.vE4yDIjexsP2lGjLaTcB) {
            throw new irdDsom9QAllWlNFwJgRUGIJ("Fragment " + dip85slowsmng3 + " did not call through to super.onDestroyView()");
        }
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = new NrjuzzioPqfttNRptBDpZDzSYUrcM(dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR(), RsM2tiFklbbxTcN.ZfQNn8hdWlEQ5cR94249PDsLR);
        String canonicalName = RsM2tiFklbbxTcN.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        z4fU9Yfox9E2RCcjwcP384m z4fu9yfox9e2rccjwcp384m = ((RsM2tiFklbbxTcN) nrjuzzioPqfttNRptBDpZDzSYUrcM.q1wNbhk2O6(RsM2tiFklbbxTcN.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).V57tEvNfxZVVcOCAOih5PKr;
        if (z4fu9yfox9e2rccjwcp384m.LaeGQIruHQu81hfJldjMOQSVblH3x > 0) {
            z4fu9yfox9e2rccjwcp384m.ZfQNn8hdWlEQ5cR94249PDsLR[0].getClass();
            throw new ClassCastException();
        }
        dip85slowsmng3.ko09zE6UAgwkV = false;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.Ca81ebIan1u(false);
        dip85slowsmng3.O1xDAlBZZlZdoEf747lCFHld = null;
        dip85slowsmng3.HVEwbdULInpTNa0IG = null;
        dip85slowsmng3.wRCD0SdqWCowdYU7bmzN = null;
        dip85slowsmng3.gBaBUmihn5l4u.zIvmSL0wzmmKGc3X39b2Gw2mUGE(null);
        dip85slowsmng3.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = false;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        boolean zO1xDAlBZZlZdoEf747lCFHld = okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3);
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zO1xDAlBZZlZdoEf747lCFHld) {
            Log.d("FragmentManager", "moveto ATTACHED: " + dip85slowsmng3);
        }
        dip85SLOWSmNG3 dip85slowsmng32 = dip85slowsmng3.GI83zq0G8e7zkn;
        iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = null;
        nMRZPpfLCgJyuB nmrzppflcgjyub = this.zzpBGItXfub0yWj;
        if (dip85slowsmng32 != null) {
            iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn2 = (iVKrTMqOw0TqCeNN) ((HashMap) nmrzppflcgjyub.ZfQNn8hdWlEQ5cR94249PDsLR).get(dip85slowsmng32.ZLZeBXTMq0zDztBxtRTuCHrapQ);
            if (ivkrtmqow0tqcenn2 == null) {
                throw new IllegalStateException("Fragment " + dip85slowsmng3 + " declared target fragment " + dip85slowsmng3.GI83zq0G8e7zkn + " that does not belong to this FragmentManager!");
            }
            dip85slowsmng3.M9e7PWhFYLD2lOGMker = dip85slowsmng3.GI83zq0G8e7zkn.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            dip85slowsmng3.GI83zq0G8e7zkn = null;
            ivkrtmqow0tqcenn = ivkrtmqow0tqcenn2;
        } else {
            String str = dip85slowsmng3.M9e7PWhFYLD2lOGMker;
            if (str != null && (ivkrtmqow0tqcenn = (iVKrTMqOw0TqCeNN) ((HashMap) nmrzppflcgjyub.ZfQNn8hdWlEQ5cR94249PDsLR).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(dip85slowsmng3);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(sb, dip85slowsmng3.M9e7PWhFYLD2lOGMker, " that does not belong to this FragmentManager!"));
            }
        }
        if (ivkrtmqow0tqcenn != null) {
            ivkrtmqow0tqcenn.HzCpKshMOoaw76hFcbOVRYMeRd();
        }
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = dip85slowsmng3.f6ZQsR6bPLvvCDNXOUc;
        dip85slowsmng3.vBGA6pPLqSMuYGvprl270j7 = okcuo69vecgndian0r.f6ZQsR6bPLvvCDNXOUc;
        dip85slowsmng3.Irh5auREsoeV1C1RaBamlmy = okcuo69vecgndian0r.TaDO7ogis3aEiWEtq;
        o0x3OWMw3He o0x3owmw3he = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        o0x3owmw3he.NSjgqmGjEzuugn2SsG1mZFP(false);
        ArrayList arrayList = dip85slowsmng3.lQ0rO9lhQIyVe7Rp6;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dip85SLOWSmNG3 dip85slowsmng33 = ((ZyiMPYAiYuUB4ZJmOsd04XEZd) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            dip85slowsmng33.L8DMw02rUTs2w.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            ej6unYlOWMDF.Irh5auREsoeV1C1RaBamlmy(dip85slowsmng33);
        }
        arrayList.clear();
        dip85slowsmng3.TaDO7ogis3aEiWEtq.zzpBGItXfub0yWj(dip85slowsmng3.vBGA6pPLqSMuYGvprl270j7, dip85slowsmng3.zzpBGItXfub0yWj(), dip85slowsmng3);
        dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 0;
        dip85slowsmng3.vE4yDIjexsP2lGjLaTcB = false;
        dip85slowsmng3.pYmKDYlAmhudp(dip85slowsmng3.vBGA6pPLqSMuYGvprl270j7.q1wNbhk2O6);
        if (!dip85slowsmng3.vE4yDIjexsP2lGjLaTcB) {
            throw new irdDsom9QAllWlNFwJgRUGIJ("Fragment " + dip85slowsmng3 + " did not call through to super.onAttach()");
        }
        Iterator it = dip85slowsmng3.f6ZQsR6bPLvvCDNXOUc.q1wNbhk2O6.iterator();
        while (it.hasNext()) {
            ((rKxIESZHGMtLLUBIOcPgVA5go9R) it.next()).zzpBGItXfub0yWj();
        }
        okcUO69vEcgndIAn0R okcuo69vecgndian0r2 = dip85slowsmng3.TaDO7ogis3aEiWEtq;
        okcuo69vecgndian0r2.vE4yDIjexsP2lGjLaTcB = false;
        okcuo69vecgndian0r2.O1xDAlBZZlZdoEf747lCFHld = false;
        okcuo69vecgndian0r2.d9zDyyznnp3oaDT1Ug.NSjgqmGjEzuugn2SsG1mZFP = false;
        okcuo69vecgndian0r2.vBGA6pPLqSMuYGvprl270j7(0);
        o0x3owmw3he.V57tEvNfxZVVcOCAOih5PKr(false);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        boolean zO1xDAlBZZlZdoEf747lCFHld = okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3);
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zO1xDAlBZZlZdoEf747lCFHld) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + dip85slowsmng3);
        }
        Bundle bundle = dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR;
        dip85slowsmng3.TaDO7ogis3aEiWEtq.d9zDyyznnp3oaDT1Ug();
        dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 3;
        dip85slowsmng3.vE4yDIjexsP2lGjLaTcB = false;
        dip85slowsmng3.Ca81ebIan1u();
        if (!dip85slowsmng3.vE4yDIjexsP2lGjLaTcB) {
            throw new irdDsom9QAllWlNFwJgRUGIJ("Fragment " + dip85slowsmng3 + " did not call through to super.onActivityCreated()");
        }
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + dip85slowsmng3);
        }
        View view = dip85slowsmng3.HVEwbdULInpTNa0IG;
        if (view != null) {
            Bundle bundle2 = dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR;
            SparseArray<Parcelable> sparseArray = dip85slowsmng3.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                dip85slowsmng3.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
            }
            if (dip85slowsmng3.HVEwbdULInpTNa0IG != null) {
                dip85slowsmng3.wRCD0SdqWCowdYU7bmzN.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj(dip85slowsmng3.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                dip85slowsmng3.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
            }
            dip85slowsmng3.vE4yDIjexsP2lGjLaTcB = false;
            dip85slowsmng3.RhfGHxtXxy0M0grmp2jkRjQg(bundle2);
            if (!dip85slowsmng3.vE4yDIjexsP2lGjLaTcB) {
                throw new irdDsom9QAllWlNFwJgRUGIJ("Fragment " + dip85slowsmng3 + " did not call through to super.onViewStateRestored()");
            }
            if (dip85slowsmng3.HVEwbdULInpTNa0IG != null) {
                dip85slowsmng3.wRCD0SdqWCowdYU7bmzN.zzpBGItXfub0yWj(XOTOHmUA5NYhlyOBh7.ON_CREATE);
            }
        }
        dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR = null;
        dip85slowsmng3.TaDO7ogis3aEiWEtq.NSjgqmGjEzuugn2SsG1mZFP();
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj(false);
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        boolean z;
        dip85SLOWSmNG3 dip85slowsmng3ZIvmSL0wzmmKGc3X39b2Gw2mUGE;
        boolean zO1xDAlBZZlZdoEf747lCFHld = okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3);
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zO1xDAlBZZlZdoEf747lCFHld) {
            Log.d("FragmentManager", "movefrom CREATED: " + dip85slowsmng3);
        }
        int i = 0;
        boolean z2 = dip85slowsmng3.p59rPv72J9 && !dip85slowsmng3.p59rPv72J9();
        nMRZPpfLCgJyuB nmrzppflcgjyub = this.zzpBGItXfub0yWj;
        if (z2) {
        }
        if (!z2) {
            LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm = (LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm) nmrzppflcgjyub.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (!((lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm.V57tEvNfxZVVcOCAOih5PKr.containsKey(dip85slowsmng3.ZLZeBXTMq0zDztBxtRTuCHrapQ) && lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm.zIvmSL0wzmmKGc3X39b2Gw2mUGE) ? lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm.ZLZeBXTMq0zDztBxtRTuCHrapQ : true)) {
                String str = dip85slowsmng3.M9e7PWhFYLD2lOGMker;
                if (str != null && (dip85slowsmng3ZIvmSL0wzmmKGc3X39b2Gw2mUGE = nmrzppflcgjyub.zIvmSL0wzmmKGc3X39b2Gw2mUGE(str)) != null && dip85slowsmng3ZIvmSL0wzmmKGc3X39b2Gw2mUGE.pzqP2AqKW6J5PO8zCKnW) {
                    dip85slowsmng3.GI83zq0G8e7zkn = dip85slowsmng3ZIvmSL0wzmmKGc3X39b2Gw2mUGE;
                }
                dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 0;
                return;
            }
        }
        Dqd3yw7CrPyec1dms6HVj dqd3yw7CrPyec1dms6HVj = dip85slowsmng3.vBGA6pPLqSMuYGvprl270j7;
        if (dqd3yw7CrPyec1dms6HVj != null) {
            z = ((LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm) nmrzppflcgjyub.zIvmSL0wzmmKGc3X39b2Gw2mUGE).ZLZeBXTMq0zDztBxtRTuCHrapQ;
        } else {
            z = dqd3yw7CrPyec1dms6HVj.q1wNbhk2O6 != null ? !r5.isChangingConfigurations() : true;
        }
        if (z2 || z) {
            ((LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm) nmrzppflcgjyub.zIvmSL0wzmmKGc3X39b2Gw2mUGE).V57tEvNfxZVVcOCAOih5PKr(dip85slowsmng3);
        }
        dip85slowsmng3.TaDO7ogis3aEiWEtq.KUYypEB4eNWOZWVDpH();
        dip85slowsmng3.YdNRGRc4rly.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_DESTROY);
        dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 0;
        dip85slowsmng3.d9zDyyznnp3oaDT1Ug = false;
        dip85slowsmng3.vE4yDIjexsP2lGjLaTcB = true;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x(false);
        ArrayList arrayListM9e7PWhFYLD2lOGMker = nmrzppflcgjyub.M9e7PWhFYLD2lOGMker();
        int size = arrayListM9e7PWhFYLD2lOGMker.size();
        while (i < size) {
            Object obj = arrayListM9e7PWhFYLD2lOGMker.get(i);
            i++;
            iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = (iVKrTMqOw0TqCeNN) obj;
            if (ivkrtmqow0tqcenn != null) {
                dip85SLOWSmNG3 dip85slowsmng32 = ivkrtmqow0tqcenn.V57tEvNfxZVVcOCAOih5PKr;
                if (dip85slowsmng3.ZLZeBXTMq0zDztBxtRTuCHrapQ.equals(dip85slowsmng32.M9e7PWhFYLD2lOGMker)) {
                    dip85slowsmng32.GI83zq0G8e7zkn = dip85slowsmng3;
                    dip85slowsmng32.M9e7PWhFYLD2lOGMker = null;
                }
            }
        }
        String str2 = dip85slowsmng3.M9e7PWhFYLD2lOGMker;
        if (str2 != null) {
            dip85slowsmng3.GI83zq0G8e7zkn = nmrzppflcgjyub.zIvmSL0wzmmKGc3X39b2Gw2mUGE(str2);
        }
        nmrzppflcgjyub.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(this);
    }

    public final int ZfQNn8hdWlEQ5cR94249PDsLR() {
        RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L;
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (dip85slowsmng3.f6ZQsR6bPLvvCDNXOUc == null) {
            return dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr;
        }
        int iMin = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int iOrdinal = dip85slowsmng3.ymT6yQrus3w.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (dip85slowsmng3.Ca81ebIan1u) {
            if (dip85slowsmng3.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
                iMin = Math.max(this.LaeGQIruHQu81hfJldjMOQSVblH3x, 2);
                View view = dip85slowsmng3.HVEwbdULInpTNa0IG;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.LaeGQIruHQu81hfJldjMOQSVblH3x < 4 ? Math.min(iMin, dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr) : Math.min(iMin, 1);
            }
        }
        if (!dip85slowsmng3.q1wNbhk2O6) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = dip85slowsmng3.O1xDAlBZZlZdoEf747lCFHld;
        if (viewGroup != null) {
            iFKXVhXhX8FyZGUEP1rAer7 ifkxvhxhx8fyzguep1raer7ZIvmSL0wzmmKGc3X39b2Gw2mUGE = iFKXVhXhX8FyZGUEP1rAer7.zIvmSL0wzmmKGc3X39b2Gw2mUGE(viewGroup, dip85slowsmng3.M9e7PWhFYLD2lOGMker().aXO0LSrt8bKV());
            RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61LZfQNn8hdWlEQ5cR94249PDsLR = ifkxvhxhx8fyzguep1raer7ZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZfQNn8hdWlEQ5cR94249PDsLR(dip85slowsmng3);
            int i2 = rD86Fssz0iKbf0t61LZfQNn8hdWlEQ5cR94249PDsLR != null ? rD86Fssz0iKbf0t61LZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj : 0;
            ArrayList arrayList = ifkxvhxhx8fyzguep1raer7ZIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    rD86Fssz0iKbf0t61L = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                rD86Fssz0iKbf0t61L = (RD86Fssz0iKbf0t61L) obj;
                if (rD86Fssz0iKbf0t61L.V57tEvNfxZVVcOCAOih5PKr.equals(dip85slowsmng3) && !rD86Fssz0iKbf0t61L.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                    break;
                }
            }
            i = (rD86Fssz0iKbf0t61L == null || !(i2 == 0 || i2 == 1)) ? i2 : rD86Fssz0iKbf0t61L.zzpBGItXfub0yWj;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (dip85slowsmng3.p59rPv72J9) {
            iMin = dip85slowsmng3.p59rPv72J9() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (dip85slowsmng3.y1NaPKTl7R18DOr6e8i5 && dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + dip85slowsmng3);
        }
        return iMin;
    }

    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv() {
        boolean zO1xDAlBZZlZdoEf747lCFHld = okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3);
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zO1xDAlBZZlZdoEf747lCFHld) {
            Log.d("FragmentManager", "moveto STARTED: " + dip85slowsmng3);
        }
        dip85slowsmng3.TaDO7ogis3aEiWEtq.d9zDyyznnp3oaDT1Ug();
        dip85slowsmng3.TaDO7ogis3aEiWEtq.w0Wu95l8dVNw5rZMRu(true);
        dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 5;
        dip85slowsmng3.vE4yDIjexsP2lGjLaTcB = false;
        dip85slowsmng3.q11o1hieEkZDhF1MGOZI26oZiDT();
        if (!dip85slowsmng3.vE4yDIjexsP2lGjLaTcB) {
            throw new irdDsom9QAllWlNFwJgRUGIJ("Fragment " + dip85slowsmng3 + " did not call through to super.onStart()");
        }
        androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = dip85slowsmng3.YdNRGRc4rly;
        XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7 = XOTOHmUA5NYhlyOBh7.ON_START;
        ivkrtmqow0tqcenn.ZfQNn8hdWlEQ5cR94249PDsLR(xOTOHmUA5NYhlyOBh7);
        if (dip85slowsmng3.HVEwbdULInpTNa0IG != null) {
            dip85slowsmng3.wRCD0SdqWCowdYU7bmzN.LaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR(xOTOHmUA5NYhlyOBh7);
        }
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = dip85slowsmng3.TaDO7ogis3aEiWEtq;
        okcuo69vecgndian0r.vE4yDIjexsP2lGjLaTcB = false;
        okcuo69vecgndian0r.O1xDAlBZZlZdoEf747lCFHld = false;
        okcuo69vecgndian0r.d9zDyyznnp3oaDT1Ug.NSjgqmGjEzuugn2SsG1mZFP = false;
        okcuo69vecgndian0r.vBGA6pPLqSMuYGvprl270j7(5);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.KUYypEB4eNWOZWVDpH(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p59rPv72J9() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = com.vdodsodjsdt.okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(r0)
            java.lang.String r1 = "FragmentManager"
            com.vdodsodjsdt.dip85SLOWSmNG3 r2 = r7.V57tEvNfxZVVcOCAOih5PKr
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            com.vdodsodjsdt.Fxt4Rl0PdDlupwtv r0 = r2.iKANjmyTSxO6v6UuLPdu7DxOjlS
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.HzCpKshMOoaw76hFcbOVRYMeRd
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.HVEwbdULInpTNa0IG
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.HVEwbdULInpTNa0IG
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = com.vdodsodjsdt.okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(r5)
            if (r5 == 0) goto L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            if (r4 == 0) goto L55
            java.lang.String r0 = "succeeded"
            goto L57
        L55:
            java.lang.String r0 = "failed"
        L57:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            android.view.View r0 = r2.HVEwbdULInpTNa0IG
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            com.vdodsodjsdt.Fxt4Rl0PdDlupwtv r0 = r2.zIvmSL0wzmmKGc3X39b2Gw2mUGE()
            r0.HzCpKshMOoaw76hFcbOVRYMeRd = r3
            com.vdodsodjsdt.okcUO69vEcgndIAn0R r0 = r2.TaDO7ogis3aEiWEtq
            r0.d9zDyyznnp3oaDT1Ug()
            com.vdodsodjsdt.okcUO69vEcgndIAn0R r0 = r2.TaDO7ogis3aEiWEtq
            r1 = 1
            r0.w0Wu95l8dVNw5rZMRu(r1)
            r0 = 7
            r2.V57tEvNfxZVVcOCAOih5PKr = r0
            r2.vE4yDIjexsP2lGjLaTcB = r1
            androidx.lifecycle.iVKrTMqOw0TqCeNN r1 = r2.YdNRGRc4rly
            com.vdodsodjsdt.XOTOHmUA5NYhlyOBh7 r4 = com.vdodsodjsdt.XOTOHmUA5NYhlyOBh7.ON_RESUME
            r1.ZfQNn8hdWlEQ5cR94249PDsLR(r4)
            android.view.View r1 = r2.HVEwbdULInpTNa0IG
            if (r1 == 0) goto La5
            com.vdodsodjsdt.CsEvLVebpPqWiZ9 r1 = r2.wRCD0SdqWCowdYU7bmzN
            androidx.lifecycle.iVKrTMqOw0TqCeNN r1 = r1.LaeGQIruHQu81hfJldjMOQSVblH3x
            r1.ZfQNn8hdWlEQ5cR94249PDsLR(r4)
        La5:
            com.vdodsodjsdt.okcUO69vEcgndIAn0R r1 = r2.TaDO7ogis3aEiWEtq
            r4 = 0
            r1.vE4yDIjexsP2lGjLaTcB = r4
            r1.O1xDAlBZZlZdoEf747lCFHld = r4
            com.vdodsodjsdt.LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm r5 = r1.d9zDyyznnp3oaDT1Ug
            r5.NSjgqmGjEzuugn2SsG1mZFP = r4
            r1.vBGA6pPLqSMuYGvprl270j7(r0)
            com.vdodsodjsdt.o0x3OWMw3He r0 = r7.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r0.M9e7PWhFYLD2lOGMker(r4)
            r2.ZfQNn8hdWlEQ5cR94249PDsLR = r3
            r2.LaeGQIruHQu81hfJldjMOQSVblH3x = r3
            r2.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.iVKrTMqOw0TqCeNN.p59rPv72J9():void");
    }

    public final void pYmKDYlAmhudp() {
        boolean zO1xDAlBZZlZdoEf747lCFHld = okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3);
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (zO1xDAlBZZlZdoEf747lCFHld) {
            Log.d("FragmentManager", "movefrom STARTED: " + dip85slowsmng3);
        }
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = dip85slowsmng3.TaDO7ogis3aEiWEtq;
        okcuo69vecgndian0r.O1xDAlBZZlZdoEf747lCFHld = true;
        okcuo69vecgndian0r.d9zDyyznnp3oaDT1Ug.NSjgqmGjEzuugn2SsG1mZFP = true;
        okcuo69vecgndian0r.vBGA6pPLqSMuYGvprl270j7(4);
        if (dip85slowsmng3.HVEwbdULInpTNa0IG != null) {
            dip85slowsmng3.wRCD0SdqWCowdYU7bmzN.zzpBGItXfub0yWj(XOTOHmUA5NYhlyOBh7.ON_STOP);
        }
        dip85slowsmng3.YdNRGRc4rly.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_STOP);
        dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 4;
        dip85slowsmng3.vE4yDIjexsP2lGjLaTcB = false;
        dip85slowsmng3.w0Wu95l8dVNw5rZMRu();
        if (dip85slowsmng3.vE4yDIjexsP2lGjLaTcB) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.q1wNbhk2O6(false);
            return;
        }
        throw new irdDsom9QAllWlNFwJgRUGIJ("Fragment " + dip85slowsmng3 + " did not call through to super.onStop()");
    }

    public final void q1wNbhk2O6(ClassLoader classLoader) {
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        Bundle bundle = dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        dip85slowsmng3.LaeGQIruHQu81hfJldjMOQSVblH3x = dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR.getSparseParcelableArray("android:view_state");
        dip85slowsmng3.zIvmSL0wzmmKGc3X39b2Gw2mUGE = dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR.getBundle("android:view_registry_state");
        String string = dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR.getString("android:target_state");
        dip85slowsmng3.M9e7PWhFYLD2lOGMker = string;
        if (string != null) {
            dip85slowsmng3.HzCpKshMOoaw76hFcbOVRYMeRd = dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR.getInt("android:target_req_state", 0);
        }
        boolean z = dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR.getBoolean("android:user_visible_hint", true);
        dip85slowsmng3.qygqjTppWwx992 = z;
        if (z) {
            return;
        }
        dip85slowsmng3.y1NaPKTl7R18DOr6e8i5 = true;
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        String resourceName;
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (dip85slowsmng3.Ca81ebIan1u) {
            return;
        }
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + dip85slowsmng3);
        }
        LayoutInflater layoutInflaterTaDO7ogis3aEiWEtq = dip85slowsmng3.TaDO7ogis3aEiWEtq(dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR);
        ViewGroup viewGroup = dip85slowsmng3.O1xDAlBZZlZdoEf747lCFHld;
        if (viewGroup == null) {
            int i = dip85slowsmng3.w0Wu95l8dVNw5rZMRu;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + dip85slowsmng3 + " for a container view with no id");
                }
                viewGroup = (ViewGroup) dip85slowsmng3.f6ZQsR6bPLvvCDNXOUc.vBGA6pPLqSMuYGvprl270j7.ymT6yQrus3w(i);
                if (viewGroup == null) {
                    if (!dip85slowsmng3.pYmKDYlAmhudp) {
                        try {
                            resourceName = dip85slowsmng3.SuB3hEmTmbbRGAhtvOOmfKEon().getResources().getResourceName(dip85slowsmng3.w0Wu95l8dVNw5rZMRu);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(dip85slowsmng3.w0Wu95l8dVNw5rZMRu) + " (" + resourceName + ") for fragment " + dip85slowsmng3);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    HBxHyNvfiHwkdcXsyY hBxHyNvfiHwkdcXsyY = K4LDBTJwLOCiiDq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    K4LDBTJwLOCiiDq.zzpBGItXfub0yWj(new A9YWKj9U1PEADap9aqV(dip85slowsmng3, "Attempting to add fragment " + dip85slowsmng3 + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    K4LDBTJwLOCiiDq.VxUQ9tBhpHJ2AAEDNW8sghc4m(dip85slowsmng3).getClass();
                }
            }
        }
        dip85slowsmng3.O1xDAlBZZlZdoEf747lCFHld = viewGroup;
        dip85slowsmng3.qNPQb1obP7(layoutInflaterTaDO7ogis3aEiWEtq, viewGroup, dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR);
        View view = dip85slowsmng3.HVEwbdULInpTNa0IG;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            dip85slowsmng3.HVEwbdULInpTNa0IG.setTag(R.id.fragment_container_view_tag, dip85slowsmng3);
            if (viewGroup != null) {
                zzpBGItXfub0yWj();
            }
            if (dip85slowsmng3.qNPQb1obP7) {
                dip85slowsmng3.HVEwbdULInpTNa0IG.setVisibility(8);
            }
            View view2 = dip85slowsmng3.HVEwbdULInpTNa0IG;
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (view2.isAttachedToWindow()) {
                UFStPSj5DrcqcfR2RymfmG.V57tEvNfxZVVcOCAOih5PKr(dip85slowsmng3.HVEwbdULInpTNa0IG);
            } else {
                View view3 = dip85slowsmng3.HVEwbdULInpTNa0IG;
                view3.addOnAttachStateChangeListener(new QlGb8EPtaoCCLt3z12(2, view3));
            }
            dip85slowsmng3.TaDO7ogis3aEiWEtq.vBGA6pPLqSMuYGvprl270j7(2);
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.p59rPv72J9(false);
            int visibility = dip85slowsmng3.HVEwbdULInpTNa0IG.getVisibility();
            dip85slowsmng3.zIvmSL0wzmmKGc3X39b2Gw2mUGE().M9e7PWhFYLD2lOGMker = dip85slowsmng3.HVEwbdULInpTNa0IG.getAlpha();
            if (dip85slowsmng3.O1xDAlBZZlZdoEf747lCFHld != null && visibility == 0) {
                View viewFindFocus = dip85slowsmng3.HVEwbdULInpTNa0IG.findFocus();
                if (viewFindFocus != null) {
                    dip85slowsmng3.zIvmSL0wzmmKGc3X39b2Gw2mUGE().HzCpKshMOoaw76hFcbOVRYMeRd = viewFindFocus;
                    if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + dip85slowsmng3);
                    }
                }
                dip85slowsmng3.HVEwbdULInpTNa0IG.setAlpha(0.0f);
            }
        }
        dip85slowsmng3.V57tEvNfxZVVcOCAOih5PKr = 2;
    }

    public final void zzpBGItXfub0yWj() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr;
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        ViewGroup viewGroup = dip85slowsmng3.O1xDAlBZZlZdoEf747lCFHld;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(dip85slowsmng3);
            int i = iIndexOf - 1;
            while (true) {
                if (i < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        dip85SLOWSmNG3 dip85slowsmng32 = (dip85SLOWSmNG3) arrayList.get(iIndexOf);
                        if (dip85slowsmng32.O1xDAlBZZlZdoEf747lCFHld == viewGroup && (view = dip85slowsmng32.HVEwbdULInpTNa0IG) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    dip85SLOWSmNG3 dip85slowsmng33 = (dip85SLOWSmNG3) arrayList.get(i);
                    if (dip85slowsmng33.O1xDAlBZZlZdoEf747lCFHld == viewGroup && (view2 = dip85slowsmng33.HVEwbdULInpTNa0IG) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i--;
                }
            }
        }
        dip85slowsmng3.O1xDAlBZZlZdoEf747lCFHld.addView(dip85slowsmng3.HVEwbdULInpTNa0IG, iIndexOfChild);
    }

    public iVKrTMqOw0TqCeNN(o0x3OWMw3He o0x3owmw3he, nMRZPpfLCgJyuB nmrzppflcgjyub, ClassLoader classLoader, jdmWSds1UynWLk6T3nA00aPzo4XP jdmwsds1uynwlk6t3na00apzo4xp, gElQ3Q9ZHXy5F6j gelq3q9zhxy5f6j) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = o0x3owmw3he;
        this.zzpBGItXfub0yWj = nmrzppflcgjyub;
        dip85SLOWSmNG3 dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m = jdmwsds1uynwlk6t3na00apzo4xp.VxUQ9tBhpHJ2AAEDNW8sghc4m(gelq3q9zhxy5f6j.V57tEvNfxZVVcOCAOih5PKr);
        Bundle bundle = gelq3q9zhxy5f6j.KUYypEB4eNWOZWVDpH;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.vE4yDIjexsP2lGjLaTcB(bundle);
        dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.ZLZeBXTMq0zDztBxtRTuCHrapQ = gelq3q9zhxy5f6j.ZfQNn8hdWlEQ5cR94249PDsLR;
        dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.Ca81ebIan1u = gelq3q9zhxy5f6j.LaeGQIruHQu81hfJldjMOQSVblH3x;
        dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.pYmKDYlAmhudp = true;
        dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.q11o1hieEkZDhF1MGOZI26oZiDT = gelq3q9zhxy5f6j.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.w0Wu95l8dVNw5rZMRu = gelq3q9zhxy5f6j.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.RhfGHxtXxy0M0grmp2jkRjQg = gelq3q9zhxy5f6j.NSjgqmGjEzuugn2SsG1mZFP;
        dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.pzqP2AqKW6J5PO8zCKnW = gelq3q9zhxy5f6j.GI83zq0G8e7zkn;
        dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.p59rPv72J9 = gelq3q9zhxy5f6j.M9e7PWhFYLD2lOGMker;
        dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.SuB3hEmTmbbRGAhtvOOmfKEon = gelq3q9zhxy5f6j.HzCpKshMOoaw76hFcbOVRYMeRd;
        dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.qNPQb1obP7 = gelq3q9zhxy5f6j.q1wNbhk2O6;
        dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.ymT6yQrus3w = Cg8BA4YSFFWr8.values()[gelq3q9zhxy5f6j.p59rPv72J9];
        Bundle bundle2 = gelq3q9zhxy5f6j.Ca81ebIan1u;
        if (bundle2 != null) {
            dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR = bundle2;
        } else {
            dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR = new Bundle();
        }
        this.V57tEvNfxZVVcOCAOih5PKr = dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + dip85slowsmng3VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
    }

    public iVKrTMqOw0TqCeNN(o0x3OWMw3He o0x3owmw3he, nMRZPpfLCgJyuB nmrzppflcgjyub, dip85SLOWSmNG3 dip85slowsmng3, gElQ3Q9ZHXy5F6j gelq3q9zhxy5f6j) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = o0x3owmw3he;
        this.zzpBGItXfub0yWj = nmrzppflcgjyub;
        this.V57tEvNfxZVVcOCAOih5PKr = dip85slowsmng3;
        dip85slowsmng3.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
        dip85slowsmng3.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
        dip85slowsmng3.jW7EiD0YL6xkbB158jMUzhWNWb1y = 0;
        dip85slowsmng3.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = false;
        dip85slowsmng3.q1wNbhk2O6 = false;
        dip85SLOWSmNG3 dip85slowsmng32 = dip85slowsmng3.GI83zq0G8e7zkn;
        dip85slowsmng3.M9e7PWhFYLD2lOGMker = dip85slowsmng32 != null ? dip85slowsmng32.ZLZeBXTMq0zDztBxtRTuCHrapQ : null;
        dip85slowsmng3.GI83zq0G8e7zkn = null;
        Bundle bundle = gelq3q9zhxy5f6j.Ca81ebIan1u;
        if (bundle != null) {
            dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR = bundle;
        } else {
            dip85slowsmng3.ZfQNn8hdWlEQ5cR94249PDsLR = new Bundle();
        }
    }
}
