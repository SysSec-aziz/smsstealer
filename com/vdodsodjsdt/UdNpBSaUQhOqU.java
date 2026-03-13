package com.vdodsodjsdt;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class UdNpBSaUQhOqU {
    public Object VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Object zzpBGItXfub0yWj;

    public UdNpBSaUQhOqU(Context context) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = context;
    }

    public void GI83zq0G8e7zkn() {
        V57tEvNfxZVVcOCAOih5PKr();
        IntentFilter intentFilterLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x();
        if (intentFilterLaeGQIruHQu81hfJldjMOQSVblH3x.countActions() == 0) {
            return;
        }
        if (((n2ZOXcBy7Ajj) this.VxUQ9tBhpHJ2AAEDNW8sghc4m) == null) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new n2ZOXcBy7Ajj(0, this);
        }
        ((BbqUXujjobWQwx4SY) this.zzpBGItXfub0yWj).q1wNbhk2O6.registerReceiver((n2ZOXcBy7Ajj) this.VxUQ9tBhpHJ2AAEDNW8sghc4m, intentFilterLaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    public abstract IntentFilter LaeGQIruHQu81hfJldjMOQSVblH3x();

    public abstract void NSjgqmGjEzuugn2SsG1mZFP();

    public void V57tEvNfxZVVcOCAOih5PKr() {
        n2ZOXcBy7Ajj n2zoxcby7ajj = (n2ZOXcBy7Ajj) this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (n2zoxcby7ajj != null) {
            try {
                ((BbqUXujjobWQwx4SY) this.zzpBGItXfub0yWj).q1wNbhk2O6.unregisterReceiver(n2zoxcby7ajj);
            } catch (IllegalArgumentException unused) {
            }
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        }
    }

    public MenuItem ZLZeBXTMq0zDztBxtRTuCHrapQ(MenuItem menuItem) {
        if (!(menuItem instanceof BN234nA3pR0dtOqNWK2kPHgScutH)) {
            return menuItem;
        }
        BN234nA3pR0dtOqNWK2kPHgScutH bN234nA3pR0dtOqNWK2kPHgScutH = (BN234nA3pR0dtOqNWK2kPHgScutH) menuItem;
        if (((sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.zzpBGItXfub0yWj) == null) {
            this.zzpBGItXfub0yWj = new sSTjsLE9Ugp7iXfnwi18Akn1Jt(0);
        }
        MenuItem menuItem2 = (MenuItem) ((sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.zzpBGItXfub0yWj).get(bN234nA3pR0dtOqNWK2kPHgScutH);
        if (menuItem2 != null) {
            return menuItem2;
        }
        Lq27qyxyRGIx3x lq27qyxyRGIx3x = new Lq27qyxyRGIx3x((Context) this.VxUQ9tBhpHJ2AAEDNW8sghc4m, bN234nA3pR0dtOqNWK2kPHgScutH);
        ((sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.zzpBGItXfub0yWj).put(bN234nA3pR0dtOqNWK2kPHgScutH, lq27qyxyRGIx3x);
        return lq27qyxyRGIx3x;
    }

    public void ZfQNn8hdWlEQ5cR94249PDsLR() {
        RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L = (RD86Fssz0iKbf0t61L) this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        KO5iX6ddrwZmAa4iLnc7 kO5iX6ddrwZmAa4iLnc7 = (KO5iX6ddrwZmAa4iLnc7) this.zzpBGItXfub0yWj;
        HashSet hashSet = rD86Fssz0iKbf0t61L.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (hashSet.remove(kO5iX6ddrwZmAa4iLnc7) && hashSet.isEmpty()) {
            rD86Fssz0iKbf0t61L.zzpBGItXfub0yWj();
        }
    }

    public abstract int zIvmSL0wzmmKGc3X39b2Gw2mUGE();

    public UdNpBSaUQhOqU(RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L, KO5iX6ddrwZmAa4iLnc7 kO5iX6ddrwZmAa4iLnc7) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = rD86Fssz0iKbf0t61L;
        this.zzpBGItXfub0yWj = kO5iX6ddrwZmAa4iLnc7;
    }

    public UdNpBSaUQhOqU(BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY) {
        this.zzpBGItXfub0yWj = bbqUXujjobWQwx4SY;
    }
}
