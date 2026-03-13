package com.vdodsodjsdt;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class HqgfdHRFzXYO3mSc {
    public static final ki0ZWFpNS2MqGdb V57tEvNfxZVVcOCAOih5PKr = new ki0ZWFpNS2MqGdb(new dz5cxiLYCa1z79yM());
    public static final int ZfQNn8hdWlEQ5cR94249PDsLR = -100;
    public static BIajpH9rKfhy3tkxKeGET7A9E5xV LaeGQIruHQu81hfJldjMOQSVblH3x = null;
    public static BIajpH9rKfhy3tkxKeGET7A9E5xV zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
    public static Boolean ZLZeBXTMq0zDztBxtRTuCHrapQ = null;
    public static boolean NSjgqmGjEzuugn2SsG1mZFP = false;
    public static final DBkPCwg2bk GI83zq0G8e7zkn = new DBkPCwg2bk();
    public static final Object M9e7PWhFYLD2lOGMker = new Object();
    public static final Object HzCpKshMOoaw76hFcbOVRYMeRd = new Object();

    public static void LaeGQIruHQu81hfJldjMOQSVblH3x(BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY) {
        synchronized (M9e7PWhFYLD2lOGMker) {
            try {
                DBkPCwg2bk dBkPCwg2bk = GI83zq0G8e7zkn;
                dBkPCwg2bk.getClass();
                YZGEqxBO83YadVVg yZGEqxBO83YadVVg = new YZGEqxBO83YadVVg(dBkPCwg2bk);
                while (yZGEqxBO83YadVVg.hasNext()) {
                    HqgfdHRFzXYO3mSc hqgfdHRFzXYO3mSc = (HqgfdHRFzXYO3mSc) ((WeakReference) yZGEqxBO83YadVVg.next()).get();
                    if (hqgfdHRFzXYO3mSc == bbqUXujjobWQwx4SY || hqgfdHRFzXYO3mSc == null) {
                        yZGEqxBO83YadVVg.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean zzpBGItXfub0yWj(Context context) {
        if (ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            try {
                int i = ZLhSEqjVSV.V57tEvNfxZVVcOCAOih5PKr;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ZLhSEqjVSV.class), XW0vSqYSC6IpLapbFlJbeYW.VxUQ9tBhpHJ2AAEDNW8sghc4m() | 128).metaData;
                if (bundle != null) {
                    ZLZeBXTMq0zDztBxtRTuCHrapQ = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                ZLZeBXTMq0zDztBxtRTuCHrapQ = Boolean.FALSE;
            }
        }
        return ZLZeBXTMq0zDztBxtRTuCHrapQ.booleanValue();
    }

    public abstract void HzCpKshMOoaw76hFcbOVRYMeRd(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void KUYypEB4eNWOZWVDpH(CharSequence charSequence);

    public abstract void M9e7PWhFYLD2lOGMker(View view);

    public abstract void V57tEvNfxZVVcOCAOih5PKr();

    public abstract void VxUQ9tBhpHJ2AAEDNW8sghc4m();

    public abstract void ZLZeBXTMq0zDztBxtRTuCHrapQ(int i);

    public abstract void ZfQNn8hdWlEQ5cR94249PDsLR();

    public abstract boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i);
}
