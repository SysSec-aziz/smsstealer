package com.vdodsodjsdt;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class IS7DVWqtgrLtXifZ0j304X {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public IS7DVWqtgrLtXifZ0j304X() {
        if (VSncX8ksA0tswc2TMhzhOMdd.V57tEvNfxZVVcOCAOih5PKr == null) {
            VSncX8ksA0tswc2TMhzhOMdd.V57tEvNfxZVVcOCAOih5PKr = new VSncX8ksA0tswc2TMhzhOMdd();
        }
    }

    public void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        while (true) {
            int i = this.V57tEvNfxZVVcOCAOih5PKr;
            oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = (oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (i >= oyf7tn6zjrnuneifvj8jbjij8nv9.NSjgqmGjEzuugn2SsG1mZFP || oyf7tn6zjrnuneifvj8jbjij8nv9.LaeGQIruHQu81hfJldjMOQSVblH3x[i] >= 0) {
                return;
            } else {
                this.V57tEvNfxZVVcOCAOih5PKr = i + 1;
            }
        }
    }

    public abstract Object V57tEvNfxZVVcOCAOih5PKr(View view);

    public int VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        if (i < this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return ((ByteBuffer) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).getShort(this.ZfQNn8hdWlEQ5cR94249PDsLR + i);
        }
        return 0;
    }

    public abstract boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(Object obj, Object obj2);

    public abstract void ZfQNn8hdWlEQ5cR94249PDsLR(View view, Object obj);

    public boolean hasNext() {
        return this.V57tEvNfxZVVcOCAOih5PKr < ((oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).NSjgqmGjEzuugn2SsG1mZFP;
    }

    public void remove() {
        oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = (oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        zzpBGItXfub0yWj();
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        oyf7tn6zjrnuneifvj8jbjij8nv9.V57tEvNfxZVVcOCAOih5PKr();
        oyf7tn6zjrnuneifvj8jbjij8nv9.KUYypEB4eNWOZWVDpH(this.ZfQNn8hdWlEQ5cR94249PDsLR);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = oyf7tn6zjrnuneifvj8jbjij8nv9.M9e7PWhFYLD2lOGMker;
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            ZfQNn8hdWlEQ5cR94249PDsLR(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            tag = V57tEvNfxZVVcOCAOih5PKr(view);
        } else {
            tag = view.getTag(this.V57tEvNfxZVVcOCAOih5PKr);
            if (!((Class) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).isInstance(tag)) {
                tag = null;
            }
        }
        if (ZLZeBXTMq0zDztBxtRTuCHrapQ(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR = xb0r6yEzq0tw9m7nTWG5BFR8.ZfQNn8hdWlEQ5cR94249PDsLR(view);
            dOYOTnFcxbQY9kd8M4lnq doyotnfcxbqy9kd8m4lnq = accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR == null ? null : accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR instanceof BNoQqrcMvME0Kvh0ZlMVKK2 ? ((BNoQqrcMvME0Kvh0ZlMVKK2) accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR).VxUQ9tBhpHJ2AAEDNW8sghc4m : new dOYOTnFcxbQY9kd8M4lnq(accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR);
            if (doyotnfcxbqy9kd8m4lnq == null) {
                doyotnfcxbqy9kd8m4lnq = new dOYOTnFcxbQY9kd8M4lnq();
            }
            xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(view, doyotnfcxbqy9kd8m4lnq);
            view.setTag(this.V57tEvNfxZVVcOCAOih5PKr, obj);
            xb0r6yEzq0tw9m7nTWG5BFR8.NSjgqmGjEzuugn2SsG1mZFP(view, this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
    }

    public void zzpBGItXfub0yWj() {
        if (((oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).M9e7PWhFYLD2lOGMker != this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new ConcurrentModificationException();
        }
    }
}
