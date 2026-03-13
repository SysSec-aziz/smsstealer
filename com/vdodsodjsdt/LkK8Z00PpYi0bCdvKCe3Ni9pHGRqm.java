package com.vdodsodjsdt;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm extends l6xJVUTn99ZWyAVk {
    public static final FG8LIxsgYiLSfhN0jYKIKr GI83zq0G8e7zkn = new FG8LIxsgYiLSfhN0jYKIKr(11);
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final HashMap V57tEvNfxZVVcOCAOih5PKr = new HashMap();
    public final HashMap ZfQNn8hdWlEQ5cR94249PDsLR = new HashMap();
    public final HashMap LaeGQIruHQu81hfJldjMOQSVblH3x = new HashMap();
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
    public boolean NSjgqmGjEzuugn2SsG1mZFP = false;

    public LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm(boolean z) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = z;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(dip85SLOWSmNG3 dip85slowsmng3) {
        if (this.NSjgqmGjEzuugn2SsG1mZFP) {
            if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.V57tEvNfxZVVcOCAOih5PKr.remove(dip85slowsmng3.ZLZeBXTMq0zDztBxtRTuCHrapQ) == null || !okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + dip85slowsmng3);
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(dip85SLOWSmNG3 dip85slowsmng3) {
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + dip85slowsmng3);
        }
        ZfQNn8hdWlEQ5cR94249PDsLR(dip85slowsmng3.ZLZeBXTMq0zDztBxtRTuCHrapQ);
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(String str) {
        HashMap map = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm = (LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm) map.get(str);
        if (lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm != null) {
            lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm.zzpBGItXfub0yWj();
            map.remove(str);
        }
        HashMap map2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        cx2YoQOPZxuB1B0n1aU3M cx2yoqopzxub1b0n1au3m = (cx2YoQOPZxuB1B0n1aU3M) map2.get(str);
        if (cx2yoqopzxub1b0n1au3m != null) {
            cx2yoqopzxub1b0n1au3m.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm.class == obj.getClass()) {
            LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm = (LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm) obj;
            if (this.V57tEvNfxZVVcOCAOih5PKr.equals(lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm.V57tEvNfxZVVcOCAOih5PKr) && this.ZfQNn8hdWlEQ5cR94249PDsLR.equals(lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm.ZfQNn8hdWlEQ5cR94249PDsLR) && this.LaeGQIruHQu81hfJldjMOQSVblH3x.equals(lkK8Z00PpYi0bCdvKCe3Ni9pHGRqm.LaeGQIruHQu81hfJldjMOQSVblH3x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.hashCode() + ((this.ZfQNn8hdWlEQ5cR94249PDsLR.hashCode() + (this.V57tEvNfxZVVcOCAOih5PKr.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.V57tEvNfxZVVcOCAOih5PKr.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.ZfQNn8hdWlEQ5cR94249PDsLR.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.vdodsodjsdt.l6xJVUTn99ZWyAVk
    public final void zzpBGItXfub0yWj() {
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
    }
}
