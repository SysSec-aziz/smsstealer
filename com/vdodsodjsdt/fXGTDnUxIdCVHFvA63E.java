package com.vdodsodjsdt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class fXGTDnUxIdCVHFvA63E implements sJ612dvaOBrP4lDkAwxzLpcxONSSp, VasJmAsPXegpf {
    public static final /* synthetic */ AtomicReferenceFieldUpdater V57tEvNfxZVVcOCAOih5PKr = AtomicReferenceFieldUpdater.newUpdater(fXGTDnUxIdCVHFvA63E.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater ZfQNn8hdWlEQ5cR94249PDsLR = AtomicReferenceFieldUpdater.newUpdater(fXGTDnUxIdCVHFvA63E.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public fXGTDnUxIdCVHFvA63E(boolean z) {
        this._state$volatile = z ? zonOxHotd3BwAPJcwqr6I6uQNngg4.GI83zq0G8e7zkn : zonOxHotd3BwAPJcwqr6I6uQNngg4.NSjgqmGjEzuugn2SsG1mZFP;
    }

    public static String ItrQwCXbty5PZtje5JS(Object obj) {
        if (!(obj instanceof Zx7RnIZpgrz4cpiLo1Z9tNIl)) {
            return obj instanceof yVilYaP7xC ? ((yVilYaP7xC) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m() ? "Active" : "New" : obj instanceof XpG0A5IpJsSX9uJPSmP4WwTAl ? "Cancelled" : "Completed";
        }
        Zx7RnIZpgrz4cpiLo1Z9tNIl zx7RnIZpgrz4cpiLo1Z9tNIl = (Zx7RnIZpgrz4cpiLo1Z9tNIl) obj;
        return zx7RnIZpgrz4cpiLo1Z9tNIl.ZfQNn8hdWlEQ5cR94249PDsLR() ? "Cancelling" : zx7RnIZpgrz4cpiLo1Z9tNIl.zIvmSL0wzmmKGc3X39b2Gw2mUGE() ? "Completing" : "Active";
    }

    public static RIKiCXKBHnfx4 YdNRGRc4rly(MkvBTCkp5aUsEYdslusuFmia mkvBTCkp5aUsEYdslusuFmia) {
        while (mkvBTCkp5aUsEYdslusuFmia.M9e7PWhFYLD2lOGMker()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MkvBTCkp5aUsEYdslusuFmia.ZfQNn8hdWlEQ5cR94249PDsLR;
            MkvBTCkp5aUsEYdslusuFmia mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE = mkvBTCkp5aUsEYdslusuFmia.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            if (mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
                Object obj = atomicReferenceFieldUpdater.get(mkvBTCkp5aUsEYdslusuFmia);
                while (true) {
                    mkvBTCkp5aUsEYdslusuFmia = (MkvBTCkp5aUsEYdslusuFmia) obj;
                    if (!mkvBTCkp5aUsEYdslusuFmia.M9e7PWhFYLD2lOGMker()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(mkvBTCkp5aUsEYdslusuFmia);
                }
            } else {
                mkvBTCkp5aUsEYdslusuFmia = mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE;
            }
        }
        while (true) {
            mkvBTCkp5aUsEYdslusuFmia = mkvBTCkp5aUsEYdslusuFmia.GI83zq0G8e7zkn();
            if (!mkvBTCkp5aUsEYdslusuFmia.M9e7PWhFYLD2lOGMker()) {
                if (mkvBTCkp5aUsEYdslusuFmia instanceof RIKiCXKBHnfx4) {
                    return (RIKiCXKBHnfx4) mkvBTCkp5aUsEYdslusuFmia;
                }
                if (mkvBTCkp5aUsEYdslusuFmia instanceof bE55L7xKBxF2zT0ulQLMWyBrJjkx) {
                    return null;
                }
            }
        }
    }

    public final boolean Ca81ebIan1u(yVilYaP7xC yvilyap7xc, bE55L7xKBxF2zT0ulQLMWyBrJjkx be55l7xkbxf2zt0ulqlmwybrjjkx, WQoBeERitBjo wQoBeERitBjo) {
        MkvBTCkp5aUsEYdslusuFmia mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE;
        tIoCdOjAo1z1QrB2Y4Mg8vc tiocdojao1z1qrb2y4mg8vc = new tIoCdOjAo1z1QrB2Y4Mg8vc(wQoBeERitBjo, this, yvilyap7xc);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MkvBTCkp5aUsEYdslusuFmia.ZfQNn8hdWlEQ5cR94249PDsLR;
            mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE = be55l7xkbxf2zt0ulqlmwybrjjkx.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            if (mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
                Object obj = atomicReferenceFieldUpdater.get(be55l7xkbxf2zt0ulqlmwybrjjkx);
                while (true) {
                    mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE = (MkvBTCkp5aUsEYdslusuFmia) obj;
                    if (!mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE.M9e7PWhFYLD2lOGMker()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE);
                }
            }
            MkvBTCkp5aUsEYdslusuFmia.ZfQNn8hdWlEQ5cR94249PDsLR.set(wQoBeERitBjo, mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = MkvBTCkp5aUsEYdslusuFmia.V57tEvNfxZVVcOCAOih5PKr;
            atomicReferenceFieldUpdater2.set(wQoBeERitBjo, be55l7xkbxf2zt0ulqlmwybrjjkx);
            tiocdojao1z1qrb2y4mg8vc.V57tEvNfxZVVcOCAOih5PKr = be55l7xkbxf2zt0ulqlmwybrjjkx;
            while (!atomicReferenceFieldUpdater2.compareAndSet(mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE, be55l7xkbxf2zt0ulqlmwybrjjkx, tiocdojao1z1qrb2y4mg8vc)) {
                if (atomicReferenceFieldUpdater2.get(mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE) != be55l7xkbxf2zt0ulqlmwybrjjkx) {
                    break;
                }
            }
        }
        return tiocdojao1z1qrb2y4mg8vc.VxUQ9tBhpHJ2AAEDNW8sghc4m(mkvBTCkp5aUsEYdslusuFmiaZIvmSL0wzmmKGc3X39b2Gw2mUGE) == null;
    }

    public final boolean CixTK5ZX8oWXHz34qHYV(Object obj) {
        Object objHKs1wlZyvtUNaW1f5ABIGacfPcvX;
        do {
            objHKs1wlZyvtUNaW1f5ABIGacfPcvX = hKs1wlZyvtUNaW1f5ABIGacfPcvX(O1xDAlBZZlZdoEf747lCFHld(), obj);
            if (objHKs1wlZyvtUNaW1f5ABIGacfPcvX == zonOxHotd3BwAPJcwqr6I6uQNngg4.V57tEvNfxZVVcOCAOih5PKr) {
                return false;
            }
            if (objHKs1wlZyvtUNaW1f5ABIGacfPcvX == zonOxHotd3BwAPJcwqr6I6uQNngg4.ZfQNn8hdWlEQ5cR94249PDsLR) {
                return true;
            }
        } while (objHKs1wlZyvtUNaW1f5ABIGacfPcvX == zonOxHotd3BwAPJcwqr6I6uQNngg4.LaeGQIruHQu81hfJldjMOQSVblH3x);
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objHKs1wlZyvtUNaW1f5ABIGacfPcvX);
        return true;
    }

    public boolean HVEwbdULInpTNa0IG(Throwable th) {
        return false;
    }

    public final void Irh5auREsoeV1C1RaBamlmy(yVilYaP7xC yvilyap7xc, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ZfQNn8hdWlEQ5cR94249PDsLR;
        gHWGGkKBgoYQ6 ghwggkkbgoyq6 = (gHWGGkKBgoYQ6) atomicReferenceFieldUpdater.get(this);
        if (ghwggkkbgoyq6 != null) {
            ghwggkkbgoyq6.zzpBGItXfub0yWj();
            atomicReferenceFieldUpdater.set(this, YiXsAgAUc8R5atJu.V57tEvNfxZVVcOCAOih5PKr);
        }
        Eyg9qHiQ9Ki1REKbbd3J eyg9qHiQ9Ki1REKbbd3J = null;
        XpG0A5IpJsSX9uJPSmP4WwTAl xpG0A5IpJsSX9uJPSmP4WwTAl = obj instanceof XpG0A5IpJsSX9uJPSmP4WwTAl ? (XpG0A5IpJsSX9uJPSmP4WwTAl) obj : null;
        Throwable th = xpG0A5IpJsSX9uJPSmP4WwTAl != null ? xpG0A5IpJsSX9uJPSmP4WwTAl.VxUQ9tBhpHJ2AAEDNW8sghc4m : null;
        if (yvilyap7xc instanceof WQoBeERitBjo) {
            try {
                ((WQoBeERitBjo) yvilyap7xc).ZfQNn8hdWlEQ5cR94249PDsLR(th);
                return;
            } catch (Throwable th2) {
                y1NaPKTl7R18DOr6e8i5(new Eyg9qHiQ9Ki1REKbbd3J("Exception in completion handler " + yvilyap7xc + " for " + this, th2));
                return;
            }
        }
        bE55L7xKBxF2zT0ulQLMWyBrJjkx be55l7xkbxf2zt0ulqlmwybrjjkxLaeGQIruHQu81hfJldjMOQSVblH3x = yvilyap7xc.LaeGQIruHQu81hfJldjMOQSVblH3x();
        if (be55l7xkbxf2zt0ulqlmwybrjjkxLaeGQIruHQu81hfJldjMOQSVblH3x != null) {
            Object objNSjgqmGjEzuugn2SsG1mZFP = be55l7xkbxf2zt0ulqlmwybrjjkxLaeGQIruHQu81hfJldjMOQSVblH3x.NSjgqmGjEzuugn2SsG1mZFP();
            ej6unYlOWMDF.Ca81ebIan1u(objNSjgqmGjEzuugn2SsG1mZFP, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (MkvBTCkp5aUsEYdslusuFmia mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn = (MkvBTCkp5aUsEYdslusuFmia) objNSjgqmGjEzuugn2SsG1mZFP; !mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn.equals(be55l7xkbxf2zt0ulqlmwybrjjkxLaeGQIruHQu81hfJldjMOQSVblH3x); mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn = mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn.GI83zq0G8e7zkn()) {
                if (mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn instanceof WQoBeERitBjo) {
                    WQoBeERitBjo wQoBeERitBjo = (WQoBeERitBjo) mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn;
                    try {
                        wQoBeERitBjo.ZfQNn8hdWlEQ5cR94249PDsLR(th);
                    } catch (Throwable th3) {
                        if (eyg9qHiQ9Ki1REKbbd3J != null) {
                            sGipz63rTUmSj3uFDvOtzihao.LaeGQIruHQu81hfJldjMOQSVblH3x(eyg9qHiQ9Ki1REKbbd3J, th3);
                        } else {
                            eyg9qHiQ9Ki1REKbbd3J = new Eyg9qHiQ9Ki1REKbbd3J("Exception in completion handler " + wQoBeERitBjo + " for " + this, th3);
                        }
                    }
                }
            }
            if (eyg9qHiQ9Ki1REKbbd3J != null) {
                y1NaPKTl7R18DOr6e8i5(eyg9qHiQ9Ki1REKbbd3J);
            }
        }
    }

    public final int JUdwvN8LfOMa(Object obj) {
        boolean z = obj instanceof vLERWCl1n9NOnQZ6OlL;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V57tEvNfxZVVcOCAOih5PKr;
        if (z) {
            if (((vLERWCl1n9NOnQZ6OlL) obj).V57tEvNfxZVVcOCAOih5PKr) {
                return 0;
            }
            vLERWCl1n9NOnQZ6OlL vlerwcl1n9nonqz6oll = zonOxHotd3BwAPJcwqr6I6uQNngg4.GI83zq0G8e7zkn;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, vlerwcl1n9nonqz6oll)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            L8DMw02rUTs2w();
            return 1;
        }
        if (!(obj instanceof jkVhUtAoZBOHdCNi8awYJQe81KL)) {
            return 0;
        }
        bE55L7xKBxF2zT0ulQLMWyBrJjkx be55l7xkbxf2zt0ulqlmwybrjjkx = ((jkVhUtAoZBOHdCNi8awYJQe81KL) obj).V57tEvNfxZVVcOCAOih5PKr;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, be55l7xkbxf2zt0ulqlmwybrjjkx)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        L8DMw02rUTs2w();
        return 1;
    }

    @Override // com.vdodsodjsdt.D73WsmU258PapcWZb45SFW
    public final D73WsmU258PapcWZb45SFW KUYypEB4eNWOZWVDpH(DenmIypSdw0qfxt denmIypSdw0qfxt) {
        return sGipz63rTUmSj3uFDvOtzihao.qygqjTppWwx992(this, denmIypSdw0qfxt);
    }

    @Override // com.vdodsodjsdt.D73WsmU258PapcWZb45SFW
    public final Object M9e7PWhFYLD2lOGMker(Object obj, MGk7KfXeUv8YAfWiUw5LfOd mGk7KfXeUv8YAfWiUw5LfOd) {
        return mGk7KfXeUv8YAfWiUw5LfOd.NSjgqmGjEzuugn2SsG1mZFP(obj, this);
    }

    public final Object O1xDAlBZZlZdoEf747lCFHld() {
        while (true) {
            Object obj = V57tEvNfxZVVcOCAOih5PKr.get(this);
            if (!(obj instanceof ZWTS2K4yymjCBrc)) {
                return obj;
            }
            ((ZWTS2K4yymjCBrc) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
        }
    }

    @Override // com.vdodsodjsdt.D73WsmU258PapcWZb45SFW
    public final D73WsmU258PapcWZb45SFW RhfGHxtXxy0M0grmp2jkRjQg(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW) {
        return sGipz63rTUmSj3uFDvOtzihao.CixTK5ZX8oWXHz34qHYV(this, d73WsmU258PapcWZb45SFW);
    }

    public final CancellationException SuB3hEmTmbbRGAhtvOOmfKEon() {
        CancellationException cancellationException;
        Object objO1xDAlBZZlZdoEf747lCFHld = O1xDAlBZZlZdoEf747lCFHld();
        if (!(objO1xDAlBZZlZdoEf747lCFHld instanceof Zx7RnIZpgrz4cpiLo1Z9tNIl)) {
            if (objO1xDAlBZZlZdoEf747lCFHld instanceof yVilYaP7xC) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objO1xDAlBZZlZdoEf747lCFHld instanceof XpG0A5IpJsSX9uJPSmP4WwTAl)) {
                return new JHTtgY8YA1mDJLk5P3f1Lj5sJwDiC(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((XpG0A5IpJsSX9uJPSmP4WwTAl) objO1xDAlBZZlZdoEf747lCFHld).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new JHTtgY8YA1mDJLk5P3f1Lj5sJwDiC(vBGA6pPLqSMuYGvprl270j7(), th, this) : cancellationException;
        }
        Throwable thV57tEvNfxZVVcOCAOih5PKr = ((Zx7RnIZpgrz4cpiLo1Z9tNIl) objO1xDAlBZZlZdoEf747lCFHld).V57tEvNfxZVVcOCAOih5PKr();
        if (thV57tEvNfxZVVcOCAOih5PKr == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thV57tEvNfxZVVcOCAOih5PKr instanceof CancellationException ? (CancellationException) thV57tEvNfxZVVcOCAOih5PKr : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = vBGA6pPLqSMuYGvprl270j7();
        }
        return new JHTtgY8YA1mDJLk5P3f1Lj5sJwDiC(strConcat, thV57tEvNfxZVVcOCAOih5PKr, this);
    }

    public boolean TaDO7ogis3aEiWEtq(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return ko09zE6UAgwkV(th) && pzqP2AqKW6J5PO8zCKnW();
    }

    public final boolean TqcnImqkSWIKht() {
        Object objO1xDAlBZZlZdoEf747lCFHld = O1xDAlBZZlZdoEf747lCFHld();
        if (objO1xDAlBZZlZdoEf747lCFHld instanceof XpG0A5IpJsSX9uJPSmP4WwTAl) {
            return true;
        }
        return (objO1xDAlBZZlZdoEf747lCFHld instanceof Zx7RnIZpgrz4cpiLo1Z9tNIl) && ((Zx7RnIZpgrz4cpiLo1Z9tNIl) objO1xDAlBZZlZdoEf747lCFHld).ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    @Override // com.vdodsodjsdt.sJ612dvaOBrP4lDkAwxzLpcxONSSp, com.vdodsodjsdt.dJaiaGWkeWaMlzD
    public void V57tEvNfxZVVcOCAOih5PKr(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JHTtgY8YA1mDJLk5P3f1Lj5sJwDiC(vBGA6pPLqSMuYGvprl270j7(), null, this);
        }
        jW7EiD0YL6xkbB158jMUzhWNWb1y(cancellationException);
    }

    @Override // com.vdodsodjsdt.sJ612dvaOBrP4lDkAwxzLpcxONSSp
    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        Object objO1xDAlBZZlZdoEf747lCFHld = O1xDAlBZZlZdoEf747lCFHld();
        return (objO1xDAlBZZlZdoEf747lCFHld instanceof yVilYaP7xC) && ((yVilYaP7xC) objO1xDAlBZZlZdoEf747lCFHld).VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public boolean aXO0LSrt8bKV() {
        return this instanceof EI2QRMxClng;
    }

    public boolean d9zDyyznnp3oaDT1Ug() {
        return this instanceof gQlBB3OHfTjE;
    }

    public final boolean f6ZQsR6bPLvvCDNXOUc(Throwable th) {
        if (d9zDyyznnp3oaDT1Ug()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        gHWGGkKBgoYQ6 ghwggkkbgoyq6 = (gHWGGkKBgoYQ6) ZfQNn8hdWlEQ5cR94249PDsLR.get(this);
        return (ghwggkkbgoyq6 == null || ghwggkkbgoyq6 == YiXsAgAUc8R5atJu.V57tEvNfxZVVcOCAOih5PKr) ? z : ghwggkkbgoyq6.V57tEvNfxZVVcOCAOih5PKr(th) || z;
    }

    @Override // com.vdodsodjsdt.RKQqw795jswHmdL5AnfuvmeBZD
    public final DenmIypSdw0qfxt getKey() {
        return IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    public final Object hKs1wlZyvtUNaW1f5ABIGacfPcvX(Object obj, Object obj2) {
        if (!(obj instanceof yVilYaP7xC)) {
            return zonOxHotd3BwAPJcwqr6I6uQNngg4.V57tEvNfxZVVcOCAOih5PKr;
        }
        if (((obj instanceof vLERWCl1n9NOnQZ6OlL) || (obj instanceof WQoBeERitBjo)) && !(obj instanceof RIKiCXKBHnfx4) && !(obj2 instanceof XpG0A5IpJsSX9uJPSmP4WwTAl)) {
            yVilYaP7xC yvilyap7xc = (yVilYaP7xC) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V57tEvNfxZVVcOCAOih5PKr;
            Object akpe9murf6nx5g5sqcg586xef = obj2 instanceof yVilYaP7xC ? new aKPe9mUrF6nx5g5SqCg586xeF((yVilYaP7xC) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, yvilyap7xc, akpe9murf6nx5g5sqcg586xef)) {
                if (atomicReferenceFieldUpdater.get(this) != yvilyap7xc) {
                    return zonOxHotd3BwAPJcwqr6I6uQNngg4.LaeGQIruHQu81hfJldjMOQSVblH3x;
                }
            }
            gBaBUmihn5l4u(obj2);
            Irh5auREsoeV1C1RaBamlmy(yvilyap7xc, obj2);
            return obj2;
        }
        yVilYaP7xC yvilyap7xc2 = (yVilYaP7xC) obj;
        bE55L7xKBxF2zT0ulQLMWyBrJjkx be55l7xkbxf2zt0ulqlmwybrjjkxVE4yDIjexsP2lGjLaTcB = vE4yDIjexsP2lGjLaTcB(yvilyap7xc2);
        if (be55l7xkbxf2zt0ulqlmwybrjjkxVE4yDIjexsP2lGjLaTcB == null) {
            return zonOxHotd3BwAPJcwqr6I6uQNngg4.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        RIKiCXKBHnfx4 rIKiCXKBHnfx4YdNRGRc4rly = null;
        Zx7RnIZpgrz4cpiLo1Z9tNIl zx7RnIZpgrz4cpiLo1Z9tNIl = yvilyap7xc2 instanceof Zx7RnIZpgrz4cpiLo1Z9tNIl ? (Zx7RnIZpgrz4cpiLo1Z9tNIl) yvilyap7xc2 : null;
        if (zx7RnIZpgrz4cpiLo1Z9tNIl == null) {
            zx7RnIZpgrz4cpiLo1Z9tNIl = new Zx7RnIZpgrz4cpiLo1Z9tNIl(be55l7xkbxf2zt0ulqlmwybrjjkxVE4yDIjexsP2lGjLaTcB, null);
        }
        synchronized (zx7RnIZpgrz4cpiLo1Z9tNIl) {
            if (zx7RnIZpgrz4cpiLo1Z9tNIl.zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
                return zonOxHotd3BwAPJcwqr6I6uQNngg4.V57tEvNfxZVVcOCAOih5PKr;
            }
            Zx7RnIZpgrz4cpiLo1Z9tNIl.ZfQNn8hdWlEQ5cR94249PDsLR.set(zx7RnIZpgrz4cpiLo1Z9tNIl, 1);
            if (zx7RnIZpgrz4cpiLo1Z9tNIl != yvilyap7xc2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = V57tEvNfxZVVcOCAOih5PKr;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, yvilyap7xc2, zx7RnIZpgrz4cpiLo1Z9tNIl)) {
                    if (atomicReferenceFieldUpdater2.get(this) != yvilyap7xc2) {
                        return zonOxHotd3BwAPJcwqr6I6uQNngg4.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    }
                }
            }
            boolean zZfQNn8hdWlEQ5cR94249PDsLR = zx7RnIZpgrz4cpiLo1Z9tNIl.ZfQNn8hdWlEQ5cR94249PDsLR();
            XpG0A5IpJsSX9uJPSmP4WwTAl xpG0A5IpJsSX9uJPSmP4WwTAl = obj2 instanceof XpG0A5IpJsSX9uJPSmP4WwTAl ? (XpG0A5IpJsSX9uJPSmP4WwTAl) obj2 : null;
            if (xpG0A5IpJsSX9uJPSmP4WwTAl != null) {
                zx7RnIZpgrz4cpiLo1Z9tNIl.zzpBGItXfub0yWj(xpG0A5IpJsSX9uJPSmP4WwTAl.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            }
            Throwable thV57tEvNfxZVVcOCAOih5PKr = zx7RnIZpgrz4cpiLo1Z9tNIl.V57tEvNfxZVVcOCAOih5PKr();
            if (zZfQNn8hdWlEQ5cR94249PDsLR) {
                thV57tEvNfxZVVcOCAOih5PKr = null;
            }
            if (thV57tEvNfxZVVcOCAOih5PKr != null) {
                wRCD0SdqWCowdYU7bmzN(be55l7xkbxf2zt0ulqlmwybrjjkxVE4yDIjexsP2lGjLaTcB, thV57tEvNfxZVVcOCAOih5PKr);
            }
            RIKiCXKBHnfx4 rIKiCXKBHnfx4 = yvilyap7xc2 instanceof RIKiCXKBHnfx4 ? (RIKiCXKBHnfx4) yvilyap7xc2 : null;
            if (rIKiCXKBHnfx4 == null) {
                bE55L7xKBxF2zT0ulQLMWyBrJjkx be55l7xkbxf2zt0ulqlmwybrjjkxLaeGQIruHQu81hfJldjMOQSVblH3x = yvilyap7xc2.LaeGQIruHQu81hfJldjMOQSVblH3x();
                if (be55l7xkbxf2zt0ulqlmwybrjjkxLaeGQIruHQu81hfJldjMOQSVblH3x != null) {
                    rIKiCXKBHnfx4YdNRGRc4rly = YdNRGRc4rly(be55l7xkbxf2zt0ulqlmwybrjjkxLaeGQIruHQu81hfJldjMOQSVblH3x);
                }
            } else {
                rIKiCXKBHnfx4YdNRGRc4rly = rIKiCXKBHnfx4;
            }
            if (rIKiCXKBHnfx4YdNRGRc4rly != null) {
                while (hRrPPME7ytOB7ba.jW7EiD0YL6xkbB158jMUzhWNWb1y(rIKiCXKBHnfx4YdNRGRc4rly.ZLZeBXTMq0zDztBxtRTuCHrapQ, false, new SAzqIT0PcHJZcPN72tCao7JZV(this, zx7RnIZpgrz4cpiLo1Z9tNIl, rIKiCXKBHnfx4YdNRGRc4rly, obj2), 1) == YiXsAgAUc8R5atJu.V57tEvNfxZVVcOCAOih5PKr) {
                    rIKiCXKBHnfx4YdNRGRc4rly = YdNRGRc4rly(rIKiCXKBHnfx4YdNRGRc4rly);
                    if (rIKiCXKBHnfx4YdNRGRc4rly == null) {
                    }
                }
                return zonOxHotd3BwAPJcwqr6I6uQNngg4.ZfQNn8hdWlEQ5cR94249PDsLR;
            }
            return qNPQb1obP7(zx7RnIZpgrz4cpiLo1Z9tNIl, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vdodsodjsdt.c5ORlH4Pzc4yAttMD7dLGkl48Uya iKANjmyTSxO6v6UuLPdu7DxOjlS(boolean r9, boolean r10, com.vdodsodjsdt.y44yd1lomoSgJ r11) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.fXGTDnUxIdCVHFvA63E.iKANjmyTSxO6v6UuLPdu7DxOjlS(boolean, boolean, com.vdodsodjsdt.y44yd1lomoSgJ):com.vdodsodjsdt.c5ORlH4Pzc4yAttMD7dLGkl48Uya");
    }

    public void jW7EiD0YL6xkbB158jMUzhWNWb1y(CancellationException cancellationException) {
        ko09zE6UAgwkV(cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r0
      0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ko09zE6UAgwkV(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.fXGTDnUxIdCVHFvA63E.ko09zE6UAgwkV(java.lang.Object):boolean");
    }

    public final void lQ0rO9lhQIyVe7Rp6(WQoBeERitBjo wQoBeERitBjo) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        bE55L7xKBxF2zT0ulQLMWyBrJjkx be55l7xkbxf2zt0ulqlmwybrjjkx = new bE55L7xKBxF2zT0ulQLMWyBrJjkx();
        wQoBeERitBjo.getClass();
        MkvBTCkp5aUsEYdslusuFmia.ZfQNn8hdWlEQ5cR94249PDsLR.set(be55l7xkbxf2zt0ulqlmwybrjjkx, wQoBeERitBjo);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = MkvBTCkp5aUsEYdslusuFmia.V57tEvNfxZVVcOCAOih5PKr;
        atomicReferenceFieldUpdater2.set(be55l7xkbxf2zt0ulqlmwybrjjkx, wQoBeERitBjo);
        loop0: while (true) {
            if (wQoBeERitBjo.NSjgqmGjEzuugn2SsG1mZFP() == wQoBeERitBjo) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(wQoBeERitBjo, wQoBeERitBjo, be55l7xkbxf2zt0ulqlmwybrjjkx)) {
                    if (atomicReferenceFieldUpdater2.get(wQoBeERitBjo) != wQoBeERitBjo) {
                        break;
                    }
                }
                be55l7xkbxf2zt0ulqlmwybrjjkx.ZLZeBXTMq0zDztBxtRTuCHrapQ(wQoBeERitBjo);
                break loop0;
            }
            break;
        }
        MkvBTCkp5aUsEYdslusuFmia mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn = wQoBeERitBjo.GI83zq0G8e7zkn();
        do {
            atomicReferenceFieldUpdater = V57tEvNfxZVVcOCAOih5PKr;
            if (atomicReferenceFieldUpdater.compareAndSet(this, wQoBeERitBjo, mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == wQoBeERitBjo);
    }

    public void pYmKDYlAmhudp(Object obj) {
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(obj);
    }

    public boolean pzqP2AqKW6J5PO8zCKnW() {
        return true;
    }

    @Override // com.vdodsodjsdt.D73WsmU258PapcWZb45SFW
    public final RKQqw795jswHmdL5AnfuvmeBZD q11o1hieEkZDhF1MGOZI26oZiDT(DenmIypSdw0qfxt denmIypSdw0qfxt) {
        return sGipz63rTUmSj3uFDvOtzihao.ko09zE6UAgwkV(this, denmIypSdw0qfxt);
    }

    public final Object qNPQb1obP7(Zx7RnIZpgrz4cpiLo1Z9tNIl zx7RnIZpgrz4cpiLo1Z9tNIl, Object obj) {
        Object obj2 = null;
        Throwable jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC = null;
        XpG0A5IpJsSX9uJPSmP4WwTAl xpG0A5IpJsSX9uJPSmP4WwTAl = obj instanceof XpG0A5IpJsSX9uJPSmP4WwTAl ? (XpG0A5IpJsSX9uJPSmP4WwTAl) obj : null;
        Throwable th = xpG0A5IpJsSX9uJPSmP4WwTAl != null ? xpG0A5IpJsSX9uJPSmP4WwTAl.VxUQ9tBhpHJ2AAEDNW8sghc4m : null;
        synchronized (zx7RnIZpgrz4cpiLo1Z9tNIl) {
            zx7RnIZpgrz4cpiLo1Z9tNIl.ZfQNn8hdWlEQ5cR94249PDsLR();
            ArrayList arrayListZLZeBXTMq0zDztBxtRTuCHrapQ = zx7RnIZpgrz4cpiLo1Z9tNIl.ZLZeBXTMq0zDztBxtRTuCHrapQ(th);
            if (!arrayListZLZeBXTMq0zDztBxtRTuCHrapQ.isEmpty()) {
                int size = arrayListZLZeBXTMq0zDztBxtRTuCHrapQ.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj3 = arrayListZLZeBXTMq0zDztBxtRTuCHrapQ.get(i);
                    i++;
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC = (Throwable) obj2;
                if (jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC == null) {
                    jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC = (Throwable) arrayListZLZeBXTMq0zDztBxtRTuCHrapQ.get(0);
                }
            } else if (zx7RnIZpgrz4cpiLo1Z9tNIl.ZfQNn8hdWlEQ5cR94249PDsLR()) {
                jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC = new JHTtgY8YA1mDJLk5P3f1Lj5sJwDiC(vBGA6pPLqSMuYGvprl270j7(), null, this);
            }
            if (jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC != null && arrayListZLZeBXTMq0zDztBxtRTuCHrapQ.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListZLZeBXTMq0zDztBxtRTuCHrapQ.size()));
                int size2 = arrayListZLZeBXTMq0zDztBxtRTuCHrapQ.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj4 = arrayListZLZeBXTMq0zDztBxtRTuCHrapQ.get(i2);
                    i2++;
                    Throwable th2 = (Throwable) obj4;
                    if (th2 != jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC && th2 != jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        sGipz63rTUmSj3uFDvOtzihao.LaeGQIruHQu81hfJldjMOQSVblH3x(jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC, th2);
                    }
                }
            }
        }
        if (jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC != null && jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC != th) {
            obj = new XpG0A5IpJsSX9uJPSmP4WwTAl(jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC, false);
        }
        if (jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC != null && (f6ZQsR6bPLvvCDNXOUc(jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC) || HVEwbdULInpTNa0IG(jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC))) {
            ej6unYlOWMDF.Ca81ebIan1u(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            XpG0A5IpJsSX9uJPSmP4WwTAl.zzpBGItXfub0yWj.compareAndSet((XpG0A5IpJsSX9uJPSmP4WwTAl) obj, 0, 1);
        }
        gBaBUmihn5l4u(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V57tEvNfxZVVcOCAOih5PKr;
        Object akpe9murf6nx5g5sqcg586xef = obj instanceof yVilYaP7xC ? new aKPe9mUrF6nx5g5SqCg586xeF((yVilYaP7xC) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, zx7RnIZpgrz4cpiLo1Z9tNIl, akpe9murf6nx5g5sqcg586xef) && atomicReferenceFieldUpdater.get(this) == zx7RnIZpgrz4cpiLo1Z9tNIl) {
        }
        Irh5auREsoeV1C1RaBamlmy(zx7RnIZpgrz4cpiLo1Z9tNIl, obj);
        return obj;
    }

    public final void qygqjTppWwx992(sJ612dvaOBrP4lDkAwxzLpcxONSSp sj612dvaobrp4ldkawxzlpcxonssp) {
        int iJUdwvN8LfOMa;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ZfQNn8hdWlEQ5cR94249PDsLR;
        YiXsAgAUc8R5atJu yiXsAgAUc8R5atJu = YiXsAgAUc8R5atJu.V57tEvNfxZVVcOCAOih5PKr;
        if (sj612dvaobrp4ldkawxzlpcxonssp == null) {
            atomicReferenceFieldUpdater.set(this, yiXsAgAUc8R5atJu);
            return;
        }
        fXGTDnUxIdCVHFvA63E fxgtdnuxidcvhfva63e = (fXGTDnUxIdCVHFvA63E) sj612dvaobrp4ldkawxzlpcxonssp;
        do {
            iJUdwvN8LfOMa = fxgtdnuxidcvhfva63e.JUdwvN8LfOMa(fxgtdnuxidcvhfva63e.O1xDAlBZZlZdoEf747lCFHld());
            if (iJUdwvN8LfOMa == 0) {
                break;
            }
        } while (iJUdwvN8LfOMa != 1);
        gHWGGkKBgoYQ6 ghwggkkbgoyq6 = (gHWGGkKBgoYQ6) hRrPPME7ytOB7ba.jW7EiD0YL6xkbB158jMUzhWNWb1y(fxgtdnuxidcvhfva63e, true, new RIKiCXKBHnfx4(this), 2);
        atomicReferenceFieldUpdater.set(this, ghwggkkbgoyq6);
        if (O1xDAlBZZlZdoEf747lCFHld() instanceof yVilYaP7xC) {
            return;
        }
        ghwggkkbgoyq6.zzpBGItXfub0yWj();
        atomicReferenceFieldUpdater.set(this, yiXsAgAUc8R5atJu);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + ItrQwCXbty5PZtje5JS(O1xDAlBZZlZdoEf747lCFHld()) + '}');
        sb.append('@');
        sb.append(hRrPPME7ytOB7ba.KUYypEB4eNWOZWVDpH(this));
        return sb.toString();
    }

    public String vBGA6pPLqSMuYGvprl270j7() {
        return "Job was cancelled";
    }

    public final bE55L7xKBxF2zT0ulQLMWyBrJjkx vE4yDIjexsP2lGjLaTcB(yVilYaP7xC yvilyap7xc) {
        bE55L7xKBxF2zT0ulQLMWyBrJjkx be55l7xkbxf2zt0ulqlmwybrjjkxLaeGQIruHQu81hfJldjMOQSVblH3x = yvilyap7xc.LaeGQIruHQu81hfJldjMOQSVblH3x();
        if (be55l7xkbxf2zt0ulqlmwybrjjkxLaeGQIruHQu81hfJldjMOQSVblH3x != null) {
            return be55l7xkbxf2zt0ulqlmwybrjjkxLaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        if (yvilyap7xc instanceof vLERWCl1n9NOnQZ6OlL) {
            return new bE55L7xKBxF2zT0ulQLMWyBrJjkx();
        }
        if (yvilyap7xc instanceof WQoBeERitBjo) {
            lQ0rO9lhQIyVe7Rp6((WQoBeERitBjo) yvilyap7xc);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + yvilyap7xc).toString());
    }

    public final Throwable w0Wu95l8dVNw5rZMRu(Object obj) {
        Throwable thV57tEvNfxZVVcOCAOih5PKr;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        fXGTDnUxIdCVHFvA63E fxgtdnuxidcvhfva63e = (fXGTDnUxIdCVHFvA63E) ((VasJmAsPXegpf) obj);
        Object objO1xDAlBZZlZdoEf747lCFHld = fxgtdnuxidcvhfva63e.O1xDAlBZZlZdoEf747lCFHld();
        if (objO1xDAlBZZlZdoEf747lCFHld instanceof Zx7RnIZpgrz4cpiLo1Z9tNIl) {
            thV57tEvNfxZVVcOCAOih5PKr = ((Zx7RnIZpgrz4cpiLo1Z9tNIl) objO1xDAlBZZlZdoEf747lCFHld).V57tEvNfxZVVcOCAOih5PKr();
        } else if (objO1xDAlBZZlZdoEf747lCFHld instanceof XpG0A5IpJsSX9uJPSmP4WwTAl) {
            thV57tEvNfxZVVcOCAOih5PKr = ((XpG0A5IpJsSX9uJPSmP4WwTAl) objO1xDAlBZZlZdoEf747lCFHld).VxUQ9tBhpHJ2AAEDNW8sghc4m;
        } else {
            if (objO1xDAlBZZlZdoEf747lCFHld instanceof yVilYaP7xC) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objO1xDAlBZZlZdoEf747lCFHld).toString());
            }
            thV57tEvNfxZVVcOCAOih5PKr = null;
        }
        CancellationException cancellationException = thV57tEvNfxZVVcOCAOih5PKr instanceof CancellationException ? (CancellationException) thV57tEvNfxZVVcOCAOih5PKr : null;
        return cancellationException == null ? new JHTtgY8YA1mDJLk5P3f1Lj5sJwDiC("Parent job is ".concat(ItrQwCXbty5PZtje5JS(objO1xDAlBZZlZdoEf747lCFHld)), thV57tEvNfxZVVcOCAOih5PKr, fxgtdnuxidcvhfva63e) : cancellationException;
    }

    public final void wRCD0SdqWCowdYU7bmzN(bE55L7xKBxF2zT0ulQLMWyBrJjkx be55l7xkbxf2zt0ulqlmwybrjjkx, Throwable th) {
        Object objNSjgqmGjEzuugn2SsG1mZFP = be55l7xkbxf2zt0ulqlmwybrjjkx.NSjgqmGjEzuugn2SsG1mZFP();
        ej6unYlOWMDF.Ca81ebIan1u(objNSjgqmGjEzuugn2SsG1mZFP, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        Eyg9qHiQ9Ki1REKbbd3J eyg9qHiQ9Ki1REKbbd3J = null;
        for (MkvBTCkp5aUsEYdslusuFmia mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn = (MkvBTCkp5aUsEYdslusuFmia) objNSjgqmGjEzuugn2SsG1mZFP; !mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn.equals(be55l7xkbxf2zt0ulqlmwybrjjkx); mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn = mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn.GI83zq0G8e7zkn()) {
            if (mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn instanceof YpK8O6cKlAROnyPP26zLuvHCd) {
                WQoBeERitBjo wQoBeERitBjo = (WQoBeERitBjo) mkvBTCkp5aUsEYdslusuFmiaGI83zq0G8e7zkn;
                try {
                    wQoBeERitBjo.ZfQNn8hdWlEQ5cR94249PDsLR(th);
                } catch (Throwable th2) {
                    if (eyg9qHiQ9Ki1REKbbd3J != null) {
                        sGipz63rTUmSj3uFDvOtzihao.LaeGQIruHQu81hfJldjMOQSVblH3x(eyg9qHiQ9Ki1REKbbd3J, th2);
                    } else {
                        eyg9qHiQ9Ki1REKbbd3J = new Eyg9qHiQ9Ki1REKbbd3J("Exception in completion handler " + wQoBeERitBjo + " for " + this, th2);
                    }
                }
            }
        }
        if (eyg9qHiQ9Ki1REKbbd3J != null) {
            y1NaPKTl7R18DOr6e8i5(eyg9qHiQ9Ki1REKbbd3J);
        }
        f6ZQsR6bPLvvCDNXOUc(th);
    }

    public final Object ymT6yQrus3w(Object obj) {
        Object objHKs1wlZyvtUNaW1f5ABIGacfPcvX;
        do {
            objHKs1wlZyvtUNaW1f5ABIGacfPcvX = hKs1wlZyvtUNaW1f5ABIGacfPcvX(O1xDAlBZZlZdoEf747lCFHld(), obj);
            if (objHKs1wlZyvtUNaW1f5ABIGacfPcvX == zonOxHotd3BwAPJcwqr6I6uQNngg4.V57tEvNfxZVVcOCAOih5PKr) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                XpG0A5IpJsSX9uJPSmP4WwTAl xpG0A5IpJsSX9uJPSmP4WwTAl = obj instanceof XpG0A5IpJsSX9uJPSmP4WwTAl ? (XpG0A5IpJsSX9uJPSmP4WwTAl) obj : null;
                throw new IllegalStateException(str, xpG0A5IpJsSX9uJPSmP4WwTAl != null ? xpG0A5IpJsSX9uJPSmP4WwTAl.VxUQ9tBhpHJ2AAEDNW8sghc4m : null);
            }
        } while (objHKs1wlZyvtUNaW1f5ABIGacfPcvX == zonOxHotd3BwAPJcwqr6I6uQNngg4.LaeGQIruHQu81hfJldjMOQSVblH3x);
        return objHKs1wlZyvtUNaW1f5ABIGacfPcvX;
    }

    public void L8DMw02rUTs2w() {
    }

    public void gBaBUmihn5l4u(Object obj) {
    }

    public void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Object obj) {
    }

    public void y1NaPKTl7R18DOr6e8i5(Eyg9qHiQ9Ki1REKbbd3J eyg9qHiQ9Ki1REKbbd3J) {
        throw eyg9qHiQ9Ki1REKbbd3J;
    }
}
