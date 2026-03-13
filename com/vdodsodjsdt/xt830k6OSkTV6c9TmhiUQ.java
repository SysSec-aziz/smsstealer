package com.vdodsodjsdt;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xt830k6OSkTV6c9TmhiUQ extends Binder implements VPz1E3iZUn36QkZEX0AJN {
    public final /* synthetic */ MultiInstanceInvalidationService V57tEvNfxZVVcOCAOih5PKr;

    public xt830k6OSkTV6c9TmhiUQ(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.V57tEvNfxZVVcOCAOih5PKr = multiInstanceInvalidationService;
        attachInterface(this, VPz1E3iZUn36QkZEX0AJN.zzpBGItXfub0yWj);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = VPz1E3iZUn36QkZEX0AJN.zzpBGItXfub0yWj;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        Hij5XtnFFPCab9C1G hij5XtnFFPCab9C1G = null;
        Hij5XtnFFPCab9C1G hij5XtnFFPCab9C1G2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(Hij5XtnFFPCab9C1G.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof Hij5XtnFFPCab9C1G)) {
                    DYd1euFuwsj3pjLki7Uqtfv5B0 dYd1euFuwsj3pjLki7Uqtfv5B0 = new DYd1euFuwsj3pjLki7Uqtfv5B0();
                    dYd1euFuwsj3pjLki7Uqtfv5B0.V57tEvNfxZVVcOCAOih5PKr = strongBinder;
                    hij5XtnFFPCab9C1G = dYd1euFuwsj3pjLki7Uqtfv5B0;
                } else {
                    hij5XtnFFPCab9C1G = (Hij5XtnFFPCab9C1G) iInterfaceQueryLocalInterface;
                }
            }
            String string = parcel.readString();
            ej6unYlOWMDF.pYmKDYlAmhudp(hij5XtnFFPCab9C1G, "callback");
            int i3 = 0;
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.V57tEvNfxZVVcOCAOih5PKr;
                synchronized (multiInstanceInvalidationService.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    try {
                        int i4 = multiInstanceInvalidationService.V57tEvNfxZVVcOCAOih5PKr + 1;
                        multiInstanceInvalidationService.V57tEvNfxZVVcOCAOih5PKr = i4;
                        if (multiInstanceInvalidationService.LaeGQIruHQu81hfJldjMOQSVblH3x.register(hij5XtnFFPCab9C1G, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.ZfQNn8hdWlEQ5cR94249PDsLR.put(Integer.valueOf(i4), string);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.V57tEvNfxZVVcOCAOih5PKr--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(Hij5XtnFFPCab9C1G.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof Hij5XtnFFPCab9C1G)) {
                    DYd1euFuwsj3pjLki7Uqtfv5B0 dYd1euFuwsj3pjLki7Uqtfv5B02 = new DYd1euFuwsj3pjLki7Uqtfv5B0();
                    dYd1euFuwsj3pjLki7Uqtfv5B02.V57tEvNfxZVVcOCAOih5PKr = strongBinder2;
                    hij5XtnFFPCab9C1G2 = dYd1euFuwsj3pjLki7Uqtfv5B02;
                } else {
                    hij5XtnFFPCab9C1G2 = (Hij5XtnFFPCab9C1G) iInterfaceQueryLocalInterface2;
                }
            }
            int i5 = parcel.readInt();
            ej6unYlOWMDF.pYmKDYlAmhudp(hij5XtnFFPCab9C1G2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.V57tEvNfxZVVcOCAOih5PKr;
            synchronized (multiInstanceInvalidationService2.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                multiInstanceInvalidationService2.LaeGQIruHQu81hfJldjMOQSVblH3x.unregister(hij5XtnFFPCab9C1G2);
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i6 = parcel.readInt();
        String[] strArrCreateStringArray = parcel.createStringArray();
        ej6unYlOWMDF.pYmKDYlAmhudp(strArrCreateStringArray, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.V57tEvNfxZVVcOCAOih5PKr;
        synchronized (multiInstanceInvalidationService3.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            String str2 = (String) multiInstanceInvalidationService3.ZfQNn8hdWlEQ5cR94249PDsLR.get(Integer.valueOf(i6));
            if (str2 == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
            } else {
                int iBeginBroadcast = multiInstanceInvalidationService3.LaeGQIruHQu81hfJldjMOQSVblH3x.beginBroadcast();
                for (int i7 = 0; i7 < iBeginBroadcast; i7++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService3.LaeGQIruHQu81hfJldjMOQSVblH3x.getBroadcastCookie(i7);
                        ej6unYlOWMDF.Ca81ebIan1u(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str3 = (String) multiInstanceInvalidationService3.ZfQNn8hdWlEQ5cR94249PDsLR.get(num);
                        if (i6 != iIntValue && str2.equals(str3)) {
                            try {
                                ((Hij5XtnFFPCab9C1G) multiInstanceInvalidationService3.LaeGQIruHQu81hfJldjMOQSVblH3x.getBroadcastItem(i7)).VxUQ9tBhpHJ2AAEDNW8sghc4m(strArrCreateStringArray);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService3.LaeGQIruHQu81hfJldjMOQSVblH3x.finishBroadcast();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
