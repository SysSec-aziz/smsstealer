package com.vdodsodjsdt;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class MAyerWsKHN extends O510kkNvCgHHMXIbKz1NqEFfrmj implements Ih2RkfswCyHapPVuA {
    public static final boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Context V57tEvNfxZVVcOCAOih5PKr;
    public final ArrayList ZfQNn8hdWlEQ5cR94249PDsLR;

    static {
        LaeGQIruHQu81hfJldjMOQSVblH3x = Build.VERSION.SDK_INT >= 29;
    }

    public MAyerWsKHN() {
        int i = 0;
        ArrayList arrayListVOvSEdhaZyc0oOGQ8 = vmp19D2MODlOL.VOvSEdhaZyc0oOGQ8(new RSSn7Y5tk2UmJ[]{Build.VERSION.SDK_INT >= 29 ? new kal4xJfPKIlh8G5H109B7a18Hkv() : null, new tqfjXCKgSJLsYSEAirW(RYrcWqAmRWNPbPL1pDGl1X.LaeGQIruHQu81hfJldjMOQSVblH3x), new tqfjXCKgSJLsYSEAirW(KWHoWVRZNG.VxUQ9tBhpHJ2AAEDNW8sghc4m), new tqfjXCKgSJLsYSEAirW(uJFrNRCSV6rHsO.VxUQ9tBhpHJ2AAEDNW8sghc4m)});
        ArrayList arrayList = new ArrayList();
        int size = arrayListVOvSEdhaZyc0oOGQ8.size();
        while (i < size) {
            Object obj = arrayListVOvSEdhaZyc0oOGQ8.get(i);
            i++;
            if (((RSSn7Y5tk2UmJ) obj).V57tEvNfxZVVcOCAOih5PKr()) {
                arrayList.add(obj);
            }
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = arrayList;
    }

    @Override // com.vdodsodjsdt.O510kkNvCgHHMXIbKz1NqEFfrmj
    public final boolean GI83zq0G8e7zkn(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // com.vdodsodjsdt.O510kkNvCgHHMXIbKz1NqEFfrmj
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(Object obj, String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.HzCpKshMOoaw76hFcbOVRYMeRd(obj, str);
        } else {
            ej6unYlOWMDF.Ca81ebIan1u(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            X0A7raLNhpDiM5P5rp83bU.HzCpKshMOoaw76hFcbOVRYMeRd(obj).warnIfOpen();
        }
    }

    @Override // com.vdodsodjsdt.O510kkNvCgHHMXIbKz1NqEFfrmj
    public final SSLContext KUYypEB4eNWOZWVDpH() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.KUYypEB4eNWOZWVDpH();
    }

    @Override // com.vdodsodjsdt.O510kkNvCgHHMXIbKz1NqEFfrmj
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "protocols");
        ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((RSSn7Y5tk2UmJ) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m(sSLSocket)) {
                break;
            }
        }
        RSSn7Y5tk2UmJ rSSn7Y5tk2UmJ = (RSSn7Y5tk2UmJ) obj;
        if (rSSn7Y5tk2UmJ != null) {
            rSSn7Y5tk2UmJ.ZfQNn8hdWlEQ5cR94249PDsLR(sSLSocket, str, list);
        }
    }

    @Override // com.vdodsodjsdt.O510kkNvCgHHMXIbKz1NqEFfrmj
    public final Object NSjgqmGjEzuugn2SsG1mZFP() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.NSjgqmGjEzuugn2SsG1mZFP();
        }
        CloseGuard closeGuardM9e7PWhFYLD2lOGMker = X0A7raLNhpDiM5P5rp83bU.M9e7PWhFYLD2lOGMker();
        closeGuardM9e7PWhFYLD2lOGMker.open("response.body().close()");
        return closeGuardM9e7PWhFYLD2lOGMker;
    }

    @Override // com.vdodsodjsdt.O510kkNvCgHHMXIbKz1NqEFfrmj
    public final sGipz63rTUmSj3uFDvOtzihao V57tEvNfxZVVcOCAOih5PKr(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        AirzLF6kxtqpnz airzLF6kxtqpnz = x509TrustManagerExtensions != null ? new AirzLF6kxtqpnz(x509TrustManager, x509TrustManagerExtensions) : null;
        return airzLF6kxtqpnz != null ? airzLF6kxtqpnz : new qcEvUO8Wqq56fJ6Kudx5FC(ZfQNn8hdWlEQ5cR94249PDsLR(x509TrustManager));
    }

    @Override // com.vdodsodjsdt.Ih2RkfswCyHapPVuA
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context) {
        this.V57tEvNfxZVVcOCAOih5PKr = context;
    }

    @Override // com.vdodsodjsdt.O510kkNvCgHHMXIbKz1NqEFfrmj
    public final String ZLZeBXTMq0zDztBxtRTuCHrapQ(SSLSocket sSLSocket) {
        Object obj;
        ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            i++;
            if (((RSSn7Y5tk2UmJ) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m(sSLSocket)) {
                break;
            }
        }
        RSSn7Y5tk2UmJ rSSn7Y5tk2UmJ = (RSSn7Y5tk2UmJ) obj;
        if (rSSn7Y5tk2UmJ != null) {
            return rSSn7Y5tk2UmJ.zzpBGItXfub0yWj(sSLSocket);
        }
        return null;
    }

    @Override // com.vdodsodjsdt.O510kkNvCgHHMXIbKz1NqEFfrmj
    public final jp0UKjTOIOtU ZfQNn8hdWlEQ5cR94249PDsLR(X509TrustManager x509TrustManager) {
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.ZfQNn8hdWlEQ5cR94249PDsLR(x509TrustManager);
    }

    @Override // com.vdodsodjsdt.Ih2RkfswCyHapPVuA
    public final Context zzpBGItXfub0yWj() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }
}
