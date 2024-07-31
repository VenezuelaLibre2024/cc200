package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p133j0.C3205d;

/* renamed from: androidx.emoji2.text.n */
/* loaded from: classes.dex */
public final class C0270n extends SpannableStringBuilder {

    /* renamed from: h */
    public final Class<?> f1289h;

    /* renamed from: i */
    public final List<a> f1290i;

    /* renamed from: androidx.emoji2.text.n$a */
    /* loaded from: classes.dex */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: h */
        public final Object f1291h;

        /* renamed from: i */
        public final AtomicInteger f1292i = new AtomicInteger(0);

        public a(Object obj) {
            this.f1291h = obj;
        }

        /* renamed from: a */
        public final void m1339a() {
            this.f1292i.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f1291h).afterTextChanged(editable);
        }

        /* renamed from: b */
        public final boolean m1340b(Object obj) {
            return obj instanceof AbstractC0265i;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f1291h).beforeTextChanged(charSequence, i10, i11, i12);
        }

        /* renamed from: c */
        public final void m1341c() {
            this.f1292i.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f1292i.get() <= 0 || !m1340b(obj)) {
                ((SpanWatcher) this.f1291h).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            if (this.f1292i.get() <= 0 || !m1340b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    int i16 = i10 > i11 ? 0 : i10;
                    if (i12 > i13) {
                        i14 = i16;
                        i15 = 0;
                    } else {
                        i15 = i12;
                        i14 = i16;
                    }
                } else {
                    i14 = i10;
                    i15 = i12;
                }
                ((SpanWatcher) this.f1291h).onSpanChanged(spannable, obj, i14, i11, i15, i13);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f1292i.get() <= 0 || !m1340b(obj)) {
                ((SpanWatcher) this.f1291h).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f1291h).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    public C0270n(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f1290i = new ArrayList();
        C3205d.m11415k(cls, "watcherClass cannot be null");
        this.f1289h = cls;
    }

    public C0270n(Class<?> cls, CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        this.f1290i = new ArrayList();
        C3205d.m11415k(cls, "watcherClass cannot be null");
        this.f1289h = cls;
    }

    /* renamed from: c */
    public static C0270n m1330c(Class<?> cls, CharSequence charSequence) {
        return new C0270n(cls, charSequence);
    }

    /* renamed from: a */
    public void m1331a() {
        m1332b();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }

    /* renamed from: b */
    public final void m1332b() {
        for (int i10 = 0; i10 < this.f1290i.size(); i10++) {
            this.f1290i.get(i10).m1339a();
        }
    }

    /* renamed from: d */
    public void m1333d() {
        m1338i();
        m1334e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    /* renamed from: e */
    public final void m1334e() {
        for (int i10 = 0; i10 < this.f1290i.size(); i10++) {
            this.f1290i.get(i10).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    public final a m1335f(Object obj) {
        for (int i10 = 0; i10 < this.f1290i.size(); i10++) {
            a aVar = this.f1290i.get(i10);
            if (aVar.f1291h == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final boolean m1336g(Class<?> cls) {
        return this.f1289h == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a m1335f;
        if (m1337h(obj) && (m1335f = m1335f(obj)) != null) {
            obj = m1335f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a m1335f;
        if (m1337h(obj) && (m1335f = m1335f(obj)) != null) {
            obj = m1335f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a m1335f;
        if (m1337h(obj) && (m1335f = m1335f(obj)) != null) {
            obj = m1335f;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (!m1336g(cls)) {
            return (T[]) super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            tArr[i12] = aVarArr[i12].f1291h;
        }
        return tArr;
    }

    /* renamed from: h */
    public final boolean m1337h(Object obj) {
        return obj != null && m1336g(obj.getClass());
    }

    /* renamed from: i */
    public final void m1338i() {
        for (int i10 = 0; i10 < this.f1290i.size(); i10++) {
            this.f1290i.get(i10).m1341c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || m1336g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVar;
        if (m1337h(obj)) {
            aVar = m1335f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f1290i.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        m1332b();
        super.replace(i10, i11, charSequence);
        m1338i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        m1332b();
        super.replace(i10, i11, charSequence, i12, i13);
        m1338i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (m1337h(obj)) {
            a aVar = new a(obj);
            this.f1290i.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i10, int i11) {
        return new C0270n(this.f1289h, this, i10, i11);
    }
}
