package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class RTPFSJiwiLgiPf {
    public final IfFMrI1zTS7HZ2joFZe VxUQ9tBhpHJ2AAEDNW8sghc4m;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater zzpBGItXfub0yWj = AtomicReferenceFieldUpdater.newUpdater(RTPFSJiwiLgiPf.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater V57tEvNfxZVVcOCAOih5PKr = AtomicLongFieldUpdater.newUpdater(RTPFSJiwiLgiPf.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater ZfQNn8hdWlEQ5cR94249PDsLR = AtomicReferenceFieldUpdater.newUpdater(RTPFSJiwiLgiPf.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater LaeGQIruHQu81hfJldjMOQSVblH3x = AtomicLongFieldUpdater.newUpdater(RTPFSJiwiLgiPf.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater zIvmSL0wzmmKGc3X39b2Gw2mUGE = AtomicIntegerFieldUpdater.newUpdater(RTPFSJiwiLgiPf.class, "_availablePermits$volatile");

    public RTPFSJiwiLgiPf() {
        Bl7ODJiHrp4TmMdwy bl7ODJiHrp4TmMdwy = new Bl7ODJiHrp4TmMdwy(0L, null, 2);
        this.head$volatile = bl7ODJiHrp4TmMdwy;
        this.tail$volatile = bl7ODJiHrp4TmMdwy;
        this._availablePermits$volatile = 1;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new IfFMrI1zTS7HZ2joFZe(3, this);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(vSoeLg9O51k4mCoTrC0t0oz7gxJ vsoelg9o51k4mcotrc0t0oz7gxj) {
        Object objCa81ebIan1u;
        Bl7ODJiHrp4TmMdwy bl7ODJiHrp4TmMdwy;
        YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW = vsoelg9o51k4mcotrc0t0oz7gxj.V57tEvNfxZVVcOCAOih5PKr;
        mv3vFEOSdV1XBcy mv3vfeosdv1xbcy = vsoelg9o51k4mcotrc0t0oz7gxj.ZfQNn8hdWlEQ5cR94249PDsLR;
        while (true) {
            int andDecrement = zIvmSL0wzmmKGc3X39b2Gw2mUGE.getAndDecrement(this);
            if (andDecrement <= 1) {
                hMtEZx9LFZEOBsEChkiRKnXNYh1GG hmtezx9lfzeobsechkirknxnyh1gg = hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (andDecrement > 0) {
                    mv3vFEOSdV1XBcy.ZLZeBXTMq0zDztBxtRTuCHrapQ.set(mv3vfeosdv1xbcy, null);
                    yAf4BMDpiCAb4hYaN6VqW.pzqP2AqKW6J5PO8zCKnW(hmtezx9lfzeobsechkirknxnyh1gg, new dGob7wo5oc(mv3vfeosdv1xbcy, vsoelg9o51k4mcotrc0t0oz7gxj, 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ZfQNn8hdWlEQ5cR94249PDsLR;
                Bl7ODJiHrp4TmMdwy bl7ODJiHrp4TmMdwy2 = (Bl7ODJiHrp4TmMdwy) atomicReferenceFieldUpdater.get(this);
                long andIncrement = LaeGQIruHQu81hfJldjMOQSVblH3x.getAndIncrement(this);
                NYihQR5J4Ddq783hiKSMl nYihQR5J4Ddq783hiKSMl = NYihQR5J4Ddq783hiKSMl.HzCpKshMOoaw76hFcbOVRYMeRd;
                long j = andIncrement / ((long) RVLjWWJLZjS5NgGskpi.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                while (true) {
                    objCa81ebIan1u = KfeOQNOupsCg6878zi4e.Ca81ebIan1u(bl7ODJiHrp4TmMdwy2, j, nYihQR5J4Ddq783hiKSMl);
                    if (!F44whnLsbQ.y1NaPKTl7R18DOr6e8i5(objCa81ebIan1u)) {
                        fw6arzf1nhE87EaA fw6arzf1nhe87eaaAXO0LSrt8bKV = F44whnLsbQ.aXO0LSrt8bKV(objCa81ebIan1u);
                        while (true) {
                            fw6arzf1nhE87EaA fw6arzf1nhe87eaa = (fw6arzf1nhE87EaA) atomicReferenceFieldUpdater.get(this);
                            bl7ODJiHrp4TmMdwy = bl7ODJiHrp4TmMdwy2;
                            if (fw6arzf1nhe87eaa.V57tEvNfxZVVcOCAOih5PKr >= fw6arzf1nhe87eaaAXO0LSrt8bKV.V57tEvNfxZVVcOCAOih5PKr) {
                                break;
                            }
                            if (!fw6arzf1nhe87eaaAXO0LSrt8bKV.GI83zq0G8e7zkn()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, fw6arzf1nhe87eaa, fw6arzf1nhe87eaaAXO0LSrt8bKV)) {
                                if (atomicReferenceFieldUpdater.get(this) != fw6arzf1nhe87eaa) {
                                    if (fw6arzf1nhe87eaaAXO0LSrt8bKV.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
                                        fw6arzf1nhe87eaaAXO0LSrt8bKV.ZfQNn8hdWlEQ5cR94249PDsLR();
                                    }
                                    bl7ODJiHrp4TmMdwy2 = bl7ODJiHrp4TmMdwy;
                                }
                            }
                            if (fw6arzf1nhe87eaa.LaeGQIruHQu81hfJldjMOQSVblH3x()) {
                                fw6arzf1nhe87eaa.ZfQNn8hdWlEQ5cR94249PDsLR();
                            }
                        }
                    } else {
                        break;
                    }
                    bl7ODJiHrp4TmMdwy2 = bl7ODJiHrp4TmMdwy;
                }
                Bl7ODJiHrp4TmMdwy bl7ODJiHrp4TmMdwy3 = (Bl7ODJiHrp4TmMdwy) F44whnLsbQ.aXO0LSrt8bKV(objCa81ebIan1u);
                AtomicReferenceArray atomicReferenceArray = bl7ODJiHrp4TmMdwy3.LaeGQIruHQu81hfJldjMOQSVblH3x;
                int i = (int) (andIncrement % ((long) RVLjWWJLZjS5NgGskpi.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
                while (!atomicReferenceArray.compareAndSet(i, null, vsoelg9o51k4mcotrc0t0oz7gxj)) {
                    if (atomicReferenceArray.get(i) != null) {
                        aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = RVLjWWJLZjS5NgGskpi.zzpBGItXfub0yWj;
                        aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn2 = RVLjWWJLZjS5NgGskpi.V57tEvNfxZVVcOCAOih5PKr;
                        while (!atomicReferenceArray.compareAndSet(i, aqhhl68tqrgijcmgb3dy2ylk3vn, aqhhl68tqrgijcmgb3dy2ylk3vn2)) {
                            if (atomicReferenceArray.get(i) != aqhhl68tqrgijcmgb3dy2ylk3vn) {
                                break;
                            }
                        }
                        mv3vFEOSdV1XBcy.ZLZeBXTMq0zDztBxtRTuCHrapQ.set(mv3vfeosdv1xbcy, null);
                        yAf4BMDpiCAb4hYaN6VqW.pzqP2AqKW6J5PO8zCKnW(hmtezx9lfzeobsechkirknxnyh1gg, new dGob7wo5oc(mv3vfeosdv1xbcy, vsoelg9o51k4mcotrc0t0oz7gxj, 0));
                        return;
                    }
                }
                vsoelg9o51k4mcotrc0t0oz7gxj.VxUQ9tBhpHJ2AAEDNW8sghc4m(bl7ODJiHrp4TmMdwy3, i);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzpBGItXfub0yWj() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.RTPFSJiwiLgiPf.zzpBGItXfub0yWj():void");
    }
}
