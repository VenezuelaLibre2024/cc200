package p187n;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogC0184a;
import p089g.C1931a;
import p118i.C2572a;
import p148k0.C3308b0;
import p148k0.InterfaceC3343z;
import p175m.InterfaceC3490f;

/* renamed from: n.z */
/* loaded from: classes.dex */
public class C3672z extends Spinner implements InterfaceC3343z {

    /* renamed from: p */
    @SuppressLint({"ResourceType"})
    public static final int[] f13056p = {R.attr.spinnerMode};

    /* renamed from: h */
    public final C3625d f13057h;

    /* renamed from: i */
    public final Context f13058i;

    /* renamed from: j */
    public AbstractViewOnTouchListenerC3641j0 f13059j;

    /* renamed from: k */
    public SpinnerAdapter f13060k;

    /* renamed from: l */
    public final boolean f13061l;

    /* renamed from: m */
    public j f13062m;

    /* renamed from: n */
    public int f13063n;

    /* renamed from: o */
    public final Rect f13064o;

    /* renamed from: n.z$a */
    /* loaded from: classes.dex */
    public class a extends AbstractViewOnTouchListenerC3641j0 {

        /* renamed from: q */
        public final /* synthetic */ h f13065q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, h hVar) {
            super(view);
            this.f13065q = hVar;
        }

        @Override // p187n.AbstractViewOnTouchListenerC3641j0
        /* renamed from: b */
        public InterfaceC3490f mo697b() {
            return this.f13065q;
        }

