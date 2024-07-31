package p187n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: n.t0 */
/* loaded from: classes.dex */
public class C3661t0 extends ContextWrapper {

    /* renamed from: c */
    public static final Object f13031c = new Object();

    /* renamed from: d */
    public static ArrayList<WeakReference<C3661t0>> f13032d;

    /* renamed from: a */
    public final Resources f13033a;

    /* renamed from: b */
    public final Resources.Theme f13034b;

    public C3661t0(Context context) {
        super(context);
        if (!C3627d1.m13499d()) {
            this.f13033a = new C3665v0(this, context.getResources());
            this.f13034b = null;
            return;
        }
        C3627d1 c3627d1 = new C3627d1(this, context.getResources());
        this.f13033a = c3627d1;
        Resources.Theme newTheme = c3627d1.newTheme();
        this.f13034b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    /* renamed from: a */
    public static boolean m13707a(Context context) {
        if ((context instanceof C3661t0) || (context.getResources() instanceof C3665v0) || (context.getResources() instanceof C3627d1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C3627d1.m13499d();
    }

    /* renamed from: b */
    public static Context m13708b(Context context) {
        if (!m13707a(context)) {
            return context;
        }
        synchronized (f13031c) {
            ArrayList<WeakReference<C3661t0>> arrayList = f13032d;
            if (arrayList == null) {
                f13032d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<C3661t0> weakReference = f13032d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f13032d.remove(size);
                    }
                }
                for (int size2 = f13032d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C3661t0> weakReference2 = f13032d.get(size2);
                    C3661t0 c3661t0 = weakReference2 != null ? weakReference2.get() : null;
                    if (c3661t0 != null && c3661t0.getBaseContext() == context) {
                        return c3661t0;
                    }
                }
            }
            C3661t0 c3661t02 = new C3661t0(context);
            f13032d.add(new WeakReference<>(c3661t02));
            return c3661t02;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f13033a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f13033a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f13034b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f13034b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
