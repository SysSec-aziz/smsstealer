package com.vdodsodjsdt;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class TkF9tg2fr9JpHc2wR2tV7BbN extends AbstractMap {
    public static final /* synthetic */ int NSjgqmGjEzuugn2SsG1mZFP = 0;
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public List V57tEvNfxZVVcOCAOih5PKr;
    public Map ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public Map ZfQNn8hdWlEQ5cR94249PDsLR;
    public volatile ZkTXEuwYyyqv zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public static TkF9tg2fr9JpHc2wR2tV7BbN zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        TkF9tg2fr9JpHc2wR2tV7BbN tkF9tg2fr9JpHc2wR2tV7BbN = new TkF9tg2fr9JpHc2wR2tV7BbN();
        tkF9tg2fr9JpHc2wR2tV7BbN.V57tEvNfxZVVcOCAOih5PKr = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        tkF9tg2fr9JpHc2wR2tV7BbN.ZfQNn8hdWlEQ5cR94249PDsLR = map;
        tkF9tg2fr9JpHc2wR2tV7BbN.ZLZeBXTMq0zDztBxtRTuCHrapQ = map;
        return tkF9tg2fr9JpHc2wR2tV7BbN;
    }

    public final SortedMap LaeGQIruHQu81hfJldjMOQSVblH3x() {
        zzpBGItXfub0yWj();
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR.isEmpty() && !(this.ZfQNn8hdWlEQ5cR94249PDsLR instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.ZfQNn8hdWlEQ5cR94249PDsLR = treeMap;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = treeMap.descendingMap();
        }
        return (SortedMap) this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final Object NSjgqmGjEzuugn2SsG1mZFP(int i) {
        zzpBGItXfub0yWj();
        Object obj = ((xNxqryWTcZQtE34M) this.V57tEvNfxZVVcOCAOih5PKr.remove(i)).ZfQNn8hdWlEQ5cR94249PDsLR;
        if (!this.ZfQNn8hdWlEQ5cR94249PDsLR.isEmpty()) {
            Iterator it = LaeGQIruHQu81hfJldjMOQSVblH3x().entrySet().iterator();
            List list = this.V57tEvNfxZVVcOCAOih5PKr;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new xNxqryWTcZQtE34M(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final Map.Entry V57tEvNfxZVVcOCAOih5PKr(int i) {
        return (Map.Entry) this.V57tEvNfxZVVcOCAOih5PKr.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.V57tEvNfxZVVcOCAOih5PKr
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.V57tEvNfxZVVcOCAOih5PKr
            java.lang.Object r2 = r2.get(r1)
            com.vdodsodjsdt.xNxqryWTcZQtE34M r2 = (com.vdodsodjsdt.xNxqryWTcZQtE34M) r2
            java.lang.Comparable r2 = r2.V57tEvNfxZVVcOCAOih5PKr
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.V57tEvNfxZVVcOCAOih5PKr
            java.lang.Object r3 = r3.get(r2)
            com.vdodsodjsdt.xNxqryWTcZQtE34M r3 = (com.vdodsodjsdt.xNxqryWTcZQtE34M) r3
            java.lang.Comparable r3 = r3.V57tEvNfxZVVcOCAOih5PKr
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.TkF9tg2fr9JpHc2wR2tV7BbN.VxUQ9tBhpHJ2AAEDNW8sghc4m(java.lang.Comparable):int");
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: ZLZeBXTMq0zDztBxtRTuCHrapQ, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        zzpBGItXfub0yWj();
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(comparable);
        if (iVxUQ9tBhpHJ2AAEDNW8sghc4m >= 0) {
            return ((xNxqryWTcZQtE34M) this.V57tEvNfxZVVcOCAOih5PKr.get(iVxUQ9tBhpHJ2AAEDNW8sghc4m)).setValue(obj);
        }
        zzpBGItXfub0yWj();
        if (this.V57tEvNfxZVVcOCAOih5PKr.isEmpty() && !(this.V57tEvNfxZVVcOCAOih5PKr instanceof ArrayList)) {
            this.V57tEvNfxZVVcOCAOih5PKr = new ArrayList(16);
        }
        int i = -(iVxUQ9tBhpHJ2AAEDNW8sghc4m + 1);
        if (i >= 16) {
            return LaeGQIruHQu81hfJldjMOQSVblH3x().put(comparable, obj);
        }
        if (this.V57tEvNfxZVVcOCAOih5PKr.size() == 16) {
            xNxqryWTcZQtE34M xnxqrywtczqte34m = (xNxqryWTcZQtE34M) this.V57tEvNfxZVVcOCAOih5PKr.remove(15);
            LaeGQIruHQu81hfJldjMOQSVblH3x().put(xnxqrywtczqte34m.V57tEvNfxZVVcOCAOih5PKr, xnxqrywtczqte34m.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
        this.V57tEvNfxZVVcOCAOih5PKr.add(i, new xNxqryWTcZQtE34M(this, comparable, obj));
        return null;
    }

    public final Set ZfQNn8hdWlEQ5cR94249PDsLR() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.isEmpty() ? Collections.EMPTY_SET : this.ZfQNn8hdWlEQ5cR94249PDsLR.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzpBGItXfub0yWj();
        if (!this.V57tEvNfxZVVcOCAOih5PKr.isEmpty()) {
            this.V57tEvNfxZVVcOCAOih5PKr.clear();
        }
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR.isEmpty()) {
            return;
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return VxUQ9tBhpHJ2AAEDNW8sghc4m(comparable) >= 0 || this.ZfQNn8hdWlEQ5cR94249PDsLR.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new ZkTXEuwYyyqv(this, 1);
        }
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TkF9tg2fr9JpHc2wR2tV7BbN)) {
            return super.equals(obj);
        }
        TkF9tg2fr9JpHc2wR2tV7BbN tkF9tg2fr9JpHc2wR2tV7BbN = (TkF9tg2fr9JpHc2wR2tV7BbN) obj;
        int size = size();
        if (size == tkF9tg2fr9JpHc2wR2tV7BbN.size()) {
            int size2 = this.V57tEvNfxZVVcOCAOih5PKr.size();
            if (size2 != tkF9tg2fr9JpHc2wR2tV7BbN.V57tEvNfxZVVcOCAOih5PKr.size()) {
                return ((AbstractSet) entrySet()).equals(tkF9tg2fr9JpHc2wR2tV7BbN.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (V57tEvNfxZVVcOCAOih5PKr(i).equals(tkF9tg2fr9JpHc2wR2tV7BbN.V57tEvNfxZVVcOCAOih5PKr(i))) {
                }
            }
            if (size2 != size) {
                return this.ZfQNn8hdWlEQ5cR94249PDsLR.equals(tkF9tg2fr9JpHc2wR2tV7BbN.ZfQNn8hdWlEQ5cR94249PDsLR);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(comparable);
        return iVxUQ9tBhpHJ2AAEDNW8sghc4m >= 0 ? ((xNxqryWTcZQtE34M) this.V57tEvNfxZVVcOCAOih5PKr.get(iVxUQ9tBhpHJ2AAEDNW8sghc4m)).ZfQNn8hdWlEQ5cR94249PDsLR : this.ZfQNn8hdWlEQ5cR94249PDsLR.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.V57tEvNfxZVVcOCAOih5PKr.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((xNxqryWTcZQtE34M) this.V57tEvNfxZVVcOCAOih5PKr.get(i)).hashCode();
        }
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.size() > 0 ? this.ZfQNn8hdWlEQ5cR94249PDsLR.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzpBGItXfub0yWj();
        Comparable comparable = (Comparable) obj;
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(comparable);
        if (iVxUQ9tBhpHJ2AAEDNW8sghc4m >= 0) {
            return NSjgqmGjEzuugn2SsG1mZFP(iVxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR.isEmpty()) {
            return null;
        }
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.size() + this.V57tEvNfxZVVcOCAOih5PKr.size();
    }

    public final void zzpBGItXfub0yWj() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new UnsupportedOperationException();
        }
    }
}
