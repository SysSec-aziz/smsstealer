package com.vdodsodjsdt;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Um0z2cMcEZpu6blUyqa58pl implements Closeable {
    public final SQLiteDatabase V57tEvNfxZVVcOCAOih5PKr;
    public static final String[] ZfQNn8hdWlEQ5cR94249PDsLR = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] LaeGQIruHQu81hfJldjMOQSVblH3x = new String[0];

    public Um0z2cMcEZpu6blUyqa58pl(SQLiteDatabase sQLiteDatabase) {
        this.V57tEvNfxZVVcOCAOih5PKr = sQLiteDatabase;
    }

    public final void KUYypEB4eNWOZWVDpH(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "sql");
        this.V57tEvNfxZVVcOCAOih5PKr.execSQL(str);
    }

    public final cGYUoKJ5QrSVTXdZE1f88VdPb3 LaeGQIruHQu81hfJldjMOQSVblH3x(String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.V57tEvNfxZVVcOCAOih5PKr.compileStatement(str);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new cGYUoKJ5QrSVTXdZE1f88VdPb3(sQLiteStatementCompileStatement);
    }

    public final void M9e7PWhFYLD2lOGMker() {
        this.V57tEvNfxZVVcOCAOih5PKr.endTransaction();
    }

    public final boolean RhfGHxtXxy0M0grmp2jkRjQg() {
        return this.V57tEvNfxZVVcOCAOih5PKr.inTransaction();
    }

    public final boolean SuB3hEmTmbbRGAhtvOOmfKEon() {
        SQLiteDatabase sQLiteDatabase = this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.pYmKDYlAmhudp(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        this.V57tEvNfxZVVcOCAOih5PKr.beginTransactionNonExclusive();
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        this.V57tEvNfxZVVcOCAOih5PKr.beginTransaction();
    }

    public final Cursor aXO0LSrt8bKV(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "query");
        return pzqP2AqKW6J5PO8zCKnW(new aqhhl68tQrgIjcMGB3dY2YLK3vN(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.V57tEvNfxZVVcOCAOih5PKr.close();
    }

    public final Cursor pzqP2AqKW6J5PO8zCKnW(M9zmSQ9uvfJjc32nUm5k6W1oN m9zmSQ9uvfJjc32nUm5k6W1oN) {
        final f27r1jtqnt f27r1jtqntVar = new f27r1jtqnt(m9zmSQ9uvfJjc32nUm5k6W1oN);
        Cursor cursorRawQueryWithFactory = this.V57tEvNfxZVVcOCAOih5PKr.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: com.vdodsodjsdt.hvYy4FYIMo4NyqI7fUY8WYFbVHOt
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                f27r1jtqnt f27r1jtqntVar2 = f27r1jtqntVar;
                f27r1jtqntVar2.getClass();
                M9zmSQ9uvfJjc32nUm5k6W1oN m9zmSQ9uvfJjc32nUm5k6W1oN2 = f27r1jtqntVar2.ZfQNn8hdWlEQ5cR94249PDsLR;
                ej6unYlOWMDF.p59rPv72J9(sQLiteQuery);
                m9zmSQ9uvfJjc32nUm5k6W1oN2.LaeGQIruHQu81hfJldjMOQSVblH3x(new IWzBeXPjzO0MNoLJ8NZ3SRQTWDS8V(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, m9zmSQ9uvfJjc32nUm5k6W1oN.V57tEvNfxZVVcOCAOih5PKr(), LaeGQIruHQu81hfJldjMOQSVblH3x, null);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }

    public final void q11o1hieEkZDhF1MGOZI26oZiDT(Object[] objArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "bindArgs");
        this.V57tEvNfxZVVcOCAOih5PKr.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final void vE4yDIjexsP2lGjLaTcB() {
        this.V57tEvNfxZVVcOCAOih5PKr.setTransactionSuccessful();
    }
}
