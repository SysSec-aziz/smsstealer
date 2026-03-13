package com.vdodsodjsdt;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class qKXCIJM1cKNm0a1RAvamOBOVLgp extends sSTjsLE9Ugp7iXfnwi18Akn1Jt implements Map {
    public IHdknyZ177JO NSjgqmGjEzuugn2SsG1mZFP;
    public zY2Z4yXY3n ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public ZkTXEuwYyyqv zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qKXCIJM1cKNm0a1RAvamOBOVLgp(sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt) {
        super(0);
        int i = sstjsle9ugp7ixfnwi18akn1jt.LaeGQIruHQu81hfJldjMOQSVblH3x;
        zzpBGItXfub0yWj(this.LaeGQIruHQu81hfJldjMOQSVblH3x + i);
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(sstjsle9ugp7ixfnwi18akn1jt.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2), sstjsle9ugp7ixfnwi18akn1jt.GI83zq0G8e7zkn(i2));
            }
        } else if (i > 0) {
            vmp19D2MODlOL.HAPpjhiCsV9ONY23505HCBI9IX(0, 0, i, sstjsle9ugp7ixfnwi18akn1jt.V57tEvNfxZVVcOCAOih5PKr, this.V57tEvNfxZVVcOCAOih5PKr);
            vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(sstjsle9ugp7ixfnwi18akn1jt.ZfQNn8hdWlEQ5cR94249PDsLR, this.ZfQNn8hdWlEQ5cR94249PDsLR, 0, 0, i << 1);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
        }
    }

    public final boolean HzCpKshMOoaw76hFcbOVRYMeRd(Collection collection) {
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public final boolean M9e7PWhFYLD2lOGMker(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        ZkTXEuwYyyqv zkTXEuwYyyqv = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (zkTXEuwYyyqv != null) {
            return zkTXEuwYyyqv;
        }
        ZkTXEuwYyyqv zkTXEuwYyyqv2 = new ZkTXEuwYyyqv(this, 0);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = zkTXEuwYyyqv2;
        return zkTXEuwYyyqv2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zY2Z4yXY3n zy2z4yxy3n = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (zy2z4yxy3n != null) {
            return zy2z4yxy3n;
        }
        zY2Z4yXY3n zy2z4yxy3n2 = new zY2Z4yXY3n(this);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = zy2z4yxy3n2;
        return zy2z4yxy3n2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zzpBGItXfub0yWj(map.size() + this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        IHdknyZ177JO iHdknyZ177JO = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (iHdknyZ177JO != null) {
            return iHdknyZ177JO;
        }
        IHdknyZ177JO iHdknyZ177JO2 = new IHdknyZ177JO(this);
        this.NSjgqmGjEzuugn2SsG1mZFP = iHdknyZ177JO2;
        return iHdknyZ177JO2;
    }
}
