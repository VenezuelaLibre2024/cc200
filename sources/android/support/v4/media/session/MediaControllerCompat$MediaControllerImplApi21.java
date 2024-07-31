package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.AbstractC0131c;
import android.support.v4.media.session.InterfaceC0130b;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p329x.C5489g;
import p362z1.C5942a;

/* loaded from: classes.dex */
public class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    public final Object f385a;

    /* renamed from: b */
    public final List<AbstractC0131c> f386b;

    /* renamed from: c */
    public HashMap<AbstractC0131c, BinderC0122a> f387c;

    /* renamed from: d */
    public final MediaSessionCompat.Token f388d;

    /* loaded from: classes.dex */
    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: h */
        public WeakReference<MediaControllerCompat$MediaControllerImplApi21> f389h;

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f389h.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f385a) {
                mediaControllerCompat$MediaControllerImplApi21.f388d.m539d(InterfaceC0130b.a.m558c(C5489g.m21795a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f388d.m540e(C5942a.m23795b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                mediaControllerCompat$MediaControllerImplApi21.m523a();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    /* loaded from: classes.dex */
    public static class BinderC0122a extends AbstractC0131c.b {
        public BinderC0122a(AbstractC0131c abstractC0131c) {
            super(abstractC0131c);
        }

        @Override // android.support.v4.media.session.AbstractC0131c.b, android.support.v4.media.session.InterfaceC0129a
        /* renamed from: A0 */
        public void mo524A0(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0131c.b, android.support.v4.media.session.InterfaceC0129a
        /* renamed from: F */
        public void mo525F(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0131c.b, android.support.v4.media.session.InterfaceC0129a
        /* renamed from: H0 */
        public void mo526H0() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0131c.b, android.support.v4.media.session.InterfaceC0129a
        /* renamed from: I0 */
        public void mo527I0(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0131c.b, android.support.v4.media.session.InterfaceC0129a
        /* renamed from: L1 */
        public void mo528L1(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0131c.b, android.support.v4.media.session.InterfaceC0129a
        /* renamed from: Q */
        public void mo529Q(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void m523a() {
        if (this.f388d.m537a() == null) {
            return;
        }
        for (AbstractC0131c abstractC0131c : this.f386b) {
            BinderC0122a binderC0122a = new BinderC0122a(abstractC0131c);
            this.f387c.put(abstractC0131c, binderC0122a);
            abstractC0131c.f421b = binderC0122a;
            try {
                this.f388d.m537a().mo557l(binderC0122a);
                abstractC0131c.m567i(13, null, null);
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
            }
        }
        this.f386b.clear();
    }
}
