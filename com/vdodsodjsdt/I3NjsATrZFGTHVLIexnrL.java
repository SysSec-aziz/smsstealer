package com.vdodsodjsdt;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class I3NjsATrZFGTHVLIexnrL implements iIBl3qIny2 {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final nfXvCNpsFLQkxk3Wa V57tEvNfxZVVcOCAOih5PKr;
    public final Inflater ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public I3NjsATrZFGTHVLIexnrL(nfXvCNpsFLQkxk3Wa nfxvcnpsflqkxk3wa, Inflater inflater) {
        this.V57tEvNfxZVVcOCAOih5PKr = nfxvcnpsflqkxk3wa;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            return;
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.end();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        this.V57tEvNfxZVVcOCAOih5PKr.close();
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2
    public final long ko09zE6UAgwkV(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) throws IOException {
        long j2;
        Inflater inflater = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.pYmKDYlAmhudp(eouCzLZsW9ynithduh, "sink");
        while (!this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            try {
                tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW = eouCzLZsW9ynithduh.pzqP2AqKW6J5PO8zCKnW(1);
                int iMin = (int) Math.min(8192L, 8192 - tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr);
                boolean zNeedsInput = inflater.needsInput();
                nfXvCNpsFLQkxk3Wa nfxvcnpsflqkxk3wa = this.V57tEvNfxZVVcOCAOih5PKr;
                if (zNeedsInput && !nfxvcnpsflqkxk3wa.HzCpKshMOoaw76hFcbOVRYMeRd()) {
                    tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = nfxvcnpsflqkxk3wa.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr;
                    ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
                    int i = tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr;
                    int i2 = tpwzsw479hfzvfh5.zzpBGItXfub0yWj;
                    int i3 = i - i2;
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x = i3;
                    inflater.setInput(tpwzsw479hfzvfh5.VxUQ9tBhpHJ2AAEDNW8sghc4m, i2, i3);
                }
                int iInflate = inflater.inflate(tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m, tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr, iMin);
                int i4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x -= remaining;
                    nfxvcnpsflqkxk3wa.skip(remaining);
                }
                if (iInflate > 0) {
                    tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr += iInflate;
                    j2 = iInflate;
                    eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR += j2;
                } else {
                    if (tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.zzpBGItXfub0yWj == tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr) {
                        eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        XV5lwP1ltOyG6fBWn0goPh0ZOfW9.VxUQ9tBhpHJ2AAEDNW8sghc4m(tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW);
                    }
                    j2 = 0;
                }
                if (j2 > 0) {
                    return j2;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (nfxvcnpsflqkxk3wa.HzCpKshMOoaw76hFcbOVRYMeRd()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2, com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        return this.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj();
    }
}
