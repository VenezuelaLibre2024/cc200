package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogC0184a;
import androidx.appcompat.view.menu.InterfaceC0196i;
import p089g.C1937g;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class DialogInterfaceOnKeyListenerC0193f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0196i.a {

    /* renamed from: h */
    public C0192e f766h;

    /* renamed from: i */
    public DialogC0184a f767i;

    /* renamed from: j */
    public C0190c f768j;

    /* renamed from: k */
    public InterfaceC0196i.a f769k;

    public DialogInterfaceOnKeyListenerC0193f(C0192e c0192e) {
        this.f766h = c0192e;
    }

    /* renamed from: a */
    public void m812a() {
        DialogC0184a dialogC0184a = this.f767i;
        if (dialogC0184a != null) {
            dialogC0184a.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i.a
    /* renamed from: b */
    public void mo813b(C0192e c0192e, boolean z10) {
        if (z10 || c0192e == this.f766h) {
            m812a();
        }
        InterfaceC0196i.a aVar = this.f769k;
        if (aVar != null) {
            aVar.mo813b(c0192e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0196i.a
    /* renamed from: c */
    public boolean mo814c(C0192e c0192e) {
        InterfaceC0196i.a aVar = this.f769k;
        if (aVar != null) {
            return aVar.mo814c(c0192e);
        }
        return false;
    }

    /* renamed from: d */
    public void m815d(IBinder iBinder) {
        C0192e c0192e = this.f766h;
        DialogC0184a.a aVar = new DialogC0184a.a(c0192e.m804u());
        C0190c c0190c = new C0190c(aVar.m677b(), C1937g.f7475j);
        this.f768j = c0190c;
        c0190c.mo713g(this);
        this.f766h.m783b(this.f768j);
        aVar.m678c(this.f768j.m746a(), this);
        View m808y = c0192e.m808y();
        if (m808y != null) {
            aVar.m679d(m808y);
        } else {
            aVar.m680e(c0192e.m806w()).m689n(c0192e.m807x());
        }
        aVar.m685j(this);
        DialogC0184a m676a = aVar.m676a();
        this.f767i = m676a;
        m676a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f767i.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f767i.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f766h.m766L((C0194g) this.f768j.m746a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f768j.mo709b(this.f766h, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f767i.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f767i.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f766h.m789e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f766h.performShortcut(i10, keyEvent, 0);
    }
}
