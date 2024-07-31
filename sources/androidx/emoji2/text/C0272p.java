package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p119i0.C2575c;

/* renamed from: androidx.emoji2.text.p */
/* loaded from: classes.dex */
public class C0272p implements Spannable {

    /* renamed from: h */
    public boolean f1294h = false;

    /* renamed from: i */
    public Spannable f1295i;

    /* renamed from: androidx.emoji2.text.p$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static IntStream m1346a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: b */
        public static IntStream m1347b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* renamed from: androidx.emoji2.text.p$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public boolean mo1348a(CharSequence charSequence) {
            return charSequence instanceof C2575c;
        }
    }

    /* renamed from: androidx.emoji2.text.p$c */
    /* loaded from: classes.dex */
    public static class c extends b {
        @Override // androidx.emoji2.text.C0272p.b
        /* renamed from: a */
        public boolean mo1348a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof C2575c);
        }
    }

    public C0272p(Spannable spannable) {
        this.f1295i = spannable;
    }

    public C0272p(CharSequence charSequence) {
        this.f1295i = new SpannableString(charSequence);
    }

    /* renamed from: c */
    public static b m1343c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    /* renamed from: a */
    public final void m1344a() {
        Spannable spannable = this.f1295i;
        if (!this.f1294h && m1343c().mo1348a(spannable)) {
            this.f1295i = new SpannableString(spannable);
        }
        this.f1294h = true;
    }

    /* renamed from: b */
    public Spannable m1345b() {
        return this.f1295i;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f1295i.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.m1346a(this.f1295i);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.m1347b(this.f1295i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f1295i.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f1295i.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f1295i.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f1295i.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f1295i.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f1295i.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m1344a();
        this.f1295i.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        m1344a();
        this.f1295i.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f1295i.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f1295i.toString();
    }
}
