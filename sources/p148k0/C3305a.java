package p148k0;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p163l0.C3400b;
import p163l0.C3401c;
import p313w.C5186e;

/* renamed from: k0.a */
/* loaded from: classes.dex */
public class C3305a {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f11526c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f11527a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f11528b;

    /* renamed from: k0.a$a */
    /* loaded from: classes.dex */
    public static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C3305a f11529a;

        public a(C3305a c3305a) {
            this.f11529a = c3305a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f11529a.m11965a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C3401c m11966b = this.f11529a.m11966b(view);
            if (m11966b != null) {
                return (AccessibilityNodeProvider) m11966b.m12692a();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f11529a.mo1205f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C3400b m12645Q = C3400b.m12645Q(accessibilityNodeInfo);
            m12645Q.m12660M(C3308b0.m11995I(view));
            m12645Q.m12658K(C3308b0.m11991E(view));
            m12645Q.m12659L(C3308b0.m12041o(view));
            m12645Q.m12662O(C3308b0.m12052z(view));
            this.f11529a.mo1206g(view, m12645Q);
            m12645Q.m12666c(accessibilityNodeInfo.getText(), view);
            List<C3400b.a> m11964c = C3305a.m11964c(view);
            for (int i10 = 0; i10 < m11964c.size(); i10++) {
                m12645Q.m12664a(m11964c.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f11529a.m11969h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f11529a.m11970i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f11529a.mo1207j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f11529a.m11972l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f11529a.m11973m(view, accessibilityEvent);
        }
    }

    /* renamed from: k0.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static AccessibilityNodeProvider m11974a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        public static boolean m11975b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public C3305a() {
        this(f11526c);
    }

    public C3305a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f11527a = accessibilityDelegate;
        this.f11528b = new a(this);
    }

    /* renamed from: c */
    public static List<C3400b.a> m11964c(View view) {
        List<C3400b.a> list = (List) view.getTag(C5186e.f19615W);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public boolean m11965a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f11527a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C3401c m11966b(View view) {
        AccessibilityNodeProvider m11974a;
        if (Build.VERSION.SDK_INT < 16 || (m11974a = b.m11974a(this.f11527a, view)) == null) {
            return null;
        }
        return new C3401c(m11974a);
    }

    /* renamed from: d */
    public View.AccessibilityDelegate m11967d() {
        return this.f11528b;
    }

    /* renamed from: e */
    public final boolean m11968e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m12647l = C3400b.m12647l(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; m12647l != null && i10 < m12647l.length; i10++) {
                if (clickableSpan.equals(m12647l[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo1205f(View view, AccessibilityEvent accessibilityEvent) {
        this.f11527a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo1206g(View view, C3400b c3400b) {
        this.f11527a.onInitializeAccessibilityNodeInfo(view, c3400b.m12663P());
    }

    /* renamed from: h */
    public void m11969h(View view, AccessibilityEvent accessibilityEvent) {
        this.f11527a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean m11970i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f11527a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo1207j(View view, int i10, Bundle bundle) {
        List<C3400b.a> m11964c = m11964c(view);
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= m11964c.size()) {
                break;
            }
            C3400b.a aVar = m11964c.get(i11);
            if (aVar.m12688a() == i10) {
                z10 = aVar.m12690c(view, bundle);
                break;
            }
            i11++;
        }
        if (!z10 && Build.VERSION.SDK_INT >= 16) {
            z10 = b.m11975b(this.f11527a, view, i10, bundle);
        }
        return (z10 || i10 != C5186e.f19619a || bundle == null) ? z10 : m11971k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: k */
    public final boolean m11971k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C5186e.f19616X);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m11968e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: l */
    public void m11972l(View view, int i10) {
        this.f11527a.sendAccessibilityEvent(view, i10);
    }

    /* renamed from: m */
    public void m11973m(View view, AccessibilityEvent accessibilityEvent) {
        this.f11527a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
