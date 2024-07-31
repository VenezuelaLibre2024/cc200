package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p133j0.C3206e;
import p346y0.C5787a;

/* loaded from: classes2.dex */
class ImageResizer {
    private final Context context;
    private final ExifDataCopier exifDataCopier;

    public ImageResizer(Context context, ExifDataCopier exifDataCopier) {
        this.context = context;
        this.exifDataCopier = exifDataCopier;
    }

    private int calculateSampleSize(BitmapFactory.Options options, int i10, int i11) {
        int i12 = options.outHeight;
        int i13 = options.outWidth;
        int i14 = 1;
        if (i12 > i11 || i13 > i10) {
            int i15 = i12 / 2;
            int i16 = i13 / 2;
            while (i15 / i14 >= i11 && i16 / i14 >= i10) {
                i14 *= 2;
            }
        }
        return i14;
    }

    private C3206e calculateTargetSize(double d10, double d11, Double d12, Double d13) {
        double d14 = d10 / d11;
        boolean z10 = true;
        boolean z11 = d12 != null;
        boolean z12 = d13 != null;
        double min = z11 ? Math.min(d10, Math.round(d12.doubleValue())) : d10;
        double min2 = z12 ? Math.min(d11, Math.round(d13.doubleValue())) : d11;
        boolean z13 = z11 && d12.doubleValue() < d10;
        boolean z14 = z12 && d13.doubleValue() < d11;
        if (!z13 && !z14) {
            z10 = false;
        }
        if (z10) {
            double d15 = min2 * d14;
            double d16 = min / d14;
            if (d16 > min2) {
                min = Math.round(d15);
            } else {
                min2 = Math.round(d16);
            }
        }
        return new C3206e((float) min, (float) min2);
    }

    private void copyExif(String str, String str2) {
        try {
            this.exifDataCopier.copyExif(new C5787a(str), new C5787a(str2));
        } catch (Exception e10) {
            Log.e("ImageResizer", "Error preserving Exif data on selected image: " + e10);
        }
    }

    private File createFile(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.getParentFile().exists()) {
            file2.getParentFile().mkdirs();
        }
        return file2;
    }

    private File createImageOnExternalDirectory(String str, Bitmap bitmap, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean hasAlpha = bitmap.hasAlpha();
        if (hasAlpha) {
            Log.d("ImageResizer", "image_picker: compressing is not supported for type PNG. Returning the image with original quality");
        }
        bitmap.compress(hasAlpha ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        File createFile = createFile(this.context.getCacheDir(), str);
        FileOutputStream createOutputStream = createOutputStream(createFile);
        createOutputStream.write(byteArrayOutputStream.toByteArray());
        createOutputStream.close();
        return createFile;
    }

    private FileOutputStream createOutputStream(File file) {
        return new FileOutputStream(file);
    }

    private Bitmap createScaledBitmap(Bitmap bitmap, int i10, int i11, boolean z10) {
        return Bitmap.createScaledBitmap(bitmap, i10, i11, z10);
    }

    private Bitmap decodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    private File resizedImage(Bitmap bitmap, Double d10, Double d11, int i10, String str) {
        return createImageOnExternalDirectory("/scaled_" + str, createScaledBitmap(bitmap, d10.intValue(), d11.intValue(), false), i10);
    }

    public C3206e readFileDimensions(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        decodeFile(str, options);
        return new C3206e(options.outWidth, options.outHeight);
    }

    public String resizeImageIfNeeded(String str, Double d10, Double d11, int i10) {
        C3206e readFileDimensions = readFileDimensions(str);
        if (readFileDimensions.m11418b() == -1.0f || readFileDimensions.m11417a() == -1.0f) {
            return str;
        }
        if (!((d10 == null && d11 == null && i10 >= 100) ? false : true)) {
            return str;
        }
        try {
            String[] split = str.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
            String str2 = split[split.length - 1];
            C3206e calculateTargetSize = calculateTargetSize(readFileDimensions.m11418b(), readFileDimensions.m11417a(), d10, d11);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = calculateSampleSize(options, (int) calculateTargetSize.m11418b(), (int) calculateTargetSize.m11417a());
            Bitmap decodeFile = decodeFile(str, options);
            if (decodeFile == null) {
                return str;
            }
            File resizedImage = resizedImage(decodeFile, Double.valueOf(calculateTargetSize.m11418b()), Double.valueOf(calculateTargetSize.m11417a()), i10, str2);
            copyExif(str, resizedImage.getPath());
            return resizedImage.getPath();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
