package com.vdodsodjsdt;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class KKgVVtgki1NTGogYfNtieIfD implements kpXzRIgLxQiglBj {
    public final Context VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public KKgVVtgki1NTGogYfNtieIfD(Context context, int i) {
        switch (i) {
            case 1:
                ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = context;
                break;
            default:
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = context.getApplicationContext();
                break;
        }
    }

    public Object V57tEvNfxZVVcOCAOih5PKr(String str, String str2, GvuED9Eb9kjnYjng4BPJg7J gvuED9Eb9kjnYjng4BPJg7J) {
        Object objZzpBGItXfub0yWj = wd8AgJ2AV2bj.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.VxUQ9tBhpHJ2AAEDNW8sghc4m).zzpBGItXfub0yWj(new Yzq1oSBgBro6jNGuZoXf3ses(new Fay0c75gB9L7rsCkQN(new zabWiGvSFrO07AP3htLK7JkP(str), str2, null), (IvfXhmjM3e3K) null, 8), gvuED9Eb9kjnYjng4BPJg7J);
        return objZzpBGItXfub0yWj == w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr ? objZzpBGItXfub0yWj : hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    @Override // com.vdodsodjsdt.kpXzRIgLxQiglBj
    public void VxUQ9tBhpHJ2AAEDNW8sghc4m(hRrPPME7ytOB7ba hrrppme7ytob7ba) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ySK2rlaEFl0G3("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new QKIH77ZVGMjTqK4XOIPLci1Yc(this, hrrppme7ytob7ba, threadPoolExecutor, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object zzpBGItXfub0yWj(java.lang.String r6, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.vdodsodjsdt.ZGcMz4j8MMkIrOEtE
            if (r0 == 0) goto L13
            r0 = r7
            com.vdodsodjsdt.ZGcMz4j8MMkIrOEtE r0 = (com.vdodsodjsdt.ZGcMz4j8MMkIrOEtE) r0
            int r1 = r0.GI83zq0G8e7zkn
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.GI83zq0G8e7zkn = r1
            goto L18
        L13:
            com.vdodsodjsdt.ZGcMz4j8MMkIrOEtE r0 = new com.vdodsodjsdt.ZGcMz4j8MMkIrOEtE
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.ZLZeBXTMq0zDztBxtRTuCHrapQ
            int r1 = r0.GI83zq0G8e7zkn
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            com.vdodsodjsdt.zabWiGvSFrO07AP3htLK7JkP r6 = r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r7)
            goto L5a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r7)
            java.lang.String r7 = "name"
            com.vdodsodjsdt.ej6unYlOWMDF.pYmKDYlAmhudp(r6, r7)
            com.vdodsodjsdt.zabWiGvSFrO07AP3htLK7JkP r7 = new com.vdodsodjsdt.zabWiGvSFrO07AP3htLK7JkP
            r7.<init>(r6)
            android.content.Context r6 = r5.VxUQ9tBhpHJ2AAEDNW8sghc4m
            com.vdodsodjsdt.qF22Y620JkFyombtDYw0h0h8Rxpja r6 = com.vdodsodjsdt.wd8AgJ2AV2bj.VxUQ9tBhpHJ2AAEDNW8sghc4m(r6)
            java.lang.Object r6 = r6.V57tEvNfxZVVcOCAOih5PKr
            com.vdodsodjsdt.BWNO61VTow7fZxX r6 = (com.vdodsodjsdt.BWNO61VTow7fZxX) r6
            com.vdodsodjsdt.jDNq5zhgCb57UDl r6 = r6.V57tEvNfxZVVcOCAOih5PKr()
            r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r7
            r0.GI83zq0G8e7zkn = r2
            java.lang.Object r6 = com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4.jW7EiD0YL6xkbB158jMUzhWNWb1y(r6, r0)
            com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU r0 = com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr
            if (r6 != r0) goto L57
            return r0
        L57:
            r4 = r7
            r7 = r6
            r6 = r4
        L5a:
            com.vdodsodjsdt.wg2qx8o8rURUQteWo0QkSZAxg4eSO r7 = (com.vdodsodjsdt.wg2qx8o8rURUQteWo0QkSZAxg4eSO) r7
            r7.getClass()
            java.lang.String r0 = "key"
            com.vdodsodjsdt.ej6unYlOWMDF.pYmKDYlAmhudp(r6, r0)
            java.util.LinkedHashMap r7 = r7.VxUQ9tBhpHJ2AAEDNW8sghc4m
            java.lang.Object r6 = r7.get(r6)
            boolean r7 = r6 instanceof byte[]
            if (r7 == 0) goto L7a
            byte[] r6 = (byte[]) r6
            int r7 = r6.length
            byte[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r7 = "copyOf(this, size)"
            com.vdodsodjsdt.ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(r6, r7)
        L7a:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L80
            java.lang.String r6 = ""
        L80:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.KKgVVtgki1NTGogYfNtieIfD.zzpBGItXfub0yWj(java.lang.String, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD):java.lang.Object");
    }
}
