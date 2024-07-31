package p260s;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import p014b.InterfaceC0435b;

/* renamed from: s.e */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC4383e implements ServiceConnection {
    private Context mApplicationContext;

    /* renamed from: s.e$a */
    /* loaded from: classes.dex */
    public class a extends C4381c {
        public a(InterfaceC0435b interfaceC0435b, ComponentName componentName, Context context) {
            super(interfaceC0435b, componentName, context);
        }
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, C4381c c4381c);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new a(InterfaceC0435b.a.m2247c(iBinder), componentName, this.mApplicationContext));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
