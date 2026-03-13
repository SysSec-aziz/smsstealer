package com.vdodsodjsdt;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class wfAv4Z4xkzEqsmKhnROCM57sUkreZ {
    public final View zzpBGItXfub0yWj;
    public final HashMap VxUQ9tBhpHJ2AAEDNW8sghc4m = new HashMap();
    public final ArrayList V57tEvNfxZVVcOCAOih5PKr = new ArrayList();

    public wfAv4Z4xkzEqsmKhnROCM57sUkreZ(View view) {
        this.zzpBGItXfub0yWj = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wfAv4Z4xkzEqsmKhnROCM57sUkreZ)) {
            return false;
        }
        wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez = (wfAv4Z4xkzEqsmKhnROCM57sUkreZ) obj;
        return this.zzpBGItXfub0yWj == wfav4z4xkzeqsmkhnrocm57sukrez.zzpBGItXfub0yWj && this.VxUQ9tBhpHJ2AAEDNW8sghc4m.equals(wfav4z4xkzeqsmkhnrocm57sukrez.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    public final int hashCode() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() + (this.zzpBGItXfub0yWj.hashCode() * 31);
    }

    public final String toString() {
        String strGI83zq0G8e7zkn = u9SlVAuoWhQUfJ.GI83zq0G8e7zkn(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.zzpBGItXfub0yWj + "\n", "    values:");
        HashMap map = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        for (String str : map.keySet()) {
            strGI83zq0G8e7zkn = strGI83zq0G8e7zkn + "    " + str + ": " + map.get(str) + "\n";
        }
        return strGI83zq0G8e7zkn;
    }
}
