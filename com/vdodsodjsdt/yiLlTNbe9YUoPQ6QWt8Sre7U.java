package com.vdodsodjsdt;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yiLlTNbe9YUoPQ6QWt8Sre7U {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        String strZLZeBXTMq0zDztBxtRTuCHrapQ = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("DiagnosticsWrkr");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strZLZeBXTMq0zDztBxtRTuCHrapQ, "tagWithPrefix(\"DiagnosticsWrkr\")");
        VxUQ9tBhpHJ2AAEDNW8sghc4m = strZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m(S28Az6EscEakl8kzvM s28Az6EscEakl8kzvM, o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21, nMRZPpfLCgJyuB nmrzppflcgjyub, ArrayList arrayList) {
        String str;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            vIPEe55rgLxLcs vipee55rglxlcs = (vIPEe55rgLxLcs) obj;
            AhgUxI6t6E ahgUxI6t6EM9e7PWhFYLD2lOGMker = hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(vipee55rglxlcs);
            String str2 = vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            kjqQ3XJs4d kjqq3xjs4dQ1wNbhk2O6 = nmrzppflcgjyub.q1wNbhk2O6(ahgUxI6t6EM9e7PWhFYLD2lOGMker);
            Integer numValueOf = kjqq3xjs4dQ1wNbhk2O6 != null ? Integer.valueOf(kjqq3xjs4dQ1wNbhk2O6.V57tEvNfxZVVcOCAOih5PKr) : null;
            s28Az6EscEakl8kzvM.getClass();
            xgjEDGKy9VX5 xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m = xgjEDGKy9VX5.VxUQ9tBhpHJ2AAEDNW8sghc4m("SELECT name FROM workname WHERE work_spec_id=?", 1);
            xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m.f6ZQsR6bPLvvCDNXOUc(str2, 1);
            WorkDatabase_Impl workDatabase_Impl = s28Az6EscEakl8kzvM.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            workDatabase_Impl.zzpBGItXfub0yWj();
            Cursor cursorQ1wNbhk2O6 = workDatabase_Impl.q1wNbhk2O6(xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m);
            try {
                ArrayList arrayList2 = new ArrayList(cursorQ1wNbhk2O6.getCount());
                while (cursorQ1wNbhk2O6.moveToNext()) {
                    arrayList2.add(cursorQ1wNbhk2O6.getString(0));
                }
                cursorQ1wNbhk2O6.close();
                xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker();
                String strRE05n5RsRkyWKIeA9cmLXAKv4Hze = gYXV3FZbh17i6ocMo1T.rE05n5RsRkyWKIeA9cmLXAKv4Hze(arrayList2, ",", null, null, null, 62);
                String strRE05n5RsRkyWKIeA9cmLXAKv4Hze2 = gYXV3FZbh17i6ocMo1T.rE05n5RsRkyWKIeA9cmLXAKv4Hze(o6oxmoscd9hj6lf8utncntx9cf21.zIvmSL0wzmmKGc3X39b2Gw2mUGE(str2), ",", null, null, null, 62);
                StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("\n", str2, "\t ");
                sbKUYypEB4eNWOZWVDpH.append(vipee55rglxlcs.V57tEvNfxZVVcOCAOih5PKr);
                sbKUYypEB4eNWOZWVDpH.append("\t ");
                sbKUYypEB4eNWOZWVDpH.append(numValueOf);
                sbKUYypEB4eNWOZWVDpH.append("\t ");
                switch (vipee55rglxlcs.zzpBGItXfub0yWj) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                        str = "RUNNING";
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "SUCCEEDED";
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                        str = "FAILED";
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                        str = "BLOCKED";
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                sbKUYypEB4eNWOZWVDpH.append(str);
                sbKUYypEB4eNWOZWVDpH.append("\t ");
                sbKUYypEB4eNWOZWVDpH.append(strRE05n5RsRkyWKIeA9cmLXAKv4Hze);
                sbKUYypEB4eNWOZWVDpH.append("\t ");
                sbKUYypEB4eNWOZWVDpH.append(strRE05n5RsRkyWKIeA9cmLXAKv4Hze2);
                sbKUYypEB4eNWOZWVDpH.append('\t');
                sb.append(sbKUYypEB4eNWOZWVDpH.toString());
            } catch (Throwable th) {
                cursorQ1wNbhk2O6.close();
                xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker();
                throw th;
            }
        }
        String string = sb.toString();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
