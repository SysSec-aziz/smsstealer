package com.vdodsodjsdt;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class NXYyCFwrJiQhpxSwJB6lJD37IZ extends pfLEtIq3hsg {
    public final /* synthetic */ int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final n2ZOXcBy7Ajj zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NXYyCFwrJiQhpxSwJB6lJD37IZ(Context context, nMRZPpfLCgJyuB nmrzppflcgjyub, int i) {
        super(context, nmrzppflcgjyub);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new n2ZOXcBy7Ajj(1, this);
    }

    public final IntentFilter LaeGQIruHQu81hfJldjMOQSVblH3x() {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    @Override // com.vdodsodjsdt.pfLEtIq3hsg
    public final void V57tEvNfxZVVcOCAOih5PKr() {
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(dZQlICjKEPRYh5.VxUQ9tBhpHJ2AAEDNW8sghc4m, getClass().getSimpleName().concat(": registering receiver"));
        this.zzpBGItXfub0yWj.registerReceiver(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, LaeGQIruHQu81hfJldjMOQSVblH3x());
    }

    @Override // com.vdodsodjsdt.pfLEtIq3hsg
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                Intent intentRegisterReceiver = this.zzpBGItXfub0yWj.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr(xYfofDqpvX6lv1tsQxPRIk4.VxUQ9tBhpHJ2AAEDNW8sghc4m, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent intentRegisterReceiver2 = this.zzpBGItXfub0yWj.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr(yPjjT2C6kM.VxUQ9tBhpHJ2AAEDNW8sghc4m, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                boolean z = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent intentRegisterReceiver3 = this.zzpBGItXfub0yWj.registerReceiver(null, LaeGQIruHQu81hfJldjMOQSVblH3x());
                boolean z2 = true;
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z2 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
        }
    }

    @Override // com.vdodsodjsdt.pfLEtIq3hsg
    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(dZQlICjKEPRYh5.VxUQ9tBhpHJ2AAEDNW8sghc4m, getClass().getSimpleName().concat(": unregistering receiver"));
        this.zzpBGItXfub0yWj.unregisterReceiver(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
    }
}
