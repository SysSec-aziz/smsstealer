package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class WiLYxtz85JCnc implements pHKSskKTBV, xzFpmFD3R5K5fyU, AdapterView.OnItemClickListener {
    public Rect V57tEvNfxZVVcOCAOih5PKr;

    public static int q1wNbhk2O6(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public abstract void Ca81ebIan1u(boolean z);

    public abstract void KUYypEB4eNWOZWVDpH(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ);

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean M9e7PWhFYLD2lOGMker(rkuo6pAmWq0N rkuo6pamwq0n) {
        return false;
    }

    public abstract void f6ZQsR6bPLvvCDNXOUc(int i);

    public abstract void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int i);

    public abstract void jW7EiD0YL6xkbB158jMUzhWNWb1y(boolean z);

    public abstract void ko09zE6UAgwkV(PopupWindow.OnDismissListener onDismissListener);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (UzzZGAjVT1KPJ) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (UzzZGAjVT1KPJ) listAdapter).VxUQ9tBhpHJ2AAEDNW8sghc4m.pYmKDYlAmhudp((MenuItem) listAdapter.getItem(i), this, !(this instanceof lHLqDPOuDPv9Tah5rl1MDkuq12) ? 0 : 4);
    }

    public abstract void p59rPv72J9(View view);

    public abstract void pYmKDYlAmhudp(int i);

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(rkuo6pAmWq0N rkuo6pamwq0n) {
        return false;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(Context context, Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
    }
}
