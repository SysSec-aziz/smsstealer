package com.vdodsodjsdt;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class wzEak8ZKpNWHd4RKPYQ {
    public static int V57tEvNfxZVVcOCAOih5PKr;
    public final AccessibilityNodeInfo VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int zzpBGItXfub0yWj = -1;

    public wzEak8ZKpNWHd4RKPYQ(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = accessibilityNodeInfo;
    }

    public static String ZfQNn8hdWlEQ5cR94249PDsLR(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return "ACTION_SELECT";
            case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case android.R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case android.R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case android.R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case android.R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case android.R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case android.R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case android.R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case android.R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case android.R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case android.R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case android.R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case android.R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case android.R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case android.R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case android.R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case android.R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case android.R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case android.R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case android.R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case android.R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case android.R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final void GI83zq0G8e7zkn(CharSequence charSequence) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.setClassName(charSequence);
    }

    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x(int i) {
        Bundle extras = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final void M9e7PWhFYLD2lOGMker(CharSequence charSequence) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.setText(charSequence);
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP(int i, boolean z) {
        Bundle extras = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final ArrayList V57tEvNfxZVVcOCAOih5PKr(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.addAction(i);
    }

    public final CharSequence ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        boolean zIsEmpty = V57tEvNfxZVVcOCAOih5PKr("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListV57tEvNfxZVVcOCAOih5PKr2 = V57tEvNfxZVVcOCAOih5PKr("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListV57tEvNfxZVVcOCAOih5PKr3 = V57tEvNfxZVVcOCAOih5PKr("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListV57tEvNfxZVVcOCAOih5PKr4 = V57tEvNfxZVVcOCAOih5PKr("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < arrayListV57tEvNfxZVVcOCAOih5PKr.size(); i++) {
            spannableString.setSpan(new k46gnOnQewHI6hgm(((Integer) arrayListV57tEvNfxZVVcOCAOih5PKr4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListV57tEvNfxZVVcOCAOih5PKr.get(i)).intValue(), ((Integer) arrayListV57tEvNfxZVVcOCAOih5PKr2.get(i)).intValue(), ((Integer) arrayListV57tEvNfxZVVcOCAOih5PKr3.get(i)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wzEak8ZKpNWHd4RKPYQ)) {
            return false;
        }
        wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq = (wzEak8ZKpNWHd4RKPYQ) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.zzpBGItXfub0yWj == wzeak8zkpnwhd4rkpyq.zzpBGItXfub0yWj;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            lCRYuW4DMv8M.V57tEvNfxZVVcOCAOih5PKr(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(ZLZeBXTMq0zDztBxtRTuCHrapQ());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? AuWCPdlLhOuIvGOGYC9mCLNVz.VxUQ9tBhpHJ2AAEDNW8sghc4m(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(i >= 36 ? TsD9eeztji4NblKmSt11.ZfQNn8hdWlEQ5cR94249PDsLR(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? OHRoAMjK5gn3.ZfQNn8hdWlEQ5cR94249PDsLR(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = i >= 36 ? TsD9eeztji4NblKmSt11.VxUQ9tBhpHJ2AAEDNW8sghc4m(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb.append(iVxUQ9tBhpHJ2AAEDNW8sghc4m == 1 ? "TRUE" : iVxUQ9tBhpHJ2AAEDNW8sghc4m == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(i >= 36 ? TsD9eeztji4NblKmSt11.LaeGQIruHQu81hfJldjMOQSVblH3x(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; expandedState: ");
        int iV57tEvNfxZVVcOCAOih5PKr = i >= 36 ? TsD9eeztji4NblKmSt11.V57tEvNfxZVVcOCAOih5PKr(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (iV57tEvNfxZVVcOCAOih5PKr == 0) {
            str = "UNDEFINED";
        } else if (iV57tEvNfxZVVcOCAOih5PKr == 1) {
            str = "COLLAPSED";
        } else if (iV57tEvNfxZVVcOCAOih5PKr != 2) {
            str = iV57tEvNfxZVVcOCAOih5PKr != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? lCRYuW4DMv8M.ZfQNn8hdWlEQ5cR94249PDsLR(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(LaeGQIruHQu81hfJldjMOQSVblH3x(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? OHRoAMjK5gn3.LaeGQIruHQu81hfJldjMOQSVblH3x(accessibilityNodeInfo) : LaeGQIruHQu81hfJldjMOQSVblH3x(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? lCRYuW4DMv8M.ZLZeBXTMq0zDztBxtRTuCHrapQ(accessibilityNodeInfo) : LaeGQIruHQu81hfJldjMOQSVblH3x(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new jj77w443kpEYEOqOOio(actionList.get(i2), 0, null, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            jj77w443kpEYEOqOOio jj77w443kpeyeoqooio = (jj77w443kpEYEOqOOio) arrayList.get(i3);
            int iVxUQ9tBhpHJ2AAEDNW8sghc4m2 = jj77w443kpeyeoqooio.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            Object obj = jj77w443kpeyeoqooio.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            String strZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(iVxUQ9tBhpHJ2AAEDNW8sghc4m2);
            if (strZfQNn8hdWlEQ5cR94249PDsLR.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strZfQNn8hdWlEQ5cR94249PDsLR = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb.append(strZfQNn8hdWlEQ5cR94249PDsLR);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Rect rect) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getBoundsInParent(rect);
    }

    public final void zzpBGItXfub0yWj(jj77w443kpEYEOqOOio jj77w443kpeyeoqooio) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.addAction((AccessibilityNodeInfo.AccessibilityAction) jj77w443kpeyeoqooio.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }
}
