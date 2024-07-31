package p169l6;

import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p182m6.AbstractC3537a;

/* renamed from: l6.b */
/* loaded from: classes.dex */
public final class C3435b extends AbstractC2601a {
    public static final Parcelable.Creator<C3435b> CREATOR = new C3436c();

    /* renamed from: h */
    public final int f12078h;

    /* renamed from: i */
    public final C3434a f12079i;

    public C3435b(int i10, C3434a c3434a) {
        this.f12078h = i10;
        this.f12079i = c3434a;
    }

    public C3435b(C3434a c3434a) {
        this.f12078h = 1;
        this.f12079i = c3434a;
    }

    /* renamed from: I */
    public static C3435b m12786I(AbstractC3537a.b bVar) {
        if (bVar instanceof C3434a) {
            return new C3435b((C3434a) bVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: J */
    public final AbstractC3537a.b m12787J() {
        C3434a c3434a = this.f12079i;
        if (c3434a != null) {
            return c3434a;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f12078h);
        C2603c.m10454D(parcel, 2, this.f12079i, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
