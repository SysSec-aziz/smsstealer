package com.vdodsodjsdt;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class IVPB9DLMIoeA0Qp8AgwLlJ {
    public static final String KUYypEB4eNWOZWVDpH = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("Processor");
    public final WorkDatabase LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Eh21X7fdrXs V57tEvNfxZVVcOCAOih5PKr;
    public final nMRZPpfLCgJyuB ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Context zzpBGItXfub0yWj;
    public final HashMap ZLZeBXTMq0zDztBxtRTuCHrapQ = new HashMap();
    public final HashMap zIvmSL0wzmmKGc3X39b2Gw2mUGE = new HashMap();
    public final HashSet GI83zq0G8e7zkn = new HashSet();
    public final ArrayList M9e7PWhFYLD2lOGMker = new ArrayList();
    public PowerManager.WakeLock VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
    public final Object HzCpKshMOoaw76hFcbOVRYMeRd = new Object();
    public final HashMap NSjgqmGjEzuugn2SsG1mZFP = new HashMap();

    public IVPB9DLMIoeA0Qp8AgwLlJ(Context context, Eh21X7fdrXs eh21X7fdrXs, nMRZPpfLCgJyuB nmrzppflcgjyub, WorkDatabase workDatabase) {
        this.zzpBGItXfub0yWj = context;
        this.V57tEvNfxZVVcOCAOih5PKr = eh21X7fdrXs;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = nmrzppflcgjyub;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = workDatabase;
    }

    public static boolean ZfQNn8hdWlEQ5cR94249PDsLR(String str, miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57ge, int i) {
        String str2 = KUYypEB4eNWOZWVDpH;
        if (mizqaiwqutukbpjchsfxadq57ge == null) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        mizqaiwqutukbpjchsfxadq57ge.q1wNbhk2O6.jW7EiD0YL6xkbB158jMUzhWNWb1y(new cMGD2iotsUUez1oRroMIB(i));
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(owwckn2XMaN2nHMo owwckn2xman2nhmo) {
        synchronized (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            this.M9e7PWhFYLD2lOGMker.remove(owwckn2xman2nhmo);
        }
    }

    public final miZQAIwqUtukbpjcHsFxaDq57gE V57tEvNfxZVVcOCAOih5PKr(String str) {
        miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57ge = (miZQAIwqUtukbpjcHsFxaDq57gE) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(str);
        return mizqaiwqutukbpjchsfxadq57ge == null ? (miZQAIwqUtukbpjcHsFxaDq57gE) this.ZLZeBXTMq0zDztBxtRTuCHrapQ.get(str) : mizqaiwqutukbpjchsfxadq57ge;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(owwckn2XMaN2nHMo owwckn2xman2nhmo) {
        synchronized (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            this.M9e7PWhFYLD2lOGMker.add(owwckn2xman2nhmo);
        }
    }

    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(ztNFMw5IuWLfuP ztnfmw5iuwlfup, VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd) throws Throwable {
        Throwable th;
        boolean z;
        AhgUxI6t6E ahgUxI6t6E = ztnfmw5iuwlfup.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        final String str = ahgUxI6t6E.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        final ArrayList arrayList = new ArrayList();
        vIPEe55rgLxLcs vipee55rglxlcs = (vIPEe55rgLxLcs) this.LaeGQIruHQu81hfJldjMOQSVblH3x.p59rPv72J9(new Callable() { // from class: com.vdodsodjsdt.OwmmsGAqUuCNbvkOW32oU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x;
                o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21VBGA6pPLqSMuYGvprl270j7 = workDatabase.vBGA6pPLqSMuYGvprl270j7();
                String str2 = str;
                arrayList.addAll(o6oxmoscd9hj6lf8utncntx9cf21VBGA6pPLqSMuYGvprl270j7.zIvmSL0wzmmKGc3X39b2Gw2mUGE(str2));
                return workDatabase.f6ZQsR6bPLvvCDNXOUc().ZLZeBXTMq0zDztBxtRTuCHrapQ(str2);
            }
        });
        if (vipee55rglxlcs == null) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().NSjgqmGjEzuugn2SsG1mZFP(KUYypEB4eNWOZWVDpH, "Didn't find WorkSpec for id " + ahgUxI6t6E);
            ((LNbLc7UMz3g5KbIBk) this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE).execute(new KEiB9IZn8Hnusye5ELtMjAaq02l5M(3, this, ahgUxI6t6E));
            return false;
        }
        synchronized (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            try {
                try {
                    synchronized (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
                        try {
                            z = V57tEvNfxZVVcOCAOih5PKr(str) != null;
                        } finally {
                            th = th;
                            while (true) {
                                Throwable th2 = th;
                                try {
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    }
                    try {
                        if (z) {
                            Set set = (Set) this.NSjgqmGjEzuugn2SsG1mZFP.get(str);
                            if (((ztNFMw5IuWLfuP) set.iterator().next()).VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj == ahgUxI6t6E.zzpBGItXfub0yWj) {
                                set.add(ztnfmw5iuwlfup);
                                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(KUYypEB4eNWOZWVDpH, "Work " + ahgUxI6t6E + " is already enqueued for processing");
                            } else {
                                ((LNbLc7UMz3g5KbIBk) this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE).execute(new KEiB9IZn8Hnusye5ELtMjAaq02l5M(3, this, ahgUxI6t6E));
                            }
                            return false;
                        }
                        if (vipee55rglxlcs.f6ZQsR6bPLvvCDNXOUc != ahgUxI6t6E.zzpBGItXfub0yWj) {
                            ((LNbLc7UMz3g5KbIBk) this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE).execute(new KEiB9IZn8Hnusye5ELtMjAaq02l5M(3, this, ahgUxI6t6E));
                            return false;
                        }
                        miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57ge = new miZQAIwqUtukbpjcHsFxaDq57gE(new JsnZMsYEp5ShmM4(this.zzpBGItXfub0yWj, this.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR, this, this.LaeGQIruHQu81hfJldjMOQSVblH3x, vipee55rglxlcs, arrayList));
                        LL6zXCXfmDYzdHCRTT lL6zXCXfmDYzdHCRTT = (LL6zXCXfmDYzdHCRTT) mizqaiwqutukbpjchsfxadq57ge.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR;
                        aGLXkGgj9ZepFnRvHMEtzaaSY aglxkggj9zepfnrvhmetzaasy = new aGLXkGgj9ZepFnRvHMEtzaaSY();
                        lL6zXCXfmDYzdHCRTT.getClass();
                        k5xHLp7fCPX0ktLE3ej5tGjGJa k5xhlp7fcpx0ktle3ej5tgjgjaAXO0LSrt8bKV = sGipz63rTUmSj3uFDvOtzihao.aXO0LSrt8bKV(sGipz63rTUmSj3uFDvOtzihao.CixTK5ZX8oWXHz34qHYV(lL6zXCXfmDYzdHCRTT, aglxkggj9zepfnrvhmetzaasy), new dM53lf8lG1colTg6WZKfLwi3o(mizqaiwqutukbpjchsfxadq57ge, null, 1));
                        k5xhlp7fcpx0ktle3ej5tgjgjaAXO0LSrt8bKV.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m(new QKIH77ZVGMjTqK4XOIPLci1Yc(this, k5xhlp7fcpx0ktle3ej5tgjgjaAXO0LSrt8bKV, mizqaiwqutukbpjchsfxadq57ge, 2), (LNbLc7UMz3g5KbIBk) this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.put(str, mizqaiwqutukbpjchsfxadq57ge);
                        HashSet hashSet = new HashSet();
                        hashSet.add(ztnfmw5iuwlfup);
                        this.NSjgqmGjEzuugn2SsG1mZFP.put(str, hashSet);
                        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(KUYypEB4eNWOZWVDpH, IVPB9DLMIoeA0Qp8AgwLlJ.class.getSimpleName() + ": processing " + ahgUxI6t6E);
                        return true;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
            throw th;
        }
    }

    public final miZQAIwqUtukbpjcHsFxaDq57gE zzpBGItXfub0yWj(String str) {
        miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57ge = (miZQAIwqUtukbpjcHsFxaDq57gE) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.remove(str);
        boolean z = mizqaiwqutukbpjchsfxadq57ge != null;
        if (!z) {
            mizqaiwqutukbpjchsfxadq57ge = (miZQAIwqUtukbpjcHsFxaDq57gE) this.ZLZeBXTMq0zDztBxtRTuCHrapQ.remove(str);
        }
        this.NSjgqmGjEzuugn2SsG1mZFP.remove(str);
        if (z) {
            synchronized (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
                try {
                    if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.isEmpty()) {
                        Context context = this.zzpBGItXfub0yWj;
                        String str2 = NLwwv8wzadD.KUYypEB4eNWOZWVDpH;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.zzpBGItXfub0yWj.startService(intent);
                        } catch (Throwable th) {
                            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(KUYypEB4eNWOZWVDpH, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
                        }
                    }
                } finally {
                }
            }
        }
        return mizqaiwqutukbpjchsfxadq57ge;
    }
}
