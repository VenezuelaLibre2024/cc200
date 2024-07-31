package p135j2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import p029c2.AbstractC0592j;
import p203o2.InterfaceC3840a;

/* renamed from: j2.a */
/* loaded from: classes.dex */
public class C3209a extends AbstractC3211c<Boolean> {

    /* renamed from: i */
    public static final String f11105i = AbstractC0592j.m2972f("BatteryChrgTracker");

    public C3209a(Context context, InterfaceC3840a interfaceC3840a) {
        super(context, interfaceC3840a);
    }

    @Override // p135j2.AbstractC3211c
    /* renamed from: g */
    public IntentFilter mo11426g() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r6.equals("android.os.action.DISCHARGING") == false) goto L7;
     */
    @Override // p135j2.AbstractC3211c
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo11427h(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r6 = r7.getAction()
            if (r6 != 0) goto L7
            return
        L7:
            c2.j r7 = p029c2.AbstractC0592j.m2970c()
            java.lang.String r0 = p135j2.C3209a.f11105i
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r7.mo2973a(r0, r2, r4)
            r7 = -1
            int r0 = r6.hashCode()
            switch(r0) {
                case -1886648615: goto L47;
                case -54942926: goto L3e;
                case 948344062: goto L33;
                case 1019184907: goto L28;
                default: goto L26;
            }
        L26:
            r1 = r7
            goto L51
        L28:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L31
            goto L26
        L31:
            r1 = 3
            goto L51
        L33:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3c
            goto L26
        L3c:
            r1 = 2
            goto L51
        L3e:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L51
            goto L26
        L47:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L50
            goto L26
        L50:
            r1 = r3
        L51:
            switch(r1) {
                case 0: goto L5b;
                case 1: goto L5b;
                case 2: goto L55;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L5e
        L55:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
        L57:
            r5.m11435d(r6)
            goto L5e
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            goto L57
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j2.C3209a.mo11427h(android.content.Context, android.content.Intent):void");
    }

    @Override // p135j2.AbstractC3212d
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo11425b() {
        Intent registerReceiver = this.f11112b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(m11429j(registerReceiver));
        }
        AbstractC0592j.m2970c().mo2974b(f11105i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    /* renamed from: j */
    public final boolean m11429j(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }
}
