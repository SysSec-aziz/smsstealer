package com.vdodsodjsdt;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class NbdCSfBzv70H3 extends dip85SLOWSmNG3 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean BJQHddi0Plr5ElWetCyaixWOg9;
    public boolean GE1sqSYiEYQO2ew7WEZwTtUeS5;
    public boolean H2VFYNJEVGAX;
    public int KYZ9RyuOc42A2J;
    public final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ Z1FjjMJ0suz8AFI7gsA4GDLMXv;
    public Dialog bjhcQ0u7VT2OYYrwk96HrWoN;
    public final x4ZznCT5cs0ehmX6AZBN hKs1wlZyvtUNaW1f5ABIGacfPcvX;
    public boolean mhUCRR8ceqc7mAozW;
    public int rERAmyEtGV6ANGszuKcQI;
    public boolean tFRdVJAePmTx77bP7FAN0uI;
    public final T8gPfMRVLsvgBXr8Y7f0wM vXWl0o6I4U59CgHs9;
    public int wdI7vzA3Qmcwd;
    public boolean zOk739gUM7zIZC25HHUxoiyixWFjn;

    public NbdCSfBzv70H3() {
        new RfOSIaL6qUBGKJY9MSCBP5ba(3, this);
        this.hKs1wlZyvtUNaW1f5ABIGacfPcvX = new x4ZznCT5cs0ehmX6AZBN(this);
        this.vXWl0o6I4U59CgHs9 = new T8gPfMRVLsvgBXr8Y7f0wM(this);
        this.wdI7vzA3Qmcwd = 0;
        this.KYZ9RyuOc42A2J = 0;
        this.zOk739gUM7zIZC25HHUxoiyixWFjn = true;
        this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = true;
        this.rERAmyEtGV6ANGszuKcQI = -1;
        this.Z1FjjMJ0suz8AFI7gsA4GDLMXv = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(17, this);
        this.mhUCRR8ceqc7mAozW = false;
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final void Ca81ebIan1u() {
        this.vE4yDIjexsP2lGjLaTcB = true;
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public void Irh5auREsoeV1C1RaBamlmy(Bundle bundle) {
        Dialog dialog = this.bjhcQ0u7VT2OYYrwk96HrWoN;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.wdI7vzA3Qmcwd;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.KYZ9RyuOc42A2J;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.zOk739gUM7zIZC25HHUxoiyixWFjn;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.GE1sqSYiEYQO2ew7WEZwTtUeS5;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.rERAmyEtGV6ANGszuKcQI;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public Dialog O1xDAlBZZlZdoEf747lCFHld() {
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DROYxU4kEz5Lr68JnICMD4KLVhG(SuB3hEmTmbbRGAhtvOOmfKEon(), this.KYZ9RyuOc42A2J);
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final void RhfGHxtXxy0M0grmp2jkRjQg(Bundle bundle) {
        Bundle bundle2;
        this.vE4yDIjexsP2lGjLaTcB = true;
        if (this.bjhcQ0u7VT2OYYrwk96HrWoN == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.bjhcQ0u7VT2OYYrwk96HrWoN.onRestoreInstanceState(bundle2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0044, B:29:0x004e, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0066), top: B:49:0x001a }] */
    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.LayoutInflater TaDO7ogis3aEiWEtq(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.NbdCSfBzv70H3.TaDO7ogis3aEiWEtq(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final void f6ZQsR6bPLvvCDNXOUc() {
        this.vE4yDIjexsP2lGjLaTcB = true;
        Dialog dialog = this.bjhcQ0u7VT2OYYrwk96HrWoN;
        if (dialog != null) {
            this.BJQHddi0Plr5ElWetCyaixWOg9 = true;
            dialog.setOnDismissListener(null);
            this.bjhcQ0u7VT2OYYrwk96HrWoN.dismiss();
            if (!this.tFRdVJAePmTx77bP7FAN0uI) {
                onDismiss(this.bjhcQ0u7VT2OYYrwk96HrWoN);
            }
            this.bjhcQ0u7VT2OYYrwk96HrWoN = null;
            this.mhUCRR8ceqc7mAozW = false;
        }
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public void ko09zE6UAgwkV(Bundle bundle) {
        super.ko09zE6UAgwkV(bundle);
        new Handler();
        this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = this.w0Wu95l8dVNw5rZMRu == 0;
        if (bundle != null) {
            this.wdI7vzA3Qmcwd = bundle.getInt("android:style", 0);
            this.KYZ9RyuOc42A2J = bundle.getInt("android:theme", 0);
            this.zOk739gUM7zIZC25HHUxoiyixWFjn = bundle.getBoolean("android:cancelable", true);
            this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = bundle.getBoolean("android:showsDialog", this.GE1sqSYiEYQO2ew7WEZwTtUeS5);
            this.rERAmyEtGV6ANGszuKcQI = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.BJQHddi0Plr5ElWetCyaixWOg9) {
            return;
        }
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.tFRdVJAePmTx77bP7FAN0uI) {
            return;
        }
        this.tFRdVJAePmTx77bP7FAN0uI = true;
        Dialog dialog = this.bjhcQ0u7VT2OYYrwk96HrWoN;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.bjhcQ0u7VT2OYYrwk96HrWoN.dismiss();
        }
        this.BJQHddi0Plr5ElWetCyaixWOg9 = true;
        if (this.rERAmyEtGV6ANGszuKcQI >= 0) {
            okcUO69vEcgndIAn0R okcuo69vecgndian0rM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
            int i = this.rERAmyEtGV6ANGszuKcQI;
            if (i < 0) {
                throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Bad id: ", i));
            }
            okcuo69vecgndian0rM9e7PWhFYLD2lOGMker.Irh5auREsoeV1C1RaBamlmy(new dmvxkr6fgq(okcuo69vecgndian0rM9e7PWhFYLD2lOGMker, i), true);
            this.rERAmyEtGV6ANGszuKcQI = -1;
            return;
        }
        DerC1yFc8TaMSlgxC6TqZtz9 derC1yFc8TaMSlgxC6TqZtz9 = new DerC1yFc8TaMSlgxC6TqZtz9(M9e7PWhFYLD2lOGMker());
        derC1yFc8TaMSlgxC6TqZtz9.Ca81ebIan1u = true;
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = this.f6ZQsR6bPLvvCDNXOUc;
        if (okcuo69vecgndian0r != null && okcuo69vecgndian0r != derC1yFc8TaMSlgxC6TqZtz9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        derC1yFc8TaMSlgxC6TqZtz9.zzpBGItXfub0yWj(new QOMlgg2N3CPFvlf(3, this));
        if (derC1yFc8TaMSlgxC6TqZtz9.pYmKDYlAmhudp) {
            throw new IllegalStateException("commit already called");
        }
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "Commit: " + derC1yFc8TaMSlgxC6TqZtz9);
            PrintWriter printWriter = new PrintWriter(new fZomDShQOetqV85bG());
            derC1yFc8TaMSlgxC6TqZtz9.ZfQNn8hdWlEQ5cR94249PDsLR("  ", printWriter, true);
            printWriter.close();
        }
        derC1yFc8TaMSlgxC6TqZtz9.pYmKDYlAmhudp = true;
        boolean z = derC1yFc8TaMSlgxC6TqZtz9.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        okcUO69vEcgndIAn0R okcuo69vecgndian0r2 = derC1yFc8TaMSlgxC6TqZtz9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (z) {
            derC1yFc8TaMSlgxC6TqZtz9.ko09zE6UAgwkV = okcuo69vecgndian0r2.GI83zq0G8e7zkn.getAndIncrement();
        } else {
            derC1yFc8TaMSlgxC6TqZtz9.ko09zE6UAgwkV = -1;
        }
        okcuo69vecgndian0r2.Irh5auREsoeV1C1RaBamlmy(derC1yFc8TaMSlgxC6TqZtz9, true);
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final void pYmKDYlAmhudp(Context context) {
        super.pYmKDYlAmhudp(context);
        this.gBaBUmihn5l4u.ZfQNn8hdWlEQ5cR94249PDsLR(this.Z1FjjMJ0suz8AFI7gsA4GDLMXv);
        this.tFRdVJAePmTx77bP7FAN0uI = false;
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public void q11o1hieEkZDhF1MGOZI26oZiDT() {
        this.vE4yDIjexsP2lGjLaTcB = true;
        Dialog dialog = this.bjhcQ0u7VT2OYYrwk96HrWoN;
        if (dialog != null) {
            this.BJQHddi0Plr5ElWetCyaixWOg9 = false;
            dialog.show();
            View decorView = this.bjhcQ0u7VT2OYYrwk96HrWoN.getWindow().getDecorView();
            ej6unYlOWMDF.pYmKDYlAmhudp(decorView, "<this>");
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final void qNPQb1obP7(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.qNPQb1obP7(layoutInflater, viewGroup, bundle);
        if (this.HVEwbdULInpTNa0IG != null || this.bjhcQ0u7VT2OYYrwk96HrWoN == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.bjhcQ0u7VT2OYYrwk96HrWoN.onRestoreInstanceState(bundle2);
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final void vBGA6pPLqSMuYGvprl270j7() {
        this.vE4yDIjexsP2lGjLaTcB = true;
        if (!this.tFRdVJAePmTx77bP7FAN0uI) {
            this.tFRdVJAePmTx77bP7FAN0uI = true;
        }
        androidx.lifecycle.coyP1hCgJ7zr56eqQoO7H04E coyp1hcgj7zr56eqqoo7h04e = this.gBaBUmihn5l4u;
        coyp1hcgj7zr56eqqoo7h04e.getClass();
        androidx.lifecycle.coyP1hCgJ7zr56eqQoO7H04E.VxUQ9tBhpHJ2AAEDNW8sghc4m("removeObserver");
        RrCRc3N74e6C8w8 rrCRc3N74e6C8w8 = (RrCRc3N74e6C8w8) coyp1hcgj7zr56eqqoo7h04e.zzpBGItXfub0yWj.zzpBGItXfub0yWj(this.Z1FjjMJ0suz8AFI7gsA4GDLMXv);
        if (rrCRc3N74e6C8w8 == null) {
            return;
        }
        rrCRc3N74e6C8w8.ZfQNn8hdWlEQ5cR94249PDsLR();
        rrCRc3N74e6C8w8.V57tEvNfxZVVcOCAOih5PKr(false);
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public void w0Wu95l8dVNw5rZMRu() {
        this.vE4yDIjexsP2lGjLaTcB = true;
        Dialog dialog = this.bjhcQ0u7VT2OYYrwk96HrWoN;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final ej6unYlOWMDF zzpBGItXfub0yWj() {
        return new iT27FzccwtA(this, new uh2oy4CFwMxi4Tr3MBYYO0E(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
