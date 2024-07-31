package p099g9;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.window.layout.ExecutorC0412c;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p099g9.ServiceConnectionC2171e1;

/* renamed from: g9.b1 */
/* loaded from: classes.dex */
public class BinderC2162b1 extends Binder {

    /* renamed from: a */
    public final a f8656a;

    /* renamed from: g9.b1$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        Task<Void> mo8707a(Intent intent);
    }

    public BinderC2162b1(a aVar) {
        this.f8656a = aVar;
    }

    /* renamed from: c */
    public void m8706c(final ServiceConnectionC2171e1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f8656a.mo8707a(aVar.f8683a).addOnCompleteListener(ExecutorC0412c.f1952h, new OnCompleteListener() { // from class: g9.a1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ServiceConnectionC2171e1.a.this.m8752d();
            }
        });
    }
}
