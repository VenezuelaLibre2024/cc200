package p113hb;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* renamed from: hb.r */
/* loaded from: classes.dex */
public class C2473r {

    /* renamed from: a */
    public int f9892a;

    /* renamed from: b */
    public WindowManager f9893b;

    /* renamed from: c */
    public OrientationEventListener f9894c;

    /* renamed from: d */
    public InterfaceC2472q f9895d;

    /* renamed from: hb.r$a */
    /* loaded from: classes.dex */
    public class a extends OrientationEventListener {
        public a(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation;
            WindowManager windowManager = C2473r.this.f9893b;
            InterfaceC2472q interfaceC2472q = C2473r.this.f9895d;
            if (C2473r.this.f9893b == null || interfaceC2472q == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == C2473r.this.f9892a) {
                return;
            }
            C2473r.this.f9892a = rotation;
            interfaceC2472q.mo5922a(rotation);
        }
    }

    /* renamed from: e */
    public void m9861e(Context context, InterfaceC2472q interfaceC2472q) {
        m9862f();
        Context applicationContext = context.getApplicationContext();
        this.f9895d = interfaceC2472q;
        this.f9893b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.f9894c = aVar;
        aVar.enable();
        this.f9892a = this.f9893b.getDefaultDisplay().getRotation();
    }

    /* renamed from: f */
    public void m9862f() {
        OrientationEventListener orientationEventListener = this.f9894c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f9894c = null;
        this.f9893b = null;
        this.f9895d = null;
    }
}
