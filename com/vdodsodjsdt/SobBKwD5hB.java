package com.vdodsodjsdt;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class SobBKwD5hB implements Runnable {
    public long LaeGQIruHQu81hfJldjMOQSVblH3x;
    public ArrayList V57tEvNfxZVVcOCAOih5PKr;
    public long ZfQNn8hdWlEQ5cR94249PDsLR;
    public ArrayList zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public static final ThreadLocal ZLZeBXTMq0zDztBxtRTuCHrapQ = new ThreadLocal();
    public static final T3RbnymT8IuKvnwatFNeNL7H NSjgqmGjEzuugn2SsG1mZFP = new T3RbnymT8IuKvnwatFNeNL7H(2);

    public static WFEUpQgjHl V57tEvNfxZVVcOCAOih5PKr(RecyclerView recyclerView, int i, long j) {
        int iIrh5auREsoeV1C1RaBamlmy = recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.Irh5auREsoeV1C1RaBamlmy();
        for (int i2 = 0; i2 < iIrh5auREsoeV1C1RaBamlmy; i2++) {
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.TaDO7ogis3aEiWEtq(i2));
            if (wFEUpQgjHlQygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr == i && !wFEUpQgjHlQygqjTppWwx992.zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
                return null;
            }
        }
        yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c = recyclerView.ZfQNn8hdWlEQ5cR94249PDsLR;
        try {
            recyclerView.wRCD0SdqWCowdYU7bmzN();
            WFEUpQgjHl wFEUpQgjHlM9e7PWhFYLD2lOGMker = yhxkwue1zri6a9vau8hg9c.M9e7PWhFYLD2lOGMker(i, j);
            if (wFEUpQgjHlM9e7PWhFYLD2lOGMker != null) {
                if (!wFEUpQgjHlM9e7PWhFYLD2lOGMker.LaeGQIruHQu81hfJldjMOQSVblH3x() || wFEUpQgjHlM9e7PWhFYLD2lOGMker.zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
                    yhxkwue1zri6a9vau8hg9c.VxUQ9tBhpHJ2AAEDNW8sghc4m(wFEUpQgjHlM9e7PWhFYLD2lOGMker, false);
                } else {
                    yhxkwue1zri6a9vau8hg9c.ZLZeBXTMq0zDztBxtRTuCHrapQ(wFEUpQgjHlM9e7PWhFYLD2lOGMker.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
            }
            recyclerView.gBaBUmihn5l4u(false);
            return wFEUpQgjHlM9e7PWhFYLD2lOGMker;
        } catch (Throwable th) {
            recyclerView.gBaBUmihn5l4u(false);
            throw th;
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.jW7EiD0YL6xkbB158jMUzhWNWb1y && this.ZfQNn8hdWlEQ5cR94249PDsLR == 0) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        MSl7hPM6XqjxyBV5m mSl7hPM6XqjxyBV5m = recyclerView.rERAmyEtGV6ANGszuKcQI;
        mSl7hPM6XqjxyBV5m.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        mSl7hPM6XqjxyBV5m.zzpBGItXfub0yWj = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.V57tEvNfxZVVcOCAOih5PKr;
        try {
            int i = TBOn1G6tgZKbOPI1mnHhsMX2mq3mV.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    zzpBGItXfub0yWj(TimeUnit.MILLISECONDS.toNanos(jMax) + this.LaeGQIruHQu81hfJldjMOQSVblH3x);
                }
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = 0L;
            int i3 = TBOn1G6tgZKbOPI1mnHhsMX2mq3mV.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzpBGItXfub0yWj(long r17) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.SobBKwD5hB.zzpBGItXfub0yWj(long):void");
    }
}
