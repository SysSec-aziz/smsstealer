package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class QW59YEFNB5tWX9c7WYp extends I7XxpUEW0N {
    public final /* synthetic */ NrjuzzioPqfttNRptBDpZDzSYUrcM V57tEvNfxZVVcOCAOih5PKr;

    public QW59YEFNB5tWX9c7WYp(NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM) {
        this.V57tEvNfxZVVcOCAOih5PKr = nrjuzzioPqfttNRptBDpZDzSYUrcM;
    }

    @Override // com.vdodsodjsdt.I7XxpUEW0N
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return ((Matcher) this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj).groupCount() + 1;
    }

    @Override // com.vdodsodjsdt.I7XxpUEW0N, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof lkIZZ3qLf0vosCrRGDmqT3HUB24f) {
            return super.contains((lkIZZ3qLf0vosCrRGDmqT3HUB24f) obj);
        }
        return false;
    }

    @Override // com.vdodsodjsdt.I7XxpUEW0N, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new wuozGDdFQbclf3NoOJ1I(new kVCYLXlG6ES6f(2, new t95KFNzc2QFE(1, this), new YGu77UzqV7U(0, new stS3uecPKs3MU4EfeT(0, VxUQ9tBhpHJ2AAEDNW8sghc4m() - 1, 1))));
    }

    public final lkIZZ3qLf0vosCrRGDmqT3HUB24f zzpBGItXfub0yWj(int i) {
        Matcher matcher = (Matcher) this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj;
        stS3uecPKs3MU4EfeT sts3uecpks3mu4efetBJQHddi0Plr5ElWetCyaixWOg9 = F44whnLsbQ.BJQHddi0Plr5ElWetCyaixWOg9(matcher.start(i), matcher.end(i));
        if (sts3uecpks3mu4efetBJQHddi0Plr5ElWetCyaixWOg9.V57tEvNfxZVVcOCAOih5PKr < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strGroup, "group(...)");
        return new lkIZZ3qLf0vosCrRGDmqT3HUB24f(strGroup, sts3uecpks3mu4efetBJQHddi0Plr5ElWetCyaixWOg9);
    }
}
