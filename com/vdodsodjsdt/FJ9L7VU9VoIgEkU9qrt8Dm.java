package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class FJ9L7VU9VoIgEkU9qrt8Dm {
    public static FJ9L7VU9VoIgEkU9qrt8Dm LaeGQIruHQu81hfJldjMOQSVblH3x;
    public long V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
    public long ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zzpBGItXfub0yWj;

    public /* synthetic */ FJ9L7VU9VoIgEkU9qrt8Dm() {
    }

    public static void V57tEvNfxZVVcOCAOih5PKr(FJ9L7VU9VoIgEkU9qrt8Dm fJ9L7VU9VoIgEkU9qrt8Dm, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (fJ9L7VU9VoIgEkU9qrt8Dm) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = fJ9L7VU9VoIgEkU9qrt8Dm.V57tEvNfxZVVcOCAOih5PKr + j;
                fJ9L7VU9VoIgEkU9qrt8Dm.V57tEvNfxZVVcOCAOih5PKr = j3;
                long j4 = fJ9L7VU9VoIgEkU9qrt8Dm.ZfQNn8hdWlEQ5cR94249PDsLR + j2;
                fJ9L7VU9VoIgEkU9qrt8Dm.ZfQNn8hdWlEQ5cR94249PDsLR = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m(double d, double d2, long j) {
        double d3 = (0.01720197f * ((j - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (r2 - 9.0E-4f)) - r6) + 9.0E-4f)) + ((-d2) / 360.0d);
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d4 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d4))) / (Math.cos(dAsin) * Math.cos(d4));
        if (dSin3 >= 1.0d) {
            this.zzpBGItXfub0yWj = 1;
            this.V57tEvNfxZVVcOCAOih5PKr = -1L;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.zzpBGItXfub0yWj = 0;
                this.V57tEvNfxZVVcOCAOih5PKr = -1L;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.V57tEvNfxZVVcOCAOih5PKr = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = jRound;
            if (jRound >= j || this.V57tEvNfxZVVcOCAOih5PKr <= j) {
                this.zzpBGItXfub0yWj = 1;
            } else {
                this.zzpBGItXfub0yWj = 0;
            }
        }
    }

    public String toString() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 1:
                return "WindowCounter(streamId=" + this.zzpBGItXfub0yWj + ", total=" + this.V57tEvNfxZVVcOCAOih5PKr + ", acknowledged=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + ", unacknowledged=" + zzpBGItXfub0yWj() + ')';
            default:
                return super.toString();
        }
    }

    public synchronized long zzpBGItXfub0yWj() {
        return this.V57tEvNfxZVVcOCAOih5PKr - this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public FJ9L7VU9VoIgEkU9qrt8Dm(int i) {
        this.zzpBGItXfub0yWj = i;
    }
}
