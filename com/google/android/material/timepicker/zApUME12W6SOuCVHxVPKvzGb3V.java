package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq;
import com.vdodsodjsdt.jj77w443kpEYEOqOOio;
import com.vdodsodjsdt.wzEak8ZKpNWHd4RKPYQ;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zApUME12W6SOuCVHxVPKvzGb3V extends dOYOTnFcxbQY9kd8M4lnq {
    public final /* synthetic */ ClockFaceView ZfQNn8hdWlEQ5cR94249PDsLR;

    public zApUME12W6SOuCVHxVPKvzGb3V(ClockFaceView clockFaceView) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = clockFaceView;
    }

    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(View view, int i, Bundle bundle) {
        if (i != 16) {
            return super.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        view.getHitRect(clockFaceView.Irh5auREsoeV1C1RaBamlmy);
        float fCenterX = clockFaceView.Irh5auREsoeV1C1RaBamlmy.centerX();
        float fCenterY = clockFaceView.Irh5auREsoeV1C1RaBamlmy.centerY();
        clockFaceView.TaDO7ogis3aEiWEtq.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.TaDO7ogis3aEiWEtq.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }

    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(View view, wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq) {
        AccessibilityNodeInfo accessibilityNodeInfo = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.ZfQNn8hdWlEQ5cR94249PDsLR.RhfGHxtXxy0M0grmp2jkRjQg.get(iIntValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        wzeak8zkpnwhd4rkpyq.zzpBGItXfub0yWj(jj77w443kpEYEOqOOio.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }
}
