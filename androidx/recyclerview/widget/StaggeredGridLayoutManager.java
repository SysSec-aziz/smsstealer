package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.vdodsodjsdt.HwNYcAGldMPcCAM0eNF;
import com.vdodsodjsdt.MSl7hPM6XqjxyBV5m;
import com.vdodsodjsdt.OBsbe4YQtB2vgUFxLzO6ssT0;
import com.vdodsodjsdt.RfOSIaL6qUBGKJY9MSCBP5ba;
import com.vdodsodjsdt.XpKiPgWTE4o42v0M2im;
import com.vdodsodjsdt.YoYMmBKQmkacZj7lMi9c;
import com.vdodsodjsdt.Z3Rltw0sHTbJSY3J3cUfrN67Qq;
import com.vdodsodjsdt.e20NJ5kD0wqGO3;
import com.vdodsodjsdt.hWsX15LBWoRzT;
import com.vdodsodjsdt.iN4YUnyuDZ;
import com.vdodsodjsdt.kxxelcgMpZ;
import com.vdodsodjsdt.nMIEFcUPc3hGgxpy3McoRHFoFa;
import com.vdodsodjsdt.o6OxmOsCD9HJ6LF8UTncnTX9Cf21;
import com.vdodsodjsdt.sqhEuPaG4yT6D7gwZf5yfbaPJBAN;
import com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C;
import com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends wbBBe1vAdVO1DmSg1odNaySAYTu implements HwNYcAGldMPcCAM0eNF {
    public final Rect HVEwbdULInpTNa0IG;
    public boolean Irh5auREsoeV1C1RaBamlmy;
    public XpKiPgWTE4o42v0M2im O1xDAlBZZlZdoEf747lCFHld;
    public final o6OxmOsCD9HJ6LF8UTncnTX9Cf21 SuB3hEmTmbbRGAhtvOOmfKEon;
    public final kxxelcgMpZ TaDO7ogis3aEiWEtq;
    public final RfOSIaL6qUBGKJY9MSCBP5ba TqcnImqkSWIKht;
    public boolean aXO0LSrt8bKV;
    public final int f6ZQsR6bPLvvCDNXOUc;
    public final int h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public int[] iKANjmyTSxO6v6UuLPdu7DxOjlS;
    public final nMIEFcUPc3hGgxpy3McoRHFoFa jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final nMIEFcUPc3hGgxpy3McoRHFoFa ko09zE6UAgwkV;
    public final OBsbe4YQtB2vgUFxLzO6ssT0[] pYmKDYlAmhudp;
    public final int pzqP2AqKW6J5PO8zCKnW;
    public final boolean qygqjTppWwx992;
    public int vBGA6pPLqSMuYGvprl270j7;
    public boolean vE4yDIjexsP2lGjLaTcB;
    public final BitSet w0Wu95l8dVNw5rZMRu;
    public final Z3Rltw0sHTbJSY3J3cUfrN67Qq y1NaPKTl7R18DOr6e8i5;
    public boolean q11o1hieEkZDhF1MGOZI26oZiDT = false;
    public int RhfGHxtXxy0M0grmp2jkRjQg = -1;
    public int qNPQb1obP7 = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = -1;
        this.Irh5auREsoeV1C1RaBamlmy = false;
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = new o6OxmOsCD9HJ6LF8UTncnTX9Cf21();
        this.SuB3hEmTmbbRGAhtvOOmfKEon = o6oxmoscd9hj6lf8utncntx9cf21;
        this.pzqP2AqKW6J5PO8zCKnW = 2;
        this.HVEwbdULInpTNa0IG = new Rect();
        this.y1NaPKTl7R18DOr6e8i5 = new Z3Rltw0sHTbJSY3J3cUfrN67Qq(this);
        this.qygqjTppWwx992 = true;
        this.TqcnImqkSWIKht = new RfOSIaL6qUBGKJY9MSCBP5ba(11, this);
        iN4YUnyuDZ in4yunyudzQygqjTppWwx992 = wbBBe1vAdVO1DmSg1odNaySAYTu.qygqjTppWwx992(context, attributeSet, i, i2);
        int i3 = in4yunyudzQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        V57tEvNfxZVVcOCAOih5PKr(null);
        if (i3 != this.f6ZQsR6bPLvvCDNXOUc) {
            this.f6ZQsR6bPLvvCDNXOUc = i3;
            nMIEFcUPc3hGgxpy3McoRHFoFa nmiefcupc3hggxpy3mcorhfofa = this.ko09zE6UAgwkV;
            this.ko09zE6UAgwkV = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = nmiefcupc3hggxpy3mcorhfofa;
            HAPpjhiCsV9ONY23505HCBI9IX();
        }
        int i4 = in4yunyudzQygqjTppWwx992.zzpBGItXfub0yWj;
        V57tEvNfxZVVcOCAOih5PKr(null);
        if (i4 != this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
            o6oxmoscd9hj6lf8utncntx9cf21.ZfQNn8hdWlEQ5cR94249PDsLR();
            HAPpjhiCsV9ONY23505HCBI9IX();
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = i4;
            this.w0Wu95l8dVNw5rZMRu = new BitSet(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
            this.pYmKDYlAmhudp = new OBsbe4YQtB2vgUFxLzO6ssT0[this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv];
            for (int i5 = 0; i5 < this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv; i5++) {
                this.pYmKDYlAmhudp[i5] = new OBsbe4YQtB2vgUFxLzO6ssT0(this, i5);
            }
            HAPpjhiCsV9ONY23505HCBI9IX();
        }
        boolean z = in4yunyudzQygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr;
        V57tEvNfxZVVcOCAOih5PKr(null);
        XpKiPgWTE4o42v0M2im xpKiPgWTE4o42v0M2im = this.O1xDAlBZZlZdoEf747lCFHld;
        if (xpKiPgWTE4o42v0M2im != null && xpKiPgWTE4o42v0M2im.M9e7PWhFYLD2lOGMker != z) {
            xpKiPgWTE4o42v0M2im.M9e7PWhFYLD2lOGMker = z;
        }
        this.Irh5auREsoeV1C1RaBamlmy = z;
        HAPpjhiCsV9ONY23505HCBI9IX();
        kxxelcgMpZ kxxelcgmpz = new kxxelcgMpZ();
        kxxelcgmpz.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
        kxxelcgmpz.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
        kxxelcgmpz.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        this.TaDO7ogis3aEiWEtq = kxxelcgmpz;
        this.ko09zE6UAgwkV = nMIEFcUPc3hGgxpy3McoRHFoFa.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, this.f6ZQsR6bPLvvCDNXOUc);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = nMIEFcUPc3hGgxpy3McoRHFoFa.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, 1 - this.f6ZQsR6bPLvvCDNXOUc);
    }

    public static int PkbafUbW251pQJS6IcsKsWZll(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final Parcelable BJQHddi0Plr5ElWetCyaixWOg9() {
        int iGI83zq0G8e7zkn;
        int iHzCpKshMOoaw76hFcbOVRYMeRd;
        int[] iArr;
        XpKiPgWTE4o42v0M2im xpKiPgWTE4o42v0M2im = this.O1xDAlBZZlZdoEf747lCFHld;
        if (xpKiPgWTE4o42v0M2im != null) {
            XpKiPgWTE4o42v0M2im xpKiPgWTE4o42v0M2im2 = new XpKiPgWTE4o42v0M2im();
            xpKiPgWTE4o42v0M2im2.LaeGQIruHQu81hfJldjMOQSVblH3x = xpKiPgWTE4o42v0M2im.LaeGQIruHQu81hfJldjMOQSVblH3x;
            xpKiPgWTE4o42v0M2im2.V57tEvNfxZVVcOCAOih5PKr = xpKiPgWTE4o42v0M2im.V57tEvNfxZVVcOCAOih5PKr;
            xpKiPgWTE4o42v0M2im2.ZfQNn8hdWlEQ5cR94249PDsLR = xpKiPgWTE4o42v0M2im.ZfQNn8hdWlEQ5cR94249PDsLR;
            xpKiPgWTE4o42v0M2im2.zIvmSL0wzmmKGc3X39b2Gw2mUGE = xpKiPgWTE4o42v0M2im.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            xpKiPgWTE4o42v0M2im2.ZLZeBXTMq0zDztBxtRTuCHrapQ = xpKiPgWTE4o42v0M2im.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            xpKiPgWTE4o42v0M2im2.NSjgqmGjEzuugn2SsG1mZFP = xpKiPgWTE4o42v0M2im.NSjgqmGjEzuugn2SsG1mZFP;
            xpKiPgWTE4o42v0M2im2.M9e7PWhFYLD2lOGMker = xpKiPgWTE4o42v0M2im.M9e7PWhFYLD2lOGMker;
            xpKiPgWTE4o42v0M2im2.HzCpKshMOoaw76hFcbOVRYMeRd = xpKiPgWTE4o42v0M2im.HzCpKshMOoaw76hFcbOVRYMeRd;
            xpKiPgWTE4o42v0M2im2.KUYypEB4eNWOZWVDpH = xpKiPgWTE4o42v0M2im.KUYypEB4eNWOZWVDpH;
            xpKiPgWTE4o42v0M2im2.GI83zq0G8e7zkn = xpKiPgWTE4o42v0M2im.GI83zq0G8e7zkn;
            return xpKiPgWTE4o42v0M2im2;
        }
        XpKiPgWTE4o42v0M2im xpKiPgWTE4o42v0M2im3 = new XpKiPgWTE4o42v0M2im();
        xpKiPgWTE4o42v0M2im3.M9e7PWhFYLD2lOGMker = this.Irh5auREsoeV1C1RaBamlmy;
        xpKiPgWTE4o42v0M2im3.HzCpKshMOoaw76hFcbOVRYMeRd = this.aXO0LSrt8bKV;
        xpKiPgWTE4o42v0M2im3.KUYypEB4eNWOZWVDpH = this.vE4yDIjexsP2lGjLaTcB;
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        if (o6oxmoscd9hj6lf8utncntx9cf21 == null || (iArr = (int[]) o6oxmoscd9hj6lf8utncntx9cf21.V57tEvNfxZVVcOCAOih5PKr) == null) {
            xpKiPgWTE4o42v0M2im3.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
        } else {
            xpKiPgWTE4o42v0M2im3.NSjgqmGjEzuugn2SsG1mZFP = iArr;
            xpKiPgWTE4o42v0M2im3.ZLZeBXTMq0zDztBxtRTuCHrapQ = iArr.length;
            xpKiPgWTE4o42v0M2im3.GI83zq0G8e7zkn = (ArrayList) o6oxmoscd9hj6lf8utncntx9cf21.ZfQNn8hdWlEQ5cR94249PDsLR;
        }
        if (TaDO7ogis3aEiWEtq() <= 0) {
            xpKiPgWTE4o42v0M2im3.V57tEvNfxZVVcOCAOih5PKr = -1;
            xpKiPgWTE4o42v0M2im3.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
            xpKiPgWTE4o42v0M2im3.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
            return xpKiPgWTE4o42v0M2im3;
        }
        xpKiPgWTE4o42v0M2im3.V57tEvNfxZVVcOCAOih5PKr = this.aXO0LSrt8bKV ? SdPSMGy13dYOH9CwolJVKu21val() : uQ30BFNHbnwcS96Dk6jHUECPfOq();
        View viewHf6zp5JYLjGyFD2HXbpHA9 = this.q11o1hieEkZDhF1MGOZI26oZiDT ? Hf6zp5JYLjGyFD2HXbpHA9(true) : pCrI77IVeIpJnmCUHd(true);
        xpKiPgWTE4o42v0M2im3.ZfQNn8hdWlEQ5cR94249PDsLR = viewHf6zp5JYLjGyFD2HXbpHA9 != null ? wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewHf6zp5JYLjGyFD2HXbpHA9) : -1;
        int i = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        xpKiPgWTE4o42v0M2im3.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
        xpKiPgWTE4o42v0M2im3.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new int[i];
        for (int i2 = 0; i2 < this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv; i2++) {
            if (this.aXO0LSrt8bKV) {
                iGI83zq0G8e7zkn = this.pYmKDYlAmhudp[i2].ZLZeBXTMq0zDztBxtRTuCHrapQ(Integer.MIN_VALUE);
                if (iGI83zq0G8e7zkn != Integer.MIN_VALUE) {
                    iHzCpKshMOoaw76hFcbOVRYMeRd = this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ();
                    iGI83zq0G8e7zkn -= iHzCpKshMOoaw76hFcbOVRYMeRd;
                }
            } else {
                iGI83zq0G8e7zkn = this.pYmKDYlAmhudp[i2].GI83zq0G8e7zkn(Integer.MIN_VALUE);
                if (iGI83zq0G8e7zkn != Integer.MIN_VALUE) {
                    iHzCpKshMOoaw76hFcbOVRYMeRd = this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd();
                    iGI83zq0G8e7zkn -= iHzCpKshMOoaw76hFcbOVRYMeRd;
                }
            }
            xpKiPgWTE4o42v0M2im3.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i2] = iGI83zq0G8e7zkn;
        }
        return xpKiPgWTE4o42v0M2im3;
    }

    public final void BKHhIH8ByR(int i, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        int iKUYypEB4eNWOZWVDpH;
        int iKUYypEB4eNWOZWVDpH2;
        int i2;
        kxxelcgMpZ kxxelcgmpz = this.TaDO7ogis3aEiWEtq;
        boolean z = false;
        kxxelcgmpz.zzpBGItXfub0yWj = 0;
        kxxelcgmpz.V57tEvNfxZVVcOCAOih5PKr = i;
        hWsX15LBWoRzT hwsx15lbworzt = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (hwsx15lbworzt == null || !hwsx15lbworzt.LaeGQIruHQu81hfJldjMOQSVblH3x || (i2 = e20nj5kd0wqgo3.VxUQ9tBhpHJ2AAEDNW8sghc4m) == -1) {
            iKUYypEB4eNWOZWVDpH = 0;
            iKUYypEB4eNWOZWVDpH2 = 0;
        } else {
            if (this.q11o1hieEkZDhF1MGOZI26oZiDT == (i2 < i)) {
                iKUYypEB4eNWOZWVDpH = this.ko09zE6UAgwkV.KUYypEB4eNWOZWVDpH();
                iKUYypEB4eNWOZWVDpH2 = 0;
            } else {
                iKUYypEB4eNWOZWVDpH2 = this.ko09zE6UAgwkV.KUYypEB4eNWOZWVDpH();
                iKUYypEB4eNWOZWVDpH = 0;
            }
        }
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        if (recyclerView == null || !recyclerView.GI83zq0G8e7zkn) {
            kxxelcgmpz.ZLZeBXTMq0zDztBxtRTuCHrapQ = this.ko09zE6UAgwkV.zIvmSL0wzmmKGc3X39b2Gw2mUGE() + iKUYypEB4eNWOZWVDpH;
            kxxelcgmpz.zIvmSL0wzmmKGc3X39b2Gw2mUGE = -iKUYypEB4eNWOZWVDpH2;
        } else {
            kxxelcgmpz.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd() - iKUYypEB4eNWOZWVDpH2;
            kxxelcgmpz.ZLZeBXTMq0zDztBxtRTuCHrapQ = this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ() + iKUYypEB4eNWOZWVDpH;
        }
        kxxelcgmpz.NSjgqmGjEzuugn2SsG1mZFP = false;
        kxxelcgmpz.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
        if (this.ko09zE6UAgwkV.GI83zq0G8e7zkn() == 0 && this.ko09zE6UAgwkV.zIvmSL0wzmmKGc3X39b2Gw2mUGE() == 0) {
            z = true;
        }
        kxxelcgmpz.GI83zq0G8e7zkn = z;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int ByTQIhgl7ezGvHXEd(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return g3ZdIBE7kCD7VCyaOHY(i, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int Ca81ebIan1u(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (TaDO7ogis3aEiWEtq() == 0) {
            return 0;
        }
        boolean z = !this.qygqjTppWwx992;
        return zonOxHotd3BwAPJcwqr6I6uQNngg4.HzCpKshMOoaw76hFcbOVRYMeRd(e20nj5kd0wqgo3, this.ko09zE6UAgwkV, pCrI77IVeIpJnmCUHd(z), Hf6zp5JYLjGyFD2HXbpHA9(z), this, this.qygqjTppWwx992);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean DNP7yXLsojH0rPMHr8fUY14M() {
        return this.O1xDAlBZZlZdoEf747lCFHld == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View DUIkOzkuF3hUt() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.DUIkOzkuF3hUt():android.view.View");
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void GE1sqSYiEYQO2ew7WEZwTtUeS5(int i, int i2) {
        MnclyDIMxkCs4NkUREm(i, i2, 2);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void H2VFYNJEVGAX(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        dWgUTvLDR2aOE7pFLrMrHP(yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3, true);
    }

    public final View Hf6zp5JYLjGyFD2HXbpHA9(boolean z) {
        int iHzCpKshMOoaw76hFcbOVRYMeRd = this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd();
        int iZLZeBXTMq0zDztBxtRTuCHrapQ = this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ();
        View view = null;
        for (int iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq() - 1; iTaDO7ogis3aEiWEtq >= 0; iTaDO7ogis3aEiWEtq--) {
            View viewVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(iTaDO7ogis3aEiWEtq);
            int iLaeGQIruHQu81hfJldjMOQSVblH3x = this.ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(viewVBGA6pPLqSMuYGvprl270j7);
            int iZzpBGItXfub0yWj = this.ko09zE6UAgwkV.zzpBGItXfub0yWj(viewVBGA6pPLqSMuYGvprl270j7);
            if (iZzpBGItXfub0yWj > iHzCpKshMOoaw76hFcbOVRYMeRd && iLaeGQIruHQu81hfJldjMOQSVblH3x < iZLZeBXTMq0zDztBxtRTuCHrapQ) {
                if (iZzpBGItXfub0yWj <= iZLZeBXTMq0zDztBxtRTuCHrapQ || !z) {
                    return viewVBGA6pPLqSMuYGvprl270j7;
                }
                if (view == null) {
                    view = viewVBGA6pPLqSMuYGvprl270j7;
                }
            }
        }
        return view;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int HzCpKshMOoaw76hFcbOVRYMeRd(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return PfK8qHOJoCLG(e20nj5kd0wqgo3);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void ItrQwCXbty5PZtje5JS(AccessibilityEvent accessibilityEvent) {
        super.ItrQwCXbty5PZtje5JS(accessibilityEvent);
        if (TaDO7ogis3aEiWEtq() > 0) {
            View viewPCrI77IVeIpJnmCUHd = pCrI77IVeIpJnmCUHd(false);
            View viewHf6zp5JYLjGyFD2HXbpHA9 = Hf6zp5JYLjGyFD2HXbpHA9(false);
            if (viewPCrI77IVeIpJnmCUHd == null || viewHf6zp5JYLjGyFD2HXbpHA9 == null) {
                return;
            }
            int iY1NaPKTl7R18DOr6e8i5 = wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewPCrI77IVeIpJnmCUHd);
            int iY1NaPKTl7R18DOr6e8i52 = wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewHf6zp5JYLjGyFD2HXbpHA9);
            if (iY1NaPKTl7R18DOr6e8i5 < iY1NaPKTl7R18DOr6e8i52) {
                accessibilityEvent.setFromIndex(iY1NaPKTl7R18DOr6e8i5);
                accessibilityEvent.setToIndex(iY1NaPKTl7R18DOr6e8i52);
            } else {
                accessibilityEvent.setFromIndex(iY1NaPKTl7R18DOr6e8i52);
                accessibilityEvent.setToIndex(iY1NaPKTl7R18DOr6e8i5);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View JUdwvN8LfOMa(android.view.View r9, int r10, com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C r11, com.vdodsodjsdt.e20NJ5kD0wqGO3 r12) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.JUdwvN8LfOMa(android.view.View, int, com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C, com.vdodsodjsdt.e20NJ5kD0wqGO3):android.view.View");
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int KUYypEB4eNWOZWVDpH(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (TaDO7ogis3aEiWEtq() == 0) {
            return 0;
        }
        boolean z = !this.qygqjTppWwx992;
        return zonOxHotd3BwAPJcwqr6I6uQNngg4.HzCpKshMOoaw76hFcbOVRYMeRd(e20nj5kd0wqgo3, this.ko09zE6UAgwkV, pCrI77IVeIpJnmCUHd(z), Hf6zp5JYLjGyFD2HXbpHA9(z), this, this.qygqjTppWwx992);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void KYZ9RyuOc42A2J() {
        this.SuB3hEmTmbbRGAhtvOOmfKEon.ZfQNn8hdWlEQ5cR94249PDsLR();
        HAPpjhiCsV9ONY23505HCBI9IX();
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.f6ZQsR6bPLvvCDNXOUc == 1;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int M9e7PWhFYLD2lOGMker(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (TaDO7ogis3aEiWEtq() == 0) {
            return 0;
        }
        boolean z = !this.qygqjTppWwx992;
        return zonOxHotd3BwAPJcwqr6I6uQNngg4.GI83zq0G8e7zkn(e20nj5kd0wqgo3, this.ko09zE6UAgwkV, pCrI77IVeIpJnmCUHd(z), Hf6zp5JYLjGyFD2HXbpHA9(z), this, this.qygqjTppWwx992);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MnclyDIMxkCs4NkUREm(int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.MnclyDIMxkCs4NkUREm(int, int, int):void");
    }

    public final void N08cqkgagFuPYWJcTFAQVt(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, boolean z) {
        int iZLZeBXTMq0zDztBxtRTuCHrapQ;
        int iVAUpruoPNdSAVh = VAUpruoPNdSAVh(Integer.MIN_VALUE);
        if (iVAUpruoPNdSAVh != Integer.MIN_VALUE && (iZLZeBXTMq0zDztBxtRTuCHrapQ = this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ() - iVAUpruoPNdSAVh) > 0) {
            int i = iZLZeBXTMq0zDztBxtRTuCHrapQ - (-g3ZdIBE7kCD7VCyaOHY(-iZLZeBXTMq0zDztBxtRTuCHrapQ, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3));
            if (!z || i <= 0) {
                return;
            }
            this.ko09zE6UAgwkV.Ca81ebIan1u(i);
        }
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void NSjgqmGjEzuugn2SsG1mZFP(int i, int i2, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, MSl7hPM6XqjxyBV5m mSl7hPM6XqjxyBV5m) {
        kxxelcgMpZ kxxelcgmpz;
        int iZLZeBXTMq0zDztBxtRTuCHrapQ;
        int iGI83zq0G8e7zkn;
        if (this.f6ZQsR6bPLvvCDNXOUc != 0) {
            i = i2;
        }
        if (TaDO7ogis3aEiWEtq() == 0 || i == 0) {
            return;
        }
        h3Ks2H3xAh4bOWXD2gGtiHV6g(i, e20nj5kd0wqgo3);
        int[] iArr = this.iKANjmyTSxO6v6UuLPdu7DxOjlS;
        if (iArr == null || iArr.length < this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
            this.iKANjmyTSxO6v6UuLPdu7DxOjlS = new int[this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
            kxxelcgmpz = this.TaDO7ogis3aEiWEtq;
            if (i3 >= i5) {
                break;
            }
            if (kxxelcgmpz.ZfQNn8hdWlEQ5cR94249PDsLR == -1) {
                iZLZeBXTMq0zDztBxtRTuCHrapQ = kxxelcgmpz.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                iGI83zq0G8e7zkn = this.pYmKDYlAmhudp[i3].GI83zq0G8e7zkn(iZLZeBXTMq0zDztBxtRTuCHrapQ);
            } else {
                iZLZeBXTMq0zDztBxtRTuCHrapQ = this.pYmKDYlAmhudp[i3].ZLZeBXTMq0zDztBxtRTuCHrapQ(kxxelcgmpz.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                iGI83zq0G8e7zkn = kxxelcgmpz.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            }
            int i6 = iZLZeBXTMq0zDztBxtRTuCHrapQ - iGI83zq0G8e7zkn;
            if (i6 >= 0) {
                this.iKANjmyTSxO6v6UuLPdu7DxOjlS[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.iKANjmyTSxO6v6UuLPdu7DxOjlS, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = kxxelcgmpz.V57tEvNfxZVVcOCAOih5PKr;
            if (i8 < 0 || i8 >= e20nj5kd0wqgo3.zzpBGItXfub0yWj()) {
                return;
            }
            mSl7hPM6XqjxyBV5m.VxUQ9tBhpHJ2AAEDNW8sghc4m(kxxelcgmpz.V57tEvNfxZVVcOCAOih5PKr, this.iKANjmyTSxO6v6UuLPdu7DxOjlS[i7]);
            kxxelcgmpz.V57tEvNfxZVVcOCAOih5PKr += kxxelcgmpz.ZfQNn8hdWlEQ5cR94249PDsLR;
        }
    }

    public final int PfK8qHOJoCLG(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (TaDO7ogis3aEiWEtq() == 0) {
            return 0;
        }
        boolean z = !this.qygqjTppWwx992;
        return zonOxHotd3BwAPJcwqr6I6uQNngg4.M9e7PWhFYLD2lOGMker(e20nj5kd0wqgo3, this.ko09zE6UAgwkV, pCrI77IVeIpJnmCUHd(z), Hf6zp5JYLjGyFD2HXbpHA9(z), this, this.qygqjTppWwx992, this.q11o1hieEkZDhF1MGOZI26oZiDT);
    }

    public final void QwZcr6V7mfRUaij0Bp3zpr5ClBcxr(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, boolean z) {
        int iHzCpKshMOoaw76hFcbOVRYMeRd;
        int iTf2p6GzNN7uQY7Lun0pJ = tf2p6GzNN7uQY7Lun0pJ(Integer.MAX_VALUE);
        if (iTf2p6GzNN7uQY7Lun0pJ != Integer.MAX_VALUE && (iHzCpKshMOoaw76hFcbOVRYMeRd = iTf2p6GzNN7uQY7Lun0pJ - this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd()) > 0) {
            int iG3ZdIBE7kCD7VCyaOHY = iHzCpKshMOoaw76hFcbOVRYMeRd - g3ZdIBE7kCD7VCyaOHY(iHzCpKshMOoaw76hFcbOVRYMeRd, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
            if (!z || iG3ZdIBE7kCD7VCyaOHY <= 0) {
                return;
            }
            this.ko09zE6UAgwkV.Ca81ebIan1u(-iG3ZdIBE7kCD7VCyaOHY);
        }
    }

    public final void RthAxhvqlGkoa(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, int i) {
        while (TaDO7ogis3aEiWEtq() > 0) {
            View viewVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(0);
            if (this.ko09zE6UAgwkV.zzpBGItXfub0yWj(viewVBGA6pPLqSMuYGvprl270j7) > i || this.ko09zE6UAgwkV.q1wNbhk2O6(viewVBGA6pPLqSMuYGvprl270j7) > i) {
                return;
            }
            sqhEuPaG4yT6D7gwZf5yfbaPJBAN sqheupag4yt6d7gwzf5yfbapjban = (sqhEuPaG4yT6D7gwZf5yfbaPJBAN) viewVBGA6pPLqSMuYGvprl270j7.getLayoutParams();
            sqheupag4yt6d7gwzf5yfbapjban.getClass();
            if (((ArrayList) sqheupag4yt6d7gwzf5yfbapjban.LaeGQIruHQu81hfJldjMOQSVblH3x.zIvmSL0wzmmKGc3X39b2Gw2mUGE).size() == 1) {
                return;
            }
            OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT0 = sqheupag4yt6d7gwzf5yfbapjban.LaeGQIruHQu81hfJldjMOQSVblH3x;
            ArrayList arrayList = (ArrayList) oBsbe4YQtB2vgUFxLzO6ssT0.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            View view = (View) arrayList.remove(0);
            sqhEuPaG4yT6D7gwZf5yfbaPJBAN sqheupag4yt6d7gwzf5yfbapjban2 = (sqhEuPaG4yT6D7gwZf5yfbaPJBAN) view.getLayoutParams();
            sqheupag4yt6d7gwzf5yfbapjban2.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
            if (arrayList.size() == 0) {
                oBsbe4YQtB2vgUFxLzO6ssT0.V57tEvNfxZVVcOCAOih5PKr = Integer.MIN_VALUE;
            }
            if (sqheupag4yt6d7gwzf5yfbapjban2.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP() || sqheupag4yt6d7gwzf5yfbapjban2.VxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd()) {
                oBsbe4YQtB2vgUFxLzO6ssT0.ZfQNn8hdWlEQ5cR94249PDsLR -= ((StaggeredGridLayoutManager) oBsbe4YQtB2vgUFxLzO6ssT0.ZLZeBXTMq0zDztBxtRTuCHrapQ).ko09zE6UAgwkV.V57tEvNfxZVVcOCAOih5PKr(view);
            }
            oBsbe4YQtB2vgUFxLzO6ssT0.zzpBGItXfub0yWj = Integer.MIN_VALUE;
            p6bBrs4p3Ly(viewVBGA6pPLqSMuYGvprl270j7, yhxkwue1zri6a9vau8hg9c);
        }
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int ScSj9HEorWkb3bIb1HyeKVoW(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, kxxelcgMpZ kxxelcgmpz, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT0;
        ?? r8;
        int iGI83zq0G8e7zkn;
        int iV57tEvNfxZVVcOCAOih5PKr;
        int iHzCpKshMOoaw76hFcbOVRYMeRd;
        int iV57tEvNfxZVVcOCAOih5PKr2;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1;
        this.w0Wu95l8dVNw5rZMRu.set(0, this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, true);
        kxxelcgMpZ kxxelcgmpz2 = this.TaDO7ogis3aEiWEtq;
        int i6 = kxxelcgmpz2.GI83zq0G8e7zkn ? kxxelcgmpz.LaeGQIruHQu81hfJldjMOQSVblH3x == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : kxxelcgmpz.LaeGQIruHQu81hfJldjMOQSVblH3x == 1 ? kxxelcgmpz.ZLZeBXTMq0zDztBxtRTuCHrapQ + kxxelcgmpz.zzpBGItXfub0yWj : kxxelcgmpz.zIvmSL0wzmmKGc3X39b2Gw2mUGE - kxxelcgmpz.zzpBGItXfub0yWj;
        int i7 = kxxelcgmpz.LaeGQIruHQu81hfJldjMOQSVblH3x;
        for (int i8 = 0; i8 < this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv; i8++) {
            if (!((ArrayList) this.pYmKDYlAmhudp[i8].zIvmSL0wzmmKGc3X39b2Gw2mUGE).isEmpty()) {
                aXBXRfs1fBrrkuQ(this.pYmKDYlAmhudp[i8], i7, i6);
            }
        }
        int iZLZeBXTMq0zDztBxtRTuCHrapQ = this.q11o1hieEkZDhF1MGOZI26oZiDT ? this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ() : this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd();
        boolean z = false;
        while (true) {
            int i9 = kxxelcgmpz.V57tEvNfxZVVcOCAOih5PKr;
            if (i9 < 0 || i9 >= e20nj5kd0wqgo3.zzpBGItXfub0yWj() || (!kxxelcgmpz2.GI83zq0G8e7zkn && this.w0Wu95l8dVNw5rZMRu.isEmpty())) {
                break;
            }
            View viewZfQNn8hdWlEQ5cR94249PDsLR = yhxkwue1zri6a9vau8hg9c.ZfQNn8hdWlEQ5cR94249PDsLR(kxxelcgmpz.V57tEvNfxZVVcOCAOih5PKr);
            kxxelcgmpz.V57tEvNfxZVVcOCAOih5PKr += kxxelcgmpz.ZfQNn8hdWlEQ5cR94249PDsLR;
            sqhEuPaG4yT6D7gwZf5yfbaPJBAN sqheupag4yt6d7gwzf5yfbapjban = (sqhEuPaG4yT6D7gwZf5yfbaPJBAN) viewZfQNn8hdWlEQ5cR94249PDsLR.getLayoutParams();
            int iZzpBGItXfub0yWj = sqheupag4yt6d7gwzf5yfbapjban.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj();
            o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = this.SuB3hEmTmbbRGAhtvOOmfKEon;
            int[] iArr = (int[]) o6oxmoscd9hj6lf8utncntx9cf21.V57tEvNfxZVVcOCAOih5PKr;
            int i10 = (iArr == null || iZzpBGItXfub0yWj >= iArr.length) ? -1 : iArr[iZzpBGItXfub0yWj];
            if (i10 == -1) {
                if (W5cWMjmJv6kqhapkBbKZYxBWC2p(kxxelcgmpz.LaeGQIruHQu81hfJldjMOQSVblH3x)) {
                    i3 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv - i5;
                    i2 = -1;
                    i = -1;
                } else {
                    i = i5;
                    i2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                    i3 = i4;
                }
                OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT02 = null;
                if (kxxelcgmpz.LaeGQIruHQu81hfJldjMOQSVblH3x == i5) {
                    int iHzCpKshMOoaw76hFcbOVRYMeRd2 = this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd();
                    int i11 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT03 = this.pYmKDYlAmhudp[i3];
                        int iZLZeBXTMq0zDztBxtRTuCHrapQ2 = oBsbe4YQtB2vgUFxLzO6ssT03.ZLZeBXTMq0zDztBxtRTuCHrapQ(iHzCpKshMOoaw76hFcbOVRYMeRd2);
                        if (iZLZeBXTMq0zDztBxtRTuCHrapQ2 < i11) {
                            i11 = iZLZeBXTMq0zDztBxtRTuCHrapQ2;
                            oBsbe4YQtB2vgUFxLzO6ssT02 = oBsbe4YQtB2vgUFxLzO6ssT03;
                        }
                        i3 += i;
                    }
                } else {
                    int iZLZeBXTMq0zDztBxtRTuCHrapQ3 = this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ();
                    int i12 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT04 = this.pYmKDYlAmhudp[i3];
                        int iGI83zq0G8e7zkn2 = oBsbe4YQtB2vgUFxLzO6ssT04.GI83zq0G8e7zkn(iZLZeBXTMq0zDztBxtRTuCHrapQ3);
                        if (iGI83zq0G8e7zkn2 > i12) {
                            oBsbe4YQtB2vgUFxLzO6ssT02 = oBsbe4YQtB2vgUFxLzO6ssT04;
                            i12 = iGI83zq0G8e7zkn2;
                        }
                        i3 += i;
                    }
                }
                oBsbe4YQtB2vgUFxLzO6ssT0 = oBsbe4YQtB2vgUFxLzO6ssT02;
                o6oxmoscd9hj6lf8utncntx9cf21.LaeGQIruHQu81hfJldjMOQSVblH3x(iZzpBGItXfub0yWj);
                ((int[]) o6oxmoscd9hj6lf8utncntx9cf21.V57tEvNfxZVVcOCAOih5PKr)[iZzpBGItXfub0yWj] = oBsbe4YQtB2vgUFxLzO6ssT0.LaeGQIruHQu81hfJldjMOQSVblH3x;
            } else {
                oBsbe4YQtB2vgUFxLzO6ssT0 = this.pYmKDYlAmhudp[i10];
            }
            sqheupag4yt6d7gwzf5yfbapjban.LaeGQIruHQu81hfJldjMOQSVblH3x = oBsbe4YQtB2vgUFxLzO6ssT0;
            if (kxxelcgmpz.LaeGQIruHQu81hfJldjMOQSVblH3x == 1) {
                r8 = 0;
                zzpBGItXfub0yWj(viewZfQNn8hdWlEQ5cR94249PDsLR, -1, false);
            } else {
                r8 = 0;
                zzpBGItXfub0yWj(viewZfQNn8hdWlEQ5cR94249PDsLR, 0, false);
            }
            if (this.f6ZQsR6bPLvvCDNXOUc == 1) {
                u04PSKYidgCYrHk5CAtyMkPOXcY(viewZfQNn8hdWlEQ5cR94249PDsLR, wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(r8, this.vBGA6pPLqSMuYGvprl270j7, this.KUYypEB4eNWOZWVDpH, r8, ((ViewGroup.MarginLayoutParams) sqheupag4yt6d7gwzf5yfbapjban).width), wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(true, this.Ca81ebIan1u, this.q1wNbhk2O6, aXO0LSrt8bKV() + HVEwbdULInpTNa0IG(), ((ViewGroup.MarginLayoutParams) sqheupag4yt6d7gwzf5yfbapjban).height));
            } else {
                u04PSKYidgCYrHk5CAtyMkPOXcY(viewZfQNn8hdWlEQ5cR94249PDsLR, wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(true, this.p59rPv72J9, this.KUYypEB4eNWOZWVDpH, O1xDAlBZZlZdoEf747lCFHld() + vE4yDIjexsP2lGjLaTcB(), ((ViewGroup.MarginLayoutParams) sqheupag4yt6d7gwzf5yfbapjban).width), wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(false, this.vBGA6pPLqSMuYGvprl270j7, this.q1wNbhk2O6, 0, ((ViewGroup.MarginLayoutParams) sqheupag4yt6d7gwzf5yfbapjban).height));
            }
            if (kxxelcgmpz.LaeGQIruHQu81hfJldjMOQSVblH3x == 1) {
                iV57tEvNfxZVVcOCAOih5PKr = oBsbe4YQtB2vgUFxLzO6ssT0.ZLZeBXTMq0zDztBxtRTuCHrapQ(iZLZeBXTMq0zDztBxtRTuCHrapQ);
                iGI83zq0G8e7zkn = this.ko09zE6UAgwkV.V57tEvNfxZVVcOCAOih5PKr(viewZfQNn8hdWlEQ5cR94249PDsLR) + iV57tEvNfxZVVcOCAOih5PKr;
            } else {
                iGI83zq0G8e7zkn = oBsbe4YQtB2vgUFxLzO6ssT0.GI83zq0G8e7zkn(iZLZeBXTMq0zDztBxtRTuCHrapQ);
                iV57tEvNfxZVVcOCAOih5PKr = iGI83zq0G8e7zkn - this.ko09zE6UAgwkV.V57tEvNfxZVVcOCAOih5PKr(viewZfQNn8hdWlEQ5cR94249PDsLR);
            }
            if (kxxelcgmpz.LaeGQIruHQu81hfJldjMOQSVblH3x == 1) {
                OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT05 = sqheupag4yt6d7gwzf5yfbapjban.LaeGQIruHQu81hfJldjMOQSVblH3x;
                oBsbe4YQtB2vgUFxLzO6ssT05.getClass();
                sqhEuPaG4yT6D7gwZf5yfbaPJBAN sqheupag4yt6d7gwzf5yfbapjban2 = (sqhEuPaG4yT6D7gwZf5yfbaPJBAN) viewZfQNn8hdWlEQ5cR94249PDsLR.getLayoutParams();
                sqheupag4yt6d7gwzf5yfbapjban2.LaeGQIruHQu81hfJldjMOQSVblH3x = oBsbe4YQtB2vgUFxLzO6ssT05;
                ArrayList arrayList = (ArrayList) oBsbe4YQtB2vgUFxLzO6ssT05.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                arrayList.add(viewZfQNn8hdWlEQ5cR94249PDsLR);
                oBsbe4YQtB2vgUFxLzO6ssT05.V57tEvNfxZVVcOCAOih5PKr = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    oBsbe4YQtB2vgUFxLzO6ssT05.zzpBGItXfub0yWj = Integer.MIN_VALUE;
                }
                if (sqheupag4yt6d7gwzf5yfbapjban2.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP() || sqheupag4yt6d7gwzf5yfbapjban2.VxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd()) {
                    oBsbe4YQtB2vgUFxLzO6ssT05.ZfQNn8hdWlEQ5cR94249PDsLR = ((StaggeredGridLayoutManager) oBsbe4YQtB2vgUFxLzO6ssT05.ZLZeBXTMq0zDztBxtRTuCHrapQ).ko09zE6UAgwkV.V57tEvNfxZVVcOCAOih5PKr(viewZfQNn8hdWlEQ5cR94249PDsLR) + oBsbe4YQtB2vgUFxLzO6ssT05.ZfQNn8hdWlEQ5cR94249PDsLR;
                }
            } else {
                OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT06 = sqheupag4yt6d7gwzf5yfbapjban.LaeGQIruHQu81hfJldjMOQSVblH3x;
                oBsbe4YQtB2vgUFxLzO6ssT06.getClass();
                sqhEuPaG4yT6D7gwZf5yfbaPJBAN sqheupag4yt6d7gwzf5yfbapjban3 = (sqhEuPaG4yT6D7gwZf5yfbaPJBAN) viewZfQNn8hdWlEQ5cR94249PDsLR.getLayoutParams();
                sqheupag4yt6d7gwzf5yfbapjban3.LaeGQIruHQu81hfJldjMOQSVblH3x = oBsbe4YQtB2vgUFxLzO6ssT06;
                ArrayList arrayList2 = (ArrayList) oBsbe4YQtB2vgUFxLzO6ssT06.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                arrayList2.add(0, viewZfQNn8hdWlEQ5cR94249PDsLR);
                oBsbe4YQtB2vgUFxLzO6ssT06.zzpBGItXfub0yWj = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    oBsbe4YQtB2vgUFxLzO6ssT06.V57tEvNfxZVVcOCAOih5PKr = Integer.MIN_VALUE;
                }
                if (sqheupag4yt6d7gwzf5yfbapjban3.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP() || sqheupag4yt6d7gwzf5yfbapjban3.VxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd()) {
                    oBsbe4YQtB2vgUFxLzO6ssT06.ZfQNn8hdWlEQ5cR94249PDsLR = ((StaggeredGridLayoutManager) oBsbe4YQtB2vgUFxLzO6ssT06.ZLZeBXTMq0zDztBxtRTuCHrapQ).ko09zE6UAgwkV.V57tEvNfxZVVcOCAOih5PKr(viewZfQNn8hdWlEQ5cR94249PDsLR) + oBsbe4YQtB2vgUFxLzO6ssT06.ZfQNn8hdWlEQ5cR94249PDsLR;
                }
            }
            if (w45GC0xYcf4u8gmC() && this.f6ZQsR6bPLvvCDNXOUc == 1) {
                iV57tEvNfxZVVcOCAOih5PKr2 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y.ZLZeBXTMq0zDztBxtRTuCHrapQ() - (((this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv - 1) - oBsbe4YQtB2vgUFxLzO6ssT0.LaeGQIruHQu81hfJldjMOQSVblH3x) * this.vBGA6pPLqSMuYGvprl270j7);
                iHzCpKshMOoaw76hFcbOVRYMeRd = iV57tEvNfxZVVcOCAOih5PKr2 - this.jW7EiD0YL6xkbB158jMUzhWNWb1y.V57tEvNfxZVVcOCAOih5PKr(viewZfQNn8hdWlEQ5cR94249PDsLR);
            } else {
                iHzCpKshMOoaw76hFcbOVRYMeRd = this.jW7EiD0YL6xkbB158jMUzhWNWb1y.HzCpKshMOoaw76hFcbOVRYMeRd() + (oBsbe4YQtB2vgUFxLzO6ssT0.LaeGQIruHQu81hfJldjMOQSVblH3x * this.vBGA6pPLqSMuYGvprl270j7);
                iV57tEvNfxZVVcOCAOih5PKr2 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y.V57tEvNfxZVVcOCAOih5PKr(viewZfQNn8hdWlEQ5cR94249PDsLR) + iHzCpKshMOoaw76hFcbOVRYMeRd;
            }
            if (this.f6ZQsR6bPLvvCDNXOUc == 1) {
                wbBBe1vAdVO1DmSg1odNaySAYTu.ymT6yQrus3w(viewZfQNn8hdWlEQ5cR94249PDsLR, iHzCpKshMOoaw76hFcbOVRYMeRd, iV57tEvNfxZVVcOCAOih5PKr, iV57tEvNfxZVVcOCAOih5PKr2, iGI83zq0G8e7zkn);
            } else {
                wbBBe1vAdVO1DmSg1odNaySAYTu.ymT6yQrus3w(viewZfQNn8hdWlEQ5cR94249PDsLR, iV57tEvNfxZVVcOCAOih5PKr, iHzCpKshMOoaw76hFcbOVRYMeRd, iGI83zq0G8e7zkn, iV57tEvNfxZVVcOCAOih5PKr2);
            }
            aXBXRfs1fBrrkuQ(oBsbe4YQtB2vgUFxLzO6ssT0, kxxelcgmpz2.LaeGQIruHQu81hfJldjMOQSVblH3x, i6);
            xPE15iVa67UqDZHqi(yhxkwue1zri6a9vau8hg9c, kxxelcgmpz2);
            if (kxxelcgmpz2.NSjgqmGjEzuugn2SsG1mZFP && viewZfQNn8hdWlEQ5cR94249PDsLR.hasFocusable()) {
                this.w0Wu95l8dVNw5rZMRu.set(oBsbe4YQtB2vgUFxLzO6ssT0.LaeGQIruHQu81hfJldjMOQSVblH3x, false);
            }
            i5 = 1;
            z = true;
            i4 = 0;
        }
        if (!z) {
            xPE15iVa67UqDZHqi(yhxkwue1zri6a9vau8hg9c, kxxelcgmpz2);
        }
        int iHzCpKshMOoaw76hFcbOVRYMeRd3 = kxxelcgmpz2.LaeGQIruHQu81hfJldjMOQSVblH3x == -1 ? this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd() - tf2p6GzNN7uQY7Lun0pJ(this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd()) : VAUpruoPNdSAVh(this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ()) - this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ();
        if (iHzCpKshMOoaw76hFcbOVRYMeRd3 > 0) {
            return Math.min(kxxelcgmpz.zzpBGItXfub0yWj, iHzCpKshMOoaw76hFcbOVRYMeRd3);
        }
        return 0;
    }

    public final int SdPSMGy13dYOH9CwolJVKu21val() {
        int iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
        if (iTaDO7ogis3aEiWEtq == 0) {
            return 0;
        }
        return wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(vBGA6pPLqSMuYGvprl270j7(iTaDO7ogis3aEiWEtq - 1));
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void V57tEvNfxZVVcOCAOih5PKr(String str) {
        if (this.O1xDAlBZZlZdoEf747lCFHld == null) {
            super.V57tEvNfxZVVcOCAOih5PKr(str);
        }
    }

    public final int VAUpruoPNdSAVh(int i) {
        int iZLZeBXTMq0zDztBxtRTuCHrapQ = this.pYmKDYlAmhudp[0].ZLZeBXTMq0zDztBxtRTuCHrapQ(i);
        for (int i2 = 1; i2 < this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv; i2++) {
            int iZLZeBXTMq0zDztBxtRTuCHrapQ2 = this.pYmKDYlAmhudp[i2].ZLZeBXTMq0zDztBxtRTuCHrapQ(i);
            if (iZLZeBXTMq0zDztBxtRTuCHrapQ2 > iZLZeBXTMq0zDztBxtRTuCHrapQ) {
                iZLZeBXTMq0zDztBxtRTuCHrapQ = iZLZeBXTMq0zDztBxtRTuCHrapQ2;
            }
        }
        return iZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // com.vdodsodjsdt.HwNYcAGldMPcCAM0eNF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.PointF VxUQ9tBhpHJ2AAEDNW8sghc4m(int r4) {
        /*
            r3 = this;
            int r0 = r3.TaDO7ogis3aEiWEtq()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.q11o1hieEkZDhF1MGOZI26oZiDT
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.uQ30BFNHbnwcS96Dk6jHUECPfOq()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.q11o1hieEkZDhF1MGOZI26oZiDT
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f6ZQsR6bPLvvCDNXOUc
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.VxUQ9tBhpHJ2AAEDNW8sghc4m(int):android.graphics.PointF");
    }

    public final boolean W5cWMjmJv6kqhapkBbKZYxBWC2p(int i) {
        if (this.f6ZQsR6bPLvvCDNXOUc == 0) {
            return (i == -1) != this.q11o1hieEkZDhF1MGOZI26oZiDT;
        }
        return ((i == -1) == this.q11o1hieEkZDhF1MGOZI26oZiDT) == w45GC0xYcf4u8gmC();
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void YdNRGRc4rly(int i) {
        super.YdNRGRc4rly(i);
        for (int i2 = 0; i2 < this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv; i2++) {
            OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT0 = this.pYmKDYlAmhudp[i2];
            int i3 = oBsbe4YQtB2vgUFxLzO6ssT0.zzpBGItXfub0yWj;
            if (i3 != Integer.MIN_VALUE) {
                oBsbe4YQtB2vgUFxLzO6ssT0.zzpBGItXfub0yWj = i3 + i;
            }
            int i4 = oBsbe4YQtB2vgUFxLzO6ssT0.V57tEvNfxZVVcOCAOih5PKr;
            if (i4 != Integer.MIN_VALUE) {
                oBsbe4YQtB2vgUFxLzO6ssT0.V57tEvNfxZVVcOCAOih5PKr = i4 + i;
            }
        }
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void Z1FjjMJ0suz8AFI7gsA4GDLMXv(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        this.RhfGHxtXxy0M0grmp2jkRjQg = -1;
        this.qNPQb1obP7 = Integer.MIN_VALUE;
        this.O1xDAlBZZlZdoEf747lCFHld = null;
        this.y1NaPKTl7R18DOr6e8i5.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR() {
        return this.f6ZQsR6bPLvvCDNXOUc == 0;
    }

    public final void aXBXRfs1fBrrkuQ(OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT0, int i, int i2) {
        int i3 = oBsbe4YQtB2vgUFxLzO6ssT0.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i4 = oBsbe4YQtB2vgUFxLzO6ssT0.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i != -1) {
            int i5 = oBsbe4YQtB2vgUFxLzO6ssT0.V57tEvNfxZVVcOCAOih5PKr;
            if (i5 == Integer.MIN_VALUE) {
                oBsbe4YQtB2vgUFxLzO6ssT0.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                i5 = oBsbe4YQtB2vgUFxLzO6ssT0.V57tEvNfxZVVcOCAOih5PKr;
            }
            if (i5 - i3 >= i2) {
                this.w0Wu95l8dVNw5rZMRu.set(i4, false);
                return;
            }
            return;
        }
        int i6 = oBsbe4YQtB2vgUFxLzO6ssT0.zzpBGItXfub0yWj;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) oBsbe4YQtB2vgUFxLzO6ssT0.zIvmSL0wzmmKGc3X39b2Gw2mUGE).get(0);
            sqhEuPaG4yT6D7gwZf5yfbaPJBAN sqheupag4yt6d7gwzf5yfbapjban = (sqhEuPaG4yT6D7gwZf5yfbaPJBAN) view.getLayoutParams();
            oBsbe4YQtB2vgUFxLzO6ssT0.zzpBGItXfub0yWj = ((StaggeredGridLayoutManager) oBsbe4YQtB2vgUFxLzO6ssT0.ZLZeBXTMq0zDztBxtRTuCHrapQ).ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(view);
            sqheupag4yt6d7gwzf5yfbapjban.getClass();
            i6 = oBsbe4YQtB2vgUFxLzO6ssT0.zzpBGItXfub0yWj;
        }
        if (i6 + i3 <= i2) {
            this.w0Wu95l8dVNw5rZMRu.set(i4, false);
        }
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void bjhcQ0u7VT2OYYrwk96HrWoN(Parcelable parcelable) {
        if (parcelable instanceof XpKiPgWTE4o42v0M2im) {
            XpKiPgWTE4o42v0M2im xpKiPgWTE4o42v0M2im = (XpKiPgWTE4o42v0M2im) parcelable;
            this.O1xDAlBZZlZdoEf747lCFHld = xpKiPgWTE4o42v0M2im;
            if (this.RhfGHxtXxy0M0grmp2jkRjQg != -1) {
                xpKiPgWTE4o42v0M2im.V57tEvNfxZVVcOCAOih5PKr = -1;
                xpKiPgWTE4o42v0M2im.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
                xpKiPgWTE4o42v0M2im.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
                xpKiPgWTE4o42v0M2im.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
                xpKiPgWTE4o42v0M2im.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
                xpKiPgWTE4o42v0M2im.NSjgqmGjEzuugn2SsG1mZFP = null;
                xpKiPgWTE4o42v0M2im.GI83zq0G8e7zkn = null;
            }
            HAPpjhiCsV9ONY23505HCBI9IX();
        }
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean d9zDyyznnp3oaDT1Ug() {
        return this.pzqP2AqKW6J5PO8zCKnW != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0419  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dWgUTvLDR2aOE7pFLrMrHP(com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C r17, com.vdodsodjsdt.e20NJ5kD0wqGO3 r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.dWgUTvLDR2aOE7pFLrMrHP(com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C, com.vdodsodjsdt.e20NJ5kD0wqGO3, boolean):void");
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int e1gEV3X9xwmHj(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return g3ZdIBE7kCD7VCyaOHY(i, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final YoYMmBKQmkacZj7lMi9c f6ZQsR6bPLvvCDNXOUc(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new sqhEuPaG4yT6D7gwZf5yfbaPJBAN((ViewGroup.MarginLayoutParams) layoutParams) : new sqhEuPaG4yT6D7gwZf5yfbaPJBAN(layoutParams);
    }

    public final int g3ZdIBE7kCD7VCyaOHY(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (TaDO7ogis3aEiWEtq() == 0 || i == 0) {
            return 0;
        }
        h3Ks2H3xAh4bOWXD2gGtiHV6g(i, e20nj5kd0wqgo3);
        kxxelcgMpZ kxxelcgmpz = this.TaDO7ogis3aEiWEtq;
        int iScSj9HEorWkb3bIb1HyeKVoW = ScSj9HEorWkb3bIb1HyeKVoW(yhxkwue1zri6a9vau8hg9c, kxxelcgmpz, e20nj5kd0wqgo3);
        if (kxxelcgmpz.zzpBGItXfub0yWj >= iScSj9HEorWkb3bIb1HyeKVoW) {
            i = i < 0 ? -iScSj9HEorWkb3bIb1HyeKVoW : iScSj9HEorWkb3bIb1HyeKVoW;
        }
        this.ko09zE6UAgwkV.Ca81ebIan1u(-i);
        this.aXO0LSrt8bKV = this.q11o1hieEkZDhF1MGOZI26oZiDT;
        kxxelcgmpz.zzpBGItXfub0yWj = 0;
        xPE15iVa67UqDZHqi(yhxkwue1zri6a9vau8hg9c, kxxelcgmpz);
        return i;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void gBaBUmihn5l4u() {
        this.SuB3hEmTmbbRGAhtvOOmfKEon.ZfQNn8hdWlEQ5cR94249PDsLR();
        for (int i = 0; i < this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv; i++) {
            this.pYmKDYlAmhudp[i].zzpBGItXfub0yWj();
        }
    }

    public final void h3Ks2H3xAh4bOWXD2gGtiHV6g(int i, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        int iUQ30BFNHbnwcS96Dk6jHUECPfOq;
        int i2;
        if (i > 0) {
            iUQ30BFNHbnwcS96Dk6jHUECPfOq = SdPSMGy13dYOH9CwolJVKu21val();
            i2 = 1;
        } else {
            iUQ30BFNHbnwcS96Dk6jHUECPfOq = uQ30BFNHbnwcS96Dk6jHUECPfOq();
            i2 = -1;
        }
        kxxelcgMpZ kxxelcgmpz = this.TaDO7ogis3aEiWEtq;
        kxxelcgmpz.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
        BKHhIH8ByR(iUQ30BFNHbnwcS96Dk6jHUECPfOq, e20nj5kd0wqgo3);
        mKTA58YSdN8mGkQ2js3639TJtCoY(i2);
        kxxelcgmpz.V57tEvNfxZVVcOCAOih5PKr = iUQ30BFNHbnwcS96Dk6jHUECPfOq + kxxelcgmpz.ZfQNn8hdWlEQ5cR94249PDsLR;
        kxxelcgmpz.zzpBGItXfub0yWj = Math.abs(i);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final YoYMmBKQmkacZj7lMi9c jW7EiD0YL6xkbB158jMUzhWNWb1y(Context context, AttributeSet attributeSet) {
        return new sqhEuPaG4yT6D7gwZf5yfbaPJBAN(context, attributeSet);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final YoYMmBKQmkacZj7lMi9c ko09zE6UAgwkV() {
        return this.f6ZQsR6bPLvvCDNXOUc == 0 ? new sqhEuPaG4yT6D7gwZf5yfbaPJBAN(-2, -1) : new sqhEuPaG4yT6D7gwZf5yfbaPJBAN(-1, -2);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void lQ0rO9lhQIyVe7Rp6(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.zzpBGItXfub0yWj;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.TqcnImqkSWIKht);
        }
        for (int i = 0; i < this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv; i++) {
            this.pYmKDYlAmhudp[i].zzpBGItXfub0yWj();
        }
        recyclerView.requestLayout();
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void lxWWbfAOLs4jWzd7PSIiIJ(Rect rect, int i, int i2) {
        int iZLZeBXTMq0zDztBxtRTuCHrapQ;
        int iZLZeBXTMq0zDztBxtRTuCHrapQ2;
        int iO1xDAlBZZlZdoEf747lCFHld = O1xDAlBZZlZdoEf747lCFHld() + vE4yDIjexsP2lGjLaTcB();
        int iAXO0LSrt8bKV = aXO0LSrt8bKV() + HVEwbdULInpTNa0IG();
        int i3 = this.f6ZQsR6bPLvvCDNXOUc;
        int i4 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (i3 == 1) {
            int iHeight = rect.height() + iAXO0LSrt8bKV;
            RecyclerView recyclerView = this.zzpBGItXfub0yWj;
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            iZLZeBXTMq0zDztBxtRTuCHrapQ2 = wbBBe1vAdVO1DmSg1odNaySAYTu.ZLZeBXTMq0zDztBxtRTuCHrapQ(i2, iHeight, recyclerView.getMinimumHeight());
            iZLZeBXTMq0zDztBxtRTuCHrapQ = wbBBe1vAdVO1DmSg1odNaySAYTu.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, (this.vBGA6pPLqSMuYGvprl270j7 * i4) + iO1xDAlBZZlZdoEf747lCFHld, this.zzpBGItXfub0yWj.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iO1xDAlBZZlZdoEf747lCFHld;
            RecyclerView recyclerView2 = this.zzpBGItXfub0yWj;
            WeakHashMap weakHashMap2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            iZLZeBXTMq0zDztBxtRTuCHrapQ = wbBBe1vAdVO1DmSg1odNaySAYTu.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, iWidth, recyclerView2.getMinimumWidth());
            iZLZeBXTMq0zDztBxtRTuCHrapQ2 = wbBBe1vAdVO1DmSg1odNaySAYTu.ZLZeBXTMq0zDztBxtRTuCHrapQ(i2, (this.vBGA6pPLqSMuYGvprl270j7 * i4) + iAXO0LSrt8bKV, this.zzpBGItXfub0yWj.getMinimumHeight());
        }
        this.zzpBGItXfub0yWj.setMeasuredDimension(iZLZeBXTMq0zDztBxtRTuCHrapQ, iZLZeBXTMq0zDztBxtRTuCHrapQ2);
    }

    public final void mKTA58YSdN8mGkQ2js3639TJtCoY(int i) {
        kxxelcgMpZ kxxelcgmpz = this.TaDO7ogis3aEiWEtq;
        kxxelcgmpz.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
        kxxelcgmpz.ZfQNn8hdWlEQ5cR94249PDsLR = this.q11o1hieEkZDhF1MGOZI26oZiDT != (i == -1) ? -1 : 1;
    }

    public final void n02PEvBBKA() {
        if (this.f6ZQsR6bPLvvCDNXOUc == 1 || !w45GC0xYcf4u8gmC()) {
            this.q11o1hieEkZDhF1MGOZI26oZiDT = this.Irh5auREsoeV1C1RaBamlmy;
        } else {
            this.q11o1hieEkZDhF1MGOZI26oZiDT = !this.Irh5auREsoeV1C1RaBamlmy;
        }
    }

    public final boolean nNOZCSz1a7S() {
        int iUQ30BFNHbnwcS96Dk6jHUECPfOq;
        if (TaDO7ogis3aEiWEtq() != 0 && this.pzqP2AqKW6J5PO8zCKnW != 0 && this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            if (this.q11o1hieEkZDhF1MGOZI26oZiDT) {
                iUQ30BFNHbnwcS96Dk6jHUECPfOq = SdPSMGy13dYOH9CwolJVKu21val();
                uQ30BFNHbnwcS96Dk6jHUECPfOq();
            } else {
                iUQ30BFNHbnwcS96Dk6jHUECPfOq = uQ30BFNHbnwcS96Dk6jHUECPfOq();
                SdPSMGy13dYOH9CwolJVKu21val();
            }
            if (iUQ30BFNHbnwcS96Dk6jHUECPfOq == 0 && DUIkOzkuF3hUt() != null) {
                this.SuB3hEmTmbbRGAhtvOOmfKEon.ZfQNn8hdWlEQ5cR94249PDsLR();
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
                HAPpjhiCsV9ONY23505HCBI9IX();
                return true;
            }
        }
        return false;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int p59rPv72J9(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return PfK8qHOJoCLG(e20nj5kd0wqgo3);
    }

    public final View pCrI77IVeIpJnmCUHd(boolean z) {
        int iHzCpKshMOoaw76hFcbOVRYMeRd = this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd();
        int iZLZeBXTMq0zDztBxtRTuCHrapQ = this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ();
        int iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
        View view = null;
        for (int i = 0; i < iTaDO7ogis3aEiWEtq; i++) {
            View viewVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(i);
            int iLaeGQIruHQu81hfJldjMOQSVblH3x = this.ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(viewVBGA6pPLqSMuYGvprl270j7);
            if (this.ko09zE6UAgwkV.zzpBGItXfub0yWj(viewVBGA6pPLqSMuYGvprl270j7) > iHzCpKshMOoaw76hFcbOVRYMeRd && iLaeGQIruHQu81hfJldjMOQSVblH3x < iZLZeBXTMq0zDztBxtRTuCHrapQ) {
                if (iLaeGQIruHQu81hfJldjMOQSVblH3x >= iHzCpKshMOoaw76hFcbOVRYMeRd || !z) {
                    return viewVBGA6pPLqSMuYGvprl270j7;
                }
                if (view == null) {
                    view = viewVBGA6pPLqSMuYGvprl270j7;
                }
            }
        }
        return view;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int q1wNbhk2O6(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (TaDO7ogis3aEiWEtq() == 0) {
            return 0;
        }
        boolean z = !this.qygqjTppWwx992;
        return zonOxHotd3BwAPJcwqr6I6uQNngg4.GI83zq0G8e7zkn(e20nj5kd0wqgo3, this.ko09zE6UAgwkV, pCrI77IVeIpJnmCUHd(z), Hf6zp5JYLjGyFD2HXbpHA9(z), this, this.qygqjTppWwx992);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void rERAmyEtGV6ANGszuKcQI(int i, int i2) {
        MnclyDIMxkCs4NkUREm(i, i2, 4);
    }

    public final void rutgM2KNeQiFZ9GKSRnhY125(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, int i) {
        for (int iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq() - 1; iTaDO7ogis3aEiWEtq >= 0; iTaDO7ogis3aEiWEtq--) {
            View viewVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(iTaDO7ogis3aEiWEtq);
            if (this.ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(viewVBGA6pPLqSMuYGvprl270j7) < i || this.ko09zE6UAgwkV.p59rPv72J9(viewVBGA6pPLqSMuYGvprl270j7) < i) {
                return;
            }
            sqhEuPaG4yT6D7gwZf5yfbaPJBAN sqheupag4yt6d7gwzf5yfbapjban = (sqhEuPaG4yT6D7gwZf5yfbaPJBAN) viewVBGA6pPLqSMuYGvprl270j7.getLayoutParams();
            sqheupag4yt6d7gwzf5yfbapjban.getClass();
            if (((ArrayList) sqheupag4yt6d7gwzf5yfbapjban.LaeGQIruHQu81hfJldjMOQSVblH3x.zIvmSL0wzmmKGc3X39b2Gw2mUGE).size() == 1) {
                return;
            }
            OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT0 = sqheupag4yt6d7gwzf5yfbapjban.LaeGQIruHQu81hfJldjMOQSVblH3x;
            ArrayList arrayList = (ArrayList) oBsbe4YQtB2vgUFxLzO6ssT0.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            sqhEuPaG4yT6D7gwZf5yfbaPJBAN sqheupag4yt6d7gwzf5yfbapjban2 = (sqhEuPaG4yT6D7gwZf5yfbaPJBAN) view.getLayoutParams();
            sqheupag4yt6d7gwzf5yfbapjban2.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
            if (sqheupag4yt6d7gwzf5yfbapjban2.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP() || sqheupag4yt6d7gwzf5yfbapjban2.VxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd()) {
                oBsbe4YQtB2vgUFxLzO6ssT0.ZfQNn8hdWlEQ5cR94249PDsLR -= ((StaggeredGridLayoutManager) oBsbe4YQtB2vgUFxLzO6ssT0.ZLZeBXTMq0zDztBxtRTuCHrapQ).ko09zE6UAgwkV.V57tEvNfxZVVcOCAOih5PKr(view);
            }
            if (size == 1) {
                oBsbe4YQtB2vgUFxLzO6ssT0.zzpBGItXfub0yWj = Integer.MIN_VALUE;
            }
            oBsbe4YQtB2vgUFxLzO6ssT0.V57tEvNfxZVVcOCAOih5PKr = Integer.MIN_VALUE;
            p6bBrs4p3Ly(viewVBGA6pPLqSMuYGvprl270j7, yhxkwue1zri6a9vau8hg9c);
        }
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void tFRdVJAePmTx77bP7FAN0uI(int i) {
        if (i == 0) {
            nNOZCSz1a7S();
        }
    }

    public final int tf2p6GzNN7uQY7Lun0pJ(int i) {
        int iGI83zq0G8e7zkn = this.pYmKDYlAmhudp[0].GI83zq0G8e7zkn(i);
        for (int i2 = 1; i2 < this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv; i2++) {
            int iGI83zq0G8e7zkn2 = this.pYmKDYlAmhudp[i2].GI83zq0G8e7zkn(i);
            if (iGI83zq0G8e7zkn2 < iGI83zq0G8e7zkn) {
                iGI83zq0G8e7zkn = iGI83zq0G8e7zkn2;
            }
        }
        return iGI83zq0G8e7zkn;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void tpEo0fy9FaoJYrSFHRfIK6(int i) {
        XpKiPgWTE4o42v0M2im xpKiPgWTE4o42v0M2im = this.O1xDAlBZZlZdoEf747lCFHld;
        if (xpKiPgWTE4o42v0M2im != null && xpKiPgWTE4o42v0M2im.V57tEvNfxZVVcOCAOih5PKr != i) {
            xpKiPgWTE4o42v0M2im.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
            xpKiPgWTE4o42v0M2im.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
            xpKiPgWTE4o42v0M2im.V57tEvNfxZVVcOCAOih5PKr = -1;
            xpKiPgWTE4o42v0M2im.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
        }
        this.RhfGHxtXxy0M0grmp2jkRjQg = i;
        this.qNPQb1obP7 = Integer.MIN_VALUE;
        HAPpjhiCsV9ONY23505HCBI9IX();
    }

    public final void u04PSKYidgCYrHk5CAtyMkPOXcY(View view, int i, int i2) {
        RecyclerView recyclerView = this.zzpBGItXfub0yWj;
        Rect rect = this.HVEwbdULInpTNa0IG;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.iKANjmyTSxO6v6UuLPdu7DxOjlS(view));
        }
        sqhEuPaG4yT6D7gwZf5yfbaPJBAN sqheupag4yt6d7gwzf5yfbapjban = (sqhEuPaG4yT6D7gwZf5yfbaPJBAN) view.getLayoutParams();
        int iPkbafUbW251pQJS6IcsKsWZll = PkbafUbW251pQJS6IcsKsWZll(i, ((ViewGroup.MarginLayoutParams) sqheupag4yt6d7gwzf5yfbapjban).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) sqheupag4yt6d7gwzf5yfbapjban).rightMargin + rect.right);
        int iPkbafUbW251pQJS6IcsKsWZll2 = PkbafUbW251pQJS6IcsKsWZll(i2, ((ViewGroup.MarginLayoutParams) sqheupag4yt6d7gwzf5yfbapjban).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) sqheupag4yt6d7gwzf5yfbapjban).bottomMargin + rect.bottom);
        if (r0dB0ojIy6g8mnk1(view, iPkbafUbW251pQJS6IcsKsWZll, iPkbafUbW251pQJS6IcsKsWZll2, sqheupag4yt6d7gwzf5yfbapjban)) {
            view.measure(iPkbafUbW251pQJS6IcsKsWZll, iPkbafUbW251pQJS6IcsKsWZll2);
        }
    }

    public final int uQ30BFNHbnwcS96Dk6jHUECPfOq() {
        if (TaDO7ogis3aEiWEtq() == 0) {
            return 0;
        }
        return wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(vBGA6pPLqSMuYGvprl270j7(0));
    }

    public final boolean w45GC0xYcf4u8gmC() {
        return pzqP2AqKW6J5PO8zCKnW() == 1;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void wRCD0SdqWCowdYU7bmzN(int i) {
        super.wRCD0SdqWCowdYU7bmzN(i);
        for (int i2 = 0; i2 < this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv; i2++) {
            OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT0 = this.pYmKDYlAmhudp[i2];
            int i3 = oBsbe4YQtB2vgUFxLzO6ssT0.zzpBGItXfub0yWj;
            if (i3 != Integer.MIN_VALUE) {
                oBsbe4YQtB2vgUFxLzO6ssT0.zzpBGItXfub0yWj = i3 + i;
            }
            int i4 = oBsbe4YQtB2vgUFxLzO6ssT0.V57tEvNfxZVVcOCAOih5PKr;
            if (i4 != Integer.MIN_VALUE) {
                oBsbe4YQtB2vgUFxLzO6ssT0.V57tEvNfxZVVcOCAOih5PKr = i4 + i;
            }
        }
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void wdI7vzA3Qmcwd(int i, int i2) {
        MnclyDIMxkCs4NkUREm(i, i2, 1);
    }

    public final void xPE15iVa67UqDZHqi(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, kxxelcgMpZ kxxelcgmpz) {
        if (!kxxelcgmpz.VxUQ9tBhpHJ2AAEDNW8sghc4m || kxxelcgmpz.GI83zq0G8e7zkn) {
            return;
        }
        if (kxxelcgmpz.zzpBGItXfub0yWj == 0) {
            if (kxxelcgmpz.LaeGQIruHQu81hfJldjMOQSVblH3x == -1) {
                rutgM2KNeQiFZ9GKSRnhY125(yhxkwue1zri6a9vau8hg9c, kxxelcgmpz.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                return;
            } else {
                RthAxhvqlGkoa(yhxkwue1zri6a9vau8hg9c, kxxelcgmpz.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                return;
            }
        }
        int i = 1;
        if (kxxelcgmpz.LaeGQIruHQu81hfJldjMOQSVblH3x == -1) {
            int i2 = kxxelcgmpz.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            int iGI83zq0G8e7zkn = this.pYmKDYlAmhudp[0].GI83zq0G8e7zkn(i2);
            while (i < this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
                int iGI83zq0G8e7zkn2 = this.pYmKDYlAmhudp[i].GI83zq0G8e7zkn(i2);
                if (iGI83zq0G8e7zkn2 > iGI83zq0G8e7zkn) {
                    iGI83zq0G8e7zkn = iGI83zq0G8e7zkn2;
                }
                i++;
            }
            int i3 = i2 - iGI83zq0G8e7zkn;
            rutgM2KNeQiFZ9GKSRnhY125(yhxkwue1zri6a9vau8hg9c, i3 < 0 ? kxxelcgmpz.ZLZeBXTMq0zDztBxtRTuCHrapQ : kxxelcgmpz.ZLZeBXTMq0zDztBxtRTuCHrapQ - Math.min(i3, kxxelcgmpz.zzpBGItXfub0yWj));
            return;
        }
        int i4 = kxxelcgmpz.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int iZLZeBXTMq0zDztBxtRTuCHrapQ = this.pYmKDYlAmhudp[0].ZLZeBXTMq0zDztBxtRTuCHrapQ(i4);
        while (i < this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
            int iZLZeBXTMq0zDztBxtRTuCHrapQ2 = this.pYmKDYlAmhudp[i].ZLZeBXTMq0zDztBxtRTuCHrapQ(i4);
            if (iZLZeBXTMq0zDztBxtRTuCHrapQ2 < iZLZeBXTMq0zDztBxtRTuCHrapQ) {
                iZLZeBXTMq0zDztBxtRTuCHrapQ = iZLZeBXTMq0zDztBxtRTuCHrapQ2;
            }
            i++;
        }
        int i5 = iZLZeBXTMq0zDztBxtRTuCHrapQ - kxxelcgmpz.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        RthAxhvqlGkoa(yhxkwue1zri6a9vau8hg9c, i5 < 0 ? kxxelcgmpz.zIvmSL0wzmmKGc3X39b2Gw2mUGE : Math.min(i5, kxxelcgmpz.zzpBGItXfub0yWj) + kxxelcgmpz.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c) {
        return yoYMmBKQmkacZj7lMi9c instanceof sqhEuPaG4yT6D7gwZf5yfbaPJBAN;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void zOk739gUM7zIZC25HHUxoiyixWFjn(int i, int i2) {
        MnclyDIMxkCs4NkUREm(i, i2, 8);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void zyiF0wv9HozxGOIDt8PvVp(RecyclerView recyclerView, int i) {
        hWsX15LBWoRzT hwsx15lbworzt = new hWsX15LBWoRzT(recyclerView.getContext());
        hwsx15lbworzt.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        KMiA9Sqk243eQkFNNoS(hwsx15lbworzt);
    }
}
