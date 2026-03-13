package com.vdodsodjsdt;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zYf3BBuL0DDx implements vkFu4GhdSMnWyhhpd2f {
    public final vkFu4GhdSMnWyhhpd2f VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int zzpBGItXfub0yWj;

    public zYf3BBuL0DDx(vkFu4GhdSMnWyhhpd2f vkfu4ghdsmnwyhhpd2f, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = vkfu4ghdsmnwyhhpd2f;
        this.zzpBGItXfub0yWj = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // com.vdodsodjsdt.vkFu4GhdSMnWyhhpd2f
    public final Iterator iterator() {
        return new b5p8GpwErDXqVGUollgu(this);
    }
}
