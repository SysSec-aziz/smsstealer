package com.vdodsodjsdt;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class lWFWbhxVImQVcJF82BX8sTg extends LL6zXCXfmDYzdHCRTT implements w1TUuqPealEllpif2 {
    public final Handler LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final lWFWbhxVImQVcJF82BX8sTg ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public lWFWbhxVImQVcJF82BX8sTg(Handler handler, boolean z) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = handler;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = z;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = z ? this : new lWFWbhxVImQVcJF82BX8sTg(handler, true);
    }

    @Override // com.vdodsodjsdt.w1TUuqPealEllpif2
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(long j, YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW) {
        gZVesoHrfMaGvAvfBsRIr gzvesohrfmagvavfbsrir = new gZVesoHrfMaGvAvfBsRIr(yAf4BMDpiCAb4hYaN6VqW, this, 7, false);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x.postDelayed(gzvesohrfmagvavfbsrir, j)) {
            yAf4BMDpiCAb4hYaN6VqW.Irh5auREsoeV1C1RaBamlmy(new kBXIB8LLE5cCVkJ(0, this, gzvesohrfmagvavfbsrir));
        } else {
            vE4yDIjexsP2lGjLaTcB(yAf4BMDpiCAb4hYaN6VqW.ZLZeBXTMq0zDztBxtRTuCHrapQ, gzvesohrfmagvavfbsrir);
        }
    }

    @Override // com.vdodsodjsdt.LL6zXCXfmDYzdHCRTT
    public final void SuB3hEmTmbbRGAhtvOOmfKEon(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Runnable runnable) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x.post(runnable)) {
            return;
        }
        vE4yDIjexsP2lGjLaTcB(d73WsmU258PapcWZb45SFW, runnable);
    }

    @Override // com.vdodsodjsdt.LL6zXCXfmDYzdHCRTT
    public final boolean aXO0LSrt8bKV(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW) {
        return (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(Looper.myLooper(), this.LaeGQIruHQu81hfJldjMOQSVblH3x.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lWFWbhxVImQVcJF82BX8sTg)) {
            return false;
        }
        lWFWbhxVImQVcJF82BX8sTg lwfwbhxvimqvcjf82bx8stg = (lWFWbhxVImQVcJF82BX8sTg) obj;
        return lwfwbhxvimqvcjf82bx8stg.LaeGQIruHQu81hfJldjMOQSVblH3x == this.LaeGQIruHQu81hfJldjMOQSVblH3x && lwfwbhxvimqvcjf82bx8stg.zIvmSL0wzmmKGc3X39b2Gw2mUGE == this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public final int hashCode() {
        return System.identityHashCode(this.LaeGQIruHQu81hfJldjMOQSVblH3x) ^ (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE ? 1231 : 1237);
    }

    @Override // com.vdodsodjsdt.LL6zXCXfmDYzdHCRTT
    public final String toString() {
        lWFWbhxVImQVcJF82BX8sTg lwfwbhxvimqvcjf82bx8stg;
        String str;
        J5GsGzwx46 j5GsGzwx46 = wRXy41zFnpLczeVR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        lWFWbhxVImQVcJF82BX8sTg lwfwbhxvimqvcjf82bx8stg2 = JbkwNtAVpvKC1OOTs.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (this == lwfwbhxvimqvcjf82bx8stg2) {
            str = "Dispatchers.Main";
        } else {
            try {
                lwfwbhxvimqvcjf82bx8stg = lwfwbhxvimqvcjf82bx8stg2.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            } catch (UnsupportedOperationException unused) {
                lwfwbhxvimqvcjf82bx8stg = null;
            }
            str = this == lwfwbhxvimqvcjf82bx8stg ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.LaeGQIruHQu81hfJldjMOQSVblH3x.toString();
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE ? u9SlVAuoWhQUfJ.GI83zq0G8e7zkn(string, ".immediate") : string;
    }

    public final void vE4yDIjexsP2lGjLaTcB(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Runnable runnable) {
        hRrPPME7ytOB7ba.V57tEvNfxZVVcOCAOih5PKr(d73WsmU258PapcWZb45SFW, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        wRXy41zFnpLczeVR.zzpBGItXfub0yWj.SuB3hEmTmbbRGAhtvOOmfKEon(d73WsmU258PapcWZb45SFW, runnable);
    }
}