        @Override // p187n.AbstractViewOnTouchListenerC3641j0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo698c() {
            if (C3672z.this.getInternalPopup().mo13752a()) {
                return true;
            }
            C3672z.this.m13745b();
            return true;
        }
    }

    /* renamed from: n.z$b */
    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C3672z.this.getInternalPopup().mo13752a()) {
                C3672z.this.m13745b();
            }
            ViewTreeObserver viewTreeObserver = C3672z.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    c.m13746a(viewTreeObserver, this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    /* renamed from: n.z$c */
    /* loaded from: classes.dex */
    public static final class c {
        /* renamed from: a */
        public static void m13746a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: n.z$d */
    /* loaded from: classes.dex */
    public static final class d {
        /* renamed from: a */
        public static int m13747a(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: b */
        public static int m13748b(View view) {
            return view.getTextDirection();
        }

        /* renamed from: c */
        public static void m13749c(View view, int i10) {
            view.setTextAlignment(i10);
        }

        /* renamed from: d */
        public static void m13750d(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* renamed from: n.z$e */
    /* loaded from: classes.dex */
    public static final class e {
        /* renamed from: a */
        public static void m13751a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* renamed from: n.z$f */
    /* loaded from: classes.dex */
    public class f implements j, DialogInterface.OnClickListener {

        /* renamed from: h */
        public DialogC0184a f13068h;

        /* renamed from: i */
        public ListAdapter f13069i;

        /* renamed from: j */
        public CharSequence f13070j;

        public f() {
        }

        @Override // p187n.C3672z.j
        /* renamed from: a */
        public boolean mo13752a() {
            DialogC0184a dialogC0184a = this.f13068h;
            if (dialogC0184a != null) {
                return dialogC0184a.isShowing();
            }
            return false;
        }

        @Override // p187n.C3672z.j
        public void dismiss() {
            DialogC0184a dialogC0184a = this.f13068h;
            if (dialogC0184a != null) {
                dialogC0184a.dismiss();
                this.f13068h = null;
            }
        }

        @Override // p187n.C3672z.j
        /* renamed from: e */
        public void mo13753e(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // p187n.C3672z.j
        /* renamed from: f */
        public int mo13754f() {
            return 0;
        }

        @Override // p187n.C3672z.j
        /* renamed from: g */
        public void mo13755g(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // p187n.C3672z.j
        /* renamed from: h */
        public CharSequence mo13756h() {
            return this.f13070j;
        }

        @Override // p187n.C3672z.j
        /* renamed from: i */
        public Drawable mo13757i() {
            return null;
        }

        @Override // p187n.C3672z.j
        /* renamed from: k */
        public void mo13758k(CharSequence charSequence) {
            this.f13070j = charSequence;
        }

        @Override // p187n.C3672z.j
        /* renamed from: l */
        public void mo13759l(int i10) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // p187n.C3672z.j
        /* renamed from: m */
        public void mo13760m(int i10) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // p187n.C3672z.j
        /* renamed from: n */
        public void mo13761n(int i10, int i11) {
            if (this.f13069i == null) {
                return;
            }
            DialogC0184a.a aVar = new DialogC0184a.a(C3672z.this.getPopupContext());
            CharSequence charSequence = this.f13070j;
            if (charSequence != null) {
                aVar.m689n(charSequence);
            }
            DialogC0184a m676a = aVar.m688m(this.f13069i, C3672z.this.getSelectedItemPosition(), this).m676a();
            this.f13068h = m676a;
            ListView m674i = m676a.m674i();
            if (Build.VERSION.SDK_INT >= 17) {
                d.m13750d(m674i, i10);
                d.m13749c(m674i, i11);
            }
            this.f13068h.show();
        }

        @Override // p187n.C3672z.j
        /* renamed from: o */
        public int mo13762o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            C3672z.this.setSelection(i10);
            if (C3672z.this.getOnItemClickListener() != null) {
                C3672z.this.performItemClick(null, i10, this.f13069i.getItemId(i10));
            }
            dismiss();
        }

        @Override // p187n.C3672z.j
        /* renamed from: p */
        public void mo13589p(ListAdapter listAdapter) {
            this.f13069i = listAdapter;
        }
    }

    /* renamed from: n.z$g */
    /* loaded from: classes.dex */
    public static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: h */
        public SpinnerAdapter f13072h;

        /* renamed from: i */
        public ListAdapter f13073i;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f13072h = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f13073i = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    e.m13751a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC3659s0) {
                    InterfaceC3659s0 interfaceC3659s0 = (InterfaceC3659s0) spinnerAdapter;
                    if (interfaceC3659s0.getDropDownViewTheme() == null) {
                        interfaceC3659s0.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f13073i;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f13072h;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f13072h;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.f13072h;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.f13072h;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i10);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i10) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f13072h;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.f13073i;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f13072h;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f13072h;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: n.z$h */
    /* loaded from: classes.dex */
    public class h extends C3643k0 implements j {

        /* renamed from: Q */
        public CharSequence f13074Q;

        /* renamed from: R */
        public ListAdapter f13075R;

        /* renamed from: S */
        public final Rect f13076S;

        /* renamed from: T */
        public int f13077T;

        /* renamed from: n.z$h$a */
        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {

            /* renamed from: h */
            public final /* synthetic */ C3672z f13079h;

            public a(C3672z c3672z) {
                this.f13079h = c3672z;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                C3672z.this.setSelection(i10);
                if (C3672z.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    C3672z.this.performItemClick(view, i10, hVar.f13075R.getItemId(i10));
                }
                h.this.dismiss();
            }
        }

        /* renamed from: n.z$h$b */
        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.m13766P(C3672z.this)) {
                    h.this.dismiss();
                } else {
                    h.this.m13764N();
                    h.super.show();
                }
            }
        }

        /* renamed from: n.z$h$c */
        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: h */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f13082h;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f13082h = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C3672z.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f13082h);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f13076S = new Rect();
            m13598y(C3672z.this);
            m13574E(true);
            m13579J(0);
            m13576G(new a(C3672z.this));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
        /* renamed from: N */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m13764N() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.m13586i()
                r1 = 0
                if (r0 == 0) goto L26
                n.z r1 = p187n.C3672z.this
                android.graphics.Rect r1 = r1.f13064o
                r0.getPadding(r1)
                n.z r0 = p187n.C3672z.this
                boolean r0 = p187n.C3630e1.m13501b(r0)
                if (r0 == 0) goto L1d
                n.z r0 = p187n.C3672z.this
                android.graphics.Rect r0 = r0.f13064o
                int r0 = r0.right
                goto L24
            L1d:
                n.z r0 = p187n.C3672z.this
                android.graphics.Rect r0 = r0.f13064o
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                n.z r0 = p187n.C3672z.this
                android.graphics.Rect r0 = r0.f13064o
                r0.right = r1
                r0.left = r1
            L2e:
                n.z r0 = p187n.C3672z.this
                int r0 = r0.getPaddingLeft()
                n.z r2 = p187n.C3672z.this
                int r2 = r2.getPaddingRight()
                n.z r3 = p187n.C3672z.this
                int r3 = r3.getWidth()
                n.z r4 = p187n.C3672z.this
                int r5 = r4.f13063n
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.f13075R
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.m13586i()
                int r4 = r4.m13744a(r5, r6)
                n.z r5 = p187n.C3672z.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                n.z r6 = p187n.C3672z.this
                android.graphics.Rect r6 = r6.f13064o
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.m13570A(r4)
                goto L85
            L82:
                r8.m13570A(r5)
            L85:
                n.z r4 = p187n.C3672z.this
                boolean r4 = p187n.C3630e1.m13501b(r4)
                if (r4 == 0) goto L9a
                int r3 = r3 - r2
                int r0 = r8.m13594u()
                int r3 = r3 - r0
                int r0 = r8.m13765O()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto La0
            L9a:
                int r2 = r8.m13765O()
                int r0 = r0 + r2
                int r1 = r1 + r0
            La0:
                r8.m13585g(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p187n.C3672z.h.m13764N():void");
        }

        /* renamed from: O */
        public int m13765O() {
            return this.f13077T;
        }

        /* renamed from: P */
        public boolean m13766P(View view) {
            return C3308b0.m11992F(view) && view.getGlobalVisibleRect(this.f13076S);
        }

        @Override // p187n.C3672z.j
        /* renamed from: h */
        public CharSequence mo13756h() {
            return this.f13074Q;
        }

        @Override // p187n.C3672z.j
        /* renamed from: k */
        public void mo13758k(CharSequence charSequence) {
            this.f13074Q = charSequence;
        }

        @Override // p187n.C3672z.j
        /* renamed from: m */
        public void mo13760m(int i10) {
            this.f13077T = i10;
        }

        @Override // p187n.C3672z.j
        /* renamed from: n */
        public void mo13761n(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean mo729a = mo729a();
            m13764N();
            m13573D(2);
            super.show();
            ListView mo731j = mo731j();
            mo731j.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                d.m13750d(mo731j, i10);
                d.m13749c(mo731j, i11);
            }
            m13580K(C3672z.this.getSelectedItemPosition());
            if (mo729a || (viewTreeObserver = C3672z.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m13575F(new c(bVar));
        }

        @Override // p187n.C3643k0, p187n.C3672z.j
        /* renamed from: p */
        public void mo13589p(ListAdapter listAdapter) {
            super.mo13589p(listAdapter);
            this.f13075R = listAdapter;
        }
    }

    /* renamed from: n.z$i */
    /* loaded from: classes.dex */
    public static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: h */
        public boolean f13084h;

        /* renamed from: n.z$i$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel) {
            super(parcel);
            this.f13084h = parcel.readByte() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f13084h ? (byte) 1 : (byte) 0);
        }
    }

    /* renamed from: n.z$j */
    /* loaded from: classes.dex */
    public interface j {
        /* renamed from: a */
        boolean mo13752a();

        void dismiss();

        /* renamed from: e */
        void mo13753e(Drawable drawable);

        /* renamed from: f */
        int mo13754f();

        /* renamed from: g */
        void mo13755g(int i10);

        /* renamed from: h */
        CharSequence mo13756h();

        /* renamed from: i */
        Drawable mo13757i();

        /* renamed from: k */
        void mo13758k(CharSequence charSequence);

        /* renamed from: l */
        void mo13759l(int i10);

        /* renamed from: m */
        void mo13760m(int i10);

        /* renamed from: n */
        void mo13761n(int i10, int i11);

        /* renamed from: o */
        int mo13762o();

        /* renamed from: p */
        void mo13589p(ListAdapter listAdapter);
    }

    public C3672z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1931a.f7325J);
    }

    public C3672z(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public C3672z(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, n.z, android.widget.Spinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3672z(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f13064o = r0
            android.content.Context r0 = r6.getContext()
            p187n.C3657r0.m13693a(r6, r0)
            int[] r0 = p089g.C1940j.f7731x2
            r1 = 0
            n.w0 r0 = p187n.C3667w0.m13717u(r7, r8, r0, r9, r1)
            n.d r2 = new n.d
            r2.<init>(r6)
            r6.f13057h = r2
            if (r11 == 0) goto L29
            l.d r2 = new l.d
            r2.<init>(r7, r11)
        L26:
            r6.f13058i = r2
            goto L39
        L29:
            int r11 = p089g.C1940j.f7516C2
            int r11 = r0.m13730m(r11, r1)
            if (r11 == 0) goto L37
            l.d r2 = new l.d
            r2.<init>(r7, r11)
            goto L26
        L37:
            r6.f13058i = r7
        L39:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L69
            int[] r11 = p187n.C3672z.f13056p     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch: java.lang.Throwable -> L53 java.lang.Exception -> L55
            boolean r3 = r11.hasValue(r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L61
            if (r3 == 0) goto L4d
            int r10 = r11.getInt(r1, r1)     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L61
        L4d:
            r11.recycle()
            goto L69
        L51:
            r3 = move-exception
            goto L57
        L53:
            r7 = move-exception
            goto L63
        L55:
            r3 = move-exception
            r11 = r2
        L57:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L61
            if (r11 == 0) goto L69
            goto L4d
        L61:
            r7 = move-exception
            r2 = r11
        L63:
            if (r2 == 0) goto L68
            r2.recycle()
        L68:
            throw r7
        L69:
            r11 = 1
            if (r10 == 0) goto La6
            if (r10 == r11) goto L6f
            goto Lb6
        L6f:
            n.z$h r10 = new n.z$h
            android.content.Context r3 = r6.f13058i
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f13058i
            int[] r4 = p089g.C1940j.f7731x2
            n.w0 r1 = p187n.C3667w0.m13717u(r3, r8, r4, r9, r1)
            int r3 = p089g.C1940j.f7511B2
            r4 = -2
            int r3 = r1.m13729l(r3, r4)
            r6.f13063n = r3
            int r3 = p089g.C1940j.f7741z2
            android.graphics.drawable.Drawable r3 = r1.m13723f(r3)
            r10.m13583e(r3)
            int r3 = p089g.C1940j.f7506A2
            java.lang.String r3 = r0.m13731n(r3)
            r10.mo13758k(r3)
            r1.m13736v()
            r6.f13062m = r10
            n.z$a r1 = new n.z$a
            r1.<init>(r6, r10)
            r6.f13059j = r1
            goto Lb6
        La6:
            n.z$f r10 = new n.z$f
            r10.<init>()
            r6.f13062m = r10
            int r1 = p089g.C1940j.f7506A2
            java.lang.String r1 = r0.m13731n(r1)
            r10.mo13758k(r1)
        Lb6:
            int r10 = p089g.C1940j.f7736y2
            java.lang.CharSequence[] r10 = r0.m13733p(r10)
            if (r10 == 0) goto Lce
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p089g.C1937g.f7485t
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Lce:
            r0.m13736v()
            r6.f13061l = r11
            android.widget.SpinnerAdapter r7 = r6.f13060k
            if (r7 == 0) goto Ldc
            r6.setAdapter(r7)
            r6.f13060k = r2
        Ldc:
            n.d r7 = r6.f13057h
            r7.m13455e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p187n.C3672z.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* renamed from: a */
    public int m13744a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.f13064o);
        Rect rect = this.f13064o;
        return i11 + rect.left + rect.right;
    }

    /* renamed from: b */
    public void m13745b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f13062m.mo13761n(d.m13748b(this), d.m13747a(this));
        } else {
            this.f13062m.mo13761n(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3625d c3625d = this.f13057h;
        if (c3625d != null) {
            c3625d.m13452b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f13062m;
        if (jVar != null) {
            return jVar.mo13754f();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f13062m;
        if (jVar != null) {
            return jVar.mo13762o();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f13062m != null) {
            return this.f13063n;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public final j getInternalPopup() {
        return this.f13062m;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f13062m;
        if (jVar != null) {
            return jVar.mo13757i();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f13058i;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f13062m;
        return jVar != null ? jVar.mo13756h() : super.getPrompt();
    }

    @Override // p148k0.InterfaceC3343z
    public ColorStateList getSupportBackgroundTintList() {
        C3625d c3625d = this.f13057h;
        if (c3625d != null) {
            return c3625d.m13453c();
        }
        return null;
    }

    @Override // p148k0.InterfaceC3343z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3625d c3625d = this.f13057h;
        if (c3625d != null) {
            return c3625d.m13454d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f13062m;
        if (jVar == null || !jVar.mo13752a()) {
            return;
        }
        this.f13062m.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f13062m == null || View.MeasureSpec.getMode(i10) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m13744a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.f13084h || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f13062m;
        iVar.f13084h = jVar != null && jVar.mo13752a();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC3641j0 abstractViewOnTouchListenerC3641j0 = this.f13059j;
        if (abstractViewOnTouchListenerC3641j0 == null || !abstractViewOnTouchListenerC3641j0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f13062m;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.mo13752a()) {
            return true;
        }
        m13745b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f13061l) {
            this.f13060k = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f13062m != null) {
            Context context = this.f13058i;
            if (context == null) {
                context = getContext();
            }
            this.f13062m.mo13589p(new g(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3625d c3625d = this.f13057h;
        if (c3625d != null) {
            c3625d.m13456f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3625d c3625d = this.f13057h;
        if (c3625d != null) {
            c3625d.m13457g(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i10) {
        j jVar = this.f13062m;
        if (jVar != null) {
            jVar.mo13760m(i10);
            this.f13062m.mo13755g(i10);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i10) {
        j jVar = this.f13062m;
        if (jVar != null) {
            jVar.mo13759l(i10);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i10) {
        if (this.f13062m != null) {
            this.f13063n = i10;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i10);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f13062m;
        if (jVar != null) {
            jVar.mo13753e(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i10) {
        setPopupBackgroundDrawable(C2572a.m10278b(getPopupContext(), i10));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f13062m;
        if (jVar != null) {
            jVar.mo13758k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3625d c3625d = this.f13057h;
        if (c3625d != null) {
            c3625d.m13459i(colorStateList);
        }
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3625d c3625d = this.f13057h;
        if (c3625d != null) {
            c3625d.m13460j(mode);
        }
    }
}
