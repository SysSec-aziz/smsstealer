package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class iU6FsG6uat0 extends BaseAdapter {
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m = -1;
    public final /* synthetic */ Ef1B8CWnH64aorj zzpBGItXfub0yWj;

    public iU6FsG6uat0(Ef1B8CWnH64aorj ef1B8CWnH64aorj) {
        this.zzpBGItXfub0yWj = ef1B8CWnH64aorj;
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.zzpBGItXfub0yWj.LaeGQIruHQu81hfJldjMOQSVblH3x;
        rkuo6pAmWq0N rkuo6pamwq0n = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.TaDO7ogis3aEiWEtq;
        if (rkuo6pamwq0n != null) {
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.GI83zq0G8e7zkn();
            ArrayList arrayList = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.M9e7PWhFYLD2lOGMker;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((rkuo6pAmWq0N) arrayList.get(i)) == rkuo6pamwq0n) {
                    this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
                    return;
                }
            }
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Ef1B8CWnH64aorj ef1B8CWnH64aorj = this.zzpBGItXfub0yWj;
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = ef1B8CWnH64aorj.LaeGQIruHQu81hfJldjMOQSVblH3x;
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.GI83zq0G8e7zkn();
        int size = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.M9e7PWhFYLD2lOGMker.size();
        ef1B8CWnH64aorj.getClass();
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((YybP2G5tPcuz9Zghx) view).V57tEvNfxZVVcOCAOih5PKr(getItem(i));
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
        Ef1B8CWnH64aorj ef1B8CWnH64aorj = this.zzpBGItXfub0yWj;
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = ef1B8CWnH64aorj.LaeGQIruHQu81hfJldjMOQSVblH3x;
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.GI83zq0G8e7zkn();
        ArrayList arrayList = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.M9e7PWhFYLD2lOGMker;
        ef1B8CWnH64aorj.getClass();
        int i2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (rkuo6pAmWq0N) arrayList.get(i);
    }
}
