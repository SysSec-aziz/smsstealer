package com.vdodsodjsdt;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class w2TYlQMpBW0H<S> extends NbdCSfBzv70H3 {
    public boolean AFOcXGdvoTMuqwiG8tD;
    public int BDoqAMf0rlMRAnVghjC4qjG;
    public ddDbMgQuo9affXXIMNMhQZaG3 ByTQIhgl7ezGvHXEd;
    public TextView DNP7yXLsojH0rPMHr8fUY14M;
    public int G479XgNG9rK8jPPbSXr;
    public XMlqHp2sNChQxkYAA HAPpjhiCsV9ONY23505HCBI9IX;
    public CharSequence Hf6zp5JYLjGyFD2HXbpHA9;
    public CharSequence KMiA9Sqk243eQkFNNoS;
    public CharSequence Pf1HsU8AK92buCoUaexm5AC;
    public EQz8nVyVxmIrHN6fNCQWutFG0b30O PfK8qHOJoCLG;
    public boolean ScSj9HEorWkb3bIb1HyeKVoW;
    public CharSequence VOvSEdhaZyc0oOGQ8;
    public CharSequence e1gEV3X9xwmHj;
    public int h2b7InwIaORKN91X7whfQh4;
    public int lxWWbfAOLs4jWzd7PSIiIJ;
    public CheckableImageButton nNOZCSz1a7S;
    public final LinkedHashSet p6bBrs4p3Ly;
    public CharSequence pCrI77IVeIpJnmCUHd;
    public CharSequence r0dB0ojIy6g8mnk1;
    public final LinkedHashSet rE05n5RsRkyWKIeA9cmLXAKv4Hze;
    public int tpEo0fy9FaoJYrSFHRfIK6;
    public int ubNpdCC1pl7L;
    public cL3uFygUcBAb wR7sbzHKf9hYV1lxoS6nqyszepWvN;
    public int zyiF0wv9HozxGOIDt8PvVp;

    public w2TYlQMpBW0H() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.rE05n5RsRkyWKIeA9cmLXAKv4Hze = new LinkedHashSet();
        this.p6bBrs4p3Ly = new LinkedHashSet();
    }

    public static boolean qygqjTppWwx992(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ej6unYlOWMDF.wdI7vzA3Qmcwd(R.attr.materialCalendarStyle, context, ddDbMgQuo9affXXIMNMhQZaG3.class.getCanonicalName()).data, new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    public static int y1NaPKTl7R18DOr6e8i5(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar calendarZzpBGItXfub0yWj = mkWvedkJ40E0CXleCgI.zzpBGItXfub0yWj();
        calendarZzpBGItXfub0yWj.set(5, 1);
        Calendar calendarVxUQ9tBhpHJ2AAEDNW8sghc4m = mkWvedkJ40E0CXleCgI.VxUQ9tBhpHJ2AAEDNW8sghc4m(calendarZzpBGItXfub0yWj);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.get(2);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.get(1);
        int maximum = calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.getMaximum(7);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.getActualMaximum(5);
        calendarVxUQ9tBhpHJ2AAEDNW8sghc4m.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public final void HVEwbdULInpTNa0IG() {
        if (this.NSjgqmGjEzuugn2SsG1mZFP.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.vdodsodjsdt.NbdCSfBzv70H3, com.vdodsodjsdt.dip85SLOWSmNG3
    public final void Irh5auREsoeV1C1RaBamlmy(Bundle bundle) {
        super.Irh5auREsoeV1C1RaBamlmy(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.ubNpdCC1pl7L);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        XMlqHp2sNChQxkYAA xMlqHp2sNChQxkYAA = this.HAPpjhiCsV9ONY23505HCBI9IX;
        A0nl3cuOUYJuJt4qOpTbU a0nl3cuOUYJuJt4qOpTbU = new A0nl3cuOUYJuJt4qOpTbU();
        int i = A0nl3cuOUYJuJt4qOpTbU.zzpBGItXfub0yWj;
        int i2 = A0nl3cuOUYJuJt4qOpTbU.zzpBGItXfub0yWj;
        long j = xMlqHp2sNChQxkYAA.V57tEvNfxZVVcOCAOih5PKr.NSjgqmGjEzuugn2SsG1mZFP;
        long j2 = xMlqHp2sNChQxkYAA.ZfQNn8hdWlEQ5cR94249PDsLR.NSjgqmGjEzuugn2SsG1mZFP;
        a0nl3cuOUYJuJt4qOpTbU.VxUQ9tBhpHJ2AAEDNW8sghc4m = Long.valueOf(xMlqHp2sNChQxkYAA.zIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP);
        int i3 = xMlqHp2sNChQxkYAA.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        wIfNfljSFD2BnwQk6jI wifnfljsfd2bnwqk6ji = xMlqHp2sNChQxkYAA.LaeGQIruHQu81hfJldjMOQSVblH3x;
        ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag3 = this.ByTQIhgl7ezGvHXEd;
        TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir = dddbmgquo9affxximnmhqzag3 == null ? null : dddbmgquo9affxximnmhqzag3.KYZ9RyuOc42A2J;
        if (tOzjEyj2IN5fWYir != null) {
            a0nl3cuOUYJuJt4qOpTbU.VxUQ9tBhpHJ2AAEDNW8sghc4m = Long.valueOf(tOzjEyj2IN5fWYir.NSjgqmGjEzuugn2SsG1mZFP);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", wifnfljsfd2bnwqk6ji);
        TOzjEyj2IN5fWYir tOzjEyj2IN5fWYirZzpBGItXfub0yWj = TOzjEyj2IN5fWYir.zzpBGItXfub0yWj(j);
        TOzjEyj2IN5fWYir tOzjEyj2IN5fWYirZzpBGItXfub0yWj2 = TOzjEyj2IN5fWYir.zzpBGItXfub0yWj(j2);
        wIfNfljSFD2BnwQk6jI wifnfljsfd2bnwqk6ji2 = (wIfNfljSFD2BnwQk6jI) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = a0nl3cuOUYJuJt4qOpTbU.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new XMlqHp2sNChQxkYAA(tOzjEyj2IN5fWYirZzpBGItXfub0yWj, tOzjEyj2IN5fWYirZzpBGItXfub0yWj2, wifnfljsfd2bnwqk6ji2, l == null ? null : TOzjEyj2IN5fWYir.zzpBGItXfub0yWj(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.tpEo0fy9FaoJYrSFHRfIK6);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.e1gEV3X9xwmHj);
        bundle.putInt("INPUT_MODE_KEY", this.BDoqAMf0rlMRAnVghjC4qjG);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.lxWWbfAOLs4jWzd7PSIiIJ);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.VOvSEdhaZyc0oOGQ8);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.h2b7InwIaORKN91X7whfQh4);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.r0dB0ojIy6g8mnk1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.G479XgNG9rK8jPPbSXr);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.Pf1HsU8AK92buCoUaexm5AC);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.zyiF0wv9HozxGOIDt8PvVp);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.KMiA9Sqk243eQkFNNoS);
    }

    @Override // com.vdodsodjsdt.NbdCSfBzv70H3
    public final Dialog O1xDAlBZZlZdoEf747lCFHld() {
        Context contextSuB3hEmTmbbRGAhtvOOmfKEon = SuB3hEmTmbbRGAhtvOOmfKEon();
        SuB3hEmTmbbRGAhtvOOmfKEon();
        int i = this.ubNpdCC1pl7L;
        if (i == 0) {
            HVEwbdULInpTNa0IG();
            throw null;
        }
        Dialog dialog = new Dialog(contextSuB3hEmTmbbRGAhtvOOmfKEon, i);
        Context context = dialog.getContext();
        this.AFOcXGdvoTMuqwiG8tD = qygqjTppWwx992(context, android.R.attr.windowFullscreen);
        this.PfK8qHOJoCLG = new EQz8nVyVxmIrHN6fNCQWutFG0b30O(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, PGobtLpyfPC4TCnlq740.q1wNbhk2O6, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.PfK8qHOJoCLG.HzCpKshMOoaw76hFcbOVRYMeRd(context);
        this.PfK8qHOJoCLG.p59rPv72J9(ColorStateList.valueOf(color));
        this.PfK8qHOJoCLG.q1wNbhk2O6(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final View jW7EiD0YL6xkbB158jMUzhWNWb1y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(this.AFOcXGdvoTMuqwiG8tD ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        if (this.AFOcXGdvoTMuqwiG8tD) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(y1NaPKTl7R18DOr6e8i5(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(y1NaPKTl7R18DOr6e8i5(context), -1));
        }
        ((TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.nNOZCSz1a7S = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.DNP7yXLsojH0rPMHr8fUY14M = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.nNOZCSz1a7S.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.nNOZCSz1a7S;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.nNOZCSz1a7S.setChecked(this.BDoqAMf0rlMRAnVghjC4qjG != 0);
        xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(this.nNOZCSz1a7S, null);
        CheckableImageButton checkableImageButton2 = this.nNOZCSz1a7S;
        this.nNOZCSz1a7S.setContentDescription(this.BDoqAMf0rlMRAnVghjC4qjG == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.nNOZCSz1a7S.setOnClickListener(new PHkrA4TK1mlS6GdfRS6(2, this));
        HVEwbdULInpTNa0IG();
        throw null;
    }

    @Override // com.vdodsodjsdt.NbdCSfBzv70H3, com.vdodsodjsdt.dip85SLOWSmNG3
    public final void ko09zE6UAgwkV(Bundle bundle) {
        super.ko09zE6UAgwkV(bundle);
        if (bundle == null) {
            bundle = this.NSjgqmGjEzuugn2SsG1mZFP;
        }
        this.ubNpdCC1pl7L = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.HAPpjhiCsV9ONY23505HCBI9IX = (XMlqHp2sNChQxkYAA) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.tpEo0fy9FaoJYrSFHRfIK6 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.e1gEV3X9xwmHj = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.BDoqAMf0rlMRAnVghjC4qjG = bundle.getInt("INPUT_MODE_KEY");
        this.lxWWbfAOLs4jWzd7PSIiIJ = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.VOvSEdhaZyc0oOGQ8 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.h2b7InwIaORKN91X7whfQh4 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.r0dB0ojIy6g8mnk1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.G479XgNG9rK8jPPbSXr = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.Pf1HsU8AK92buCoUaexm5AC = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.zyiF0wv9HozxGOIDt8PvVp = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.KMiA9Sqk243eQkFNNoS = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.e1gEV3X9xwmHj;
        if (text == null) {
            text = SuB3hEmTmbbRGAhtvOOmfKEon().getResources().getText(this.tpEo0fy9FaoJYrSFHRfIK6);
        }
        this.Hf6zp5JYLjGyFD2HXbpHA9 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.pCrI77IVeIpJnmCUHd = text;
    }

    @Override // com.vdodsodjsdt.NbdCSfBzv70H3, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.rE05n5RsRkyWKIeA9cmLXAKv4Hze.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // com.vdodsodjsdt.NbdCSfBzv70H3, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.p6bBrs4p3Ly.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.HVEwbdULInpTNa0IG;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.vdodsodjsdt.NbdCSfBzv70H3, com.vdodsodjsdt.dip85SLOWSmNG3
    public final void q11o1hieEkZDhF1MGOZI26oZiDT() {
        super.q11o1hieEkZDhF1MGOZI26oZiDT();
        Dialog dialog = this.bjhcQ0u7VT2OYYrwk96HrWoN;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.AFOcXGdvoTMuqwiG8tD) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.PfK8qHOJoCLG);
            if (!this.ScSj9HEorWkb3bIb1HyeKVoW) {
                View viewFindViewById = pzqP2AqKW6J5PO8zCKnW().findViewById(R.id.fullscreen_header);
                ColorStateList colorStateListIrh5auREsoeV1C1RaBamlmy = F44whnLsbQ.Irh5auREsoeV1C1RaBamlmy(viewFindViewById.getBackground());
                Integer numValueOf = colorStateListIrh5auREsoeV1C1RaBamlmy != null ? Integer.valueOf(colorStateListIrh5auREsoeV1C1RaBamlmy.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = numValueOf == null || numValueOf.intValue() == 0;
                int iF6ZQsR6bPLvvCDNXOUc = zonOxHotd3BwAPJcwqr6I6uQNngg4.f6ZQsR6bPLvvCDNXOUc(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    numValueOf = Integer.valueOf(iF6ZQsR6bPLvvCDNXOUc);
                }
                ej6unYlOWMDF.GE1sqSYiEYQO2ew7WEZwTtUeS5(window, false);
                window.getContext();
                int iZfQNn8hdWlEQ5cR94249PDsLR = Build.VERSION.SDK_INT < 27 ? PyYsF2FE67iANgZ0fDkVtNG5uhA.ZfQNn8hdWlEQ5cR94249PDsLR(zonOxHotd3BwAPJcwqr6I6uQNngg4.f6ZQsR6bPLvvCDNXOUc(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iZfQNn8hdWlEQ5cR94249PDsLR);
                boolean z3 = zonOxHotd3BwAPJcwqr6I6uQNngg4.y1NaPKTl7R18DOr6e8i5(0) || zonOxHotd3BwAPJcwqr6I6uQNngg4.y1NaPKTl7R18DOr6e8i5(numValueOf.intValue());
                VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd = new VSncX8ksA0tswc2TMhzhOMdd(window.getDecorView(), 3);
                int i = Build.VERSION.SDK_INT;
                (i >= 35 ? new NWuTAjXTaNfEJ2DQqx(window, vSncX8ksA0tswc2TMhzhOMdd) : i >= 30 ? new TuhwuczhmmFP(window, vSncX8ksA0tswc2TMhzhOMdd) : i >= 26 ? new GsBQSl18H6pNk(window, vSncX8ksA0tswc2TMhzhOMdd) : new bgaCCJBki10uB8(window, vSncX8ksA0tswc2TMhzhOMdd)).rERAmyEtGV6ANGszuKcQI(z3);
                boolean zY1NaPKTl7R18DOr6e8i5 = zonOxHotd3BwAPJcwqr6I6uQNngg4.y1NaPKTl7R18DOr6e8i5(iF6ZQsR6bPLvvCDNXOUc);
                if (zonOxHotd3BwAPJcwqr6I6uQNngg4.y1NaPKTl7R18DOr6e8i5(iZfQNn8hdWlEQ5cR94249PDsLR) || (iZfQNn8hdWlEQ5cR94249PDsLR == 0 && zY1NaPKTl7R18DOr6e8i5)) {
                    z = true;
                }
                VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd2 = new VSncX8ksA0tswc2TMhzhOMdd(window.getDecorView(), 3);
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new NWuTAjXTaNfEJ2DQqx(window, vSncX8ksA0tswc2TMhzhOMdd2) : i2 >= 30 ? new TuhwuczhmmFP(window, vSncX8ksA0tswc2TMhzhOMdd2) : i2 >= 26 ? new GsBQSl18H6pNk(window, vSncX8ksA0tswc2TMhzhOMdd2) : new bgaCCJBki10uB8(window, vSncX8ksA0tswc2TMhzhOMdd2)).GE1sqSYiEYQO2ew7WEZwTtUeS5(z);
                f4mpkplxGMD1Ez3gVc f4mpkplxgmd1ez3gvc = new f4mpkplxGMD1Ez3gVc(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                lJgFFp37ou.M9e7PWhFYLD2lOGMker(viewFindViewById, f4mpkplxgmd1ez3gvc);
                this.ScSj9HEorWkb3bIb1HyeKVoW = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = SuB3hEmTmbbRGAhtvOOmfKEon().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.PfK8qHOJoCLG, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.bjhcQ0u7VT2OYYrwk96HrWoN;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new W7bT5YWUvDlK49WC(dialog2, rect));
        }
        SuB3hEmTmbbRGAhtvOOmfKEon();
        int i3 = this.ubNpdCC1pl7L;
        if (i3 == 0) {
            HVEwbdULInpTNa0IG();
            throw null;
        }
        HVEwbdULInpTNa0IG();
        XMlqHp2sNChQxkYAA xMlqHp2sNChQxkYAA = this.HAPpjhiCsV9ONY23505HCBI9IX;
        ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag3 = new ddDbMgQuo9affXXIMNMhQZaG3();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", xMlqHp2sNChQxkYAA);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", xMlqHp2sNChQxkYAA.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        dddbmgquo9affxximnmhqzag3.vE4yDIjexsP2lGjLaTcB(bundle);
        this.ByTQIhgl7ezGvHXEd = dddbmgquo9affxximnmhqzag3;
        cL3uFygUcBAb cl3ufygucbab = dddbmgquo9affxximnmhqzag3;
        if (this.BDoqAMf0rlMRAnVghjC4qjG == 1) {
            HVEwbdULInpTNa0IG();
            XMlqHp2sNChQxkYAA xMlqHp2sNChQxkYAA2 = this.HAPpjhiCsV9ONY23505HCBI9IX;
            EtMSUTyuo3 etMSUTyuo3 = new EtMSUTyuo3();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i3);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", xMlqHp2sNChQxkYAA2);
            etMSUTyuo3.vE4yDIjexsP2lGjLaTcB(bundle2);
            cl3ufygucbab = etMSUTyuo3;
        }
        this.wR7sbzHKf9hYV1lxoS6nqyszepWvN = cl3ufygucbab;
        this.DNP7yXLsojH0rPMHr8fUY14M.setText((this.BDoqAMf0rlMRAnVghjC4qjG == 1 && SuB3hEmTmbbRGAhtvOOmfKEon().getResources().getConfiguration().orientation == 2) ? this.pCrI77IVeIpJnmCUHd : this.Hf6zp5JYLjGyFD2HXbpHA9);
        HVEwbdULInpTNa0IG();
        throw null;
    }

    @Override // com.vdodsodjsdt.NbdCSfBzv70H3, com.vdodsodjsdt.dip85SLOWSmNG3
    public final void w0Wu95l8dVNw5rZMRu() {
        this.wR7sbzHKf9hYV1lxoS6nqyszepWvN.hKs1wlZyvtUNaW1f5ABIGacfPcvX.clear();
        super.w0Wu95l8dVNw5rZMRu();
    }
}
