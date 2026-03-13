package com.vdodsodjsdt;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class T9LNBTwcS97exQoP implements SBDculXSmt {
    public static final String NSjgqmGjEzuugn2SsG1mZFP = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("SystemJobScheduler");
    public final qML5781G5D35XQ LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Context V57tEvNfxZVVcOCAOih5PKr;
    public final Eh21X7fdrXs ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final JobScheduler ZfQNn8hdWlEQ5cR94249PDsLR;
    public final WorkDatabase zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public T9LNBTwcS97exQoP(Context context, WorkDatabase workDatabase, Eh21X7fdrXs eh21X7fdrXs) {
        JobScheduler jobSchedulerZzpBGItXfub0yWj = NRVhrM4Hyv.zzpBGItXfub0yWj(context);
        qML5781G5D35XQ qml5781g5d35xq = new qML5781G5D35XQ(context, eh21X7fdrXs.ZfQNn8hdWlEQ5cR94249PDsLR, eh21X7fdrXs.KUYypEB4eNWOZWVDpH);
        this.V57tEvNfxZVVcOCAOih5PKr = context;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = jobSchedulerZzpBGItXfub0yWj;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = qml5781g5d35xq;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = workDatabase;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = eh21X7fdrXs;
    }

    public static ArrayList LaeGQIruHQu81hfJldjMOQSVblH3x(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listVxUQ9tBhpHJ2AAEDNW8sghc4m = NRVhrM4Hyv.VxUQ9tBhpHJ2AAEDNW8sghc4m(jobScheduler);
        if (listVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listVxUQ9tBhpHJ2AAEDNW8sghc4m.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listVxUQ9tBhpHJ2AAEDNW8sghc4m) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static void V57tEvNfxZVVcOCAOih5PKr(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(NSjgqmGjEzuugn2SsG1mZFP, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static AhgUxI6t6E zIvmSL0wzmmKGc3X39b2Gw2mUGE(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new AhgUxI6t6E(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.vdodsodjsdt.SBDculXSmt
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(String str) {
        ArrayList arrayList;
        Context context = this.V57tEvNfxZVVcOCAOih5PKr;
        JobScheduler jobScheduler = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ArrayList arrayListLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(context, jobScheduler);
        int i = 0;
        if (arrayListLaeGQIruHQu81hfJldjMOQSVblH3x == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = arrayListLaeGQIruHQu81hfJldjMOQSVblH3x.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListLaeGQIruHQu81hfJldjMOQSVblH3x.get(i2);
                i2++;
                JobInfo jobInfo = (JobInfo) obj;
                AhgUxI6t6E ahgUxI6t6EZIvmSL0wzmmKGc3X39b2Gw2mUGE = zIvmSL0wzmmKGc3X39b2Gw2mUGE(jobInfo);
                if (ahgUxI6t6EZIvmSL0wzmmKGc3X39b2Gw2mUGE != null && str.equals(ahgUxI6t6EZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            V57tEvNfxZVVcOCAOih5PKr(jobScheduler, ((Integer) obj2).intValue());
        }
        nMRZPpfLCgJyuB nmrzppflcgjyubH3jnZRsdwYJfY9UhQCkbvWciwvFHv = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) nmrzppflcgjyubH3jnZRsdwYJfY9UhQCkbvWciwvFHv.V57tEvNfxZVVcOCAOih5PKr;
        workDatabase_Impl.zzpBGItXfub0yWj();
        FbuZzoqAiJLuQzTy fbuZzoqAiJLuQzTy = (FbuZzoqAiJLuQzTy) nmrzppflcgjyubH3jnZRsdwYJfY9UhQCkbvWciwvFHv.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        cGYUoKJ5QrSVTXdZE1f88VdPb3 cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m = fbuZzoqAiJLuQzTy.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m.f6ZQsR6bPLvvCDNXOUc(str, 1);
        try {
            workDatabase_Impl.V57tEvNfxZVVcOCAOih5PKr();
            try {
                cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                workDatabase_Impl.Ca81ebIan1u();
            } finally {
                workDatabase_Impl.HzCpKshMOoaw76hFcbOVRYMeRd();
            }
        } finally {
            fbuZzoqAiJLuQzTy.ZfQNn8hdWlEQ5cR94249PDsLR(cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(vIPEe55rgLxLcs vipee55rglxlcs, int i) {
        int i2;
        int i3;
        String str;
        qML5781G5D35XQ qml5781g5d35xq = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        qml5781g5d35xq.getClass();
        c0WB626RcDoa849JB c0wb626rcdoa849jb = vipee55rglxlcs.M9e7PWhFYLD2lOGMker;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str2 = vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str2);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", vipee55rglxlcs.f6ZQsR6bPLvvCDNXOUc);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", vipee55rglxlcs.ZfQNn8hdWlEQ5cR94249PDsLR());
        JobInfo.Builder builder = new JobInfo.Builder(i, qml5781g5d35xq.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        boolean z = c0wb626rcdoa849jb.V57tEvNfxZVVcOCAOih5PKr;
        Set<lxGz3HZpvhLMLuC1> set = c0wb626rcdoa849jb.GI83zq0G8e7zkn;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = c0wb626rcdoa849jb.ZfQNn8hdWlEQ5cR94249PDsLR;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestVxUQ9tBhpHJ2AAEDNW8sghc4m = c0wb626rcdoa849jb.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 28 || networkRequestVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            int i5 = c0wb626rcdoa849jb.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (i4 < 30 || i5 != 6) {
                int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i5);
                if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0) {
                    i2 = 0;
                } else if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1) {
                    i2 = 1;
                } else if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 2) {
                    i2 = 3;
                    if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 3) {
                        i2 = 4;
                        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 4 || i4 < 26) {
                            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(qML5781G5D35XQ.ZfQNn8hdWlEQ5cR94249PDsLR, "API version too low. Cannot convert network type value ".concat(u9SlVAuoWhQUfJ.ko09zE6UAgwkV(i5)));
                            i2 = 1;
                        }
                    }
                } else {
                    i2 = 2;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            ej6unYlOWMDF.pYmKDYlAmhudp(extras, "builder");
            extras.setRequiredNetwork(networkRequestVxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        if (!z2) {
            extras.setBackoffCriteria(vipee55rglxlcs.q1wNbhk2O6, vipee55rglxlcs.KUYypEB4eNWOZWVDpH == 2 ? 0 : 1);
        }
        long jVxUQ9tBhpHJ2AAEDNW8sghc4m = vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        qml5781g5d35xq.zzpBGItXfub0yWj.getClass();
        long jMax = Math.max(jVxUQ9tBhpHJ2AAEDNW8sghc4m - System.currentTimeMillis(), 0L);
        if (i4 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!vipee55rglxlcs.pYmKDYlAmhudp && qml5781g5d35xq.V57tEvNfxZVVcOCAOih5PKr) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (lxGz3HZpvhLMLuC1 lxgz3hzpvhlmluc1 : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(lxgz3hzpvhlmluc1.VxUQ9tBhpHJ2AAEDNW8sghc4m, lxgz3hzpvhlmluc1.zzpBGItXfub0yWj ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c0wb626rcdoa849jb.ZLZeBXTMq0zDztBxtRTuCHrapQ);
            extras.setTriggerContentMaxDelay(c0wb626rcdoa849jb.NSjgqmGjEzuugn2SsG1mZFP);
        }
        extras.setPersisted(false);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            extras.setRequiresBatteryNotLow(c0wb626rcdoa849jb.LaeGQIruHQu81hfJldjMOQSVblH3x);
            extras.setRequiresStorageNotLow(c0wb626rcdoa849jb.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        }
        boolean z3 = vipee55rglxlcs.HzCpKshMOoaw76hFcbOVRYMeRd > 0;
        boolean z4 = jMax > 0;
        if (i6 >= 31 && vipee55rglxlcs.pYmKDYlAmhudp && !z3 && !z4) {
            extras.setExpedited(true);
        }
        if (i6 >= 35 && (str = vipee55rglxlcs.q11o1hieEkZDhF1MGOZI26oZiDT) != null) {
            extras.setTraceTag(str);
        }
        JobInfo jobInfoBuild = extras.build();
        String str3 = NSjgqmGjEzuugn2SsG1mZFP;
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str3, "Scheduling work ID " + str2 + "Job ID " + i);
        try {
            try {
                if (this.ZfQNn8hdWlEQ5cR94249PDsLR.schedule(jobInfoBuild) != 0) {
                    return;
                }
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().NSjgqmGjEzuugn2SsG1mZFP(str3, "Unable to schedule work ID " + str2);
                if (!vipee55rglxlcs.pYmKDYlAmhudp) {
                    return;
                }
                if (vipee55rglxlcs.ko09zE6UAgwkV != 1) {
                    return;
                }
                i3 = 0;
                try {
                    vipee55rglxlcs.pYmKDYlAmhudp = false;
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str3, "Scheduling a non-expedited job (work ID " + str2 + ")");
                    ZLZeBXTMq0zDztBxtRTuCHrapQ(vipee55rglxlcs, i);
                    return;
                } catch (IllegalStateException e) {
                    e = e;
                }
            } catch (Throwable th) {
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(str3, "Unable to schedule " + vipee55rglxlcs, th);
                return;
            }
        } catch (IllegalStateException e2) {
            e = e2;
            i3 = 0;
        }
        String str4 = NRVhrM4Hyv.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Context context = this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        WorkDatabase workDatabase = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        ej6unYlOWMDF.pYmKDYlAmhudp(workDatabase, "workDatabase");
        Eh21X7fdrXs eh21X7fdrXs = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        ej6unYlOWMDF.pYmKDYlAmhudp(eh21X7fdrXs, "configuration");
        int i7 = Build.VERSION.SDK_INT;
        int i8 = i7 >= 31 ? 150 : 100;
        int size = workDatabase.f6ZQsR6bPLvvCDNXOUc().LaeGQIruHQu81hfJldjMOQSVblH3x().size();
        String strRE05n5RsRkyWKIeA9cmLXAKv4Hze = "<faulty JobScheduler failed to getPendingJobs>";
        if (i7 >= 34) {
            JobScheduler jobSchedulerZzpBGItXfub0yWj = NRVhrM4Hyv.zzpBGItXfub0yWj(context);
            List listVxUQ9tBhpHJ2AAEDNW8sghc4m = NRVhrM4Hyv.VxUQ9tBhpHJ2AAEDNW8sghc4m(jobSchedulerZzpBGItXfub0yWj);
            if (listVxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
                ArrayList arrayListLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(context, jobSchedulerZzpBGItXfub0yWj);
                int size2 = arrayListLaeGQIruHQu81hfJldjMOQSVblH3x != null ? listVxUQ9tBhpHJ2AAEDNW8sghc4m.size() - arrayListLaeGQIruHQu81hfJldjMOQSVblH3x.size() : i3;
                String str5 = size2 == 0 ? null : size2 + " of which are not owned by WorkManager";
                Object systemService = context.getSystemService("jobscheduler");
                ej6unYlOWMDF.Ca81ebIan1u(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                ArrayList arrayListLaeGQIruHQu81hfJldjMOQSVblH3x2 = LaeGQIruHQu81hfJldjMOQSVblH3x(context, (JobScheduler) systemService);
                int size3 = arrayListLaeGQIruHQu81hfJldjMOQSVblH3x2 != null ? arrayListLaeGQIruHQu81hfJldjMOQSVblH3x2.size() : i3;
                strRE05n5RsRkyWKIeA9cmLXAKv4Hze = gYXV3FZbh17i6ocMo1T.rE05n5RsRkyWKIeA9cmLXAKv4Hze(vmp19D2MODlOL.VOvSEdhaZyc0oOGQ8(new String[]{listVxUQ9tBhpHJ2AAEDNW8sghc4m.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str5, size3 != 0 ? size3 + " from WorkManager in the default namespace" : null}), ",\n", null, null, null, 62);
            }
        } else {
            ArrayList arrayListLaeGQIruHQu81hfJldjMOQSVblH3x3 = LaeGQIruHQu81hfJldjMOQSVblH3x(context, NRVhrM4Hyv.zzpBGItXfub0yWj(context));
            if (arrayListLaeGQIruHQu81hfJldjMOQSVblH3x3 != null) {
                strRE05n5RsRkyWKIeA9cmLXAKv4Hze = arrayListLaeGQIruHQu81hfJldjMOQSVblH3x3.size() + " jobs from WorkManager";
            }
        }
        String str6 = "JobScheduler " + i8 + " job limit exceeded.\nIn JobScheduler there are " + strRE05n5RsRkyWKIeA9cmLXAKv4Hze + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + eh21X7fdrXs.HzCpKshMOoaw76hFcbOVRYMeRd + '.';
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr(str3, str6);
        throw new IllegalStateException(str6, e);
    }

    @Override // com.vdodsodjsdt.SBDculXSmt
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(vIPEe55rgLxLcs... vipee55rglxlcsArr) {
        int iIntValue;
        Eh21X7fdrXs eh21X7fdrXs = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        WorkDatabase workDatabase = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        final Jw5Ce78MpXxfpSSBw33DWMfqt5tO jw5Ce78MpXxfpSSBw33DWMfqt5tO = new Jw5Ce78MpXxfpSSBw33DWMfqt5tO(workDatabase, 0);
        for (vIPEe55rgLxLcs vipee55rglxlcs : vipee55rglxlcsArr) {
            workDatabase.V57tEvNfxZVVcOCAOih5PKr();
            try {
                SX5PHeJQdzT24G3iHfmAKRZsddf sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc = workDatabase.f6ZQsR6bPLvvCDNXOUc();
                String str = vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                vIPEe55rgLxLcs vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ = sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.ZLZeBXTMq0zDztBxtRTuCHrapQ(str);
                String str2 = NSjgqmGjEzuugn2SsG1mZFP;
                if (vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().NSjgqmGjEzuugn2SsG1mZFP(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.Ca81ebIan1u();
                } else if (vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ.zzpBGItXfub0yWj != 1) {
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().NSjgqmGjEzuugn2SsG1mZFP(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.Ca81ebIan1u();
                } else {
                    AhgUxI6t6E ahgUxI6t6EM9e7PWhFYLD2lOGMker = hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(vipee55rglxlcs);
                    kjqQ3XJs4d kjqq3xjs4dQ1wNbhk2O6 = workDatabase.h3jnZRsdwYJfY9UhQCkbvWciwvFHv().q1wNbhk2O6(ahgUxI6t6EM9e7PWhFYLD2lOGMker);
                    if (kjqq3xjs4dQ1wNbhk2O6 != null) {
                        iIntValue = kjqq3xjs4dQ1wNbhk2O6.V57tEvNfxZVVcOCAOih5PKr;
                    } else {
                        eh21X7fdrXs.getClass();
                        final int i = eh21X7fdrXs.GI83zq0G8e7zkn;
                        Object objP59rPv72J9 = jw5Ce78MpXxfpSSBw33DWMfqt5tO.VxUQ9tBhpHJ2AAEDNW8sghc4m.p59rPv72J9(new Callable() { // from class: com.vdodsodjsdt.QW5LhOeOq9wyvdkwdhe7rt1xzSQdD
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = jw5Ce78MpXxfpSSBw33DWMfqt5tO.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                                Long lJW7EiD0YL6xkbB158jMUzhWNWb1y = workDatabase2.KUYypEB4eNWOZWVDpH().jW7EiD0YL6xkbB158jMUzhWNWb1y("next_job_scheduler_id");
                                int i2 = 0;
                                int iLongValue = lJW7EiD0YL6xkbB158jMUzhWNWb1y != null ? (int) lJW7EiD0YL6xkbB158jMUzhWNWb1y.longValue() : 0;
                                workDatabase2.KUYypEB4eNWOZWVDpH().f6ZQsR6bPLvvCDNXOUc(new iI04L8AdRx9Y2pbmi6FzqrqMSV("next_job_scheduler_id", Long.valueOf(iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1)));
                                if (iLongValue < 0 || iLongValue > i) {
                                    workDatabase2.KUYypEB4eNWOZWVDpH().f6ZQsR6bPLvvCDNXOUc(new iI04L8AdRx9Y2pbmi6FzqrqMSV("next_job_scheduler_id", Long.valueOf(1)));
                                } else {
                                    i2 = iLongValue;
                                }
                                return Integer.valueOf(i2);
                            }
                        });
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objP59rPv72J9, "workDatabase.runInTransa…d\n            }\n        )");
                        iIntValue = ((Number) objP59rPv72J9).intValue();
                    }
                    if (kjqq3xjs4dQ1wNbhk2O6 == null) {
                        workDatabase.h3jnZRsdwYJfY9UhQCkbvWciwvFHv().p59rPv72J9(new kjqQ3XJs4d(ahgUxI6t6EM9e7PWhFYLD2lOGMker.VxUQ9tBhpHJ2AAEDNW8sghc4m, ahgUxI6t6EM9e7PWhFYLD2lOGMker.zzpBGItXfub0yWj, iIntValue));
                    }
                    ZLZeBXTMq0zDztBxtRTuCHrapQ(vipee55rglxlcs, iIntValue);
                    workDatabase.Ca81ebIan1u();
                }
            } finally {
                workDatabase.HzCpKshMOoaw76hFcbOVRYMeRd();
            }
        }
    }

    @Override // com.vdodsodjsdt.SBDculXSmt
    public final boolean zzpBGItXfub0yWj() {
        return true;
    }
}
