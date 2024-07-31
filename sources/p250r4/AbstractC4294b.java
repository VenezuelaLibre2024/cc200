package p250r4;

import p152k4.C3348a;

/* renamed from: r4.b */
/* loaded from: classes.dex */
public abstract class AbstractC4294b implements C3348a.b {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
