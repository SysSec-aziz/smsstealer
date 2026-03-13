package com.vdodsodjsdt;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class gvJWFmxjWOQykdhqgoL0rfhHDKb implements CZ74FjSsfST8z15SHXk {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ Zqam9EI4z3IGnFKq NSjgqmGjEzuugn2SsG1mZFP;
    public final CZ74FjSsfST8z15SHXk V57tEvNfxZVVcOCAOih5PKr;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final long ZfQNn8hdWlEQ5cR94249PDsLR;
    public long zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public gvJWFmxjWOQykdhqgoL0rfhHDKb(Zqam9EI4z3IGnFKq zqam9EI4z3IGnFKq, CZ74FjSsfST8z15SHXk cZ74FjSsfST8z15SHXk, long j) {
        ej6unYlOWMDF.pYmKDYlAmhudp(cZ74FjSsfST8z15SHXk, "delegate");
        this.NSjgqmGjEzuugn2SsG1mZFP = zqam9EI4z3IGnFKq;
        this.V57tEvNfxZVVcOCAOih5PKr = cZ74FjSsfST8z15SHXk;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = j;
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final void Ca81ebIan1u(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) throws IOException {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (j2 == -1 || this.zIvmSL0wzmmKGc3X39b2Gw2mUGE + j <= j2) {
            try {
                this.V57tEvNfxZVVcOCAOih5PKr.Ca81ebIan1u(j, eouCzLZsW9ynithduh);
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE += j;
                return;
            } catch (IOException e) {
                throw V57tEvNfxZVVcOCAOih5PKr(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE + j));
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        this.V57tEvNfxZVVcOCAOih5PKr.flush();
    }

    public final IOException V57tEvNfxZVVcOCAOih5PKr(IOException iOException) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return iOException;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        return Zqam9EI4z3IGnFKq.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.NSjgqmGjEzuugn2SsG1mZFP, iOException, 2);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        this.V57tEvNfxZVVcOCAOih5PKr.close();
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            return;
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        long j = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (j != -1 && this.zIvmSL0wzmmKGc3X39b2Gw2mUGE != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
        } catch (IOException e) {
            throw V57tEvNfxZVVcOCAOih5PKr(e);
        }
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk, java.io.Flushable
    public final void flush() throws IOException {
        try {
            LaeGQIruHQu81hfJldjMOQSVblH3x();
        } catch (IOException e) {
            throw V57tEvNfxZVVcOCAOih5PKr(e);
        }
    }

    public final String toString() {
        return gvJWFmxjWOQykdhqgoL0rfhHDKb.class.getSimpleName() + '(' + this.V57tEvNfxZVVcOCAOih5PKr + ')';
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        return this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj();
    }
}
