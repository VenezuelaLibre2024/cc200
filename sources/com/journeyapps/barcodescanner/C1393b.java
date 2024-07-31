package com.journeyapps.barcodescanner;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.journeyapps.barcodescanner.C1392a;
import com.journeyapps.barcodescanner.C1393b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ma.C3596e;
import ma.C3599h;
import ma.C3605n;
import p113hb.C2457b;
import p113hb.InterfaceC2456a;
import p129ia.C2684p;
import p129ia.EnumC2683o;
import p329x.C5484b;
import p345y.C5782a;

/* renamed from: com.journeyapps.barcodescanner.b */
/* loaded from: classes.dex */
public class C1393b {

    /* renamed from: o */
    public static final String f5292o = "b";

    /* renamed from: p */
    public static int f5293p = 250;

    /* renamed from: a */
    public Activity f5294a;

    /* renamed from: b */
    public DecoratedBarcodeView f5295b;

    /* renamed from: h */
    public C3599h f5301h;

    /* renamed from: i */
    public C3596e f5302i;

    /* renamed from: j */
    public Handler f5303j;

    /* renamed from: m */
    public final C1392a.f f5306m;

    /* renamed from: n */
    public boolean f5307n;

    /* renamed from: c */
    public int f5296c = -1;

    /* renamed from: d */
    public boolean f5297d = false;

    /* renamed from: e */
    public boolean f5298e = true;

    /* renamed from: f */
    public String f5299f = "";

    /* renamed from: g */
    public boolean f5300g = false;

    /* renamed from: k */
    public boolean f5304k = false;

    /* renamed from: l */
    public InterfaceC2456a f5305l = new a();

    /* renamed from: com.journeyapps.barcodescanner.b$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC2456a {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m5955d(C2457b c2457b) {
            C1393b.this.m5937B(c2457b);
        }

        @Override // p113hb.InterfaceC2456a
        /* renamed from: a */
        public void mo5883a(List<C2684p> list) {
        }

