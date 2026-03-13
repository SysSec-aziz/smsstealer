package androidx.work;

import android.content.Context;
import com.vdodsodjsdt.AO2JzxMx6g;
import com.vdodsodjsdt.Eh21X7fdrXs;
import com.vdodsodjsdt.FG8LIxsgYiLSfhN0jYKIKr;
import com.vdodsodjsdt.KfeOQNOupsCg6878zi4e;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.kooPss93uoBTOWlOLlaD;
import com.vdodsodjsdt.psATg3LCCdmDIiRgW;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements AO2JzxMx6g {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("WrkMgrInitializer");

    @Override // com.vdodsodjsdt.AO2JzxMx6g
    public final List VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.vdodsodjsdt.AO2JzxMx6g
    public final Object zzpBGItXfub0yWj(Context context) {
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(VxUQ9tBhpHJ2AAEDNW8sghc4m, "Initializing WorkManager with default configuration.");
        Eh21X7fdrXs eh21X7fdrXs = new Eh21X7fdrXs(new FG8LIxsgYiLSfhN0jYKIKr(0));
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        synchronized (kooPss93uoBTOWlOLlaD.f6ZQsR6bPLvvCDNXOUc) {
            try {
                kooPss93uoBTOWlOLlaD koopss93uobtowlollad = kooPss93uoBTOWlOLlaD.ko09zE6UAgwkV;
                if (koopss93uobtowlollad != null && kooPss93uoBTOWlOLlaD.jW7EiD0YL6xkbB158jMUzhWNWb1y != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (koopss93uobtowlollad == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (kooPss93uoBTOWlOLlaD.jW7EiD0YL6xkbB158jMUzhWNWb1y == null) {
                        kooPss93uoBTOWlOLlaD.jW7EiD0YL6xkbB158jMUzhWNWb1y = KfeOQNOupsCg6878zi4e.p59rPv72J9(applicationContext, eh21X7fdrXs);
                    }
                    kooPss93uoBTOWlOLlaD.ko09zE6UAgwkV = kooPss93uoBTOWlOLlaD.jW7EiD0YL6xkbB158jMUzhWNWb1y;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kooPss93uoBTOWlOLlaD.L8DMw02rUTs2w(context);
    }
}
