package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class qmcPqJNTxlBY implements D2N8rZ8PRRcNQ9RwMeZkr, GCTompM2Is, DRNSD7OTZrolKY4iK67pQWIr {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ BbqUXujjobWQwx4SY ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ qmcPqJNTxlBY(BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = bbqUXujjobWQwx4SY;
    }

    @Override // com.vdodsodjsdt.D2N8rZ8PRRcNQ9RwMeZkr
    public pmJH8rqWIwRth8COqq HzCpKshMOoaw76hFcbOVRYMeRd(View view, pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq) {
        int i;
        boolean z;
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqZzpBGItXfub0yWj;
        boolean z2;
        int iZfQNn8hdWlEQ5cR94249PDsLR = pmjh8rqwiwrth8coqq.ZfQNn8hdWlEQ5cR94249PDsLR();
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Context context = bbqUXujjobWQwx4SY.q1wNbhk2O6;
        int iZfQNn8hdWlEQ5cR94249PDsLR2 = pmjh8rqwiwrth8coqq.ZfQNn8hdWlEQ5cR94249PDsLR();
        ActionBarContextView actionBarContextView = bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i = 0;
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT.getLayoutParams();
            if (bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT.isShown()) {
                if (bbqUXujjobWQwx4SY.BJQHddi0Plr5ElWetCyaixWOg9 == null) {
                    bbqUXujjobWQwx4SY.BJQHddi0Plr5ElWetCyaixWOg9 = new Rect();
                    bbqUXujjobWQwx4SY.tFRdVJAePmTx77bP7FAN0uI = new Rect();
                }
                Rect rect = bbqUXujjobWQwx4SY.BJQHddi0Plr5ElWetCyaixWOg9;
                Rect rect2 = bbqUXujjobWQwx4SY.tFRdVJAePmTx77bP7FAN0uI;
                rect.set(pmjh8rqwiwrth8coqq.zzpBGItXfub0yWj(), pmjh8rqwiwrth8coqq.ZfQNn8hdWlEQ5cR94249PDsLR(), pmjh8rqwiwrth8coqq.V57tEvNfxZVVcOCAOih5PKr(), pmjh8rqwiwrth8coqq.VxUQ9tBhpHJ2AAEDNW8sghc4m());
                ViewGroup viewGroup = bbqUXujjobWQwx4SY.aXO0LSrt8bKV;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z3 = TbV4rkOPds9wwfLx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    lnKQ0zTSouNqbwgW68RAU.VxUQ9tBhpHJ2AAEDNW8sghc4m(viewGroup, rect, rect2);
                } else {
                    if (!TbV4rkOPds9wwfLx.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                        TbV4rkOPds9wwfLx.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            TbV4rkOPds9wwfLx.zzpBGItXfub0yWj = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                TbV4rkOPds9wwfLx.zzpBGItXfub0yWj.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = TbV4rkOPds9wwfLx.zzpBGItXfub0yWj;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                ViewGroup viewGroup2 = bbqUXujjobWQwx4SY.aXO0LSrt8bKV;
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m = rNOK825VfWyyIg17blujknX8.VxUQ9tBhpHJ2AAEDNW8sghc4m(viewGroup2);
                int iZzpBGItXfub0yWj = pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m == null ? 0 : pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj();
                int iV57tEvNfxZVVcOCAOih5PKr = pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m == null ? 0 : pmjh8rqwiwrth8coqqVxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || bbqUXujjobWQwx4SY.O1xDAlBZZlZdoEf747lCFHld != null) {
                    View view2 = bbqUXujjobWQwx4SY.O1xDAlBZZlZdoEf747lCFHld;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iZzpBGItXfub0yWj || marginLayoutParams2.rightMargin != iV57tEvNfxZVVcOCAOih5PKr) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iZzpBGItXfub0yWj;
                            marginLayoutParams2.rightMargin = iV57tEvNfxZVVcOCAOih5PKr;
                            bbqUXujjobWQwx4SY.O1xDAlBZZlZdoEf747lCFHld.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    bbqUXujjobWQwx4SY.O1xDAlBZZlZdoEf747lCFHld = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iZzpBGItXfub0yWj;
                    layoutParams.rightMargin = iV57tEvNfxZVVcOCAOih5PKr;
                    bbqUXujjobWQwx4SY.aXO0LSrt8bKV.addView(bbqUXujjobWQwx4SY.O1xDAlBZZlZdoEf747lCFHld, -1, layoutParams);
                }
                View view4 = bbqUXujjobWQwx4SY.O1xDAlBZZlZdoEf747lCFHld;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = bbqUXujjobWQwx4SY.O1xDAlBZZlZdoEf747lCFHld;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!bbqUXujjobWQwx4SY.TqcnImqkSWIKht && z) {
                    iZfQNn8hdWlEQ5cR94249PDsLR2 = 0;
                }
                z = z;
                i = 0;
                z = z2;
            } else {
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    z = false;
                }
            }
            if (z) {
                bbqUXujjobWQwx4SY.q11o1hieEkZDhF1MGOZI26oZiDT.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = bbqUXujjobWQwx4SY.O1xDAlBZZlZdoEf747lCFHld;
        if (view6 != null) {
            view6.setVisibility(z ? i : 8);
        }
        if (iZfQNn8hdWlEQ5cR94249PDsLR != iZfQNn8hdWlEQ5cR94249PDsLR2) {
            int iZzpBGItXfub0yWj2 = pmjh8rqwiwrth8coqq.zzpBGItXfub0yWj();
            int iV57tEvNfxZVVcOCAOih5PKr2 = pmjh8rqwiwrth8coqq.V57tEvNfxZVVcOCAOih5PKr();
            int iVxUQ9tBhpHJ2AAEDNW8sghc4m = pmjh8rqwiwrth8coqq.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            int i7 = Build.VERSION.SDK_INT;
            LVSdrptRp9 fq3Bs0prQtLat6 = i7 >= 34 ? new Fq3Bs0prQtLat6(pmjh8rqwiwrth8coqq) : i7 >= 31 ? new fi6bazFdEnPBJ(pmjh8rqwiwrth8coqq) : i7 >= 30 ? new pJLDv0icdTgj6BPWve3wUpnLp(pmjh8rqwiwrth8coqq) : i7 >= 29 ? new p57FoMnk3HKM7uLVmLF1zeLl(pmjh8rqwiwrth8coqq) : new NsOvxcOeb6vgXelqa7wP4(pmjh8rqwiwrth8coqq);
            fq3Bs0prQtLat6.ZLZeBXTMq0zDztBxtRTuCHrapQ(MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(iZzpBGItXfub0yWj2, iZfQNn8hdWlEQ5cR94249PDsLR2, iV57tEvNfxZVVcOCAOih5PKr2, iVxUQ9tBhpHJ2AAEDNW8sghc4m));
            pmjh8rqwiwrth8coqqZzpBGItXfub0yWj = fq3Bs0prQtLat6.zzpBGItXfub0yWj();
        } else {
            pmjh8rqwiwrth8coqqZzpBGItXfub0yWj = pmjh8rqwiwrth8coqq;
        }
        WeakHashMap weakHashMap2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        WindowInsets windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE = pmjh8rqwiwrth8coqqZzpBGItXfub0yWj.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        if (windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
            return pmjh8rqwiwrth8coqqZzpBGItXfub0yWj;
        }
        WindowInsets windowInsetsZzpBGItXfub0yWj = UFStPSj5DrcqcfR2RymfmG.zzpBGItXfub0yWj(view, windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE);
        return !windowInsetsZzpBGItXfub0yWj.equals(windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE) ? pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, windowInsetsZzpBGItXfub0yWj) : pmjh8rqwiwrth8coqqZzpBGItXfub0yWj;
    }

    @Override // com.vdodsodjsdt.DRNSD7OTZrolKY4iK67pQWIr
    public boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        Window.Callback callback;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                Window.Callback callback2 = this.ZfQNn8hdWlEQ5cR94249PDsLR.p59rPv72J9.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, stuu2Qyz6BSCKFEomt5b51vUnV1HQ);
                }
                break;
            default:
                if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ == stuu2Qyz6BSCKFEomt5b51vUnV1HQ.HzCpKshMOoaw76hFcbOVRYMeRd()) {
                    BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    if (bbqUXujjobWQwx4SY.qygqjTppWwx992 && (callback = bbqUXujjobWQwx4SY.p59rPv72J9.getCallback()) != null && !bbqUXujjobWQwx4SY.JUdwvN8LfOMa) {
                        callback.onMenuOpened(108, stuu2Qyz6BSCKFEomt5b51vUnV1HQ);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // com.vdodsodjsdt.DRNSD7OTZrolKY4iK67pQWIr
    public void zzpBGItXfub0yWj(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, boolean z) {
        Wi6Xv9fVcEv2ynXTQIkU wi6Xv9fVcEv2ynXTQIkU;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.pYmKDYlAmhudp(stuu2Qyz6BSCKFEomt5b51vUnV1HQ);
                break;
            default:
                Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQHzCpKshMOoaw76hFcbOVRYMeRd = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.HzCpKshMOoaw76hFcbOVRYMeRd();
                int i = 0;
                boolean z2 = stuu2Qyz6BSCKFEomt5b51vUnV1HQHzCpKshMOoaw76hFcbOVRYMeRd != stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
                if (z2) {
                    stuu2Qyz6BSCKFEomt5b51vUnV1HQ = stuu2Qyz6BSCKFEomt5b51vUnV1HQHzCpKshMOoaw76hFcbOVRYMeRd;
                }
                BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                Wi6Xv9fVcEv2ynXTQIkU[] wi6Xv9fVcEv2ynXTQIkUArr = bbqUXujjobWQwx4SY.YdNRGRc4rly;
                int length = wi6Xv9fVcEv2ynXTQIkUArr != null ? wi6Xv9fVcEv2ynXTQIkUArr.length : 0;
                while (true) {
                    if (i >= length) {
                        wi6Xv9fVcEv2ynXTQIkU = null;
                    } else {
                        wi6Xv9fVcEv2ynXTQIkU = wi6Xv9fVcEv2ynXTQIkUArr[i];
                        if (wi6Xv9fVcEv2ynXTQIkU == null || wi6Xv9fVcEv2ynXTQIkU.NSjgqmGjEzuugn2SsG1mZFP != stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
                            i++;
                        }
                    }
                }
                if (wi6Xv9fVcEv2ynXTQIkU != null) {
                    if (!z2) {
                        bbqUXujjobWQwx4SY.ko09zE6UAgwkV(wi6Xv9fVcEv2ynXTQIkU, z);
                    } else {
                        bbqUXujjobWQwx4SY.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(wi6Xv9fVcEv2ynXTQIkU.VxUQ9tBhpHJ2AAEDNW8sghc4m, wi6Xv9fVcEv2ynXTQIkU, stuu2Qyz6BSCKFEomt5b51vUnV1HQHzCpKshMOoaw76hFcbOVRYMeRd);
                        bbqUXujjobWQwx4SY.ko09zE6UAgwkV(wi6Xv9fVcEv2ynXTQIkU, true);
                    }
                }
                break;
        }
    }
}
