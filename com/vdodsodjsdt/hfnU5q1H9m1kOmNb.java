package com.vdodsodjsdt;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hfnU5q1H9m1kOmNb implements EfIvTei3Q8wBNpyLTZJevpFxej {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ hfnU5q1H9m1kOmNb(int i, Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        hMtEZx9LFZEOBsEChkiRKnXNYh1GG hmtezx9lfzeobsechkirknxnyh1gg = hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = 0;
        Object obj = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        switch (i) {
            case 0:
                try {
                    return (List) ((EfIvTei3Q8wBNpyLTZJevpFxej) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                } catch (SSLPeerUnverifiedException unused) {
                    return zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
                }
            case 1:
                return (List) obj;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                aLVvFTl6cTT alvvftl6ctt = (aLVvFTl6cTT) obj;
                alvvftl6ctt.getClass();
                try {
                    alvvftl6ctt.w0Wu95l8dVNw5rZMRu.q11o1hieEkZDhF1MGOZI26oZiDT(2, 0, false);
                    break;
                } catch (IOException e) {
                    sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe = sRSjJ4B4UdKzPCFBE.PROTOCOL_ERROR;
                    alvvftl6ctt.VxUQ9tBhpHJ2AAEDNW8sghc4m(srsjj4b4udkzpcfbe, srsjj4b4udkzpcfbe, e);
                }
                return hmtezx9lfzeobsechkirknxnyh1gg;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                Ux5CG4Z7p3K8gvz6V6O ux5CG4Z7p3K8gvz6V6O = (Ux5CG4Z7p3K8gvz6V6O) obj;
                String str = xMYEAzlgA1uisB1VOYAp1Sibvz.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                kooPss93uoBTOWlOLlaD koopss93uobtowlollad = ux5CG4Z7p3K8gvz6V6O.NSjgqmGjEzuugn2SsG1mZFP;
                WorkDatabase workDatabase = koopss93uobtowlollad.M9e7PWhFYLD2lOGMker;
                HashSet hashSet = new HashSet();
                hashSet.addAll(ux5CG4Z7p3K8gvz6V6O.M9e7PWhFYLD2lOGMker);
                HashSet hashSetL8DMw02rUTs2w = Ux5CG4Z7p3K8gvz6V6O.L8DMw02rUTs2w(ux5CG4Z7p3K8gvz6V6O);
                Iterator it = hashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hashSet.removeAll(ux5CG4Z7p3K8gvz6V6O.M9e7PWhFYLD2lOGMker);
                    } else if (hashSetL8DMw02rUTs2w.contains((String) it.next())) {
                        i2 = 1;
                    }
                }
                if (i2 != 0) {
                    throw new IllegalStateException("WorkContinuation has cycles (" + ux5CG4Z7p3K8gvz6V6O + ")");
                }
                Eh21X7fdrXs eh21X7fdrXs = koopss93uobtowlollad.GI83zq0G8e7zkn;
                workDatabase.V57tEvNfxZVVcOCAOih5PKr();
                try {
                    FLWIoSaHb1q8TqFvEBgPyRGrzvi6.zIvmSL0wzmmKGc3X39b2Gw2mUGE(workDatabase, eh21X7fdrXs, ux5CG4Z7p3K8gvz6V6O);
                    boolean zVxUQ9tBhpHJ2AAEDNW8sghc4m = xMYEAzlgA1uisB1VOYAp1Sibvz.VxUQ9tBhpHJ2AAEDNW8sghc4m(ux5CG4Z7p3K8gvz6V6O);
                    workDatabase.Ca81ebIan1u();
                    if (zVxUQ9tBhpHJ2AAEDNW8sghc4m) {
                        IajRZM8bx6ydOtWJS1Sd9DI.zzpBGItXfub0yWj(eh21X7fdrXs, workDatabase, koopss93uobtowlollad.KUYypEB4eNWOZWVDpH);
                    }
                    return hmtezx9lfzeobsechkirknxnyh1gg;
                } finally {
                    workDatabase.HzCpKshMOoaw76hFcbOVRYMeRd();
                }
            default:
                kooPss93uoBTOWlOLlaD koopss93uobtowlollad2 = (kooPss93uoBTOWlOLlaD) obj;
                WorkDatabase workDatabase2 = koopss93uobtowlollad2.M9e7PWhFYLD2lOGMker;
                int i3 = Build.VERSION.SDK_INT;
                Context context = koopss93uobtowlollad2.NSjgqmGjEzuugn2SsG1mZFP;
                String str2 = T9LNBTwcS97exQoP.NSjgqmGjEzuugn2SsG1mZFP;
                if (i3 >= 34) {
                    NRVhrM4Hyv.zzpBGItXfub0yWj(context).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                ArrayList arrayListLaeGQIruHQu81hfJldjMOQSVblH3x = T9LNBTwcS97exQoP.LaeGQIruHQu81hfJldjMOQSVblH3x(context, jobScheduler);
                if (arrayListLaeGQIruHQu81hfJldjMOQSVblH3x != null && !arrayListLaeGQIruHQu81hfJldjMOQSVblH3x.isEmpty()) {
                    int size = arrayListLaeGQIruHQu81hfJldjMOQSVblH3x.size();
                    while (i2 < size) {
                        Object obj2 = arrayListLaeGQIruHQu81hfJldjMOQSVblH3x.get(i2);
                        i2++;
                        T9LNBTwcS97exQoP.V57tEvNfxZVVcOCAOih5PKr(jobScheduler, ((JobInfo) obj2).getId());
                    }
                }
                SX5PHeJQdzT24G3iHfmAKRZsddf sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc = workDatabase2.f6ZQsR6bPLvvCDNXOUc();
                WorkDatabase_Impl workDatabase_Impl = sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                workDatabase_Impl.zzpBGItXfub0yWj();
                FbuZzoqAiJLuQzTy fbuZzoqAiJLuQzTy = sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.KUYypEB4eNWOZWVDpH;
                cGYUoKJ5QrSVTXdZE1f88VdPb3 cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m = fbuZzoqAiJLuQzTy.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                try {
                    workDatabase_Impl.V57tEvNfxZVVcOCAOih5PKr();
                    try {
                        cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        workDatabase_Impl.Ca81ebIan1u();
                        fbuZzoqAiJLuQzTy.ZfQNn8hdWlEQ5cR94249PDsLR(cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        IajRZM8bx6ydOtWJS1Sd9DI.zzpBGItXfub0yWj(koopss93uobtowlollad2.GI83zq0G8e7zkn, workDatabase2, koopss93uobtowlollad2.KUYypEB4eNWOZWVDpH);
                        return hmtezx9lfzeobsechkirknxnyh1gg;
                    } finally {
                        workDatabase_Impl.HzCpKshMOoaw76hFcbOVRYMeRd();
                    }
                } catch (Throwable th) {
                    fbuZzoqAiJLuQzTy.ZfQNn8hdWlEQ5cR94249PDsLR(cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    throw th;
                }
        }
    }
}
