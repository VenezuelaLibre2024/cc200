package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.C0385c;
import androidx.window.layout.ExecutorC0412c;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    /* loaded from: classes.dex */
    public class C0379a implements C0385c.c {
        public C0379a() {
        }

        @Override // androidx.profileinstaller.C0385c.c
        /* renamed from: a */
        public void mo1907a(int i10, Object obj) {
            C0385c.f1814b.mo1907a(i10, obj);
        }

        @Override // androidx.profileinstaller.C0385c.c
        /* renamed from: b */
        public void mo1908b(int i10, Object obj) {
            C0385c.f1814b.mo1908b(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }
    }

    /* renamed from: a */
    public static void m1906a(C0385c.c cVar) {
        int i10;
        if (Build.VERSION.SDK_INT >= 24) {
            Process.sendSignal(Process.myPid(), 10);
            i10 = 12;
        } else {
            i10 = 13;
        }
        cVar.mo1908b(i10, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            C0385c.m1951k(context, ExecutorC0412c.f1952h, new C0379a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    C0385c.m1952l(context, ExecutorC0412c.f1952h, new C0379a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        C0385c.m1943c(context, ExecutorC0412c.f1952h, new C0379a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            m1906a(new C0379a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C0379a c0379a = new C0379a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            C0383a.m1924b(context, c0379a);
        } else {
            c0379a.mo1908b(16, null);
        }
    }
}
