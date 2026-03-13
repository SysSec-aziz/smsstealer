package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tGqXED78tOVJkBMS0QEJy extends EM5Ueg4SS3xqKechziQvaSKq {
    public int V57tEvNfxZVVcOCAOih5PKr;
    public z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[] VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public String zzpBGItXfub0yWj;

    public tGqXED78tOVJkBMS0QEJy() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
    }

    public z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[] getPathData() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public String getPathName() {
        return this.zzpBGItXfub0yWj;
    }

    public void setPathData(z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[] z0zmvfrihplpxe40lo7hy9qdkt8fjArr) {
        if (!FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ZfQNn8hdWlEQ5cR94249PDsLR(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, z0zmvfrihplpxe40lo7hy9qdkt8fjArr)) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.jW7EiD0YL6xkbB158jMUzhWNWb1y(z0zmvfrihplpxe40lo7hy9qdkt8fjArr);
            return;
        }
        z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[] z0zmvfrihplpxe40lo7hy9qdkt8fjArr2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        for (int i = 0; i < z0zmvfrihplpxe40lo7hy9qdkt8fjArr.length; i++) {
            z0zmvfrihplpxe40lo7hy9qdkt8fjArr2[i].VxUQ9tBhpHJ2AAEDNW8sghc4m = z0zmvfrihplpxe40lo7hy9qdkt8fjArr[i].VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int i2 = 0;
            while (true) {
                float[] fArr = z0zmvfrihplpxe40lo7hy9qdkt8fjArr[i].zzpBGItXfub0yWj;
                if (i2 < fArr.length) {
                    z0zmvfrihplpxe40lo7hy9qdkt8fjArr2[i].zzpBGItXfub0yWj[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public tGqXED78tOVJkBMS0QEJy(tGqXED78tOVJkBMS0QEJy tgqxed78tovjkbms0qejy) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
        this.zzpBGItXfub0yWj = tgqxed78tovjkbms0qejy.zzpBGItXfub0yWj;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.jW7EiD0YL6xkbB158jMUzhWNWb1y(tgqxed78tovjkbms0qejy.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }
}
