package com.vdodsodjsdt;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class DYd1euFuwsj3pjLki7Uqtfv5B0 implements Hij5XtnFFPCab9C1G {
    public IBinder V57tEvNfxZVVcOCAOih5PKr;

    @Override // com.vdodsodjsdt.Hij5XtnFFPCab9C1G
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(Hij5XtnFFPCab9C1G.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            parcelObtain.writeStringArray(strArr);
            this.V57tEvNfxZVVcOCAOih5PKr.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }
}
