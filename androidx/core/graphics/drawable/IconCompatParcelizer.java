package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.vdodsodjsdt.g8kevnL6UKpr15IYtcPJXuLo1L4;
import com.vdodsodjsdt.kQWyfLhecC6My1rEG579CENmQ1k;
import com.vdodsodjsdt.xQQ50DM9zLYsxAJkRLNUyO9l8Max;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(xQQ50DM9zLYsxAJkRLNUyO9l8Max xqq50dm9zlysxajkrlnuyo9l8max) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (xqq50dm9zlysxajkrlnuyo9l8max.LaeGQIruHQu81hfJldjMOQSVblH3x(1)) {
            i = ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.readInt();
        }
        iconCompat.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        byte[] bArr = iconCompat.V57tEvNfxZVVcOCAOih5PKr;
        if (xqq50dm9zlysxajkrlnuyo9l8max.LaeGQIruHQu81hfJldjMOQSVblH3x(2)) {
            Parcel parcel = ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x;
            int i2 = parcel.readInt();
            if (i2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.V57tEvNfxZVVcOCAOih5PKr = bArr;
        iconCompat.ZfQNn8hdWlEQ5cR94249PDsLR = xqq50dm9zlysxajkrlnuyo9l8max.zIvmSL0wzmmKGc3X39b2Gw2mUGE(iconCompat.ZfQNn8hdWlEQ5cR94249PDsLR, 3);
        int i3 = iconCompat.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (xqq50dm9zlysxajkrlnuyo9l8max.LaeGQIruHQu81hfJldjMOQSVblH3x(4)) {
            i3 = ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.readInt();
        }
        iconCompat.LaeGQIruHQu81hfJldjMOQSVblH3x = i3;
        int i4 = iconCompat.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (xqq50dm9zlysxajkrlnuyo9l8max.LaeGQIruHQu81hfJldjMOQSVblH3x(5)) {
            i4 = ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.readInt();
        }
        iconCompat.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i4;
        iconCompat.ZLZeBXTMq0zDztBxtRTuCHrapQ = (ColorStateList) xqq50dm9zlysxajkrlnuyo9l8max.zIvmSL0wzmmKGc3X39b2Gw2mUGE(iconCompat.ZLZeBXTMq0zDztBxtRTuCHrapQ, 6);
        String string = iconCompat.GI83zq0G8e7zkn;
        if (xqq50dm9zlysxajkrlnuyo9l8max.LaeGQIruHQu81hfJldjMOQSVblH3x(7)) {
            string = ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.readString();
        }
        iconCompat.GI83zq0G8e7zkn = string;
        String string2 = iconCompat.M9e7PWhFYLD2lOGMker;
        if (xqq50dm9zlysxajkrlnuyo9l8max.LaeGQIruHQu81hfJldjMOQSVblH3x(8)) {
            string2 = ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.readString();
        }
        iconCompat.M9e7PWhFYLD2lOGMker = string2;
        iconCompat.NSjgqmGjEzuugn2SsG1mZFP = PorterDuff.Mode.valueOf(iconCompat.GI83zq0G8e7zkn);
        switch (iconCompat.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case -1:
                Parcelable parcelable = iconCompat.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.zzpBGItXfub0yWj = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (parcelable2 != null) {
                    iconCompat.zzpBGItXfub0yWj = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.V57tEvNfxZVVcOCAOih5PKr;
                iconCompat.zzpBGItXfub0yWj = bArr3;
                iconCompat.VxUQ9tBhpHJ2AAEDNW8sghc4m = 3;
                iconCompat.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
                iconCompat.zIvmSL0wzmmKGc3X39b2Gw2mUGE = bArr3.length;
                return iconCompat;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(iconCompat.V57tEvNfxZVVcOCAOih5PKr, Charset.forName("UTF-16"));
                iconCompat.zzpBGItXfub0yWj = str;
                if (iconCompat.VxUQ9tBhpHJ2AAEDNW8sghc4m == 2 && iconCompat.M9e7PWhFYLD2lOGMker == null) {
                    iconCompat.M9e7PWhFYLD2lOGMker = str.split(":", -1)[0];
                }
                return iconCompat;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.zzpBGItXfub0yWj = iconCompat.V57tEvNfxZVVcOCAOih5PKr;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, xQQ50DM9zLYsxAJkRLNUyO9l8Max xqq50dm9zlysxajkrlnuyo9l8max) {
        xqq50dm9zlysxajkrlnuyo9l8max.getClass();
        iconCompat.GI83zq0G8e7zkn = iconCompat.NSjgqmGjEzuugn2SsG1mZFP.name();
        switch (iconCompat.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case -1:
                iconCompat.ZfQNn8hdWlEQ5cR94249PDsLR = (Parcelable) iconCompat.zzpBGItXfub0yWj;
                break;
            case 1:
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.ZfQNn8hdWlEQ5cR94249PDsLR = (Parcelable) iconCompat.zzpBGItXfub0yWj;
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                iconCompat.V57tEvNfxZVVcOCAOih5PKr = ((String) iconCompat.zzpBGItXfub0yWj).getBytes(Charset.forName("UTF-16"));
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.V57tEvNfxZVVcOCAOih5PKr = (byte[]) iconCompat.zzpBGItXfub0yWj;
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.V57tEvNfxZVVcOCAOih5PKr = iconCompat.zzpBGItXfub0yWj.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (-1 != i) {
            xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(1);
            ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.writeInt(i);
        }
        byte[] bArr = iconCompat.V57tEvNfxZVVcOCAOih5PKr;
        if (bArr != null) {
            xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(2);
            Parcel parcel = ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (parcelable != null) {
            xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(3);
            ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i2 != 0) {
            xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(4);
            ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.writeInt(i2);
        }
        int i3 = iconCompat.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (i3 != 0) {
            xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(5);
            ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (colorStateList != null) {
            xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(6);
            ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.GI83zq0G8e7zkn;
        if (str != null) {
            xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(7);
            ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.writeString(str);
        }
        String str2 = iconCompat.M9e7PWhFYLD2lOGMker;
        if (str2 != null) {
            xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(8);
            ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.writeString(str2);
        }
    }
}
