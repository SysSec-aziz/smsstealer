package com.vdodsodjsdt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cOlXApCgdZbIeiSW0kkEbYYt6zIn extends F44whnLsbQ {
    public static String HAPpjhiCsV9ONY23505HCBI9IX(String str) {
        List listHVEwbdULInpTNa0IG;
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        if (cwhrCnoVJBjJE2CBEAvBopmgF.DNP7yXLsojH0rPMHr8fUY14M("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        bY0COC8GUSraZFWonwDOUTFCPiW4 by0coc8gusrazfwonwdoutfcpiw4 = new bY0COC8GUSraZFWonwDOUTFCPiW4(str);
        if (by0coc8gusrazfwonwdoutfcpiw4.hasNext()) {
            Object next = by0coc8gusrazfwonwdoutfcpiw4.next();
            if (by0coc8gusrazfwonwdoutfcpiw4.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (by0coc8gusrazfwonwdoutfcpiw4.hasNext()) {
                    arrayList.add(by0coc8gusrazfwonwdoutfcpiw4.next());
                }
                listHVEwbdULInpTNa0IG = arrayList;
            } else {
                listHVEwbdULInpTNa0IG = KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG(next);
            }
        } else {
            listHVEwbdULInpTNa0IG = zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
        }
        int length = str.length();
        listHVEwbdULInpTNa0IG.size();
        int size = listHVEwbdULInpTNa0IG.size() - 1;
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : listHVEwbdULInpTNa0IG) {
            int i2 = i + 1;
            String strSubstring = null;
            if (i < 0) {
                kzhIjSJtHYuLoiUgKqSRIck3W8.Z1FjjMJ0suz8AFI7gsA4GDLMXv();
                throw null;
            }
            String str2 = (String) obj;
            if ((i != 0 && i != size) || !cwhrCnoVJBjJE2CBEAvBopmgF.DNP7yXLsojH0rPMHr8fUY14M(str2)) {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!F44whnLsbQ.iKANjmyTSxO6v6UuLPdu7DxOjlS(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && ngO5JXZkj8nfh41LltHvEjUc.BDoqAMf0rlMRAnVghjC4qjG(str2, "|", i3, false)) {
                    strSubstring = str2.substring("|".length() + i3);
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        gYXV3FZbh17i6ocMo1T.tFRdVJAePmTx77bP7FAN0uI(arrayList2, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    public static String wR7sbzHKf9hYV1lxoS6nqyszepWvN(String str) {
        List listHVEwbdULInpTNa0IG;
        Comparable comparable;
        String strSubstring;
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        bY0COC8GUSraZFWonwDOUTFCPiW4 by0coc8gusrazfwonwdoutfcpiw4 = new bY0COC8GUSraZFWonwDOUTFCPiW4(str);
        if (by0coc8gusrazfwonwdoutfcpiw4.hasNext()) {
            Object next = by0coc8gusrazfwonwdoutfcpiw4.next();
            if (by0coc8gusrazfwonwdoutfcpiw4.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (by0coc8gusrazfwonwdoutfcpiw4.hasNext()) {
                    arrayList.add(by0coc8gusrazfwonwdoutfcpiw4.next());
                }
                listHVEwbdULInpTNa0IG = arrayList;
            } else {
                listHVEwbdULInpTNa0IG = KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG(next);
            }
        } else {
            listHVEwbdULInpTNa0IG = zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listHVEwbdULInpTNa0IG) {
            if (!cwhrCnoVJBjJE2CBEAvBopmgF.DNP7yXLsojH0rPMHr8fUY14M((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(arrayList2));
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            String str2 = (String) obj2;
            int length = str2.length();
            int length2 = 0;
            while (true) {
                if (length2 >= length) {
                    length2 = -1;
                    break;
                }
                if (!F44whnLsbQ.iKANjmyTSxO6v6UuLPdu7DxOjlS(str2.charAt(length2))) {
                    break;
                }
                length2++;
            }
            if (length2 == -1) {
                length2 = str2.length();
            }
            arrayList3.add(Integer.valueOf(length2));
        }
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listHVEwbdULInpTNa0IG.size();
        int size2 = listHVEwbdULInpTNa0IG.size() - 1;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listHVEwbdULInpTNa0IG) {
            int i3 = i + 1;
            if (i < 0) {
                kzhIjSJtHYuLoiUgKqSRIck3W8.Z1FjjMJ0suz8AFI7gsA4GDLMXv();
                throw null;
            }
            String str3 = (String) obj3;
            if ((i == 0 || i == size2) && cwhrCnoVJBjJE2CBEAvBopmgF.DNP7yXLsojH0rPMHr8fUY14M(str3)) {
                strSubstring = null;
            } else {
                ej6unYlOWMDF.pYmKDYlAmhudp(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList4.add(strSubstring);
            }
            i = i3;
        }
        StringBuilder sb = new StringBuilder(length3);
        gYXV3FZbh17i6ocMo1T.tFRdVJAePmTx77bP7FAN0uI(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
