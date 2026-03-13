package com.vdodsodjsdt;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AKwTJzw8hwGnOgalgHPBi2qJw9 {
    public static final ZXknyTEvPc613p2Waph63 V57tEvNfxZVVcOCAOih5PKr;
    public static final /* synthetic */ AKwTJzw8hwGnOgalgHPBi2qJw9[] ZfQNn8hdWlEQ5cR94249PDsLR;

    static {
        ZXknyTEvPc613p2Waph63 zXknyTEvPc613p2Waph63 = new ZXknyTEvPc613p2Waph63();
        V57tEvNfxZVVcOCAOih5PKr = zXknyTEvPc613p2Waph63;
        ZfQNn8hdWlEQ5cR94249PDsLR = new AKwTJzw8hwGnOgalgHPBi2qJw9[]{zXknyTEvPc613p2Waph63, new AKwTJzw8hwGnOgalgHPBi2qJw9() { // from class: com.vdodsodjsdt.qPGwDfB71e0G5g1qYdRaslen
            @Override // com.vdodsodjsdt.AKwTJzw8hwGnOgalgHPBi2qJw9
            public final String zzpBGItXfub0yWj(Field field) {
                return AKwTJzw8hwGnOgalgHPBi2qJw9.V57tEvNfxZVVcOCAOih5PKr(field.getName());
            }
        }, new AKwTJzw8hwGnOgalgHPBi2qJw9() { // from class: com.vdodsodjsdt.QZEpspWLHcf
            @Override // com.vdodsodjsdt.AKwTJzw8hwGnOgalgHPBi2qJw9
            public final String zzpBGItXfub0yWj(Field field) {
                return AKwTJzw8hwGnOgalgHPBi2qJw9.V57tEvNfxZVVcOCAOih5PKr(AKwTJzw8hwGnOgalgHPBi2qJw9.VxUQ9tBhpHJ2AAEDNW8sghc4m(field.getName(), ' '));
            }
        }, new AKwTJzw8hwGnOgalgHPBi2qJw9() { // from class: com.vdodsodjsdt.cwzuEcR7voq3U0zX0
            @Override // com.vdodsodjsdt.AKwTJzw8hwGnOgalgHPBi2qJw9
            public final String zzpBGItXfub0yWj(Field field) {
                return AKwTJzw8hwGnOgalgHPBi2qJw9.VxUQ9tBhpHJ2AAEDNW8sghc4m(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new AKwTJzw8hwGnOgalgHPBi2qJw9() { // from class: com.vdodsodjsdt.wmNAphd0u9o9uBbDrWvACRT
            @Override // com.vdodsodjsdt.AKwTJzw8hwGnOgalgHPBi2qJw9
            public final String zzpBGItXfub0yWj(Field field) {
                return AKwTJzw8hwGnOgalgHPBi2qJw9.VxUQ9tBhpHJ2AAEDNW8sghc4m(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new AKwTJzw8hwGnOgalgHPBi2qJw9() { // from class: com.vdodsodjsdt.T1i0ix9l1f
            @Override // com.vdodsodjsdt.AKwTJzw8hwGnOgalgHPBi2qJw9
            public final String zzpBGItXfub0yWj(Field field) {
                return AKwTJzw8hwGnOgalgHPBi2qJw9.VxUQ9tBhpHJ2AAEDNW8sghc4m(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new AKwTJzw8hwGnOgalgHPBi2qJw9() { // from class: com.vdodsodjsdt.K4xVVUz70QtsTtJ5Uo1R3Yv
            @Override // com.vdodsodjsdt.AKwTJzw8hwGnOgalgHPBi2qJw9
            public final String zzpBGItXfub0yWj(Field field) {
                return AKwTJzw8hwGnOgalgHPBi2qJw9.VxUQ9tBhpHJ2AAEDNW8sghc4m(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String V57tEvNfxZVVcOCAOih5PKr(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt)) {
                i++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static String VxUQ9tBhpHJ2AAEDNW8sghc4m(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static AKwTJzw8hwGnOgalgHPBi2qJw9 valueOf(String str) {
        return (AKwTJzw8hwGnOgalgHPBi2qJw9) Enum.valueOf(AKwTJzw8hwGnOgalgHPBi2qJw9.class, str);
    }

    public static AKwTJzw8hwGnOgalgHPBi2qJw9[] values() {
        return (AKwTJzw8hwGnOgalgHPBi2qJw9[]) ZfQNn8hdWlEQ5cR94249PDsLR.clone();
    }

    public abstract String zzpBGItXfub0yWj(Field field);
}
