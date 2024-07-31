package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import ma.C3602k;
import ma.C3603l;

/* loaded from: classes.dex */
public class CaptureActivity extends Activity {

    /* renamed from: h */
    public C1393b f5236h;

    /* renamed from: i */
    public DecoratedBarcodeView f5237i;

    /* renamed from: a */
    public DecoratedBarcodeView m5871a() {
        setContentView(C3603l.f12698b);
        return (DecoratedBarcodeView) findViewById(C3602k.f12685a);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5237i = m5871a();
        C1393b c1393b = new C1393b(this, this.f5237i);
        this.f5236h = c1393b;
        c1393b.m5946p(getIntent(), bundle);
        this.f5236h.m5942l();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f5236h.m5948u();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.f5237i.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f5236h.m5949v();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f5236h.m5950w(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f5236h.m5951x();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f5236h.m5952y(bundle);
    }
}
