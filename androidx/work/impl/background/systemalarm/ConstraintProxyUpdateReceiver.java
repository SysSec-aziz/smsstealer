package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vdodsodjsdt.H4eSXfEApD4s6wLJPRvD;
import com.vdodsodjsdt.kooPss93uoBTOWlOLlaD;
import com.vdodsodjsdt.psATg3LCCdmDIiRgW;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            kooPss93uoBTOWlOLlaD.L8DMw02rUTs2w(context).HzCpKshMOoaw76hFcbOVRYMeRd.ZfQNn8hdWlEQ5cR94249PDsLR(new H4eSXfEApD4s6wLJPRvD(intent, context, goAsync()));
            return;
        }
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(VxUQ9tBhpHJ2AAEDNW8sghc4m, "Ignoring unknown action " + action);
    }
}
