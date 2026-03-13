package com.vdodsodjsdt;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class JCv1sAljLJlTL0U implements owwckn2XMaN2nHMo {
    public static final String q1wNbhk2O6 = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("SystemAlarmDispatcher");
    public final ArrayList GI83zq0G8e7zkn;
    public SystemAlarmService HzCpKshMOoaw76hFcbOVRYMeRd;
    public final o6OxmOsCD9HJ6LF8UTncnTX9Cf21 KUYypEB4eNWOZWVDpH;
    public final duIQm3EoNDnZlp6v5euh4x2sg LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Intent M9e7PWhFYLD2lOGMker;
    public final c2N07yv1ho1HeMFqUr4GuAbXooQP NSjgqmGjEzuugn2SsG1mZFP;
    public final Context V57tEvNfxZVVcOCAOih5PKr;
    public final kooPss93uoBTOWlOLlaD ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final nMRZPpfLCgJyuB ZfQNn8hdWlEQ5cR94249PDsLR;
    public final IVPB9DLMIoeA0Qp8AgwLlJ zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public JCv1sAljLJlTL0U(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.V57tEvNfxZVVcOCAOih5PKr = applicationContext;
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = new dXZw8zZnRXsRIYJEIdZC(new N1mT85AVNMY84KnH4(3));
        kooPss93uoBTOWlOLlaD koopss93uobtowlolladL8DMw02rUTs2w = kooPss93uoBTOWlOLlaD.L8DMw02rUTs2w(systemAlarmService);
        Eh21X7fdrXs eh21X7fdrXs = koopss93uobtowlolladL8DMw02rUTs2w.GI83zq0G8e7zkn;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = koopss93uobtowlolladL8DMw02rUTs2w;
        this.NSjgqmGjEzuugn2SsG1mZFP = new c2N07yv1ho1HeMFqUr4GuAbXooQP(applicationContext, eh21X7fdrXs.ZfQNn8hdWlEQ5cR94249PDsLR, dxzw8zznrxsriyjeidzc);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new duIQm3EoNDnZlp6v5euh4x2sg(eh21X7fdrXs.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ = koopss93uobtowlolladL8DMw02rUTs2w.q1wNbhk2O6;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = iVPB9DLMIoeA0Qp8AgwLlJ;
        nMRZPpfLCgJyuB nmrzppflcgjyub = koopss93uobtowlolladL8DMw02rUTs2w.HzCpKshMOoaw76hFcbOVRYMeRd;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = nmrzppflcgjyub;
        this.KUYypEB4eNWOZWVDpH = new o6OxmOsCD9HJ6LF8UTncnTX9Cf21(iVPB9DLMIoeA0Qp8AgwLlJ, nmrzppflcgjyub);
        iVPB9DLMIoeA0Qp8AgwLlJ.VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
        this.GI83zq0G8e7zkn = new ArrayList();
        this.M9e7PWhFYLD2lOGMker = null;
    }

    public static void zzpBGItXfub0yWj() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // com.vdodsodjsdt.owwckn2XMaN2nHMo
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(AhgUxI6t6E ahgUxI6t6E, boolean z) {
        LNbLc7UMz3g5KbIBk lNbLc7UMz3g5KbIBk = (LNbLc7UMz3g5KbIBk) this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        String str = c2N07yv1ho1HeMFqUr4GuAbXooQP.NSjgqmGjEzuugn2SsG1mZFP;
        Intent intent = new Intent(this.V57tEvNfxZVVcOCAOih5PKr, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        c2N07yv1ho1HeMFqUr4GuAbXooQP.V57tEvNfxZVVcOCAOih5PKr(intent, ahgUxI6t6E);
        lNbLc7UMz3g5KbIBk.execute(new QXRsDWGmFmSzZT6WcvPRDxeKS8(0, 2, this, intent));
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        zzpBGItXfub0yWj();
        PowerManager.WakeLock wakeLockVxUQ9tBhpHJ2AAEDNW8sghc4m = ZLj2ZJlGf9PXaB.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.V57tEvNfxZVVcOCAOih5PKr, "ProcessCommand");
        try {
            wakeLockVxUQ9tBhpHJ2AAEDNW8sghc4m.acquire();
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.HzCpKshMOoaw76hFcbOVRYMeRd.ZfQNn8hdWlEQ5cR94249PDsLR(new rWhsbq14GK(this, 0));
        } finally {
            wakeLockVxUQ9tBhpHJ2AAEDNW8sghc4m.release();
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Intent intent, int i) {
        psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
        String str = q1wNbhk2O6;
        psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Adding command " + intent + " (" + i + ")");
        zzpBGItXfub0yWj();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().NSjgqmGjEzuugn2SsG1mZFP(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            zzpBGItXfub0yWj();
            synchronized (this.GI83zq0G8e7zkn) {
                try {
                    ArrayList arrayList = this.GI83zq0G8e7zkn;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.GI83zq0G8e7zkn) {
            try {
                boolean zIsEmpty = this.GI83zq0G8e7zkn.isEmpty();
                this.GI83zq0G8e7zkn.add(intent);
                if (zIsEmpty) {
                    V57tEvNfxZVVcOCAOih5PKr();
                }
            } finally {
            }
        }
    }
}
