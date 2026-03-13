package com.vdodsodjsdt;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class dK8lXJmLVk2HQUoEZ9FQXvoB implements gx6fD5VMu4 {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ okcUO69vEcgndIAn0R ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ dK8lXJmLVk2HQUoEZ9FQXvoB(okcUO69vEcgndIAn0R okcuo69vecgndian0r, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = okcuo69vecgndian0r;
    }

    @Override // com.vdodsodjsdt.gx6fD5VMu4
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Object obj) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                okcUO69vEcgndIAn0R okcuo69vecgndian0r = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                ZtU4qQuGwUNq0Z4r5pguqr49NWh1F ztU4qQuGwUNq0Z4r5pguqr49NWh1F = (ZtU4qQuGwUNq0Z4r5pguqr49NWh1F) okcuo69vecgndian0r.pzqP2AqKW6J5PO8zCKnW.pollFirst();
                if (ztU4qQuGwUNq0Z4r5pguqr49NWh1F == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = ztU4qQuGwUNq0Z4r5pguqr49NWh1F.V57tEvNfxZVVcOCAOih5PKr;
                    if (okcuo69vecgndian0r.V57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            case 1:
                zHpcvbo7P2 zhpcvbo7p2 = (zHpcvbo7P2) obj;
                okcUO69vEcgndIAn0R okcuo69vecgndian0r2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                ZtU4qQuGwUNq0Z4r5pguqr49NWh1F ztU4qQuGwUNq0Z4r5pguqr49NWh1F2 = (ZtU4qQuGwUNq0Z4r5pguqr49NWh1F) okcuo69vecgndian0r2.pzqP2AqKW6J5PO8zCKnW.pollFirst();
                if (ztU4qQuGwUNq0Z4r5pguqr49NWh1F2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = ztU4qQuGwUNq0Z4r5pguqr49NWh1F2.V57tEvNfxZVVcOCAOih5PKr;
                    int i2 = ztU4qQuGwUNq0Z4r5pguqr49NWh1F2.ZfQNn8hdWlEQ5cR94249PDsLR;
                    dip85SLOWSmNG3 dip85slowsmng3ZLZeBXTMq0zDztBxtRTuCHrapQ = okcuo69vecgndian0r2.V57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ(str2);
                    if (dip85slowsmng3ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        dip85slowsmng3ZLZeBXTMq0zDztBxtRTuCHrapQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i2, zhpcvbo7p2.V57tEvNfxZVVcOCAOih5PKr, zhpcvbo7p2.ZfQNn8hdWlEQ5cR94249PDsLR);
                    }
                }
                break;
            default:
                zHpcvbo7P2 zhpcvbo7p22 = (zHpcvbo7P2) obj;
                okcUO69vEcgndIAn0R okcuo69vecgndian0r3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                ZtU4qQuGwUNq0Z4r5pguqr49NWh1F ztU4qQuGwUNq0Z4r5pguqr49NWh1F3 = (ZtU4qQuGwUNq0Z4r5pguqr49NWh1F) okcuo69vecgndian0r3.pzqP2AqKW6J5PO8zCKnW.pollFirst();
                if (ztU4qQuGwUNq0Z4r5pguqr49NWh1F3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = ztU4qQuGwUNq0Z4r5pguqr49NWh1F3.V57tEvNfxZVVcOCAOih5PKr;
                    int i3 = ztU4qQuGwUNq0Z4r5pguqr49NWh1F3.ZfQNn8hdWlEQ5cR94249PDsLR;
                    dip85SLOWSmNG3 dip85slowsmng3ZLZeBXTMq0zDztBxtRTuCHrapQ2 = okcuo69vecgndian0r3.V57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ(str3);
                    if (dip85slowsmng3ZLZeBXTMq0zDztBxtRTuCHrapQ2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        dip85slowsmng3ZLZeBXTMq0zDztBxtRTuCHrapQ2.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i3, zhpcvbo7p22.V57tEvNfxZVVcOCAOih5PKr, zhpcvbo7p22.ZfQNn8hdWlEQ5cR94249PDsLR);
                    }
                }
                break;
        }
    }
}
