package p188n0;

import android.content.ClipData;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p148k0.C3309c;
import p148k0.InterfaceC3340w;

/* renamed from: n0.k */
/* loaded from: classes.dex */
public final class C3684k implements InterfaceC3340w {

    /* renamed from: n0.k$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static CharSequence m13893a(Context context, ClipData.Item item, int i10) {
            if ((i10 & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
        }
    }

    /* renamed from: n0.k$b */
    /* loaded from: classes.dex */
    public static final class b {
        /* renamed from: a */
        public static CharSequence m13894a(Context context, ClipData.Item item, int i10) {
            CharSequence coerceToText = item.coerceToText(context);
            return ((i10 & 1) == 0 || !(coerceToText instanceof Spanned)) ? coerceToText : coerceToText.toString();
        }
    }

    /* renamed from: b */
    public static CharSequence m13891b(Context context, ClipData.Item item, int i10) {
        return Build.VERSION.SDK_INT >= 16 ? a.m13893a(context, item, i10) : b.m13894a(context, item, i10);
    }

    /* renamed from: c */
    public static void m13892c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // p148k0.InterfaceC3340w
    /* renamed from: a */
    public C3309c mo12394a(View view, C3309c c3309c) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c3309c);
        }
        if (c3309c.m12182d() == 2) {
            return c3309c;
        }
        ClipData m12180b = c3309c.m12180b();
        int m12181c = c3309c.m12181c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z10 = false;
        for (int i10 = 0; i10 < m12180b.getItemCount(); i10++) {
            CharSequence m13891b = m13891b(context, m12180b.getItemAt(i10), m12181c);
            if (m13891b != null) {
                if (z10) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), m13891b);
                } else {
                    m13892c(editable, m13891b);
                    z10 = true;
                }
            }
        }
        return null;
    }
}
