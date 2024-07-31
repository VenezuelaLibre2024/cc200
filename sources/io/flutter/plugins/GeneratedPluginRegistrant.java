package io.flutter.plugins;

import ad.C0094c;
import androidx.annotation.Keep;
import bd.C0547b;
import cd.C1012a;
import com.baseflow.geolocator.C1133a;
import com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin;
import com.mr.flutter.plugin.filepicker.FilePickerPlugin;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import gf.C2257a;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.deviceinfo.DeviceInfoPlugin;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import io.flutter.plugins.firebase.storage.FlutterFirebaseStoragePlugin;
import io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin;
import io.flutter.plugins.googlemaps.GoogleMapsPlugin;
import io.flutter.plugins.googlesignin.GoogleSignInPlugin;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.packageinfo.PackageInfoPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import lb.ViewTreeObserverOnGlobalLayoutListenerC3464a;
import nc.C3787b0;
import p018b3.C0473a;
import p030c3.C0607c;
import p056df.C1626b;
import p070ed.C1767a;
import p071ef.C1790c;
import p117hf.C2563a;
import p131ic.C2703a;
import p144jb.C3274a;
import p186mb.C3608b;
import p198nb.C3783a;
import p219p2.C3997a;
import p244qe.C4250b;
import p248r2.C4287k;
import p326wc.C5479d;
import p342xc.C5756f;
import p358yc.C5910a;
import p363z2.C5958m;
import p372zc.C6122c;
import vn.hunghd.flutterdownloader.C5180a;

