package com.mr.flutter.plugin.filepicker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p329x.C5484b;
import p345y.C5782a;

/* renamed from: com.mr.flutter.plugin.filepicker.b */
/* loaded from: classes.dex */
public class C1397b implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: r */
    public static final int f5344r = (FilePickerPlugin.class.hashCode() + 43) & 65535;

    /* renamed from: s */
    public static final int f5345s = (FilePickerPlugin.class.hashCode() + 83) & 65535;

    /* renamed from: h */
    public final Activity f5346h;

    /* renamed from: i */
    public final d f5347i;

    /* renamed from: j */
    public MethodChannel.Result f5348j;

    /* renamed from: k */
    public boolean f5349k;

    /* renamed from: l */
    public boolean f5350l;

    /* renamed from: m */
    public String f5351m;

    /* renamed from: n */
    public int f5352n;

    /* renamed from: o */
    public String[] f5353o;

    /* renamed from: p */
    public EventChannel.EventSink f5354p;

    /* renamed from: q */
    public byte[] f5355q;

    /* renamed from: com.mr.flutter.plugin.filepicker.b$a */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a */
        public final /* synthetic */ Activity f5356a;

        public a(Activity activity) {
            this.f5356a = activity;
        }

        @Override // com.mr.flutter.plugin.filepicker.C1397b.d
        public void askForPermission(String str, int i10) {
            C5484b.m21745g(this.f5356a, new String[]{str}, i10);
        }

        @Override // com.mr.flutter.plugin.filepicker.C1397b.d
        public boolean isPermissionGranted(String str) {
            return C5782a.checkSelfPermission(this.f5356a, str) == 0;
        }
    }

    /* renamed from: com.mr.flutter.plugin.filepicker.b$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ Intent f5357h;

        public b(Intent intent) {
            this.f5357h = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1397b c1397b;
            String str;
            Uri uri;
            C1396a m5999m;
            if (this.f5357h != null) {
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                if (this.f5357h.getClipData() != null) {
                    int itemCount = this.f5357h.getClipData().getItemCount();
                    while (i10 < itemCount) {
                        Uri uri2 = this.f5357h.getClipData().getItemAt(i10).getUri();
                        if (Objects.equals(C1397b.this.f5351m, "image/*") && C1397b.this.f5352n > 0) {
                            uri2 = C1398c.m5988b(uri2, C1397b.this.f5352n, C1397b.this.f5346h.getApplicationContext());
                        }
                        C1396a m5999m2 = C1398c.m5999m(C1397b.this.f5346h, uri2, C1397b.this.f5350l);
                        if (m5999m2 != null) {
                            arrayList.add(m5999m2);
                            Log.d("FilePickerDelegate", "[MultiFilePick] File #" + i10 + " - URI: " + uri2.getPath());
                        }
                        i10++;
                    }
                } else if (this.f5357h.getData() != null) {
                    Uri data = this.f5357h.getData();
                    if (Objects.equals(C1397b.this.f5351m, "image/*") && C1397b.this.f5352n > 0) {
                        data = C1398c.m5988b(data, C1397b.this.f5352n, C1397b.this.f5346h.getApplicationContext());
                    }
                    if (C1397b.this.f5351m.equals("dir") && Build.VERSION.SDK_INT >= 21) {
                        Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(data, DocumentsContract.getTreeDocumentId(data));
                        Log.d("FilePickerDelegate", "[SingleFilePick] File URI:" + buildDocumentUriUsingTree.toString());
                        String m5993g = C1398c.m5993g(buildDocumentUriUsingTree, C1397b.this.f5346h);
                        if (m5993g != null) {
                            C1397b.this.m5980m(m5993g);
                            return;
                        } else {
                            C1397b.this.m5979l("unknown_path", "Failed to retrieve directory path.");
                            return;
                        }
                    }
                    C1396a m5999m3 = C1398c.m5999m(C1397b.this.f5346h, data, C1397b.this.f5350l);
                    if (m5999m3 != null) {
                        arrayList.add(m5999m3);
                    }
                    if (arrayList.isEmpty()) {
                        c1397b = C1397b.this;
                        str = "Failed to retrieve path.";
                        c1397b.m5979l("unknown_path", str);
                        return;
                    } else {
                        Log.d("FilePickerDelegate", "File path:" + arrayList.toString());
                    }
                } else if (this.f5357h.getExtras() != null) {
                    Bundle extras = this.f5357h.getExtras();
                    if (!extras.keySet().contains("selectedItems")) {
                        c1397b = C1397b.this;
                        str = "Failed to retrieve path from bundle.";
                        c1397b.m5979l("unknown_path", str);
                        return;
                    }
                    ArrayList m5981n = C1397b.this.m5981n(extras);
                    if (m5981n != null) {
                        Iterator it = m5981n.iterator();
                        while (it.hasNext()) {
                            Parcelable parcelable = (Parcelable) it.next();
                            if ((parcelable instanceof Uri) && (m5999m = C1398c.m5999m(C1397b.this.f5346h, (uri = (Uri) parcelable), C1397b.this.f5350l)) != null) {
                                arrayList.add(m5999m);
                                Log.d("FilePickerDelegate", "[MultiFilePick] File #" + i10 + " - URI: " + uri.getPath());
                            }
                            i10++;
                        }
                    }
                }
                C1397b.this.m5980m(arrayList);
                return;
            }
            C1397b.this.m5979l("unknown_activity", "Unknown activity error, please fill an issue.");
        }
    }

    /* renamed from: com.mr.flutter.plugin.filepicker.b$c */
    /* loaded from: classes.dex */
    public class c extends Handler {

        /* renamed from: a */
        public final /* synthetic */ boolean f5359a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Looper looper, boolean z10) {
            super(looper);
            this.f5359a = z10;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C1397b.this.f5354p.success(Boolean.valueOf(this.f5359a));
        }
    }

    /* renamed from: com.mr.flutter.plugin.filepicker.b$d */
    /* loaded from: classes.dex */
    public interface d {
        void askForPermission(String str, int i10);

        boolean isPermissionGranted(String str);
    }

    public C1397b(Activity activity) {
        this(activity, null, new a(activity));
    }

    public C1397b(Activity activity, MethodChannel.Result result, d dVar) {
        this.f5349k = false;
        this.f5350l = false;
        this.f5352n = 20;
        this.f5346h = activity;
        this.f5348j = result;
        this.f5347i = dVar;
    }

    /* renamed from: k */
    public static void m5976k(MethodChannel.Result result) {
        result.error("already_active", "File picker is already active", null);
    }

    /* renamed from: i */
    public final void m5977i() {
        this.f5348j = null;
    }

    /* renamed from: j */
    public final void m5978j(boolean z10) {
        if (this.f5354p == null || this.f5351m.equals("dir")) {
            return;
        }
        new c(Looper.getMainLooper(), z10).obtainMessage().sendToTarget();
    }

    /* renamed from: l */
    public final void m5979l(String str, String str2) {
        if (this.f5348j == null) {
            return;
        }
        m5978j(false);
        this.f5348j.error(str, str2, null);
        m5977i();
    }

    /* renamed from: m */
    public final void m5980m(Object obj) {
        m5978j(false);
        if (this.f5348j != null) {
            if (obj != null && !(obj instanceof String)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1396a) it.next()).m5961a());
                }
                obj = arrayList;
            }
            this.f5348j.success(obj);
            m5977i();
        }
    }

    /* renamed from: n */
    public final ArrayList<Parcelable> m5981n(Bundle bundle) {
        return Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("selectedItems", Parcelable.class) : bundle.getParcelableArrayList("selectedItems");
    }

    /* renamed from: o */
    public void m5982o(String str, String str2, String str3, String[] strArr, byte[] bArr, MethodChannel.Result result) {
        if (!m5984q(result)) {
            m5976k(result);
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        if (str != null && !str.isEmpty()) {
            intent.putExtra("android.intent.extra.TITLE", str);
        }
        this.f5355q = bArr;
        if (str2 == null || "dir".equals(str2) || str2.split(",").length != 1) {
            intent.setType("*/*");
        } else {
            intent.setType(str2);
        }
        if (str3 != null && !str3.isEmpty() && Build.VERSION.SDK_INT >= 26) {
            intent.putExtra("android.provider.extra.INITIAL_URI", Uri.parse(str3));
        }
        if (strArr != null && strArr.length > 0) {
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        }
        if (intent.resolveActivity(this.f5346h.getPackageManager()) != null) {
            this.f5346h.startActivityForResult(intent, f5345s);
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            m5979l("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != f5345s) {
            if (this.f5351m == null) {
                return false;
            }
            int i12 = f5344r;
            if (i10 == i12 && i11 == -1) {
                m5978j(true);
                new Thread(new b(intent)).start();
                return true;
            }
            if (i10 == i12 && i11 == 0) {
                Log.i("FilePickerDelegate", "User cancelled the picker request");
                m5980m(null);
                return true;
            }
            if (i10 == i12) {
                m5979l("unknown_activity", "Unknown activity error, please fill an issue.");
            }
            return false;
        }
        if (i11 == -1) {
            m5978j(true);
            Uri data = intent.getData();
            if (data != null) {
                String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + File.separator + C1398c.m5992f(data, this.f5346h);
                try {
                    OutputStream openOutputStream = this.f5346h.getContentResolver().openOutputStream(data);
                    if (openOutputStream != null) {
                        openOutputStream.write(this.f5355q);
                        openOutputStream.flush();
                        openOutputStream.close();
                    }
                    m5980m(str);
                    return true;
                } catch (IOException e10) {
                    Log.i("FilePickerDelegate", "Error while saving file", e10);
                    m5979l("Error while saving file", e10.getMessage());
                }
            }
        }
        if (i11 == 0) {
            Log.i("FilePickerDelegate", "User cancelled the save request");
            m5980m(null);
        }
        return false;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10 = false;
        if (f5344r != i10) {
            return false;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            z10 = true;
        }
        if (z10) {
            m5985r();
        } else {
            m5979l("read_external_storage_denied", "User did not allow reading external storage");
        }
        return true;
    }

    /* renamed from: p */
    public void m5983p(EventChannel.EventSink eventSink) {
        this.f5354p = eventSink;
    }

    /* renamed from: q */
    public final boolean m5984q(MethodChannel.Result result) {
        if (this.f5348j != null) {
            return false;
        }
        this.f5348j = result;
        return true;
    }

    /* renamed from: r */
    public final void m5985r() {
        Intent intent;
        String str = this.f5351m;
        if (str == null) {
            return;
        }
        if (str.equals("dir")) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        } else {
            if (this.f5351m.equals("image/*")) {
                intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            } else {
                intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
            }
            Uri parse = Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator);
            Log.d("FilePickerDelegate", "Selected type " + this.f5351m);
            intent.setDataAndType(parse, this.f5351m);
            intent.setType(this.f5351m);
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f5349k);
            intent.putExtra("multi-pick", this.f5349k);
            if (this.f5351m.contains(",")) {
                this.f5353o = this.f5351m.split(",");
            }
            String[] strArr = this.f5353o;
            if (strArr != null) {
                intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
            }
        }
        if (intent.resolveActivity(this.f5346h.getPackageManager()) != null) {
            this.f5346h.startActivityForResult(Intent.createChooser(intent, null), f5344r);
        } else {
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            m5979l("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    /* renamed from: s */
    public void m5986s(String str, boolean z10, boolean z11, String[] strArr, int i10, MethodChannel.Result result) {
        if (!m5984q(result)) {
            m5976k(result);
            return;
        }
        this.f5351m = str;
        this.f5349k = z10;
        this.f5350l = z11;
        this.f5353o = strArr;
        this.f5352n = i10;
        if (Build.VERSION.SDK_INT >= 33 || this.f5347i.isPermissionGranted("android.permission.READ_EXTERNAL_STORAGE")) {
            m5985r();
        } else {
            this.f5347i.askForPermission("android.permission.READ_EXTERNAL_STORAGE", f5344r);
        }
    }
}
