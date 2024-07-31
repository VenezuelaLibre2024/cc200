package p162l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0194g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p027c0.InterfaceMenuC0579a;
import p089g.C1940j;
import p148k0.AbstractC3307b;
import p148k0.C3329m;
import p175m.MenuItemC3487c;
import p187n.C3637h0;
import p187n.C3667w0;

/* renamed from: l.g */
/* loaded from: classes.dex */
public class C3396g extends MenuInflater {

    /* renamed from: e */
    public static final Class<?>[] f11850e;

    /* renamed from: f */
    public static final Class<?>[] f11851f;

    /* renamed from: a */
    public final Object[] f11852a;

    /* renamed from: b */
    public final Object[] f11853b;

    /* renamed from: c */
    public Context f11854c;

    /* renamed from: d */
    public Object f11855d;

    /* renamed from: l.g$a */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        public static final Class<?>[] f11856c = {MenuItem.class};

        /* renamed from: a */
        public Object f11857a;

        /* renamed from: b */
        public Method f11858b;

        public a(Object obj, String str) {
            this.f11857a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f11858b = cls.getMethod(str, f11856c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f11858b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f11858b.invoke(this.f11857a, menuItem)).booleanValue();
                }
                this.f11858b.invoke(this.f11857a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: l.g$b */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: A */
        public AbstractC3307b f11859A;

        /* renamed from: B */
        public CharSequence f11860B;

        /* renamed from: C */
        public CharSequence f11861C;

        /* renamed from: D */
        public ColorStateList f11862D = null;

        /* renamed from: E */
        public PorterDuff.Mode f11863E = null;

        /* renamed from: a */
        public Menu f11865a;

        /* renamed from: b */
        public int f11866b;

        /* renamed from: c */
        public int f11867c;

        /* renamed from: d */
        public int f11868d;

        /* renamed from: e */
        public int f11869e;

        /* renamed from: f */
        public boolean f11870f;

        /* renamed from: g */
        public boolean f11871g;

        /* renamed from: h */
        public boolean f11872h;

        /* renamed from: i */
        public int f11873i;

        /* renamed from: j */
        public int f11874j;

        /* renamed from: k */
        public CharSequence f11875k;

        /* renamed from: l */
        public CharSequence f11876l;

        /* renamed from: m */
        public int f11877m;

        /* renamed from: n */
        public char f11878n;

        /* renamed from: o */
        public int f11879o;

        /* renamed from: p */
        public char f11880p;

        /* renamed from: q */
        public int f11881q;

        /* renamed from: r */
        public int f11882r;

        /* renamed from: s */
        public boolean f11883s;

        /* renamed from: t */
        public boolean f11884t;

        /* renamed from: u */
        public boolean f11885u;

        /* renamed from: v */
        public int f11886v;

        /* renamed from: w */
        public int f11887w;

        /* renamed from: x */
        public String f11888x;

        /* renamed from: y */
        public String f11889y;

        /* renamed from: z */
        public String f11890z;

        public b(Menu menu) {
            this.f11865a = menu;
            m12629h();
        }

        /* renamed from: a */
        public void m12622a() {
            this.f11872h = true;
            m12630i(this.f11865a.add(this.f11866b, this.f11873i, this.f11874j, this.f11875k));
        }

        /* renamed from: b */
        public SubMenu m12623b() {
            this.f11872h = true;
            SubMenu addSubMenu = this.f11865a.addSubMenu(this.f11866b, this.f11873i, this.f11874j, this.f11875k);
            m12630i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: c */
        public final char m12624c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: d */
        public boolean m12625d() {
            return this.f11872h;
        }

        /* renamed from: e */
        public final <T> T m12626e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C3396g.this.f11854c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        /* renamed from: f */
        public void m12627f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C3396g.this.f11854c.obtainStyledAttributes(attributeSet, C1940j.f7685o1);
            this.f11866b = obtainStyledAttributes.getResourceId(C1940j.f7695q1, 0);
            this.f11867c = obtainStyledAttributes.getInt(C1940j.f7705s1, 0);
            this.f11868d = obtainStyledAttributes.getInt(C1940j.f7710t1, 0);
            this.f11869e = obtainStyledAttributes.getInt(C1940j.f7715u1, 0);
            this.f11870f = obtainStyledAttributes.getBoolean(C1940j.f7700r1, true);
            this.f11871g = obtainStyledAttributes.getBoolean(C1940j.f7690p1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void m12628g(AttributeSet attributeSet) {
            C3667w0 m13716t = C3667w0.m13716t(C3396g.this.f11854c, attributeSet, C1940j.f7720v1);
            this.f11873i = m13716t.m13730m(C1940j.f7735y1, 0);
            this.f11874j = (m13716t.m13727j(C1940j.f7510B1, this.f11867c) & (-65536)) | (m13716t.m13727j(C1940j.f7515C1, this.f11868d) & 65535);
            this.f11875k = m13716t.m13732o(C1940j.f7520D1);
            this.f11876l = m13716t.m13732o(C1940j.f7525E1);
            this.f11877m = m13716t.m13730m(C1940j.f7725w1, 0);
            this.f11878n = m12624c(m13716t.m13731n(C1940j.f7530F1));
            this.f11879o = m13716t.m13727j(C1940j.f7559M1, 4096);
            this.f11880p = m12624c(m13716t.m13731n(C1940j.f7535G1));
            this.f11881q = m13716t.m13727j(C1940j.f7575Q1, 4096);
            int i10 = C1940j.f7539H1;
            this.f11882r = m13716t.m13735r(i10) ? m13716t.m13718a(i10, false) : this.f11869e;
            this.f11883s = m13716t.m13718a(C1940j.f7740z1, false);
            this.f11884t = m13716t.m13718a(C1940j.f7505A1, this.f11870f);
            this.f11885u = m13716t.m13718a(C1940j.f7730x1, this.f11871g);
            this.f11886v = m13716t.m13727j(C1940j.f7579R1, -1);
            this.f11890z = m13716t.m13731n(C1940j.f7543I1);
            this.f11887w = m13716t.m13730m(C1940j.f7547J1, 0);
            this.f11888x = m13716t.m13731n(C1940j.f7555L1);
            String m13731n = m13716t.m13731n(C1940j.f7551K1);
            this.f11889y = m13731n;
            boolean z10 = m13731n != null;
            if (z10 && this.f11887w == 0 && this.f11888x == null) {
                this.f11859A = (AbstractC3307b) m12626e(m13731n, C3396g.f11851f, C3396g.this.f11853b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f11859A = null;
            }
            this.f11860B = m13716t.m13732o(C1940j.f7563N1);
            this.f11861C = m13716t.m13732o(C1940j.f7583S1);
            int i11 = C1940j.f7571P1;
            if (m13716t.m13735r(i11)) {
                this.f11863E = C3637h0.m13514d(m13716t.m13727j(i11, -1), this.f11863E);
            } else {
                this.f11863E = null;
            }
            int i12 = C1940j.f7567O1;
            if (m13716t.m13735r(i12)) {
                this.f11862D = m13716t.m13720c(i12);
            } else {
                this.f11862D = null;
            }
            m13716t.m13736v();
            this.f11872h = false;
        }

        /* renamed from: h */
        public void m12629h() {
            this.f11866b = 0;
            this.f11867c = 0;
            this.f11868d = 0;
            this.f11869e = 0;
            this.f11870f = true;
            this.f11871g = true;
        }

        /* renamed from: i */
        public final void m12630i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f11883s).setVisible(this.f11884t).setEnabled(this.f11885u).setCheckable(this.f11882r >= 1).setTitleCondensed(this.f11876l).setIcon(this.f11877m);
            int i10 = this.f11886v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f11890z != null) {
                if (C3396g.this.f11854c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C3396g.this.m12620b(), this.f11890z));
            }
            if (this.f11882r >= 2) {
                if (menuItem instanceof C0194g) {
                    ((C0194g) menuItem).m837t(true);
                } else if (menuItem instanceof MenuItemC3487c) {
                    ((MenuItemC3487c) menuItem).m12979h(true);
                }
            }
            String str = this.f11888x;
            if (str != null) {
                menuItem.setActionView((View) m12626e(str, C3396g.f11850e, C3396g.this.f11852a));
                z10 = true;
            }
            int i11 = this.f11887w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC3307b abstractC3307b = this.f11859A;
            if (abstractC3307b != null) {
                C3329m.m12339a(menuItem, abstractC3307b);
            }
            C3329m.m12341c(menuItem, this.f11860B);
            C3329m.m12345g(menuItem, this.f11861C);
            C3329m.m12340b(menuItem, this.f11878n, this.f11879o);
            C3329m.m12344f(menuItem, this.f11880p, this.f11881q);
            PorterDuff.Mode mode = this.f11863E;
            if (mode != null) {
                C3329m.m12343e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f11862D;
            if (colorStateList != null) {
                C3329m.m12342d(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f11850e = clsArr;
        f11851f = clsArr;
    }

    public C3396g(Context context) {
        super(context);
        this.f11854c = context;
        Object[] objArr = {context};
        this.f11852a = objArr;
        this.f11853b = objArr;
    }

    /* renamed from: a */
    public final Object m12619a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m12619a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: b */
    public Object m12620b() {
        if (this.f11855d == null) {
            this.f11855d = m12619a(this.f11854c);
        }
        return this.f11855d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.m12629h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.m12625d() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r15 = r0.f11859A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r15 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r15.mo11977a() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r0.m12623b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r0.m12622a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        if (r7 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
    
        r0.m12627f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:
    
        r0.m12628g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00af, code lost:
    
        m12621c(r13, r14, r0.m12623b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L61;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12621c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            l.g$b r0 = new l.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = r5
            r7 = r6
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.m12629h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.m12625d()
            if (r15 != 0) goto Lb9
            k0.b r15 = r0.f11859A
            if (r15 == 0) goto L82
            boolean r15 = r15.mo11977a()
            if (r15 == 0) goto L82
            r0.m12623b()
            goto Lb9
        L82:
            r0.m12622a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.m12627f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.m12628g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.m12623b()
            r12.m12621c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p162l.C3396g.m12621c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0579a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f11854c.getResources().getLayout(i10);
                    m12621c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}
