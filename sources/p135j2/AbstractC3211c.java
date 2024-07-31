package p135j2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p029c2.AbstractC0592j;
import p203o2.InterfaceC3840a;

/* renamed from: j2.c */
/* loaded from: classes.dex */
public abstract class AbstractC3211c<T> extends AbstractC3212d<T> {

    /* renamed from: h */
    public static final String f11107h = AbstractC0592j.m2972f("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    public final BroadcastReceiver f11108g;

    /* renamed from: j2.c$a */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                AbstractC3211c.this.mo11427h(context, intent);
            }
        }
    }

    public AbstractC3211c(Context context, InterfaceC3840a interfaceC3840a) {
        super(context, interfaceC3840a);
        this.f11108g = new a();
    }

    @Override // p135j2.AbstractC3212d
    /* renamed from: e */
    public void mo11431e() {
        AbstractC0592j.m2970c().mo2973a(f11107h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f11112b.registerReceiver(this.f11108g, mo11426g());
    }

    @Override // p135j2.AbstractC3212d
    /* renamed from: f */
    public void mo11432f() {
        AbstractC0592j.m2970c().mo2973a(f11107h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f11112b.unregisterReceiver(this.f11108g);
    }

    /* renamed from: g */
    public abstract IntentFilter mo11426g();

    /* renamed from: h */
    public abstract void mo11427h(Context context, Intent intent);
}
