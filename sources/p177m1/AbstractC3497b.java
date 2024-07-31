package p177m1;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import androidx.window.layout.ExecutorC0412c;
import gd.C2245s;
import p038ce.C1084p;
import p090g0.C1955o;
import p134j1.C3208a;
import p146jd.InterfaceC3281d;
import p161kd.C3384b;
import p161kd.C3385c;
import p173ld.C3474h;
import td.C4747g;
import td.C4753m;

/* renamed from: m1.b */
/* loaded from: classes.dex */
public abstract class AbstractC3497b {

    /* renamed from: a */
    public static final b f12263a = new b(null);

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* renamed from: m1.b$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3497b {

        /* renamed from: b */
        public final MeasurementManager f12264b;

        public a(MeasurementManager measurementManager) {
            C4753m.m18653f(measurementManager, "mMeasurementManager");
            this.f12264b = measurementManager;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                td.C4753m.m18653f(r2, r0)
                java.lang.Class<android.adservices.measurement.MeasurementManager> r0 = android.adservices.measurement.MeasurementManager.class
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                td.C4753m.m18652e(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = (android.adservices.measurement.MeasurementManager) r2
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p177m1.AbstractC3497b.a.<init>(android.content.Context):void");
        }

        @Override // p177m1.AbstractC3497b
        /* renamed from: a */
        public Object mo13012a(C3496a c3496a, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            C1084p c1084p = new C1084p(C3384b.m12580b(interfaceC3281d), 1);
            c1084p.m4530B();
            this.f12264b.deleteRegistrations(m13022k(c3496a), ExecutorC0412c.f1952h, C1955o.m7874a(c1084p));
            Object m4553y = c1084p.m4553y();
            if (m4553y == C3385c.m12581c()) {
                C3474h.m12927c(interfaceC3281d);
            }
            return m4553y == C3385c.m12581c() ? m4553y : C2245s.f8873a;
        }

        @Override // p177m1.AbstractC3497b
        /* renamed from: b */
        public Object mo13013b(InterfaceC3281d<? super Integer> interfaceC3281d) {
            C1084p c1084p = new C1084p(C3384b.m12580b(interfaceC3281d), 1);
            c1084p.m4530B();
            this.f12264b.getMeasurementApiStatus(ExecutorC0412c.f1952h, C1955o.m7874a(c1084p));
            Object m4553y = c1084p.m4553y();
            if (m4553y == C3385c.m12581c()) {
                C3474h.m12927c(interfaceC3281d);
            }
            return m4553y;
        }

        @Override // p177m1.AbstractC3497b
        /* renamed from: c */
        public Object mo13014c(Uri uri, InputEvent inputEvent, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            C1084p c1084p = new C1084p(C3384b.m12580b(interfaceC3281d), 1);
            c1084p.m4530B();
            this.f12264b.registerSource(uri, inputEvent, ExecutorC0412c.f1952h, C1955o.m7874a(c1084p));
            Object m4553y = c1084p.m4553y();
            if (m4553y == C3385c.m12581c()) {
                C3474h.m12927c(interfaceC3281d);
            }
            return m4553y == C3385c.m12581c() ? m4553y : C2245s.f8873a;
        }

        @Override // p177m1.AbstractC3497b
        /* renamed from: d */
        public Object mo13015d(Uri uri, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            C1084p c1084p = new C1084p(C3384b.m12580b(interfaceC3281d), 1);
            c1084p.m4530B();
            this.f12264b.registerTrigger(uri, ExecutorC0412c.f1952h, C1955o.m7874a(c1084p));
            Object m4553y = c1084p.m4553y();
            if (m4553y == C3385c.m12581c()) {
                C3474h.m12927c(interfaceC3281d);
            }
            return m4553y == C3385c.m12581c() ? m4553y : C2245s.f8873a;
        }

        @Override // p177m1.AbstractC3497b
        /* renamed from: e */
        public Object mo13016e(C3498c c3498c, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            C1084p c1084p = new C1084p(C3384b.m12580b(interfaceC3281d), 1);
            c1084p.m4530B();
            this.f12264b.registerWebSource(m13023l(c3498c), ExecutorC0412c.f1952h, C1955o.m7874a(c1084p));
            Object m4553y = c1084p.m4553y();
            if (m4553y == C3385c.m12581c()) {
                C3474h.m12927c(interfaceC3281d);
            }
            return m4553y == C3385c.m12581c() ? m4553y : C2245s.f8873a;
        }

        @Override // p177m1.AbstractC3497b
        /* renamed from: f */
        public Object mo13017f(C3499d c3499d, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            C1084p c1084p = new C1084p(C3384b.m12580b(interfaceC3281d), 1);
            c1084p.m4530B();
            this.f12264b.registerWebTrigger(m13024m(c3499d), ExecutorC0412c.f1952h, C1955o.m7874a(c1084p));
            Object m4553y = c1084p.m4553y();
            if (m4553y == C3385c.m12581c()) {
                C3474h.m12927c(interfaceC3281d);
            }
            return m4553y == C3385c.m12581c() ? m4553y : C2245s.f8873a;
        }

        /* renamed from: k */
        public final DeletionRequest m13022k(C3496a c3496a) {
            new DeletionRequest.Builder();
            throw null;
        }

        /* renamed from: l */
        public final WebSourceRegistrationRequest m13023l(C3498c c3498c) {
            throw null;
        }

        /* renamed from: m */
        public final WebTriggerRegistrationRequest m13024m(C3499d c3499d) {
            throw null;
        }
    }

    /* renamed from: m1.b$b */
    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C4747g c4747g) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        /* renamed from: a */
        public final AbstractC3497b m13025a(Context context) {
            C4753m.m18653f(context, "context");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AdServicesInfo.version=");
            C3208a c3208a = C3208a.f11103a;
            sb2.append(c3208a.m11423a());
            Log.d("MeasurementManager", sb2.toString());
            if (c3208a.m11423a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

    /* renamed from: a */
    public abstract Object mo13012a(C3496a c3496a, InterfaceC3281d<? super C2245s> interfaceC3281d);

    /* renamed from: b */
    public abstract Object mo13013b(InterfaceC3281d<? super Integer> interfaceC3281d);

    /* renamed from: c */
    public abstract Object mo13014c(Uri uri, InputEvent inputEvent, InterfaceC3281d<? super C2245s> interfaceC3281d);

    /* renamed from: d */
    public abstract Object mo13015d(Uri uri, InterfaceC3281d<? super C2245s> interfaceC3281d);

    /* renamed from: e */
    public abstract Object mo13016e(C3498c c3498c, InterfaceC3281d<? super C2245s> interfaceC3281d);

    /* renamed from: f */
    public abstract Object mo13017f(C3499d c3499d, InterfaceC3281d<? super C2245s> interfaceC3281d);
}
