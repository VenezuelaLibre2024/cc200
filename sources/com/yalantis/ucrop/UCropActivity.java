package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0185b;
import androidx.appcompat.widget.Toolbar;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p101h.AbstractC2259a;
import p101h.AbstractC2262d;
import p242qc.C4226b;
import p242qc.C4228d;
import p242qc.C4229e;
import p242qc.C4230f;
import p242qc.C4231g;
import p242qc.C4232h;
import p258rc.InterfaceC4340a;
import p297uc.C5011i;
import p331x1.AbstractC5537m;
import p331x1.C5515b;
import p331x1.C5540o;
import p345y.C5782a;
import sc.C4565a;
import vc.C5162b;

/* loaded from: classes2.dex */
public class UCropActivity extends ActivityC0185b {

    /* renamed from: L */
    public static final Bitmap.CompressFormat f5384L = Bitmap.CompressFormat.JPEG;

    /* renamed from: A */
    public ViewGroup f5385A;

    /* renamed from: C */
    public TextView f5387C;

    /* renamed from: D */
    public TextView f5388D;

    /* renamed from: E */
    public View f5389E;

    /* renamed from: F */
    public AbstractC5537m f5390F;

    /* renamed from: h */
    public String f5396h;

    /* renamed from: i */
    public int f5397i;

    /* renamed from: j */
    public int f5398j;

    /* renamed from: k */
    public int f5399k;

    /* renamed from: l */
    public int f5400l;

    /* renamed from: m */
    public int f5401m;

    /* renamed from: n */
    public int f5402n;

    /* renamed from: o */
    public int f5403o;

    /* renamed from: p */
    public int f5404p;

    /* renamed from: q */
    public boolean f5405q;

    /* renamed from: s */
    public UCropView f5407s;

    /* renamed from: t */
    public GestureCropImageView f5408t;

    /* renamed from: u */
    public OverlayView f5409u;

    /* renamed from: v */
    public ViewGroup f5410v;

    /* renamed from: w */
    public ViewGroup f5411w;

    /* renamed from: x */
    public ViewGroup f5412x;

    /* renamed from: y */
    public ViewGroup f5413y;

    /* renamed from: z */
    public ViewGroup f5414z;

    /* renamed from: r */
    public boolean f5406r = true;

    /* renamed from: B */
    public List<ViewGroup> f5386B = new ArrayList();

    /* renamed from: G */
    public Bitmap.CompressFormat f5391G = f5384L;

    /* renamed from: H */
    public int f5392H = 90;

    /* renamed from: I */
    public int[] f5393I = {1, 2, 3};

    /* renamed from: J */
    public C5162b.b f5394J = new C1490a();

    /* renamed from: K */
    public final View.OnClickListener f5395K = new ViewOnClickListenerC1496g();

    /* renamed from: com.yalantis.ucrop.UCropActivity$a */
    /* loaded from: classes2.dex */
    public class C1490a implements C5162b.b {
        public C1490a() {
        }

        @Override // vc.C5162b.b
        /* renamed from: a */
        public void mo6035a(float f10) {
            UCropActivity.this.m6034z(f10);
        }

