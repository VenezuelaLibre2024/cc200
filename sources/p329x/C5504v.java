package p329x;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p345y.C5782a;

/* renamed from: x.v */
/* loaded from: classes.dex */
public final class C5504v implements Iterable<Intent> {

    /* renamed from: h */
    public final ArrayList<Intent> f20600h = new ArrayList<>();

    /* renamed from: i */
    public final Context f20601i;

    /* renamed from: x.v$a */
    /* loaded from: classes.dex */
    public interface a {
        Intent getSupportParentActivityIntent();
    }

    public C5504v(Context context) {
        this.f20601i = context;
    }

    /* renamed from: d */
    public static C5504v m22152d(Context context) {
        return new C5504v(context);
    }

    /* renamed from: a */
    public C5504v m22153a(Intent intent) {
        this.f20600h.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public C5504v m22154b(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C5492j.m21802a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f20601i.getPackageManager());
            }
            m22155c(component);
            m22153a(supportParentActivityIntent);
        }
        return this;
    }

    /* renamed from: c */
    public C5504v m22155c(ComponentName componentName) {
        int size = this.f20600h.size();
        try {
            Context context = this.f20601i;
            while (true) {
                Intent m21803b = C5492j.m21803b(context, componentName);
                if (m21803b == null) {
                    return this;
                }
                this.f20600h.add(size, m21803b);
                context = this.f20601i;
                componentName = m21803b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    /* renamed from: e */
    public void m22156e() {
        m22157h(null);
    }

    /* renamed from: h */
    public void m22157h(Bundle bundle) {
        if (this.f20600h.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f20600h.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C5782a.startActivities(this.f20601i, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f20601i.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f20600h.iterator();
    }
}
