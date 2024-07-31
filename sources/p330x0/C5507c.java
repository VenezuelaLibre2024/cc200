package p330x0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C0261e;

/* renamed from: x0.c */
/* loaded from: classes.dex */
public final class C5507c extends InputConnectionWrapper {

    /* renamed from: a */
    public final TextView f20610a;

    /* renamed from: b */
    public final a f20611b;

    /* renamed from: x0.c$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public boolean m22165a(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
            return C0261e.m1243e(inputConnection, editable, i10, i11, z10);
        }

        /* renamed from: b */
        public void m22166b(EditorInfo editorInfo) {
            if (C0261e.m1246h()) {
                C0261e.m1242b().m1261u(editorInfo);
            }
        }
    }

    public C5507c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    public C5507c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f20610a = textView;
        this.f20611b = aVar;
        aVar.m22166b(editorInfo);
    }

    /* renamed from: a */
    public final Editable m22164a() {
        return this.f20610a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        return this.f20611b.m22165a(this, m22164a(), i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return this.f20611b.m22165a(this, m22164a(), i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
