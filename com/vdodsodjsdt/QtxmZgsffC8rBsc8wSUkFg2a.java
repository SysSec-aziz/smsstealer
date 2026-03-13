package com.vdodsodjsdt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class QtxmZgsffC8rBsc8wSUkFg2a extends hRrPPME7ytOB7ba {
    public static Map CixTK5ZX8oWXHz34qHYV(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return XC6rwBjRUhvxaQ8TfYI.V57tEvNfxZVVcOCAOih5PKr;
        }
        if (size == 1) {
            FgeGQUnjhbxnrwqkj fgeGQUnjhbxnrwqkj = (FgeGQUnjhbxnrwqkj) arrayList.get(0);
            ej6unYlOWMDF.pYmKDYlAmhudp(fgeGQUnjhbxnrwqkj, "pair");
            Map mapSingletonMap = Collections.singletonMap(fgeGQUnjhbxnrwqkj.V57tEvNfxZVVcOCAOih5PKr, fgeGQUnjhbxnrwqkj.ZfQNn8hdWlEQ5cR94249PDsLR);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(mapSingletonMap, "singletonMap(...)");
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d9zDyyznnp3oaDT1Ug(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            FgeGQUnjhbxnrwqkj fgeGQUnjhbxnrwqkj2 = (FgeGQUnjhbxnrwqkj) obj;
            linkedHashMap.put(fgeGQUnjhbxnrwqkj2.V57tEvNfxZVVcOCAOih5PKr, fgeGQUnjhbxnrwqkj2.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
        return linkedHashMap;
    }

    public static int d9zDyyznnp3oaDT1Ug(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map ymT6yQrus3w(Map map) {
        ej6unYlOWMDF.pYmKDYlAmhudp(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return XC6rwBjRUhvxaQ8TfYI.V57tEvNfxZVVcOCAOih5PKr;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        ej6unYlOWMDF.pYmKDYlAmhudp(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
