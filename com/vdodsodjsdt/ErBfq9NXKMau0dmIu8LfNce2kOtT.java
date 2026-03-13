package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ErBfq9NXKMau0dmIu8LfNce2kOtT implements Runnable, Comparable, c5ORlH4Pzc4yAttMD7dLGkl48Uya {
    public long V57tEvNfxZVVcOCAOih5PKr;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    private volatile Object _heap;

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(long j, hM2WrRpV30e0b hm2wrrpv30e0b, baaN71QMl7e baan71qml7e) {
        synchronized (this) {
            if (this._heap == KfeOQNOupsCg6878zi4e.V57tEvNfxZVVcOCAOih5PKr) {
                return 2;
            }
            synchronized (hm2wrrpv30e0b) {
                try {
                    ErBfq9NXKMau0dmIu8LfNce2kOtT[] erBfq9NXKMau0dmIu8LfNce2kOtTArr = hm2wrrpv30e0b.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    ErBfq9NXKMau0dmIu8LfNce2kOtT erBfq9NXKMau0dmIu8LfNce2kOtT = erBfq9NXKMau0dmIu8LfNce2kOtTArr != null ? erBfq9NXKMau0dmIu8LfNce2kOtTArr[0] : null;
                    if (baaN71QMl7e.HzCpKshMOoaw76hFcbOVRYMeRd.get(baan71qml7e) != 0) {
                        return 1;
                    }
                    if (erBfq9NXKMau0dmIu8LfNce2kOtT == null) {
                        hm2wrrpv30e0b.V57tEvNfxZVVcOCAOih5PKr = j;
                    } else {
                        long j2 = erBfq9NXKMau0dmIu8LfNce2kOtT.V57tEvNfxZVVcOCAOih5PKr;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - hm2wrrpv30e0b.V57tEvNfxZVVcOCAOih5PKr > 0) {
                            hm2wrrpv30e0b.V57tEvNfxZVVcOCAOih5PKr = j;
                        }
                    }
                    long j3 = this.V57tEvNfxZVVcOCAOih5PKr;
                    long j4 = hm2wrrpv30e0b.V57tEvNfxZVVcOCAOih5PKr;
                    if (j3 - j4 < 0) {
                        this.V57tEvNfxZVVcOCAOih5PKr = j4;
                    }
                    hm2wrrpv30e0b.VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(hM2WrRpV30e0b hm2wrrpv30e0b) {
        if (this._heap == KfeOQNOupsCg6878zi4e.V57tEvNfxZVVcOCAOih5PKr) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = hm2wrrpv30e0b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.V57tEvNfxZVVcOCAOih5PKr - ((ErBfq9NXKMau0dmIu8LfNce2kOtT) obj).V57tEvNfxZVVcOCAOih5PKr;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.V57tEvNfxZVVcOCAOih5PKr + ']';
    }

    @Override // com.vdodsodjsdt.c5ORlH4Pzc4yAttMD7dLGkl48Uya
    public final void zzpBGItXfub0yWj() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = KfeOQNOupsCg6878zi4e.V57tEvNfxZVVcOCAOih5PKr;
                if (obj == aqhhl68tqrgijcmgb3dy2ylk3vn) {
                    return;
                }
                hM2WrRpV30e0b hm2wrrpv30e0b = obj instanceof hM2WrRpV30e0b ? (hM2WrRpV30e0b) obj : null;
                if (hm2wrrpv30e0b != null) {
                    synchronized (hm2wrrpv30e0b) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof Ra0wxJbsOwDYCmrrSAs ? (Ra0wxJbsOwDYCmrrSAs) obj2 : null) != null) {
                            hm2wrrpv30e0b.zzpBGItXfub0yWj(this.ZfQNn8hdWlEQ5cR94249PDsLR);
                        }
                    }
                }
                this._heap = aqhhl68tqrgijcmgb3dy2ylk3vn;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
