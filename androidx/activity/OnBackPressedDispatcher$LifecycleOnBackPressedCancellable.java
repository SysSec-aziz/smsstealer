package androidx.activity;

import com.vdodsodjsdt.JH1b7PgvaCpbju;
import com.vdodsodjsdt.W3ZqXaAE9m3wS;
import com.vdodsodjsdt.XOTOHmUA5NYhlyOBh7;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.gtPeRMSqo8LOy17J0GaB0Cz;
import com.vdodsodjsdt.hCgEybj69le8;
import com.vdodsodjsdt.n3cC0LvQnl8StHUKaUNYv0vW9MLj3;
import com.vdodsodjsdt.vohjg5qkGbIuDdVrYZ7UHcgchoWNV;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements W3ZqXaAE9m3wS, JH1b7PgvaCpbju {
    public n3cC0LvQnl8StHUKaUNYv0vW9MLj3 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final androidx.lifecycle.iVKrTMqOw0TqCeNN V57tEvNfxZVVcOCAOih5PKr;
    public final gtPeRMSqo8LOy17J0GaB0Cz ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ iVKrTMqOw0TqCeNN zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn, androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn2, gtPeRMSqo8LOy17J0GaB0Cz gtpermsqo8loy17j0gab0cz) {
        ej6unYlOWMDF.pYmKDYlAmhudp(gtpermsqo8loy17j0gab0cz, "onBackPressedCallback");
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ivkrtmqow0tqcenn;
        this.V57tEvNfxZVVcOCAOih5PKr = ivkrtmqow0tqcenn2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = gtpermsqo8loy17j0gab0cz;
        ivkrtmqow0tqcenn2.VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
    }

    @Override // com.vdodsodjsdt.JH1b7PgvaCpbju
    public final void cancel() {
        this.V57tEvNfxZVVcOCAOih5PKr.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this);
        this.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj.remove(this);
        n3cC0LvQnl8StHUKaUNYv0vW9MLj3 n3cc0lvqnl8sthukaunyv0vw9mlj3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (n3cc0lvqnl8sthukaunyv0vw9mlj3 != null) {
            n3cc0lvqnl8sthukaunyv0vw9mlj3.cancel();
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
    }

    @Override // com.vdodsodjsdt.W3ZqXaAE9m3wS
    public final void zzpBGItXfub0yWj(hCgEybj69le8 hcgeybj69le8, XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7) {
        if (xOTOHmUA5NYhlyOBh7 != XOTOHmUA5NYhlyOBh7.ON_START) {
            if (xOTOHmUA5NYhlyOBh7 != XOTOHmUA5NYhlyOBh7.ON_STOP) {
                if (xOTOHmUA5NYhlyOBh7 == XOTOHmUA5NYhlyOBh7.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                n3cC0LvQnl8StHUKaUNYv0vW9MLj3 n3cc0lvqnl8sthukaunyv0vw9mlj3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (n3cc0lvqnl8sthukaunyv0vw9mlj3 != null) {
                    n3cc0lvqnl8sthukaunyv0vw9mlj3.cancel();
                    return;
                }
                return;
            }
        }
        iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        ivkrtmqow0tqcenn.getClass();
        gtPeRMSqo8LOy17J0GaB0Cz gtpermsqo8loy17j0gab0cz = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.pYmKDYlAmhudp(gtpermsqo8loy17j0gab0cz, "onBackPressedCallback");
        ivkrtmqow0tqcenn.zzpBGItXfub0yWj.addLast(gtpermsqo8loy17j0gab0cz);
        n3cC0LvQnl8StHUKaUNYv0vW9MLj3 n3cc0lvqnl8sthukaunyv0vw9mlj32 = new n3cC0LvQnl8StHUKaUNYv0vW9MLj3(ivkrtmqow0tqcenn, gtpermsqo8loy17j0gab0cz);
        gtpermsqo8loy17j0gab0cz.zzpBGItXfub0yWj.add(n3cc0lvqnl8sthukaunyv0vw9mlj32);
        ivkrtmqow0tqcenn.LaeGQIruHQu81hfJldjMOQSVblH3x();
        gtpermsqo8loy17j0gab0cz.V57tEvNfxZVVcOCAOih5PKr = new vohjg5qkGbIuDdVrYZ7UHcgchoWNV(0, ivkrtmqow0tqcenn, iVKrTMqOw0TqCeNN.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = n3cc0lvqnl8sthukaunyv0vw9mlj32;
    }
}
