package p226p9;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p108h6.C2394s;
import p195n7.C3767g;
import p226p9.C4079h0;
import p240q9.C4213d;
import p240q9.C4217h;

/* renamed from: p9.p */
/* loaded from: classes.dex */
public class C4093p implements Comparable<C4093p> {

    /* renamed from: h */
    public final Uri f14781h;

    /* renamed from: i */
    public final C4074f f14782i;

    /* renamed from: p9.p$a */
    /* loaded from: classes.dex */
    public class a implements OnFailureListener {

        /* renamed from: a */
        public final /* synthetic */ TaskCompletionSource f14783a;

        public a(TaskCompletionSource taskCompletionSource) {
            this.f14783a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            this.f14783a.setException(C4090n.m15758e(exc, 0));
        }
    }

    /* renamed from: p9.p$b */
    /* loaded from: classes.dex */
    public class b implements OnSuccessListener<C4079h0.d> {

        /* renamed from: a */
        public final /* synthetic */ TaskCompletionSource f14785a;

        public b(TaskCompletionSource taskCompletionSource) {
            this.f14785a = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: a */
        public void onSuccess(C4079h0.d dVar) {
            if (this.f14785a.getTask().isComplete()) {
                return;
            }
            Log.e("StorageReference", "getBytes 'succeeded', but failed to set a Result.");
            this.f14785a.setException(C4090n.m15756c(Status.f4472o));
        }
    }

    /* renamed from: p9.p$c */
    /* loaded from: classes.dex */
    public class c implements C4079h0.b {

        /* renamed from: a */
        public final /* synthetic */ long f14787a;

        /* renamed from: b */
        public final /* synthetic */ TaskCompletionSource f14788b;

        public c(long j10, TaskCompletionSource taskCompletionSource) {
            this.f14787a = j10;
            this.f14788b = taskCompletionSource;
        }

