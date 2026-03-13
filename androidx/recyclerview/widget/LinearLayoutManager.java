package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.vdodsodjsdt.FfCnaJyIb56cn2PIiajnq4CSS9Od;
import com.vdodsodjsdt.HwNYcAGldMPcCAM0eNF;
import com.vdodsodjsdt.MSl7hPM6XqjxyBV5m;
import com.vdodsodjsdt.WMrYE5mAr1lCj64D;
import com.vdodsodjsdt.YoYMmBKQmkacZj7lMi9c;
import com.vdodsodjsdt.e20NJ5kD0wqGO3;
import com.vdodsodjsdt.hWsX15LBWoRzT;
import com.vdodsodjsdt.iN4YUnyuDZ;
import com.vdodsodjsdt.nMIEFcUPc3hGgxpy3McoRHFoFa;
import com.vdodsodjsdt.o2KpvwGQ24;
import com.vdodsodjsdt.pfO2OW9zrnO5AJnehaB5D0H3VP;
import com.vdodsodjsdt.u9SlVAuoWhQUfJ;
import com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu;
import com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C;
import com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends wbBBe1vAdVO1DmSg1odNaySAYTu implements HwNYcAGldMPcCAM0eNF {
    public final boolean Irh5auREsoeV1C1RaBamlmy;
    public WMrYE5mAr1lCj64D RhfGHxtXxy0M0grmp2jkRjQg;
    public final pfO2OW9zrnO5AJnehaB5D0H3VP SuB3hEmTmbbRGAhtvOOmfKEon;
    public boolean TaDO7ogis3aEiWEtq;
    public final int[] aXO0LSrt8bKV;
    public final boolean f6ZQsR6bPLvvCDNXOUc;
    public int h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public nMIEFcUPc3hGgxpy3McoRHFoFa ko09zE6UAgwkV;
    public FfCnaJyIb56cn2PIiajnq4CSS9Od pYmKDYlAmhudp;
    public final int pzqP2AqKW6J5PO8zCKnW;
    public int q11o1hieEkZDhF1MGOZI26oZiDT;
    public final o2KpvwGQ24 qNPQb1obP7;
    public boolean vBGA6pPLqSMuYGvprl270j7;
    public int w0Wu95l8dVNw5rZMRu;

    public LinearLayoutManager(int i) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 1;
        this.f6ZQsR6bPLvvCDNXOUc = false;
        this.vBGA6pPLqSMuYGvprl270j7 = false;
        this.TaDO7ogis3aEiWEtq = false;
        this.Irh5auREsoeV1C1RaBamlmy = true;
        this.q11o1hieEkZDhF1MGOZI26oZiDT = -1;
        this.w0Wu95l8dVNw5rZMRu = Integer.MIN_VALUE;
        this.RhfGHxtXxy0M0grmp2jkRjQg = null;
        this.qNPQb1obP7 = new o2KpvwGQ24();
        this.SuB3hEmTmbbRGAhtvOOmfKEon = new pfO2OW9zrnO5AJnehaB5D0H3VP();
        this.pzqP2AqKW6J5PO8zCKnW = 2;
        this.aXO0LSrt8bKV = new int[2];
        aXBXRfs1fBrrkuQ(i);
        V57tEvNfxZVVcOCAOih5PKr(null);
        if (this.f6ZQsR6bPLvvCDNXOUc) {
            this.f6ZQsR6bPLvvCDNXOUc = false;
            HAPpjhiCsV9ONY23505HCBI9IX();
        }
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final Parcelable BJQHddi0Plr5ElWetCyaixWOg9() {
        WMrYE5mAr1lCj64D wMrYE5mAr1lCj64D = this.RhfGHxtXxy0M0grmp2jkRjQg;
        if (wMrYE5mAr1lCj64D != null) {
            WMrYE5mAr1lCj64D wMrYE5mAr1lCj64D2 = new WMrYE5mAr1lCj64D();
            wMrYE5mAr1lCj64D2.V57tEvNfxZVVcOCAOih5PKr = wMrYE5mAr1lCj64D.V57tEvNfxZVVcOCAOih5PKr;
            wMrYE5mAr1lCj64D2.ZfQNn8hdWlEQ5cR94249PDsLR = wMrYE5mAr1lCj64D.ZfQNn8hdWlEQ5cR94249PDsLR;
            wMrYE5mAr1lCj64D2.LaeGQIruHQu81hfJldjMOQSVblH3x = wMrYE5mAr1lCj64D.LaeGQIruHQu81hfJldjMOQSVblH3x;
            return wMrYE5mAr1lCj64D2;
        }
        WMrYE5mAr1lCj64D wMrYE5mAr1lCj64D3 = new WMrYE5mAr1lCj64D();
        if (TaDO7ogis3aEiWEtq() <= 0) {
            wMrYE5mAr1lCj64D3.V57tEvNfxZVVcOCAOih5PKr = -1;
            return wMrYE5mAr1lCj64D3;
        }
        QwZcr6V7mfRUaij0Bp3zpr5ClBcxr();
        boolean z = this.jW7EiD0YL6xkbB158jMUzhWNWb1y ^ this.vBGA6pPLqSMuYGvprl270j7;
        wMrYE5mAr1lCj64D3.LaeGQIruHQu81hfJldjMOQSVblH3x = z;
        if (z) {
            View viewW5cWMjmJv6kqhapkBbKZYxBWC2p = W5cWMjmJv6kqhapkBbKZYxBWC2p();
            wMrYE5mAr1lCj64D3.ZfQNn8hdWlEQ5cR94249PDsLR = this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ() - this.ko09zE6UAgwkV.zzpBGItXfub0yWj(viewW5cWMjmJv6kqhapkBbKZYxBWC2p);
            wMrYE5mAr1lCj64D3.V57tEvNfxZVVcOCAOih5PKr = wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewW5cWMjmJv6kqhapkBbKZYxBWC2p);
            return wMrYE5mAr1lCj64D3;
        }
        View viewH3Ks2H3xAh4bOWXD2gGtiHV6g = h3Ks2H3xAh4bOWXD2gGtiHV6g();
        wMrYE5mAr1lCj64D3.V57tEvNfxZVVcOCAOih5PKr = wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewH3Ks2H3xAh4bOWXD2gGtiHV6g);
        wMrYE5mAr1lCj64D3.ZfQNn8hdWlEQ5cR94249PDsLR = this.ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(viewH3Ks2H3xAh4bOWXD2gGtiHV6g) - this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd();
        return wMrYE5mAr1lCj64D3;
    }

    public final int BKHhIH8ByR(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (TaDO7ogis3aEiWEtq() != 0 && i != 0) {
            QwZcr6V7mfRUaij0Bp3zpr5ClBcxr();
            this.pYmKDYlAmhudp.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            d6vLvLlhP56T(i2, iAbs, true, e20nj5kd0wqgo3);
            FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od = this.pYmKDYlAmhudp;
            int iUQ30BFNHbnwcS96Dk6jHUECPfOq = uQ30BFNHbnwcS96Dk6jHUECPfOq(yhxkwue1zri6a9vau8hg9c, ffCnaJyIb56cn2PIiajnq4CSS9Od, e20nj5kd0wqgo3, false) + ffCnaJyIb56cn2PIiajnq4CSS9Od.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            if (iUQ30BFNHbnwcS96Dk6jHUECPfOq >= 0) {
                if (iAbs > iUQ30BFNHbnwcS96Dk6jHUECPfOq) {
                    i = i2 * iUQ30BFNHbnwcS96Dk6jHUECPfOq;
                }
                this.ko09zE6UAgwkV.Ca81ebIan1u(-i);
                this.pYmKDYlAmhudp.M9e7PWhFYLD2lOGMker = i;
                return i;
            }
        }
        return 0;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public int ByTQIhgl7ezGvHXEd(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1) {
            return 0;
        }
        return BKHhIH8ByR(i, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public int Ca81ebIan1u(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return pCrI77IVeIpJnmCUHd(e20nj5kd0wqgo3);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public boolean DNP7yXLsojH0rPMHr8fUY14M() {
        return this.RhfGHxtXxy0M0grmp2jkRjQg == null && this.jW7EiD0YL6xkbB158jMUzhWNWb1y == this.TaDO7ogis3aEiWEtq;
    }

    public final View DUIkOzkuF3hUt(int i, int i2, boolean z) {
        QwZcr6V7mfRUaij0Bp3zpr5ClBcxr();
        int i3 = z ? 24579 : 320;
        return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0 ? this.V57tEvNfxZVVcOCAOih5PKr.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i, i2, i3, 320) : this.ZfQNn8hdWlEQ5cR94249PDsLR.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i, i2, i3, 320);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean G479XgNG9rK8jPPbSXr() {
        if (this.q1wNbhk2O6 != 1073741824 && this.KUYypEB4eNWOZWVDpH != 1073741824) {
            int iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
            for (int i = 0; i < iTaDO7ogis3aEiWEtq; i++) {
                ViewGroup.LayoutParams layoutParams = vBGA6pPLqSMuYGvprl270j7(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void GI83zq0G8e7zkn(int i, MSl7hPM6XqjxyBV5m mSl7hPM6XqjxyBV5m) {
        boolean z;
        int i2;
        WMrYE5mAr1lCj64D wMrYE5mAr1lCj64D = this.RhfGHxtXxy0M0grmp2jkRjQg;
        if (wMrYE5mAr1lCj64D == null || (i2 = wMrYE5mAr1lCj64D.V57tEvNfxZVVcOCAOih5PKr) < 0) {
            mKTA58YSdN8mGkQ2js3639TJtCoY();
            z = this.vBGA6pPLqSMuYGvprl270j7;
            i2 = this.q11o1hieEkZDhF1MGOZI26oZiDT;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = wMrYE5mAr1lCj64D.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.pzqP2AqKW6J5PO8zCKnW && i2 >= 0 && i2 < i; i4++) {
            mSl7hPM6XqjxyBV5m.VxUQ9tBhpHJ2AAEDNW8sghc4m(i2, 0);
            i2 += i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void H2VFYNJEVGAX(com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C r18, com.vdodsodjsdt.e20NJ5kD0wqGO3 r19) {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.H2VFYNJEVGAX(com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C, com.vdodsodjsdt.e20NJ5kD0wqGO3):void");
    }

    public final int Hf6zp5JYLjGyFD2HXbpHA9(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (TaDO7ogis3aEiWEtq() == 0) {
            return 0;
        }
        QwZcr6V7mfRUaij0Bp3zpr5ClBcxr();
        nMIEFcUPc3hGgxpy3McoRHFoFa nmiefcupc3hggxpy3mcorhfofa = this.ko09zE6UAgwkV;
        boolean z = !this.Irh5auREsoeV1C1RaBamlmy;
        return zonOxHotd3BwAPJcwqr6I6uQNngg4.M9e7PWhFYLD2lOGMker(e20nj5kd0wqgo3, nmiefcupc3hggxpy3mcorhfofa, VAUpruoPNdSAVh(z), SdPSMGy13dYOH9CwolJVKu21val(z), this, this.Irh5auREsoeV1C1RaBamlmy, this.vBGA6pPLqSMuYGvprl270j7);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public int HzCpKshMOoaw76hFcbOVRYMeRd(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return Hf6zp5JYLjGyFD2HXbpHA9(e20nj5kd0wqgo3);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void ItrQwCXbty5PZtje5JS(AccessibilityEvent accessibilityEvent) {
        super.ItrQwCXbty5PZtje5JS(accessibilityEvent);
        if (TaDO7ogis3aEiWEtq() > 0) {
            View viewDUIkOzkuF3hUt = DUIkOzkuF3hUt(0, TaDO7ogis3aEiWEtq(), false);
            accessibilityEvent.setFromIndex(viewDUIkOzkuF3hUt == null ? -1 : wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewDUIkOzkuF3hUt));
            accessibilityEvent.setToIndex(tf2p6GzNN7uQY7Lun0pJ());
        }
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public View JUdwvN8LfOMa(View view, int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        int iN08cqkgagFuPYWJcTFAQVt;
        mKTA58YSdN8mGkQ2js3639TJtCoY();
        if (TaDO7ogis3aEiWEtq() != 0 && (iN08cqkgagFuPYWJcTFAQVt = N08cqkgagFuPYWJcTFAQVt(i)) != Integer.MIN_VALUE) {
            QwZcr6V7mfRUaij0Bp3zpr5ClBcxr();
            d6vLvLlhP56T(iN08cqkgagFuPYWJcTFAQVt, (int) (this.ko09zE6UAgwkV.KUYypEB4eNWOZWVDpH() * 0.33333334f), false, e20nj5kd0wqgo3);
            FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od = this.pYmKDYlAmhudp;
            ffCnaJyIb56cn2PIiajnq4CSS9Od.ZLZeBXTMq0zDztBxtRTuCHrapQ = Integer.MIN_VALUE;
            ffCnaJyIb56cn2PIiajnq4CSS9Od.VxUQ9tBhpHJ2AAEDNW8sghc4m = false;
            uQ30BFNHbnwcS96Dk6jHUECPfOq(yhxkwue1zri6a9vau8hg9c, ffCnaJyIb56cn2PIiajnq4CSS9Od, e20nj5kd0wqgo3, true);
            View viewMnclyDIMxkCs4NkUREm = iN08cqkgagFuPYWJcTFAQVt == -1 ? this.vBGA6pPLqSMuYGvprl270j7 ? MnclyDIMxkCs4NkUREm(TaDO7ogis3aEiWEtq() - 1, -1) : MnclyDIMxkCs4NkUREm(0, TaDO7ogis3aEiWEtq()) : this.vBGA6pPLqSMuYGvprl270j7 ? MnclyDIMxkCs4NkUREm(0, TaDO7ogis3aEiWEtq()) : MnclyDIMxkCs4NkUREm(TaDO7ogis3aEiWEtq() - 1, -1);
            View viewH3Ks2H3xAh4bOWXD2gGtiHV6g = iN08cqkgagFuPYWJcTFAQVt == -1 ? h3Ks2H3xAh4bOWXD2gGtiHV6g() : W5cWMjmJv6kqhapkBbKZYxBWC2p();
            if (!viewH3Ks2H3xAh4bOWXD2gGtiHV6g.hasFocusable()) {
                return viewMnclyDIMxkCs4NkUREm;
            }
            if (viewMnclyDIMxkCs4NkUREm != null) {
                return viewH3Ks2H3xAh4bOWXD2gGtiHV6g;
            }
        }
        return null;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public int KUYypEB4eNWOZWVDpH(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return pCrI77IVeIpJnmCUHd(e20nj5kd0wqgo3);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int M9e7PWhFYLD2lOGMker(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return ScSj9HEorWkb3bIb1HyeKVoW(e20nj5kd0wqgo3);
    }

    public final View MnclyDIMxkCs4NkUREm(int i, int i2) {
        int i3;
        int i4;
        QwZcr6V7mfRUaij0Bp3zpr5ClBcxr();
        if (i2 <= i && i2 >= i) {
            return vBGA6pPLqSMuYGvprl270j7(i);
        }
        if (this.ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(vBGA6pPLqSMuYGvprl270j7(i)) < this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0 ? this.V57tEvNfxZVVcOCAOih5PKr.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i, i2, i3, i4) : this.ZfQNn8hdWlEQ5cR94249PDsLR.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i, i2, i3, i4);
    }

    public final int N08cqkgagFuPYWJcTFAQVt(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1) ? 1 : Integer.MIN_VALUE : this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0 ? 1 : Integer.MIN_VALUE : this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1 ? -1 : Integer.MIN_VALUE : this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0 ? -1 : Integer.MIN_VALUE : (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv != 1 && xPE15iVa67UqDZHqi()) ? -1 : 1 : (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv != 1 && xPE15iVa67UqDZHqi()) ? 1 : -1;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void NSjgqmGjEzuugn2SsG1mZFP(int i, int i2, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, MSl7hPM6XqjxyBV5m mSl7hPM6XqjxyBV5m) {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv != 0) {
            i = i2;
        }
        if (TaDO7ogis3aEiWEtq() == 0 || i == 0) {
            return;
        }
        QwZcr6V7mfRUaij0Bp3zpr5ClBcxr();
        d6vLvLlhP56T(i > 0 ? 1 : -1, Math.abs(i), true, e20nj5kd0wqgo3);
        PfK8qHOJoCLG(e20nj5kd0wqgo3, this.pYmKDYlAmhudp, mSl7hPM6XqjxyBV5m);
    }

    public void PfK8qHOJoCLG(e20NJ5kD0wqGO3 e20nj5kd0wqgo3, FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od, MSl7hPM6XqjxyBV5m mSl7hPM6XqjxyBV5m) {
        int i = ffCnaJyIb56cn2PIiajnq4CSS9Od.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i < 0 || i >= e20nj5kd0wqgo3.zzpBGItXfub0yWj()) {
            return;
        }
        mSl7hPM6XqjxyBV5m.VxUQ9tBhpHJ2AAEDNW8sghc4m(i, Math.max(0, ffCnaJyIb56cn2PIiajnq4CSS9Od.ZLZeBXTMq0zDztBxtRTuCHrapQ));
    }

    public void PkbafUbW251pQJS6IcsKsWZll(boolean z) {
        V57tEvNfxZVVcOCAOih5PKr(null);
        if (this.TaDO7ogis3aEiWEtq == z) {
            return;
        }
        this.TaDO7ogis3aEiWEtq = z;
        HAPpjhiCsV9ONY23505HCBI9IX();
    }

    public final void QwZcr6V7mfRUaij0Bp3zpr5ClBcxr() {
        if (this.pYmKDYlAmhudp == null) {
            FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od = new FfCnaJyIb56cn2PIiajnq4CSS9Od();
            ffCnaJyIb56cn2PIiajnq4CSS9Od.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
            ffCnaJyIb56cn2PIiajnq4CSS9Od.NSjgqmGjEzuugn2SsG1mZFP = 0;
            ffCnaJyIb56cn2PIiajnq4CSS9Od.GI83zq0G8e7zkn = 0;
            ffCnaJyIb56cn2PIiajnq4CSS9Od.HzCpKshMOoaw76hFcbOVRYMeRd = null;
            this.pYmKDYlAmhudp = ffCnaJyIb56cn2PIiajnq4CSS9Od;
        }
    }

    public final void R7F7AgvnsOleUusGB76czh(int i, int i2) {
        this.pYmKDYlAmhudp.V57tEvNfxZVVcOCAOih5PKr = this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ() - i2;
        FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od = this.pYmKDYlAmhudp;
        ffCnaJyIb56cn2PIiajnq4CSS9Od.LaeGQIruHQu81hfJldjMOQSVblH3x = this.vBGA6pPLqSMuYGvprl270j7 ? -1 : 1;
        ffCnaJyIb56cn2PIiajnq4CSS9Od.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        ffCnaJyIb56cn2PIiajnq4CSS9Od.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 1;
        ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj = i2;
        ffCnaJyIb56cn2PIiajnq4CSS9Od.ZLZeBXTMq0zDztBxtRTuCHrapQ = Integer.MIN_VALUE;
    }

    public final int ScSj9HEorWkb3bIb1HyeKVoW(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (TaDO7ogis3aEiWEtq() == 0) {
            return 0;
        }
        QwZcr6V7mfRUaij0Bp3zpr5ClBcxr();
        nMIEFcUPc3hGgxpy3McoRHFoFa nmiefcupc3hggxpy3mcorhfofa = this.ko09zE6UAgwkV;
        boolean z = !this.Irh5auREsoeV1C1RaBamlmy;
        return zonOxHotd3BwAPJcwqr6I6uQNngg4.GI83zq0G8e7zkn(e20nj5kd0wqgo3, nmiefcupc3hggxpy3mcorhfofa, VAUpruoPNdSAVh(z), SdPSMGy13dYOH9CwolJVKu21val(z), this, this.Irh5auREsoeV1C1RaBamlmy);
    }

    public final View SdPSMGy13dYOH9CwolJVKu21val(boolean z) {
        return this.vBGA6pPLqSMuYGvprl270j7 ? DUIkOzkuF3hUt(0, TaDO7ogis3aEiWEtq(), z) : DUIkOzkuF3hUt(TaDO7ogis3aEiWEtq() - 1, -1, z);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void V57tEvNfxZVVcOCAOih5PKr(String str) {
        if (this.RhfGHxtXxy0M0grmp2jkRjQg == null) {
            super.V57tEvNfxZVVcOCAOih5PKr(str);
        }
    }

    public final View VAUpruoPNdSAVh(boolean z) {
        return this.vBGA6pPLqSMuYGvprl270j7 ? DUIkOzkuF3hUt(TaDO7ogis3aEiWEtq() - 1, -1, z) : DUIkOzkuF3hUt(0, TaDO7ogis3aEiWEtq(), z);
    }

    @Override // com.vdodsodjsdt.HwNYcAGldMPcCAM0eNF
    public final PointF VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        if (TaDO7ogis3aEiWEtq() == 0) {
            return null;
        }
        int i2 = (i < wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(vBGA6pPLqSMuYGvprl270j7(0))) != this.vBGA6pPLqSMuYGvprl270j7 ? -1 : 1;
        return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public final View W5cWMjmJv6kqhapkBbKZYxBWC2p() {
        return vBGA6pPLqSMuYGvprl270j7(this.vBGA6pPLqSMuYGvprl270j7 ? 0 : TaDO7ogis3aEiWEtq() - 1);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public void Z1FjjMJ0suz8AFI7gsA4GDLMXv(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        this.RhfGHxtXxy0M0grmp2jkRjQg = null;
        this.q11o1hieEkZDhF1MGOZI26oZiDT = -1;
        this.w0Wu95l8dVNw5rZMRu = Integer.MIN_VALUE;
        this.qNPQb1obP7.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR() {
        return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0;
    }

    public final void aXBXRfs1fBrrkuQ(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("invalid orientation:", i));
        }
        V57tEvNfxZVVcOCAOih5PKr(null);
        if (i != this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv || this.ko09zE6UAgwkV == null) {
            nMIEFcUPc3hGgxpy3McoRHFoFa nmiefcupc3hggxpy3mcorhfofaVxUQ9tBhpHJ2AAEDNW8sghc4m = nMIEFcUPc3hGgxpy3McoRHFoFa.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, i);
            this.ko09zE6UAgwkV = nmiefcupc3hggxpy3mcorhfofaVxUQ9tBhpHJ2AAEDNW8sghc4m;
            this.qNPQb1obP7.VxUQ9tBhpHJ2AAEDNW8sghc4m = nmiefcupc3hggxpy3mcorhfofaVxUQ9tBhpHJ2AAEDNW8sghc4m;
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = i;
            HAPpjhiCsV9ONY23505HCBI9IX();
        }
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void bjhcQ0u7VT2OYYrwk96HrWoN(Parcelable parcelable) {
        if (parcelable instanceof WMrYE5mAr1lCj64D) {
            WMrYE5mAr1lCj64D wMrYE5mAr1lCj64D = (WMrYE5mAr1lCj64D) parcelable;
            this.RhfGHxtXxy0M0grmp2jkRjQg = wMrYE5mAr1lCj64D;
            if (this.q11o1hieEkZDhF1MGOZI26oZiDT != -1) {
                wMrYE5mAr1lCj64D.V57tEvNfxZVVcOCAOih5PKr = -1;
            }
            HAPpjhiCsV9ONY23505HCBI9IX();
        }
    }

    public final void d6vLvLlhP56T(int i, int i2, boolean z, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        int iHzCpKshMOoaw76hFcbOVRYMeRd;
        this.pYmKDYlAmhudp.KUYypEB4eNWOZWVDpH = this.ko09zE6UAgwkV.GI83zq0G8e7zkn() == 0 && this.ko09zE6UAgwkV.zIvmSL0wzmmKGc3X39b2Gw2mUGE() == 0;
        this.pYmKDYlAmhudp.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
        int[] iArr = this.aXO0LSrt8bKV;
        iArr[0] = 0;
        iArr[1] = 0;
        nNOZCSz1a7S(e20nj5kd0wqgo3, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od = this.pYmKDYlAmhudp;
        int i3 = z2 ? iMax2 : iMax;
        ffCnaJyIb56cn2PIiajnq4CSS9Od.NSjgqmGjEzuugn2SsG1mZFP = i3;
        if (!z2) {
            iMax = iMax2;
        }
        ffCnaJyIb56cn2PIiajnq4CSS9Od.GI83zq0G8e7zkn = iMax;
        if (z2) {
            ffCnaJyIb56cn2PIiajnq4CSS9Od.NSjgqmGjEzuugn2SsG1mZFP = this.ko09zE6UAgwkV.NSjgqmGjEzuugn2SsG1mZFP() + i3;
            View viewW5cWMjmJv6kqhapkBbKZYxBWC2p = W5cWMjmJv6kqhapkBbKZYxBWC2p();
            FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od2 = this.pYmKDYlAmhudp;
            ffCnaJyIb56cn2PIiajnq4CSS9Od2.LaeGQIruHQu81hfJldjMOQSVblH3x = this.vBGA6pPLqSMuYGvprl270j7 ? -1 : 1;
            int iY1NaPKTl7R18DOr6e8i5 = wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewW5cWMjmJv6kqhapkBbKZYxBWC2p);
            FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od3 = this.pYmKDYlAmhudp;
            ffCnaJyIb56cn2PIiajnq4CSS9Od2.ZfQNn8hdWlEQ5cR94249PDsLR = iY1NaPKTl7R18DOr6e8i5 + ffCnaJyIb56cn2PIiajnq4CSS9Od3.LaeGQIruHQu81hfJldjMOQSVblH3x;
            ffCnaJyIb56cn2PIiajnq4CSS9Od3.zzpBGItXfub0yWj = this.ko09zE6UAgwkV.zzpBGItXfub0yWj(viewW5cWMjmJv6kqhapkBbKZYxBWC2p);
            iHzCpKshMOoaw76hFcbOVRYMeRd = this.ko09zE6UAgwkV.zzpBGItXfub0yWj(viewW5cWMjmJv6kqhapkBbKZYxBWC2p) - this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ();
        } else {
            View viewH3Ks2H3xAh4bOWXD2gGtiHV6g = h3Ks2H3xAh4bOWXD2gGtiHV6g();
            FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od4 = this.pYmKDYlAmhudp;
            ffCnaJyIb56cn2PIiajnq4CSS9Od4.NSjgqmGjEzuugn2SsG1mZFP = this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd() + ffCnaJyIb56cn2PIiajnq4CSS9Od4.NSjgqmGjEzuugn2SsG1mZFP;
            FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od5 = this.pYmKDYlAmhudp;
            ffCnaJyIb56cn2PIiajnq4CSS9Od5.LaeGQIruHQu81hfJldjMOQSVblH3x = this.vBGA6pPLqSMuYGvprl270j7 ? 1 : -1;
            int iY1NaPKTl7R18DOr6e8i52 = wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewH3Ks2H3xAh4bOWXD2gGtiHV6g);
            FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od6 = this.pYmKDYlAmhudp;
            ffCnaJyIb56cn2PIiajnq4CSS9Od5.ZfQNn8hdWlEQ5cR94249PDsLR = iY1NaPKTl7R18DOr6e8i52 + ffCnaJyIb56cn2PIiajnq4CSS9Od6.LaeGQIruHQu81hfJldjMOQSVblH3x;
            ffCnaJyIb56cn2PIiajnq4CSS9Od6.zzpBGItXfub0yWj = this.ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(viewH3Ks2H3xAh4bOWXD2gGtiHV6g);
            iHzCpKshMOoaw76hFcbOVRYMeRd = (-this.ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(viewH3Ks2H3xAh4bOWXD2gGtiHV6g)) + this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd();
        }
        FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od7 = this.pYmKDYlAmhudp;
        ffCnaJyIb56cn2PIiajnq4CSS9Od7.V57tEvNfxZVVcOCAOih5PKr = i2;
        if (z) {
            ffCnaJyIb56cn2PIiajnq4CSS9Od7.V57tEvNfxZVVcOCAOih5PKr = i2 - iHzCpKshMOoaw76hFcbOVRYMeRd;
        }
        ffCnaJyIb56cn2PIiajnq4CSS9Od7.ZLZeBXTMq0zDztBxtRTuCHrapQ = iHzCpKshMOoaw76hFcbOVRYMeRd;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean d9zDyyznnp3oaDT1Ug() {
        return true;
    }

    public final int dWgUTvLDR2aOE7pFLrMrHP(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, boolean z) {
        int iHzCpKshMOoaw76hFcbOVRYMeRd;
        int iHzCpKshMOoaw76hFcbOVRYMeRd2 = i - this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd();
        if (iHzCpKshMOoaw76hFcbOVRYMeRd2 <= 0) {
            return 0;
        }
        int i2 = -BKHhIH8ByR(iHzCpKshMOoaw76hFcbOVRYMeRd2, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
        int i3 = i + i2;
        if (!z || (iHzCpKshMOoaw76hFcbOVRYMeRd = i3 - this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd()) <= 0) {
            return i2;
        }
        this.ko09zE6UAgwkV.Ca81ebIan1u(-iHzCpKshMOoaw76hFcbOVRYMeRd);
        return i2 - iHzCpKshMOoaw76hFcbOVRYMeRd;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public int e1gEV3X9xwmHj(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0) {
            return 0;
        }
        return BKHhIH8ByR(i, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
    }

    public final void g3ZdIBE7kCD7VCyaOHY(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(i);
                ubNpdCC1pl7L(i);
                yhxkwue1zri6a9vau8hg9c.ZLZeBXTMq0zDztBxtRTuCHrapQ(viewVBGA6pPLqSMuYGvprl270j7);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewVBGA6pPLqSMuYGvprl270j72 = vBGA6pPLqSMuYGvprl270j7(i3);
            ubNpdCC1pl7L(i3);
            yhxkwue1zri6a9vau8hg9c.ZLZeBXTMq0zDztBxtRTuCHrapQ(viewVBGA6pPLqSMuYGvprl270j72);
        }
    }

    public final View h3Ks2H3xAh4bOWXD2gGtiHV6g() {
        return vBGA6pPLqSMuYGvprl270j7(this.vBGA6pPLqSMuYGvprl270j7 ? TaDO7ogis3aEiWEtq() - 1 : 0);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public YoYMmBKQmkacZj7lMi9c ko09zE6UAgwkV() {
        return new YoYMmBKQmkacZj7lMi9c(-2, -2);
    }

    public final void mKTA58YSdN8mGkQ2js3639TJtCoY() {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1 || !xPE15iVa67UqDZHqi()) {
            this.vBGA6pPLqSMuYGvprl270j7 = this.f6ZQsR6bPLvvCDNXOUc;
        } else {
            this.vBGA6pPLqSMuYGvprl270j7 = !this.f6ZQsR6bPLvvCDNXOUc;
        }
    }

    public final void mXbJwaKVOnG3q2w35zVu(int i, int i2) {
        this.pYmKDYlAmhudp.V57tEvNfxZVVcOCAOih5PKr = i2 - this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd();
        FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od = this.pYmKDYlAmhudp;
        ffCnaJyIb56cn2PIiajnq4CSS9Od.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        ffCnaJyIb56cn2PIiajnq4CSS9Od.LaeGQIruHQu81hfJldjMOQSVblH3x = this.vBGA6pPLqSMuYGvprl270j7 ? 1 : -1;
        ffCnaJyIb56cn2PIiajnq4CSS9Od.zIvmSL0wzmmKGc3X39b2Gw2mUGE = -1;
        ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj = i2;
        ffCnaJyIb56cn2PIiajnq4CSS9Od.ZLZeBXTMq0zDztBxtRTuCHrapQ = Integer.MIN_VALUE;
    }

    public final void n02PEvBBKA(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od) {
        if (!ffCnaJyIb56cn2PIiajnq4CSS9Od.VxUQ9tBhpHJ2AAEDNW8sghc4m || ffCnaJyIb56cn2PIiajnq4CSS9Od.KUYypEB4eNWOZWVDpH) {
            return;
        }
        int i = ffCnaJyIb56cn2PIiajnq4CSS9Od.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i2 = ffCnaJyIb56cn2PIiajnq4CSS9Od.GI83zq0G8e7zkn;
        if (ffCnaJyIb56cn2PIiajnq4CSS9Od.zIvmSL0wzmmKGc3X39b2Gw2mUGE == -1) {
            int iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
            if (i < 0) {
                return;
            }
            int iZIvmSL0wzmmKGc3X39b2Gw2mUGE = (this.ko09zE6UAgwkV.zIvmSL0wzmmKGc3X39b2Gw2mUGE() - i) + i2;
            if (this.vBGA6pPLqSMuYGvprl270j7) {
                for (int i3 = 0; i3 < iTaDO7ogis3aEiWEtq; i3++) {
                    View viewVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(i3);
                    if (this.ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(viewVBGA6pPLqSMuYGvprl270j7) < iZIvmSL0wzmmKGc3X39b2Gw2mUGE || this.ko09zE6UAgwkV.p59rPv72J9(viewVBGA6pPLqSMuYGvprl270j7) < iZIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                        g3ZdIBE7kCD7VCyaOHY(yhxkwue1zri6a9vau8hg9c, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iTaDO7ogis3aEiWEtq - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewVBGA6pPLqSMuYGvprl270j72 = vBGA6pPLqSMuYGvprl270j7(i5);
                if (this.ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(viewVBGA6pPLqSMuYGvprl270j72) < iZIvmSL0wzmmKGc3X39b2Gw2mUGE || this.ko09zE6UAgwkV.p59rPv72J9(viewVBGA6pPLqSMuYGvprl270j72) < iZIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                    g3ZdIBE7kCD7VCyaOHY(yhxkwue1zri6a9vau8hg9c, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iTaDO7ogis3aEiWEtq2 = TaDO7ogis3aEiWEtq();
        if (!this.vBGA6pPLqSMuYGvprl270j7) {
            for (int i7 = 0; i7 < iTaDO7ogis3aEiWEtq2; i7++) {
                View viewVBGA6pPLqSMuYGvprl270j73 = vBGA6pPLqSMuYGvprl270j7(i7);
                if (this.ko09zE6UAgwkV.zzpBGItXfub0yWj(viewVBGA6pPLqSMuYGvprl270j73) > i6 || this.ko09zE6UAgwkV.q1wNbhk2O6(viewVBGA6pPLqSMuYGvprl270j73) > i6) {
                    g3ZdIBE7kCD7VCyaOHY(yhxkwue1zri6a9vau8hg9c, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iTaDO7ogis3aEiWEtq2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewVBGA6pPLqSMuYGvprl270j74 = vBGA6pPLqSMuYGvprl270j7(i9);
            if (this.ko09zE6UAgwkV.zzpBGItXfub0yWj(viewVBGA6pPLqSMuYGvprl270j74) > i6 || this.ko09zE6UAgwkV.q1wNbhk2O6(viewVBGA6pPLqSMuYGvprl270j74) > i6) {
                g3ZdIBE7kCD7VCyaOHY(yhxkwue1zri6a9vau8hg9c, i8, i9);
                return;
            }
        }
    }

    public void nNOZCSz1a7S(e20NJ5kD0wqGO3 e20nj5kd0wqgo3, int[] iArr) {
        int i;
        int iKUYypEB4eNWOZWVDpH = e20nj5kd0wqgo3.VxUQ9tBhpHJ2AAEDNW8sghc4m != -1 ? this.ko09zE6UAgwkV.KUYypEB4eNWOZWVDpH() : 0;
        if (this.pYmKDYlAmhudp.zIvmSL0wzmmKGc3X39b2Gw2mUGE == -1) {
            i = 0;
        } else {
            i = iKUYypEB4eNWOZWVDpH;
            iKUYypEB4eNWOZWVDpH = 0;
        }
        iArr[0] = iKUYypEB4eNWOZWVDpH;
        iArr[1] = i;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public int p59rPv72J9(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return Hf6zp5JYLjGyFD2HXbpHA9(e20nj5kd0wqgo3);
    }

    public final int pCrI77IVeIpJnmCUHd(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (TaDO7ogis3aEiWEtq() == 0) {
            return 0;
        }
        QwZcr6V7mfRUaij0Bp3zpr5ClBcxr();
        nMIEFcUPc3hGgxpy3McoRHFoFa nmiefcupc3hggxpy3mcorhfofa = this.ko09zE6UAgwkV;
        boolean z = !this.Irh5auREsoeV1C1RaBamlmy;
        return zonOxHotd3BwAPJcwqr6I6uQNngg4.HzCpKshMOoaw76hFcbOVRYMeRd(e20nj5kd0wqgo3, nmiefcupc3hggxpy3mcorhfofa, VAUpruoPNdSAVh(z), SdPSMGy13dYOH9CwolJVKu21val(z), this, this.Irh5auREsoeV1C1RaBamlmy);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final View pYmKDYlAmhudp(int i) {
        int iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
        if (iTaDO7ogis3aEiWEtq == 0) {
            return null;
        }
        int iY1NaPKTl7R18DOr6e8i5 = i - wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(vBGA6pPLqSMuYGvprl270j7(0));
        if (iY1NaPKTl7R18DOr6e8i5 >= 0 && iY1NaPKTl7R18DOr6e8i5 < iTaDO7ogis3aEiWEtq) {
            View viewVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(iY1NaPKTl7R18DOr6e8i5);
            if (wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewVBGA6pPLqSMuYGvprl270j7) == i) {
                return viewVBGA6pPLqSMuYGvprl270j7;
            }
        }
        return super.pYmKDYlAmhudp(i);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int q1wNbhk2O6(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return ScSj9HEorWkb3bIb1HyeKVoW(e20nj5kd0wqgo3);
    }

    public void rutgM2KNeQiFZ9GKSRnhY125(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od, pfO2OW9zrnO5AJnehaB5D0H3VP pfo2ow9zrno5ajnehab5d0h3vp) {
        int iVE4yDIjexsP2lGjLaTcB;
        int i;
        int i2;
        int iZfQNn8hdWlEQ5cR94249PDsLR;
        View viewZzpBGItXfub0yWj = ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj(yhxkwue1zri6a9vau8hg9c);
        if (viewZzpBGItXfub0yWj == null) {
            pfo2ow9zrno5ajnehab5d0h3vp.zzpBGItXfub0yWj = true;
            return;
        }
        YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) viewZzpBGItXfub0yWj.getLayoutParams();
        if (ffCnaJyIb56cn2PIiajnq4CSS9Od.HzCpKshMOoaw76hFcbOVRYMeRd == null) {
            if (this.vBGA6pPLqSMuYGvprl270j7 == (ffCnaJyIb56cn2PIiajnq4CSS9Od.zIvmSL0wzmmKGc3X39b2Gw2mUGE == -1)) {
                zzpBGItXfub0yWj(viewZzpBGItXfub0yWj, -1, false);
            } else {
                zzpBGItXfub0yWj(viewZzpBGItXfub0yWj, 0, false);
            }
        } else {
            if (this.vBGA6pPLqSMuYGvprl270j7 == (ffCnaJyIb56cn2PIiajnq4CSS9Od.zIvmSL0wzmmKGc3X39b2Gw2mUGE == -1)) {
                zzpBGItXfub0yWj(viewZzpBGItXfub0yWj, -1, true);
            } else {
                zzpBGItXfub0yWj(viewZzpBGItXfub0yWj, 0, true);
            }
        }
        YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c2 = (YoYMmBKQmkacZj7lMi9c) viewZzpBGItXfub0yWj.getLayoutParams();
        Rect rectIKANjmyTSxO6v6UuLPdu7DxOjlS = this.zzpBGItXfub0yWj.iKANjmyTSxO6v6UuLPdu7DxOjlS(viewZzpBGItXfub0yWj);
        int i3 = rectIKANjmyTSxO6v6UuLPdu7DxOjlS.left + rectIKANjmyTSxO6v6UuLPdu7DxOjlS.right;
        int i4 = rectIKANjmyTSxO6v6UuLPdu7DxOjlS.top + rectIKANjmyTSxO6v6UuLPdu7DxOjlS.bottom;
        int iIrh5auREsoeV1C1RaBamlmy = wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(ZfQNn8hdWlEQ5cR94249PDsLR(), this.p59rPv72J9, this.KUYypEB4eNWOZWVDpH, O1xDAlBZZlZdoEf747lCFHld() + vE4yDIjexsP2lGjLaTcB() + ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c2).leftMargin + ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c2).rightMargin + i3, ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c2).width);
        int iIrh5auREsoeV1C1RaBamlmy2 = wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(LaeGQIruHQu81hfJldjMOQSVblH3x(), this.Ca81ebIan1u, this.q1wNbhk2O6, aXO0LSrt8bKV() + HVEwbdULInpTNa0IG() + ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c2).topMargin + ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c2).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) yoYMmBKQmkacZj7lMi9c2).height);
        if (r0dB0ojIy6g8mnk1(viewZzpBGItXfub0yWj, iIrh5auREsoeV1C1RaBamlmy, iIrh5auREsoeV1C1RaBamlmy2, yoYMmBKQmkacZj7lMi9c2)) {
            viewZzpBGItXfub0yWj.measure(iIrh5auREsoeV1C1RaBamlmy, iIrh5auREsoeV1C1RaBamlmy2);
        }
        pfo2ow9zrno5ajnehab5d0h3vp.VxUQ9tBhpHJ2AAEDNW8sghc4m = this.ko09zE6UAgwkV.V57tEvNfxZVVcOCAOih5PKr(viewZzpBGItXfub0yWj);
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1) {
            if (xPE15iVa67UqDZHqi()) {
                iZfQNn8hdWlEQ5cR94249PDsLR = this.p59rPv72J9 - O1xDAlBZZlZdoEf747lCFHld();
                iVE4yDIjexsP2lGjLaTcB = iZfQNn8hdWlEQ5cR94249PDsLR - this.ko09zE6UAgwkV.ZfQNn8hdWlEQ5cR94249PDsLR(viewZzpBGItXfub0yWj);
            } else {
                iVE4yDIjexsP2lGjLaTcB = vE4yDIjexsP2lGjLaTcB();
                iZfQNn8hdWlEQ5cR94249PDsLR = this.ko09zE6UAgwkV.ZfQNn8hdWlEQ5cR94249PDsLR(viewZzpBGItXfub0yWj) + iVE4yDIjexsP2lGjLaTcB;
            }
            if (ffCnaJyIb56cn2PIiajnq4CSS9Od.zIvmSL0wzmmKGc3X39b2Gw2mUGE == -1) {
                i = ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj;
                i2 = i - pfo2ow9zrno5ajnehab5d0h3vp.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            } else {
                i2 = ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj;
                i = pfo2ow9zrno5ajnehab5d0h3vp.VxUQ9tBhpHJ2AAEDNW8sghc4m + i2;
            }
        } else {
            int iHVEwbdULInpTNa0IG = HVEwbdULInpTNa0IG();
            int iZfQNn8hdWlEQ5cR94249PDsLR2 = this.ko09zE6UAgwkV.ZfQNn8hdWlEQ5cR94249PDsLR(viewZzpBGItXfub0yWj) + iHVEwbdULInpTNa0IG;
            if (ffCnaJyIb56cn2PIiajnq4CSS9Od.zIvmSL0wzmmKGc3X39b2Gw2mUGE == -1) {
                int i5 = ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj;
                int i6 = i5 - pfo2ow9zrno5ajnehab5d0h3vp.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                iZfQNn8hdWlEQ5cR94249PDsLR = i5;
                i = iZfQNn8hdWlEQ5cR94249PDsLR2;
                iVE4yDIjexsP2lGjLaTcB = i6;
                i2 = iHVEwbdULInpTNa0IG;
            } else {
                int i7 = ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj;
                int i8 = pfo2ow9zrno5ajnehab5d0h3vp.VxUQ9tBhpHJ2AAEDNW8sghc4m + i7;
                iVE4yDIjexsP2lGjLaTcB = i7;
                i = iZfQNn8hdWlEQ5cR94249PDsLR2;
                i2 = iHVEwbdULInpTNa0IG;
                iZfQNn8hdWlEQ5cR94249PDsLR = i8;
            }
        }
        wbBBe1vAdVO1DmSg1odNaySAYTu.ymT6yQrus3w(viewZzpBGItXfub0yWj, iVE4yDIjexsP2lGjLaTcB, i2, iZfQNn8hdWlEQ5cR94249PDsLR, i);
        if (yoYMmBKQmkacZj7lMi9c.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP() || yoYMmBKQmkacZj7lMi9c.VxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd()) {
            pfo2ow9zrno5ajnehab5d0h3vp.V57tEvNfxZVVcOCAOih5PKr = true;
        }
        pfo2ow9zrno5ajnehab5d0h3vp.ZfQNn8hdWlEQ5cR94249PDsLR = viewZzpBGItXfub0yWj.hasFocusable();
    }

    public final int tf2p6GzNN7uQY7Lun0pJ() {
        View viewDUIkOzkuF3hUt = DUIkOzkuF3hUt(TaDO7ogis3aEiWEtq() - 1, -1, false);
        if (viewDUIkOzkuF3hUt == null) {
            return -1;
        }
        return wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewDUIkOzkuF3hUt);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void tpEo0fy9FaoJYrSFHRfIK6(int i) {
        this.q11o1hieEkZDhF1MGOZI26oZiDT = i;
        this.w0Wu95l8dVNw5rZMRu = Integer.MIN_VALUE;
        WMrYE5mAr1lCj64D wMrYE5mAr1lCj64D = this.RhfGHxtXxy0M0grmp2jkRjQg;
        if (wMrYE5mAr1lCj64D != null) {
            wMrYE5mAr1lCj64D.V57tEvNfxZVVcOCAOih5PKr = -1;
        }
        HAPpjhiCsV9ONY23505HCBI9IX();
    }

    public final int u04PSKYidgCYrHk5CAtyMkPOXcY(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, boolean z) {
        int iZLZeBXTMq0zDztBxtRTuCHrapQ;
        int iZLZeBXTMq0zDztBxtRTuCHrapQ2 = this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ() - i;
        if (iZLZeBXTMq0zDztBxtRTuCHrapQ2 <= 0) {
            return 0;
        }
        int i2 = -BKHhIH8ByR(-iZLZeBXTMq0zDztBxtRTuCHrapQ2, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
        int i3 = i + i2;
        if (!z || (iZLZeBXTMq0zDztBxtRTuCHrapQ = this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ() - i3) <= 0) {
            return i2;
        }
        this.ko09zE6UAgwkV.Ca81ebIan1u(iZLZeBXTMq0zDztBxtRTuCHrapQ);
        return iZLZeBXTMq0zDztBxtRTuCHrapQ + i2;
    }

    public final int uQ30BFNHbnwcS96Dk6jHUECPfOq(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, boolean z) {
        int i;
        int i2 = ffCnaJyIb56cn2PIiajnq4CSS9Od.V57tEvNfxZVVcOCAOih5PKr;
        int i3 = ffCnaJyIb56cn2PIiajnq4CSS9Od.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                ffCnaJyIb56cn2PIiajnq4CSS9Od.ZLZeBXTMq0zDztBxtRTuCHrapQ = i3 + i2;
            }
            n02PEvBBKA(yhxkwue1zri6a9vau8hg9c, ffCnaJyIb56cn2PIiajnq4CSS9Od);
        }
        int i4 = ffCnaJyIb56cn2PIiajnq4CSS9Od.V57tEvNfxZVVcOCAOih5PKr + ffCnaJyIb56cn2PIiajnq4CSS9Od.NSjgqmGjEzuugn2SsG1mZFP;
        while (true) {
            if ((!ffCnaJyIb56cn2PIiajnq4CSS9Od.KUYypEB4eNWOZWVDpH && i4 <= 0) || (i = ffCnaJyIb56cn2PIiajnq4CSS9Od.ZfQNn8hdWlEQ5cR94249PDsLR) < 0 || i >= e20nj5kd0wqgo3.zzpBGItXfub0yWj()) {
                break;
            }
            pfO2OW9zrnO5AJnehaB5D0H3VP pfo2ow9zrno5ajnehab5d0h3vp = this.SuB3hEmTmbbRGAhtvOOmfKEon;
            pfo2ow9zrno5ajnehab5d0h3vp.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
            pfo2ow9zrno5ajnehab5d0h3vp.zzpBGItXfub0yWj = false;
            pfo2ow9zrno5ajnehab5d0h3vp.V57tEvNfxZVVcOCAOih5PKr = false;
            pfo2ow9zrno5ajnehab5d0h3vp.ZfQNn8hdWlEQ5cR94249PDsLR = false;
            rutgM2KNeQiFZ9GKSRnhY125(yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3, ffCnaJyIb56cn2PIiajnq4CSS9Od, pfo2ow9zrno5ajnehab5d0h3vp);
            if (!pfo2ow9zrno5ajnehab5d0h3vp.zzpBGItXfub0yWj) {
                int i5 = ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj;
                int i6 = pfo2ow9zrno5ajnehab5d0h3vp.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj = (ffCnaJyIb56cn2PIiajnq4CSS9Od.zIvmSL0wzmmKGc3X39b2Gw2mUGE * i6) + i5;
                if (!pfo2ow9zrno5ajnehab5d0h3vp.V57tEvNfxZVVcOCAOih5PKr || ffCnaJyIb56cn2PIiajnq4CSS9Od.HzCpKshMOoaw76hFcbOVRYMeRd != null || !e20nj5kd0wqgo3.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                    ffCnaJyIb56cn2PIiajnq4CSS9Od.V57tEvNfxZVVcOCAOih5PKr -= i6;
                    i4 -= i6;
                }
                int i7 = ffCnaJyIb56cn2PIiajnq4CSS9Od.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    ffCnaJyIb56cn2PIiajnq4CSS9Od.ZLZeBXTMq0zDztBxtRTuCHrapQ = i8;
                    int i9 = ffCnaJyIb56cn2PIiajnq4CSS9Od.V57tEvNfxZVVcOCAOih5PKr;
                    if (i9 < 0) {
                        ffCnaJyIb56cn2PIiajnq4CSS9Od.ZLZeBXTMq0zDztBxtRTuCHrapQ = i8 + i9;
                    }
                    n02PEvBBKA(yhxkwue1zri6a9vau8hg9c, ffCnaJyIb56cn2PIiajnq4CSS9Od);
                }
                if (z && pfo2ow9zrno5ajnehab5d0h3vp.ZfQNn8hdWlEQ5cR94249PDsLR) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - ffCnaJyIb56cn2PIiajnq4CSS9Od.V57tEvNfxZVVcOCAOih5PKr;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View w45GC0xYcf4u8gmC(com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C r17, com.vdodsodjsdt.e20NJ5kD0wqGO3 r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.QwZcr6V7mfRUaij0Bp3zpr5ClBcxr()
            int r1 = r0.TaDO7ogis3aEiWEtq()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.TaDO7ogis3aEiWEtq()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.zzpBGItXfub0yWj()
            com.vdodsodjsdt.nMIEFcUPc3hGgxpy3McoRHFoFa r7 = r0.ko09zE6UAgwkV
            int r7 = r7.HzCpKshMOoaw76hFcbOVRYMeRd()
            com.vdodsodjsdt.nMIEFcUPc3hGgxpy3McoRHFoFa r8 = r0.ko09zE6UAgwkV
            int r8 = r8.ZLZeBXTMq0zDztBxtRTuCHrapQ()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7c
            android.view.View r12 = r0.vBGA6pPLqSMuYGvprl270j7(r1)
            int r13 = com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(r12)
            com.vdodsodjsdt.nMIEFcUPc3hGgxpy3McoRHFoFa r14 = r0.ko09zE6UAgwkV
            int r14 = r14.LaeGQIruHQu81hfJldjMOQSVblH3x(r12)
            com.vdodsodjsdt.nMIEFcUPc3hGgxpy3McoRHFoFa r15 = r0.ko09zE6UAgwkV
            int r15 = r15.zzpBGItXfub0yWj(r12)
            if (r13 < 0) goto L7a
            if (r13 >= r6) goto L7a
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            com.vdodsodjsdt.YoYMmBKQmkacZj7lMi9c r13 = (com.vdodsodjsdt.YoYMmBKQmkacZj7lMi9c) r13
            com.vdodsodjsdt.WFEUpQgjHl r13 = r13.VxUQ9tBhpHJ2AAEDNW8sghc4m
            boolean r13 = r13.NSjgqmGjEzuugn2SsG1mZFP()
            if (r13 == 0) goto L57
            if (r11 != 0) goto L7a
            r11 = r12
            goto L7a
        L57:
            if (r15 > r7) goto L5d
            if (r14 >= r7) goto L5d
            r13 = r3
            goto L5e
        L5d:
            r13 = r2
        L5e:
            if (r14 < r8) goto L64
            if (r15 <= r8) goto L64
            r14 = r3
            goto L65
        L64:
            r14 = r2
        L65:
            if (r13 != 0) goto L6b
            if (r14 == 0) goto L6a
            goto L6b
        L6a:
            return r12
        L6b:
            if (r19 == 0) goto L73
            if (r14 == 0) goto L70
            goto L75
        L70:
            if (r9 != 0) goto L7a
            goto L79
        L73:
            if (r13 == 0) goto L77
        L75:
            r10 = r12
            goto L7a
        L77:
            if (r9 != 0) goto L7a
        L79:
            r9 = r12
        L7a:
            int r1 = r1 + r5
            goto L2b
        L7c:
            if (r9 == 0) goto L7f
            return r9
        L7f:
            if (r10 == 0) goto L82
            return r10
        L82:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.w45GC0xYcf4u8gmC(com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C, com.vdodsodjsdt.e20NJ5kD0wqGO3, boolean, boolean):android.view.View");
    }

    public final boolean xPE15iVa67UqDZHqi() {
        return pzqP2AqKW6J5PO8zCKnW() == 1;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public void zyiF0wv9HozxGOIDt8PvVp(RecyclerView recyclerView, int i) {
        hWsX15LBWoRzT hwsx15lbworzt = new hWsX15LBWoRzT(recyclerView.getContext());
        hwsx15lbworzt.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        KMiA9Sqk243eQkFNNoS(hwsx15lbworzt);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 1;
        this.f6ZQsR6bPLvvCDNXOUc = false;
        this.vBGA6pPLqSMuYGvprl270j7 = false;
        this.TaDO7ogis3aEiWEtq = false;
        this.Irh5auREsoeV1C1RaBamlmy = true;
        this.q11o1hieEkZDhF1MGOZI26oZiDT = -1;
        this.w0Wu95l8dVNw5rZMRu = Integer.MIN_VALUE;
        this.RhfGHxtXxy0M0grmp2jkRjQg = null;
        this.qNPQb1obP7 = new o2KpvwGQ24();
        this.SuB3hEmTmbbRGAhtvOOmfKEon = new pfO2OW9zrnO5AJnehaB5D0H3VP();
        this.pzqP2AqKW6J5PO8zCKnW = 2;
        this.aXO0LSrt8bKV = new int[2];
        iN4YUnyuDZ in4yunyudzQygqjTppWwx992 = wbBBe1vAdVO1DmSg1odNaySAYTu.qygqjTppWwx992(context, attributeSet, i, i2);
        aXBXRfs1fBrrkuQ(in4yunyudzQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        boolean z = in4yunyudzQygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr;
        V57tEvNfxZVVcOCAOih5PKr(null);
        if (z != this.f6ZQsR6bPLvvCDNXOUc) {
            this.f6ZQsR6bPLvvCDNXOUc = z;
            HAPpjhiCsV9ONY23505HCBI9IX();
        }
        PkbafUbW251pQJS6IcsKsWZll(in4yunyudzQygqjTppWwx992.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void lQ0rO9lhQIyVe7Rp6(RecyclerView recyclerView) {
    }

    public void RthAxhvqlGkoa(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, o2KpvwGQ24 o2kpvwgq24, int i) {
    }
}
