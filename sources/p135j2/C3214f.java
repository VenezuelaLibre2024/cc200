package p135j2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p029c2.AbstractC0592j;
import p203o2.InterfaceC3840a;

/* renamed from: j2.f */
/* loaded from: classes.dex */
public class C3214f extends AbstractC3211c<Boolean> {

    /* renamed from: i */
    public static final String f11124i = AbstractC0592j.m2972f("StorageNotLowTracker");

    public C3214f(Context context, InterfaceC3840a interfaceC3840a) {
        super(context, interfaceC3840a);
    }

    @Override // p135j2.AbstractC3211c
    /* renamed from: g */
    public IntentFilter mo11426g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // p135j2.AbstractC3211c
    /* renamed from: h */
    public void mo11427h(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        AbstractC0592j.m2970c().mo2973a(f11124i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            bool = Boolean.FALSE;
        } else if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
        m11435d(bool);
    }

    @Override // p135j2.AbstractC3212d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo11425b() {
        Intent registerReceiver = this.f11112b.registerReceiver(null, mo11426g());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
