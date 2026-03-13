package com.vdodsodjsdt;

import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class BgOStbPrbmZvR4Qn extends F44whnLsbQ {
    public final /* synthetic */ npN16DNLGdVu2 HzCpKshMOoaw76hFcbOVRYMeRd;
    public final /* synthetic */ String KUYypEB4eNWOZWVDpH;
    public final /* synthetic */ djxYNRJDv16Q q1wNbhk2O6;

    public BgOStbPrbmZvR4Qn(npN16DNLGdVu2 npn16dnlgdvu2, String str, djxYNRJDv16Q djxynrjdv16q) {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = npn16dnlgdvu2;
        this.KUYypEB4eNWOZWVDpH = str;
        this.q1wNbhk2O6 = djxynrjdv16q;
    }

    public final void wR7sbzHKf9hYV1lxoS6nqyszepWvN(Intent intent) throws Exception {
        npN16DNLGdVu2 npn16dnlgdvu2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        LinkedHashMap linkedHashMap = npn16dnlgdvu2.zzpBGItXfub0yWj;
        ArrayList arrayList = npn16dnlgdvu2.ZfQNn8hdWlEQ5cR94249PDsLR;
        String str = this.KUYypEB4eNWOZWVDpH;
        Object obj = linkedHashMap.get(str);
        djxYNRJDv16Q djxynrjdv16q = this.q1wNbhk2O6;
        if (obj == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + djxynrjdv16q + " and input " + intent + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj).intValue();
        arrayList.add(str);
        try {
            npn16dnlgdvu2.zzpBGItXfub0yWj(iIntValue, djxynrjdv16q, intent);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
