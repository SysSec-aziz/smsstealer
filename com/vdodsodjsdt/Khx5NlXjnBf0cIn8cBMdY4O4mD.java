package com.vdodsodjsdt;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Khx5NlXjnBf0cIn8cBMdY4O4mD {
    public final Object V57tEvNfxZVVcOCAOih5PKr;
    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Object zzpBGItXfub0yWj;

    public Khx5NlXjnBf0cIn8cBMdY4O4mD(String str, String str2, boolean z) {
        this.zzpBGItXfub0yWj = str;
        this.V57tEvNfxZVVcOCAOih5PKr = str2;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = z;
    }

    public void V57tEvNfxZVVcOCAOih5PKr(Bundle bundle) {
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = (ALnH3AptNOGA7UbXGxOl2SnVeZ) this.V57tEvNfxZVVcOCAOih5PKr;
        aLnH3AptNOGA7UbXGxOl2SnVeZ.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) aLnH3AptNOGA7UbXGxOl2SnVeZ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        dMJzfWfinPaaf19pTno5S3Iet7AJ dmjzfwfinpaaf19ptno5s3iet7aj = (dMJzfWfinPaaf19pTno5S3Iet7AJ) aLnH3AptNOGA7UbXGxOl2SnVeZ.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        dmjzfwfinpaaf19ptno5s3iet7aj.getClass();
        IW05q7db4MhfsXUu5fUz3W11j6ii iW05q7db4MhfsXUu5fUz3W11j6ii = new IW05q7db4MhfsXUu5fUz3W11j6ii(dmjzfwfinpaaf19ptno5s3iet7aj);
        dmjzfwfinpaaf19ptno5s3iet7aj.LaeGQIruHQu81hfJldjMOQSVblH3x.put(iW05q7db4MhfsXUu5fUz3W11j6ii, Boolean.FALSE);
        while (iW05q7db4MhfsXUu5fUz3W11j6ii.hasNext()) {
            Map.Entry entry = (Map.Entry) iW05q7db4MhfsXUu5fUz3W11j6ii.next();
            bundle2.putBundle((String) entry.getKey(), ((UiKibUXaicctwiwbr8Jrmq2BMS) entry.getValue()).VxUQ9tBhpHJ2AAEDNW8sghc4m());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        c6HqQbG2usib c6hqqbg2usib = (c6HqQbG2usib) this.zzpBGItXfub0yWj;
        androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x = c6hqqbg2usib.LaeGQIruHQu81hfJldjMOQSVblH3x();
        if (ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr != Cg8BA4YSFFWr8.ZfQNn8hdWlEQ5cR94249PDsLR) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(new Recreator(c6hqqbg2usib));
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = (ALnH3AptNOGA7UbXGxOl2SnVeZ) this.V57tEvNfxZVVcOCAOih5PKr;
        aLnH3AptNOGA7UbXGxOl2SnVeZ.getClass();
        if (aLnH3AptNOGA7UbXGxOl2SnVeZ.V57tEvNfxZVVcOCAOih5PKr) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(new TFQ0lyXvuzreL0Y5Oac3TFPagC(2, aLnH3AptNOGA7UbXGxOl2SnVeZ));
        aLnH3AptNOGA7UbXGxOl2SnVeZ.V57tEvNfxZVVcOCAOih5PKr = true;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
    }

    public void zzpBGItXfub0yWj(Bundle bundle) {
        if (!this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x = ((c6HqQbG2usib) this.zzpBGItXfub0yWj).LaeGQIruHQu81hfJldjMOQSVblH3x();
        if (ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr.compareTo(Cg8BA4YSFFWr8.zIvmSL0wzmmKGc3X39b2Gw2mUGE) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr).toString());
        }
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = (ALnH3AptNOGA7UbXGxOl2SnVeZ) this.V57tEvNfxZVVcOCAOih5PKr;
        if (!aLnH3AptNOGA7UbXGxOl2SnVeZ.V57tEvNfxZVVcOCAOih5PKr) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (aLnH3AptNOGA7UbXGxOl2SnVeZ.ZfQNn8hdWlEQ5cR94249PDsLR) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        aLnH3AptNOGA7UbXGxOl2SnVeZ.VxUQ9tBhpHJ2AAEDNW8sghc4m = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        aLnH3AptNOGA7UbXGxOl2SnVeZ.ZfQNn8hdWlEQ5cR94249PDsLR = true;
    }

    public Khx5NlXjnBf0cIn8cBMdY4O4mD(c6HqQbG2usib c6hqqbg2usib) {
        this.zzpBGItXfub0yWj = c6hqqbg2usib;
        this.V57tEvNfxZVVcOCAOih5PKr = new ALnH3AptNOGA7UbXGxOl2SnVeZ();
    }
}
