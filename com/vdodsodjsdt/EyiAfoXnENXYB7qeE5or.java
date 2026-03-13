package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class EyiAfoXnENXYB7qeE5or extends vmvq6zBvL5vDs769GOziPuOHStf implements kV9dc7w7Nc0PfM4UyhGRMf7VCm7, jDNq5zhgCb57UDl, Q1zAhWfgG5v13hOK, B0laohnjL8cmtv {
    public static final /* synthetic */ AtomicReferenceFieldUpdater ZLZeBXTMq0zDztBxtRTuCHrapQ = AtomicReferenceFieldUpdater.newUpdater(EyiAfoXnENXYB7qeE5or.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public EyiAfoXnENXYB7qeE5or(Object obj) {
        this._state$volatile = obj;
    }

    public final boolean V57tEvNfxZVVcOCAOih5PKr(Object obj, Object obj2) {
        int i;
        BPAd2tzawZHoqQ5UTePcGhoxp0t[] bPAd2tzawZHoqQ5UTePcGhoxp0tArr;
        aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ZLZeBXTMq0zDztBxtRTuCHrapQ;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj3, obj)) {
                return false;
            }
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if ((i2 & 1) != 0) {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i3;
            BPAd2tzawZHoqQ5UTePcGhoxp0t[] bPAd2tzawZHoqQ5UTePcGhoxp0tArr2 = this.V57tEvNfxZVVcOCAOih5PKr;
            while (true) {
                if (bPAd2tzawZHoqQ5UTePcGhoxp0tArr2 != null) {
                    for (BPAd2tzawZHoqQ5UTePcGhoxp0t bPAd2tzawZHoqQ5UTePcGhoxp0t : bPAd2tzawZHoqQ5UTePcGhoxp0tArr2) {
                        if (bPAd2tzawZHoqQ5UTePcGhoxp0t != null) {
                            AtomicReference atomicReference = bPAd2tzawZHoqQ5UTePcGhoxp0t.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (aqhhl68tqrgijcmgb3dy2ylk3vn = F44whnLsbQ.M9e7PWhFYLD2lOGMker)) {
                                    aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn2 = F44whnLsbQ.GI83zq0G8e7zkn;
                                    if (obj4 != aqhhl68tqrgijcmgb3dy2ylk3vn2) {
                                        while (!atomicReference.compareAndSet(obj4, aqhhl68tqrgijcmgb3dy2ylk3vn2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((YAf4BMDpiCAb4hYaN6VqW) obj4).ZLZeBXTMq0zDztBxtRTuCHrapQ(hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, aqhhl68tqrgijcmgb3dy2ylk3vn)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                    if (i == i3) {
                        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i3 + 1;
                        return true;
                    }
                    bPAd2tzawZHoqQ5UTePcGhoxp0tArr = this.V57tEvNfxZVVcOCAOih5PKr;
                }
                bPAd2tzawZHoqQ5UTePcGhoxp0tArr2 = bPAd2tzawZHoqQ5UTePcGhoxp0tArr;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0148, code lost:
    
        if (r4 != r3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0145, code lost:
    
        if (r5 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00c7, B:52:0x00cf, B:55:0x00d6, B:56:0x00dc, B:58:0x00df, B:68:0x0100, B:71:0x0110, B:72:0x012c, B:78:0x013c, B:75:0x0133, B:77:0x0139, B:60:0x00e5, B:64:0x00ec, B:21:0x0054, B:24:0x005f, B:49:0x00b7), top: B:102:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00c7, B:52:0x00cf, B:55:0x00d6, B:56:0x00dc, B:58:0x00df, B:68:0x0100, B:71:0x0110, B:72:0x012c, B:78:0x013c, B:75:0x0133, B:77:0x0139, B:60:0x00e5, B:64:0x00ec, B:21:0x0054, B:24:0x005f, B:49:0x00b7), top: B:102:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0110 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00c7, B:52:0x00cf, B:55:0x00d6, B:56:0x00dc, B:58:0x00df, B:68:0x0100, B:71:0x0110, B:72:0x012c, B:78:0x013c, B:75:0x0133, B:77:0x0139, B:60:0x00e5, B:64:0x00ec, B:21:0x0054, B:24:0x005f, B:49:0x00b7), top: B:102:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x010f -> B:50:0x00c7). Please report as a decompilation issue!!! */
    @Override // com.vdodsodjsdt.jDNq5zhgCb57UDl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object VxUQ9tBhpHJ2AAEDNW8sghc4m(com.vdodsodjsdt.Q1zAhWfgG5v13hOK r18, com.vdodsodjsdt.IvfXhmjM3e3K r19) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.EyiAfoXnENXYB7qeE5or.VxUQ9tBhpHJ2AAEDNW8sghc4m(com.vdodsodjsdt.Q1zAhWfgG5v13hOK, com.vdodsodjsdt.IvfXhmjM3e3K):java.lang.Object");
    }

    @Override // com.vdodsodjsdt.Q1zAhWfgG5v13hOK
    public final Object zIvmSL0wzmmKGc3X39b2Gw2mUGE(Object obj, tfu79AIgc4CGAZaxd4HhD tfu79aigc4cgazaxd4hhd) {
        if (obj == null) {
            obj = zonOxHotd3BwAPJcwqr6I6uQNngg4.M9e7PWhFYLD2lOGMker;
        }
        V57tEvNfxZVVcOCAOih5PKr(null, obj);
        return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    @Override // com.vdodsodjsdt.B0laohnjL8cmtv
    public final jDNq5zhgCb57UDl zzpBGItXfub0yWj(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, int i, UVzEPm75LoPBkSIomQaI29asGliB uVzEPm75LoPBkSIomQaI29asGliB) {
        return ((((i < 0 || i >= 2) && i != -2) || uVzEPm75LoPBkSIomQaI29asGliB != UVzEPm75LoPBkSIomQaI29asGliB.ZfQNn8hdWlEQ5cR94249PDsLR) && !((i == 0 || i == -3) && uVzEPm75LoPBkSIomQaI29asGliB == UVzEPm75LoPBkSIomQaI29asGliB.V57tEvNfxZVVcOCAOih5PKr)) ? new JEwf8Zp1w4QB83(this, d73WsmU258PapcWZb45SFW, i, uVzEPm75LoPBkSIomQaI29asGliB) : this;
    }
}
