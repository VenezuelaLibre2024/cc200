package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.C1288e;
import java.util.Map;
import java.util.concurrent.Executor;
import p285u.C4771a;

/* renamed from: com.google.firebase.messaging.e */
/* loaded from: classes.dex */
public class C1288e {

    /* renamed from: a */
    public final Executor f4908a;

    /* renamed from: b */
    public final Map<String, Task<String>> f4909b = new C4771a();

    /* renamed from: com.google.firebase.messaging.e$a */
    /* loaded from: classes.dex */
    public interface a {
        Task<String> start();
    }

    public C1288e(Executor executor) {
        this.f4908a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Task m5546c(String str, Task task) {
        synchronized (this) {
            this.f4909b.remove(str);
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public synchronized Task<String> m5547b(final String str, a aVar) {
        Task<String> task = this.f4909b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task continueWithTask = aVar.start().continueWithTask(this.f4908a, new Continuation() { // from class: g9.n0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task m5546c;
                m5546c = C1288e.this.m5546c(str, task2);
                return m5546c;
            }
        });
        this.f4909b.put(str, continueWithTask);
        return continueWithTask;
    }
}
