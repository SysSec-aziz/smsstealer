package com.vdodsodjsdt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class UzzZGAjVT1KPJ extends BaseAdapter {
    public final LayoutInflater LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public final Stuu2Qyz6BSCKFEomt5b51vUnV1HQ VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj = -1;

    public UzzZGAjVT1KPJ(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, LayoutInflater layoutInflater, boolean z, int i) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = z;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = layoutInflater;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        rkuo6pAmWq0N rkuo6pamwq0n = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.TaDO7ogis3aEiWEtq;
        if (rkuo6pamwq0n != null) {
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.GI83zq0G8e7zkn();
            ArrayList arrayList = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.M9e7PWhFYLD2lOGMker;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((rkuo6pAmWq0N) arrayList.get(i)) == rkuo6pamwq0n) {
                    this.zzpBGItXfub0yWj = i;
                    return;
                }
            }
        }
        this.zzpBGItXfub0yWj = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListKUYypEB4eNWOZWVDpH;
        boolean z = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (z) {
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.GI83zq0G8e7zkn();
            arrayListKUYypEB4eNWOZWVDpH = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.M9e7PWhFYLD2lOGMker;
        } else {
            arrayListKUYypEB4eNWOZWVDpH = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.KUYypEB4eNWOZWVDpH();
        }
        return this.zzpBGItXfub0yWj < 0 ? arrayListKUYypEB4eNWOZWVDpH.size() : arrayListKUYypEB4eNWOZWVDpH.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.LaeGQIruHQu81hfJldjMOQSVblH3x.inflate(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, viewGroup, false);
        }
        int i2 = getItem(i).zzpBGItXfub0yWj;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).zzpBGItXfub0yWj : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m.q1wNbhk2O6() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        YybP2G5tPcuz9Zghx yybP2G5tPcuz9Zghx = (YybP2G5tPcuz9Zghx) view;
        if (this.V57tEvNfxZVVcOCAOih5PKr) {
            listMenuItemView.setForceShowIcon(true);
        }
        yybP2G5tPcuz9Zghx.V57tEvNfxZVVcOCAOih5PKr(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: zzpBGItXfub0yWj, reason: merged with bridge method [inline-methods] */
    public final rkuo6pAmWq0N getItem(int i) {
        ArrayList arrayListKUYypEB4eNWOZWVDpH;
        boolean z = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (z) {
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.GI83zq0G8e7zkn();
            arrayListKUYypEB4eNWOZWVDpH = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.M9e7PWhFYLD2lOGMker;
        } else {
            arrayListKUYypEB4eNWOZWVDpH = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.KUYypEB4eNWOZWVDpH();
        }
        int i2 = this.zzpBGItXfub0yWj;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (rkuo6pAmWq0N) arrayListKUYypEB4eNWOZWVDpH.get(i);
    }
}
