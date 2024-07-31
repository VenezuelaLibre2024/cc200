package p176m0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import p133j0.C3205d;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: m0.a */
/* loaded from: classes.dex */
public final class C3492a {

    /* renamed from: a */
    public static final String[] f12254a = new String[0];

    /* renamed from: m0.a$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m12994a(EditorInfo editorInfo, CharSequence charSequence, int i10) {
            editorInfo.setInitialSurroundingSubText(charSequence, i10);
        }
    }

    /* renamed from: a */
    public static String[] m12986a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f12254a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f12254a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f12254a;
    }

    /* renamed from: b */
    public static boolean m12987b(CharSequence charSequence, int i10, int i11) {
        if (i11 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i10));
        }
        if (i11 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i10));
    }

    /* renamed from: c */
    public static boolean m12988c(int i10) {
        int i11 = i10 & 4095;
        return i11 == 129 || i11 == 225 || i11 == 18;
    }

    /* renamed from: d */
    public static void m12989d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: e */
    public static void m12990e(EditorInfo editorInfo, CharSequence charSequence, int i10) {
        C3205d.m11414j(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.m12994a(editorInfo, charSequence, i10);
            return;
        }
        int i11 = editorInfo.initialSelStart;
        int i12 = editorInfo.initialSelEnd;
        int i13 = i11 > i12 ? i12 - i10 : i11 - i10;
        int i14 = i11 > i12 ? i11 - i10 : i12 - i10;
        int length = charSequence.length();
        if (i10 < 0 || i13 < 0 || i14 > length) {
            m12992g(editorInfo, null, 0, 0);
            return;
        }
        if (m12988c(editorInfo.inputType)) {
            m12992g(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            m12992g(editorInfo, charSequence, i13, i14);
        } else {
            m12993h(editorInfo, charSequence, i13, i14);
        }
    }

    /* renamed from: f */
    public static void m12991f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.m12994a(editorInfo, charSequence, 0);
        } else {
            m12990e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    public static void m12992g(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i10);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i11);
    }

    /* renamed from: h */
    public static void m12993h(EditorInfo editorInfo, CharSequence charSequence, int i10, int i11) {
        int i12 = i11 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int min = Math.min(charSequence.length() - i11, i14 - Math.min(i10, (int) (i14 * 0.8d)));
        int min2 = Math.min(i10, i14 - min);
        int i15 = i10 - min2;
        if (m12987b(charSequence, i15, 0)) {
            i15++;
            min2--;
        }
        if (m12987b(charSequence, (i11 + min) - 1, 1)) {
            min--;
        }
        CharSequence concat = i13 != i12 ? TextUtils.concat(charSequence.subSequence(i15, i15 + min2), charSequence.subSequence(i11, min + i11)) : charSequence.subSequence(i15, min2 + i13 + min + i15);
        int i16 = min2 + 0;
        m12992g(editorInfo, concat, i16, i13 + i16);
    }
}
