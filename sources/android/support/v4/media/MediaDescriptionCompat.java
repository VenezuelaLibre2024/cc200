package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0118a();

    /* renamed from: h */
    public final String f360h;

    /* renamed from: i */
    public final CharSequence f361i;

    /* renamed from: j */
    public final CharSequence f362j;

    /* renamed from: k */
    public final CharSequence f363k;

    /* renamed from: l */
    public final Bitmap f364l;

    /* renamed from: m */
    public final Uri f365m;

    /* renamed from: n */
    public final Bundle f366n;

    /* renamed from: o */
    public final Uri f367o;

    /* renamed from: p */
    public MediaDescription f368p;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes.dex */
    public static class C0118a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m505a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    /* loaded from: classes.dex */
    public static final class C0119b {

        /* renamed from: a */
        public String f369a;

        /* renamed from: b */
        public CharSequence f370b;

        /* renamed from: c */
        public CharSequence f371c;

        /* renamed from: d */
        public CharSequence f372d;

        /* renamed from: e */
        public Bitmap f373e;

        /* renamed from: f */
        public Uri f374f;

        /* renamed from: g */
        public Bundle f375g;

        /* renamed from: h */
        public Uri f376h;

        /* renamed from: a */
        public MediaDescriptionCompat m509a() {
            return new MediaDescriptionCompat(this.f369a, this.f370b, this.f371c, this.f372d, this.f373e, this.f374f, this.f375g, this.f376h);
        }

        /* renamed from: b */
        public C0119b m510b(CharSequence charSequence) {
            this.f372d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0119b m511c(Bundle bundle) {
            this.f375g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0119b m512d(Bitmap bitmap) {
            this.f373e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0119b m513e(Uri uri) {
            this.f374f = uri;
            return this;
        }

        /* renamed from: f */
        public C0119b m514f(String str) {
            this.f369a = str;
            return this;
        }

        /* renamed from: g */
        public C0119b m515g(Uri uri) {
            this.f376h = uri;
            return this;
        }

        /* renamed from: h */
        public C0119b m516h(CharSequence charSequence) {
            this.f371c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0119b m517i(CharSequence charSequence) {
            this.f370b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.f360h = parcel.readString();
        this.f361i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f362j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f363k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f364l = (Bitmap) parcel.readParcelable(classLoader);
        this.f365m = (Uri) parcel.readParcelable(classLoader);
        this.f366n = parcel.readBundle(classLoader);
        this.f367o = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f360h = str;
        this.f361i = charSequence;
        this.f362j = charSequence2;
        this.f363k = charSequence3;
        this.f364l = bitmap;
        this.f365m = uri;
        this.f366n = bundle;
        this.f367o = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.support.v4.media.MediaDescriptionCompat m505a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L80
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L80
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = r9.getMediaId()
            r2.m514f(r3)
            java.lang.CharSequence r3 = r9.getTitle()
            r2.m517i(r3)
            java.lang.CharSequence r3 = r9.getSubtitle()
            r2.m516h(r3)
            java.lang.CharSequence r3 = r9.getDescription()
            r2.m510b(r3)
            android.graphics.Bitmap r3 = r9.getIconBitmap()
            r2.m512d(r3)
            android.net.Uri r3 = r9.getIconUri()
            r2.m513e(r3)
            android.os.Bundle r3 = r9.getExtras()
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4c
            android.support.v4.media.session.MediaSessionCompat.m530a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L4d
        L4c:
            r5 = r0
        L4d:
            if (r5 == 0) goto L65
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L5f
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L5f
            goto L66
        L5f:
            r3.remove(r4)
            r3.remove(r6)
        L65:
            r0 = r3
        L66:
            r2.m511c(r0)
            if (r5 == 0) goto L6f
            r2.m515g(r5)
            goto L7a
        L6f:
            r0 = 23
            if (r1 < r0) goto L7a
            android.net.Uri r0 = r9.getMediaUri()
            r2.m515g(r0)
        L7a:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.m509a()
            r0.f368p = r9
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.m505a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object m506b() {
        int i10;
        MediaDescription mediaDescription = this.f368p;
        if (mediaDescription != null || (i10 = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f360h);
        builder.setTitle(this.f361i);
        builder.setSubtitle(this.f362j);
        builder.setDescription(this.f363k);
        builder.setIconBitmap(this.f364l);
        builder.setIconUri(this.f365m);
        Bundle bundle = this.f366n;
        if (i10 < 23 && this.f367o != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f367o);
        }
        builder.setExtras(bundle);
        if (i10 >= 23) {
            builder.setMediaUri(this.f367o);
        }
        MediaDescription build = builder.build();
        this.f368p = build;
        return build;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f361i) + ", " + ((Object) this.f362j) + ", " + ((Object) this.f363k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((MediaDescription) m506b()).writeToParcel(parcel, i10);
            return;
        }
        parcel.writeString(this.f360h);
        TextUtils.writeToParcel(this.f361i, parcel, i10);
        TextUtils.writeToParcel(this.f362j, parcel, i10);
        TextUtils.writeToParcel(this.f363k, parcel, i10);
        parcel.writeParcelable(this.f364l, i10);
        parcel.writeParcelable(this.f365m, i10);
        parcel.writeBundle(this.f366n);
        parcel.writeParcelable(this.f367o, i10);
    }
}
