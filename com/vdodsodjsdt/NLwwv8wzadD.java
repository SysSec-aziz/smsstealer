package com.vdodsodjsdt;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class NLwwv8wzadD implements g3gI5tGnl5o1sbwn0siFDTBcKwP, owwckn2XMaN2nHMo {
    public static final String KUYypEB4eNWOZWVDpH = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("SystemFgDispatcher");
    public final HashMap GI83zq0G8e7zkn;
    public SystemForegroundService HzCpKshMOoaw76hFcbOVRYMeRd;
    public final Object LaeGQIruHQu81hfJldjMOQSVblH3x = new Object();
    public final yxp1I6Gr2tLDD3dH0UsMPMDr7 M9e7PWhFYLD2lOGMker;
    public final HashMap NSjgqmGjEzuugn2SsG1mZFP;
    public final kooPss93uoBTOWlOLlaD V57tEvNfxZVVcOCAOih5PKr;
    public final LinkedHashMap ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final nMRZPpfLCgJyuB ZfQNn8hdWlEQ5cR94249PDsLR;
    public AhgUxI6t6E zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public NLwwv8wzadD(Context context) {
        kooPss93uoBTOWlOLlaD koopss93uobtowlolladL8DMw02rUTs2w = kooPss93uoBTOWlOLlaD.L8DMw02rUTs2w(context);
        this.V57tEvNfxZVVcOCAOih5PKr = koopss93uobtowlolladL8DMw02rUTs2w;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = koopss93uobtowlolladL8DMw02rUTs2w.HzCpKshMOoaw76hFcbOVRYMeRd;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new LinkedHashMap();
        this.GI83zq0G8e7zkn = new HashMap();
        this.NSjgqmGjEzuugn2SsG1mZFP = new HashMap();
        this.M9e7PWhFYLD2lOGMker = new yxp1I6Gr2tLDD3dH0UsMPMDr7(koopss93uobtowlolladL8DMw02rUTs2w.pYmKDYlAmhudp);
        koopss93uobtowlolladL8DMw02rUTs2w.q1wNbhk2O6.VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
    }

    public static Intent VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, AhgUxI6t6E ahgUxI6t6E, ssIlBIazVyEpdtn9SOpMLpu7YjIT3 ssilbiazvyepdtn9sopmlpu7yjit3) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", ahgUxI6t6E.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        intent.putExtra("KEY_GENERATION", ahgUxI6t6E.zzpBGItXfub0yWj);
        intent.putExtra("KEY_NOTIFICATION_ID", ssilbiazvyepdtn9sopmlpu7yjit3.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ssilbiazvyepdtn9sopmlpu7yjit3.zzpBGItXfub0yWj);
        intent.putExtra("KEY_NOTIFICATION", ssilbiazvyepdtn9sopmlpu7yjit3.V57tEvNfxZVVcOCAOih5PKr);
        return intent;
    }

    @Override // com.vdodsodjsdt.owwckn2XMaN2nHMo
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(AhgUxI6t6E ahgUxI6t6E, boolean z) {
        Map.Entry entry;
        synchronized (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            try {
                sJ612dvaOBrP4lDkAwxzLpcxONSSp sj612dvaobrp4ldkawxzlpcxonssp = ((vIPEe55rgLxLcs) this.NSjgqmGjEzuugn2SsG1mZFP.remove(ahgUxI6t6E)) != null ? (sJ612dvaOBrP4lDkAwxzLpcxONSSp) this.GI83zq0G8e7zkn.remove(ahgUxI6t6E) : null;
                if (sj612dvaobrp4ldkawxzlpcxonssp != null) {
                    sj612dvaobrp4ldkawxzlpcxonssp.V57tEvNfxZVVcOCAOih5PKr(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ssIlBIazVyEpdtn9SOpMLpu7YjIT3 ssilbiazvyepdtn9sopmlpu7yjit3 = (ssIlBIazVyEpdtn9SOpMLpu7YjIT3) this.ZLZeBXTMq0zDztBxtRTuCHrapQ.remove(ahgUxI6t6E);
        if (ahgUxI6t6E.equals(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
            if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ.size() > 0) {
                Iterator it = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = (AhgUxI6t6E) entry.getKey();
                if (this.HzCpKshMOoaw76hFcbOVRYMeRd != null) {
                    ssIlBIazVyEpdtn9SOpMLpu7YjIT3 ssilbiazvyepdtn9sopmlpu7yjit32 = (ssIlBIazVyEpdtn9SOpMLpu7YjIT3) entry.getValue();
                    SystemForegroundService systemForegroundService = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                    int i = ssilbiazvyepdtn9sopmlpu7yjit32.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    int i2 = ssilbiazvyepdtn9sopmlpu7yjit32.zzpBGItXfub0yWj;
                    Notification notification = ssilbiazvyepdtn9sopmlpu7yjit32.V57tEvNfxZVVcOCAOih5PKr;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        BNx7YAOy6zSdxROhZx2.LaeGQIruHQu81hfJldjMOQSVblH3x(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        BNx7YAOy6zSdxROhZx2.ZfQNn8hdWlEQ5cR94249PDsLR(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.HzCpKshMOoaw76hFcbOVRYMeRd.zIvmSL0wzmmKGc3X39b2Gw2mUGE.cancel(ssilbiazvyepdtn9sopmlpu7yjit32.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
            } else {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (ssilbiazvyepdtn9sopmlpu7yjit3 == null || systemForegroundService2 == null) {
            return;
        }
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(KUYypEB4eNWOZWVDpH, "Removing Notification (id: " + ssilbiazvyepdtn9sopmlpu7yjit3.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", workSpecId: " + ahgUxI6t6E + ", notificationType: " + ssilbiazvyepdtn9sopmlpu7yjit3.zzpBGItXfub0yWj);
        systemForegroundService2.zIvmSL0wzmmKGc3X39b2Gw2mUGE.cancel(ssilbiazvyepdtn9sopmlpu7yjit3.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    @Override // com.vdodsodjsdt.g3gI5tGnl5o1sbwn0siFDTBcKwP
    public final void V57tEvNfxZVVcOCAOih5PKr(vIPEe55rgLxLcs vipee55rglxlcs, CWJlFo6DaGDzNFh4w cWJlFo6DaGDzNFh4w) {
        if (cWJlFo6DaGDzNFh4w instanceof hfmuRhTy7aVTHJ4xausxesbcd5d) {
            String str = vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(KUYypEB4eNWOZWVDpH, "Constraints unmet for WorkSpec " + str);
            AhgUxI6t6E ahgUxI6t6EM9e7PWhFYLD2lOGMker = hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(vipee55rglxlcs);
            int i = ((hfmuRhTy7aVTHJ4xausxesbcd5d) cWJlFo6DaGDzNFh4w).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            kooPss93uoBTOWlOLlaD koopss93uobtowlollad = this.V57tEvNfxZVVcOCAOih5PKr;
            koopss93uobtowlollad.HzCpKshMOoaw76hFcbOVRYMeRd.ZfQNn8hdWlEQ5cR94249PDsLR(new Y64anY0MWbS(koopss93uobtowlollad.q1wNbhk2O6, new ztNFMw5IuWLfuP(ahgUxI6t6EM9e7PWhFYLD2lOGMker), true, i));
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = null;
        synchronized (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            try {
                Iterator it = this.GI83zq0G8e7zkn.values().iterator();
                while (it.hasNext()) {
                    ((sJ612dvaOBrP4lDkAwxzLpcxONSSp) it.next()).V57tEvNfxZVVcOCAOih5PKr(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.V57tEvNfxZVVcOCAOih5PKr.q1wNbhk2O6.LaeGQIruHQu81hfJldjMOQSVblH3x(this);
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(KUYypEB4eNWOZWVDpH, "Foreground service timed out, FGS type: " + i);
        for (Map.Entry entry : this.ZLZeBXTMq0zDztBxtRTuCHrapQ.entrySet()) {
            if (((ssIlBIazVyEpdtn9SOpMLpu7YjIT3) entry.getValue()).zzpBGItXfub0yWj == i) {
                AhgUxI6t6E ahgUxI6t6E = (AhgUxI6t6E) entry.getKey();
                kooPss93uoBTOWlOLlaD koopss93uobtowlollad = this.V57tEvNfxZVVcOCAOih5PKr;
                koopss93uobtowlollad.HzCpKshMOoaw76hFcbOVRYMeRd.ZfQNn8hdWlEQ5cR94249PDsLR(new Y64anY0MWbS(koopss93uobtowlollad.q1wNbhk2O6, new ztNFMw5IuWLfuP(ahgUxI6t6E), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (systemForegroundService != null) {
            systemForegroundService.ZfQNn8hdWlEQ5cR94249PDsLR = true;
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(SystemForegroundService.ZLZeBXTMq0zDztBxtRTuCHrapQ, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
        }
    }

    public final void zzpBGItXfub0yWj(Intent intent) {
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        AhgUxI6t6E ahgUxI6t6E = new AhgUxI6t6E(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(KUYypEB4eNWOZWVDpH, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        ssIlBIazVyEpdtn9SOpMLpu7YjIT3 ssilbiazvyepdtn9sopmlpu7yjit3 = new ssIlBIazVyEpdtn9SOpMLpu7YjIT3(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        linkedHashMap.put(ahgUxI6t6E, ssilbiazvyepdtn9sopmlpu7yjit3);
        ssIlBIazVyEpdtn9SOpMLpu7YjIT3 ssilbiazvyepdtn9sopmlpu7yjit32 = (ssIlBIazVyEpdtn9SOpMLpu7YjIT3) linkedHashMap.get(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        if (ssilbiazvyepdtn9sopmlpu7yjit32 == null) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ahgUxI6t6E;
        } else {
            this.HzCpKshMOoaw76hFcbOVRYMeRd.zIvmSL0wzmmKGc3X39b2Gw2mUGE.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((ssIlBIazVyEpdtn9SOpMLpu7YjIT3) ((Map.Entry) it.next()).getValue()).zzpBGItXfub0yWj;
                }
                ssilbiazvyepdtn9sopmlpu7yjit3 = new ssIlBIazVyEpdtn9SOpMLpu7YjIT3(ssilbiazvyepdtn9sopmlpu7yjit32.VxUQ9tBhpHJ2AAEDNW8sghc4m, ssilbiazvyepdtn9sopmlpu7yjit32.V57tEvNfxZVVcOCAOih5PKr, i);
            } else {
                ssilbiazvyepdtn9sopmlpu7yjit3 = ssilbiazvyepdtn9sopmlpu7yjit32;
            }
        }
        SystemForegroundService systemForegroundService = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        int i2 = ssilbiazvyepdtn9sopmlpu7yjit3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i3 = ssilbiazvyepdtn9sopmlpu7yjit3.zzpBGItXfub0yWj;
        Notification notification2 = ssilbiazvyepdtn9sopmlpu7yjit3.V57tEvNfxZVVcOCAOih5PKr;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            BNx7YAOy6zSdxROhZx2.LaeGQIruHQu81hfJldjMOQSVblH3x(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            BNx7YAOy6zSdxROhZx2.ZfQNn8hdWlEQ5cR94249PDsLR(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }
}
