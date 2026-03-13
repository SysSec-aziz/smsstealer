package com.vdodsodjsdt;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class j8cYbznT7ugZEUE04S8p0 implements zvqhqc7YVxGqa3qIRo {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final CZ74FjSsfST8z15SHXk V57tEvNfxZVVcOCAOih5PKr;
    public final EouCzLZsW9ynithduh ZfQNn8hdWlEQ5cR94249PDsLR;

    public j8cYbznT7ugZEUE04S8p0(CZ74FjSsfST8z15SHXk cZ74FjSsfST8z15SHXk) {
        ej6unYlOWMDF.pYmKDYlAmhudp(cZ74FjSsfST8z15SHXk, "sink");
        this.V57tEvNfxZVVcOCAOih5PKr = cZ74FjSsfST8z15SHXk;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new EouCzLZsW9ynithduh();
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final void Ca81ebIan1u(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh) {
        ej6unYlOWMDF.pYmKDYlAmhudp(eouCzLZsW9ynithduh, "source");
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.Ca81ebIan1u(j, eouCzLZsW9ynithduh);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final zvqhqc7YVxGqa3qIRo Irh5auREsoeV1C1RaBamlmy(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "string");
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.TqcnImqkSWIKht(str);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return this;
    }

    public final zvqhqc7YVxGqa3qIRo VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        long j = eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (j == 0) {
            j = 0;
        } else {
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = eouCzLZsW9ynithduh.V57tEvNfxZVVcOCAOih5PKr;
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh5);
            tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = tpwzsw479hfzvfh5.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            ej6unYlOWMDF.p59rPv72J9(tpwzsw479hfzvfh52);
            int i = tpwzsw479hfzvfh52.V57tEvNfxZVVcOCAOih5PKr;
            if (i < 8192 && tpwzsw479hfzvfh52.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                j -= (long) (i - tpwzsw479hfzvfh52.zzpBGItXfub0yWj);
            }
        }
        if (j > 0) {
            this.V57tEvNfxZVVcOCAOih5PKr.Ca81ebIan1u(j, eouCzLZsW9ynithduh);
        }
        return this;
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final zvqhqc7YVxGqa3qIRo ZfQNn8hdWlEQ5cR94249PDsLR(long j) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.y1NaPKTl7R18DOr6e8i5(j);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return this;
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CZ74FjSsfST8z15SHXk cZ74FjSsfST8z15SHXk = this.V57tEvNfxZVVcOCAOih5PKr;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return;
        }
        try {
            EouCzLZsW9ynithduh eouCzLZsW9ynithduh = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            long j = eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (j > 0) {
                cZ74FjSsfST8z15SHXk.Ca81ebIan1u(j, eouCzLZsW9ynithduh);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            cZ74FjSsfST8z15SHXk.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo, com.vdodsodjsdt.CZ74FjSsfST8z15SHXk, java.io.Flushable
    public final void flush() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        long j = eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR;
        CZ74FjSsfST8z15SHXk cZ74FjSsfST8z15SHXk = this.V57tEvNfxZVVcOCAOih5PKr;
        if (j > 0) {
            cZ74FjSsfST8z15SHXk.Ca81ebIan1u(j, eouCzLZsW9ynithduh);
        }
        cZ74FjSsfST8z15SHXk.flush();
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final long h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iIBl3qIny2 iibl3qiny2) throws IOException {
        long j = 0;
        while (true) {
            long jKo09zE6UAgwkV = ((nc8XjqIVIbczRCLb7rZ6G) iibl3qiny2).ko09zE6UAgwkV(8192L, this.ZfQNn8hdWlEQ5cR94249PDsLR);
            if (jKo09zE6UAgwkV == -1) {
                return j;
            }
            j += jKo09zE6UAgwkV;
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final zvqhqc7YVxGqa3qIRo pYmKDYlAmhudp(oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg) {
        ej6unYlOWMDF.pYmKDYlAmhudp(oa1wo3soicf8h1n6bgpg, "byteString");
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.vE4yDIjexsP2lGjLaTcB(oa1wo3soicf8h1n6bgpg);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.V57tEvNfxZVVcOCAOih5PKr + ')';
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final zvqhqc7YVxGqa3qIRo vBGA6pPLqSMuYGvprl270j7(int i, byte[] bArr) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.aXO0LSrt8bKV(i, bArr);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        ej6unYlOWMDF.pYmKDYlAmhudp(byteBuffer, "source");
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.ZfQNn8hdWlEQ5cR94249PDsLR.write(byteBuffer);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return iWrite;
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final zvqhqc7YVxGqa3qIRo writeByte(int i) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.O1xDAlBZZlZdoEf747lCFHld(i);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return this;
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final zvqhqc7YVxGqa3qIRo writeInt(int i) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.qygqjTppWwx992(i);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return this;
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final zvqhqc7YVxGqa3qIRo writeShort(int i) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalStateException("closed");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.iKANjmyTSxO6v6UuLPdu7DxOjlS(i);
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return this;
    }

    @Override // com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        return this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj();
    }

    @Override // com.vdodsodjsdt.zvqhqc7YVxGqa3qIRo
    public final zvqhqc7YVxGqa3qIRo write(byte[] bArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "source");
        if (!this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.aXO0LSrt8bKV(bArr.length, bArr);
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
