package p347y1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p016b1.C0442a;
import p016b1.C0443b;
import p016b1.C0444c;

/* renamed from: y1.c */
/* loaded from: classes.dex */
public class C5791c {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ca, code lost:
    
        return r4;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.view.animation.Interpolator m23193a(android.content.Context r2, android.content.res.Resources r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
        /*
            int r3 = r5.getDepth()
            r4 = 0
        L5:
            int r0 = r5.next()
            r1 = 3
            if (r0 != r1) goto L12
            int r1 = r5.getDepth()
            if (r1 <= r3) goto Lca
        L12:
            r1 = 1
            if (r0 == r1) goto Lca
            r1 = 2
            if (r0 == r1) goto L19
            goto L5
        L19:
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r5)
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = "linearInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L2f
            android.view.animation.LinearInterpolator r4 = new android.view.animation.LinearInterpolator
            r4.<init>()
            goto L5
        L2f:
            java.lang.String r1 = "accelerateInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L3e
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r2, r4)
        L3c:
            r4 = r0
            goto L5
        L3e:
            java.lang.String r1 = "decelerateInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L4c
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r2, r4)
            goto L3c
        L4c:
            java.lang.String r1 = "accelerateDecelerateInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L5a
            android.view.animation.AccelerateDecelerateInterpolator r4 = new android.view.animation.AccelerateDecelerateInterpolator
            r4.<init>()
            goto L5
        L5a:
            java.lang.String r1 = "cycleInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L68
            android.view.animation.CycleInterpolator r0 = new android.view.animation.CycleInterpolator
            r0.<init>(r2, r4)
            goto L3c
        L68:
            java.lang.String r1 = "anticipateInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L76
            android.view.animation.AnticipateInterpolator r0 = new android.view.animation.AnticipateInterpolator
            r0.<init>(r2, r4)
            goto L3c
        L76:
            java.lang.String r1 = "overshootInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L84
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>(r2, r4)
            goto L3c
        L84:
            java.lang.String r1 = "anticipateOvershootInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L92
            android.view.animation.AnticipateOvershootInterpolator r0 = new android.view.animation.AnticipateOvershootInterpolator
            r0.<init>(r2, r4)
            goto L3c
        L92:
            java.lang.String r1 = "bounceInterpolator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto La1
            android.view.animation.BounceInterpolator r4 = new android.view.animation.BounceInterpolator
            r4.<init>()
            goto L5
        La1:
            java.lang.String r1 = "pathInterpolator"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Laf
            y1.f r0 = new y1.f
            r0.<init>(r2, r4, r5)
            goto L3c
        Laf:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown interpolator name: "
            r3.append(r4)
            java.lang.String r4 = r5.getName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        Lca:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p347y1.C5791c.m23193a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser):android.view.animation.Interpolator");
    }

    /* renamed from: b */
    public static Interpolator m23194b(Context context, int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i10);
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                if (i10 == 17563663) {
                    return new C0442a();
                }
                if (i10 == 17563661) {
                    return new C0443b();
                }
                if (i10 == 17563662) {
                    return new C0444c();
                }
                XmlResourceParser animation = context.getResources().getAnimation(i10);
                Interpolator m23193a = m23193a(context, context.getResources(), context.getTheme(), animation);
                if (animation != null) {
                    animation.close();
                }
                return m23193a;
            } catch (IOException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException.initCause(e10);
                throw notFoundException;
            } catch (XmlPullParserException e11) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
                notFoundException2.initCause(e11);
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
