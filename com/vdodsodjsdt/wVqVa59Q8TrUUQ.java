package com.vdodsodjsdt;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wVqVa59Q8TrUUQ {
    public static final KK6EHiwUVZvS[] VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final Map zzpBGItXfub0yWj;

    static {
        KK6EHiwUVZvS kK6EHiwUVZvS = new KK6EHiwUVZvS(KK6EHiwUVZvS.GI83zq0G8e7zkn, "");
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = KK6EHiwUVZvS.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        KK6EHiwUVZvS kK6EHiwUVZvS2 = new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg, "GET");
        KK6EHiwUVZvS kK6EHiwUVZvS3 = new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg, "POST");
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg2 = KK6EHiwUVZvS.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        KK6EHiwUVZvS kK6EHiwUVZvS4 = new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg2, "/");
        KK6EHiwUVZvS kK6EHiwUVZvS5 = new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg2, "/index.html");
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg3 = KK6EHiwUVZvS.NSjgqmGjEzuugn2SsG1mZFP;
        KK6EHiwUVZvS kK6EHiwUVZvS6 = new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg3, "http");
        KK6EHiwUVZvS kK6EHiwUVZvS7 = new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg3, "https");
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg4 = KK6EHiwUVZvS.LaeGQIruHQu81hfJldjMOQSVblH3x;
        KK6EHiwUVZvS[] kK6EHiwUVZvSArr = {kK6EHiwUVZvS, kK6EHiwUVZvS2, kK6EHiwUVZvS3, kK6EHiwUVZvS4, kK6EHiwUVZvS5, kK6EHiwUVZvS6, kK6EHiwUVZvS7, new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg4, "200"), new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg4, "204"), new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg4, "206"), new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg4, "304"), new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg4, "400"), new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg4, "404"), new KK6EHiwUVZvS(oa1wo3soicf8h1n6bgpg4, "500"), new KK6EHiwUVZvS("accept-charset", ""), new KK6EHiwUVZvS("accept-encoding", "gzip, deflate"), new KK6EHiwUVZvS("accept-language", ""), new KK6EHiwUVZvS("accept-ranges", ""), new KK6EHiwUVZvS("accept", ""), new KK6EHiwUVZvS("access-control-allow-origin", ""), new KK6EHiwUVZvS("age", ""), new KK6EHiwUVZvS("allow", ""), new KK6EHiwUVZvS("authorization", ""), new KK6EHiwUVZvS("cache-control", ""), new KK6EHiwUVZvS("content-disposition", ""), new KK6EHiwUVZvS("content-encoding", ""), new KK6EHiwUVZvS("content-language", ""), new KK6EHiwUVZvS("content-length", ""), new KK6EHiwUVZvS("content-location", ""), new KK6EHiwUVZvS("content-range", ""), new KK6EHiwUVZvS("content-type", ""), new KK6EHiwUVZvS("cookie", ""), new KK6EHiwUVZvS("date", ""), new KK6EHiwUVZvS("etag", ""), new KK6EHiwUVZvS("expect", ""), new KK6EHiwUVZvS("expires", ""), new KK6EHiwUVZvS("from", ""), new KK6EHiwUVZvS("host", ""), new KK6EHiwUVZvS("if-match", ""), new KK6EHiwUVZvS("if-modified-since", ""), new KK6EHiwUVZvS("if-none-match", ""), new KK6EHiwUVZvS("if-range", ""), new KK6EHiwUVZvS("if-unmodified-since", ""), new KK6EHiwUVZvS("last-modified", ""), new KK6EHiwUVZvS("link", ""), new KK6EHiwUVZvS("location", ""), new KK6EHiwUVZvS("max-forwards", ""), new KK6EHiwUVZvS("proxy-authenticate", ""), new KK6EHiwUVZvS("proxy-authorization", ""), new KK6EHiwUVZvS("range", ""), new KK6EHiwUVZvS("referer", ""), new KK6EHiwUVZvS("refresh", ""), new KK6EHiwUVZvS("retry-after", ""), new KK6EHiwUVZvS("server", ""), new KK6EHiwUVZvS("set-cookie", ""), new KK6EHiwUVZvS("strict-transport-security", ""), new KK6EHiwUVZvS("transfer-encoding", ""), new KK6EHiwUVZvS("user-agent", ""), new KK6EHiwUVZvS("vary", ""), new KK6EHiwUVZvS("via", ""), new KK6EHiwUVZvS("www-authenticate", "")};
        VxUQ9tBhpHJ2AAEDNW8sghc4m = kK6EHiwUVZvSArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(kK6EHiwUVZvSArr[i].VxUQ9tBhpHJ2AAEDNW8sghc4m)) {
                linkedHashMap.put(kK6EHiwUVZvSArr[i].VxUQ9tBhpHJ2AAEDNW8sghc4m, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(mapUnmodifiableMap, "unmodifiableMap(...)");
        zzpBGItXfub0yWj = mapUnmodifiableMap;
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg) {
        ej6unYlOWMDF.pYmKDYlAmhudp(oa1wo3soicf8h1n6bgpg, "name");
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = oa1wo3soicf8h1n6bgpg.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        for (int i = 0; i < iVxUQ9tBhpHJ2AAEDNW8sghc4m; i++) {
            byte bZfQNn8hdWlEQ5cR94249PDsLR = oa1wo3soicf8h1n6bgpg.ZfQNn8hdWlEQ5cR94249PDsLR(i);
            if (65 <= bZfQNn8hdWlEQ5cR94249PDsLR && bZfQNn8hdWlEQ5cR94249PDsLR < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(oa1wo3soicf8h1n6bgpg.M9e7PWhFYLD2lOGMker()));
            }
        }
    }
}
