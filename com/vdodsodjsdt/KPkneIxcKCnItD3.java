package com.vdodsodjsdt;

import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class KPkneIxcKCnItD3 extends HVDN7cg44ou {
    public final /* synthetic */ AIQ3M1G7NlBb9nFUZAGJvkBOAC q1wNbhk2O6;

    public KPkneIxcKCnItD3(AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC) {
        this.q1wNbhk2O6 = aIQ3M1G7NlBb9nFUZAGJvkBOAC;
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd() throws SocketTimeoutException {
        if (GI83zq0G8e7zkn()) {
            throw new SocketTimeoutException("timeout");
        }
    }

    @Override // com.vdodsodjsdt.HVDN7cg44ou
    public final void M9e7PWhFYLD2lOGMker() {
        this.q1wNbhk2O6.LaeGQIruHQu81hfJldjMOQSVblH3x(sRSjJ4B4UdKzPCFBE.CANCEL);
        aLVvFTl6cTT alvvftl6ctt = this.q1wNbhk2O6.zzpBGItXfub0yWj;
        synchronized (alvvftl6ctt) {
            long j = alvvftl6ctt.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            long j2 = alvvftl6ctt.Ca81ebIan1u;
            if (j < j2) {
                return;
            }
            alvvftl6ctt.Ca81ebIan1u = j2 + 1;
            alvvftl6ctt.pYmKDYlAmhudp = System.nanoTime() + ((long) 1000000000);
            MpsgFCfSVNxgvcBlEbc8Iuyh3Obq.zzpBGItXfub0yWj(alvvftl6ctt.M9e7PWhFYLD2lOGMker, u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(new StringBuilder(), alvvftl6ctt.LaeGQIruHQu81hfJldjMOQSVblH3x, " ping"), new hfnU5q1H9m1kOmNb(2, alvvftl6ctt));
        }
    }
}
