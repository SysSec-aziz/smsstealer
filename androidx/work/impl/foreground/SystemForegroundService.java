package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.vdodsodjsdt.FG8LIxsgYiLSfhN0jYKIKr;
import com.vdodsodjsdt.FebcEr6HDzMxO4Tzw7bCSO57;
import com.vdodsodjsdt.NLwwv8wzadD;
import com.vdodsodjsdt.OUBU6uEMdVy8Z;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.gZVesoHrfMaGvAvfBsRIr;
import com.vdodsodjsdt.ki0ZWFpNS2MqGdb;
import com.vdodsodjsdt.kooPss93uoBTOWlOLlaD;
import com.vdodsodjsdt.psATg3LCCdmDIiRgW;
import com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends FebcEr6HDzMxO4Tzw7bCSO57 {
    public static final String ZLZeBXTMq0zDztBxtRTuCHrapQ = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("SystemFgService");
    public NLwwv8wzadD LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public NotificationManager zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    @Override // com.vdodsodjsdt.FebcEr6HDzMxO4Tzw7bCSO57, android.app.Service
    public final void onCreate() {
        super.onCreate();
        zzpBGItXfub0yWj();
    }

    @Override // com.vdodsodjsdt.FebcEr6HDzMxO4Tzw7bCSO57, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        String str = ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (z) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR();
            zzpBGItXfub0yWj();
            this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
        }
        if (intent == null) {
            return 3;
        }
        NLwwv8wzadD nLwwv8wzadD = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        nLwwv8wzadD.getClass();
        String str2 = NLwwv8wzadD.KUYypEB4eNWOZWVDpH;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(str2, "Started foreground service " + intent);
            nLwwv8wzadD.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR(new gZVesoHrfMaGvAvfBsRIr(13, nLwwv8wzadD, intent.getStringExtra("KEY_WORKSPEC_ID")));
            nLwwv8wzadD.zzpBGItXfub0yWj(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            nLwwv8wzadD.zzpBGItXfub0yWj(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = nLwwv8wzadD.HzCpKshMOoaw76hFcbOVRYMeRd;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.ZfQNn8hdWlEQ5cR94249PDsLR = true;
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        kooPss93uoBTOWlOLlaD koopss93uobtowlollad = nLwwv8wzadD.V57tEvNfxZVVcOCAOih5PKr;
        UUID uuidFromString = UUID.fromString(stringExtra);
        koopss93uobtowlollad.getClass();
        ej6unYlOWMDF.pYmKDYlAmhudp(uuidFromString, "id");
        FG8LIxsgYiLSfhN0jYKIKr fG8LIxsgYiLSfhN0jYKIKr = koopss93uobtowlollad.GI83zq0G8e7zkn.q1wNbhk2O6;
        ki0ZWFpNS2MqGdb ki0zwfpns2mqgdb = (ki0ZWFpNS2MqGdb) koopss93uobtowlollad.HzCpKshMOoaw76hFcbOVRYMeRd.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(ki0zwfpns2mqgdb, "workManagerImpl.workTask…ecutor.serialTaskExecutor");
        zonOxHotd3BwAPJcwqr6I6uQNngg4.qygqjTppWwx992(fG8LIxsgYiLSfhN0jYKIKr, "CancelWorkById", ki0zwfpns2mqgdb, new OUBU6uEMdVy8Z(1, koopss93uobtowlollad, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.zIvmSL0wzmmKGc3X39b2Gw2mUGE(2048);
    }

    public final void zzpBGItXfub0yWj() {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = (NotificationManager) getApplicationContext().getSystemService("notification");
        NLwwv8wzadD nLwwv8wzadD = new NLwwv8wzadD(getApplicationContext());
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = nLwwv8wzadD;
        if (nLwwv8wzadD.HzCpKshMOoaw76hFcbOVRYMeRd != null) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr(NLwwv8wzadD.KUYypEB4eNWOZWVDpH, "A callback already exists.");
        } else {
            nLwwv8wzadD.HzCpKshMOoaw76hFcbOVRYMeRd = this;
        }
    }

    public final void onTimeout(int i, int i2) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2);
    }
}
