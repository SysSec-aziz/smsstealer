package com.vdodsodjsdt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class zqXPAmzIWuKS7FZZzISFv extends eAZzwKf05brkM {
    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        tvklqdievloorf1qymtyventzi.V57tEvNfxZVVcOCAOih5PKr();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            tvklqdievloorf1qymtyventzi.qygqjTppWwx992(r6.get(i));
        }
        tvklqdievloorf1qymtyventzi.KUYypEB4eNWOZWVDpH();
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        ArrayList arrayList = new ArrayList();
        gzdlhdn1ss.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        while (gzdlhdn1ss.pzqP2AqKW6J5PO8zCKnW()) {
            try {
                arrayList.add(Integer.valueOf(gzdlhdn1ss.y1NaPKTl7R18DOr6e8i5()));
            } catch (NumberFormatException e) {
                throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(e);
            }
        }
        gzdlhdn1ss.KUYypEB4eNWOZWVDpH();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }
}
