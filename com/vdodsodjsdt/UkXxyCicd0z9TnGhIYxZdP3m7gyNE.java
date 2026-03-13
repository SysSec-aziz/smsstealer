package com.vdodsodjsdt;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class UkXxyCicd0z9TnGhIYxZdP3m7gyNE implements Runnable {
    public final YAf4BMDpiCAb4hYaN6VqW LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final RsZYdPZzPnvxFX2Iwr2ecGA ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ UkXxyCicd0z9TnGhIYxZdP3m7gyNE(RsZYdPZzPnvxFX2Iwr2ecGA rsZYdPZzPnvxFX2Iwr2ecGA, YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = rsZYdPZzPnvxFX2Iwr2ecGA;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = yAf4BMDpiCAb4hYaN6VqW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                RsZYdPZzPnvxFX2Iwr2ecGA rsZYdPZzPnvxFX2Iwr2ecGA = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                boolean zIsCancelled = rsZYdPZzPnvxFX2Iwr2ecGA.isCancelled();
                YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (zIsCancelled) {
                    yAf4BMDpiCAb4hYaN6VqW.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(null);
                    return;
                }
                boolean z = false;
                while (true) {
                    try {
                        try {
                            Object obj = rsZYdPZzPnvxFX2Iwr2ecGA.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            yAf4BMDpiCAb4hYaN6VqW.ZLZeBXTMq0zDztBxtRTuCHrapQ(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (ExecutionException e) {
                        Throwable cause = e.getCause();
                        ej6unYlOWMDF.p59rPv72J9(cause);
                        yAf4BMDpiCAb4hYaN6VqW.ZLZeBXTMq0zDztBxtRTuCHrapQ(ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(cause));
                        return;
                    }
                }
                break;
            default:
                RsZYdPZzPnvxFX2Iwr2ecGA rsZYdPZzPnvxFX2Iwr2ecGA2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                boolean zIsCancelled2 = rsZYdPZzPnvxFX2Iwr2ecGA2.isCancelled();
                YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (zIsCancelled2) {
                    yAf4BMDpiCAb4hYaN6VqW2.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(null);
                    return;
                }
                try {
                    yAf4BMDpiCAb4hYaN6VqW2.ZLZeBXTMq0zDztBxtRTuCHrapQ(mBO0VNMBTnz.zIvmSL0wzmmKGc3X39b2Gw2mUGE(rsZYdPZzPnvxFX2Iwr2ecGA2));
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause2 = e2.getCause();
                    if (cause2 != null) {
                        yAf4BMDpiCAb4hYaN6VqW2.ZLZeBXTMq0zDztBxtRTuCHrapQ(ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(cause2));
                        return;
                    } else {
                        fgDtWyi9UWDNPECrQO4B3R9Or9 fgdtwyi9uwdnpecrqo4b3r9or9 = new fgDtWyi9UWDNPECrQO4B3R9Or9();
                        ej6unYlOWMDF.zOk739gUM7zIZC25HHUxoiyixWFjn(fgdtwyi9uwdnpecrqo4b3r9or9, ej6unYlOWMDF.class.getName());
                        throw fgdtwyi9uwdnpecrqo4b3r9or9;
                    }
                }
        }
    }
}
