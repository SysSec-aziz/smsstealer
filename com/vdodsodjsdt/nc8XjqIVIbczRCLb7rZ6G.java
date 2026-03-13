package com.vdodsodjsdt;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nc8XjqIVIbczRCLb7rZ6G implements iIBl3qIny2 {
    public final Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ nc8XjqIVIbczRCLb7rZ6G(int i, Object obj, Object obj2) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                upy0Ra78zBESm9Lr9V9Tg upy0ra78zbesm9lr9v9tg = (upy0Ra78zBESm9Lr9V9Tg) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                nc8XjqIVIbczRCLb7rZ6G nc8xjqivibczrclb7rz6g = (nc8XjqIVIbczRCLb7rZ6G) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                upy0ra78zbesm9lr9v9tg.NSjgqmGjEzuugn2SsG1mZFP();
                try {
                    nc8xjqivibczrclb7rz6g.close();
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
                ((InputStream) this.ZfQNn8hdWlEQ5cR94249PDsLR).close();
                return;
        }
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2
    public final long ko09zE6UAgwkV(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) throws IOException {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                upy0Ra78zBESm9Lr9V9Tg upy0ra78zbesm9lr9v9tg = (upy0Ra78zBESm9Lr9V9Tg) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                nc8XjqIVIbczRCLb7rZ6G nc8xjqivibczrclb7rz6g = (nc8XjqIVIbczRCLb7rZ6G) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                upy0ra78zbesm9lr9v9tg.NSjgqmGjEzuugn2SsG1mZFP();
                try {
                    long jKo09zE6UAgwkV = nc8xjqivibczrclb7rz6g.ko09zE6UAgwkV(8192L, eouCzLZsW9ynithduh);
                    if (upy0ra78zbesm9lr9v9tg.GI83zq0G8e7zkn()) {
                        throw upy0ra78zbesm9lr9v9tg.HzCpKshMOoaw76hFcbOVRYMeRd(null);
                    }
                    return jKo09zE6UAgwkV;
                } catch (IOException e) {
                    if (upy0ra78zbesm9lr9v9tg.GI83zq0G8e7zkn()) {
                        throw upy0ra78zbesm9lr9v9tg.HzCpKshMOoaw76hFcbOVRYMeRd(e);
                    }
                    throw e;
                } finally {
                    upy0ra78zbesm9lr9v9tg.GI83zq0G8e7zkn();
                }
            default:
                try {
                    ((Rls9YNaGzWVnzvwT) this.LaeGQIruHQu81hfJldjMOQSVblH3x).zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                    tpWzSW479hfzvFH5 tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW = eouCzLZsW9ynithduh.pzqP2AqKW6J5PO8zCKnW(1);
                    int i = ((InputStream) this.ZfQNn8hdWlEQ5cR94249PDsLR).read(tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m, tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr, (int) Math.min(8192L, 8192 - tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr));
                    if (i == -1) {
                        if (tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.zzpBGItXfub0yWj == tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr) {
                            eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr = tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                            XV5lwP1ltOyG6fBWn0goPh0ZOfW9.VxUQ9tBhpHJ2AAEDNW8sghc4m(tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW);
                        }
                        return -1L;
                    }
                    tpwzsw479hfzvfh5PzqP2AqKW6J5PO8zCKnW.V57tEvNfxZVVcOCAOih5PKr += i;
                    long j2 = i;
                    eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (NGazqytLkjPn2m.VxUQ9tBhpHJ2AAEDNW8sghc4m(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    public final String toString() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                return "AsyncTimeout.source(" + ((nc8XjqIVIbczRCLb7rZ6G) this.LaeGQIruHQu81hfJldjMOQSVblH3x) + ')';
            default:
                return "source(" + ((InputStream) this.ZfQNn8hdWlEQ5cR94249PDsLR) + ')';
        }
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2, com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                return (upy0Ra78zBESm9Lr9V9Tg) this.ZfQNn8hdWlEQ5cR94249PDsLR;
            default:
                return (Rls9YNaGzWVnzvwT) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
    }
}
