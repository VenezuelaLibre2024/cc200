package com.google.firebase.auth;

import android.app.Activity;
import com.google.firebase.auth.C1260b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p108h6.C2394s;
import p321w7.AbstractC5385l0;
import p321w7.C5403r0;
import p321w7.C5404r1;
import p337x7.C5706p;

/* renamed from: com.google.firebase.auth.a */
/* loaded from: classes.dex */
public final class C1259a {

    /* renamed from: a */
    public final FirebaseAuth f4758a;

    /* renamed from: b */
    public Long f4759b;

    /* renamed from: c */
    public C1260b.b f4760c;

    /* renamed from: d */
    public Executor f4761d;

    /* renamed from: e */
    public String f4762e;

    /* renamed from: f */
    public Activity f4763f;

    /* renamed from: g */
    public C1260b.a f4764g;

    /* renamed from: h */
    public AbstractC5385l0 f4765h;

    /* renamed from: i */
    public C5403r0 f4766i;

    /* renamed from: j */
    public boolean f4767j;

    /* renamed from: k */
    public boolean f4768k;

    /* renamed from: com.google.firebase.auth.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final FirebaseAuth f4769a;

        /* renamed from: b */
        public String f4770b;

        /* renamed from: c */
        public Long f4771c;

        /* renamed from: d */
        public C1260b.b f4772d;

        /* renamed from: e */
        public Executor f4773e;

        /* renamed from: f */
        public Activity f4774f;

        /* renamed from: g */
        public C1260b.a f4775g;

        /* renamed from: h */
        public AbstractC5385l0 f4776h;

        /* renamed from: i */
        public C5403r0 f4777i;

        /* renamed from: j */
        public boolean f4778j;

        public a(FirebaseAuth firebaseAuth) {
            this.f4769a = (FirebaseAuth) C2394s.m9619l(firebaseAuth);
        }

        /* renamed from: a */
        public final C1259a m5283a() {
            boolean z10;
            String str;
            C2394s.m9620m(this.f4769a, "FirebaseAuth instance cannot be null");
            C2394s.m9620m(this.f4771c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            C2394s.m9620m(this.f4772d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.f4773e = this.f4769a.m5202E0();
            if (this.f4771c.longValue() < 0 || this.f4771c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            AbstractC5385l0 abstractC5385l0 = this.f4776h;
            if (abstractC5385l0 == null) {
                C2394s.m9614g(this.f4770b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                C2394s.m9609b(!this.f4778j, "You cannot require sms validation without setting a multi-factor session.");
                C2394s.m9609b(this.f4777i == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else {
                if (abstractC5385l0 != null && ((C5706p) abstractC5385l0).m22797M()) {
                    C2394s.m9613f(this.f4770b);
                    z10 = this.f4777i == null;
                    str = "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.";
                } else {
                    C2394s.m9609b(this.f4777i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                    z10 = this.f4770b == null;
                    str = "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.";
                }
                C2394s.m9609b(z10, str);
            }
            return new C1259a(this.f4769a, this.f4771c, this.f4772d, this.f4773e, this.f4770b, this.f4774f, this.f4775g, this.f4776h, this.f4777i, this.f4778j);
        }

        /* renamed from: b */
        public final a m5284b(Activity activity) {
            this.f4774f = activity;
            return this;
        }

        /* renamed from: c */
        public final a m5285c(C1260b.b bVar) {
            this.f4772d = bVar;
            return this;
        }

        /* renamed from: d */
        public final a m5286d(C1260b.a aVar) {
            this.f4775g = aVar;
            return this;
        }

        /* renamed from: e */
        public final a m5287e(C5403r0 c5403r0) {
            this.f4777i = c5403r0;
            return this;
        }

        /* renamed from: f */
        public final a m5288f(AbstractC5385l0 abstractC5385l0) {
            this.f4776h = abstractC5385l0;
            return this;
        }

        /* renamed from: g */
        public final a m5289g(String str) {
            this.f4770b = str;
            return this;
        }

        /* renamed from: h */
        public final a m5290h(Long l10, TimeUnit timeUnit) {
            this.f4771c = Long.valueOf(TimeUnit.SECONDS.convert(l10.longValue(), timeUnit));
            return this;
        }
    }

    public C1259a(FirebaseAuth firebaseAuth, Long l10, C1260b.b bVar, Executor executor, String str, Activity activity, C1260b.a aVar, AbstractC5385l0 abstractC5385l0, C5403r0 c5403r0, boolean z10) {
        this.f4758a = firebaseAuth;
        this.f4762e = str;
        this.f4759b = l10;
        this.f4760c = bVar;
        this.f4763f = activity;
        this.f4761d = executor;
        this.f4764g = aVar;
        this.f4765h = abstractC5385l0;
        this.f4766i = c5403r0;
        this.f4767j = z10;
    }

    public /* synthetic */ C1259a(FirebaseAuth firebaseAuth, Long l10, C1260b.b bVar, Executor executor, String str, Activity activity, C1260b.a aVar, AbstractC5385l0 abstractC5385l0, C5403r0 c5403r0, boolean z10, C5404r1 c5404r1) {
        this(firebaseAuth, l10, bVar, executor, str, activity, aVar, abstractC5385l0, c5403r0, z10);
    }

    /* renamed from: a */
    public final Activity m5270a() {
        return this.f4763f;
    }

    /* renamed from: b */
    public final void m5271b(boolean z10) {
        this.f4768k = true;
    }

    /* renamed from: c */
    public final FirebaseAuth m5272c() {
        return this.f4758a;
    }

    /* renamed from: d */
    public final AbstractC5385l0 m5273d() {
        return this.f4765h;
    }

    /* renamed from: e */
    public final C1260b.a m5274e() {
        return this.f4764g;
    }

    /* renamed from: f */
    public final C1260b.b m5275f() {
        return this.f4760c;
    }

    /* renamed from: g */
    public final C5403r0 m5276g() {
        return this.f4766i;
    }

    /* renamed from: h */
    public final Long m5277h() {
        return this.f4759b;
    }

    /* renamed from: i */
    public final String m5278i() {
        return this.f4762e;
    }

    /* renamed from: j */
    public final Executor m5279j() {
        return this.f4761d;
    }

    /* renamed from: k */
    public final boolean m5280k() {
        return this.f4768k;
    }

    /* renamed from: l */
    public final boolean m5281l() {
        return this.f4767j;
    }

    /* renamed from: m */
    public final boolean m5282m() {
        return this.f4765h != null;
    }
}
