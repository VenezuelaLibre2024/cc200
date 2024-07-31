package p280t8;

import java.lang.annotation.Annotation;
import p280t8.InterfaceC4727d;

/* renamed from: t8.a */
/* loaded from: classes.dex */
public final class C4724a {

    /* renamed from: a */
    public int f17642a;

    /* renamed from: b */
    public InterfaceC4727d.a f17643b = InterfaceC4727d.a.DEFAULT;

    /* renamed from: t8.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC4727d {

        /* renamed from: a */
        public final int f17644a;

        /* renamed from: b */
        public final InterfaceC4727d.a f17645b;

        public a(int i10, InterfaceC4727d.a aVar) {
            this.f17644a = i10;
            this.f17645b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return InterfaceC4727d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC4727d)) {
                return false;
            }
            InterfaceC4727d interfaceC4727d = (InterfaceC4727d) obj;
            return this.f17644a == interfaceC4727d.tag() && this.f17645b.equals(interfaceC4727d.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f17644a ^ 14552422) + (this.f17645b.hashCode() ^ 2041407134);
        }

        @Override // p280t8.InterfaceC4727d
        public InterfaceC4727d.a intEncoding() {
            return this.f17645b;
        }

        @Override // p280t8.InterfaceC4727d
        public int tag() {
            return this.f17644a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f17644a + "intEncoding=" + this.f17645b + ')';
        }
    }

    /* renamed from: b */
    public static C4724a m18567b() {
        return new C4724a();
    }

    /* renamed from: a */
    public InterfaceC4727d m18568a() {
        return new a(this.f17642a, this.f17643b);
    }

    /* renamed from: c */
    public C4724a m18569c(int i10) {
        this.f17642a = i10;
        return this;
    }
}
