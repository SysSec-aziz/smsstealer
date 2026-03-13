package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.vdodsodjsdt.AO2JzxMx6g;
import com.vdodsodjsdt.L5b7xJ7pyIi2fN6Tbs;
import com.vdodsodjsdt.NrjuzzioPqfttNRptBDpZDzSYUrcM;
import com.vdodsodjsdt.PYVSZNDvnX7q4m6XJHa5nTA;
import com.vdodsodjsdt.XOTOHmUA5NYhlyOBh7;
import com.vdodsodjsdt.boNYYtZCg4Xyk7RK;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.pTbv6Zpq5WHjSA6;
import com.vdodsodjsdt.zyfAMJWWt8IroEev2OgKlBxvdV;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements AO2JzxMx6g {
    @Override // com.vdodsodjsdt.AO2JzxMx6g
    public final List VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // com.vdodsodjsdt.AO2JzxMx6g
    public final Object zzpBGItXfub0yWj(Context context) {
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMF6ZQsR6bPLvvCDNXOUc = NrjuzzioPqfttNRptBDpZDzSYUrcM.f6ZQsR6bPLvvCDNXOUc(context);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(nrjuzzioPqfttNRptBDpZDzSYUrcMF6ZQsR6bPLvvCDNXOUc, "getInstance(context)");
        if (!((HashSet) nrjuzzioPqfttNRptBDpZDzSYUrcMF6ZQsR6bPLvvCDNXOUc.V57tEvNfxZVVcOCAOih5PKr).contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!PYVSZNDvnX7q4m6XJHa5nTA.VxUQ9tBhpHJ2AAEDNW8sghc4m.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            ej6unYlOWMDF.Ca81ebIan1u(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new boNYYtZCg4Xyk7RK());
        }
        L5b7xJ7pyIi2fN6Tbs l5b7xJ7pyIi2fN6Tbs = L5b7xJ7pyIi2fN6Tbs.HzCpKshMOoaw76hFcbOVRYMeRd;
        l5b7xJ7pyIi2fN6Tbs.getClass();
        l5b7xJ7pyIi2fN6Tbs.ZLZeBXTMq0zDztBxtRTuCHrapQ = new Handler();
        l5b7xJ7pyIi2fN6Tbs.NSjgqmGjEzuugn2SsG1mZFP.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        ej6unYlOWMDF.Ca81ebIan1u(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new pTbv6Zpq5WHjSA6(l5b7xJ7pyIi2fN6Tbs));
        return l5b7xJ7pyIi2fN6Tbs;
    }
}