@Keep
/* loaded from: classes2.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new C3783a());
        } catch (Exception e10) {
            Log.m11042e(TAG, "Error registering plugin android_path_provider, com.mix1009.android_path_provider.AndroidPathProviderPlugin", e10);
        }
        try {
            flutterEngine.getPlugins().add(new C2563a());
        } catch (Exception e11) {
            Log.m11042e(TAG, "Error registering plugin audioplayers, xyz.luan.audioplayers.AudioplayersPlugin", e11);
        }
        try {
            flutterEngine.getPlugins().add(new C5756f());
        } catch (Exception e12) {
            Log.m11042e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e12);
        }
        try {
            flutterEngine.getPlugins().add(new C0547b());
        } catch (Exception e13) {
            Log.m11042e(TAG, "Error registering plugin contacts_service, flutter.plugins.contactsservice.contactsservice.ContactsServicePlugin", e13);
        }
        try {
            flutterEngine.getPlugins().add(new DeviceInfoPlugin());
        } catch (Exception e14) {
            Log.m11042e(TAG, "Error registering plugin device_info, io.flutter.plugins.deviceinfo.DeviceInfoPlugin", e14);
        }
        try {
            flutterEngine.getPlugins().add(new C0473a());
        } catch (Exception e15) {
            Log.m11042e(TAG, "Error registering plugin devicelocale, com.example.devicelocale.DevicelocalePlugin", e15);
        }
        try {
            flutterEngine.getPlugins().add(new C4287k());
        } catch (Exception e16) {
            Log.m11042e(TAG, "Error registering plugin ffmpeg_kit_flutter_min_gpl, com.arthenica.ffmpegkit.flutter.FFmpegKitFlutterPlugin", e16);
        }
        try {
            flutterEngine.getPlugins().add(new FilePickerPlugin());
        } catch (Exception e17) {
            Log.m11042e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseAnalyticsPlugin());
        } catch (Exception e18) {
            Log.m11042e(TAG, "Error registering plugin firebase_analytics, io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseAuthPlugin());
        } catch (Exception e19) {
            Log.m11042e(TAG, "Error registering plugin firebase_auth, io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCorePlugin());
        } catch (Exception e20) {
            Log.m11042e(TAG, "Error registering plugin firebase_core, io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin", e20);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseCrashlyticsPlugin());
        } catch (Exception e21) {
            Log.m11042e(TAG, "Error registering plugin firebase_crashlytics, io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin", e21);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseMessagingPlugin());
        } catch (Exception e22) {
            Log.m11042e(TAG, "Error registering plugin firebase_messaging, io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin", e22);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterFirebaseStoragePlugin());
        } catch (Exception e23) {
            Log.m11042e(TAG, "Error registering plugin firebase_storage, io.flutter.plugins.firebase.storage.FlutterFirebaseStoragePlugin", e23);
        }
        try {
            flutterEngine.getPlugins().add(new C1012a());
        } catch (Exception e24) {
            Log.m11042e(TAG, "Error registering plugin flutter_app_badger, fr.g123k.flutterappbadger.FlutterAppBadgerPlugin", e24);
        }
        try {
            flutterEngine.getPlugins().add(new C5180a());
        } catch (Exception e25) {
            Log.m11042e(TAG, "Error registering plugin flutter_downloader, vn.hunghd.flutterdownloader.FlutterDownloaderPlugin", e25);
        }
        try {
            flutterEngine.getPlugins().add(new InAppWebViewFlutterPlugin());
        } catch (Exception e26) {
            Log.m11042e(TAG, "Error registering plugin flutter_inappwebview, com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin", e26);
        }
        try {
            flutterEngine.getPlugins().add(new C3997a());
        } catch (Exception e27) {
            Log.m11042e(TAG, "Error registering plugin flutter_jailbreak_detection, appmire.be.flutterjailbreakdetection.FlutterJailbreakDetectionPlugin", e27);
        }
        try {
            flutterEngine.getPlugins().add(new ViewTreeObserverOnGlobalLayoutListenerC3464a());
        } catch (Exception e28) {
            Log.m11042e(TAG, "Error registering plugin flutter_keyboard_visibility, com.jrai.flutter_keyboard_visibility.FlutterKeyboardVisibilityPlugin", e28);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterLocalNotificationsPlugin());
        } catch (Exception e29) {
            Log.m11042e(TAG, "Error registering plugin flutter_local_notifications, com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin", e29);
        }
        try {
            flutterEngine.getPlugins().add(new FlutterAndroidLifecyclePlugin());
        } catch (Exception e30) {
            Log.m11042e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e30);
        }
        try {
            flutterEngine.getPlugins().add(new C1767a());
        } catch (Exception e31) {
            Log.m11042e(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e31);
        }
        try {
            flutterEngine.getPlugins().add(new C1133a());
        } catch (Exception e32) {
            Log.m11042e(TAG, "Error registering plugin geolocator_android, com.baseflow.geolocator.GeolocatorPlugin", e32);
        }
        try {
            flutterEngine.getPlugins().add(new GoogleMapsPlugin());
        } catch (Exception e33) {
            Log.m11042e(TAG, "Error registering plugin google_maps_flutter_android, io.flutter.plugins.googlemaps.GoogleMapsPlugin", e33);
        }
        try {
            flutterEngine.getPlugins().add(new GoogleSignInPlugin());
        } catch (Exception e34) {
            Log.m11042e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e34);
        }
        try {
            flutterEngine.getPlugins().add(new C1790c());
        } catch (Exception e35) {
            Log.m11042e(TAG, "Error registering plugin image_cropper, vn.hunghd.flutter.plugins.imagecropper.ImageCropperPlugin", e35);
        }
        try {
            flutterEngine.getPlugins().add(new ImagePickerPlugin());
        } catch (Exception e36) {
            Log.m11042e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e36);
        }
        try {
            flutterEngine.getPlugins().add(new C3274a());
        } catch (Exception e37) {
            Log.m11042e(TAG, "Error registering plugin open_file_plus, com.joutvhu.openfile.OpenFilePlusPlugin", e37);
        }
        try {
            flutterEngine.getPlugins().add(new PackageInfoPlugin());
        } catch (Exception e38) {
            Log.m11042e(TAG, "Error registering plugin package_info, io.flutter.plugins.packageinfo.PackageInfoPlugin", e38);
        }
        try {
            flutterEngine.getPlugins().add(new C5910a());
        } catch (Exception e39) {
            Log.m11042e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e39);
        }
        try {
            flutterEngine.getPlugins().add(new PathProviderPlugin());
        } catch (Exception e40) {
            Log.m11042e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e40);
        }
        try {
            flutterEngine.getPlugins().add(new C5958m());
        } catch (Exception e41) {
            Log.m11042e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e41);
        }
        try {
            flutterEngine.getPlugins().add(new C4250b());
        } catch (Exception e42) {
            Log.m11042e(TAG, "Error registering plugin qr_code_scanner, net.touchcapture.qr.flutterqr.FlutterQrPlugin", e42);
        }
        try {
            flutterEngine.getPlugins().add(new C3608b());
        } catch (Exception e43) {
            Log.m11042e(TAG, "Error registering plugin receive_sharing_intent, com.kasem.receive_sharing_intent.ReceiveSharingIntentPlugin", e43);
        }
        try {
            flutterEngine.getPlugins().add(new C2703a());
        } catch (Exception e44) {
            Log.m11042e(TAG, "Error registering plugin record_mp3, com.plugin.record_mp3.RecordMp3Plugin", e44);
        }
        try {
            flutterEngine.getPlugins().add(new C5479d());
        } catch (Exception e45) {
            Log.m11042e(TAG, "Error registering plugin share_extend, com.zt.shareextend.ShareExtendPlugin", e45);
        }
        try {
            flutterEngine.getPlugins().add(new C6122c());
        } catch (Exception e46) {
            Log.m11042e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e46);
        }
        try {
            flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
        } catch (Exception e47) {
            Log.m11042e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e47);
        }
        try {
            flutterEngine.getPlugins().add(new C1626b());
        } catch (Exception e48) {
            Log.m11042e(TAG, "Error registering plugin soundpool, pl.ukaszapps.soundpool.SoundpoolPlugin", e48);
        }
        try {
            flutterEngine.getPlugins().add(new C3787b0());
        } catch (Exception e49) {
            Log.m11042e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e49);
        }
        try {
            flutterEngine.getPlugins().add(new UrlLauncherPlugin());
        } catch (Exception e50) {
            Log.m11042e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e50);
        }
        try {
            flutterEngine.getPlugins().add(new C0607c());
        } catch (Exception e51) {
            Log.m11042e(TAG, "Error registering plugin video_compress, com.example.video_compress.VideoCompressPlugin", e51);
        }
        try {
            flutterEngine.getPlugins().add(new VideoPlayerPlugin());
        } catch (Exception e52) {
            Log.m11042e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e52);
        }
        try {
            flutterEngine.getPlugins().add(new C2257a());
        } catch (Exception e53) {
            Log.m11042e(TAG, "Error registering plugin video_thumbnail, xyz.justsoft.video_thumbnail.VideoThumbnailPlugin", e53);
        }
        try {
            flutterEngine.getPlugins().add(new C0094c());
        } catch (Exception e54) {
            Log.m11042e(TAG, "Error registering plugin wakelock_plus, dev.fluttercommunity.plus.wakelock.WakelockPlusPlugin", e54);
        }
    }
}
