package com.vdodsodjsdt;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Ef1B8CWnH64aorj implements xzFpmFD3R5K5fyU, AdapterView.OnItemClickListener {
    public Stuu2Qyz6BSCKFEomt5b51vUnV1HQ LaeGQIruHQu81hfJldjMOQSVblH3x;
    public iU6FsG6uat0 NSjgqmGjEzuugn2SsG1mZFP;
    public Context V57tEvNfxZVVcOCAOih5PKr;
    public DRNSD7OTZrolKY4iK67pQWIr ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public LayoutInflater ZfQNn8hdWlEQ5cR94249PDsLR;
    public ExpandedMenuView zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public Ef1B8CWnH64aorj(ContextWrapper contextWrapper) {
        this.V57tEvNfxZVVcOCAOih5PKr = contextWrapper;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = LayoutInflater.from(contextWrapper);
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean GI83zq0G8e7zkn() {
        return false;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr) {
        throw null;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        iU6FsG6uat0 iu6fsg6uat0 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (iu6fsg6uat0 != null) {
            iu6fsg6uat0.notifyDataSetChanged();
        }
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean M9e7PWhFYLD2lOGMker(rkuo6pAmWq0N rkuo6pamwq0n) {
        return false;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean V57tEvNfxZVVcOCAOih5PKr(qzGH0ZhUGLEjFhdFH7Y qzgh0zhuglejfhdfh7y) {
        boolean zHasVisibleItems = qzgh0zhuglejfhdfh7y.hasVisibleItems();
        Context context = qzgh0zhuglejfhdfh7y.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (!zHasVisibleItems) {
            return false;
        }
        VIqtZgRk6XzgvLxcoqHg vIqtZgRk6XzgvLxcoqHg = new VIqtZgRk6XzgvLxcoqHg();
        vIqtZgRk6XzgvLxcoqHg.V57tEvNfxZVVcOCAOih5PKr = qzgh0zhuglejfhdfh7y;
        z8uyl4sTQr2O9dK1e z8uyl4stqr2o9dk1e = new z8uyl4sTQr2O9dK1e(context);
        qGYIn01XoNfZuI2hQ0Q qgyin01xonfzui2hq0q = (qGYIn01XoNfZuI2hQ0Q) z8uyl4stqr2o9dk1e.ZfQNn8hdWlEQ5cR94249PDsLR;
        Ef1B8CWnH64aorj ef1B8CWnH64aorj = new Ef1B8CWnH64aorj(qgyin01xonfzui2hq0q.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        vIqtZgRk6XzgvLxcoqHg.LaeGQIruHQu81hfJldjMOQSVblH3x = ef1B8CWnH64aorj;
        ef1B8CWnH64aorj.ZLZeBXTMq0zDztBxtRTuCHrapQ = vIqtZgRk6XzgvLxcoqHg;
        qzgh0zhuglejfhdfh7y.zzpBGItXfub0yWj(ef1B8CWnH64aorj, context);
        Ef1B8CWnH64aorj ef1B8CWnH64aorj2 = vIqtZgRk6XzgvLxcoqHg.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (ef1B8CWnH64aorj2.NSjgqmGjEzuugn2SsG1mZFP == null) {
            ef1B8CWnH64aorj2.NSjgqmGjEzuugn2SsG1mZFP = new iU6FsG6uat0(ef1B8CWnH64aorj2);
        }
        qgyin01xonfzui2hq0q.ZLZeBXTMq0zDztBxtRTuCHrapQ = ef1B8CWnH64aorj2.NSjgqmGjEzuugn2SsG1mZFP;
        qgyin01xonfzui2hq0q.NSjgqmGjEzuugn2SsG1mZFP = vIqtZgRk6XzgvLxcoqHg;
        View view = qzgh0zhuglejfhdfh7y.Ca81ebIan1u;
        if (view != null) {
            qgyin01xonfzui2hq0q.LaeGQIruHQu81hfJldjMOQSVblH3x = view;
        } else {
            qgyin01xonfzui2hq0q.V57tEvNfxZVVcOCAOih5PKr = qzgh0zhuglejfhdfh7y.p59rPv72J9;
            qgyin01xonfzui2hq0q.ZfQNn8hdWlEQ5cR94249PDsLR = qzgh0zhuglejfhdfh7y.q1wNbhk2O6;
        }
        qgyin01xonfzui2hq0q.zIvmSL0wzmmKGc3X39b2Gw2mUGE = vIqtZgRk6XzgvLxcoqHg;
        ylxoNpJFhOMaxIrmmRe8ax1obKNtn ylxonpjfhomaxirmmre8ax1obkntnZzpBGItXfub0yWj = z8uyl4stqr2o9dk1e.zzpBGItXfub0yWj();
        vIqtZgRk6XzgvLxcoqHg.ZfQNn8hdWlEQ5cR94249PDsLR = ylxonpjfhomaxirmmre8ax1obkntnZzpBGItXfub0yWj;
        ylxonpjfhomaxirmmre8ax1obkntnZzpBGItXfub0yWj.setOnDismissListener(vIqtZgRk6XzgvLxcoqHg);
        WindowManager.LayoutParams attributes = vIqtZgRk6XzgvLxcoqHg.ZfQNn8hdWlEQ5cR94249PDsLR.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        vIqtZgRk6XzgvLxcoqHg.ZfQNn8hdWlEQ5cR94249PDsLR.show();
        DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (dRNSD7OTZrolKY4iK67pQWIr == null) {
            return true;
        }
        dRNSD7OTZrolKY4iK67pQWIr.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(qzgh0zhuglejfhdfh7y);
        return true;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(Context context, Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        if (this.V57tEvNfxZVVcOCAOih5PKr != null) {
            this.V57tEvNfxZVVcOCAOih5PKr = context;
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR = LayoutInflater.from(context);
            }
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
        iU6FsG6uat0 iu6fsg6uat0 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (iu6fsg6uat0 != null) {
            iu6fsg6uat0.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.pYmKDYlAmhudp(this.NSjgqmGjEzuugn2SsG1mZFP.getItem(i), this, 0);
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(rkuo6pAmWq0N rkuo6pamwq0n) {
        return false;
    }

    @Override // com.vdodsodjsdt.xzFpmFD3R5K5fyU
    public final void zzpBGItXfub0yWj(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, boolean z) {
        DRNSD7OTZrolKY4iK67pQWIr dRNSD7OTZrolKY4iK67pQWIr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (dRNSD7OTZrolKY4iK67pQWIr != null) {
            dRNSD7OTZrolKY4iK67pQWIr.zzpBGItXfub0yWj(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, z);
        }
    }
}
