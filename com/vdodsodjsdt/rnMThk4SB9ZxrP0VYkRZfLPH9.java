package com.vdodsodjsdt;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class rnMThk4SB9ZxrP0VYkRZfLPH9 extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        HVDN7cg44ou hVDN7cg44ouZLZeBXTMq0zDztBxtRTuCHrapQ;
        while (true) {
            try {
                ReentrantLock reentrantLock2 = HVDN7cg44ou.NSjgqmGjEzuugn2SsG1mZFP;
                reentrantLock = HVDN7cg44ou.NSjgqmGjEzuugn2SsG1mZFP;
                reentrantLock.lock();
                try {
                    hVDN7cg44ouZLZeBXTMq0zDztBxtRTuCHrapQ = IN79WcIk5xB4t0GjRT43qPLs5.ZLZeBXTMq0zDztBxtRTuCHrapQ();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (hVDN7cg44ouZLZeBXTMq0zDztBxtRTuCHrapQ == HVDN7cg44ou.KUYypEB4eNWOZWVDpH) {
                HVDN7cg44ou.KUYypEB4eNWOZWVDpH = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (hVDN7cg44ouZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
                    hVDN7cg44ouZLZeBXTMq0zDztBxtRTuCHrapQ.M9e7PWhFYLD2lOGMker();
                }
            }
        }
    }
}
