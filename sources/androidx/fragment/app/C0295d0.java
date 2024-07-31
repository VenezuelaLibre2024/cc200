package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC0344f;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.d0 */
/* loaded from: classes.dex */
public final class C0295d0 implements Parcelable {
    public static final Parcelable.Creator<C0295d0> CREATOR = new a();

    /* renamed from: h */
    public final String f1415h;

    /* renamed from: i */
    public final String f1416i;

    /* renamed from: j */
    public final boolean f1417j;

    /* renamed from: k */
    public final int f1418k;

    /* renamed from: l */
    public final int f1419l;

    /* renamed from: m */
    public final String f1420m;

    /* renamed from: n */
    public final boolean f1421n;

    /* renamed from: o */
    public final boolean f1422o;

    /* renamed from: p */
    public final boolean f1423p;

    /* renamed from: q */
    public final Bundle f1424q;

    /* renamed from: r */
    public final boolean f1425r;

    /* renamed from: s */
    public final int f1426s;

    /* renamed from: t */
    public Bundle f1427t;

    /* renamed from: androidx.fragment.app.d0$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<C0295d0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0295d0 createFromParcel(Parcel parcel) {
            return new C0295d0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0295d0[] newArray(int i10) {
            return new C0295d0[i10];
        }
    }

    public C0295d0(Parcel parcel) {
        this.f1415h = parcel.readString();
        this.f1416i = parcel.readString();
        this.f1417j = parcel.readInt() != 0;
        this.f1418k = parcel.readInt();
        this.f1419l = parcel.readInt();
        this.f1420m = parcel.readString();
        this.f1421n = parcel.readInt() != 0;
        this.f1422o = parcel.readInt() != 0;
        this.f1423p = parcel.readInt() != 0;
        this.f1424q = parcel.readBundle();
        this.f1425r = parcel.readInt() != 0;
        this.f1427t = parcel.readBundle();
        this.f1426s = parcel.readInt();
    }

    public C0295d0(Fragment fragment) {
        this.f1415h = fragment.getClass().getName();
        this.f1416i = fragment.mWho;
        this.f1417j = fragment.mFromLayout;
        this.f1418k = fragment.mFragmentId;
        this.f1419l = fragment.mContainerId;
        this.f1420m = fragment.mTag;
        this.f1421n = fragment.mRetainInstance;
        this.f1422o = fragment.mRemoving;
        this.f1423p = fragment.mDetached;
        this.f1424q = fragment.mArguments;
        this.f1425r = fragment.mHidden;
        this.f1426s = fragment.mMaxState.ordinal();
    }

    /* renamed from: a */
    public Fragment m1418a(C0316o c0316o, ClassLoader classLoader) {
        Fragment mo1595a = c0316o.mo1595a(classLoader, this.f1415h);
        Bundle bundle = this.f1424q;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        mo1595a.setArguments(this.f1424q);
        mo1595a.mWho = this.f1416i;
        mo1595a.mFromLayout = this.f1417j;
        mo1595a.mRestored = true;
        mo1595a.mFragmentId = this.f1418k;
        mo1595a.mContainerId = this.f1419l;
        mo1595a.mTag = this.f1420m;
        mo1595a.mRetainInstance = this.f1421n;
        mo1595a.mRemoving = this.f1422o;
        mo1595a.mDetached = this.f1423p;
        mo1595a.mHidden = this.f1425r;
        mo1595a.mMaxState = AbstractC0344f.b.values()[this.f1426s];
        Bundle bundle2 = this.f1427t;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        mo1595a.mSavedFragmentState = bundle2;
        return mo1595a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f1415h);
        sb2.append(" (");
        sb2.append(this.f1416i);
        sb2.append(")}:");
        if (this.f1417j) {
            sb2.append(" fromLayout");
        }
        if (this.f1419l != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f1419l));
        }
        String str = this.f1420m;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f1420m);
        }
        if (this.f1421n) {
            sb2.append(" retainInstance");
        }
        if (this.f1422o) {
            sb2.append(" removing");
        }
        if (this.f1423p) {
            sb2.append(" detached");
        }
        if (this.f1425r) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1415h);
        parcel.writeString(this.f1416i);
        parcel.writeInt(this.f1417j ? 1 : 0);
        parcel.writeInt(this.f1418k);
        parcel.writeInt(this.f1419l);
        parcel.writeString(this.f1420m);
        parcel.writeInt(this.f1421n ? 1 : 0);
        parcel.writeInt(this.f1422o ? 1 : 0);
        parcel.writeInt(this.f1423p ? 1 : 0);
        parcel.writeBundle(this.f1424q);
        parcel.writeInt(this.f1425r ? 1 : 0);
        parcel.writeBundle(this.f1427t);
        parcel.writeInt(this.f1426s);
    }
}
