package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p377firebaseauthapi.zzaag;
import com.google.android.gms.internal.p377firebaseauthapi.zzach;
import com.google.android.gms.internal.p377firebaseauthapi.zzack;
import com.google.android.gms.internal.p377firebaseauthapi.zzacu;
import com.google.android.gms.internal.p377firebaseauthapi.zzads;
import com.google.android.gms.internal.p377firebaseauthapi.zzaec;
import com.google.android.gms.internal.p377firebaseauthapi.zzafi;
import com.google.android.gms.internal.p377firebaseauthapi.zzafj;
import com.google.android.gms.internal.p377firebaseauthapi.zzafm;
import com.google.android.gms.internal.p377firebaseauthapi.zzafz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.C1260b;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p067e9.C1761b;
import p108h6.C2394s;
import p195n7.C3767g;
import p195n7.C3773m;
import p253r7.InterfaceC4318a;
import p253r7.InterfaceC4319b;
import p253r7.InterfaceC4320c;
import p253r7.InterfaceC4321d;
import p308v7.InterfaceC5140b;
import p309v8.InterfaceC5149i;
import p321w7.AbstractC5341a0;
import p321w7.AbstractC5368h;
import p321w7.AbstractC5373i0;
import p321w7.AbstractC5390n;
import p321w7.AbstractC5417w;
import p321w7.C5349c0;
import p321w7.C5350c1;
import p321w7.C5356e;
import p321w7.C5358e1;
import p321w7.C5359e2;
import p321w7.C5360f;
import p321w7.C5363f2;
import p321w7.C5367g2;
import p321w7.C5371h2;
import p321w7.C5375i2;
import p321w7.C5376j;
import p321w7.C5379j2;
import p321w7.C5380k;
import p321w7.C5383k2;
import p321w7.C5394o0;
import p321w7.C5397p0;
import p321w7.C5403r0;
import p321w7.C5415v0;
import p321w7.InterfaceC5352d;
import p321w7.InterfaceC5372i;
import p321w7.InterfaceC5412u0;
import p321w7.InterfaceC5424y0;
import p337x7.C5659b1;
import p337x7.C5663c1;
import p337x7.C5666d0;
import p337x7.C5673f;
import p337x7.C5679g1;
import p337x7.C5684h2;
import p337x7.C5685i;
import p337x7.C5690j1;
import p337x7.C5698m0;
import p337x7.C5706p;
import p337x7.C5707p0;
import p337x7.InterfaceC5653a;
import p337x7.InterfaceC5657b;
import p337x7.InterfaceC5683h1;
import p337x7.InterfaceC5720t1;
import p337x7.InterfaceC5730x;
import p354y8.InterfaceC5896b;

/* loaded from: classes.dex */
public class FirebaseAuth implements InterfaceC5657b {

    /* renamed from: A */
    public final Executor f4728A;

    /* renamed from: B */
    public String f4729B;

    /* renamed from: a */
    public final C3767g f4730a;

    /* renamed from: b */
    public final List<InterfaceC1256b> f4731b;

    /* renamed from: c */
    public final List<InterfaceC5653a> f4732c;

    /* renamed from: d */
    public final List<InterfaceC1255a> f4733d;

    /* renamed from: e */
    public final zzaag f4734e;

    /* renamed from: f */
    public AbstractC5341a0 f4735f;

    /* renamed from: g */
    public final C5673f f4736g;

    /* renamed from: h */
    public final Object f4737h;

    /* renamed from: i */
    public String f4738i;

    /* renamed from: j */
    public final Object f4739j;

    /* renamed from: k */
    public String f4740k;

    /* renamed from: l */
    public C5659b1 f4741l;

    /* renamed from: m */
    public final RecaptchaAction f4742m;

    /* renamed from: n */
    public final RecaptchaAction f4743n;

    /* renamed from: o */
    public final RecaptchaAction f4744o;

    /* renamed from: p */
    public final RecaptchaAction f4745p;

    /* renamed from: q */
    public final RecaptchaAction f4746q;

    /* renamed from: r */
    public final RecaptchaAction f4747r;

    /* renamed from: s */
    public final C5663c1 f4748s;

    /* renamed from: t */
    public final C5690j1 f4749t;

    /* renamed from: u */
    public final C5666d0 f4750u;

    /* renamed from: v */
    public final InterfaceC5896b<InterfaceC5140b> f4751v;

    /* renamed from: w */
    public final InterfaceC5896b<InterfaceC5149i> f4752w;

    /* renamed from: x */
    public C5679g1 f4753x;

    /* renamed from: y */
    public final Executor f4754y;

    /* renamed from: z */
    public final Executor f4755z;

