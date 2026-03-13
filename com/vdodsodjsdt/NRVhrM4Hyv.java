package com.vdodsodjsdt;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class NRVhrM4Hyv {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        String strZLZeBXTMq0zDztBxtRTuCHrapQ = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("SystemJobScheduler");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strZLZeBXTMq0zDztBxtRTuCHrapQ, "tagWithPrefix(\"SystemJobScheduler\")");
        VxUQ9tBhpHJ2AAEDNW8sghc4m = strZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public static final List VxUQ9tBhpHJ2AAEDNW8sghc4m(JobScheduler jobScheduler) {
        ej6unYlOWMDF.pYmKDYlAmhudp(jobScheduler, "<this>");
        try {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(allPendingJobs, "jobScheduler.allPendingJobs");
            return allPendingJobs;
        } catch (Throwable th) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(VxUQ9tBhpHJ2AAEDNW8sghc4m, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    public static final JobScheduler zzpBGItXfub0yWj(Context context) {
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        ej6unYlOWMDF.Ca81ebIan1u(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        if (Build.VERSION.SDK_INT < 34) {
            return jobScheduler;
        }
        JobScheduler jobSchedulerForNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(jobSchedulerForNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return jobSchedulerForNamespace;
    }
}
