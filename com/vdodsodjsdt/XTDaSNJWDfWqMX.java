package com.vdodsodjsdt;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class XTDaSNJWDfWqMX implements iIBl3qIny2 {
    public final Inflater LaeGQIruHQu81hfJldjMOQSVblH3x;
    public byte V57tEvNfxZVVcOCAOih5PKr;
    public final CRC32 ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final nfXvCNpsFLQkxk3Wa ZfQNn8hdWlEQ5cR94249PDsLR;
    public final I3NjsATrZFGTHVLIexnrL zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public XTDaSNJWDfWqMX(hy3v1zJcCYok89Y1iAeFhN66 hy3v1zjccyok89y1iaefhn66) {
        ej6unYlOWMDF.pYmKDYlAmhudp(hy3v1zjccyok89y1iaefhn66, "source");
        nfXvCNpsFLQkxk3Wa nfxvcnpsflqkxk3wa = new nfXvCNpsFLQkxk3Wa(hy3v1zjccyok89y1iaefhn66);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = nfxvcnpsflqkxk3wa;
        Inflater inflater = new Inflater(true);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = inflater;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new I3NjsATrZFGTHVLIexnrL(nfxvcnpsflqkxk3wa, inflater);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new CRC32();
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(String str, int i, int i2) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + cwhrCnoVJBjJE2CBEAvBopmgF.ScSj9HEorWkb3bIb1HyeKVoW(FLWIoSaHb1q8TqFvEBgPyRGrzvi6.wRCD0SdqWCowdYU7bmzN(i2)) + " != expected 0x" + cwhrCnoVJBjJE2CBEAvBopmgF.ScSj9HEorWkb3bIb1HyeKVoW(FLWIoSaHb1q8TqFvEBgPyRGrzvi6.wRCD0SdqWCowdYU7bmzN(i)));
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(EouCzLZsW9ynithduh eouCzLZsW9ynithduh, long j, long j2) {
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
        while (true) {
            int i = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr;
            int i2 = tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) tpwzsw479hfzvfh5.zzpBGItXfub0yWj) + j);
            int iMin = (int) Math.min(tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr - i3, j2);
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.update(tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m, i3, iMin);
            j2 -= (long) iMin;
            tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.close();
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2
    public final long ko09zE6UAgwkV(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) throws IOException {
        long j2;
        XTDaSNJWDfWqMX xTDaSNJWDfWqMX = this;
        byte b = xTDaSNJWDfWqMX.V57tEvNfxZVVcOCAOih5PKr;
        CRC32 crc32 = xTDaSNJWDfWqMX.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        nfXvCNpsFLQkxk3Wa nfxvcnpsflqkxk3wa = xTDaSNJWDfWqMX.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (b == 0) {
            nfxvcnpsflqkxk3wa.TaDO7ogis3aEiWEtq(10L);
            EouCzLZsW9ynithduh eouCzLZsW9ynithduh2 = nfxvcnpsflqkxk3wa.ZfQNn8hdWlEQ5cR94249PDsLR;
            byte bLaeGQIruHQu81hfJldjMOQSVblH3x = eouCzLZsW9ynithduh2.LaeGQIruHQu81hfJldjMOQSVblH3x(3L);
            boolean z = ((bLaeGQIruHQu81hfJldjMOQSVblH3x >> 1) & 1) == 1;
            if (z) {
                xTDaSNJWDfWqMX.V57tEvNfxZVVcOCAOih5PKr(eouCzLZsW9ynithduh2, 0L, 10L);
            }
            VxUQ9tBhpHJ2AAEDNW8sghc4m("ID1ID2", 8075, nfxvcnpsflqkxk3wa.readShort());
            nfxvcnpsflqkxk3wa.skip(8L);
            if (((bLaeGQIruHQu81hfJldjMOQSVblH3x >> 2) & 1) == 1) {
                nfxvcnpsflqkxk3wa.TaDO7ogis3aEiWEtq(2L);
                if (z) {
                    V57tEvNfxZVVcOCAOih5PKr(eouCzLZsW9ynithduh2, 0L, 2L);
                }
                short s = eouCzLZsW9ynithduh2.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                nfxvcnpsflqkxk3wa.TaDO7ogis3aEiWEtq(j3);
                if (z) {
                    V57tEvNfxZVVcOCAOih5PKr(eouCzLZsW9ynithduh2, 0L, j3);
                }
                nfxvcnpsflqkxk3wa.skip(j3);
            }
            if (((bLaeGQIruHQu81hfJldjMOQSVblH3x >> 3) & 1) == 1) {
                long jVxUQ9tBhpHJ2AAEDNW8sghc4m = nfxvcnpsflqkxk3wa.VxUQ9tBhpHJ2AAEDNW8sghc4m((byte) 0, 0L, Long.MAX_VALUE);
                if (jVxUQ9tBhpHJ2AAEDNW8sghc4m == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = 2;
                    V57tEvNfxZVVcOCAOih5PKr(eouCzLZsW9ynithduh2, 0L, jVxUQ9tBhpHJ2AAEDNW8sghc4m + 1);
                } else {
                    j2 = 2;
                }
                nfxvcnpsflqkxk3wa.skip(jVxUQ9tBhpHJ2AAEDNW8sghc4m + 1);
            } else {
                j2 = 2;
            }
            if (((bLaeGQIruHQu81hfJldjMOQSVblH3x >> 4) & 1) == 1) {
                long j4 = j2;
                long jVxUQ9tBhpHJ2AAEDNW8sghc4m2 = nfxvcnpsflqkxk3wa.VxUQ9tBhpHJ2AAEDNW8sghc4m((byte) 0, 0L, Long.MAX_VALUE);
                if (jVxUQ9tBhpHJ2AAEDNW8sghc4m2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    j2 = j4;
                    xTDaSNJWDfWqMX = this;
                    xTDaSNJWDfWqMX.V57tEvNfxZVVcOCAOih5PKr(eouCzLZsW9ynithduh2, 0L, jVxUQ9tBhpHJ2AAEDNW8sghc4m2 + 1);
                } else {
                    xTDaSNJWDfWqMX = this;
                    j2 = j4;
                }
                nfxvcnpsflqkxk3wa.skip(jVxUQ9tBhpHJ2AAEDNW8sghc4m2 + 1);
            } else {
                xTDaSNJWDfWqMX = this;
            }
            if (z) {
                nfxvcnpsflqkxk3wa.TaDO7ogis3aEiWEtq(j2);
                short s2 = eouCzLZsW9ynithduh2.readShort();
                VxUQ9tBhpHJ2AAEDNW8sghc4m("FHCRC", (short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            xTDaSNJWDfWqMX.V57tEvNfxZVVcOCAOih5PKr = (byte) 1;
        }
        if (xTDaSNJWDfWqMX.V57tEvNfxZVVcOCAOih5PKr == 1) {
            long j5 = eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR;
            long jKo09zE6UAgwkV = xTDaSNJWDfWqMX.zIvmSL0wzmmKGc3X39b2Gw2mUGE.ko09zE6UAgwkV(8192L, eouCzLZsW9ynithduh);
            if (jKo09zE6UAgwkV != -1) {
                xTDaSNJWDfWqMX.V57tEvNfxZVVcOCAOih5PKr(eouCzLZsW9ynithduh, j5, jKo09zE6UAgwkV);
                return jKo09zE6UAgwkV;
            }
            xTDaSNJWDfWqMX.V57tEvNfxZVVcOCAOih5PKr = (byte) 2;
        }
        if (xTDaSNJWDfWqMX.V57tEvNfxZVVcOCAOih5PKr == 2) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m("CRC", nfxvcnpsflqkxk3wa.V57tEvNfxZVVcOCAOih5PKr(), (int) crc32.getValue());
            VxUQ9tBhpHJ2AAEDNW8sghc4m("ISIZE", nfxvcnpsflqkxk3wa.V57tEvNfxZVVcOCAOih5PKr(), (int) xTDaSNJWDfWqMX.LaeGQIruHQu81hfJldjMOQSVblH3x.getBytesWritten());
            xTDaSNJWDfWqMX.V57tEvNfxZVVcOCAOih5PKr = (byte) 3;
            if (!nfxvcnpsflqkxk3wa.HzCpKshMOoaw76hFcbOVRYMeRd()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2, com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj();
    }
}
