package com.vdodsodjsdt;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class liO60E789qF implements CZ74FjSsfST8z15SHXk {
    public final Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr = 0;
    public final upy0Ra78zBESm9Lr9V9Tg ZfQNn8hdWlEQ5cR94249PDsLR;

    public liO60E789qF(OutputStream outputStream, upy0Ra78zBESm9Lr9V9Tg upy0ra78zbesm9lr9v9tg) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = outputStream;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = upy0ra78zbesm9lr9v9tg;
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final void Ca81ebIan1u(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) throws IOException {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ZLZeBXTMq0zDztBxtRTuCHrapQ(eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR, 0L, j);
                long j2 = j;
                while (true) {
                    long j3 = 0;
                    if (j2 <= 0) {
                        return;
                    }
                    tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr;
                    ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
                    while (true) {
                        if (j3 < 65536) {
                            j3 += (long) (tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh5.zzpBGItXfub0yWj);
                            if (j3 >= j2) {
                                j3 = j2;
                            } else {
                                tpwzsw479hfzvfh5 = tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                                ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
                            }
                        }
                    }
                    liO60E789qF lio60e789qf = (liO60E789qF) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    upy0Ra78zBESm9Lr9V9Tg upy0ra78zbesm9lr9v9tg = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    upy0ra78zbesm9lr9v9tg.NSjgqmGjEzuugn2SsG1mZFP();
                    try {
                        try {
                            lio60e789qf.Ca81ebIan1u(j3, eouCzLZsW9ynithduh);
                            if (upy0ra78zbesm9lr9v9tg.GI83zq0G8e7zkn()) {
                                throw upy0ra78zbesm9lr9v9tg.HzCpKshMOoaw76hFcbOVRYMeRd(null);
                            }
                            j2 -= j3;
                        } catch (IOException e) {
                            if (!upy0ra78zbesm9lr9v9tg.GI83zq0G8e7zkn()) {
                                throw e;
                            }
                            throw upy0ra78zbesm9lr9v9tg.HzCpKshMOoaw76hFcbOVRYMeRd(e);
                        }
                    } catch (Throwable th) {
                        upy0ra78zbesm9lr9v9tg.GI83zq0G8e7zkn();
                        throw th;
                    }
                }
                break;
            default:
                FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ZLZeBXTMq0zDztBxtRTuCHrapQ(eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR, 0L, j);
                while (j > 0) {
                    this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                    tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr;
                    ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh52);
                    int iMin = (int) Math.min(j, tpwzsw479hfzvfh52.V57tEvNfxZVVcOCAOih5PKr - tpwzsw479hfzvfh52.zzpBGItXfub0yWj);
                    ((OutputStream) this.LaeGQIruHQu81hfJldjMOQSVblH3x).write(tpwzsw479hfzvfh52.VxUQ9tBhpHJ2AAEDNW8sghc4m, tpwzsw479hfzvfh52.zzpBGItXfub0yWj, iMin);
                    int i = tpwzsw479hfzvfh52.zzpBGItXfub0yWj + iMin;
                    tpwzsw479hfzvfh52.zzpBGItXfub0yWj = i;
                    long j4 = iMin;
                    j -= j4;
                    eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR -= j4;
                    if (i == tpwzsw479hfzvfh52.V57tEvNfxZVVcOCAOih5PKr) {
                        eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh52.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        XV5lwP1ltOyG6fBWn0goPh0ZOfW9.VxUQ9tBhpHJ2AAEDNW8sghc4m(tpwzsw479hfzvfh52);
                    }
                }
                return;
        }
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                liO60E789qF lio60e789qf = (liO60E789qF) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                upy0Ra78zBESm9Lr9V9Tg upy0ra78zbesm9lr9v9tg = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                upy0ra78zbesm9lr9v9tg.NSjgqmGjEzuugn2SsG1mZFP();
                try {
                    lio60e789qf.close();
                    if (upy0ra78zbesm9lr9v9tg.GI83zq0G8e7zkn()) {
                        throw upy0ra78zbesm9lr9v9tg.HzCpKshMOoaw76hFcbOVRYMeRd(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!upy0ra78zbesm9lr9v9tg.GI83zq0G8e7zkn()) {
                        throw e;
                    }
                    throw upy0ra78zbesm9lr9v9tg.HzCpKshMOoaw76hFcbOVRYMeRd(e);
                } finally {
                    upy0ra78zbesm9lr9v9tg.GI83zq0G8e7zkn();
                }
            default:
                ((OutputStream) this.LaeGQIruHQu81hfJldjMOQSVblH3x).close();
                return;
        }
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                liO60E789qF lio60e789qf = (liO60E789qF) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                upy0Ra78zBESm9Lr9V9Tg upy0ra78zbesm9lr9v9tg = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                upy0ra78zbesm9lr9v9tg.NSjgqmGjEzuugn2SsG1mZFP();
                try {
                    lio60e789qf.flush();
                    if (upy0ra78zbesm9lr9v9tg.GI83zq0G8e7zkn()) {
                        throw upy0ra78zbesm9lr9v9tg.HzCpKshMOoaw76hFcbOVRYMeRd(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!upy0ra78zbesm9lr9v9tg.GI83zq0G8e7zkn()) {
                        throw e;
                    }
                    throw upy0ra78zbesm9lr9v9tg.HzCpKshMOoaw76hFcbOVRYMeRd(e);
                } finally {
                    upy0ra78zbesm9lr9v9tg.GI83zq0G8e7zkn();
                }
            default:
                ((OutputStream) this.LaeGQIruHQu81hfJldjMOQSVblH3x).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                return "AsyncTimeout.sink(" + ((liO60E789qF) this.LaeGQIruHQu81hfJldjMOQSVblH3x) + ')';
            default:
                return "sink(" + ((OutputStream) this.LaeGQIruHQu81hfJldjMOQSVblH3x) + ')';
        }
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
        }
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public liO60E789qF(upy0Ra78zBESm9Lr9V9Tg upy0ra78zbesm9lr9v9tg, liO60E789qF lio60e789qf) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = upy0ra78zbesm9lr9v9tg;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = lio60e789qf;
    }
}
