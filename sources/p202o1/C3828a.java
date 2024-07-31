package p202o1;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p202o1.AbstractC3832e;
import p262s1.InterfaceC4389c;

/* renamed from: o1.a */
/* loaded from: classes.dex */
public class C3828a {

    /* renamed from: a */
    public final InterfaceC4389c.c f13773a;

    /* renamed from: b */
    public final Context f13774b;

    /* renamed from: c */
    public final String f13775c;

    /* renamed from: d */
    public final AbstractC3832e.d f13776d;

    /* renamed from: e */
    public final List<AbstractC3832e.b> f13777e;

    /* renamed from: f */
    public final boolean f13778f;

    /* renamed from: g */
    public final AbstractC3832e.c f13779g;

    /* renamed from: h */
    public final Executor f13780h;

    /* renamed from: i */
    public final Executor f13781i;

    /* renamed from: j */
    public final boolean f13782j;

    /* renamed from: k */
    public final boolean f13783k;

    /* renamed from: l */
    public final boolean f13784l;

    /* renamed from: m */
    public final Set<Integer> f13785m;

    /* renamed from: n */
    public final String f13786n;

    /* renamed from: o */
    public final File f13787o;

    public C3828a(Context context, String str, InterfaceC4389c.c cVar, AbstractC3832e.d dVar, List<AbstractC3832e.b> list, boolean z10, AbstractC3832e.c cVar2, Executor executor, Executor executor2, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file) {
        this.f13773a = cVar;
        this.f13774b = context;
        this.f13775c = str;
        this.f13776d = dVar;
        this.f13777e = list;
        this.f13778f = z10;
        this.f13779g = cVar2;
        this.f13780h = executor;
        this.f13781i = executor2;
        this.f13782j = z11;
        this.f13783k = z12;
        this.f13784l = z13;
        this.f13785m = set;
        this.f13786n = str2;
        this.f13787o = file;
    }

    /* renamed from: a */
    public boolean m14542a(int i10, int i11) {
        Set<Integer> set;
        if ((i10 > i11) && this.f13784l) {
            return false;
        }
        return this.f13783k && ((set = this.f13785m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
