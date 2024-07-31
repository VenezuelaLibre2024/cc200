package bd;

import android.annotation.TargetApi;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@TargetApi(5)
/* renamed from: bd.b */
/* loaded from: classes2.dex */
public class C0547b implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    /* renamed from: m */
    public static final String[] f2444m = {"contact_id", "display_name", "mimetype", "account_type", "account_name", "data1", "data2", "data5", "data3", "data4", "data6", "data1", "data1", "data2", "data3", "data1", "data1", "data2", "data3", "data1", "data4", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10"};

    /* renamed from: h */
    public ContentResolver f2445h;

    /* renamed from: i */
    public MethodChannel f2446i;

    /* renamed from: j */
    public b f2447j;

    /* renamed from: k */
    public Resources f2448k;

    /* renamed from: l */
    public final ExecutorService f2449l = new ThreadPoolExecutor(0, 10, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(1000));

    /* renamed from: bd.b$b */
    /* loaded from: classes2.dex */
    public class b implements PluginRegistry.ActivityResultListener {

        /* renamed from: h */
        public MethodChannel.Result f2450h;

        /* renamed from: i */
        public boolean f2451i;

        public b() {
        }

        /* renamed from: a */
        public void m2721a(Object obj) {
            MethodChannel.Result result = this.f2450h;
            if (result != null) {
                result.success(obj);
                this.f2450h = null;
            }
        }

        /* renamed from: b */
        public HashMap m2722b(String str) {
            Cursor query = C0547b.this.f2445h.query(ContactsContract.Data.CONTENT_URI, C0547b.f2444m, "contact_id = ?", new String[]{str}, null);
            try {
                ArrayList m2714o = C0547b.this.m2714o(query, this.f2451i);
                if (m2714o.size() > 0) {
                    return ((C0546a) m2714o.iterator().next()).m2698f();
                }
                return null;
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }

        /* renamed from: c */
        public void m2723c() {
            try {
                Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
                intent.putExtra("finishActivityOnSaveCompleted", true);
                mo2728h(intent, 52941);
            } catch (Exception unused) {
            }
        }

        /* renamed from: d */
        public void m2724d() {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("vnd.android.cursor.dir/contact");
            mo2728h(intent, 52943);
        }

        /* renamed from: e */
        public void m2725e(C0546a c0546a) {
            String str = c0546a.f2427h;
            try {
                if (m2722b(str) != null) {
                    Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, str);
                    Intent intent = new Intent("android.intent.action.EDIT");
                    intent.setDataAndType(withAppendedPath, "vnd.android.cursor.item/contact");
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    mo2728h(intent, 52942);
                } else {
                    m2721a(2);
                }
            } catch (Exception unused) {
                m2721a(2);
            }
        }

        /* renamed from: f */
        public void m2726f(boolean z10) {
            this.f2451i = z10;
        }

        /* renamed from: g */
        public void m2727g(MethodChannel.Result result) {
            this.f2450h = result;
        }

        /* renamed from: h */
        public void mo2728h(Intent intent, int i10) {
            throw null;
        }

        @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
        public boolean onActivityResult(int i10, int i11, Intent intent) {
            if (i10 == 52942 || i10 == 52941) {
                try {
                    m2721a(m2722b(intent.getData().getLastPathSegment()));
                } catch (NullPointerException unused) {
                    m2721a(1);
                }
                return true;
            }
            if (i10 != 52943) {
                m2721a(2);
                return false;
            }
            if (i11 == 0) {
                m2721a(1);
                return true;
            }
            Uri data = intent.getData();
            Cursor query = C0547b.this.f2445h.query(data, null, null, null, null);
            if (query.moveToFirst()) {
                C0547b.this.m2711l("openDeviceContactPicker", data.getLastPathSegment(), false, false, false, this.f2451i, this.f2450h);
            } else {
                Log.e("flutter_contacts", "onActivityResult - cursor.moveToFirst() returns false");
                m2721a(1);
            }
            query.close();
            return true;
        }
    }

    /* renamed from: bd.b$c */
    /* loaded from: classes2.dex */
    public class c extends b {

        /* renamed from: k */
        public final Context f2453k;

        /* renamed from: l */
        public ActivityPluginBinding f2454l;

        public c(Context context) {
            super();
            this.f2453k = context;
        }

        @Override // bd.C0547b.b
        /* renamed from: h */
        public void mo2728h(Intent intent, int i10) {
            if (this.f2454l == null) {
                this.f2453k.startActivity(intent);
            } else if (intent.resolveActivity(this.f2453k.getPackageManager()) != null) {
                this.f2454l.getActivity().startActivityForResult(intent, i10);
            } else {
                m2721a(2);
            }
        }

        /* renamed from: i */
        public void m2729i(ActivityPluginBinding activityPluginBinding) {
            this.f2454l = activityPluginBinding;
            activityPluginBinding.addActivityResultListener(this);
        }

        /* renamed from: j */
        public void m2730j() {
            this.f2454l.removeActivityResultListener(this);
            this.f2454l = null;
        }
    }

    /* renamed from: bd.b$d */
    /* loaded from: classes2.dex */
    public static class d extends AsyncTask<Void, Void, byte[]> {

        /* renamed from: a */
        public final C0546a f2456a;

        /* renamed from: b */
        public final boolean f2457b;

        /* renamed from: c */
        public final ContentResolver f2458c;

        /* renamed from: d */
        public final MethodChannel.Result f2459d;

        public d(C0546a c0546a, boolean z10, ContentResolver contentResolver, MethodChannel.Result result) {
            this.f2456a = c0546a;
            this.f2457b = z10;
            this.f2458c = contentResolver;
            this.f2459d = result;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public byte[] doInBackground(Void... voidArr) {
            return C0547b.m2707t(this.f2456a.f2427h, this.f2457b, this.f2458c);
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(byte[] bArr) {
            this.f2459d.success(bArr);
        }
    }

    @TargetApi(3)
    /* renamed from: bd.b$e */
    /* loaded from: classes2.dex */
    public class e extends AsyncTask<Object, Void, ArrayList<HashMap>> {

        /* renamed from: a */
        public String f2460a;

        /* renamed from: b */
        public MethodChannel.Result f2461b;

        /* renamed from: c */
        public boolean f2462c;

        /* renamed from: d */
        public boolean f2463d;

        /* renamed from: e */
        public boolean f2464e;

        /* renamed from: f */
        public boolean f2465f;

        /* renamed from: bd.b$e$a */
        /* loaded from: classes2.dex */
        public class a implements Comparator<C0546a> {
            public a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(C0546a c0546a, C0546a c0546a2) {
                return c0546a.compareTo(c0546a2);
            }
        }

        public e(String str, MethodChannel.Result result, boolean z10, boolean z11, boolean z12, boolean z13) {
            this.f2460a = str;
            this.f2461b = result;
            this.f2462c = z10;
            this.f2463d = z11;
            this.f2464e = z12;
            this.f2465f = z13;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:16:0x003b. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00bd A[LOOP:1: B:40:0x00b7->B:42:0x00bd, LOOP_END] */
        @Override // android.os.AsyncTask
        @android.annotation.TargetApi(5)
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.ArrayList<java.util.HashMap> doInBackground(java.lang.Object... r7) {
            /*
                r6 = this;
                java.lang.String r0 = r6.f2460a
                r0.hashCode()
                int r1 = r0.hashCode()
                r2 = 0
                r3 = -1
                switch(r1) {
                    case -1830951058: goto L30;
                    case -490500804: goto L25;
                    case -480477426: goto L1a;
                    case 1510448585: goto Lf;
                    default: goto Le;
                }
            Le:
                goto L3a
            Lf:
                java.lang.String r1 = "getContacts"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L18
                goto L3a
            L18:
                r3 = 3
                goto L3a
            L1a:
                java.lang.String r1 = "getContactsForPhone"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L23
                goto L3a
            L23:
                r3 = 2
                goto L3a
            L25:
                java.lang.String r1 = "getContactsForEmail"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L2e
                goto L3a
            L2e:
                r3 = 1
                goto L3a
            L30:
                java.lang.String r1 = "openDeviceContactPicker"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L39
                goto L3a
            L39:
                r3 = r2
            L3a:
                r0 = 0
                switch(r3) {
                    case 0: goto L66;
                    case 1: goto L5b;
                    case 2: goto L4a;
                    case 3: goto L3f;
                    default: goto L3e;
                }
            L3e:
                return r0
            L3f:
                bd.b r1 = bd.C0547b.this
                r7 = r7[r2]
                java.lang.String r7 = (java.lang.String) r7
                android.database.Cursor r7 = bd.C0547b.m2703e(r1, r7, r0)
                goto L70
            L4a:
                bd.b r0 = bd.C0547b.this
                r7 = r7[r2]
                java.lang.String r7 = (java.lang.String) r7
                android.database.Cursor r7 = bd.C0547b.m2704f(r0, r7)
            L54:
                boolean r1 = r6.f2465f
                java.util.ArrayList r7 = bd.C0547b.m2702d(r0, r7, r1)
                goto L76
            L5b:
                bd.b r0 = bd.C0547b.this
                r7 = r7[r2]
                java.lang.String r7 = (java.lang.String) r7
                android.database.Cursor r7 = bd.C0547b.m2705g(r0, r7)
                goto L54
            L66:
                bd.b r1 = bd.C0547b.this
                r7 = r7[r2]
                java.lang.String r7 = (java.lang.String) r7
                android.database.Cursor r7 = bd.C0547b.m2703e(r1, r0, r7)
            L70:
                boolean r0 = r6.f2465f
                java.util.ArrayList r7 = bd.C0547b.m2702d(r1, r7, r0)
            L76:
                boolean r0 = r6.f2462c
                if (r0 == 0) goto La2
                java.util.Iterator r0 = r7.iterator()
            L7e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto La2
                java.lang.Object r1 = r0.next()
                bd.a r1 = (bd.C0546a) r1
                java.lang.String r3 = r1.f2427h
                boolean r4 = r6.f2463d
                bd.b r5 = bd.C0547b.this
                android.content.ContentResolver r5 = bd.C0547b.m2699a(r5)
                byte[] r3 = bd.C0547b.m2706h(r3, r4, r5)
                if (r3 == 0) goto L9d
                r1.f2443x = r3
                goto L7e
            L9d:
                byte[] r3 = new byte[r2]
                r1.f2443x = r3
                goto L7e
            La2:
                boolean r0 = r6.f2464e
                if (r0 == 0) goto Lae
                bd.b$e$a r0 = new bd.b$e$a
                r0.<init>()
                java.util.Collections.sort(r7, r0)
            Lae:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r7 = r7.iterator()
            Lb7:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto Lcb
                java.lang.Object r1 = r7.next()
                bd.a r1 = (bd.C0546a) r1
                java.util.HashMap r1 = r1.m2698f()
                r0.add(r1)
                goto Lb7
            Lcb:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: bd.C0547b.e.doInBackground(java.lang.Object[]):java.util.ArrayList");
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ArrayList<HashMap> arrayList) {
            if (arrayList == null) {
                this.f2461b.notImplemented();
            } else {
                this.f2461b.success(arrayList);
            }
        }
    }

    /* renamed from: t */
    public static byte[] m2707t(String str, boolean z10, ContentResolver contentResolver) {
        try {
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(str)), z10);
            if (openContactPhotoInputStream == null) {
                return null;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(openContactPhotoInputStream);
            openContactPhotoInputStream.close();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            decodeStream.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e10) {
            Log.e("flutter_contacts", e10.getMessage());
            return null;
        }
    }

    /* renamed from: i */
    public final boolean m2708i(C0546a c0546a) {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", c0546a.f2429j).withValue("data5", c0546a.f2430k).withValue("data3", c0546a.f2431l).withValue("data4", c0546a.f2432m).withValue("data6", c0546a.f2433n).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/note").withValue("data1", c0546a.f2436q).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("data1", c0546a.f2434o).withValue("data4", c0546a.f2435p).build());
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("is_super_primary", 1).withValue("data15", c0546a.f2443x).withValue("mimetype", "vnd.android.cursor.item/photo");
        arrayList.add(withValue.build());
        withValue.withYieldAllowed(true);
        Iterator<C0548c> it = c0546a.f2441v.iterator();
        while (it.hasNext()) {
            C0548c next = it.next();
            ContentProviderOperation.Builder withValue2 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", next.f2469b);
            int i10 = next.f2470c;
            if (i10 == 0) {
                withValue2.withValue("data2", 0);
                withValue2.withValue("data3", next.f2468a);
            } else {
                withValue2.withValue("data2", Integer.valueOf(i10));
            }
            arrayList.add(withValue2.build());
        }
        Iterator<C0548c> it2 = c0546a.f2440u.iterator();
        while (it2.hasNext()) {
            C0548c next2 = it2.next();
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", next2.f2469b).withValue("data2", Integer.valueOf(next2.f2470c)).build());
        }
        Iterator<C0549d> it3 = c0546a.f2442w.iterator();
        while (it3.hasNext()) {
            C0549d next3 = it3.next();
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("data2", Integer.valueOf(next3.f2477g)).withValue("data3", next3.f2471a).withValue("data4", next3.f2472b).withValue("data7", next3.f2473c).withValue("data8", next3.f2475e).withValue("data9", next3.f2474d).withValue("data10", next3.f2476f).build());
        }
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/contact_event").withValue("data2", 3).withValue("data1", c0546a.f2437r).build());
        try {
            this.f2445h.applyBatch("com.android.contacts", arrayList);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: j */
    public final boolean m2709j(C0546a c0546a) {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.RawContacts.CONTENT_URI).withSelection("contact_id=?", new String[]{String.valueOf(c0546a.f2427h)}).build());
        try {
            this.f2445h.applyBatch("com.android.contacts", arrayList);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: k */
    public final void m2710k(C0546a c0546a, boolean z10, MethodChannel.Result result) {
        new d(c0546a, z10, this.f2445h, result).executeOnExecutor(this.f2449l, new Void[0]);
    }

    @TargetApi(5)
    /* renamed from: l */
    public final void m2711l(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, MethodChannel.Result result) {
        new e(str, result, z10, z11, z12, z13).executeOnExecutor(this.f2449l, str2, Boolean.FALSE);
    }

    /* renamed from: m */
    public final void m2712m(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, MethodChannel.Result result) {
        new e(str, result, z10, z11, z12, z13).executeOnExecutor(this.f2449l, str2, Boolean.TRUE);
    }

    /* renamed from: n */
    public final void m2713n(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, MethodChannel.Result result) {
        new e(str, result, z10, z11, z12, z13).executeOnExecutor(this.f2449l, str2, Boolean.TRUE);
    }

    /* renamed from: o */
    public final ArrayList<C0546a> m2714o(Cursor cursor, boolean z10) {
        ArrayList<C0548c> arrayList;
        C0548c c0548c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor != null && cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex("contact_id"));
            if (!linkedHashMap.containsKey(string)) {
                linkedHashMap.put(string, new C0546a(string));
            }
            C0546a c0546a = (C0546a) linkedHashMap.get(string);
            String string2 = cursor.getString(cursor.getColumnIndex("mimetype"));
            c0546a.f2428i = cursor.getString(cursor.getColumnIndex("display_name"));
            c0546a.f2438s = cursor.getString(cursor.getColumnIndex("account_type"));
            c0546a.f2439t = cursor.getString(cursor.getColumnIndex("account_name"));
            if (string2.equals("vnd.android.cursor.item/name")) {
                c0546a.f2429j = cursor.getString(cursor.getColumnIndex("data2"));
                c0546a.f2430k = cursor.getString(cursor.getColumnIndex("data5"));
                c0546a.f2431l = cursor.getString(cursor.getColumnIndex("data3"));
                c0546a.f2432m = cursor.getString(cursor.getColumnIndex("data4"));
                c0546a.f2433n = cursor.getString(cursor.getColumnIndex("data6"));
            } else if (string2.equals("vnd.android.cursor.item/note")) {
                c0546a.f2436q = cursor.getString(cursor.getColumnIndex("data1"));
            } else if (string2.equals("vnd.android.cursor.item/phone_v2")) {
                String string3 = cursor.getString(cursor.getColumnIndex("data1"));
                if (!TextUtils.isEmpty(string3)) {
                    int i10 = cursor.getInt(cursor.getColumnIndex("data2"));
                    String m2738c = C0548c.m2738c(this.f2448k, i10, cursor, z10);
                    arrayList = c0546a.f2441v;
                    c0548c = new C0548c(m2738c, string3, i10);
                    arrayList.add(c0548c);
                }
            } else if (string2.equals("vnd.android.cursor.item/email_v2")) {
                String string4 = cursor.getString(cursor.getColumnIndex("data1"));
                int i11 = cursor.getInt(cursor.getColumnIndex("data2"));
                if (!TextUtils.isEmpty(string4)) {
                    String m2737b = C0548c.m2737b(this.f2448k, i11, cursor, z10);
                    arrayList = c0546a.f2440u;
                    c0548c = new C0548c(m2737b, string4, i11);
                    arrayList.add(c0548c);
                }
            } else if (string2.equals("vnd.android.cursor.item/organization")) {
                c0546a.f2434o = cursor.getString(cursor.getColumnIndex("data1"));
                c0546a.f2435p = cursor.getString(cursor.getColumnIndex("data4"));
            } else if (string2.equals("vnd.android.cursor.item/postal-address_v2")) {
                int i12 = cursor.getInt(cursor.getColumnIndex("data2"));
                c0546a.f2442w.add(new C0549d(C0549d.m2741b(this.f2448k, i12, cursor, z10), cursor.getString(cursor.getColumnIndex("data4")), cursor.getString(cursor.getColumnIndex("data7")), cursor.getString(cursor.getColumnIndex("data9")), cursor.getString(cursor.getColumnIndex("data8")), cursor.getString(cursor.getColumnIndex("data10")), i12));
            } else if (string2.equals("vnd.android.cursor.item/contact_event") && cursor.getInt(cursor.getColumnIndex("data2")) == 3) {
                c0546a.f2437r = cursor.getString(cursor.getColumnIndex("data1"));
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return new ArrayList<>(linkedHashMap.values());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        b bVar = this.f2447j;
        if (bVar instanceof c) {
            ((c) bVar).m2729i(activityPluginBinding);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f2448k = flutterPluginBinding.getApplicationContext().getResources();
        m2718s(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
        this.f2447j = new c(flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        b bVar = this.f2447j;
        if (bVar instanceof c) {
            ((c) bVar).m2730j();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        b bVar = this.f2447j;
        if (bVar instanceof c) {
            ((c) bVar).m2730j();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f2446i.setMethodCallHandler(null);
        this.f2446i = null;
        this.f2445h = null;
        this.f2447j = null;
        this.f2448k = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x006b, code lost:
    
        if (r1.equals("addContact") == false) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x008e. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r11, io.flutter.plugin.common.MethodChannel.Result r12) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bd.C0547b.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        b bVar = this.f2447j;
        if (bVar instanceof c) {
            ((c) bVar).m2729i(activityPluginBinding);
        }
    }

    /* renamed from: p */
    public final Cursor m2715p(String str, String str2) {
        String str3;
        ArrayList arrayList = new ArrayList(Arrays.asList("vnd.android.cursor.item/note", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/name", "vnd.android.cursor.item/organization", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/contact_event", "account_type"));
        if (str != null) {
            arrayList = new ArrayList();
            arrayList.add(str + "%");
            str3 = "display_name LIKE ?";
        } else {
            str3 = "(mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR account_type=?)";
        }
        if (str2 != null) {
            arrayList.add(str2);
            str3 = str3 + " AND contact_id =?";
        }
        return this.f2445h.query(ContactsContract.Data.CONTENT_URI, f2444m, str3, (String[]) arrayList.toArray(new String[arrayList.size()]), null);
    }

    /* renamed from: q */
    public final Cursor m2716q(String str) {
        if (str.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList("%" + str + "%"));
        return this.f2445h.query(ContactsContract.Data.CONTENT_URI, f2444m, "data1 LIKE ?", (String[]) arrayList.toArray(new String[arrayList.size()]), null);
    }

    /* renamed from: r */
    public final Cursor m2717r(String str) {
        if (str.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f2445h.query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"_id"}, null, null, null);
        while (query != null && query.moveToNext()) {
            arrayList.add(query.getString(query.getColumnIndex("_id")));
        }
        if (query != null) {
            query.close();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return this.f2445h.query(ContactsContract.Data.CONTENT_URI, f2444m, "contact_id IN " + arrayList.toString().replace("[", "(").replace("]", ")"), null, null);
    }

    /* renamed from: s */
    public final void m2718s(BinaryMessenger binaryMessenger, Context context) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "github.com/clovisnicolas/flutter_contacts");
        this.f2446i = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f2445h = context.getContentResolver();
    }

    /* renamed from: u */
    public final void m2719u(MethodChannel.Result result, boolean z10) {
        b bVar = this.f2447j;
        if (bVar == null) {
            result.success(2);
            return;
        }
        bVar.m2727g(result);
        this.f2447j.m2726f(z10);
        this.f2447j.m2724d();
    }

    /* renamed from: v */
    public final boolean m2720v(C0546a c0546a) {
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(c0546a.f2427h), "vnd.android.cursor.item/organization"}).build());
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(c0546a.f2427h), "vnd.android.cursor.item/phone_v2"}).build());
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(c0546a.f2427h), "vnd.android.cursor.item/email_v2"}).build());
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(c0546a.f2427h), "vnd.android.cursor.item/note"}).build());
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(c0546a.f2427h), "vnd.android.cursor.item/postal-address_v2"}).build());
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(c0546a.f2427h), "vnd.android.cursor.item/photo"}).build());
        arrayList.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(c0546a.f2427h), "vnd.android.cursor.item/name"}).withValue("data2", c0546a.f2429j).withValue("data5", c0546a.f2430k).withValue("data3", c0546a.f2431l).withValue("data4", c0546a.f2432m).withValue("data6", c0546a.f2433n).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("raw_contact_id", c0546a.f2427h).withValue("data2", 1).withValue("data1", c0546a.f2434o).withValue("data4", c0546a.f2435p).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("mimetype", "vnd.android.cursor.item/note").withValue("raw_contact_id", c0546a.f2427h).withValue("data1", c0546a.f2436q).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", c0546a.f2427h).withValue("is_super_primary", 1).withValue("data15", c0546a.f2443x).withValue("mimetype", "vnd.android.cursor.item/photo").build());
        Iterator<C0548c> it = c0546a.f2441v.iterator();
        while (it.hasNext()) {
            C0548c next = it.next();
            ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("raw_contact_id", c0546a.f2427h).withValue("data1", next.f2469b);
            int i10 = next.f2470c;
            if (i10 == 0) {
                withValue.withValue("data2", 0);
                withValue.withValue("data3", next.f2468a);
            } else {
                withValue.withValue("data2", Integer.valueOf(i10));
            }
            arrayList.add(withValue.build());
        }
        Iterator<C0548c> it2 = c0546a.f2440u.iterator();
        while (it2.hasNext()) {
            C0548c next2 = it2.next();
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("raw_contact_id", c0546a.f2427h).withValue("data1", next2.f2469b).withValue("data2", Integer.valueOf(next2.f2470c)).build());
        }
        Iterator<C0549d> it3 = c0546a.f2442w.iterator();
        while (it3.hasNext()) {
            C0549d next3 = it3.next();
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("raw_contact_id", c0546a.f2427h).withValue("data2", Integer.valueOf(next3.f2477g)).withValue("data4", next3.f2472b).withValue("data7", next3.f2473c).withValue("data8", next3.f2475e).withValue("data9", next3.f2474d).withValue("data10", next3.f2476f).build());
        }
        try {
            this.f2445h.applyBatch("com.android.contacts", arrayList);
            return true;
        } catch (Exception e10) {
            Log.e("TAG", "Exception encountered while inserting contact: ");
            e10.printStackTrace();
            return false;
        }
    }
}
