package p316w2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import io.flutter.plugin.common.PluginRegistry;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p064e6.C1673e;
import p303v2.EnumC5102b;
import p303v2.InterfaceC5101a;

/* renamed from: w2.k */
/* loaded from: classes.dex */
public class C5209k implements PluginRegistry.ActivityResultListener {

    /* renamed from: h */
    public final List<InterfaceC5213o> f19753h = new CopyOnWriteArrayList();

    /* renamed from: a */
    public InterfaceC5213o m21088a(Context context, boolean z10, C5216r c5216r) {
        if (!z10 && m21090c(context)) {
            return new C5208j(context, c5216r);
        }
        return new C5214p(context, c5216r);
    }

    /* renamed from: b */
    public void m21089b(Context context, boolean z10, InterfaceC5221w interfaceC5221w, InterfaceC5101a interfaceC5101a) {
        m21088a(context, z10, null).mo21083d(interfaceC5221w, interfaceC5101a);
    }

    /* renamed from: c */
    public final boolean m21090c(Context context) {
        try {
            return C1673e.m6693m().mo6697g(context) == 0;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    /* renamed from: d */
    public void m21091d(Context context, InterfaceC5217s interfaceC5217s) {
        if (context == null) {
            interfaceC5217s.mo21056b(EnumC5102b.locationServicesDisabled);
        }
        m21088a(context, false, null).mo21084e(interfaceC5217s);
    }

    /* renamed from: e */
    public void m21092e(InterfaceC5213o interfaceC5213o, Activity activity, InterfaceC5221w interfaceC5221w, InterfaceC5101a interfaceC5101a) {
        this.f19753h.add(interfaceC5213o);
        interfaceC5213o.mo21081b(activity, interfaceC5221w, interfaceC5101a);
    }

    /* renamed from: f */
    public void m21093f(InterfaceC5213o interfaceC5213o) {
        this.f19753h.remove(interfaceC5213o);
        interfaceC5213o.mo21085f();
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        Iterator<InterfaceC5213o> it = this.f19753h.iterator();
        while (it.hasNext()) {
            if (it.next().mo21082c(i10, i11)) {
                return true;
            }
        }
        return false;
    }
}
