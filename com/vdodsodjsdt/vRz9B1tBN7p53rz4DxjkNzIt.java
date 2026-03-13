package com.vdodsodjsdt;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vRz9B1tBN7p53rz4DxjkNzIt {
    public static String[] VxUQ9tBhpHJ2AAEDNW8sghc4m(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static u4GJTAMGthCvBFOcZhx3psAaG8l zzpBGItXfub0yWj(View view, u4GJTAMGthCvBFOcZhx3psAaG8l u4gjtamgthcvbfoczhx3psaag8l) {
        ContentInfo contentInfoKUYypEB4eNWOZWVDpH = u4gjtamgthcvbfoczhx3psaag8l.VxUQ9tBhpHJ2AAEDNW8sghc4m.KUYypEB4eNWOZWVDpH();
        Objects.requireNonNull(contentInfoKUYypEB4eNWOZWVDpH);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoKUYypEB4eNWOZWVDpH);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoKUYypEB4eNWOZWVDpH ? u4gjtamgthcvbfoczhx3psaag8l : new u4GJTAMGthCvBFOcZhx3psAaG8l(new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(contentInfoPerformReceiveContent));
    }
}
