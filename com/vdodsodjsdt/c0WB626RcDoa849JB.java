package com.vdodsodjsdt;

import android.net.NetworkRequest;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class c0WB626RcDoa849JB {
    public static final c0WB626RcDoa849JB M9e7PWhFYLD2lOGMker = new c0WB626RcDoa849JB();
    public final Set GI83zq0G8e7zkn;
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final long NSjgqmGjEzuugn2SsG1mZFP;
    public final boolean V57tEvNfxZVVcOCAOih5PKr;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final long ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final VKeHn9sH669RutJ8aaqncC zzpBGItXfub0yWj;

    public c0WB626RcDoa849JB() {
        u9SlVAuoWhQUfJ.p59rPv72J9("requiredNetworkType", 1);
        this.zzpBGItXfub0yWj = new VKeHn9sH669RutJ8aaqncC(null);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        this.V57tEvNfxZVVcOCAOih5PKr = false;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = -1L;
        this.NSjgqmGjEzuugn2SsG1mZFP = -1L;
        this.GI83zq0G8e7zkn = RGN0mODQUR.V57tEvNfxZVVcOCAOih5PKr;
    }

    public final NetworkRequest VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return (NetworkRequest) this.zzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !c0WB626RcDoa849JB.class.equals(obj.getClass())) {
            return false;
        }
        c0WB626RcDoa849JB c0wb626rcdoa849jb = (c0WB626RcDoa849JB) obj;
        if (this.V57tEvNfxZVVcOCAOih5PKr == c0wb626rcdoa849jb.V57tEvNfxZVVcOCAOih5PKr && this.ZfQNn8hdWlEQ5cR94249PDsLR == c0wb626rcdoa849jb.ZfQNn8hdWlEQ5cR94249PDsLR && this.LaeGQIruHQu81hfJldjMOQSVblH3x == c0wb626rcdoa849jb.LaeGQIruHQu81hfJldjMOQSVblH3x && this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == c0wb626rcdoa849jb.zIvmSL0wzmmKGc3X39b2Gw2mUGE && this.ZLZeBXTMq0zDztBxtRTuCHrapQ == c0wb626rcdoa849jb.ZLZeBXTMq0zDztBxtRTuCHrapQ && this.NSjgqmGjEzuugn2SsG1mZFP == c0wb626rcdoa849jb.NSjgqmGjEzuugn2SsG1mZFP && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(VxUQ9tBhpHJ2AAEDNW8sghc4m(), c0wb626rcdoa849jb.VxUQ9tBhpHJ2AAEDNW8sghc4m()) && this.VxUQ9tBhpHJ2AAEDNW8sghc4m == c0wb626rcdoa849jb.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.GI83zq0G8e7zkn, c0wb626rcdoa849jb.GI83zq0G8e7zkn);
        }
        return false;
    }

    public final int hashCode() {
        int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = ((((((((u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(this.VxUQ9tBhpHJ2AAEDNW8sghc4m) * 31) + (this.V57tEvNfxZVVcOCAOih5PKr ? 1 : 0)) * 31) + (this.ZfQNn8hdWlEQ5cR94249PDsLR ? 1 : 0)) * 31) + (this.LaeGQIruHQu81hfJldjMOQSVblH3x ? 1 : 0)) * 31) + (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE ? 1 : 0)) * 31;
        long j = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i = (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        int iHashCode = (this.GI83zq0G8e7zkn.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31;
        NetworkRequest networkRequestVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return iHashCode + (networkRequestVxUQ9tBhpHJ2AAEDNW8sghc4m != null ? networkRequestVxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + u9SlVAuoWhQUfJ.ko09zE6UAgwkV(this.VxUQ9tBhpHJ2AAEDNW8sghc4m) + ", requiresCharging=" + this.V57tEvNfxZVVcOCAOih5PKr + ", requiresDeviceIdle=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + ", requiresBatteryNotLow=" + this.LaeGQIruHQu81hfJldjMOQSVblH3x + ", requiresStorageNotLow=" + this.zIvmSL0wzmmKGc3X39b2Gw2mUGE + ", contentTriggerUpdateDelayMillis=" + this.ZLZeBXTMq0zDztBxtRTuCHrapQ + ", contentTriggerMaxDelayMillis=" + this.NSjgqmGjEzuugn2SsG1mZFP + ", contentUriTriggers=" + this.GI83zq0G8e7zkn + ", }";
    }

    public c0WB626RcDoa849JB(VKeHn9sH669RutJ8aaqncC vKeHn9sH669RutJ8aaqncC, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, LinkedHashSet linkedHashSet) {
        u9SlVAuoWhQUfJ.p59rPv72J9("requiredNetworkType", i);
        this.zzpBGItXfub0yWj = vKeHn9sH669RutJ8aaqncC;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.V57tEvNfxZVVcOCAOih5PKr = z;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = z2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = z3;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = z4;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = j;
        this.NSjgqmGjEzuugn2SsG1mZFP = j2;
        this.GI83zq0G8e7zkn = linkedHashSet;
    }

    public c0WB626RcDoa849JB(c0WB626RcDoa849JB c0wb626rcdoa849jb) {
        ej6unYlOWMDF.pYmKDYlAmhudp(c0wb626rcdoa849jb, "other");
        this.V57tEvNfxZVVcOCAOih5PKr = c0wb626rcdoa849jb.V57tEvNfxZVVcOCAOih5PKr;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = c0wb626rcdoa849jb.ZfQNn8hdWlEQ5cR94249PDsLR;
        this.zzpBGItXfub0yWj = c0wb626rcdoa849jb.zzpBGItXfub0yWj;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = c0wb626rcdoa849jb.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = c0wb626rcdoa849jb.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = c0wb626rcdoa849jb.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.GI83zq0G8e7zkn = c0wb626rcdoa849jb.GI83zq0G8e7zkn;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = c0wb626rcdoa849jb.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        this.NSjgqmGjEzuugn2SsG1mZFP = c0wb626rcdoa849jb.NSjgqmGjEzuugn2SsG1mZFP;
    }
}
