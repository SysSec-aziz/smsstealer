package com.vdodsodjsdt;

import android.os.Build;
import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zXkol0DfAkAHQvPm4Oq extends iR5xCBIVvX5dAZmnw05F0Cv implements vP57smEEh3YGCxzJ {
    public final /* synthetic */ boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ miZQAIwqUtukbpjcHsFxaDq57gE ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final /* synthetic */ E4DUcuxizcAv5WKy5qZ7sw ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ String zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zXkol0DfAkAHQvPm4Oq(E4DUcuxizcAv5WKy5qZ7sw e4DUcuxizcAv5WKy5qZ7sw, boolean z, String str, miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57ge) {
        super(1);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = e4DUcuxizcAv5WKy5qZ7sw;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = z;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = str;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = mizqaiwqutukbpjchsfxadq57ge;
    }

    @Override // com.vdodsodjsdt.vP57smEEh3YGCxzJ
    public final Object GI83zq0G8e7zkn(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if (th instanceof cMGD2iotsUUez1oRroMIB) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr.compareAndSet(-256, ((cMGD2iotsUUez1oRroMIB) th).V57tEvNfxZVVcOCAOih5PKr);
        }
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x && (str = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) != null) {
            miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57ge = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            FG8LIxsgYiLSfhN0jYKIKr fG8LIxsgYiLSfhN0jYKIKr = mizqaiwqutukbpjchsfxadq57ge.LaeGQIruHQu81hfJldjMOQSVblH3x.q1wNbhk2O6;
            int iHashCode = mizqaiwqutukbpjchsfxadq57ge.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode();
            fG8LIxsgYiLSfhN0jYKIKr.getClass();
            if (Build.VERSION.SDK_INT >= 29) {
                mmgMCzcirsQFJfg2qYVvddWgELh.zzpBGItXfub0yWj(hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG(str), iHashCode);
            } else {
                String strHVEwbdULInpTNa0IG = hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG(str);
                try {
                    if (hRrPPME7ytOB7ba.w0Wu95l8dVNw5rZMRu == null) {
                        hRrPPME7ytOB7ba.w0Wu95l8dVNw5rZMRu = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                    }
                    hRrPPME7ytOB7ba.w0Wu95l8dVNw5rZMRu.invoke(null, Long.valueOf(hRrPPME7ytOB7ba.TaDO7ogis3aEiWEtq), strHVEwbdULInpTNa0IG, Integer.valueOf(iHashCode));
                } catch (Exception e) {
                    hRrPPME7ytOB7ba.h3jnZRsdwYJfY9UhQCkbvWciwvFHv("asyncTraceEnd", e);
                }
            }
        }
        return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }
}
