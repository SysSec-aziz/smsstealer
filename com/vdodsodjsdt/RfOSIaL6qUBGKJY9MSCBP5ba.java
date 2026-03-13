package com.vdodsodjsdt;

import android.database.Cursor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class RfOSIaL6qUBGKJY9MSCBP5ba implements Runnable {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ RfOSIaL6qUBGKJY9MSCBP5ba(int i, Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    private final void zzpBGItXfub0yWj() {
        eb3lIx1g1S4TGeJI46hOG7Bd eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj;
        long jNanoTime;
        eb3lIx1g1S4TGeJI46hOG7Bd eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj2;
        j5jyRGaw4k j5jyrgaw4k = (j5jyRGaw4k) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        synchronized (j5jyrgaw4k) {
            j5jyrgaw4k.ZLZeBXTMq0zDztBxtRTuCHrapQ++;
            eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj = j5jyrgaw4k.zzpBGItXfub0yWj();
        }
        if (eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj == null) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        while (true) {
            try {
                threadCurrentThread.setName(eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                Logger logger = ((j5jyRGaw4k) this.ZfQNn8hdWlEQ5cR94249PDsLR).zzpBGItXfub0yWj;
                MpsgFCfSVNxgvcBlEbc8Iuyh3Obq mpsgFCfSVNxgvcBlEbc8Iuyh3Obq = eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr;
                ej6unYlOWMDF.p59rPv72J9(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq);
                boolean zIsLoggable = logger.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = System.nanoTime();
                    ej6unYlOWMDF.zIvmSL0wzmmKGc3X39b2Gw2mUGE(logger, eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj, mpsgFCfSVNxgvcBlEbc8Iuyh3Obq, "starting");
                } else {
                    jNanoTime = -1;
                }
                try {
                    long jVxUQ9tBhpHJ2AAEDNW8sghc4m = eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    if (zIsLoggable) {
                        ej6unYlOWMDF.zIvmSL0wzmmKGc3X39b2Gw2mUGE(logger, eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj, mpsgFCfSVNxgvcBlEbc8Iuyh3Obq, "finished run in " + ej6unYlOWMDF.q11o1hieEkZDhF1MGOZI26oZiDT(System.nanoTime() - jNanoTime));
                    }
                    j5jyRGaw4k j5jyrgaw4k2 = (j5jyRGaw4k) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    synchronized (j5jyrgaw4k2) {
                        j5jyRGaw4k.VxUQ9tBhpHJ2AAEDNW8sghc4m(j5jyrgaw4k2, eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj, jVxUQ9tBhpHJ2AAEDNW8sghc4m, true);
                        eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj2 = j5jyrgaw4k2.zzpBGItXfub0yWj();
                    }
                    if (eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj2 == null) {
                        threadCurrentThread.setName(name);
                        return;
                    }
                    eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj = eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj2;
                } catch (Throwable th) {
                    if (zIsLoggable) {
                        ej6unYlOWMDF.zIvmSL0wzmmKGc3X39b2Gw2mUGE(logger, eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj, mpsgFCfSVNxgvcBlEbc8Iuyh3Obq, "failed a run in " + ej6unYlOWMDF.q11o1hieEkZDhF1MGOZI26oZiDT(System.nanoTime() - jNanoTime));
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    j5jyRGaw4k j5jyrgaw4k3 = (j5jyRGaw4k) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    synchronized (j5jyrgaw4k3) {
                        j5jyRGaw4k.VxUQ9tBhpHJ2AAEDNW8sghc4m(j5jyrgaw4k3, eb3lix1g1s4tgeji46hog7bdZzpBGItXfub0yWj, -1L, false);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    threadCurrentThread.setName(name);
                    throw th3;
                }
            }
        }
    }

    public OwOLjYacvvUWq VxUQ9tBhpHJ2AAEDNW8sghc4m() throws IOException {
        TGLcRwWGu8YLUNxbS0tKEz tGLcRwWGu8YLUNxbS0tKEz = (TGLcRwWGu8YLUNxbS0tKEz) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        OwOLjYacvvUWq owOLjYacvvUWq = new OwOLjYacvvUWq();
        Cursor cursorQ1wNbhk2O6 = tGLcRwWGu8YLUNxbS0tKEz.VxUQ9tBhpHJ2AAEDNW8sghc4m.q1wNbhk2O6(new aqhhl68tQrgIjcMGB3dY2YLK3vN("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (cursorQ1wNbhk2O6.moveToNext()) {
            try {
                owOLjYacvvUWq.add(Integer.valueOf(cursorQ1wNbhk2O6.getInt(0)));
            } finally {
            }
        }
        cursorQ1wNbhk2O6.close();
        OwOLjYacvvUWq owOLjYacvvUWqNSjgqmGjEzuugn2SsG1mZFP = sGipz63rTUmSj3uFDvOtzihao.NSjgqmGjEzuugn2SsG1mZFP(owOLjYacvvUWq);
        if (owOLjYacvvUWqNSjgqmGjEzuugn2SsG1mZFP.V57tEvNfxZVVcOCAOih5PKr.isEmpty()) {
            return owOLjYacvvUWqNSjgqmGjEzuugn2SsG1mZFP;
        }
        if (((TGLcRwWGu8YLUNxbS0tKEz) this.ZfQNn8hdWlEQ5cR94249PDsLR).NSjgqmGjEzuugn2SsG1mZFP == null) {
            throw new IllegalStateException("Required value was null.");
        }
        cGYUoKJ5QrSVTXdZE1f88VdPb3 cgyuokj5qrsvtxdze1f88vdpb3 = ((TGLcRwWGu8YLUNxbS0tKEz) this.ZfQNn8hdWlEQ5cR94249PDsLR).NSjgqmGjEzuugn2SsG1mZFP;
        if (cgyuokj5qrsvtxdze1f88vdpb3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        cgyuokj5qrsvtxdze1f88vdpb3.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return owOLjYacvvUWqNSjgqmGjEzuugn2SsG1mZFP;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0170  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.RfOSIaL6qUBGKJY9MSCBP5ba.run():void");
    }
}
