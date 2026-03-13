package com.vdodsodjsdt;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class u3oM4Jia4hn5PHaSzj7t25fUwRg7 implements Serializable {
    public final Pattern V57tEvNfxZVVcOCAOih5PKr;

    public u3oM4Jia4hn5PHaSzj7t25fUwRg7(String str) {
        Pattern patternCompile = Pattern.compile(str);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(patternCompile, "compile(...)");
        this.V57tEvNfxZVVcOCAOih5PKr = patternCompile;
    }

    public final NrjuzzioPqfttNRptBDpZDzSYUrcM VxUQ9tBhpHJ2AAEDNW8sghc4m(String str, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "input");
        Matcher matcherRegion = this.V57tEvNfxZVVcOCAOih5PKr.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (matcherRegion.lookingAt()) {
            return new NrjuzzioPqfttNRptBDpZDzSYUrcM(matcherRegion, str);
        }
        return null;
    }

    public final String toString() {
        String string = this.V57tEvNfxZVVcOCAOih5PKr.toString();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "toString(...)");
        return string;
    }
}
