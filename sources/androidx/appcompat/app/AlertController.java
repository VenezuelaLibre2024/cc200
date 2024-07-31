package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0241c;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p089g.C1931a;
import p089g.C1936f;
import p089g.C1940j;
import p101h.DialogC2265g;
import p148k0.C3308b0;

/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    public NestedScrollView f523A;

    /* renamed from: C */
    public Drawable f525C;

    /* renamed from: D */
    public ImageView f526D;

    /* renamed from: E */
    public TextView f527E;

    /* renamed from: F */
    public TextView f528F;

    /* renamed from: G */
    public View f529G;

    /* renamed from: H */
    public ListAdapter f530H;

    /* renamed from: J */
    public int f532J;

    /* renamed from: K */
    public int f533K;

    /* renamed from: L */
    public int f534L;

    /* renamed from: M */
    public int f535M;

    /* renamed from: N */
    public int f536N;

    /* renamed from: O */
    public int f537O;

    /* renamed from: P */
    public boolean f538P;

    /* renamed from: R */
    public Handler f540R;

    /* renamed from: a */
    public final Context f542a;

    /* renamed from: b */
    public final DialogC2265g f543b;

    /* renamed from: c */
    public final Window f544c;

    /* renamed from: d */
    public final int f545d;

    /* renamed from: e */
    public CharSequence f546e;

    /* renamed from: f */
    public CharSequence f547f;

    /* renamed from: g */
    public ListView f548g;

    /* renamed from: h */
    public View f549h;

    /* renamed from: i */
    public int f550i;

    /* renamed from: j */
    public int f551j;

    /* renamed from: k */
    public int f552k;

    /* renamed from: l */
    public int f553l;

    /* renamed from: m */
    public int f554m;

    /* renamed from: o */
    public Button f556o;

    /* renamed from: p */
    public CharSequence f557p;

    /* renamed from: q */
    public Message f558q;

    /* renamed from: r */
    public Drawable f559r;

    /* renamed from: s */
    public Button f560s;

    /* renamed from: t */
    public CharSequence f561t;

    /* renamed from: u */
    public Message f562u;

    /* renamed from: v */
    public Drawable f563v;

    /* renamed from: w */
    public Button f564w;

    /* renamed from: x */
    public CharSequence f565x;

    /* renamed from: y */
    public Message f566y;

    /* renamed from: z */
    public Drawable f567z;

    /* renamed from: n */
    public boolean f555n = false;

    /* renamed from: B */
    public int f524B = 0;

    /* renamed from: I */
    public int f531I = -1;

    /* renamed from: Q */
    public int f539Q = 0;

    /* renamed from: S */
    public final View.OnClickListener f541S = new ViewOnClickListenerC0176a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: h */
        public final int f568h;

        /* renamed from: i */
        public final int f569i;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1940j.f7626c2);
            this.f569i = obtainStyledAttributes.getDimensionPixelOffset(C1940j.f7631d2, -1);
            this.f568h = obtainStyledAttributes.getDimensionPixelOffset(C1940j.f7636e2, -1);
        }

        /* renamed from: a */
        public void m668a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f568h, getPaddingRight(), z11 ? getPaddingBottom() : this.f569i);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0176a implements View.OnClickListener {
        public ViewOnClickListenerC0176a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f556o || (message2 = alertController.f558q) == null) && (view != alertController.f560s || (message2 = alertController.f562u) == null)) ? (view != alertController.f564w || (message = alertController.f566y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f540R.obtainMessage(1, alertController2.f543b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public class C0177b implements NestedScrollView.InterfaceC0251c {

        /* renamed from: a */
        public final /* synthetic */ View f571a;

        /* renamed from: b */
        public final /* synthetic */ View f572b;

        public C0177b(View view, View view2) {
            this.f571a = view;
            this.f572b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC0251c
        /* renamed from: a */
        public void mo669a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.m643f(nestedScrollView, this.f571a, this.f572b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    public class RunnableC0178c implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ View f574h;

        /* renamed from: i */
        public final /* synthetic */ View f575i;

        public RunnableC0178c(View view, View view2) {
            this.f574h = view;
            this.f575i = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m643f(AlertController.this.f523A, this.f574h, this.f575i);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public class C0179d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ View f577a;

        /* renamed from: b */
        public final /* synthetic */ View f578b;

        public C0179d(View view, View view2) {
            this.f577a = view;
            this.f578b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.m643f(absListView, this.f577a, this.f578b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes.dex */
    public class RunnableC0180e implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ View f580h;

        /* renamed from: i */
        public final /* synthetic */ View f581i;

        public RunnableC0180e(View view, View view2) {
            this.f580h = view;
            this.f581i = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m643f(AlertController.this.f548g, this.f580h, this.f581i);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes.dex */
    public static class C0181f {

        /* renamed from: A */
        public int f583A;

        /* renamed from: B */
        public int f584B;

        /* renamed from: C */
        public int f585C;

        /* renamed from: D */
        public int f586D;

        /* renamed from: F */
        public boolean[] f588F;

        /* renamed from: G */
        public boolean f589G;

        /* renamed from: H */
        public boolean f590H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f592J;

        /* renamed from: K */
        public Cursor f593K;

        /* renamed from: L */
        public String f594L;

        /* renamed from: M */
        public String f595M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f596N;

        /* renamed from: O */
        public e f597O;

        /* renamed from: a */
        public final Context f599a;

        /* renamed from: b */
        public final LayoutInflater f600b;

        /* renamed from: d */
        public Drawable f602d;

        /* renamed from: f */
        public CharSequence f604f;

        /* renamed from: g */
        public View f605g;

        /* renamed from: h */
        public CharSequence f606h;

        /* renamed from: i */
        public CharSequence f607i;

        /* renamed from: j */
        public Drawable f608j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f609k;

        /* renamed from: l */
        public CharSequence f610l;

        /* renamed from: m */
        public Drawable f611m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f612n;

        /* renamed from: o */
        public CharSequence f613o;

        /* renamed from: p */
        public Drawable f614p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f615q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f617s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f618t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f619u;

        /* renamed from: v */
        public CharSequence[] f620v;

        /* renamed from: w */
        public ListAdapter f621w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f622x;

        /* renamed from: y */
        public int f623y;

        /* renamed from: z */
        public View f624z;

        /* renamed from: c */
        public int f601c = 0;

        /* renamed from: e */
        public int f603e = 0;

        /* renamed from: E */
        public boolean f587E = false;

        /* renamed from: I */
        public int f591I = -1;

        /* renamed from: P */
        public boolean f598P = true;

        /* renamed from: r */
        public boolean f616r = true;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: h */
            public final /* synthetic */ RecycleListView f625h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f625h = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = C0181f.this.f588F;
                if (zArr != null && zArr[i10]) {
                    this.f625h.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: h */
            public final int f627h;

            /* renamed from: i */
            public final int f628i;

            /* renamed from: j */
            public final /* synthetic */ RecycleListView f629j;

            /* renamed from: k */
            public final /* synthetic */ AlertController f630k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f629j = recycleListView;
                this.f630k = alertController;
                Cursor cursor2 = getCursor();
                this.f627h = cursor2.getColumnIndexOrThrow(C0181f.this.f594L);
                this.f628i = cursor2.getColumnIndexOrThrow(C0181f.this.f595M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f627h));
                this.f629j.setItemChecked(cursor.getPosition(), cursor.getInt(this.f628i) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0181f.this.f600b.inflate(this.f630k.f535M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: h */
            public final /* synthetic */ AlertController f632h;

            public c(AlertController alertController) {
                this.f632h = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                C0181f.this.f622x.onClick(this.f632h.f543b, i10);
                if (C0181f.this.f590H) {
                    return;
                }
                this.f632h.f543b.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: h */
            public final /* synthetic */ RecycleListView f634h;

            /* renamed from: i */
            public final /* synthetic */ AlertController f635i;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.f634h = recycleListView;
                this.f635i = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = C0181f.this.f588F;
                if (zArr != null) {
                    zArr[i10] = this.f634h.isItemChecked(i10);
                }
                C0181f.this.f592J.onClick(this.f635i.f543b, i10, this.f634h.isItemChecked(i10));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        /* loaded from: classes.dex */
        public interface e {
            /* renamed from: a */
            void m672a(ListView listView);
        }

        public C0181f(Context context) {
            this.f599a = context;
            this.f600b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void m670a(AlertController alertController) {
            View view = this.f605g;
            if (view != null) {
                alertController.m654l(view);
            } else {
                CharSequence charSequence = this.f604f;
                if (charSequence != null) {
                    alertController.m659q(charSequence);
                }
                Drawable drawable = this.f602d;
                if (drawable != null) {
                    alertController.m656n(drawable);
                }
                int i10 = this.f601c;
                if (i10 != 0) {
                    alertController.m655m(i10);
                }
                int i11 = this.f603e;
                if (i11 != 0) {
                    alertController.m655m(alertController.m646c(i11));
                }
            }
            CharSequence charSequence2 = this.f606h;
            if (charSequence2 != null) {
                alertController.m657o(charSequence2);
            }
            CharSequence charSequence3 = this.f607i;
            if (charSequence3 != null || this.f608j != null) {
                alertController.m653k(-1, charSequence3, this.f609k, null, this.f608j);
            }
            CharSequence charSequence4 = this.f610l;
            if (charSequence4 != null || this.f611m != null) {
                alertController.m653k(-2, charSequence4, this.f612n, null, this.f611m);
            }
            CharSequence charSequence5 = this.f613o;
            if (charSequence5 != null || this.f614p != null) {
                alertController.m653k(-3, charSequence5, this.f615q, null, this.f614p);
            }
            if (this.f620v != null || this.f593K != null || this.f621w != null) {
                m671b(alertController);
            }
            View view2 = this.f624z;
            if (view2 != null) {
                if (this.f587E) {
                    alertController.m662t(view2, this.f583A, this.f584B, this.f585C, this.f586D);
                    return;
                } else {
                    alertController.m661s(view2);
                    return;
                }
            }
            int i12 = this.f623y;
            if (i12 != 0) {
                alertController.m660r(i12);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m671b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f600b
                int r1 = r11.f534L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f589G
                r8 = 1
                if (r1 == 0) goto L35
                android.database.Cursor r1 = r10.f593K
                if (r1 != 0) goto L26
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f599a
                int r4 = r11.f535M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f620v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L26:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f599a
                android.database.Cursor r4 = r10.f593K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L35:
                boolean r1 = r10.f590H
                if (r1 == 0) goto L3c
                int r1 = r11.f536N
                goto L3e
            L3c:
                int r1 = r11.f537O
            L3e:
                r4 = r1
                android.database.Cursor r1 = r10.f593K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L5d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f599a
                android.database.Cursor r5 = r10.f593K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f594L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L6b
            L5d:
                android.widget.ListAdapter r9 = r10.f621w
                if (r9 == 0) goto L62
                goto L6b
            L62:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f599a
                java.lang.CharSequence[] r3 = r10.f620v
                r9.<init>(r1, r4, r2, r3)
            L6b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f597O
                if (r1 == 0) goto L72
                r1.m672a(r0)
            L72:
                r11.f530H = r9
                int r1 = r10.f591I
                r11.f531I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f622x
                if (r1 == 0) goto L85
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L81:
                r0.setOnItemClickListener(r1)
                goto L8f
            L85:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f592J
                if (r1 == 0) goto L8f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L81
            L8f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f596N
                if (r1 == 0) goto L96
                r0.setOnItemSelectedListener(r1)
            L96:
                boolean r1 = r10.f590H
                if (r1 == 0) goto L9e
                r0.setChoiceMode(r8)
                goto La6
            L9e:
                boolean r1 = r10.f589G
                if (r1 == 0) goto La6
                r1 = 2
                r0.setChoiceMode(r1)
            La6:
                r11.f548g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0181f.m671b(androidx.appcompat.app.AlertController):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes.dex */
    public static final class HandlerC0182g extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f637a;

        public HandlerC0182g(DialogInterface dialogInterface) {
            this.f637a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f637a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    /* loaded from: classes.dex */
    public static class C0183h extends ArrayAdapter<CharSequence> {
        public C0183h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC2265g dialogC2265g, Window window) {
        this.f542a = context;
        this.f543b = dialogC2265g;
        this.f544c = window;
        this.f540R = new HandlerC0182g(dialogC2265g);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C1940j.f7528F, C1931a.f7342n, 0);
        this.f532J = obtainStyledAttributes.getResourceId(C1940j.f7533G, 0);
        this.f533K = obtainStyledAttributes.getResourceId(C1940j.f7541I, 0);
        this.f534L = obtainStyledAttributes.getResourceId(C1940j.f7549K, 0);
        this.f535M = obtainStyledAttributes.getResourceId(C1940j.f7553L, 0);
        this.f536N = obtainStyledAttributes.getResourceId(C1940j.f7561N, 0);
        this.f537O = obtainStyledAttributes.getResourceId(C1940j.f7545J, 0);
        this.f538P = obtainStyledAttributes.getBoolean(C1940j.f7557M, true);
        this.f545d = obtainStyledAttributes.getDimensionPixelSize(C1940j.f7537H, 0);
        obtainStyledAttributes.recycle();
        dialogC2265g.m9153h(1);
    }

    /* renamed from: a */
    public static boolean m642a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m642a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static void m643f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: z */
    public static boolean m644z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C1931a.f7341m, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: b */
    public final void m645b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public int m646c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f542a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView m647d() {
        return this.f548g;
    }

    /* renamed from: e */
    public void m648e() {
        this.f543b.setContentView(m652j());
        m667y();
    }

    /* renamed from: g */
    public boolean m649g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f523A;
        return nestedScrollView != null && nestedScrollView.m1192m(keyEvent);
    }

    /* renamed from: h */
    public boolean m650h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f523A;
        return nestedScrollView != null && nestedScrollView.m1192m(keyEvent);
    }

    /* renamed from: i */
    public final ViewGroup m651i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    public final int m652j() {
        int i10 = this.f533K;
        return (i10 != 0 && this.f539Q == 1) ? i10 : this.f532J;
    }

    /* renamed from: k */
    public void m653k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f540R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f565x = charSequence;
            this.f566y = message;
            this.f567z = drawable;
        } else if (i10 == -2) {
            this.f561t = charSequence;
            this.f562u = message;
            this.f563v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f557p = charSequence;
            this.f558q = message;
            this.f559r = drawable;
        }
    }

    /* renamed from: l */
    public void m654l(View view) {
        this.f529G = view;
    }

    /* renamed from: m */
    public void m655m(int i10) {
        this.f525C = null;
        this.f524B = i10;
        ImageView imageView = this.f526D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f526D.setImageResource(this.f524B);
            }
        }
    }

    /* renamed from: n */
    public void m656n(Drawable drawable) {
        this.f525C = drawable;
        this.f524B = 0;
        ImageView imageView = this.f526D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f526D.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: o */
    public void m657o(CharSequence charSequence) {
        this.f547f = charSequence;
        TextView textView = this.f528F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: p */
    public final void m658p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f544c.findViewById(C1936f.f7461v);
        View findViewById2 = this.f544c.findViewById(C1936f.f7460u);
        if (Build.VERSION.SDK_INT >= 23) {
            C3308b0.m12030i0(view, i10, i11);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i10 & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i10 & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById == null && findViewById2 == null) {
                return;
            }
            if (this.f547f != null) {
                this.f523A.setOnScrollChangeListener(new C0177b(findViewById, findViewById2));
                this.f523A.post(new RunnableC0178c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f548g;
            if (listView != null) {
                listView.setOnScrollListener(new C0179d(findViewById, findViewById2));
                this.f548g.post(new RunnableC0180e(findViewById, findViewById2));
                return;
            } else {
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (findViewById2 == null) {
                    return;
                }
            }
        }
        viewGroup.removeView(findViewById2);
    }

    /* renamed from: q */
    public void m659q(CharSequence charSequence) {
        this.f546e = charSequence;
        TextView textView = this.f527E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void m660r(int i10) {
        this.f549h = null;
        this.f550i = i10;
        this.f555n = false;
    }

    /* renamed from: s */
    public void m661s(View view) {
        this.f549h = view;
        this.f550i = 0;
        this.f555n = false;
    }

    /* renamed from: t */
    public void m662t(View view, int i10, int i11, int i12, int i13) {
        this.f549h = view;
        this.f550i = 0;
        this.f555n = true;
        this.f551j = i10;
        this.f552k = i11;
        this.f553l = i12;
        this.f554m = i13;
    }

    /* renamed from: u */
    public final void m663u(ViewGroup viewGroup) {
        int i10;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(R.id.button1);
        this.f556o = button2;
        button2.setOnClickListener(this.f541S);
        if (TextUtils.isEmpty(this.f557p) && this.f559r == null) {
            this.f556o.setVisibility(8);
            i10 = 0;
        } else {
            this.f556o.setText(this.f557p);
            Drawable drawable = this.f559r;
            if (drawable != null) {
                int i11 = this.f545d;
                drawable.setBounds(0, 0, i11, i11);
                this.f556o.setCompoundDrawables(this.f559r, null, null, null);
            }
            this.f556o.setVisibility(0);
            i10 = 1;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button2);
        this.f560s = button3;
        button3.setOnClickListener(this.f541S);
        if (TextUtils.isEmpty(this.f561t) && this.f563v == null) {
            this.f560s.setVisibility(8);
        } else {
            this.f560s.setText(this.f561t);
            Drawable drawable2 = this.f563v;
            if (drawable2 != null) {
                int i12 = this.f545d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f560s.setCompoundDrawables(this.f563v, null, null, null);
            }
            this.f560s.setVisibility(0);
            i10 |= 2;
        }
        Button button4 = (Button) viewGroup.findViewById(R.id.button3);
        this.f564w = button4;
        button4.setOnClickListener(this.f541S);
        if (TextUtils.isEmpty(this.f565x) && this.f567z == null) {
            this.f564w.setVisibility(8);
        } else {
            this.f564w.setText(this.f565x);
            Drawable drawable3 = this.f567z;
            if (drawable3 != null) {
                int i13 = this.f545d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f564w.setCompoundDrawables(this.f567z, null, null, null);
            }
            this.f564w.setVisibility(0);
            i10 |= 4;
        }
        if (m644z(this.f542a)) {
            if (i10 == 1) {
                button = this.f556o;
            } else if (i10 == 2) {
                button = this.f560s;
            } else if (i10 == 4) {
                button = this.f564w;
            }
            m645b(button);
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: v */
    public final void m664v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f544c.findViewById(C1936f.f7462w);
        this.f523A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f523A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f528F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f547f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f523A.removeView(this.f528F);
        if (this.f548g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f523A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f523A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f548g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: w */
    public final void m665w(ViewGroup viewGroup) {
        View view = this.f549h;
        if (view == null) {
            view = this.f550i != 0 ? LayoutInflater.from(this.f542a).inflate(this.f550i, viewGroup, false) : null;
        }
        boolean z10 = view != null;
        if (!z10 || !m642a(view)) {
            this.f544c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f544c.findViewById(C1936f.f7453n);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f555n) {
            frameLayout.setPadding(this.f551j, this.f552k, this.f553l, this.f554m);
        }
        if (this.f548g != null) {
            ((LinearLayout.LayoutParams) ((C0241c.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    /* renamed from: x */
    public final void m666x(ViewGroup viewGroup) {
        if (this.f529G != null) {
            viewGroup.addView(this.f529G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f544c.findViewById(C1936f.f7438O).setVisibility(8);
            return;
        }
        this.f526D = (ImageView) this.f544c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f546e)) || !this.f538P) {
            this.f544c.findViewById(C1936f.f7438O).setVisibility(8);
            this.f526D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f544c.findViewById(C1936f.f7449j);
        this.f527E = textView;
        textView.setText(this.f546e);
        int i10 = this.f524B;
        if (i10 != 0) {
            this.f526D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f525C;
        if (drawable != null) {
            this.f526D.setImageDrawable(drawable);
        } else {
            this.f527E.setPadding(this.f526D.getPaddingLeft(), this.f526D.getPaddingTop(), this.f526D.getPaddingRight(), this.f526D.getPaddingBottom());
            this.f526D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final void m667y() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f544c.findViewById(C1936f.f7459t);
        int i10 = C1936f.f7439P;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = C1936f.f7452m;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = C1936f.f7450k;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C1936f.f7454o);
        m665w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup m651i = m651i(findViewById7, findViewById4);
        ViewGroup m651i2 = m651i(findViewById8, findViewById5);
        ViewGroup m651i3 = m651i(findViewById9, findViewById6);
        m664v(m651i2);
        m663u(m651i3);
        m666x(m651i);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (m651i == null || m651i.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (m651i3 == null || m651i3.getVisibility() == 8) ? false : true;
        if (!z12 && m651i2 != null && (findViewById2 = m651i2.findViewById(C1936f.f7434K)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f523A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View findViewById10 = (this.f547f == null && this.f548g == null) ? null : m651i.findViewById(C1936f.f7437N);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (m651i2 != null && (findViewById = m651i2.findViewById(C1936f.f7435L)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f548g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m668a(z11, z12);
        }
        if (!z10) {
            View view = this.f548g;
            if (view == null) {
                view = this.f523A;
            }
            if (view != null) {
                m658p(m651i2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f548g;
        if (listView2 == null || (listAdapter = this.f530H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.f531I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }
}
