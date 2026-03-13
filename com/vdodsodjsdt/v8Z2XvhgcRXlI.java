package com.vdodsodjsdt;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class v8Z2XvhgcRXlI implements JpF3NGAE1OfSX0 {
    public final File VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final AtomicBoolean zzpBGItXfub0yWj = new AtomicBoolean(false);

    public v8Z2XvhgcRXlI(File file) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.vdodsodjsdt.v8Z2XvhgcRXlI] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.vdodsodjsdt.v8Z2XvhgcRXlI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.vdodsodjsdt.v8Z2XvhgcRXlI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object VxUQ9tBhpHJ2AAEDNW8sghc4m(com.vdodsodjsdt.v8Z2XvhgcRXlI r9, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r10) throws java.lang.Throwable {
        /*
            com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5 r0 = com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5.p59rPv72J9
            boolean r1 = r10 instanceof com.vdodsodjsdt.QYFAqoGAYTO8flrUSnWQ
            if (r1 == 0) goto L15
            r1 = r10
            com.vdodsodjsdt.QYFAqoGAYTO8flrUSnWQ r1 = (com.vdodsodjsdt.QYFAqoGAYTO8flrUSnWQ) r1
            int r2 = r1.M9e7PWhFYLD2lOGMker
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.M9e7PWhFYLD2lOGMker = r2
            goto L1a
        L15:
            com.vdodsodjsdt.QYFAqoGAYTO8flrUSnWQ r1 = new com.vdodsodjsdt.QYFAqoGAYTO8flrUSnWQ
            r1.<init>(r9, r10)
        L1a:
            java.lang.Object r10 = r1.NSjgqmGjEzuugn2SsG1mZFP
            int r2 = r1.M9e7PWhFYLD2lOGMker
            r3 = 2
            r4 = 1
            r5 = 0
            com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU r6 = com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r1.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            java.io.Closeable r9 = (java.io.Closeable) r9
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r10)     // Catch: java.lang.Throwable -> L32
            goto L9c
        L32:
            r10 = move-exception
            goto La4
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.io.FileInputStream r9 = r1.ZLZeBXTMq0zDztBxtRTuCHrapQ
            java.lang.Object r2 = r1.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            com.vdodsodjsdt.v8Z2XvhgcRXlI r2 = (com.vdodsodjsdt.v8Z2XvhgcRXlI) r2
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r10)     // Catch: java.lang.Throwable -> L47
            goto L6c
        L47:
            r10 = move-exception
            goto L77
        L49:
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r10)
            java.util.concurrent.atomic.AtomicBoolean r10 = r9.zzpBGItXfub0yWj
            boolean r10 = r10.get()
            if (r10 != 0) goto Lb0
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7d
            java.io.File r2 = r9.VxUQ9tBhpHJ2AAEDNW8sghc4m     // Catch: java.io.FileNotFoundException -> L7d
            r10.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7d
            r1.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r9     // Catch: java.lang.Throwable -> L72
            r1.ZLZeBXTMq0zDztBxtRTuCHrapQ = r10     // Catch: java.lang.Throwable -> L72
            r1.M9e7PWhFYLD2lOGMker = r4     // Catch: java.lang.Throwable -> L72
            com.vdodsodjsdt.wg2qx8o8rURUQteWo0QkSZAxg4eSO r2 = r0.q1wNbhk2O6(r10)     // Catch: java.lang.Throwable -> L72
            if (r2 != r6) goto L68
            goto L98
        L68:
            r8 = r2
            r2 = r9
            r9 = r10
            r10 = r8
        L6c:
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.p59rPv72J9(r9, r5)     // Catch: java.io.FileNotFoundException -> L70
            return r10
        L70:
            r9 = r2
            goto L7d
        L72:
            r2 = move-exception
            r8 = r2
            r2 = r9
            r9 = r10
            r10 = r8
        L77:
            throw r10     // Catch: java.lang.Throwable -> L78
        L78:
            r7 = move-exception
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.p59rPv72J9(r9, r10)     // Catch: java.io.FileNotFoundException -> L70
            throw r7     // Catch: java.io.FileNotFoundException -> L70
        L7d:
            java.io.File r10 = r9.VxUQ9tBhpHJ2AAEDNW8sghc4m
            boolean r10 = r10.exists()
            if (r10 == 0) goto Laa
            java.io.FileInputStream r10 = new java.io.FileInputStream
            java.io.File r9 = r9.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r10.<init>(r9)
            r1.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r10     // Catch: java.lang.Throwable -> La0
            r1.ZLZeBXTMq0zDztBxtRTuCHrapQ = r5     // Catch: java.lang.Throwable -> La0
            r1.M9e7PWhFYLD2lOGMker = r3     // Catch: java.lang.Throwable -> La0
            com.vdodsodjsdt.wg2qx8o8rURUQteWo0QkSZAxg4eSO r9 = r0.q1wNbhk2O6(r10)     // Catch: java.lang.Throwable -> La0
            if (r9 != r6) goto L99
        L98:
            return r6
        L99:
            r8 = r10
            r10 = r9
            r9 = r8
        L9c:
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.p59rPv72J9(r9, r5)
            return r10
        La0:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        La4:
            throw r10     // Catch: java.lang.Throwable -> La5
        La5:
            r0 = move-exception
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.p59rPv72J9(r9, r10)
            throw r0
        Laa:
            com.vdodsodjsdt.wg2qx8o8rURUQteWo0QkSZAxg4eSO r9 = new com.vdodsodjsdt.wg2qx8o8rURUQteWo0QkSZAxg4eSO
            r9.<init>(r4)
            return r9
        Lb0:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "This scope has already been closed."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.v8Z2XvhgcRXlI.VxUQ9tBhpHJ2AAEDNW8sghc4m(com.vdodsodjsdt.v8Z2XvhgcRXlI, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD):java.lang.Object");
    }

    @Override // com.vdodsodjsdt.JpF3NGAE1OfSX0
    public final void close() {
        this.zzpBGItXfub0yWj.set(true);
    }
}
