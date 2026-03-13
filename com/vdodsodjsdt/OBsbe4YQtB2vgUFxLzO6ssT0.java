package com.vdodsodjsdt;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class OBsbe4YQtB2vgUFxLzO6ssT0 {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Object ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj;

    public OBsbe4YQtB2vgUFxLzO6ssT0(int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        this.zzpBGItXfub0yWj = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new N1mT85AVNMY84KnH4(1);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new FG8LIxsgYiLSfhN0jYKIKr(17);
    }

    public int GI83zq0G8e7zkn(int i) {
        ArrayList arrayList = (ArrayList) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int i2 = this.zzpBGItXfub0yWj;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        sqhEuPaG4yT6D7gwZf5yfbaPJBAN sqheupag4yt6d7gwzf5yfbapjban = (sqhEuPaG4yT6D7gwZf5yfbaPJBAN) view.getLayoutParams();
        this.zzpBGItXfub0yWj = ((StaggeredGridLayoutManager) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(view);
        sqheupag4yt6d7gwzf5yfbapjban.getClass();
        return this.zzpBGItXfub0yWj;
    }

    public int LaeGQIruHQu81hfJldjMOQSVblH3x(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int iHzCpKshMOoaw76hFcbOVRYMeRd = staggeredGridLayoutManager.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd();
        int iZLZeBXTMq0zDztBxtRTuCHrapQ = staggeredGridLayoutManager.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).get(i);
            int iLaeGQIruHQu81hfJldjMOQSVblH3x = staggeredGridLayoutManager.ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(view);
            int iZzpBGItXfub0yWj = staggeredGridLayoutManager.ko09zE6UAgwkV.zzpBGItXfub0yWj(view);
            boolean z = iLaeGQIruHQu81hfJldjMOQSVblH3x <= iZLZeBXTMq0zDztBxtRTuCHrapQ;
            boolean z2 = iZzpBGItXfub0yWj >= iHzCpKshMOoaw76hFcbOVRYMeRd;
            if (z && z2 && (iLaeGQIruHQu81hfJldjMOQSVblH3x < iHzCpKshMOoaw76hFcbOVRYMeRd || iZzpBGItXfub0yWj > iZLZeBXTMq0zDztBxtRTuCHrapQ)) {
                return wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object M9e7PWhFYLD2lOGMker(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            com.vdodsodjsdt.ej6unYlOWMDF.pYmKDYlAmhudp(r6, r0)
            java.lang.Object r0 = r5.ZLZeBXTMq0zDztBxtRTuCHrapQ
            com.vdodsodjsdt.FG8LIxsgYiLSfhN0jYKIKr r0 = (com.vdodsodjsdt.FG8LIxsgYiLSfhN0jYKIKr) r0
            monitor-enter(r0)
            int r1 = r5.V57tEvNfxZVVcOCAOih5PKr     // Catch: java.lang.Throwable -> L26
            int r1 = r1 + 1
            r5.V57tEvNfxZVVcOCAOih5PKr = r1     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE     // Catch: java.lang.Throwable -> L26
            com.vdodsodjsdt.N1mT85AVNMY84KnH4 r1 = (com.vdodsodjsdt.N1mT85AVNMY84KnH4) r1     // Catch: java.lang.Throwable -> L26
            r1.getClass()     // Catch: java.lang.Throwable -> L26
            java.util.LinkedHashMap r1 = r1.VxUQ9tBhpHJ2AAEDNW8sghc4m     // Catch: java.lang.Throwable -> L26
            java.lang.Object r6 = r1.put(r6, r7)     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L29
            int r7 = r5.V57tEvNfxZVVcOCAOih5PKr     // Catch: java.lang.Throwable -> L26
            int r7 = r7 + (-1)
            r5.V57tEvNfxZVVcOCAOih5PKr = r7     // Catch: java.lang.Throwable -> L26
            goto L29
        L26:
            r6 = move-exception
            goto Lc5
        L29:
            monitor-exit(r0)
            int r7 = r5.zzpBGItXfub0yWj
        L2c:
            java.lang.Object r0 = r5.ZLZeBXTMq0zDztBxtRTuCHrapQ
            com.vdodsodjsdt.FG8LIxsgYiLSfhN0jYKIKr r0 = (com.vdodsodjsdt.FG8LIxsgYiLSfhN0jYKIKr) r0
            monitor-enter(r0)
            int r1 = r5.V57tEvNfxZVVcOCAOih5PKr     // Catch: java.lang.Throwable -> L46
            if (r1 < 0) goto Lbb
            java.lang.Object r1 = r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE     // Catch: java.lang.Throwable -> L46
            com.vdodsodjsdt.N1mT85AVNMY84KnH4 r1 = (com.vdodsodjsdt.N1mT85AVNMY84KnH4) r1     // Catch: java.lang.Throwable -> L46
            java.util.LinkedHashMap r1 = r1.VxUQ9tBhpHJ2AAEDNW8sghc4m     // Catch: java.lang.Throwable -> L46
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L49
            int r1 = r5.V57tEvNfxZVVcOCAOih5PKr     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto Lbb
            goto L49
        L46:
            r6 = move-exception
            goto Lc3
        L49:
            int r1 = r5.V57tEvNfxZVVcOCAOih5PKr     // Catch: java.lang.Throwable -> L46
            if (r1 <= r7) goto Lb9
            java.lang.Object r1 = r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE     // Catch: java.lang.Throwable -> L46
            com.vdodsodjsdt.N1mT85AVNMY84KnH4 r1 = (com.vdodsodjsdt.N1mT85AVNMY84KnH4) r1     // Catch: java.lang.Throwable -> L46
            java.util.LinkedHashMap r1 = r1.VxUQ9tBhpHJ2AAEDNW8sghc4m     // Catch: java.lang.Throwable -> L46
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L5a
            goto Lb9
        L5a:
            java.lang.Object r1 = r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE     // Catch: java.lang.Throwable -> L46
            com.vdodsodjsdt.N1mT85AVNMY84KnH4 r1 = (com.vdodsodjsdt.N1mT85AVNMY84KnH4) r1     // Catch: java.lang.Throwable -> L46
            java.util.LinkedHashMap r1 = r1.VxUQ9tBhpHJ2AAEDNW8sghc4m     // Catch: java.lang.Throwable -> L46
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L46
            java.lang.String r2 = "map.entries"
            com.vdodsodjsdt.ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(r1, r2)     // Catch: java.lang.Throwable -> L46
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L46
            r3 = 0
            if (r2 == 0) goto L7d
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L46
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L77
            goto L8c
        L77:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L46
            goto L8c
        L7d:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L46
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L88
            goto L8c
        L88:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L46
        L8c:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L46
            if (r3 != 0) goto L92
            monitor-exit(r0)
            return r6
        L92:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE     // Catch: java.lang.Throwable -> L46
            com.vdodsodjsdt.N1mT85AVNMY84KnH4 r3 = (com.vdodsodjsdt.N1mT85AVNMY84KnH4) r3     // Catch: java.lang.Throwable -> L46
            r3.getClass()     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = "key"
            com.vdodsodjsdt.ej6unYlOWMDF.pYmKDYlAmhudp(r1, r4)     // Catch: java.lang.Throwable -> L46
            java.util.LinkedHashMap r3 = r3.VxUQ9tBhpHJ2AAEDNW8sghc4m     // Catch: java.lang.Throwable -> L46
            r3.remove(r1)     // Catch: java.lang.Throwable -> L46
            int r1 = r5.V57tEvNfxZVVcOCAOih5PKr     // Catch: java.lang.Throwable -> L46
            java.lang.String r3 = "value"
            com.vdodsodjsdt.ej6unYlOWMDF.pYmKDYlAmhudp(r2, r3)     // Catch: java.lang.Throwable -> L46
            int r1 = r1 + (-1)
            r5.V57tEvNfxZVVcOCAOih5PKr = r1     // Catch: java.lang.Throwable -> L46
            monitor-exit(r0)
            goto L2c
        Lb9:
            monitor-exit(r0)
            return r6
        Lbb:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L46
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L46
            throw r7     // Catch: java.lang.Throwable -> L46
        Lc3:
            monitor-exit(r0)
            throw r6
        Lc5:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.OBsbe4YQtB2vgUFxLzO6ssT0.M9e7PWhFYLD2lOGMker(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public View NSjgqmGjEzuugn2SsG1mZFP(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        ArrayList arrayList = (ArrayList) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.Irh5auREsoeV1C1RaBamlmy && wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(view2) >= i) || ((!staggeredGridLayoutManager.Irh5auREsoeV1C1RaBamlmy && wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.Irh5auREsoeV1C1RaBamlmy && wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(view3) <= i) || ((!staggeredGridLayoutManager.Irh5auREsoeV1C1RaBamlmy && wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public int V57tEvNfxZVVcOCAOih5PKr() {
        return ((StaggeredGridLayoutManager) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).Irh5auREsoeV1C1RaBamlmy ? LaeGQIruHQu81hfJldjMOQSVblH3x(r0.size() - 1, -1) : LaeGQIruHQu81hfJldjMOQSVblH3x(0, ((ArrayList) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).size());
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        View view = (View) ((ArrayList) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).get(r0.size() - 1);
        sqhEuPaG4yT6D7gwZf5yfbaPJBAN sqheupag4yt6d7gwzf5yfbapjban = (sqhEuPaG4yT6D7gwZf5yfbaPJBAN) view.getLayoutParams();
        this.V57tEvNfxZVVcOCAOih5PKr = ((StaggeredGridLayoutManager) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).ko09zE6UAgwkV.zzpBGItXfub0yWj(view);
        sqheupag4yt6d7gwzf5yfbapjban.getClass();
    }

    public int ZLZeBXTMq0zDztBxtRTuCHrapQ(int i) {
        int i2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).size() == 0) {
            return i;
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    public int ZfQNn8hdWlEQ5cR94249PDsLR() {
        return ((StaggeredGridLayoutManager) this.ZLZeBXTMq0zDztBxtRTuCHrapQ).Irh5auREsoeV1C1RaBamlmy ? LaeGQIruHQu81hfJldjMOQSVblH3x(0, ((ArrayList) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).size()) : LaeGQIruHQu81hfJldjMOQSVblH3x(r0.size() - 1, -1);
    }

    public String toString() {
        String str;
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                synchronized (((FG8LIxsgYiLSfhN0jYKIKr) this.ZLZeBXTMq0zDztBxtRTuCHrapQ)) {
                    try {
                        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x + i;
                        str = "LruCache[maxSize=" + this.zzpBGItXfub0yWj + ",hits=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + ",misses=" + this.LaeGQIruHQu81hfJldjMOQSVblH3x + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public Object zIvmSL0wzmmKGc3X39b2Gw2mUGE(Object obj) {
        ej6unYlOWMDF.pYmKDYlAmhudp(obj, "key");
        synchronized (((FG8LIxsgYiLSfhN0jYKIKr) this.ZLZeBXTMq0zDztBxtRTuCHrapQ)) {
            N1mT85AVNMY84KnH4 n1mT85AVNMY84KnH4 = (N1mT85AVNMY84KnH4) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            n1mT85AVNMY84KnH4.getClass();
            Object obj2 = n1mT85AVNMY84KnH4.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(obj);
            if (obj2 != null) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR++;
                return obj2;
            }
            this.LaeGQIruHQu81hfJldjMOQSVblH3x++;
            return null;
        }
    }

    public void zzpBGItXfub0yWj() {
        ((ArrayList) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).clear();
        this.zzpBGItXfub0yWj = Integer.MIN_VALUE;
        this.V57tEvNfxZVVcOCAOih5PKr = Integer.MIN_VALUE;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
    }

    public OBsbe4YQtB2vgUFxLzO6ssT0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = staggeredGridLayoutManager;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new ArrayList();
        this.zzpBGItXfub0yWj = Integer.MIN_VALUE;
        this.V57tEvNfxZVVcOCAOih5PKr = Integer.MIN_VALUE;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
    }
}
