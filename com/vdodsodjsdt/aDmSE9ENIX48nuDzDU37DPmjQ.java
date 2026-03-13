package com.vdodsodjsdt;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class aDmSE9ENIX48nuDzDU37DPmjQ extends iR5xCBIVvX5dAZmnw05F0Cv implements EfIvTei3Q8wBNpyLTZJevpFxej {
    public final /* synthetic */ T5O2CroHcXOiMkDhNkjjxXgJ LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aDmSE9ENIX48nuDzDU37DPmjQ(T5O2CroHcXOiMkDhNkjjxXgJ t5O2CroHcXOiMkDhNkjjxXgJ, int i) {
        super(0);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = t5O2CroHcXOiMkDhNkjjxXgJ;
    }

    @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() throws IOException {
        switch (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            case 0:
                return ((QCOKcJFm0lL8aFI0JnQHs2efvCVP9) this.LaeGQIruHQu81hfJldjMOQSVblH3x.KUYypEB4eNWOZWVDpH.VxUQ9tBhpHJ2AAEDNW8sghc4m()).zzpBGItXfub0yWj;
            default:
                AD8oVJKWXjHStg aD8oVJKWXjHStg = this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr;
                File canonicalFile = ((File) aD8oVJKWXjHStg.zzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m()).getCanonicalFile();
                synchronized (AD8oVJKWXjHStg.ZfQNn8hdWlEQ5cR94249PDsLR) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = AD8oVJKWXjHStg.V57tEvNfxZVVcOCAOih5PKr;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new QCOKcJFm0lL8aFI0JnQHs2efvCVP9(canonicalFile, (R2gZ9455nFwCuFzDlc5ZU6n8KNyae) aD8oVJKWXjHStg.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn(canonicalFile), new F2fKrE33wuRBc(0, canonicalFile));
        }
    }
}
