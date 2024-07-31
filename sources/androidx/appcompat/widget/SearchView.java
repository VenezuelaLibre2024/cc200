package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p089g.C1931a;
import p089g.C1934d;
import p089g.C1936f;
import p089g.C1937g;
import p089g.C1938h;
import p089g.C1940j;
import p148k0.C3308b0;
import p162l.InterfaceC3392c;
import p187n.C3622c;
import p187n.C3630e1;
import p187n.C3667w0;
import p187n.C3671y0;
import p187n.ViewOnClickListenerC3655q0;
import p201o0.AbstractC3825a;
import p217p0.AbstractC3995a;

/* loaded from: classes.dex */
public class SearchView extends C0241c implements InterfaceC3392c {

    /* renamed from: x0 */
    public static final C0228o f932x0;

    /* renamed from: A */
    public final ImageView f933A;

    /* renamed from: B */
    public final ImageView f934B;

    /* renamed from: C */
    public final ImageView f935C;

    /* renamed from: D */
    public final ImageView f936D;

    /* renamed from: E */
    public final View f937E;

    /* renamed from: F */
    public C0230q f938F;

    /* renamed from: G */
    public Rect f939G;

    /* renamed from: H */
    public Rect f940H;

    /* renamed from: I */
    public int[] f941I;

    /* renamed from: J */
    public int[] f942J;

    /* renamed from: K */
    public final ImageView f943K;

    /* renamed from: L */
    public final Drawable f944L;

    /* renamed from: M */
    public final int f945M;

    /* renamed from: N */
    public final int f946N;

    /* renamed from: O */
    public final Intent f947O;

    /* renamed from: P */
    public final Intent f948P;

    /* renamed from: Q */
    public final CharSequence f949Q;

    /* renamed from: R */
    public InterfaceC0226m f950R;

    /* renamed from: S */
    public InterfaceC0225l f951S;

    /* renamed from: T */
    public View.OnFocusChangeListener f952T;

    /* renamed from: U */
    public InterfaceC0227n f953U;

    /* renamed from: V */
    public View.OnClickListener f954V;

    /* renamed from: W */
    public boolean f955W;

    /* renamed from: a0 */
    public boolean f956a0;

    /* renamed from: b0 */
    public AbstractC3825a f957b0;

    /* renamed from: c0 */
    public boolean f958c0;

    /* renamed from: d0 */
    public CharSequence f959d0;

    /* renamed from: e0 */
    public boolean f960e0;

    /* renamed from: f0 */
    public boolean f961f0;

    /* renamed from: g0 */
    public int f962g0;

    /* renamed from: h0 */
    public boolean f963h0;

    /* renamed from: i0 */
    public CharSequence f964i0;

    /* renamed from: j0 */
    public CharSequence f965j0;

    /* renamed from: k0 */
    public boolean f966k0;

    /* renamed from: l0 */
    public int f967l0;

    /* renamed from: m0 */
    public SearchableInfo f968m0;

    /* renamed from: n0 */
    public Bundle f969n0;

    /* renamed from: o0 */
    public final Runnable f970o0;

    /* renamed from: p0 */
    public Runnable f971p0;

    /* renamed from: q0 */
    public final WeakHashMap<String, Drawable.ConstantState> f972q0;

    /* renamed from: r0 */
    public final View.OnClickListener f973r0;

    /* renamed from: s0 */
    public View.OnKeyListener f974s0;

    /* renamed from: t0 */
    public final TextView.OnEditorActionListener f975t0;

    /* renamed from: u0 */
    public final AdapterView.OnItemClickListener f976u0;

    /* renamed from: v0 */
    public final AdapterView.OnItemSelectedListener f977v0;

    /* renamed from: w */
    public final SearchAutoComplete f978w;

    /* renamed from: w0 */
    public TextWatcher f979w0;

    /* renamed from: x */
    public final View f980x;

