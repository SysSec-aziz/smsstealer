package com.vdodsodjsdt;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class aCT3GbmnbjSR1WIJ91ZdreaMG extends Skgk8FYn8b4TvRiBOsElZw4XkNLhQ {
    public final /* synthetic */ PkBeXXwxWaGrzNHNG1JbWG5uMRK zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aCT3GbmnbjSR1WIJ91ZdreaMG(PkBeXXwxWaGrzNHNG1JbWG5uMRK pkBeXXwxWaGrzNHNG1JbWG5uMRK) {
        super(1);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = pkBeXXwxWaGrzNHNG1JbWG5uMRK;
    }

    @Override // com.vdodsodjsdt.Skgk8FYn8b4TvRiBOsElZw4XkNLhQ
    public final wzEak8ZKpNWHd4RKPYQ f6ZQsR6bPLvvCDNXOUc(int i) {
        return new wzEak8ZKpNWHd4RKPYQ(AccessibilityNodeInfo.obtain(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.p59rPv72J9(i).VxUQ9tBhpHJ2AAEDNW8sghc4m));
    }

    @Override // com.vdodsodjsdt.Skgk8FYn8b4TvRiBOsElZw4XkNLhQ
    public final boolean q11o1hieEkZDhF1MGOZI26oZiDT(int i, int i2, Bundle bundle) {
        int i3;
        PkBeXXwxWaGrzNHNG1JbWG5uMRK pkBeXXwxWaGrzNHNG1JbWG5uMRK = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Chip chip = pkBeXXwxWaGrzNHNG1JbWG5uMRK.GI83zq0G8e7zkn;
        if (i == -1) {
            WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return pkBeXXwxWaGrzNHNG1JbWG5uMRK.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i);
        }
        if (i2 == 2) {
            return pkBeXXwxWaGrzNHNG1JbWG5uMRK.M9e7PWhFYLD2lOGMker(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = pkBeXXwxWaGrzNHNG1JbWG5uMRK.NSjgqmGjEzuugn2SsG1mZFP;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = pkBeXXwxWaGrzNHNG1JbWG5uMRK.HzCpKshMOoaw76hFcbOVRYMeRd) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                pkBeXXwxWaGrzNHNG1JbWG5uMRK.HzCpKshMOoaw76hFcbOVRYMeRd = Integer.MIN_VALUE;
                chip.invalidate();
                pkBeXXwxWaGrzNHNG1JbWG5uMRK.pYmKDYlAmhudp(i3, 65536);
            }
            pkBeXXwxWaGrzNHNG1JbWG5uMRK.HzCpKshMOoaw76hFcbOVRYMeRd = i;
            chip.invalidate();
            pkBeXXwxWaGrzNHNG1JbWG5uMRK.pYmKDYlAmhudp(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (pkBeXXwxWaGrzNHNG1JbWG5uMRK.HzCpKshMOoaw76hFcbOVRYMeRd != i) {
                return false;
            }
            pkBeXXwxWaGrzNHNG1JbWG5uMRK.HzCpKshMOoaw76hFcbOVRYMeRd = Integer.MIN_VALUE;
            chip.invalidate();
            pkBeXXwxWaGrzNHNG1JbWG5uMRK.pYmKDYlAmhudp(i, 65536);
            return true;
        }
        Chip chip2 = pkBeXXwxWaGrzNHNG1JbWG5uMRK.p59rPv72J9;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.M9e7PWhFYLD2lOGMker;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.vBGA6pPLqSMuYGvprl270j7) {
                    chip2.f6ZQsR6bPLvvCDNXOUc.pYmKDYlAmhudp(1, 1);
                }
            }
        }
        return z;
    }

    @Override // com.vdodsodjsdt.Skgk8FYn8b4TvRiBOsElZw4XkNLhQ
    public final wzEak8ZKpNWHd4RKPYQ vBGA6pPLqSMuYGvprl270j7(int i) {
        PkBeXXwxWaGrzNHNG1JbWG5uMRK pkBeXXwxWaGrzNHNG1JbWG5uMRK = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int i2 = i == 2 ? pkBeXXwxWaGrzNHNG1JbWG5uMRK.HzCpKshMOoaw76hFcbOVRYMeRd : pkBeXXwxWaGrzNHNG1JbWG5uMRK.KUYypEB4eNWOZWVDpH;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return f6ZQsR6bPLvvCDNXOUc(i2);
    }
}
