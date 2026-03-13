package com.vdodsodjsdt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class AJ4xefI8l4 extends FLWIoSaHb1q8TqFvEBgPyRGrzvi6 {
    public static List L8DMw02rUTs2w(vkFu4GhdSMnWyhhpd2f vkfu4ghdsmnwyhhpd2f) {
        Iterator it = vkfu4ghdsmnwyhhpd2f.iterator();
        if (!it.hasNext()) {
            return zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
