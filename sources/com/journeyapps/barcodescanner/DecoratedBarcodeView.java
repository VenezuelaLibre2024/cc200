package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ma.C3597f;
import ma.C3598g;
import ma.C3602k;
import ma.C3603l;
import ma.C3606o;
import p113hb.C2457b;
import p113hb.C2468m;
import p113hb.InterfaceC2456a;
import p113hb.InterfaceC2465j;
import p129ia.C2677i;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p130ib.C2694i;

/* loaded from: classes.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: h */
    public BarcodeView f5238h;

    /* renamed from: i */
    public ViewfinderView f5239i;

    /* renamed from: j */
    public TextView f5240j;

    /* renamed from: k */
    public InterfaceC1389a f5241k;

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1389a {
        /* renamed from: a */
        void m5881a();

        /* renamed from: b */
        void m5882b();
    }

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$b */
    /* loaded from: classes.dex */
    public class C1390b implements InterfaceC2456a {

        /* renamed from: a */
        public InterfaceC2456a f5242a;

        public C1390b(InterfaceC2456a interfaceC2456a) {
            this.f5242a = interfaceC2456a;
        }

        @Override // p113hb.InterfaceC2456a
        /* renamed from: a */
        public void mo5883a(List<C2684p> list) {
            Iterator<C2684p> it = list.iterator();
            while (it.hasNext()) {
                DecoratedBarcodeView.this.f5239i.m5885a(it.next());
            }
            this.f5242a.mo5883a(list);
        }

        @Override // p113hb.InterfaceC2456a
        /* renamed from: b */
        public void mo5884b(C2457b c2457b) {
            this.f5242a.mo5884b(c2457b);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m5874c(attributeSet);
    }

    /* renamed from: b */
    public void m5873b(InterfaceC2456a interfaceC2456a) {
        this.f5238h.m5863J(new C1390b(interfaceC2456a));
    }

    /* renamed from: c */
    public final void m5874c(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3606o.f12722t);
        int resourceId = obtainStyledAttributes.getResourceId(C3606o.f12723u, C3603l.f12697a);
        obtainStyledAttributes.recycle();
        FrameLayout.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(C3602k.f12686b);
        this.f5238h = barcodeView;
        if (barcodeView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        }
        barcodeView.m5912q(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(C3602k.f12696l);
        this.f5239i = viewfinderView;
        if (viewfinderView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        viewfinderView.setCameraPreview(this.f5238h);
        this.f5240j = (TextView) findViewById(C3602k.f12695k);
    }

    /* renamed from: d */
    public void m5875d(Intent intent) {
        int intExtra;
        Set<EnumC2669a> m13329a = C3597f.m13329a(intent);
        Map<EnumC2673e, ?> m13331a = C3598g.m13331a(intent);
        C2694i c2694i = new C2694i();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            c2694i.m10997i(intExtra);
        }
        if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
            m5880i();
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new C2677i().m10894e(m13331a);
        this.f5238h.setCameraSettings(c2694i);
        this.f5238h.setDecoderFactory(new C2468m(m13329a, m13331a, stringExtra2, intExtra2));
    }

    /* renamed from: e */
    public void m5876e() {
        this.f5238h.mo5868u();
    }

    /* renamed from: f */
    public void m5877f() {
        this.f5238h.m5916v();
    }

    /* renamed from: g */
    public void m5878g() {
        this.f5238h.m5918y();
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(C3602k.f12686b);
    }

    public C2694i getCameraSettings() {
        return this.f5238h.getCameraSettings();
    }

    public InterfaceC2465j getDecoderFactory() {
        return this.f5238h.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f5240j;
    }

    public ViewfinderView getViewFinder() {
        return this.f5239i;
    }

    /* renamed from: h */
    public void m5879h() {
        this.f5238h.setTorch(false);
        InterfaceC1389a interfaceC1389a = this.f5241k;
        if (interfaceC1389a != null) {
            interfaceC1389a.m5881a();
        }
    }

    /* renamed from: i */
    public void m5880i() {
        this.f5238h.setTorch(true);
        InterfaceC1389a interfaceC1389a = this.f5241k;
        if (interfaceC1389a != null) {
            interfaceC1389a.m5882b();
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 24) {
            m5880i();
            return true;
        }
        if (i10 == 25) {
            m5879h();
            return true;
        }
        if (i10 == 27 || i10 == 80) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void setCameraSettings(C2694i c2694i) {
        this.f5238h.setCameraSettings(c2694i);
    }

    public void setDecoderFactory(InterfaceC2465j interfaceC2465j) {
        this.f5238h.setDecoderFactory(interfaceC2465j);
    }

    public void setStatusText(String str) {
        TextView textView = this.f5240j;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(InterfaceC1389a interfaceC1389a) {
        this.f5241k = interfaceC1389a;
    }
}
