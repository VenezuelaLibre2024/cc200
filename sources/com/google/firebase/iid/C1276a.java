package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.C1276a;
import java.util.Map;
import java.util.concurrent.Executor;
import p285u.C4771a;
import p322w8.InterfaceC5440l;

/* renamed from: com.google.firebase.iid.a */
/* loaded from: classes.dex */
public class C1276a {

    /* renamed from: a */
    public final Executor f4834a;

    /* renamed from: b */
    public final Map<Pair<String, String>, Task<InterfaceC5440l>> f4835b = new C4771a();

    /* renamed from: com.google.firebase.iid.a$a */
    /* loaded from: classes.dex */
    public interface a {
        Task<InterfaceC5440l> start();
    }

    public C1276a(Executor executor) {
        this.f4834a = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public synchronized Task<InterfaceC5440l> m5371a(String str, String str2, a aVar) {
        final Pair pair = new Pair(str, str2);
        Task<InterfaceC5440l> task = this.f4835b.get(pair);
        if (task != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 29);
                sb2.append("Joining ongoing request for: ");
                sb2.append(valueOf);
                Log.d("FirebaseInstanceId", sb2.toString());
            }
            return task;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 24);
            sb3.append("Making new request for: ");
            sb3.append(valueOf2);
            Log.d("FirebaseInstanceId", sb3.toString());
        }
        Task continueWithTask = aVar.start().continueWithTask(this.f4834a, new Continuation(this, pair) { // from class: w8.r

            /* renamed from: a */
            public final C1276a f20297a;

            /* renamed from: b */
            public final Pair f20298b;

            {
                this.f20297a = this;
                this.f20298b = pair;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task2) {
                this.f20297a.m5372b(this.f20298b, task2);
                return task2;
            }
        });
        this.f4835b.put(pair, continueWithTask);
        return continueWithTask;
    }

    /* renamed from: b */
    public final /* synthetic */ Task m5372b(Pair pair, Task task) {
        synchronized (this) {
            this.f4835b.remove(pair);
        }
        return task;
    }
}
