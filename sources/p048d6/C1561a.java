package p048d6;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* renamed from: d6.a */
/* loaded from: classes.dex */
public final class C1561a extends AbstractC2601a {
    public static final Parcelable.Creator<C1561a> CREATOR = new C1576i();

    /* renamed from: h */
    public final Intent f5853h;

    public C1561a(Intent intent) {
        this.f5853h = intent;
    }

    /* renamed from: I */
    public Intent m6388I() {
        return this.f5853h;
    }

    /* renamed from: J */
    public String m6389J() {
        String stringExtra = this.f5853h.getStringExtra("google.message_id");
        return stringExtra == null ? this.f5853h.getStringExtra("message_id") : stringExtra;
    }

    /* renamed from: K */
    public final Integer m6390K() {
        if (this.f5853h.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f5853h.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, this.f5853h, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
