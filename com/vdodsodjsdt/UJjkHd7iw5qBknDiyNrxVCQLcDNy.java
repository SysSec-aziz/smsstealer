package com.vdodsodjsdt;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class UJjkHd7iw5qBknDiyNrxVCQLcDNy extends cY8zPHnUdezl implements Executor {
    public static final UJjkHd7iw5qBknDiyNrxVCQLcDNy LaeGQIruHQu81hfJldjMOQSVblH3x = new UJjkHd7iw5qBknDiyNrxVCQLcDNy();
    public static final LL6zXCXfmDYzdHCRTT zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    static {
        LL6zXCXfmDYzdHCRTT bKV8Ru45KI4 = viCEQjqDI6.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i = ursTu5yfUDTCBVzqCa.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (64 >= i) {
            i = 64;
        }
        int iCixTK5ZX8oWXHz34qHYV = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.CixTK5ZX8oWXHz34qHYV("kotlinx.coroutines.io.parallelism", i, 12);
        bKV8Ru45KI4.getClass();
        if (iCixTK5ZX8oWXHz34qHYV < 1) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Expected positive parallelism level, but got ", iCixTK5ZX8oWXHz34qHYV).toString());
        }
        if (iCixTK5ZX8oWXHz34qHYV < TrXcUZLEn3kaSijyhUrmV5.ZfQNn8hdWlEQ5cR94249PDsLR) {
            if (iCixTK5ZX8oWXHz34qHYV < 1) {
                throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Expected positive parallelism level, but got ", iCixTK5ZX8oWXHz34qHYV).toString());
            }
            bKV8Ru45KI4 = new BKV8Ru45KI4(bKV8Ru45KI4, iCixTK5ZX8oWXHz34qHYV);
        }
        zIvmSL0wzmmKGc3X39b2Gw2mUGE = bKV8Ru45KI4;
    }

    @Override // com.vdodsodjsdt.LL6zXCXfmDYzdHCRTT
    public final void SuB3hEmTmbbRGAhtvOOmfKEon(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Runnable runnable) {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE.SuB3hEmTmbbRGAhtvOOmfKEon(d73WsmU258PapcWZb45SFW, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        SuB3hEmTmbbRGAhtvOOmfKEon(hu3HDJRthjXEukAdCh3Tdc.V57tEvNfxZVVcOCAOih5PKr, runnable);
    }

    @Override // com.vdodsodjsdt.LL6zXCXfmDYzdHCRTT
    public final void pzqP2AqKW6J5PO8zCKnW(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Runnable runnable) {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE.pzqP2AqKW6J5PO8zCKnW(d73WsmU258PapcWZb45SFW, runnable);
    }

    @Override // com.vdodsodjsdt.LL6zXCXfmDYzdHCRTT
    public final String toString() {
        return "Dispatchers.IO";
    }
}
