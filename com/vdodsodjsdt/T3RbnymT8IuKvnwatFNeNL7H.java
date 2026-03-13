package com.vdodsodjsdt;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class T3RbnymT8IuKvnwatFNeNL7H implements Comparator {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public /* synthetic */ T3RbnymT8IuKvnwatFNeNL7H(int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                ej6unYlOWMDF.pYmKDYlAmhudp(str, "a");
                ej6unYlOWMDF.pYmKDYlAmhudp(str2, "b");
                int iMin = Math.min(str.length(), str2.length());
                int i = 4;
                while (true) {
                    if (i >= iMin) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                            return 1;
                        }
                    } else {
                        char cCharAt = str.charAt(i);
                        char cCharAt2 = str2.charAt(i);
                        if (cCharAt == cCharAt2) {
                            i++;
                        } else if (ej6unYlOWMDF.ko09zE6UAgwkV(cCharAt, cCharAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 1:
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                float fZIvmSL0wzmmKGc3X39b2Gw2mUGE = lJgFFp37ou.zIvmSL0wzmmKGc3X39b2Gw2mUGE((View) obj);
                float fZIvmSL0wzmmKGc3X39b2Gw2mUGE2 = lJgFFp37ou.zIvmSL0wzmmKGc3X39b2Gw2mUGE((View) obj2);
                if (fZIvmSL0wzmmKGc3X39b2Gw2mUGE > fZIvmSL0wzmmKGc3X39b2Gw2mUGE2) {
                    return -1;
                }
                return fZIvmSL0wzmmKGc3X39b2Gw2mUGE < fZIvmSL0wzmmKGc3X39b2Gw2mUGE2 ? 1 : 0;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                SvcDrcQrcQL9RazsQDW svcDrcQrcQL9RazsQDW = (SvcDrcQrcQL9RazsQDW) obj;
                SvcDrcQrcQL9RazsQDW svcDrcQrcQL9RazsQDW2 = (SvcDrcQrcQL9RazsQDW) obj2;
                RecyclerView recyclerView = svcDrcQrcQL9RazsQDW.ZfQNn8hdWlEQ5cR94249PDsLR;
                if ((recyclerView == null) == (svcDrcQrcQL9RazsQDW2.ZfQNn8hdWlEQ5cR94249PDsLR == null)) {
                    boolean z = svcDrcQrcQL9RazsQDW.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    if (z == svcDrcQrcQL9RazsQDW2.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                        int i2 = svcDrcQrcQL9RazsQDW2.zzpBGItXfub0yWj - svcDrcQrcQL9RazsQDW.zzpBGItXfub0yWj;
                        if (i2 != 0) {
                            return i2;
                        }
                        int i3 = svcDrcQrcQL9RazsQDW.V57tEvNfxZVVcOCAOih5PKr - svcDrcQrcQL9RazsQDW2.V57tEvNfxZVVcOCAOih5PKr;
                        if (i3 != 0) {
                            return i3;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return ((hkOLVejSEWXUiK2HQlr9P2Z9) obj).ZfQNn8hdWlEQ5cR94249PDsLR - ((hkOLVejSEWXUiK2HQlr9P2Z9) obj2).ZfQNn8hdWlEQ5cR94249PDsLR;
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
