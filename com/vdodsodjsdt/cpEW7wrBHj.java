package com.vdodsodjsdt;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class cpEW7wrBHj extends vBbBrJPQxVfAKJPVGhF3v {
    public final /* synthetic */ com.google.android.material.datepicker.zApUME12W6SOuCVHxVPKvzGb3V VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ ddDbMgQuo9affXXIMNMhQZaG3 zzpBGItXfub0yWj;

    public cpEW7wrBHj(ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag3, com.google.android.material.datepicker.zApUME12W6SOuCVHxVPKvzGb3V zapume12w6soucvhxvpkvzgb3v) {
        this.zzpBGItXfub0yWj = dddbmgquo9affxximnmhqzag3;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = zapume12w6soucvhxvpkvzgb3v;
    }

    @Override // com.vdodsodjsdt.vBbBrJPQxVfAKJPVGhF3v
    public final void zzpBGItXfub0yWj(RecyclerView recyclerView, int i, int i2) {
        int iTf2p6GzNN7uQY7Lun0pJ;
        XMlqHp2sNChQxkYAA xMlqHp2sNChQxkYAA = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR;
        ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag3 = this.zzpBGItXfub0yWj;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) dddbmgquo9affxximnmhqzag3.H2VFYNJEVGAX.getLayoutManager();
            View viewDUIkOzkuF3hUt = linearLayoutManager.DUIkOzkuF3hUt(0, linearLayoutManager.TaDO7ogis3aEiWEtq(), false);
            iTf2p6GzNN7uQY7Lun0pJ = viewDUIkOzkuF3hUt == null ? -1 : wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewDUIkOzkuF3hUt);
        } else {
            iTf2p6GzNN7uQY7Lun0pJ = ((LinearLayoutManager) dddbmgquo9affxximnmhqzag3.H2VFYNJEVGAX.getLayoutManager()).tf2p6GzNN7uQY7Lun0pJ();
        }
        Calendar calendarVxUQ9tBhpHJ2AAEDNW8sghc4m = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m(xMlqHp2sNChQxkYAA.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.add(2, iTf2p6GzNN7uQY7Lun0pJ);
        TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir = new TOzjEyj2IN5fWYir(calendarVxUQ9tBhpHJ2AAEDNW8sghc4m);
        dddbmgquo9affxximnmhqzag3.KYZ9RyuOc42A2J = tOzjEyj2IN5fWYir;
        MaterialButton materialButton = dddbmgquo9affxximnmhqzag3.mhUCRR8ceqc7mAozW;
        Calendar calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2 = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m(xMlqHp2sNChQxkYAA.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2.add(2, iTf2p6GzNN7uQY7Lun0pJ);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2.set(5, 1);
        Calendar calendarVxUQ9tBhpHJ2AAEDNW8sghc4m3 = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m(calendarVxUQ9tBhpHJ2AAEDNW8sghc4m2);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m3.get(2);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m3.get(1);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m3.getMaximum(7);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m3.getActualMaximum(5);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m3.getTimeInMillis();
        long timeInMillis = calendarVxUQ9tBhpHJ2AAEDNW8sghc4m3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        dddbmgquo9affxximnmhqzag3.y1NaPKTl7R18DOr6e8i5(xMlqHp2sNChQxkYAA.V57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR(tOzjEyj2IN5fWYir));
    }
}
