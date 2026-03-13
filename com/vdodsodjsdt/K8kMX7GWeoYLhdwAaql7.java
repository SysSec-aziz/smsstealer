package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class K8kMX7GWeoYLhdwAaql7 extends AQYAU4MRDJq {
    public final UVzEPm75LoPBkSIomQaI29asGliB q1wNbhk2O6;

    public K8kMX7GWeoYLhdwAaql7(int i, UVzEPm75LoPBkSIomQaI29asGliB uVzEPm75LoPBkSIomQaI29asGliB) {
        super(i);
        this.q1wNbhk2O6 = uVzEPm75LoPBkSIomQaI29asGliB;
        if (uVzEPm75LoPBkSIomQaI29asGliB != UVzEPm75LoPBkSIomQaI29asGliB.V57tEvNfxZVVcOCAOih5PKr) {
            if (i < 1) {
                throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(AQYAU4MRDJq.class).zzpBGItXfub0yWj() + " instead").toString());
        }
    }

    @Override // com.vdodsodjsdt.AQYAU4MRDJq, com.vdodsodjsdt.EdnYZXOoM7r9jw15REV
    public final Object HzCpKshMOoaw76hFcbOVRYMeRd(Object obj) {
        return iKANjmyTSxO6v6UuLPdu7DxOjlS(obj, false);
    }

    @Override // com.vdodsodjsdt.AQYAU4MRDJq, com.vdodsodjsdt.EdnYZXOoM7r9jw15REV
    public final Object NSjgqmGjEzuugn2SsG1mZFP(tfu79AIgc4CGAZaxd4HhD tfu79aigc4cgazaxd4hhd, Object obj) throws Throwable {
        if (iKANjmyTSxO6v6UuLPdu7DxOjlS(obj, true) instanceof Ci8uXFAgzbChe9pCc7tK9K6wm) {
            throw ko09zE6UAgwkV();
        }
        return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object iKANjmyTSxO6v6UuLPdu7DxOjlS(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            com.vdodsodjsdt.UVzEPm75LoPBkSIomQaI29asGliB r1 = r15.q1wNbhk2O6
            com.vdodsodjsdt.UVzEPm75LoPBkSIomQaI29asGliB r2 = com.vdodsodjsdt.UVzEPm75LoPBkSIomQaI29asGliB.LaeGQIruHQu81hfJldjMOQSVblH3x
            com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG r8 = com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.HzCpKshMOoaw76hFcbOVRYMeRd(r16)
            boolean r2 = r1 instanceof com.vdodsodjsdt.EMqSntyUjq5FSlFLUvKlJs
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r6 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.ZfQNn8hdWlEQ5cR94249PDsLR
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = com.vdodsodjsdt.AQYAU4MRDJq.NSjgqmGjEzuugn2SsG1mZFP
            java.lang.Object r1 = r1.get(r15)
            com.vdodsodjsdt.yvLS7lHGi6hg9x r1 = (com.vdodsodjsdt.yvLS7lHGi6hg9x) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = com.vdodsodjsdt.AQYAU4MRDJq.ZfQNn8hdWlEQ5cR94249PDsLR
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.vBGA6pPLqSMuYGvprl270j7(r2, r7)
            int r9 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.V57tEvNfxZVVcOCAOih5PKr
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            com.vdodsodjsdt.yvLS7lHGi6hg9x r2 = com.vdodsodjsdt.AQYAU4MRDJq.VxUQ9tBhpHJ2AAEDNW8sghc4m(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.ko09zE6UAgwkV()
            com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm r2 = new com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = com.vdodsodjsdt.AQYAU4MRDJq.LaeGQIruHQu81hfJldjMOQSVblH3x(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = com.vdodsodjsdt.AQYAU4MRDJq.LaeGQIruHQu81hfJldjMOQSVblH3x
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.VxUQ9tBhpHJ2AAEDNW8sghc4m()
        L7e:
            java.lang.Throwable r1 = r15.ko09zE6UAgwkV()
            com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm r2 = new com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.NSjgqmGjEzuugn2SsG1mZFP()
            java.lang.Throwable r1 = r15.ko09zE6UAgwkV()
            com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm r2 = new com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof com.vdodsodjsdt.jJewgcdeJJkpBkFlty5mYj6fPQ1lg
            if (r3 == 0) goto La6
            com.vdodsodjsdt.jJewgcdeJJkpBkFlty5mYj6fPQ1lg r6 = (com.vdodsodjsdt.jJewgcdeJJkpBkFlty5mYj6fPQ1lg) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.VxUQ9tBhpHJ2AAEDNW8sghc4m(r1, r12)
        Lae:
            long r3 = r1.V57tEvNfxZVVcOCAOih5PKr
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.q1wNbhk2O6(r3)
        Lb6:
            return r8
        Lb7:
            r1.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.K8kMX7GWeoYLhdwAaql7.iKANjmyTSxO6v6UuLPdu7DxOjlS(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // com.vdodsodjsdt.AQYAU4MRDJq
    public final boolean q11o1hieEkZDhF1MGOZI26oZiDT() {
        return this.q1wNbhk2O6 == UVzEPm75LoPBkSIomQaI29asGliB.ZfQNn8hdWlEQ5cR94249PDsLR;
    }
}
