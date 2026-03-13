package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class P7F708JA9fT7wZdjaAX8x extends WiLYxtz85JCnc implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public View Ca81ebIan1u;
    public final int GI83zq0G8e7zkn;
    public final Stuu2Qyz6BSCKFEomt5b51vUnV1HQ LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final gqbNFvdPpZQMgIePeLMi M9e7PWhFYLD2lOGMker;
    public final int NSjgqmGjEzuugn2SsG1mZFP;
    public boolean TaDO7ogis3aEiWEtq;
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final Context ZfQNn8hdWlEQ5cR94249PDsLR;
    public int f6ZQsR6bPLvvCDNXOUc;
    public DRNSD7OTZrolKY4iK67pQWIr h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public boolean ko09zE6UAgwkV;
    public View p59rPv72J9;
    public ViewTreeObserver pYmKDYlAmhudp;
    public PopupWindow.OnDismissListener q1wNbhk2O6;
    public final UzzZGAjVT1KPJ zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final oKfueTVJIz3 HzCpKshMOoaw76hFcbOVRYMeRd = new oKfueTVJIz3(3, this);
    public final QlGb8EPtaoCCLt3z12 KUYypEB4eNWOZWVDpH = new QlGb8EPtaoCCLt3z12(5, this);
    public int vBGA6pPLqSMuYGvprl270j7 = 0;

    public P7F708JA9fT7wZdjaAX8x(Context context, Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, View view, int i, boolean z) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = context;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = z;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new UzzZGAjVT1KPJ(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.GI83zq0G8e7zkn = i;
        Resources resources = context.getResources();
        this.NSjgqmGjEzuugn2SsG1mZFP = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.p59rPv72J9 = view;
        this.M9e7PWhFYLD2lOGMker = new gqbNFvdPpZQMgIePeLMi(context, null, i, 0);
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.zzpBGItXfub0yWj(this, context);
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void Ca81ebIan1u(boolean z) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr = z;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean GI83zq0G8e7zkn() {
        return false;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = dRNSD7OTZrolKY4iK67pQWIr;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = false;
        UzzZGAjVT1KPJ uzzZGAjVT1KPJ = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (uzzZGAjVT1KPJ != null) {
            uzzZGAjVT1KPJ.notifyDataSetChanged();
        }
    }

    @Override // com.vdodsodjsdt.pHKSskKTBV
    public final aVXgxTePUTvRAcd NSjgqmGjEzuugn2SsG1mZFP() {
        return this.M9e7PWhFYLD2lOGMker.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean V57tEvNfxZVVcOCAOih5PKr(qzGH0ZhUGLEjFhdFH7Y qzgh0zhuglejfhdfh7y) {
        boolean z;
        if (qzgh0zhuglejfhdfh7y.hasVisibleItems()) {
            blnUVhHW6WEth0ssGV8jUpl3oqU0 blnuvhhw6weth0ssgv8jupl3oqu0 = new blnUVhHW6WEth0ssGV8jUpl3oqU0(this.ZfQNn8hdWlEQ5cR94249PDsLR, qzgh0zhuglejfhdfh7y, this.Ca81ebIan1u, this.ZLZeBXTMq0zDztBxtRTuCHrapQ, this.GI83zq0G8e7zkn, 0);
            DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            blnuvhhw6weth0ssgv8jupl3oqu0.NSjgqmGjEzuugn2SsG1mZFP = dRNSD7OTZrolKY4iK67pQWIr;
            WiLYxtz85JCnc wiLYxtz85JCnc = blnuvhhw6weth0ssgv8jupl3oqu0.GI83zq0G8e7zkn;
            if (wiLYxtz85JCnc != null) {
                wiLYxtz85JCnc.HzCpKshMOoaw76hFcbOVRYMeRd(dRNSD7OTZrolKY4iK67pQWIr);
            }
            int size = qzgh0zhuglejfhdfh7y.zIvmSL0wzmmKGc3X39b2Gw2mUGE.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = qzgh0zhuglejfhdfh7y.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            blnuvhhw6weth0ssgv8jupl3oqu0.ZLZeBXTMq0zDztBxtRTuCHrapQ = z;
            WiLYxtz85JCnc wiLYxtz85JCnc2 = blnuvhhw6weth0ssgv8jupl3oqu0.GI83zq0G8e7zkn;
            if (wiLYxtz85JCnc2 != null) {
                wiLYxtz85JCnc2.Ca81ebIan1u(z);
            }
            blnuvhhw6weth0ssgv8jupl3oqu0.M9e7PWhFYLD2lOGMker = this.q1wNbhk2O6;
            this.q1wNbhk2O6 = null;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr(false);
            gqbNFvdPpZQMgIePeLMi gqbnfvdppzqmgiepelmi = this.M9e7PWhFYLD2lOGMker;
            int width = gqbnfvdppzqmgiepelmi.NSjgqmGjEzuugn2SsG1mZFP;
            int iP59rPv72J9 = gqbnfvdppzqmgiepelmi.p59rPv72J9();
            if ((Gravity.getAbsoluteGravity(this.vBGA6pPLqSMuYGvprl270j7, this.p59rPv72J9.getLayoutDirection()) & 7) == 5) {
                width += this.p59rPv72J9.getWidth();
            }
            if (!blnuvhhw6weth0ssgv8jupl3oqu0.zzpBGItXfub0yWj()) {
                if (blnuvhhw6weth0ssgv8jupl3oqu0.LaeGQIruHQu81hfJldjMOQSVblH3x != null) {
                    blnuvhhw6weth0ssgv8jupl3oqu0.ZfQNn8hdWlEQ5cR94249PDsLR(width, iP59rPv72J9, true, true);
                }
            }
            DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            if (dRNSD7OTZrolKY4iK67pQWIr2 != null) {
                dRNSD7OTZrolKY4iK67pQWIr2.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(qzgh0zhuglejfhdfh7y);
            }
            return true;
        }
        return false;
    }

    @Override // com.vdodsodjsdt.pHKSskKTBV
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return !this.ko09zE6UAgwkV && this.M9e7PWhFYLD2lOGMker.SuB3hEmTmbbRGAhtvOOmfKEon.isShowing();
    }

    @Override // com.vdodsodjsdt.pHKSskKTBV
    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        View view;
        if (VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            return;
        }
        if (this.ko09zE6UAgwkV || (view = this.p59rPv72J9) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.Ca81ebIan1u = view;
        gqbNFvdPpZQMgIePeLMi gqbnfvdppzqmgiepelmi = this.M9e7PWhFYLD2lOGMker;
        PoHNXL5T4Q0 poHNXL5T4Q0 = gqbnfvdppzqmgiepelmi.SuB3hEmTmbbRGAhtvOOmfKEon;
        PoHNXL5T4Q0 poHNXL5T4Q02 = gqbnfvdppzqmgiepelmi.SuB3hEmTmbbRGAhtvOOmfKEon;
        poHNXL5T4Q0.setOnDismissListener(this);
        gqbnfvdppzqmgiepelmi.ko09zE6UAgwkV = this;
        gqbnfvdppzqmgiepelmi.qNPQb1obP7 = true;
        poHNXL5T4Q02.setFocusable(true);
        View view2 = this.Ca81ebIan1u;
        boolean z = this.pYmKDYlAmhudp == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.pYmKDYlAmhudp = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.HzCpKshMOoaw76hFcbOVRYMeRd);
        }
        view2.addOnAttachStateChangeListener(this.KUYypEB4eNWOZWVDpH);
        gqbnfvdppzqmgiepelmi.pYmKDYlAmhudp = view2;
        gqbnfvdppzqmgiepelmi.p59rPv72J9 = this.vBGA6pPLqSMuYGvprl270j7;
        boolean z2 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        Context context = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        UzzZGAjVT1KPJ uzzZGAjVT1KPJ = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (!z2) {
            this.f6ZQsR6bPLvvCDNXOUc = WiLYxtz85JCnc.q1wNbhk2O6(uzzZGAjVT1KPJ, context, this.NSjgqmGjEzuugn2SsG1mZFP);
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = true;
        }
        gqbnfvdppzqmgiepelmi.ko09zE6UAgwkV(this.f6ZQsR6bPLvvCDNXOUc);
        poHNXL5T4Q02.setInputMethodMode(2);
        Rect rect = this.V57tEvNfxZVVcOCAOih5PKr;
        gqbnfvdppzqmgiepelmi.RhfGHxtXxy0M0grmp2jkRjQg = rect != null ? new Rect(rect) : null;
        gqbnfvdppzqmgiepelmi.ZfQNn8hdWlEQ5cR94249PDsLR();
        aVXgxTePUTvRAcd avxgxteputvracd = gqbnfvdppzqmgiepelmi.LaeGQIruHQu81hfJldjMOQSVblH3x;
        avxgxteputvracd.setOnKeyListener(this);
        if (this.TaDO7ogis3aEiWEtq) {
            Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ.q1wNbhk2O6 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) avxgxteputvracd, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(stuu2Qyz6BSCKFEomt5b51vUnV1HQ.q1wNbhk2O6);
                }
                frameLayout.setEnabled(false);
                avxgxteputvracd.addHeaderView(frameLayout, null, false);
            }
        }
        gqbnfvdppzqmgiepelmi.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(uzzZGAjVT1KPJ);
        gqbnfvdppzqmgiepelmi.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    @Override // com.vdodsodjsdt.pHKSskKTBV
    public final void dismiss() {
        if (VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            this.M9e7PWhFYLD2lOGMker.dismiss();
        }
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void f6ZQsR6bPLvvCDNXOUc(int i) {
        this.M9e7PWhFYLD2lOGMker.M9e7PWhFYLD2lOGMker(i);
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int i) {
        this.vBGA6pPLqSMuYGvprl270j7 = i;
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void jW7EiD0YL6xkbB158jMUzhWNWb1y(boolean z) {
        this.TaDO7ogis3aEiWEtq = z;
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void ko09zE6UAgwkV(PopupWindow.OnDismissListener onDismissListener) {
        this.q1wNbhk2O6 = onDismissListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.ko09zE6UAgwkV = true;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr(true);
        ViewTreeObserver viewTreeObserver = this.pYmKDYlAmhudp;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.pYmKDYlAmhudp = this.Ca81ebIan1u.getViewTreeObserver();
            }
            this.pYmKDYlAmhudp.removeGlobalOnLayoutListener(this.HzCpKshMOoaw76hFcbOVRYMeRd);
            this.pYmKDYlAmhudp = null;
        }
        this.Ca81ebIan1u.removeOnAttachStateChangeListener(this.KUYypEB4eNWOZWVDpH);
        PopupWindow.OnDismissListener onDismissListener = this.q1wNbhk2O6;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.p59rPv72J9 = view;
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void pYmKDYlAmhudp(int i) {
        this.M9e7PWhFYLD2lOGMker.NSjgqmGjEzuugn2SsG1mZFP = i;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void zzpBGItXfub0yWj(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, boolean z) {
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ != this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return;
        }
        dismiss();
        DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (dRNSD7OTZrolKY4iK67pQWIr != null) {
            dRNSD7OTZrolKY4iK67pQWIr.zzpBGItXfub0yWj(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, z);
        }
    }

    @Override // com.vdodsodjsdt.WiLYxtz85JCnc
    public final void KUYypEB4eNWOZWVDpH(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
    }
}
