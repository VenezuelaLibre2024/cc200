package p135j2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p029c2.AbstractC0592j;
import p203o2.InterfaceC3840a;

/* renamed from: j2.b */
/* loaded from: classes.dex */
public class C3210b extends AbstractC3211c<Boolean> {

    /* renamed from: i */
    public static final String f11106i = AbstractC0592j.m2972f("BatteryNotLowTracker");

    public C3210b(Context context, InterfaceC3840a interfaceC3840a) {
        super(context, interfaceC3840a);
    }

    @Override // p135j2.AbstractC3211c
    /* renamed from: g */
    public IntentFilter mo11426g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p135j2.AbstractC3211c
    /* renamed from: h */
    public void mo11427h(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        AbstractC0592j.m2970c().mo2973a(f11106i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        m11435d(bool);
    }

    @Override // p135j2.AbstractC3212d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo11425b() {
        Intent registerReceiver = this.f11112b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        AbstractC0592j.m2970c().mo2974b(f11106i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
