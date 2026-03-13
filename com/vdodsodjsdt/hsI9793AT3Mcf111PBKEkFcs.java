package com.vdodsodjsdt;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hsI9793AT3Mcf111PBKEkFcs {
    public static u4GJTAMGthCvBFOcZhx3psAaG8l VxUQ9tBhpHJ2AAEDNW8sghc4m(View view, u4GJTAMGthCvBFOcZhx3psAaG8l u4gjtamgthcvbfoczhx3psaag8l) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + u4gjtamgthcvbfoczhx3psaag8l);
        }
        RuzGhvSiqi5DE ruzGhvSiqi5DE = u4gjtamgthcvbfoczhx3psaag8l.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (ruzGhvSiqi5DE.Ca81ebIan1u() == 2) {
            return u4gjtamgthcvbfoczhx3psaag8l;
        }
        ClipData clipDataZfQNn8hdWlEQ5cR94249PDsLR = ruzGhvSiqi5DE.ZfQNn8hdWlEQ5cR94249PDsLR();
        int iM9e7PWhFYLD2lOGMker = ruzGhvSiqi5DE.M9e7PWhFYLD2lOGMker();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataZfQNn8hdWlEQ5cR94249PDsLR.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataZfQNn8hdWlEQ5cR94249PDsLR.getItemAt(i);
            if ((iM9e7PWhFYLD2lOGMker & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
