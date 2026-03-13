package com.vdodsodjsdt;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.UserManager;
import android.text.TextUtils;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zOMUjPXkm1MlWYwMLhvxaazucg6R6 implements Runnable {
    public final Jw5Ce78MpXxfpSSBw33DWMfqt5tO LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Context V57tEvNfxZVVcOCAOih5PKr;
    public final kooPss93uoBTOWlOLlaD ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
    public static final String ZLZeBXTMq0zDztBxtRTuCHrapQ = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("ForceStopRunnable");
    public static final long NSjgqmGjEzuugn2SsG1mZFP = TimeUnit.DAYS.toMillis(3650);

    public zOMUjPXkm1MlWYwMLhvxaazucg6R6(Context context, kooPss93uoBTOWlOLlaD koopss93uobtowlollad) {
        this.V57tEvNfxZVVcOCAOih5PKr = context.getApplicationContext();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = koopss93uobtowlollad;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = koopss93uobtowlollad.p59rPv72J9;
    }

    public static void V57tEvNfxZVVcOCAOih5PKr(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + NSjgqmGjEzuugn2SsG1mZFP;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.zOMUjPXkm1MlWYwMLhvxaazucg6R6.VxUQ9tBhpHJ2AAEDNW8sghc4m():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.V57tEvNfxZVVcOCAOih5PKr;
        String str = ZLZeBXTMq0zDztBxtRTuCHrapQ;
        kooPss93uoBTOWlOLlaD koopss93uobtowlollad = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        try {
            if (!zzpBGItXfub0yWj()) {
                return;
            }
            while (true) {
                try {
                    sGipz63rTUmSj3uFDvOtzihao.HVEwbdULInpTNa0IG(context);
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Performing cleanup operations.");
                    try {
                        VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE + 1;
                        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
                        if (i >= 3) {
                            String str2 = ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            koopss93uobtowlollad.GI83zq0G8e7zkn.getClass();
                            throw illegalStateException;
                        }
                        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zzpBGItXfub0yWj(str, "Retrying after " + (((long) i) * 300), e);
                        try {
                            Thread.sleep(((long) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    koopss93uobtowlollad.GI83zq0G8e7zkn.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            koopss93uobtowlollad.lQ0rO9lhQIyVe7Rp6();
        }
    }

    public final boolean zzpBGItXfub0yWj() {
        Eh21X7fdrXs eh21X7fdrXs = this.ZfQNn8hdWlEQ5cR94249PDsLR.GI83zq0G8e7zkn;
        eh21X7fdrXs.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (zIsEmpty) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "The default process name was not specified.");
            return true;
        }
        boolean zVxUQ9tBhpHJ2AAEDNW8sghc4m = kUxvcfiNJSWAdKuXlNcXOpLKKC.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.V57tEvNfxZVVcOCAOih5PKr, eh21X7fdrXs);
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Is default app process = " + zVxUQ9tBhpHJ2AAEDNW8sghc4m);
        return zVxUQ9tBhpHJ2AAEDNW8sghc4m;
    }
}
