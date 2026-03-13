package com.vdodsodjsdt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class HVDN7cg44ou extends Rls9YNaGzWVnzvwT {
    public static final Condition GI83zq0G8e7zkn;
    public static final long HzCpKshMOoaw76hFcbOVRYMeRd;
    public static HVDN7cg44ou KUYypEB4eNWOZWVDpH;
    public static final long M9e7PWhFYLD2lOGMker;
    public static final ReentrantLock NSjgqmGjEzuugn2SsG1mZFP;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public long ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public HVDN7cg44ou zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        NSjgqmGjEzuugn2SsG1mZFP = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(conditionNewCondition, "newCondition(...)");
        GI83zq0G8e7zkn = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        M9e7PWhFYLD2lOGMker = millis;
        HzCpKshMOoaw76hFcbOVRYMeRd = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final boolean GI83zq0G8e7zkn() {
        ReentrantLock reentrantLock = NSjgqmGjEzuugn2SsG1mZFP;
        reentrantLock.lock();
        try {
            int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
            if (i != 1) {
                return i == 2;
            }
            HVDN7cg44ou hVDN7cg44ou = KUYypEB4eNWOZWVDpH;
            while (hVDN7cg44ou != null) {
                HVDN7cg44ou hVDN7cg44ou2 = hVDN7cg44ou.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (hVDN7cg44ou2 == this) {
                    hVDN7cg44ou.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
                    return false;
                }
                hVDN7cg44ou = hVDN7cg44ou2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP() {
        long j = this.V57tEvNfxZVVcOCAOih5PKr;
        boolean z = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = NSjgqmGjEzuugn2SsG1mZFP;
            reentrantLock.lock();
            try {
                if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = 1;
                IN79WcIk5xB4t0GjRT43qPLs5.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this, j, z);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public void M9e7PWhFYLD2lOGMker() {
    }
}
