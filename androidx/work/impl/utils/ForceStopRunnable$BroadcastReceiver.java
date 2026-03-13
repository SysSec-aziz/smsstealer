package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.vdodsodjsdt.psATg3LCCdmDIiRgW;
import com.vdodsodjsdt.zOMUjPXkm1MlWYwMLhvxaazucg6R6;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m <= 2) {
            Log.v(VxUQ9tBhpHJ2AAEDNW8sghc4m, "Rescheduling alarm that keeps track of force-stops.");
        }
        zOMUjPXkm1MlWYwMLhvxaazucg6R6.V57tEvNfxZVVcOCAOih5PKr(context);
    }
}
