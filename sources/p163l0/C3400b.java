package p163l0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p090g0.C1941a;
import p163l0.InterfaceC3403e;
import p313w.C5186e;

/* renamed from: l0.b */
/* loaded from: classes.dex */
public class C3400b {

    /* renamed from: d */
    public static int f11904d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f11905a;

    /* renamed from: b */
    public int f11906b = -1;

    /* renamed from: c */
    public int f11907c = -1;

    /* renamed from: l0.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: A */
        public static final a f11908A;

        /* renamed from: B */
        public static final a f11909B;

        /* renamed from: C */
        public static final a f11910C;

        /* renamed from: D */
        public static final a f11911D;

        /* renamed from: E */
        public static final a f11912E;

        /* renamed from: F */
        public static final a f11913F;

        /* renamed from: G */
        public static final a f11914G;

        /* renamed from: H */
        public static final a f11915H;

        /* renamed from: I */
        public static final a f11916I;

        /* renamed from: J */
        public static final a f11917J;

        /* renamed from: K */
        public static final a f11918K;

        /* renamed from: L */
        public static final a f11919L;

        /* renamed from: M */
        public static final a f11920M;

        /* renamed from: N */
        public static final a f11921N;

        /* renamed from: O */
        public static final a f11922O;

        /* renamed from: P */
        public static final a f11923P;

        /* renamed from: Q */
        public static final a f11924Q;

        /* renamed from: R */
        public static final a f11925R;

        /* renamed from: S */
        public static final a f11926S;

        /* renamed from: T */
        public static final a f11927T;

        /* renamed from: U */
        public static final a f11928U;

        /* renamed from: e */
        public static final a f11929e = new a(1, null);

        /* renamed from: f */
        public static final a f11930f = new a(2, null);

        /* renamed from: g */
        public static final a f11931g = new a(4, null);

        /* renamed from: h */
        public static final a f11932h = new a(8, null);

        /* renamed from: i */
        public static final a f11933i = new a(16, null);

        /* renamed from: j */
        public static final a f11934j = new a(32, null);

        /* renamed from: k */
        public static final a f11935k = new a(64, null);

        /* renamed from: l */
        public static final a f11936l = new a(128, null);

        /* renamed from: m */
        public static final a f11937m = new a(256, null, InterfaceC3403e.b.class);

        /* renamed from: n */
        public static final a f11938n = new a(512, null, InterfaceC3403e.b.class);

        /* renamed from: o */
        public static final a f11939o = new a(1024, null, InterfaceC3403e.c.class);

        /* renamed from: p */
        public static final a f11940p = new a(2048, null, InterfaceC3403e.c.class);

        /* renamed from: q */
        public static final a f11941q = new a(4096, null);

        /* renamed from: r */
        public static final a f11942r = new a(8192, null);

        /* renamed from: s */
        public static final a f11943s = new a(16384, null);

        /* renamed from: t */
        public static final a f11944t = new a(32768, null);

        /* renamed from: u */
        public static final a f11945u = new a(65536, null);

        /* renamed from: v */
        public static final a f11946v = new a(131072, null, InterfaceC3403e.g.class);

        /* renamed from: w */
        public static final a f11947w = new a(262144, null);

        /* renamed from: x */
        public static final a f11948x = new a(524288, null);

        /* renamed from: y */
        public static final a f11949y = new a(1048576, null);

        /* renamed from: z */
        public static final a f11950z = new a(2097152, null, InterfaceC3403e.h.class);

        /* renamed from: a */
        public final Object f11951a;

        /* renamed from: b */
        public final int f11952b;

        /* renamed from: c */
        public final Class<? extends InterfaceC3403e.a> f11953c;

