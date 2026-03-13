package com.vdodsodjsdt;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class dz5NyGIwqDW6k3gnpAoL {
    public final List V57tEvNfxZVVcOCAOih5PKr;
    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final List ZfQNn8hdWlEQ5cR94249PDsLR;
    public final boolean zzpBGItXfub0yWj;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public dz5NyGIwqDW6k3gnpAoL(String str, boolean z, List list, List list2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "columns");
        ej6unYlOWMDF.pYmKDYlAmhudp(list2, "orders");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = z;
        this.V57tEvNfxZVVcOCAOih5PKr = list;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dz5NyGIwqDW6k3gnpAoL) {
            dz5NyGIwqDW6k3gnpAoL dz5nygiwqdw6k3gnpaol = (dz5NyGIwqDW6k3gnpAoL) obj;
            String str = dz5nygiwqdw6k3gnpaol.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (this.zzpBGItXfub0yWj == dz5nygiwqdw6k3gnpaol.zzpBGItXfub0yWj && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr, dz5nygiwqdw6k3gnpaol.V57tEvNfxZVVcOCAOih5PKr) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.ZfQNn8hdWlEQ5cR94249PDsLR, dz5nygiwqdw6k3gnpaol.ZfQNn8hdWlEQ5cR94249PDsLR)) {
                String str2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                return ngO5JXZkj8nfh41LltHvEjUc.lxWWbfAOLs4jWzd7PSIiIJ(str2, "index_", false) ? ngO5JXZkj8nfh41LltHvEjUc.lxWWbfAOLs4jWzd7PSIiIJ(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.hashCode() + ((this.V57tEvNfxZVVcOCAOih5PKr.hashCode() + ((((ngO5JXZkj8nfh41LltHvEjUc.lxWWbfAOLs4jWzd7PSIiIJ(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.zzpBGItXfub0yWj ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + "', unique=" + this.zzpBGItXfub0yWj + ", columns=" + this.V57tEvNfxZVVcOCAOih5PKr + ", orders=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + "'}";
    }
}
