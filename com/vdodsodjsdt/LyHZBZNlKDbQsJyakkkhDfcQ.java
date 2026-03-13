package com.vdodsodjsdt;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class LyHZBZNlKDbQsJyakkkhDfcQ implements ILENsxnuzPXnxt, DialogInterface.OnClickListener {
    public CharSequence LaeGQIruHQu81hfJldjMOQSVblH3x;
    public ylxoNpJFhOMaxIrmmRe8ax1obKNtn V57tEvNfxZVVcOCAOih5PKr;
    public vIZaErdPxA2eRQPhj ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ oMrLCrx6GRyjLa zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public LyHZBZNlKDbQsJyakkkhDfcQ(oMrLCrx6GRyjLa omrlcrx6gryjla) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = omrlcrx6gryjla;
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final CharSequence Ca81ebIan1u() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final void GI83zq0G8e7zkn(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final void KUYypEB4eNWOZWVDpH(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final void M9e7PWhFYLD2lOGMker(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final Drawable V57tEvNfxZVVcOCAOih5PKr() {
        return null;
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        ylxoNpJFhOMaxIrmmRe8ax1obKNtn ylxonpjfhomaxirmmre8ax1obkntn = this.V57tEvNfxZVVcOCAOih5PKr;
        if (ylxonpjfhomaxirmmre8ax1obkntn != null) {
            return ylxonpjfhomaxirmmre8ax1obkntn.isShowing();
        }
        return false;
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final void dismiss() {
        ylxoNpJFhOMaxIrmmRe8ax1obKNtn ylxonpjfhomaxirmmre8ax1obkntn = this.V57tEvNfxZVVcOCAOih5PKr;
        if (ylxonpjfhomaxirmmre8ax1obkntn != null) {
            ylxonpjfhomaxirmmre8ax1obkntn.dismiss();
            this.V57tEvNfxZVVcOCAOih5PKr = null;
        }
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(ListAdapter listAdapter) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = (vIZaErdPxA2eRQPhj) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        oMrLCrx6GRyjLa omrlcrx6gryjla = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        omrlcrx6gryjla.setSelection(i);
        if (omrlcrx6gryjla.getOnItemClickListener() != null) {
            omrlcrx6gryjla.performItemClick(null, i, this.ZfQNn8hdWlEQ5cR94249PDsLR.getItemId(i));
        }
        dismiss();
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final int p59rPv72J9() {
        return 0;
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final void q1wNbhk2O6(int i, int i2) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
            return;
        }
        oMrLCrx6GRyjLa omrlcrx6gryjla = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        z8uyl4sTQr2O9dK1e z8uyl4stqr2o9dk1e = new z8uyl4sTQr2O9dK1e(omrlcrx6gryjla.getPopupContext());
        qGYIn01XoNfZuI2hQ0Q qgyin01xonfzui2hq0q = (qGYIn01XoNfZuI2hQ0Q) z8uyl4stqr2o9dk1e.ZfQNn8hdWlEQ5cR94249PDsLR;
        CharSequence charSequence = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (charSequence != null) {
            qgyin01xonfzui2hq0q.ZfQNn8hdWlEQ5cR94249PDsLR = charSequence;
        }
        vIZaErdPxA2eRQPhj vizaerdpxa2erqphj = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int selectedItemPosition = omrlcrx6gryjla.getSelectedItemPosition();
        qgyin01xonfzui2hq0q.ZLZeBXTMq0zDztBxtRTuCHrapQ = vizaerdpxa2erqphj;
        qgyin01xonfzui2hq0q.NSjgqmGjEzuugn2SsG1mZFP = this;
        qgyin01xonfzui2hq0q.M9e7PWhFYLD2lOGMker = selectedItemPosition;
        qgyin01xonfzui2hq0q.GI83zq0G8e7zkn = true;
        ylxoNpJFhOMaxIrmmRe8ax1obKNtn ylxonpjfhomaxirmmre8ax1obkntnZzpBGItXfub0yWj = z8uyl4stqr2o9dk1e.zzpBGItXfub0yWj();
        this.V57tEvNfxZVVcOCAOih5PKr = ylxonpjfhomaxirmmre8ax1obkntnZzpBGItXfub0yWj;
        AlertController$RecycleListView alertController$RecycleListView = ylxonpjfhomaxirmmre8ax1obkntnZzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP.LaeGQIruHQu81hfJldjMOQSVblH3x;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.V57tEvNfxZVVcOCAOih5PKr.show();
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(CharSequence charSequence) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = charSequence;
    }

    @Override // com.vdodsodjsdt.ILENsxnuzPXnxt
    public final int zzpBGItXfub0yWj() {
        return 0;
    }
}
