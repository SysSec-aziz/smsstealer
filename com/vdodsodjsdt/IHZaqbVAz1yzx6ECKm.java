package com.vdodsodjsdt;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class IHZaqbVAz1yzx6ECKm {
    public final String[] V57tEvNfxZVVcOCAOih5PKr;
    public final o6OxmOsCD9HJ6LF8UTncnTX9Cf21 VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Set ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int[] zzpBGItXfub0yWj;

    public IHZaqbVAz1yzx6ECKm(o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21, int[] iArr, String[] strArr) {
        Set setSingleton;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = o6oxmoscd9hj6lf8utncntx9cf21;
        this.zzpBGItXfub0yWj = iArr;
        this.V57tEvNfxZVVcOCAOih5PKr = strArr;
        if (strArr.length == 0) {
            setSingleton = RGN0mODQUR.V57tEvNfxZVVcOCAOih5PKr;
        } else {
            setSingleton = Collections.singleton(strArr[0]);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(setSingleton, "singleton(...)");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = setSingleton;
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Set set) {
        ej6unYlOWMDF.pYmKDYlAmhudp(set, "invalidatedTablesIds");
        int[] iArr = this.zzpBGItXfub0yWj;
        int length = iArr.length;
        Collection collectionNSjgqmGjEzuugn2SsG1mZFP = RGN0mODQUR.V57tEvNfxZVVcOCAOih5PKr;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                OwOLjYacvvUWq owOLjYacvvUWq = new OwOLjYacvvUWq();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        owOLjYacvvUWq.add(this.V57tEvNfxZVVcOCAOih5PKr[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                collectionNSjgqmGjEzuugn2SsG1mZFP = sGipz63rTUmSj3uFDvOtzihao.NSjgqmGjEzuugn2SsG1mZFP(owOLjYacvvUWq);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                collectionNSjgqmGjEzuugn2SsG1mZFP = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            }
        }
        if (collectionNSjgqmGjEzuugn2SsG1mZFP.isEmpty()) {
            return;
        }
        ((AQYAU4MRDJq) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR).HzCpKshMOoaw76hFcbOVRYMeRd(hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }
}
