package com.vdodsodjsdt;

import android.view.View;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ojJdkROPjZ implements HOYh3odfAhsInxjoW2Lj8Uep, D2N8rZ8PRRcNQ9RwMeZkr, W4Qt2NT8WTRWgps7H7wRotB1F {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public static final ojJdkROPjZ ZfQNn8hdWlEQ5cR94249PDsLR = new ojJdkROPjZ(13);
    public static final ojJdkROPjZ LaeGQIruHQu81hfJldjMOQSVblH3x = new ojJdkROPjZ(14);
    public static final ojJdkROPjZ zIvmSL0wzmmKGc3X39b2Gw2mUGE = new ojJdkROPjZ(15);
    public static final ojJdkROPjZ ZLZeBXTMq0zDztBxtRTuCHrapQ = new ojJdkROPjZ(16);
    public static final ojJdkROPjZ NSjgqmGjEzuugn2SsG1mZFP = new ojJdkROPjZ(17);

    public /* synthetic */ ojJdkROPjZ(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
    }

    @Override // com.vdodsodjsdt.D2N8rZ8PRRcNQ9RwMeZkr
    public pmJH8rqWIwRth8COqq HzCpKshMOoaw76hFcbOVRYMeRd(View view, pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq) {
        int i = MainActivity.O1xDAlBZZlZdoEf747lCFHld;
        ej6unYlOWMDF.pYmKDYlAmhudp(view, "v");
        MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE = pmjh8rqwiwrth8coqq.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(519);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE, "getInsets(...)");
        view.setPadding(mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m, mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj, mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr, mCkc9XaOBWJ3kr1ZFUGL46e9NZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZfQNn8hdWlEQ5cR94249PDsLR);
        return pmjh8rqwiwrth8coqq;
    }

    @Override // com.vdodsodjsdt.HOYh3odfAhsInxjoW2Lj8Uep
    public Object V57tEvNfxZVVcOCAOih5PKr() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                return new LinkedHashMap();
            case 1:
                return new TreeMap();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return new ConcurrentHashMap();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return new ConcurrentSkipListMap();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return new ArrayList();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                return new LinkedHashSet();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                return new TreeSet();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                return new ArrayDeque();
            default:
                return new qghLaWjSIb75x516bG5Bx3f6NsAy(true);
        }
    }
}
