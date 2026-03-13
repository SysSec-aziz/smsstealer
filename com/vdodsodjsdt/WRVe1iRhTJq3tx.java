package com.vdodsodjsdt;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class WRVe1iRhTJq3tx implements Runnable {
    public final Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ WRVe1iRhTJq3tx(Object obj, int i, int i2) {
        this.V57tEvNfxZVVcOCAOih5PKr = i2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                KfeOQNOupsCg6878zi4e kfeOQNOupsCg6878zi4e = (KfeOQNOupsCg6878zi4e) ((qF22Y620JkFyombtDYw0h0h8Rxpja) this.LaeGQIruHQu81hfJldjMOQSVblH3x).V57tEvNfxZVVcOCAOih5PKr;
                if (kfeOQNOupsCg6878zi4e != null) {
                    kfeOQNOupsCg6878zi4e.y1NaPKTl7R18DOr6e8i5(this.ZfQNn8hdWlEQ5cR94249PDsLR);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                int size = arrayList.size();
                int i = 0;
                if (this.ZfQNn8hdWlEQ5cR94249PDsLR == 1) {
                    while (i < size) {
                        ((kfY5YDtDv6dzFxBj) arrayList.get(i)).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((kfY5YDtDv6dzFxBj) arrayList.get(i)).getClass();
                        i++;
                    }
                }
                break;
            default:
                RecyclerView recyclerView = ((ddDbMgQuo9affXXIMNMhQZaG3) this.LaeGQIruHQu81hfJldjMOQSVblH3x).H2VFYNJEVGAX;
                if (!recyclerView.q11o1hieEkZDhF1MGOZI26oZiDT) {
                    wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = recyclerView.p59rPv72J9;
                    if (wbbbe1vadvo1dmsg1odnaysaytu != null) {
                        wbbbe1vadvo1dmsg1odnaysaytu.zyiF0wv9HozxGOIDt8PvVp(recyclerView, this.ZfQNn8hdWlEQ5cR94249PDsLR);
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    }
                    break;
                }
                break;
        }
    }

    public WRVe1iRhTJq3tx(List list, int i, Throwable th) {
        this.V57tEvNfxZVVcOCAOih5PKr = 1;
        KfeOQNOupsCg6878zi4e.KUYypEB4eNWOZWVDpH(list, "initCallbacks cannot be null");
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new ArrayList(list);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
    }
}
