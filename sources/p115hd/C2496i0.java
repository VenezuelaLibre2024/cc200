package p115hd;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2245s;
import java.util.Iterator;
import java.util.List;
import p146jd.InterfaceC3281d;
import p173ld.AbstractC3477k;
import p173ld.InterfaceC3472f;
import p373zd.AbstractC6126d;
import p373zd.C6127e;
import sd.InterfaceC4584p;
import td.C4753m;

/* renamed from: hd.i0 */
/* loaded from: classes2.dex */
public final class C2496i0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC3472f(m12916c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m12917f = "SlidingWindow.kt", m12918l = {C1417R.styleable.AppCompatTheme_activityChooserViewStyle, 40, C1417R.styleable.AppCompatTheme_checkedTextViewStyle, C1417R.styleable.AppCompatTheme_colorControlNormal, C1417R.styleable.AppCompatTheme_colorPrimaryDark}, m12919m = "invokeSuspend")
    /* renamed from: hd.i0$a */
    /* loaded from: classes2.dex */
    public static final class a<T> extends AbstractC3477k implements InterfaceC4584p<AbstractC6126d<? super List<? extends T>>, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: i */
        public Object f9930i;

        /* renamed from: j */
        public Object f9931j;

        /* renamed from: k */
        public int f9932k;

        /* renamed from: l */
        public int f9933l;

        /* renamed from: m */
        public /* synthetic */ Object f9934m;

        /* renamed from: n */
        public final /* synthetic */ int f9935n;

        /* renamed from: o */
        public final /* synthetic */ int f9936o;

        /* renamed from: p */
        public final /* synthetic */ Iterator<T> f9937p;

        /* renamed from: q */
        public final /* synthetic */ boolean f9938q;

        /* renamed from: r */
        public final /* synthetic */ boolean f9939r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, InterfaceC3281d<? super a> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f9935n = i10;
            this.f9936o = i11;
            this.f9937p = it;
            this.f9938q = z10;
            this.f9939r = z11;
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC6126d<? super List<? extends T>> abstractC6126d, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((a) create(abstractC6126d, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            a aVar = new a(this.f9935n, this.f9936o, this.f9937p, this.f9938q, this.f9939r, interfaceC3281d);
            aVar.f9934m = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0153  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00db A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00b0  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x014a -> B:12:0x014d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x011c -> B:30:0x011f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x00a5 -> B:50:0x00a8). Please report as a decompilation issue!!! */
        @Override // p173ld.AbstractC3467a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p115hd.C2496i0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final void m9937a(int i10, int i11) {
        String str;
        if (i10 > 0 && i11 > 0) {
            return;
        }
        if (i10 != i11) {
            str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
        } else {
            str = "size " + i10 + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    /* renamed from: b */
    public static final <T> Iterator<List<T>> m9938b(Iterator<? extends T> it, int i10, int i11, boolean z10, boolean z11) {
        C4753m.m18653f(it, "iterator");
        return !it.hasNext() ? C2511w.f9945h : C6127e.m24438a(new a(i10, i11, it, z11, z10, null));
    }
}
