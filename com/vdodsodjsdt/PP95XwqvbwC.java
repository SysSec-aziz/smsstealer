package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class PP95XwqvbwC extends aVXgxTePUTvRAcd {
    public final int Ca81ebIan1u;
    public final int h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public rkuo6pAmWq0N ko09zE6UAgwkV;
    public gVeEGsRwgJnjS pYmKDYlAmhudp;

    public PP95XwqvbwC(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.Ca81ebIan1u = 21;
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 22;
        } else {
            this.Ca81ebIan1u = 22;
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 21;
        }
    }

    @Override // com.vdodsodjsdt.aVXgxTePUTvRAcd, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        UzzZGAjVT1KPJ uzzZGAjVT1KPJ;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.pYmKDYlAmhudp != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                uzzZGAjVT1KPJ = (UzzZGAjVT1KPJ) headerViewListAdapter.getWrappedAdapter();
            } else {
                uzzZGAjVT1KPJ = (UzzZGAjVT1KPJ) adapter;
                headersCount = 0;
            }
            rkuo6pAmWq0N rkuo6pamwq0nZzpBGItXfub0yWj = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= uzzZGAjVT1KPJ.getCount()) ? null : uzzZGAjVT1KPJ.getItem(i);
            rkuo6pAmWq0N rkuo6pamwq0n = this.ko09zE6UAgwkV;
            if (rkuo6pamwq0n != rkuo6pamwq0nZzpBGItXfub0yWj) {
                Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = uzzZGAjVT1KPJ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (rkuo6pamwq0n != null) {
                    this.pYmKDYlAmhudp.ZLZeBXTMq0zDztBxtRTuCHrapQ(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, rkuo6pamwq0n);
                }
                this.ko09zE6UAgwkV = rkuo6pamwq0nZzpBGItXfub0yWj;
                if (rkuo6pamwq0nZzpBGItXfub0yWj != null) {
                    this.pYmKDYlAmhudp.LaeGQIruHQu81hfJldjMOQSVblH3x(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, rkuo6pamwq0nZzpBGItXfub0yWj);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.Ca81ebIan1u) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (UzzZGAjVT1KPJ) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (UzzZGAjVT1KPJ) adapter).VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr(false);
        return true;
    }

    public void setHoverListener(gVeEGsRwgJnjS gveegsrwgjnjs) {
        this.pYmKDYlAmhudp = gveegsrwgjnjs;
    }

    @Override // com.vdodsodjsdt.aVXgxTePUTvRAcd, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
