package com.vdodsodjsdt;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class TGLcRwWGu8YLUNxbS0tKEz {
    public static final String[] p59rPv72J9 = {"UPDATE", "DELETE", "INSERT"};
    public final Zqam9EI4z3IGnFKq GI83zq0G8e7zkn;
    public final Object HzCpKshMOoaw76hFcbOVRYMeRd;
    public final Object KUYypEB4eNWOZWVDpH;
    public final String[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final dMJzfWfinPaaf19pTno5S3Iet7AJ M9e7PWhFYLD2lOGMker;
    public volatile cGYUoKJ5QrSVTXdZE1f88VdPb3 NSjgqmGjEzuugn2SsG1mZFP;
    public final HashMap V57tEvNfxZVVcOCAOih5PKr;
    public final WorkDatabase_Impl VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public volatile boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final LinkedHashMap ZfQNn8hdWlEQ5cR94249PDsLR;
    public final RfOSIaL6qUBGKJY9MSCBP5ba q1wNbhk2O6;
    public final AtomicBoolean zIvmSL0wzmmKGc3X39b2Gw2mUGE = new AtomicBoolean(false);
    public final HashMap zzpBGItXfub0yWj;

    public TGLcRwWGu8YLUNxbS0tKEz(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        String lowerCase;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = workDatabase_Impl;
        this.zzpBGItXfub0yWj = map;
        this.V57tEvNfxZVVcOCAOih5PKr = map2;
        this.GI83zq0G8e7zkn = new Zqam9EI4z3IGnFKq(strArr.length);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.M9e7PWhFYLD2lOGMker = new dMJzfWfinPaaf19pTno5S3Iet7AJ();
        this.HzCpKshMOoaw76hFcbOVRYMeRd = new Object();
        this.KUYypEB4eNWOZWVDpH = new Object();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(locale, "US");
            String lowerCase2 = str.toLowerCase(locale);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.ZfQNn8hdWlEQ5cR94249PDsLR.put(lowerCase2, Integer.valueOf(i));
            String str2 = (String) this.zzpBGItXfub0yWj.get(strArr[i]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i] = lowerCase2;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = strArr2;
        for (Map.Entry entry : this.zzpBGItXfub0yWj.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(locale2, "US");
            String lowerCase3 = str3.toLowerCase(locale2);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                ej6unYlOWMDF.pYmKDYlAmhudp(linkedHashMap, "<this>");
                Object obj = linkedHashMap.get(lowerCase3);
                if (obj == null && !linkedHashMap.containsKey(lowerCase3)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase3) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase4, obj);
            }
        }
        this.q1wNbhk2O6 = new RfOSIaL6qUBGKJY9MSCBP5ba(7, this);
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58pl, int i) {
        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.LaeGQIruHQu81hfJldjMOQSVblH3x[i];
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = p59rPv72J9[i2];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + KfeOQNOupsCg6878zi4e.SuB3hEmTmbbRGAhtvOOmfKEon(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i + " AND invalidated = 0; END";
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(str3, "StringBuilder().apply(builderAction).toString()");
            um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH(str3);
        }
    }

    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58pl = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (um0z2cMcEZpu6blUyqa58pl == null || !um0z2cMcEZpu6blUyqa58pl.V57tEvNfxZVVcOCAOih5PKr.isOpen()) {
            return false;
        }
        if (!this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP().w0Wu95l8dVNw5rZMRu();
        }
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58pl) {
        ej6unYlOWMDF.pYmKDYlAmhudp(um0z2cMcEZpu6blUyqa58pl, "database");
        if (um0z2cMcEZpu6blUyqa58pl.RhfGHxtXxy0M0grmp2jkRjQg()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP.readLock();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(lock, "readWriteLock.readLock()");
            lock.lock();
            try {
                synchronized (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
                    int[] iArrV57tEvNfxZVVcOCAOih5PKr = this.GI83zq0G8e7zkn.V57tEvNfxZVVcOCAOih5PKr();
                    if (iArrV57tEvNfxZVVcOCAOih5PKr != null) {
                        if (um0z2cMcEZpu6blUyqa58pl.SuB3hEmTmbbRGAhtvOOmfKEon()) {
                            um0z2cMcEZpu6blUyqa58pl.V57tEvNfxZVVcOCAOih5PKr();
                        } else {
                            um0z2cMcEZpu6blUyqa58pl.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        }
                        try {
                            int length = iArrV57tEvNfxZVVcOCAOih5PKr.length;
                            int i = 0;
                            int i2 = 0;
                            while (i < length) {
                                int i3 = iArrV57tEvNfxZVVcOCAOih5PKr[i];
                                int i4 = i2 + 1;
                                if (i3 == 1) {
                                    V57tEvNfxZVVcOCAOih5PKr(um0z2cMcEZpu6blUyqa58pl, i2);
                                } else if (i3 == 2) {
                                    String str = this.LaeGQIruHQu81hfJldjMOQSVblH3x[i2];
                                    String[] strArr = p59rPv72J9;
                                    for (int i5 = 0; i5 < 3; i5++) {
                                        String str2 = "DROP TRIGGER IF EXISTS " + KfeOQNOupsCg6878zi4e.SuB3hEmTmbbRGAhtvOOmfKEon(str, strArr[i5]);
                                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(str2, "StringBuilder().apply(builderAction).toString()");
                                        um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH(str2);
                                    }
                                }
                                i++;
                                i2 = i4;
                            }
                            um0z2cMcEZpu6blUyqa58pl.vE4yDIjexsP2lGjLaTcB();
                            um0z2cMcEZpu6blUyqa58pl.M9e7PWhFYLD2lOGMker();
                        } catch (Throwable th) {
                            um0z2cMcEZpu6blUyqa58pl.M9e7PWhFYLD2lOGMker();
                            throw th;
                        }
                    }
                }
            } finally {
                lock.unlock();
            }
        } catch (SQLiteException e) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
        } catch (IllegalStateException e2) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e2);
        }
    }

    public final void zzpBGItXfub0yWj(o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21) {
        IHZaqbVAz1yzx6ECKm iHZaqbVAz1yzx6ECKm;
        boolean z;
        WorkDatabase_Impl workDatabase_Impl;
        Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58pl;
        synchronized (this.M9e7PWhFYLD2lOGMker) {
            iHZaqbVAz1yzx6ECKm = (IHZaqbVAz1yzx6ECKm) this.M9e7PWhFYLD2lOGMker.zzpBGItXfub0yWj(o6oxmoscd9hj6lf8utncntx9cf21);
        }
        if (iHZaqbVAz1yzx6ECKm != null) {
            Zqam9EI4z3IGnFKq zqam9EI4z3IGnFKq = this.GI83zq0G8e7zkn;
            int[] iArr = iHZaqbVAz1yzx6ECKm.zzpBGItXfub0yWj;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            zqam9EI4z3IGnFKq.getClass();
            ej6unYlOWMDF.pYmKDYlAmhudp(iArrCopyOf, "tableIds");
            synchronized (zqam9EI4z3IGnFKq) {
                z = false;
                for (int i : iArrCopyOf) {
                    long[] jArr = (long[]) zqam9EI4z3IGnFKq.zzpBGItXfub0yWj;
                    long j = jArr[i];
                    jArr[i] = j - 1;
                    if (j == 1) {
                        zqam9EI4z3IGnFKq.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
                        z = true;
                    }
                }
            }
            if (z && (um0z2cMcEZpu6blUyqa58pl = (workDatabase_Impl = this.VxUQ9tBhpHJ2AAEDNW8sghc4m).VxUQ9tBhpHJ2AAEDNW8sghc4m) != null && um0z2cMcEZpu6blUyqa58pl.V57tEvNfxZVVcOCAOih5PKr.isOpen()) {
                ZfQNn8hdWlEQ5cR94249PDsLR(workDatabase_Impl.NSjgqmGjEzuugn2SsG1mZFP().w0Wu95l8dVNw5rZMRu());
            }
        }
    }
}
