package com.vdodsodjsdt;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class npN16DNLGdVu2 {
    public final /* synthetic */ zf8a67a5ZO524dLUgOFxsfO NSjgqmGjEzuugn2SsG1mZFP;
    public final LinkedHashMap VxUQ9tBhpHJ2AAEDNW8sghc4m = new LinkedHashMap();
    public final LinkedHashMap zzpBGItXfub0yWj = new LinkedHashMap();
    public final LinkedHashMap V57tEvNfxZVVcOCAOih5PKr = new LinkedHashMap();
    public final ArrayList ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList();
    public final transient LinkedHashMap LaeGQIruHQu81hfJldjMOQSVblH3x = new LinkedHashMap();
    public final LinkedHashMap zIvmSL0wzmmKGc3X39b2Gw2mUGE = new LinkedHashMap();
    public final Bundle ZLZeBXTMq0zDztBxtRTuCHrapQ = new Bundle();

    public npN16DNLGdVu2(zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo) {
        this.NSjgqmGjEzuugn2SsG1mZFP = zf8a67a5zo524dlugofxsfo;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(String str) {
        Integer num;
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "key");
        if (!this.ZfQNn8hdWlEQ5cR94249PDsLR.contains(str) && (num = (Integer) this.zzpBGItXfub0yWj.remove(str)) != null) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.remove(num);
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.remove(str);
        LinkedHashMap linkedHashMap = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("Dropping pending result for request ", str, ": ");
            sbKUYypEB4eNWOZWVDpH.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbKUYypEB4eNWOZWVDpH.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((zHpcvbo7P2) FLWIoSaHb1q8TqFvEBgPyRGrzvi6.qNPQb1obP7(str, bundle)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.V57tEvNfxZVVcOCAOih5PKr;
        msmSVlFwXA4k5 msmsvlfwxa4k5 = (msmSVlFwXA4k5) linkedHashMap2.get(str);
        if (msmsvlfwxa4k5 != null) {
            ArrayList arrayList = msmsvlfwxa4k5.zzpBGItXfub0yWj;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                msmsvlfwxa4k5.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE((W3ZqXaAE9m3wS) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }

    public final iPIi8kzBfx0O76QHpuy V57tEvNfxZVVcOCAOih5PKr(String str, zonOxHotd3BwAPJcwqr6I6uQNngg4 zonoxhotd3bwapjcwqr6i6uqnngg4, gx6fD5VMu4 gx6fd5vmu4) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "key");
        ZfQNn8hdWlEQ5cR94249PDsLR(str);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.put(str, new WlL3REfr7Vc(gx6fd5vmu4, zonoxhotd3bwapjcwqr6i6uqnngg4));
        LinkedHashMap linkedHashMap = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            gx6fd5vmu4.VxUQ9tBhpHJ2AAEDNW8sghc4m(obj);
        }
        Bundle bundle = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        zHpcvbo7P2 zhpcvbo7p2 = (zHpcvbo7P2) FLWIoSaHb1q8TqFvEBgPyRGrzvi6.qNPQb1obP7(str, bundle);
        if (zhpcvbo7p2 != null) {
            bundle.remove(str);
            gx6fd5vmu4.VxUQ9tBhpHJ2AAEDNW8sghc4m(zonoxhotd3bwapjcwqr6i6uqnngg4.CixTK5ZX8oWXHz34qHYV(zhpcvbo7p2.ZfQNn8hdWlEQ5cR94249PDsLR, zhpcvbo7p2.V57tEvNfxZVVcOCAOih5PKr));
        }
        return new iPIi8kzBfx0O76QHpuy(this, str, zonoxhotd3bwapjcwqr6i6uqnngg4);
    }

    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, int i2, Intent intent) {
        String str = (String) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        WlL3REfr7Vc wlL3REfr7Vc = (WlL3REfr7Vc) this.LaeGQIruHQu81hfJldjMOQSVblH3x.get(str);
        if ((wlL3REfr7Vc != null ? wlL3REfr7Vc.VxUQ9tBhpHJ2AAEDNW8sghc4m : null) != null) {
            ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (arrayList.contains(str)) {
                wlL3REfr7Vc.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(wlL3REfr7Vc.zzpBGItXfub0yWj.CixTK5ZX8oWXHz34qHYV(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.remove(str);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.putParcelable(str, new zHpcvbo7P2(intent, i2));
        return true;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(String str) {
        LinkedHashMap linkedHashMap = this.zzpBGItXfub0yWj;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        dVgcA03YsKXhpp8H dvgca03yskxhpp8h = new dVgcA03YsKXhpp8H(0);
        for (Number number : new C2qPpHyRqIplzG6ph0YFOs3(new kVCYLXlG6ES6f(1, new t95KFNzc2QFE(2, dvgca03yskxhpp8h), dvgca03yskxhpp8h))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void zzpBGItXfub0yWj(int i, zonOxHotd3BwAPJcwqr6I6uQNngg4 zonoxhotd3bwapjcwqr6i6uqnngg4, Intent intent) {
        Bundle bundleExtra;
        int i2;
        zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo = this.NSjgqmGjEzuugn2SsG1mZFP;
        ZIqdBIWI9mxq4Xsi8 zIqdBIWI9mxq4Xsi8RhfGHxtXxy0M0grmp2jkRjQg = zonoxhotd3bwapjcwqr6i6uqnngg4.RhfGHxtXxy0M0grmp2jkRjQg(zf8a67a5zo524dlugofxsfo, intent);
        if (zIqdBIWI9mxq4Xsi8RhfGHxtXxy0M0grmp2jkRjQg != null) {
            new Handler(Looper.getMainLooper()).post(new mMfUDmjShjTxhFzD4(i, 0, this, zIqdBIWI9mxq4Xsi8RhfGHxtXxy0M0grmp2jkRjQg));
            return;
        }
        Intent intentKUYypEB4eNWOZWVDpH = zonoxhotd3bwapjcwqr6i6uqnngg4.KUYypEB4eNWOZWVDpH(zf8a67a5zo524dlugofxsfo, intent);
        if (intentKUYypEB4eNWOZWVDpH.getExtras() != null) {
            Bundle extras = intentKUYypEB4eNWOZWVDpH.getExtras();
            ej6unYlOWMDF.p59rPv72J9(extras);
            if (extras.getClassLoader() == null) {
                intentKUYypEB4eNWOZWVDpH.setExtrasClassLoader(zf8a67a5zo524dlugofxsfo.getClassLoader());
            }
        }
        if (intentKUYypEB4eNWOZWVDpH.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentKUYypEB4eNWOZWVDpH.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentKUYypEB4eNWOZWVDpH.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentKUYypEB4eNWOZWVDpH.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentKUYypEB4eNWOZWVDpH.getAction())) {
                zf8a67a5zo524dlugofxsfo.startActivityForResult(intentKUYypEB4eNWOZWVDpH, i, bundle);
                return;
            }
            gjJSYRXNQYALPwuWEJb5HLx gjjsyrxnqyalpwuwejb5hlx = (gjJSYRXNQYALPwuWEJb5HLx) intentKUYypEB4eNWOZWVDpH.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                ej6unYlOWMDF.p59rPv72J9(gjjsyrxnqyalpwuwejb5hlx);
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                zf8a67a5zo524dlugofxsfo.startIntentSenderForResult(gjjsyrxnqyalpwuwejb5hlx.V57tEvNfxZVVcOCAOih5PKr, i2, gjjsyrxnqyalpwuwejb5hlx.ZfQNn8hdWlEQ5cR94249PDsLR, gjjsyrxnqyalpwuwejb5hlx.LaeGQIruHQu81hfJldjMOQSVblH3x, gjjsyrxnqyalpwuwejb5hlx.zIvmSL0wzmmKGc3X39b2Gw2mUGE, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new mMfUDmjShjTxhFzD4(i2, 1, this, e));
                return;
            }
        }
        String[] stringArrayExtra = intentKUYypEB4eNWOZWVDpH.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
            if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                throw new IllegalArgumentException(u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr[i4] = stringArrayExtra[i5];
                    i4++;
                }
            }
        }
        zf8a67a5zo524dlugofxsfo.requestPermissions(stringArrayExtra, i);
    }
}
