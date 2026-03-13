package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class lHLqDPOuDPv9Tah5rl1MDkuq12 extends WiLYxtz85JCnc implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Handler NSjgqmGjEzuugn2SsG1mZFP;
    public ViewTreeObserver RhfGHxtXxy0M0grmp2jkRjQg;
    public boolean SuB3hEmTmbbRGAhtvOOmfKEon;
    public int TaDO7ogis3aEiWEtq;
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final Context ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean f6ZQsR6bPLvvCDNXOUc;
    public View h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public int ko09zE6UAgwkV;
    public View pYmKDYlAmhudp;
    public boolean q11o1hieEkZDhF1MGOZI26oZiDT;
    public PopupWindow.OnDismissListener qNPQb1obP7;
    public int vBGA6pPLqSMuYGvprl270j7;
    public DRNSD7OTZrolKY4iK67pQWIr w0Wu95l8dVNw5rZMRu;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final ArrayList GI83zq0G8e7zkn = new ArrayList();
    public final ArrayList M9e7PWhFYLD2lOGMker = new ArrayList();
    public final oKfueTVJIz3 HzCpKshMOoaw76hFcbOVRYMeRd = new oKfueTVJIz3(2, this);
    public final QlGb8EPtaoCCLt3z12 KUYypEB4eNWOZWVDpH = new QlGb8EPtaoCCLt3z12(0, this);
    public final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ q1wNbhk2O6 = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(8, this);
    public int p59rPv72J9 = 0;
    public int Ca81ebIan1u = 0;
    public boolean Irh5auREsoeV1C1RaBamlmy = false;

    public lHLqDPOuDPv9Tah5rl1MDkuq12(Context context, View view, int i, boolean z) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = context;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = view;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = z;
        this.ko09zE6UAgwkV = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.NSjgqmGjEzuugn2SsG1mZFP = new Handler();
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void Ca81ebIan1u(boolean z) {
        this.Irh5auREsoeV1C1RaBamlmy = z;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean GI83zq0G8e7zkn() {
        return false;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr) {
        this.w0Wu95l8dVNw5rZMRu = dRNSD7OTZrolKY4iK67pQWIr;
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void KUYypEB4eNWOZWVDpH(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.zzpBGItXfub0yWj(this, this.ZfQNn8hdWlEQ5cR94249PDsLR);
        if (VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            vBGA6pPLqSMuYGvprl270j7(stuu2Qyz6BSCKFEomt5b51vUnV1HQ);
        } else {
            this.GI83zq0G8e7zkn.add(stuu2Qyz6BSCKFEomt5b51vUnV1HQ);
        }
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        ArrayList arrayList = this.M9e7PWhFYLD2lOGMker;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((L7buPSHIH8sTfWLN) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((UzzZGAjVT1KPJ) adapter).notifyDataSetChanged();
        }
    }

    @Override // com.vdodsodjsdt.pHKSskKTBV
    public final aVXgxTePUTvRAcd NSjgqmGjEzuugn2SsG1mZFP() {
        ArrayList arrayList = this.M9e7PWhFYLD2lOGMker;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((L7buPSHIH8sTfWLN) arrayList.get(arrayList.size() - 1)).VxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean V57tEvNfxZVVcOCAOih5PKr(qzGH0ZhUGLEjFhdFH7Y qzgh0zhuglejfhdfh7y) {
        ArrayList arrayList = this.M9e7PWhFYLD2lOGMker;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            L7buPSHIH8sTfWLN l7buPSHIH8sTfWLN = (L7buPSHIH8sTfWLN) obj;
            if (qzgh0zhuglejfhdfh7y == l7buPSHIH8sTfWLN.zzpBGItXfub0yWj) {
                l7buPSHIH8sTfWLN.VxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x.requestFocus();
                return true;
            }
        }
        if (!qzgh0zhuglejfhdfh7y.hasVisibleItems()) {
            return false;
        }
        KUYypEB4eNWOZWVDpH(qzgh0zhuglejfhdfh7y);
        DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr = this.w0Wu95l8dVNw5rZMRu;
        if (dRNSD7OTZrolKY4iK67pQWIr != null) {
            dRNSD7OTZrolKY4iK67pQWIr.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(qzgh0zhuglejfhdfh7y);
        }
        return true;
    }

    @Override // com.vdodsodjsdt.pHKSskKTBV
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        ArrayList arrayList = this.M9e7PWhFYLD2lOGMker;
        return arrayList.size() > 0 && ((L7buPSHIH8sTfWLN) arrayList.get(0)).VxUQ9tBhpHJ2AAEDNW8sghc4m.SuB3hEmTmbbRGAhtvOOmfKEon.isShowing();
    }

    @Override // com.vdodsodjsdt.pHKSskKTBV
    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        if (VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            return;
        }
        ArrayList arrayList = this.GI83zq0G8e7zkn;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vBGA6pPLqSMuYGvprl270j7((Stuu2Qyz6BSCKFEomt5b51vUnV1HQ) obj);
        }
        arrayList.clear();
        View view = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        this.pYmKDYlAmhudp = view;
        if (view != null) {
            boolean z = this.RhfGHxtXxy0M0grmp2jkRjQg == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.RhfGHxtXxy0M0grmp2jkRjQg = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.HzCpKshMOoaw76hFcbOVRYMeRd);
            }
            this.pYmKDYlAmhudp.addOnAttachStateChangeListener(this.KUYypEB4eNWOZWVDpH);
        }
    }

    @Override // com.vdodsodjsdt.pHKSskKTBV
    public final void dismiss() {
        ArrayList arrayList = this.M9e7PWhFYLD2lOGMker;
        int size = arrayList.size();
        if (size > 0) {
            L7buPSHIH8sTfWLN[] l7buPSHIH8sTfWLNArr = (L7buPSHIH8sTfWLN[]) arrayList.toArray(new L7buPSHIH8sTfWLN[size]);
            for (int i = size - 1; i >= 0; i--) {
                L7buPSHIH8sTfWLN l7buPSHIH8sTfWLN = l7buPSHIH8sTfWLNArr[i];
                if (l7buPSHIH8sTfWLN.VxUQ9tBhpHJ2AAEDNW8sghc4m.SuB3hEmTmbbRGAhtvOOmfKEon.isShowing()) {
                    l7buPSHIH8sTfWLN.VxUQ9tBhpHJ2AAEDNW8sghc4m.dismiss();
                }
            }
        }
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void f6ZQsR6bPLvvCDNXOUc(int i) {
        this.f6ZQsR6bPLvvCDNXOUc = true;
        this.TaDO7ogis3aEiWEtq = i;
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int i) {
        if (this.p59rPv72J9 != i) {
            this.p59rPv72J9 = i;
            this.Ca81ebIan1u = Gravity.getAbsoluteGravity(i, this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.getLayoutDirection());
        }
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void jW7EiD0YL6xkbB158jMUzhWNWb1y(boolean z) {
        this.q11o1hieEkZDhF1MGOZI26oZiDT = z;
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void ko09zE6UAgwkV(PopupWindow.OnDismissListener onDismissListener) {
        this.qNPQb1obP7 = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        L7buPSHIH8sTfWLN l7buPSHIH8sTfWLN;
        ArrayList arrayList = this.M9e7PWhFYLD2lOGMker;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                l7buPSHIH8sTfWLN = null;
                break;
            }
            l7buPSHIH8sTfWLN = (L7buPSHIH8sTfWLN) arrayList.get(i);
            if (!l7buPSHIH8sTfWLN.VxUQ9tBhpHJ2AAEDNW8sghc4m.SuB3hEmTmbbRGAhtvOOmfKEon.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (l7buPSHIH8sTfWLN != null) {
            l7buPSHIH8sTfWLN.zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void p59rPv72J9(View view) {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv != view) {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = view;
            this.Ca81ebIan1u = Gravity.getAbsoluteGravity(this.p59rPv72J9, view.getLayoutDirection());
        }
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void pYmKDYlAmhudp(int i) {
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = true;
        this.vBGA6pPLqSMuYGvprl270j7 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void vBGA6pPLqSMuYGvprl270j7(com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ r18) {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.lHLqDPOuDPv9Tah5rl1MDkuq12.vBGA6pPLqSMuYGvprl270j7(com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ):void");
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void zzpBGItXfub0yWj(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, boolean z) {
        ArrayList arrayList = this.M9e7PWhFYLD2lOGMker;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ == ((L7buPSHIH8sTfWLN) arrayList.get(i)).zzpBGItXfub0yWj) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((L7buPSHIH8sTfWLN) arrayList.get(i2)).zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr(false);
        }
        L7buPSHIH8sTfWLN l7buPSHIH8sTfWLN = (L7buPSHIH8sTfWLN) arrayList.remove(i);
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ2 = l7buPSHIH8sTfWLN.zzpBGItXfub0yWj;
        gqbNFvdPpZQMgIePeLMi gqbnfvdppzqmgiepelmi = l7buPSHIH8sTfWLN.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        PoHNXL5T4Q0 poHNXL5T4Q0 = gqbnfvdppzqmgiepelmi.SuB3hEmTmbbRGAhtvOOmfKEon;
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ2.ko09zE6UAgwkV(this);
        if (this.SuB3hEmTmbbRGAhtvOOmfKEon) {
            wNCrUb60z4jqAukJ142DKXiYVE.zzpBGItXfub0yWj(poHNXL5T4Q0, null);
            poHNXL5T4Q0.setAnimationStyle(0);
        }
        gqbnfvdppzqmgiepelmi.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.ko09zE6UAgwkV = ((L7buPSHIH8sTfWLN) arrayList.get(size2 - 1)).V57tEvNfxZVVcOCAOih5PKr;
        } else {
            this.ko09zE6UAgwkV = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((L7buPSHIH8sTfWLN) arrayList.get(0)).zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr(false);
                return;
            }
            return;
        }
        dismiss();
        DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr = this.w0Wu95l8dVNw5rZMRu;
        if (dRNSD7OTZrolKY4iK67pQWIr != null) {
            dRNSD7OTZrolKY4iK67pQWIr.zzpBGItXfub0yWj(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, true);
        }
        ViewTreeObserver viewTreeObserver = this.RhfGHxtXxy0M0grmp2jkRjQg;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.RhfGHxtXxy0M0grmp2jkRjQg.removeGlobalOnLayoutListener(this.HzCpKshMOoaw76hFcbOVRYMeRd);
            }
            this.RhfGHxtXxy0M0grmp2jkRjQg = null;
        }
        this.pYmKDYlAmhudp.removeOnAttachStateChangeListener(this.KUYypEB4eNWOZWVDpH);
        this.qNPQb1obP7.onDismiss();
    }
}
