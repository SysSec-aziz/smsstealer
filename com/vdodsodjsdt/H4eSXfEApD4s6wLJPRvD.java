package com.vdodsodjsdt;

import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class H4eSXfEApD4s6wLJPRvD implements Runnable {
    public Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr = 1;
    public Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public /* synthetic */ H4eSXfEApD4s6wLJPRvD() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                Context context = (Context) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                Intent intent = (Intent) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(ConstraintProxyUpdateReceiver.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    EO99NGehiWVPkTbvSXC31nMw5bMD.VxUQ9tBhpHJ2AAEDNW8sghc4m(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    EO99NGehiWVPkTbvSXC31nMw5bMD.VxUQ9tBhpHJ2AAEDNW8sghc4m(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    EO99NGehiWVPkTbvSXC31nMw5bMD.VxUQ9tBhpHJ2AAEDNW8sghc4m(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    EO99NGehiWVPkTbvSXC31nMw5bMD.VxUQ9tBhpHJ2AAEDNW8sghc4m(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                try {
                    objCall = ((QPa3tfXsbwIaf7Ekerd41MUIoeE) this.ZfQNn8hdWlEQ5cR94249PDsLR).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).post(new gZVesoHrfMaGvAvfBsRIr((WpiLOI3RQ2nVUwtF) this.LaeGQIruHQu81hfJldjMOQSVblH3x, objCall, 9, false));
                return;
            default:
                M9TaMBovb7u6bH.NSjgqmGjEzuugn2SsG1mZFP((View) this.ZfQNn8hdWlEQ5cR94249PDsLR, (o0x3OWMw3He) this.LaeGQIruHQu81hfJldjMOQSVblH3x);
                ((ValueAnimator) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).start();
                return;
        }
    }

    public H4eSXfEApD4s6wLJPRvD(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = intent;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = context;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = pendingResult;
    }

    public H4eSXfEApD4s6wLJPRvD(View view, oh4pE3JpiN2OEnGMPzOmHa7Yqe oh4pe3jpin2oengmpzomha7yqe, o0x3OWMw3He o0x3owmw3he, ValueAnimator valueAnimator) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = view;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = o0x3owmw3he;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = valueAnimator;
    }
}
