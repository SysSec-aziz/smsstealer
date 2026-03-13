package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class blnUVhHW6WEth0ssGV8jUpl3oqU0 {
    public WiLYxtz85JCnc GI83zq0G8e7zkn;
    public View LaeGQIruHQu81hfJldjMOQSVblH3x;
    public PopupWindow.OnDismissListener M9e7PWhFYLD2lOGMker;
    public DRNSD7OTZrolKY4iK67pQWIr NSjgqmGjEzuugn2SsG1mZFP;
    public final boolean V57tEvNfxZVVcOCAOih5PKr;
    public final Context VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Stuu2Qyz6BSCKFEomt5b51vUnV1HQ zzpBGItXfub0yWj;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE = 8388611;
    public final ggYaZxP7TN HzCpKshMOoaw76hFcbOVRYMeRd = new ggYaZxP7TN(this);

    public blnUVhHW6WEth0ssGV8jUpl3oqU0(Context context, Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, View view, boolean z, int i, int i2) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = context;
        this.zzpBGItXfub0yWj = stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = view;
        this.V57tEvNfxZVVcOCAOih5PKr = z;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
    }

    public void V57tEvNfxZVVcOCAOih5PKr() {
        this.GI83zq0G8e7zkn = null;
        PopupWindow.OnDismissListener onDismissListener = this.M9e7PWhFYLD2lOGMker;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final WiLYxtz85JCnc VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        WiLYxtz85JCnc p7F708JA9fT7wZdjaAX8x;
        if (this.GI83zq0G8e7zkn == null) {
            Context context = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                p7F708JA9fT7wZdjaAX8x = new lHLqDPOuDPv9Tah5rl1MDkuq12(context, this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.ZfQNn8hdWlEQ5cR94249PDsLR, this.V57tEvNfxZVVcOCAOih5PKr);
            } else {
                p7F708JA9fT7wZdjaAX8x = new P7F708JA9fT7wZdjaAX8x(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj, this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.ZfQNn8hdWlEQ5cR94249PDsLR, this.V57tEvNfxZVVcOCAOih5PKr);
            }
            p7F708JA9fT7wZdjaAX8x.KUYypEB4eNWOZWVDpH(this.zzpBGItXfub0yWj);
            p7F708JA9fT7wZdjaAX8x.ko09zE6UAgwkV(this.HzCpKshMOoaw76hFcbOVRYMeRd);
            p7F708JA9fT7wZdjaAX8x.p59rPv72J9(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
            p7F708JA9fT7wZdjaAX8x.HzCpKshMOoaw76hFcbOVRYMeRd(this.NSjgqmGjEzuugn2SsG1mZFP);
            p7F708JA9fT7wZdjaAX8x.Ca81ebIan1u(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
            p7F708JA9fT7wZdjaAX8x.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
            this.GI83zq0G8e7zkn = p7F708JA9fT7wZdjaAX8x;
        }
        return this.GI83zq0G8e7zkn;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(int i, int i2, boolean z, boolean z2) {
        WiLYxtz85JCnc wiLYxtz85JCncVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m();
        wiLYxtz85JCncVxUQ9tBhpHJ2AAEDNW8sghc4m.jW7EiD0YL6xkbB158jMUzhWNWb1y(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.LaeGQIruHQu81hfJldjMOQSVblH3x.getLayoutDirection()) & 7) == 5) {
                i -= this.LaeGQIruHQu81hfJldjMOQSVblH3x.getWidth();
            }
            wiLYxtz85JCncVxUQ9tBhpHJ2AAEDNW8sghc4m.pYmKDYlAmhudp(i);
            wiLYxtz85JCncVxUQ9tBhpHJ2AAEDNW8sghc4m.f6ZQsR6bPLvvCDNXOUc(i2);
            int i3 = (int) ((this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            wiLYxtz85JCncVxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        wiLYxtz85JCncVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public final boolean zzpBGItXfub0yWj() {
        WiLYxtz85JCnc wiLYxtz85JCnc = this.GI83zq0G8e7zkn;
        return wiLYxtz85JCnc != null && wiLYxtz85JCnc.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }
}
