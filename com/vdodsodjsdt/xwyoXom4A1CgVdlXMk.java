package com.vdodsodjsdt;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xwyoXom4A1CgVdlXMk implements Parcelable.Creator {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public /* synthetic */ xwyoXom4A1CgVdlXMk(int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                ej6unYlOWMDF.pYmKDYlAmhudp(parcel, "parcel");
                return new zHpcvbo7P2(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                cywoFvgcZuf86cVAUP8GYUZAvlww cywofvgczuf86cvaup8gyuzavlww = new cywoFvgcZuf86cVAUP8GYUZAvlww(parcel);
                cywofvgczuf86cvaup8gyuzavlww.V57tEvNfxZVVcOCAOih5PKr = parcel.readByte() != 0;
                return cywofvgczuf86cvaup8gyuzavlww;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return new oEBm3iLeh42WChsi(parcel);
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return new ECdq0CGbNkex8wAFBY3oz(parcel);
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return new XMlqHp2sNChQxkYAA((TOzjEyj2IN5fWYir) parcel.readParcelable(TOzjEyj2IN5fWYir.class.getClassLoader()), (TOzjEyj2IN5fWYir) parcel.readParcelable(TOzjEyj2IN5fWYir.class.getClassLoader()), (wIfNfljSFD2BnwQk6jI) parcel.readParcelable(wIfNfljSFD2BnwQk6jI.class.getClassLoader()), (TOzjEyj2IN5fWYir) parcel.readParcelable(TOzjEyj2IN5fWYir.class.getClassLoader()), parcel.readInt());
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                return new wIfNfljSFD2BnwQk6jI(parcel.readLong());
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                ZtU4qQuGwUNq0Z4r5pguqr49NWh1F ztU4qQuGwUNq0Z4r5pguqr49NWh1F = new ZtU4qQuGwUNq0Z4r5pguqr49NWh1F();
                ztU4qQuGwUNq0Z4r5pguqr49NWh1F.V57tEvNfxZVVcOCAOih5PKr = parcel.readString();
                ztU4qQuGwUNq0Z4r5pguqr49NWh1F.ZfQNn8hdWlEQ5cR94249PDsLR = parcel.readInt();
                return ztU4qQuGwUNq0Z4r5pguqr49NWh1F;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                rmGC46IMKtRlsjzf4LFnjhjpsz rmgc46imktrlsjzf4lfnjhjpsz = new rmGC46IMKtRlsjzf4LFnjhjpsz();
                rmgc46imktrlsjzf4lfnjhjpsz.ZLZeBXTMq0zDztBxtRTuCHrapQ = null;
                rmgc46imktrlsjzf4lfnjhjpsz.NSjgqmGjEzuugn2SsG1mZFP = new ArrayList();
                rmgc46imktrlsjzf4lfnjhjpsz.GI83zq0G8e7zkn = new ArrayList();
                rmgc46imktrlsjzf4lfnjhjpsz.V57tEvNfxZVVcOCAOih5PKr = parcel.createStringArrayList();
                rmgc46imktrlsjzf4lfnjhjpsz.ZfQNn8hdWlEQ5cR94249PDsLR = parcel.createStringArrayList();
                rmgc46imktrlsjzf4lfnjhjpsz.LaeGQIruHQu81hfJldjMOQSVblH3x = (oEBm3iLeh42WChsi[]) parcel.createTypedArray(oEBm3iLeh42WChsi.CREATOR);
                rmgc46imktrlsjzf4lfnjhjpsz.zIvmSL0wzmmKGc3X39b2Gw2mUGE = parcel.readInt();
                rmgc46imktrlsjzf4lfnjhjpsz.ZLZeBXTMq0zDztBxtRTuCHrapQ = parcel.readString();
                rmgc46imktrlsjzf4lfnjhjpsz.NSjgqmGjEzuugn2SsG1mZFP = parcel.createStringArrayList();
                rmgc46imktrlsjzf4lfnjhjpsz.GI83zq0G8e7zkn = parcel.createTypedArrayList(ECdq0CGbNkex8wAFBY3oz.CREATOR);
                rmgc46imktrlsjzf4lfnjhjpsz.M9e7PWhFYLD2lOGMker = parcel.createTypedArrayList(ZtU4qQuGwUNq0Z4r5pguqr49NWh1F.CREATOR);
                return rmgc46imktrlsjzf4lfnjhjpsz;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                return new gElQ3Q9ZHXy5F6j(parcel);
            case 9:
                ej6unYlOWMDF.pYmKDYlAmhudp(parcel, "inParcel");
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                ej6unYlOWMDF.p59rPv72J9(parcelable);
                return new gjJSYRXNQYALPwuWEJb5HLx((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 10:
                WMrYE5mAr1lCj64D wMrYE5mAr1lCj64D = new WMrYE5mAr1lCj64D();
                wMrYE5mAr1lCj64D.V57tEvNfxZVVcOCAOih5PKr = parcel.readInt();
                wMrYE5mAr1lCj64D.ZfQNn8hdWlEQ5cR94249PDsLR = parcel.readInt();
                wMrYE5mAr1lCj64D.LaeGQIruHQu81hfJldjMOQSVblH3x = parcel.readInt() == 1;
                return wMrYE5mAr1lCj64D;
            case 11:
                neCTKJPHujsSxgUr6c nectkjphujssxgur6c = new neCTKJPHujsSxgUr6c(parcel);
                nectkjphujssxgur6c.V57tEvNfxZVVcOCAOih5PKr = ((Integer) parcel.readValue(neCTKJPHujsSxgUr6c.class.getClassLoader())).intValue();
                return nectkjphujssxgur6c;
            case 12:
                return TOzjEyj2IN5fWYir.VxUQ9tBhpHJ2AAEDNW8sghc4m(parcel.readInt(), parcel.readInt());
            case 13:
                m02hASdoCdjELH0 m02hasdocdjelh0 = new m02hASdoCdjELH0(parcel);
                m02hasdocdjelh0.V57tEvNfxZVVcOCAOih5PKr = parcel.readInt();
                return m02hasdocdjelh0;
            case 14:
                return new ParcelImpl(parcel);
            case 15:
                QFMjeZ4cxQ3YufrAYm9ASX0UYkVmV qFMjeZ4cxQ3YufrAYm9ASX0UYkVmV = new QFMjeZ4cxQ3YufrAYm9ASX0UYkVmV();
                qFMjeZ4cxQ3YufrAYm9ASX0UYkVmV.V57tEvNfxZVVcOCAOih5PKr = parcel.readInt();
                qFMjeZ4cxQ3YufrAYm9ASX0UYkVmV.ZfQNn8hdWlEQ5cR94249PDsLR = parcel.readInt();
                qFMjeZ4cxQ3YufrAYm9ASX0UYkVmV.zIvmSL0wzmmKGc3X39b2Gw2mUGE = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    qFMjeZ4cxQ3YufrAYm9ASX0UYkVmV.LaeGQIruHQu81hfJldjMOQSVblH3x = iArr;
                    parcel.readIntArray(iArr);
                }
                return qFMjeZ4cxQ3YufrAYm9ASX0UYkVmV;
            default:
                XpKiPgWTE4o42v0M2im xpKiPgWTE4o42v0M2im = new XpKiPgWTE4o42v0M2im();
                xpKiPgWTE4o42v0M2im.V57tEvNfxZVVcOCAOih5PKr = parcel.readInt();
                xpKiPgWTE4o42v0M2im.ZfQNn8hdWlEQ5cR94249PDsLR = parcel.readInt();
                int i2 = parcel.readInt();
                xpKiPgWTE4o42v0M2im.LaeGQIruHQu81hfJldjMOQSVblH3x = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    xpKiPgWTE4o42v0M2im.zIvmSL0wzmmKGc3X39b2Gw2mUGE = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i3 = parcel.readInt();
                xpKiPgWTE4o42v0M2im.ZLZeBXTMq0zDztBxtRTuCHrapQ = i3;
                if (i3 > 0) {
                    int[] iArr3 = new int[i3];
                    xpKiPgWTE4o42v0M2im.NSjgqmGjEzuugn2SsG1mZFP = iArr3;
                    parcel.readIntArray(iArr3);
                }
                xpKiPgWTE4o42v0M2im.M9e7PWhFYLD2lOGMker = parcel.readInt() == 1;
                xpKiPgWTE4o42v0M2im.HzCpKshMOoaw76hFcbOVRYMeRd = parcel.readInt() == 1;
                xpKiPgWTE4o42v0M2im.KUYypEB4eNWOZWVDpH = parcel.readInt() == 1;
                xpKiPgWTE4o42v0M2im.GI83zq0G8e7zkn = parcel.readArrayList(QFMjeZ4cxQ3YufrAYm9ASX0UYkVmV.class.getClassLoader());
                return xpKiPgWTE4o42v0M2im;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                return new zHpcvbo7P2[i];
            case 1:
                return new cywoFvgcZuf86cVAUP8GYUZAvlww[i];
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return new oEBm3iLeh42WChsi[i];
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return new ECdq0CGbNkex8wAFBY3oz[i];
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return new XMlqHp2sNChQxkYAA[i];
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                return new wIfNfljSFD2BnwQk6jI[i];
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                return new ZtU4qQuGwUNq0Z4r5pguqr49NWh1F[i];
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                return new rmGC46IMKtRlsjzf4LFnjhjpsz[i];
            case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                return new gElQ3Q9ZHXy5F6j[i];
            case 9:
                return new gjJSYRXNQYALPwuWEJb5HLx[i];
            case 10:
                return new WMrYE5mAr1lCj64D[i];
            case 11:
                return new neCTKJPHujsSxgUr6c[i];
            case 12:
                return new TOzjEyj2IN5fWYir[i];
            case 13:
                return new m02hASdoCdjELH0[i];
            case 14:
                return new ParcelImpl[i];
            case 15:
                return new QFMjeZ4cxQ3YufrAYm9ASX0UYkVmV[i];
            default:
                return new XpKiPgWTE4o42v0M2im[i];
        }
    }
}
