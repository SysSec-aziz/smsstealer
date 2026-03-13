package com.vdodsodjsdt;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class QoDg49fVMc3IKdfO5UuOmvvyMJ implements Ke30hT4A8wvbzFUrXgs4BPCTK41Rp, Cloneable {
    public static final QoDg49fVMc3IKdfO5UuOmvvyMJ LaeGQIruHQu81hfJldjMOQSVblH3x = new QoDg49fVMc3IKdfO5UuOmvvyMJ();
    public final List V57tEvNfxZVVcOCAOih5PKr;
    public final List ZfQNn8hdWlEQ5cR94249PDsLR;

    public QoDg49fVMc3IKdfO5UuOmvvyMJ() {
        List list = Collections.EMPTY_LIST;
        this.V57tEvNfxZVVcOCAOih5PKr = list;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = list;
    }

    @Override // com.vdodsodjsdt.Ke30hT4A8wvbzFUrXgs4BPCTK41Rp
    public final eAZzwKf05brkM VxUQ9tBhpHJ2AAEDNW8sghc4m(Tt3445ZYXN tt3445ZYXN, q898WQEbycPNMnuoo6 q898wqebycpnmnuoo6) {
        Class cls = q898wqebycpnmnuoo6.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        boolean zZzpBGItXfub0yWj = zzpBGItXfub0yWj(cls, true);
        boolean zZzpBGItXfub0yWj2 = zzpBGItXfub0yWj(cls, false);
        if (zZzpBGItXfub0yWj || zZzpBGItXfub0yWj2) {
            return new Glk6g5cYJ08eEGVbNV(this, zZzpBGItXfub0yWj2, zZzpBGItXfub0yWj, tt3445ZYXN, q898wqebycpnmnuoo6);
        }
        return null;
    }

    public final Object clone() {
        try {
            return (QoDg49fVMc3IKdfO5UuOmvvyMJ) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean zzpBGItXfub0yWj(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            sGipz63rTUmSj3uFDvOtzihao sgipz63rtumsj3ufdvotzihao = vFOm9GRo9HOyt53449EwgsRLOaA1Y.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.V57tEvNfxZVVcOCAOih5PKr : this.ZfQNn8hdWlEQ5cR94249PDsLR).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}
