package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p133j0.C3205d;
import p329x.C5484b;
import p345y.C5782a;

/* renamed from: androidx.fragment.app.p */
/* loaded from: classes.dex */
public abstract class AbstractC0318p<E> extends AbstractC0310l {

    /* renamed from: h */
    public final Activity f1568h;

    /* renamed from: i */
    public final Context f1569i;

    /* renamed from: j */
    public final Handler f1570j;

    /* renamed from: k */
    public final int f1571k;

    /* renamed from: l */
    public final AbstractC0326x f1572l;

    public AbstractC0318p(Activity activity, Context context, Handler handler, int i10) {
        this.f1572l = new C0327y();
        this.f1568h = activity;
        this.f1569i = (Context) C3205d.m11415k(context, "context == null");
        this.f1570j = (Handler) C3205d.m11415k(handler, "handler == null");
        this.f1571k = i10;
    }

    public AbstractC0318p(ActivityC0306j activityC0306j) {
        this(activityC0306j, activityC0306j, new Handler(), 0);
    }

    @Override // androidx.fragment.app.AbstractC0310l
    /* renamed from: c */
    public View mo1350c(int i10) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0310l
    /* renamed from: d */
    public boolean mo1351d() {
        return true;
    }

    /* renamed from: e */
    public Activity m1596e() {
        return this.f1568h;
    }

    /* renamed from: f */
    public Context m1597f() {
        return this.f1569i;
    }

    /* renamed from: g */
    public Handler m1598g() {
        return this.f1570j;
    }

    /* renamed from: h */
    public void mo1518h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: i */
    public abstract E mo1519i();

    /* renamed from: j */
    public LayoutInflater mo1520j() {
        return LayoutInflater.from(this.f1569i);
    }

    @Deprecated
    /* renamed from: k */
    public void m1599k(Fragment fragment, String[] strArr, int i10) {
    }

    /* renamed from: l */
    public boolean mo1521l(String str) {
        return false;
    }

    /* renamed from: m */
    public void m1600m(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        C5782a.startActivity(this.f1569i, intent, bundle);
    }

    @Deprecated
    /* renamed from: n */
    public void m1601n(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        if (i10 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        C5484b.m21750l(this.f1568h, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    /* renamed from: o */
    public void mo1522o() {
    }
}
