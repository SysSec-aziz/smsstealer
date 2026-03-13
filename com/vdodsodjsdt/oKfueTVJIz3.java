package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class oKfueTVJIz3 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ oKfueTVJIz3(int i, Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                oMrLCrx6GRyjLa omrlcrx6gryjla = (oMrLCrx6GRyjLa) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (!omrlcrx6gryjla.getInternalPopup().VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                    omrlcrx6gryjla.NSjgqmGjEzuugn2SsG1mZFP.q1wNbhk2O6(omrlcrx6gryjla.getTextDirection(), omrlcrx6gryjla.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = omrlcrx6gryjla.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                RN4c7Imz7HP3UxSANZr rN4c7Imz7HP3UxSANZr = (RN4c7Imz7HP3UxSANZr) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                oMrLCrx6GRyjLa omrlcrx6gryjla2 = rN4c7Imz7HP3UxSANZr.qygqjTppWwx992;
                rN4c7Imz7HP3UxSANZr.getClass();
                if (omrlcrx6gryjla2.isAttachedToWindow() && omrlcrx6gryjla2.getGlobalVisibleRect(rN4c7Imz7HP3UxSANZr.HVEwbdULInpTNa0IG)) {
                    rN4c7Imz7HP3UxSANZr.jW7EiD0YL6xkbB158jMUzhWNWb1y();
                    rN4c7Imz7HP3UxSANZr.ZfQNn8hdWlEQ5cR94249PDsLR();
                } else {
                    rN4c7Imz7HP3UxSANZr.dismiss();
                }
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                lHLqDPOuDPv9Tah5rl1MDkuq12 lhlqdpoudpv9tah5rl1mdkuq12 = (lHLqDPOuDPv9Tah5rl1MDkuq12) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                ArrayList arrayList = lhlqdpoudpv9tah5rl1mdkuq12.M9e7PWhFYLD2lOGMker;
                if (lhlqdpoudpv9tah5rl1mdkuq12.VxUQ9tBhpHJ2AAEDNW8sghc4m() && arrayList.size() > 0) {
                    int i = 0;
                    if (!((L7buPSHIH8sTfWLN) arrayList.get(0)).VxUQ9tBhpHJ2AAEDNW8sghc4m.qNPQb1obP7) {
                        View view = lhlqdpoudpv9tah5rl1mdkuq12.pYmKDYlAmhudp;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                ((L7buPSHIH8sTfWLN) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR();
                            }
                        } else {
                            lhlqdpoudpv9tah5rl1mdkuq12.dismiss();
                        }
                    }
                    break;
                }
                break;
            default:
                P7F708JA9fT7wZdjaAX8x p7F708JA9fT7wZdjaAX8x = (P7F708JA9fT7wZdjaAX8x) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                gqbNFvdPpZQMgIePeLMi gqbnfvdppzqmgiepelmi = p7F708JA9fT7wZdjaAX8x.M9e7PWhFYLD2lOGMker;
                if (p7F708JA9fT7wZdjaAX8x.VxUQ9tBhpHJ2AAEDNW8sghc4m() && !gqbnfvdppzqmgiepelmi.qNPQb1obP7) {
                    View view2 = p7F708JA9fT7wZdjaAX8x.Ca81ebIan1u;
                    if (view2 != null && view2.isShown()) {
                        gqbnfvdppzqmgiepelmi.ZfQNn8hdWlEQ5cR94249PDsLR();
                    } else {
                        p7F708JA9fT7wZdjaAX8x.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
