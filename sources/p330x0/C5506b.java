package p330x0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.C0270n;

/* renamed from: x0.b */
/* loaded from: classes.dex */
public final class C5506b extends Editable.Factory {

    /* renamed from: a */
    public static final Object f20607a = new Object();

    /* renamed from: b */
    public static volatile Editable.Factory f20608b;

    /* renamed from: c */
    public static Class<?> f20609c;

    @SuppressLint({"PrivateApi"})
    public C5506b() {
        try {
            f20609c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C5506b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f20608b == null) {
            synchronized (f20607a) {
                if (f20608b == null) {
                    f20608b = new C5506b();
                }
            }
        }
        return f20608b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f20609c;
        return cls != null ? C0270n.m1330c(cls, charSequence) : super.newEditable(charSequence);
    }
}