        @Override // p226p9.C4079h0.b
        /* renamed from: a */
        public void mo15736a(C4079h0.d dVar, InputStream inputStream) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[16384];
                int i10 = 0;
                while (true) {
                    int read = inputStream.read(bArr, 0, 16384);
                    if (read == -1) {
                        byteArrayOutputStream.flush();
                        this.f14788b.setResult(byteArrayOutputStream.toByteArray());
                        return;
                    } else {
                        i10 += read;
                        if (i10 > this.f14787a) {
                            Log.e("StorageReference", "the maximum allowed buffer size was exceeded.");
                            throw new IndexOutOfBoundsException("the maximum allowed buffer size was exceeded.");
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: p9.p$d */
    /* loaded from: classes.dex */
    public class d implements Continuation<C4082j, Task<Void>> {

        /* renamed from: a */
        public final /* synthetic */ List f14790a;

        /* renamed from: b */
        public final /* synthetic */ List f14791b;

        /* renamed from: c */
        public final /* synthetic */ Executor f14792c;

        /* renamed from: d */
        public final /* synthetic */ TaskCompletionSource f14793d;

        public d(List list, List list2, Executor executor, TaskCompletionSource taskCompletionSource) {
            this.f14790a = list;
            this.f14791b = list2;
            this.f14792c = executor;
            this.f14793d = taskCompletionSource;
        }

        @Override // com.google.android.gms.tasks.Continuation
        /* renamed from: a */
        public Task<Void> then(Task<C4082j> task) {
            if (task.isSuccessful()) {
                C4082j result = task.getResult();
                this.f14790a.addAll(result.m15744d());
                this.f14791b.addAll(result.m15742b());
                if (result.m15743c() != null) {
                    C4093p.this.m15850z(null, result.m15743c()).continueWithTask(this.f14792c, this);
                } else {
                    this.f14793d.setResult(new C4082j(this.f14790a, this.f14791b, null));
                }
            } else {
                this.f14793d.setException(task.getException());
            }
            return Tasks.forResult(null);
        }
    }

    public C4093p(Uri uri, C4074f c4074f) {
        C2394s.m9609b(uri != null, "storageUri cannot be null");
        C2394s.m9609b(c4074f != null, "FirebaseApp cannot be null");
        this.f14781h = uri;
        this.f14782i = c4074f;
    }

    /* renamed from: A */
    public C4091n0 m15827A(byte[] bArr) {
        C2394s.m9609b(bArr != null, "bytes cannot be null");
        C4091n0 c4091n0 = new C4091n0(this, null, bArr);
        c4091n0.m15667b0();
        return c4091n0;
    }

    /* renamed from: B */
    public C4091n0 m15828B(byte[] bArr, C4092o c4092o) {
        C2394s.m9609b(bArr != null, "bytes cannot be null");
        C2394s.m9609b(c4092o != null, "metadata cannot be null");
        C4091n0 c4091n0 = new C4091n0(this, c4092o, bArr);
        c4091n0.m15667b0();
        return c4091n0;
    }

    /* renamed from: C */
    public C4091n0 m15829C(Uri uri) {
        C2394s.m9609b(uri != null, "uri cannot be null");
        C4091n0 c4091n0 = new C4091n0(this, null, uri, null);
        c4091n0.m15667b0();
        return c4091n0;
    }

    /* renamed from: D */
    public C4091n0 m15830D(Uri uri, C4092o c4092o) {
        C2394s.m9609b(uri != null, "uri cannot be null");
        C2394s.m9609b(c4092o != null, "metadata cannot be null");
        C4091n0 c4091n0 = new C4091n0(this, c4092o, uri, null);
        c4091n0.m15667b0();
        return c4091n0;
    }

    /* renamed from: E */
    public Task<C4092o> m15831E(C4092o c4092o) {
        C2394s.m9619l(c4092o);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C4077g0.m15718b().m15723f(new RunnableC4089m0(this, taskCompletionSource, c4092o));
        return taskCompletionSource.getTask();
    }

    /* renamed from: c */
    public C4093p m15832c(String str) {
        C2394s.m9609b(!TextUtils.isEmpty(str), "childName cannot be null or empty");
        return new C4093p(this.f14781h.buildUpon().appendEncodedPath(C4213d.m16231b(C4213d.m16230a(str))).build(), this.f14782i);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4093p) {
            return ((C4093p) obj).toString().equals(toString());
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public int compareTo(C4093p c4093p) {
        return this.f14781h.compareTo(c4093p.f14781h);
    }

    /* renamed from: h */
    public Task<Void> m15834h() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C4077g0.m15718b().m15723f(new RunnableC4070d(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    /* renamed from: i */
    public C3767g m15835i() {
        return m15845u().m15697a();
    }

    /* renamed from: l */
    public String m15836l() {
        return this.f14781h.getAuthority();
    }

    /* renamed from: m */
    public Task<byte[]> m15837m(long j10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C4079h0 c4079h0 = new C4079h0(this);
        c4079h0.m15733r0(new c(j10, taskCompletionSource)).addOnSuccessListener(new b(taskCompletionSource)).addOnFailureListener(new a(taskCompletionSource));
        c4079h0.m15667b0();
        return taskCompletionSource.getTask();
    }

    /* renamed from: n */
    public Task<Uri> m15838n() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C4077g0.m15718b().m15723f(new RunnableC4078h(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: o */
    public C4072e m15839o(Uri uri) {
        C4072e c4072e = new C4072e(this, uri);
        c4072e.m15667b0();
        return c4072e;
    }

    /* renamed from: p */
    public Task<C4092o> m15840p() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C4077g0.m15718b().m15723f(new RunnableC4080i(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: q */
    public String m15841q() {
        String path = this.f14781h.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    /* renamed from: r */
    public C4093p m15842r() {
        String path = this.f14781h.getPath();
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        String str = FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
        if (path.equals(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            return null;
        }
        int lastIndexOf = path.lastIndexOf(47);
        if (lastIndexOf != -1) {
            str = path.substring(0, lastIndexOf);
        }
        return new C4093p(this.f14781h.buildUpon().path(str).build(), this.f14782i);
    }

    /* renamed from: s */
    public String m15843s() {
        return this.f14781h.getPath();
    }

    /* renamed from: t */
    public C4093p m15844t() {
        return new C4093p(this.f14781h.buildUpon().path("").build(), this.f14782i);
    }

    public String toString() {
        return "gs://" + this.f14781h.getAuthority() + this.f14781h.getEncodedPath();
    }

    /* renamed from: u */
    public C4074f m15845u() {
        return this.f14782i;
    }

    /* renamed from: v */
    public C4217h m15846v() {
        return new C4217h(this.f14781h, this.f14782i.m15701e());
    }

    /* renamed from: w */
    public Task<C4082j> m15847w(int i10) {
        C2394s.m9609b(i10 > 0, "maxResults must be greater than zero");
        C2394s.m9609b(i10 <= 1000, "maxResults must be at most 1000");
        return m15850z(Integer.valueOf(i10), null);
    }

    /* renamed from: x */
    public Task<C4082j> m15848x(int i10, String str) {
        C2394s.m9609b(i10 > 0, "maxResults must be greater than zero");
        C2394s.m9609b(i10 <= 1000, "maxResults must be at most 1000");
        C2394s.m9609b(str != null, "pageToken must be non-null to resume a previous list() operation");
        return m15850z(Integer.valueOf(i10), str);
    }

    /* renamed from: y */
    public Task<C4082j> m15849y() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Executor m15720a = C4077g0.m15718b().m15720a();
        m15850z(null, null).continueWithTask(m15720a, new d(arrayList, arrayList2, m15720a, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: z */
    public final Task<C4082j> m15850z(Integer num, String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        C4077g0.m15718b().m15723f(new RunnableC4084k(this, num, str, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
