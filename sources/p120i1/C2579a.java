package p120i1;

import android.app.Notification;
import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.media.C0376a;
import androidx.media.C0377b;
import androidx.media.C0378c;
import p329x.C5494l;
import p329x.InterfaceC5493k;

/* renamed from: i1.a */
/* loaded from: classes.dex */
public class C2579a extends C5494l.j {

    /* renamed from: e */
    public int[] f10135e = null;

    /* renamed from: f */
    public MediaSessionCompat.Token f10136f;

    /* renamed from: g */
    public boolean f10137g;

    /* renamed from: h */
    public PendingIntent f10138h;

    /* renamed from: A */
    public final RemoteViews m10328A(C5494l.a aVar) {
        boolean z10 = aVar.m21813a() == null;
        RemoteViews remoteViews = new RemoteViews(this.f20528a.f20480a.getPackageName(), C0378c.f1797a);
        int i10 = C0376a.f1792a;
        remoteViews.setImageViewResource(i10, aVar.m21817e());
        if (!z10) {
            remoteViews.setOnClickPendingIntent(i10, aVar.m21813a());
        }
        if (Build.VERSION.SDK_INT >= 15) {
            remoteViews.setContentDescription(i10, aVar.m21822j());
        }
        return remoteViews;
    }

    /* renamed from: B */
    public int m10329B(int i10) {
        return i10 <= 3 ? C0378c.f1799c : C0378c.f1798b;
    }

    /* renamed from: C */
    public int m10330C() {
        return C0378c.f1800d;
    }

    @Override // p329x.C5494l.j
    /* renamed from: b */
    public void mo10331b(InterfaceC5493k interfaceC5493k) {
        if (Build.VERSION.SDK_INT >= 21) {
            interfaceC5493k.mo21811a().setStyle(m10334x(new Notification.MediaStyle()));
        } else if (this.f10137g) {
            interfaceC5493k.mo21811a().setOngoing(true);
        }
    }

    @Override // p329x.C5494l.j
    /* renamed from: s */
    public RemoteViews mo10332s(InterfaceC5493k interfaceC5493k) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return m10335y();
    }

    @Override // p329x.C5494l.j
    /* renamed from: t */
    public RemoteViews mo10333t(InterfaceC5493k interfaceC5493k) {
        if (Build.VERSION.SDK_INT >= 21) {
            return null;
        }
        return m10336z();
    }

    /* renamed from: x */
    public Notification.MediaStyle m10334x(Notification.MediaStyle mediaStyle) {
        int[] iArr = this.f10135e;
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        MediaSessionCompat.Token token = this.f10136f;
        if (token != null) {
            mediaStyle.setMediaSession((MediaSession.Token) token.m538b());
        }
        return mediaStyle;
    }

    /* renamed from: y */
    public RemoteViews m10335y() {
        int min = Math.min(this.f20528a.f20481b.size(), 5);
        RemoteViews m21997c = m21997c(false, m10329B(min), false);
        m21997c.removeAllViews(C0376a.f1795d);
        if (min > 0) {
            for (int i10 = 0; i10 < min; i10++) {
                m21997c.addView(C0376a.f1795d, m10328A(this.f20528a.f20481b.get(i10)));
            }
        }
        if (this.f10137g) {
            int i11 = C0376a.f1793b;
            m21997c.setViewVisibility(i11, 0);
            m21997c.setInt(i11, "setAlpha", this.f20528a.f20480a.getResources().getInteger(C0377b.f1796a));
            m21997c.setOnClickPendingIntent(i11, this.f10138h);
        } else {
            m21997c.setViewVisibility(C0376a.f1793b, 8);
        }
        return m21997c;
    }

    /* renamed from: z */
    public RemoteViews m10336z() {
        RemoteViews m21997c = m21997c(false, m10330C(), true);
        int size = this.f20528a.f20481b.size();
        int[] iArr = this.f10135e;
        int min = iArr == null ? 0 : Math.min(iArr.length, 3);
        m21997c.removeAllViews(C0376a.f1795d);
        if (min > 0) {
            for (int i10 = 0; i10 < min; i10++) {
                if (i10 >= size) {
                    throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i10), Integer.valueOf(size - 1)));
                }
                m21997c.addView(C0376a.f1795d, m10328A(this.f20528a.f20481b.get(this.f10135e[i10])));
            }
        }
        if (this.f10137g) {
            m21997c.setViewVisibility(C0376a.f1794c, 8);
            int i11 = C0376a.f1793b;
            m21997c.setViewVisibility(i11, 0);
            m21997c.setOnClickPendingIntent(i11, this.f10138h);
            m21997c.setInt(i11, "setAlpha", this.f20528a.f20480a.getResources().getInteger(C0377b.f1796a));
        } else {
            m21997c.setViewVisibility(C0376a.f1794c, 0);
            m21997c.setViewVisibility(C0376a.f1793b, 8);
        }
        return m21997c;
    }
}
