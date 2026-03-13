package com.vdodsodjsdt;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class mKyXpbfBTd6Xym7lvKzrk implements Ke30hT4A8wvbzFUrXgs4BPCTK41Rp {
    public static final nXHgNvFWAuvP7uJDDmI5 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final o0x3OWMw3He V57tEvNfxZVVcOCAOih5PKr;
    public final ConcurrentHashMap ZfQNn8hdWlEQ5cR94249PDsLR = new ConcurrentHashMap();

    static {
        int i = 0;
        LaeGQIruHQu81hfJldjMOQSVblH3x = new nXHgNvFWAuvP7uJDDmI5(i);
        new nXHgNvFWAuvP7uJDDmI5(i);
    }

    public mKyXpbfBTd6Xym7lvKzrk(o0x3OWMw3He o0x3owmw3he) {
        this.V57tEvNfxZVVcOCAOih5PKr = o0x3owmw3he;
    }

    @Override // com.vdodsodjsdt.Ke30hT4A8wvbzFUrXgs4BPCTK41Rp
    public final eAZzwKf05brkM VxUQ9tBhpHJ2AAEDNW8sghc4m(Tt3445ZYXN tt3445ZYXN, q898WQEbycPNMnuoo6 q898wqebycpnmnuoo6) {
        CTrglVy5q1jHKuent43hPOTbKFYgS cTrglVy5q1jHKuent43hPOTbKFYgS = (CTrglVy5q1jHKuent43hPOTbKFYgS) q898wqebycpnmnuoo6.VxUQ9tBhpHJ2AAEDNW8sghc4m.getAnnotation(CTrglVy5q1jHKuent43hPOTbKFYgS.class);
        if (cTrglVy5q1jHKuent43hPOTbKFYgS == null) {
            return null;
        }
        return zzpBGItXfub0yWj(this.V57tEvNfxZVVcOCAOih5PKr, tt3445ZYXN, q898wqebycpnmnuoo6, cTrglVy5q1jHKuent43hPOTbKFYgS, true);
    }

    public final eAZzwKf05brkM zzpBGItXfub0yWj(o0x3OWMw3He o0x3owmw3he, Tt3445ZYXN tt3445ZYXN, q898WQEbycPNMnuoo6 q898wqebycpnmnuoo6, CTrglVy5q1jHKuent43hPOTbKFYgS cTrglVy5q1jHKuent43hPOTbKFYgS, boolean z) {
        eAZzwKf05brkM eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m;
        Object objV57tEvNfxZVVcOCAOih5PKr = o0x3owmw3he.pYmKDYlAmhudp(new q898WQEbycPNMnuoo6(cTrglVy5q1jHKuent43hPOTbKFYgS.value()), true).V57tEvNfxZVVcOCAOih5PKr();
        boolean zNullSafe = cTrglVy5q1jHKuent43hPOTbKFYgS.nullSafe();
        if (objV57tEvNfxZVVcOCAOih5PKr instanceof eAZzwKf05brkM) {
            eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m = (eAZzwKf05brkM) objV57tEvNfxZVVcOCAOih5PKr;
        } else {
            if (!(objV57tEvNfxZVVcOCAOih5PKr instanceof Ke30hT4A8wvbzFUrXgs4BPCTK41Rp)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objV57tEvNfxZVVcOCAOih5PKr.getClass().getName() + " as a @JsonAdapter for " + hRrPPME7ytOB7ba.y1NaPKTl7R18DOr6e8i5(q898wqebycpnmnuoo6.zzpBGItXfub0yWj) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            Ke30hT4A8wvbzFUrXgs4BPCTK41Rp ke30hT4A8wvbzFUrXgs4BPCTK41Rp = (Ke30hT4A8wvbzFUrXgs4BPCTK41Rp) objV57tEvNfxZVVcOCAOih5PKr;
            if (z) {
                Ke30hT4A8wvbzFUrXgs4BPCTK41Rp ke30hT4A8wvbzFUrXgs4BPCTK41Rp2 = (Ke30hT4A8wvbzFUrXgs4BPCTK41Rp) this.ZfQNn8hdWlEQ5cR94249PDsLR.putIfAbsent(q898wqebycpnmnuoo6.VxUQ9tBhpHJ2AAEDNW8sghc4m, ke30hT4A8wvbzFUrXgs4BPCTK41Rp);
                if (ke30hT4A8wvbzFUrXgs4BPCTK41Rp2 != null) {
                    ke30hT4A8wvbzFUrXgs4BPCTK41Rp = ke30hT4A8wvbzFUrXgs4BPCTK41Rp2;
                }
            }
            eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m = ke30hT4A8wvbzFUrXgs4BPCTK41Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m(tt3445ZYXN, q898wqebycpnmnuoo6);
        }
        return (eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m == null || !zNullSafe) ? eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m : eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }
}
