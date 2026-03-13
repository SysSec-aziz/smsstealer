package com.vdodsodjsdt;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class PCy9Vjdn2PU2l9YZPNyp0DZ {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("Alarms");

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, AhgUxI6t6E ahgUxI6t6E, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c2N07yv1ho1HeMFqUr4GuAbXooQP.NSjgqmGjEzuugn2SsG1mZFP;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c2N07yv1ho1HeMFqUr4GuAbXooQP.V57tEvNfxZVVcOCAOih5PKr(intent, ahgUxI6t6E);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(VxUQ9tBhpHJ2AAEDNW8sghc4m, "Cancelling existing alarm with (workSpecId, systemId) (" + ahgUxI6t6E + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void zzpBGItXfub0yWj(Context context, WorkDatabase workDatabase, AhgUxI6t6E ahgUxI6t6E, long j) {
        nMRZPpfLCgJyuB nmrzppflcgjyubH3jnZRsdwYJfY9UhQCkbvWciwvFHv = workDatabase.h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
        kjqQ3XJs4d kjqq3xjs4dQ1wNbhk2O6 = nmrzppflcgjyubH3jnZRsdwYJfY9UhQCkbvWciwvFHv.q1wNbhk2O6(ahgUxI6t6E);
        if (kjqq3xjs4dQ1wNbhk2O6 != null) {
            int i = kjqq3xjs4dQ1wNbhk2O6.V57tEvNfxZVVcOCAOih5PKr;
            VxUQ9tBhpHJ2AAEDNW8sghc4m(context, ahgUxI6t6E, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c2N07yv1ho1HeMFqUr4GuAbXooQP.NSjgqmGjEzuugn2SsG1mZFP;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c2N07yv1ho1HeMFqUr4GuAbXooQP.V57tEvNfxZVVcOCAOih5PKr(intent, ahgUxI6t6E);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        Object objP59rPv72J9 = workDatabase.p59rPv72J9(new Pwz3nahkq67x68Efvag6R8hCKmh00(2, new Jw5Ce78MpXxfpSSBw33DWMfqt5tO(workDatabase, 0)));
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objP59rPv72J9, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        int iIntValue = ((Number) objP59rPv72J9).intValue();
        nmrzppflcgjyubH3jnZRsdwYJfY9UhQCkbvWciwvFHv.p59rPv72J9(new kjqQ3XJs4d(ahgUxI6t6E.VxUQ9tBhpHJ2AAEDNW8sghc4m, ahgUxI6t6E.zzpBGItXfub0yWj, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c2N07yv1ho1HeMFqUr4GuAbXooQP.NSjgqmGjEzuugn2SsG1mZFP;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c2N07yv1ho1HeMFqUr4GuAbXooQP.V57tEvNfxZVVcOCAOih5PKr(intent2, ahgUxI6t6E);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
