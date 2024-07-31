package ma;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import p130ib.C2693h;
import p130ib.C2694i;

/* renamed from: ma.b */
/* loaded from: classes.dex */
public final class C3593b implements SensorEventListener {

    /* renamed from: a */
    public C2693h f12650a;

    /* renamed from: b */
    public C2694i f12651b;

    /* renamed from: c */
    public Sensor f12652c;

    /* renamed from: d */
    public Context f12653d;

    /* renamed from: e */
    public Handler f12654e = new Handler();

    public C3593b(Context context, C2693h c2693h, C2694i c2694i) {
        this.f12653d = context;
        this.f12650a = c2693h;
        this.f12651b = c2694i;
    }

    /* renamed from: b */
    public /* synthetic */ void m13318b(boolean z10) {
        this.f12650a.m10984t(z10);
    }

    /* renamed from: c */
    public final void m13319c(boolean z10) {
        this.f12654e.post(new Runnable() { // from class: ma.a

            /* renamed from: i */
            public final /* synthetic */ boolean f12649i;

            public /* synthetic */ RunnableC3592a(boolean z102) {
                r2 = z102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3593b.this.m13318b(r2);
            }
        });
    }

    /* renamed from: d */
    public void m13320d() {
        if (this.f12651b.m10992d()) {
            SensorManager sensorManager = (SensorManager) this.f12653d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f12652c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    /* renamed from: e */
    public void m13321e() {
        if (this.f12652c != null) {
            ((SensorManager) this.f12653d.getSystemService("sensor")).unregisterListener(this);
            this.f12652c = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (this.f12650a != null) {
            if (f10 <= 45.0f) {
                m13319c(true);
            } else if (f10 >= 450.0f) {
                m13319c(false);
            }
        }
    }
}
