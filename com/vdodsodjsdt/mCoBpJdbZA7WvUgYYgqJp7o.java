package com.vdodsodjsdt;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class mCoBpJdbZA7WvUgYYgqJp7o extends hRrPPME7ytOB7ba {
    public final /* synthetic */ ThreadPoolExecutor aXO0LSrt8bKV;
    public final /* synthetic */ hRrPPME7ytOB7ba pzqP2AqKW6J5PO8zCKnW;

    public mCoBpJdbZA7WvUgYYgqJp7o(hRrPPME7ytOB7ba hrrppme7ytob7ba, ThreadPoolExecutor threadPoolExecutor) {
        this.pzqP2AqKW6J5PO8zCKnW = hrrppme7ytob7ba;
        this.aXO0LSrt8bKV = threadPoolExecutor;
    }

    @Override // com.vdodsodjsdt.hRrPPME7ytOB7ba
    public final void Irh5auREsoeV1C1RaBamlmy(nMRZPpfLCgJyuB nmrzppflcgjyub) {
        ThreadPoolExecutor threadPoolExecutor = this.aXO0LSrt8bKV;
        try {
            this.pzqP2AqKW6J5PO8zCKnW.Irh5auREsoeV1C1RaBamlmy(nmrzppflcgjyub);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.vdodsodjsdt.hRrPPME7ytOB7ba
    public final void TaDO7ogis3aEiWEtq(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.aXO0LSrt8bKV;
        try {
            this.pzqP2AqKW6J5PO8zCKnW.TaDO7ogis3aEiWEtq(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
