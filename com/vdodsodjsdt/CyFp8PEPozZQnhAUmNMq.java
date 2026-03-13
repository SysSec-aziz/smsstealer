package com.vdodsodjsdt;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class CyFp8PEPozZQnhAUmNMq implements kpXzRIgLxQiglBj {
    public Handler LaeGQIruHQu81hfJldjMOQSVblH3x;
    public hRrPPME7ytOB7ba NSjgqmGjEzuugn2SsG1mZFP;
    public final FG8LIxsgYiLSfhN0jYKIKr V57tEvNfxZVVcOCAOih5PKr;
    public final Context VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public ThreadPoolExecutor ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final Object ZfQNn8hdWlEQ5cR94249PDsLR = new Object();
    public ThreadPoolExecutor zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final zDPogDYnaf4Ok5KljFrcZIbCgM2B zzpBGItXfub0yWj;

    public CyFp8PEPozZQnhAUmNMq(Context context, zDPogDYnaf4Ok5KljFrcZIbCgM2B zdpogdynaf4ok5kljfrczibcgm2b) {
        KfeOQNOupsCg6878zi4e.KUYypEB4eNWOZWVDpH(context, "Context cannot be null");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = context.getApplicationContext();
        this.zzpBGItXfub0yWj = zdpogdynaf4ok5kljfrczibcgm2b;
        this.V57tEvNfxZVVcOCAOih5PKr = scWJtRrcQpw1SO8qayAb4dT2LAw.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final j5O1PfCuTxZKdtuvF7 V57tEvNfxZVVcOCAOih5PKr() {
        try {
            FG8LIxsgYiLSfhN0jYKIKr fG8LIxsgYiLSfhN0jYKIKr = this.V57tEvNfxZVVcOCAOih5PKr;
            Context context = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            zDPogDYnaf4Ok5KljFrcZIbCgM2B zdpogdynaf4ok5kljfrczibcgm2b = this.zzpBGItXfub0yWj;
            fG8LIxsgYiLSfhN0jYKIKr.getClass();
            Object[] objArr = {zdpogdynaf4ok5kljfrczibcgm2b};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            z8uyl4sTQr2O9dK1e z8uyl4stqr2o9dk1eVxUQ9tBhpHJ2AAEDNW8sghc4m = xpKXrogL5QN2Ln5bIc.VxUQ9tBhpHJ2AAEDNW8sghc4m(context, Collections.unmodifiableList(arrayList));
            int i = z8uyl4stqr2o9dk1eVxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr;
            if (i != 0) {
                throw new RuntimeException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "fetchFonts failed (", ")"));
            }
            j5O1PfCuTxZKdtuvF7[] j5o1pfcutxzkdtuvf7Arr = (j5O1PfCuTxZKdtuvF7[]) ((List) z8uyl4stqr2o9dk1eVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR).get(0);
            if (j5o1pfcutxzkdtuvf7Arr == null || j5o1pfcutxzkdtuvf7Arr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return j5o1pfcutxzkdtuvf7Arr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    @Override // com.vdodsodjsdt.kpXzRIgLxQiglBj
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(hRrPPME7ytOB7ba hrrppme7ytob7ba) {
        synchronized (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            this.NSjgqmGjEzuugn2SsG1mZFP = hrrppme7ytob7ba;
        }
        synchronized (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            try {
                if (this.NSjgqmGjEzuugn2SsG1mZFP == null) {
                    return;
                }
                if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ySK2rlaEFl0G3("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.ZLZeBXTMq0zDztBxtRTuCHrapQ = threadPoolExecutor;
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = threadPoolExecutor;
                }
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.execute(new lUqBmUbL53IL3VMM8GT8(7, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzpBGItXfub0yWj() {
        synchronized (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            try {
                this.NSjgqmGjEzuugn2SsG1mZFP = null;
                Handler handler = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
                ThreadPoolExecutor threadPoolExecutor = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
