package p103h1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

@Deprecated
/* renamed from: h1.a */
/* loaded from: classes.dex */
public final class C2281a {

    /* renamed from: f */
    public static final Object f9161f = new Object();

    /* renamed from: g */
    public static C2281a f9162g;

    /* renamed from: a */
    public final Context f9163a;

    /* renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f9164b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, ArrayList<c>> f9165c = new HashMap<>();

    /* renamed from: d */
    public final ArrayList<b> f9166d = new ArrayList<>();

    /* renamed from: e */
    public final Handler f9167e;

    /* renamed from: h1.a$a */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C2281a.this.m9280a();
            }
        }
    }

    /* renamed from: h1.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final Intent f9169a;

        /* renamed from: b */
        public final ArrayList<c> f9170b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f9169a = intent;
            this.f9170b = arrayList;
        }
    }

    /* renamed from: h1.a$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final IntentFilter f9171a;

        /* renamed from: b */
        public final BroadcastReceiver f9172b;

        /* renamed from: c */
        public boolean f9173c;

        /* renamed from: d */
        public boolean f9174d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f9171a = intentFilter;
            this.f9172b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f9172b);
            sb2.append(" filter=");
            sb2.append(this.f9171a);
            if (this.f9174d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public C2281a(Context context) {
        this.f9163a = context;
        this.f9167e = new a(context.getMainLooper());
    }

    /* renamed from: b */
    public static C2281a m9279b(Context context) {
        C2281a c2281a;
        synchronized (f9161f) {
            if (f9162g == null) {
                f9162g = new C2281a(context.getApplicationContext());
            }
            c2281a = f9162g;
        }
        return c2281a;
    }

    /* renamed from: a */
    public void m9280a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f9164b) {
                size = this.f9166d.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f9166d.toArray(bVarArr);
                this.f9166d.clear();
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f9170b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = bVar.f9170b.get(i11);
                    if (!cVar.f9174d) {
                        cVar.f9172b.onReceive(this.f9163a, bVar.f9169a);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m9281c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f9164b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f9164b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f9164b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList<c> arrayList2 = this.f9165c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f9165c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* renamed from: d */
    public boolean m9282d(Intent intent) {
        int i10;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f9164b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f9163a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z10 = (intent.getFlags() & 8) != 0;
            if (z10) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f9165c.get(intent.getAction());
            if (arrayList3 != null) {
                if (z10) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i11 = 0;
                while (i11 < arrayList3.size()) {
                    c cVar = arrayList3.get(i11);
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f9171a);
                    }
                    if (cVar.f9173c) {
                        if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i10 = i11;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = resolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i10 = i11;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = resolveTypeIfNeeded;
                        int match = cVar.f9171a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f9173c = true;
                            i11 = i10 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            resolveTypeIfNeeded = str2;
                        } else if (z10) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : ImagePickerCache.MAP_KEY_TYPE : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i11 = i10 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    resolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i12 = 0; i12 < arrayList5.size(); i12++) {
                        ((c) arrayList5.get(i12)).f9173c = false;
                    }
                    this.f9166d.add(new b(intent, arrayList5));
                    if (!this.f9167e.hasMessages(1)) {
                        this.f9167e.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public void m9283e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f9164b) {
            ArrayList<c> remove = this.f9164b.remove(broadcastReceiver);
            if (remove == null) {
                return;
            }
            for (int size = remove.size() - 1; size >= 0; size--) {
                c cVar = remove.get(size);
                cVar.f9174d = true;
                for (int i10 = 0; i10 < cVar.f9171a.countActions(); i10++) {
                    String action = cVar.f9171a.getAction(i10);
                    ArrayList<c> arrayList = this.f9165c.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f9172b == broadcastReceiver) {
                                cVar2.f9174d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f9165c.remove(action);
                        }
                    }
                }
            }
        }
    }
}
