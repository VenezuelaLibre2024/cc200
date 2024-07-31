package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.InterfaceC0129a;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
/* loaded from: classes.dex */
public abstract class AbstractC0131c implements IBinder.DeathRecipient {

    /* renamed from: a */
    public final MediaController.Callback f420a;

    /* renamed from: b */
    public InterfaceC0129a f421b;

    /* renamed from: android.support.v4.media.session.c$a */
    /* loaded from: classes.dex */
    public static class a extends MediaController.Callback {

        /* renamed from: a */
        public final WeakReference<AbstractC0131c> f422a;

        public a(AbstractC0131c abstractC0131c) {
            this.f422a = new WeakReference<>(abstractC0131c);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            AbstractC0131c abstractC0131c = this.f422a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m559a(new C0132d(playbackInfo.getPlaybackType(), AudioAttributesCompat.m1895c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m530a(bundle);
            AbstractC0131c abstractC0131c = this.f422a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m560b(bundle);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            AbstractC0131c abstractC0131c = this.f422a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m561c(MediaMetadataCompat.m518a(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            AbstractC0131c abstractC0131c = this.f422a.get();
            if (abstractC0131c == null || abstractC0131c.f421b != null) {
                return;
            }
            abstractC0131c.m562d(PlaybackStateCompat.m545a(playbackState));
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            AbstractC0131c abstractC0131c = this.f422a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m563e(MediaSessionCompat.QueueItem.m532b(list));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            AbstractC0131c abstractC0131c = this.f422a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m564f(charSequence);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            AbstractC0131c abstractC0131c = this.f422a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m565g();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m530a(bundle);
            AbstractC0131c abstractC0131c = this.f422a.get();
            if (abstractC0131c != null) {
                if (abstractC0131c.f421b == null || Build.VERSION.SDK_INT >= 23) {
                    abstractC0131c.m566h(str, bundle);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$b */
    /* loaded from: classes.dex */
    public static class b extends InterfaceC0129a.a {

        /* renamed from: a */
        public final WeakReference<AbstractC0131c> f423a;

        public b(AbstractC0131c abstractC0131c) {
            this.f423a = new WeakReference<>(abstractC0131c);
        }

        /* renamed from: A0 */
        public void mo524A0(CharSequence charSequence) {
            AbstractC0131c abstractC0131c = this.f423a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m567i(6, charSequence, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0129a
        /* renamed from: E */
        public void mo551E() {
            AbstractC0131c abstractC0131c = this.f423a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m567i(13, null, null);
            }
        }

        /* renamed from: F */
        public void mo525F(Bundle bundle) {
            AbstractC0131c abstractC0131c = this.f423a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m567i(7, bundle, null);
            }
        }

        /* renamed from: H0 */
        public void mo526H0() {
            AbstractC0131c abstractC0131c = this.f423a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m567i(8, null, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0129a
        /* renamed from: H1 */
        public void mo552H1(PlaybackStateCompat playbackStateCompat) {
            AbstractC0131c abstractC0131c = this.f423a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m567i(2, playbackStateCompat, null);
            }
        }

        /* renamed from: I0 */
        public void mo527I0(MediaMetadataCompat mediaMetadataCompat) {
            AbstractC0131c abstractC0131c = this.f423a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m567i(3, mediaMetadataCompat, null);
            }
        }

        /* renamed from: L1 */
        public void mo528L1(ParcelableVolumeInfo parcelableVolumeInfo) {
            AbstractC0131c abstractC0131c = this.f423a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m567i(4, parcelableVolumeInfo != null ? new C0132d(parcelableVolumeInfo.f397h, parcelableVolumeInfo.f398i, parcelableVolumeInfo.f399j, parcelableVolumeInfo.f400k, parcelableVolumeInfo.f401l) : null, null);
            }
        }

        /* renamed from: Q */
        public void mo529Q(List<MediaSessionCompat.QueueItem> list) {
            AbstractC0131c abstractC0131c = this.f423a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m567i(5, list, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0129a
        /* renamed from: Y0 */
        public void mo553Y0(int i10) {
            AbstractC0131c abstractC0131c = this.f423a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m567i(12, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0129a
        /* renamed from: f */
        public void mo554f(String str, Bundle bundle) {
            AbstractC0131c abstractC0131c = this.f423a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m567i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0129a
        /* renamed from: j0 */
        public void mo555j0(boolean z10) {
            AbstractC0131c abstractC0131c = this.f423a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m567i(11, Boolean.valueOf(z10), null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0129a
        public void onRepeatModeChanged(int i10) {
            AbstractC0131c abstractC0131c = this.f423a.get();
            if (abstractC0131c != null) {
                abstractC0131c.m567i(9, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0129a
        /* renamed from: z0 */
        public void mo556z0(boolean z10) {
        }
    }

    public AbstractC0131c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f420a = new a(this);
        } else {
            this.f420a = null;
            this.f421b = new b(this);
        }
    }

    /* renamed from: a */
    public void m559a(C0132d c0132d) {
    }

    /* renamed from: b */
    public void m560b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m567i(8, null, null);
    }

    /* renamed from: c */
    public void m561c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void m562d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void m563e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void m564f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void m565g() {
    }

    /* renamed from: h */
    public void m566h(String str, Bundle bundle) {
    }

    /* renamed from: i */
    public void m567i(int i10, Object obj, Bundle bundle) {
    }
}
