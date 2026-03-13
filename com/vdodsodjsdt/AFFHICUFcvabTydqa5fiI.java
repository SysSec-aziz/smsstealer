package com.vdodsodjsdt;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class AFFHICUFcvabTydqa5fiI implements Map.Entry {
    public final boolean GI83zq0G8e7zkn;
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public AFFHICUFcvabTydqa5fiI LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Object M9e7PWhFYLD2lOGMker;
    public final Object NSjgqmGjEzuugn2SsG1mZFP;
    public AFFHICUFcvabTydqa5fiI V57tEvNfxZVVcOCAOih5PKr;
    public AFFHICUFcvabTydqa5fiI ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public AFFHICUFcvabTydqa5fiI ZfQNn8hdWlEQ5cR94249PDsLR;
    public AFFHICUFcvabTydqa5fiI zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public AFFHICUFcvabTydqa5fiI(boolean z) {
        this.NSjgqmGjEzuugn2SsG1mZFP = null;
        this.GI83zq0G8e7zkn = z;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = this;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.NSjgqmGjEzuugn2SsG1mZFP;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.M9e7PWhFYLD2lOGMker;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.M9e7PWhFYLD2lOGMker;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.NSjgqmGjEzuugn2SsG1mZFP;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.M9e7PWhFYLD2lOGMker;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.GI83zq0G8e7zkn) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.M9e7PWhFYLD2lOGMker;
        this.M9e7PWhFYLD2lOGMker = obj;
        return obj2;
    }

    public final String toString() {
        return this.NSjgqmGjEzuugn2SsG1mZFP + "=" + this.M9e7PWhFYLD2lOGMker;
    }

    public AFFHICUFcvabTydqa5fiI(boolean z, AFFHICUFcvabTydqa5fiI aFFHICUFcvabTydqa5fiI, Object obj, AFFHICUFcvabTydqa5fiI aFFHICUFcvabTydqa5fiI2, AFFHICUFcvabTydqa5fiI aFFHICUFcvabTydqa5fiI3) {
        this.V57tEvNfxZVVcOCAOih5PKr = aFFHICUFcvabTydqa5fiI;
        this.NSjgqmGjEzuugn2SsG1mZFP = obj;
        this.GI83zq0G8e7zkn = z;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = 1;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = aFFHICUFcvabTydqa5fiI2;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = aFFHICUFcvabTydqa5fiI3;
        aFFHICUFcvabTydqa5fiI3.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this;
        aFFHICUFcvabTydqa5fiI2.ZLZeBXTMq0zDztBxtRTuCHrapQ = this;
    }
}
