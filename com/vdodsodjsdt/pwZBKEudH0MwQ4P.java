package com.vdodsodjsdt;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pwZBKEudH0MwQ4P {
    public final FF8k5suM5gFqMXgYVyRy5ASJmO V57tEvNfxZVVcOCAOih5PKr;
    public final WorkDatabase VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final AtomicBoolean zzpBGItXfub0yWj;

    public pwZBKEudH0MwQ4P(WorkDatabase workDatabase) {
        ej6unYlOWMDF.pYmKDYlAmhudp(workDatabase, "database");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = workDatabase;
        this.zzpBGItXfub0yWj = new AtomicBoolean(false);
        this.V57tEvNfxZVVcOCAOih5PKr = new FF8k5suM5gFqMXgYVyRy5ASJmO(new F2fKrE33wuRBc(5, this));
    }

    public abstract String V57tEvNfxZVVcOCAOih5PKr();

    public final cGYUoKJ5QrSVTXdZE1f88VdPb3 VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return this.zzpBGItXfub0yWj.compareAndSet(false, true) ? (cGYUoKJ5QrSVTXdZE1f88VdPb3) this.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m() : zzpBGItXfub0yWj();
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(cGYUoKJ5QrSVTXdZE1f88VdPb3 cgyuokj5qrsvtxdze1f88vdpb3) {
        ej6unYlOWMDF.pYmKDYlAmhudp(cgyuokj5qrsvtxdze1f88vdpb3, "statement");
        if (cgyuokj5qrsvtxdze1f88vdpb3 == ((cGYUoKJ5QrSVTXdZE1f88VdPb3) this.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m())) {
            this.zzpBGItXfub0yWj.set(false);
        }
    }

    public final cGYUoKJ5QrSVTXdZE1f88VdPb3 zzpBGItXfub0yWj() {
        String strV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr();
        WorkDatabase workDatabase = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        workDatabase.getClass();
        workDatabase.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        workDatabase.zzpBGItXfub0yWj();
        return workDatabase.NSjgqmGjEzuugn2SsG1mZFP().w0Wu95l8dVNw5rZMRu().LaeGQIruHQu81hfJldjMOQSVblH3x(strV57tEvNfxZVVcOCAOih5PKr);
    }
}
