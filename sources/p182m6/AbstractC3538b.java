package p182m6;

import android.os.Parcel;
import com.google.android.gms.common.util.VisibleForTesting;
import p108h6.C2388q;
import p108h6.C2394s;
import p125i6.InterfaceC2604d;
import p182m6.AbstractC3537a;

/* renamed from: m6.b */
/* loaded from: classes.dex */
public abstract class AbstractC3538b extends AbstractC3537a implements InterfaceC2604d {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        AbstractC3537a abstractC3537a = (AbstractC3537a) obj;
        for (AbstractC3537a.a<?, ?> aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                if (!abstractC3537a.isFieldSet(aVar) || !C2388q.m9592b(getFieldValue(aVar), abstractC3537a.getFieldValue(aVar))) {
                    return false;
                }
            } else if (abstractC3537a.isFieldSet(aVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // p182m6.AbstractC3537a
    @VisibleForTesting
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int i10 = 0;
        for (AbstractC3537a.a<?, ?> aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                i10 = (i10 * 31) + C2394s.m9619l(getFieldValue(aVar)).hashCode();
            }
        }
        return i10;
    }

    @Override // p182m6.AbstractC3537a
    @VisibleForTesting
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }

    public byte[] toByteArray() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
