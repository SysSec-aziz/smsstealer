package com.vdodsodjsdt;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class TFQ0lyXvuzreL0Y5Oac3TFPagC implements W3ZqXaAE9m3wS {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ TFQ0lyXvuzreL0Y5Oac3TFPagC(int i, Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    @Override // com.vdodsodjsdt.W3ZqXaAE9m3wS
    public final void zzpBGItXfub0yWj(hCgEybj69le8 hcgeybj69le8, XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7) {
        Window window;
        View viewPeekDecorView;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo = (zf8a67a5ZO524dLUgOFxsfO) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (xOTOHmUA5NYhlyOBh7 == XOTOHmUA5NYhlyOBh7.ON_STOP && (window = zf8a67a5zo524dlugofxsfo.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo2 = (zf8a67a5ZO524dLUgOFxsfO) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (xOTOHmUA5NYhlyOBh7 == XOTOHmUA5NYhlyOBh7.ON_DESTROY) {
                    zf8a67a5zo524dlugofxsfo2.ZfQNn8hdWlEQ5cR94249PDsLR.zzpBGItXfub0yWj = null;
                    if (!zf8a67a5zo524dlugofxsfo2.isChangingConfigurations()) {
                        zf8a67a5zo524dlugofxsfo2.ZfQNn8hdWlEQ5cR94249PDsLR().VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    }
                    Ho2YsUthI7Tsjp ho2YsUthI7Tsjp = zf8a67a5zo524dlugofxsfo2.NSjgqmGjEzuugn2SsG1mZFP;
                    zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo3 = ho2YsUthI7Tsjp.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                    zf8a67a5zo524dlugofxsfo3.getWindow().getDecorView().removeCallbacks(ho2YsUthI7Tsjp);
                    zf8a67a5zo524dlugofxsfo3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(ho2YsUthI7Tsjp);
                }
                break;
            default:
                ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = (ALnH3AptNOGA7UbXGxOl2SnVeZ) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                ej6unYlOWMDF.pYmKDYlAmhudp(aLnH3AptNOGA7UbXGxOl2SnVeZ, "this$0");
                if (xOTOHmUA5NYhlyOBh7 == XOTOHmUA5NYhlyOBh7.ON_START) {
                    aLnH3AptNOGA7UbXGxOl2SnVeZ.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
                } else if (xOTOHmUA5NYhlyOBh7 == XOTOHmUA5NYhlyOBh7.ON_STOP) {
                    aLnH3AptNOGA7UbXGxOl2SnVeZ.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
                }
                break;
        }
    }
}
