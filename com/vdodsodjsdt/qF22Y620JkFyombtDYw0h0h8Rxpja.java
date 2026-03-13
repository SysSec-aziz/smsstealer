package com.vdodsodjsdt;

import android.util.Log;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class qF22Y620JkFyombtDYw0h0h8Rxpja implements BWNO61VTow7fZxX, ZN0iEARZEGpwTTqbyBVzgj, xI49lv6n0OP7vk, l84brpRrcI8X30BdJPQkPqvLG {
    public Object V57tEvNfxZVVcOCAOih5PKr;

    public /* synthetic */ qF22Y620JkFyombtDYw0h0h8Rxpja(Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = obj;
    }

    @Override // com.vdodsodjsdt.ZN0iEARZEGpwTTqbyBVzgj
    public void LaeGQIruHQu81hfJldjMOQSVblH3x(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.V57tEvNfxZVVcOCAOih5PKr).setResultCode(i);
    }

    @Override // com.vdodsodjsdt.BWNO61VTow7fZxX
    public jDNq5zhgCb57UDl V57tEvNfxZVVcOCAOih5PKr() {
        return ((BWNO61VTow7fZxX) this.V57tEvNfxZVVcOCAOih5PKr).V57tEvNfxZVVcOCAOih5PKr();
    }

    @Override // com.vdodsodjsdt.l84brpRrcI8X30BdJPQkPqvLG
    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.V57tEvNfxZVVcOCAOih5PKr;
        if (!swipeDismissBehavior.ko09zE6UAgwkV(view)) {
            return false;
        }
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.ZfQNn8hdWlEQ5cR94249PDsLR;
        int width = (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth();
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // com.vdodsodjsdt.ZN0iEARZEGpwTTqbyBVzgj
    public void ZfQNn8hdWlEQ5cR94249PDsLR() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // com.vdodsodjsdt.xI49lv6n0OP7vk
    public void onCancel() {
        ((RD86Fssz0iKbf0t61L) this.V57tEvNfxZVVcOCAOih5PKr).VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    @Override // com.vdodsodjsdt.BWNO61VTow7fZxX
    public Object zzpBGItXfub0yWj(MGk7KfXeUv8YAfWiUw5LfOd mGk7KfXeUv8YAfWiUw5LfOd, GvuED9Eb9kjnYjng4BPJg7J gvuED9Eb9kjnYjng4BPJg7J) {
        return ((BWNO61VTow7fZxX) this.V57tEvNfxZVVcOCAOih5PKr).zzpBGItXfub0yWj(new Yzq1oSBgBro6jNGuZoXf3ses(mGk7KfXeUv8YAfWiUw5LfOd, null), gvuED9Eb9kjnYjng4BPJg7J);
    }
}
