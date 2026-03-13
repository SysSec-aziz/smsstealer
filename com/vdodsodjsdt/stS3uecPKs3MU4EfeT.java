package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class stS3uecPKs3MU4EfeT extends rER8RCI8e7U94QVUg {
    public static final stS3uecPKs3MU4EfeT zIvmSL0wzmmKGc3X39b2Gw2mUGE = new stS3uecPKs3MU4EfeT(1, 0, 1);

    @Override // com.vdodsodjsdt.rER8RCI8e7U94QVUg
    public final boolean equals(Object obj) {
        if (!(obj instanceof stS3uecPKs3MU4EfeT)) {
            return false;
        }
        if (isEmpty() && ((stS3uecPKs3MU4EfeT) obj).isEmpty()) {
            return true;
        }
        stS3uecPKs3MU4EfeT sts3uecpks3mu4efet = (stS3uecPKs3MU4EfeT) obj;
        return this.V57tEvNfxZVVcOCAOih5PKr == sts3uecpks3mu4efet.V57tEvNfxZVVcOCAOih5PKr && this.ZfQNn8hdWlEQ5cR94249PDsLR == sts3uecpks3mu4efet.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // com.vdodsodjsdt.rER8RCI8e7U94QVUg
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.V57tEvNfxZVVcOCAOih5PKr * 31) + this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // com.vdodsodjsdt.rER8RCI8e7U94QVUg
    public final boolean isEmpty() {
        return this.V57tEvNfxZVVcOCAOih5PKr > this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // com.vdodsodjsdt.rER8RCI8e7U94QVUg
    public final String toString() {
        return this.V57tEvNfxZVVcOCAOih5PKr + ".." + this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }
}
