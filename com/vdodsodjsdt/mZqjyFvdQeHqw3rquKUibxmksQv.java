package com.vdodsodjsdt;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class mZqjyFvdQeHqw3rquKUibxmksQv implements g3gI5tGnl5o1sbwn0siFDTBcKwP, D6FjfK6EYPutkH5 {
    public static final String pYmKDYlAmhudp = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("DelayMetCommandHandler");
    public final LL6zXCXfmDYzdHCRTT Ca81ebIan1u;
    public int GI83zq0G8e7zkn;
    public final LNbLc7UMz3g5KbIBk HzCpKshMOoaw76hFcbOVRYMeRd;
    public PowerManager.WakeLock KUYypEB4eNWOZWVDpH;
    public final AhgUxI6t6E LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final ki0ZWFpNS2MqGdb M9e7PWhFYLD2lOGMker;
    public final Object NSjgqmGjEzuugn2SsG1mZFP;
    public final Context V57tEvNfxZVVcOCAOih5PKr;
    public final yxp1I6Gr2tLDD3dH0UsMPMDr7 ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public volatile TMhzu0mi5J4jkWF8gkI h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final ztNFMw5IuWLfuP p59rPv72J9;
    public boolean q1wNbhk2O6;
    public final JCv1sAljLJlTL0U zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public mZqjyFvdQeHqw3rquKUibxmksQv(Context context, int i, JCv1sAljLJlTL0U jCv1sAljLJlTL0U, ztNFMw5IuWLfuP ztnfmw5iuwlfup) {
        this.V57tEvNfxZVVcOCAOih5PKr = context;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = jCv1sAljLJlTL0U;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = ztnfmw5iuwlfup.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.p59rPv72J9 = ztnfmw5iuwlfup;
        UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT = jCv1sAljLJlTL0U.ZLZeBXTMq0zDztBxtRTuCHrapQ.pYmKDYlAmhudp;
        nMRZPpfLCgJyuB nmrzppflcgjyub = jCv1sAljLJlTL0U.ZfQNn8hdWlEQ5cR94249PDsLR;
        this.M9e7PWhFYLD2lOGMker = (ki0ZWFpNS2MqGdb) nmrzppflcgjyub.V57tEvNfxZVVcOCAOih5PKr;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = (LNbLc7UMz3g5KbIBk) nmrzppflcgjyub.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.Ca81ebIan1u = (LL6zXCXfmDYzdHCRTT) nmrzppflcgjyub.ZfQNn8hdWlEQ5cR94249PDsLR;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new yxp1I6Gr2tLDD3dH0UsMPMDr7(uL4JI0eLnaD84py2JT);
        this.q1wNbhk2O6 = false;
        this.GI83zq0G8e7zkn = 0;
        this.NSjgqmGjEzuugn2SsG1mZFP = new Object();
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(mZqjyFvdQeHqw3rquKUibxmksQv mzqjyfvdqehqw3rqukuibxmksqv) {
        boolean z;
        int i = mzqjyfvdqehqw3rqukuibxmksqv.ZfQNn8hdWlEQ5cR94249PDsLR;
        LNbLc7UMz3g5KbIBk lNbLc7UMz3g5KbIBk = mzqjyfvdqehqw3rqukuibxmksqv.HzCpKshMOoaw76hFcbOVRYMeRd;
        Context context = mzqjyfvdqehqw3rqukuibxmksqv.V57tEvNfxZVVcOCAOih5PKr;
        String str = pYmKDYlAmhudp;
        JCv1sAljLJlTL0U jCv1sAljLJlTL0U = mzqjyfvdqehqw3rqukuibxmksqv.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        AhgUxI6t6E ahgUxI6t6E = mzqjyfvdqehqw3rqukuibxmksqv.LaeGQIruHQu81hfJldjMOQSVblH3x;
        String str2 = ahgUxI6t6E.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (mzqjyfvdqehqw3rqukuibxmksqv.GI83zq0G8e7zkn >= 2) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Already stopped work for " + str2);
            return;
        }
        mzqjyfvdqehqw3rqukuibxmksqv.GI83zq0G8e7zkn = 2;
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Stopping work for WorkSpec " + str2);
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c2N07yv1ho1HeMFqUr4GuAbXooQP.V57tEvNfxZVVcOCAOih5PKr(intent, ahgUxI6t6E);
        lNbLc7UMz3g5KbIBk.execute(new QXRsDWGmFmSzZT6WcvPRDxeKS8(i, 2, jCv1sAljLJlTL0U, intent));
        IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ = jCv1sAljLJlTL0U.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        String str3 = ahgUxI6t6E.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        synchronized (iVPB9DLMIoeA0Qp8AgwLlJ.HzCpKshMOoaw76hFcbOVRYMeRd) {
            z = iVPB9DLMIoeA0Qp8AgwLlJ.V57tEvNfxZVVcOCAOih5PKr(str3) != null;
        }
        if (!z) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Processor does not have WorkSpec " + str2 + ". No need to reschedule");
            return;
        }
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "WorkSpec " + str2 + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c2N07yv1ho1HeMFqUr4GuAbXooQP.V57tEvNfxZVVcOCAOih5PKr(intent2, ahgUxI6t6E);
        lNbLc7UMz3g5KbIBk.execute(new QXRsDWGmFmSzZT6WcvPRDxeKS8(i, 2, jCv1sAljLJlTL0U, intent2));
    }

    public static void zzpBGItXfub0yWj(mZqjyFvdQeHqw3rquKUibxmksQv mzqjyfvdqehqw3rqukuibxmksqv) {
        if (mzqjyfvdqehqw3rqukuibxmksqv.GI83zq0G8e7zkn != 0) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(pYmKDYlAmhudp, "Already started work for " + mzqjyfvdqehqw3rqukuibxmksqv.LaeGQIruHQu81hfJldjMOQSVblH3x);
            return;
        }
        mzqjyfvdqehqw3rqukuibxmksqv.GI83zq0G8e7zkn = 1;
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(pYmKDYlAmhudp, "onAllConstraintsMet for " + mzqjyfvdqehqw3rqukuibxmksqv.LaeGQIruHQu81hfJldjMOQSVblH3x);
        if (!mzqjyfvdqehqw3rqukuibxmksqv.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE(mzqjyfvdqehqw3rqukuibxmksqv.p59rPv72J9, null)) {
            mzqjyfvdqehqw3rqukuibxmksqv.ZfQNn8hdWlEQ5cR94249PDsLR();
            return;
        }
        duIQm3EoNDnZlp6v5euh4x2sg duiqm3eondnzlp6v5euh4x2sg = mzqjyfvdqehqw3rqukuibxmksqv.zIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x;
        AhgUxI6t6E ahgUxI6t6E = mzqjyfvdqehqw3rqukuibxmksqv.LaeGQIruHQu81hfJldjMOQSVblH3x;
        synchronized (duiqm3eondnzlp6v5euh4x2sg.ZfQNn8hdWlEQ5cR94249PDsLR) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(duIQm3EoNDnZlp6v5euh4x2sg.LaeGQIruHQu81hfJldjMOQSVblH3x, "Starting timer for " + ahgUxI6t6E);
            duiqm3eondnzlp6v5euh4x2sg.VxUQ9tBhpHJ2AAEDNW8sghc4m(ahgUxI6t6E);
            u4CfLdq2jiPhh8u u4cfldq2jiphh8u = new u4CfLdq2jiPhh8u(duiqm3eondnzlp6v5euh4x2sg, ahgUxI6t6E);
            duiqm3eondnzlp6v5euh4x2sg.zzpBGItXfub0yWj.put(ahgUxI6t6E, u4cfldq2jiphh8u);
            duiqm3eondnzlp6v5euh4x2sg.V57tEvNfxZVVcOCAOih5PKr.put(ahgUxI6t6E, mzqjyfvdqehqw3rqukuibxmksqv);
            ((Handler) duiqm3eondnzlp6v5euh4x2sg.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR).postDelayed(u4cfldq2jiphh8u, 600000L);
        }
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() throws Throwable {
        String str = this.LaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.KUYypEB4eNWOZWVDpH = ZLj2ZJlGf9PXaB.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.V57tEvNfxZVVcOCAOih5PKr, str + " (" + this.ZfQNn8hdWlEQ5cR94249PDsLR + ")");
        psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
        String str2 = pYmKDYlAmhudp;
        psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(str2, "Acquiring wakelock " + this.KUYypEB4eNWOZWVDpH + "for WorkSpec " + str);
        this.KUYypEB4eNWOZWVDpH.acquire();
        vIPEe55rgLxLcs vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ.M9e7PWhFYLD2lOGMker.f6ZQsR6bPLvvCDNXOUc().ZLZeBXTMq0zDztBxtRTuCHrapQ(str);
        if (vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            this.M9e7PWhFYLD2lOGMker.execute(new g9RrphS8p8FkeTRpnKkKJmWqi2lQ(this, 0));
            return;
        }
        boolean zV57tEvNfxZVVcOCAOih5PKr = vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ.V57tEvNfxZVVcOCAOih5PKr();
        this.q1wNbhk2O6 = zV57tEvNfxZVVcOCAOih5PKr;
        if (zV57tEvNfxZVVcOCAOih5PKr) {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = muOaMHIFqe96qo7.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ, this.Ca81ebIan1u, this);
        } else {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str2, "No constraints for ".concat(str));
            this.M9e7PWhFYLD2lOGMker.execute(new g9RrphS8p8FkeTRpnKkKJmWqi2lQ(this, 1));
        }
    }

    @Override // com.vdodsodjsdt.g3gI5tGnl5o1sbwn0siFDTBcKwP
    public final void V57tEvNfxZVVcOCAOih5PKr(vIPEe55rgLxLcs vipee55rglxlcs, CWJlFo6DaGDzNFh4w cWJlFo6DaGDzNFh4w) {
        boolean z = cWJlFo6DaGDzNFh4w instanceof g6BKYStEEgT29c8vsK;
        ki0ZWFpNS2MqGdb ki0zwfpns2mqgdb = this.M9e7PWhFYLD2lOGMker;
        if (z) {
            ki0zwfpns2mqgdb.execute(new g9RrphS8p8FkeTRpnKkKJmWqi2lQ(this, 1));
        } else {
            ki0zwfpns2mqgdb.execute(new g9RrphS8p8FkeTRpnKkKJmWqi2lQ(this, 0));
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        synchronized (this.NSjgqmGjEzuugn2SsG1mZFP) {
            try {
                if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv != null) {
                    this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.V57tEvNfxZVVcOCAOih5PKr(null);
                }
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
                PowerManager.WakeLock wakeLock = this.KUYypEB4eNWOZWVDpH;
                if (wakeLock != null && wakeLock.isHeld()) {
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(pYmKDYlAmhudp, "Releasing wakelock " + this.KUYypEB4eNWOZWVDpH + "for WorkSpec " + this.LaeGQIruHQu81hfJldjMOQSVblH3x);
                    this.KUYypEB4eNWOZWVDpH.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(boolean z) {
        psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
        StringBuilder sb = new StringBuilder("onExecuted ");
        AhgUxI6t6E ahgUxI6t6E = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        sb.append(ahgUxI6t6E);
        sb.append(", ");
        sb.append(z);
        psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(pYmKDYlAmhudp, sb.toString());
        ZfQNn8hdWlEQ5cR94249PDsLR();
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        JCv1sAljLJlTL0U jCv1sAljLJlTL0U = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        LNbLc7UMz3g5KbIBk lNbLc7UMz3g5KbIBk = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        Context context = this.V57tEvNfxZVVcOCAOih5PKr;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c2N07yv1ho1HeMFqUr4GuAbXooQP.V57tEvNfxZVVcOCAOih5PKr(intent, ahgUxI6t6E);
            lNbLc7UMz3g5KbIBk.execute(new QXRsDWGmFmSzZT6WcvPRDxeKS8(i, 2, jCv1sAljLJlTL0U, intent));
        }
        if (this.q1wNbhk2O6) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            lNbLc7UMz3g5KbIBk.execute(new QXRsDWGmFmSzZT6WcvPRDxeKS8(i, 2, jCv1sAljLJlTL0U, intent2));
        }
    }
}
