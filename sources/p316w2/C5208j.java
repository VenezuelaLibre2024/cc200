package p316w2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.security.SecureRandom;
import java.util.Objects;
import p079f6.C1842b;
import p079f6.C1851k;
import p303v2.EnumC5102b;
import p303v2.InterfaceC5101a;
import p320w6.AbstractC5312m;
import p320w6.C5316o;
import p320w6.C5318p;
import p320w6.C5320q;
import p320w6.C5324s;
import p320w6.InterfaceC5300g;

/* renamed from: w2.j */
/* loaded from: classes.dex */
public class C5208j implements InterfaceC5213o {

    /* renamed from: a */
    public final Context f19742a;

    /* renamed from: b */
    public final AbstractC5312m f19743b;

    /* renamed from: c */
    public final InterfaceC5300g f19744c;

    /* renamed from: d */
    public final C5220v f19745d;

    /* renamed from: e */
    public final int f19746e = m21086s();

    /* renamed from: f */
    public final C5216r f19747f;

    /* renamed from: g */
    public InterfaceC5101a f19748g;

    /* renamed from: h */
    public InterfaceC5221w f19749h;

    /* renamed from: w2.j$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC5312m {

        /* renamed from: a */
        public final /* synthetic */ Context f19750a;

        public a(Context context) {
            this.f19750a = context;
        }

        @Override // p320w6.AbstractC5312m
        public synchronized void onLocationAvailability(LocationAvailability locationAvailability) {
            if (!locationAvailability.m5029I() && !C5208j.this.m21097a(this.f19750a) && C5208j.this.f19748g != null) {
                C5208j.this.f19748g.mo18816a(EnumC5102b.locationServicesDisabled);
            }
        }

