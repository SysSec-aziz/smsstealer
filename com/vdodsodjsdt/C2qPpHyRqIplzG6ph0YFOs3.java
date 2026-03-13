package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2qPpHyRqIplzG6ph0YFOs3 implements vkFu4GhdSMnWyhhpd2f {
    public final AtomicReference VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public C2qPpHyRqIplzG6ph0YFOs3(vkFu4GhdSMnWyhhpd2f vkfu4ghdsmnwyhhpd2f) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new AtomicReference(vkfu4ghdsmnwyhhpd2f);
    }

    @Override // com.vdodsodjsdt.vkFu4GhdSMnWyhhpd2f
    public final Iterator iterator() {
        vkFu4GhdSMnWyhhpd2f vkfu4ghdsmnwyhhpd2f = (vkFu4GhdSMnWyhhpd2f) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getAndSet(null);
        if (vkfu4ghdsmnwyhhpd2f != null) {
            return vkfu4ghdsmnwyhhpd2f.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
