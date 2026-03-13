package com.vdodsodjsdt;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class sveu0WcbYc1gIe {
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final String NSjgqmGjEzuugn2SsG1mZFP;
    public final String V57tEvNfxZVVcOCAOih5PKr;
    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final String ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final String ZfQNn8hdWlEQ5cR94249PDsLR;
    public final List zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final String zzpBGItXfub0yWj;

    public sveu0WcbYc1gIe(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = str2;
        this.V57tEvNfxZVVcOCAOih5PKr = str3;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = str4;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = arrayList;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = str5;
        this.NSjgqmGjEzuugn2SsG1mZFP = str6;
    }

    public final String LaeGQIruHQu81hfJldjMOQSVblH3x() {
        if (this.zzpBGItXfub0yWj.length() == 0) {
            return "";
        }
        int length = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.length() + 3;
        String str = this.NSjgqmGjEzuugn2SsG1mZFP;
        String strSubstring = str.substring(length, jHlOQHj3hlCsydfI7r5ApVdQjYvKf.V57tEvNfxZVVcOCAOih5PKr(length, str.length(), str, ":@"));
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final URI NSjgqmGjEzuugn2SsG1mZFP() {
        String strReplaceAll;
        oLPwQu4XgJ olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE = zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        ArrayList arrayList = (ArrayList) olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP;
        String str = (String) olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE = strReplaceAll;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, ej6unYlOWMDF.q1wNbhk2O6((String) arrayList.get(i), 0, 0, "[]", 99));
        }
        ArrayList arrayList2 = (ArrayList) olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE.GI83zq0G8e7zkn;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? ej6unYlOWMDF.q1wNbhk2O6(str2, 0, 0, "\\^`{|}", 67) : null);
            }
        }
        String str3 = (String) olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ = str3 != null ? ej6unYlOWMDF.q1wNbhk2O6(str3, 0, 0, " \"#<>\\^`{|}", 35) : null;
        String string = olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(patternCompile2, "compile(...)");
                ej6unYlOWMDF.pYmKDYlAmhudp(string, "input");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                ej6unYlOWMDF.p59rPv72J9(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final ArrayList V57tEvNfxZVVcOCAOih5PKr() {
        int length = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.length() + 3;
        String str = this.NSjgqmGjEzuugn2SsG1mZFP;
        int iPf1HsU8AK92buCoUaexm5AC = cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(str, '/', length, 4);
        int iV57tEvNfxZVVcOCAOih5PKr = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.V57tEvNfxZVVcOCAOih5PKr(iPf1HsU8AK92buCoUaexm5AC, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iPf1HsU8AK92buCoUaexm5AC < iV57tEvNfxZVVcOCAOih5PKr) {
            int i = iPf1HsU8AK92buCoUaexm5AC + 1;
            int iZfQNn8hdWlEQ5cR94249PDsLR = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.ZfQNn8hdWlEQ5cR94249PDsLR(str, '/', i, iV57tEvNfxZVVcOCAOih5PKr);
            String strSubstring = str.substring(i, iZfQNn8hdWlEQ5cR94249PDsLR);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iPf1HsU8AK92buCoUaexm5AC = iZfQNn8hdWlEQ5cR94249PDsLR;
        }
        return arrayList;
    }

    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (this.V57tEvNfxZVVcOCAOih5PKr.length() == 0) {
            return "";
        }
        int length = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.length() + 3;
        String str = this.NSjgqmGjEzuugn2SsG1mZFP;
        String strSubstring = str.substring(cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(str, ':', length, 4) + 1, cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(str, '@', 0, 6));
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        oLPwQu4XgJ olpwqu4xgj;
        try {
            olpwqu4xgj = new oLPwQu4XgJ(0);
            olpwqu4xgj.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this, "/...");
        } catch (IllegalArgumentException unused) {
            olpwqu4xgj = null;
        }
        ej6unYlOWMDF.p59rPv72J9(olpwqu4xgj);
        olpwqu4xgj.ZfQNn8hdWlEQ5cR94249PDsLR = ej6unYlOWMDF.q1wNbhk2O6("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        olpwqu4xgj.LaeGQIruHQu81hfJldjMOQSVblH3x = ej6unYlOWMDF.q1wNbhk2O6("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", 123);
        return olpwqu4xgj.V57tEvNfxZVVcOCAOih5PKr().NSjgqmGjEzuugn2SsG1mZFP;
    }

    public final String ZfQNn8hdWlEQ5cR94249PDsLR() {
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
            return null;
        }
        String str = this.NSjgqmGjEzuugn2SsG1mZFP;
        int iPf1HsU8AK92buCoUaexm5AC = cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iPf1HsU8AK92buCoUaexm5AC, jHlOQHj3hlCsydfI7r5ApVdQjYvKf.ZfQNn8hdWlEQ5cR94249PDsLR(str, '#', iPf1HsU8AK92buCoUaexm5AC, str.length()));
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sveu0WcbYc1gIe) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(((sveu0WcbYc1gIe) obj).NSjgqmGjEzuugn2SsG1mZFP, this.NSjgqmGjEzuugn2SsG1mZFP);
    }

    public final int hashCode() {
        return this.NSjgqmGjEzuugn2SsG1mZFP.hashCode();
    }

    public final String toString() {
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    public final oLPwQu4XgJ zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        oLPwQu4XgJ olpwqu4xgj = new oLPwQu4XgJ(0);
        ArrayList arrayList = (ArrayList) olpwqu4xgj.NSjgqmGjEzuugn2SsG1mZFP;
        String str = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        olpwqu4xgj.V57tEvNfxZVVcOCAOih5PKr = str;
        olpwqu4xgj.ZfQNn8hdWlEQ5cR94249PDsLR = LaeGQIruHQu81hfJldjMOQSVblH3x();
        olpwqu4xgj.LaeGQIruHQu81hfJldjMOQSVblH3x = VxUQ9tBhpHJ2AAEDNW8sghc4m();
        olpwqu4xgj.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "scheme");
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        olpwqu4xgj.zzpBGItXfub0yWj = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(V57tEvNfxZVVcOCAOih5PKr());
        String strZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR();
        String strSubstring = null;
        olpwqu4xgj.GI83zq0G8e7zkn = strZfQNn8hdWlEQ5cR94249PDsLR != null ? oLPwQu4XgJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(ej6unYlOWMDF.q1wNbhk2O6(strZfQNn8hdWlEQ5cR94249PDsLR, 0, 0, " \"'<>#", 83)) : null;
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
            String str2 = this.NSjgqmGjEzuugn2SsG1mZFP;
            strSubstring = str2.substring(cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(str2, '#', 0, 6) + 1);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        }
        olpwqu4xgj.ZLZeBXTMq0zDztBxtRTuCHrapQ = strSubstring;
        return olpwqu4xgj;
    }

    public final String zzpBGItXfub0yWj() {
        int length = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.length() + 3;
        String str = this.NSjgqmGjEzuugn2SsG1mZFP;
        int iPf1HsU8AK92buCoUaexm5AC = cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(str, '/', length, 4);
        String strSubstring = str.substring(iPf1HsU8AK92buCoUaexm5AC, jHlOQHj3hlCsydfI7r5ApVdQjYvKf.V57tEvNfxZVVcOCAOih5PKr(iPf1HsU8AK92buCoUaexm5AC, str.length(), str, "?#"));
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        return strSubstring;
    }
}
