package com.vdodsodjsdt;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class DerC1yFc8TaMSlgxC6TqZtz9 implements zKpcfAuPsYfOGklRjQ3A {
    public boolean Ca81ebIan1u;
    public int GI83zq0G8e7zkn;
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public CharSequence KUYypEB4eNWOZWVDpH;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public CharSequence M9e7PWhFYLD2lOGMker;
    public String NSjgqmGjEzuugn2SsG1mZFP;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public final ArrayList VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final okcUO69vEcgndIAn0R h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public int ko09zE6UAgwkV;
    public ArrayList p59rPv72J9;
    public boolean pYmKDYlAmhudp;
    public ArrayList q1wNbhk2O6;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj;

    public DerC1yFc8TaMSlgxC6TqZtz9(okcUO69vEcgndIAn0R okcuo69vecgndian0r) {
        okcuo69vecgndian0r.pzqP2AqKW6J5PO8zCKnW();
        Dqd3yw7CrPyec1dms6HVj dqd3yw7CrPyec1dms6HVj = okcuo69vecgndian0r.f6ZQsR6bPLvvCDNXOUc;
        if (dqd3yw7CrPyec1dms6HVj != null) {
            dqd3yw7CrPyec1dms6HVj.q1wNbhk2O6.getClassLoader();
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new ArrayList();
        this.Ca81ebIan1u = false;
        this.ko09zE6UAgwkV = -1;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = okcuo69vecgndian0r;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(int i) {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                QOMlgg2N3CPFvlf qOMlgg2N3CPFvlf = (QOMlgg2N3CPFvlf) arrayList.get(i2);
                dip85SLOWSmNG3 dip85slowsmng3 = qOMlgg2N3CPFvlf.zzpBGItXfub0yWj;
                if (dip85slowsmng3 != null) {
                    dip85slowsmng3.jW7EiD0YL6xkbB158jMUzhWNWb1y += i;
                    if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + qOMlgg2N3CPFvlf.zzpBGItXfub0yWj + " to " + qOMlgg2N3CPFvlf.zzpBGItXfub0yWj.jW7EiD0YL6xkbB158jMUzhWNWb1y);
                    }
                }
            }
        }
    }

    @Override // com.vdodsodjsdt.zKpcfAuPsYfOGklRjQ3A
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(ArrayList arrayList, ArrayList arrayList2) {
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            return true;
        }
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (okcuo69vecgndian0r.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
            okcuo69vecgndian0r.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList();
        }
        okcuo69vecgndian0r.ZfQNn8hdWlEQ5cR94249PDsLR.add(this);
        return true;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.NSjgqmGjEzuugn2SsG1mZFP);
            printWriter.print(" mIndex=");
            printWriter.print(this.ko09zE6UAgwkV);
            printWriter.print(" mCommitted=");
            printWriter.println(this.pYmKDYlAmhudp);
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
            }
            if (this.zzpBGItXfub0yWj != 0 || this.V57tEvNfxZVVcOCAOih5PKr != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.zzpBGItXfub0yWj));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.V57tEvNfxZVVcOCAOih5PKr));
            }
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR != 0 || this.LaeGQIruHQu81hfJldjMOQSVblH3x != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.ZfQNn8hdWlEQ5cR94249PDsLR));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.LaeGQIruHQu81hfJldjMOQSVblH3x));
            }
            if (this.GI83zq0G8e7zkn != 0 || this.M9e7PWhFYLD2lOGMker != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.GI83zq0G8e7zkn));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.M9e7PWhFYLD2lOGMker);
            }
            if (this.HzCpKshMOoaw76hFcbOVRYMeRd != 0 || this.KUYypEB4eNWOZWVDpH != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.HzCpKshMOoaw76hFcbOVRYMeRd));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.KUYypEB4eNWOZWVDpH);
            }
        }
        ArrayList arrayList = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            QOMlgg2N3CPFvlf qOMlgg2N3CPFvlf = (QOMlgg2N3CPFvlf) arrayList.get(i);
            switch (qOMlgg2N3CPFvlf.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                    str2 = "REPLACE";
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                    str2 = "REMOVE";
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                    str2 = "HIDE";
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                    str2 = "SHOW";
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                    str2 = "DETACH";
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + qOMlgg2N3CPFvlf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(qOMlgg2N3CPFvlf.zzpBGItXfub0yWj);
            if (z) {
                if (qOMlgg2N3CPFvlf.ZfQNn8hdWlEQ5cR94249PDsLR != 0 || qOMlgg2N3CPFvlf.LaeGQIruHQu81hfJldjMOQSVblH3x != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(qOMlgg2N3CPFvlf.ZfQNn8hdWlEQ5cR94249PDsLR));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(qOMlgg2N3CPFvlf.LaeGQIruHQu81hfJldjMOQSVblH3x));
                }
                if (qOMlgg2N3CPFvlf.zIvmSL0wzmmKGc3X39b2Gw2mUGE != 0 || qOMlgg2N3CPFvlf.ZLZeBXTMq0zDztBxtRTuCHrapQ != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(qOMlgg2N3CPFvlf.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(qOMlgg2N3CPFvlf.ZLZeBXTMq0zDztBxtRTuCHrapQ));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.ko09zE6UAgwkV >= 0) {
            sb.append(" #");
            sb.append(this.ko09zE6UAgwkV);
        }
        if (this.NSjgqmGjEzuugn2SsG1mZFP != null) {
            sb.append(" ");
            sb.append(this.NSjgqmGjEzuugn2SsG1mZFP);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void zzpBGItXfub0yWj(QOMlgg2N3CPFvlf qOMlgg2N3CPFvlf) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.add(qOMlgg2N3CPFvlf);
        qOMlgg2N3CPFvlf.ZfQNn8hdWlEQ5cR94249PDsLR = this.zzpBGItXfub0yWj;
        qOMlgg2N3CPFvlf.LaeGQIruHQu81hfJldjMOQSVblH3x = this.V57tEvNfxZVVcOCAOih5PKr;
        qOMlgg2N3CPFvlf.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        qOMlgg2N3CPFvlf.ZLZeBXTMq0zDztBxtRTuCHrapQ = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }
}
