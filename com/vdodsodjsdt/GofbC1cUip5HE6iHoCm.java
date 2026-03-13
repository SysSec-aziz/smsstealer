package com.vdodsodjsdt;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class GofbC1cUip5HE6iHoCm extends SQLiteOpenHelper {
    public static final /* synthetic */ int M9e7PWhFYLD2lOGMker = 0;
    public boolean GI83zq0G8e7zkn;
    public final EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final uSwMtrrFsGroJ7T5fAxDxv NSjgqmGjEzuugn2SsG1mZFP;
    public final Context V57tEvNfxZVVcOCAOih5PKr;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ ZfQNn8hdWlEQ5cR94249PDsLR;
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GofbC1cUip5HE6iHoCm(Context context, String str, final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, final EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb, boolean z) {
        String string;
        super(context, str, null, eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.zzpBGItXfub0yWj, new DatabaseErrorHandler() { // from class: com.vdodsodjsdt.lA167EzbT9ZMPv8dzsgPfM
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                ej6unYlOWMDF.pYmKDYlAmhudp(eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb, "$callback");
                int i = GofbC1cUip5HE6iHoCm.M9e7PWhFYLD2lOGMker;
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(sQLiteDatabase, "dbObj");
                Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58plSuB3hEmTmbbRGAhtvOOmfKEon = zonOxHotd3BwAPJcwqr6I6uQNngg4.SuB3hEmTmbbRGAhtvOOmfKEon(skgk8FYn8b4TvRiBOsElZw4XkNLhQ, sQLiteDatabase);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + um0z2cMcEZpu6blUyqa58plSuB3hEmTmbbRGAhtvOOmfKEon + ".path");
                SQLiteDatabase sQLiteDatabase2 = um0z2cMcEZpu6blUyqa58plSuB3hEmTmbbRGAhtvOOmfKEon.V57tEvNfxZVVcOCAOih5PKr;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.V57tEvNfxZVVcOCAOih5PKr(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(obj, "p.second");
                                EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.V57tEvNfxZVVcOCAOih5PKr((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.V57tEvNfxZVVcOCAOih5PKr(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    um0z2cMcEZpu6blUyqa58plSuB3hEmTmbbRGAhtvOOmfKEon.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        ej6unYlOWMDF.pYmKDYlAmhudp(eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb, "callback");
        this.V57tEvNfxZVVcOCAOih5PKr = context;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "randomUUID().toString()");
        } else {
            string = str;
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = new uSwMtrrFsGroJ7T5fAxDxv(string, context.getCacheDir(), false);
    }

    public final SQLiteDatabase LaeGQIruHQu81hfJldjMOQSVblH3x(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.GI83zq0G8e7zkn;
        Context context = this.V57tEvNfxZVVcOCAOih5PKr;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return V57tEvNfxZVVcOCAOih5PKr(z);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return V57tEvNfxZVVcOCAOih5PKr(z);
            } catch (Throwable th) {
                super.close();
                if (th instanceof XYMLxQWtrKv7K3aUM5djIR) {
                    XYMLxQWtrKv7K3aUM5djIR xYMLxQWtrKv7K3aUM5djIR = th;
                    int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(xYMLxQWtrKv7K3aUM5djIR.V57tEvNfxZVVcOCAOih5PKr);
                    Throwable th2 = xYMLxQWtrKv7K3aUM5djIR.ZfQNn8hdWlEQ5cR94249PDsLR;
                    if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0 || iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1 || iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 2 || iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return V57tEvNfxZVVcOCAOih5PKr(z);
                } catch (XYMLxQWtrKv7K3aUM5djIR e) {
                    throw e.ZfQNn8hdWlEQ5cR94249PDsLR;
                }
            }
        }
    }

    public final SQLiteDatabase V57tEvNfxZVVcOCAOih5PKr(boolean z) {
        if (z) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final Um0z2cMcEZpu6blUyqa58pl VxUQ9tBhpHJ2AAEDNW8sghc4m(boolean z) {
        uSwMtrrFsGroJ7T5fAxDxv uswmtrrfsgroj7t5faxdxv = this.NSjgqmGjEzuugn2SsG1mZFP;
        try {
            uswmtrrfsgroj7t5faxdxv.VxUQ9tBhpHJ2AAEDNW8sghc4m((this.GI83zq0G8e7zkn || getDatabaseName() == null) ? false : true);
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
            SQLiteDatabase sQLiteDatabaseLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(z);
            if (!this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58plSuB3hEmTmbbRGAhtvOOmfKEon = zonOxHotd3BwAPJcwqr6I6uQNngg4.SuB3hEmTmbbRGAhtvOOmfKEon(this.ZfQNn8hdWlEQ5cR94249PDsLR, sQLiteDatabaseLaeGQIruHQu81hfJldjMOQSVblH3x);
                uswmtrrfsgroj7t5faxdxv.zzpBGItXfub0yWj();
                return um0z2cMcEZpu6blUyqa58plSuB3hEmTmbbRGAhtvOOmfKEon;
            }
            close();
            Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58plVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(z);
            uswmtrrfsgroj7t5faxdxv.zzpBGItXfub0yWj();
            return um0z2cMcEZpu6blUyqa58plVxUQ9tBhpHJ2AAEDNW8sghc4m;
        } catch (Throwable th) {
            uswmtrrfsgroj7t5faxdxv.zzpBGItXfub0yWj();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        uSwMtrrFsGroJ7T5fAxDxv uswmtrrfsgroj7t5faxdxv = this.NSjgqmGjEzuugn2SsG1mZFP;
        try {
            uswmtrrfsgroj7t5faxdxv.VxUQ9tBhpHJ2AAEDNW8sghc4m(uswmtrrfsgroj7t5faxdxv.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            super.close();
            this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR = null;
            this.GI83zq0G8e7zkn = false;
        } finally {
            uswmtrrfsgroj7t5faxdxv.zzpBGItXfub0yWj();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        ej6unYlOWMDF.pYmKDYlAmhudp(sQLiteDatabase, "db");
        boolean z = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (!z && eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.zzpBGItXfub0yWj != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            zonOxHotd3BwAPJcwqr6I6uQNngg4.SuB3hEmTmbbRGAhtvOOmfKEon(this.ZfQNn8hdWlEQ5cR94249PDsLR, sQLiteDatabase);
            eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb.getClass();
        } catch (Throwable th) {
            throw new XYMLxQWtrKv7K3aUM5djIR(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        ej6unYlOWMDF.pYmKDYlAmhudp(sQLiteDatabase, "sqLiteDatabase");
        try {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.ZLZeBXTMq0zDztBxtRTuCHrapQ(zonOxHotd3BwAPJcwqr6I6uQNngg4.SuB3hEmTmbbRGAhtvOOmfKEon(this.ZfQNn8hdWlEQ5cR94249PDsLR, sQLiteDatabase));
        } catch (Throwable th) {
            throw new XYMLxQWtrKv7K3aUM5djIR(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(sQLiteDatabase, "db");
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        try {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn(zonOxHotd3BwAPJcwqr6I6uQNngg4.SuB3hEmTmbbRGAhtvOOmfKEon(this.ZfQNn8hdWlEQ5cR94249PDsLR, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new XYMLxQWtrKv7K3aUM5djIR(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        ej6unYlOWMDF.pYmKDYlAmhudp(sQLiteDatabase, "db");
        if (!this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            try {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x.NSjgqmGjEzuugn2SsG1mZFP(zonOxHotd3BwAPJcwqr6I6uQNngg4.SuB3hEmTmbbRGAhtvOOmfKEon(this.ZfQNn8hdWlEQ5cR94249PDsLR, sQLiteDatabase));
            } catch (Throwable th) {
                throw new XYMLxQWtrKv7K3aUM5djIR(5, th);
            }
        }
        this.GI83zq0G8e7zkn = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(sQLiteDatabase, "sqLiteDatabase");
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        try {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.GI83zq0G8e7zkn(zonOxHotd3BwAPJcwqr6I6uQNngg4.SuB3hEmTmbbRGAhtvOOmfKEon(this.ZfQNn8hdWlEQ5cR94249PDsLR, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new XYMLxQWtrKv7K3aUM5djIR(3, th);
        }
    }
}
