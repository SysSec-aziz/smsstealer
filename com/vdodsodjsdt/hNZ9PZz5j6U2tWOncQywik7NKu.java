package com.vdodsodjsdt;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hNZ9PZz5j6U2tWOncQywik7NKu implements iIBl3qIny2 {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final hy3v1zJcCYok89Y1iAeFhN66 V57tEvNfxZVVcOCAOih5PKr;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public hNZ9PZz5j6U2tWOncQywik7NKu(hy3v1zJcCYok89Y1iAeFhN66 hy3v1zjccyok89y1iaefhn66) {
        ej6unYlOWMDF.pYmKDYlAmhudp(hy3v1zjccyok89y1iaefhn66, "source");
        this.V57tEvNfxZVVcOCAOih5PKr = hy3v1zjccyok89y1iaefhn66;
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2
    public final long ko09zE6UAgwkV(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            hy3v1zJcCYok89Y1iAeFhN66 hy3v1zjccyok89y1iaefhn66 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (i3 == 0) {
                hy3v1zjccyok89y1iaefhn66.skip(this.NSjgqmGjEzuugn2SsG1mZFP);
                this.NSjgqmGjEzuugn2SsG1mZFP = 0;
                if ((this.LaeGQIruHQu81hfJldjMOQSVblH3x & 4) == 0) {
                    i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                    int iKUYypEB4eNWOZWVDpH = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.KUYypEB4eNWOZWVDpH(hy3v1zjccyok89y1iaefhn66);
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ = iKUYypEB4eNWOZWVDpH;
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = iKUYypEB4eNWOZWVDpH;
                    int i4 = hy3v1zjccyok89y1iaefhn66.readByte() & 255;
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x = hy3v1zjccyok89y1iaefhn66.readByte() & 255;
                    Logger logger = fwzr2yRMgOq0UE8cQLHe.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                    if (logger.isLoggable(Level.FINE)) {
                        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = tFVUzh05cCwb.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        logger.fine(tFVUzh05cCwb.zzpBGItXfub0yWj(true, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZfQNn8hdWlEQ5cR94249PDsLR, i4, this.LaeGQIruHQu81hfJldjMOQSVblH3x));
                    }
                    i2 = hy3v1zjccyok89y1iaefhn66.readInt() & Integer.MAX_VALUE;
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jKo09zE6UAgwkV = hy3v1zjccyok89y1iaefhn66.ko09zE6UAgwkV(Math.min(8192L, i3), eouCzLZsW9ynithduh);
                if (jKo09zE6UAgwkV != -1) {
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ -= (int) jKo09zE6UAgwkV;
                    return jKo09zE6UAgwkV;
                }
            }
            return -1L;
        } while (i2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2, com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        return this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
