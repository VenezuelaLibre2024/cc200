package p252r6;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.LinkedList;
import p064e6.C1673e;
import p108h6.C2356f0;
import p252r6.InterfaceC4308c;

/* renamed from: r6.a */
/* loaded from: classes.dex */
public abstract class AbstractC4306a<T extends InterfaceC4308c> {

    /* renamed from: a */
    public InterfaceC4308c f15631a;

    /* renamed from: b */
    public Bundle f15632b;

    /* renamed from: c */
    public LinkedList f15633c;

    /* renamed from: d */
    public final InterfaceC4310e f15634d = new C4311f(this);

    /* renamed from: i */
    public static void m16555i(FrameLayout frameLayout) {
        C1673e m6693m = C1673e.m6693m();
        Context context = frameLayout.getContext();
        int mo6697g = m6693m.mo6697g(context);
        String m9544d = C2356f0.m9544d(context, mo6697g);
        String m9543c = C2356f0.m9543c(context, mo6697g);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(m9544d);
        linearLayout.addView(textView);
        Intent mo6694b = m6693m.mo6694b(context, mo6697g, null);
        if (mo6694b != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(m9543c);
            linearLayout.addView(button);
            button.setOnClickListener(new ViewOnClickListenerC4313h(context, mo6694b));
        }
    }

    /* renamed from: a */
    public abstract void mo16560a(InterfaceC4310e<T> interfaceC4310e);

    /* renamed from: b */
    public T m16561b() {
        return (T) this.f15631a;
    }

    /* renamed from: c */
    public void m16562c(Bundle bundle) {
        m16569o(bundle, new C4312g(this, bundle));
    }

    /* renamed from: d */
    public void m16563d() {
        InterfaceC4308c interfaceC4308c = this.f15631a;
        if (interfaceC4308c != null) {
            interfaceC4308c.onDestroy();
        } else {
            m16568n(1);
        }
    }

    /* renamed from: e */
    public void m16564e() {
        m16569o(null, new C4315j(this));
    }

    /* renamed from: f */
    public void m16565f(Bundle bundle) {
        InterfaceC4308c interfaceC4308c = this.f15631a;
        if (interfaceC4308c != null) {
            interfaceC4308c.onSaveInstanceState(bundle);
            return;
        }
        Bundle bundle2 = this.f15632b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    /* renamed from: g */
    public void m16566g() {
        m16569o(null, new C4314i(this));
    }

    /* renamed from: h */
    public void m16567h() {
        InterfaceC4308c interfaceC4308c = this.f15631a;
        if (interfaceC4308c != null) {
            interfaceC4308c.onStop();
        } else {
            m16568n(4);
        }
    }

    /* renamed from: n */
    public final void m16568n(int i10) {
        while (!this.f15633c.isEmpty() && ((InterfaceC4316k) this.f15633c.getLast()).mo16574a() >= i10) {
            this.f15633c.removeLast();
        }
    }

    /* renamed from: o */
    public final void m16569o(Bundle bundle, InterfaceC4316k interfaceC4316k) {
        InterfaceC4308c interfaceC4308c = this.f15631a;
        if (interfaceC4308c != null) {
            interfaceC4316k.mo16575b(interfaceC4308c);
            return;
        }
        if (this.f15633c == null) {
            this.f15633c = new LinkedList();
        }
        this.f15633c.add(interfaceC4316k);
        if (bundle != null) {
            Bundle bundle2 = this.f15632b;
            if (bundle2 == null) {
                this.f15632b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo16560a(this.f15634d);
    }
}
