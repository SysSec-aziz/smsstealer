package com.vdodsodjsdt;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class vYsD6Gl1lGeyLILI implements Ke30hT4A8wvbzFUrXgs4BPCTK41Rp {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final o0x3OWMw3He ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ vYsD6Gl1lGeyLILI(o0x3OWMw3He o0x3owmw3he, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = o0x3owmw3he;
    }

    @Override // com.vdodsodjsdt.Ke30hT4A8wvbzFUrXgs4BPCTK41Rp
    public final eAZzwKf05brkM VxUQ9tBhpHJ2AAEDNW8sghc4m(Tt3445ZYXN tt3445ZYXN, q898WQEbycPNMnuoo6 q898wqebycpnmnuoo6) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        o0x3OWMw3He o0x3owmw3he = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = q898wqebycpnmnuoo6.zzpBGItXfub0yWj;
                Class cls2 = q898wqebycpnmnuoo6.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type typeP59rPv72J9 = hRrPPME7ytOB7ba.p59rPv72J9(type, cls2, Collection.class);
                cls = typeP59rPv72J9 instanceof ParameterizedType ? ((ParameterizedType) typeP59rPv72J9).getActualTypeArguments()[0] : Object.class;
                return new JBVNBY1qVYqvFW4L5ffi(new MoUwZm6CDldGf35(tt3445ZYXN, tt3445ZYXN.V57tEvNfxZVVcOCAOih5PKr(new q898WQEbycPNMnuoo6(cls)), cls), o0x3owmw3he.pYmKDYlAmhudp(q898wqebycpnmnuoo6, false));
            default:
                Type type2 = q898wqebycpnmnuoo6.zzpBGItXfub0yWj;
                Class cls3 = q898wqebycpnmnuoo6.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type typeP59rPv72J92 = hRrPPME7ytOB7ba.p59rPv72J9(type2, cls3, Map.class);
                    actualTypeArguments = typeP59rPv72J92 instanceof ParameterizedType ? ((ParameterizedType) typeP59rPv72J92).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new MoUwZm6CDldGf35(this, new MoUwZm6CDldGf35(tt3445ZYXN, (type3 == Boolean.TYPE || type3 == Boolean.class) ? QGHnBQqmHmq3G29u1seH.V57tEvNfxZVVcOCAOih5PKr : tt3445ZYXN.V57tEvNfxZVVcOCAOih5PKr(new q898WQEbycPNMnuoo6(type3)), type3), new MoUwZm6CDldGf35(tt3445ZYXN, tt3445ZYXN.V57tEvNfxZVVcOCAOih5PKr(new q898WQEbycPNMnuoo6(type4)), type4), o0x3owmw3he.pYmKDYlAmhudp(q898wqebycpnmnuoo6, false));
        }
    }
}