        /* renamed from: d */
        public final InterfaceC3403e f11954d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f11908A = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            f11909B = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC3403e.e.class);
            f11910C = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            f11911D = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            f11912E = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            f11913F = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            f11914G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f11915H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f11916I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f11917J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f11918K = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            f11919L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, InterfaceC3403e.f.class);
            f11920M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, InterfaceC3403e.d.class);
            f11921N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f11922O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f11923P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f11924Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f11925R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.ALT, null, null, null);
            f11926S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.CTRL, null, null, null);
            f11927T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.FUNCTION, null, null, null);
            f11928U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.KEYCODE_0, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a(int i10, CharSequence charSequence, Class<? extends InterfaceC3403e.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(Object obj, int i10, CharSequence charSequence, InterfaceC3403e interfaceC3403e, Class<? extends InterfaceC3403e.a> cls) {
            this.f11952b = i10;
            this.f11954d = interfaceC3403e;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            }
            this.f11951a = obj;
            this.f11953c = cls;
        }

        /* renamed from: a */
        public int m12688a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f11951a).getId();
            }
            return 0;
        }

        /* renamed from: b */
        public CharSequence m12689b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f11951a).getLabel();
            }
            return null;
        }

        /* renamed from: c */
        public boolean m12690c(View view, Bundle bundle) {
            if (this.f11954d == null) {
                return false;
            }
            InterfaceC3403e.a aVar = null;
            Class<? extends InterfaceC3403e.a> cls = this.f11953c;
            if (cls != null) {
                try {
                    InterfaceC3403e.a newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        newInstance.m12700a(bundle);
                        aVar = newInstance;
                    } catch (Exception e10) {
                        e = e10;
                        aVar = newInstance;
                        Class<? extends InterfaceC3403e.a> cls2 = this.f11953c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                        return this.f11954d.m12699a(view, aVar);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
            return this.f11954d.m12699a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f11951a;
            Object obj3 = ((a) obj).f11951a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f11951a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String m12646g = C3400b.m12646g(this.f11952b);
            if (m12646g.equals("ACTION_UNKNOWN") && m12689b() != null) {
                m12646g = m12689b().toString();
            }
            sb2.append(m12646g);
            return sb2.toString();
        }
    }

    /* renamed from: l0.b$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static Bundle m12691a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    public C3400b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f11905a = accessibilityNodeInfo;
    }

    /* renamed from: Q */
    public static C3400b m12645Q(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C3400b(accessibilityNodeInfo);
    }

    /* renamed from: g */
    public static String m12646g(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return "ACTION_LONG_CLICK";
            case C1417R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.ALT:
                                        return "ACTION_DRAG_START";
                                    case R.id.CTRL:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.FUNCTION:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* renamed from: l */
    public static ClickableSpan[] m12647l(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: A */
    public boolean m12648A() {
        return this.f11905a.isFocusable();
    }

    /* renamed from: B */
    public boolean m12649B() {
        return this.f11905a.isFocused();
    }

    /* renamed from: C */
    public boolean m12650C() {
        return this.f11905a.isLongClickable();
    }

    /* renamed from: D */
    public boolean m12651D() {
        return this.f11905a.isPassword();
    }

    /* renamed from: E */
    public boolean m12652E() {
        return this.f11905a.isScrollable();
    }

    /* renamed from: F */
    public boolean m12653F() {
        return this.f11905a.isSelected();
    }

    /* renamed from: G */
    public boolean m12654G(int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f11905a.performAction(i10, bundle);
        }
        return false;
    }

    /* renamed from: H */
    public final void m12655H(View view) {
        SparseArray<WeakReference<ClickableSpan>> m12678q = m12678q(view);
        if (m12678q != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < m12678q.size(); i10++) {
                if (m12678q.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                m12678q.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    /* renamed from: I */
    public final void m12656I(int i10, boolean z10) {
        Bundle m12675n = m12675n();
        if (m12675n != null) {
            int i11 = m12675n.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            m12675n.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    /* renamed from: J */
    public void m12657J(CharSequence charSequence) {
        this.f11905a.setClassName(charSequence);
    }

    /* renamed from: K */
    public void m12658K(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11905a.setHeading(z10);
        } else {
            m12656I(2, z10);
        }
    }

    /* renamed from: L */
    public void m12659L(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f11905a.setPaneTitle(charSequence);
        } else if (i10 >= 19) {
            b.m12691a(this.f11905a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: M */
    public void m12660M(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f11905a.setScreenReaderFocusable(z10);
        } else {
            m12656I(1, z10);
        }
    }

    /* renamed from: N */
    public void m12661N(boolean z10) {
        this.f11905a.setScrollable(z10);
    }

    /* renamed from: O */
    public void m12662O(CharSequence charSequence) {
        if (C1941a.m7846b()) {
            this.f11905a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            b.m12691a(this.f11905a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: P */
    public AccessibilityNodeInfo m12663P() {
        return this.f11905a;
    }

    /* renamed from: a */
    public void m12664a(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f11905a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f11951a);
        }
    }

    /* renamed from: b */
    public final void m12665b(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        m12668e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m12668e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m12668e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m12668e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    /* renamed from: c */
    public void m12666c(CharSequence charSequence, View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 19 || i10 >= 26) {
            return;
        }
        m12667d();
        m12655H(view);
        ClickableSpan[] m12647l = m12647l(charSequence);
        if (m12647l == null || m12647l.length <= 0) {
            return;
        }
        m12675n().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C5186e.f19619a);
        SparseArray<WeakReference<ClickableSpan>> m12676o = m12676o(view);
        for (int i11 = 0; i11 < m12647l.length; i11++) {
            int m12683v = m12683v(m12647l[i11], m12676o);
            m12676o.put(m12683v, new WeakReference<>(m12647l[i11]));
            m12665b(m12647l[i11], (Spanned) charSequence, m12683v);
        }
    }

    /* renamed from: d */
    public final void m12667d() {
        if (Build.VERSION.SDK_INT >= 19) {
            b.m12691a(this.f11905a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            b.m12691a(this.f11905a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            b.m12691a(this.f11905a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            b.m12691a(this.f11905a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: e */
    public final List<Integer> m12668e(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = b.m12691a(this.f11905a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        b.m12691a(this.f11905a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3400b)) {
            return false;
        }
        C3400b c3400b = (C3400b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f11905a;
        if (accessibilityNodeInfo == null) {
            if (c3400b.f11905a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c3400b.f11905a)) {
            return false;
        }
        return this.f11907c == c3400b.f11907c && this.f11906b == c3400b.f11906b;
    }

    /* renamed from: f */
    public List<a> m12669f() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f11905a.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    @Deprecated
    /* renamed from: h */
    public int m12670h() {
        return this.f11905a.getActions();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f11905a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public void m12671i(Rect rect) {
        this.f11905a.getBoundsInParent(rect);
    }

    /* renamed from: j */
    public void m12672j(Rect rect) {
        this.f11905a.getBoundsInScreen(rect);
    }

    /* renamed from: k */
    public CharSequence m12673k() {
        return this.f11905a.getClassName();
    }

    /* renamed from: m */
    public CharSequence m12674m() {
        return this.f11905a.getContentDescription();
    }

    /* renamed from: n */
    public Bundle m12675n() {
        return Build.VERSION.SDK_INT >= 19 ? b.m12691a(this.f11905a) : new Bundle();
    }

    /* renamed from: o */
    public final SparseArray<WeakReference<ClickableSpan>> m12676o(View view) {
        SparseArray<WeakReference<ClickableSpan>> m12678q = m12678q(view);
        if (m12678q != null) {
            return m12678q;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C5186e.f19616X, sparseArray);
        return sparseArray;
    }

    /* renamed from: p */
    public CharSequence m12677p() {
        return this.f11905a.getPackageName();
    }

    /* renamed from: q */
    public final SparseArray<WeakReference<ClickableSpan>> m12678q(View view) {
        return (SparseArray) view.getTag(C5186e.f19616X);
    }

    /* renamed from: r */
    public CharSequence m12679r() {
        if (!m12682u()) {
            return this.f11905a.getText();
        }
        List<Integer> m12668e = m12668e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> m12668e2 = m12668e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> m12668e3 = m12668e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> m12668e4 = m12668e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f11905a.getText(), 0, this.f11905a.getText().length()));
        for (int i10 = 0; i10 < m12668e.size(); i10++) {
            spannableString.setSpan(new C3399a(m12668e4.get(i10).intValue(), this, m12675n().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m12668e.get(i10).intValue(), m12668e2.get(i10).intValue(), m12668e3.get(i10).intValue());
        }
        return spannableString;
    }

    /* renamed from: s */
    public String m12680s() {
        if (C1941a.m7848d()) {
            return this.f11905a.getUniqueId();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return b.m12691a(this.f11905a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        return null;
    }

    /* renamed from: t */
    public String m12681t() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f11905a.getViewIdResourceName();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m12671i(rect);
        sb2.append("; boundsInParent: " + rect);
        m12672j(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(m12677p());
        sb2.append("; className: ");
        sb2.append(m12673k());
        sb2.append("; text: ");
        sb2.append(m12679r());
        sb2.append("; contentDescription: ");
        sb2.append(m12674m());
        sb2.append("; viewId: ");
        sb2.append(m12681t());
        sb2.append("; uniqueId: ");
        sb2.append(m12680s());
        sb2.append("; checkable: ");
        sb2.append(m12684w());
        sb2.append("; checked: ");
        sb2.append(m12685x());
        sb2.append("; focusable: ");
        sb2.append(m12648A());
        sb2.append("; focused: ");
        sb2.append(m12649B());
        sb2.append("; selected: ");
        sb2.append(m12653F());
        sb2.append("; clickable: ");
        sb2.append(m12686y());
        sb2.append("; longClickable: ");
        sb2.append(m12650C());
        sb2.append("; enabled: ");
        sb2.append(m12687z());
        sb2.append("; password: ");
        sb2.append(m12651D());
        sb2.append("; scrollable: " + m12652E());
        sb2.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> m12669f = m12669f();
            for (int i10 = 0; i10 < m12669f.size(); i10++) {
                a aVar = m12669f.get(i10);
                String m12646g = m12646g(aVar.m12688a());
                if (m12646g.equals("ACTION_UNKNOWN") && aVar.m12689b() != null) {
                    m12646g = aVar.m12689b().toString();
                }
                sb2.append(m12646g);
                if (i10 != m12669f.size() - 1) {
                    sb2.append(", ");
                }
            }
        } else {
            int m12670h = m12670h();
            while (m12670h != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(m12670h);
                m12670h &= ~numberOfTrailingZeros;
                sb2.append(m12646g(numberOfTrailingZeros));
                if (m12670h != 0) {
                    sb2.append(", ");
                }
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: u */
    public final boolean m12682u() {
        return !m12668e("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: v */
    public final int m12683v(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f11904d;
        f11904d = i11 + 1;
        return i11;
    }

    /* renamed from: w */
    public boolean m12684w() {
        return this.f11905a.isCheckable();
    }

    /* renamed from: x */
    public boolean m12685x() {
        return this.f11905a.isChecked();
    }

    /* renamed from: y */
    public boolean m12686y() {
        return this.f11905a.isClickable();
    }

    /* renamed from: z */
    public boolean m12687z() {
        return this.f11905a.isEnabled();
    }
}
