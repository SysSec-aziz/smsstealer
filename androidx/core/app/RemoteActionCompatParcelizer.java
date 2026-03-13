package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.vdodsodjsdt.BbDqqUJpcZ8e;
import com.vdodsodjsdt.kQWyfLhecC6My1rEG579CENmQ1k;
import com.vdodsodjsdt.xQQ50DM9zLYsxAJkRLNUyO9l8Max;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(xQQ50DM9zLYsxAJkRLNUyO9l8Max xqq50dm9zlysxajkrlnuyo9l8max) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        BbDqqUJpcZ8e bbDqqUJpcZ8eZLZeBXTMq0zDztBxtRTuCHrapQ = remoteActionCompat.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        boolean z = true;
        if (xqq50dm9zlysxajkrlnuyo9l8max.LaeGQIruHQu81hfJldjMOQSVblH3x(1)) {
            bbDqqUJpcZ8eZLZeBXTMq0zDztBxtRTuCHrapQ = xqq50dm9zlysxajkrlnuyo9l8max.ZLZeBXTMq0zDztBxtRTuCHrapQ();
        }
        remoteActionCompat.VxUQ9tBhpHJ2AAEDNW8sghc4m = (IconCompat) bbDqqUJpcZ8eZLZeBXTMq0zDztBxtRTuCHrapQ;
        CharSequence charSequence = remoteActionCompat.zzpBGItXfub0yWj;
        if (xqq50dm9zlysxajkrlnuyo9l8max.LaeGQIruHQu81hfJldjMOQSVblH3x(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        remoteActionCompat.zzpBGItXfub0yWj = charSequence;
        CharSequence charSequence2 = remoteActionCompat.V57tEvNfxZVVcOCAOih5PKr;
        if (xqq50dm9zlysxajkrlnuyo9l8max.LaeGQIruHQu81hfJldjMOQSVblH3x(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        remoteActionCompat.V57tEvNfxZVVcOCAOih5PKr = charSequence2;
        remoteActionCompat.ZfQNn8hdWlEQ5cR94249PDsLR = (PendingIntent) xqq50dm9zlysxajkrlnuyo9l8max.zIvmSL0wzmmKGc3X39b2Gw2mUGE(remoteActionCompat.ZfQNn8hdWlEQ5cR94249PDsLR, 4);
        boolean z2 = remoteActionCompat.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (xqq50dm9zlysxajkrlnuyo9l8max.LaeGQIruHQu81hfJldjMOQSVblH3x(5)) {
            z2 = ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.readInt() != 0;
        }
        remoteActionCompat.LaeGQIruHQu81hfJldjMOQSVblH3x = z2;
        boolean z3 = remoteActionCompat.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (!xqq50dm9zlysxajkrlnuyo9l8max.LaeGQIruHQu81hfJldjMOQSVblH3x(6)) {
            z = z3;
        } else if (((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.zIvmSL0wzmmKGc3X39b2Gw2mUGE = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, xQQ50DM9zLYsxAJkRLNUyO9l8Max xqq50dm9zlysxajkrlnuyo9l8max) {
        xqq50dm9zlysxajkrlnuyo9l8max.getClass();
        IconCompat iconCompat = remoteActionCompat.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(1);
        xqq50dm9zlysxajkrlnuyo9l8max.GI83zq0G8e7zkn(iconCompat);
        CharSequence charSequence = remoteActionCompat.zzpBGItXfub0yWj;
        xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(2);
        Parcel parcel = ((kQWyfLhecC6My1rEG579CENmQ1k) xqq50dm9zlysxajkrlnuyo9l8max).LaeGQIruHQu81hfJldjMOQSVblH3x;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.V57tEvNfxZVVcOCAOih5PKr;
        xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.ZfQNn8hdWlEQ5cR94249PDsLR;
        xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.LaeGQIruHQu81hfJldjMOQSVblH3x;
        xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        xqq50dm9zlysxajkrlnuyo9l8max.NSjgqmGjEzuugn2SsG1mZFP(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
