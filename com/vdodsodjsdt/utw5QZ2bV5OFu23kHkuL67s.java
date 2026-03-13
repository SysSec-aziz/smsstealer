package com.vdodsodjsdt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class utw5QZ2bV5OFu23kHkuL67s extends OutputStream {
    public final FileOutputStream V57tEvNfxZVVcOCAOih5PKr;

    public utw5QZ2bV5OFu23kHkuL67s(FileOutputStream fileOutputStream) {
        this.V57tEvNfxZVVcOCAOih5PKr = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.V57tEvNfxZVVcOCAOih5PKr.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.V57tEvNfxZVVcOCAOih5PKr.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "b");
        this.V57tEvNfxZVVcOCAOih5PKr.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "bytes");
        this.V57tEvNfxZVVcOCAOih5PKr.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