        @Override // p320w6.AbstractC5312m
        public synchronized void onLocationResult(LocationResult locationResult) {
            if (C5208j.this.f19749h != null) {
                Location m5065I = locationResult.m5065I();
                C5208j.this.f19745d.m21110b(m5065I);
                C5208j.this.f19749h.mo18817a(m5065I);
            } else {
                Log.e("FlutterGeolocator", "LocationCallback was called with empty locationResult or no positionChangedCallback was registered.");
                C5208j.this.f19744c.removeLocationUpdates(C5208j.this.f19743b);
                if (C5208j.this.f19748g != null) {
                    C5208j.this.f19748g.mo18816a(EnumC5102b.errorWhileAcquiringPosition);
                }
            }
        }
    }

    /* renamed from: w2.j$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19752a;

        static {
            int[] iArr = new int[EnumC5210l.values().length];
            f19752a = iArr;
            try {
                iArr[EnumC5210l.lowest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19752a[EnumC5210l.low.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19752a[EnumC5210l.medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C5208j(Context context, C5216r c5216r) {
        this.f19742a = context;
        this.f19744c = C5316o.m21388a(context);
        this.f19747f = c5216r;
        this.f19745d = new C5220v(context, c5216r);
        this.f19743b = new a(context);
    }

    /* renamed from: p */
    public static LocationRequest m21073p(C5216r c5216r) {
        if (Build.VERSION.SDK_INT < 33) {
            return m21074q(c5216r);
        }
        LocationRequest.C1178a c1178a = new LocationRequest.C1178a(0L);
        if (c5216r != null) {
            c1178a.m5059h(m21080y(c5216r.m21104a()));
            c1178a.m5055d(c5216r.m21106c());
            c1178a.m5058g(c5216r.m21106c());
            c1178a.m5057f((float) c5216r.m21105b());
        }
        return c1178a.m5052a();
    }

    /* renamed from: q */
    public static LocationRequest m21074q(C5216r c5216r) {
        LocationRequest m5030I = LocationRequest.m5030I();
        if (c5216r != null) {
            m5030I.m5046X(m21080y(c5216r.m21104a()));
            m5030I.m5045W(c5216r.m21106c());
            m5030I.m5044V(c5216r.m21106c() / 2);
            m5030I.m5047Y((float) c5216r.m21105b());
        }
        return m5030I;
    }

    /* renamed from: r */
    public static C5318p m21075r(LocationRequest locationRequest) {
        C5318p.a aVar = new C5318p.a();
        aVar.m21392a(locationRequest);
        return aVar.m21393b();
    }

    /* renamed from: t */
    public static /* synthetic */ void m21076t(InterfaceC5101a interfaceC5101a, Exception exc) {
        Log.e("Geolocator", "Error trying to get last the last known GPS location");
        if (interfaceC5101a != null) {
            interfaceC5101a.mo18816a(EnumC5102b.errorWhileAcquiringPosition);
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m21077u(InterfaceC5217s interfaceC5217s, Task task) {
        if (!task.isSuccessful()) {
            interfaceC5217s.mo21056b(EnumC5102b.locationServicesDisabled);
        }
        C5320q c5320q = (C5320q) task.getResult();
        if (c5320q == null) {
            interfaceC5217s.mo21056b(EnumC5102b.locationServicesDisabled);
            return;
        }
        C5324s m21394b = c5320q.m21394b();
        boolean z10 = true;
        boolean z11 = m21394b != null && m21394b.m21399L();
        boolean z12 = m21394b != null && m21394b.m21401N();
        if (!z11 && !z12) {
            z10 = false;
        }
        interfaceC5217s.mo21055a(z10);
    }

    /* renamed from: v */
    public /* synthetic */ void m21078v(C5320q c5320q) {
        m21087x(this.f19747f);
    }

    /* renamed from: w */
    public /* synthetic */ void m21079w(Activity activity, InterfaceC5101a interfaceC5101a, Exception exc) {
        if (exc instanceof C1851k) {
            if (activity == null) {
                interfaceC5101a.mo18816a(EnumC5102b.locationServicesDisabled);
                return;
            }
            C1851k c1851k = (C1851k) exc;
            if (c1851k.getStatusCode() == 6) {
                try {
                    c1851k.m7600a(activity, this.f19746e);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        } else if (((C1842b) exc).getStatusCode() == 8502) {
            m21087x(this.f19747f);
            return;
        }
        interfaceC5101a.mo18816a(EnumC5102b.locationServicesDisabled);
    }

    /* renamed from: y */
    public static int m21080y(EnumC5210l enumC5210l) {
        int i10 = b.f19752a[enumC5210l.ordinal()];
        if (i10 == 1) {
            return C1417R.styleable.AppCompatTheme_textAppearanceListItemSmall;
        }
        if (i10 == 2) {
            return C1417R.styleable.AppCompatTheme_textAppearanceListItemSecondary;
        }
        if (i10 != 3) {
            return 100;
        }
        return C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
    }

    @Override // p316w2.InterfaceC5213o
    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public void mo21081b(Activity activity, InterfaceC5221w interfaceC5221w, InterfaceC5101a interfaceC5101a) {
        this.f19749h = interfaceC5221w;
        this.f19748g = interfaceC5101a;
        C5316o.m21389b(this.f19742a).checkLocationSettings(m21075r(m21073p(this.f19747f))).addOnSuccessListener(new OnSuccessListener() { // from class: w2.h
            public /* synthetic */ C5206h() {
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C5208j.this.m21078v((C5320q) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: w2.g

            /* renamed from: b */
            public final /* synthetic */ Activity f19738b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC5101a f19739c;

            public /* synthetic */ C5205g(Activity activity2, InterfaceC5101a interfaceC5101a2) {
                r2 = activity2;
                r3 = interfaceC5101a2;
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C5208j.this.m21079w(r2, r3, exc);
            }
        });
    }

    @Override // p316w2.InterfaceC5213o
    /* renamed from: c */
    public boolean mo21082c(int i10, int i11) {
        if (i10 == this.f19746e) {
            if (i11 == -1) {
                C5216r c5216r = this.f19747f;
                if (c5216r == null || this.f19749h == null || this.f19748g == null) {
                    return false;
                }
                m21087x(c5216r);
                return true;
            }
            InterfaceC5101a interfaceC5101a = this.f19748g;
            if (interfaceC5101a != null) {
                interfaceC5101a.mo18816a(EnumC5102b.locationServicesDisabled);
            }
        }
        return false;
    }

    @Override // p316w2.InterfaceC5213o
    @SuppressLint({"MissingPermission"})
    /* renamed from: d */
    public void mo21083d(InterfaceC5221w interfaceC5221w, InterfaceC5101a interfaceC5101a) {
        Task<Location> lastLocation = this.f19744c.getLastLocation();
        Objects.requireNonNull(interfaceC5221w);
        lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: w2.i
            public /* synthetic */ C5207i() {
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                InterfaceC5221w.this.mo18817a((Location) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: w2.f
            public /* synthetic */ C5204f() {
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C5208j.m21076t(InterfaceC5101a.this, exc);
            }
        });
    }

    @Override // p316w2.InterfaceC5213o
    /* renamed from: e */
    public void mo21084e(InterfaceC5217s interfaceC5217s) {
        C5316o.m21389b(this.f19742a).checkLocationSettings(new C5318p.a().m21393b()).addOnCompleteListener(new OnCompleteListener() { // from class: w2.e
            public /* synthetic */ C5203e() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C5208j.m21077u(InterfaceC5217s.this, task);
            }
        });
    }

    @Override // p316w2.InterfaceC5213o
    /* renamed from: f */
    public void mo21085f() {
        this.f19745d.m21112e();
        this.f19744c.removeLocationUpdates(this.f19743b);
    }

    /* renamed from: s */
    public final synchronized int m21086s() {
        return new SecureRandom().nextInt(65536);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: x */
    public final void m21087x(C5216r c5216r) {
        LocationRequest m21073p = m21073p(c5216r);
        this.f19745d.m21111d();
        this.f19744c.requestLocationUpdates(m21073p, this.f19743b, Looper.getMainLooper());
    }
}
