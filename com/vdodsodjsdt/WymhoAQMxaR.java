package com.vdodsodjsdt;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class WymhoAQMxaR {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        String strZLZeBXTMq0zDztBxtRTuCHrapQ = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("WorkerWrapper");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strZLZeBXTMq0zDztBxtRTuCHrapQ, "tagWithPrefix(\"WorkerWrapper\")");
        VxUQ9tBhpHJ2AAEDNW8sghc4m = strZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public static final Object VxUQ9tBhpHJ2AAEDNW8sghc4m(RsZYdPZzPnvxFX2Iwr2ecGA rsZYdPZzPnvxFX2Iwr2ecGA, E4DUcuxizcAv5WKy5qZ7sw e4DUcuxizcAv5WKy5qZ7sw, GvuED9Eb9kjnYjng4BPJg7J gvuED9Eb9kjnYjng4BPJg7J) {
        Object obj;
        try {
            if (!rsZYdPZzPnvxFX2Iwr2ecGA.isDone()) {
                YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW = new YAf4BMDpiCAb4hYaN6VqW(1, sGipz63rTUmSj3uFDvOtzihao.qNPQb1obP7(gvuED9Eb9kjnYjng4BPJg7J));
                yAf4BMDpiCAb4hYaN6VqW.vBGA6pPLqSMuYGvprl270j7();
                rsZYdPZzPnvxFX2Iwr2ecGA.VxUQ9tBhpHJ2AAEDNW8sghc4m(new UkXxyCicd0z9TnGhIYxZdP3m7gyNE(rsZYdPZzPnvxFX2Iwr2ecGA, yAf4BMDpiCAb4hYaN6VqW, 0), M1AQjX17IIqtW1mEGSLJGUSZk4OZ.V57tEvNfxZVVcOCAOih5PKr);
                yAf4BMDpiCAb4hYaN6VqW.Irh5auREsoeV1C1RaBamlmy(new kBXIB8LLE5cCVkJ(3, e4DUcuxizcAv5WKy5qZ7sw, rsZYdPZzPnvxFX2Iwr2ecGA));
                return yAf4BMDpiCAb4hYaN6VqW.f6ZQsR6bPLvvCDNXOUc();
            }
            boolean z = false;
            while (true) {
                try {
                    obj = rsZYdPZzPnvxFX2Iwr2ecGA.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            ej6unYlOWMDF.p59rPv72J9(cause);
            throw cause;
        }
    }
}
