package com.vdodsodjsdt;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class aUMGpK2XTYCqkTc7b extends djJGzpNklXXknWab {
    public final /* synthetic */ U4Gf2WRl4jA30QHPc NSjgqmGjEzuugn2SsG1mZFP;
    public long ZLZeBXTMq0zDztBxtRTuCHrapQ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aUMGpK2XTYCqkTc7b(U4Gf2WRl4jA30QHPc u4Gf2WRl4jA30QHPc, sveu0WcbYc1gIe sveu0wcbyc1gie, long j) {
        super(u4Gf2WRl4jA30QHPc, sveu0wcbyc1gie);
        ej6unYlOWMDF.pYmKDYlAmhudp(sveu0wcbyc1gie, "url");
        this.NSjgqmGjEzuugn2SsG1mZFP = u4Gf2WRl4jA30QHPc;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = j;
        if (j == 0) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m(EUSG2RPrSQzuno7qTyOhv0Az.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zLaeGQIruHQu81hfJldjMOQSVblH3x;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return;
        }
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            ej6unYlOWMDF.pYmKDYlAmhudp(timeUnit, "timeUnit");
            try {
                zLaeGQIruHQu81hfJldjMOQSVblH3x = U7JVXX1Kyh43VgUF.LaeGQIruHQu81hfJldjMOQSVblH3x(this, 100);
            } catch (IOException unused) {
                zLaeGQIruHQu81hfJldjMOQSVblH3x = false;
            }
            if (!zLaeGQIruHQu81hfJldjMOQSVblH3x) {
                this.NSjgqmGjEzuugn2SsG1mZFP.zzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP();
                VxUQ9tBhpHJ2AAEDNW8sghc4m(U4Gf2WRl4jA30QHPc.ZLZeBXTMq0zDztBxtRTuCHrapQ);
            }
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
    }

    @Override // com.vdodsodjsdt.djJGzpNklXXknWab, com.vdodsodjsdt.iIBl3qIny2
    public final long ko09zE6UAgwkV(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) throws ProtocolException {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (j2 == 0) {
            return -1L;
        }
        long jKo09zE6UAgwkV = super.ko09zE6UAgwkV(Math.min(j2, 8192L), eouCzLZsW9ynithduh);
        if (jKo09zE6UAgwkV == -1) {
            this.NSjgqmGjEzuugn2SsG1mZFP.zzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            VxUQ9tBhpHJ2AAEDNW8sghc4m(U4Gf2WRl4jA30QHPc.ZLZeBXTMq0zDztBxtRTuCHrapQ);
            throw protocolException;
        }
        long j3 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ - jKo09zE6UAgwkV;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = j3;
        if (j3 == 0) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m(EUSG2RPrSQzuno7qTyOhv0Az.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
        return jKo09zE6UAgwkV;
    }
}
