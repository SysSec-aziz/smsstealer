package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import com.vdodsodjsdt.AhgUxI6t6E;
import com.vdodsodjsdt.IVPB9DLMIoeA0Qp8AgwLlJ;
import com.vdodsodjsdt.N1mT85AVNMY84KnH4;
import com.vdodsodjsdt.QKIH77ZVGMjTqK4XOIPLci1Yc;
import com.vdodsodjsdt.VSncX8ksA0tswc2TMhzhOMdd;
import com.vdodsodjsdt.kHXwlw9VpxBho;
import com.vdodsodjsdt.kooPss93uoBTOWlOLlaD;
import com.vdodsodjsdt.n0wiIpxL5jR8Mboh;
import com.vdodsodjsdt.nMRZPpfLCgJyuB;
import com.vdodsodjsdt.o6OxmOsCD9HJ6LF8UTncnTX9Cf21;
import com.vdodsodjsdt.owwckn2XMaN2nHMo;
import com.vdodsodjsdt.psATg3LCCdmDIiRgW;
import com.vdodsodjsdt.u9SlVAuoWhQUfJ;
import com.vdodsodjsdt.ztNFMw5IuWLfuP;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements owwckn2XMaN2nHMo {
    public static final String ZLZeBXTMq0zDztBxtRTuCHrapQ = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("SystemJobService");
    public kooPss93uoBTOWlOLlaD V57tEvNfxZVVcOCAOih5PKr;
    public o6OxmOsCD9HJ6LF8UTncnTX9Cf21 zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final HashMap ZfQNn8hdWlEQ5cR94249PDsLR = new HashMap();
    public final N1mT85AVNMY84KnH4 LaeGQIruHQu81hfJldjMOQSVblH3x = new N1mT85AVNMY84KnH4(3);

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(String str) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("Cannot invoke ", str, " on a background thread"));
        }
    }

    public static AhgUxI6t6E zzpBGItXfub0yWj(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new AhgUxI6t6E(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.vdodsodjsdt.owwckn2XMaN2nHMo
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(AhgUxI6t6E ahgUxI6t6E, boolean z) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m("onExecuted");
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(ZLZeBXTMq0zDztBxtRTuCHrapQ, ahgUxI6t6E.VxUQ9tBhpHJ2AAEDNW8sghc4m + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.ZfQNn8hdWlEQ5cR94249PDsLR.remove(ahgUxI6t6E);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr(ahgUxI6t6E);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            kooPss93uoBTOWlOLlaD koopss93uobtowlolladL8DMw02rUTs2w = kooPss93uoBTOWlOLlaD.L8DMw02rUTs2w(getApplicationContext());
            this.V57tEvNfxZVVcOCAOih5PKr = koopss93uobtowlolladL8DMw02rUTs2w;
            IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ = koopss93uobtowlolladL8DMw02rUTs2w.q1wNbhk2O6;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new o6OxmOsCD9HJ6LF8UTncnTX9Cf21(iVPB9DLMIoeA0Qp8AgwLlJ, koopss93uobtowlolladL8DMw02rUTs2w.HzCpKshMOoaw76hFcbOVRYMeRd);
            iVPB9DLMIoeA0Qp8AgwLlJ.VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
        } catch (IllegalStateException e) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
            }
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().NSjgqmGjEzuugn2SsG1mZFP(ZLZeBXTMq0zDztBxtRTuCHrapQ, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        kooPss93uoBTOWlOLlaD koopss93uobtowlollad = this.V57tEvNfxZVVcOCAOih5PKr;
        if (koopss93uobtowlollad != null) {
            koopss93uobtowlollad.q1wNbhk2O6.LaeGQIruHQu81hfJldjMOQSVblH3x(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m("onStartJob");
        kooPss93uoBTOWlOLlaD koopss93uobtowlollad = this.V57tEvNfxZVVcOCAOih5PKr;
        String str = ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (koopss93uobtowlollad == null) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        AhgUxI6t6E ahgUxI6t6EZzpBGItXfub0yWj = zzpBGItXfub0yWj(jobParameters);
        if (ahgUxI6t6EZzpBGItXfub0yWj == null) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (map.containsKey(ahgUxI6t6EZzpBGItXfub0yWj)) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Job is already being executed by SystemJobService: " + ahgUxI6t6EZzpBGItXfub0yWj);
            return false;
        }
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "onStartJob for " + ahgUxI6t6EZzpBGItXfub0yWj);
        map.put(ahgUxI6t6EZzpBGItXfub0yWj, jobParameters);
        int i = Build.VERSION.SDK_INT;
        VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd = new VSncX8ksA0tswc2TMhzhOMdd();
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (i >= 28) {
            kHXwlw9VpxBho.ZfQNn8hdWlEQ5cR94249PDsLR(jobParameters);
        }
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        ztNFMw5IuWLfuP ztnfmw5iuwlfupLaeGQIruHQu81hfJldjMOQSVblH3x = this.LaeGQIruHQu81hfJldjMOQSVblH3x.LaeGQIruHQu81hfJldjMOQSVblH3x(ahgUxI6t6EZzpBGItXfub0yWj);
        o6oxmoscd9hj6lf8utncntx9cf21.getClass();
        ((nMRZPpfLCgJyuB) o6oxmoscd9hj6lf8utncntx9cf21.ZfQNn8hdWlEQ5cR94249PDsLR).ZfQNn8hdWlEQ5cR94249PDsLR(new QKIH77ZVGMjTqK4XOIPLci1Yc(o6oxmoscd9hj6lf8utncntx9cf21, ztnfmw5iuwlfupLaeGQIruHQu81hfJldjMOQSVblH3x, vSncX8ksA0tswc2TMhzhOMdd, 4));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        VxUQ9tBhpHJ2AAEDNW8sghc4m("onStopJob");
        if (this.V57tEvNfxZVVcOCAOih5PKr == null) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(ZLZeBXTMq0zDztBxtRTuCHrapQ, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        AhgUxI6t6E ahgUxI6t6EZzpBGItXfub0yWj = zzpBGItXfub0yWj(jobParameters);
        if (ahgUxI6t6EZzpBGItXfub0yWj == null) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr(ZLZeBXTMq0zDztBxtRTuCHrapQ, "WorkSpec id not found!");
            return false;
        }
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(ZLZeBXTMq0zDztBxtRTuCHrapQ, "onStopJob for " + ahgUxI6t6EZzpBGItXfub0yWj);
        this.ZfQNn8hdWlEQ5cR94249PDsLR.remove(ahgUxI6t6EZzpBGItXfub0yWj);
        ztNFMw5IuWLfuP ztnfmw5iuwlfupV57tEvNfxZVVcOCAOih5PKr = this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr(ahgUxI6t6EZzpBGItXfub0yWj);
        if (ztnfmw5iuwlfupV57tEvNfxZVVcOCAOih5PKr != null) {
            int iVxUQ9tBhpHJ2AAEDNW8sghc4m = Build.VERSION.SDK_INT >= 31 ? n0wiIpxL5jR8Mboh.VxUQ9tBhpHJ2AAEDNW8sghc4m(jobParameters) : -512;
            o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            o6oxmoscd9hj6lf8utncntx9cf21.getClass();
            o6oxmoscd9hj6lf8utncntx9cf21.q1wNbhk2O6(ztnfmw5iuwlfupV57tEvNfxZVVcOCAOih5PKr, iVxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ = this.V57tEvNfxZVVcOCAOih5PKr.q1wNbhk2O6;
        String str = ahgUxI6t6EZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        synchronized (iVPB9DLMIoeA0Qp8AgwLlJ.HzCpKshMOoaw76hFcbOVRYMeRd) {
            zContains = iVPB9DLMIoeA0Qp8AgwLlJ.GI83zq0G8e7zkn.contains(str);
        }
        return !zContains;
    }
}
