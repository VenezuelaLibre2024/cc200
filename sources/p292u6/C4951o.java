package p292u6;

import android.os.Parcel;
import android.os.Parcelable;
import p108h6.C2388q;
import p108h6.C2394s;

/* renamed from: u6.o */
/* loaded from: classes.dex */
public class C4951o implements Parcelable {
    public static final Parcelable.Creator<C4951o> CREATOR = new C4983y1();

    /* renamed from: h */
    public final InterfaceC4901a f18598h;

    /* renamed from: u6.o$a */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        public a(int i10) {
            super("Algorithm with COSE value " + i10 + " not supported");
        }
    }

    public C4951o(InterfaceC4901a interfaceC4901a) {
        this.f18598h = (InterfaceC4901a) C2394s.m9619l(interfaceC4901a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static C4951o m19512a(int i10) {
        EnumC4906b0 enumC4906b0;
        if (i10 == EnumC4906b0.LEGACY_RS1.mo19466b()) {
            enumC4906b0 = EnumC4906b0.RS1;
        } else {
            EnumC4906b0[] values = EnumC4906b0.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    for (EnumC4906b0 enumC4906b02 : EnumC4954p.values()) {
                        if (enumC4906b02.mo19466b() == i10) {
                            enumC4906b0 = enumC4906b02;
                        }
                    }
                    throw new a(i10);
                }
                EnumC4906b0 enumC4906b03 = values[i11];
                if (enumC4906b03.mo19466b() == i10) {
                    enumC4906b0 = enumC4906b03;
                    break;
                }
                i11++;
            }
        }
        return new C4951o(enumC4906b0);
    }

    /* renamed from: b */
    public int m19513b() {
        return this.f18598h.mo19466b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4951o) && this.f18598h.mo19466b() == ((C4951o) obj).f18598h.mo19466b();
    }

    public int hashCode() {
        return C2388q.m9593c(this.f18598h);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18598h.mo19466b());
    }
}
