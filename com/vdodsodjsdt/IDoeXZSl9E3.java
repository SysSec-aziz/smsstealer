package com.vdodsodjsdt;

import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class IDoeXZSl9E3 {
    public static final /* synthetic */ IDoeXZSl9E3[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public static final hP3dMpetkqP V57tEvNfxZVVcOCAOih5PKr;
    public static final kMOMP1curnTy3VVCjVVGfKy2Q2c ZfQNn8hdWlEQ5cR94249PDsLR;

    static {
        hP3dMpetkqP hp3dmpetkqp = new hP3dMpetkqP();
        V57tEvNfxZVVcOCAOih5PKr = hp3dmpetkqp;
        kMOMP1curnTy3VVCjVVGfKy2Q2c kmomp1curnty3vvcjvvgfky2q2c = new kMOMP1curnTy3VVCjVVGfKy2Q2c();
        ZfQNn8hdWlEQ5cR94249PDsLR = kmomp1curnty3vvcjvvgfky2q2c;
        LaeGQIruHQu81hfJldjMOQSVblH3x = new IDoeXZSl9E3[]{hp3dmpetkqp, kmomp1curnty3vvcjvvgfky2q2c, new IDoeXZSl9E3() { // from class: com.vdodsodjsdt.sgWxC5S6PhKxS
            public static Double zzpBGItXfub0yWj(String str, Gzdlhdn1ss gzdlhdn1ss) throws UW0OfzFGj7 {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (gzdlhdn1ss.pYmKDYlAmhudp != 1) {
                            throw new UW0OfzFGj7("JSON forbids NaN and infinities: " + dValueOf + "; at path " + gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(true));
                        }
                    }
                    return dValueOf;
                } catch (NumberFormatException e) {
                    StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("Cannot parse ", str, "; at path ");
                    sbKUYypEB4eNWOZWVDpH.append(gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(true));
                    throw new Eyg9qHiQ9Ki1REKbbd3J(sbKUYypEB4eNWOZWVDpH.toString(), e);
                }
            }

            @Override // com.vdodsodjsdt.IDoeXZSl9E3
            public final Number VxUQ9tBhpHJ2AAEDNW8sghc4m(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
                String strYmT6yQrus3w = gzdlhdn1ss.ymT6yQrus3w();
                if (strYmT6yQrus3w.indexOf(46) >= 0) {
                    return zzpBGItXfub0yWj(strYmT6yQrus3w, gzdlhdn1ss);
                }
                try {
                    return Long.valueOf(Long.parseLong(strYmT6yQrus3w));
                } catch (NumberFormatException unused) {
                    return zzpBGItXfub0yWj(strYmT6yQrus3w, gzdlhdn1ss);
                }
            }
        }, new IDoeXZSl9E3() { // from class: com.vdodsodjsdt.D0HXYVzlAyZPJPaLZAcS3Zf
            @Override // com.vdodsodjsdt.IDoeXZSl9E3
            public final Number VxUQ9tBhpHJ2AAEDNW8sghc4m(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
                String strYmT6yQrus3w = gzdlhdn1ss.ymT6yQrus3w();
                try {
                    return sGipz63rTUmSj3uFDvOtzihao.d9zDyyznnp3oaDT1Ug(strYmT6yQrus3w);
                } catch (NumberFormatException e) {
                    StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("Cannot parse ", strYmT6yQrus3w, "; at path ");
                    sbKUYypEB4eNWOZWVDpH.append(gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(true));
                    throw new Eyg9qHiQ9Ki1REKbbd3J(sbKUYypEB4eNWOZWVDpH.toString(), e);
                }
            }
        }};
    }

    public static IDoeXZSl9E3 valueOf(String str) {
        return (IDoeXZSl9E3) Enum.valueOf(IDoeXZSl9E3.class, str);
    }

    public static IDoeXZSl9E3[] values() {
        return (IDoeXZSl9E3[]) LaeGQIruHQu81hfJldjMOQSVblH3x.clone();
    }

    public abstract Number VxUQ9tBhpHJ2AAEDNW8sghc4m(Gzdlhdn1ss gzdlhdn1ss);
}
