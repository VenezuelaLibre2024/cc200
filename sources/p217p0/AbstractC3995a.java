package p217p0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: p0.a */
/* loaded from: classes.dex */
public abstract class AbstractC3995a implements Parcelable {

    /* renamed from: h */
    public final Parcelable f14394h;

    /* renamed from: i */
    public static final AbstractC3995a f14393i = new a();
    public static final Parcelable.Creator<AbstractC3995a> CREATOR = new b();

    /* renamed from: p0.a$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC3995a {
        public a() {
            super((a) null);
        }
    }

    /* renamed from: p0.a$b */
    /* loaded from: classes.dex */
    public static class b implements Parcelable.ClassLoaderCreator<AbstractC3995a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC3995a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC3995a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC3995a.f14393i;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC3995a[] newArray(int i10) {
            return new AbstractC3995a[i10];
        }
    }

    public AbstractC3995a() {
        this.f14394h = null;
    }

    public AbstractC3995a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f14394h = readParcelable == null ? f14393i : readParcelable;
    }

    public AbstractC3995a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f14394h = parcelable == f14393i ? null : parcelable;
    }

    public /* synthetic */ AbstractC3995a(a aVar) {
        this();
    }

    /* renamed from: a */
    public final Parcelable m15137a() {
        return this.f14394h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f14394h, i10);
    }
}