        @Override // vc.C5162b.b
        /* renamed from: b */
        public void mo6036b() {
            UCropActivity.this.f5407s.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.f5389E.setClickable(false);
            UCropActivity.this.f5406r = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // vc.C5162b.b
        /* renamed from: c */
        public void mo6037c(Exception exc) {
            UCropActivity.this.m6014D(exc);
            UCropActivity.this.finish();
        }

        @Override // vc.C5162b.b
        /* renamed from: d */
        public void mo6038d(float f10) {
            UCropActivity.this.m6016F(f10);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$b */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC1491b implements View.OnClickListener {
        public ViewOnClickListenerC1491b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.f5408t.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).m6093g(view.isSelected()));
            UCropActivity.this.f5408t.m20889B();
            if (view.isSelected()) {
                return;
            }
            for (ViewGroup viewGroup : UCropActivity.this.f5386B) {
                viewGroup.setSelected(viewGroup == view);
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$c */
    /* loaded from: classes2.dex */
    public class C1492c implements HorizontalProgressWheelView.InterfaceC1505a {
        public C1492c() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.InterfaceC1505a
        /* renamed from: a */
        public void mo6039a() {
            UCropActivity.this.f5408t.m20889B();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.InterfaceC1505a
        /* renamed from: b */
        public void mo6040b(float f10, float f11) {
            UCropActivity.this.f5408t.m20905z(f10 / 42.0f);
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.InterfaceC1505a
        /* renamed from: c */
        public void mo6041c() {
            UCropActivity.this.f5408t.m20901v();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$d */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC1493d implements View.OnClickListener {
        public ViewOnClickListenerC1493d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.m6031w();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$e */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC1494e implements View.OnClickListener {
        public ViewOnClickListenerC1494e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UCropActivity.this.m6032x(90);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$f */
    /* loaded from: classes2.dex */
    public class C1495f implements HorizontalProgressWheelView.InterfaceC1505a {
        public C1495f() {
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.InterfaceC1505a
        /* renamed from: a */
        public void mo6039a() {
            UCropActivity.this.f5408t.m20889B();
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.InterfaceC1505a
        /* renamed from: b */
        public void mo6040b(float f10, float f11) {
            if (f10 > 0.0f) {
                UCropActivity.this.f5408t.m20892E(UCropActivity.this.f5408t.getCurrentScale() + (f10 * ((UCropActivity.this.f5408t.getMaxScale() - UCropActivity.this.f5408t.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.f5408t.m20894G(UCropActivity.this.f5408t.getCurrentScale() + (f10 * ((UCropActivity.this.f5408t.getMaxScale() - UCropActivity.this.f5408t.getMinScale()) / 15000.0f)));
            }
        }

        @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.InterfaceC1505a
        /* renamed from: c */
        public void mo6041c() {
            UCropActivity.this.f5408t.m20901v();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$g */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC1496g implements View.OnClickListener {
        public ViewOnClickListenerC1496g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.isSelected()) {
                return;
            }
            UCropActivity.this.m6019I(view.getId());
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$h */
    /* loaded from: classes2.dex */
    public class C1497h implements InterfaceC4340a {
        public C1497h() {
        }

        @Override // p258rc.InterfaceC4340a
        /* renamed from: a */
        public void mo6042a(Uri uri, int i10, int i11, int i12, int i13) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.m6015E(uri, uCropActivity.f5408t.getTargetAspectRatio(), i10, i11, i12, i13);
            UCropActivity.this.finish();
        }

        @Override // p258rc.InterfaceC4340a
        /* renamed from: b */
        public void mo6043b(Throwable th) {
            UCropActivity.this.m6014D(th);
            UCropActivity.this.finish();
        }
    }

    static {
        AbstractC2262d.m9030B(true);
    }

    /* renamed from: A */
    public final void m6011A(int i10) {
        TextView textView = this.f5387C;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    /* renamed from: B */
    public final void m6012B(Intent intent) {
        Throwable e10;
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        m6030v(intent);
        if (uri == null || uri2 == null) {
            e10 = new NullPointerException(getString(C4232h.f15271a));
        } else {
            try {
                this.f5408t.m20916p(uri, uri2);
                return;
            } catch (Exception e11) {
                e10 = e11;
            }
        }
        m6014D(e10);
        finish();
    }

    /* renamed from: C */
    public final void m6013C() {
        if (this.f5405q) {
            m6019I(this.f5410v.getVisibility() == 0 ? C4229e.f15253n : C4229e.f15255p);
        } else {
            m6033y(0);
        }
    }

    /* renamed from: D */
    public void m6014D(Throwable th) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    /* renamed from: E */
    public void m6015E(Uri uri, float f10, int i10, int i11, int i12, int i13) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f10).putExtra("com.yalantis.ucrop.ImageWidth", i12).putExtra("com.yalantis.ucrop.ImageHeight", i13).putExtra("com.yalantis.ucrop.OffsetX", i10).putExtra("com.yalantis.ucrop.OffsetY", i11));
    }

    /* renamed from: F */
    public final void m6016F(float f10) {
        TextView textView = this.f5388D;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf((int) (f10 * 100.0f))));
        }
    }

    /* renamed from: G */
    public final void m6017G(int i10) {
        TextView textView = this.f5388D;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    @TargetApi(21)
    /* renamed from: H */
    public final void m6018H(int i10) {
        Window window;
        if (Build.VERSION.SDK_INT < 21 || (window = getWindow()) == null) {
            return;
        }
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i10);
    }

    /* renamed from: I */
    public final void m6019I(int i10) {
        if (this.f5405q) {
            ViewGroup viewGroup = this.f5410v;
            int i11 = C4229e.f15253n;
            viewGroup.setSelected(i10 == i11);
            ViewGroup viewGroup2 = this.f5411w;
            int i12 = C4229e.f15254o;
            viewGroup2.setSelected(i10 == i12);
            ViewGroup viewGroup3 = this.f5412x;
            int i13 = C4229e.f15255p;
            viewGroup3.setSelected(i10 == i13);
            this.f5413y.setVisibility(i10 == i11 ? 0 : 8);
            this.f5414z.setVisibility(i10 == i12 ? 0 : 8);
            this.f5385A.setVisibility(i10 == i13 ? 0 : 8);
            m6027s(i10);
            if (i10 == i13) {
                m6033y(0);
            } else if (i10 == i12) {
                m6033y(1);
            } else {
                m6033y(2);
            }
        }
    }

    /* renamed from: J */
    public final void m6020J() {
        m6018H(this.f5398j);
        Toolbar toolbar = (Toolbar) findViewById(C4229e.f15259t);
        toolbar.setBackgroundColor(this.f5397i);
        toolbar.setTitleTextColor(this.f5400l);
        TextView textView = (TextView) toolbar.findViewById(C4229e.f15260u);
        textView.setTextColor(this.f5400l);
        textView.setText(this.f5396h);
        Drawable mutate = C5782a.getDrawable(this, this.f5402n).mutate();
        mutate.setColorFilter(this.f5400l, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(mutate);
        setSupportActionBar(toolbar);
        AbstractC2259a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo9019v(false);
        }
    }

    /* renamed from: K */
    public final void m6021K(Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            intExtra = 2;
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new C4565a(null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new C4565a(null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new C4565a(getString(C4232h.f15273c).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new C4565a(null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new C4565a(null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(C4229e.f15246g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            C4565a c4565a = (C4565a) it.next();
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(C4230f.f15267b, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f5399k);
            aspectRatioTextView.setAspectRatio(c4565a);
            linearLayout.addView(frameLayout);
            this.f5386B.add(frameLayout);
        }
        this.f5386B.get(intExtra).setSelected(true);
        Iterator<ViewGroup> it2 = this.f5386B.iterator();
        while (it2.hasNext()) {
            it2.next().setOnClickListener(new ViewOnClickListenerC1491b());
        }
    }

    /* renamed from: L */
    public final void m6022L() {
        this.f5387C = (TextView) findViewById(C4229e.f15257r);
        int i10 = C4229e.f15251l;
        ((HorizontalProgressWheelView) findViewById(i10)).setScrollingListener(new C1492c());
        ((HorizontalProgressWheelView) findViewById(i10)).setMiddleLineColor(this.f5399k);
        findViewById(C4229e.f15265z).setOnClickListener(new ViewOnClickListenerC1493d());
        findViewById(C4229e.f15239A).setOnClickListener(new ViewOnClickListenerC1494e());
        m6011A(this.f5399k);
    }

    /* renamed from: M */
    public final void m6023M() {
        this.f5388D = (TextView) findViewById(C4229e.f15258s);
        int i10 = C4229e.f15252m;
        ((HorizontalProgressWheelView) findViewById(i10)).setScrollingListener(new C1495f());
        ((HorizontalProgressWheelView) findViewById(i10)).setMiddleLineColor(this.f5399k);
        m6017G(this.f5399k);
    }

    /* renamed from: N */
    public final void m6024N() {
        ImageView imageView = (ImageView) findViewById(C4229e.f15245f);
        ImageView imageView2 = (ImageView) findViewById(C4229e.f15244e);
        ImageView imageView3 = (ImageView) findViewById(C4229e.f15243d);
        imageView.setImageDrawable(new C5011i(imageView.getDrawable(), this.f5399k));
        imageView2.setImageDrawable(new C5011i(imageView2.getDrawable(), this.f5399k));
        imageView3.setImageDrawable(new C5011i(imageView3.getDrawable(), this.f5399k));
    }

    /* renamed from: O */
    public final void m6025O(Intent intent) {
        this.f5398j = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", C5782a.getColor(this, C4226b.f15221h));
        this.f5397i = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", C5782a.getColor(this, C4226b.f15222i));
        this.f5399k = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", C5782a.getColor(this, C4226b.f15214a));
        this.f5400l = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", C5782a.getColor(this, C4226b.f15223j));
        this.f5402n = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", C4228d.f15237a);
        this.f5403o = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", C4228d.f15238b);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f5396h = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(C4232h.f15272b);
        }
        this.f5396h = stringExtra;
        this.f5404p = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", C5782a.getColor(this, C4226b.f15219f));
        this.f5405q = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f5401m = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", C5782a.getColor(this, C4226b.f15215b));
        m6020J();
        m6029u();
        if (this.f5405q) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(C4229e.f15263x)).findViewById(C4229e.f15240a);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(C4230f.f15268c, viewGroup, true);
            C5515b c5515b = new C5515b();
            this.f5390F = c5515b;
            c5515b.mo22292Y(50L);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(C4229e.f15253n);
            this.f5410v = viewGroup2;
            viewGroup2.setOnClickListener(this.f5395K);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(C4229e.f15254o);
            this.f5411w = viewGroup3;
            viewGroup3.setOnClickListener(this.f5395K);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(C4229e.f15255p);
            this.f5412x = viewGroup4;
            viewGroup4.setOnClickListener(this.f5395K);
            this.f5413y = (ViewGroup) findViewById(C4229e.f15246g);
            this.f5414z = (ViewGroup) findViewById(C4229e.f15247h);
            this.f5385A = (ViewGroup) findViewById(C4229e.f15248i);
            m6021K(intent);
            m6022L();
            m6023M();
            m6024N();
        }
    }

    @Override // androidx.fragment.app.ActivityC0306j, androidx.activity.ComponentActivity, p329x.ActivityC5490h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C4230f.f15266a);
        Intent intent = getIntent();
        m6025O(intent);
        m6012B(intent);
        m6013C();
        m6026r();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C4231g.f15270a, menu);
        MenuItem findItem = menu.findItem(C4229e.f15250k);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f5400l, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e10) {
                Log.i("UCropActivity", String.format("%s - %s", e10.getMessage(), getString(C4232h.f15274d)));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(C4229e.f15249j);
        Drawable drawable = C5782a.getDrawable(this, this.f5403o);
        if (drawable != null) {
            drawable.mutate();
            drawable.setColorFilter(this.f5400l, PorterDuff.Mode.SRC_ATOP);
            findItem2.setIcon(drawable);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C4229e.f15249j) {
            m6028t();
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(C4229e.f15249j).setVisible(!this.f5406r);
        menu.findItem(C4229e.f15250k).setVisible(this.f5406r);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.ActivityC0185b, androidx.fragment.app.ActivityC0306j, android.app.Activity
    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f5408t;
        if (gestureCropImageView != null) {
            gestureCropImageView.m20901v();
        }
    }

    /* renamed from: r */
    public final void m6026r() {
        if (this.f5389E == null) {
            this.f5389E = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, C4229e.f15259t);
            this.f5389E.setLayoutParams(layoutParams);
            this.f5389E.setClickable(true);
        }
        ((RelativeLayout) findViewById(C4229e.f15263x)).addView(this.f5389E);
    }

    /* renamed from: s */
    public final void m6027s(int i10) {
        C5540o.m22319a((ViewGroup) findViewById(C4229e.f15263x), this.f5390F);
        this.f5412x.findViewById(C4229e.f15258s).setVisibility(i10 == C4229e.f15255p ? 0 : 8);
        this.f5410v.findViewById(C4229e.f15256q).setVisibility(i10 == C4229e.f15253n ? 0 : 8);
        this.f5411w.findViewById(C4229e.f15257r).setVisibility(i10 != C4229e.f15254o ? 8 : 0);
    }

    /* renamed from: t */
    public void m6028t() {
        this.f5389E.setClickable(true);
        this.f5406r = true;
        supportInvalidateOptionsMenu();
        this.f5408t.m20902w(this.f5391G, this.f5392H, new C1497h());
    }

    /* renamed from: u */
    public final void m6029u() {
        UCropView uCropView = (UCropView) findViewById(C4229e.f15261v);
        this.f5407s = uCropView;
        this.f5408t = uCropView.getCropImageView();
        this.f5409u = this.f5407s.getOverlayView();
        this.f5408t.setTransformImageListener(this.f5394J);
        ((ImageView) findViewById(C4229e.f15242c)).setColorFilter(this.f5404p, PorterDuff.Mode.SRC_ATOP);
        int i10 = C4229e.f15262w;
        findViewById(i10).setBackgroundColor(this.f5401m);
        if (this.f5405q) {
            return;
        }
        ((RelativeLayout.LayoutParams) findViewById(i10).getLayoutParams()).bottomMargin = 0;
        findViewById(i10).requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0137, code lost:
    
        if (java.lang.Float.isNaN(r0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0160, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0161, code lost:
    
        r1.setTargetAspectRatio(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015d, code lost:
    
        if (java.lang.Float.isNaN(r0) != false) goto L69;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6030v(android.content.Intent r8) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.UCropActivity.m6030v(android.content.Intent):void");
    }

    /* renamed from: w */
    public final void m6031w() {
        GestureCropImageView gestureCropImageView = this.f5408t;
        gestureCropImageView.m20905z(-gestureCropImageView.getCurrentAngle());
        this.f5408t.m20889B();
    }

    /* renamed from: x */
    public final void m6032x(int i10) {
        this.f5408t.m20905z(i10);
        this.f5408t.m20889B();
    }

    /* renamed from: y */
    public final void m6033y(int i10) {
        GestureCropImageView gestureCropImageView = this.f5408t;
        int[] iArr = this.f5393I;
        gestureCropImageView.setScaleEnabled(iArr[i10] == 3 || iArr[i10] == 1);
        GestureCropImageView gestureCropImageView2 = this.f5408t;
        int[] iArr2 = this.f5393I;
        gestureCropImageView2.setRotateEnabled(iArr2[i10] == 3 || iArr2[i10] == 2);
    }

    /* renamed from: z */
    public final void m6034z(float f10) {
        TextView textView = this.f5387C;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", Float.valueOf(f10)));
        }
    }
}
