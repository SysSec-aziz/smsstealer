package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.vdodsodjsdt.F44whnLsbQ;
import com.vdodsodjsdt.S28Az6EscEakl8kzvM;
import com.vdodsodjsdt.SX5PHeJQdzT24G3iHfmAKRZsddf;
import com.vdodsodjsdt.VKeHn9sH669RutJ8aaqncC;
import com.vdodsodjsdt.c0WB626RcDoa849JB;
import com.vdodsodjsdt.c9cdYDXIxS3U;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.fUHFsIYAhZNjnB;
import com.vdodsodjsdt.kooPss93uoBTOWlOLlaD;
import com.vdodsodjsdt.nMRZPpfLCgJyuB;
import com.vdodsodjsdt.o6OxmOsCD9HJ6LF8UTncnTX9Cf21;
import com.vdodsodjsdt.psATg3LCCdmDIiRgW;
import com.vdodsodjsdt.vIPEe55rgLxLcs;
import com.vdodsodjsdt.xgjEDGKy9VX5;
import com.vdodsodjsdt.yiLlTNbe9YUoPQ6QWt8Sre7U;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        ej6unYlOWMDF.pYmKDYlAmhudp(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public final fUHFsIYAhZNjnB V57tEvNfxZVVcOCAOih5PKr() throws Throwable {
        xgjEDGKy9VX5 xgjedgky9vx5;
        int iQ11o1hieEkZDhF1MGOZI26oZiDT;
        int iQ11o1hieEkZDhF1MGOZI26oZiDT2;
        int iQ11o1hieEkZDhF1MGOZI26oZiDT3;
        int iQ11o1hieEkZDhF1MGOZI26oZiDT4;
        int iQ11o1hieEkZDhF1MGOZI26oZiDT5;
        int iQ11o1hieEkZDhF1MGOZI26oZiDT6;
        int iQ11o1hieEkZDhF1MGOZI26oZiDT7;
        int iQ11o1hieEkZDhF1MGOZI26oZiDT8;
        int iQ11o1hieEkZDhF1MGOZI26oZiDT9;
        int iQ11o1hieEkZDhF1MGOZI26oZiDT10;
        int iQ11o1hieEkZDhF1MGOZI26oZiDT11;
        nMRZPpfLCgJyuB nmrzppflcgjyub;
        S28Az6EscEakl8kzvM s28Az6EscEakl8kzvM;
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21;
        kooPss93uoBTOWlOLlaD koopss93uobtowlolladL8DMw02rUTs2w = kooPss93uoBTOWlOLlaD.L8DMw02rUTs2w(this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        WorkDatabase workDatabase = koopss93uobtowlolladL8DMw02rUTs2w.M9e7PWhFYLD2lOGMker;
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(workDatabase, "workManager.workDatabase");
        SX5PHeJQdzT24G3iHfmAKRZsddf sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc = workDatabase.f6ZQsR6bPLvvCDNXOUc();
        S28Az6EscEakl8kzvM s28Az6EscEakl8kzvMKo09zE6UAgwkV = workDatabase.ko09zE6UAgwkV();
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21VBGA6pPLqSMuYGvprl270j7 = workDatabase.vBGA6pPLqSMuYGvprl270j7();
        nMRZPpfLCgJyuB nmrzppflcgjyubH3jnZRsdwYJfY9UhQCkbvWciwvFHv = workDatabase.h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
        koopss93uobtowlolladL8DMw02rUTs2w.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.getClass();
        xgjEDGKy9VX5 xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m = xgjEDGKy9VX5.VxUQ9tBhpHJ2AAEDNW8sghc4m("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m.p59rPv72J9(1, jCurrentTimeMillis);
        WorkDatabase_Impl workDatabase_Impl = sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        workDatabase_Impl.zzpBGItXfub0yWj();
        Cursor cursorQ1wNbhk2O6 = workDatabase_Impl.q1wNbhk2O6(xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m);
        try {
            iQ11o1hieEkZDhF1MGOZI26oZiDT = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "id");
            iQ11o1hieEkZDhF1MGOZI26oZiDT2 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "state");
            iQ11o1hieEkZDhF1MGOZI26oZiDT3 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "worker_class_name");
            iQ11o1hieEkZDhF1MGOZI26oZiDT4 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "input_merger_class_name");
            iQ11o1hieEkZDhF1MGOZI26oZiDT5 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "input");
            iQ11o1hieEkZDhF1MGOZI26oZiDT6 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "output");
            iQ11o1hieEkZDhF1MGOZI26oZiDT7 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "initial_delay");
            iQ11o1hieEkZDhF1MGOZI26oZiDT8 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "interval_duration");
            iQ11o1hieEkZDhF1MGOZI26oZiDT9 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "flex_duration");
            iQ11o1hieEkZDhF1MGOZI26oZiDT10 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "run_attempt_count");
            iQ11o1hieEkZDhF1MGOZI26oZiDT11 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "backoff_policy");
            xgjedgky9vx5 = xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m;
        } catch (Throwable th) {
            th = th;
            xgjedgky9vx5 = xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        try {
            int iQ11o1hieEkZDhF1MGOZI26oZiDT12 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "backoff_delay_duration");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT13 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "last_enqueue_time");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT14 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "minimum_retention_duration");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT15 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "schedule_requested_at");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT16 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "run_in_foreground");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT17 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "out_of_quota_policy");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT18 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "period_count");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT19 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "generation");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT20 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "next_schedule_time_override");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT21 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "next_schedule_time_override_generation");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT22 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "stop_reason");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT23 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "trace_tag");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT24 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "required_network_type");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT25 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "required_network_request");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT26 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "requires_charging");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT27 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "requires_device_idle");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT28 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "requires_battery_not_low");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT29 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "requires_storage_not_low");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT30 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "trigger_content_update_delay");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT31 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "trigger_max_content_delay");
            int iQ11o1hieEkZDhF1MGOZI26oZiDT32 = F44whnLsbQ.q11o1hieEkZDhF1MGOZI26oZiDT(cursorQ1wNbhk2O6, "content_uri_triggers");
            int i = iQ11o1hieEkZDhF1MGOZI26oZiDT14;
            ArrayList arrayList = new ArrayList(cursorQ1wNbhk2O6.getCount());
            while (cursorQ1wNbhk2O6.moveToNext()) {
                String string = cursorQ1wNbhk2O6.getString(iQ11o1hieEkZDhF1MGOZI26oZiDT);
                int iIKANjmyTSxO6v6UuLPdu7DxOjlS = ej6unYlOWMDF.iKANjmyTSxO6v6UuLPdu7DxOjlS(cursorQ1wNbhk2O6.getInt(iQ11o1hieEkZDhF1MGOZI26oZiDT2));
                String string2 = cursorQ1wNbhk2O6.getString(iQ11o1hieEkZDhF1MGOZI26oZiDT3);
                String string3 = cursorQ1wNbhk2O6.getString(iQ11o1hieEkZDhF1MGOZI26oZiDT4);
                c9cdYDXIxS3U c9cdydxixs3uVxUQ9tBhpHJ2AAEDNW8sghc4m = c9cdYDXIxS3U.VxUQ9tBhpHJ2AAEDNW8sghc4m(cursorQ1wNbhk2O6.getBlob(iQ11o1hieEkZDhF1MGOZI26oZiDT5));
                c9cdYDXIxS3U c9cdydxixs3uVxUQ9tBhpHJ2AAEDNW8sghc4m2 = c9cdYDXIxS3U.VxUQ9tBhpHJ2AAEDNW8sghc4m(cursorQ1wNbhk2O6.getBlob(iQ11o1hieEkZDhF1MGOZI26oZiDT6));
                long j = cursorQ1wNbhk2O6.getLong(iQ11o1hieEkZDhF1MGOZI26oZiDT7);
                long j2 = cursorQ1wNbhk2O6.getLong(iQ11o1hieEkZDhF1MGOZI26oZiDT8);
                long j3 = cursorQ1wNbhk2O6.getLong(iQ11o1hieEkZDhF1MGOZI26oZiDT9);
                int i2 = cursorQ1wNbhk2O6.getInt(iQ11o1hieEkZDhF1MGOZI26oZiDT10);
                int iHVEwbdULInpTNa0IG = ej6unYlOWMDF.HVEwbdULInpTNa0IG(cursorQ1wNbhk2O6.getInt(iQ11o1hieEkZDhF1MGOZI26oZiDT11));
                long j4 = cursorQ1wNbhk2O6.getLong(iQ11o1hieEkZDhF1MGOZI26oZiDT12);
                long j5 = cursorQ1wNbhk2O6.getLong(iQ11o1hieEkZDhF1MGOZI26oZiDT13);
                int i3 = i;
                long j6 = cursorQ1wNbhk2O6.getLong(i3);
                int i4 = iQ11o1hieEkZDhF1MGOZI26oZiDT;
                int i5 = iQ11o1hieEkZDhF1MGOZI26oZiDT15;
                long j7 = cursorQ1wNbhk2O6.getLong(i5);
                iQ11o1hieEkZDhF1MGOZI26oZiDT15 = i5;
                int i6 = iQ11o1hieEkZDhF1MGOZI26oZiDT16;
                boolean z = cursorQ1wNbhk2O6.getInt(i6) != 0;
                iQ11o1hieEkZDhF1MGOZI26oZiDT16 = i6;
                int i7 = iQ11o1hieEkZDhF1MGOZI26oZiDT17;
                int iQygqjTppWwx992 = ej6unYlOWMDF.qygqjTppWwx992(cursorQ1wNbhk2O6.getInt(i7));
                iQ11o1hieEkZDhF1MGOZI26oZiDT17 = i7;
                int i8 = iQ11o1hieEkZDhF1MGOZI26oZiDT18;
                int i9 = cursorQ1wNbhk2O6.getInt(i8);
                iQ11o1hieEkZDhF1MGOZI26oZiDT18 = i8;
                int i10 = iQ11o1hieEkZDhF1MGOZI26oZiDT19;
                int i11 = cursorQ1wNbhk2O6.getInt(i10);
                iQ11o1hieEkZDhF1MGOZI26oZiDT19 = i10;
                int i12 = iQ11o1hieEkZDhF1MGOZI26oZiDT20;
                long j8 = cursorQ1wNbhk2O6.getLong(i12);
                iQ11o1hieEkZDhF1MGOZI26oZiDT20 = i12;
                int i13 = iQ11o1hieEkZDhF1MGOZI26oZiDT21;
                int i14 = cursorQ1wNbhk2O6.getInt(i13);
                iQ11o1hieEkZDhF1MGOZI26oZiDT21 = i13;
                int i15 = iQ11o1hieEkZDhF1MGOZI26oZiDT22;
                int i16 = cursorQ1wNbhk2O6.getInt(i15);
                iQ11o1hieEkZDhF1MGOZI26oZiDT22 = i15;
                int i17 = iQ11o1hieEkZDhF1MGOZI26oZiDT23;
                String string4 = cursorQ1wNbhk2O6.isNull(i17) ? null : cursorQ1wNbhk2O6.getString(i17);
                iQ11o1hieEkZDhF1MGOZI26oZiDT23 = i17;
                int i18 = iQ11o1hieEkZDhF1MGOZI26oZiDT24;
                int iY1NaPKTl7R18DOr6e8i5 = ej6unYlOWMDF.y1NaPKTl7R18DOr6e8i5(cursorQ1wNbhk2O6.getInt(i18));
                iQ11o1hieEkZDhF1MGOZI26oZiDT24 = i18;
                int i19 = iQ11o1hieEkZDhF1MGOZI26oZiDT25;
                VKeHn9sH669RutJ8aaqncC vKeHn9sH669RutJ8aaqncCTFRdVJAePmTx77bP7FAN0uI = ej6unYlOWMDF.tFRdVJAePmTx77bP7FAN0uI(cursorQ1wNbhk2O6.getBlob(i19));
                iQ11o1hieEkZDhF1MGOZI26oZiDT25 = i19;
                int i20 = iQ11o1hieEkZDhF1MGOZI26oZiDT26;
                boolean z2 = cursorQ1wNbhk2O6.getInt(i20) != 0;
                iQ11o1hieEkZDhF1MGOZI26oZiDT26 = i20;
                int i21 = iQ11o1hieEkZDhF1MGOZI26oZiDT27;
                boolean z3 = cursorQ1wNbhk2O6.getInt(i21) != 0;
                iQ11o1hieEkZDhF1MGOZI26oZiDT27 = i21;
                int i22 = iQ11o1hieEkZDhF1MGOZI26oZiDT28;
                boolean z4 = cursorQ1wNbhk2O6.getInt(i22) != 0;
                iQ11o1hieEkZDhF1MGOZI26oZiDT28 = i22;
                int i23 = iQ11o1hieEkZDhF1MGOZI26oZiDT29;
                boolean z5 = cursorQ1wNbhk2O6.getInt(i23) != 0;
                iQ11o1hieEkZDhF1MGOZI26oZiDT29 = i23;
                int i24 = iQ11o1hieEkZDhF1MGOZI26oZiDT30;
                long j9 = cursorQ1wNbhk2O6.getLong(i24);
                iQ11o1hieEkZDhF1MGOZI26oZiDT30 = i24;
                int i25 = iQ11o1hieEkZDhF1MGOZI26oZiDT31;
                long j10 = cursorQ1wNbhk2O6.getLong(i25);
                iQ11o1hieEkZDhF1MGOZI26oZiDT31 = i25;
                int i26 = iQ11o1hieEkZDhF1MGOZI26oZiDT32;
                iQ11o1hieEkZDhF1MGOZI26oZiDT32 = i26;
                arrayList.add(new vIPEe55rgLxLcs(string, iIKANjmyTSxO6v6UuLPdu7DxOjlS, string2, string3, c9cdydxixs3uVxUQ9tBhpHJ2AAEDNW8sghc4m, c9cdydxixs3uVxUQ9tBhpHJ2AAEDNW8sghc4m2, j, j2, j3, new c0WB626RcDoa849JB(vKeHn9sH669RutJ8aaqncCTFRdVJAePmTx77bP7FAN0uI, iY1NaPKTl7R18DOr6e8i5, z2, z3, z4, z5, j9, j10, ej6unYlOWMDF.KUYypEB4eNWOZWVDpH(cursorQ1wNbhk2O6.getBlob(i26))), i2, iHVEwbdULInpTNa0IG, j4, j5, j6, j7, z, iQygqjTppWwx992, i9, i11, j8, i14, i16, string4));
                iQ11o1hieEkZDhF1MGOZI26oZiDT = i4;
                i = i3;
            }
            cursorQ1wNbhk2O6.close();
            xgjedgky9vx5.M9e7PWhFYLD2lOGMker();
            ArrayList arrayListZfQNn8hdWlEQ5cR94249PDsLR = sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.ZfQNn8hdWlEQ5cR94249PDsLR();
            ArrayList arrayListVxUQ9tBhpHJ2AAEDNW8sghc4m = sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            if (arrayList.isEmpty()) {
                nmrzppflcgjyub = nmrzppflcgjyubH3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                s28Az6EscEakl8kzvM = s28Az6EscEakl8kzvMKo09zE6UAgwkV;
                o6oxmoscd9hj6lf8utncntx9cf21 = o6oxmoscd9hj6lf8utncntx9cf21VBGA6pPLqSMuYGvprl270j7;
            } else {
                psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
                String str = yiLlTNbe9YUoPQ6QWt8Sre7U.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x.zIvmSL0wzmmKGc3X39b2Gw2mUGE(str, "Recently completed work:\n\n");
                nmrzppflcgjyub = nmrzppflcgjyubH3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                s28Az6EscEakl8kzvM = s28Az6EscEakl8kzvMKo09zE6UAgwkV;
                o6oxmoscd9hj6lf8utncntx9cf21 = o6oxmoscd9hj6lf8utncntx9cf21VBGA6pPLqSMuYGvprl270j7;
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(str, yiLlTNbe9YUoPQ6QWt8Sre7U.VxUQ9tBhpHJ2AAEDNW8sghc4m(s28Az6EscEakl8kzvM, o6oxmoscd9hj6lf8utncntx9cf21, nmrzppflcgjyub, arrayList));
            }
            if (!arrayListZfQNn8hdWlEQ5cR94249PDsLR.isEmpty()) {
                psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x2 = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
                String str2 = yiLlTNbe9YUoPQ6QWt8Sre7U.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x2.zIvmSL0wzmmKGc3X39b2Gw2mUGE(str2, "Running work:\n\n");
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(str2, yiLlTNbe9YUoPQ6QWt8Sre7U.VxUQ9tBhpHJ2AAEDNW8sghc4m(s28Az6EscEakl8kzvM, o6oxmoscd9hj6lf8utncntx9cf21, nmrzppflcgjyub, arrayListZfQNn8hdWlEQ5cR94249PDsLR));
            }
            if (!arrayListVxUQ9tBhpHJ2AAEDNW8sghc4m.isEmpty()) {
                psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x3 = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
                String str3 = yiLlTNbe9YUoPQ6QWt8Sre7U.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x3.zIvmSL0wzmmKGc3X39b2Gw2mUGE(str3, "Enqueued work:\n\n");
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(str3, yiLlTNbe9YUoPQ6QWt8Sre7U.VxUQ9tBhpHJ2AAEDNW8sghc4m(s28Az6EscEakl8kzvM, o6oxmoscd9hj6lf8utncntx9cf21, nmrzppflcgjyub, arrayListVxUQ9tBhpHJ2AAEDNW8sghc4m));
            }
            return new fUHFsIYAhZNjnB();
        } catch (Throwable th2) {
            th = th2;
            cursorQ1wNbhk2O6.close();
            xgjedgky9vx5.M9e7PWhFYLD2lOGMker();
            throw th;
        }
    }
}
