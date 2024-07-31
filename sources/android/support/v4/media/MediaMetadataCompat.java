package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.MediaMetadata;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p285u.C4771a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: j */
    public static final C4771a<String, Integer> f377j;

    /* renamed from: k */
    public static final String[] f378k;

    /* renamed from: l */
    public static final String[] f379l;

    /* renamed from: m */
    public static final String[] f380m;

    /* renamed from: h */
    public final Bundle f381h;

    /* renamed from: i */
    public MediaMetadata f382i;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    /* loaded from: classes.dex */
    public static class C0120a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    static {
        C4771a<String, Integer> c4771a = new C4771a<>();
        f377j = c4771a;
        c4771a.put("android.media.metadata.TITLE", 1);
        c4771a.put("android.media.metadata.ARTIST", 1);
        c4771a.put("android.media.metadata.DURATION", 0);
        c4771a.put("android.media.metadata.ALBUM", 1);
        c4771a.put("android.media.metadata.AUTHOR", 1);
        c4771a.put("android.media.metadata.WRITER", 1);
        c4771a.put("android.media.metadata.COMPOSER", 1);
        c4771a.put("android.media.metadata.COMPILATION", 1);
        c4771a.put("android.media.metadata.DATE", 1);
        c4771a.put("android.media.metadata.YEAR", 0);
        c4771a.put("android.media.metadata.GENRE", 1);
        c4771a.put("android.media.metadata.TRACK_NUMBER", 0);
        c4771a.put("android.media.metadata.NUM_TRACKS", 0);
        c4771a.put("android.media.metadata.DISC_NUMBER", 0);
        c4771a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c4771a.put("android.media.metadata.ART", 2);
        c4771a.put("android.media.metadata.ART_URI", 1);
        c4771a.put("android.media.metadata.ALBUM_ART", 2);
        c4771a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c4771a.put("android.media.metadata.USER_RATING", 3);
        c4771a.put("android.media.metadata.RATING", 3);
        c4771a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c4771a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c4771a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c4771a.put("android.media.metadata.DISPLAY_ICON", 2);
        c4771a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c4771a.put("android.media.metadata.MEDIA_ID", 1);
        c4771a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c4771a.put("android.media.metadata.MEDIA_URI", 1);
        c4771a.put("android.media.metadata.ADVERTISEMENT", 0);
        c4771a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f378k = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f379l = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f380m = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C0120a();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f381h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m518a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f382i = mediaMetadata;
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f381h);
    }
}
