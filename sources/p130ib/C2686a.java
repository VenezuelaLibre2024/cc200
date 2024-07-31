package p130ib;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import p130ib.C2686a;

/* renamed from: ib.a */
/* loaded from: classes.dex */
public final class C2686a {

    /* renamed from: i */
    public static final String f10490i = "a";

    /* renamed from: j */
    public static final Collection<String> f10491j;

    /* renamed from: a */
    public boolean f10492a;

    /* renamed from: b */
    public boolean f10493b;

    /* renamed from: c */
    public final boolean f10494c;

    /* renamed from: d */
    public final Camera f10495d;

    /* renamed from: e */
    public Handler f10496e;

    /* renamed from: f */
    public int f10497f = 1;

    /* renamed from: g */
    public final Handler.Callback f10498g;

    /* renamed from: h */
    public final Camera.AutoFocusCallback f10499h;

    /* renamed from: ib.a$a */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != C2686a.this.f10497f) {
                return false;
            }
            C2686a.this.m10917h();
            return true;
        }
    }

    /* renamed from: ib.a$b */
    /* loaded from: classes.dex */
    public class b implements Camera.AutoFocusCallback {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m10921b() {
            C2686a.this.f10493b = false;
            C2686a.this.m10915f();
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z10, Camera camera) {
            C2686a.this.f10496e.post(new Runnable() { // from class: ib.b
                @Override // java.lang.Runnable
                public final void run() {
                    C2686a.b.this.m10921b();
                }
            });
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f10491j = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public C2686a(Camera camera, C2694i c2694i) {
        a aVar = new a();
        this.f10498g = aVar;
        this.f10499h = new b();
        this.f10496e = new Handler(aVar);
        this.f10495d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean z10 = c2694i.m10991c() && f10491j.contains(focusMode);
        this.f10494c = z10;
        Log.i(f10490i, "Current focus mode '" + focusMode + "'; use auto focus? " + z10);
        m10918i();
    }

    /* renamed from: f */
    public final synchronized void m10915f() {
        if (!this.f10492a && !this.f10496e.hasMessages(this.f10497f)) {
            Handler handler = this.f10496e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f10497f), 2000L);
        }
    }

    /* renamed from: g */
    public final void m10916g() {
        this.f10496e.removeMessages(this.f10497f);
    }

    /* renamed from: h */
    public final void m10917h() {
        if (!this.f10494c || this.f10492a || this.f10493b) {
            return;
        }
        try {
            this.f10495d.autoFocus(this.f10499h);
            this.f10493b = true;
        } catch (RuntimeException e10) {
            Log.w(f10490i, "Unexpected exception while focusing", e10);
            m10915f();
        }
    }

    /* renamed from: i */
    public void m10918i() {
        this.f10492a = false;
        m10917h();
    }

    /* renamed from: j */
    public void m10919j() {
        this.f10492a = true;
        this.f10493b = false;
        m10916g();
        if (this.f10494c) {
            try {
                this.f10495d.cancelAutoFocus();
            } catch (RuntimeException e10) {
                Log.w(f10490i, "Unexpected exception while cancelling focusing", e10);
            }
        }
    }
}
