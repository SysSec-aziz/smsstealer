package com.vdodsodjsdt;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class pN24dqosQuwKRHaREt1n0AEZnr2K {
    public static final List V57tEvNfxZVVcOCAOih5PKr;
    public static final pN24dqosQuwKRHaREt1n0AEZnr2K ZfQNn8hdWlEQ5cR94249PDsLR;
    public static final oA1WO3soICf8H1N6bgpG zzpBGItXfub0yWj;
    public final UL4JI0eLnaD84py2JT VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        byte[] bArrCopyOf = Arrays.copyOf(new byte[]{42}, 1);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(bArrCopyOf, "copyOf(...)");
        zzpBGItXfub0yWj = new oA1WO3soICf8H1N6bgpG(bArrCopyOf);
        V57tEvNfxZVVcOCAOih5PKr = KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG("*");
        ZfQNn8hdWlEQ5cR94249PDsLR = new pN24dqosQuwKRHaREt1n0AEZnr2K(new UL4JI0eLnaD84py2JT(1));
    }

    public pN24dqosQuwKRHaREt1n0AEZnr2K(UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = uL4JI0eLnaD84py2JT;
    }

    public static List zzpBGItXfub0yWj(String str) {
        List listUQ30BFNHbnwcS96Dk6jHUECPfOq = cwhrCnoVJBjJE2CBEAvBopmgF.uQ30BFNHbnwcS96Dk6jHUECPfOq(str, new char[]{'.'});
        if (listUQ30BFNHbnwcS96Dk6jHUECPfOq.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        if (!ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(listUQ30BFNHbnwcS96Dk6jHUECPfOq.get(listUQ30BFNHbnwcS96Dk6jHUECPfOq.size() - 1), "")) {
            return listUQ30BFNHbnwcS96Dk6jHUECPfOq;
        }
        int size = listUQ30BFNHbnwcS96Dk6jHUECPfOq.size() - 1;
        if (size < 0) {
            size = 0;
        }
        if (size < 0) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(size, "Requested element count ", " is less than zero.").toString());
        }
        zyfAMJWWt8IroEev2OgKlBxvdV zyfamjwwt8iroeev2ogklbxvdv = zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
        if (size == 0) {
            return zyfamjwwt8iroeev2ogklbxvdv;
        }
        if (size >= listUQ30BFNHbnwcS96Dk6jHUECPfOq.size()) {
            return gYXV3FZbh17i6ocMo1T.ByTQIhgl7ezGvHXEd(listUQ30BFNHbnwcS96Dk6jHUECPfOq);
        }
        if (size == 1) {
            if (listUQ30BFNHbnwcS96Dk6jHUECPfOq.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            return KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG(listUQ30BFNHbnwcS96Dk6jHUECPfOq.get(0));
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = listUQ30BFNHbnwcS96Dk6jHUECPfOq.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i++;
            if (i == size) {
                break;
            }
        }
        int size2 = arrayList.size();
        return size2 != 0 ? size2 != 1 ? arrayList : KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG(arrayList.get(0)) : zyfamjwwt8iroeev2ogklbxvdv;
    }

    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m(String str) {
        String strZIvmSL0wzmmKGc3X39b2Gw2mUGE;
        String strZIvmSL0wzmmKGc3X39b2Gw2mUGE2;
        String strZIvmSL0wzmmKGc3X39b2Gw2mUGE3;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        ej6unYlOWMDF.p59rPv72J9(unicode);
        List listZzpBGItXfub0yWj = zzpBGItXfub0yWj(unicode);
        List listUQ30BFNHbnwcS96Dk6jHUECPfOq = zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
        UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i = 0;
        if (((AtomicBoolean) uL4JI0eLnaD84py2JT.VxUQ9tBhpHJ2AAEDNW8sghc4m).get() || !((AtomicBoolean) uL4JI0eLnaD84py2JT.VxUQ9tBhpHJ2AAEDNW8sghc4m).compareAndSet(false, true)) {
            try {
                ((CountDownLatch) uL4JI0eLnaD84py2JT.zzpBGItXfub0yWj).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        try {
                            uL4JI0eLnaD84py2JT.KUYypEB4eNWOZWVDpH();
                            break;
                        } catch (InterruptedIOException unused2) {
                            Thread.interrupted();
                            z = true;
                        }
                    } catch (IOException e) {
                        O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker("Failed to read public suffix list", 5, e);
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((oA1WO3soICf8H1N6bgpG) uL4JI0eLnaD84py2JT.V57tEvNfxZVVcOCAOih5PKr) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(uL4JI0eLnaD84py2JT.LaeGQIruHQu81hfJldjMOQSVblH3x);
            sb.append(" resource.");
            throw new IllegalStateException(sb.toString().toString());
        }
        int size3 = listZzpBGItXfub0yWj.size();
        oA1WO3soICf8H1N6bgpG[] oa1wo3soicf8h1n6bgpgArr = new oA1WO3soICf8H1N6bgpG[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = oA1WO3soICf8H1N6bgpG.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            oa1wo3soicf8h1n6bgpgArr[i2] = IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd((String) listZzpBGItXfub0yWj.get(i2));
        }
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                strZIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
                break;
            }
            oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg2 = (oA1WO3soICf8H1N6bgpG) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr;
            if (oa1wo3soicf8h1n6bgpg2 == null) {
                ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("bytes");
                throw null;
            }
            strZIvmSL0wzmmKGc3X39b2Gw2mUGE = FG8LIxsgYiLSfhN0jYKIKr.zIvmSL0wzmmKGc3X39b2Gw2mUGE(oa1wo3soicf8h1n6bgpg2, oa1wo3soicf8h1n6bgpgArr, i3);
            if (strZIvmSL0wzmmKGc3X39b2Gw2mUGE != null) {
                break;
            }
            i3++;
        }
        if (size3 > 1) {
            oA1WO3soICf8H1N6bgpG[] oa1wo3soicf8h1n6bgpgArr2 = (oA1WO3soICf8H1N6bgpG[]) oa1wo3soicf8h1n6bgpgArr.clone();
            int length = oa1wo3soicf8h1n6bgpgArr2.length - 1;
            for (int i4 = 0; i4 < length; i4++) {
                oa1wo3soicf8h1n6bgpgArr2[i4] = zzpBGItXfub0yWj;
                oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg3 = (oA1WO3soICf8H1N6bgpG) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr;
                if (oa1wo3soicf8h1n6bgpg3 == null) {
                    ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("bytes");
                    throw null;
                }
                strZIvmSL0wzmmKGc3X39b2Gw2mUGE2 = FG8LIxsgYiLSfhN0jYKIKr.zIvmSL0wzmmKGc3X39b2Gw2mUGE(oa1wo3soicf8h1n6bgpg3, oa1wo3soicf8h1n6bgpgArr2, i4);
                if (strZIvmSL0wzmmKGc3X39b2Gw2mUGE2 != null) {
                    break;
                }
            }
            strZIvmSL0wzmmKGc3X39b2Gw2mUGE2 = null;
        } else {
            strZIvmSL0wzmmKGc3X39b2Gw2mUGE2 = null;
        }
        if (strZIvmSL0wzmmKGc3X39b2Gw2mUGE2 != null) {
            int i5 = size3 - 1;
            for (int i6 = 0; i6 < i5; i6++) {
                oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg4 = (oA1WO3soICf8H1N6bgpG) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (oa1wo3soicf8h1n6bgpg4 == null) {
                    ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("exceptionBytes");
                    throw null;
                }
                strZIvmSL0wzmmKGc3X39b2Gw2mUGE3 = FG8LIxsgYiLSfhN0jYKIKr.zIvmSL0wzmmKGc3X39b2Gw2mUGE(oa1wo3soicf8h1n6bgpg4, oa1wo3soicf8h1n6bgpgArr, i6);
                if (strZIvmSL0wzmmKGc3X39b2Gw2mUGE3 != null) {
                    break;
                }
            }
            strZIvmSL0wzmmKGc3X39b2Gw2mUGE3 = null;
        } else {
            strZIvmSL0wzmmKGc3X39b2Gw2mUGE3 = null;
        }
        if (strZIvmSL0wzmmKGc3X39b2Gw2mUGE3 != null) {
            listUQ30BFNHbnwcS96Dk6jHUECPfOq = cwhrCnoVJBjJE2CBEAvBopmgF.uQ30BFNHbnwcS96Dk6jHUECPfOq("!".concat(strZIvmSL0wzmmKGc3X39b2Gw2mUGE3), new char[]{'.'});
        } else if (strZIvmSL0wzmmKGc3X39b2Gw2mUGE == null && strZIvmSL0wzmmKGc3X39b2Gw2mUGE2 == null) {
            listUQ30BFNHbnwcS96Dk6jHUECPfOq = V57tEvNfxZVVcOCAOih5PKr;
        } else {
            List listUQ30BFNHbnwcS96Dk6jHUECPfOq2 = strZIvmSL0wzmmKGc3X39b2Gw2mUGE != null ? cwhrCnoVJBjJE2CBEAvBopmgF.uQ30BFNHbnwcS96Dk6jHUECPfOq(strZIvmSL0wzmmKGc3X39b2Gw2mUGE, new char[]{'.'}) : listUQ30BFNHbnwcS96Dk6jHUECPfOq;
            if (strZIvmSL0wzmmKGc3X39b2Gw2mUGE2 != null) {
                listUQ30BFNHbnwcS96Dk6jHUECPfOq = cwhrCnoVJBjJE2CBEAvBopmgF.uQ30BFNHbnwcS96Dk6jHUECPfOq(strZIvmSL0wzmmKGc3X39b2Gw2mUGE2, new char[]{'.'});
            }
            if (listUQ30BFNHbnwcS96Dk6jHUECPfOq2.size() > listUQ30BFNHbnwcS96Dk6jHUECPfOq.size()) {
                listUQ30BFNHbnwcS96Dk6jHUECPfOq = listUQ30BFNHbnwcS96Dk6jHUECPfOq2;
            }
        }
        if (listZzpBGItXfub0yWj.size() == listUQ30BFNHbnwcS96Dk6jHUECPfOq.size() && ((String) listUQ30BFNHbnwcS96Dk6jHUECPfOq.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listUQ30BFNHbnwcS96Dk6jHUECPfOq.get(0)).charAt(0) == '!') {
            size = listZzpBGItXfub0yWj.size();
            size2 = listUQ30BFNHbnwcS96Dk6jHUECPfOq.size();
        } else {
            size = listZzpBGItXfub0yWj.size();
            size2 = listUQ30BFNHbnwcS96Dk6jHUECPfOq.size() + 1;
        }
        int i7 = size - size2;
        vkFu4GhdSMnWyhhpd2f yGu77UzqV7U = new YGu77UzqV7U(0, zzpBGItXfub0yWj(str));
        if (i7 < 0) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i7, "Requested element count ", " is less than zero.").toString());
        }
        if (i7 != 0) {
            yGu77UzqV7U = new zYf3BBuL0DDx(yGu77UzqV7U, i7);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        for (Object obj : yGu77UzqV7U) {
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ".");
            }
            F44whnLsbQ.VxUQ9tBhpHJ2AAEDNW8sghc4m(sb2, obj, null);
        }
        sb2.append((CharSequence) "");
        return sb2.toString();
    }
}
