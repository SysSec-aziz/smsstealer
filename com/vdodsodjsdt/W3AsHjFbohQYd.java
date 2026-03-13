package com.vdodsodjsdt;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class W3AsHjFbohQYd extends djJGzpNklXXknWab {
    public final /* synthetic */ U4Gf2WRl4jA30QHPc GI83zq0G8e7zkn;
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public long ZLZeBXTMq0zDztBxtRTuCHrapQ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3AsHjFbohQYd(U4Gf2WRl4jA30QHPc u4Gf2WRl4jA30QHPc, sveu0WcbYc1gIe sveu0wcbyc1gie) {
        super(u4Gf2WRl4jA30QHPc, sveu0wcbyc1gie);
        ej6unYlOWMDF.pYmKDYlAmhudp(sveu0wcbyc1gie, "url");
        this.GI83zq0G8e7zkn = u4Gf2WRl4jA30QHPc;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = -1L;
        this.NSjgqmGjEzuugn2SsG1mZFP = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zLaeGQIruHQu81hfJldjMOQSVblH3x;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return;
        }
        if (this.NSjgqmGjEzuugn2SsG1mZFP) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            ej6unYlOWMDF.pYmKDYlAmhudp(timeUnit, "timeUnit");
            try {
                zLaeGQIruHQu81hfJldjMOQSVblH3x = U7JVXX1Kyh43VgUF.LaeGQIruHQu81hfJldjMOQSVblH3x(this, 100);
            } catch (IOException unused) {
                zLaeGQIruHQu81hfJldjMOQSVblH3x = false;
            }
            if (!zLaeGQIruHQu81hfJldjMOQSVblH3x) {
                this.GI83zq0G8e7zkn.zzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP();
                VxUQ9tBhpHJ2AAEDNW8sghc4m(U4Gf2WRl4jA30QHPc.ZLZeBXTMq0zDztBxtRTuCHrapQ);
            }
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        if (r9.NSjgqmGjEzuugn2SsG1mZFP == false) goto L28;
     */
    @Override // com.vdodsodjsdt.djJGzpNklXXknWab, com.vdodsodjsdt.iIBl3qIny2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long ko09zE6UAgwkV(long r10, com.vdodsodjsdt.EouCzLZsW9ynithduh r12) throws java.net.ProtocolException {
        /*
            r9 = this;
            com.vdodsodjsdt.U4Gf2WRl4jA30QHPc r10 = r9.GI83zq0G8e7zkn
            com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66 r11 = r10.V57tEvNfxZVVcOCAOih5PKr
            boolean r0 = r9.LaeGQIruHQu81hfJldjMOQSVblH3x
            if (r0 != 0) goto Lb2
            boolean r0 = r9.NSjgqmGjEzuugn2SsG1mZFP
            r1 = -1
            if (r0 != 0) goto Lf
            goto L63
        Lf:
            long r3 = r9.ZLZeBXTMq0zDztBxtRTuCHrapQ
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L1b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L64
        L1b:
            java.lang.String r0 = "expected chunk size and optional extensions but was \""
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L24
            r11.NSjgqmGjEzuugn2SsG1mZFP()
        L24:
            long r3 = r11.qNPQb1obP7()     // Catch: java.lang.NumberFormatException -> L4c
            r9.ZLZeBXTMq0zDztBxtRTuCHrapQ = r3     // Catch: java.lang.NumberFormatException -> L4c
            java.lang.String r11 = r11.NSjgqmGjEzuugn2SsG1mZFP()     // Catch: java.lang.NumberFormatException -> L4c
            java.lang.CharSequence r11 = com.vdodsodjsdt.cwhrCnoVJBjJE2CBEAvBopmgF.tf2p6GzNN7uQY7Lun0pJ(r11)     // Catch: java.lang.NumberFormatException -> L4c
            java.lang.String r11 = r11.toString()     // Catch: java.lang.NumberFormatException -> L4c
            long r3 = r9.ZLZeBXTMq0zDztBxtRTuCHrapQ     // Catch: java.lang.NumberFormatException -> L4c
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L8c
            int r3 = r11.length()     // Catch: java.lang.NumberFormatException -> L4c
            r4 = 0
            if (r3 <= 0) goto L4e
            java.lang.String r3 = ";"
            boolean r3 = com.vdodsodjsdt.ngO5JXZkj8nfh41LltHvEjUc.lxWWbfAOLs4jWzd7PSIiIJ(r11, r3, r4)     // Catch: java.lang.NumberFormatException -> L4c
            if (r3 == 0) goto L8c
            goto L4e
        L4c:
            r10 = move-exception
            goto La8
        L4e:
            long r7 = r9.ZLZeBXTMq0zDztBxtRTuCHrapQ
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 != 0) goto L5f
            r9.NSjgqmGjEzuugn2SsG1mZFP = r4
            com.vdodsodjsdt.xBkpwtKksCOQS r11 = r10.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            com.vdodsodjsdt.EUSG2RPrSQzuno7qTyOhv0Az r11 = r11.zIvmSL0wzmmKGc3X39b2Gw2mUGE()
            r9.VxUQ9tBhpHJ2AAEDNW8sghc4m(r11)
        L5f:
            boolean r11 = r9.NSjgqmGjEzuugn2SsG1mZFP
            if (r11 != 0) goto L64
        L63:
            return r1
        L64:
            long r3 = r9.ZLZeBXTMq0zDztBxtRTuCHrapQ
            r5 = 8192(0x2000, double:4.0474E-320)
            long r3 = java.lang.Math.min(r5, r3)
            long r11 = super.ko09zE6UAgwkV(r3, r12)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 == 0) goto L7a
            long r0 = r9.ZLZeBXTMq0zDztBxtRTuCHrapQ
            long r0 = r0 - r11
            r9.ZLZeBXTMq0zDztBxtRTuCHrapQ = r0
            return r11
        L7a:
            com.vdodsodjsdt.ohjB5lavt9Gy1qVLWRd r10 = r10.zzpBGItXfub0yWj
            r10.NSjgqmGjEzuugn2SsG1mZFP()
            java.net.ProtocolException r10 = new java.net.ProtocolException
            java.lang.String r11 = "unexpected end of stream"
            r10.<init>(r11)
            com.vdodsodjsdt.EUSG2RPrSQzuno7qTyOhv0Az r11 = com.vdodsodjsdt.U4Gf2WRl4jA30QHPc.ZLZeBXTMq0zDztBxtRTuCHrapQ
            r9.VxUQ9tBhpHJ2AAEDNW8sghc4m(r11)
            throw r10
        L8c:
            java.net.ProtocolException r10 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> L4c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L4c
            r12.<init>(r0)     // Catch: java.lang.NumberFormatException -> L4c
            long r0 = r9.ZLZeBXTMq0zDztBxtRTuCHrapQ     // Catch: java.lang.NumberFormatException -> L4c
            r12.append(r0)     // Catch: java.lang.NumberFormatException -> L4c
            r12.append(r11)     // Catch: java.lang.NumberFormatException -> L4c
            r11 = 34
            r12.append(r11)     // Catch: java.lang.NumberFormatException -> L4c
            java.lang.String r11 = r12.toString()     // Catch: java.lang.NumberFormatException -> L4c
            r10.<init>(r11)     // Catch: java.lang.NumberFormatException -> L4c
            throw r10     // Catch: java.lang.NumberFormatException -> L4c
        La8:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r10 = r10.getMessage()
            r11.<init>(r10)
            throw r11
        Lb2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.W3AsHjFbohQYd.ko09zE6UAgwkV(long, com.vdodsodjsdt.EouCzLZsW9ynithduh):long");
    }
}
