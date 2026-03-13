package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import com.vdodsodjsdt.FebcEr6HDzMxO4Tzw7bCSO57;
import com.vdodsodjsdt.JCv1sAljLJlTL0U;
import com.vdodsodjsdt.ZLj2ZJlGf9PXaB;
import com.vdodsodjsdt.mSLWNe1VDLcB1VYI;
import com.vdodsodjsdt.psATg3LCCdmDIiRgW;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends FebcEr6HDzMxO4Tzw7bCSO57 {
    public static final String zIvmSL0wzmmKGc3X39b2Gw2mUGE = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("SystemAlarmService");
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public JCv1sAljLJlTL0U ZfQNn8hdWlEQ5cR94249PDsLR;

    @Override // com.vdodsodjsdt.FebcEr6HDzMxO4Tzw7bCSO57, android.app.Service
    public final void onCreate() {
        super.onCreate();
        JCv1sAljLJlTL0U jCv1sAljLJlTL0U = new JCv1sAljLJlTL0U(this);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = jCv1sAljLJlTL0U;
        if (jCv1sAljLJlTL0U.HzCpKshMOoaw76hFcbOVRYMeRd != null) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr(JCv1sAljLJlTL0U.q1wNbhk2O6, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            jCv1sAljLJlTL0U.HzCpKshMOoaw76hFcbOVRYMeRd = this;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
    }

    @Override // com.vdodsodjsdt.FebcEr6HDzMxO4Tzw7bCSO57, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        JCv1sAljLJlTL0U jCv1sAljLJlTL0U = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        jCv1sAljLJlTL0U.getClass();
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(JCv1sAljLJlTL0U.q1wNbhk2O6, "Destroying SystemAlarmDispatcher");
        jCv1sAljLJlTL0U.zIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x(jCv1sAljLJlTL0U);
        jCv1sAljLJlTL0U.HzCpKshMOoaw76hFcbOVRYMeRd = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(zIvmSL0wzmmKGc3X39b2Gw2mUGE, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            JCv1sAljLJlTL0U jCv1sAljLJlTL0U = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            jCv1sAljLJlTL0U.getClass();
            psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
            String str = JCv1sAljLJlTL0U.q1wNbhk2O6;
            psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Destroying SystemAlarmDispatcher");
            jCv1sAljLJlTL0U.zIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x(jCv1sAljLJlTL0U);
            jCv1sAljLJlTL0U.HzCpKshMOoaw76hFcbOVRYMeRd = null;
            JCv1sAljLJlTL0U jCv1sAljLJlTL0U2 = new JCv1sAljLJlTL0U(this);
            this.ZfQNn8hdWlEQ5cR94249PDsLR = jCv1sAljLJlTL0U2;
            if (jCv1sAljLJlTL0U2.HzCpKshMOoaw76hFcbOVRYMeRd != null) {
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                jCv1sAljLJlTL0U2.HzCpKshMOoaw76hFcbOVRYMeRd = this;
            }
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
        }
        if (intent == null) {
            return 3;
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m(intent, i2);
        return 3;
    }

    public final void zzpBGItXfub0yWj() {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(zIvmSL0wzmmKGc3X39b2Gw2mUGE, "All commands completed in dispatcher");
        String str = ZLj2ZJlGf9PXaB.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (mSLWNe1VDLcB1VYI.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            linkedHashMap.putAll(mSLWNe1VDLcB1VYI.zzpBGItXfub0yWj);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().NSjgqmGjEzuugn2SsG1mZFP(ZLj2ZJlGf9PXaB.VxUQ9tBhpHJ2AAEDNW8sghc4m, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }
}
