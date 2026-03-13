package com.vdodsodjsdt;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mMfUDmjShjTxhFzD4 implements Runnable {
    public final /* synthetic */ int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public /* synthetic */ mMfUDmjShjTxhFzD4(int i, int i2, Object obj, Object obj2) {
        this.V57tEvNfxZVVcOCAOih5PKr = i2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                npN16DNLGdVu2 npn16dnlgdvu2 = (npN16DNLGdVu2) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                Object obj = ((ZIqdBIWI9mxq4Xsi8) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).VxUQ9tBhpHJ2AAEDNW8sghc4m;
                String str = (String) npn16dnlgdvu2.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(Integer.valueOf(this.LaeGQIruHQu81hfJldjMOQSVblH3x));
                if (str != null) {
                    WlL3REfr7Vc wlL3REfr7Vc = (WlL3REfr7Vc) npn16dnlgdvu2.LaeGQIruHQu81hfJldjMOQSVblH3x.get(str);
                    if ((wlL3REfr7Vc != null ? wlL3REfr7Vc.VxUQ9tBhpHJ2AAEDNW8sghc4m : null) != null) {
                        gx6fD5VMu4 gx6fd5vmu4 = wlL3REfr7Vc.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        if (npn16dnlgdvu2.ZfQNn8hdWlEQ5cR94249PDsLR.remove(str)) {
                            gx6fd5vmu4.VxUQ9tBhpHJ2AAEDNW8sghc4m(obj);
                        }
                    } else {
                        npn16dnlgdvu2.ZLZeBXTMq0zDztBxtRTuCHrapQ.remove(str);
                        npn16dnlgdvu2.zIvmSL0wzmmKGc3X39b2Gw2mUGE.put(str, obj);
                    }
                    break;
                }
                break;
            case 1:
                ((npN16DNLGdVu2) this.ZfQNn8hdWlEQ5cR94249PDsLR).VxUQ9tBhpHJ2AAEDNW8sghc4m(this.LaeGQIruHQu81hfJldjMOQSVblH3x, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
                break;
            default:
                ((FwMWwFz9rk3DpCrLw) this.ZfQNn8hdWlEQ5cR94249PDsLR).zzpBGItXfub0yWj.LaeGQIruHQu81hfJldjMOQSVblH3x(this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                break;
        }
    }
}
