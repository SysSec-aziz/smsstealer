package com.vdodsodjsdt;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class SthXrZOjYRYhJk extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public SthXrZOjYRYhJk(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ej6unYlOWMDF.pYmKDYlAmhudp((Hij5XtnFFPCab9C1G) iInterface, "callback");
        ej6unYlOWMDF.pYmKDYlAmhudp(obj, "cookie");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR.remove((Integer) obj);
    }
}
