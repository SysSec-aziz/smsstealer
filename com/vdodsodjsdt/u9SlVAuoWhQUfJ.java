package com.vdodsodjsdt;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class u9SlVAuoWhQUfJ {
    public static final /* synthetic */ int[] VxUQ9tBhpHJ2AAEDNW8sghc4m = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static /* synthetic */ String Ca81ebIan1u(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return "LEFT";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return "TOP";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return "RIGHT";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                return "BOTTOM";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                return "BASELINE";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                return "CENTER";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static String GI83zq0G8e7zkn(String str, String str2) {
        return str + str2;
    }

    public static String HzCpKshMOoaw76hFcbOVRYMeRd(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder KUYypEB4eNWOZWVDpH(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static int LaeGQIruHQu81hfJldjMOQSVblH3x(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static String M9e7PWhFYLD2lOGMker(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String NSjgqmGjEzuugn2SsG1mZFP(String str, int i) {
        return str + i;
    }

    public static int V57tEvNfxZVVcOCAOih5PKr(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return zzpBGItXfub0yWj(view.getVisibility());
    }

    public static final void VxUQ9tBhpHJ2AAEDNW8sghc4m(View view, int i) {
        int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i);
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1) {
            if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 2) {
            if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 3) {
            return;
        }
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static String ZLZeBXTMq0zDztBxtRTuCHrapQ(int i, String str, String str2) {
        return str + i + str2;
    }

    public static final boolean ZfQNn8hdWlEQ5cR94249PDsLR(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static /* synthetic */ String f6ZQsR6bPLvvCDNXOUc(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ int h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String jW7EiD0YL6xkbB158jMUzhWNWb1y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String ko09zE6UAgwkV(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return "CONNECTED";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return "UNMETERED";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return "NOT_ROAMING";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                return "METERED";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ void p59rPv72J9(String str, int i) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(ej6unYlOWMDF.TaDO7ogis3aEiWEtq(str));
        ej6unYlOWMDF.zOk739gUM7zIZC25HHUxoiyixWFjn(nullPointerException, ej6unYlOWMDF.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ String pYmKDYlAmhudp(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return "END_ARRAY";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return "BEGIN_OBJECT";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return "END_OBJECT";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                return "NAME";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                return "STRING";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NUMBER";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ void q1wNbhk2O6(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String vBGA6pPLqSMuYGvprl270j7(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return "RUNNING";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return "SUCCEEDED";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return "FAILED";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                return "BLOCKED";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static String zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static int zzpBGItXfub0yWj(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 8) {
            return 3;
        }
        throw new IllegalArgumentException(NSjgqmGjEzuugn2SsG1mZFP("Unknown visibility ", i));
    }
}
