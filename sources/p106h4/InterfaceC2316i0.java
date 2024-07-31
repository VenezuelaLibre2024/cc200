package p106h4;

import android.util.SparseArray;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Collections;
import java.util.List;
import p222p5.C4015a0;
import p222p5.C4033j0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.i0 */
/* loaded from: classes.dex */
public interface InterfaceC2316i0 {

    /* renamed from: h4.i0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final String f9351a;

        /* renamed from: b */
        public final int f9352b;

        /* renamed from: c */
        public final byte[] f9353c;

        public a(String str, int i10, byte[] bArr) {
            this.f9351a = str;
            this.f9352b = i10;
            this.f9353c = bArr;
        }
    }

    /* renamed from: h4.i0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f9354a;

        /* renamed from: b */
        public final String f9355b;

        /* renamed from: c */
        public final List<a> f9356c;

        /* renamed from: d */
        public final byte[] f9357d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            this.f9354a = i10;
            this.f9355b = str;
            this.f9356c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f9357d = bArr;
        }
    }

    /* renamed from: h4.i0$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        SparseArray<InterfaceC2316i0> mo9410a();

        /* renamed from: b */
        InterfaceC2316i0 mo9411b(int i10, b bVar);
    }

    /* renamed from: h4.i0$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final String f9358a;

        /* renamed from: b */
        public final int f9359b;

        /* renamed from: c */
        public final int f9360c;

        /* renamed from: d */
        public int f9361d;

        /* renamed from: e */
        public String f9362e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE;
            } else {
                str = "";
            }
            this.f9358a = str;
            this.f9359b = i11;
            this.f9360c = i12;
            this.f9361d = Integer.MIN_VALUE;
            this.f9362e = "";
        }

        /* renamed from: a */
        public void m9412a() {
            int i10 = this.f9361d;
            this.f9361d = i10 == Integer.MIN_VALUE ? this.f9359b : i10 + this.f9360c;
            this.f9362e = this.f9358a + this.f9361d;
        }

        /* renamed from: b */
        public String m9413b() {
            m9415d();
            return this.f9362e;
        }

        /* renamed from: c */
        public int m9414c() {
            m9415d();
            return this.f9361d;
        }

        /* renamed from: d */
        public final void m9415d() {
            if (this.f9361d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    /* renamed from: a */
    void mo9341a(C4015a0 c4015a0, int i10);

    /* renamed from: b */
    void mo9342b(C4033j0 c4033j0, InterfaceC5573m interfaceC5573m, d dVar);

    /* renamed from: c */
    void mo9343c();
}
