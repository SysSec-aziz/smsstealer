package com.vdodsodjsdt;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class gYXV3FZbh17i6ocMo1T extends WzPbM3wqL9eCSPtbDn3C {
    public static void BJQHddi0Plr5ElWetCyaixWOg9(ArrayList arrayList, Iterable iterable) {
        ej6unYlOWMDF.pYmKDYlAmhudp(iterable, "elements");
        if (iterable instanceof Collection) {
            arrayList.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }

    public static List ByTQIhgl7ezGvHXEd(Iterable iterable) {
        ArrayList arrayList;
        ej6unYlOWMDF.pYmKDYlAmhudp(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        zyfAMJWWt8IroEev2OgKlBxvdV zyfamjwwt8iroeev2ogklbxvdv = zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
        if (!z) {
            if (z) {
                arrayList = new ArrayList((Collection) iterable);
            } else {
                arrayList = new ArrayList();
                wR7sbzHKf9hYV1lxoS6nqyszepWvN(iterable, arrayList);
            }
            int size = arrayList.size();
            return size != 0 ? size != 1 ? arrayList : KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG(arrayList.get(0)) : zyfamjwwt8iroeev2ogklbxvdv;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return zyfamjwwt8iroeev2ogklbxvdv;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static int[] HAPpjhiCsV9ONY23505HCBI9IX(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            iArr[i] = ((Number) obj).intValue();
            i++;
        }
        return iArr;
    }

    public static ArrayList p6bBrs4p3Ly(List list, Iterable iterable) {
        Collection collection = (Collection) iterable;
        ArrayList arrayList = new ArrayList(collection.size() + list.size());
        arrayList.addAll(list);
        arrayList.addAll(collection);
        return arrayList;
    }

    public static String rE05n5RsRkyWKIeA9cmLXAKv4Hze(Collection collection, String str, String str2, String str3, vP57smEEh3YGCxzJ vp57smeeh3ygcxzj, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            vp57smeeh3ygcxzj = null;
        }
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "<this>");
        StringBuilder sb = new StringBuilder();
        tFRdVJAePmTx77bP7FAN0uI(collection, sb, str4, str5, str6, "...", vp57smeeh3ygcxzj);
        return sb.toString();
    }

    public static final void tFRdVJAePmTx77bP7FAN0uI(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, vP57smEEh3YGCxzJ vp57smeeh3ygcxzj) {
        ej6unYlOWMDF.pYmKDYlAmhudp(iterable, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            F44whnLsbQ.VxUQ9tBhpHJ2AAEDNW8sghc4m(sb, obj, vp57smeeh3ygcxzj);
        }
        sb.append(charSequence3);
    }

    public static Set tpEo0fy9FaoJYrSFHRfIK6(Collection collection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(collection, "<this>");
        int size = collection.size();
        if (size == 0) {
            return RGN0mODQUR.V57tEvNfxZVVcOCAOih5PKr;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(QtxmZgsffC8rBsc8wSUkFg2a.d9zDyyznnp3oaDT1Ug(collection.size()));
            wR7sbzHKf9hYV1lxoS6nqyszepWvN(collection, linkedHashSet);
            return linkedHashSet;
        }
        Set setSingleton = Collections.singleton(collection instanceof List ? ((List) collection).get(0) : collection.iterator().next());
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static Object ubNpdCC1pl7L(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(arrayList.size() - 1);
    }

    public static final void wR7sbzHKf9hYV1lxoS6nqyszepWvN(Iterable iterable, AbstractCollection abstractCollection) {
        ej6unYlOWMDF.pYmKDYlAmhudp(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}
