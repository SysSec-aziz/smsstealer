package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.vdodsodjsdt.Cg8BA4YSFFWr8;
import com.vdodsodjsdt.EdfWbt9ctq5AGWMF3kpLJDSdqhku;
import com.vdodsodjsdt.OHRoAMjK5gn3;
import com.vdodsodjsdt.TYHMBipJh2;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.gtPeRMSqo8LOy17J0GaB0Cz;
import com.vdodsodjsdt.hCgEybj69le8;
import com.vdodsodjsdt.hRrPPME7ytOB7ba;
import com.vdodsodjsdt.okcUO69vEcgndIAn0R;
import com.vdodsodjsdt.rOiKJVDHPqqeCfn;
import com.vdodsodjsdt.vohjg5qkGbIuDdVrYZ7UHcgchoWNV;
import com.vdodsodjsdt.zCTjlTvX7kUnDg4oo78;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class iVKrTMqOw0TqCeNN {
    public OnBackInvokedDispatcher LaeGQIruHQu81hfJldjMOQSVblH3x;
    public gtPeRMSqo8LOy17J0GaB0Cz V57tEvNfxZVVcOCAOih5PKr;
    public final Runnable VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final OnBackInvokedCallback ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final rOiKJVDHPqqeCfn zzpBGItXfub0yWj = new rOiKJVDHPqqeCfn();

    public iVKrTMqOw0TqCeNN(Runnable runnable) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = i >= 34 ? hRrPPME7ytOB7ba.zIvmSL0wzmmKGc3X39b2Gw2mUGE(new TYHMBipJh2(this, 0), new TYHMBipJh2(this, 1), new zCTjlTvX7kUnDg4oo78(this, 0), new zCTjlTvX7kUnDg4oo78(this, 1)) : new EdfWbt9ctq5AGWMF3kpLJDSdqhku(1, new zCTjlTvX7kUnDg4oo78(this, 2));
        }
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        boolean z = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        boolean z2 = false;
        rOiKJVDHPqqeCfn roikjvdhpqqecfn = this.zzpBGItXfub0yWj;
        if (roikjvdhpqqecfn == null || !roikjvdhpqqecfn.isEmpty()) {
            Iterator<E> it = roikjvdhpqqecfn.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((gtPeRMSqo8LOy17J0GaB0Cz) it.next()).VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                    z2 = true;
                    break;
                }
            }
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        ZfQNn8hdWlEQ5cR94249PDsLR(z2);
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        Object objPrevious;
        gtPeRMSqo8LOy17J0GaB0Cz gtpermsqo8loy17j0gab0cz = this.V57tEvNfxZVVcOCAOih5PKr;
        if (gtpermsqo8loy17j0gab0cz == null) {
            rOiKJVDHPqqeCfn roikjvdhpqqecfn = this.zzpBGItXfub0yWj;
            ListIterator listIterator = roikjvdhpqqecfn.listIterator(roikjvdhpqqecfn.VxUQ9tBhpHJ2AAEDNW8sghc4m());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((gtPeRMSqo8LOy17J0GaB0Cz) objPrevious).VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                        break;
                    }
                }
            }
            gtpermsqo8loy17j0gab0cz = (gtPeRMSqo8LOy17J0GaB0Cz) objPrevious;
        }
        this.V57tEvNfxZVVcOCAOih5PKr = null;
        if (gtpermsqo8loy17j0gab0cz == null) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.run();
            return;
        }
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = gtpermsqo8loy17j0gab0cz.ZfQNn8hdWlEQ5cR94249PDsLR;
        okcuo69vecgndian0r.w0Wu95l8dVNw5rZMRu(true);
        if (okcuo69vecgndian0r.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            okcuo69vecgndian0r.CixTK5ZX8oWXHz34qHYV();
        } else {
            okcuo69vecgndian0r.ZLZeBXTMq0zDztBxtRTuCHrapQ.V57tEvNfxZVVcOCAOih5PKr();
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(hCgEybj69le8 hcgeybj69le8, gtPeRMSqo8LOy17J0GaB0Cz gtpermsqo8loy17j0gab0cz) {
        ej6unYlOWMDF.pYmKDYlAmhudp(gtpermsqo8loy17j0gab0cz, "onBackPressedCallback");
        androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x = hcgeybj69le8.LaeGQIruHQu81hfJldjMOQSVblH3x();
        if (ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr == Cg8BA4YSFFWr8.V57tEvNfxZVVcOCAOih5PKr) {
            return;
        }
        gtpermsqo8loy17j0gab0cz.zzpBGItXfub0yWj.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x, gtpermsqo8loy17j0gab0cz));
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        gtpermsqo8loy17j0gab0cz.V57tEvNfxZVVcOCAOih5PKr = new vohjg5qkGbIuDdVrYZ7UHcgchoWNV(0, this, iVKrTMqOw0TqCeNN.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.ZfQNn8hdWlEQ5cR94249PDsLR) == null) {
            return;
        }
        if (z && !this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            OHRoAMjK5gn3.zIvmSL0wzmmKGc3X39b2Gw2mUGE(onBackInvokedDispatcher, onBackInvokedCallback);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        } else {
            if (z || !this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                return;
            }
            OHRoAMjK5gn3.ZLZeBXTMq0zDztBxtRTuCHrapQ(onBackInvokedDispatcher, onBackInvokedCallback);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
        }
    }

    public final void zzpBGItXfub0yWj() {
        Object objPrevious;
        if (this.V57tEvNfxZVVcOCAOih5PKr == null) {
            rOiKJVDHPqqeCfn roikjvdhpqqecfn = this.zzpBGItXfub0yWj;
            ListIterator<E> listIterator = roikjvdhpqqecfn.listIterator(roikjvdhpqqecfn.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((gtPeRMSqo8LOy17J0GaB0Cz) objPrevious).VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                        break;
                    }
                }
            }
        }
        this.V57tEvNfxZVVcOCAOih5PKr = null;
    }
}
