package p101h;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.DialogC0155h;
import p089g.C1931a;
import p148k0.C3315f;
import p162l.AbstractC3391b;

/* renamed from: h.g */
/* loaded from: classes.dex */
public class DialogC2265g extends DialogC0155h implements InterfaceC2261c {

    /* renamed from: k */
    public AbstractC2262d f9021k;

    /* renamed from: l */
    public final C3315f.a f9022l;

    public DialogC2265g(Context context, int i10) {
        super(context, m9150f(context, i10));
        this.f9022l = new C3315f.a() { // from class: h.f
            public /* synthetic */ C2264f() {
            }

            @Override // p148k0.C3315f.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogC2265g.this.m9152g(keyEvent);
            }
        };
        AbstractC2262d m9151e = m9151e();
        m9151e.mo9042G(m9150f(context, i10));
        m9151e.mo9056r(null);
    }

    /* renamed from: f */
    public static int m9150f(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1931a.f7354z, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.DialogC0155h, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m9151e().mo9045d(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m9151e().mo9057s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C3315f.m12220e(this.f9022l, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: e */
    public AbstractC2262d m9151e() {
        if (this.f9021k == null) {
            this.f9021k = AbstractC2262d.m9033h(this, this);
        }
        return this.f9021k;
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) m9151e().mo9048i(i10);
    }

    /* renamed from: g */
    public boolean m9152g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: h */
    public boolean m9153h(int i10) {
        return m9151e().mo9037A(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m9151e().mo9054p();
    }

    @Override // androidx.activity.DialogC0155h, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m9151e().mo9053o();
        super.onCreate(bundle);
        m9151e().mo9056r(bundle);
    }

    @Override // androidx.activity.DialogC0155h, android.app.Dialog
    public void onStop() {
        super.onStop();
        m9151e().mo9062x();
    }

    @Override // p101h.InterfaceC2261c
    public void onSupportActionModeFinished(AbstractC3391b abstractC3391b) {
    }

    @Override // p101h.InterfaceC2261c
    public void onSupportActionModeStarted(AbstractC3391b abstractC3391b) {
    }

    @Override // p101h.InterfaceC2261c
    public AbstractC3391b onWindowStartingSupportActionMode(AbstractC3391b.a aVar) {
        return null;
    }

    @Override // androidx.activity.DialogC0155h, android.app.Dialog
    public void setContentView(int i10) {
        m9151e().mo9038C(i10);
    }

    @Override // androidx.activity.DialogC0155h, android.app.Dialog
    public void setContentView(View view) {
        m9151e().mo9039D(view);
    }

    @Override // androidx.activity.DialogC0155h, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m9151e().mo9040E(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        m9151e().mo9043H(getContext().getString(i10));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m9151e().mo9043H(charSequence);
    }
}
