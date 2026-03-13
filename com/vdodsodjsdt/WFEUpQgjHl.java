package com.vdodsodjsdt;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class WFEUpQgjHl {
    public static final List f6ZQsR6bPLvvCDNXOUc = Collections.EMPTY_LIST;
    public int M9e7PWhFYLD2lOGMker;
    public final View VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public YrYFQ7bf7bxLdH jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public RecyclerView ko09zE6UAgwkV;
    public WeakReference zzpBGItXfub0yWj;
    public int V57tEvNfxZVVcOCAOih5PKr = -1;
    public int ZfQNn8hdWlEQ5cR94249PDsLR = -1;
    public long LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE = -1;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ = -1;
    public WFEUpQgjHl NSjgqmGjEzuugn2SsG1mZFP = null;
    public WFEUpQgjHl GI83zq0G8e7zkn = null;
    public final ArrayList HzCpKshMOoaw76hFcbOVRYMeRd = null;
    public final List KUYypEB4eNWOZWVDpH = null;
    public int q1wNbhk2O6 = 0;
    public yhxKWuE1ZRi6a9VAU8HG9C p59rPv72J9 = null;
    public boolean Ca81ebIan1u = false;
    public int h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 0;
    public int pYmKDYlAmhudp = -1;

    public WFEUpQgjHl(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = view;
    }

    public final boolean Ca81ebIan1u() {
        return (this.M9e7PWhFYLD2lOGMker & 128) != 0;
    }

    public final boolean GI83zq0G8e7zkn() {
        return this.p59rPv72J9 != null;
    }

    public final boolean HzCpKshMOoaw76hFcbOVRYMeRd() {
        return (this.M9e7PWhFYLD2lOGMker & 2) != 0;
    }

    public final void KUYypEB4eNWOZWVDpH(int i, boolean z) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR == -1) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = this.V57tEvNfxZVVcOCAOih5PKr;
        }
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == -1) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = this.V57tEvNfxZVVcOCAOih5PKr;
        }
        if (z) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ += i;
        }
        this.V57tEvNfxZVVcOCAOih5PKr += i;
        View view = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (view.getLayoutParams() != null) {
            ((YoYMmBKQmkacZj7lMi9c) view.getLayoutParams()).V57tEvNfxZVVcOCAOih5PKr = true;
        }
    }

    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return (this.M9e7PWhFYLD2lOGMker & 1) != 0;
    }

    public final boolean M9e7PWhFYLD2lOGMker() {
        return (this.M9e7PWhFYLD2lOGMker & 256) != 0;
    }

    public final boolean NSjgqmGjEzuugn2SsG1mZFP() {
        return (this.M9e7PWhFYLD2lOGMker & 8) != 0;
    }

    public final List V57tEvNfxZVVcOCAOih5PKr() {
        ArrayList arrayList;
        return ((this.M9e7PWhFYLD2lOGMker & 1024) != 0 || (arrayList = this.HzCpKshMOoaw76hFcbOVRYMeRd) == null || arrayList.size() == 0) ? f6ZQsR6bPLvvCDNXOUc : this.KUYypEB4eNWOZWVDpH;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        this.M9e7PWhFYLD2lOGMker = i | this.M9e7PWhFYLD2lOGMker;
    }

    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        if ((this.M9e7PWhFYLD2lOGMker & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        return !this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hasTransientState();
    }

    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR() {
        View view = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        return (view.getParent() == null || view.getParent() == this.ko09zE6UAgwkV) ? false : true;
    }

    public final boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv() {
        return (this.M9e7PWhFYLD2lOGMker & 32) != 0;
    }

    public final void p59rPv72J9(boolean z) {
        int i = this.q1wNbhk2O6;
        int i2 = z ? i - 1 : i + 1;
        this.q1wNbhk2O6 = i2;
        if (i2 < 0) {
            this.q1wNbhk2O6 = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z && i2 == 1) {
            this.M9e7PWhFYLD2lOGMker |= 16;
        } else if (z && i2 == 0) {
            this.M9e7PWhFYLD2lOGMker &= -17;
        }
    }

    public final void q1wNbhk2O6() {
        this.M9e7PWhFYLD2lOGMker = 0;
        this.V57tEvNfxZVVcOCAOih5PKr = -1;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1L;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = -1;
        this.q1wNbhk2O6 = 0;
        this.NSjgqmGjEzuugn2SsG1mZFP = null;
        this.GI83zq0G8e7zkn = null;
        ArrayList arrayList = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.M9e7PWhFYLD2lOGMker &= -1025;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 0;
        this.pYmKDYlAmhudp = -1;
        RecyclerView.M9e7PWhFYLD2lOGMker(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.V57tEvNfxZVVcOCAOih5PKr + " id=" + this.LaeGQIruHQu81hfJldjMOQSVblH3x + ", oldPos=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + ", pLpos:" + this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        if (GI83zq0G8e7zkn()) {
            sb.append(" scrap ");
            sb.append(this.Ca81ebIan1u ? "[changeScrap]" : "[attachedScrap]");
        }
        if (zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
            sb.append(" invalid");
        }
        if (!LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            sb.append(" unbound");
        }
        if ((this.M9e7PWhFYLD2lOGMker & 2) != 0) {
            sb.append(" update");
        }
        if (NSjgqmGjEzuugn2SsG1mZFP()) {
            sb.append(" removed");
        }
        if (Ca81ebIan1u()) {
            sb.append(" ignored");
        }
        if (M9e7PWhFYLD2lOGMker()) {
            sb.append(" tmpDetached");
        }
        if (!ZLZeBXTMq0zDztBxtRTuCHrapQ()) {
            sb.append(" not recyclable(" + this.q1wNbhk2O6 + ")");
        }
        if ((this.M9e7PWhFYLD2lOGMker & 512) != 0 || zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
            sb.append(" undefined adapter position");
        }
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return (this.M9e7PWhFYLD2lOGMker & 4) != 0;
    }

    public final int zzpBGItXfub0yWj() {
        int i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        return i == -1 ? this.V57tEvNfxZVVcOCAOih5PKr : i;
    }
}
