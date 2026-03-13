package com.vdodsodjsdt;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class TOzjEyj2IN5fWYir implements Comparable, Parcelable {
    public static final Parcelable.Creator<TOzjEyj2IN5fWYir> CREATOR = new xwyoXom4A1CgVdlXMk(12);
    public String GI83zq0G8e7zkn;
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final long NSjgqmGjEzuugn2SsG1mZFP;
    public final Calendar V57tEvNfxZVVcOCAOih5PKr;
    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public TOzjEyj2IN5fWYir(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarVxUQ9tBhpHJ2AAEDNW8sghc4m = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m(calendar);
        this.V57tEvNfxZVVcOCAOih5PKr = calendarVxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.get(2);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.get(1);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.getMaximum(7);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.getActualMaximum(5);
        this.NSjgqmGjEzuugn2SsG1mZFP = calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.getTimeInMillis();
    }

    public static TOzjEyj2IN5fWYir VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, int i2) {
        Calendar calendarV57tEvNfxZVVcOCAOih5PKr = mkWvedkJ40E0CXleCgI.V57tEvNfxZVVcOCAOih5PKr(null);
        calendarV57tEvNfxZVVcOCAOih5PKr.set(1, i);
        calendarV57tEvNfxZVVcOCAOih5PKr.set(2, i2);
        return new TOzjEyj2IN5fWYir(calendarV57tEvNfxZVVcOCAOih5PKr);
    }

    public static TOzjEyj2IN5fWYir zzpBGItXfub0yWj(long j) {
        Calendar calendarV57tEvNfxZVVcOCAOih5PKr = mkWvedkJ40E0CXleCgI.V57tEvNfxZVVcOCAOih5PKr(null);
        calendarV57tEvNfxZVVcOCAOih5PKr.setTimeInMillis(j);
        return new TOzjEyj2IN5fWYir(calendarV57tEvNfxZVVcOCAOih5PKr);
    }

    public final String V57tEvNfxZVVcOCAOih5PKr() {
        if (this.GI83zq0G8e7zkn == null) {
            long timeInMillis = this.V57tEvNfxZVVcOCAOih5PKr.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.GI83zq0G8e7zkn = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.GI83zq0G8e7zkn;
    }

    public final int ZfQNn8hdWlEQ5cR94249PDsLR(TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir) {
        if (!(this.V57tEvNfxZVVcOCAOih5PKr instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (tOzjEyj2IN5fWYir.ZfQNn8hdWlEQ5cR94249PDsLR - this.ZfQNn8hdWlEQ5cR94249PDsLR) + ((tOzjEyj2IN5fWYir.LaeGQIruHQu81hfJldjMOQSVblH3x - this.LaeGQIruHQu81hfJldjMOQSVblH3x) * 12);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.V57tEvNfxZVVcOCAOih5PKr.compareTo(((TOzjEyj2IN5fWYir) obj).V57tEvNfxZVVcOCAOih5PKr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TOzjEyj2IN5fWYir)) {
            return false;
        }
        TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir = (TOzjEyj2IN5fWYir) obj;
        return this.ZfQNn8hdWlEQ5cR94249PDsLR == tOzjEyj2IN5fWYir.ZfQNn8hdWlEQ5cR94249PDsLR && this.LaeGQIruHQu81hfJldjMOQSVblH3x == tOzjEyj2IN5fWYir.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.ZfQNn8hdWlEQ5cR94249PDsLR), Integer.valueOf(this.LaeGQIruHQu81hfJldjMOQSVblH3x)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        parcel.writeInt(this.ZfQNn8hdWlEQ5cR94249PDsLR);
    }
}
