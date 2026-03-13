package com.vdodsodjsdt;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class u7sKwVkq9wY342fX3xuIdCIDU9 extends SsiwtF6NFC0P {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr = 1;
    public final Context ZfQNn8hdWlEQ5cR94249PDsLR;

    public u7sKwVkq9wY342fX3xuIdCIDU9(Context context, int i, int i2) {
        super(i, i2);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = context;
    }

    @Override // com.vdodsodjsdt.SsiwtF6NFC0P
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58pl) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                if (this.zzpBGItXfub0yWj >= 10) {
                    um0z2cMcEZpu6blUyqa58pl.q11o1hieEkZDhF1MGOZI26oZiDT(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.ZfQNn8hdWlEQ5cR94249PDsLR.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                um0z2cMcEZpu6blUyqa58pl.KUYypEB4eNWOZWVDpH("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    um0z2cMcEZpu6blUyqa58pl.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    try {
                        um0z2cMcEZpu6blUyqa58pl.q11o1hieEkZDhF1MGOZI26oZiDT(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        um0z2cMcEZpu6blUyqa58pl.q11o1hieEkZDhF1MGOZI26oZiDT(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        um0z2cMcEZpu6blUyqa58pl.vE4yDIjexsP2lGjLaTcB();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    um0z2cMcEZpu6blUyqa58pl.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    try {
                        um0z2cMcEZpu6blUyqa58pl.q11o1hieEkZDhF1MGOZI26oZiDT(new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                        um0z2cMcEZpu6blUyqa58pl.q11o1hieEkZDhF1MGOZI26oZiDT(new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                        sharedPreferences2.edit().clear().apply();
                        um0z2cMcEZpu6blUyqa58pl.vE4yDIjexsP2lGjLaTcB();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public u7sKwVkq9wY342fX3xuIdCIDU9(Context context) {
        super(9, 10);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = context;
    }
}
