package com.vdodsodjsdt;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xMYEAzlgA1uisB1VOYAp1Sibvz {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("EnqueueRunnable");

    public static boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(Ux5CG4Z7p3K8gvz6V6O ux5CG4Z7p3K8gvz6V6O) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        WorkDatabase workDatabase;
        WorkDatabase_Impl workDatabase_Impl;
        HashSet hashSetL8DMw02rUTs2w = Ux5CG4Z7p3K8gvz6V6O.L8DMw02rUTs2w(ux5CG4Z7p3K8gvz6V6O);
        kooPss93uoBTOWlOLlaD koopss93uobtowlollad = ux5CG4Z7p3K8gvz6V6O.NSjgqmGjEzuugn2SsG1mZFP;
        List list = ux5CG4Z7p3K8gvz6V6O.GI83zq0G8e7zkn;
        String[] strArr = (String[]) hashSetL8DMw02rUTs2w.toArray(new String[0]);
        koopss93uobtowlollad.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = koopss93uobtowlollad.M9e7PWhFYLD2lOGMker;
        boolean z5 = strArr != null && strArr.length > 0;
        int i = 4;
        if (z5) {
            z2 = false;
            z3 = false;
            z = true;
            for (String str : strArr) {
                vIPEe55rgLxLcs vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ = workDatabase2.f6ZQsR6bPLvvCDNXOUc().ZLZeBXTMq0zDztBxtRTuCHrapQ(str);
                if (vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr(VxUQ9tBhpHJ2AAEDNW8sghc4m, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    z4 = false;
                    break;
                }
                int i2 = vipee55rglxlcsZLZeBXTMq0zDztBxtRTuCHrapQ.zzpBGItXfub0yWj;
                z &= i2 == 3;
                if (i2 == 4) {
                    z3 = true;
                } else if (i2 == 6) {
                    z2 = true;
                }
            }
        } else {
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (!zIsEmpty && !z5) {
            workDatabase2.f6ZQsR6bPLvvCDNXOUc().getClass();
            xgjEDGKy9VX5.VxUQ9tBhpHJ2AAEDNW8sghc4m("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1).f6ZQsR6bPLvvCDNXOUc(null, 1);
            throw null;
        }
        Iterator it = list.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            Dei5I6vFbwXVXgdLb dei5I6vFbwXVXgdLb = (Dei5I6vFbwXVXgdLb) it.next();
            vIPEe55rgLxLcs vipee55rglxlcsZzpBGItXfub0yWj = dei5I6vFbwXVXgdLb.zzpBGItXfub0yWj;
            UUID uuid = dei5I6vFbwXVXgdLb.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (!z5 || z) {
                vipee55rglxlcsZzpBGItXfub0yWj.p59rPv72J9 = jCurrentTimeMillis;
            } else if (z3) {
                vipee55rglxlcsZzpBGItXfub0yWj.zzpBGItXfub0yWj = i;
            } else if (z2) {
                vipee55rglxlcsZzpBGItXfub0yWj.zzpBGItXfub0yWj = 6;
            } else {
                vipee55rglxlcsZzpBGItXfub0yWj.zzpBGItXfub0yWj = 5;
            }
            Iterator it2 = it;
            if (vipee55rglxlcsZzpBGItXfub0yWj.zzpBGItXfub0yWj == 1) {
                z6 = true;
            }
            SX5PHeJQdzT24G3iHfmAKRZsddf sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc = workDatabase2.f6ZQsR6bPLvvCDNXOUc();
            kooPss93uoBTOWlOLlaD koopss93uobtowlollad2 = koopss93uobtowlollad;
            ej6unYlOWMDF.pYmKDYlAmhudp(koopss93uobtowlollad.KUYypEB4eNWOZWVDpH, "schedulers");
            c9cdYDXIxS3U c9cdydxixs3u = vipee55rglxlcsZzpBGItXfub0yWj.LaeGQIruHQu81hfJldjMOQSVblH3x;
            boolean zZzpBGItXfub0yWj = c9cdydxixs3u.zzpBGItXfub0yWj("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            long j = jCurrentTimeMillis;
            boolean zZzpBGItXfub0yWj2 = c9cdydxixs3u.zzpBGItXfub0yWj("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean zZzpBGItXfub0yWj3 = c9cdydxixs3u.zzpBGItXfub0yWj("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (!zZzpBGItXfub0yWj && zZzpBGItXfub0yWj2 && zZzpBGItXfub0yWj3) {
                String str2 = vipee55rglxlcsZzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr;
                workDatabase = workDatabase2;
                N1mT85AVNMY84KnH4 n1mT85AVNMY84KnH4 = new N1mT85AVNMY84KnH4(0);
                n1mT85AVNMY84KnH4.zzpBGItXfub0yWj(c9cdydxixs3u.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                LinkedHashMap linkedHashMap = n1mT85AVNMY84KnH4.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str2);
                c9cdYDXIxS3U c9cdydxixs3u2 = new c9cdYDXIxS3U(linkedHashMap);
                FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ymT6yQrus3w(c9cdydxixs3u2);
                vipee55rglxlcsZzpBGItXfub0yWj = vIPEe55rgLxLcs.zzpBGItXfub0yWj(vipee55rglxlcsZzpBGItXfub0yWj, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", c9cdydxixs3u2);
            } else {
                workDatabase = workDatabase2;
            }
            if (Build.VERSION.SDK_INT < 26) {
                c0WB626RcDoa849JB c0wb626rcdoa849jb = vipee55rglxlcsZzpBGItXfub0yWj.M9e7PWhFYLD2lOGMker;
                String str3 = vipee55rglxlcsZzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr;
                if (!ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(str3, ConstraintTrackingWorker.class.getName()) && (c0wb626rcdoa849jb.LaeGQIruHQu81hfJldjMOQSVblH3x || c0wb626rcdoa849jb.zIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
                    N1mT85AVNMY84KnH4 n1mT85AVNMY84KnH42 = new N1mT85AVNMY84KnH4(0);
                    c9cdYDXIxS3U c9cdydxixs3u3 = vipee55rglxlcsZzpBGItXfub0yWj.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    ej6unYlOWMDF.pYmKDYlAmhudp(c9cdydxixs3u3, "data");
                    n1mT85AVNMY84KnH42.zzpBGItXfub0yWj(c9cdydxixs3u3.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    LinkedHashMap linkedHashMap2 = n1mT85AVNMY84KnH42.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    linkedHashMap2.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str3);
                    c9cdYDXIxS3U c9cdydxixs3u4 = new c9cdYDXIxS3U(linkedHashMap2);
                    FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ymT6yQrus3w(c9cdydxixs3u4);
                    vipee55rglxlcsZzpBGItXfub0yWj = vIPEe55rgLxLcs.zzpBGItXfub0yWj(vipee55rglxlcsZzpBGItXfub0yWj, ConstraintTrackingWorker.class.getName(), c9cdydxixs3u4);
                }
            }
            WorkDatabase_Impl workDatabase_Impl2 = sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            workDatabase_Impl2.zzpBGItXfub0yWj();
            workDatabase_Impl2.V57tEvNfxZVVcOCAOih5PKr();
            try {
                sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.zzpBGItXfub0yWj.zIvmSL0wzmmKGc3X39b2Gw2mUGE(vipee55rglxlcsZzpBGItXfub0yWj);
                workDatabase_Impl2.Ca81ebIan1u();
                workDatabase_Impl2.HzCpKshMOoaw76hFcbOVRYMeRd();
                if (z5) {
                    for (String str4 : strArr) {
                        String string = uuid.toString();
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "id.toString()");
                        jlnAxgHUePQr7APBhl3hb8k2c3JM jlnaxghuepqr7apbhl3hb8k2c3jm = new jlnAxgHUePQr7APBhl3hb8k2c3JM(string, str4);
                        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzcZIvmSL0wzmmKGc3X39b2Gw2mUGE = workDatabase.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                        workDatabase_Impl = (WorkDatabase_Impl) dxzw8zznrxsriyjeidzcZIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr;
                        workDatabase_Impl.zzpBGItXfub0yWj();
                        workDatabase_Impl.V57tEvNfxZVVcOCAOih5PKr();
                        try {
                            ((xR0ZoYA1SdIBIre5oWm06m) dxzw8zznrxsriyjeidzcZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZfQNn8hdWlEQ5cR94249PDsLR).zIvmSL0wzmmKGc3X39b2Gw2mUGE(jlnaxghuepqr7apbhl3hb8k2c3jm);
                            workDatabase_Impl.Ca81ebIan1u();
                            workDatabase_Impl.HzCpKshMOoaw76hFcbOVRYMeRd();
                        } finally {
                        }
                    }
                }
                o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21VBGA6pPLqSMuYGvprl270j7 = workDatabase.vBGA6pPLqSMuYGvprl270j7();
                String string2 = uuid.toString();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string2, "id.toString()");
                LinkedHashSet linkedHashSet = dei5I6vFbwXVXgdLb.V57tEvNfxZVVcOCAOih5PKr;
                o6oxmoscd9hj6lf8utncntx9cf21VBGA6pPLqSMuYGvprl270j7.getClass();
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    b6D9g341h01hK b6d9g341h01hk = new b6D9g341h01hK((String) it3.next(), string2);
                    workDatabase_Impl = (WorkDatabase_Impl) o6oxmoscd9hj6lf8utncntx9cf21VBGA6pPLqSMuYGvprl270j7.V57tEvNfxZVVcOCAOih5PKr;
                    workDatabase_Impl.zzpBGItXfub0yWj();
                    workDatabase_Impl.V57tEvNfxZVVcOCAOih5PKr();
                    try {
                        ((xR0ZoYA1SdIBIre5oWm06m) o6oxmoscd9hj6lf8utncntx9cf21VBGA6pPLqSMuYGvprl270j7.ZfQNn8hdWlEQ5cR94249PDsLR).zIvmSL0wzmmKGc3X39b2Gw2mUGE(b6d9g341h01hk);
                        workDatabase_Impl.Ca81ebIan1u();
                    } finally {
                    }
                }
                if (!zIsEmpty) {
                    workDatabase.ko09zE6UAgwkV();
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(uuid.toString(), "id.toString()");
                    ej6unYlOWMDF.pYmKDYlAmhudp(null, "name");
                    throw null;
                }
                it = it2;
                koopss93uobtowlollad = koopss93uobtowlollad2;
                workDatabase2 = workDatabase;
                jCurrentTimeMillis = j;
                i = 4;
            } catch (Throwable th) {
                workDatabase_Impl2.HzCpKshMOoaw76hFcbOVRYMeRd();
                throw th;
            }
        }
        z4 = z6;
        ux5CG4Z7p3K8gvz6V6O.KUYypEB4eNWOZWVDpH = true;
        return z4;
    }
}
