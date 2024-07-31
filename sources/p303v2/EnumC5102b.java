package p303v2;

/* renamed from: v2.b */
/* loaded from: classes.dex */
public enum EnumC5102b {
    activityMissing,
    errorWhileAcquiringPosition,
    locationServicesDisabled,
    permissionDefinitionsNotFound,
    permissionDenied,
    permissionRequestInProgress;

    /* renamed from: v2.b$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19257a;

        static {
            int[] iArr = new int[EnumC5102b.values().length];
            f19257a = iArr;
            try {
                iArr[EnumC5102b.activityMissing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19257a[EnumC5102b.errorWhileAcquiringPosition.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19257a[EnumC5102b.locationServicesDisabled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19257a[EnumC5102b.permissionDefinitionsNotFound.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19257a[EnumC5102b.permissionDenied.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19257a[EnumC5102b.permissionRequestInProgress.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: c */
    public String m20742c() {
        switch (a.f19257a[ordinal()]) {
            case 1:
                return "Activity is missing. This might happen when running a certain function from the background that requires a UI element (e.g. requesting permissions or enabling the location services).";
            case 2:
                return "An unexpected error occurred while trying to acquire the device's position.";
            case 3:
                return "Location services are disabled. To receive location updates the location services should be enabled.";
            case 4:
                return "No location permissions are defined in the manifest. Make sure at least ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION are defined in the manifest.";
            case 5:
                return "User denied permissions to access the device's location.";
            case 6:
                return "Already listening for location updates. If you want to restart listening please cancel other subscriptions first";
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        switch (a.f19257a[ordinal()]) {
            case 1:
                return "ACTIVITY_MISSING";
            case 2:
                return "ERROR_WHILE_ACQUIRING_POSITION";
            case 3:
                return "LOCATION_SERVICES_DISABLED";
            case 4:
                return "PERMISSION_DEFINITIONS_NOT_FOUND";
            case 5:
                return "PERMISSION_DENIED";
            case 6:
                return "PERMISSION_REQUEST_IN_PROGRESS";
            default:
                throw new IndexOutOfBoundsException();
        }
    }
}
