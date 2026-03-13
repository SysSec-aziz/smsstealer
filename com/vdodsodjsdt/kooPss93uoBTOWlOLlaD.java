package com.vdodsodjsdt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class kooPss93uoBTOWlOLlaD extends FLWIoSaHb1q8TqFvEBgPyRGrzvi6 {
    public static final Object f6ZQsR6bPLvvCDNXOUc;
    public static kooPss93uoBTOWlOLlaD jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public static kooPss93uoBTOWlOLlaD ko09zE6UAgwkV;
    public boolean Ca81ebIan1u = false;
    public final Eh21X7fdrXs GI83zq0G8e7zkn;
    public final nMRZPpfLCgJyuB HzCpKshMOoaw76hFcbOVRYMeRd;
    public final List KUYypEB4eNWOZWVDpH;
    public final WorkDatabase M9e7PWhFYLD2lOGMker;
    public final Context NSjgqmGjEzuugn2SsG1mZFP;
    public BroadcastReceiver.PendingResult h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final Jw5Ce78MpXxfpSSBw33DWMfqt5tO p59rPv72J9;
    public final UL4JI0eLnaD84py2JT pYmKDYlAmhudp;
    public final IVPB9DLMIoeA0Qp8AgwLlJ q1wNbhk2O6;

    static {
        psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("WorkManagerImpl");
        ko09zE6UAgwkV = null;
        jW7EiD0YL6xkbB158jMUzhWNWb1y = null;
        f6ZQsR6bPLvvCDNXOUc = new Object();
    }

    public kooPss93uoBTOWlOLlaD(Context context, final Eh21X7fdrXs eh21X7fdrXs, nMRZPpfLCgJyuB nmrzppflcgjyub, final WorkDatabase workDatabase, final List list, IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ, UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        psATg3LCCdmDIiRgW psatg3lccdmdiirgw = new psATg3LCCdmDIiRgW(eh21X7fdrXs.NSjgqmGjEzuugn2SsG1mZFP);
        synchronized (psATg3LCCdmDIiRgW.zzpBGItXfub0yWj) {
            try {
                if (psATg3LCCdmDIiRgW.V57tEvNfxZVVcOCAOih5PKr == null) {
                    psATg3LCCdmDIiRgW.V57tEvNfxZVVcOCAOih5PKr = psatg3lccdmdiirgw;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = applicationContext;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = nmrzppflcgjyub;
        this.M9e7PWhFYLD2lOGMker = workDatabase;
        this.q1wNbhk2O6 = iVPB9DLMIoeA0Qp8AgwLlJ;
        this.pYmKDYlAmhudp = uL4JI0eLnaD84py2JT;
        this.GI83zq0G8e7zkn = eh21X7fdrXs;
        this.KUYypEB4eNWOZWVDpH = list;
        LL6zXCXfmDYzdHCRTT lL6zXCXfmDYzdHCRTT = (LL6zXCXfmDYzdHCRTT) nmrzppflcgjyub.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(lL6zXCXfmDYzdHCRTT, "taskExecutor.taskCoroutineDispatcher");
        D3M3ZNIyDmTAayUQodHdLbj d3M3ZNIyDmTAayUQodHdLbjZzpBGItXfub0yWj = zonOxHotd3BwAPJcwqr6I6uQNngg4.zzpBGItXfub0yWj(lL6zXCXfmDYzdHCRTT);
        int i = 1;
        this.p59rPv72J9 = new Jw5Ce78MpXxfpSSBw33DWMfqt5tO(workDatabase, 1);
        final ki0ZWFpNS2MqGdb ki0zwfpns2mqgdb = (ki0ZWFpNS2MqGdb) nmrzppflcgjyub.V57tEvNfxZVVcOCAOih5PKr;
        String str = IajRZM8bx6ydOtWJS1Sd9DI.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        iVPB9DLMIoeA0Qp8AgwLlJ.VxUQ9tBhpHJ2AAEDNW8sghc4m(new owwckn2XMaN2nHMo() { // from class: com.vdodsodjsdt.nYcz4vntTjzqVEGSel3BQ0Wfv
            @Override // com.vdodsodjsdt.owwckn2XMaN2nHMo
            public final void LaeGQIruHQu81hfJldjMOQSVblH3x(AhgUxI6t6E ahgUxI6t6E, boolean z) {
                ki0zwfpns2mqgdb.execute(new A3Dwt6MW552ix3T0Q(list, ahgUxI6t6E, eh21X7fdrXs, workDatabase, 0));
            }
        });
        nmrzppflcgjyub.ZfQNn8hdWlEQ5cR94249PDsLR(new zOMUjPXkm1MlWYwMLhvxaazucg6R6(applicationContext, this));
        String str2 = hoeJj79e2a6dO.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (kUxvcfiNJSWAdKuXlNcXOpLKKC.VxUQ9tBhpHJ2AAEDNW8sghc4m(applicationContext, eh21X7fdrXs)) {
            SX5PHeJQdzT24G3iHfmAKRZsddf sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc = workDatabase.f6ZQsR6bPLvvCDNXOUc();
            sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.getClass();
            IvfXhmjM3e3K ivfXhmjM3e3K = null;
            jDNq5zhgCb57UDl fMWJFbKe79StEA2fAXzrM8t2wVw9D = new FMWJFbKe79StEA2fAXzrM8t2wVw9D(i, new gKCgw0OPjYohWMZEmrO6rYi1(new nKep95zoQX(sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.VxUQ9tBhpHJ2AAEDNW8sghc4m, new String[]{"workspec"}, new llyzAJs14odKUIEFXSubfA00DoNX(sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc, xgjEDGKy9VX5.VxUQ9tBhpHJ2AAEDNW8sghc4m("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0)), null)), new fv9JJh60FmoFVsJ3(4, null));
            hu3HDJRthjXEukAdCh3Tdc hu3hdjrthjxeukadch3tdc = hu3HDJRthjXEukAdCh3Tdc.V57tEvNfxZVVcOCAOih5PKr;
            UVzEPm75LoPBkSIomQaI29asGliB uVzEPm75LoPBkSIomQaI29asGliB = UVzEPm75LoPBkSIomQaI29asGliB.ZfQNn8hdWlEQ5cR94249PDsLR;
            F44whnLsbQ.TqcnImqkSWIKht(d3M3ZNIyDmTAayUQodHdLbjZzpBGItXfub0yWj, null, null, new hHGulK8yyvzb(new FMWJFbKe79StEA2fAXzrM8t2wVw9D(zonOxHotd3BwAPJcwqr6I6uQNngg4.pYmKDYlAmhudp(fMWJFbKe79StEA2fAXzrM8t2wVw9D instanceof B0laohnjL8cmtv ? ((B0laohnjL8cmtv) fMWJFbKe79StEA2fAXzrM8t2wVw9D).zzpBGItXfub0yWj(hu3hdjrthjxeukadch3tdc, 0, uVzEPm75LoPBkSIomQaI29asGliB) : new JEwf8Zp1w4QB83(fMWJFbKe79StEA2fAXzrM8t2wVw9D, hu3hdjrthjxeukadch3tdc, 0, uVzEPm75LoPBkSIomQaI29asGliB)), new wyrFggKI8vC(applicationContext, null)), ivfXhmjM3e3K, i), 3);
        }
    }

    public static kooPss93uoBTOWlOLlaD L8DMw02rUTs2w(Context context) {
        kooPss93uoBTOWlOLlaD koopss93uobtowlollad;
        Object obj = f6ZQsR6bPLvvCDNXOUc;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    koopss93uobtowlollad = ko09zE6UAgwkV;
                    if (koopss93uobtowlollad == null) {
                        koopss93uobtowlollad = jW7EiD0YL6xkbB158jMUzhWNWb1y;
                    }
                }
                return koopss93uobtowlollad;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (koopss93uobtowlollad != null) {
            return koopss93uobtowlollad;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final void JUdwvN8LfOMa() {
        FG8LIxsgYiLSfhN0jYKIKr fG8LIxsgYiLSfhN0jYKIKr = this.GI83zq0G8e7zkn.q1wNbhk2O6;
        hfnU5q1H9m1kOmNb hfnu5q1h9m1komnb = new hfnU5q1H9m1kOmNb(4, this);
        ej6unYlOWMDF.pYmKDYlAmhudp(fG8LIxsgYiLSfhN0jYKIKr, "<this>");
        boolean zF6ZQsR6bPLvvCDNXOUc = hRrPPME7ytOB7ba.f6ZQsR6bPLvvCDNXOUc();
        if (zF6ZQsR6bPLvvCDNXOUc) {
            try {
                Trace.beginSection(hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG("ReschedulingWork"));
            } finally {
                if (zF6ZQsR6bPLvvCDNXOUc) {
                    Trace.endSection();
                }
            }
        }
        hfnu5q1h9m1komnb.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final void lQ0rO9lhQIyVe7Rp6() {
        synchronized (f6ZQsR6bPLvvCDNXOUc) {
            try {
                this.Ca81ebIan1u = true;
                BroadcastReceiver.PendingResult pendingResult = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
