package com.vdodsodjsdt;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class tyZQa3HN4Bho91H {
    public final /* synthetic */ eAZzwKf05brkM LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ boolean NSjgqmGjEzuugn2SsG1mZFP;
    public final String V57tEvNfxZVVcOCAOih5PKr;
    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final /* synthetic */ Method ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ eAZzwKf05brkM zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final Field zzpBGItXfub0yWj;

    public tyZQa3HN4Bho91H(String str, Field field, Method method, eAZzwKf05brkM eazzwkf05brkm, eAZzwKf05brkM eazzwkf05brkm2, boolean z, boolean z2) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = method;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = eazzwkf05brkm;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = eazzwkf05brkm2;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = z;
        this.NSjgqmGjEzuugn2SsG1mZFP = z2;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = field;
        this.V57tEvNfxZVVcOCAOih5PKr = field.getName();
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("Accessor ", vFOm9GRo9HOyt53449EwgsRLOaA1Y.ZfQNn8hdWlEQ5cR94249PDsLR(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = this.zzpBGItXfub0yWj.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        tvklqdievloorf1qymtyventzi.RhfGHxtXxy0M0grmp2jkRjQg(this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr(tvklqdievloorf1qymtyventzi, objInvoke);
    }
}
