package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class yvLS7lHGi6hg9x extends fw6arzf1nhE87EaA {
    public final AQYAU4MRDJq LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ AtomicReferenceArray zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public yvLS7lHGi6hg9x(long j, yvLS7lHGi6hg9x yvls7lhgi6hg9x, AQYAU4MRDJq aQYAU4MRDJq, int i) {
        super(j, yvls7lhgi6hg9x, i);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = aQYAU4MRDJq;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new AtomicReferenceArray(Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj * 2);
    }

    public final Object HzCpKshMOoaw76hFcbOVRYMeRd(int i) {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.get((i * 2) + 1);
    }

    public final void KUYypEB4eNWOZWVDpH(int i, boolean z) {
        if (z) {
            AQYAU4MRDJq aQYAU4MRDJq = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            ej6unYlOWMDF.p59rPv72J9(aQYAU4MRDJq);
            aQYAU4MRDJq.qygqjTppWwx992((this.V57tEvNfxZVVcOCAOih5PKr * ((long) Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj)) + ((long) i));
        }
        NSjgqmGjEzuugn2SsG1mZFP();
    }

    public final boolean M9e7PWhFYLD2lOGMker(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        q1wNbhk2O6(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // com.vdodsodjsdt.fw6arzf1nhE87EaA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(int r5, com.vdodsodjsdt.D73WsmU258PapcWZb45SFW r6) {
        /*
            r4 = this;
            int r6 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.HzCpKshMOoaw76hFcbOVRYMeRd(r5)
            boolean r1 = r6 instanceof com.vdodsodjsdt.jJewgcdeJJkpBkFlty5mYj6fPQ1lg
            com.vdodsodjsdt.AQYAU4MRDJq r2 = r4.LaeGQIruHQu81hfJldjMOQSVblH3x
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof com.vdodsodjsdt.HJ6BhjEv78F7zsv
            if (r1 == 0) goto L21
            goto L62
        L21:
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r1 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.M9e7PWhFYLD2lOGMker
            if (r6 == r1) goto L59
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r1 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.HzCpKshMOoaw76hFcbOVRYMeRd
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r1 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.ZLZeBXTMq0zDztBxtRTuCHrapQ
            if (r6 == r1) goto L11
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r1 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            if (r6 != r1) goto L33
            goto L11
        L33:
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r5 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.GI83zq0G8e7zkn
            if (r6 == r5) goto L7c
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r5 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.ZfQNn8hdWlEQ5cR94249PDsLR
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r5 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.KUYypEB4eNWOZWVDpH
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.q1wNbhk2O6(r5, r3)
            if (r0 == 0) goto L7c
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r2)
            return
        L62:
            if (r0 == 0) goto L67
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r1 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.M9e7PWhFYLD2lOGMker
            goto L69
        L67:
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r1 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.HzCpKshMOoaw76hFcbOVRYMeRd
        L69:
            boolean r6 = r4.M9e7PWhFYLD2lOGMker(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.q1wNbhk2O6(r5, r3)
            r6 = r0 ^ 1
            r4.KUYypEB4eNWOZWVDpH(r5, r6)
            if (r0 == 0) goto L7c
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.yvLS7lHGi6hg9x.ZLZeBXTMq0zDztBxtRTuCHrapQ(int, com.vdodsodjsdt.D73WsmU258PapcWZb45SFW):void");
    }

    public final void p59rPv72J9(int i, Object obj) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.set((i * 2) + 1, obj);
    }

    public final void q1wNbhk2O6(int i, Object obj) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.set(i * 2, obj);
    }

    @Override // com.vdodsodjsdt.fw6arzf1nhE87EaA
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj;
    }
}
