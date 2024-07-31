package p042d0;

import android.location.GnssMeasurementsEvent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import p042d0.C1510b;
import p090g0.C1948h;
import p133j0.C3203b;

/* renamed from: d0.b */
/* loaded from: classes.dex */
public final class C1510b {

    /* renamed from: a */
    public static final WeakHashMap<c, WeakReference<d>> f5501a = new WeakHashMap<>();

    /* renamed from: d0.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static Class<?> f5502a;

        /* renamed from: b */
        public static Method f5503b;

        /* renamed from: a */
        public static boolean m6117a(LocationManager locationManager, String str, C1517i c1517i, InterfaceC1509a interfaceC1509a, Looper looper) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    if (f5502a == null) {
                        f5502a = Class.forName("android.location.LocationRequest");
                    }
                    if (f5503b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f5502a, LocationListener.class, Looper.class);
                        f5503b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest m6144i = c1517i.m6144i(str);
                    if (m6144i != null) {
                        f5503b.invoke(locationManager, m6144i, interfaceC1509a, looper);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }

        /* renamed from: b */
        public static boolean m6118b(LocationManager locationManager, String str, C1517i c1517i, d dVar) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    if (f5502a == null) {
                        f5502a = Class.forName("android.location.LocationRequest");
                    }
                    if (f5503b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f5502a, LocationListener.class, Looper.class);
                        f5503b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest m6144i = c1517i.m6144i(str);
                    if (m6144i != null) {
                        synchronized (C1510b.f5501a) {
                            f5503b.invoke(locationManager, m6144i, dVar, Looper.getMainLooper());
                            C1510b.m6115a(locationManager, dVar);
                        }
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    /* renamed from: d0.b$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static boolean m6119a(LocationManager locationManager, String str) {
            return locationManager.hasProvider(str);
        }

        /* renamed from: b */
        public static boolean m6120b(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        /* renamed from: c */
        public static void m6121c(LocationManager locationManager, String str, LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* renamed from: d0.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final String f5504a;

        /* renamed from: b */
        public final InterfaceC1509a f5505b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f5504a.equals(cVar.f5504a) && this.f5505b.equals(cVar.f5505b);
        }

        public int hashCode() {
            return C3203b.m11400b(this.f5504a, this.f5505b);
        }
    }

    /* renamed from: d0.b$d */
    /* loaded from: classes.dex */
    public static class d implements LocationListener {

        /* renamed from: a */
        public volatile c f5506a;

        /* renamed from: b */
        public final Executor f5507b;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m6128h(int i10) {
            c cVar = this.f5506a;
            if (cVar == null) {
                return;
            }
            cVar.f5505b.onFlushComplete(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m6129i(Location location) {
            c cVar = this.f5506a;
            if (cVar == null) {
                return;
            }
            cVar.f5505b.onLocationChanged(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m6130j(List list) {
            c cVar = this.f5506a;
            if (cVar == null) {
                return;
            }
            cVar.f5505b.onLocationChanged((List<Location>) list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m6131k(String str) {
            c cVar = this.f5506a;
            if (cVar == null) {
                return;
            }
            cVar.f5505b.onProviderDisabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m6132l(String str) {
            c cVar = this.f5506a;
            if (cVar == null) {
                return;
            }
            cVar.f5505b.onProviderEnabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m6133m(String str, int i10, Bundle bundle) {
            c cVar = this.f5506a;
            if (cVar == null) {
                return;
            }
            cVar.f5505b.onStatusChanged(str, i10, bundle);
        }

        /* renamed from: g */
        public c m6134g() {
            return (c) C3203b.m11401c(this.f5506a);
        }

        /* renamed from: n */
        public void m6135n() {
            this.f5506a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i10) {
            if (this.f5506a == null) {
                return;
            }
            this.f5507b.execute(new Runnable() { // from class: d0.c
                @Override // java.lang.Runnable
                public final void run() {
                    C1510b.d.this.m6128h(i10);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            if (this.f5506a == null) {
                return;
            }
            this.f5507b.execute(new Runnable() { // from class: d0.d
                @Override // java.lang.Runnable
                public final void run() {
                    C1510b.d.this.m6129i(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final List<Location> list) {
            if (this.f5506a == null) {
                return;
            }
            this.f5507b.execute(new Runnable() { // from class: d0.h
                @Override // java.lang.Runnable
                public final void run() {
                    C1510b.d.this.m6130j(list);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(final String str) {
            if (this.f5506a == null) {
                return;
            }
            this.f5507b.execute(new Runnable() { // from class: d0.f
                @Override // java.lang.Runnable
                public final void run() {
                    C1510b.d.this.m6131k(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(final String str) {
            if (this.f5506a == null) {
                return;
            }
            this.f5507b.execute(new Runnable() { // from class: d0.e
                @Override // java.lang.Runnable
                public final void run() {
                    C1510b.d.this.m6132l(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i10, final Bundle bundle) {
            if (this.f5506a == null) {
                return;
            }
            this.f5507b.execute(new Runnable() { // from class: d0.g
                @Override // java.lang.Runnable
                public final void run() {
                    C1510b.d.this.m6133m(str, i10, bundle);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m6115a(LocationManager locationManager, d dVar) {
        WeakReference<d> put = f5501a.put(dVar.m6134g(), new WeakReference<>(dVar));
        d dVar2 = put != null ? put.get() : null;
        if (dVar2 != null) {
            dVar2.m6135n();
            locationManager.removeUpdates(dVar2);
        }
    }

    /* renamed from: b */
    public static void m6116b(LocationManager locationManager, String str, C1517i c1517i, InterfaceC1509a interfaceC1509a, Looper looper) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            b.m6121c(locationManager, str, c1517i.m6143h(), C1948h.m7860a(new Handler(looper)), interfaceC1509a);
        } else if (i10 < 19 || !a.m6117a(locationManager, str, c1517i, interfaceC1509a, looper)) {
            locationManager.requestLocationUpdates(str, c1517i.m6137b(), c1517i.m6140e(), interfaceC1509a, looper);
        }
    }
}
