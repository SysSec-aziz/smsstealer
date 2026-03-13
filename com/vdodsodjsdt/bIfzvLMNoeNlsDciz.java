package com.vdodsodjsdt;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class bIfzvLMNoeNlsDciz {
    public final /* synthetic */ m8WKJH6JbFg LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Runnable ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zzpBGItXfub0yWj;

    public bIfzvLMNoeNlsDciz(SideSheetBehavior sideSheetBehavior) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = sideSheetBehavior;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new lUqBmUbL53IL3VMM8GT8(12, this);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                WeakReference weakReference = bottomSheetBehavior.vXWl0o6I4U59CgHs9;
                if (weakReference != null && weakReference.get() != null) {
                    this.zzpBGItXfub0yWj = i;
                    if (!this.V57tEvNfxZVVcOCAOih5PKr) {
                        ((View) bottomSheetBehavior.vXWl0o6I4U59CgHs9.get()).postOnAnimation((RfOSIaL6qUBGKJY9MSCBP5ba) this.ZfQNn8hdWlEQ5cR94249PDsLR);
                        this.V57tEvNfxZVVcOCAOih5PKr = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                WeakReference weakReference2 = sideSheetBehavior.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.zzpBGItXfub0yWj = i;
                    if (!this.V57tEvNfxZVVcOCAOih5PKr) {
                        ((View) sideSheetBehavior.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.get()).postOnAnimation((lUqBmUbL53IL3VMM8GT8) this.ZfQNn8hdWlEQ5cR94249PDsLR);
                        this.V57tEvNfxZVVcOCAOih5PKr = true;
                    }
                    break;
                }
                break;
        }
    }

    public bIfzvLMNoeNlsDciz(BottomSheetBehavior bottomSheetBehavior) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = bottomSheetBehavior;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new RfOSIaL6qUBGKJY9MSCBP5ba(1, this);
    }
}
