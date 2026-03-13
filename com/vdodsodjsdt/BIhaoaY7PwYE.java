package com.vdodsodjsdt;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class BIhaoaY7PwYE extends iR5xCBIVvX5dAZmnw05F0Cv implements vP57smEEh3YGCxzJ {
    public static final BIhaoaY7PwYE GI83zq0G8e7zkn;
    public static final BIhaoaY7PwYE LaeGQIruHQu81hfJldjMOQSVblH3x;
    public static final BIhaoaY7PwYE M9e7PWhFYLD2lOGMker;
    public static final BIhaoaY7PwYE NSjgqmGjEzuugn2SsG1mZFP;
    public static final BIhaoaY7PwYE ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public static final BIhaoaY7PwYE zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;

    static {
        int i = 1;
        LaeGQIruHQu81hfJldjMOQSVblH3x = new BIhaoaY7PwYE(i, 0);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE = new BIhaoaY7PwYE(i, 1);
        ZLZeBXTMq0zDztBxtRTuCHrapQ = new BIhaoaY7PwYE(i, 2);
        NSjgqmGjEzuugn2SsG1mZFP = new BIhaoaY7PwYE(i, 3);
        GI83zq0G8e7zkn = new BIhaoaY7PwYE(i, 4);
        M9e7PWhFYLD2lOGMker = new BIhaoaY7PwYE(i, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BIhaoaY7PwYE(int i, int i2) {
        super(i);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
    }

    @Override // com.vdodsodjsdt.vP57smEEh3YGCxzJ
    public final Object GI83zq0G8e7zkn(Object obj) {
        String strValueOf;
        switch (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            case 0:
                RKQqw795jswHmdL5AnfuvmeBZD rKQqw795jswHmdL5AnfuvmeBZD = (RKQqw795jswHmdL5AnfuvmeBZD) obj;
                if (rKQqw795jswHmdL5AnfuvmeBZD instanceof LL6zXCXfmDYzdHCRTT) {
                    return (LL6zXCXfmDYzdHCRTT) rKQqw795jswHmdL5AnfuvmeBZD;
                }
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ej6unYlOWMDF.pYmKDYlAmhudp(entry, "<name for destructuring parameter 0>");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(value, "toString(this)");
                }
                sb.append(value);
                return sb.toString();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                File file = (File) obj;
                ej6unYlOWMDF.pYmKDYlAmhudp(file, "it");
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(absolutePath, "file.canonicalFile.absolutePath");
                return new R2gZ9455nFwCuFzDlc5ZU6n8KNyae(absolutePath);
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                Map.Entry entry2 = (Map.Entry) obj;
                ej6unYlOWMDF.pYmKDYlAmhudp(entry2, "entry");
                Object value2 = entry2.getValue();
                if (value2 instanceof byte[]) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((CharSequence) "[");
                    int i = 0;
                    for (byte b : (byte[]) value2) {
                        i++;
                        if (i > 1) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append((CharSequence) String.valueOf((int) b));
                    }
                    sb2.append((CharSequence) "]");
                    strValueOf = sb2.toString();
                } else {
                    strValueOf = String.valueOf(entry2.getValue());
                }
                return "  " + ((zabWiGvSFrO07AP3htLK7JkP) entry2.getKey()).VxUQ9tBhpHJ2AAEDNW8sghc4m + " = " + strValueOf;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                ej6unYlOWMDF.pYmKDYlAmhudp((Context) obj, "it");
                return zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
            default:
                bipD1yHZW4C bipd1yhzw4c = (bipD1yHZW4C) obj;
                ej6unYlOWMDF.pYmKDYlAmhudp(bipd1yhzw4c, "it");
                return bipd1yhzw4c.getClass().getSimpleName();
        }
    }
}
