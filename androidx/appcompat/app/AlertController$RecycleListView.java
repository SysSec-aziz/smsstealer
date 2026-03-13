package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import com.vdodsodjsdt.AuEvIFo0QoYm1PHNG;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AuEvIFo0QoYm1PHNG.f6ZQsR6bPLvvCDNXOUc);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
