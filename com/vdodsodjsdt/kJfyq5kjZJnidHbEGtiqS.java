package com.vdodsodjsdt;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class kJfyq5kjZJnidHbEGtiqS extends FG8LIxsgYiLSfhN0jYKIKr {
    @Override // com.vdodsodjsdt.FG8LIxsgYiLSfhN0jYKIKr
    public final Signature[] M9e7PWhFYLD2lOGMker(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
