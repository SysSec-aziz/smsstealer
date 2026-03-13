package com.vdodsodjsdt;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H5020FzOIeGdxBWIL1OKPe implements EfIvTei3Q8wBNpyLTZJevpFxej {
    public final /* synthetic */ ssIlBIazVyEpdtn9SOpMLpu7YjIT3 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ H2jsGOgXlkbRqFUBUI3hx5 V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ UUID ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ Context zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public /* synthetic */ H5020FzOIeGdxBWIL1OKPe(H2jsGOgXlkbRqFUBUI3hx5 h2jsGOgXlkbRqFUBUI3hx5, UUID uuid, ssIlBIazVyEpdtn9SOpMLpu7YjIT3 ssilbiazvyepdtn9sopmlpu7yjit3, Context context) {
        this.V57tEvNfxZVVcOCAOih5PKr = h2jsGOgXlkbRqFUBUI3hx5;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = uuid;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = ssilbiazvyepdtn9sopmlpu7yjit3;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = context;
    }

    @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() throws Throwable {
        H2jsGOgXlkbRqFUBUI3hx5 h2jsGOgXlkbRqFUBUI3hx5 = this.V57tEvNfxZVVcOCAOih5PKr;
        UUID uuid = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ssIlBIazVyEpdtn9SOpMLpu7YjIT3 ssilbiazvyepdtn9sopmlpu7yjit3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Context context = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        String string = uuid.toString();
        vIPEe55rgLxLcs vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ = h2jsGOgXlkbRqFUBUI3hx5.V57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ(string);
        if (vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ == null || u9SlVAuoWhQUfJ.ZfQNn8hdWlEQ5cR94249PDsLR(vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ.zzpBGItXfub0yWj)) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ = h2jsGOgXlkbRqFUBUI3hx5.zzpBGItXfub0yWj;
        synchronized (iVPB9DLMIoeA0Qp8AgwLlJ.HzCpKshMOoaw76hFcbOVRYMeRd) {
            try {
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(IVPB9DLMIoeA0Qp8AgwLlJ.KUYypEB4eNWOZWVDpH, "Moving WorkSpec (" + string + ") to the foreground");
                miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57ge = (miZQAIwqUtukbpjcHsFxaDq57gE) iVPB9DLMIoeA0Qp8AgwLlJ.ZLZeBXTMq0zDztBxtRTuCHrapQ.remove(string);
                if (mizqaiwqutukbpjchsfxadq57ge != null) {
                    if (iVPB9DLMIoeA0Qp8AgwLlJ.VxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
                        PowerManager.WakeLock wakeLockVxUQ9tBhpHJ2AAEDNW8sghc4m = ZLj2ZJlGf9PXaB.VxUQ9tBhpHJ2AAEDNW8sghc4m(iVPB9DLMIoeA0Qp8AgwLlJ.zzpBGItXfub0yWj, "ProcessorForegroundLck");
                        iVPB9DLMIoeA0Qp8AgwLlJ.VxUQ9tBhpHJ2AAEDNW8sghc4m = wakeLockVxUQ9tBhpHJ2AAEDNW8sghc4m;
                        wakeLockVxUQ9tBhpHJ2AAEDNW8sghc4m.acquire();
                    }
                    iVPB9DLMIoeA0Qp8AgwLlJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE.put(string, mizqaiwqutukbpjchsfxadq57ge);
                    Intent intentVxUQ9tBhpHJ2AAEDNW8sghc4m = NLwwv8wzadD.VxUQ9tBhpHJ2AAEDNW8sghc4m(iVPB9DLMIoeA0Qp8AgwLlJ.zzpBGItXfub0yWj, hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(mizqaiwqutukbpjchsfxadq57ge.VxUQ9tBhpHJ2AAEDNW8sghc4m), ssilbiazvyepdtn9sopmlpu7yjit3);
                    Context context2 = iVPB9DLMIoeA0Qp8AgwLlJ.zzpBGItXfub0yWj;
                    if (Build.VERSION.SDK_INT >= 26) {
                        r7fKZGfezTdpRAhj.M9e7PWhFYLD2lOGMker(context2, intentVxUQ9tBhpHJ2AAEDNW8sghc4m);
                    } else {
                        context2.startService(intentVxUQ9tBhpHJ2AAEDNW8sghc4m);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AhgUxI6t6E ahgUxI6t6EM9e7PWhFYLD2lOGMker = hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ);
        String str = NLwwv8wzadD.KUYypEB4eNWOZWVDpH;
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", ssilbiazvyepdtn9sopmlpu7yjit3.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ssilbiazvyepdtn9sopmlpu7yjit3.zzpBGItXfub0yWj);
        intent.putExtra("KEY_NOTIFICATION", ssilbiazvyepdtn9sopmlpu7yjit3.V57tEvNfxZVVcOCAOih5PKr);
        intent.putExtra("KEY_WORKSPEC_ID", ahgUxI6t6EM9e7PWhFYLD2lOGMker.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        intent.putExtra("KEY_GENERATION", ahgUxI6t6EM9e7PWhFYLD2lOGMker.zzpBGItXfub0yWj);
        context.startService(intent);
        return null;
    }
}
