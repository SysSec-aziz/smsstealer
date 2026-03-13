package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hPZKIw1gzrCmP extends djJGzpNklXXknWab {
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return;
        }
        if (!this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m(U4Gf2WRl4jA30QHPc.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
    }

    @Override // com.vdodsodjsdt.djJGzpNklXXknWab, com.vdodsodjsdt.iIBl3qIny2
    public final long ko09zE6UAgwkV(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            return -1L;
        }
        long jKo09zE6UAgwkV = super.ko09zE6UAgwkV(8192L, eouCzLZsW9ynithduh);
        if (jKo09zE6UAgwkV != -1) {
            return jKo09zE6UAgwkV;
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        VxUQ9tBhpHJ2AAEDNW8sghc4m(EUSG2RPrSQzuno7qTyOhv0Az.ZfQNn8hdWlEQ5cR94249PDsLR);
        return -1L;
    }
}