    /* renamed from: com.google.firebase.auth.FirebaseAuth$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1255a {
        /* renamed from: a */
        void mo5267a(FirebaseAuth firebaseAuth);
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1256b {
        /* renamed from: a */
        void mo5268a(FirebaseAuth firebaseAuth);
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$c */
    /* loaded from: classes.dex */
    public class C1257c implements InterfaceC5730x, InterfaceC5720t1 {
        public C1257c() {
        }

        @Override // p337x7.InterfaceC5720t1
        /* renamed from: a */
        public final void mo5269a(zzafm zzafmVar, AbstractC5341a0 abstractC5341a0) {
            C2394s.m9619l(zzafmVar);
            C2394s.m9619l(abstractC5341a0);
            abstractC5341a0.mo21433f0(zzafmVar);
            FirebaseAuth.this.m5239j0(abstractC5341a0, zzafmVar, true, true);
        }

        @Override // p337x7.InterfaceC5730x
        public final void zza(Status status) {
            if (status.m4987J() == 17011 || status.m4987J() == 17021 || status.m4987J() == 17005 || status.m4987J() == 17091) {
                FirebaseAuth.this.m5200D();
            }
        }
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$d */
    /* loaded from: classes.dex */
    public class C1258d implements InterfaceC5720t1 {
        public C1258d() {
        }

        @Override // p337x7.InterfaceC5720t1
        /* renamed from: a */
        public final void mo5269a(zzafm zzafmVar, AbstractC5341a0 abstractC5341a0) {
            C2394s.m9619l(zzafmVar);
            C2394s.m9619l(abstractC5341a0);
            abstractC5341a0.mo21433f0(zzafmVar);
            FirebaseAuth.this.m5237i0(abstractC5341a0, zzafmVar, true);
        }
    }

    public FirebaseAuth(C3767g c3767g, zzaag zzaagVar, C5663c1 c5663c1, C5690j1 c5690j1, C5666d0 c5666d0, InterfaceC5896b<InterfaceC5140b> interfaceC5896b, InterfaceC5896b<InterfaceC5149i> interfaceC5896b2, @InterfaceC4318a Executor executor, @InterfaceC4319b Executor executor2, @InterfaceC4320c Executor executor3, @InterfaceC4321d Executor executor4) {
        zzafm m22731a;
        this.f4731b = new CopyOnWriteArrayList();
        this.f4732c = new CopyOnWriteArrayList();
        this.f4733d = new CopyOnWriteArrayList();
        this.f4737h = new Object();
        this.f4739j = new Object();
        this.f4742m = RecaptchaAction.custom("getOobCode");
        this.f4743n = RecaptchaAction.custom("signInWithPassword");
        this.f4744o = RecaptchaAction.custom("signUpPassword");
        this.f4745p = RecaptchaAction.custom("sendVerificationCode");
        this.f4746q = RecaptchaAction.custom("mfaSmsEnrollment");
        this.f4747r = RecaptchaAction.custom("mfaSmsSignIn");
        this.f4730a = (C3767g) C2394s.m9619l(c3767g);
        this.f4734e = (zzaag) C2394s.m9619l(zzaagVar);
        C5663c1 c5663c12 = (C5663c1) C2394s.m9619l(c5663c1);
        this.f4748s = c5663c12;
        this.f4736g = new C5673f();
        C5690j1 c5690j12 = (C5690j1) C2394s.m9619l(c5690j1);
        this.f4749t = c5690j12;
        this.f4750u = (C5666d0) C2394s.m9619l(c5666d0);
        this.f4751v = interfaceC5896b;
        this.f4752w = interfaceC5896b2;
        this.f4754y = executor2;
        this.f4755z = executor3;
        this.f4728A = executor4;
        AbstractC5341a0 m22732b = c5663c12.m22732b();
        this.f4735f = m22732b;
        if (m22732b != null && (m22731a = c5663c12.m22731a(m22732b)) != null) {
            m5187e0(this, this.f4735f, m22731a, false, false);
        }
        c5690j12.m22771b(this);
    }

    public FirebaseAuth(C3767g c3767g, InterfaceC5896b<InterfaceC5140b> interfaceC5896b, InterfaceC5896b<InterfaceC5149i> interfaceC5896b2, @InterfaceC4318a Executor executor, @InterfaceC4319b Executor executor2, @InterfaceC4320c Executor executor3, @InterfaceC4320c ScheduledExecutorService scheduledExecutorService, @InterfaceC4321d Executor executor4) {
        this(c3767g, new zzaag(c3767g, executor2, scheduledExecutorService), new C5663c1(c3767g.m14349m(), c3767g.m14352s()), C5690j1.m22769f(), C5666d0.m22738b(), interfaceC5896b, interfaceC5896b2, executor, executor2, executor3, executor4);
    }

    /* renamed from: J0 */
    public static C5679g1 m5183J0(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f4753x == null) {
            firebaseAuth.f4753x = new C5679g1((C3767g) C2394s.m9619l(firebaseAuth.f4730a));
        }
        return firebaseAuth.f4753x;
    }

    /* renamed from: d0 */
    public static void m5186d0(FirebaseAuth firebaseAuth, AbstractC5341a0 abstractC5341a0) {
        String str;
        if (abstractC5341a0 != null) {
            str = "Notifying auth state listeners about user ( " + abstractC5341a0.mo21427b() + " ).";
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f4728A.execute(new RunnableC1271m(firebaseAuth));
    }

    /* renamed from: e0 */
    public static void m5187e0(FirebaseAuth firebaseAuth, AbstractC5341a0 abstractC5341a0, zzafm zzafmVar, boolean z10, boolean z11) {
        boolean z12;
        C2394s.m9619l(abstractC5341a0);
        C2394s.m9619l(zzafmVar);
        boolean z13 = true;
        boolean z14 = firebaseAuth.f4735f != null && abstractC5341a0.mo21427b().equals(firebaseAuth.f4735f.mo21427b());
        if (z14 || !z11) {
            AbstractC5341a0 abstractC5341a02 = firebaseAuth.f4735f;
            if (abstractC5341a02 == null) {
                z12 = true;
            } else {
                boolean z15 = !z14 || (abstractC5341a02.mo21436i0().zzc().equals(zzafmVar.zzc()) ^ true);
                z12 = z14 ? false : true;
                z13 = z15;
            }
            C2394s.m9619l(abstractC5341a0);
            if (firebaseAuth.f4735f == null || !abstractC5341a0.mo21427b().equals(firebaseAuth.m5248o())) {
                firebaseAuth.f4735f = abstractC5341a0;
            } else {
                firebaseAuth.f4735f.mo21432e0(abstractC5341a0.mo21412M());
                if (!abstractC5341a0.mo21414O()) {
                    firebaseAuth.f4735f.mo21434g0();
                }
                firebaseAuth.f4735f.mo21435h0(abstractC5341a0.mo21411L().mo21502b());
            }
            if (z10) {
                firebaseAuth.f4748s.m22736f(firebaseAuth.f4735f);
            }
            if (z13) {
                AbstractC5341a0 abstractC5341a03 = firebaseAuth.f4735f;
                if (abstractC5341a03 != null) {
                    abstractC5341a03.mo21433f0(zzafmVar);
                }
                m5191q0(firebaseAuth, firebaseAuth.f4735f);
            }
            if (z12) {
                m5186d0(firebaseAuth, firebaseAuth.f4735f);
            }
            if (z10) {
                firebaseAuth.f4748s.m22735e(abstractC5341a0, zzafmVar);
            }
            AbstractC5341a0 abstractC5341a04 = firebaseAuth.f4735f;
            if (abstractC5341a04 != null) {
                m5183J0(firebaseAuth).m22758c(abstractC5341a04.mo21436i0());
            }
        }
    }

    /* renamed from: f0 */
    public static void m5188f0(C1259a c1259a) {
        String m9613f;
        String m21551m;
        if (!c1259a.m5282m()) {
            FirebaseAuth m5272c = c1259a.m5272c();
            String m9613f2 = C2394s.m9613f(c1259a.m5278i());
            if ((c1259a.m5274e() != null) || !zzads.zza(m9613f2, c1259a.m5275f(), c1259a.m5270a(), c1259a.m5279j())) {
                m5272c.f4750u.m22742a(m5272c, m9613f2, c1259a.m5270a(), m5272c.m5208I0(), c1259a.m5280k(), false, m5272c.f4745p).addOnCompleteListener(new C5359e2(m5272c, c1259a, m9613f2));
                return;
            }
            return;
        }
        FirebaseAuth m5272c2 = c1259a.m5272c();
        C5706p c5706p = (C5706p) C2394s.m9619l(c1259a.m5273d());
        if (c5706p.m22797M()) {
            m21551m = C2394s.m9613f(c1259a.m5278i());
            m9613f = m21551m;
        } else {
            C5403r0 c5403r0 = (C5403r0) C2394s.m9619l(c1259a.m5276g());
            m9613f = C2394s.m9613f(c5403r0.mo21515b());
            m21551m = c5403r0.m21551m();
        }
        if (c1259a.m5274e() == null || !zzads.zza(m9613f, c1259a.m5275f(), c1259a.m5270a(), c1259a.m5279j())) {
            m5272c2.f4750u.m22742a(m5272c2, m21551m, c1259a.m5270a(), m5272c2.m5208I0(), c1259a.m5280k(), false, c5706p.m22797M() ? m5272c2.f4746q : m5272c2.f4747r).addOnCompleteListener(new C1266h(m5272c2, c1259a, m9613f));
        }
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) C3767g.m14334o().m14348k(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(C3767g c3767g) {
        return (FirebaseAuth) c3767g.m14348k(FirebaseAuth.class);
    }

    /* renamed from: h0 */
    public static void m5189h0(C3773m c3773m, C1259a c1259a, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        c1259a.m5279j().execute(new Runnable() { // from class: w7.d2

            /* renamed from: i */
            public /* synthetic */ C3773m f20163i;

            public /* synthetic */ RunnableC5355d2(C3773m c3773m2) {
                r2 = c3773m2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C1260b.b.this.onVerificationFailed(r2);
            }
        });
    }

    /* renamed from: q0 */
    public static void m5191q0(FirebaseAuth firebaseAuth, AbstractC5341a0 abstractC5341a0) {
        String str;
        if (abstractC5341a0 != null) {
            str = "Notifying id token listeners about user ( " + abstractC5341a0.mo21427b() + " ).";
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f4728A.execute(new RunnableC1272n(firebaseAuth, new C1761b(abstractC5341a0 != null ? abstractC5341a0.zzd() : null)));
    }

    /* renamed from: A */
    public Task<InterfaceC5372i> m5195A(String str) {
        C2394s.m9613f(str);
        return this.f4734e.zza(this.f4730a, str, this.f4740k, new C1258d());
    }

    /* renamed from: A0 */
    public final Executor m5196A0() {
        return this.f4754y;
    }

    /* renamed from: B */
    public Task<InterfaceC5372i> m5197B(String str, String str2) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        return m5211L(str, str2, this.f4740k, null, false);
    }

    /* renamed from: C */
    public Task<InterfaceC5372i> m5198C(String str, String str2) {
        return m5266z(C5380k.m21518b(str, str2));
    }

    /* renamed from: C0 */
    public final Executor m5199C0() {
        return this.f4755z;
    }

    /* renamed from: D */
    public void m5200D() {
        m5205G0();
        C5679g1 c5679g1 = this.f4753x;
        if (c5679g1 != null) {
            c5679g1.m22757b();
        }
    }

    /* renamed from: E */
    public Task<InterfaceC5372i> m5201E(Activity activity, AbstractC5390n abstractC5390n) {
        C2394s.m9619l(abstractC5390n);
        C2394s.m9619l(activity);
        TaskCompletionSource<InterfaceC5372i> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.f4749t.m22772c(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzach.zza(new Status(17057)));
        }
        C5707p0.m22800d(activity.getApplicationContext(), this);
        abstractC5390n.mo21530c(activity);
        return taskCompletionSource.getTask();
    }

    /* renamed from: E0 */
    public final Executor m5202E0() {
        return this.f4728A;
    }

    /* renamed from: F */
    public void m5203F() {
        synchronized (this.f4737h) {
            this.f4738i = zzacu.zza();
        }
    }

    /* renamed from: G */
    public void m5204G(String str, int i10) {
        C2394s.m9613f(str);
        C2394s.m9609b(i10 >= 0 && i10 <= 65535, "Port number must be in the range 0-65535");
        zzaec.zza(this.f4730a, str, i10);
    }

    /* renamed from: G0 */
    public final void m5205G0() {
        C2394s.m9619l(this.f4748s);
        AbstractC5341a0 abstractC5341a0 = this.f4735f;
        if (abstractC5341a0 != null) {
            C5663c1 c5663c1 = this.f4748s;
            C2394s.m9619l(abstractC5341a0);
            c5663c1.m22734d(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC5341a0.mo21427b()));
            this.f4735f = null;
        }
        this.f4748s.m22734d("com.google.firebase.auth.FIREBASE_USER");
        m5191q0(this, null);
        m5186d0(this, null);
    }

    /* renamed from: H */
    public Task<String> m5206H(String str) {
        C2394s.m9613f(str);
        return this.f4734e.zzd(this.f4730a, str, this.f4740k);
    }

    /* renamed from: I */
    public final Task<zzafi> m5207I() {
        return this.f4734e.zza();
    }

    /* renamed from: I0 */
    public final boolean m5208I0() {
        return zzack.zza(m5236i().m14349m());
    }

    /* renamed from: J */
    public final Task<InterfaceC5372i> m5209J(Activity activity, AbstractC5390n abstractC5390n, AbstractC5341a0 abstractC5341a0) {
        C2394s.m9619l(activity);
        C2394s.m9619l(abstractC5390n);
        C2394s.m9619l(abstractC5341a0);
        TaskCompletionSource<InterfaceC5372i> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.f4749t.m22773d(activity, taskCompletionSource, this, abstractC5341a0)) {
            return Tasks.forException(zzach.zza(new Status(17057)));
        }
        C5707p0.m22801e(activity.getApplicationContext(), this, abstractC5341a0);
        abstractC5390n.mo21528a(activity);
        return taskCompletionSource.getTask();
    }

