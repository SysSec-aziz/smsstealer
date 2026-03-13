package com.vdodsodjsdt;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class Ra0wxJbsOwDYCmrrSAs {
    public static final /* synthetic */ AtomicIntegerFieldUpdater zzpBGItXfub0yWj = AtomicIntegerFieldUpdater.newUpdater(Ra0wxJbsOwDYCmrrSAs.class, "_size$volatile");
    public ErBfq9NXKMau0dmIu8LfNce2kOtT[] VxUQ9tBhpHJ2AAEDNW8sghc4m;
    private volatile /* synthetic */ int _size$volatile;

    public final void V57tEvNfxZVVcOCAOih5PKr(int i) {
        while (i > 0) {
            ErBfq9NXKMau0dmIu8LfNce2kOtT[] erBfq9NXKMau0dmIu8LfNce2kOtTArr = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            ej6unYlOWMDF.p59rPv72J9(erBfq9NXKMau0dmIu8LfNce2kOtTArr);
            int i2 = (i - 1) / 2;
            ErBfq9NXKMau0dmIu8LfNce2kOtT erBfq9NXKMau0dmIu8LfNce2kOtT = erBfq9NXKMau0dmIu8LfNce2kOtTArr[i2];
            ej6unYlOWMDF.p59rPv72J9(erBfq9NXKMau0dmIu8LfNce2kOtT);
            ErBfq9NXKMau0dmIu8LfNce2kOtT erBfq9NXKMau0dmIu8LfNce2kOtT2 = erBfq9NXKMau0dmIu8LfNce2kOtTArr[i];
            ej6unYlOWMDF.p59rPv72J9(erBfq9NXKMau0dmIu8LfNce2kOtT2);
            if (erBfq9NXKMau0dmIu8LfNce2kOtT.compareTo(erBfq9NXKMau0dmIu8LfNce2kOtT2) <= 0) {
                return;
            }
            ZfQNn8hdWlEQ5cR94249PDsLR(i, i2);
            i = i2;
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(ErBfq9NXKMau0dmIu8LfNce2kOtT erBfq9NXKMau0dmIu8LfNce2kOtT) {
        erBfq9NXKMau0dmIu8LfNce2kOtT.ZfQNn8hdWlEQ5cR94249PDsLR((hM2WrRpV30e0b) this);
        ErBfq9NXKMau0dmIu8LfNce2kOtT[] erBfq9NXKMau0dmIu8LfNce2kOtTArr = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = zzpBGItXfub0yWj;
        if (erBfq9NXKMau0dmIu8LfNce2kOtTArr == null) {
            erBfq9NXKMau0dmIu8LfNce2kOtTArr = new ErBfq9NXKMau0dmIu8LfNce2kOtT[4];
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = erBfq9NXKMau0dmIu8LfNce2kOtTArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= erBfq9NXKMau0dmIu8LfNce2kOtTArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(erBfq9NXKMau0dmIu8LfNce2kOtTArr, atomicIntegerFieldUpdater.get(this) * 2);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(...)");
            erBfq9NXKMau0dmIu8LfNce2kOtTArr = (ErBfq9NXKMau0dmIu8LfNce2kOtT[]) objArrCopyOf;
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = erBfq9NXKMau0dmIu8LfNce2kOtTArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        erBfq9NXKMau0dmIu8LfNce2kOtTArr[i] = erBfq9NXKMau0dmIu8LfNce2kOtT;
        erBfq9NXKMau0dmIu8LfNce2kOtT.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        V57tEvNfxZVVcOCAOih5PKr(i);
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(int i, int i2) {
        ErBfq9NXKMau0dmIu8LfNce2kOtT[] erBfq9NXKMau0dmIu8LfNce2kOtTArr = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ej6unYlOWMDF.p59rPv72J9(erBfq9NXKMau0dmIu8LfNce2kOtTArr);
        ErBfq9NXKMau0dmIu8LfNce2kOtT erBfq9NXKMau0dmIu8LfNce2kOtT = erBfq9NXKMau0dmIu8LfNce2kOtTArr[i2];
        ej6unYlOWMDF.p59rPv72J9(erBfq9NXKMau0dmIu8LfNce2kOtT);
        ErBfq9NXKMau0dmIu8LfNce2kOtT erBfq9NXKMau0dmIu8LfNce2kOtT2 = erBfq9NXKMau0dmIu8LfNce2kOtTArr[i];
        ej6unYlOWMDF.p59rPv72J9(erBfq9NXKMau0dmIu8LfNce2kOtT2);
        erBfq9NXKMau0dmIu8LfNce2kOtTArr[i] = erBfq9NXKMau0dmIu8LfNce2kOtT;
        erBfq9NXKMau0dmIu8LfNce2kOtTArr[i2] = erBfq9NXKMau0dmIu8LfNce2kOtT2;
        erBfq9NXKMau0dmIu8LfNce2kOtT.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        erBfq9NXKMau0dmIu8LfNce2kOtT2.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vdodsodjsdt.ErBfq9NXKMau0dmIu8LfNce2kOtT zzpBGItXfub0yWj(int r9) {
        /*
            r8 = this;
            com.vdodsodjsdt.ErBfq9NXKMau0dmIu8LfNce2kOtT[] r0 = r8.VxUQ9tBhpHJ2AAEDNW8sghc4m
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = com.vdodsodjsdt.Ra0wxJbsOwDYCmrrSAs.zzpBGItXfub0yWj
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.ZfQNn8hdWlEQ5cR94249PDsLR(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r4)
            r5 = r0[r2]
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.ZfQNn8hdWlEQ5cR94249PDsLR(r9, r2)
            r8.V57tEvNfxZVVcOCAOih5PKr(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            com.vdodsodjsdt.ErBfq9NXKMau0dmIu8LfNce2kOtT[] r5 = r8.VxUQ9tBhpHJ2AAEDNW8sghc4m
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r6)
            r7 = r5[r4]
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r4)
            r5 = r5[r2]
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.ZfQNn8hdWlEQ5cR94249PDsLR(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            com.vdodsodjsdt.ej6unYlOWMDF.p59rPv72J9(r9)
            r2 = 0
            r9.ZfQNn8hdWlEQ5cR94249PDsLR(r2)
            r9.ZfQNn8hdWlEQ5cR94249PDsLR = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.Ra0wxJbsOwDYCmrrSAs.zzpBGItXfub0yWj(int):com.vdodsodjsdt.ErBfq9NXKMau0dmIu8LfNce2kOtT");
    }
}
