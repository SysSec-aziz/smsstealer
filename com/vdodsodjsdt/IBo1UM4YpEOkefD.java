package com.vdodsodjsdt;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class IBo1UM4YpEOkefD {
    public final IN79WcIk5xB4t0GjRT43qPLs5 VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final MpsgFCfSVNxgvcBlEbc8Iuyh3Obq ZfQNn8hdWlEQ5cR94249PDsLR;
    public final long zzpBGItXfub0yWj;
    public volatile Map V57tEvNfxZVVcOCAOih5PKr = XC6rwBjRUhvxaQ8TfYI.V57tEvNfxZVVcOCAOih5PKr;
    public final QbIJ0GcFe0IcL9iGGOMxSl LaeGQIruHQu81hfJldjMOQSVblH3x = new QbIJ0GcFe0IcL9iGGOMxSl(this, u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(new StringBuilder(), U7JVXX1Kyh43VgUF.zzpBGItXfub0yWj, " ConnectionPool connection closer"));
    public final ConcurrentLinkedQueue zIvmSL0wzmmKGc3X39b2Gw2mUGE = new ConcurrentLinkedQueue();

    static {
        AtomicReferenceFieldUpdater.newUpdater(IBo1UM4YpEOkefD.class, Map.class, "V57tEvNfxZVVcOCAOih5PKr");
    }

    public IBo1UM4YpEOkefD(j5jyRGaw4k j5jyrgaw4k, TimeUnit timeUnit, IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5, LjYjO0YPtp ljYjO0YPtp) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = iN79WcIk5xB4t0GjRT43qPLs5;
        this.zzpBGItXfub0yWj = timeUnit.toNanos(5L);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = j5jyrgaw4k.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(ozyMFBfTwKTRwifTDHYB8VGdyq ozymfbftwktrwiftdhyb8vgdyq, long j) {
        TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ArrayList arrayList = ozymfbftwktrwiftdhyb8vgdyq.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + ozymfbftwktrwiftdhyb8vgdyq.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn + " was leaked. Did you forget to close a response body?";
                O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd(((iGlEcT5B46O6c) reference).VxUQ9tBhpHJ2AAEDNW8sghc4m, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    ozymfbftwktrwiftdhyb8vgdyq.f6ZQsR6bPLvvCDNXOUc = j - this.zzpBGItXfub0yWj;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
