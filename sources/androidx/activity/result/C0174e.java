package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import td.C4747g;
import td.C4753m;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.e */
/* loaded from: classes.dex */
public final class C0174e implements Parcelable {

    /* renamed from: h */
    public final IntentSender f513h;

    /* renamed from: i */
    public final Intent f514i;

    /* renamed from: j */
    public final int f515j;

    /* renamed from: k */
    public final int f516k;

    /* renamed from: l */
    public static final c f512l = new c(null);
    public static final Parcelable.Creator<C0174e> CREATOR = new b();

    /* renamed from: androidx.activity.result.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final IntentSender f517a;

        /* renamed from: b */
        public Intent f518b;

        /* renamed from: c */
        public int f519c;

        /* renamed from: d */
        public int f520d;

        public a(IntentSender intentSender) {
            C4753m.m18653f(intentSender, "intentSender");
            this.f517a = intentSender;
        }

        /* renamed from: a */
        public final C0174e m633a() {
            return new C0174e(this.f517a, this.f518b, this.f519c, this.f520d);
        }

        /* renamed from: b */
        public final a m634b(Intent intent) {
            this.f518b = intent;
            return this;
        }

        /* renamed from: c */
        public final a m635c(int i10, int i11) {
            this.f520d = i10;
            this.f519c = i11;
            return this;
        }
    }

    /* renamed from: androidx.activity.result.e$b */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<C0174e> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0174e createFromParcel(Parcel parcel) {
            C4753m.m18653f(parcel, "inParcel");
            return new C0174e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0174e[] newArray(int i10) {
            return new C0174e[i10];
        }
    }

    /* renamed from: androidx.activity.result.e$c */
    /* loaded from: classes.dex */
    public static final class c {
        public c() {
        }

        public /* synthetic */ c(C4747g c4747g) {
            this();
        }
    }

    public C0174e(IntentSender intentSender, Intent intent, int i10, int i11) {
        C4753m.m18653f(intentSender, "intentSender");
        this.f513h = intentSender;
        this.f514i = intent;
        this.f515j = i10;
        this.f516k = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0174e(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            td.C4753m.m18653f(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            td.C4753m.m18650c(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.C0174e.<init>(android.os.Parcel):void");
    }

    /* renamed from: a */
    public final Intent m629a() {
        return this.f514i;
    }

    /* renamed from: b */
    public final int m630b() {
        return this.f515j;
    }

    /* renamed from: d */
    public final int m631d() {
        return this.f516k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final IntentSender m632e() {
        return this.f513h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C4753m.m18653f(parcel, "dest");
        parcel.writeParcelable(this.f513h, i10);
        parcel.writeParcelable(this.f514i, i10);
        parcel.writeInt(this.f515j);
        parcel.writeInt(this.f516k);
    }
}
