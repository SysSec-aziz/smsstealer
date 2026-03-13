package androidx.lifecycle;

import android.os.Bundle;
import com.vdodsodjsdt.VcJ8nIUPXL;
import com.vdodsodjsdt.W3ZqXaAE9m3wS;
import com.vdodsodjsdt.XOTOHmUA5NYhlyOBh7;
import com.vdodsodjsdt.hCgEybj69le8;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements W3ZqXaAE9m3wS {
    public final VcJ8nIUPXL V57tEvNfxZVVcOCAOih5PKr;

    public SavedStateHandleAttacher(VcJ8nIUPXL vcJ8nIUPXL) {
        this.V57tEvNfxZVVcOCAOih5PKr = vcJ8nIUPXL;
    }

    @Override // com.vdodsodjsdt.W3ZqXaAE9m3wS
    public final void zzpBGItXfub0yWj(hCgEybj69le8 hcgeybj69le8, XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7) {
        if (xOTOHmUA5NYhlyOBh7 != XOTOHmUA5NYhlyOBh7.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + xOTOHmUA5NYhlyOBh7).toString());
        }
        hcgeybj69le8.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(this);
        VcJ8nIUPXL vcJ8nIUPXL = this.V57tEvNfxZVVcOCAOih5PKr;
        if (vcJ8nIUPXL.zzpBGItXfub0yWj) {
            return;
        }
        Bundle bundleV57tEvNfxZVVcOCAOih5PKr = vcJ8nIUPXL.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = vcJ8nIUPXL.V57tEvNfxZVVcOCAOih5PKr;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleV57tEvNfxZVVcOCAOih5PKr != null) {
            bundle.putAll(bundleV57tEvNfxZVVcOCAOih5PKr);
        }
        vcJ8nIUPXL.V57tEvNfxZVVcOCAOih5PKr = bundle;
        vcJ8nIUPXL.zzpBGItXfub0yWj = true;
    }
}
