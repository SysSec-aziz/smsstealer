package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class pprWOkBDEQ5eVufdLCrXUe1 implements Ke30hT4A8wvbzFUrXgs4BPCTK41Rp {
    public final /* synthetic */ eAZzwKf05brkM LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Class ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ pprWOkBDEQ5eVufdLCrXUe1(Class cls, eAZzwKf05brkM eazzwkf05brkm, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = cls;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = eazzwkf05brkm;
    }

    @Override // com.vdodsodjsdt.Ke30hT4A8wvbzFUrXgs4BPCTK41Rp
    public final eAZzwKf05brkM VxUQ9tBhpHJ2AAEDNW8sghc4m(Tt3445ZYXN tt3445ZYXN, q898WQEbycPNMnuoo6 q898wqebycpnmnuoo6) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                if (q898wqebycpnmnuoo6.VxUQ9tBhpHJ2AAEDNW8sghc4m == this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                    return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                }
                return null;
            default:
                Class<?> cls = q898wqebycpnmnuoo6.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (this.ZfQNn8hdWlEQ5cR94249PDsLR.isAssignableFrom(cls)) {
                    return new JBVNBY1qVYqvFW4L5ffi(this, cls);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                return "Factory[type=" + this.ZfQNn8hdWlEQ5cR94249PDsLR.getName() + ",adapter=" + this.LaeGQIruHQu81hfJldjMOQSVblH3x + "]";
            default:
                return "Factory[typeHierarchy=" + this.ZfQNn8hdWlEQ5cR94249PDsLR.getName() + ",adapter=" + this.LaeGQIruHQu81hfJldjMOQSVblH3x + "]";
        }
    }
}
