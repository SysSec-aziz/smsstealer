package com.vdodsodjsdt;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ZkTXEuwYyyqv extends AbstractSet {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Map ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ ZkTXEuwYyyqv(Map map, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((TkF9tg2fr9JpHc2wR2tV7BbN) this.ZfQNn8hdWlEQ5cR94249PDsLR).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 1:
                ((TkF9tg2fr9JpHc2wR2tV7BbN) this.ZfQNn8hdWlEQ5cR94249PDsLR).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((TkF9tg2fr9JpHc2wR2tV7BbN) this.ZfQNn8hdWlEQ5cR94249PDsLR).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                return new Z0OX6z1l2xDfdav8X((qKXCIJM1cKNm0a1RAvamOBOVLgp) this.ZfQNn8hdWlEQ5cR94249PDsLR);
            default:
                return new qQf7ruwSWB8KVubfdB8OCaar((TkF9tg2fr9JpHc2wR2tV7BbN) this.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((TkF9tg2fr9JpHc2wR2tV7BbN) this.ZfQNn8hdWlEQ5cR94249PDsLR).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                return ((qKXCIJM1cKNm0a1RAvamOBOVLgp) this.ZfQNn8hdWlEQ5cR94249PDsLR).LaeGQIruHQu81hfJldjMOQSVblH3x;
            default:
                return ((TkF9tg2fr9JpHc2wR2tV7BbN) this.ZfQNn8hdWlEQ5cR94249PDsLR).size();
        }
    }
}
