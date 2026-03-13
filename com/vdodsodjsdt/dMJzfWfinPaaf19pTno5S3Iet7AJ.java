package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class dMJzfWfinPaaf19pTno5S3Iet7AJ implements Iterable {
    public BzqvZe2HlF1ngslPHZd V57tEvNfxZVVcOCAOih5PKr;
    public BzqvZe2HlF1ngslPHZd ZfQNn8hdWlEQ5cR94249PDsLR;
    public final WeakHashMap LaeGQIruHQu81hfJldjMOQSVblH3x = new WeakHashMap();
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;

    public BzqvZe2HlF1ngslPHZd VxUQ9tBhpHJ2AAEDNW8sghc4m(Object obj) {
        BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZd = this.V57tEvNfxZVVcOCAOih5PKr;
        while (bzqvZe2HlF1ngslPHZd != null && !bzqvZe2HlF1ngslPHZd.V57tEvNfxZVVcOCAOih5PKr.equals(obj)) {
            bzqvZe2HlF1ngslPHZd = bzqvZe2HlF1ngslPHZd.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        return bzqvZe2HlF1ngslPHZd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((com.vdodsodjsdt.TaWcpo9tRZQr4wnpn) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof com.vdodsodjsdt.dMJzfWfinPaaf19pTno5S3Iet7AJ
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.vdodsodjsdt.dMJzfWfinPaaf19pTno5S3Iet7AJ r7 = (com.vdodsodjsdt.dMJzfWfinPaaf19pTno5S3Iet7AJ) r7
            int r1 = r6.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            int r3 = r7.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            com.vdodsodjsdt.TaWcpo9tRZQr4wnpn r3 = (com.vdodsodjsdt.TaWcpo9tRZQr4wnpn) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            com.vdodsodjsdt.TaWcpo9tRZQr4wnpn r4 = (com.vdodsodjsdt.TaWcpo9tRZQr4wnpn) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            com.vdodsodjsdt.TaWcpo9tRZQr4wnpn r7 = (com.vdodsodjsdt.TaWcpo9tRZQr4wnpn) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.dMJzfWfinPaaf19pTno5S3Iet7AJ.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            TaWcpo9tRZQr4wnpn taWcpo9tRZQr4wnpn = (TaWcpo9tRZQr4wnpn) it;
            if (!taWcpo9tRZQr4wnpn.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) taWcpo9tRZQr4wnpn.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        TaWcpo9tRZQr4wnpn taWcpo9tRZQr4wnpn = new TaWcpo9tRZQr4wnpn(this.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR, 0);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.put(taWcpo9tRZQr4wnpn, Boolean.FALSE);
        return taWcpo9tRZQr4wnpn;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            TaWcpo9tRZQr4wnpn taWcpo9tRZQr4wnpn = (TaWcpo9tRZQr4wnpn) it;
            if (!taWcpo9tRZQr4wnpn.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) taWcpo9tRZQr4wnpn.next()).toString());
            if (taWcpo9tRZQr4wnpn.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public Object zzpBGItXfub0yWj(Object obj) {
        BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(obj);
        if (bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            return null;
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE--;
        WeakHashMap weakHashMap = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((wDM0OIsoelVNxywVsHYCFqoeSJqb) it.next()).VxUQ9tBhpHJ2AAEDNW8sghc4m(bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m);
            }
        }
        BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZd = bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (bzqvZe2HlF1ngslPHZd != null) {
            bzqvZe2HlF1ngslPHZd.LaeGQIruHQu81hfJldjMOQSVblH3x = bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x;
        } else {
            this.V57tEvNfxZVVcOCAOih5PKr = bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZd2 = bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (bzqvZe2HlF1ngslPHZd2 != null) {
            bzqvZe2HlF1ngslPHZd2.zIvmSL0wzmmKGc3X39b2Gw2mUGE = bzqvZe2HlF1ngslPHZd;
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = bzqvZe2HlF1ngslPHZd;
        }
        bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
        bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
        return bzqvZe2HlF1ngslPHZdVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR;
    }
}
