package com.vdodsodjsdt;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nUCZnYD4kVZfjwlfZTu7z implements Handler.Callback {
    public final /* synthetic */ ZIqdBIWI9mxq4Xsi8 VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public nUCZnYD4kVZfjwlfZTu7z(ZIqdBIWI9mxq4Xsi8 zIqdBIWI9mxq4Xsi8) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = zIqdBIWI9mxq4Xsi8;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        ZIqdBIWI9mxq4Xsi8 zIqdBIWI9mxq4Xsi8 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (zIqdBIWI9mxq4Xsi8.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            throw null;
        }
    }
}
