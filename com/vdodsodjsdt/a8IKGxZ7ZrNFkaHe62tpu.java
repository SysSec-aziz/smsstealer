package com.vdodsodjsdt;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a8IKGxZ7ZrNFkaHe62tpu {
    public static final CopyOnWriteArraySet VxUQ9tBhpHJ2AAEDNW8sghc4m = new CopyOnWriteArraySet();
    public static final Map zzpBGItXfub0yWj;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = o8p4Xhf9gKH3WuUFc74.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(o8p4Xhf9gKH3WuUFc74.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(tFVUzh05cCwb.class.getName(), "okhttp.Http2");
        linkedHashMap.put(j5jyRGaw4k.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        zzpBGItXfub0yWj = QtxmZgsffC8rBsc8wSUkFg2a.ymT6yQrus3w(linkedHashMap);
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(String str, int i, String str2, Throwable th) {
        int iMin;
        String strVAUpruoPNdSAVh = (String) zzpBGItXfub0yWj.get(str);
        if (strVAUpruoPNdSAVh == null) {
            strVAUpruoPNdSAVh = cwhrCnoVJBjJE2CBEAvBopmgF.VAUpruoPNdSAVh(str, 23);
        }
        if (Log.isLoggable(strVAUpruoPNdSAVh, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iPf1HsU8AK92buCoUaexm5AC = cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(str2, '\n', i2, 4);
                if (iPf1HsU8AK92buCoUaexm5AC == -1) {
                    iPf1HsU8AK92buCoUaexm5AC = length;
                }
                while (true) {
                    iMin = Math.min(iPf1HsU8AK92buCoUaexm5AC, i2 + 4000);
                    String strSubstring = str2.substring(i2, iMin);
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
                    Log.println(i, strVAUpruoPNdSAVh, strSubstring);
                    if (iMin >= iPf1HsU8AK92buCoUaexm5AC) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
