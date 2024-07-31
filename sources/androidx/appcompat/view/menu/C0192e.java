package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p027c0.InterfaceMenuC0579a;
import p148k0.C3312d0;
import p345y.C5782a;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public class C0192e implements InterfaceMenuC0579a {

    /* renamed from: A */
    public static final int[] f739A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f740a;

    /* renamed from: b */
    public final Resources f741b;

    /* renamed from: c */
    public boolean f742c;

    /* renamed from: d */
    public boolean f743d;

    /* renamed from: e */
    public a f744e;

    /* renamed from: m */
    public ContextMenu.ContextMenuInfo f752m;

    /* renamed from: n */
    public CharSequence f753n;

    /* renamed from: o */
    public Drawable f754o;

    /* renamed from: p */
    public View f755p;

    /* renamed from: x */
    public C0194g f763x;

    /* renamed from: z */
    public boolean f765z;

    /* renamed from: l */
    public int f751l = 0;

    /* renamed from: q */
    public boolean f756q = false;

    /* renamed from: r */
    public boolean f757r = false;

    /* renamed from: s */
    public boolean f758s = false;

    /* renamed from: t */
    public boolean f759t = false;

    /* renamed from: u */
    public boolean f760u = false;

    /* renamed from: v */
    public ArrayList<C0194g> f761v = new ArrayList<>();

    /* renamed from: w */
    public CopyOnWriteArrayList<WeakReference<InterfaceC0196i>> f762w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    public boolean f764y = false;

    /* renamed from: f */
    public ArrayList<C0194g> f745f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<C0194g> f746g = new ArrayList<>();

    /* renamed from: h */
    public boolean f747h = true;

    /* renamed from: i */
    public ArrayList<C0194g> f748i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C0194g> f749j = new ArrayList<>();

    /* renamed from: k */
    public boolean f750k = true;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo810a(C0192e c0192e, MenuItem menuItem);

        /* renamed from: b */
        void mo811b(C0192e c0192e);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        boolean mo700a(C0194g c0194g);
    }

    public C0192e(Context context) {
        this.f740a = context;
        this.f741b = context.getResources();
        m784b0(true);
    }

    /* renamed from: B */
    public static int m754B(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f739A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: n */
    public static int m755n(ArrayList<C0194g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m823f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public boolean m756A() {
        return this.f759t;
    }

    /* renamed from: C */
    public Resources m757C() {
        return this.f741b;
    }

    /* renamed from: D */
    public C0192e mo758D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<C0194g> m759E() {
        if (!this.f747h) {
            return this.f746g;
        }
        this.f746g.clear();
        int size = this.f745f.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0194g c0194g = this.f745f.get(i10);
            if (c0194g.isVisible()) {
                this.f746g.add(c0194g);
            }
        }
        this.f747h = false;
        this.f750k = true;
        return this.f746g;
    }

    /* renamed from: F */
    public boolean mo760F() {
        return this.f764y;
    }

    /* renamed from: G */
    public boolean mo761G() {
        return this.f742c;
    }

    /* renamed from: H */
    public boolean mo762H() {
        return this.f743d;
    }

    /* renamed from: I */
    public void m763I(C0194g c0194g) {
        this.f750k = true;
        m765K(true);
    }

    /* renamed from: J */
    public void m764J(C0194g c0194g) {
        this.f747h = true;
        m765K(true);
    }

    /* renamed from: K */
    public void m765K(boolean z10) {
        if (this.f756q) {
            this.f757r = true;
            if (z10) {
                this.f758s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f747h = true;
            this.f750k = true;
        }
        m793i(z10);
    }

    /* renamed from: L */
    public boolean m766L(MenuItem menuItem, int i10) {
        return m767M(menuItem, null, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r1 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        m789e(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if ((r9 & 1) == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        if (r1 == false) goto L56;
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m767M(android.view.MenuItem r7, androidx.appcompat.view.menu.InterfaceC0196i r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.C0194g) r7
            r0 = 0
            if (r7 == 0) goto L6c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L6c
        Lc:
            boolean r1 = r7.m828k()
            k0.b r2 = r7.mo819a()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.mo11977a()
            if (r4 == 0) goto L1f
            r4 = r3
            goto L20
        L1f:
            r4 = r0
        L20:
            boolean r5 = r7.m827j()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L6b
        L2d:
            r6.m789e(r3)
            goto L6b
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L3f
            if (r4 == 0) goto L3a
            goto L3f
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L6b
            goto L2d
        L3f:
            r9 = r9 & 4
            if (r9 != 0) goto L46
            r6.m789e(r0)
        L46:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L58
            androidx.appcompat.view.menu.l r9 = new androidx.appcompat.view.menu.l
            android.content.Context r0 = r6.m804u()
            r9.<init>(r0, r6, r7)
            r7.m841x(r9)
        L58:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.l r7 = (androidx.appcompat.view.menu.SubMenuC0199l) r7
            if (r4 == 0) goto L63
            r2.mo11982f(r7)
        L63:
            boolean r7 = r6.m794j(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L6b
            goto L2d
        L6b:
            return r1
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0192e.m767M(android.view.MenuItem, androidx.appcompat.view.menu.i, int):boolean");
    }

    /* renamed from: N */
    public final void m768N(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f745f.size()) {
            return;
        }
        this.f745f.remove(i10);
        if (z10) {
            m765K(true);
        }
    }

    /* renamed from: O */
    public void m769O(InterfaceC0196i interfaceC0196i) {
        Iterator<WeakReference<InterfaceC0196i>> it = this.f762w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0196i> next = it.next();
            InterfaceC0196i interfaceC0196i2 = next.get();
            if (interfaceC0196i2 == null || interfaceC0196i2 == interfaceC0196i) {
                this.f762w.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void m770P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo803t());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0199l) item.getSubMenu()).m770P(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (findItem = findItem(i11)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: Q */
    public void m771Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0199l) item.getSubMenu()).m771Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo803t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo772R(a aVar) {
        this.f744e = aVar;
    }

    /* renamed from: S */
    public C0192e m773S(int i10) {
        this.f751l = i10;
        return this;
    }

    /* renamed from: T */
    public void m774T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f745f.size();
        m788d0();
        for (int i10 = 0; i10 < size; i10++) {
            C0194g c0194g = this.f745f.get(i10);
            if (c0194g.getGroupId() == groupId && c0194g.m830m() && c0194g.isCheckable()) {
                c0194g.m836s(c0194g == menuItem);
            }
        }
        m786c0();
    }

    /* renamed from: U */
    public C0192e m775U(int i10) {
        m777W(0, null, i10, null, null);
        return this;
    }

    /* renamed from: V */
    public C0192e m776V(Drawable drawable) {
        m777W(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: W */
    public final void m777W(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources m757C = m757C();
        if (view != null) {
            this.f755p = view;
            this.f753n = null;
            this.f754o = null;
        } else {
            if (i10 > 0) {
                this.f753n = m757C.getText(i10);
            } else if (charSequence != null) {
                this.f753n = charSequence;
            }
            if (i11 > 0) {
                this.f754o = C5782a.getDrawable(m804u(), i11);
            } else if (drawable != null) {
                this.f754o = drawable;
            }
            this.f755p = null;
        }
        m765K(false);
    }

    /* renamed from: X */
    public C0192e m778X(int i10) {
        m777W(i10, null, 0, null, null);
        return this;
    }

    /* renamed from: Y */
    public C0192e m779Y(CharSequence charSequence) {
        m777W(0, charSequence, 0, null, null);
        return this;
    }

    /* renamed from: Z */
    public C0192e m780Z(View view) {
        m777W(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    public MenuItem m781a(int i10, int i11, int i12, CharSequence charSequence) {
        int m754B = m754B(i12);
        C0194g m791g = m791g(i10, i11, i12, m754B, charSequence, this.f751l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f752m;
        if (contextMenuInfo != null) {
            m791g.m839v(contextMenuInfo);
        }
        ArrayList<C0194g> arrayList = this.f745f;
        arrayList.add(m755n(arrayList, m754B), m791g);
        m765K(true);
        return m791g;
    }

    /* renamed from: a0 */
    public void m782a0(boolean z10) {
        this.f765z = z10;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return m781a(0, 0, 0, this.f741b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return m781a(i10, i11, i12, this.f741b.getString(i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return m781a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m781a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f740a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f741b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f741b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        C0194g c0194g = (C0194g) m781a(i10, i11, i12, charSequence);
        SubMenuC0199l subMenuC0199l = new SubMenuC0199l(this.f740a, this, c0194g);
        c0194g.m841x(subMenuC0199l);
        return subMenuC0199l;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m783b(InterfaceC0196i interfaceC0196i) {
        m785c(interfaceC0196i, this.f740a);
    }

    /* renamed from: b0 */
    public final void m784b0(boolean z10) {
        this.f743d = z10 && this.f741b.getConfiguration().keyboard != 1 && C3312d0.m12208b(ViewConfiguration.get(this.f740a), this.f740a);
    }

    /* renamed from: c */
    public void m785c(InterfaceC0196i interfaceC0196i, Context context) {
        this.f762w.add(new WeakReference<>(interfaceC0196i));
        interfaceC0196i.mo714h(context, this);
        this.f750k = true;
    }

    /* renamed from: c0 */
    public void m786c0() {
        this.f756q = false;
        if (this.f757r) {
            this.f757r = false;
            m765K(this.f758s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        C0194g c0194g = this.f763x;
        if (c0194g != null) {
            mo790f(c0194g);
        }
        this.f745f.clear();
        m765K(true);
    }

    public void clearHeader() {
        this.f754o = null;
        this.f753n = null;
        this.f755p = null;
        m765K(false);
    }

    @Override // android.view.Menu
    public void close() {
        m789e(true);
    }

    /* renamed from: d */
    public void m787d() {
        a aVar = this.f744e;
        if (aVar != null) {
            aVar.mo811b(this);
        }
    }

    /* renamed from: d0 */
    public void m788d0() {
        if (this.f756q) {
            return;
        }
        this.f756q = true;
        this.f757r = false;
        this.f758s = false;
    }

    /* renamed from: e */
    public final void m789e(boolean z10) {
        if (this.f760u) {
            return;
        }
        this.f760u = true;
        Iterator<WeakReference<InterfaceC0196i>> it = this.f762w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0196i> next = it.next();
            InterfaceC0196i interfaceC0196i = next.get();
            if (interfaceC0196i == null) {
                this.f762w.remove(next);
            } else {
                interfaceC0196i.mo709b(this, z10);
            }
        }
        this.f760u = false;
    }

    /* renamed from: f */
    public boolean mo790f(C0194g c0194g) {
        boolean z10 = false;
        if (!this.f762w.isEmpty() && this.f763x == c0194g) {
            m788d0();
            Iterator<WeakReference<InterfaceC0196i>> it = this.f762w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0196i> next = it.next();
                InterfaceC0196i interfaceC0196i = next.get();
                if (interfaceC0196i == null) {
                    this.f762w.remove(next);
                } else {
                    z10 = interfaceC0196i.mo711e(this, c0194g);
                    if (z10) {
                        break;
                    }
                }
            }
            m786c0();
            if (z10) {
                this.f763x = null;
            }
        }
        return z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            C0194g c0194g = this.f745f.get(i11);
            if (c0194g.getItemId() == i10) {
                return c0194g;
            }
            if (c0194g.hasSubMenu() && (findItem = c0194g.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C0194g m791g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new C0194g(this, i10, i11, i12, i13, charSequence, i14);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f745f.get(i10);
    }

    /* renamed from: h */
    public boolean mo792h(C0192e c0192e, MenuItem menuItem) {
        a aVar = this.f744e;
        return aVar != null && aVar.mo810a(c0192e, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f765z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f745f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m793i(boolean z10) {
        if (this.f762w.isEmpty()) {
            return;
        }
        m788d0();
        Iterator<WeakReference<InterfaceC0196i>> it = this.f762w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0196i> next = it.next();
            InterfaceC0196i interfaceC0196i = next.get();
            if (interfaceC0196i == null) {
                this.f762w.remove(next);
            } else {
                interfaceC0196i.mo710c(z10);
            }
        }
        m786c0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return m799p(i10, keyEvent) != null;
    }

    /* renamed from: j */
    public final boolean m794j(SubMenuC0199l subMenuC0199l, InterfaceC0196i interfaceC0196i) {
        if (this.f762w.isEmpty()) {
            return false;
        }
        boolean mo715i = interfaceC0196i != null ? interfaceC0196i.mo715i(subMenuC0199l) : false;
        Iterator<WeakReference<InterfaceC0196i>> it = this.f762w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0196i> next = it.next();
            InterfaceC0196i interfaceC0196i2 = next.get();
            if (interfaceC0196i2 == null) {
                this.f762w.remove(next);
            } else if (!mo715i) {
                mo715i = interfaceC0196i2.mo715i(subMenuC0199l);
            }
        }
        return mo715i;
    }

    /* renamed from: k */
    public boolean mo795k(C0194g c0194g) {
        boolean z10 = false;
        if (this.f762w.isEmpty()) {
            return false;
        }
        m788d0();
        Iterator<WeakReference<InterfaceC0196i>> it = this.f762w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0196i> next = it.next();
            InterfaceC0196i interfaceC0196i = next.get();
            if (interfaceC0196i == null) {
                this.f762w.remove(next);
            } else {
                z10 = interfaceC0196i.mo712f(this, c0194g);
                if (z10) {
                    break;
                }
            }
        }
        m786c0();
        if (z10) {
            this.f763x = c0194g;
        }
        return z10;
    }

    /* renamed from: l */
    public int m796l(int i10) {
        return m797m(i10, 0);
    }

    /* renamed from: m */
    public int m797m(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f745f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* renamed from: o */
    public int m798o(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f745f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public C0194g m799p(int i10, KeyEvent keyEvent) {
        ArrayList<C0194g> arrayList = this.f761v;
        arrayList.clear();
        m800q(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo761G = mo761G();
        for (int i11 = 0; i11 < size; i11++) {
            C0194g c0194g = arrayList.get(i11);
            char alphabeticShortcut = mo761G ? c0194g.getAlphabeticShortcut() : c0194g.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (mo761G && alphabeticShortcut == '\b' && i10 == 67))) {
                return c0194g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return m766L(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        C0194g m799p = m799p(i10, keyEvent);
        boolean m766L = m799p != null ? m766L(m799p, i11) : false;
        if ((i11 & 2) != 0) {
            m789e(true);
        }
        return m766L;
    }

    /* renamed from: q */
    public void m800q(List<C0194g> list, int i10, KeyEvent keyEvent) {
        boolean mo761G = mo761G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f745f.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0194g c0194g = this.f745f.get(i11);
                if (c0194g.hasSubMenu()) {
                    ((C0192e) c0194g.getSubMenu()).m800q(list, i10, keyEvent);
                }
                char alphabeticShortcut = mo761G ? c0194g.getAlphabeticShortcut() : c0194g.getNumericShortcut();
                if (((modifiers & 69647) == ((mo761G ? c0194g.getAlphabeticModifiers() : c0194g.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (mo761G && alphabeticShortcut == '\b' && i10 == 67)) && c0194g.isEnabled()) {
                        list.add(c0194g);
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void m801r() {
        ArrayList<C0194g> m759E = m759E();
        if (this.f750k) {
            Iterator<WeakReference<InterfaceC0196i>> it = this.f762w.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0196i> next = it.next();
                InterfaceC0196i interfaceC0196i = next.get();
                if (interfaceC0196i == null) {
                    this.f762w.remove(next);
                } else {
                    z10 |= interfaceC0196i.mo730d();
                }
            }
            if (z10) {
                this.f748i.clear();
                this.f749j.clear();
                int size = m759E.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C0194g c0194g = m759E.get(i10);
                    (c0194g.m829l() ? this.f748i : this.f749j).add(c0194g);
                }
            } else {
                this.f748i.clear();
                this.f749j.clear();
                this.f749j.addAll(m759E());
            }
            this.f750k = false;
        }
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int m796l = m796l(i10);
        if (m796l >= 0) {
            int size = this.f745f.size() - m796l;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f745f.get(m796l).getGroupId() != i10) {
                    break;
                }
                m768N(m796l, false);
                i11 = i12;
            }
            m765K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        m768N(m798o(i10), true);
    }

    /* renamed from: s */
    public ArrayList<C0194g> m802s() {
        m801r();
        return this.f748i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f745f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0194g c0194g = this.f745f.get(i11);
            if (c0194g.getGroupId() == i10) {
                c0194g.m837t(z11);
                c0194g.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f764y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f745f.size();
        for (int i11 = 0; i11 < size; i11++) {
            C0194g c0194g = this.f745f.get(i11);
            if (c0194g.getGroupId() == i10) {
                c0194g.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f745f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C0194g c0194g = this.f745f.get(i11);
            if (c0194g.getGroupId() == i10 && c0194g.m842y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            m765K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f742c = z10;
        m765K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f745f.size();
    }

    /* renamed from: t */
    public String mo803t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context m804u() {
        return this.f740a;
    }

    /* renamed from: v */
    public C0194g m805v() {
        return this.f763x;
    }

    /* renamed from: w */
    public Drawable m806w() {
        return this.f754o;
    }

    /* renamed from: x */
    public CharSequence m807x() {
        return this.f753n;
    }

    /* renamed from: y */
    public View m808y() {
        return this.f755p;
    }

    /* renamed from: z */
    public ArrayList<C0194g> m809z() {
        m801r();
        return this.f749j;
    }
}
