package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.vdodsodjsdt.g8kevnL6UKpr15IYtcPJXuLo1L4;
import com.vdodsodjsdt.kHXwlw9VpxBho;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode HzCpKshMOoaw76hFcbOVRYMeRd = PorterDuff.Mode.SRC_IN;
    public String M9e7PWhFYLD2lOGMker;
    public Object zzpBGItXfub0yWj;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m = -1;
    public byte[] V57tEvNfxZVVcOCAOih5PKr = null;
    public Parcelable ZfQNn8hdWlEQ5cR94249PDsLR = null;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
    public ColorStateList ZLZeBXTMq0zDztBxtRTuCHrapQ = null;
    public PorterDuff.Mode NSjgqmGjEzuugn2SsG1mZFP = HzCpKshMOoaw76hFcbOVRYMeRd;
    public String GI83zq0G8e7zkn = null;

    public final String toString() {
        String str;
        int iIntValue;
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == -1) {
            return String.valueOf(this.zzpBGItXfub0yWj);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 1:
                str = "BITMAP";
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESOURCE";
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                str = "URI";
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 1:
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.zzpBGItXfub0yWj).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.zzpBGItXfub0yWj).getHeight());
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                sb.append(" pkg=");
                sb.append(this.M9e7PWhFYLD2lOGMker);
                sb.append(" id=");
                int i = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (i == -1) {
                    int i2 = Build.VERSION.SDK_INT;
                    Object obj = this.zzpBGItXfub0yWj;
                    if (i2 >= 28) {
                        iIntValue = kHXwlw9VpxBho.zIvmSL0wzmmKGc3X39b2Gw2mUGE(obj);
                    } else {
                        try {
                            iIntValue = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon resource", e);
                            iIntValue = 0;
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon resource", e2);
                            iIntValue = 0;
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            iIntValue = 0;
                        }
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    iIntValue = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(iIntValue)));
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
                if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE != 0) {
                    sb.append(" off=");
                    sb.append(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                }
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.zzpBGItXfub0yWj);
                break;
        }
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
            sb.append(" tint=");
            sb.append(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        }
        if (this.NSjgqmGjEzuugn2SsG1mZFP != HzCpKshMOoaw76hFcbOVRYMeRd) {
            sb.append(" mode=");
            sb.append(this.NSjgqmGjEzuugn2SsG1mZFP);
        }
        sb.append(")");
        return sb.toString();
    }
}
