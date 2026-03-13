package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.vdodsodjsdt.SthXrZOjYRYhJk;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.xt830k6OSkTV6c9TmhiUQ;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int V57tEvNfxZVVcOCAOih5PKr;
    public final LinkedHashMap ZfQNn8hdWlEQ5cR94249PDsLR = new LinkedHashMap();
    public final SthXrZOjYRYhJk LaeGQIruHQu81hfJldjMOQSVblH3x = new SthXrZOjYRYhJk(this);
    public final xt830k6OSkTV6c9TmhiUQ zIvmSL0wzmmKGc3X39b2Gw2mUGE = new xt830k6OSkTV6c9TmhiUQ(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ej6unYlOWMDF.pYmKDYlAmhudp(intent, "intent");
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }
}