    /* renamed from: K */
    public final Task<zzafj> m5210K(String str) {
        return this.f4734e.zza(this.f4740k, str);
    }

    /* renamed from: L */
    public final Task<InterfaceC5372i> m5211L(String str, String str2, String str3, AbstractC5341a0 abstractC5341a0, boolean z10) {
        return new C1262d(this, str, z10, abstractC5341a0, str2, str3).m22819b(this, str3, this.f4743n, "EMAIL_PASSWORD_PROVIDER");
    }

    /* renamed from: M */
    public final Task<Void> m5212M(String str, String str2, C5356e c5356e) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        if (c5356e == null) {
            c5356e = C5356e.m21466S();
        }
        String str3 = this.f4738i;
        if (str3 != null) {
            c5356e.m21475R(str3);
        }
        return this.f4734e.zza(str, str2, c5356e);
    }

    /* renamed from: N */
    public final Task<Void> m5213N(C5356e c5356e, String str) {
        C2394s.m9613f(str);
        if (this.f4738i != null) {
            if (c5356e == null) {
                c5356e = C5356e.m21466S();
            }
            c5356e.m21475R(this.f4738i);
        }
        return this.f4734e.zza(this.f4730a, c5356e, str);
    }

    /* renamed from: O */
    public final Task<InterfaceC5372i> m5214O(C5376j c5376j, AbstractC5341a0 abstractC5341a0, boolean z10) {
        return new C1261c(this, z10, abstractC5341a0, c5376j).m22819b(this, this.f4740k, this.f4742m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* renamed from: P */
    public final Task<Void> m5215P(AbstractC5341a0 abstractC5341a0) {
        C2394s.m9619l(abstractC5341a0);
        return this.f4734e.zza(abstractC5341a0, new C5375i2(this, abstractC5341a0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    /* renamed from: Q */
    public final Task<Void> m5216Q(AbstractC5341a0 abstractC5341a0, String str) {
        C2394s.m9619l(abstractC5341a0);
        C2394s.m9613f(str);
        return this.f4734e.zza(this.f4730a, abstractC5341a0, str, this.f4740k, (InterfaceC5683h1) new C1257c()).continueWithTask(new C5367g2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    /* renamed from: R */
    public final Task<InterfaceC5372i> m5217R(AbstractC5341a0 abstractC5341a0, AbstractC5368h abstractC5368h) {
        C2394s.m9619l(abstractC5368h);
        C2394s.m9619l(abstractC5341a0);
        return abstractC5368h instanceof C5376j ? new C1267i(this, abstractC5341a0, (C5376j) abstractC5368h.mo21464K()).m22819b(this, abstractC5341a0.mo21413N(), this.f4744o, "EMAIL_PASSWORD_PROVIDER") : this.f4734e.zza(this.f4730a, abstractC5341a0, abstractC5368h.mo21464K(), (String) null, (InterfaceC5683h1) new C1257c());
    }

    /* renamed from: S */
    public final Task<Void> m5218S(AbstractC5341a0 abstractC5341a0, AbstractC5373i0 abstractC5373i0, String str) {
        C2394s.m9619l(abstractC5341a0);
        C2394s.m9619l(abstractC5373i0);
        return abstractC5373i0 instanceof C5397p0 ? this.f4734e.zza(this.f4730a, (C5397p0) abstractC5373i0, abstractC5341a0, str, new C1258d()) : abstractC5373i0 instanceof C5415v0 ? this.f4734e.zza(this.f4730a, (C5415v0) abstractC5373i0, abstractC5341a0, str, this.f4740k, new C1258d()) : Tasks.forException(zzach.zza(new Status(17499)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    /* renamed from: T */
    public final Task<Void> m5219T(AbstractC5341a0 abstractC5341a0, C5394o0 c5394o0) {
        C2394s.m9619l(abstractC5341a0);
        C2394s.m9619l(c5394o0);
        return this.f4734e.zza(this.f4730a, abstractC5341a0, (C5394o0) c5394o0.mo21464K(), (InterfaceC5683h1) new C1257c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    /* renamed from: U */
    public final Task<Void> m5220U(AbstractC5341a0 abstractC5341a0, C5350c1 c5350c1) {
        C2394s.m9619l(abstractC5341a0);
        C2394s.m9619l(c5350c1);
        return this.f4734e.zza(this.f4730a, abstractC5341a0, c5350c1, (InterfaceC5683h1) new C1257c());
    }

    /* renamed from: V */
    public final Task<Void> m5221V(AbstractC5341a0 abstractC5341a0, InterfaceC5683h1 interfaceC5683h1) {
        C2394s.m9619l(abstractC5341a0);
        return this.f4734e.zza(this.f4730a, abstractC5341a0, interfaceC5683h1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [w7.e1, x7.h1] */
    /* renamed from: W */
    public final Task<C5349c0> m5222W(AbstractC5341a0 abstractC5341a0, boolean z10) {
        if (abstractC5341a0 == null) {
            return Tasks.forException(zzach.zza(new Status(17495)));
        }
        zzafm mo21436i0 = abstractC5341a0.mo21436i0();
        return (!mo21436i0.zzg() || z10) ? this.f4734e.zza(this.f4730a, abstractC5341a0, mo21436i0.zzd(), (InterfaceC5683h1) new C5358e1(this)) : Tasks.forResult(C5698m0.m22786a(mo21436i0.zzc()));
    }

    /* renamed from: X */
    public final Task<InterfaceC5372i> m5223X(AbstractC5373i0 abstractC5373i0, C5706p c5706p, AbstractC5341a0 abstractC5341a0) {
        C2394s.m9619l(abstractC5373i0);
        C2394s.m9619l(c5706p);
        if (abstractC5373i0 instanceof C5397p0) {
            return this.f4734e.zza(this.f4730a, abstractC5341a0, (C5397p0) abstractC5373i0, C2394s.m9613f(c5706p.zzc()), new C1258d());
        }
        if (abstractC5373i0 instanceof C5415v0) {
            return this.f4734e.zza(this.f4730a, abstractC5341a0, (C5415v0) abstractC5373i0, C2394s.m9613f(c5706p.zzc()), this.f4740k, new C1258d());
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    /* renamed from: Y */
    public final Task<InterfaceC5424y0> m5224Y(C5706p c5706p) {
        C2394s.m9619l(c5706p);
        return this.f4734e.zza(c5706p, this.f4740k).continueWithTask(new C5379j2(this));
    }

    @Override // p337x7.InterfaceC5657b
    /* renamed from: a */
    public Task<C5349c0> mo5225a(boolean z10) {
        return m5222W(this.f4735f, z10);
    }

    /* renamed from: a0 */
    public final C1260b.b m5226a0(C1259a c1259a, C1260b.b bVar) {
        return c1259a.m5280k() ? bVar : new C1268j(this, c1259a, bVar);
    }

    /* renamed from: b */
    public void m5227b(InterfaceC1255a interfaceC1255a) {
        this.f4733d.add(interfaceC1255a);
        this.f4728A.execute(new RunnableC1270l(this, interfaceC1255a));
    }

    /* renamed from: b0 */
    public final C1260b.b m5228b0(String str, C1260b.b bVar) {
        return (this.f4736g.m22752g() && str != null && str.equals(this.f4736g.m22749d())) ? new C1265g(this, bVar) : bVar;
    }

    /* renamed from: c */
    public void m5229c(InterfaceC1256b interfaceC1256b) {
        this.f4731b.add(interfaceC1256b);
        this.f4728A.execute(new RunnableC1264f(this, interfaceC1256b));
    }

    /* renamed from: d */
    public Task<Void> m5230d(String str) {
        C2394s.m9613f(str);
        return this.f4734e.zza(this.f4730a, str, this.f4740k);
    }

    /* renamed from: e */
    public Task<InterfaceC5352d> m5231e(String str) {
        C2394s.m9613f(str);
        return this.f4734e.zzb(this.f4730a, str, this.f4740k);
    }

    /* renamed from: f */
    public Task<Void> m5232f(String str, String str2) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        return this.f4734e.zza(this.f4730a, str, str2, this.f4740k);
    }

    /* renamed from: g */
    public Task<InterfaceC5372i> m5233g(String str, String str2) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        return new C1269k(this, str, str2).m22819b(this, this.f4740k, this.f4744o, "EMAIL_PASSWORD_PROVIDER");
    }

    /* renamed from: g0 */
    public final void m5234g0(C1259a c1259a, String str, String str2) {
        long longValue = c1259a.m5277h().longValue();
        if (longValue < 0 || longValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String m9613f = C2394s.m9613f(c1259a.m5278i());
        zzafz zzafzVar = new zzafz(m9613f, longValue, c1259a.m5274e() != null, this.f4738i, this.f4740k, str, str2, m5208I0());
        C1260b.b m5228b0 = m5228b0(m9613f, c1259a.m5275f());
        this.f4734e.zza(this.f4730a, zzafzVar, TextUtils.isEmpty(str) ? m5226a0(c1259a, m5228b0) : m5228b0, c1259a.m5270a(), c1259a.m5279j());
    }

    @Deprecated
    /* renamed from: h */
    public Task<InterfaceC5412u0> m5235h(String str) {
        C2394s.m9613f(str);
        return this.f4734e.zzc(this.f4730a, str, this.f4740k);
    }

    /* renamed from: i */
    public C3767g m5236i() {
        return this.f4730a;
    }

    /* renamed from: i0 */
    public final void m5237i0(AbstractC5341a0 abstractC5341a0, zzafm zzafmVar, boolean z10) {
        m5239j0(abstractC5341a0, zzafmVar, true, false);
    }

    /* renamed from: j */
    public AbstractC5341a0 m5238j() {
        return this.f4735f;
    }

    /* renamed from: j0 */
    public final void m5239j0(AbstractC5341a0 abstractC5341a0, zzafm zzafmVar, boolean z10, boolean z11) {
        m5187e0(this, abstractC5341a0, zzafmVar, true, z11);
    }

    /* renamed from: k */
    public String m5240k() {
        return this.f4729B;
    }

    /* renamed from: k0 */
    public final synchronized void m5241k0(C5659b1 c5659b1) {
        this.f4741l = c5659b1;
    }

    /* renamed from: l */
    public AbstractC5417w m5242l() {
        return this.f4736g;
    }

    /* renamed from: l0 */
    public final Task<InterfaceC5372i> m5243l0(Activity activity, AbstractC5390n abstractC5390n, AbstractC5341a0 abstractC5341a0) {
        C2394s.m9619l(activity);
        C2394s.m9619l(abstractC5390n);
        C2394s.m9619l(abstractC5341a0);
        TaskCompletionSource<InterfaceC5372i> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.f4749t.m22773d(activity, taskCompletionSource, this, abstractC5341a0)) {
            return Tasks.forException(zzach.zza(new Status(17057)));
        }
        C5707p0.m22801e(activity.getApplicationContext(), this, abstractC5341a0);
        abstractC5390n.mo21529b(activity);
        return taskCompletionSource.getTask();
    }

    /* renamed from: m */
    public String m5244m() {
        String str;
        synchronized (this.f4737h) {
            str = this.f4738i;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    /* renamed from: m0 */
    public final Task<Void> m5245m0(AbstractC5341a0 abstractC5341a0) {
        return m5221V(abstractC5341a0, new C1257c());
    }

    /* renamed from: n */
    public String m5246n() {
        String str;
        synchronized (this.f4739j) {
            str = this.f4740k;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    /* renamed from: n0 */
    public final Task<InterfaceC5372i> m5247n0(AbstractC5341a0 abstractC5341a0, String str) {
        C2394s.m9613f(str);
        C2394s.m9619l(abstractC5341a0);
        return this.f4734e.zzb(this.f4730a, abstractC5341a0, str, new C1257c());
    }

    /* renamed from: o */
    public String m5248o() {
        AbstractC5341a0 abstractC5341a0 = this.f4735f;
        if (abstractC5341a0 == null) {
            return null;
        }
        return abstractC5341a0.mo21427b();
    }

    /* renamed from: p */
    public Task<Void> m5249p() {
        if (this.f4741l == null) {
            this.f4741l = new C5659b1(this.f4730a, this);
        }
        return this.f4741l.m22727a(this.f4740k, Boolean.FALSE).continueWithTask(new C5383k2(this));
    }

    /* renamed from: p0 */
    public final synchronized C5659b1 m5250p0() {
        return this.f4741l;
    }

    /* renamed from: q */
    public void m5251q(InterfaceC1255a interfaceC1255a) {
        this.f4733d.remove(interfaceC1255a);
    }

    /* renamed from: r */
    public void m5252r(InterfaceC1256b interfaceC1256b) {
        this.f4731b.remove(interfaceC1256b);
    }

    /* renamed from: r0 */
    public final boolean m5253r0(String str) {
        C5360f m21490c = C5360f.m21490c(str);
        return (m21490c == null || TextUtils.equals(this.f4740k, m21490c.m21494d())) ? false : true;
    }

    /* renamed from: s */
    public Task<Void> m5254s(String str) {
        C2394s.m9613f(str);
        return m5255t(str, null);
    }

    /* renamed from: t */
    public Task<Void> m5255t(String str, C5356e c5356e) {
        C2394s.m9613f(str);
        if (c5356e == null) {
            c5356e = C5356e.m21466S();
        }
        String str2 = this.f4738i;
        if (str2 != null) {
            c5356e.m21475R(str2);
        }
        c5356e.m21474Q(1);
        return new C5363f2(this, str, c5356e).m22819b(this, this.f4740k, this.f4742m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    /* renamed from: t0 */
    public final Task<Void> m5256t0(AbstractC5341a0 abstractC5341a0, String str) {
        C2394s.m9619l(abstractC5341a0);
        C2394s.m9613f(str);
        return this.f4734e.zzc(this.f4730a, abstractC5341a0, str, new C1257c());
    }

    /* renamed from: u */
    public Task<Void> m5257u(String str, C5356e c5356e) {
        C2394s.m9613f(str);
        C2394s.m9619l(c5356e);
        if (!c5356e.m21467I()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = this.f4738i;
        if (str2 != null) {
            c5356e.m21475R(str2);
        }
        return new C5371h2(this, str, c5356e).m22819b(this, this.f4740k, this.f4742m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    /* renamed from: u0 */
    public final Task<InterfaceC5372i> m5258u0(AbstractC5341a0 abstractC5341a0, AbstractC5368h abstractC5368h) {
        C2394s.m9619l(abstractC5341a0);
        C2394s.m9619l(abstractC5368h);
        AbstractC5368h mo21464K = abstractC5368h.mo21464K();
        if (!(mo21464K instanceof C5376j)) {
            return mo21464K instanceof C5394o0 ? this.f4734e.zzb(this.f4730a, abstractC5341a0, (C5394o0) mo21464K, this.f4740k, (InterfaceC5683h1) new C1257c()) : this.f4734e.zzc(this.f4730a, abstractC5341a0, mo21464K, abstractC5341a0.mo21413N(), new C1257c());
        }
        C5376j c5376j = (C5376j) mo21464K;
        return "password".equals(c5376j.mo21463J()) ? m5211L(c5376j.zzc(), C2394s.m9613f(c5376j.zzd()), abstractC5341a0.mo21413N(), abstractC5341a0, true) : m5253r0(C2394s.m9613f(c5376j.zze())) ? Tasks.forException(zzach.zza(new Status(17072))) : m5214O(c5376j, abstractC5341a0, true);
    }

    /* renamed from: v */
    public void m5259v(String str) {
        String str2;
        C2394s.m9613f(str);
        if (str.startsWith("chrome-extension://")) {
            this.f4729B = str;
            return;
        }
        if (str.contains("://")) {
            str2 = str;
        } else {
            str2 = "http://" + str;
        }
        try {
            this.f4729B = (String) C2394s.m9619l(new URI(str2).getHost());
        } catch (URISyntaxException e10) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e10.getMessage());
            }
            this.f4729B = str;
        }
    }

    /* renamed from: v0 */
    public final InterfaceC5896b<InterfaceC5140b> m5260v0() {
        return this.f4751v;
    }

    /* renamed from: w */
    public void m5261w(String str) {
        C2394s.m9613f(str);
        synchronized (this.f4737h) {
            this.f4738i = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$c, x7.h1] */
    /* renamed from: w0 */
    public final Task<Void> m5262w0(AbstractC5341a0 abstractC5341a0, String str) {
        C2394s.m9619l(abstractC5341a0);
        C2394s.m9613f(str);
        return this.f4734e.zzd(this.f4730a, abstractC5341a0, str, new C1257c());
    }

    /* renamed from: x */
    public void m5263x(String str) {
        C2394s.m9613f(str);
        synchronized (this.f4739j) {
            this.f4740k = str;
        }
    }

    /* renamed from: y */
    public Task<InterfaceC5372i> m5264y() {
        AbstractC5341a0 abstractC5341a0 = this.f4735f;
        if (abstractC5341a0 == null || !abstractC5341a0.mo21414O()) {
            return this.f4734e.zza(this.f4730a, new C1258d(), this.f4740k);
        }
        C5685i c5685i = (C5685i) this.f4735f;
        c5685i.m22763n0(false);
        return Tasks.forResult(new C5684h2(c5685i));
    }

    /* renamed from: y0 */
    public final InterfaceC5896b<InterfaceC5149i> m5265y0() {
        return this.f4752w;
    }

    /* renamed from: z */
    public Task<InterfaceC5372i> m5266z(AbstractC5368h abstractC5368h) {
        C2394s.m9619l(abstractC5368h);
        AbstractC5368h mo21464K = abstractC5368h.mo21464K();
        if (mo21464K instanceof C5376j) {
            C5376j c5376j = (C5376j) mo21464K;
            return !c5376j.m21511O() ? m5211L(c5376j.zzc(), (String) C2394s.m9619l(c5376j.zzd()), this.f4740k, null, false) : m5253r0(C2394s.m9613f(c5376j.zze())) ? Tasks.forException(zzach.zza(new Status(17072))) : m5214O(c5376j, null, false);
        }
        if (mo21464K instanceof C5394o0) {
            return this.f4734e.zza(this.f4730a, (C5394o0) mo21464K, this.f4740k, (InterfaceC5720t1) new C1258d());
        }
        return this.f4734e.zza(this.f4730a, mo21464K, this.f4740k, new C1258d());
    }
}
