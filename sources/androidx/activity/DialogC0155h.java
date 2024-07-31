package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.C0353j0;
import androidx.lifecycle.C0356l;
import androidx.lifecycle.InterfaceC0354k;
import androidx.savedstate.C0395a;
import p247r1.C4274c;
import p247r1.C4276e;
import p247r1.InterfaceC4275d;
import td.C4753m;

/* renamed from: androidx.activity.h */
/* loaded from: classes.dex */
public class DialogC0155h extends Dialog implements InterfaceC0354k, InterfaceC0161n, InterfaceC4275d {

    /* renamed from: h */
    public C0356l f473h;

    /* renamed from: i */
    public final C4274c f474i;

    /* renamed from: j */
    public final OnBackPressedDispatcher f475j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0155h(Context context, int i10) {
        super(context, i10);
        C4753m.m18653f(context, "context");
        this.f474i = C4274c.f15528d.m16406a(this);
        this.f475j = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.g
            @Override // java.lang.Runnable
            public final void run() {
                DialogC0155h.m598d(DialogC0155h.this);
            }
        });
    }

    /* renamed from: d */
    public static final void m598d(DialogC0155h dialogC0155h) {
        C4753m.m18653f(dialogC0155h, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C4753m.m18653f(view, "view");
        m600c();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public final C0356l m599b() {
        C0356l c0356l = this.f473h;
        if (c0356l != null) {
            return c0356l;
        }
        C0356l c0356l2 = new C0356l(this);
        this.f473h = c0356l2;
        return c0356l2;
    }

    /* renamed from: c */
    public final void m600c() {
        Window window = getWindow();
        C4753m.m18650c(window);
        View decorView = window.getDecorView();
        C4753m.m18652e(decorView, "window!!.decorView");
        C0353j0.m1827a(decorView, this);
        Window window2 = getWindow();
        C4753m.m18650c(window2);
        View decorView2 = window2.getDecorView();
        C4753m.m18652e(decorView2, "window!!.decorView");
        C0164q.m606a(decorView2, this);
        Window window3 = getWindow();
        C4753m.m18650c(window3);
        View decorView3 = window3.getDecorView();
        C4753m.m18652e(decorView3, "window!!.decorView");
        C4276e.m16407a(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC0354k
    public AbstractC0344f getLifecycle() {
        return m599b();
    }

    @Override // androidx.activity.InterfaceC0161n
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f475j;
    }

    @Override // p247r1.InterfaceC4275d
    public C0395a getSavedStateRegistry() {
        return this.f474i.m16402b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f475j.m585e();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f475j;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C4753m.m18652e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            onBackPressedDispatcher.m586f(onBackInvokedDispatcher);
        }
        this.f474i.m16404d(bundle);
        m599b().m1833h(AbstractC0344f.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C4753m.m18652e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f474i.m16405e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m599b().m1833h(AbstractC0344f.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m599b().m1833h(AbstractC0344f.a.ON_DESTROY);
        this.f473h = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        m600c();
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C4753m.m18653f(view, "view");
        m600c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C4753m.m18653f(view, "view");
        m600c();
        super.setContentView(view, layoutParams);
    }
}
