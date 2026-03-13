package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class iVLTCzs6QOGxGxxuJDLgxHoH9xIw extends v8Z2XvhgcRXlI {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzpBGItXfub0yWj(com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r6, java.lang.Object r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.vdodsodjsdt.F5liTfXydHhwBQo3xGbfVOuL7Ss0g
            if (r0 == 0) goto L13
            r0 = r6
            com.vdodsodjsdt.F5liTfXydHhwBQo3xGbfVOuL7Ss0g r0 = (com.vdodsodjsdt.F5liTfXydHhwBQo3xGbfVOuL7Ss0g) r0
            int r1 = r0.M9e7PWhFYLD2lOGMker
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.M9e7PWhFYLD2lOGMker = r1
            goto L18
        L13:
            com.vdodsodjsdt.F5liTfXydHhwBQo3xGbfVOuL7Ss0g r0 = new com.vdodsodjsdt.F5liTfXydHhwBQo3xGbfVOuL7Ss0g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.NSjgqmGjEzuugn2SsG1mZFP
            int r1 = r0.M9e7PWhFYLD2lOGMker
            com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG r2 = com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            java.io.FileOutputStream r7 = r0.ZLZeBXTMq0zDztBxtRTuCHrapQ
            java.io.FileOutputStream r0 = r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r6)     // Catch: java.lang.Throwable -> L2b
            goto L5e
        L2b:
            r6 = move-exception
            goto L6d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r6)
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.zzpBGItXfub0yWj
            boolean r6 = r6.get()
            if (r6 != 0) goto L73
            java.io.FileOutputStream r6 = new java.io.FileOutputStream
            java.io.File r1 = r5.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r6.<init>(r1)
            com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5 r1 = com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5.p59rPv72J9     // Catch: java.lang.Throwable -> L6a
            com.vdodsodjsdt.utw5QZ2bV5OFu23kHkuL67s r4 = new com.vdodsodjsdt.utw5QZ2bV5OFu23kHkuL67s     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L6a
            r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r6     // Catch: java.lang.Throwable -> L6a
            r0.ZLZeBXTMq0zDztBxtRTuCHrapQ = r6     // Catch: java.lang.Throwable -> L6a
            r0.M9e7PWhFYLD2lOGMker = r3     // Catch: java.lang.Throwable -> L6a
            r1.p59rPv72J9(r7, r4)     // Catch: java.lang.Throwable -> L6a
            com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU r7 = com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr
            if (r2 != r7) goto L5c
            return r7
        L5c:
            r7 = r6
            r0 = r7
        L5e:
            java.io.FileDescriptor r6 = r7.getFD()     // Catch: java.lang.Throwable -> L2b
            r6.sync()     // Catch: java.lang.Throwable -> L2b
            r6 = 0
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.p59rPv72J9(r0, r6)
            return r2
        L6a:
            r7 = move-exception
            r0 = r6
            r6 = r7
        L6d:
            throw r6     // Catch: java.lang.Throwable -> L6e
        L6e:
            r7 = move-exception
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.p59rPv72J9(r0, r6)
            throw r7
        L73:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "This scope has already been closed."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.iVLTCzs6QOGxGxxuJDLgxHoH9xIw.zzpBGItXfub0yWj(com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD, java.lang.Object):java.lang.Object");
    }
}
