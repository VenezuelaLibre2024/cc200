package io.flutter.plugins.pathprovider;

import android.content.Context;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.pathprovider.Messages;
import io.flutter.util.PathUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class PathProviderPlugin implements FlutterPlugin, Messages.PathProviderApi {
    public static final String TAG = "PathProviderPlugin";
    private Context context;

    /* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C31361 {

        /* renamed from: $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory */
        public static final /* synthetic */ int[] f10983x64ce01e6;

        static {
            int[] iArr = new int[Messages.StorageDirectory.values().length];
            f10983x64ce01e6 = iArr;
            try {
                iArr[Messages.StorageDirectory.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10983x64ce01e6[Messages.StorageDirectory.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10983x64ce01e6[Messages.StorageDirectory.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10983x64ce01e6[Messages.StorageDirectory.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10983x64ce01e6[Messages.StorageDirectory.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10983x64ce01e6[Messages.StorageDirectory.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10983x64ce01e6[Messages.StorageDirectory.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10983x64ce01e6[Messages.StorageDirectory.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10983x64ce01e6[Messages.StorageDirectory.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10983x64ce01e6[Messages.StorageDirectory.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10983x64ce01e6[Messages.StorageDirectory.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private String getApplicationSupportDirectory() {
        return PathUtils.getFilesDir(this.context);
    }

    private String getPathProviderApplicationDocumentsDirectory() {
        return PathUtils.getDataDirectory(this.context);
    }

    private List<String> getPathProviderExternalCacheDirectories() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.context.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private List<String> getPathProviderExternalStorageDirectories(Messages.StorageDirectory storageDirectory) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.context.getExternalFilesDirs(getStorageDirectoryString(storageDirectory))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private String getPathProviderStorageDirectory() {
        File externalFilesDir = this.context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    private String getPathProviderTemporaryDirectory() {
        return this.context.getCacheDir().getPath();
    }

    private String getStorageDirectoryString(Messages.StorageDirectory storageDirectory) {
        switch (C31361.f10983x64ce01e6[storageDirectory.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + storageDirectory);
        }
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new PathProviderPlugin().setup(registrar.messenger(), registrar.context());
    }

    private void setup(BinaryMessenger binaryMessenger, Context context) {
        try {
            Messages.PathProviderApi.setup(binaryMessenger, this);
        } catch (Exception e10) {
            Log.e(TAG, "Received exception while setting up PathProviderPlugin", e10);
        }
        this.context = context;
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public String getApplicationCachePath() {
        return this.context.getCacheDir().getPath();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public String getApplicationDocumentsPath() {
        return getPathProviderApplicationDocumentsDirectory();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public String getApplicationSupportPath() {
        return getApplicationSupportDirectory();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public List<String> getExternalCachePaths() {
        return getPathProviderExternalCacheDirectories();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public String getExternalStoragePath() {
        return getPathProviderStorageDirectory();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public List<String> getExternalStoragePaths(Messages.StorageDirectory storageDirectory) {
        return getPathProviderExternalStorageDirectories(storageDirectory);
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public String getTemporaryPath() {
        return getPathProviderTemporaryDirectory();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setup(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Messages.PathProviderApi.setup(flutterPluginBinding.getBinaryMessenger(), null);
    }
}
