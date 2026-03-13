package com.vdodsodjsdt;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class LfjFA1SANa {
    public static boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(DragEvent dragEvent, TextView textView, Activity activity) {
        hF6Qoen11a skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                skgk8FYn8b4TvRiBOsElZw4XkNLhQ = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(clipData, 3);
            } else {
                hEzujSQMPyLOvX hezujsqmpylovx = new hEzujSQMPyLOvX();
                hezujsqmpylovx.ZfQNn8hdWlEQ5cR94249PDsLR = clipData;
                hezujsqmpylovx.LaeGQIruHQu81hfJldjMOQSVblH3x = 3;
                skgk8FYn8b4TvRiBOsElZw4XkNLhQ = hezujsqmpylovx;
            }
            xb0r6yEzq0tw9m7nTWG5BFR8.GI83zq0G8e7zkn(textView, skgk8FYn8b4TvRiBOsElZw4XkNLhQ.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean zzpBGItXfub0yWj(DragEvent dragEvent, View view, Activity activity) {
        hF6Qoen11a skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            skgk8FYn8b4TvRiBOsElZw4XkNLhQ = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(clipData, 3);
        } else {
            hEzujSQMPyLOvX hezujsqmpylovx = new hEzujSQMPyLOvX();
            hezujsqmpylovx.ZfQNn8hdWlEQ5cR94249PDsLR = clipData;
            hezujsqmpylovx.LaeGQIruHQu81hfJldjMOQSVblH3x = 3;
            skgk8FYn8b4TvRiBOsElZw4XkNLhQ = hezujsqmpylovx;
        }
        xb0r6yEzq0tw9m7nTWG5BFR8.GI83zq0G8e7zkn(view, skgk8FYn8b4TvRiBOsElZw4XkNLhQ.build());
        return true;
    }
}
