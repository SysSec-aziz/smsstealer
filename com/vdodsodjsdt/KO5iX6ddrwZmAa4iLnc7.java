package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class KO5iX6ddrwZmAa4iLnc7 {
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public xI49lv6n0OP7vk zzpBGItXfub0yWj;

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(xI49lv6n0OP7vk xi49lv6n0op7vk) {
        synchronized (this) {
            while (this.V57tEvNfxZVVcOCAOih5PKr) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.zzpBGItXfub0yWj == xi49lv6n0op7vk) {
                return;
            }
            this.zzpBGItXfub0yWj = xi49lv6n0op7vk;
            if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                xi49lv6n0op7vk.onCancel();
            }
        }
    }
}
