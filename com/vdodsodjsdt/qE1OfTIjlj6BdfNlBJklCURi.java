package com.vdodsodjsdt;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class qE1OfTIjlj6BdfNlBJklCURi implements xzFpmFD3R5K5fyU {
    public final /* synthetic */ Toolbar LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Stuu2Qyz6BSCKFEomt5b51vUnV1HQ V57tEvNfxZVVcOCAOih5PKr;
    public rkuo6pAmWq0N ZfQNn8hdWlEQ5cR94249PDsLR;

    public qE1OfTIjlj6BdfNlBJklCURi(Toolbar toolbar) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = toolbar;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean GI83zq0G8e7zkn() {
        return false;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR != null) {
            Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.V57tEvNfxZVVcOCAOih5PKr;
            if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ != null) {
                int size = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.zIvmSL0wzmmKGc3X39b2Gw2mUGE.size();
                for (int i = 0; i < size; i++) {
                    if (this.V57tEvNfxZVVcOCAOih5PKr.getItem(i) == this.ZfQNn8hdWlEQ5cR94249PDsLR) {
                        return;
                    }
                }
            }
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean M9e7PWhFYLD2lOGMker(rkuo6pAmWq0N rkuo6pamwq0n) {
        Toolbar toolbar = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        toolbar.V57tEvNfxZVVcOCAOih5PKr();
        ViewParent parent = toolbar.M9e7PWhFYLD2lOGMker.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.M9e7PWhFYLD2lOGMker);
            }
            toolbar.addView(toolbar.M9e7PWhFYLD2lOGMker);
        }
        View actionView = rkuo6pamwq0n.getActionView();
        toolbar.HzCpKshMOoaw76hFcbOVRYMeRd = actionView;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = rkuo6pamwq0n;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.HzCpKshMOoaw76hFcbOVRYMeRd);
            }
            RiiHsqLLQiI2YifuMiu riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP = Toolbar.NSjgqmGjEzuugn2SsG1mZFP();
            riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m = (toolbar.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 112) | 8388611;
            riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP.zzpBGItXfub0yWj = 2;
            toolbar.HzCpKshMOoaw76hFcbOVRYMeRd.setLayoutParams(riiHsqLLQiI2YifuMiuNSjgqmGjEzuugn2SsG1mZFP);
            toolbar.addView(toolbar.HzCpKshMOoaw76hFcbOVRYMeRd);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((RiiHsqLLQiI2YifuMiu) childAt.getLayoutParams()).zzpBGItXfub0yWj != 2 && childAt != toolbar.V57tEvNfxZVVcOCAOih5PKr) {
                toolbar.removeViewAt(childCount);
                toolbar.HVEwbdULInpTNa0IG.add(childAt);
            }
        }
        toolbar.requestLayout();
        rkuo6pamwq0n.pzqP2AqKW6J5PO8zCKnW = true;
        rkuo6pamwq0n.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        KeyEvent.Callback callback = toolbar.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (callback instanceof ibmugehVasbY0) {
            ((DcJZqsgwGYm3JXqta) ((ibmugehVasbY0) callback)).V57tEvNfxZVVcOCAOih5PKr.onActionViewExpanded();
        }
        toolbar.f6ZQsR6bPLvvCDNXOUc();
        return true;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean V57tEvNfxZVVcOCAOih5PKr(qzGH0ZhUGLEjFhdFH7Y qzgh0zhuglejfhdfh7y) {
        return false;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(Context context, Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        rkuo6pAmWq0N rkuo6pamwq0n;
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ2 != null && (rkuo6pamwq0n = this.ZfQNn8hdWlEQ5cR94249PDsLR) != null) {
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ2.ZfQNn8hdWlEQ5cR94249PDsLR(rkuo6pamwq0n);
        }
        this.V57tEvNfxZVVcOCAOih5PKr = stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(rkuo6pAmWq0N rkuo6pamwq0n) {
        Toolbar toolbar = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        KeyEvent.Callback callback = toolbar.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (callback instanceof ibmugehVasbY0) {
            ((DcJZqsgwGYm3JXqta) ((ibmugehVasbY0) callback)).V57tEvNfxZVVcOCAOih5PKr.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.HzCpKshMOoaw76hFcbOVRYMeRd);
        toolbar.removeView(toolbar.M9e7PWhFYLD2lOGMker);
        toolbar.HzCpKshMOoaw76hFcbOVRYMeRd = null;
        ArrayList arrayList = toolbar.HVEwbdULInpTNa0IG;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = null;
        toolbar.requestLayout();
        rkuo6pamwq0n.pzqP2AqKW6J5PO8zCKnW = false;
        rkuo6pamwq0n.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        toolbar.f6ZQsR6bPLvvCDNXOUc();
        return true;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void zzpBGItXfub0yWj(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, boolean z) {
    }
}
