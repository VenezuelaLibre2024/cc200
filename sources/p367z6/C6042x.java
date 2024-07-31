package p367z6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p252r6.InterfaceC4307b;

/* renamed from: z6.x */
/* loaded from: classes.dex */
public class C6042x extends AbstractC2601a {
    public static final Parcelable.Creator<C6042x> CREATOR = new C6047z0();

    /* renamed from: h */
    public final C5998b f22480h;

    public C6042x(IBinder iBinder) {
        this.f22480h = new C5998b(InterfaceC4307b.a.m16570c(iBinder));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5998b c5998b = this.f22480h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10484t(parcel, 2, c5998b.m24066a().asBinder(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
