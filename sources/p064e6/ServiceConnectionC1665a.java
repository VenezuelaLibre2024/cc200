package p064e6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p108h6.C2394s;

/* renamed from: e6.a */
/* loaded from: classes.dex */
public class ServiceConnectionC1665a implements ServiceConnection {

    /* renamed from: h */
    public boolean f6225h = false;

    /* renamed from: i */
    public final BlockingQueue f6226i = new LinkedBlockingQueue();

    @ResultIgnorabilityUnspecified
    /* renamed from: a */
    public IBinder m6674a() {
        C2394s.m9618k("BlockingServiceConnection.getService() called on main thread");
        if (this.f6225h) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f6225h = true;
        return (IBinder) this.f6226i.take();
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: b */
    public IBinder m6675b(long j10, TimeUnit timeUnit) {
        C2394s.m9618k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f6225h) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f6225h = true;
        IBinder iBinder = (IBinder) this.f6226i.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f6226i.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
