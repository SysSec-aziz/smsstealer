package com.vdodsodjsdt;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class K4LDBTJwLOCiiDq {
    public static final HBxHyNvfiHwkdcXsyY VxUQ9tBhpHJ2AAEDNW8sghc4m = HBxHyNvfiHwkdcXsyY.VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public static final void V57tEvNfxZVVcOCAOih5PKr(dip85SLOWSmNG3 dip85slowsmng3, String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "previousFragmentId");
        zzpBGItXfub0yWj(new A9YWKj9U1PEADap9aqV(dip85slowsmng3, "Attempting to reuse fragment " + dip85slowsmng3 + " with previous ID " + str));
        VxUQ9tBhpHJ2AAEDNW8sghc4m(dip85slowsmng3).getClass();
    }

    public static HBxHyNvfiHwkdcXsyY VxUQ9tBhpHJ2AAEDNW8sghc4m(dip85SLOWSmNG3 dip85slowsmng3) {
        while (dip85slowsmng3 != null) {
            if (dip85slowsmng3.vBGA6pPLqSMuYGvprl270j7 != null && dip85slowsmng3.q1wNbhk2O6) {
                dip85slowsmng3.M9e7PWhFYLD2lOGMker();
            }
            dip85slowsmng3 = dip85slowsmng3.Irh5auREsoeV1C1RaBamlmy;
        }
        return VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public static void zzpBGItXfub0yWj(A9YWKj9U1PEADap9aqV a9YWKj9U1PEADap9aqV) {
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(a9YWKj9U1PEADap9aqV.V57tEvNfxZVVcOCAOih5PKr.getClass().getName()), a9YWKj9U1PEADap9aqV);
        }
    }
}
