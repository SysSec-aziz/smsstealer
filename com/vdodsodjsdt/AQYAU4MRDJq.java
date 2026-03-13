package com.vdodsodjsdt;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class AQYAU4MRDJq implements tw4aeftrJT {
    public final int V57tEvNfxZVVcOCAOih5PKr;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater ZfQNn8hdWlEQ5cR94249PDsLR = AtomicLongFieldUpdater.newUpdater(AQYAU4MRDJq.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater LaeGQIruHQu81hfJldjMOQSVblH3x = AtomicLongFieldUpdater.newUpdater(AQYAU4MRDJq.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater zIvmSL0wzmmKGc3X39b2Gw2mUGE = AtomicLongFieldUpdater.newUpdater(AQYAU4MRDJq.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater ZLZeBXTMq0zDztBxtRTuCHrapQ = AtomicLongFieldUpdater.newUpdater(AQYAU4MRDJq.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater NSjgqmGjEzuugn2SsG1mZFP = AtomicReferenceFieldUpdater.newUpdater(AQYAU4MRDJq.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater GI83zq0G8e7zkn = AtomicReferenceFieldUpdater.newUpdater(AQYAU4MRDJq.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater M9e7PWhFYLD2lOGMker = AtomicReferenceFieldUpdater.newUpdater(AQYAU4MRDJq.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater HzCpKshMOoaw76hFcbOVRYMeRd = AtomicReferenceFieldUpdater.newUpdater(AQYAU4MRDJq.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater KUYypEB4eNWOZWVDpH = AtomicReferenceFieldUpdater.newUpdater(AQYAU4MRDJq.class, Object.class, "closeHandler$volatile");

    public AQYAU4MRDJq(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        if (i < 0) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        yvLS7lHGi6hg9x yvls7lhgi6hg9x = Aczz3h6vlLrT9zArublj9acB.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(this);
        yvLS7lHGi6hg9x yvls7lhgi6hg9x2 = new yvLS7lHGi6hg9x(0L, null, this, 3);
        this.sendSegment$volatile = yvls7lhgi6hg9x2;
        this.receiveSegment$volatile = yvls7lhgi6hg9x2;
        if (w0Wu95l8dVNw5rZMRu()) {
            yvls7lhgi6hg9x2 = Aczz3h6vlLrT9zArublj9acB.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            ej6unYlOWMDF.Ca81ebIan1u(yvls7lhgi6hg9x2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = yvls7lhgi6hg9x2;
        this._closeCause$volatile = Aczz3h6vlLrT9zArublj9acB.jW7EiD0YL6xkbB158jMUzhWNWb1y;
    }

    public static final int LaeGQIruHQu81hfJldjMOQSVblH3x(AQYAU4MRDJq aQYAU4MRDJq, yvLS7lHGi6hg9x yvls7lhgi6hg9x, int i, Object obj, long j, Object obj2, boolean z) {
        yvls7lhgi6hg9x.q1wNbhk2O6(i, obj);
        if (z) {
            return aQYAU4MRDJq.y1NaPKTl7R18DOr6e8i5(yvls7lhgi6hg9x, i, obj, j, obj2, z);
        }
        Object objHzCpKshMOoaw76hFcbOVRYMeRd = yvls7lhgi6hg9x.HzCpKshMOoaw76hFcbOVRYMeRd(i);
        if (objHzCpKshMOoaw76hFcbOVRYMeRd == null) {
            if (aQYAU4MRDJq.zIvmSL0wzmmKGc3X39b2Gw2mUGE(j)) {
                if (yvls7lhgi6hg9x.M9e7PWhFYLD2lOGMker(i, null, Aczz3h6vlLrT9zArublj9acB.ZfQNn8hdWlEQ5cR94249PDsLR)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (yvls7lhgi6hg9x.M9e7PWhFYLD2lOGMker(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objHzCpKshMOoaw76hFcbOVRYMeRd instanceof jJewgcdeJJkpBkFlty5mYj6fPQ1lg) {
            yvls7lhgi6hg9x.q1wNbhk2O6(i, null);
            if (aQYAU4MRDJq.vE4yDIjexsP2lGjLaTcB(objHzCpKshMOoaw76hFcbOVRYMeRd, obj)) {
                yvls7lhgi6hg9x.p59rPv72J9(i, Aczz3h6vlLrT9zArublj9acB.GI83zq0G8e7zkn);
                return 0;
            }
            aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = Aczz3h6vlLrT9zArublj9acB.HzCpKshMOoaw76hFcbOVRYMeRd;
            if (yvls7lhgi6hg9x.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getAndSet((i * 2) + 1, aqhhl68tqrgijcmgb3dy2ylk3vn) == aqhhl68tqrgijcmgb3dy2ylk3vn) {
                return 5;
            }
            yvls7lhgi6hg9x.KUYypEB4eNWOZWVDpH(i, true);
            return 5;
        }
        return aQYAU4MRDJq.y1NaPKTl7R18DOr6e8i5(yvls7lhgi6hg9x, i, obj, j, obj2, z);
    }

    public static boolean O1xDAlBZZlZdoEf747lCFHld(Object obj) {
        if (obj instanceof Z1jxNQy7ZL) {
            return Aczz3h6vlLrT9zArublj9acB.VxUQ9tBhpHJ2AAEDNW8sghc4m((Z1jxNQy7ZL) obj, hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object SuB3hEmTmbbRGAhtvOOmfKEon(com.vdodsodjsdt.AQYAU4MRDJq r13, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof com.vdodsodjsdt.JF6rLCNF7v8
            if (r0 == 0) goto L14
            r0 = r14
            com.vdodsodjsdt.JF6rLCNF7v8 r0 = (com.vdodsodjsdt.JF6rLCNF7v8) r0
            int r1 = r0.NSjgqmGjEzuugn2SsG1mZFP
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.NSjgqmGjEzuugn2SsG1mZFP = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.vdodsodjsdt.JF6rLCNF7v8 r0 = new com.vdodsodjsdt.JF6rLCNF7v8
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            int r0 = r6.NSjgqmGjEzuugn2SsG1mZFP
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r14)
            com.vdodsodjsdt.Xl5jd1MMPZ r14 = (com.vdodsodjsdt.Xl5jd1MMPZ) r14
            java.lang.Object r13 = r14.VxUQ9tBhpHJ2AAEDNW8sghc4m
            return r13
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = com.vdodsodjsdt.AQYAU4MRDJq.GI83zq0G8e7zkn
            java.lang.Object r14 = r14.get(r13)
            com.vdodsodjsdt.yvLS7lHGi6hg9x r14 = (com.vdodsodjsdt.yvLS7lHGi6hg9x) r14
        L3e:
            boolean r0 = r13.TaDO7ogis3aEiWEtq()
            if (r0 == 0) goto L4e
            java.lang.Throwable r13 = r13.h3jnZRsdwYJfY9UhQCkbvWciwvFHv()
            com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm r14 = new com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm
            r14.<init>(r13)
            return r14
        L4e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = com.vdodsodjsdt.AQYAU4MRDJq.LaeGQIruHQu81hfJldjMOQSVblH3x
            long r4 = r0.getAndIncrement(r13)
            int r0 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj
            long r2 = (long) r0
            long r7 = r4 / r2
            long r2 = r4 % r2
            int r3 = (int) r2
            long r9 = r14.V57tEvNfxZVVcOCAOih5PKr
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L6b
            com.vdodsodjsdt.yvLS7lHGi6hg9x r0 = r13.Ca81ebIan1u(r7, r14)
            if (r0 != 0) goto L69
            goto L3e
        L69:
            r2 = r0
            goto L6c
        L6b:
            r2 = r14
        L6c:
            r12 = 0
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.HVEwbdULInpTNa0IG(r8, r9, r10, r12)
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r14 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.q1wNbhk2O6
            if (r13 == r14) goto La0
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r14 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.Ca81ebIan1u
            if (r13 != r14) goto L8b
            long r13 = r7.jW7EiD0YL6xkbB158jMUzhWNWb1y()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L88
            r2.VxUQ9tBhpHJ2AAEDNW8sghc4m()
        L88:
            r14 = r2
            r13 = r7
            goto L3e
        L8b:
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r14 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.p59rPv72J9
            if (r13 != r14) goto L9c
            r6.NSjgqmGjEzuugn2SsG1mZFP = r1
            r1 = r7
            java.lang.Object r13 = r1.pzqP2AqKW6J5PO8zCKnW(r2, r3, r4, r6)
            com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU r14 = com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr
            if (r13 != r14) goto L9b
            return r14
        L9b:
            return r13
        L9c:
            r2.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            return r13
        La0:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.AQYAU4MRDJq.SuB3hEmTmbbRGAhtvOOmfKEon(com.vdodsodjsdt.AQYAU4MRDJq, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD):java.lang.Object");
    }

    public static final yvLS7lHGi6hg9x VxUQ9tBhpHJ2AAEDNW8sghc4m(AQYAU4MRDJq aQYAU4MRDJq, long j, yvLS7lHGi6hg9x yvls7lhgi6hg9x) {
        Object objCa81ebIan1u;
        AQYAU4MRDJq aQYAU4MRDJq2;
        yvLS7lHGi6hg9x yvls7lhgi6hg9x2 = Aczz3h6vlLrT9zArublj9acB.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        P0lmAwnLpK27RmAQyCZ3NK8k72 p0lmAwnLpK27RmAQyCZ3NK8k72 = P0lmAwnLpK27RmAQyCZ3NK8k72.HzCpKshMOoaw76hFcbOVRYMeRd;
        loop0: while (true) {
            objCa81ebIan1u = KfeOQNOupsCg6878zi4e.Ca81ebIan1u(yvls7lhgi6hg9x, j, p0lmAwnLpK27RmAQyCZ3NK8k72);
            if (!F44whnLsbQ.y1NaPKTl7R18DOr6e8i5(objCa81ebIan1u)) {
                fw6arzf1nhE87EaA fw6arzf1nhe87eaaAXO0LSrt8bKV = F44whnLsbQ.aXO0LSrt8bKV(objCa81ebIan1u);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = NSjgqmGjEzuugn2SsG1mZFP;
                    fw6arzf1nhE87EaA fw6arzf1nhe87eaa = (fw6arzf1nhE87EaA) atomicReferenceFieldUpdater.get(aQYAU4MRDJq);
                    if (fw6arzf1nhe87eaa.V57tEvNfxZVVcOCAOih5PKr >= fw6arzf1nhe87eaaAXO0LSrt8bKV.V57tEvNfxZVVcOCAOih5PKr) {
                        break loop0;
                    }
                    if (!fw6arzf1nhe87eaaAXO0LSrt8bKV.GI83zq0G8e7zkn()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(aQYAU4MRDJq, fw6arzf1nhe87eaa, fw6arzf1nhe87eaaAXO0LSrt8bKV)) {
                        if (atomicReferenceFieldUpdater.get(aQYAU4MRDJq) != fw6arzf1nhe87eaa) {
                            if (fw6arzf1nhe87eaaAXO0LSrt8bKV.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
                                fw6arzf1nhe87eaaAXO0LSrt8bKV.ZfQNn8hdWlEQ5cR94249PDsLR();
                            }
                        }
                    }
                    if (fw6arzf1nhe87eaa.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
                        fw6arzf1nhe87eaa.ZfQNn8hdWlEQ5cR94249PDsLR();
                    }
                }
            } else {
                break;
            }
        }
        boolean zY1NaPKTl7R18DOr6e8i5 = F44whnLsbQ.y1NaPKTl7R18DOr6e8i5(objCa81ebIan1u);
        AtomicLongFieldUpdater atomicLongFieldUpdater = LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (zY1NaPKTl7R18DOr6e8i5) {
            aQYAU4MRDJq.Irh5auREsoeV1C1RaBamlmy();
            if (yvls7lhgi6hg9x.V57tEvNfxZVVcOCAOih5PKr * ((long) Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj) < atomicLongFieldUpdater.get(aQYAU4MRDJq)) {
                yvls7lhgi6hg9x.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                return null;
            }
        } else {
            yvLS7lHGi6hg9x yvls7lhgi6hg9x3 = (yvLS7lHGi6hg9x) F44whnLsbQ.aXO0LSrt8bKV(objCa81ebIan1u);
            long j2 = yvls7lhgi6hg9x3.V57tEvNfxZVVcOCAOih5PKr;
            if (j2 <= j) {
                return yvls7lhgi6hg9x3;
            }
            long j3 = ((long) Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj) * j2;
            while (true) {
                long j4 = ZfQNn8hdWlEQ5cR94249PDsLR.get(aQYAU4MRDJq);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    aQYAU4MRDJq2 = aQYAU4MRDJq;
                    break;
                }
                aQYAU4MRDJq2 = aQYAU4MRDJq;
                if (ZfQNn8hdWlEQ5cR94249PDsLR.compareAndSet(aQYAU4MRDJq2, j4, (((long) ((int) (j4 >> 60))) << 60) + j5)) {
                    break;
                }
                aQYAU4MRDJq = aQYAU4MRDJq2;
            }
            if (j2 * ((long) Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj) < atomicLongFieldUpdater.get(aQYAU4MRDJq2)) {
                yvls7lhgi6hg9x3.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
        }
        return null;
    }

    public static final void ZfQNn8hdWlEQ5cR94249PDsLR(AQYAU4MRDJq aQYAU4MRDJq, Object obj, YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW) {
        yAf4BMDpiCAb4hYaN6VqW.ZLZeBXTMq0zDztBxtRTuCHrapQ(ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(aQYAU4MRDJq.ko09zE6UAgwkV()));
    }

    public static void f6ZQsR6bPLvvCDNXOUc(AQYAU4MRDJq aQYAU4MRDJq) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if ((atomicLongFieldUpdater.addAndGet(aQYAU4MRDJq, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(aQYAU4MRDJq) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final yvLS7lHGi6hg9x Ca81ebIan1u(long j, yvLS7lHGi6hg9x yvls7lhgi6hg9x) {
        Object objCa81ebIan1u;
        long j2;
        yvLS7lHGi6hg9x yvls7lhgi6hg9x2 = Aczz3h6vlLrT9zArublj9acB.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        P0lmAwnLpK27RmAQyCZ3NK8k72 p0lmAwnLpK27RmAQyCZ3NK8k72 = P0lmAwnLpK27RmAQyCZ3NK8k72.HzCpKshMOoaw76hFcbOVRYMeRd;
        loop0: while (true) {
            objCa81ebIan1u = KfeOQNOupsCg6878zi4e.Ca81ebIan1u(yvls7lhgi6hg9x, j, p0lmAwnLpK27RmAQyCZ3NK8k72);
            if (!F44whnLsbQ.y1NaPKTl7R18DOr6e8i5(objCa81ebIan1u)) {
                fw6arzf1nhE87EaA fw6arzf1nhe87eaaAXO0LSrt8bKV = F44whnLsbQ.aXO0LSrt8bKV(objCa81ebIan1u);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GI83zq0G8e7zkn;
                    fw6arzf1nhE87EaA fw6arzf1nhe87eaa = (fw6arzf1nhE87EaA) atomicReferenceFieldUpdater.get(this);
                    if (fw6arzf1nhe87eaa.V57tEvNfxZVVcOCAOih5PKr >= fw6arzf1nhe87eaaAXO0LSrt8bKV.V57tEvNfxZVVcOCAOih5PKr) {
                        break loop0;
                    }
                    if (!fw6arzf1nhe87eaaAXO0LSrt8bKV.GI83zq0G8e7zkn()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, fw6arzf1nhe87eaa, fw6arzf1nhe87eaaAXO0LSrt8bKV)) {
                        if (atomicReferenceFieldUpdater.get(this) != fw6arzf1nhe87eaa) {
                            if (fw6arzf1nhe87eaaAXO0LSrt8bKV.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
                                fw6arzf1nhe87eaaAXO0LSrt8bKV.ZfQNn8hdWlEQ5cR94249PDsLR();
                            }
                        }
                    }
                    if (fw6arzf1nhe87eaa.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
                        fw6arzf1nhe87eaa.ZfQNn8hdWlEQ5cR94249PDsLR();
                    }
                }
            } else {
                break;
            }
        }
        if (F44whnLsbQ.y1NaPKTl7R18DOr6e8i5(objCa81ebIan1u)) {
            Irh5auREsoeV1C1RaBamlmy();
            if (yvls7lhgi6hg9x.V57tEvNfxZVVcOCAOih5PKr * ((long) Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj) < jW7EiD0YL6xkbB158jMUzhWNWb1y()) {
                yvls7lhgi6hg9x.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                return null;
            }
        } else {
            yvLS7lHGi6hg9x yvls7lhgi6hg9x3 = (yvLS7lHGi6hg9x) F44whnLsbQ.aXO0LSrt8bKV(objCa81ebIan1u);
            long j3 = yvls7lhgi6hg9x3.V57tEvNfxZVVcOCAOih5PKr;
            if (!w0Wu95l8dVNw5rZMRu() && j <= zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(this) / ((long) Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = M9e7PWhFYLD2lOGMker;
                    fw6arzf1nhE87EaA fw6arzf1nhe87eaa2 = (fw6arzf1nhE87EaA) atomicReferenceFieldUpdater2.get(this);
                    if (fw6arzf1nhe87eaa2.V57tEvNfxZVVcOCAOih5PKr >= j3 || !yvls7lhgi6hg9x3.GI83zq0G8e7zkn()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, fw6arzf1nhe87eaa2, yvls7lhgi6hg9x3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != fw6arzf1nhe87eaa2) {
                            if (yvls7lhgi6hg9x3.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
                                yvls7lhgi6hg9x3.ZfQNn8hdWlEQ5cR94249PDsLR();
                            }
                        }
                    }
                    if (fw6arzf1nhe87eaa2.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
                        fw6arzf1nhe87eaa2.ZfQNn8hdWlEQ5cR94249PDsLR();
                    }
                }
            }
            if (j3 <= j) {
                return yvls7lhgi6hg9x3;
            }
            long j4 = j3 * ((long) Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj);
            do {
                j2 = LaeGQIruHQu81hfJldjMOQSVblH3x.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!LaeGQIruHQu81hfJldjMOQSVblH3x.compareAndSet(this, j2, j4));
            if (j3 * ((long) Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj) < jW7EiD0YL6xkbB158jMUzhWNWb1y()) {
                yvls7lhgi6hg9x3.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
        }
        return null;
    }

    @Override // com.vdodsodjsdt.dJaiaGWkeWaMlzD
    public final Object GI83zq0G8e7zkn() {
        yvLS7lHGi6hg9x yvls7lhgi6hg9x;
        AtomicLongFieldUpdater atomicLongFieldUpdater = LaeGQIruHQu81hfJldjMOQSVblH3x;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = ZfQNn8hdWlEQ5cR94249PDsLR.get(this);
        if (vBGA6pPLqSMuYGvprl270j7(j2, true)) {
            return new Ci8uXFAgzbChe9pCc7tK9K6wm(h3jnZRsdwYJfY9UhQCkbvWciwvFHv());
        }
        long j3 = j2 & 1152921504606846975L;
        EMqSntyUjq5FSlFLUvKlJs eMqSntyUjq5FSlFLUvKlJs = Xl5jd1MMPZ.zzpBGItXfub0yWj;
        if (j >= j3) {
            return eMqSntyUjq5FSlFLUvKlJs;
        }
        Object obj = Aczz3h6vlLrT9zArublj9acB.HzCpKshMOoaw76hFcbOVRYMeRd;
        yvLS7lHGi6hg9x yvls7lhgi6hg9x2 = (yvLS7lHGi6hg9x) GI83zq0G8e7zkn.get(this);
        while (!TaDO7ogis3aEiWEtq()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (yvls7lhgi6hg9x2.V57tEvNfxZVVcOCAOih5PKr != j5) {
                yvLS7lHGi6hg9x yvls7lhgi6hg9xCa81ebIan1u = Ca81ebIan1u(j5, yvls7lhgi6hg9x2);
                if (yvls7lhgi6hg9xCa81ebIan1u == null) {
                    continue;
                } else {
                    yvls7lhgi6hg9x = yvls7lhgi6hg9xCa81ebIan1u;
                }
            } else {
                yvls7lhgi6hg9x = yvls7lhgi6hg9x2;
            }
            Object objHVEwbdULInpTNa0IG = HVEwbdULInpTNa0IG(yvls7lhgi6hg9x, i, andIncrement, obj);
            yvLS7lHGi6hg9x yvls7lhgi6hg9x3 = yvls7lhgi6hg9x;
            if (objHVEwbdULInpTNa0IG == Aczz3h6vlLrT9zArublj9acB.q1wNbhk2O6) {
                jJewgcdeJJkpBkFlty5mYj6fPQ1lg jjewgcdejjkpbkflty5myj6fpq1lg = obj instanceof jJewgcdeJJkpBkFlty5mYj6fPQ1lg ? (jJewgcdeJJkpBkFlty5mYj6fPQ1lg) obj : null;
                if (jjewgcdejjkpbkflty5myj6fpq1lg != null) {
                    jjewgcdejjkpbkflty5myj6fpq1lg.VxUQ9tBhpHJ2AAEDNW8sghc4m(yvls7lhgi6hg9x3, i);
                }
                qygqjTppWwx992(andIncrement);
                yvls7lhgi6hg9x3.NSjgqmGjEzuugn2SsG1mZFP();
                return eMqSntyUjq5FSlFLUvKlJs;
            }
            if (objHVEwbdULInpTNa0IG != Aczz3h6vlLrT9zArublj9acB.Ca81ebIan1u) {
                if (objHVEwbdULInpTNa0IG == Aczz3h6vlLrT9zArublj9acB.p59rPv72J9) {
                    throw new IllegalStateException("unexpected");
                }
                yvls7lhgi6hg9x3.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                return objHVEwbdULInpTNa0IG;
            }
            if (andIncrement < jW7EiD0YL6xkbB158jMUzhWNWb1y()) {
                yvls7lhgi6hg9x3.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
            yvls7lhgi6hg9x2 = yvls7lhgi6hg9x3;
        }
        return new Ci8uXFAgzbChe9pCc7tK9K6wm(h3jnZRsdwYJfY9UhQCkbvWciwvFHv());
    }

    public final Object HVEwbdULInpTNa0IG(yvLS7lHGi6hg9x yvls7lhgi6hg9x, int i, long j, Object obj) {
        Object objHzCpKshMOoaw76hFcbOVRYMeRd = yvls7lhgi6hg9x.HzCpKshMOoaw76hFcbOVRYMeRd(i);
        AtomicReferenceArray atomicReferenceArray = yvls7lhgi6hg9x.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ZfQNn8hdWlEQ5cR94249PDsLR;
        if (objHzCpKshMOoaw76hFcbOVRYMeRd == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return Aczz3h6vlLrT9zArublj9acB.p59rPv72J9;
                }
                if (yvls7lhgi6hg9x.M9e7PWhFYLD2lOGMker(i, objHzCpKshMOoaw76hFcbOVRYMeRd, obj)) {
                    p59rPv72J9();
                    return Aczz3h6vlLrT9zArublj9acB.q1wNbhk2O6;
                }
            }
        } else if (objHzCpKshMOoaw76hFcbOVRYMeRd == Aczz3h6vlLrT9zArublj9acB.ZfQNn8hdWlEQ5cR94249PDsLR && yvls7lhgi6hg9x.M9e7PWhFYLD2lOGMker(i, objHzCpKshMOoaw76hFcbOVRYMeRd, Aczz3h6vlLrT9zArublj9acB.GI83zq0G8e7zkn)) {
            p59rPv72J9();
            Object obj2 = atomicReferenceArray.get(i * 2);
            yvls7lhgi6hg9x.q1wNbhk2O6(i, null);
            return obj2;
        }
        while (true) {
            Object objHzCpKshMOoaw76hFcbOVRYMeRd2 = yvls7lhgi6hg9x.HzCpKshMOoaw76hFcbOVRYMeRd(i);
            if (objHzCpKshMOoaw76hFcbOVRYMeRd2 == null || objHzCpKshMOoaw76hFcbOVRYMeRd2 == Aczz3h6vlLrT9zArublj9acB.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (yvls7lhgi6hg9x.M9e7PWhFYLD2lOGMker(i, objHzCpKshMOoaw76hFcbOVRYMeRd2, Aczz3h6vlLrT9zArublj9acB.NSjgqmGjEzuugn2SsG1mZFP)) {
                        p59rPv72J9();
                        return Aczz3h6vlLrT9zArublj9acB.Ca81ebIan1u;
                    }
                } else {
                    if (obj == null) {
                        return Aczz3h6vlLrT9zArublj9acB.p59rPv72J9;
                    }
                    if (yvls7lhgi6hg9x.M9e7PWhFYLD2lOGMker(i, objHzCpKshMOoaw76hFcbOVRYMeRd2, obj)) {
                        p59rPv72J9();
                        return Aczz3h6vlLrT9zArublj9acB.q1wNbhk2O6;
                    }
                }
            } else if (objHzCpKshMOoaw76hFcbOVRYMeRd2 != Aczz3h6vlLrT9zArublj9acB.ZfQNn8hdWlEQ5cR94249PDsLR) {
                aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = Aczz3h6vlLrT9zArublj9acB.M9e7PWhFYLD2lOGMker;
                if (objHzCpKshMOoaw76hFcbOVRYMeRd2 == aqhhl68tqrgijcmgb3dy2ylk3vn) {
                    return Aczz3h6vlLrT9zArublj9acB.Ca81ebIan1u;
                }
                if (objHzCpKshMOoaw76hFcbOVRYMeRd2 == Aczz3h6vlLrT9zArublj9acB.NSjgqmGjEzuugn2SsG1mZFP) {
                    return Aczz3h6vlLrT9zArublj9acB.Ca81ebIan1u;
                }
                if (objHzCpKshMOoaw76hFcbOVRYMeRd2 == Aczz3h6vlLrT9zArublj9acB.KUYypEB4eNWOZWVDpH) {
                    p59rPv72J9();
                    return Aczz3h6vlLrT9zArublj9acB.Ca81ebIan1u;
                }
                if (objHzCpKshMOoaw76hFcbOVRYMeRd2 != Aczz3h6vlLrT9zArublj9acB.ZLZeBXTMq0zDztBxtRTuCHrapQ && yvls7lhgi6hg9x.M9e7PWhFYLD2lOGMker(i, objHzCpKshMOoaw76hFcbOVRYMeRd2, Aczz3h6vlLrT9zArublj9acB.zIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
                    boolean z = objHzCpKshMOoaw76hFcbOVRYMeRd2 instanceof HJ6BhjEv78F7zsv;
                    if (z) {
                        objHzCpKshMOoaw76hFcbOVRYMeRd2 = ((HJ6BhjEv78F7zsv) objHzCpKshMOoaw76hFcbOVRYMeRd2).VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    }
                    if (O1xDAlBZZlZdoEf747lCFHld(objHzCpKshMOoaw76hFcbOVRYMeRd2)) {
                        yvls7lhgi6hg9x.p59rPv72J9(i, Aczz3h6vlLrT9zArublj9acB.GI83zq0G8e7zkn);
                        p59rPv72J9();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        yvls7lhgi6hg9x.q1wNbhk2O6(i, null);
                        return obj3;
                    }
                    yvls7lhgi6hg9x.p59rPv72J9(i, aqhhl68tqrgijcmgb3dy2ylk3vn);
                    yvls7lhgi6hg9x.NSjgqmGjEzuugn2SsG1mZFP();
                    if (z) {
                        p59rPv72J9();
                    }
                    return Aczz3h6vlLrT9zArublj9acB.Ca81ebIan1u;
                }
            } else if (yvls7lhgi6hg9x.M9e7PWhFYLD2lOGMker(i, objHzCpKshMOoaw76hFcbOVRYMeRd2, Aczz3h6vlLrT9zArublj9acB.GI83zq0G8e7zkn)) {
                p59rPv72J9();
                Object obj4 = atomicReferenceArray.get(i * 2);
                yvls7lhgi6hg9x.q1wNbhk2O6(i, null);
                return obj4;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // com.vdodsodjsdt.EdnYZXOoM7r9jw15REV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object HzCpKshMOoaw76hFcbOVRYMeRd(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = com.vdodsodjsdt.AQYAU4MRDJq.ZfQNn8hdWlEQ5cR94249PDsLR
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.vBGA6pPLqSMuYGvprl270j7(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.zIvmSL0wzmmKGc3X39b2Gw2mUGE(r1)
            r1 = r1 ^ r10
        L1b:
            com.vdodsodjsdt.EMqSntyUjq5FSlFLUvKlJs r13 = com.vdodsodjsdt.Xl5jd1MMPZ.zzpBGItXfub0yWj
            if (r1 == 0) goto L20
            return r13
        L20:
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r6 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.M9e7PWhFYLD2lOGMker
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = com.vdodsodjsdt.AQYAU4MRDJq.NSjgqmGjEzuugn2SsG1mZFP
            java.lang.Object r1 = r1.get(r15)
            com.vdodsodjsdt.yvLS7lHGi6hg9x r1 = (com.vdodsodjsdt.yvLS7lHGi6hg9x) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.vBGA6pPLqSMuYGvprl270j7(r2, r9)
            int r14 = com.vdodsodjsdt.Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.V57tEvNfxZVVcOCAOih5PKr
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            com.vdodsodjsdt.yvLS7lHGi6hg9x r3 = VxUQ9tBhpHJ2AAEDNW8sghc4m(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.ko09zE6UAgwkV()
            com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm r2 = new com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = LaeGQIruHQu81hfJldjMOQSVblH3x(r0, r1, r2, r3, r4, r6, r7)
            com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG r3 = com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.VxUQ9tBhpHJ2AAEDNW8sghc4m()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = com.vdodsodjsdt.AQYAU4MRDJq.LaeGQIruHQu81hfJldjMOQSVblH3x
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.VxUQ9tBhpHJ2AAEDNW8sghc4m()
        L8a:
            java.lang.Throwable r1 = r15.ko09zE6UAgwkV()
            com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm r2 = new com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.NSjgqmGjEzuugn2SsG1mZFP()
            java.lang.Throwable r1 = r15.ko09zE6UAgwkV()
            com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm r2 = new com.vdodsodjsdt.Ci8uXFAgzbChe9pCc7tK9K6wm
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof com.vdodsodjsdt.jJewgcdeJJkpBkFlty5mYj6fPQ1lg
            if (r3 == 0) goto Lb2
            com.vdodsodjsdt.jJewgcdeJJkpBkFlty5mYj6fPQ1lg r6 = (com.vdodsodjsdt.jJewgcdeJJkpBkFlty5mYj6fPQ1lg) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.VxUQ9tBhpHJ2AAEDNW8sghc4m(r1, r2)
        Lb9:
            r1.NSjgqmGjEzuugn2SsG1mZFP()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.AQYAU4MRDJq.HzCpKshMOoaw76hFcbOVRYMeRd(java.lang.Object):java.lang.Object");
    }

    public final boolean Irh5auREsoeV1C1RaBamlmy() {
        return vBGA6pPLqSMuYGvprl270j7(ZfQNn8hdWlEQ5cR94249PDsLR.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r1 = (com.vdodsodjsdt.yvLS7lHGi6hg9x) ((com.vdodsodjsdt.D0vuyCrFBAWQbRciLh0X) com.vdodsodjsdt.D0vuyCrFBAWQbRciLh0X.zzpBGItXfub0yWj.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vdodsodjsdt.yvLS7lHGi6hg9x KUYypEB4eNWOZWVDpH(long r13) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.AQYAU4MRDJq.KUYypEB4eNWOZWVDpH(long):com.vdodsodjsdt.yvLS7lHGi6hg9x");
    }

    public final boolean M9e7PWhFYLD2lOGMker(Throwable th, boolean z) {
        AQYAU4MRDJq aQYAU4MRDJq;
        boolean z2;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ZfQNn8hdWlEQ5cR94249PDsLR;
        if (!z) {
            aQYAU4MRDJq = this;
            break;
        }
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if (((int) (j5 >> 60)) != 0) {
                aQYAU4MRDJq = this;
                break;
            }
            yvLS7lHGi6hg9x yvls7lhgi6hg9x = Aczz3h6vlLrT9zArublj9acB.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            aQYAU4MRDJq = this;
        } while (!atomicLongFieldUpdater.compareAndSet(aQYAU4MRDJq, j5, (j5 & 1152921504606846975L) + (((long) 1) << 60)));
        aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = Aczz3h6vlLrT9zArublj9acB.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = HzCpKshMOoaw76hFcbOVRYMeRd;
            if (atomicReferenceFieldUpdater.compareAndSet(this, aqhhl68tqrgijcmgb3dy2ylk3vn, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != aqhhl68tqrgijcmgb3dy2ylk3vn) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(aQYAU4MRDJq, j4, (((long) 3) << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(aQYAU4MRDJq, j, (j3 << 60) + j2));
        }
        Irh5auREsoeV1C1RaBamlmy();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = KUYypEB4eNWOZWVDpH;
                obj = atomicReferenceFieldUpdater2.get(this);
                aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn2 = obj == null ? Aczz3h6vlLrT9zArublj9acB.pYmKDYlAmhudp : Aczz3h6vlLrT9zArublj9acB.ko09zE6UAgwkV;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, aqhhl68tqrgijcmgb3dy2ylk3vn2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                F44whnLsbQ.V57tEvNfxZVVcOCAOih5PKr(1, obj);
                ((vP57smEEh3YGCxzJ) obj).GI83zq0G8e7zkn(h3jnZRsdwYJfY9UhQCkbvWciwvFHv());
                return z2;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        ZfQNn8hdWlEQ5cR94249PDsLR(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163 A[RETURN] */
    @Override // com.vdodsodjsdt.EdnYZXOoM7r9jw15REV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object NSjgqmGjEzuugn2SsG1mZFP(com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r23, java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.AQYAU4MRDJq.NSjgqmGjEzuugn2SsG1mZFP(com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RhfGHxtXxy0M0grmp2jkRjQg(long r5, com.vdodsodjsdt.yvLS7lHGi6hg9x r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.V57tEvNfxZVVcOCAOih5PKr
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            com.vdodsodjsdt.D0vuyCrFBAWQbRciLh0X r0 = r7.zzpBGItXfub0yWj()
            com.vdodsodjsdt.yvLS7lHGi6hg9x r0 = (com.vdodsodjsdt.yvLS7lHGi6hg9x) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.V57tEvNfxZVVcOCAOih5PKr()
            if (r5 == 0) goto L22
            com.vdodsodjsdt.D0vuyCrFBAWQbRciLh0X r5 = r7.zzpBGItXfub0yWj()
            com.vdodsodjsdt.yvLS7lHGi6hg9x r5 = (com.vdodsodjsdt.yvLS7lHGi6hg9x) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = com.vdodsodjsdt.AQYAU4MRDJq.M9e7PWhFYLD2lOGMker
            java.lang.Object r6 = r5.get(r4)
            com.vdodsodjsdt.fw6arzf1nhE87EaA r6 = (com.vdodsodjsdt.fw6arzf1nhE87EaA) r6
            long r0 = r6.V57tEvNfxZVVcOCAOih5PKr
            long r2 = r7.V57tEvNfxZVVcOCAOih5PKr
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.GI83zq0G8e7zkn()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.LaeGQIruHQu81hfJldjMOQSVblH3x()
            if (r5 == 0) goto L49
            r6.ZfQNn8hdWlEQ5cR94249PDsLR()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.LaeGQIruHQu81hfJldjMOQSVblH3x()
            if (r5 == 0) goto L22
            r7.ZfQNn8hdWlEQ5cR94249PDsLR()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.AQYAU4MRDJq.RhfGHxtXxy0M0grmp2jkRjQg(long, com.vdodsodjsdt.yvLS7lHGi6hg9x):void");
    }

    public final boolean TaDO7ogis3aEiWEtq() {
        return vBGA6pPLqSMuYGvprl270j7(ZfQNn8hdWlEQ5cR94249PDsLR.get(this), true);
    }

    @Override // com.vdodsodjsdt.dJaiaGWkeWaMlzD
    public final void V57tEvNfxZVVcOCAOih5PKr(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        M9e7PWhFYLD2lOGMker(cancellationException, true);
    }

    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(Throwable th) {
        return M9e7PWhFYLD2lOGMker(th, false);
    }

    public final void aXO0LSrt8bKV(jJewgcdeJJkpBkFlty5mYj6fPQ1lg jjewgcdejjkpbkflty5myj6fpq1lg, boolean z) {
        if (jjewgcdejjkpbkflty5myj6fpq1lg instanceof Z1jxNQy7ZL) {
            ((IvfXhmjM3e3K) jjewgcdejjkpbkflty5myj6fpq1lg).ZLZeBXTMq0zDztBxtRTuCHrapQ(ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(z ? pYmKDYlAmhudp() : ko09zE6UAgwkV()));
            return;
        }
        if (jjewgcdejjkpbkflty5myj6fpq1lg instanceof pzx45oMWWz) {
            ((pzx45oMWWz) jjewgcdejjkpbkflty5myj6fpq1lg).V57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ(new Xl5jd1MMPZ(new Ci8uXFAgzbChe9pCc7tK9K6wm(h3jnZRsdwYJfY9UhQCkbvWciwvFHv())));
            return;
        }
        if (!(jjewgcdejjkpbkflty5myj6fpq1lg instanceof fqChXYa8o3dXHKjdsT9dZR)) {
            throw new IllegalStateException(("Unexpected waiter: " + jjewgcdejjkpbkflty5myj6fpq1lg).toString());
        }
        fqChXYa8o3dXHKjdsT9dZR fqchxya8o3dxhkjdst9dzr = (fqChXYa8o3dXHKjdsT9dZR) jjewgcdejjkpbkflty5myj6fpq1lg;
        YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW = fqchxya8o3dxhkjdst9dzr.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.p59rPv72J9(yAf4BMDpiCAb4hYaN6VqW);
        fqchxya8o3dxhkjdst9dzr.ZfQNn8hdWlEQ5cR94249PDsLR = null;
        fqchxya8o3dxhkjdst9dzr.V57tEvNfxZVVcOCAOih5PKr = Aczz3h6vlLrT9zArublj9acB.KUYypEB4eNWOZWVDpH;
        Throwable thH3jnZRsdwYJfY9UhQCkbvWciwvFHv = fqchxya8o3dxhkjdst9dzr.LaeGQIruHQu81hfJldjMOQSVblH3x.h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
        if (thH3jnZRsdwYJfY9UhQCkbvWciwvFHv == null) {
            yAf4BMDpiCAb4hYaN6VqW.ZLZeBXTMq0zDztBxtRTuCHrapQ(Boolean.FALSE);
        } else {
            yAf4BMDpiCAb4hYaN6VqW.ZLZeBXTMq0zDztBxtRTuCHrapQ(ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(thH3jnZRsdwYJfY9UhQCkbvWciwvFHv));
        }
    }

    public final Throwable h3jnZRsdwYJfY9UhQCkbvWciwvFHv() {
        return (Throwable) HzCpKshMOoaw76hFcbOVRYMeRd.get(this);
    }

    @Override // com.vdodsodjsdt.dJaiaGWkeWaMlzD
    public final fqChXYa8o3dXHKjdsT9dZR iterator() {
        return new fqChXYa8o3dXHKjdsT9dZR(this);
    }

    public final long jW7EiD0YL6xkbB158jMUzhWNWb1y() {
        return ZfQNn8hdWlEQ5cR94249PDsLR.get(this) & 1152921504606846975L;
    }

    public final Throwable ko09zE6UAgwkV() {
        Throwable thH3jnZRsdwYJfY9UhQCkbvWciwvFHv = h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
        return thH3jnZRsdwYJfY9UhQCkbvWciwvFHv == null ? new SujEuz8z0U57KmSiV("Channel was closed") : thH3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        f6ZQsR6bPLvvCDNXOUc(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p59rPv72J9() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.AQYAU4MRDJq.p59rPv72J9():void");
    }

    public final Throwable pYmKDYlAmhudp() {
        Throwable thH3jnZRsdwYJfY9UhQCkbvWciwvFHv = h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
        return thH3jnZRsdwYJfY9UhQCkbvWciwvFHv == null ? new DLQjTn7m1XZHueJCz("Channel was closed") : thH3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object pzqP2AqKW6J5PO8zCKnW(com.vdodsodjsdt.yvLS7lHGi6hg9x r14, int r15, long r16, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.AQYAU4MRDJq.pzqP2AqKW6J5PO8zCKnW(com.vdodsodjsdt.yvLS7lHGi6hg9x, int, long, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD):java.lang.Object");
    }

    public boolean q11o1hieEkZDhF1MGOZI26oZiDT() {
        return false;
    }

    public final void q1wNbhk2O6(long j) {
        yvLS7lHGi6hg9x yvls7lhgi6hg9x = (yvLS7lHGi6hg9x) GI83zq0G8e7zkn.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = LaeGQIruHQu81hfJldjMOQSVblH3x;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.V57tEvNfxZVVcOCAOih5PKr) + j2, zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = Aczz3h6vlLrT9zArublj9acB.zzpBGItXfub0yWj;
                long j4 = j2 / j3;
                int i = (int) (j2 % j3);
                if (yvls7lhgi6hg9x.V57tEvNfxZVVcOCAOih5PKr != j4) {
                    yvLS7lHGi6hg9x yvls7lhgi6hg9xCa81ebIan1u = Ca81ebIan1u(j4, yvls7lhgi6hg9x);
                    if (yvls7lhgi6hg9xCa81ebIan1u != null) {
                        yvls7lhgi6hg9x = yvls7lhgi6hg9xCa81ebIan1u;
                    }
                }
                yvLS7lHGi6hg9x yvls7lhgi6hg9x2 = yvls7lhgi6hg9x;
                if (HVEwbdULInpTNa0IG(yvls7lhgi6hg9x2, i, j2, null) != Aczz3h6vlLrT9zArublj9acB.Ca81ebIan1u || j2 < jW7EiD0YL6xkbB158jMUzhWNWb1y()) {
                    yvls7lhgi6hg9x2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                }
                yvls7lhgi6hg9x = yvls7lhgi6hg9x2;
            }
        }
    }

    public final Object qNPQb1obP7(tfu79AIgc4CGAZaxd4HhD tfu79aigc4cgazaxd4hhd, Object obj) {
        YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW = new YAf4BMDpiCAb4hYaN6VqW(1, sGipz63rTUmSj3uFDvOtzihao.qNPQb1obP7(tfu79aigc4cgazaxd4hhd));
        yAf4BMDpiCAb4hYaN6VqW.vBGA6pPLqSMuYGvprl270j7();
        yAf4BMDpiCAb4hYaN6VqW.ZLZeBXTMq0zDztBxtRTuCHrapQ(ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(ko09zE6UAgwkV()));
        Object objF6ZQsR6bPLvvCDNXOUc = yAf4BMDpiCAb4hYaN6VqW.f6ZQsR6bPLvvCDNXOUc();
        return objF6ZQsR6bPLvvCDNXOUc == w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr ? objF6ZQsR6bPLvvCDNXOUc : hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public final void qygqjTppWwx992(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        AQYAU4MRDJq aQYAU4MRDJq = this;
        if (aQYAU4MRDJq.w0Wu95l8dVNw5rZMRu()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (atomicLongFieldUpdater.get(aQYAU4MRDJq) > j) {
                break;
            } else {
                aQYAU4MRDJq = this;
            }
        }
        int i = Aczz3h6vlLrT9zArublj9acB.V57tEvNfxZVVcOCAOih5PKr;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = ZLZeBXTMq0zDztBxtRTuCHrapQ;
            if (i2 < i) {
                long j2 = atomicLongFieldUpdater.get(aQYAU4MRDJq);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(aQYAU4MRDJq)) && j2 == atomicLongFieldUpdater.get(aQYAU4MRDJq)) {
                    return;
                } else {
                    i2++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(aQYAU4MRDJq);
                    if (atomicLongFieldUpdater2.compareAndSet(aQYAU4MRDJq, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        aQYAU4MRDJq = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(aQYAU4MRDJq);
                    long j5 = atomicLongFieldUpdater2.get(aQYAU4MRDJq);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(aQYAU4MRDJq)) {
                        break;
                    }
                    if (z) {
                        aQYAU4MRDJq = this;
                    } else {
                        aQYAU4MRDJq = this;
                        atomicLongFieldUpdater2.compareAndSet(aQYAU4MRDJq, j5, 4611686018427387904L + j6);
                    }
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(aQYAU4MRDJq);
                    if (atomicLongFieldUpdater2.compareAndSet(aQYAU4MRDJq, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        aQYAU4MRDJq = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b2, code lost:
    
        r16 = r7;
        r3 = (com.vdodsodjsdt.yvLS7lHGi6hg9x) r3.zzpBGItXfub0yWj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01bb, code lost:
    
        if (r3 != null) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.AQYAU4MRDJq.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (com.vdodsodjsdt.yvLS7lHGi6hg9x) ((com.vdodsodjsdt.D0vuyCrFBAWQbRciLh0X) com.vdodsodjsdt.D0vuyCrFBAWQbRciLh0X.zzpBGItXfub0yWj.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean vBGA6pPLqSMuYGvprl270j7(long r14, boolean r16) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.AQYAU4MRDJq.vBGA6pPLqSMuYGvprl270j7(long, boolean):boolean");
    }

    public final boolean vE4yDIjexsP2lGjLaTcB(Object obj, Object obj2) {
        if (obj instanceof pzx45oMWWz) {
            return Aczz3h6vlLrT9zArublj9acB.VxUQ9tBhpHJ2AAEDNW8sghc4m(((pzx45oMWWz) obj).V57tEvNfxZVVcOCAOih5PKr, new Xl5jd1MMPZ(obj2), null);
        }
        if (!(obj instanceof fqChXYa8o3dXHKjdsT9dZR)) {
            if (obj instanceof Z1jxNQy7ZL) {
                return Aczz3h6vlLrT9zArublj9acB.VxUQ9tBhpHJ2AAEDNW8sghc4m((Z1jxNQy7ZL) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        fqChXYa8o3dXHKjdsT9dZR fqchxya8o3dxhkjdst9dzr = (fqChXYa8o3dXHKjdsT9dZR) obj;
        YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW = fqchxya8o3dxhkjdst9dzr.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.p59rPv72J9(yAf4BMDpiCAb4hYaN6VqW);
        fqchxya8o3dxhkjdst9dzr.ZfQNn8hdWlEQ5cR94249PDsLR = null;
        fqchxya8o3dxhkjdst9dzr.V57tEvNfxZVVcOCAOih5PKr = obj2;
        return Aczz3h6vlLrT9zArublj9acB.VxUQ9tBhpHJ2AAEDNW8sghc4m(yAf4BMDpiCAb4hYaN6VqW, Boolean.TRUE, null);
    }

    public final boolean w0Wu95l8dVNw5rZMRu() {
        long j = zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final int y1NaPKTl7R18DOr6e8i5(yvLS7lHGi6hg9x yvls7lhgi6hg9x, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objHzCpKshMOoaw76hFcbOVRYMeRd = yvls7lhgi6hg9x.HzCpKshMOoaw76hFcbOVRYMeRd(i);
            if (objHzCpKshMOoaw76hFcbOVRYMeRd == null) {
                if (!zIvmSL0wzmmKGc3X39b2Gw2mUGE(j) || z) {
                    if (z) {
                        if (yvls7lhgi6hg9x.M9e7PWhFYLD2lOGMker(i, null, Aczz3h6vlLrT9zArublj9acB.M9e7PWhFYLD2lOGMker)) {
                            yvls7lhgi6hg9x.NSjgqmGjEzuugn2SsG1mZFP();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (yvls7lhgi6hg9x.M9e7PWhFYLD2lOGMker(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (yvls7lhgi6hg9x.M9e7PWhFYLD2lOGMker(i, null, Aczz3h6vlLrT9zArublj9acB.ZfQNn8hdWlEQ5cR94249PDsLR)) {
                    break;
                }
            } else {
                if (objHzCpKshMOoaw76hFcbOVRYMeRd != Aczz3h6vlLrT9zArublj9acB.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = Aczz3h6vlLrT9zArublj9acB.HzCpKshMOoaw76hFcbOVRYMeRd;
                    if (objHzCpKshMOoaw76hFcbOVRYMeRd == aqhhl68tqrgijcmgb3dy2ylk3vn) {
                        yvls7lhgi6hg9x.q1wNbhk2O6(i, null);
                        return 5;
                    }
                    if (objHzCpKshMOoaw76hFcbOVRYMeRd == Aczz3h6vlLrT9zArublj9acB.NSjgqmGjEzuugn2SsG1mZFP) {
                        yvls7lhgi6hg9x.q1wNbhk2O6(i, null);
                        return 5;
                    }
                    if (objHzCpKshMOoaw76hFcbOVRYMeRd == Aczz3h6vlLrT9zArublj9acB.KUYypEB4eNWOZWVDpH) {
                        yvls7lhgi6hg9x.q1wNbhk2O6(i, null);
                        Irh5auREsoeV1C1RaBamlmy();
                        return 4;
                    }
                    yvls7lhgi6hg9x.q1wNbhk2O6(i, null);
                    if (objHzCpKshMOoaw76hFcbOVRYMeRd instanceof HJ6BhjEv78F7zsv) {
                        objHzCpKshMOoaw76hFcbOVRYMeRd = ((HJ6BhjEv78F7zsv) objHzCpKshMOoaw76hFcbOVRYMeRd).VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    }
                    if (vE4yDIjexsP2lGjLaTcB(objHzCpKshMOoaw76hFcbOVRYMeRd, obj)) {
                        yvls7lhgi6hg9x.p59rPv72J9(i, Aczz3h6vlLrT9zArublj9acB.GI83zq0G8e7zkn);
                        return 0;
                    }
                    if (yvls7lhgi6hg9x.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getAndSet((i * 2) + 1, aqhhl68tqrgijcmgb3dy2ylk3vn) != aqhhl68tqrgijcmgb3dy2ylk3vn) {
                        yvls7lhgi6hg9x.KUYypEB4eNWOZWVDpH(i, true);
                    }
                    return 5;
                }
                if (yvls7lhgi6hg9x.M9e7PWhFYLD2lOGMker(i, objHzCpKshMOoaw76hFcbOVRYMeRd, Aczz3h6vlLrT9zArublj9acB.ZfQNn8hdWlEQ5cR94249PDsLR)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(long j) {
        return j < zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(this) || j < LaeGQIruHQu81hfJldjMOQSVblH3x.get(this) + ((long) this.V57tEvNfxZVVcOCAOih5PKr);
    }

    @Override // com.vdodsodjsdt.dJaiaGWkeWaMlzD
    public final Object zzpBGItXfub0yWj(ZkHbFN0KVRlWXEXHHna5xX zkHbFN0KVRlWXEXHHna5xX) {
        return SuB3hEmTmbbRGAhtvOOmfKEon(this, zkHbFN0KVRlWXEXHHna5xX);
    }
}
