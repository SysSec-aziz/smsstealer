package com.vdodsodjsdt;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RAU9GtBZd7wl {
    public long LaeGQIruHQu81hfJldjMOQSVblH3x;
    public long V57tEvNfxZVVcOCAOih5PKr;
    public IxShTNMvCWlbR VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public long ZfQNn8hdWlEQ5cR94249PDsLR;
    public long zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public ArrayList zzpBGItXfub0yWj;

    public static void zzpBGItXfub0yWj(WFEUpQgjHl wFEUpQgjHl) {
        RecyclerView recyclerView;
        int i = wFEUpQgjHl.M9e7PWhFYLD2lOGMker;
        if (wFEUpQgjHl.zIvmSL0wzmmKGc3X39b2Gw2mUGE() || (i & 4) != 0 || (recyclerView = wFEUpQgjHl.ko09zE6UAgwkV) == null) {
            return;
        }
        recyclerView.O1xDAlBZZlZdoEf747lCFHld(wFEUpQgjHl);
    }

    public abstract void LaeGQIruHQu81hfJldjMOQSVblH3x();

    public final void V57tEvNfxZVVcOCAOih5PKr(WFEUpQgjHl wFEUpQgjHl) {
        IxShTNMvCWlbR ixShTNMvCWlbR = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (ixShTNMvCWlbR != null) {
            RecyclerView recyclerView = ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            boolean z = true;
            wFEUpQgjHl.p59rPv72J9(true);
            View view = wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (wFEUpQgjHl.NSjgqmGjEzuugn2SsG1mZFP != null && wFEUpQgjHl.GI83zq0G8e7zkn == null) {
                wFEUpQgjHl.NSjgqmGjEzuugn2SsG1mZFP = null;
            }
            wFEUpQgjHl.GI83zq0G8e7zkn = null;
            if ((wFEUpQgjHl.M9e7PWhFYLD2lOGMker & 16) != 0) {
                return;
            }
            yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c = recyclerView.ZfQNn8hdWlEQ5cR94249PDsLR;
            recyclerView.GE1sqSYiEYQO2ew7WEZwTtUeS5();
            NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            xBkpwtKksCOQS xbkpwtkkscoqs = (xBkpwtKksCOQS) nrjuzzioPqfttNRptBDpZDzSYUrcM.V57tEvNfxZVVcOCAOih5PKr;
            IxShTNMvCWlbR ixShTNMvCWlbR2 = (IxShTNMvCWlbR) nrjuzzioPqfttNRptBDpZDzSYUrcM.zzpBGItXfub0yWj;
            int iIndexOfChild = ixShTNMvCWlbR2.VxUQ9tBhpHJ2AAEDNW8sghc4m.indexOfChild(view);
            if (iIndexOfChild == -1) {
                nrjuzzioPqfttNRptBDpZDzSYUrcM.HVEwbdULInpTNa0IG(view);
            } else if (xbkpwtkkscoqs.ZfQNn8hdWlEQ5cR94249PDsLR(iIndexOfChild)) {
                xbkpwtkkscoqs.ZLZeBXTMq0zDztBxtRTuCHrapQ(iIndexOfChild);
                nrjuzzioPqfttNRptBDpZDzSYUrcM.HVEwbdULInpTNa0IG(view);
                ixShTNMvCWlbR2.NSjgqmGjEzuugn2SsG1mZFP(iIndexOfChild);
            } else {
                z = false;
            }
            if (z) {
                WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(view);
                yhxkwue1zri6a9vau8hg9c.HzCpKshMOoaw76hFcbOVRYMeRd(wFEUpQgjHlQygqjTppWwx992);
                yhxkwue1zri6a9vau8hg9c.NSjgqmGjEzuugn2SsG1mZFP(wFEUpQgjHlQygqjTppWwx992);
            }
            recyclerView.rERAmyEtGV6ANGszuKcQI(!z);
            if (z || !wFEUpQgjHl.M9e7PWhFYLD2lOGMker()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(WFEUpQgjHl wFEUpQgjHl, WFEUpQgjHl wFEUpQgjHl2, mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k, mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k2);

    public abstract void ZfQNn8hdWlEQ5cR94249PDsLR(WFEUpQgjHl wFEUpQgjHl);

    public abstract boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE();
}
