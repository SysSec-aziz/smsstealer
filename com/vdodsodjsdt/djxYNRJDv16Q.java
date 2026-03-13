package com.vdodsodjsdt;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class djxYNRJDv16Q extends zonOxHotd3BwAPJcwqr6I6uQNngg4 {
    public final /* synthetic */ int pYmKDYlAmhudp;

    public /* synthetic */ djxYNRJDv16Q(int i) {
        this.pYmKDYlAmhudp = i;
    }

    @Override // com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4
    public final Object CixTK5ZX8oWXHz34qHYV(Intent intent, int i) {
        switch (this.pYmKDYlAmhudp) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList arrayListVOvSEdhaZyc0oOGQ8 = vmp19D2MODlOL.VOvSEdhaZyc0oOGQ8(stringArrayExtra);
                        Iterator it = arrayListVOvSEdhaZyc0oOGQ8.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(arrayListVOvSEdhaZyc0oOGQ8), M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new FgeGQUnjhbxnrwqkj(it.next(), it2.next()));
                        }
                    }
                }
                break;
        }
        return new zHpcvbo7P2(intent, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4
    public final Intent KUYypEB4eNWOZWVDpH(zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo, Intent intent) {
        Bundle bundleExtra;
        switch (this.pYmKDYlAmhudp) {
            case 0:
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) intent);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(intentPutExtra, "putExtra(...)");
                return intentPutExtra;
            case 1:
                return intent;
            default:
                gjJSYRXNQYALPwuWEJb5HLx gjjsyrxnqyalpwuwejb5hlx = (gjJSYRXNQYALPwuWEJb5HLx) intent;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = gjjsyrxnqyalpwuwejb5hlx.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        gjjsyrxnqyalpwuwejb5hlx = new gjJSYRXNQYALPwuWEJb5HLx(gjjsyrxnqyalpwuwejb5hlx.V57tEvNfxZVVcOCAOih5PKr, null, gjjsyrxnqyalpwuwejb5hlx.LaeGQIruHQu81hfJldjMOQSVblH3x, gjjsyrxnqyalpwuwejb5hlx.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gjjsyrxnqyalpwuwejb5hlx);
                if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4
    public ZIqdBIWI9mxq4Xsi8 RhfGHxtXxy0M0grmp2jkRjQg(zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo, Intent intent) {
        switch (this.pYmKDYlAmhudp) {
            case 0:
                String[] strArr = (String[]) intent;
                if (strArr.length == 0) {
                    return new ZIqdBIWI9mxq4Xsi8(XC6rwBjRUhvxaQ8TfYI.V57tEvNfxZVVcOCAOih5PKr);
                }
                for (String str : strArr) {
                    if (str == null) {
                        throw new NullPointerException("permission must be non-null");
                    }
                    if (((Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? zf8a67a5zo524dlugofxsfo.checkPermission(str, Process.myPid(), Process.myUid()) : new AhXm4OqtdZ(zf8a67a5zo524dlugofxsfo).VxUQ9tBhpHJ2AAEDNW8sghc4m.areNotificationsEnabled() ? 0 : -1) != 0) {
                        return null;
                    }
                }
                int iD9zDyyznnp3oaDT1Ug = QtxmZgsffC8rBsc8wSUkFg2a.d9zDyyznnp3oaDT1Ug(strArr.length);
                if (iD9zDyyznnp3oaDT1Ug < 16) {
                    iD9zDyyznnp3oaDT1Ug = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iD9zDyyznnp3oaDT1Ug);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new ZIqdBIWI9mxq4Xsi8(linkedHashMap);
            default:
                return super.RhfGHxtXxy0M0grmp2jkRjQg(zf8a67a5zo524dlugofxsfo, intent);
        }
    }
}
