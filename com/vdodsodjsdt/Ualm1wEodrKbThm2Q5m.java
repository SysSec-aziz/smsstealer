package com.vdodsodjsdt;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Ualm1wEodrKbThm2Q5m extends SpannableStringBuilder {
    public final Class V57tEvNfxZVVcOCAOih5PKr;
    public final ArrayList ZfQNn8hdWlEQ5cR94249PDsLR;

    public Ualm1wEodrKbThm2Q5m(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList();
        KfeOQNOupsCg6878zi4e.KUYypEB4eNWOZWVDpH(cls, "watcherClass cannot be null");
        this.V57tEvNfxZVVcOCAOih5PKr = cls;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i >= arrayList.size()) {
                return;
            }
            ((mnmqw2CHhrpV6T668wLIqBWy) arrayList.get(i)).ZfQNn8hdWlEQ5cR94249PDsLR.decrementAndGet();
            i++;
        }
    }

    public final mnmqw2CHhrpV6T668wLIqBWy V57tEvNfxZVVcOCAOih5PKr(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i >= arrayList.size()) {
                return null;
            }
            mnmqw2CHhrpV6T668wLIqBWy mnmqw2chhrpv6t668wliqbwy = (mnmqw2CHhrpV6T668wLIqBWy) arrayList.get(i);
            if (mnmqw2chhrpv6t668wliqbwy.V57tEvNfxZVVcOCAOih5PKr == obj) {
                return mnmqw2chhrpv6t668wliqbwy;
            }
            i++;
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i >= arrayList.size()) {
                return;
            }
            ((mnmqw2CHhrpV6T668wLIqBWy) arrayList.get(i)).ZfQNn8hdWlEQ5cR94249PDsLR.incrementAndGet();
            i++;
        }
    }

    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR(Object obj) {
        if (obj != null) {
            return this.V57tEvNfxZVVcOCAOih5PKr == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        mnmqw2CHhrpV6T668wLIqBWy mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr;
        if (ZfQNn8hdWlEQ5cR94249PDsLR(obj) && (mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(obj)) != null) {
            obj = mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        mnmqw2CHhrpV6T668wLIqBWy mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr;
        if (ZfQNn8hdWlEQ5cR94249PDsLR(obj) && (mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(obj)) != null) {
            obj = mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        mnmqw2CHhrpV6T668wLIqBWy mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr;
        if (ZfQNn8hdWlEQ5cR94249PDsLR(obj) && (mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(obj)) != null) {
            obj = mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.V57tEvNfxZVVcOCAOih5PKr != cls) {
            return super.getSpans(i, i2, cls);
        }
        mnmqw2CHhrpV6T668wLIqBWy[] mnmqw2chhrpv6t668wliqbwyArr = (mnmqw2CHhrpV6T668wLIqBWy[]) super.getSpans(i, i2, mnmqw2CHhrpV6T668wLIqBWy.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, mnmqw2chhrpv6t668wliqbwyArr.length);
        for (int i3 = 0; i3 < mnmqw2chhrpv6t668wliqbwyArr.length; i3++) {
            objArr[i3] = mnmqw2chhrpv6t668wliqbwyArr[i3].V57tEvNfxZVVcOCAOih5PKr;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.V57tEvNfxZVVcOCAOih5PKr == cls) {
            cls = mnmqw2CHhrpV6T668wLIqBWy.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        mnmqw2CHhrpV6T668wLIqBWy mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr;
        if (ZfQNn8hdWlEQ5cR94249PDsLR(obj)) {
            mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(obj);
            if (mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr != null) {
                obj = mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr;
            }
        } else {
            mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr = null;
        }
        super.removeSpan(obj);
        if (mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr != null) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.remove(mnmqw2chhrpv6t668wliqbwyV57tEvNfxZVVcOCAOih5PKr);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (ZfQNn8hdWlEQ5cR94249PDsLR(obj)) {
            mnmqw2CHhrpV6T668wLIqBWy mnmqw2chhrpv6t668wliqbwy = new mnmqw2CHhrpV6T668wLIqBWy(obj);
            this.ZfQNn8hdWlEQ5cR94249PDsLR.add(mnmqw2chhrpv6t668wliqbwy);
            obj = mnmqw2chhrpv6t668wliqbwy;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new Ualm1wEodrKbThm2Q5m(this.V57tEvNfxZVVcOCAOih5PKr, this, i, i2);
    }

    public final void zzpBGItXfub0yWj() {
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i >= arrayList.size()) {
                return;
            }
            ((mnmqw2CHhrpV6T668wLIqBWy) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        super.replace(i, i2, charSequence);
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public Ualm1wEodrKbThm2Q5m(Class cls, Ualm1wEodrKbThm2Q5m ualm1wEodrKbThm2Q5m, int i, int i2) {
        super(ualm1wEodrKbThm2Q5m, i, i2);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList();
        KfeOQNOupsCg6878zi4e.KUYypEB4eNWOZWVDpH(cls, "watcherClass cannot be null");
        this.V57tEvNfxZVVcOCAOih5PKr = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        super.replace(i, i2, charSequence, i3, i4);
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
