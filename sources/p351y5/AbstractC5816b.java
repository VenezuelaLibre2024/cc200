package p351y5;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.Task;
import p079f6.AbstractC1845e;
import p079f6.C1841a;

/* renamed from: y5.b */
/* loaded from: classes.dex */
public abstract class AbstractC5816b extends AbstractC1845e<C1841a.d.c> {
    private static final C1841a.g zza;
    private static final C1841a.a zzb;
    private static final C1841a zzc;

    static {
        C1841a.g gVar = new C1841a.g();
        zza = gVar;
        C5817c c5817c = new C5817c();
        zzb = c5817c;
        zzc = new C1841a("SmsRetriever.API", c5817c, gVar);
    }

    public AbstractC5816b(Activity activity) {
        super(activity, (C1841a<C1841a.d.c>) zzc, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    public AbstractC5816b(Context context) {
        super(context, (C1841a<C1841a.d.c>) zzc, C1841a.d.f7031d, AbstractC1845e.a.f7033c);
    }

    public abstract Task<Void> startSmsRetriever();

    public abstract Task<Void> startSmsUserConsent(String str);
}
