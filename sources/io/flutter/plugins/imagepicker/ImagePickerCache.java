package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import io.flutter.plugins.imagepicker.Messages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
class ImagePickerCache {
    private static final String FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY = "flutter_image_picker_image_path";
    public static final String MAP_KEY_ERROR = "error";
    public static final String MAP_KEY_IMAGE_QUALITY = "imageQuality";
    public static final String MAP_KEY_MAX_HEIGHT = "maxHeight";
    public static final String MAP_KEY_MAX_WIDTH = "maxWidth";
    public static final String MAP_KEY_PATH_LIST = "pathList";
    public static final String MAP_KEY_TYPE = "type";
    private static final String MAP_TYPE_VALUE_IMAGE = "image";
    private static final String MAP_TYPE_VALUE_VIDEO = "video";
    public static final String SHARED_PREFERENCES_NAME = "flutter_image_picker_shared_preference";
    private static final String SHARED_PREFERENCE_ERROR_CODE_KEY = "flutter_image_picker_error_code";
    private static final String SHARED_PREFERENCE_ERROR_MESSAGE_KEY = "flutter_image_picker_error_message";
    private static final String SHARED_PREFERENCE_IMAGE_QUALITY_KEY = "flutter_image_picker_image_quality";
    private static final String SHARED_PREFERENCE_MAX_HEIGHT_KEY = "flutter_image_picker_max_height";
    private static final String SHARED_PREFERENCE_MAX_WIDTH_KEY = "flutter_image_picker_max_width";
    private static final String SHARED_PREFERENCE_PENDING_IMAGE_URI_PATH_KEY = "flutter_image_picker_pending_image_uri";
    private static final String SHARED_PREFERENCE_TYPE_KEY = "flutter_image_picker_type";
    private final Context context;

    /* renamed from: io.flutter.plugins.imagepicker.ImagePickerCache$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C31141 {

        /* renamed from: $SwitchMap$io$flutter$plugins$imagepicker$ImagePickerCache$CacheType */
        public static final /* synthetic */ int[] f10959xd4c96b76;

        static {
            int[] iArr = new int[CacheType.values().length];
            f10959xd4c96b76 = iArr;
            try {
                iArr[CacheType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10959xd4c96b76[CacheType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum CacheType {
        IMAGE,
        VIDEO
    }

    public ImagePickerCache(Context context) {
        this.context = context;
    }

    private void setType(String str) {
        this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit().putString(SHARED_PREFERENCE_TYPE_KEY, str).apply();
    }

    public void clear() {
        this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit().clear().apply();
    }

    public Map<String, Object> getCacheMap() {
        Set<String> stringSet;
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
        boolean z11 = true;
        if (sharedPreferences.contains(FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY) && (stringSet = sharedPreferences.getStringSet(FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY, null)) != null) {
            hashMap.put(MAP_KEY_PATH_LIST, new ArrayList(stringSet));
            z10 = true;
        }
        if (sharedPreferences.contains(SHARED_PREFERENCE_ERROR_CODE_KEY)) {
            Messages.CacheRetrievalError.Builder builder = new Messages.CacheRetrievalError.Builder();
            builder.setCode(sharedPreferences.getString(SHARED_PREFERENCE_ERROR_CODE_KEY, ""));
            if (sharedPreferences.contains(SHARED_PREFERENCE_ERROR_MESSAGE_KEY)) {
                builder.setMessage(sharedPreferences.getString(SHARED_PREFERENCE_ERROR_MESSAGE_KEY, ""));
            }
            hashMap.put(MAP_KEY_ERROR, builder.build());
        } else {
            z11 = z10;
        }
        if (z11) {
            if (sharedPreferences.contains(SHARED_PREFERENCE_TYPE_KEY)) {
                hashMap.put(MAP_KEY_TYPE, sharedPreferences.getString(SHARED_PREFERENCE_TYPE_KEY, "").equals(MAP_TYPE_VALUE_VIDEO) ? Messages.CacheRetrievalType.VIDEO : Messages.CacheRetrievalType.IMAGE);
            }
            if (sharedPreferences.contains(SHARED_PREFERENCE_MAX_WIDTH_KEY)) {
                hashMap.put(MAP_KEY_MAX_WIDTH, Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(SHARED_PREFERENCE_MAX_WIDTH_KEY, 0L))));
            }
            if (sharedPreferences.contains(SHARED_PREFERENCE_MAX_HEIGHT_KEY)) {
                hashMap.put(MAP_KEY_MAX_HEIGHT, Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(SHARED_PREFERENCE_MAX_HEIGHT_KEY, 0L))));
            }
            hashMap.put(MAP_KEY_IMAGE_QUALITY, Integer.valueOf(sharedPreferences.getInt(SHARED_PREFERENCE_IMAGE_QUALITY_KEY, 100)));
        }
        return hashMap;
    }

    public String retrievePendingCameraMediaUriPath() {
        return this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).getString(SHARED_PREFERENCE_PENDING_IMAGE_URI_PATH_KEY, "");
    }

    public void saveDimensionWithOutputOptions(Messages.ImageSelectionOptions imageSelectionOptions) {
        SharedPreferences.Editor edit = this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        if (imageSelectionOptions.getMaxWidth() != null) {
            edit.putLong(SHARED_PREFERENCE_MAX_WIDTH_KEY, Double.doubleToRawLongBits(imageSelectionOptions.getMaxWidth().doubleValue()));
        }
        if (imageSelectionOptions.getMaxHeight() != null) {
            edit.putLong(SHARED_PREFERENCE_MAX_HEIGHT_KEY, Double.doubleToRawLongBits(imageSelectionOptions.getMaxHeight().doubleValue()));
        }
        edit.putInt(SHARED_PREFERENCE_IMAGE_QUALITY_KEY, imageSelectionOptions.getQuality().intValue());
        edit.apply();
    }

    public void savePendingCameraMediaUriPath(Uri uri) {
        this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit().putString(SHARED_PREFERENCE_PENDING_IMAGE_URI_PATH_KEY, uri.getPath()).apply();
    }

    public void saveResult(ArrayList<String> arrayList, String str, String str2) {
        SharedPreferences.Editor edit = this.context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0).edit();
        if (arrayList != null) {
            edit.putStringSet(FLUTTER_IMAGE_PICKER_IMAGE_PATH_KEY, new HashSet(arrayList));
        }
        if (str != null) {
            edit.putString(SHARED_PREFERENCE_ERROR_CODE_KEY, str);
        }
        if (str2 != null) {
            edit.putString(SHARED_PREFERENCE_ERROR_MESSAGE_KEY, str2);
        }
        edit.apply();
    }

    public void saveType(CacheType cacheType) {
        String str;
        int i10 = C31141.f10959xd4c96b76[cacheType.ordinal()];
        if (i10 == 1) {
            str = MAP_TYPE_VALUE_IMAGE;
        } else if (i10 != 2) {
            return;
        } else {
            str = MAP_TYPE_VALUE_VIDEO;
        }
        setType(str);
    }
}
