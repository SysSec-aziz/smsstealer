package com.vdodsodjsdt;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class QtG03lkTeBa4oRIc implements tSqY5CPxhJ6VVxEnYsw {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ zf8a67a5ZO524dLUgOFxsfO zzpBGItXfub0yWj;

    public /* synthetic */ QtG03lkTeBa4oRIc(zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = zf8a67a5zo524dlugofxsfo;
    }

    @Override // com.vdodsodjsdt.tSqY5CPxhJ6VVxEnYsw
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(zlpVhmuRpIfHYqU zlpvhmurpifhyqu) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                ej6unYlOWMDF.pYmKDYlAmhudp(zlpvhmurpifhyqu, "it");
                zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo = this.zzpBGItXfub0yWj;
                Bundle bundleV57tEvNfxZVVcOCAOih5PKr = ((ALnH3AptNOGA7UbXGxOl2SnVeZ) zf8a67a5zo524dlugofxsfo.zIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr).V57tEvNfxZVVcOCAOih5PKr("android:support:activity-result");
                if (bundleV57tEvNfxZVVcOCAOih5PKr != null) {
                    npN16DNLGdVu2 npn16dnlgdvu2 = zf8a67a5zo524dlugofxsfo.HzCpKshMOoaw76hFcbOVRYMeRd;
                    LinkedHashMap linkedHashMap = npn16dnlgdvu2.zzpBGItXfub0yWj;
                    LinkedHashMap linkedHashMap2 = npn16dnlgdvu2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    Bundle bundle = npn16dnlgdvu2.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                    ArrayList<Integer> integerArrayList = bundleV57tEvNfxZVVcOCAOih5PKr.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleV57tEvNfxZVVcOCAOih5PKr.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = bundleV57tEvNfxZVVcOCAOih5PKr.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        npn16dnlgdvu2.ZfQNn8hdWlEQ5cR94249PDsLR.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = bundleV57tEvNfxZVVcOCAOih5PKr.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle.containsKey(str)) {
                                continue;
                            } else {
                                if ((linkedHashMap2 instanceof X7FI9474k7GlT7TZYuRwmu) && !(linkedHashMap2 instanceof CFVmEEraGs6EYyW)) {
                                    F44whnLsbQ.Z1FjjMJ0suz8AFI7gsA4GDLMXv(linkedHashMap2, "kotlin.collections.MutableMap");
                                    throw null;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(num2, "get(...)");
                        int iIntValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(str2, "get(...)");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                        npn16dnlgdvu2.zzpBGItXfub0yWj.put(str3, Integer.valueOf(iIntValue));
                    }
                    return;
                }
                return;
            default:
                Dqd3yw7CrPyec1dms6HVj dqd3yw7CrPyec1dms6HVj = (Dqd3yw7CrPyec1dms6HVj) this.zzpBGItXfub0yWj.TaDO7ogis3aEiWEtq.ZfQNn8hdWlEQ5cR94249PDsLR;
                dqd3yw7CrPyec1dms6HVj.Ca81ebIan1u.zzpBGItXfub0yWj(dqd3yw7CrPyec1dms6HVj, dqd3yw7CrPyec1dms6HVj, null);
                return;
        }
    }
}
