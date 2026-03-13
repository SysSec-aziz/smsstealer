package com.vdodsodjsdt;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class UGdIdpErCW3yV extends AbstractSet {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ qghLaWjSIb75x516bG5Bx3f6NsAy ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ UGdIdpErCW3yV(qghLaWjSIb75x516bG5Bx3f6NsAy qghlawjsib75x516bg5bx3f6nsay, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = qghlawjsib75x516bg5bx3f6nsay;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.clear();
                break;
            default:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        AFFHICUFcvabTydqa5fiI aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                qghLaWjSIb75x516bG5Bx3f6NsAy qghlawjsib75x516bg5bx3f6nsay = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                AFFHICUFcvabTydqa5fiI aFFHICUFcvabTydqa5fiI = null;
                if (key != null) {
                    try {
                        aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m = qghlawjsib75x516bg5bx3f6nsay.VxUQ9tBhpHJ2AAEDNW8sghc4m(key, false);
                    } catch (ClassCastException unused) {
                        aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m = null;
                    }
                    break;
                } else {
                    aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m = null;
                }
                if (aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m != null && Objects.equals(aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker, entry.getValue())) {
                    aFFHICUFcvabTydqa5fiI = aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m;
                }
                return aFFHICUFcvabTydqa5fiI != null;
            default:
                return this.ZfQNn8hdWlEQ5cR94249PDsLR.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                return new NNss8hexSyKT03dohpPoXWbKv9(this.ZfQNn8hdWlEQ5cR94249PDsLR, 0);
            default:
                return new NNss8hexSyKT03dohpPoXWbKv9(this.ZfQNn8hdWlEQ5cR94249PDsLR, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        AFFHICUFcvabTydqa5fiI aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    qghLaWjSIb75x516bG5Bx3f6NsAy qghlawjsib75x516bg5bx3f6nsay = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    AFFHICUFcvabTydqa5fiI aFFHICUFcvabTydqa5fiI = null;
                    if (key != null) {
                        try {
                            aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m = qghlawjsib75x516bg5bx3f6nsay.VxUQ9tBhpHJ2AAEDNW8sghc4m(key, false);
                        } catch (ClassCastException unused) {
                            aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m = null;
                        }
                    } else {
                        aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m = null;
                    }
                    if (aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m != null && Objects.equals(aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker, entry.getValue())) {
                        aFFHICUFcvabTydqa5fiI = aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m;
                    }
                    if (aFFHICUFcvabTydqa5fiI != null) {
                        qghlawjsib75x516bg5bx3f6nsay.V57tEvNfxZVVcOCAOih5PKr(aFFHICUFcvabTydqa5fiI, true);
                        break;
                    }
                    break;
                }
                break;
            default:
                qghLaWjSIb75x516bG5Bx3f6NsAy qghlawjsib75x516bg5bx3f6nsay2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                AFFHICUFcvabTydqa5fiI aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m2 = null;
                if (obj != null) {
                    try {
                        aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m2 = qghlawjsib75x516bg5bx3f6nsay2.VxUQ9tBhpHJ2AAEDNW8sghc4m(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m2 != null) {
                    qghlawjsib75x516bg5bx3f6nsay2.V57tEvNfxZVVcOCAOih5PKr(aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m2, true);
                }
                if (aFFHICUFcvabTydqa5fiIVxUQ9tBhpHJ2AAEDNW8sghc4m2 != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
        }
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }
}
