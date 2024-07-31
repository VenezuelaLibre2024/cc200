package p336x6;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p064e6.C1677g;
import p252r6.AbstractC4306a;
import p252r6.BinderC4309d;
import p252r6.InterfaceC4310e;
import p352y6.C5827e0;
import p352y6.InterfaceC5822c;
import p367z6.C6038v;

/* renamed from: x6.o */
/* loaded from: classes.dex */
public final class C5641o extends AbstractC4306a {

    /* renamed from: e */
    public final ViewGroup f21087e;

    /* renamed from: f */
    public final Context f21088f;

    /* renamed from: g */
    public InterfaceC4310e f21089g;

    /* renamed from: h */
    public final GoogleMapOptions f21090h;

    /* renamed from: i */
    public final List f21091i = new ArrayList();

    public C5641o(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f21087e = viewGroup;
        this.f21088f = context;
        this.f21090h = googleMapOptions;
    }

    @Override // p252r6.AbstractC4306a
    /* renamed from: a */
    public final void mo16560a(InterfaceC4310e interfaceC4310e) {
        this.f21089g = interfaceC4310e;
        m22700q();
    }

    /* renamed from: p */
    public final void m22699p(InterfaceC5632f interfaceC5632f) {
        if (m16561b() != null) {
            ((C5640n) m16561b()).m22698a(interfaceC5632f);
        } else {
            this.f21091i.add(interfaceC5632f);
        }
    }

    /* renamed from: q */
    public final void m22700q() {
        if (this.f21089g == null || m16561b() != null) {
            return;
        }
        try {
            C5631e.m22674a(this.f21088f);
            InterfaceC5822c mo23448L = C5827e0.m23441a(this.f21088f, null).mo23448L(BinderC4309d.m16572g(this.f21088f), this.f21090h);
            if (mo23448L == null) {
                return;
            }
            this.f21089g.mo16573a(new C5640n(this.f21087e, mo23448L));
            Iterator it = this.f21091i.iterator();
            while (it.hasNext()) {
                ((C5640n) m16561b()).m22698a((InterfaceC5632f) it.next());
            }
            this.f21091i.clear();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        } catch (C1677g unused) {
        }
    }
}
