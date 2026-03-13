package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import com.vdodsodjsdt.AO2JzxMx6g;
import com.vdodsodjsdt.FG8LIxsgYiLSfhN0jYKIKr;
import com.vdodsodjsdt.afI5VlNN6JmVP6m;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements AO2JzxMx6g {
    @Override // com.vdodsodjsdt.AO2JzxMx6g
    public final List VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.vdodsodjsdt.AO2JzxMx6g
    public final Object zzpBGItXfub0yWj(Context context) {
        Choreographer.getInstance().postFrameCallback(new afI5VlNN6JmVP6m(this, context.getApplicationContext()));
        return new FG8LIxsgYiLSfhN0jYKIKr(23);
    }
}
