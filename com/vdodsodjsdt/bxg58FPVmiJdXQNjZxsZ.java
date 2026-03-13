package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bxg58FPVmiJdXQNjZxsZ {
    public static final ThreadLocal VxUQ9tBhpHJ2AAEDNW8sghc4m = new ThreadLocal();

    public static CwickyU0ZjEG0JwJwvvsOp0vRH0PB VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        ThreadLocal threadLocal = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        CwickyU0ZjEG0JwJwvvsOp0vRH0PB cwickyU0ZjEG0JwJwvvsOp0vRH0PB = (CwickyU0ZjEG0JwJwvvsOp0vRH0PB) threadLocal.get();
        if (cwickyU0ZjEG0JwJwvvsOp0vRH0PB != null) {
            return cwickyU0ZjEG0JwJwvvsOp0vRH0PB;
        }
        NRtxx4HWCKdJyC7OuudxBCrbgU nRtxx4HWCKdJyC7OuudxBCrbgU = new NRtxx4HWCKdJyC7OuudxBCrbgU(Thread.currentThread());
        threadLocal.set(nRtxx4HWCKdJyC7OuudxBCrbgU);
        return nRtxx4HWCKdJyC7OuudxBCrbgU;
    }
}
