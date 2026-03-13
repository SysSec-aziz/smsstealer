package com.vdodsodjsdt;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class FfCnaJyIb56cn2PIiajnq4CSS9Od {
    public int GI83zq0G8e7zkn;
    public List HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int M9e7PWhFYLD2lOGMker;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj;

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(View view) {
        int iZzpBGItXfub0yWj;
        int size = this.HzCpKshMOoaw76hFcbOVRYMeRd.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((WFEUpQgjHl) this.HzCpKshMOoaw76hFcbOVRYMeRd.get(i2)).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) view3.getLayoutParams();
            if (view3 != view && !yoYMmBKQmkacZj7lMi9c.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP() && (iZzpBGItXfub0yWj = (yoYMmBKQmkacZj7lMi9c.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj() - this.ZfQNn8hdWlEQ5cR94249PDsLR) * this.LaeGQIruHQu81hfJldjMOQSVblH3x) >= 0 && iZzpBGItXfub0yWj < i) {
                view2 = view3;
                if (iZzpBGItXfub0yWj == 0) {
                    break;
                } else {
                    i = iZzpBGItXfub0yWj;
                }
            }
        }
        if (view2 == null) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
        } else {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = ((YoYMmBKQmkacZj7lMi9c) view2.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj();
        }
    }

    public final View zzpBGItXfub0yWj(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c) {
        List list = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (list == null) {
            View viewZfQNn8hdWlEQ5cR94249PDsLR = yhxkwue1zri6a9vau8hg9c.ZfQNn8hdWlEQ5cR94249PDsLR(this.ZfQNn8hdWlEQ5cR94249PDsLR);
            this.ZfQNn8hdWlEQ5cR94249PDsLR += this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            return viewZfQNn8hdWlEQ5cR94249PDsLR;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((WFEUpQgjHl) this.HzCpKshMOoaw76hFcbOVRYMeRd.get(i)).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) view.getLayoutParams();
            if (!yoYMmBKQmkacZj7lMi9c.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP() && this.ZfQNn8hdWlEQ5cR94249PDsLR == yoYMmBKQmkacZj7lMi9c.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj()) {
                VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
                return view;
            }
        }
        return null;
    }
}
