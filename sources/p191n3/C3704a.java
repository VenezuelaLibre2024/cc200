package p191n3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p093g3.AbstractC1978p;
import p151k3.C3347a;
import p204o3.InterfaceC3848d;
import p234q3.InterfaceC4157a;
import p249r3.C4292a;

/* renamed from: n3.a */
/* loaded from: classes.dex */
public class C3704a implements InterfaceC3728y {

    /* renamed from: a */
    public final Context f13201a;

    /* renamed from: b */
    public final InterfaceC3848d f13202b;

    /* renamed from: c */
    public AlarmManager f13203c;

    /* renamed from: d */
    public final AbstractC3710g f13204d;

    /* renamed from: e */
    public final InterfaceC4157a f13205e;

    public C3704a(Context context, InterfaceC3848d interfaceC3848d, AlarmManager alarmManager, InterfaceC4157a interfaceC4157a, AbstractC3710g abstractC3710g) {
        this.f13201a = context;
        this.f13202b = interfaceC3848d;
        this.f13203c = alarmManager;
        this.f13205e = interfaceC4157a;
        this.f13204d = abstractC3710g;
    }

    public C3704a(Context context, InterfaceC3848d interfaceC3848d, InterfaceC4157a interfaceC4157a, AbstractC3710g abstractC3710g) {
        this(context, interfaceC3848d, (AlarmManager) context.getSystemService("alarm"), interfaceC4157a, abstractC3710g);
    }

    @Override // p191n3.InterfaceC3728y
    /* renamed from: a */
    public void mo13983a(AbstractC1978p abstractC1978p, int i10) {
        mo13984b(abstractC1978p, i10, false);
    }

    @Override // p191n3.InterfaceC3728y
    /* renamed from: b */
    public void mo13984b(AbstractC1978p abstractC1978p, int i10, boolean z10) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", abstractC1978p.mo7964b());
        builder.appendQueryParameter("priority", String.valueOf(C4292a.m16516a(abstractC1978p.mo7966d())));
        if (abstractC1978p.mo7965c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(abstractC1978p.mo7965c(), 0));
        }
        Intent intent = new Intent(this.f13201a, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i10);
        if (!z10 && m13985c(intent)) {
            C3347a.m12404b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", abstractC1978p);
            return;
        }
        long mo14637a0 = this.f13202b.mo14637a0(abstractC1978p);
        long m14003g = this.f13204d.m14003g(abstractC1978p.mo7966d(), mo14637a0, i10);
        C3347a.m12405c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", abstractC1978p, Long.valueOf(m14003g), Long.valueOf(mo14637a0), Integer.valueOf(i10));
        this.f13203c.set(3, this.f13205e.mo16002a() + m14003g, PendingIntent.getBroadcast(this.f13201a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
    }

    /* renamed from: c */
    public boolean m13985c(Intent intent) {
        return PendingIntent.getBroadcast(this.f13201a, 0, intent, Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912) != null;
    }
}
