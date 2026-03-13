package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.vdodsodjsdt.D12Nz0tOxlAcDuwq4Ka8reia;
import com.vdodsodjsdt.KVUFmLegfLXQjNxyjOnO6U;
import com.vdodsodjsdt.RfOSIaL6qUBGKJY9MSCBP5ba;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends D12Nz0tOxlAcDuwq4Ka8reia {
    public final RfOSIaL6qUBGKJY9MSCBP5ba GI83zq0G8e7zkn;
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.GI83zq0G8e7zkn = new RfOSIaL6qUBGKJY9MSCBP5ba(10, this);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i < 600) {
            return (i < 640 || i2 < 480) ? 160 : 192;
        }
        return 192;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ <= 0 || super.enoughToFilter();
    }

    @Override // com.vdodsodjsdt.D12Nz0tOxlAcDuwq4Ka8reia, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.NSjgqmGjEzuugn2SsG1mZFP) {
            RfOSIaL6qUBGKJY9MSCBP5ba rfOSIaL6qUBGKJY9MSCBP5ba = this.GI83zq0G8e7zkn;
            removeCallbacks(rfOSIaL6qUBGKJY9MSCBP5ba);
            post(rfOSIaL6qUBGKJY9MSCBP5ba);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            throw null;
        }
    }

    public void setImeVisibility(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        RfOSIaL6qUBGKJY9MSCBP5ba rfOSIaL6qUBGKJY9MSCBP5ba = this.GI83zq0G8e7zkn;
        if (!z) {
            this.NSjgqmGjEzuugn2SsG1mZFP = false;
            removeCallbacks(rfOSIaL6qUBGKJY9MSCBP5ba);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.NSjgqmGjEzuugn2SsG1mZFP = true;
                return;
            }
            this.NSjgqmGjEzuugn2SsG1mZFP = false;
            removeCallbacks(rfOSIaL6qUBGKJY9MSCBP5ba);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        super.setThreshold(i);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setSearchView(KVUFmLegfLXQjNxyjOnO6U kVUFmLegfLXQjNxyjOnO6U) {
    }
}
