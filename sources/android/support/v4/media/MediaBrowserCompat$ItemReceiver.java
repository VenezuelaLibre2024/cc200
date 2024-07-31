package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p041d.C1508b;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends C1508b {
    @Override // p041d.C1508b
    /* renamed from: a */
    public void mo502a(int i10, Bundle bundle) {
        MediaSessionCompat.m530a(bundle);
        if (i10 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
