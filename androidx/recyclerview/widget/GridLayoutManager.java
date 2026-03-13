package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.vdodsodjsdt.FfCnaJyIb56cn2PIiajnq4CSS9Od;
import com.vdodsodjsdt.GRkmFhQtQOYENB;
import com.vdodsodjsdt.MSl7hPM6XqjxyBV5m;
import com.vdodsodjsdt.YoYMmBKQmkacZj7lMi9c;
import com.vdodsodjsdt.dXZw8zZnRXsRIYJEIdZC;
import com.vdodsodjsdt.e20NJ5kD0wqGO3;
import com.vdodsodjsdt.o2KpvwGQ24;
import com.vdodsodjsdt.pfO2OW9zrnO5AJnehaB5D0H3VP;
import com.vdodsodjsdt.u9SlVAuoWhQUfJ;
import com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu;
import com.vdodsodjsdt.wzEak8ZKpNWHd4RKPYQ;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;
import com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public int[] HVEwbdULInpTNa0IG;
    public int O1xDAlBZZlZdoEf747lCFHld;
    public final dXZw8zZnRXsRIYJEIdZC TqcnImqkSWIKht;
    public final Rect d9zDyyznnp3oaDT1Ug;
    public final SparseIntArray iKANjmyTSxO6v6UuLPdu7DxOjlS;
    public final SparseIntArray qygqjTppWwx992;
    public boolean vE4yDIjexsP2lGjLaTcB;
    public View[] y1NaPKTl7R18DOr6e8i5;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.vE4yDIjexsP2lGjLaTcB = false;
        this.O1xDAlBZZlZdoEf747lCFHld = -1;
        this.qygqjTppWwx992 = new SparseIntArray();
        this.iKANjmyTSxO6v6UuLPdu7DxOjlS = new SparseIntArray();
        this.TqcnImqkSWIKht = new dXZw8zZnRXsRIYJEIdZC();
        this.d9zDyyznnp3oaDT1Ug = new Rect();
        VTxNrDngIaBBCQr24UPH(wbBBe1vAdVO1DmSg1odNaySAYTu.qygqjTppWwx992(context, attributeSet, i, i2).zzpBGItXfub0yWj);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int ByTQIhgl7ezGvHXEd(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        ZUovbVjaFkLD3oh7czFRa();
        JHpnvxShf67x5mXGY();
        return super.ByTQIhgl7ezGvHXEd(i, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int Ca81ebIan1u(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return pCrI77IVeIpJnmCUHd(e20nj5kd0wqgo3);
    }

    public final int CuR7CK4ylj0mrRyDudYHtj1Ran(int i, int i2) {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv != 1 || !xPE15iVa67UqDZHqi()) {
            int[] iArr = this.HVEwbdULInpTNa0IG;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.HVEwbdULInpTNa0IG;
        int i3 = this.O1xDAlBZZlZdoEf747lCFHld;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean DNP7yXLsojH0rPMHr8fUY14M() {
        return this.RhfGHxtXxy0M0grmp2jkRjQg == null && !this.vE4yDIjexsP2lGjLaTcB;
    }

    public final void Dzw814uXgtjfmZb(View view, int i, boolean z) {
        int iIrh5auREsoeV1C1RaBamlmy;
        int iIrh5auREsoeV1C1RaBamlmy2;
        GRkmFhQtQOYENB gRkmFhQtQOYENB = (GRkmFhQtQOYENB) view.getLayoutParams();
        Rect rect = gRkmFhQtQOYENB.zzpBGItXfub0yWj;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB).topMargin + ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB).leftMargin + ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB).rightMargin;
        int iCuR7CK4ylj0mrRyDudYHtj1Ran = CuR7CK4ylj0mrRyDudYHtj1Ran(gRkmFhQtQOYENB.LaeGQIruHQu81hfJldjMOQSVblH3x, gRkmFhQtQOYENB.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1) {
            iIrh5auREsoeV1C1RaBamlmy2 = wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(false, iCuR7CK4ylj0mrRyDudYHtj1Ran, i, i3, ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB).width);
            iIrh5auREsoeV1C1RaBamlmy = wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(true, this.ko09zE6UAgwkV.KUYypEB4eNWOZWVDpH(), this.q1wNbhk2O6, i2, ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB).height);
        } else {
            int iIrh5auREsoeV1C1RaBamlmy3 = wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(false, iCuR7CK4ylj0mrRyDudYHtj1Ran, i, i2, ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB).height);
            int iIrh5auREsoeV1C1RaBamlmy4 = wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(true, this.ko09zE6UAgwkV.KUYypEB4eNWOZWVDpH(), this.KUYypEB4eNWOZWVDpH, i3, ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB).width);
            iIrh5auREsoeV1C1RaBamlmy = iIrh5auREsoeV1C1RaBamlmy3;
            iIrh5auREsoeV1C1RaBamlmy2 = iIrh5auREsoeV1C1RaBamlmy4;
        }
        YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c = (YoYMmBKQmkacZj7lMi9c) view.getLayoutParams();
        if (z ? Pf1HsU8AK92buCoUaexm5AC(view, iIrh5auREsoeV1C1RaBamlmy2, iIrh5auREsoeV1C1RaBamlmy, yoYMmBKQmkacZj7lMi9c) : r0dB0ojIy6g8mnk1(view, iIrh5auREsoeV1C1RaBamlmy2, iIrh5auREsoeV1C1RaBamlmy, yoYMmBKQmkacZj7lMi9c)) {
            view.measure(iIrh5auREsoeV1C1RaBamlmy2, iIrh5auREsoeV1C1RaBamlmy);
        }
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void GE1sqSYiEYQO2ew7WEZwTtUeS5(int i, int i2) {
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = this.TqcnImqkSWIKht;
        dxzw8zznrxsriyjeidzc.ZfQNn8hdWlEQ5cR94249PDsLR();
        ((SparseIntArray) dxzw8zznrxsriyjeidzc.ZfQNn8hdWlEQ5cR94249PDsLR).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void H2VFYNJEVGAX(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        boolean z = e20nj5kd0wqgo3.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        SparseIntArray sparseIntArray = this.iKANjmyTSxO6v6UuLPdu7DxOjlS;
        SparseIntArray sparseIntArray2 = this.qygqjTppWwx992;
        if (z) {
            int iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq();
            for (int i = 0; i < iTaDO7ogis3aEiWEtq; i++) {
                GRkmFhQtQOYENB gRkmFhQtQOYENB = (GRkmFhQtQOYENB) vBGA6pPLqSMuYGvprl270j7(i).getLayoutParams();
                int iZzpBGItXfub0yWj = gRkmFhQtQOYENB.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj();
                sparseIntArray2.put(iZzpBGItXfub0yWj, gRkmFhQtQOYENB.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                sparseIntArray.put(iZzpBGItXfub0yWj, gRkmFhQtQOYENB.LaeGQIruHQu81hfJldjMOQSVblH3x);
            }
        }
        super.H2VFYNJEVGAX(yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int HzCpKshMOoaw76hFcbOVRYMeRd(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return Hf6zp5JYLjGyFD2HXbpHA9(e20nj5kd0wqgo3);
    }

    public final void JHpnvxShf67x5mXGY() {
        View[] viewArr = this.y1NaPKTl7R18DOr6e8i5;
        if (viewArr == null || viewArr.length != this.O1xDAlBZZlZdoEf747lCFHld) {
            this.y1NaPKTl7R18DOr6e8i5 = new View[this.O1xDAlBZZlZdoEf747lCFHld];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View JUdwvN8LfOMa(android.view.View r23, int r24, com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C r25, com.vdodsodjsdt.e20NJ5kD0wqGO3 r26) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.JUdwvN8LfOMa(android.view.View, int, com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C, com.vdodsodjsdt.e20NJ5kD0wqGO3):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int KUYypEB4eNWOZWVDpH(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return pCrI77IVeIpJnmCUHd(e20nj5kd0wqgo3);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void KYZ9RyuOc42A2J() {
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = this.TqcnImqkSWIKht;
        dxzw8zznrxsriyjeidzc.ZfQNn8hdWlEQ5cR94249PDsLR();
        ((SparseIntArray) dxzw8zznrxsriyjeidzc.ZfQNn8hdWlEQ5cR94249PDsLR).clear();
    }

    public final void OxdJNRtqsENcg8WhSc(int i) {
        int i2;
        int[] iArr = this.HVEwbdULInpTNa0IG;
        int i3 = this.O1xDAlBZZlZdoEf747lCFHld;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.HVEwbdULInpTNa0IG = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void PfK8qHOJoCLG(e20NJ5kD0wqGO3 e20nj5kd0wqgo3, FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od, MSl7hPM6XqjxyBV5m mSl7hPM6XqjxyBV5m) {
        int i;
        int i2 = this.O1xDAlBZZlZdoEf747lCFHld;
        for (int i3 = 0; i3 < this.O1xDAlBZZlZdoEf747lCFHld && (i = ffCnaJyIb56cn2PIiajnq4CSS9Od.ZfQNn8hdWlEQ5cR94249PDsLR) >= 0 && i < e20nj5kd0wqgo3.zzpBGItXfub0yWj() && i2 > 0; i3++) {
            mSl7hPM6XqjxyBV5m.VxUQ9tBhpHJ2AAEDNW8sghc4m(ffCnaJyIb56cn2PIiajnq4CSS9Od.ZfQNn8hdWlEQ5cR94249PDsLR, Math.max(0, ffCnaJyIb56cn2PIiajnq4CSS9Od.ZLZeBXTMq0zDztBxtRTuCHrapQ));
            this.TqcnImqkSWIKht.getClass();
            i2--;
            ffCnaJyIb56cn2PIiajnq4CSS9Od.ZfQNn8hdWlEQ5cR94249PDsLR += ffCnaJyIb56cn2PIiajnq4CSS9Od.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void PkbafUbW251pQJS6IcsKsWZll(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.PkbafUbW251pQJS6IcsKsWZll(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void RthAxhvqlGkoa(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, o2KpvwGQ24 o2kpvwgq24, int i) {
        ZUovbVjaFkLD3oh7czFRa();
        if (e20nj5kd0wqgo3.zzpBGItXfub0yWj() > 0 && !e20nj5kd0wqgo3.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            boolean z = i == 1;
            int iOGNIDtzM42Ses = oGNIDtzM42Ses(o2kpvwgq24.zzpBGItXfub0yWj, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
            if (z) {
                while (iOGNIDtzM42Ses > 0) {
                    int i2 = o2kpvwgq24.zzpBGItXfub0yWj;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    o2kpvwgq24.zzpBGItXfub0yWj = i3;
                    iOGNIDtzM42Ses = oGNIDtzM42Ses(i3, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
                }
            } else {
                int iZzpBGItXfub0yWj = e20nj5kd0wqgo3.zzpBGItXfub0yWj() - 1;
                int i4 = o2kpvwgq24.zzpBGItXfub0yWj;
                while (i4 < iZzpBGItXfub0yWj) {
                    int i5 = i4 + 1;
                    int iOGNIDtzM42Ses2 = oGNIDtzM42Ses(i5, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
                    if (iOGNIDtzM42Ses2 <= iOGNIDtzM42Ses) {
                        break;
                    }
                    i4 = i5;
                    iOGNIDtzM42Ses = iOGNIDtzM42Ses2;
                }
                o2kpvwgq24.zzpBGItXfub0yWj = i4;
            }
        }
        JHpnvxShf67x5mXGY();
    }

    public final void VTxNrDngIaBBCQr24UPH(int i) {
        if (i == this.O1xDAlBZZlZdoEf747lCFHld) {
            return;
        }
        this.vE4yDIjexsP2lGjLaTcB = true;
        if (i < 1) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Span count should be at least 1. Provided ", i));
        }
        this.O1xDAlBZZlZdoEf747lCFHld = i;
        this.TqcnImqkSWIKht.ZfQNn8hdWlEQ5cR94249PDsLR();
        HAPpjhiCsV9ONY23505HCBI9IX();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void Z1FjjMJ0suz8AFI7gsA4GDLMXv(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        super.Z1FjjMJ0suz8AFI7gsA4GDLMXv(e20nj5kd0wqgo3);
        this.vE4yDIjexsP2lGjLaTcB = false;
    }

    public final void ZUovbVjaFkLD3oh7czFRa() {
        int iAXO0LSrt8bKV;
        int iHVEwbdULInpTNa0IG;
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1) {
            iAXO0LSrt8bKV = this.p59rPv72J9 - O1xDAlBZZlZdoEf747lCFHld();
            iHVEwbdULInpTNa0IG = vE4yDIjexsP2lGjLaTcB();
        } else {
            iAXO0LSrt8bKV = this.Ca81ebIan1u - aXO0LSrt8bKV();
            iHVEwbdULInpTNa0IG = HVEwbdULInpTNa0IG();
        }
        OxdJNRtqsENcg8WhSc(iAXO0LSrt8bKV - iHVEwbdULInpTNa0IG);
    }

    public final int a3RyQGaC6bFH38fDaYcZxOmm(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        boolean z = e20nj5kd0wqgo3.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = this.TqcnImqkSWIKht;
        if (!z) {
            dxzw8zznrxsriyjeidzc.getClass();
            return 1;
        }
        int i2 = this.qygqjTppWwx992.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (yhxkwue1zri6a9vau8hg9c.zzpBGItXfub0yWj(i) != -1) {
            dxzw8zznrxsriyjeidzc.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int e1gEV3X9xwmHj(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        ZUovbVjaFkLD3oh7czFRa();
        JHpnvxShf67x5mXGY();
        return super.e1gEV3X9xwmHj(i, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final YoYMmBKQmkacZj7lMi9c f6ZQsR6bPLvvCDNXOUc(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            GRkmFhQtQOYENB gRkmFhQtQOYENB = new GRkmFhQtQOYENB((ViewGroup.MarginLayoutParams) layoutParams);
            gRkmFhQtQOYENB.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
            gRkmFhQtQOYENB.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
            return gRkmFhQtQOYENB;
        }
        GRkmFhQtQOYENB gRkmFhQtQOYENB2 = new GRkmFhQtQOYENB(layoutParams);
        gRkmFhQtQOYENB2.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        gRkmFhQtQOYENB2.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
        return gRkmFhQtQOYENB2;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int iKANjmyTSxO6v6UuLPdu7DxOjlS(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0) {
            return this.O1xDAlBZZlZdoEf747lCFHld;
        }
        if (e20nj5kd0wqgo3.zzpBGItXfub0yWj() < 1) {
            return 0;
        }
        return tr3o0ArXkdCTs1sysnRuLSgSlJ(e20nj5kd0wqgo3.zzpBGItXfub0yWj() - 1, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3) + 1;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final YoYMmBKQmkacZj7lMi9c jW7EiD0YL6xkbB158jMUzhWNWb1y(Context context, AttributeSet attributeSet) {
        GRkmFhQtQOYENB gRkmFhQtQOYENB = new GRkmFhQtQOYENB(context, attributeSet);
        gRkmFhQtQOYENB.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        gRkmFhQtQOYENB.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
        return gRkmFhQtQOYENB;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final YoYMmBKQmkacZj7lMi9c ko09zE6UAgwkV() {
        return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0 ? new GRkmFhQtQOYENB(-2, -1) : new GRkmFhQtQOYENB(-1, -2);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void lxWWbfAOLs4jWzd7PSIiIJ(Rect rect, int i, int i2) {
        int iZLZeBXTMq0zDztBxtRTuCHrapQ;
        int iZLZeBXTMq0zDztBxtRTuCHrapQ2;
        if (this.HVEwbdULInpTNa0IG == null) {
            super.lxWWbfAOLs4jWzd7PSIiIJ(rect, i, i2);
        }
        int iO1xDAlBZZlZdoEf747lCFHld = O1xDAlBZZlZdoEf747lCFHld() + vE4yDIjexsP2lGjLaTcB();
        int iAXO0LSrt8bKV = aXO0LSrt8bKV() + HVEwbdULInpTNa0IG();
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1) {
            int iHeight = rect.height() + iAXO0LSrt8bKV;
            RecyclerView recyclerView = this.zzpBGItXfub0yWj;
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            iZLZeBXTMq0zDztBxtRTuCHrapQ2 = wbBBe1vAdVO1DmSg1odNaySAYTu.ZLZeBXTMq0zDztBxtRTuCHrapQ(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.HVEwbdULInpTNa0IG;
            iZLZeBXTMq0zDztBxtRTuCHrapQ = wbBBe1vAdVO1DmSg1odNaySAYTu.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, iArr[iArr.length - 1] + iO1xDAlBZZlZdoEf747lCFHld, this.zzpBGItXfub0yWj.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iO1xDAlBZZlZdoEf747lCFHld;
            RecyclerView recyclerView2 = this.zzpBGItXfub0yWj;
            WeakHashMap weakHashMap2 = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            iZLZeBXTMq0zDztBxtRTuCHrapQ = wbBBe1vAdVO1DmSg1odNaySAYTu.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.HVEwbdULInpTNa0IG;
            iZLZeBXTMq0zDztBxtRTuCHrapQ2 = wbBBe1vAdVO1DmSg1odNaySAYTu.ZLZeBXTMq0zDztBxtRTuCHrapQ(i2, iArr2[iArr2.length - 1] + iAXO0LSrt8bKV, this.zzpBGItXfub0yWj.getMinimumHeight());
        }
        this.zzpBGItXfub0yWj.setMeasuredDimension(iZLZeBXTMq0zDztBxtRTuCHrapQ, iZLZeBXTMq0zDztBxtRTuCHrapQ2);
    }

    public final int oGNIDtzM42Ses(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        boolean z = e20nj5kd0wqgo3.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = this.TqcnImqkSWIKht;
        if (!z) {
            int i2 = this.O1xDAlBZZlZdoEf747lCFHld;
            dxzw8zznrxsriyjeidzc.getClass();
            return i % i2;
        }
        int i3 = this.iKANjmyTSxO6v6UuLPdu7DxOjlS.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iZzpBGItXfub0yWj = yhxkwue1zri6a9vau8hg9c.zzpBGItXfub0yWj(i);
        if (iZzpBGItXfub0yWj != -1) {
            int i4 = this.O1xDAlBZZlZdoEf747lCFHld;
            dxzw8zznrxsriyjeidzc.getClass();
            return iZzpBGItXfub0yWj % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int p59rPv72J9(e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        return Hf6zp5JYLjGyFD2HXbpHA9(e20nj5kd0wqgo3);
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final int q11o1hieEkZDhF1MGOZI26oZiDT(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1) {
            return this.O1xDAlBZZlZdoEf747lCFHld;
        }
        if (e20nj5kd0wqgo3.zzpBGItXfub0yWj() < 1) {
            return 0;
        }
        return tr3o0ArXkdCTs1sysnRuLSgSlJ(e20nj5kd0wqgo3.zzpBGItXfub0yWj() - 1, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3) + 1;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void rERAmyEtGV6ANGszuKcQI(int i, int i2) {
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = this.TqcnImqkSWIKht;
        dxzw8zznrxsriyjeidzc.ZfQNn8hdWlEQ5cR94249PDsLR();
        ((SparseIntArray) dxzw8zznrxsriyjeidzc.ZfQNn8hdWlEQ5cR94249PDsLR).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void rutgM2KNeQiFZ9GKSRnhY125(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, FfCnaJyIb56cn2PIiajnq4CSS9Od ffCnaJyIb56cn2PIiajnq4CSS9Od, pfO2OW9zrnO5AJnehaB5D0H3VP pfo2ow9zrno5ajnehab5d0h3vp) {
        int i;
        int i2;
        int i3;
        int iZfQNn8hdWlEQ5cR94249PDsLR;
        int iHVEwbdULInpTNa0IG;
        int iVE4yDIjexsP2lGjLaTcB;
        int iZfQNn8hdWlEQ5cR94249PDsLR2;
        int iIrh5auREsoeV1C1RaBamlmy;
        int iIrh5auREsoeV1C1RaBamlmy2;
        ?? r12;
        int i4;
        View viewZzpBGItXfub0yWj;
        int iM9e7PWhFYLD2lOGMker = this.ko09zE6UAgwkV.M9e7PWhFYLD2lOGMker();
        boolean z = iM9e7PWhFYLD2lOGMker != 1073741824;
        int i5 = TaDO7ogis3aEiWEtq() > 0 ? this.HVEwbdULInpTNa0IG[this.O1xDAlBZZlZdoEf747lCFHld] : 0;
        if (z) {
            ZUovbVjaFkLD3oh7czFRa();
        }
        boolean z2 = ffCnaJyIb56cn2PIiajnq4CSS9Od.LaeGQIruHQu81hfJldjMOQSVblH3x == 1;
        int iOGNIDtzM42Ses = this.O1xDAlBZZlZdoEf747lCFHld;
        if (!z2) {
            iOGNIDtzM42Ses = oGNIDtzM42Ses(ffCnaJyIb56cn2PIiajnq4CSS9Od.ZfQNn8hdWlEQ5cR94249PDsLR, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3) + a3RyQGaC6bFH38fDaYcZxOmm(ffCnaJyIb56cn2PIiajnq4CSS9Od.ZfQNn8hdWlEQ5cR94249PDsLR, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
        }
        int i6 = 0;
        while (i6 < this.O1xDAlBZZlZdoEf747lCFHld && (i4 = ffCnaJyIb56cn2PIiajnq4CSS9Od.ZfQNn8hdWlEQ5cR94249PDsLR) >= 0 && i4 < e20nj5kd0wqgo3.zzpBGItXfub0yWj() && iOGNIDtzM42Ses > 0) {
            int i7 = ffCnaJyIb56cn2PIiajnq4CSS9Od.ZfQNn8hdWlEQ5cR94249PDsLR;
            int iA3RyQGaC6bFH38fDaYcZxOmm = a3RyQGaC6bFH38fDaYcZxOmm(i7, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
            if (iA3RyQGaC6bFH38fDaYcZxOmm > this.O1xDAlBZZlZdoEf747lCFHld) {
                throw new IllegalArgumentException("Item at position " + i7 + " requires " + iA3RyQGaC6bFH38fDaYcZxOmm + " spans but GridLayoutManager has only " + this.O1xDAlBZZlZdoEf747lCFHld + " spans.");
            }
            iOGNIDtzM42Ses -= iA3RyQGaC6bFH38fDaYcZxOmm;
            if (iOGNIDtzM42Ses < 0 || (viewZzpBGItXfub0yWj = ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj(yhxkwue1zri6a9vau8hg9c)) == null) {
                break;
            }
            this.y1NaPKTl7R18DOr6e8i5[i6] = viewZzpBGItXfub0yWj;
            i6++;
        }
        if (i6 == 0) {
            pfo2ow9zrno5ajnehab5d0h3vp.zzpBGItXfub0yWj = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.y1NaPKTl7R18DOr6e8i5[i];
            GRkmFhQtQOYENB gRkmFhQtQOYENB = (GRkmFhQtQOYENB) view.getLayoutParams();
            int iA3RyQGaC6bFH38fDaYcZxOmm2 = a3RyQGaC6bFH38fDaYcZxOmm(wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(view), yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
            gRkmFhQtQOYENB.zIvmSL0wzmmKGc3X39b2Gw2mUGE = iA3RyQGaC6bFH38fDaYcZxOmm2;
            gRkmFhQtQOYENB.LaeGQIruHQu81hfJldjMOQSVblH3x = i8;
            i8 += iA3RyQGaC6bFH38fDaYcZxOmm2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.y1NaPKTl7R18DOr6e8i5[i10];
            if (ffCnaJyIb56cn2PIiajnq4CSS9Od.HzCpKshMOoaw76hFcbOVRYMeRd != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    zzpBGItXfub0yWj(view2, -1, true);
                } else {
                    zzpBGItXfub0yWj(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                zzpBGItXfub0yWj(view2, -1, false);
            } else {
                r12 = 0;
                zzpBGItXfub0yWj(view2, 0, false);
            }
            RecyclerView recyclerView = this.zzpBGItXfub0yWj;
            Rect rect = this.d9zDyyznnp3oaDT1Ug;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.iKANjmyTSxO6v6UuLPdu7DxOjlS(view2));
            }
            Dzw814uXgtjfmZb(view2, iM9e7PWhFYLD2lOGMker, r12);
            int iV57tEvNfxZVVcOCAOih5PKr = this.ko09zE6UAgwkV.V57tEvNfxZVVcOCAOih5PKr(view2);
            if (iV57tEvNfxZVVcOCAOih5PKr > i9) {
                i9 = iV57tEvNfxZVVcOCAOih5PKr;
            }
            float fZfQNn8hdWlEQ5cR94249PDsLR = (this.ko09zE6UAgwkV.ZfQNn8hdWlEQ5cR94249PDsLR(view2) * 1.0f) / ((GRkmFhQtQOYENB) view2.getLayoutParams()).zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (fZfQNn8hdWlEQ5cR94249PDsLR > f) {
                f = fZfQNn8hdWlEQ5cR94249PDsLR;
            }
        }
        if (z) {
            OxdJNRtqsENcg8WhSc(Math.max(Math.round(f * this.O1xDAlBZZlZdoEf747lCFHld), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.y1NaPKTl7R18DOr6e8i5[i11];
                Dzw814uXgtjfmZb(view3, 1073741824, true);
                int iV57tEvNfxZVVcOCAOih5PKr2 = this.ko09zE6UAgwkV.V57tEvNfxZVVcOCAOih5PKr(view3);
                if (iV57tEvNfxZVVcOCAOih5PKr2 > i9) {
                    i9 = iV57tEvNfxZVVcOCAOih5PKr2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.y1NaPKTl7R18DOr6e8i5[i12];
            if (this.ko09zE6UAgwkV.V57tEvNfxZVVcOCAOih5PKr(view4) != i9) {
                GRkmFhQtQOYENB gRkmFhQtQOYENB2 = (GRkmFhQtQOYENB) view4.getLayoutParams();
                Rect rect2 = gRkmFhQtQOYENB2.zzpBGItXfub0yWj;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB2).topMargin + ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB2).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB2).leftMargin + ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB2).rightMargin;
                int iCuR7CK4ylj0mrRyDudYHtj1Ran = CuR7CK4ylj0mrRyDudYHtj1Ran(gRkmFhQtQOYENB2.LaeGQIruHQu81hfJldjMOQSVblH3x, gRkmFhQtQOYENB2.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1) {
                    iIrh5auREsoeV1C1RaBamlmy2 = wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(false, iCuR7CK4ylj0mrRyDudYHtj1Ran, 1073741824, i14, ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB2).width);
                    iIrh5auREsoeV1C1RaBamlmy = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iIrh5auREsoeV1C1RaBamlmy = wbBBe1vAdVO1DmSg1odNaySAYTu.Irh5auREsoeV1C1RaBamlmy(false, iCuR7CK4ylj0mrRyDudYHtj1Ran, 1073741824, i13, ((ViewGroup.MarginLayoutParams) gRkmFhQtQOYENB2).height);
                    iIrh5auREsoeV1C1RaBamlmy2 = iMakeMeasureSpec;
                }
                if (Pf1HsU8AK92buCoUaexm5AC(view4, iIrh5auREsoeV1C1RaBamlmy2, iIrh5auREsoeV1C1RaBamlmy, (YoYMmBKQmkacZj7lMi9c) view4.getLayoutParams())) {
                    view4.measure(iIrh5auREsoeV1C1RaBamlmy2, iIrh5auREsoeV1C1RaBamlmy);
                }
            }
        }
        pfo2ow9zrno5ajnehab5d0h3vp.VxUQ9tBhpHJ2AAEDNW8sghc4m = i9;
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv != 1) {
            if (ffCnaJyIb56cn2PIiajnq4CSS9Od.zIvmSL0wzmmKGc3X39b2Gw2mUGE == -1) {
                int i15 = ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj;
                iVE4yDIjexsP2lGjLaTcB = i15 - i9;
                iHVEwbdULInpTNa0IG = 0;
                iZfQNn8hdWlEQ5cR94249PDsLR = i15;
            } else {
                int i16 = ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj;
                iZfQNn8hdWlEQ5cR94249PDsLR = i16 + i9;
                iHVEwbdULInpTNa0IG = 0;
                iVE4yDIjexsP2lGjLaTcB = i16;
            }
            iZfQNn8hdWlEQ5cR94249PDsLR2 = iHVEwbdULInpTNa0IG;
        } else if (ffCnaJyIb56cn2PIiajnq4CSS9Od.zIvmSL0wzmmKGc3X39b2Gw2mUGE == -1) {
            iZfQNn8hdWlEQ5cR94249PDsLR2 = ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj;
            iHVEwbdULInpTNa0IG = iZfQNn8hdWlEQ5cR94249PDsLR2 - i9;
            iVE4yDIjexsP2lGjLaTcB = 0;
            iZfQNn8hdWlEQ5cR94249PDsLR = 0;
        } else {
            int i17 = ffCnaJyIb56cn2PIiajnq4CSS9Od.zzpBGItXfub0yWj;
            iZfQNn8hdWlEQ5cR94249PDsLR = 0;
            iHVEwbdULInpTNa0IG = i17;
            iZfQNn8hdWlEQ5cR94249PDsLR2 = i17 + i9;
            iVE4yDIjexsP2lGjLaTcB = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.y1NaPKTl7R18DOr6e8i5[i18];
            GRkmFhQtQOYENB gRkmFhQtQOYENB3 = (GRkmFhQtQOYENB) view5.getLayoutParams();
            if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv != 1) {
                iHVEwbdULInpTNa0IG = HVEwbdULInpTNa0IG() + this.HVEwbdULInpTNa0IG[gRkmFhQtQOYENB3.LaeGQIruHQu81hfJldjMOQSVblH3x];
                iZfQNn8hdWlEQ5cR94249PDsLR2 = this.ko09zE6UAgwkV.ZfQNn8hdWlEQ5cR94249PDsLR(view5) + iHVEwbdULInpTNa0IG;
            } else if (xPE15iVa67UqDZHqi()) {
                int iVE4yDIjexsP2lGjLaTcB2 = vE4yDIjexsP2lGjLaTcB() + this.HVEwbdULInpTNa0IG[this.O1xDAlBZZlZdoEf747lCFHld - gRkmFhQtQOYENB3.LaeGQIruHQu81hfJldjMOQSVblH3x];
                iZfQNn8hdWlEQ5cR94249PDsLR = iVE4yDIjexsP2lGjLaTcB2;
                iVE4yDIjexsP2lGjLaTcB = iVE4yDIjexsP2lGjLaTcB2 - this.ko09zE6UAgwkV.ZfQNn8hdWlEQ5cR94249PDsLR(view5);
            } else {
                iVE4yDIjexsP2lGjLaTcB = vE4yDIjexsP2lGjLaTcB() + this.HVEwbdULInpTNa0IG[gRkmFhQtQOYENB3.LaeGQIruHQu81hfJldjMOQSVblH3x];
                iZfQNn8hdWlEQ5cR94249PDsLR = this.ko09zE6UAgwkV.ZfQNn8hdWlEQ5cR94249PDsLR(view5) + iVE4yDIjexsP2lGjLaTcB;
            }
            wbBBe1vAdVO1DmSg1odNaySAYTu.ymT6yQrus3w(view5, iVE4yDIjexsP2lGjLaTcB, iHVEwbdULInpTNa0IG, iZfQNn8hdWlEQ5cR94249PDsLR, iZfQNn8hdWlEQ5cR94249PDsLR2);
            if (gRkmFhQtQOYENB3.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP() || gRkmFhQtQOYENB3.VxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd()) {
                pfo2ow9zrno5ajnehab5d0h3vp.V57tEvNfxZVVcOCAOih5PKr = true;
            }
            pfo2ow9zrno5ajnehab5d0h3vp.ZfQNn8hdWlEQ5cR94249PDsLR = view5.hasFocusable() | pfo2ow9zrno5ajnehab5d0h3vp.ZfQNn8hdWlEQ5cR94249PDsLR;
        }
        Arrays.fill(this.y1NaPKTl7R18DOr6e8i5, (Object) null);
    }

    public final int tr3o0ArXkdCTs1sysnRuLSgSlJ(int i, yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3) {
        boolean z = e20nj5kd0wqgo3.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = this.TqcnImqkSWIKht;
        if (!z) {
            int i2 = this.O1xDAlBZZlZdoEf747lCFHld;
            dxzw8zznrxsriyjeidzc.getClass();
            return dXZw8zZnRXsRIYJEIdZC.V57tEvNfxZVVcOCAOih5PKr(i, i2);
        }
        int iZzpBGItXfub0yWj = yhxkwue1zri6a9vau8hg9c.zzpBGItXfub0yWj(i);
        if (iZzpBGItXfub0yWj != -1) {
            int i3 = this.O1xDAlBZZlZdoEf747lCFHld;
            dxzw8zznrxsriyjeidzc.getClass();
            return dXZw8zZnRXsRIYJEIdZC.V57tEvNfxZVVcOCAOih5PKr(iZzpBGItXfub0yWj, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void vXWl0o6I4U59CgHs9(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, View view, wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq) {
        AccessibilityNodeInfo accessibilityNodeInfo = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof GRkmFhQtQOYENB)) {
            hKs1wlZyvtUNaW1f5ABIGacfPcvX(view, wzeak8zkpnwhd4rkpyq);
            return;
        }
        GRkmFhQtQOYENB gRkmFhQtQOYENB = (GRkmFhQtQOYENB) layoutParams;
        int iTr3o0ArXkdCTs1sysnRuLSgSlJ = tr3o0ArXkdCTs1sysnRuLSgSlJ(gRkmFhQtQOYENB.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj(), yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3);
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(gRkmFhQtQOYENB.LaeGQIruHQu81hfJldjMOQSVblH3x, gRkmFhQtQOYENB.zIvmSL0wzmmKGc3X39b2Gw2mUGE, iTr3o0ArXkdCTs1sysnRuLSgSlJ, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iTr3o0ArXkdCTs1sysnRuLSgSlJ, 1, gRkmFhQtQOYENB.LaeGQIruHQu81hfJldjMOQSVblH3x, gRkmFhQtQOYENB.zIvmSL0wzmmKGc3X39b2Gw2mUGE, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View w45GC0xYcf4u8gmC(yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c, e20NJ5kD0wqGO3 e20nj5kd0wqgo3, boolean z, boolean z2) {
        int i;
        int iTaDO7ogis3aEiWEtq;
        int iTaDO7ogis3aEiWEtq2 = TaDO7ogis3aEiWEtq();
        int i2 = 1;
        if (z2) {
            iTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iTaDO7ogis3aEiWEtq2;
            iTaDO7ogis3aEiWEtq = 0;
        }
        int iZzpBGItXfub0yWj = e20nj5kd0wqgo3.zzpBGItXfub0yWj();
        QwZcr6V7mfRUaij0Bp3zpr5ClBcxr();
        int iHzCpKshMOoaw76hFcbOVRYMeRd = this.ko09zE6UAgwkV.HzCpKshMOoaw76hFcbOVRYMeRd();
        int iZLZeBXTMq0zDztBxtRTuCHrapQ = this.ko09zE6UAgwkV.ZLZeBXTMq0zDztBxtRTuCHrapQ();
        View view = null;
        View view2 = null;
        while (iTaDO7ogis3aEiWEtq != i) {
            View viewVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7(iTaDO7ogis3aEiWEtq);
            int iY1NaPKTl7R18DOr6e8i5 = wbBBe1vAdVO1DmSg1odNaySAYTu.y1NaPKTl7R18DOr6e8i5(viewVBGA6pPLqSMuYGvprl270j7);
            if (iY1NaPKTl7R18DOr6e8i5 >= 0 && iY1NaPKTl7R18DOr6e8i5 < iZzpBGItXfub0yWj && oGNIDtzM42Ses(iY1NaPKTl7R18DOr6e8i5, yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3) == 0) {
                if (((YoYMmBKQmkacZj7lMi9c) viewVBGA6pPLqSMuYGvprl270j7.getLayoutParams()).VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP()) {
                    if (view2 == null) {
                        view2 = viewVBGA6pPLqSMuYGvprl270j7;
                    }
                } else {
                    if (this.ko09zE6UAgwkV.LaeGQIruHQu81hfJldjMOQSVblH3x(viewVBGA6pPLqSMuYGvprl270j7) < iZLZeBXTMq0zDztBxtRTuCHrapQ && this.ko09zE6UAgwkV.zzpBGItXfub0yWj(viewVBGA6pPLqSMuYGvprl270j7) >= iHzCpKshMOoaw76hFcbOVRYMeRd) {
                        return viewVBGA6pPLqSMuYGvprl270j7;
                    }
                    if (view == null) {
                        view = viewVBGA6pPLqSMuYGvprl270j7;
                    }
                }
            }
            iTaDO7ogis3aEiWEtq += i2;
        }
        return view != null ? view : view2;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void wdI7vzA3Qmcwd(int i, int i2) {
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = this.TqcnImqkSWIKht;
        dxzw8zznrxsriyjeidzc.ZfQNn8hdWlEQ5cR94249PDsLR();
        ((SparseIntArray) dxzw8zznrxsriyjeidzc.ZfQNn8hdWlEQ5cR94249PDsLR).clear();
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(YoYMmBKQmkacZj7lMi9c yoYMmBKQmkacZj7lMi9c) {
        return yoYMmBKQmkacZj7lMi9c instanceof GRkmFhQtQOYENB;
    }

    @Override // com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void zOk739gUM7zIZC25HHUxoiyixWFjn(int i, int i2) {
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = this.TqcnImqkSWIKht;
        dxzw8zznrxsriyjeidzc.ZfQNn8hdWlEQ5cR94249PDsLR();
        ((SparseIntArray) dxzw8zznrxsriyjeidzc.ZfQNn8hdWlEQ5cR94249PDsLR).clear();
    }

    public GridLayoutManager(int i) {
        super(1);
        this.vE4yDIjexsP2lGjLaTcB = false;
        this.O1xDAlBZZlZdoEf747lCFHld = -1;
        this.qygqjTppWwx992 = new SparseIntArray();
        this.iKANjmyTSxO6v6UuLPdu7DxOjlS = new SparseIntArray();
        this.TqcnImqkSWIKht = new dXZw8zZnRXsRIYJEIdZC();
        this.d9zDyyznnp3oaDT1Ug = new Rect();
        VTxNrDngIaBBCQr24UPH(i);
    }
}
