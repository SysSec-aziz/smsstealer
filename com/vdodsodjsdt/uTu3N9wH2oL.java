package com.vdodsodjsdt;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class uTu3N9wH2oL extends InputConnectionWrapper {
    public final /* synthetic */ Jc01di1Hsv VxUQ9tBhpHJ2AAEDNW8sghc4m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uTu3N9wH2oL(InputConnection inputConnection, Jc01di1Hsv jc01di1Hsv) {
        super(inputConnection, false);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = jc01di1Hsv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
        byte b;
        ResultReceiver resultReceiver;
        Jc01di1Hsv jc01di1Hsv = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        boolean zZfQNn8hdWlEQ5cR94249PDsLR = false;
        zZfQNn8hdWlEQ5cR94249PDsLR = false;
        zZfQNn8hdWlEQ5cR94249PDsLR = false;
        zZfQNn8hdWlEQ5cR94249PDsLR = false;
        if (bundle != null) {
            if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                b = false;
            } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                b = true;
            }
            try {
                resultReceiver = (ResultReceiver) bundle.getParcelable(b != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            } catch (Throwable th) {
                th = th;
                resultReceiver = null;
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(b != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(b != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(b != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i = bundle.getInt(b != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(b != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    zZfQNn8hdWlEQ5cR94249PDsLR = jc01di1Hsv.ZfQNn8hdWlEQ5cR94249PDsLR(new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != null) {
                    resultReceiver.send(zZfQNn8hdWlEQ5cR94249PDsLR ? 1 : 0, null);
                }
            } catch (Throwable th2) {
                th = th2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        }
        if (zZfQNn8hdWlEQ5cR94249PDsLR) {
            return true;
        }
        return super.performPrivateCommand(str, bundle);
    }
}
