package com.vdodsodjsdt;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class WpiLOI3RQ2nVUwtF implements EFN6xDhtisHH7dVlRZ1E5 {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ Object zzpBGItXfub0yWj;

    public /* synthetic */ WpiLOI3RQ2nVUwtF(int i, Object obj) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = obj;
    }

    @Override // com.vdodsodjsdt.EFN6xDhtisHH7dVlRZ1E5
    public final void accept(Object obj) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                CfP1VFxsaWESDSF2SWQq cfP1VFxsaWESDSF2SWQq = (CfP1VFxsaWESDSF2SWQq) obj;
                if (cfP1VFxsaWESDSF2SWQq == null) {
                    cfP1VFxsaWESDSF2SWQq = new CfP1VFxsaWESDSF2SWQq(-3);
                }
                ((o6OxmOsCD9HJ6LF8UTncnTX9Cf21) this.zzpBGItXfub0yWj).GI83zq0G8e7zkn(cfP1VFxsaWESDSF2SWQq);
                return;
            default:
                CfP1VFxsaWESDSF2SWQq cfP1VFxsaWESDSF2SWQq2 = (CfP1VFxsaWESDSF2SWQq) obj;
                synchronized (u2wfRDeKR5EzWXLEc3z.V57tEvNfxZVVcOCAOih5PKr) {
                    try {
                        sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = u2wfRDeKR5EzWXLEc3z.ZfQNn8hdWlEQ5cR94249PDsLR;
                        ArrayList arrayList = (ArrayList) sstjsle9ugp7ixfnwi18akn1jt.get((String) this.zzpBGItXfub0yWj);
                        if (arrayList == null) {
                            return;
                        }
                        sstjsle9ugp7ixfnwi18akn1jt.remove((String) this.zzpBGItXfub0yWj);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((EFN6xDhtisHH7dVlRZ1E5) arrayList.get(i)).accept(cfP1VFxsaWESDSF2SWQq2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
