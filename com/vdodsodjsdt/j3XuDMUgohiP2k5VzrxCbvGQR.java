package com.vdodsodjsdt;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class j3XuDMUgohiP2k5VzrxCbvGQR implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ j3XuDMUgohiP2k5VzrxCbvGQR(int i, Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                RN4c7Imz7HP3UxSANZr rN4c7Imz7HP3UxSANZr = (RN4c7Imz7HP3UxSANZr) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                oMrLCrx6GRyjLa omrlcrx6gryjla = rN4c7Imz7HP3UxSANZr.qygqjTppWwx992;
                omrlcrx6gryjla.setSelection(i);
                if (omrlcrx6gryjla.getOnItemClickListener() != null) {
                    omrlcrx6gryjla.performItemClick(view, i, rN4c7Imz7HP3UxSANZr.O1xDAlBZZlZdoEf747lCFHld.getItemId(i));
                }
                rN4c7Imz7HP3UxSANZr.dismiss();
                break;
            default:
                hEYFkY0Pa5rIEBwb4kWhO0E74Dn heyfky0pa5riebwb4kwho0e74dn = (hEYFkY0Pa5rIEBwb4kWhO0E74Dn) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                uLXxmkdsO6wfrm ulxxmkdso6wfrm = heyfky0pa5riebwb4kwho0e74dn.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                heyfky0pa5riebwb4kwho0e74dn.setText(heyfky0pa5riebwb4kwho0e74dn.convertSelectionToString(i < 0 ? !ulxxmkdso6wfrm.SuB3hEmTmbbRGAhtvOOmfKEon.isShowing() ? null : ulxxmkdso6wfrm.LaeGQIruHQu81hfJldjMOQSVblH3x.getSelectedItem() : heyfky0pa5riebwb4kwho0e74dn.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = heyfky0pa5riebwb4kwho0e74dn.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !ulxxmkdso6wfrm.SuB3hEmTmbbRGAhtvOOmfKEon.isShowing() ? null : ulxxmkdso6wfrm.LaeGQIruHQu81hfJldjMOQSVblH3x.getSelectedView();
                        i = !ulxxmkdso6wfrm.SuB3hEmTmbbRGAhtvOOmfKEon.isShowing() ? -1 : ulxxmkdso6wfrm.LaeGQIruHQu81hfJldjMOQSVblH3x.getSelectedItemPosition();
                        j = !ulxxmkdso6wfrm.SuB3hEmTmbbRGAhtvOOmfKEon.isShowing() ? Long.MIN_VALUE : ulxxmkdso6wfrm.LaeGQIruHQu81hfJldjMOQSVblH3x.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(ulxxmkdso6wfrm.LaeGQIruHQu81hfJldjMOQSVblH3x, view, i, j);
                }
                ulxxmkdso6wfrm.dismiss();
                break;
        }
    }
}
