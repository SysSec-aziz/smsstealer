package com.vdodsodjsdt;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class powVRICeb3L1 extends dOYOTnFcxbQY9kd8M4lnq {
    public final /* synthetic */ Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ powVRICeb3L1(int i, Object obj) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj;
    }

    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    public void V57tEvNfxZVVcOCAOih5PKr(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            case 0:
                super.V57tEvNfxZVVcOCAOih5PKr(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.LaeGQIruHQu81hfJldjMOQSVblH3x).zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                break;
            default:
                super.V57tEvNfxZVVcOCAOih5PKr(view, accessibilityEvent);
                break;
        }
    }

    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(View view, wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq) {
        int i;
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Object obj = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        View.AccessibilityDelegate accessibilityDelegate = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        switch (i2) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                accessibilityNodeInfo.setChecked(checkableImageButton.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.jW7EiD0YL6xkbB158jMUzhWNWb1y;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i5).getVisibility() != 8) {
                                i4++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).pYmKDYlAmhudp));
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag3 = (ddDbMgQuo9affXXIMNMhQZaG3) obj;
                wzeak8zkpnwhd4rkpyq.zzpBGItXfub0yWj(new jj77w443kpEYEOqOOio(dddbmgquo9affxximnmhqzag3.tFRdVJAePmTx77bP7FAN0uI.getVisibility() == 0 ? dddbmgquo9affxximnmhqzag3.SuB3hEmTmbbRGAhtvOOmfKEon().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : dddbmgquo9affxximnmhqzag3.SuB3hEmTmbbRGAhtvOOmfKEon().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection), 16));
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).RhfGHxtXxy0M0grmp2jkRjQg);
                break;
        }
    }
}
