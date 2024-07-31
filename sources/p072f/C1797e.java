package p072f;

import android.content.Context;
import android.content.Intent;
import gd.C2236j;
import gd.C2240n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p072f.AbstractC1793a;
import p115hd.C2486d0;
import p115hd.C2488e0;
import p115hd.C2497j;
import p115hd.C2510v;
import p343xd.C5767k;
import p345y.C5782a;
import td.C4747g;
import td.C4753m;

/* renamed from: f.e */
/* loaded from: classes.dex */
public final class C1797e extends AbstractC1793a<String[], Map<String, Boolean>> {

    /* renamed from: a */
    public static final a f6606a = new a(null);

    /* renamed from: f.e$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final Intent m7265a(String[] strArr) {
            C4753m.m18653f(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            C4753m.m18652e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    @Override // p072f.AbstractC1793a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo1750a(Context context, String[] strArr) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(strArr, "input");
        return f6606a.m7265a(strArr);
    }

    @Override // p072f.AbstractC1793a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC1793a.a<Map<String, Boolean>> mo7245b(Context context, String[] strArr) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(strArr, "input");
        boolean z10 = true;
        if (strArr.length == 0) {
            return new AbstractC1793a.a<>(C2488e0.m9896d());
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(C5782a.checkSelfPermission(context, strArr[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (!z10) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5767k.m22904a(C2486d0.m9892a(strArr.length), 16));
        for (String str : strArr) {
            C2236j m8977a = C2240n.m8977a(str, Boolean.TRUE);
            linkedHashMap.put(m8977a.m8963c(), m8977a.m8964d());
        }
        return new AbstractC1793a.a<>(linkedHashMap);
    }

    @Override // p072f.AbstractC1793a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> mo1751c(int i10, Intent intent) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return C2488e0.m9896d();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i11 == 0));
            }
            return C2488e0.m9902j(C2510v.m10014Q(C2497j.m9964i(stringArrayExtra), arrayList));
        }
        return C2488e0.m9896d();
    }
}