    /* renamed from: y */
    public final View f981y;

    /* renamed from: z */
    public final View f982z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C3622c {

        /* renamed from: l */
        public int f983l;

        /* renamed from: m */
        public SearchView f984m;

        /* renamed from: n */
        public boolean f985n;

        /* renamed from: o */
        public final Runnable f986o;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        /* loaded from: classes.dex */
        public class RunnableC0213a implements Runnable {
            public RunnableC0213a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.m967d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C1931a.f7344p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f986o = new RunnableC0213a();
            this.f983l = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* renamed from: b */
        public void m965b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f932x0.m975c(this);
                return;
            }
            C0224k.m969b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        /* renamed from: c */
        public boolean m966c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* renamed from: d */
        public void m967d() {
            if (this.f985n) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f985n = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f983l <= 0 || super.enoughToFilter();
        }

        @Override // p187n.C3622c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f985n) {
                removeCallbacks(this.f986o);
                post(this.f986o);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f984m.m949X();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f984m.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f984m.hasFocus() && getVisibility() == 0) {
                this.f985n = true;
                if (SearchView.m926K(getContext())) {
                    m965b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f985n = false;
                removeCallbacks(this.f986o);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f985n = true;
                    return;
                }
                this.f985n = false;
                removeCallbacks(this.f986o);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f984m = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f983l = i10;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    /* loaded from: classes.dex */
    public class C0214a implements TextWatcher {
        public C0214a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.m948W(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    /* loaded from: classes.dex */
    public class RunnableC0215b implements Runnable {
        public RunnableC0215b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m957d0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    /* loaded from: classes.dex */
    public class RunnableC0216c implements Runnable {
        public RunnableC0216c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3825a abstractC3825a = SearchView.this.f957b0;
            if (abstractC3825a instanceof ViewOnClickListenerC3655q0) {
                abstractC3825a.mo13673a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    /* loaded from: classes.dex */
    public class ViewOnFocusChangeListenerC0217d implements View.OnFocusChangeListener {
        public ViewOnFocusChangeListenerC0217d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f952T;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    /* loaded from: classes.dex */
    public class ViewOnLayoutChangeListenerC0218e implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0218e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.m964z();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0219f implements View.OnClickListener {
        public ViewOnClickListenerC0219f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f933A) {
                searchView.m945T();
                return;
            }
            if (view == searchView.f935C) {
                searchView.m941P();
                return;
            }
            if (view == searchView.f934B) {
                searchView.m946U();
            } else if (view == searchView.f936D) {
                searchView.m950Y();
            } else if (view == searchView.f978w) {
                searchView.m932F();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    /* loaded from: classes.dex */
    public class ViewOnKeyListenerC0220g implements View.OnKeyListener {
        public ViewOnKeyListenerC0220g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f968m0 == null) {
                return false;
            }
            if (searchView.f978w.isPopupShowing() && SearchView.this.f978w.getListSelection() != -1) {
                return SearchView.this.m947V(view, i10, keyEvent);
            }
            if (SearchView.this.f978w.m966c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.m939N(0, null, searchView2.f978w.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    /* loaded from: classes.dex */
    public class C0221h implements TextView.OnEditorActionListener {
        public C0221h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.m946U();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    /* loaded from: classes.dex */
    public class C0222i implements AdapterView.OnItemClickListener {
        public C0222i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.m942Q(i10, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    /* loaded from: classes.dex */
    public class C0223j implements AdapterView.OnItemSelectedListener {
        public C0223j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.m943R(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    /* loaded from: classes.dex */
    public static class C0224k {
        /* renamed from: a */
        public static void m968a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* renamed from: b */
        public static void m969b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    /* loaded from: classes.dex */
    public interface InterfaceC0225l {
        boolean onClose();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    /* loaded from: classes.dex */
    public interface InterfaceC0226m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    /* loaded from: classes.dex */
    public interface InterfaceC0227n {
        /* renamed from: a */
        boolean m970a(int i10);

        /* renamed from: b */
        boolean m971b(int i10);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    /* loaded from: classes.dex */
    public static class C0228o {

        /* renamed from: a */
        public Method f998a;

        /* renamed from: b */
        public Method f999b;

        /* renamed from: c */
        public Method f1000c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public C0228o() {
            this.f998a = null;
            this.f999b = null;
            this.f1000c = null;
            m972d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f998a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f999b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1000c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        public static void m972d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* renamed from: a */
        public void m973a(AutoCompleteTextView autoCompleteTextView) {
            m972d();
            Method method = this.f999b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: b */
        public void m974b(AutoCompleteTextView autoCompleteTextView) {
            m972d();
            Method method = this.f998a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* renamed from: c */
        public void m975c(AutoCompleteTextView autoCompleteTextView) {
            m972d();
            Method method = this.f1000c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    /* loaded from: classes.dex */
    public static class C0229p extends AbstractC3995a {
        public static final Parcelable.Creator<C0229p> CREATOR = new a();

        /* renamed from: j */
        public boolean f1001j;

        /* renamed from: androidx.appcompat.widget.SearchView$p$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<C0229p> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0229p createFromParcel(Parcel parcel) {
                return new C0229p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0229p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0229p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C0229p[] newArray(int i10) {
                return new C0229p[i10];
            }
        }

        public C0229p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1001j = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public C0229p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1001j + "}";
        }

        @Override // p217p0.AbstractC3995a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f1001j));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$q */
    /* loaded from: classes.dex */
    public static class C0230q extends TouchDelegate {

        /* renamed from: a */
        public final View f1002a;

        /* renamed from: b */
        public final Rect f1003b;

        /* renamed from: c */
        public final Rect f1004c;

        /* renamed from: d */
        public final Rect f1005d;

        /* renamed from: e */
        public final int f1006e;

        /* renamed from: f */
        public boolean f1007f;

        public C0230q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1006e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1003b = new Rect();
            this.f1005d = new Rect();
            this.f1004c = new Rect();
            m979a(rect, rect2);
            this.f1002a = view;
        }

        /* renamed from: a */
        public void m979a(Rect rect, Rect rect2) {
            this.f1003b.set(rect);
            this.f1005d.set(rect);
            Rect rect3 = this.f1005d;
            int i10 = this.f1006e;
            rect3.inset(-i10, -i10);
            this.f1004c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            float f10;
            int i10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f1007f;
                    if (z11 && !this.f1005d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else {
                    if (action == 3) {
                        z11 = this.f1007f;
                        this.f1007f = false;
                    }
                    z10 = true;
                    z12 = false;
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f1003b.contains(x10, y10)) {
                    this.f1007f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f1004c.contains(x10, y10)) {
                Rect rect = this.f1004c;
                f10 = x10 - rect.left;
                i10 = y10 - rect.top;
            } else {
                f10 = this.f1002a.getWidth() / 2;
                i10 = this.f1002a.getHeight() / 2;
            }
            motionEvent.setLocation(f10, i10);
            return this.f1002a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f932x0 = Build.VERSION.SDK_INT < 29 ? new C0228o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1931a.f7323H);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f939G = new Rect();
        this.f940H = new Rect();
        this.f941I = new int[2];
        this.f942J = new int[2];
        this.f970o0 = new RunnableC0215b();
        this.f971p0 = new RunnableC0216c();
        this.f972q0 = new WeakHashMap<>();
        ViewOnClickListenerC0219f viewOnClickListenerC0219f = new ViewOnClickListenerC0219f();
        this.f973r0 = viewOnClickListenerC0219f;
        this.f974s0 = new ViewOnKeyListenerC0220g();
        C0221h c0221h = new C0221h();
        this.f975t0 = c0221h;
        C0222i c0222i = new C0222i();
        this.f976u0 = c0222i;
        C0223j c0223j = new C0223j();
        this.f977v0 = c0223j;
        this.f979w0 = new C0214a();
        int[] iArr = C1940j.f7641f2;
        C3667w0 m13717u = C3667w0.m13717u(context, attributeSet, iArr, i10, 0);
        C3308b0.m12007U(this, context, iArr, attributeSet, m13717u.m13734q(), i10, 0);
        LayoutInflater.from(context).inflate(m13717u.m13730m(C1940j.f7691p2, C1937g.f7483r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C1936f.f7427D);
        this.f978w = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f980x = findViewById(C1936f.f7465z);
        View findViewById = findViewById(C1936f.f7426C);
        this.f981y = findViewById;
        View findViewById2 = findViewById(C1936f.f7433J);
        this.f982z = findViewById2;
        ImageView imageView = (ImageView) findViewById(C1936f.f7463x);
        this.f933A = imageView;
        ImageView imageView2 = (ImageView) findViewById(C1936f.f7424A);
        this.f934B = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C1936f.f7464y);
        this.f935C = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C1936f.f7428E);
        this.f936D = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C1936f.f7425B);
        this.f943K = imageView5;
        C3308b0.m12012Z(findViewById, m13717u.m13723f(C1940j.f7696q2));
        C3308b0.m12012Z(findViewById2, m13717u.m13723f(C1940j.f7716u2));
        int i11 = C1940j.f7711t2;
        imageView.setImageDrawable(m13717u.m13723f(i11));
        imageView2.setImageDrawable(m13717u.m13723f(C1940j.f7681n2));
        imageView3.setImageDrawable(m13717u.m13723f(C1940j.f7666k2));
        imageView4.setImageDrawable(m13717u.m13723f(C1940j.f7726w2));
        imageView5.setImageDrawable(m13717u.m13723f(i11));
        this.f944L = m13717u.m13723f(C1940j.f7706s2);
        C3671y0.m13742a(imageView, getResources().getString(C1938h.f7497l));
        this.f945M = m13717u.m13730m(C1940j.f7721v2, C1937g.f7482q);
        this.f946N = m13717u.m13730m(C1940j.f7671l2, 0);
        imageView.setOnClickListener(viewOnClickListenerC0219f);
        imageView3.setOnClickListener(viewOnClickListenerC0219f);
        imageView2.setOnClickListener(viewOnClickListenerC0219f);
        imageView4.setOnClickListener(viewOnClickListenerC0219f);
        searchAutoComplete.setOnClickListener(viewOnClickListenerC0219f);
        searchAutoComplete.addTextChangedListener(this.f979w0);
        searchAutoComplete.setOnEditorActionListener(c0221h);
        searchAutoComplete.setOnItemClickListener(c0222i);
        searchAutoComplete.setOnItemSelectedListener(c0223j);
        searchAutoComplete.setOnKeyListener(this.f974s0);
        searchAutoComplete.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0217d());
        setIconifiedByDefault(m13717u.m13718a(C1940j.f7686o2, true));
        int m13722e = m13717u.m13722e(C1940j.f7651h2, -1);
        if (m13722e != -1) {
            setMaxWidth(m13722e);
        }
        this.f949Q = m13717u.m13732o(C1940j.f7676m2);
        this.f959d0 = m13717u.m13732o(C1940j.f7701r2);
        int m13727j = m13717u.m13727j(C1940j.f7661j2, -1);
        if (m13727j != -1) {
            setImeOptions(m13727j);
        }
        int m13727j2 = m13717u.m13727j(C1940j.f7656i2, -1);
        if (m13727j2 != -1) {
            setInputType(m13727j2);
        }
        setFocusable(m13717u.m13718a(C1940j.f7646g2, true));
        m13717u.m13736v();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f947O = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f948P = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f937E = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0218e());
        }
        m962i0(this.f955W);
        m958e0();
    }

    /* renamed from: K */
    public static boolean m926K(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C1934d.f7370g);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C1934d.f7371h);
    }

    private void setQuery(CharSequence charSequence) {
        this.f978w.setText(charSequence);
        this.f978w.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* renamed from: A */
    public final Intent m927A(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f965j0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f969n0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f968m0.getSearchActivity());
        return intent;
    }

    /* renamed from: B */
    public final Intent m928B(Cursor cursor, int i10, String str) {
        int i11;
        String m13669o;
        try {
            String m13669o2 = ViewOnClickListenerC3655q0.m13669o(cursor, "suggest_intent_action");
            if (m13669o2 == null) {
                m13669o2 = this.f968m0.getSuggestIntentAction();
            }
            if (m13669o2 == null) {
                m13669o2 = "android.intent.action.SEARCH";
            }
            String str2 = m13669o2;
            String m13669o3 = ViewOnClickListenerC3655q0.m13669o(cursor, "suggest_intent_data");
            if (m13669o3 == null) {
                m13669o3 = this.f968m0.getSuggestIntentData();
            }
            if (m13669o3 != null && (m13669o = ViewOnClickListenerC3655q0.m13669o(cursor, "suggest_intent_data_id")) != null) {
                m13669o3 = m13669o3 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + Uri.encode(m13669o);
            }
            return m927A(str2, m13669o3 == null ? null : Uri.parse(m13669o3), ViewOnClickListenerC3655q0.m13669o(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC3655q0.m13669o(cursor, "suggest_intent_query"), i10, str);
        } catch (RuntimeException e10) {
            try {
                i11 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i11 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            return null;
        }
    }

    /* renamed from: C */
    public final Intent m929C(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f969n0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: D */
    public final Intent m930D(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: E */
    public final void m931E() {
        this.f978w.dismissDropDown();
    }

    /* renamed from: F */
    public void m932F() {
        if (Build.VERSION.SDK_INT >= 29) {
            C0224k.m968a(this.f978w);
            return;
        }
        C0228o c0228o = f932x0;
        c0228o.m974b(this.f978w);
        c0228o.m973a(this.f978w);
    }

    /* renamed from: G */
    public final void m933G(View view, Rect rect) {
        view.getLocationInWindow(this.f941I);
        getLocationInWindow(this.f942J);
        int[] iArr = this.f941I;
        int i10 = iArr[1];
        int[] iArr2 = this.f942J;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    /* renamed from: H */
    public final CharSequence m934H(CharSequence charSequence) {
        if (!this.f955W || this.f944L == null) {
            return charSequence;
        }
        int textSize = (int) (this.f978w.getTextSize() * 1.25d);
        this.f944L.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f944L), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: I */
    public final boolean m935I() {
        SearchableInfo searchableInfo = this.f968m0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f968m0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f947O;
        } else if (this.f968m0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f948P;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: J */
    public boolean m936J() {
        return this.f956a0;
    }

    /* renamed from: L */
    public final boolean m937L() {
        return (this.f958c0 || this.f963h0) && !m936J();
    }

    /* renamed from: M */
    public final void m938M(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e10) {
            Log.e("SearchView", "Failed launch activity: " + intent, e10);
        }
    }

    /* renamed from: N */
    public void m939N(int i10, String str, String str2) {
        getContext().startActivity(m927A("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    /* renamed from: O */
    public final boolean m940O(int i10, int i11, String str) {
        Cursor mo14537b = this.f957b0.mo14537b();
        if (mo14537b == null || !mo14537b.moveToPosition(i10)) {
            return false;
        }
        m938M(m928B(mo14537b, i11, str));
        return true;
    }

    /* renamed from: P */
    public void m941P() {
        if (!TextUtils.isEmpty(this.f978w.getText())) {
            this.f978w.setText("");
            this.f978w.requestFocus();
            this.f978w.setImeVisibility(true);
        } else if (this.f955W) {
            InterfaceC0225l interfaceC0225l = this.f951S;
            if (interfaceC0225l == null || !interfaceC0225l.onClose()) {
                clearFocus();
                m962i0(true);
            }
        }
    }

    /* renamed from: Q */
    public boolean m942Q(int i10, int i11, String str) {
        InterfaceC0227n interfaceC0227n = this.f953U;
        if (interfaceC0227n != null && interfaceC0227n.m971b(i10)) {
            return false;
        }
        m940O(i10, 0, null);
        this.f978w.setImeVisibility(false);
        m931E();
        return true;
    }

    /* renamed from: R */
    public boolean m943R(int i10) {
        InterfaceC0227n interfaceC0227n = this.f953U;
        if (interfaceC0227n != null && interfaceC0227n.m970a(i10)) {
            return false;
        }
        m952a0(i10);
        return true;
    }

    /* renamed from: S */
    public void m944S(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* renamed from: T */
    public void m945T() {
        m962i0(false);
        this.f978w.requestFocus();
        this.f978w.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f954V;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* renamed from: U */
    public void m946U() {
        Editable text = this.f978w.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        InterfaceC0226m interfaceC0226m = this.f950R;
        if (interfaceC0226m == null || !interfaceC0226m.onQueryTextSubmit(text.toString())) {
            if (this.f968m0 != null) {
                m939N(0, null, text.toString());
            }
            this.f978w.setImeVisibility(false);
            m931E();
        }
    }

    /* renamed from: V */
    public boolean m947V(View view, int i10, KeyEvent keyEvent) {
        if (this.f968m0 != null && this.f957b0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return m942Q(this.f978w.getListSelection(), 0, null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f978w.setSelection(i10 == 21 ? 0 : this.f978w.length());
                this.f978w.setListSelection(0);
                this.f978w.clearListSelection();
                this.f978w.m965b();
                return true;
            }
            if (i10 == 19) {
                this.f978w.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* renamed from: W */
    public void m948W(CharSequence charSequence) {
        Editable text = this.f978w.getText();
        this.f965j0 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        m961h0(z10);
        m963j0(!z10);
        m955c0();
        m960g0();
        if (this.f950R != null && !TextUtils.equals(charSequence, this.f964i0)) {
            this.f950R.onQueryTextChange(charSequence.toString());
        }
        this.f964i0 = charSequence.toString();
    }

    /* renamed from: X */
    public void m949X() {
        m962i0(m936J());
        m951Z();
        if (this.f978w.hasFocus()) {
            m932F();
        }
    }

    /* renamed from: Y */
    public void m950Y() {
        Intent m929C;
        SearchableInfo searchableInfo = this.f968m0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                m929C = m930D(this.f947O, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                m929C = m929C(this.f948P, searchableInfo);
            }
            getContext().startActivity(m929C);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    /* renamed from: Z */
    public final void m951Z() {
        post(this.f970o0);
    }

    /* renamed from: a0 */
    public final void m952a0(int i10) {
        CharSequence mo13674c;
        Editable text = this.f978w.getText();
        Cursor mo14537b = this.f957b0.mo14537b();
        if (mo14537b == null) {
            return;
        }
        if (!mo14537b.moveToPosition(i10) || (mo13674c = this.f957b0.mo13674c(mo14537b)) == null) {
            setQuery(text);
        } else {
            setQuery(mo13674c);
        }
    }

    /* renamed from: b0 */
    public void m953b0(CharSequence charSequence, boolean z10) {
        this.f978w.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f978w;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f965j0 = charSequence;
        }
        if (!z10 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        m946U();
    }

    @Override // p162l.InterfaceC3392c
    /* renamed from: c */
    public void mo954c() {
        if (this.f966k0) {
            return;
        }
        this.f966k0 = true;
        int imeOptions = this.f978w.getImeOptions();
        this.f967l0 = imeOptions;
        this.f978w.setImeOptions(imeOptions | 33554432);
        this.f978w.setText("");
        setIconified(false);
    }

    /* renamed from: c0 */
    public final void m955c0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f978w.getText());
        if (!z11 && (!this.f955W || this.f966k0)) {
            z10 = false;
        }
        this.f935C.setVisibility(z10 ? 0 : 8);
        Drawable drawable = this.f935C.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f961f0 = true;
        super.clearFocus();
        this.f978w.clearFocus();
        this.f978w.setImeVisibility(false);
        this.f961f0 = false;
    }

    @Override // p162l.InterfaceC3392c
    /* renamed from: d */
    public void mo956d() {
        m953b0("", false);
        clearFocus();
        m962i0(true);
        this.f978w.setImeOptions(this.f967l0);
        this.f966k0 = false;
    }

    /* renamed from: d0 */
    public void m957d0() {
        int[] iArr = this.f978w.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f981y.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f982z.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: e0 */
    public final void m958e0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f978w;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m934H(queryHint));
    }

    /* renamed from: f0 */
    public final void m959f0() {
        this.f978w.setThreshold(this.f968m0.getSuggestThreshold());
        this.f978w.setImeOptions(this.f968m0.getImeOptions());
        int inputType = this.f968m0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f968m0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f978w.setInputType(inputType);
        AbstractC3825a abstractC3825a = this.f957b0;
        if (abstractC3825a != null) {
            abstractC3825a.mo13673a(null);
        }
        if (this.f968m0.getSuggestAuthority() != null) {
            ViewOnClickListenerC3655q0 viewOnClickListenerC3655q0 = new ViewOnClickListenerC3655q0(getContext(), this, this.f968m0, this.f972q0);
            this.f957b0 = viewOnClickListenerC3655q0;
            this.f978w.setAdapter(viewOnClickListenerC3655q0);
            ((ViewOnClickListenerC3655q0) this.f957b0).m13689x(this.f960e0 ? 2 : 1);
        }
    }

    /* renamed from: g0 */
    public final void m960g0() {
        this.f982z.setVisibility((m937L() && (this.f934B.getVisibility() == 0 || this.f936D.getVisibility() == 0)) ? 0 : 8);
    }

    public int getImeOptions() {
        return this.f978w.getImeOptions();
    }

    public int getInputType() {
        return this.f978w.getInputType();
    }

    public int getMaxWidth() {
        return this.f962g0;
    }

    public CharSequence getQuery() {
        return this.f978w.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f959d0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f968m0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f949Q : getContext().getText(this.f968m0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f946N;
    }

    public int getSuggestionRowLayout() {
        return this.f945M;
    }

    public AbstractC3825a getSuggestionsAdapter() {
        return this.f957b0;
    }

    /* renamed from: h0 */
    public final void m961h0(boolean z10) {
        this.f934B.setVisibility((this.f958c0 && m937L() && hasFocus() && (z10 || !this.f963h0)) ? 0 : 8);
    }

    /* renamed from: i0 */
    public final void m962i0(boolean z10) {
        this.f956a0 = z10;
        int i10 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f978w.getText());
        this.f933A.setVisibility(i10);
        m961h0(z11);
        this.f980x.setVisibility(z10 ? 8 : 0);
        this.f943K.setVisibility((this.f943K.getDrawable() == null || this.f955W) ? 8 : 0);
        m955c0();
        m963j0(!z11);
        m960g0();
    }

    /* renamed from: j0 */
    public final void m963j0(boolean z10) {
        int i10 = 8;
        if (this.f963h0 && !m936J() && z10) {
            this.f934B.setVisibility(8);
            i10 = 0;
        }
        this.f936D.setVisibility(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f970o0);
        post(this.f971p0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.C0241c, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            m933G(this.f978w, this.f939G);
            Rect rect = this.f940H;
            Rect rect2 = this.f939G;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            C0230q c0230q = this.f938F;
            if (c0230q != null) {
                c0230q.m979a(this.f940H, this.f939G);
                return;
            }
            C0230q c0230q2 = new C0230q(this.f940H, this.f939G, this.f978w);
            this.f938F = c0230q2;
            setTouchDelegate(c0230q2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (r0 <= 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    @Override // androidx.appcompat.widget.C0241c, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.m936J()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2c
            if (r0 == 0) goto L22
            if (r0 == r2) goto L1d
            goto L39
        L1d:
            int r0 = r3.f962g0
            if (r0 <= 0) goto L39
            goto L30
        L22:
            int r4 = r3.f962g0
            if (r4 <= 0) goto L27
            goto L39
        L27:
            int r4 = r3.getPreferredWidth()
            goto L39
        L2c:
            int r0 = r3.f962g0
            if (r0 <= 0) goto L31
        L30:
            goto L35
        L31:
            int r0 = r3.getPreferredWidth()
        L35:
            int r4 = java.lang.Math.min(r0, r4)
        L39:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L46
            goto L53
        L46:
            int r5 = r3.getPreferredHeight()
            goto L53
        L4b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L53:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0229p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0229p c0229p = (C0229p) parcelable;
        super.onRestoreInstanceState(c0229p.m15137a());
        m962i0(c0229p.f1001j);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0229p c0229p = new C0229p(super.onSaveInstanceState());
        c0229p.f1001j = m936J();
        return c0229p;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        m951Z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.f961f0 || !isFocusable()) {
            return false;
        }
        if (m936J()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f978w.requestFocus(i10, rect);
        if (requestFocus) {
            m962i0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f969n0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m941P();
        } else {
            m945T();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f955W == z10) {
            return;
        }
        this.f955W = z10;
        m962i0(z10);
        m958e0();
    }

    public void setImeOptions(int i10) {
        this.f978w.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f978w.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f962g0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(InterfaceC0225l interfaceC0225l) {
        this.f951S = interfaceC0225l;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f952T = onFocusChangeListener;
    }

    public void setOnQueryTextListener(InterfaceC0226m interfaceC0226m) {
        this.f950R = interfaceC0226m;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f954V = onClickListener;
    }

    public void setOnSuggestionListener(InterfaceC0227n interfaceC0227n) {
        this.f953U = interfaceC0227n;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f959d0 = charSequence;
        m958e0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.f960e0 = z10;
        AbstractC3825a abstractC3825a = this.f957b0;
        if (abstractC3825a instanceof ViewOnClickListenerC3655q0) {
            ((ViewOnClickListenerC3655q0) abstractC3825a).m13689x(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f968m0 = searchableInfo;
        if (searchableInfo != null) {
            m959f0();
            m958e0();
        }
        boolean m935I = m935I();
        this.f963h0 = m935I;
        if (m935I) {
            this.f978w.setPrivateImeOptions("nm");
        }
        m962i0(m936J());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f958c0 = z10;
        m962i0(m936J());
    }

    public void setSuggestionsAdapter(AbstractC3825a abstractC3825a) {
        this.f957b0 = abstractC3825a;
        this.f978w.setAdapter(abstractC3825a);
    }

    /* renamed from: z */
    public void m964z() {
        if (this.f937E.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f981y.getPaddingLeft();
            Rect rect = new Rect();
            boolean m13501b = C3630e1.m13501b(this);
            int dimensionPixelSize = this.f955W ? resources.getDimensionPixelSize(C1934d.f7368e) + resources.getDimensionPixelSize(C1934d.f7369f) : 0;
            this.f978w.getDropDownBackground().getPadding(rect);
            int i10 = rect.left;
            this.f978w.setDropDownHorizontalOffset(m13501b ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            this.f978w.setDropDownWidth((((this.f937E.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }
}
