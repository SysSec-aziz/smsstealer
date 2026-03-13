package com.vdodsodjsdt;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Ascu2Zs7kzyKFeFdmA extends IS7DVWqtgrLtXifZ0j304X {
    public final /* synthetic */ int ZLZeBXTMq0zDztBxtRTuCHrapQ;

    public Ascu2Zs7kzyKFeFdmA(int i, Class cls, int i2, int i3, int i4) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i4;
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = cls;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i3;
    }

    @Override // com.vdodsodjsdt.IS7DVWqtgrLtXifZ0j304X
    public final Object V57tEvNfxZVVcOCAOih5PKr(View view) {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                return Boolean.valueOf(Q55Zxcgh4evtHu7g7qq.V57tEvNfxZVVcOCAOih5PKr(view));
            case 1:
                return Q55Zxcgh4evtHu7g7qq.VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
            default:
                return Boolean.valueOf(Q55Zxcgh4evtHu7g7qq.zzpBGItXfub0yWj(view));
        }
    }

    @Override // com.vdodsodjsdt.IS7DVWqtgrLtXifZ0j304X
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(Object obj, Object obj2) {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }

    @Override // com.vdodsodjsdt.IS7DVWqtgrLtXifZ0j304X
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(View view, Object obj) {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                Q55Zxcgh4evtHu7g7qq.zIvmSL0wzmmKGc3X39b2Gw2mUGE(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                Q55Zxcgh4evtHu7g7qq.LaeGQIruHQu81hfJldjMOQSVblH3x(view, (CharSequence) obj);
                break;
            default:
                Q55Zxcgh4evtHu7g7qq.ZfQNn8hdWlEQ5cR94249PDsLR(view, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
