package com.vdodsodjsdt;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class jlv3qp7JVl9aXN implements SBDculXSmt, g3gI5tGnl5o1sbwn0siFDTBcKwP, owwckn2XMaN2nHMo {
    public static final String pYmKDYlAmhudp = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("GreedyScheduler");
    public final nMRZPpfLCgJyuB Ca81ebIan1u;
    public final IVPB9DLMIoeA0Qp8AgwLlJ GI83zq0G8e7zkn;
    public final Eh21X7fdrXs HzCpKshMOoaw76hFcbOVRYMeRd;
    public final deSD4tN0Wv5VY1mbnR1CZOFvWyqT8 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final o6OxmOsCD9HJ6LF8UTncnTX9Cf21 M9e7PWhFYLD2lOGMker;
    public final Context V57tEvNfxZVVcOCAOih5PKr;
    public final aafyMrhodJgR9jbY h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final yxp1I6Gr2tLDD3dH0UsMPMDr7 p59rPv72J9;
    public Boolean q1wNbhk2O6;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final HashMap ZfQNn8hdWlEQ5cR94249PDsLR = new HashMap();
    public final Object ZLZeBXTMq0zDztBxtRTuCHrapQ = new Object();
    public final dXZw8zZnRXsRIYJEIdZC NSjgqmGjEzuugn2SsG1mZFP = new dXZw8zZnRXsRIYJEIdZC(new N1mT85AVNMY84KnH4(3));
    public final HashMap KUYypEB4eNWOZWVDpH = new HashMap();

    public jlv3qp7JVl9aXN(Context context, Eh21X7fdrXs eh21X7fdrXs, UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT, IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ, o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21, nMRZPpfLCgJyuB nmrzppflcgjyub) {
        this.V57tEvNfxZVVcOCAOih5PKr = context;
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = eh21X7fdrXs.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new deSD4tN0Wv5VY1mbnR1CZOFvWyqT8(this, skgk8FYn8b4TvRiBOsElZw4XkNLhQ, eh21X7fdrXs.ZfQNn8hdWlEQ5cR94249PDsLR);
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new aafyMrhodJgR9jbY(skgk8FYn8b4TvRiBOsElZw4XkNLhQ, o6oxmoscd9hj6lf8utncntx9cf21);
        this.Ca81ebIan1u = nmrzppflcgjyub;
        this.p59rPv72J9 = new yxp1I6Gr2tLDD3dH0UsMPMDr7(uL4JI0eLnaD84py2JT);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = eh21X7fdrXs;
        this.GI83zq0G8e7zkn = iVPB9DLMIoeA0Qp8AgwLlJ;
        this.M9e7PWhFYLD2lOGMker = o6oxmoscd9hj6lf8utncntx9cf21;
    }

    @Override // com.vdodsodjsdt.owwckn2XMaN2nHMo
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(AhgUxI6t6E ahgUxI6t6E, boolean z) {
        sJ612dvaOBrP4lDkAwxzLpcxONSSp sj612dvaobrp4ldkawxzlpcxonssp;
        ztNFMw5IuWLfuP ztnfmw5iuwlfupGI83zq0G8e7zkn = this.NSjgqmGjEzuugn2SsG1mZFP.GI83zq0G8e7zkn(ahgUxI6t6E);
        if (ztnfmw5iuwlfupGI83zq0G8e7zkn != null) {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.VxUQ9tBhpHJ2AAEDNW8sghc4m(ztnfmw5iuwlfupGI83zq0G8e7zkn);
        }
        synchronized (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            sj612dvaobrp4ldkawxzlpcxonssp = (sJ612dvaOBrP4lDkAwxzLpcxONSSp) this.ZfQNn8hdWlEQ5cR94249PDsLR.remove(ahgUxI6t6E);
        }
        if (sj612dvaobrp4ldkawxzlpcxonssp != null) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(pYmKDYlAmhudp, "Stopping tracking for " + ahgUxI6t6E);
            sj612dvaobrp4ldkawxzlpcxonssp.V57tEvNfxZVVcOCAOih5PKr(null);
        }
        if (z) {
            return;
        }
        synchronized (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            this.KUYypEB4eNWOZWVDpH.remove(ahgUxI6t6E);
        }
    }

    @Override // com.vdodsodjsdt.g3gI5tGnl5o1sbwn0siFDTBcKwP
    public final void V57tEvNfxZVVcOCAOih5PKr(vIPEe55rgLxLcs vipee55rglxlcs, CWJlFo6DaGDzNFh4w cWJlFo6DaGDzNFh4w) {
        AhgUxI6t6E ahgUxI6t6EM9e7PWhFYLD2lOGMker = hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(vipee55rglxlcs);
        boolean z = cWJlFo6DaGDzNFh4w instanceof g6BKYStEEgT29c8vsK;
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = this.M9e7PWhFYLD2lOGMker;
        aafyMrhodJgR9jbY aafymrhodjgr9jby = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        String str = pYmKDYlAmhudp;
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (z) {
            if (dxzw8zznrxsriyjeidzc.VxUQ9tBhpHJ2AAEDNW8sghc4m(ahgUxI6t6EM9e7PWhFYLD2lOGMker)) {
                return;
            }
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Constraints met: Scheduling work ID " + ahgUxI6t6EM9e7PWhFYLD2lOGMker);
            ztNFMw5IuWLfuP ztnfmw5iuwlfupQ1wNbhk2O6 = dxzw8zznrxsriyjeidzc.q1wNbhk2O6(ahgUxI6t6EM9e7PWhFYLD2lOGMker);
            aafymrhodjgr9jby.zzpBGItXfub0yWj(ztnfmw5iuwlfupQ1wNbhk2O6);
            ((nMRZPpfLCgJyuB) o6oxmoscd9hj6lf8utncntx9cf21.ZfQNn8hdWlEQ5cR94249PDsLR).ZfQNn8hdWlEQ5cR94249PDsLR(new QKIH77ZVGMjTqK4XOIPLci1Yc(o6oxmoscd9hj6lf8utncntx9cf21, ztnfmw5iuwlfupQ1wNbhk2O6, null, 4));
            return;
        }
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Constraints not met: Cancelling work ID " + ahgUxI6t6EM9e7PWhFYLD2lOGMker);
        ztNFMw5IuWLfuP ztnfmw5iuwlfupGI83zq0G8e7zkn = dxzw8zznrxsriyjeidzc.GI83zq0G8e7zkn(ahgUxI6t6EM9e7PWhFYLD2lOGMker);
        if (ztnfmw5iuwlfupGI83zq0G8e7zkn != null) {
            aafymrhodjgr9jby.VxUQ9tBhpHJ2AAEDNW8sghc4m(ztnfmw5iuwlfupGI83zq0G8e7zkn);
            int i = ((hfmuRhTy7aVTHJ4xausxesbcd5d) cWJlFo6DaGDzNFh4w).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            o6oxmoscd9hj6lf8utncntx9cf21.getClass();
            o6oxmoscd9hj6lf8utncntx9cf21.q1wNbhk2O6(ztnfmw5iuwlfupGI83zq0G8e7zkn, i);
        }
    }

    @Override // com.vdodsodjsdt.SBDculXSmt
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(String str) {
        Runnable runnable;
        if (this.q1wNbhk2O6 == null) {
            this.q1wNbhk2O6 = Boolean.valueOf(kUxvcfiNJSWAdKuXlNcXOpLKKC.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.V57tEvNfxZVVcOCAOih5PKr, this.HzCpKshMOoaw76hFcbOVRYMeRd));
        }
        boolean zBooleanValue = this.q1wNbhk2O6.booleanValue();
        String str2 = pYmKDYlAmhudp;
        if (!zBooleanValue) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            this.GI83zq0G8e7zkn.VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        }
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str2, "Cancelling work ID " + str);
        deSD4tN0Wv5VY1mbnR1CZOFvWyqT8 desd4tn0wv5vy1mbnr1czofvwyqt8 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (desd4tn0wv5vy1mbnr1czofvwyqt8 != null && (runnable = (Runnable) desd4tn0wv5vy1mbnr1czofvwyqt8.ZfQNn8hdWlEQ5cR94249PDsLR.remove(str)) != null) {
            ((Handler) desd4tn0wv5vy1mbnr1czofvwyqt8.zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR).removeCallbacks(runnable);
        }
        for (ztNFMw5IuWLfuP ztnfmw5iuwlfup : this.NSjgqmGjEzuugn2SsG1mZFP.M9e7PWhFYLD2lOGMker(str)) {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.VxUQ9tBhpHJ2AAEDNW8sghc4m(ztnfmw5iuwlfup);
            o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = this.M9e7PWhFYLD2lOGMker;
            o6oxmoscd9hj6lf8utncntx9cf21.getClass();
            o6oxmoscd9hj6lf8utncntx9cf21.q1wNbhk2O6(ztnfmw5iuwlfup, -512);
        }
    }

    @Override // com.vdodsodjsdt.SBDculXSmt
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(vIPEe55rgLxLcs... vipee55rglxlcsArr) {
        long jMax;
        if (this.q1wNbhk2O6 == null) {
            this.q1wNbhk2O6 = Boolean.valueOf(kUxvcfiNJSWAdKuXlNcXOpLKKC.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.V57tEvNfxZVVcOCAOih5PKr, this.HzCpKshMOoaw76hFcbOVRYMeRd));
        }
        if (!this.q1wNbhk2O6.booleanValue()) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(pYmKDYlAmhudp, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            this.GI83zq0G8e7zkn.VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        }
        HashSet<vIPEe55rgLxLcs> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (vIPEe55rgLxLcs vipee55rglxlcs : vipee55rglxlcsArr) {
            if (!this.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m(hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(vipee55rglxlcs))) {
                synchronized (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                    try {
                        AhgUxI6t6E ahgUxI6t6EM9e7PWhFYLD2lOGMker = hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(vipee55rglxlcs);
                        xv2bGx8trFHcFyhn9FIURbcFBj xv2bgx8trfhcfyhn9fiurbcfbj = (xv2bGx8trFHcFyhn9FIURbcFBj) this.KUYypEB4eNWOZWVDpH.get(ahgUxI6t6EM9e7PWhFYLD2lOGMker);
                        if (xv2bgx8trfhcfyhn9fiurbcfbj == null) {
                            int i = vipee55rglxlcs.HzCpKshMOoaw76hFcbOVRYMeRd;
                            this.HzCpKshMOoaw76hFcbOVRYMeRd.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
                            xv2bgx8trfhcfyhn9fiurbcfbj = new xv2bGx8trFHcFyhn9FIURbcFBj(i, System.currentTimeMillis());
                            this.KUYypEB4eNWOZWVDpH.put(ahgUxI6t6EM9e7PWhFYLD2lOGMker, xv2bgx8trfhcfyhn9fiurbcfbj);
                        }
                        jMax = (((long) Math.max((vipee55rglxlcs.HzCpKshMOoaw76hFcbOVRYMeRd - xv2bgx8trfhcfyhn9fiurbcfbj.VxUQ9tBhpHJ2AAEDNW8sghc4m) - 5, 0)) * 30000) + xv2bgx8trfhcfyhn9fiurbcfbj.zzpBGItXfub0yWj;
                    } finally {
                    }
                }
                long jMax2 = Math.max(vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m(), jMax);
                this.HzCpKshMOoaw76hFcbOVRYMeRd.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (vipee55rglxlcs.zzpBGItXfub0yWj == 1) {
                    if (jCurrentTimeMillis < jMax2) {
                        deSD4tN0Wv5VY1mbnR1CZOFvWyqT8 desd4tn0wv5vy1mbnr1czofvwyqt8 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                        if (desd4tn0wv5vy1mbnr1czofvwyqt8 != null) {
                            Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = desd4tn0wv5vy1mbnr1czofvwyqt8.zzpBGItXfub0yWj;
                            HashMap map = desd4tn0wv5vy1mbnr1czofvwyqt8.ZfQNn8hdWlEQ5cR94249PDsLR;
                            Runnable runnable = (Runnable) map.remove(vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                            if (runnable != null) {
                                ((Handler) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR).removeCallbacks(runnable);
                            }
                            gZVesoHrfMaGvAvfBsRIr gzvesohrfmagvavfbsrir = new gZVesoHrfMaGvAvfBsRIr(6, desd4tn0wv5vy1mbnr1czofvwyqt8, vipee55rglxlcs);
                            map.put(vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m, gzvesohrfmagvavfbsrir);
                            desd4tn0wv5vy1mbnr1czofvwyqt8.V57tEvNfxZVVcOCAOih5PKr.getClass();
                            ((Handler) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR).postDelayed(gzvesohrfmagvavfbsrir, jMax2 - System.currentTimeMillis());
                        }
                    } else if (vipee55rglxlcs.V57tEvNfxZVVcOCAOih5PKr()) {
                        c0WB626RcDoa849JB c0wb626rcdoa849jb = vipee55rglxlcs.M9e7PWhFYLD2lOGMker;
                        if (c0wb626rcdoa849jb.ZfQNn8hdWlEQ5cR94249PDsLR) {
                            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(pYmKDYlAmhudp, "Ignoring " + vipee55rglxlcs + ". Requires device idle.");
                        } else if (c0wb626rcdoa849jb.GI83zq0G8e7zkn.isEmpty()) {
                            hashSet.add(vipee55rglxlcs);
                            hashSet2.add(vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        } else {
                            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(pYmKDYlAmhudp, "Ignoring " + vipee55rglxlcs + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m(hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(vipee55rglxlcs))) {
                        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(pYmKDYlAmhudp, "Starting work for " + vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = this.NSjgqmGjEzuugn2SsG1mZFP;
                        dxzw8zznrxsriyjeidzc.getClass();
                        ztNFMw5IuWLfuP ztnfmw5iuwlfupQ1wNbhk2O6 = dxzw8zznrxsriyjeidzc.q1wNbhk2O6(hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(vipee55rglxlcs));
                        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.zzpBGItXfub0yWj(ztnfmw5iuwlfupQ1wNbhk2O6);
                        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = this.M9e7PWhFYLD2lOGMker;
                        ((nMRZPpfLCgJyuB) o6oxmoscd9hj6lf8utncntx9cf21.ZfQNn8hdWlEQ5cR94249PDsLR).ZfQNn8hdWlEQ5cR94249PDsLR(new QKIH77ZVGMjTqK4XOIPLci1Yc(o6oxmoscd9hj6lf8utncntx9cf21, ztnfmw5iuwlfupQ1wNbhk2O6, null, 4));
                    }
                }
            }
        }
        synchronized (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            try {
                if (!hashSet.isEmpty()) {
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(pYmKDYlAmhudp, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (vIPEe55rgLxLcs vipee55rglxlcs2 : hashSet) {
                        AhgUxI6t6E ahgUxI6t6EM9e7PWhFYLD2lOGMker2 = hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(vipee55rglxlcs2);
                        if (!this.ZfQNn8hdWlEQ5cR94249PDsLR.containsKey(ahgUxI6t6EM9e7PWhFYLD2lOGMker2)) {
                            this.ZfQNn8hdWlEQ5cR94249PDsLR.put(ahgUxI6t6EM9e7PWhFYLD2lOGMker2, muOaMHIFqe96qo7.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.p59rPv72J9, vipee55rglxlcs2, (LL6zXCXfmDYzdHCRTT) this.Ca81ebIan1u.ZfQNn8hdWlEQ5cR94249PDsLR, this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.vdodsodjsdt.SBDculXSmt
    public final boolean zzpBGItXfub0yWj() {
        return false;
    }
}
