package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class MkvBTCkp5aUsEYdslusuFmia {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater V57tEvNfxZVVcOCAOih5PKr = AtomicReferenceFieldUpdater.newUpdater(MkvBTCkp5aUsEYdslusuFmia.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater ZfQNn8hdWlEQ5cR94249PDsLR = AtomicReferenceFieldUpdater.newUpdater(MkvBTCkp5aUsEYdslusuFmia.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater LaeGQIruHQu81hfJldjMOQSVblH3x = AtomicReferenceFieldUpdater.newUpdater(MkvBTCkp5aUsEYdslusuFmia.class, Object.class, "_removedRef$volatile");

    public final MkvBTCkp5aUsEYdslusuFmia GI83zq0G8e7zkn() {
        MkvBTCkp5aUsEYdslusuFmia mkvBTCkp5aUsEYdslusuFmia;
        Object objNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP();
        ojY8eU1icxQRBAcsi0ysrfc43Jo ojy8eu1icxqrbacsi0ysrfc43jo = objNSjgqmGjEzuugn2SsG1mZFP instanceof ojY8eU1icxQRBAcsi0ysrfc43Jo ? (ojY8eU1icxQRBAcsi0ysrfc43Jo) objNSjgqmGjEzuugn2SsG1mZFP : null;
        if (ojy8eu1icxqrbacsi0ysrfc43jo != null && (mkvBTCkp5aUsEYdslusuFmia = ojy8eu1icxqrbacsi0ysrfc43jo.VxUQ9tBhpHJ2AAEDNW8sghc4m) != null) {
            return mkvBTCkp5aUsEYdslusuFmia;
        }
        ej6unYlOWMDF.Ca81ebIan1u(objNSjgqmGjEzuugn2SsG1mZFP, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (MkvBTCkp5aUsEYdslusuFmia) objNSjgqmGjEzuugn2SsG1mZFP;
    }

    public boolean M9e7PWhFYLD2lOGMker() {
        return NSjgqmGjEzuugn2SsG1mZFP() instanceof ojY8eU1icxQRBAcsi0ysrfc43Jo;
    }

    public final Object NSjgqmGjEzuugn2SsG1mZFP() {
        while (true) {
            Object obj = V57tEvNfxZVVcOCAOih5PKr.get(this);
            if (!(obj instanceof ZWTS2K4yymjCBrc)) {
                return obj;
            }
            ((ZWTS2K4yymjCBrc) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
        }
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(MkvBTCkp5aUsEYdslusuFmia mkvBTCkp5aUsEYdslusuFmia) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ZfQNn8hdWlEQ5cR94249PDsLR;
            MkvBTCkp5aUsEYdslusuFmia mkvBTCkp5aUsEYdslusuFmia2 = (MkvBTCkp5aUsEYdslusuFmia) atomicReferenceFieldUpdater.get(mkvBTCkp5aUsEYdslusuFmia);
            if (NSjgqmGjEzuugn2SsG1mZFP() != mkvBTCkp5aUsEYdslusuFmia) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(mkvBTCkp5aUsEYdslusuFmia, mkvBTCkp5aUsEYdslusuFmia2, this)) {
                if (atomicReferenceFieldUpdater.get(mkvBTCkp5aUsEYdslusuFmia) != mkvBTCkp5aUsEYdslusuFmia2) {
                    break;
                }
            }
            if (M9e7PWhFYLD2lOGMker()) {
                mkvBTCkp5aUsEYdslusuFmia.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                return;
            }
            return;
        }
    }

    public String toString() {
        return new oyDl2oX8ZryVxiOGeKnp4Wx(this, hRrPPME7ytOB7ba.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + hRrPPME7ytOB7ba.KUYypEB4eNWOZWVDpH(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r6 = ((com.vdodsodjsdt.ojY8eU1icxQRBAcsi0ysrfc43Jo) r6).VxUQ9tBhpHJ2AAEDNW8sghc4m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vdodsodjsdt.MkvBTCkp5aUsEYdslusuFmia zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = com.vdodsodjsdt.MkvBTCkp5aUsEYdslusuFmia.ZfQNn8hdWlEQ5cR94249PDsLR
            java.lang.Object r1 = r0.get(r9)
            com.vdodsodjsdt.MkvBTCkp5aUsEYdslusuFmia r1 = (com.vdodsodjsdt.MkvBTCkp5aUsEYdslusuFmia) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = com.vdodsodjsdt.MkvBTCkp5aUsEYdslusuFmia.V57tEvNfxZVVcOCAOih5PKr
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L2d
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            goto L2d
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.M9e7PWhFYLD2lOGMker()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
        L2d:
            return r3
        L2e:
            boolean r7 = r6 instanceof com.vdodsodjsdt.ZWTS2K4yymjCBrc
            if (r7 == 0) goto L38
            com.vdodsodjsdt.ZWTS2K4yymjCBrc r6 = (com.vdodsodjsdt.ZWTS2K4yymjCBrc) r6
            r6.VxUQ9tBhpHJ2AAEDNW8sghc4m(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof com.vdodsodjsdt.ojY8eU1icxQRBAcsi0ysrfc43Jo
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            com.vdodsodjsdt.ojY8eU1icxQRBAcsi0ysrfc43Jo r6 = (com.vdodsodjsdt.ojY8eU1icxQRBAcsi0ysrfc43Jo) r6
            com.vdodsodjsdt.MkvBTCkp5aUsEYdslusuFmia r6 = r6.VxUQ9tBhpHJ2AAEDNW8sghc4m
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            com.vdodsodjsdt.MkvBTCkp5aUsEYdslusuFmia r3 = (com.vdodsodjsdt.MkvBTCkp5aUsEYdslusuFmia) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            com.vdodsodjsdt.ej6unYlOWMDF.Ca81ebIan1u(r6, r4)
            r4 = r6
            com.vdodsodjsdt.MkvBTCkp5aUsEYdslusuFmia r4 = (com.vdodsodjsdt.MkvBTCkp5aUsEYdslusuFmia) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.MkvBTCkp5aUsEYdslusuFmia.zIvmSL0wzmmKGc3X39b2Gw2mUGE():com.vdodsodjsdt.MkvBTCkp5aUsEYdslusuFmia");
    }
}
