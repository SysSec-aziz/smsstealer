package com.vdodsodjsdt;

import android.database.Cursor;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Choreographer;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class o6OxmOsCD9HJ6LF8UTncnTX9Cf21 implements eVkjm1F3XGhL0WhyMyqjLr {
    public Object V57tEvNfxZVVcOCAOih5PKr;
    public Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ o6OxmOsCD9HJ6LF8UTncnTX9Cf21(Object obj, Object obj2) {
        this.V57tEvNfxZVVcOCAOih5PKr = obj;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj2;
    }

    public void GI83zq0G8e7zkn(CfP1VFxsaWESDSF2SWQq cfP1VFxsaWESDSF2SWQq) {
        LNbLc7UMz3g5KbIBk lNbLc7UMz3g5KbIBk = (LNbLc7UMz3g5KbIBk) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja = (qF22Y620JkFyombtDYw0h0h8Rxpja) this.V57tEvNfxZVVcOCAOih5PKr;
        int i = cfP1VFxsaWESDSF2SWQq.zzpBGItXfub0yWj;
        if (i == 0) {
            lNbLc7UMz3g5KbIBk.execute(new gZVesoHrfMaGvAvfBsRIr(qf22y620jkfyombtdyw0h0h8rxpja, cfP1VFxsaWESDSF2SWQq.VxUQ9tBhpHJ2AAEDNW8sghc4m, 4, false));
        } else {
            lNbLc7UMz3g5KbIBk.execute(new WRVe1iRhTJq3tx(qf22y620jkfyombtdyw0h0h8rxpja, i, 0));
        }
    }

    public void HzCpKshMOoaw76hFcbOVRYMeRd(WFEUpQgjHl wFEUpQgjHl) {
        xnjnd5YIMmACJ xnjnd5yimmacj = (xnjnd5YIMmACJ) ((sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.V57tEvNfxZVVcOCAOih5PKr).get(wFEUpQgjHl);
        if (xnjnd5yimmacj == null) {
            return;
        }
        xnjnd5yimmacj.VxUQ9tBhpHJ2AAEDNW8sghc4m &= -2;
    }

    public void KUYypEB4eNWOZWVDpH(WFEUpQgjHl wFEUpQgjHl) {
        kxD7lnfhVByiEwFdNtrRslxulbe kxd7lnfhvbyiewfdntrrslxulbe = (kxD7lnfhVByiEwFdNtrRslxulbe) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int iLaeGQIruHQu81hfJldjMOQSVblH3x = kxd7lnfhvbyiewfdntrrslxulbe.LaeGQIruHQu81hfJldjMOQSVblH3x() - 1;
        while (true) {
            if (iLaeGQIruHQu81hfJldjMOQSVblH3x < 0) {
                break;
            }
            if (wFEUpQgjHl == kxd7lnfhvbyiewfdntrrslxulbe.zIvmSL0wzmmKGc3X39b2Gw2mUGE(iLaeGQIruHQu81hfJldjMOQSVblH3x)) {
                Object[] objArr = kxd7lnfhvbyiewfdntrrslxulbe.LaeGQIruHQu81hfJldjMOQSVblH3x;
                Object obj = objArr[iLaeGQIruHQu81hfJldjMOQSVblH3x];
                Object obj2 = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.V57tEvNfxZVVcOCAOih5PKr;
                if (obj != obj2) {
                    objArr[iLaeGQIruHQu81hfJldjMOQSVblH3x] = obj2;
                    kxd7lnfhvbyiewfdntrrslxulbe.V57tEvNfxZVVcOCAOih5PKr = true;
                }
            } else {
                iLaeGQIruHQu81hfJldjMOQSVblH3x--;
            }
        }
        xnjnd5YIMmACJ xnjnd5yimmacj = (xnjnd5YIMmACJ) ((sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.V57tEvNfxZVVcOCAOih5PKr).remove(wFEUpQgjHl);
        if (xnjnd5yimmacj != null) {
            xnjnd5yimmacj.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
            xnjnd5yimmacj.zzpBGItXfub0yWj = null;
            xnjnd5yimmacj.V57tEvNfxZVVcOCAOih5PKr = null;
            xnjnd5YIMmACJ.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr(xnjnd5yimmacj);
        }
    }

    public void LaeGQIruHQu81hfJldjMOQSVblH3x(int i) {
        int[] iArr = (int[]) this.V57tEvNfxZVVcOCAOih5PKr;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.V57tEvNfxZVVcOCAOih5PKr = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.V57tEvNfxZVVcOCAOih5PKr = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.V57tEvNfxZVVcOCAOih5PKr;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public mYybSD3X3KfsAbnorz7K M9e7PWhFYLD2lOGMker(WFEUpQgjHl wFEUpQgjHl, int i) {
        xnjnd5YIMmACJ xnjnd5yimmacj;
        mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k;
        sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = (sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.V57tEvNfxZVVcOCAOih5PKr;
        int iZfQNn8hdWlEQ5cR94249PDsLR = sstjsle9ugp7ixfnwi18akn1jt.ZfQNn8hdWlEQ5cR94249PDsLR(wFEUpQgjHl);
        if (iZfQNn8hdWlEQ5cR94249PDsLR >= 0 && (xnjnd5yimmacj = (xnjnd5YIMmACJ) sstjsle9ugp7ixfnwi18akn1jt.GI83zq0G8e7zkn(iZfQNn8hdWlEQ5cR94249PDsLR)) != null) {
            int i2 = xnjnd5yimmacj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                xnjnd5yimmacj.VxUQ9tBhpHJ2AAEDNW8sghc4m = i3;
                if (i == 4) {
                    myybsd3x3kfsabnorz7k = xnjnd5yimmacj.zzpBGItXfub0yWj;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    myybsd3x3kfsabnorz7k = xnjnd5yimmacj.V57tEvNfxZVVcOCAOih5PKr;
                }
                if ((i3 & 12) == 0) {
                    sstjsle9ugp7ixfnwi18akn1jt.ZLZeBXTMq0zDztBxtRTuCHrapQ(iZfQNn8hdWlEQ5cR94249PDsLR);
                    xnjnd5yimmacj.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
                    xnjnd5yimmacj.zzpBGItXfub0yWj = null;
                    xnjnd5yimmacj.V57tEvNfxZVVcOCAOih5PKr = null;
                    xnjnd5YIMmACJ.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr(xnjnd5yimmacj);
                }
                return myybsd3x3kfsabnorz7k;
            }
        }
        return null;
    }

    public void NSjgqmGjEzuugn2SsG1mZFP(int i, int i2) {
        int[] iArr = (int[]) this.V57tEvNfxZVVcOCAOih5PKr;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        LaeGQIruHQu81hfJldjMOQSVblH3x(i3);
        int[] iArr2 = (int[]) this.V57tEvNfxZVVcOCAOih5PKr;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.V57tEvNfxZVVcOCAOih5PKr;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            QFMjeZ4cxQ3YufrAYm9ASX0UYkVmV qFMjeZ4cxQ3YufrAYm9ASX0UYkVmV = (QFMjeZ4cxQ3YufrAYm9ASX0UYkVmV) ((ArrayList) this.ZfQNn8hdWlEQ5cR94249PDsLR).get(size);
            int i4 = qFMjeZ4cxQ3YufrAYm9ASX0UYkVmV.V57tEvNfxZVVcOCAOih5PKr;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.ZfQNn8hdWlEQ5cR94249PDsLR).remove(size);
                } else {
                    qFMjeZ4cxQ3YufrAYm9ASX0UYkVmV.V57tEvNfxZVVcOCAOih5PKr = i4 - i2;
                }
            }
        }
    }

    public void V57tEvNfxZVVcOCAOih5PKr(WFEUpQgjHl wFEUpQgjHl, mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k) {
        sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = (sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.V57tEvNfxZVVcOCAOih5PKr;
        xnjnd5YIMmACJ xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m = (xnjnd5YIMmACJ) sstjsle9ugp7ixfnwi18akn1jt.get(wFEUpQgjHl);
        if (xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m = xnjnd5YIMmACJ.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            sstjsle9ugp7ixfnwi18akn1jt.put(wFEUpQgjHl, xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr = myybsd3x3kfsabnorz7k;
        xnjnd5yimmacjVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m |= 8;
    }

    @Override // com.vdodsodjsdt.eVkjm1F3XGhL0WhyMyqjLr
    public Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return (yMFckQTRpotYEhJHMRSnIca2Dszg3) this.V57tEvNfxZVVcOCAOih5PKr;
    }

    public void ZLZeBXTMq0zDztBxtRTuCHrapQ(int i, int i2) {
        int[] iArr = (int[]) this.V57tEvNfxZVVcOCAOih5PKr;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        LaeGQIruHQu81hfJldjMOQSVblH3x(i3);
        int[] iArr2 = (int[]) this.V57tEvNfxZVVcOCAOih5PKr;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.V57tEvNfxZVVcOCAOih5PKr, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            QFMjeZ4cxQ3YufrAYm9ASX0UYkVmV qFMjeZ4cxQ3YufrAYm9ASX0UYkVmV = (QFMjeZ4cxQ3YufrAYm9ASX0UYkVmV) ((ArrayList) this.ZfQNn8hdWlEQ5cR94249PDsLR).get(size);
            int i4 = qFMjeZ4cxQ3YufrAYm9ASX0UYkVmV.V57tEvNfxZVVcOCAOih5PKr;
            if (i4 >= i) {
                qFMjeZ4cxQ3YufrAYm9ASX0UYkVmV.V57tEvNfxZVVcOCAOih5PKr = i4 + i2;
            }
        }
    }

    public void ZfQNn8hdWlEQ5cR94249PDsLR() {
        int[] iArr = (int[]) this.V57tEvNfxZVVcOCAOih5PKr;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = null;
    }

    public void q1wNbhk2O6(ztNFMw5IuWLfuP ztnfmw5iuwlfup, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(ztnfmw5iuwlfup, "workSpecId");
        ((nMRZPpfLCgJyuB) this.ZfQNn8hdWlEQ5cR94249PDsLR).ZfQNn8hdWlEQ5cR94249PDsLR(new Y64anY0MWbS((IVPB9DLMIoeA0Qp8AgwLlJ) this.V57tEvNfxZVVcOCAOih5PKr, ztnfmw5iuwlfup, false, i));
    }

    public ArrayList zIvmSL0wzmmKGc3X39b2Gw2mUGE(String str) {
        xgjEDGKy9VX5 xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m = xgjEDGKy9VX5.VxUQ9tBhpHJ2AAEDNW8sghc4m("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m.f6ZQsR6bPLvvCDNXOUc(str, 1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.V57tEvNfxZVVcOCAOih5PKr;
        workDatabase_Impl.zzpBGItXfub0yWj();
        Cursor cursorQ1wNbhk2O6 = workDatabase_Impl.q1wNbhk2O6(xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m);
        try {
            ArrayList arrayList = new ArrayList(cursorQ1wNbhk2O6.getCount());
            while (cursorQ1wNbhk2O6.moveToNext()) {
                arrayList.add(cursorQ1wNbhk2O6.getString(0));
            }
            return arrayList;
        } finally {
            cursorQ1wNbhk2O6.close();
            xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker();
        }
    }

    @Override // com.vdodsodjsdt.eVkjm1F3XGhL0WhyMyqjLr
    public boolean zzpBGItXfub0yWj(CharSequence charSequence, int i, int i2, oSxBDDVoR8J7pe6iX1zsMApcaW osxbddvor8j7pe6ix1zsmapcaw) {
        if ((osxbddvor8j7pe6ix1zsmapcaw.V57tEvNfxZVVcOCAOih5PKr & 4) > 0) {
            return true;
        }
        if (((yMFckQTRpotYEhJHMRSnIca2Dszg3) this.V57tEvNfxZVVcOCAOih5PKr) == null) {
            this.V57tEvNfxZVVcOCAOih5PKr = new yMFckQTRpotYEhJHMRSnIca2Dszg3(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((FG8LIxsgYiLSfhN0jYKIKr) this.ZfQNn8hdWlEQ5cR94249PDsLR).getClass();
        ((yMFckQTRpotYEhJHMRSnIca2Dszg3) this.V57tEvNfxZVVcOCAOih5PKr).setSpan(new snK44eFCqPRHn60dk2IksCvvCD(osxbddvor8j7pe6ix1zsmapcaw), i, i2, 33);
        return true;
    }

    public o6OxmOsCD9HJ6LF8UTncnTX9Cf21(IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ, nMRZPpfLCgJyuB nmrzppflcgjyub) {
        ej6unYlOWMDF.pYmKDYlAmhudp(iVPB9DLMIoeA0Qp8AgwLlJ, "processor");
        ej6unYlOWMDF.pYmKDYlAmhudp(nmrzppflcgjyub, "workTaskExecutor");
        this.V57tEvNfxZVVcOCAOih5PKr = iVPB9DLMIoeA0Qp8AgwLlJ;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = nmrzppflcgjyub;
    }

    public o6OxmOsCD9HJ6LF8UTncnTX9Cf21(String[] strArr, AQYAU4MRDJq aQYAU4MRDJq) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = aQYAU4MRDJq;
        ej6unYlOWMDF.pYmKDYlAmhudp(strArr, "tables");
        this.V57tEvNfxZVVcOCAOih5PKr = strArr;
    }

    public o6OxmOsCD9HJ6LF8UTncnTX9Cf21(int i) {
        switch (i) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                this.V57tEvNfxZVVcOCAOih5PKr = new sSTjsLE9Ugp7iXfnwi18Akn1Jt(0);
                this.ZfQNn8hdWlEQ5cR94249PDsLR = new kxD7lnfhVByiEwFdNtrRslxulbe();
                break;
            default:
                this.V57tEvNfxZVVcOCAOih5PKr = Choreographer.getInstance();
                this.ZfQNn8hdWlEQ5cR94249PDsLR = Looper.myLooper();
                break;
        }
    }
}
