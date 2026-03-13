package com.vdodsodjsdt;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nfXvCNpsFLQkxk3Wa implements hy3v1zJcCYok89Y1iAeFhN66 {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final iIBl3qIny2 V57tEvNfxZVVcOCAOih5PKr;
    public final EouCzLZsW9ynithduh ZfQNn8hdWlEQ5cR94249PDsLR;

    public nfXvCNpsFLQkxk3Wa(iIBl3qIny2 iibl3qiny2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(iibl3qiny2, "source");
        this.V57tEvNfxZVVcOCAOih5PKr = iibl3qiny2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new EouCzLZsW9ynithduh();
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final boolean HzCpKshMOoaw76hFcbOVRYMeRd() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return eouCzLZsW9ynithduh.HzCpKshMOoaw76hFcbOVRYMeRd() && this.V57tEvNfxZVVcOCAOih5PKr.ko09zE6UAgwkV(8192L, eouCzLZsW9ynithduh) == -1;
    }

    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x(long j) {
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh;
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        do {
            eouCzLZsW9ynithduh = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR >= j) {
                return true;
            }
        } while (this.V57tEvNfxZVVcOCAOih5PKr.ko09zE6UAgwkV(8192L, eouCzLZsW9ynithduh) != -1);
        return false;
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final String NSjgqmGjEzuugn2SsG1mZFP() {
        return q1wNbhk2O6(Long.MAX_VALUE);
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final void TaDO7ogis3aEiWEtq(long j) throws EOFException {
        if (!LaeGQIruHQu81hfJldjMOQSVblH3x(j)) {
            throw new EOFException();
        }
    }

    public final int V57tEvNfxZVVcOCAOih5PKr() throws EOFException {
        TaDO7ogis3aEiWEtq(4L);
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public final long VxUQ9tBhpHJ2AAEDNW8sghc4m(byte b, long j, long j2) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        if (0 > j2) {
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j2).toString());
        }
        long jMax = 0;
        while (jMax < j2) {
            EouCzLZsW9ynithduh eouCzLZsW9ynithduh = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            byte b2 = b;
            long j3 = j2;
            long jM9e7PWhFYLD2lOGMker = eouCzLZsW9ynithduh.M9e7PWhFYLD2lOGMker(b2, jMax, j3);
            if (jM9e7PWhFYLD2lOGMker != -1) {
                return jM9e7PWhFYLD2lOGMker;
            }
            long j4 = eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (j4 >= j3 || this.V57tEvNfxZVVcOCAOih5PKr.ko09zE6UAgwkV(8192L, eouCzLZsW9ynithduh) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        this.V57tEvNfxZVVcOCAOih5PKr.close();
        this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2
    public final long ko09zE6UAgwkV(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) {
        ej6unYlOWMDF.pYmKDYlAmhudp(eouCzLZsW9ynithduh, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (eouCzLZsW9ynithduh2.ZfQNn8hdWlEQ5cR94249PDsLR == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.V57tEvNfxZVVcOCAOih5PKr.ko09zE6UAgwkV(8192L, eouCzLZsW9ynithduh2) == -1) {
                return -1L;
            }
        }
        return eouCzLZsW9ynithduh2.ko09zE6UAgwkV(Math.min(j, eouCzLZsW9ynithduh2.ZfQNn8hdWlEQ5cR94249PDsLR), eouCzLZsW9ynithduh);
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final String q1wNbhk2O6(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m((byte) 10, 0L, j2);
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (jVxUQ9tBhpHJ2AAEDNW8sghc4m != -1) {
            return coyP1hCgJ7zr56eqQoO7H04E.VxUQ9tBhpHJ2AAEDNW8sghc4m(jVxUQ9tBhpHJ2AAEDNW8sghc4m, eouCzLZsW9ynithduh);
        }
        if (j2 < Long.MAX_VALUE && LaeGQIruHQu81hfJldjMOQSVblH3x(j2) && eouCzLZsW9ynithduh.LaeGQIruHQu81hfJldjMOQSVblH3x(j2 - 1) == 13 && LaeGQIruHQu81hfJldjMOQSVblH3x(j2 + 1) && eouCzLZsW9ynithduh.LaeGQIruHQu81hfJldjMOQSVblH3x(j2) == 10) {
            return coyP1hCgJ7zr56eqQoO7H04E.VxUQ9tBhpHJ2AAEDNW8sghc4m(j2, eouCzLZsW9ynithduh);
        }
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh2 = new EouCzLZsW9ynithduh();
        eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr(eouCzLZsW9ynithduh2, 0L, Math.min(32, eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR));
        throw new EOFException("\\n not found: limit=" + Math.min(eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR, j) + " content=" + eouCzLZsW9ynithduh2.zIvmSL0wzmmKGc3X39b2Gw2mUGE(eouCzLZsW9ynithduh2.ZfQNn8hdWlEQ5cR94249PDsLR).zzpBGItXfub0yWj() + (char) 8230);
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final long qNPQb1obP7() throws EOFException {
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh;
        byte bLaeGQIruHQu81hfJldjMOQSVblH3x;
        TaDO7ogis3aEiWEtq(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(i2);
            eouCzLZsW9ynithduh = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (!zLaeGQIruHQu81hfJldjMOQSVblH3x) {
                break;
            }
            bLaeGQIruHQu81hfJldjMOQSVblH3x = eouCzLZsW9ynithduh.LaeGQIruHQu81hfJldjMOQSVblH3x(i);
            if ((bLaeGQIruHQu81hfJldjMOQSVblH3x < 48 || bLaeGQIruHQu81hfJldjMOQSVblH3x > 57) && ((bLaeGQIruHQu81hfJldjMOQSVblH3x < 97 || bLaeGQIruHQu81hfJldjMOQSVblH3x > 102) && (bLaeGQIruHQu81hfJldjMOQSVblH3x < 65 || bLaeGQIruHQu81hfJldjMOQSVblH3x > 70))) {
                break;
            }
            i = i2;
        }
        if (i == 0) {
            F44whnLsbQ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(16);
            String string = Integer.toString(bLaeGQIruHQu81hfJldjMOQSVblH3x, 16);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return eouCzLZsW9ynithduh.qNPQb1obP7();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        ej6unYlOWMDF.pYmKDYlAmhudp(byteBuffer, "sink");
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR == 0 && this.V57tEvNfxZVVcOCAOih5PKr.ko09zE6UAgwkV(8192L, eouCzLZsW9ynithduh) == -1) {
            return -1;
        }
        return eouCzLZsW9ynithduh.read(byteBuffer);
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final byte readByte() throws EOFException {
        TaDO7ogis3aEiWEtq(1L);
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.readByte();
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final int readInt() throws EOFException {
        TaDO7ogis3aEiWEtq(4L);
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.readInt();
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final short readShort() throws EOFException {
        TaDO7ogis3aEiWEtq(2L);
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.readShort();
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final void skip(long j) throws EOFException {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            EouCzLZsW9ynithduh eouCzLZsW9ynithduh = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR == 0 && this.V57tEvNfxZVVcOCAOih5PKr.ko09zE6UAgwkV(8192L, eouCzLZsW9ynithduh) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR);
            eouCzLZsW9ynithduh.skip(jMin);
            j -= jMin;
        }
    }

    public final String toString() {
        return "buffer(" + this.V57tEvNfxZVVcOCAOih5PKr + ')';
    }

    @Override // com.vdodsodjsdt.hy3v1zJcCYok89Y1iAeFhN66
    public final oA1WO3soICf8H1N6bgpG zIvmSL0wzmmKGc3X39b2Gw2mUGE(long j) throws EOFException {
        TaDO7ogis3aEiWEtq(j);
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE(j);
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2, com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        return this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj();
    }
}
