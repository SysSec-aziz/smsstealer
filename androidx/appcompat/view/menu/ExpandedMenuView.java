package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.vdodsodjsdt.KhgxllPUrJec7ES97XlUgbO1kpk7g;
import com.vdodsodjsdt.NrjuzzioPqfttNRptBDpZDzSYUrcM;
import com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
import com.vdodsodjsdt.b0ZGtNoko2W8IH5Mo0D9yU;
import com.vdodsodjsdt.rkuo6pAmWq0N;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements KhgxllPUrJec7ES97XlUgbO1kpk7g, b0ZGtNoko2W8IH5Mo0D9yU, AdapterView.OnItemClickListener {
    public static final int[] ZfQNn8hdWlEQ5cR94249PDsLR = {R.attr.background, R.attr.divider};
    public Stuu2Qyz6BSCKFEomt5b51vUnV1HQ V57tEvNfxZVVcOCAOih5PKr;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7 = NrjuzzioPqfttNRptBDpZDzSYUrcM.qNPQb1obP7(context, attributeSet, ZfQNn8hdWlEQ5cR94249PDsLR, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(1));
        }
        nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
    }

    @Override // com.vdodsodjsdt.KhgxllPUrJec7ES97XlUgbO1kpk7g
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(rkuo6pAmWq0N rkuo6pamwq0n) {
        return this.V57tEvNfxZVVcOCAOih5PKr.pYmKDYlAmhudp(rkuo6pamwq0n, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m((rkuo6pAmWq0N) getAdapter().getItem(i));
    }

    @Override // com.vdodsodjsdt.b0ZGtNoko2W8IH5Mo0D9yU
    public final void zzpBGItXfub0yWj(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        this.V57tEvNfxZVVcOCAOih5PKr = stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
    }
}
