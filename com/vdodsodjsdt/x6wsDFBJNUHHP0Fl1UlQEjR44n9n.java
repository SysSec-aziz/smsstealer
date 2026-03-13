package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class x6wsDFBJNUHHP0Fl1UlQEjR44n9n implements CZ74FjSsfST8z15SHXk {
    public final /* synthetic */ U4Gf2WRl4jA30QHPc LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final FAcmpPLFz3Daa V57tEvNfxZVVcOCAOih5PKr;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;

    public x6wsDFBJNUHHP0Fl1UlQEjR44n9n(U4Gf2WRl4jA30QHPc u4Gf2WRl4jA30QHPc) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = u4Gf2WRl4jA30QHPc;
        this.V57tEvNfxZVVcOCAOih5PKr = new FAcmpPLFz3Daa(u4Gf2WRl4jA30QHPc.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj());
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final void Ca81ebIan1u(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) {
        zvqhqc7YVxGqa3qIRo zvqhqc7yvxgqa3qiro = this.LaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        zvqhqc7yvxgqa3qiro.ZfQNn8hdWlEQ5cR94249PDsLR(j);
        zvqhqc7yvxgqa3qiro.Irh5auREsoeV1C1RaBamlmy("\r\n");
        zvqhqc7yvxgqa3qiro.Ca81ebIan1u(j, eouCzLZsW9ynithduh);
        zvqhqc7yvxgqa3qiro.Irh5auREsoeV1C1RaBamlmy("\r\n");
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            return;
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = true;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR.Irh5auREsoeV1C1RaBamlmy("0\r\n\r\n");
        FAcmpPLFz3Daa fAcmpPLFz3Daa = this.V57tEvNfxZVVcOCAOih5PKr;
        Rls9YNaGzWVnzvwT rls9YNaGzWVnzvwT = fAcmpPLFz3Daa.LaeGQIruHQu81hfJldjMOQSVblH3x;
        fAcmpPLFz3Daa.LaeGQIruHQu81hfJldjMOQSVblH3x = Rls9YNaGzWVnzvwT.ZfQNn8hdWlEQ5cR94249PDsLR;
        rls9YNaGzWVnzvwT.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        rls9YNaGzWVnzvwT.zzpBGItXfub0yWj();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.LaeGQIruHQu81hfJldjMOQSVblH3x = 3;
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk, java.io.Flushable
    public final synchronized void flush() {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            return;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR.flush();
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }
}
