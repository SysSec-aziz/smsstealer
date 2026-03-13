package com.vdodsodjsdt;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ki0ZWFpNS2MqGdb implements Executor {
    public final ArrayDeque LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final Object ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final Executor ZfQNn8hdWlEQ5cR94249PDsLR;
    public Runnable zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public ki0ZWFpNS2MqGdb(Executor executor, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        switch (i) {
            case 1:
                ej6unYlOWMDF.pYmKDYlAmhudp(executor, "executor");
                this.ZfQNn8hdWlEQ5cR94249PDsLR = executor;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = new ArrayDeque();
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new Object();
                break;
            default:
                this.ZfQNn8hdWlEQ5cR94249PDsLR = executor;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = new ArrayDeque();
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new Object();
                break;
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                Runnable runnable = (Runnable) this.LaeGQIruHQu81hfJldjMOQSVblH3x.poll();
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = runnable;
                if (runnable != null) {
                    this.ZfQNn8hdWlEQ5cR94249PDsLR.execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                    Object objPoll = this.LaeGQIruHQu81hfJldjMOQSVblH3x.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = runnable2;
                    if (objPoll != null) {
                        this.ZfQNn8hdWlEQ5cR94249PDsLR.execute(runnable2);
                    }
                    break;
                }
                return;
            default:
                synchronized (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                    try {
                        Runnable runnable3 = (Runnable) this.LaeGQIruHQu81hfJldjMOQSVblH3x.poll();
                        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = runnable3;
                        if (runnable3 != null) {
                            ((dz5cxiLYCa1z79yM) this.ZfQNn8hdWlEQ5cR94249PDsLR).execute(runnable3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                synchronized (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                    try {
                        this.LaeGQIruHQu81hfJldjMOQSVblH3x.add(new gZVesoHrfMaGvAvfBsRIr(this, runnable, 11, false));
                        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
                            VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 1:
                ej6unYlOWMDF.pYmKDYlAmhudp(runnable, "command");
                synchronized (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x.offer(new KEiB9IZn8Hnusye5ELtMjAaq02l5M(runnable, this));
                    if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
                        VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    }
                    break;
                }
                return;
            default:
                synchronized (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                    try {
                        this.LaeGQIruHQu81hfJldjMOQSVblH3x.add(new KEiB9IZn8Hnusye5ELtMjAaq02l5M(0, this, runnable));
                        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
                            VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }

    public ki0ZWFpNS2MqGdb(dz5cxiLYCa1z79yM dz5cxilyca1z79ym) {
        this.V57tEvNfxZVVcOCAOih5PKr = 2;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new Object();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new ArrayDeque();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = dz5cxilyca1z79ym;
    }
}
