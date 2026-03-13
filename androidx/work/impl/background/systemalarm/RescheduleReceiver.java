package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vdodsodjsdt.kooPss93uoBTOWlOLlaD;
import com.vdodsodjsdt.psATg3LCCdmDIiRgW;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(VxUQ9tBhpHJ2AAEDNW8sghc4m, "Received intent " + intent);
        try {
            kooPss93uoBTOWlOLlaD koopss93uobtowlolladL8DMw02rUTs2w = kooPss93uoBTOWlOLlaD.L8DMw02rUTs2w(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (kooPss93uoBTOWlOLlaD.f6ZQsR6bPLvvCDNXOUc) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = koopss93uobtowlolladL8DMw02rUTs2w.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    koopss93uobtowlolladL8DMw02rUTs2w.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = pendingResultGoAsync;
                    if (koopss93uobtowlolladL8DMw02rUTs2w.Ca81ebIan1u) {
                        pendingResultGoAsync.finish();
                        koopss93uobtowlolladL8DMw02rUTs2w.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(VxUQ9tBhpHJ2AAEDNW8sghc4m, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
