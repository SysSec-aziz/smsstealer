package com.vdodsodjsdt;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class IWzBeXPjzO0MNoLJ8NZ3SRQTWDS8V implements VFqnQARHTng {
    public final SQLiteProgram V57tEvNfxZVVcOCAOih5PKr;

    public IWzBeXPjzO0MNoLJ8NZ3SRQTWDS8V(SQLiteProgram sQLiteProgram) {
        ej6unYlOWMDF.pYmKDYlAmhudp(sQLiteProgram, "delegate");
        this.V57tEvNfxZVVcOCAOih5PKr = sQLiteProgram;
    }

    @Override // com.vdodsodjsdt.VFqnQARHTng
    public final void GI83zq0G8e7zkn(int i, double d) {
        this.V57tEvNfxZVVcOCAOih5PKr.bindDouble(i, d);
    }

    @Override // com.vdodsodjsdt.VFqnQARHTng
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.V57tEvNfxZVVcOCAOih5PKr.close();
    }

    @Override // com.vdodsodjsdt.VFqnQARHTng
    public final void f6ZQsR6bPLvvCDNXOUc(String str, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "value");
        this.V57tEvNfxZVVcOCAOih5PKr.bindString(i, str);
    }

    @Override // com.vdodsodjsdt.VFqnQARHTng
    public final void jW7EiD0YL6xkbB158jMUzhWNWb1y(int i, byte[] bArr) {
        this.V57tEvNfxZVVcOCAOih5PKr.bindBlob(i, bArr);
    }

    @Override // com.vdodsodjsdt.VFqnQARHTng
    public final void p59rPv72J9(int i, long j) {
        this.V57tEvNfxZVVcOCAOih5PKr.bindLong(i, j);
    }
}
