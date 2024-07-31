package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0128a();

    /* renamed from: h */
    public final int f402h;

    /* renamed from: i */
    public final long f403i;

    /* renamed from: j */
    public final long f404j;

    /* renamed from: k */
    public final float f405k;

    /* renamed from: l */
    public final long f406l;

    /* renamed from: m */
    public final int f407m;

    /* renamed from: n */
    public final CharSequence f408n;

    /* renamed from: o */
    public final long f409o;

    /* renamed from: p */
    public List<CustomAction> f410p;

    /* renamed from: q */
    public final long f411q;

    /* renamed from: r */
    public final Bundle f412r;

    /* renamed from: s */
    public PlaybackState f413s;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0127a();

        /* renamed from: h */
        public final String f414h;

        /* renamed from: i */
        public final CharSequence f415i;

        /* renamed from: j */
        public final int f416j;

        /* renamed from: k */
        public final Bundle f417k;

        /* renamed from: l */
        public PlaybackState.CustomAction f418l;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: classes.dex */
        public static class C0127a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f414h = parcel.readString();
            this.f415i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f416j = parcel.readInt();
            this.f417k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f414h = str;
            this.f415i = charSequence;
            this.f416j = i10;
            this.f417k = bundle;
        }

        /* renamed from: a */
        public static CustomAction m546a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), customAction.getExtras());
            customAction2.f418l = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f415i) + ", mIcon=" + this.f416j + ", mExtras=" + this.f417k;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f414h);
            TextUtils.writeToParcel(this.f415i, parcel, i10);
            parcel.writeInt(this.f416j);
            parcel.writeBundle(this.f417k);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: classes.dex */
    public static class C0128a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    public PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f402h = i10;
        this.f403i = j10;
        this.f404j = j11;
        this.f405k = f10;
        this.f406l = j12;
        this.f407m = i11;
        this.f408n = charSequence;
        this.f409o = j13;
        this.f410p = new ArrayList(list);
        this.f411q = j14;
        this.f412r = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f402h = parcel.readInt();
        this.f403i = parcel.readLong();
        this.f405k = parcel.readFloat();
        this.f409o = parcel.readLong();
        this.f404j = parcel.readLong();
        this.f406l = parcel.readLong();
        this.f408n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f410p = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f411q = parcel.readLong();
        this.f412r = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f407m = parcel.readInt();
    }

    /* renamed from: a */
    public static PlaybackStateCompat m545a(Object obj) {
        ArrayList arrayList;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            Iterator<PlaybackState.CustomAction> it = customActions.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.m546a(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), Build.VERSION.SDK_INT >= 22 ? playbackState.getExtras() : null);
        playbackStateCompat.f413s = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f402h + ", position=" + this.f403i + ", buffered position=" + this.f404j + ", speed=" + this.f405k + ", updated=" + this.f409o + ", actions=" + this.f406l + ", error code=" + this.f407m + ", error message=" + this.f408n + ", custom actions=" + this.f410p + ", active item id=" + this.f411q + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f402h);
        parcel.writeLong(this.f403i);
        parcel.writeFloat(this.f405k);
        parcel.writeLong(this.f409o);
        parcel.writeLong(this.f404j);
        parcel.writeLong(this.f406l);
        TextUtils.writeToParcel(this.f408n, parcel, i10);
        parcel.writeTypedList(this.f410p);
        parcel.writeLong(this.f411q);
        parcel.writeBundle(this.f412r);
        parcel.writeInt(this.f407m);
    }
}
