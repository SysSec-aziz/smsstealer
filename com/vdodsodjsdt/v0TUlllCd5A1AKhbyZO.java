package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class v0TUlllCd5A1AKhbyZO {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ wbBBe1vAdVO1DmSg1odNaySAYTu zzpBGItXfub0yWj;

    public /* synthetic */ v0TUlllCd5A1AKhbyZO(wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = wbbbe1vadvo1dmsg1odnaysaytu;
    }

    public final int V57tEvNfxZVVcOCAOih5PKr() {
        int i;
        int iO1xDAlBZZlZdoEf747lCFHld;
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.zzpBGItXfub0yWj;
                i = wbbbe1vadvo1dmsg1odnaysaytu.p59rPv72J9;
                iO1xDAlBZZlZdoEf747lCFHld = wbbbe1vadvo1dmsg1odnaysaytu.O1xDAlBZZlZdoEf747lCFHld();
                break;
            default:
                wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu2 = this.zzpBGItXfub0yWj;
                i = wbbbe1vadvo1dmsg1odnaysaytu2.Ca81ebIan1u;
                iO1xDAlBZZlZdoEf747lCFHld = wbbbe1vadvo1dmsg1odnaysaytu2.aXO0LSrt8bKV();
                break;
        }
        return i - iO1xDAlBZZlZdoEf747lCFHld;
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(View view) {
        int right;
        int i;
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) view.getLayoutParams();
                right = view.getRight() + ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).zzpBGItXfub0yWj.right;
                i = ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).rightMargin;
                break;
            default:
                YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c2 = (YoYMmBKQmkacZj7lMi9c) view.getLayoutParams();
                right = view.getBottom() + ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).zzpBGItXfub0yWj.bottom;
                i = ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c2).bottomMargin;
                break;
        }
        return right + i;
    }

    public final int ZfQNn8hdWlEQ5cR94249PDsLR() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                return this.zzpBGItXfub0yWj.vE4yDIjexsP2lGjLaTcB();
            default:
                return this.zzpBGItXfub0yWj.HVEwbdULInpTNa0IG();
        }
    }

    public final int zzpBGItXfub0yWj(View view) {
        int left;
        int i;
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) view.getLayoutParams();
                left = view.getLeft() - ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).zzpBGItXfub0yWj.left;
                i = ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c).leftMargin;
                break;
            default:
                YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c2 = (YoYMmBKQmkacZj7lMi9c) view.getLayoutParams();
                left = view.getTop() - ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).zzpBGItXfub0yWj.top;
                i = ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c2).topMargin;
                break;
        }
        return left - i;
    }
}
