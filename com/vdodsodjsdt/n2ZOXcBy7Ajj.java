package com.vdodsodjsdt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class n2ZOXcBy7Ajj extends BroadcastReceiver {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ Object zzpBGItXfub0yWj;

    public /* synthetic */ n2ZOXcBy7Ajj(int i, Object obj) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                ((UdNpBSaUQhOqU) this.zzpBGItXfub0yWj).NSjgqmGjEzuugn2SsG1mZFP();
                break;
            default:
                ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
                ej6unYlOWMDF.pYmKDYlAmhudp(intent, "intent");
                NXYyCFwrJiQhpxSwJB6lJD37IZ nXYyCFwrJiQhpxSwJB6lJD37IZ = (NXYyCFwrJiQhpxSwJB6lJD37IZ) this.zzpBGItXfub0yWj;
                switch (nXYyCFwrJiQhpxSwJB6lJD37IZ.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(xYfofDqpvX6lv1tsQxPRIk4.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        nXYyCFwrJiQhpxSwJB6lJD37IZ.zzpBGItXfub0yWj(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        nXYyCFwrJiQhpxSwJB6lJD37IZ.zzpBGItXfub0yWj(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        nXYyCFwrJiQhpxSwJB6lJD37IZ.zzpBGItXfub0yWj(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        nXYyCFwrJiQhpxSwJB6lJD37IZ.zzpBGItXfub0yWj(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        if (intent.getAction() != null) {
                            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(yPjjT2C6kM.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode != -1980154005) {
                                    if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        nXYyCFwrJiQhpxSwJB6lJD37IZ.zzpBGItXfub0yWj(Boolean.FALSE);
                                    }
                                    break;
                                } else if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    nXYyCFwrJiQhpxSwJB6lJD37IZ.zzpBGItXfub0yWj(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        if (intent.getAction() != null) {
                            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(N4aXRZM91Gh.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 != -1181163412) {
                                    if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        nXYyCFwrJiQhpxSwJB6lJD37IZ.zzpBGItXfub0yWj(Boolean.TRUE);
                                    }
                                    break;
                                } else if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    nXYyCFwrJiQhpxSwJB6lJD37IZ.zzpBGItXfub0yWj(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                }
                break;
        }
    }
}
