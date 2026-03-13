package com.vdodsodjsdt;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class oZoKxiIpoGa2HCNBzZuu0sj0bd implements iIBl3qIny2 {
    public final /* synthetic */ Zqam9EI4z3IGnFKq GI83zq0G8e7zkn;
    public long LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public final iIBl3qIny2 V57tEvNfxZVVcOCAOih5PKr;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final long ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public oZoKxiIpoGa2HCNBzZuu0sj0bd(Zqam9EI4z3IGnFKq zqam9EI4z3IGnFKq, iIBl3qIny2 iibl3qiny2, long j) {
        ej6unYlOWMDF.pYmKDYlAmhudp(iibl3qiny2, "delegate");
        this.GI83zq0G8e7zkn = zqam9EI4z3IGnFKq;
        this.V57tEvNfxZVVcOCAOih5PKr = iibl3qiny2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = j;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        if (j == 0) {
            V57tEvNfxZVVcOCAOih5PKr(null);
        }
    }

    public final IOException V57tEvNfxZVVcOCAOih5PKr(IOException iOException) {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            return iOException;
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        if (iOException == null && this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
        }
        return Zqam9EI4z3IGnFKq.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.GI83zq0G8e7zkn, iOException, 4);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() throws IOException {
        this.V57tEvNfxZVVcOCAOih5PKr.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.NSjgqmGjEzuugn2SsG1mZFP) {
            return;
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = true;
        try {
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
        } catch (IOException e) {
            throw V57tEvNfxZVVcOCAOih5PKr(e);
        }
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2
    public final long ko09zE6UAgwkV(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) throws IOException {
        Zqam9EI4z3IGnFKq zqam9EI4z3IGnFKq = this.GI83zq0G8e7zkn;
        if (this.NSjgqmGjEzuugn2SsG1mZFP) {
            throw new IllegalStateException("closed");
        }
        try {
            long jKo09zE6UAgwkV = this.V57tEvNfxZVVcOCAOih5PKr.ko09zE6UAgwkV(8192L, eouCzLZsW9ynithduh);
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
            }
            if (jKo09zE6UAgwkV == -1) {
                V57tEvNfxZVVcOCAOih5PKr(null);
                return -1L;
            }
            long j2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x + jKo09zE6UAgwkV;
            long j3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (j3 == -1 || j2 <= j3) {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = j2;
                if (((cWn2EVjHRjuSHU5xQi) zqam9EI4z3IGnFKq.ZfQNn8hdWlEQ5cR94249PDsLR).V57tEvNfxZVVcOCAOih5PKr()) {
                    V57tEvNfxZVVcOCAOih5PKr(null);
                }
                return jKo09zE6UAgwkV;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw V57tEvNfxZVVcOCAOih5PKr(e);
        }
    }

    public final String toString() {
        return oZoKxiIpoGa2HCNBzZuu0sj0bd.class.getSimpleName() + '(' + this.V57tEvNfxZVVcOCAOih5PKr + ')';
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2, com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        return this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj();
    }
}
