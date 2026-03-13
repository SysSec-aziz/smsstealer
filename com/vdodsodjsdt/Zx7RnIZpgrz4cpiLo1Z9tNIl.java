package com.vdodsodjsdt;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Zx7RnIZpgrz4cpiLo1Z9tNIl implements yVilYaP7xC {
    public final bE55L7xKBxF2zT0ulQLMWyBrJjkx V57tEvNfxZVVcOCAOih5PKr;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater ZfQNn8hdWlEQ5cR94249PDsLR = AtomicIntegerFieldUpdater.newUpdater(Zx7RnIZpgrz4cpiLo1Z9tNIl.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater LaeGQIruHQu81hfJldjMOQSVblH3x = AtomicReferenceFieldUpdater.newUpdater(Zx7RnIZpgrz4cpiLo1Z9tNIl.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater zIvmSL0wzmmKGc3X39b2Gw2mUGE = AtomicReferenceFieldUpdater.newUpdater(Zx7RnIZpgrz4cpiLo1Z9tNIl.class, Object.class, "_exceptionsHolder$volatile");

    public Zx7RnIZpgrz4cpiLo1Z9tNIl(bE55L7xKBxF2zT0ulQLMWyBrJjkx be55l7xkbxf2zt0ulqlmwybrjjkx, Throwable th) {
        this.V57tEvNfxZVVcOCAOih5PKr = be55l7xkbxf2zt0ulqlmwybrjjkx;
        this._rootCause$volatile = th;
    }

    @Override // com.vdodsodjsdt.yVilYaP7xC
    public final bE55L7xKBxF2zT0ulQLMWyBrJjkx LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    public final Throwable V57tEvNfxZVVcOCAOih5PKr() {
        return (Throwable) LaeGQIruHQu81hfJldjMOQSVblH3x.get(this);
    }

    @Override // com.vdodsodjsdt.yVilYaP7xC
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return V57tEvNfxZVVcOCAOih5PKr() == null;
    }

    public final ArrayList ZLZeBXTMq0zDztBxtRTuCHrapQ(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr();
        if (thV57tEvNfxZVVcOCAOih5PKr != null) {
            arrayList.add(0, thV57tEvNfxZVVcOCAOih5PKr);
        }
        if (th != null && !th.equals(thV57tEvNfxZVVcOCAOih5PKr)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, zonOxHotd3BwAPJcwqr6I6uQNngg4.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        return arrayList;
    }

    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR() {
        return V57tEvNfxZVVcOCAOih5PKr() != null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + ZfQNn8hdWlEQ5cR94249PDsLR() + ", completing=" + zIvmSL0wzmmKGc3X39b2Gw2mUGE() + ", rootCause=" + V57tEvNfxZVVcOCAOih5PKr() + ", exceptions=" + zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(this) + ", list=" + this.V57tEvNfxZVVcOCAOih5PKr + ']';
    }

    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return ZfQNn8hdWlEQ5cR94249PDsLR.get(this) != 0;
    }

    public final void zzpBGItXfub0yWj(Throwable th) {
        Throwable thV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr();
        if (thV57tEvNfxZVVcOCAOih5PKr == null) {
            LaeGQIruHQu81hfJldjMOQSVblH3x.set(this, th);
            return;
        }
        if (th == thV57tEvNfxZVVcOCAOih5PKr) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }
}
