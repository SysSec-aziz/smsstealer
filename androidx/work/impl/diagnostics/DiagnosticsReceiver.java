package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vdodsodjsdt.Dei5I6vFbwXVXgdLb;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.kooPss93uoBTOWlOLlaD;
import com.vdodsodjsdt.psATg3LCCdmDIiRgW;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
        String str = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Requesting diagnostics");
        try {
            ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
            kooPss93uoBTOWlOLlaD.L8DMw02rUTs2w(context).f6ZQsR6bPLvvCDNXOUc(Dei5I6vFbwXVXgdLb.VxUQ9tBhpHJ2AAEDNW8sghc4m());
        } catch (IllegalStateException e) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(str, "WorkManager is not initialized", e);
        }
    }
}
