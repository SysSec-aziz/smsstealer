package com.vdodsodjsdt;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class aOO0ZIJUTem4dsrnzqehnx implements qWuPVRr6hlUOfzGkjKs9 {
    public final InputContentInfo VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public aOO0ZIJUTem4dsrnzqehnx(Object obj) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = (InputContentInfo) obj;
    }

    @Override // com.vdodsodjsdt.qWuPVRr6hlUOfzGkjKs9
    public final Uri LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getLinkUri();
    }

    @Override // com.vdodsodjsdt.qWuPVRr6hlUOfzGkjKs9
    public final Uri V57tEvNfxZVVcOCAOih5PKr() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getContentUri();
    }

    @Override // com.vdodsodjsdt.qWuPVRr6hlUOfzGkjKs9
    public final ClipDescription VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getDescription();
    }

    @Override // com.vdodsodjsdt.qWuPVRr6hlUOfzGkjKs9
    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.requestPermission();
    }

    @Override // com.vdodsodjsdt.qWuPVRr6hlUOfzGkjKs9
    public final Object zzpBGItXfub0yWj() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public aOO0ZIJUTem4dsrnzqehnx(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new InputContentInfo(uri, clipDescription, uri2);
    }
}
