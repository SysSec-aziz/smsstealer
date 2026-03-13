package com.vdodsodjsdt;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d4eB8hsUAVoNY4 implements Runnable {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Context ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ d4eB8hsUAVoNY4(Context context, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.V57tEvNfxZVVcOCAOih5PKr
            switch(r0) {
                case 0: goto L30;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            com.vdodsodjsdt.SrWj7TXjIxKCejoDzqp3JUFJYtU r0 = new com.vdodsodjsdt.SrWj7TXjIxKCejoDzqp3JUFJYtU
            r1 = 1
            r0.<init>(r1)
            com.vdodsodjsdt.FG8LIxsgYiLSfhN0jYKIKr r1 = com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ZfQNn8hdWlEQ5cR94249PDsLR
            r2 = 0
            android.content.Context r3 = r11.ZfQNn8hdWlEQ5cR94249PDsLR
            com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6.gBaBUmihn5l4u(r3, r0, r1, r2)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            com.vdodsodjsdt.d4eB8hsUAVoNY4 r0 = new com.vdodsodjsdt.d4eB8hsUAVoNY4
            r1 = 2
            android.content.Context r2 = r11.ZfQNn8hdWlEQ5cR94249PDsLR
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        L30:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lb2
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r5 = r11.ZfQNn8hdWlEQ5cR94249PDsLR
            r3.<init>(r5, r4)
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto Lb2
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L89
            com.vdodsodjsdt.DBkPCwg2bk r0 = com.vdodsodjsdt.HqgfdHRFzXYO3mSc.GI83zq0G8e7zkn
            r0.getClass()
            com.vdodsodjsdt.YZGEqxBO83YadVVg r2 = new com.vdodsodjsdt.YZGEqxBO83YadVVg
            r2.<init>(r0)
        L58:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            com.vdodsodjsdt.HqgfdHRFzXYO3mSc r0 = (com.vdodsodjsdt.HqgfdHRFzXYO3mSc) r0
            if (r0 == 0) goto L58
            com.vdodsodjsdt.BbqUXujjobWQwx4SY r0 = (com.vdodsodjsdt.BbqUXujjobWQwx4SY) r0
            android.content.Context r0 = r0.q1wNbhk2O6
            if (r0 == 0) goto L58
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L78
        L77:
            r0 = 0
        L78:
            if (r0 == 0) goto L8e
            android.os.LocaleList r0 = com.vdodsodjsdt.tKIFEPLguCcXKR.VxUQ9tBhpHJ2AAEDNW8sghc4m(r0)
            com.vdodsodjsdt.BIajpH9rKfhy3tkxKeGET7A9E5xV r2 = new com.vdodsodjsdt.BIajpH9rKfhy3tkxKeGET7A9E5xV
            com.vdodsodjsdt.zCWUDzxibeVs r6 = new com.vdodsodjsdt.zCWUDzxibeVs
            r6.<init>(r0)
            r2.<init>(r6)
            goto L90
        L89:
            com.vdodsodjsdt.BIajpH9rKfhy3tkxKeGET7A9E5xV r2 = com.vdodsodjsdt.HqgfdHRFzXYO3mSc.LaeGQIruHQu81hfJldjMOQSVblH3x
            if (r2 == 0) goto L8e
            goto L90
        L8e:
            com.vdodsodjsdt.BIajpH9rKfhy3tkxKeGET7A9E5xV r2 = com.vdodsodjsdt.BIajpH9rKfhy3tkxKeGET7A9E5xV.zzpBGItXfub0yWj
        L90:
            com.vdodsodjsdt.zCWUDzxibeVs r0 = r2.VxUQ9tBhpHJ2AAEDNW8sghc4m
            android.os.LocaleList r0 = r0.VxUQ9tBhpHJ2AAEDNW8sghc4m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lab
            java.lang.String r0 = com.vdodsodjsdt.ej6unYlOWMDF.L8DMw02rUTs2w(r5)
            java.lang.Object r2 = r5.getSystemService(r4)
            if (r2 == 0) goto Lab
            android.os.LocaleList r0 = com.vdodsodjsdt.UTQvYFqgClyQCI5fqj43Mn5AYtA8.VxUQ9tBhpHJ2AAEDNW8sghc4m(r0)
            com.vdodsodjsdt.tKIFEPLguCcXKR.zzpBGItXfub0yWj(r2, r0)
        Lab:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        Lb2:
            com.vdodsodjsdt.HqgfdHRFzXYO3mSc.NSjgqmGjEzuugn2SsG1mZFP = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.d4eB8hsUAVoNY4.run():void");
    }
}