        @Override // p113hb.InterfaceC2456a
        /* renamed from: b */
        public void mo5884b(final C2457b c2457b) {
            C1393b.this.f5295b.m5876e();
            C1393b.this.f5302i.m13327f();
            C1393b.this.f5303j.post(new Runnable() { // from class: hb.h
                @Override // java.lang.Runnable
                public final void run() {
                    C1393b.a.this.m5955d(c2457b);
                }
            });
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.b$b */
    /* loaded from: classes.dex */
    public class b implements C1392a.f {
        public b() {
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: a */
        public void mo5887a() {
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: b */
        public void mo5888b(Exception exc) {
            C1393b c1393b = C1393b.this;
            c1393b.m5943m(c1393b.f5294a.getString(C3605n.f12702c));
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: c */
        public void mo5889c() {
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: d */
        public void mo5890d() {
            if (C1393b.this.f5304k) {
                Log.d(C1393b.f5292o, "Camera closed; finishing activity");
                C1393b.this.m5944n();
            }
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: e */
        public void mo5891e() {
        }
    }

    public C1393b(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        b bVar = new b();
        this.f5306m = bVar;
        this.f5307n = false;
        this.f5294a = activity;
        this.f5295b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().m5904i(bVar);
        this.f5303j = new Handler();
        this.f5301h = new C3599h(activity, new Runnable() { // from class: hb.g
            @Override // java.lang.Runnable
            public final void run() {
                C1393b.this.m5936s();
            }
        });
        this.f5302i = new C3596e(activity);
    }

    /* renamed from: A */
    public static Intent m5923A(C2457b c2457b, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", c2457b.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", c2457b.m9823a().toString());
        byte[] m9825c = c2457b.m9825c();
        if (m9825c != null && m9825c.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", m9825c);
        }
        Map<EnumC2683o, Object> m9826d = c2457b.m9826d();
        if (m9826d != null) {
            EnumC2683o enumC2683o = EnumC2683o.UPC_EAN_EXTENSION;
            if (m9826d.containsKey(enumC2683o)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", m9826d.get(enumC2683o).toString());
            }
            Number number = (Number) m9826d.get(EnumC2683o.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) m9826d.get(EnumC2683o.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable iterable = (Iterable) m9826d.get(EnumC2683o.BYTE_SEGMENTS);
            if (iterable != null) {
                int i10 = 0;
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i10, (byte[]) it.next());
                    i10++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m5934q(DialogInterface dialogInterface, int i10) {
        m5944n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m5935r(DialogInterface dialogInterface) {
        m5944n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m5936s() {
        Log.d(f5292o, "Finishing due to inactivity");
        m5944n();
    }

    /* renamed from: B */
    public void m5937B(C2457b c2457b) {
        this.f5294a.setResult(-1, m5923A(c2457b, m5945o(c2457b)));
        m5941k();
    }

    /* renamed from: C */
    public void m5938C() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f5294a.setResult(0, intent);
        m5941k();
    }

    /* renamed from: D */
    public final void m5939D() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("MISSING_CAMERA_PERMISSION", true);
        this.f5294a.setResult(0, intent);
    }

    /* renamed from: E */
    public void m5940E(boolean z10, String str) {
        this.f5298e = z10;
        if (str == null) {
            str = "";
        }
        this.f5299f = str;
    }

    /* renamed from: k */
    public void m5941k() {
        if (this.f5295b.getBarcodeView().m5914s()) {
            m5944n();
        } else {
            this.f5304k = true;
        }
        this.f5295b.m5876e();
        this.f5301h.m13335d();
    }

    /* renamed from: l */
    public void m5942l() {
        this.f5295b.m5873b(this.f5305l);
    }

    /* renamed from: m */
    public void m5943m(String str) {
        if (this.f5294a.isFinishing() || this.f5300g || this.f5304k) {
            return;
        }
        if (str.isEmpty()) {
            str = this.f5294a.getString(C3605n.f12702c);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f5294a);
        builder.setTitle(this.f5294a.getString(C3605n.f12700a));
        builder.setMessage(str);
        builder.setPositiveButton(C3605n.f12701b, new DialogInterface.OnClickListener() { // from class: hb.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                C1393b.this.m5934q(dialogInterface, i10);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: hb.d
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C1393b.this.m5935r(dialogInterface);
            }
        });
        builder.show();
    }

    /* renamed from: n */
    public final void m5944n() {
        this.f5294a.finish();
    }

    /* renamed from: o */
    public final String m5945o(C2457b c2457b) {
        if (this.f5297d) {
            Bitmap m9824b = c2457b.m9824b();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f5294a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                m9824b.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e10) {
                Log.w(f5292o, "Unable to create temporary file and store bitmap! " + e10);
            }
        }
        return null;
    }

    /* renamed from: p */
    public void m5946p(Intent intent, Bundle bundle) {
        this.f5294a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f5296c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                m5947t();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f5295b.m5875d(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f5302i.m13328g(false);
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                m5940E(intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true), intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"));
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f5303j.postDelayed(new Runnable() { // from class: hb.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1393b.this.m5938C();
                    }
                }, intent.getLongExtra("TIMEOUT", 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f5297d = true;
            }
        }
    }

    /* renamed from: t */
    public void m5947t() {
        if (this.f5296c == -1) {
            int rotation = this.f5294a.getWindowManager().getDefaultDisplay().getRotation();
            int i10 = this.f5294a.getResources().getConfiguration().orientation;
            int i11 = 0;
            if (i10 == 2) {
                if (rotation != 0 && rotation != 1) {
                    i11 = 8;
                }
            } else if (i10 == 1) {
                i11 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f5296c = i11;
        }
        this.f5294a.setRequestedOrientation(this.f5296c);
    }

    /* renamed from: u */
    public void m5948u() {
        this.f5300g = true;
        this.f5301h.m13335d();
        this.f5303j.removeCallbacksAndMessages(null);
    }

    /* renamed from: v */
    public void m5949v() {
        this.f5301h.m13335d();
        this.f5295b.m5877f();
    }

    /* renamed from: w */
    public void m5950w(int i10, String[] strArr, int[] iArr) {
        if (i10 == f5293p) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f5295b.m5878g();
                return;
            }
            m5939D();
            if (this.f5298e) {
                m5943m(this.f5299f);
            } else {
                m5941k();
            }
        }
    }

    /* renamed from: x */
    public void m5951x() {
        if (Build.VERSION.SDK_INT >= 23) {
            m5953z();
        } else {
            this.f5295b.m5878g();
        }
        this.f5301h.m13339h();
    }

    /* renamed from: y */
    public void m5952y(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f5296c);
    }

    @TargetApi(23)
    /* renamed from: z */
    public final void m5953z() {
        if (C5782a.checkSelfPermission(this.f5294a, "android.permission.CAMERA") == 0) {
            this.f5295b.m5878g();
        } else {
            if (this.f5307n) {
                return;
            }
            C5484b.m21745g(this.f5294a, new String[]{"android.permission.CAMERA"}, f5293p);
            this.f5307n = true;
        }
    }
}
