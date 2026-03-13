package com.vdodsodjsdt;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ddDbMgQuo9affXXIMNMhQZaG3<S> extends cL3uFygUcBAb {
    public View BJQHddi0Plr5ElWetCyaixWOg9;
    public o0x3OWMw3He GE1sqSYiEYQO2ew7WEZwTtUeS5;
    public RecyclerView H2VFYNJEVGAX;
    public TOzjEyj2IN5fWYir KYZ9RyuOc42A2J;
    public View Z1FjjMJ0suz8AFI7gsA4GDLMXv;
    public View bjhcQ0u7VT2OYYrwk96HrWoN;
    public MaterialButton mhUCRR8ceqc7mAozW;
    public AccessibilityManager rE05n5RsRkyWKIeA9cmLXAKv4Hze;
    public RecyclerView rERAmyEtGV6ANGszuKcQI;
    public View tFRdVJAePmTx77bP7FAN0uI;
    public int vXWl0o6I4U59CgHs9;
    public XMlqHp2sNChQxkYAA wdI7vzA3Qmcwd;
    public int zOk739gUM7zIZC25HHUxoiyixWFjn;

    public final void HVEwbdULInpTNa0IG(int i) {
        this.zOk739gUM7zIZC25HHUxoiyixWFjn = i;
        if (i == 2) {
            this.rERAmyEtGV6ANGszuKcQI.getLayoutManager().tpEo0fy9FaoJYrSFHRfIK6(this.KYZ9RyuOc42A2J.LaeGQIruHQu81hfJldjMOQSVblH3x - ((rbJyoP3kTyPbbvOwcqsV9I) this.rERAmyEtGV6ANGszuKcQI.getAdapter()).ZfQNn8hdWlEQ5cR94249PDsLR.wdI7vzA3Qmcwd.V57tEvNfxZVVcOCAOih5PKr.LaeGQIruHQu81hfJldjMOQSVblH3x);
            this.BJQHddi0Plr5ElWetCyaixWOg9.setVisibility(0);
            this.tFRdVJAePmTx77bP7FAN0uI.setVisibility(8);
            this.Z1FjjMJ0suz8AFI7gsA4GDLMXv.setVisibility(8);
            this.bjhcQ0u7VT2OYYrwk96HrWoN.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.BJQHddi0Plr5ElWetCyaixWOg9.setVisibility(8);
            this.tFRdVJAePmTx77bP7FAN0uI.setVisibility(0);
            this.Z1FjjMJ0suz8AFI7gsA4GDLMXv.setVisibility(0);
            this.bjhcQ0u7VT2OYYrwk96HrWoN.setVisibility(0);
            O1xDAlBZZlZdoEf747lCFHld(this.KYZ9RyuOc42A2J);
        }
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final void Irh5auREsoeV1C1RaBamlmy(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.vXWl0o6I4U59CgHs9);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.wdI7vzA3Qmcwd);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.KYZ9RyuOc42A2J);
    }

    public final void O1xDAlBZZlZdoEf747lCFHld(TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir) {
        com.google.android.material.datepicker.zApUME12W6SOuCVHxVPKvzGb3V zapume12w6soucvhxvpkvzgb3v = (com.google.android.material.datepicker.zApUME12W6SOuCVHxVPKvzGb3V) this.H2VFYNJEVGAX.getAdapter();
        int iZfQNn8hdWlEQ5cR94249PDsLR = zapume12w6soucvhxvpkvzgb3v.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR(tOzjEyj2IN5fWYir);
        AccessibilityManager accessibilityManager = this.rE05n5RsRkyWKIeA9cmLXAKv4Hze;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iZfQNn8hdWlEQ5cR94249PDsLR2 = iZfQNn8hdWlEQ5cR94249PDsLR - zapume12w6soucvhxvpkvzgb3v.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR(this.KYZ9RyuOc42A2J);
            boolean z = Math.abs(iZfQNn8hdWlEQ5cR94249PDsLR2) > 3;
            boolean z2 = iZfQNn8hdWlEQ5cR94249PDsLR2 > 0;
            this.KYZ9RyuOc42A2J = tOzjEyj2IN5fWYir;
            if (z && z2) {
                this.H2VFYNJEVGAX.KYZ9RyuOc42A2J(iZfQNn8hdWlEQ5cR94249PDsLR - 3);
                this.H2VFYNJEVGAX.post(new WRVe1iRhTJq3tx(this, iZfQNn8hdWlEQ5cR94249PDsLR, 2));
            } else if (z) {
                this.H2VFYNJEVGAX.KYZ9RyuOc42A2J(iZfQNn8hdWlEQ5cR94249PDsLR + 3);
                this.H2VFYNJEVGAX.post(new WRVe1iRhTJq3tx(this, iZfQNn8hdWlEQ5cR94249PDsLR, 2));
            } else {
                this.H2VFYNJEVGAX.post(new WRVe1iRhTJq3tx(this, iZfQNn8hdWlEQ5cR94249PDsLR, 2));
            }
        } else {
            this.KYZ9RyuOc42A2J = tOzjEyj2IN5fWYir;
            this.H2VFYNJEVGAX.KYZ9RyuOc42A2J(iZfQNn8hdWlEQ5cR94249PDsLR);
        }
        y1NaPKTl7R18DOr6e8i5(iZfQNn8hdWlEQ5cR94249PDsLR);
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final View jW7EiD0YL6xkbB158jMUzhWNWb1y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        cdk572h5yJaCskzyOrCOHZO cdk572h5yjacskzyorcohzo;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(NSjgqmGjEzuugn2SsG1mZFP(), this.vXWl0o6I4U59CgHs9);
        this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = new o0x3OWMw3He(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.rE05n5RsRkyWKIeA9cmLXAKv4Hze = (AccessibilityManager) SuB3hEmTmbbRGAhtvOOmfKEon().getSystemService("accessibility");
        TOzjEyj2IN5fWYir tOzjEyj2IN5fWYir = this.wdI7vzA3Qmcwd.V57tEvNfxZVVcOCAOih5PKr;
        if (w2TYlQMpBW0H.qygqjTppWwx992(contextThemeWrapper, android.R.attr.windowFullscreen)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = SuB3hEmTmbbRGAhtvOOmfKEon().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = gT3fv8cpdkqxygz.ZfQNn8hdWlEQ5cR94249PDsLR;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(gridView, new H1cfFcamW7T7(0));
        int i4 = this.wdI7vzA3Qmcwd.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new dxywz4LlA5tIpL6szWECx7Qp0(i4) : new dxywz4LlA5tIpL6szWECx7Qp0()));
        gridView.setNumColumns(tOzjEyj2IN5fWYir.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        gridView.setEnabled(false);
        this.H2VFYNJEVGAX = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        this.H2VFYNJEVGAX.setLayoutManager(new gYDwJ8CKxQrOpMRPmKRK8x(this, i2, i2));
        this.H2VFYNJEVGAX.setTag("MONTHS_VIEW_GROUP_TAG");
        com.google.android.material.datepicker.zApUME12W6SOuCVHxVPKvzGb3V zapume12w6soucvhxvpkvzgb3v = new com.google.android.material.datepicker.zApUME12W6SOuCVHxVPKvzGb3V(contextThemeWrapper, this.wdI7vzA3Qmcwd, new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(26, this));
        this.H2VFYNJEVGAX.setAdapter(zapume12w6soucvhxvpkvzgb3v);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.rERAmyEtGV6ANGszuKcQI = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.rERAmyEtGV6ANGszuKcQI.setLayoutManager(new GridLayoutManager(integer));
            this.rERAmyEtGV6ANGszuKcQI.setAdapter(new rbJyoP3kTyPbbvOwcqsV9I(this));
            RecyclerView recyclerView4 = this.rERAmyEtGV6ANGszuKcQI;
            b3wZlj76aq b3wzlj76aq = new b3wZlj76aq();
            mkWvedkJ40E0CXleCgI.V57tEvNfxZVVcOCAOih5PKr(null);
            mkWvedkJ40E0CXleCgI.V57tEvNfxZVVcOCAOih5PKr(null);
            recyclerView4.ZLZeBXTMq0zDztBxtRTuCHrapQ(b3wzlj76aq);
        }
        View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
        XMlqHp2sNChQxkYAA xMlqHp2sNChQxkYAA = zapume12w6soucvhxvpkvzgb3v.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (viewFindViewById != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            this.mhUCRR8ceqc7mAozW = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(this.mhUCRR8ceqc7mAozW, new powVRICeb3L1(2, this));
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_previous);
            this.Z1FjjMJ0suz8AFI7gsA4GDLMXv = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById3 = viewInflate.findViewById(R.id.month_navigation_next);
            this.bjhcQ0u7VT2OYYrwk96HrWoN = viewFindViewById3;
            viewFindViewById3.setTag("NAVIGATION_NEXT_TAG");
            this.BJQHddi0Plr5ElWetCyaixWOg9 = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.tFRdVJAePmTx77bP7FAN0uI = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            HVEwbdULInpTNa0IG(1);
            this.mhUCRR8ceqc7mAozW.setText(this.KYZ9RyuOc42A2J.V57tEvNfxZVVcOCAOih5PKr());
            this.H2VFYNJEVGAX.NSjgqmGjEzuugn2SsG1mZFP(new cpEW7wrBHj(this, zapume12w6soucvhxvpkvzgb3v));
            this.mhUCRR8ceqc7mAozW.setOnClickListener(new wGfZDRl3Th9(2, this));
            this.bjhcQ0u7VT2OYYrwk96HrWoN.setOnClickListener(new UHvbXkh4dyB077F7trAwSu(this, zapume12w6soucvhxvpkvzgb3v, 1));
            this.Z1FjjMJ0suz8AFI7gsA4GDLMXv.setOnClickListener(new UHvbXkh4dyB077F7trAwSu(this, zapume12w6soucvhxvpkvzgb3v, 0));
            y1NaPKTl7R18DOr6e8i5(xMlqHp2sNChQxkYAA.V57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR(this.KYZ9RyuOc42A2J));
        }
        if (!w2TYlQMpBW0H.qygqjTppWwx992(contextThemeWrapper, android.R.attr.windowFullscreen) && (recyclerView2 = (cdk572h5yjacskzyorcohzo = new cdk572h5yJaCskzyOrCOHZO()).VxUQ9tBhpHJ2AAEDNW8sghc4m) != (recyclerView = this.H2VFYNJEVGAX)) {
            SSpGxJ755tMUcc sSpGxJ755tMUcc = cdk572h5yjacskzyorcohzo.zzpBGItXfub0yWj;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.bjhcQ0u7VT2OYYrwk96HrWoN;
                if (arrayList != null) {
                    arrayList.remove(sSpGxJ755tMUcc);
                }
                cdk572h5yjacskzyorcohzo.VxUQ9tBhpHJ2AAEDNW8sghc4m.setOnFlingListener(null);
            }
            cdk572h5yjacskzyorcohzo.VxUQ9tBhpHJ2AAEDNW8sghc4m = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() != null) {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
                cdk572h5yjacskzyorcohzo.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP(sSpGxJ755tMUcc);
                cdk572h5yjacskzyorcohzo.VxUQ9tBhpHJ2AAEDNW8sghc4m.setOnFlingListener(cdk572h5yjacskzyorcohzo);
                new Scroller(cdk572h5yjacskzyorcohzo.VxUQ9tBhpHJ2AAEDNW8sghc4m.getContext(), new DecelerateInterpolator());
                cdk572h5yjacskzyorcohzo.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            }
        }
        this.H2VFYNJEVGAX.KYZ9RyuOc42A2J(xMlqHp2sNChQxkYAA.V57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR(this.KYZ9RyuOc42A2J));
        xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(this.H2VFYNJEVGAX, new H1cfFcamW7T7(1));
        return viewInflate;
    }

    @Override // com.vdodsodjsdt.dip85SLOWSmNG3
    public final void ko09zE6UAgwkV(Bundle bundle) {
        super.ko09zE6UAgwkV(bundle);
        if (bundle == null) {
            bundle = this.NSjgqmGjEzuugn2SsG1mZFP;
        }
        this.vXWl0o6I4U59CgHs9 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.wdI7vzA3Qmcwd = (XMlqHp2sNChQxkYAA) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.KYZ9RyuOc42A2J = (TOzjEyj2IN5fWYir) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final void y1NaPKTl7R18DOr6e8i5(int i) {
        this.bjhcQ0u7VT2OYYrwk96HrWoN.setEnabled(i + 1 < this.H2VFYNJEVGAX.getAdapter().VxUQ9tBhpHJ2AAEDNW8sghc4m());
        this.Z1FjjMJ0suz8AFI7gsA4GDLMXv.setEnabled(i - 1 >= 0);
    }
}
