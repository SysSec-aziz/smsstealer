package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.vdodsodjsdt.F44whnLsbQ;
import com.vdodsodjsdt.KfeOQNOupsCg6878zi4e;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.hHGulK8yyvzb;
import com.vdodsodjsdt.tip6Bn6qwOmejUJFpa09lcJqL;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters ZLZeBXTMq0zDztBxtRTuCHrapQ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "appContext");
        ej6unYlOWMDF.pYmKDYlAmhudp(workerParameters, "workerParameters");
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = workerParameters;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object LaeGQIruHQu81hfJldjMOQSVblH3x(androidx.work.impl.workers.ConstraintTrackingWorker r15, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r16) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.LaeGQIruHQu81hfJldjMOQSVblH3x(androidx.work.impl.workers.ConstraintTrackingWorker, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object ZfQNn8hdWlEQ5cR94249PDsLR(androidx.work.impl.workers.ConstraintTrackingWorker r4, com.vdodsodjsdt.E4DUcuxizcAv5WKy5qZ7sw r5, com.vdodsodjsdt.yxp1I6Gr2tLDD3dH0UsMPMDr7 r6, com.vdodsodjsdt.vIPEe55rgLxLcs r7, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof com.vdodsodjsdt.PZfpwE2GVo6bJV4vMdXDRRw9CZ
            if (r0 == 0) goto L16
            r0 = r8
            com.vdodsodjsdt.PZfpwE2GVo6bJV4vMdXDRRw9CZ r0 = (com.vdodsodjsdt.PZfpwE2GVo6bJV4vMdXDRRw9CZ) r0
            int r1 = r0.NSjgqmGjEzuugn2SsG1mZFP
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.NSjgqmGjEzuugn2SsG1mZFP = r1
            goto L1b
        L16:
            com.vdodsodjsdt.PZfpwE2GVo6bJV4vMdXDRRw9CZ r0 = new com.vdodsodjsdt.PZfpwE2GVo6bJV4vMdXDRRw9CZ
            r0.<init>(r4, r8)
        L1b:
            java.lang.Object r4 = r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            int r8 = r0.NSjgqmGjEzuugn2SsG1mZFP
            r1 = 1
            if (r8 == 0) goto L30
            if (r8 != r1) goto L28
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r4)
            goto L4d
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L30:
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r4)
            com.vdodsodjsdt.je0ANrY3bkTeIfZFWvtAW01tsFXX r4 = new com.vdodsodjsdt.je0ANrY3bkTeIfZFWvtAW01tsFXX
            r8 = 0
            r4.<init>(r5, r6, r7, r8)
            r0.NSjgqmGjEzuugn2SsG1mZFP = r1
            com.vdodsodjsdt.yB0MgkQF0w4aWkiL0rHiqFb54ZHEs r5 = new com.vdodsodjsdt.yB0MgkQF0w4aWkiL0rHiqFb54ZHEs
            com.vdodsodjsdt.D73WsmU258PapcWZb45SFW r6 = r0.LaeGQIruHQu81hfJldjMOQSVblH3x()
            r5.<init>(r0, r6)
            java.lang.Object r4 = com.vdodsodjsdt.KfeOQNOupsCg6878zi4e.KYZ9RyuOc42A2J(r5, r5, r4)
            com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU r5 = com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr
            if (r4 != r5) goto L4d
            return r5
        L4d:
            java.lang.String r5 = "delegate: ListenableWork….cancel()\n        }\n    }"
            com.vdodsodjsdt.ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.ZfQNn8hdWlEQ5cR94249PDsLR(androidx.work.impl.workers.ConstraintTrackingWorker, com.vdodsodjsdt.E4DUcuxizcAv5WKy5qZ7sw, com.vdodsodjsdt.yxp1I6Gr2tLDD3dH0UsMPMDr7, com.vdodsodjsdt.vIPEe55rgLxLcs, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final Object V57tEvNfxZVVcOCAOih5PKr(tip6Bn6qwOmejUJFpa09lcJqL tip6bn6qwomejujfpa09lcjql) {
        ExecutorService executorService = this.zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(executorService, "backgroundExecutor");
        return F44whnLsbQ.mhUCRR8ceqc7mAozW(KfeOQNOupsCg6878zi4e.pYmKDYlAmhudp(executorService), new hHGulK8yyvzb(this, null, 0), tip6bn6qwomejujfpa09lcjql);
    }
}
