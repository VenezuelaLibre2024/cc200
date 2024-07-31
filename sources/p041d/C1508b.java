package p041d;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import p041d.InterfaceC1507a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: d.b */
/* loaded from: classes.dex */
public class C1508b implements Parcelable {
    public static final Parcelable.Creator<C1508b> CREATOR = new a();

    /* renamed from: h */
    public final boolean f5494h = false;

    /* renamed from: i */
    public final Handler f5495i = null;

    /* renamed from: j */
    public InterfaceC1507a f5496j;

    /* renamed from: d.b$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C1508b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1508b createFromParcel(Parcel parcel) {
            return new C1508b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1508b[] newArray(int i10) {
            return new C1508b[i10];
        }
    }

    /* renamed from: d.b$b */
    /* loaded from: classes.dex */
    public class b extends InterfaceC1507a.a {
        public b() {
        }

        @Override // p041d.InterfaceC1507a
        /* renamed from: K1 */
        public void mo6109K1(int i10, Bundle bundle) {
            C1508b c1508b = C1508b.this;
            Handler handler = c1508b.f5495i;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                c1508b.mo502a(i10, bundle);
            }
        }
    }

    /* renamed from: d.b$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: h */
        public final int f5498h;

        /* renamed from: i */
        public final Bundle f5499i;

        public c(int i10, Bundle bundle) {
            this.f5498h = i10;
            this.f5499i = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1508b.this.mo502a(this.f5498h, this.f5499i);
        }
    }

    public C1508b(Parcel parcel) {
        this.f5496j = InterfaceC1507a.a.m6110c(parcel.readStrongBinder());
    }

    /* renamed from: a */
    public void mo502a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f5496j == null) {
                this.f5496j = new b();
            }
            parcel.writeStrongBinder(this.f5496j.asBinder());
        }
    }
}
