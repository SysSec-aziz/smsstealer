package com.vdodsodjsdt;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class wg2qx8o8rURUQteWo0QkSZAxg4eSO {
    public final LinkedHashMap VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ zzpBGItXfub0yWj;

    public wg2qx8o8rURUQteWo0QkSZAxg4eSO(LinkedHashMap linkedHashMap, boolean z) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = linkedHashMap;
        this.zzpBGItXfub0yWj = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(z);
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(zabWiGvSFrO07AP3htLK7JkP zabwigvsfro07ap3htlk7jkp, Object obj) {
        zzpBGItXfub0yWj();
        LinkedHashMap linkedHashMap = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (obj == null) {
            zzpBGItXfub0yWj();
            linkedHashMap.remove(zabwigvsfro07ap3htlk7jkp);
            return;
        }
        if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(gYXV3FZbh17i6ocMo1T.tpEo0fy9FaoJYrSFHRfIK6((Set) obj));
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            linkedHashMap.put(zabwigvsfro07ap3htlk7jkp, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(zabwigvsfro07ap3htlk7jkp, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(zabwigvsfro07ap3htlk7jkp, bArrCopyOf);
        }
    }

    public final Map VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        FgeGQUnjhbxnrwqkj fgeGQUnjhbxnrwqkj;
        Set<Map.Entry> setEntrySet = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.entrySet();
        int iD9zDyyznnp3oaDT1Ug = QtxmZgsffC8rBsc8wSUkFg2a.d9zDyyznnp3oaDT1Ug(M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(setEntrySet));
        if (iD9zDyyznnp3oaDT1Ug < 16) {
            iD9zDyyznnp3oaDT1Ug = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD9zDyyznnp3oaDT1Ug);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(bArrCopyOf, "copyOf(this, size)");
                fgeGQUnjhbxnrwqkj = new FgeGQUnjhbxnrwqkj(key, bArrCopyOf);
            } else {
                fgeGQUnjhbxnrwqkj = new FgeGQUnjhbxnrwqkj(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(fgeGQUnjhbxnrwqkj.V57tEvNfxZVVcOCAOih5PKr, fgeGQUnjhbxnrwqkj.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.vdodsodjsdt.wg2qx8o8rURUQteWo0QkSZAxg4eSO
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            com.vdodsodjsdt.wg2qx8o8rURUQteWo0QkSZAxg4eSO r7 = (com.vdodsodjsdt.wg2qx8o8rURUQteWo0QkSZAxg4eSO) r7
            java.util.LinkedHashMap r7 = r7.VxUQ9tBhpHJ2AAEDNW8sghc4m
            java.util.LinkedHashMap r0 = r6.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r2 = 1
            if (r7 != r0) goto L10
            goto L61
        L10:
            int r3 = r7.size()
            int r4 = r0.size()
            if (r3 == r4) goto L1b
            goto L60
        L1b:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L22
            goto L61
        L22:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r0.get(r4)
            if (r4 == 0) goto L5d
            java.lang.Object r3 = r3.getValue()
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L58
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5d
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L58:
            boolean r3 = com.vdodsodjsdt.ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(r3, r4)
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L2a
        L60:
            return r1
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.wg2qx8o8rURUQteWo0QkSZAxg4eSO.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return gYXV3FZbh17i6ocMo1T.rE05n5RsRkyWKIeA9cmLXAKv4Hze(this.VxUQ9tBhpHJ2AAEDNW8sghc4m.entrySet(), ",\n", "{\n", "\n}", BIhaoaY7PwYE.NSjgqmGjEzuugn2SsG1mZFP, 24);
    }

    public final void zzpBGItXfub0yWj() {
        if (((AtomicBoolean) this.zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public /* synthetic */ wg2qx8o8rURUQteWo0QkSZAxg4eSO(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
