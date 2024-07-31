package com.dexterous.flutterlocalnotifications;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.graphics.drawable.IconCompat;
import com.dexterous.flutterlocalnotifications.isolate.IsolatePreferences;
import com.dexterous.flutterlocalnotifications.models.BitmapSource;
import com.dexterous.flutterlocalnotifications.models.DateTimeComponents;
import com.dexterous.flutterlocalnotifications.models.IconSource;
import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelAction;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationChannelGroupDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import com.dexterous.flutterlocalnotifications.models.NotificationStyle;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import com.dexterous.flutterlocalnotifications.models.RepeatInterval;
import com.dexterous.flutterlocalnotifications.models.ScheduleMode;
import com.dexterous.flutterlocalnotifications.models.ScheduledNotificationRepeatFrequency;
import com.dexterous.flutterlocalnotifications.models.SoundSource;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import com.dexterous.flutterlocalnotifications.utils.BooleanUtils;
import com.dexterous.flutterlocalnotifications.utils.LongUtils;
import com.dexterous.flutterlocalnotifications.utils.StringUtils;
import com.google.gson.C1303e;
import com.google.gson.Gson;
import io.flutter.FlutterInjector;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p120i1.C2579a;
import p329x.C5484b;
import p329x.C5487e;
import p329x.C5494l;
import p329x.C5497o;
import p329x.C5500r;
import p329x.C5502t;
import p339x9.C5740a;
import p345y.C5782a;

@Keep
/* loaded from: classes.dex */
public class FlutterLocalNotificationsPlugin implements MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener, PluginRegistry.RequestPermissionsResultListener, PluginRegistry.ActivityResultListener, FlutterPlugin, ActivityAware {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String ACTION_ID = "actionId";
    private static final String ARE_NOTIFICATIONS_ENABLED_METHOD = "areNotificationsEnabled";
    private static final String CALLBACK_HANDLE = "callback_handle";
    private static final String CANCEL_ALL_METHOD = "cancelAll";
    private static final String CANCEL_ID = "id";
    private static final String CANCEL_METHOD = "cancel";
    public static final String CANCEL_NOTIFICATION = "cancelNotification";
    private static final String CANCEL_TAG = "tag";
    private static final String CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD = "canScheduleExactNotifications";
    private static final String CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD = "createNotificationChannelGroup";
    private static final String CREATE_NOTIFICATION_CHANNEL_METHOD = "createNotificationChannel";
    private static final String DEFAULT_ICON = "defaultIcon";
    private static final String DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD = "deleteNotificationChannelGroup";
    private static final String DELETE_NOTIFICATION_CHANNEL_METHOD = "deleteNotificationChannel";
    private static final String DISPATCHER_HANDLE = "dispatcher_handle";
    private static final String DRAWABLE = "drawable";
    private static final String EXACT_ALARMS_PERMISSION_ERROR_CODE = "exact_alarms_not_permitted";
    public static final int EXACT_ALARM_PERMISSION_REQUEST_CODE = 2;
    private static final String GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE = "Android version must be 6.0 or newer to use getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATIONS_METHOD = "getActiveNotifications";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE = "getActiveNotificationMessagingStyleError";
    private static final String GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD = "getActiveNotificationMessagingStyle";
    private static final String GET_CALLBACK_HANDLE_METHOD = "getCallbackHandle";
    private static final String GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD = "getNotificationAppLaunchDetails";
    private static final String GET_NOTIFICATION_CHANNELS_ERROR_CODE = "getNotificationChannelsError";
    private static final String GET_NOTIFICATION_CHANNELS_METHOD = "getNotificationChannels";
    private static final String INITIALIZE_METHOD = "initialize";
    private static final String INPUT = "input";
    private static final String INPUT_RESULT = "FlutterLocalNotificationsPluginInputResult";
    private static final String INVALID_BIG_PICTURE_ERROR_CODE = "invalid_big_picture";
    private static final String INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a drawable resource to your Android head project.";
    private static final String INVALID_ICON_ERROR_CODE = "invalid_icon";
    private static final String INVALID_LARGE_ICON_ERROR_CODE = "invalid_large_icon";
    private static final String INVALID_LED_DETAILS_ERROR_CODE = "invalid_led_details";
    private static final String INVALID_LED_DETAILS_ERROR_MESSAGE = "Must specify both ledOnMs and ledOffMs to configure the blink cycle on older versions of Android before Oreo";
    private static final String INVALID_RAW_RESOURCE_ERROR_MESSAGE = "The resource %s could not be found. Please make sure it has been added as a raw resource to your Android head project.";
    private static final String INVALID_SOUND_ERROR_CODE = "invalid_sound";
    private static final String METHOD_CHANNEL = "dexterous.com/flutter/local_notifications";
    public static String NOTIFICATION_DETAILS = "notificationDetails";
    public static final String NOTIFICATION_ID = "notificationId";
    private static final String NOTIFICATION_LAUNCHED_APP = "notificationLaunchedApp";
    public static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 1;
    private static final String NOTIFICATION_RESPONSE_TYPE = "notificationResponseType";
    public static final String PAYLOAD = "payload";
    private static final String PENDING_NOTIFICATION_REQUESTS_METHOD = "pendingNotificationRequests";
    private static final String PERIODICALLY_SHOW_METHOD = "periodicallyShow";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE = "permissionRequestInProgress";
    private static final String PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE = "Another permission request is already in progress";
    private static final String REQUEST_EXACT_ALARMS_PERMISSION_METHOD = "requestExactAlarmsPermission";
    private static final String REQUEST_NOTIFICATIONS_PERMISSION_METHOD = "requestNotificationsPermission";
    private static final String SCHEDULED_NOTIFICATIONS = "scheduled_notifications";
    private static final String SELECT_FOREGROUND_NOTIFICATION_ACTION = "SELECT_FOREGROUND_NOTIFICATION";
    private static final String SELECT_NOTIFICATION = "SELECT_NOTIFICATION";
    private static final String SHARED_PREFERENCES_KEY = "notification_plugin_cache";
    private static final String SHOW_METHOD = "show";
    private static final String START_FOREGROUND_SERVICE = "startForegroundService";
    private static final String STOP_FOREGROUND_SERVICE = "stopForegroundService";
    private static final String TAG = "FLTLocalNotifPlugin";
    private static final String UNSUPPORTED_OS_VERSION_ERROR_CODE = "unsupported_os_version";
    private static final String ZONED_SCHEDULE_METHOD = "zonedSchedule";
    public static Gson gson;
    private Context applicationContext;
    private PermissionRequestListener callback;
    private MethodChannel channel;
    private Activity mainActivity;
    private PermissionRequestProgress permissionRequestProgress = PermissionRequestProgress.None;

    /* renamed from: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin$4 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11384 {

        /* renamed from: $SwitchMap$com$dexterous$flutterlocalnotifications$models$IconSource */
        public static final /* synthetic */ int[] f4154xe7097e9f;

        /* renamed from: $SwitchMap$com$dexterous$flutterlocalnotifications$models$NotificationStyle */
        public static final /* synthetic */ int[] f4155xa0df0c7b;

        /* renamed from: $SwitchMap$com$dexterous$flutterlocalnotifications$models$RepeatInterval */
        public static final /* synthetic */ int[] f4156x7c9a4aab;

        static {
            int[] iArr = new int[NotificationStyle.values().length];
            f4155xa0df0c7b = iArr;
            try {
                iArr[NotificationStyle.BigPicture.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4155xa0df0c7b[NotificationStyle.BigText.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4155xa0df0c7b[NotificationStyle.Inbox.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4155xa0df0c7b[NotificationStyle.Messaging.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4155xa0df0c7b[NotificationStyle.Media.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[IconSource.values().length];
            f4154xe7097e9f = iArr2;
            try {
                iArr2[IconSource.DrawableResource.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4154xe7097e9f[IconSource.BitmapFilePath.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4154xe7097e9f[IconSource.ContentUri.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4154xe7097e9f[IconSource.FlutterBitmapAsset.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4154xe7097e9f[IconSource.ByteArray.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr3 = new int[RepeatInterval.values().length];
            f4156x7c9a4aab = iArr3;
            try {
                iArr3[RepeatInterval.EveryMinute.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4156x7c9a4aab[RepeatInterval.Hourly.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4156x7c9a4aab[RepeatInterval.Daily.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4156x7c9a4aab[RepeatInterval.Weekly.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ExactAlarmPermissionException extends PluginException {
        public ExactAlarmPermissionException() {
            super(FlutterLocalNotificationsPlugin.EXACT_ALARMS_PERMISSION_ERROR_CODE, "Exact alarms are not permitted");
        }
    }

    /* loaded from: classes.dex */
    public enum PermissionRequestProgress {
        None,
        RequestingNotificationPermission,
        RequestingExactAlarmsPermission
    }

    /* loaded from: classes.dex */
    public static class PluginException extends RuntimeException {
        public final String code;

        public PluginException(String str, String str2) {
            super(str2);
            this.code = str;
        }
    }

    private static void applyGrouping(NotificationDetails notificationDetails, C5494l.e eVar) {
        boolean z10;
        if (StringUtils.isNullOrEmpty(notificationDetails.groupKey).booleanValue()) {
            z10 = false;
        } else {
            eVar.m21905z(notificationDetails.groupKey);
            z10 = true;
        }
        if (z10) {
            if (BooleanUtils.getValue(notificationDetails.setAsGroupSummary)) {
                eVar.m21859B(true);
            }
            eVar.m21858A(notificationDetails.groupAlertBehavior.intValue());
        }
    }

    private void areNotificationsEnabled(MethodChannel.Result result) {
        result.success(Boolean.valueOf(getNotificationManager(this.applicationContext).m22070a()));
    }

    public static Gson buildGson() {
        if (gson == null) {
            gson = new C1303e().m5617c(ScheduleMode.class, new ScheduleMode.Deserializer()).m5618d(RuntimeTypeAdapterFactory.m4696of(StyleInformation.class).registerSubtype(DefaultStyleInformation.class).registerSubtype(BigTextStyleInformation.class).registerSubtype(BigPictureStyleInformation.class).registerSubtype(InboxStyleInformation.class).registerSubtype(MessagingStyleInformation.class)).m5616b();
        }
        return gson;
    }

    private static C5500r buildPerson(Context context, PersonDetails personDetails) {
        IconSource iconSource;
        if (personDetails == null) {
            return null;
        }
        C5500r.b bVar = new C5500r.b();
        bVar.m22117b(BooleanUtils.getValue(personDetails.bot));
        Object obj = personDetails.icon;
        if (obj != null && (iconSource = personDetails.iconBitmapSource) != null) {
            bVar.m22118c(getIconFromSource(context, obj, iconSource));
        }
        bVar.m22119d(BooleanUtils.getValue(personDetails.important));
        String str = personDetails.key;
        if (str != null) {
            bVar.m22120e(str);
        }
        String str2 = personDetails.name;
        if (str2 != null) {
            bVar.m22121f(str2);
        }
        String str3 = personDetails.uri;
        if (str3 != null) {
            bVar.m22122g(str3);
        }
        return bVar.m22116a();
    }

    private static long calculateNextNotificationTrigger(long j10, long j11) {
        while (j10 < System.currentTimeMillis()) {
            j10 += j11;
        }
        return j10;
    }

    private static long calculateRepeatIntervalMilliseconds(NotificationDetails notificationDetails) {
        int i10 = C11384.f4156x7c9a4aab[notificationDetails.repeatInterval.ordinal()];
        if (i10 == 1) {
            return 60000L;
        }
        if (i10 == 2) {
            return 3600000L;
        }
        if (i10 != 3) {
            return i10 != 4 ? 0L : 604800000L;
        }
        return 86400000L;
    }

    private static Boolean canCreateNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        NotificationChannelAction notificationChannelAction;
        if (Build.VERSION.SDK_INT < 26) {
            return Boolean.FALSE;
        }
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE)).getNotificationChannel(notificationChannelDetails.f4160id);
        return Boolean.valueOf((notificationChannel == null && ((notificationChannelAction = notificationChannelDetails.channelAction) == null || notificationChannelAction == NotificationChannelAction.CreateIfNotExists)) || (notificationChannel != null && notificationChannelDetails.channelAction == NotificationChannelAction.Update));
    }

    private void cancel(MethodCall methodCall, MethodChannel.Result result) {
        Map map = (Map) methodCall.arguments();
        cancelNotification((Integer) map.get(CANCEL_ID), (String) map.get(CANCEL_TAG));
        result.success(null);
    }

    private void cancelAllNotifications(MethodChannel.Result result) {
        getNotificationManager(this.applicationContext).m22073d();
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        if (loadScheduledNotifications == null || loadScheduledNotifications.isEmpty()) {
            result.success(null);
            return;
        }
        Intent intent = new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, it.next().f4164id.intValue(), intent));
        }
        saveScheduledNotifications(this.applicationContext, new ArrayList());
        result.success(null);
    }

    private void cancelNotification(Integer num, String str) {
        getAlarmManager(this.applicationContext).cancel(getBroadcastPendingIntent(this.applicationContext, num.intValue(), new Intent(this.applicationContext, (Class<?>) ScheduledNotificationReceiver.class)));
        C5497o notificationManager = getNotificationManager(this.applicationContext);
        if (str == null) {
            notificationManager.m22071b(num.intValue());
        } else {
            notificationManager.m22072c(str, num.intValue());
        }
        removeNotificationFromCache(this.applicationContext, num);
    }

    private static byte[] castObjectToByteArray(Object obj) {
        if (!(obj instanceof ArrayList)) {
            return (byte[]) obj;
        }
        ArrayList arrayList = (ArrayList) obj;
        byte[] bArr = new byte[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            bArr[i10] = (byte) ((Double) arrayList.get(i10)).intValue();
        }
        return bArr;
    }

    private static void checkCanScheduleExactAlarms(AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31 && !alarmManager.canScheduleExactAlarms()) {
            throw new ExactAlarmPermissionException();
        }
    }

    private static C5494l.i.e createMessage(Context context, MessageDetails messageDetails) {
        String str;
        C5494l.i.e eVar = new C5494l.i.e(messageDetails.text, messageDetails.timestamp.longValue(), buildPerson(context, messageDetails.person));
        String str2 = messageDetails.dataUri;
        if (str2 != null && (str = messageDetails.dataMimeType) != null) {
            eVar.m21985j(str, Uri.parse(str2));
        }
        return eVar;
    }

    public static Notification createNotification(Context context, NotificationDetails notificationDetails) {
        Intent intent;
        String str;
        int i10;
        int i11;
        PendingIntent broadcast;
        IconSource iconSource;
        NotificationChannelDetails fromNotificationDetails = NotificationChannelDetails.fromNotificationDetails(notificationDetails);
        if (canCreateNotificationChannel(context, fromNotificationDetails).booleanValue()) {
            setupNotificationChannel(context, fromNotificationDetails);
        }
        Intent launchIntent = getLaunchIntent(context);
        launchIntent.setAction(SELECT_NOTIFICATION);
        launchIntent.putExtra(NOTIFICATION_ID, notificationDetails.f4164id);
        launchIntent.putExtra(PAYLOAD, notificationDetails.payload);
        int i12 = 23;
        PendingIntent activity = PendingIntent.getActivity(context, notificationDetails.f4164id.intValue(), launchIntent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        DefaultStyleInformation defaultStyleInformation = (DefaultStyleInformation) notificationDetails.styleInformation;
        C5494l.e m21865H = new C5494l.e(context, notificationDetails.channelId).m21900u(defaultStyleInformation.htmlFormatTitle.booleanValue() ? fromHtml(notificationDetails.title) : notificationDetails.title).m21899t(defaultStyleInformation.htmlFormatBody.booleanValue() ? fromHtml(notificationDetails.body) : notificationDetails.body).m21875R(notificationDetails.ticker).m21892m(BooleanUtils.getValue(notificationDetails.autoCancel)).m21898s(activity).m21866I(notificationDetails.priority.intValue()).m21864G(BooleanUtils.getValue(notificationDetails.ongoing)).m21870M(BooleanUtils.getValue(notificationDetails.silent)).m21865H(BooleanUtils.getValue(notificationDetails.onlyAlertOnce));
        if (notificationDetails.actions != null) {
            int intValue = notificationDetails.f4164id.intValue() * 16;
            for (NotificationAction notificationAction : notificationDetails.actions) {
                IconCompat iconCompat = null;
                if (!TextUtils.isEmpty(notificationAction.icon) && (iconSource = notificationAction.iconSource) != null) {
                    iconCompat = getIconFromSource(context, notificationAction.icon, iconSource);
                }
                Boolean bool = notificationAction.showsUserInterface;
                if (bool == null || !bool.booleanValue()) {
                    intent = new Intent(context, (Class<?>) ActionBroadcastReceiver.class);
                    str = ActionBroadcastReceiver.ACTION_TAPPED;
                } else {
                    intent = getLaunchIntent(context);
                    str = SELECT_FOREGROUND_NOTIFICATION_ACTION;
                }
                intent.setAction(str);
                intent.putExtra(NOTIFICATION_ID, notificationDetails.f4164id).putExtra(ACTION_ID, notificationAction.f4158id).putExtra(CANCEL_NOTIFICATION, notificationAction.cancelNotification).putExtra(PAYLOAD, notificationDetails.payload);
                List<NotificationAction.NotificationActionInput> list = notificationAction.actionInputs;
                if (list == null || list.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= i12) {
                        i10 = 201326592;
                    }
                    i10 = 134217728;
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        i10 = 167772160;
                    }
                    i10 = 134217728;
                }
                Boolean bool2 = notificationAction.showsUserInterface;
                if (bool2 == null || !bool2.booleanValue()) {
                    i11 = intValue + 1;
                    broadcast = PendingIntent.getBroadcast(context, intValue, intent, i10);
                } else {
                    i11 = intValue + 1;
                    broadcast = PendingIntent.getActivity(context, intValue, intent, i10);
                }
                intValue = i11;
                SpannableString spannableString = new SpannableString(notificationAction.title);
                if (notificationAction.titleColor != null) {
                    spannableString.setSpan(new ForegroundColorSpan(notificationAction.titleColor.intValue()), 0, spannableString.length(), 0);
                }
                C5494l.a.C6213a c6213a = new C5494l.a.C6213a(iconCompat, spannableString, broadcast);
                Boolean bool3 = notificationAction.contextual;
                if (bool3 != null) {
                    c6213a.m21829e(bool3.booleanValue());
                }
                Boolean bool4 = notificationAction.showsUserInterface;
                if (bool4 != null) {
                    c6213a.m21830f(bool4.booleanValue());
                }
                Boolean bool5 = notificationAction.allowGeneratedReplies;
                if (bool5 != null) {
                    c6213a.m21828d(bool5.booleanValue());
                }
                List<NotificationAction.NotificationActionInput> list2 = notificationAction.actionInputs;
                if (list2 != null) {
                    for (NotificationAction.NotificationActionInput notificationActionInput : list2) {
                        C5502t.e m22151e = new C5502t.e(INPUT_RESULT).m22151e(notificationActionInput.label);
                        Boolean bool6 = notificationActionInput.allowFreeFormInput;
                        if (bool6 != null) {
                            m22151e.m22149c(bool6.booleanValue());
                        }
                        List<String> list3 = notificationActionInput.allowedMimeTypes;
                        if (list3 != null) {
                            Iterator<String> it = list3.iterator();
                            while (it.hasNext()) {
                                m22151e.m22148b(it.next(), true);
                            }
                        }
                        List<String> list4 = notificationActionInput.choices;
                        if (list4 != null) {
                            m22151e.m22150d((CharSequence[]) list4.toArray(new CharSequence[0]));
                        }
                        c6213a.m21825a(m22151e.m22147a());
                    }
                }
                m21865H.m21882b(c6213a.m21826b());
                i12 = 23;
            }
        }
        setSmallIcon(context, notificationDetails, m21865H);
        m21865H.m21860C(getBitmapFromSource(context, notificationDetails.largeIcon, notificationDetails.largeIconBitmapSource));
        Integer num = notificationDetails.color;
        if (num != null) {
            m21865H.m21896q(num.intValue());
        }
        Boolean bool7 = notificationDetails.colorized;
        if (bool7 != null) {
            m21865H.m21897r(bool7.booleanValue());
        }
        Boolean bool8 = notificationDetails.showWhen;
        if (bool8 != null) {
            m21865H.m21869L(BooleanUtils.getValue(bool8));
        }
        Long l10 = notificationDetails.when;
        if (l10 != null) {
            m21865H.m21880W(l10.longValue());
        }
        Boolean bool9 = notificationDetails.usesChronometer;
        if (bool9 != null) {
            m21865H.m21877T(bool9.booleanValue());
        }
        Boolean bool10 = notificationDetails.chronometerCountDown;
        if (bool10 != null && Build.VERSION.SDK_INT >= 24) {
            m21865H.m21895p(bool10.booleanValue());
        }
        if (BooleanUtils.getValue(notificationDetails.fullScreenIntent)) {
            m21865H.m21904y(activity, true);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.shortcutId).booleanValue()) {
            m21865H.m21868K(notificationDetails.shortcutId);
        }
        if (!StringUtils.isNullOrEmpty(notificationDetails.subText).booleanValue()) {
            m21865H.m21874Q(notificationDetails.subText);
        }
        Integer num2 = notificationDetails.number;
        if (num2 != null) {
            m21865H.m21863F(num2.intValue());
        }
        setVisibility(notificationDetails, m21865H);
        applyGrouping(notificationDetails, m21865H);
        setSound(context, notificationDetails, m21865H);
        setVibrationPattern(notificationDetails, m21865H);
        setLights(notificationDetails, m21865H);
        setStyle(context, notificationDetails, m21865H);
        setProgress(notificationDetails, m21865H);
        setCategory(notificationDetails, m21865H);
        setTimeoutAfter(notificationDetails, m21865H);
        Notification m21883c = m21865H.m21883c();
        int[] iArr = notificationDetails.additionalFlags;
        if (iArr != null && iArr.length > 0) {
            for (int i13 : iArr) {
                m21883c.flags = i13 | m21883c.flags;
            }
        }
        return m21883c;
    }

    private void createNotificationChannel(MethodCall methodCall, MethodChannel.Result result) {
        setupNotificationChannel(this.applicationContext, NotificationChannelDetails.from((Map) methodCall.arguments()));
        result.success(null);
    }

    private void createNotificationChannelGroup(MethodCall methodCall, MethodChannel.Result result) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            NotificationChannelGroupDetails from = NotificationChannelGroupDetails.from((Map) methodCall.arguments());
            NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
            NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(from.f4162id, from.name);
            if (i10 >= 28) {
                notificationChannelGroup.setDescription(from.description);
            }
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
        result.success(null);
    }

    private void deleteNotificationChannel(MethodCall methodCall, MethodChannel.Result result) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE)).deleteNotificationChannel((String) methodCall.arguments());
        }
        result.success(null);
    }

    private void deleteNotificationChannelGroup(MethodCall methodCall, MethodChannel.Result result) {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) this.applicationContext.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE)).deleteNotificationChannelGroup((String) methodCall.arguments());
        }
        result.success(null);
    }

    private Map<String, Object> describeIcon(IconCompat iconCompat) {
        IconSource iconSource;
        String resourceEntryName;
        if (iconCompat == null) {
            return null;
        }
        int m1136q = iconCompat.m1136q();
        if (m1136q == 2) {
            iconSource = IconSource.DrawableResource;
            resourceEntryName = this.applicationContext.getResources().getResourceEntryName(iconCompat.m1134n());
        } else {
            if (m1136q != 4) {
                return null;
            }
            iconSource = IconSource.ContentUri;
            resourceEntryName = iconCompat.m1137r().toString();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("source", Integer.valueOf(iconSource.ordinal()));
        hashMap.put("data", resourceEntryName);
        return hashMap;
    }

    private Map<String, Object> describePerson(C5500r c5500r) {
        if (c5500r == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.KEY, c5500r.m22106d());
        hashMap.put("name", c5500r.m22107e());
        hashMap.put("uri", c5500r.m22108f());
        hashMap.put("bot", Boolean.valueOf(c5500r.m22109g()));
        hashMap.put("important", Boolean.valueOf(c5500r.m22110h()));
        hashMap.put("icon", describeIcon(c5500r.m22105c()));
        return hashMap;
    }

    private NotificationDetails extractNotificationDetails(MethodChannel.Result result, Map<String, Object> map) {
        NotificationDetails from = NotificationDetails.from(map);
        if (hasInvalidIcon(result, from.icon) || hasInvalidLargeIcon(result, from.largeIcon, from.largeIconBitmapSource) || hasInvalidBigPictureResources(result, from) || hasInvalidRawSoundResource(result, from) || hasInvalidLedDetails(result, from)) {
            return null;
        }
        return from;
    }

    public static Map<String, Object> extractNotificationResponseMap(Intent intent) {
        int intExtra = intent.getIntExtra(NOTIFICATION_ID, 0);
        HashMap hashMap = new HashMap();
        hashMap.put(NOTIFICATION_ID, Integer.valueOf(intExtra));
        hashMap.put(ACTION_ID, intent.getStringExtra(ACTION_ID));
        hashMap.put(PAYLOAD, intent.getStringExtra(PAYLOAD));
        Bundle m22127k = C5502t.m22127k(intent);
        if (m22127k != null) {
            hashMap.put(INPUT, m22127k.getString(INPUT_RESULT));
        }
        if (SELECT_NOTIFICATION.equals(intent.getAction())) {
            hashMap.put(NOTIFICATION_RESPONSE_TYPE, 0);
        }
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            hashMap.put(NOTIFICATION_RESPONSE_TYPE, 1);
        }
        return hashMap;
    }

    private static Spanned fromHtml(String str) {
        if (str == null) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    private void getActiveNotificationMessagingStyle(MethodCall methodCall, MethodChannel.Result result) {
        Notification notification;
        if (Build.VERSION.SDK_INT < 23) {
            result.error(UNSUPPORTED_OS_VERSION_ERROR_CODE, "Android version must be 6.0 or newer to use getActiveNotificationMessagingStyle", null);
            return;
        }
        NotificationManager notificationManager = (NotificationManager) this.applicationContext.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
        try {
            Map map = (Map) methodCall.arguments();
            int intValue = ((Integer) map.get(CANCEL_ID)).intValue();
            String str = (String) map.get(CANCEL_TAG);
            for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
                if (statusBarNotification.getId() == intValue && (str == null || str.equals(statusBarNotification.getTag()))) {
                    notification = statusBarNotification.getNotification();
                    break;
                }
            }
            notification = null;
            if (notification == null) {
                result.success(null);
                return;
            }
            C5494l.i m21954y = C5494l.i.m21954y(notification);
            if (m21954y == null) {
                result.success(null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("groupConversation", Boolean.valueOf(m21954y.m21959E()));
            hashMap.put("person", describePerson(m21954y.m21957C()));
            hashMap.put("conversationTitle", m21954y.m21955A());
            ArrayList arrayList = new ArrayList();
            for (C5494l.i.e eVar : m21954y.m21956B()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("text", eVar.m21983h());
                hashMap2.put(Constants.TIMESTAMP, Long.valueOf(eVar.m21984i()));
                hashMap2.put("person", describePerson(eVar.m21982g()));
                arrayList.add(hashMap2);
            }
            hashMap.put("messages", arrayList);
            result.success(hashMap);
        } catch (Throwable th) {
            result.error(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private void getActiveNotifications(MethodChannel.Result result) {
        if (Build.VERSION.SDK_INT < 23) {
            result.error(UNSUPPORTED_OS_VERSION_ERROR_CODE, GET_ACTIVE_NOTIFICATIONS_ERROR_MESSAGE, null);
            return;
        }
        try {
            StatusBarNotification[] activeNotifications = ((NotificationManager) this.applicationContext.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE)).getActiveNotifications();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                HashMap hashMap = new HashMap();
                hashMap.put(CANCEL_ID, Integer.valueOf(statusBarNotification.getId()));
                Notification notification = statusBarNotification.getNotification();
                if (Build.VERSION.SDK_INT >= 26) {
                    hashMap.put("channelId", notification.getChannelId());
                }
                hashMap.put(CANCEL_TAG, statusBarNotification.getTag());
                hashMap.put("groupKey", notification.getGroup());
                hashMap.put("title", notification.extras.getCharSequence("android.title"));
                hashMap.put("body", notification.extras.getCharSequence("android.text"));
                hashMap.put("bigText", notification.extras.getCharSequence("android.bigText"));
                arrayList.add(hashMap);
            }
            result.success(arrayList);
        } catch (Throwable th) {
            result.error(UNSUPPORTED_OS_VERSION_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static AlarmManager getAlarmManager(Context context) {
        return (AlarmManager) context.getSystemService("alarm");
    }

    private static Bitmap getBitmapFromSource(Context context, Object obj, BitmapSource bitmapSource) {
        if (bitmapSource == BitmapSource.DrawableResource) {
            return BitmapFactory.decodeResource(context.getResources(), getDrawableResourceId(context, (String) obj));
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return BitmapFactory.decodeFile((String) obj);
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return null;
        }
        byte[] castObjectToByteArray = castObjectToByteArray(obj);
        return BitmapFactory.decodeByteArray(castObjectToByteArray, 0, castObjectToByteArray.length);
    }

    private static PendingIntent getBroadcastPendingIntent(Context context, int i10, Intent intent) {
        return PendingIntent.getBroadcast(context, i10, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
    }

    private void getCallbackHandle(MethodChannel.Result result) {
        result.success(new IsolatePreferences(this.applicationContext).getCallbackHandle());
    }

    private static int getDrawableResourceId(Context context, String str) {
        return context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName());
    }

    private static IconCompat getIconFromSource(Context context, Object obj, IconSource iconSource) {
        int i10 = C11384.f4154xe7097e9f[iconSource.ordinal()];
        if (i10 == 1) {
            return IconCompat.m1129k(context, getDrawableResourceId(context, (String) obj));
        }
        if (i10 == 2) {
            return IconCompat.m1125g(BitmapFactory.decodeFile((String) obj));
        }
        if (i10 == 3) {
            return IconCompat.m1127i((String) obj);
        }
        if (i10 != 4) {
            if (i10 != 5) {
                return null;
            }
            byte[] castObjectToByteArray = castObjectToByteArray(obj);
            return IconCompat.m1128j(castObjectToByteArray, 0, castObjectToByteArray.length);
        }
        try {
            AssetFileDescriptor openFd = context.getAssets().openFd(FlutterInjector.instance().flutterLoader().getLookupKeyForAsset((String) obj));
            FileInputStream createInputStream = openFd.createInputStream();
            IconCompat m1125g = IconCompat.m1125g(BitmapFactory.decodeStream(createInputStream));
            createInputStream.close();
            openFd.close();
            return m1125g;
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Intent getLaunchIntent(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }

    private HashMap<String, Object> getMappedNotificationChannel(NotificationChannel notificationChannel) {
        String uri;
        HashMap<String, Object> hashMap = new HashMap<>();
        if (Build.VERSION.SDK_INT >= 26) {
            hashMap.put(CANCEL_ID, notificationChannel.getId());
            hashMap.put("name", notificationChannel.getName());
            hashMap.put("description", notificationChannel.getDescription());
            hashMap.put("groupId", notificationChannel.getGroup());
            hashMap.put("showBadge", Boolean.valueOf(notificationChannel.canShowBadge()));
            hashMap.put("importance", Integer.valueOf(notificationChannel.getImportance()));
            Uri sound = notificationChannel.getSound();
            if (sound == null) {
                hashMap.put("sound", null);
                hashMap.put("playSound", Boolean.FALSE);
            } else {
                hashMap.put("playSound", Boolean.TRUE);
                List asList = Arrays.asList(SoundSource.values());
                if (sound.getScheme().equals("android.resource")) {
                    uri = sound.toString().split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)[r1.length - 1];
                    Integer tryParseInt = tryParseInt(uri);
                    if (tryParseInt == null || (uri = this.applicationContext.getResources().getResourceEntryName(tryParseInt.intValue())) != null) {
                        hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.RawResource)));
                    }
                } else {
                    hashMap.put("soundSource", Integer.valueOf(asList.indexOf(SoundSource.Uri)));
                    uri = sound.toString();
                }
                hashMap.put("sound", uri);
            }
            hashMap.put("enableVibration", Boolean.valueOf(notificationChannel.shouldVibrate()));
            hashMap.put("vibrationPattern", notificationChannel.getVibrationPattern());
            hashMap.put("enableLights", Boolean.valueOf(notificationChannel.shouldShowLights()));
            hashMap.put("ledColor", Integer.valueOf(notificationChannel.getLightColor()));
            AudioAttributes audioAttributes = notificationChannel.getAudioAttributes();
            hashMap.put("audioAttributesUsage", Integer.valueOf(audioAttributes == null ? 5 : audioAttributes.getUsage()));
        }
        return hashMap;
    }

    private static String getNextFireDate(NotificationDetails notificationDetails) {
        LocalDateTime plusWeeks;
        ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency = notificationDetails.scheduledNotificationRepeatFrequency;
        if (scheduledNotificationRepeatFrequency == ScheduledNotificationRepeatFrequency.Daily) {
            plusWeeks = LocalDateTime.parse(notificationDetails.scheduledDateTime).plusDays(1L);
        } else {
            if (scheduledNotificationRepeatFrequency != ScheduledNotificationRepeatFrequency.Weekly) {
                return null;
            }
            plusWeeks = LocalDateTime.parse(notificationDetails.scheduledDateTime).plusWeeks(1L);
        }
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(plusWeeks);
    }

    private static String getNextFireDateMatchingDateTimeComponents(NotificationDetails notificationDetails) {
        ZoneId of = ZoneId.of(notificationDetails.timeZoneName);
        ZonedDateTime of2 = ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), of);
        ZonedDateTime now = ZonedDateTime.now(of);
        ZonedDateTime of3 = ZonedDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), of2.getHour(), of2.getMinute(), of2.getSecond(), of2.getNano(), of);
        while (of3.isBefore(now)) {
            of3 = of3.plusDays(1L);
        }
        DateTimeComponents dateTimeComponents = notificationDetails.matchDateTimeComponents;
        if (dateTimeComponents != DateTimeComponents.Time) {
            if (dateTimeComponents == DateTimeComponents.DayOfWeekAndTime) {
                while (of3.getDayOfWeek() != of2.getDayOfWeek()) {
                    of3 = of3.plusDays(1L);
                }
            } else if (dateTimeComponents == DateTimeComponents.DayOfMonthAndTime) {
                while (of3.getDayOfMonth() != of2.getDayOfMonth()) {
                    of3 = of3.plusDays(1L);
                }
            } else {
                if (dateTimeComponents != DateTimeComponents.DateAndTime) {
                    return null;
                }
                while (true) {
                    if (of3.getMonthValue() == of2.getMonthValue() && of3.getDayOfMonth() == of2.getDayOfMonth()) {
                        break;
                    }
                    of3 = of3.plusDays(1L);
                }
            }
        }
        return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(of3);
    }

    private void getNotificationAppLaunchDetails(MethodChannel.Result result) {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        Activity activity = this.mainActivity;
        if (activity != null) {
            Intent intent = activity.getIntent();
            Boolean valueOf = Boolean.valueOf(intent != null && (SELECT_NOTIFICATION.equals(intent.getAction()) || SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) && !launchedActivityFromHistory(intent));
            if (valueOf.booleanValue()) {
                hashMap.put("notificationResponse", extractNotificationResponseMap(intent));
            }
            bool = valueOf;
        }
        hashMap.put(NOTIFICATION_LAUNCHED_APP, bool);
        result.success(hashMap);
    }

    private void getNotificationChannels(MethodChannel.Result result) {
        try {
            List<NotificationChannel> m22075h = getNotificationManager(this.applicationContext).m22075h();
            ArrayList arrayList = new ArrayList();
            Iterator<NotificationChannel> it = m22075h.iterator();
            while (it.hasNext()) {
                arrayList.add(getMappedNotificationChannel(it.next()));
            }
            result.success(arrayList);
        } catch (Throwable th) {
            result.error(GET_NOTIFICATION_CHANNELS_ERROR_CODE, th.getMessage(), Log.getStackTraceString(th));
        }
    }

    private static C5497o getNotificationManager(Context context) {
        return C5497o.m22067f(context);
    }

    private boolean hasInvalidBigPictureResources(MethodChannel.Result result, NotificationDetails notificationDetails) {
        if (notificationDetails.style != NotificationStyle.BigPicture) {
            return false;
        }
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        if (hasInvalidLargeIcon(result, bigPictureStyleInformation.largeIcon, bigPictureStyleInformation.largeIconBitmapSource)) {
            return true;
        }
        BitmapSource bitmapSource = bigPictureStyleInformation.bigPictureBitmapSource;
        if (bitmapSource == BitmapSource.DrawableResource) {
            String str = (String) bigPictureStyleInformation.bigPicture;
            return StringUtils.isNullOrEmpty(str).booleanValue() && !isValidDrawableResource(this.applicationContext, str, result, INVALID_BIG_PICTURE_ERROR_CODE);
        }
        if (bitmapSource == BitmapSource.FilePath) {
            return StringUtils.isNullOrEmpty((String) bigPictureStyleInformation.bigPicture).booleanValue();
        }
        if (bitmapSource != BitmapSource.ByteArray) {
            return false;
        }
        byte[] bArr = (byte[]) bigPictureStyleInformation.bigPicture;
        return bArr == null || bArr.length == 0;
    }

    private boolean hasInvalidIcon(MethodChannel.Result result, String str) {
        return (StringUtils.isNullOrEmpty(str).booleanValue() || isValidDrawableResource(this.applicationContext, str, result, INVALID_ICON_ERROR_CODE)) ? false : true;
    }

    private boolean hasInvalidLargeIcon(MethodChannel.Result result, Object obj, BitmapSource bitmapSource) {
        BitmapSource bitmapSource2 = BitmapSource.DrawableResource;
        if (bitmapSource != bitmapSource2 && bitmapSource != BitmapSource.FilePath) {
            return bitmapSource == BitmapSource.ByteArray && ((byte[]) obj).length == 0;
        }
        String str = (String) obj;
        return (StringUtils.isNullOrEmpty(str).booleanValue() || bitmapSource != bitmapSource2 || isValidDrawableResource(this.applicationContext, str, result, INVALID_LARGE_ICON_ERROR_CODE)) ? false : true;
    }

    private boolean hasInvalidLedDetails(MethodChannel.Result result, NotificationDetails notificationDetails) {
        if (notificationDetails.ledColor == null) {
            return false;
        }
        if (notificationDetails.ledOnMs != null && notificationDetails.ledOffMs != null) {
            return false;
        }
        result.error(INVALID_LED_DETAILS_ERROR_CODE, INVALID_LED_DETAILS_ERROR_MESSAGE, null);
        return true;
    }

    private boolean hasInvalidRawSoundResource(MethodChannel.Result result, NotificationDetails notificationDetails) {
        SoundSource soundSource;
        if (StringUtils.isNullOrEmpty(notificationDetails.sound).booleanValue() || !(((soundSource = notificationDetails.soundSource) == null || soundSource == SoundSource.RawResource) && this.applicationContext.getResources().getIdentifier(notificationDetails.sound, "raw", this.applicationContext.getPackageName()) == 0)) {
            return false;
        }
        result.error(INVALID_SOUND_ERROR_CODE, String.format(INVALID_RAW_RESOURCE_ERROR_MESSAGE, notificationDetails.sound), null);
        return true;
    }

    private void initialize(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) ((Map) methodCall.arguments()).get(DEFAULT_ICON);
        if (isValidDrawableResource(this.applicationContext, str, result, INVALID_ICON_ERROR_CODE)) {
            Long parseLong = LongUtils.parseLong(methodCall.argument(DISPATCHER_HANDLE));
            Long parseLong2 = LongUtils.parseLong(methodCall.argument(CALLBACK_HANDLE));
            if (parseLong != null && parseLong2 != null) {
                new IsolatePreferences(this.applicationContext).saveCallbackKeys(parseLong, parseLong2);
            }
            this.applicationContext.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).edit().putString(DEFAULT_ICON, str).apply();
            result.success(Boolean.TRUE);
        }
    }

    private static boolean isValidDrawableResource(Context context, String str, MethodChannel.Result result, String str2) {
        if (context.getResources().getIdentifier(str, DRAWABLE, context.getPackageName()) != 0) {
            return true;
        }
        result.error(str2, String.format(INVALID_DRAWABLE_RESOURCE_ERROR_MESSAGE, str), null);
        return false;
    }

    private static boolean launchedActivityFromHistory(Intent intent) {
        return intent != null && (intent.getFlags() & 1048576) == 1048576;
    }

    private static ArrayList<NotificationDetails> loadScheduledNotifications(Context context) {
        ArrayList<NotificationDetails> arrayList = new ArrayList<>();
        String string = context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).getString(SCHEDULED_NOTIFICATIONS, null);
        return string != null ? (ArrayList) buildGson().m5585h(string, new C5740a<ArrayList<NotificationDetails>>() { // from class: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin.1
        }.getType()) : arrayList;
    }

    private void pendingNotificationRequests(MethodChannel.Result result) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(this.applicationContext);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put(CANCEL_ID, next.f4164id);
            hashMap.put("title", next.title);
            hashMap.put("body", next.body);
            hashMap.put(PAYLOAD, next.payload);
            arrayList.add(hashMap);
        }
        result.success(arrayList);
    }

    private void processForegroundNotificationAction(Intent intent, Map<String, Object> map) {
        if (intent.getBooleanExtra(CANCEL_NOTIFICATION, false)) {
            C5497o.m22067f(this.applicationContext).m22071b(((Integer) map.get(NOTIFICATION_ID)).intValue());
        }
    }

    public static void removeNotificationFromCache(Context context, Integer num) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().f4164id.equals(num)) {
                it.remove();
                break;
            }
        }
        saveScheduledNotifications(context, loadScheduledNotifications);
    }

    private void repeat(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (extractNotificationDetails != null) {
            try {
                repeatNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
                result.success(null);
            } catch (PluginException e10) {
                result.error(e10.code, e10.getMessage(), null);
            }
        }
    }

    private static void repeatNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        long calculateRepeatIntervalMilliseconds = calculateRepeatIntervalMilliseconds(notificationDetails);
        long longValue = notificationDetails.calledAt.longValue();
        if (notificationDetails.repeatTime != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(11, notificationDetails.repeatTime.hour.intValue());
            calendar.set(12, notificationDetails.repeatTime.minute.intValue());
            calendar.set(13, notificationDetails.repeatTime.second.intValue());
            Integer num = notificationDetails.day;
            if (num != null) {
                calendar.set(7, num.intValue());
            }
            longValue = calendar.getTimeInMillis();
        }
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(longValue, calculateRepeatIntervalMilliseconds);
        String m5593q = buildGson().m5593q(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, m5593q);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.f4164id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.inexact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, calculateNextNotificationTrigger, broadcastPendingIntent);
        } else {
            alarmManager.setInexactRepeating(0, calculateNextNotificationTrigger, calculateRepeatIntervalMilliseconds, broadcastPendingIntent);
        }
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    public static void rescheduleNotifications(Context context) {
        Iterator<NotificationDetails> it = loadScheduledNotifications(context).iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            try {
                if (next.repeatInterval != null) {
                    repeatNotification(context, next, Boolean.FALSE);
                } else if (next.timeZoneName != null) {
                    zonedScheduleNotification(context, next, Boolean.FALSE);
                } else {
                    scheduleNotification(context, next, Boolean.FALSE);
                }
            } catch (ExactAlarmPermissionException e10) {
                Log.e(TAG, e10.getMessage());
                removeNotificationFromCache(context, next.f4164id);
            }
        }
    }

    private static Uri retrieveSoundResourceUri(Context context, String str, SoundSource soundSource) {
        if (StringUtils.isNullOrEmpty(str).booleanValue()) {
            return RingtoneManager.getDefaultUri(2);
        }
        if (soundSource != null && soundSource != SoundSource.RawResource) {
            if (soundSource == SoundSource.Uri) {
                return Uri.parse(str);
            }
            return null;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
    }

    private static void saveScheduledNotification(Context context, NotificationDetails notificationDetails) {
        ArrayList<NotificationDetails> loadScheduledNotifications = loadScheduledNotifications(context);
        ArrayList arrayList = new ArrayList();
        Iterator<NotificationDetails> it = loadScheduledNotifications.iterator();
        while (it.hasNext()) {
            NotificationDetails next = it.next();
            if (!next.f4164id.equals(notificationDetails.f4164id)) {
                arrayList.add(next);
            }
        }
        arrayList.add(notificationDetails);
        saveScheduledNotifications(context, arrayList);
    }

    private static void saveScheduledNotifications(Context context, ArrayList<NotificationDetails> arrayList) {
        context.getSharedPreferences(SCHEDULED_NOTIFICATIONS, 0).edit().putString(SCHEDULED_NOTIFICATIONS, buildGson().m5593q(arrayList)).apply();
    }

    public static void scheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        try {
            if (notificationDetails.scheduledNotificationRepeatFrequency != null) {
                zonedScheduleNextNotification(context, notificationDetails);
            } else if (notificationDetails.matchDateTimeComponents != null) {
                zonedScheduleNextNotificationMatchingDateComponents(context, notificationDetails);
            } else if (notificationDetails.repeatInterval != null) {
                scheduleNextRepeatingNotification(context, notificationDetails);
            } else {
                removeNotificationFromCache(context, notificationDetails.f4164id);
            }
        } catch (ExactAlarmPermissionException e10) {
            Log.e(TAG, e10.getMessage());
            removeNotificationFromCache(context, notificationDetails.f4164id);
        }
    }

    private static void scheduleNextRepeatingNotification(Context context, NotificationDetails notificationDetails) {
        long calculateNextNotificationTrigger = calculateNextNotificationTrigger(notificationDetails.calledAt.longValue(), calculateRepeatIntervalMilliseconds(notificationDetails));
        String m5593q = buildGson().m5593q(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, m5593q);
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, notificationDetails.f4164id.intValue(), intent);
        AlarmManager alarmManager = getAlarmManager(context);
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exactAllowWhileIdle;
        }
        setupAllowWhileIdleAlarm(notificationDetails, alarmManager, calculateNextNotificationTrigger, broadcastPendingIntent);
        saveScheduledNotification(context, notificationDetails);
    }

    private static void scheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String m5593q = buildGson().m5593q(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, m5593q);
        setupAlarm(notificationDetails, getAlarmManager(context), notificationDetails.millisecondsSinceEpoch.longValue(), getBroadcastPendingIntent(context, notificationDetails.f4164id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    private Boolean sendNotificationPayloadMessage(Intent intent) {
        if (!SELECT_NOTIFICATION.equals(intent.getAction()) && !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return Boolean.FALSE;
        }
        Map<String, Object> extractNotificationResponseMap = extractNotificationResponseMap(intent);
        if (SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            processForegroundNotificationAction(intent, extractNotificationResponseMap);
        }
        this.channel.invokeMethod("didReceiveNotificationResponse", extractNotificationResponseMap);
        return Boolean.TRUE;
    }

    private void setActivity(Activity activity) {
        this.mainActivity = activity;
    }

    private static void setBigPictureStyle(Context context, NotificationDetails notificationDetails, C5494l.e eVar) {
        Bitmap bitmapFromSource;
        BigPictureStyleInformation bigPictureStyleInformation = (BigPictureStyleInformation) notificationDetails.styleInformation;
        C5494l.b bVar = new C5494l.b();
        if (bigPictureStyleInformation.contentTitle != null) {
            bVar.m21833B(bigPictureStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigPictureStyleInformation.contentTitle) : bigPictureStyleInformation.contentTitle);
        }
        if (bigPictureStyleInformation.summaryText != null) {
            bVar.m21834C(bigPictureStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(bigPictureStyleInformation.summaryText) : bigPictureStyleInformation.summaryText);
        }
        if (!bigPictureStyleInformation.hideExpandedLargeIcon.booleanValue()) {
            Object obj = bigPictureStyleInformation.largeIcon;
            bitmapFromSource = obj != null ? getBitmapFromSource(context, obj, bigPictureStyleInformation.largeIconBitmapSource) : null;
            bVar.m21838z(getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource));
            eVar.m21873P(bVar);
        }
        bVar.m21837y(bitmapFromSource);
        bVar.m21838z(getBitmapFromSource(context, bigPictureStyleInformation.bigPicture, bigPictureStyleInformation.bigPictureBitmapSource));
        eVar.m21873P(bVar);
    }

    private static void setBigTextStyle(NotificationDetails notificationDetails, C5494l.e eVar) {
        BigTextStyleInformation bigTextStyleInformation = (BigTextStyleInformation) notificationDetails.styleInformation;
        C5494l.c cVar = new C5494l.c();
        if (bigTextStyleInformation.bigText != null) {
            cVar.m21849x(bigTextStyleInformation.htmlFormatBigText.booleanValue() ? fromHtml(bigTextStyleInformation.bigText) : bigTextStyleInformation.bigText);
        }
        if (bigTextStyleInformation.contentTitle != null) {
            cVar.m21850y(bigTextStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(bigTextStyleInformation.contentTitle) : bigTextStyleInformation.contentTitle);
        }
        if (bigTextStyleInformation.summaryText != null) {
            boolean booleanValue = bigTextStyleInformation.htmlFormatSummaryText.booleanValue();
            String str = bigTextStyleInformation.summaryText;
            CharSequence charSequence = str;
            if (booleanValue) {
                charSequence = fromHtml(str);
            }
            cVar.m21851z(charSequence);
        }
        eVar.m21873P(cVar);
    }

    private void setCanScheduleExactNotifications(MethodChannel.Result result) {
        result.success(Build.VERSION.SDK_INT < 31 ? Boolean.TRUE : Boolean.valueOf(getAlarmManager(this.applicationContext).canScheduleExactAlarms()));
    }

    private static void setCategory(NotificationDetails notificationDetails, C5494l.e eVar) {
        String str = notificationDetails.category;
        if (str == null) {
            return;
        }
        eVar.m21893n(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x.l$h, x.l$j] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.text.Spanned] */
    /* JADX WARN: Type inference failed for: r5v0, types: [x.l$e] */
    private static void setInboxStyle(NotificationDetails notificationDetails, C5494l.e eVar) {
        InboxStyleInformation inboxStyleInformation = (InboxStyleInformation) notificationDetails.styleInformation;
        ?? hVar = new C5494l.h();
        if (inboxStyleInformation.contentTitle != null) {
            hVar.m21948y(inboxStyleInformation.htmlFormatContentTitle.booleanValue() ? fromHtml(inboxStyleInformation.contentTitle) : inboxStyleInformation.contentTitle);
        }
        if (inboxStyleInformation.summaryText != null) {
            hVar.m21949z(inboxStyleInformation.htmlFormatSummaryText.booleanValue() ? fromHtml(inboxStyleInformation.summaryText) : inboxStyleInformation.summaryText);
        }
        ArrayList<String> arrayList = inboxStyleInformation.lines;
        if (arrayList != null) {
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (inboxStyleInformation.htmlFormatLines.booleanValue()) {
                    next = fromHtml(next);
                }
                hVar.m21947x(next);
            }
        }
        eVar.m21873P(hVar);
    }

    private static void setLights(NotificationDetails notificationDetails, C5494l.e eVar) {
        if (!BooleanUtils.getValue(notificationDetails.enableLights) || notificationDetails.ledOnMs == null || notificationDetails.ledOffMs == null) {
            return;
        }
        eVar.m21861D(notificationDetails.ledColor.intValue(), notificationDetails.ledOnMs.intValue(), notificationDetails.ledOffMs.intValue());
    }

    private static void setMediaStyle(C5494l.e eVar) {
        eVar.m21873P(new C2579a());
    }

    private static void setMessagingStyle(Context context, NotificationDetails notificationDetails, C5494l.e eVar) {
        MessagingStyleInformation messagingStyleInformation = (MessagingStyleInformation) notificationDetails.styleInformation;
        C5494l.i iVar = new C5494l.i(buildPerson(context, messagingStyleInformation.person));
        iVar.m21963I(BooleanUtils.getValue(messagingStyleInformation.groupConversation));
        String str = messagingStyleInformation.conversationTitle;
        if (str != null) {
            iVar.m21962H(str);
        }
        ArrayList<MessageDetails> arrayList = messagingStyleInformation.messages;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MessageDetails> it = messagingStyleInformation.messages.iterator();
            while (it.hasNext()) {
                iVar.m21964x(createMessage(context, it.next()));
            }
        }
        eVar.m21873P(iVar);
    }

    private static void setProgress(NotificationDetails notificationDetails, C5494l.e eVar) {
        if (BooleanUtils.getValue(notificationDetails.showProgress)) {
            eVar.m21867J(notificationDetails.maxProgress.intValue(), notificationDetails.progress.intValue(), notificationDetails.indeterminate.booleanValue());
        }
    }

    private static void setSmallIcon(Context context, NotificationDetails notificationDetails, C5494l.e eVar) {
        int intValue;
        if (StringUtils.isNullOrEmpty(notificationDetails.icon).booleanValue()) {
            String string = context.getSharedPreferences(SHARED_PREFERENCES_KEY, 0).getString(DEFAULT_ICON, null);
            intValue = StringUtils.isNullOrEmpty(string).booleanValue() ? notificationDetails.iconResourceId.intValue() : getDrawableResourceId(context, string);
        } else {
            intValue = getDrawableResourceId(context, notificationDetails.icon);
        }
        eVar.m21871N(intValue);
    }

    private static void setSound(Context context, NotificationDetails notificationDetails, C5494l.e eVar) {
        eVar.m21872O(BooleanUtils.getValue(notificationDetails.playSound) ? retrieveSoundResourceUri(context, notificationDetails.sound, notificationDetails.soundSource) : null);
    }

    private static void setStyle(Context context, NotificationDetails notificationDetails, C5494l.e eVar) {
        int i10 = C11384.f4155xa0df0c7b[notificationDetails.style.ordinal()];
        if (i10 == 1) {
            setBigPictureStyle(context, notificationDetails, eVar);
            return;
        }
        if (i10 == 2) {
            setBigTextStyle(notificationDetails, eVar);
            return;
        }
        if (i10 == 3) {
            setInboxStyle(notificationDetails, eVar);
        } else if (i10 == 4) {
            setMessagingStyle(context, notificationDetails, eVar);
        } else {
            if (i10 != 5) {
                return;
            }
            setMediaStyle(eVar);
        }
    }

    private static void setTimeoutAfter(NotificationDetails notificationDetails, C5494l.e eVar) {
        Long l10 = notificationDetails.timeoutAfter;
        if (l10 == null) {
            return;
        }
        eVar.m21876S(l10.longValue());
    }

    private static void setVibrationPattern(NotificationDetails notificationDetails, C5494l.e eVar) {
        if (!BooleanUtils.getValue(notificationDetails.enableVibration)) {
            eVar.m21878U(new long[]{0});
            return;
        }
        long[] jArr = notificationDetails.vibrationPattern;
        if (jArr == null || jArr.length <= 0) {
            return;
        }
        eVar.m21878U(jArr);
    }

    private static void setVisibility(NotificationDetails notificationDetails, C5494l.e eVar) {
        Integer num = notificationDetails.visibility;
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        int i10 = 1;
        if (intValue == 0) {
            i10 = 0;
        } else if (intValue != 1) {
            if (intValue != 2) {
                throw new IllegalArgumentException("Unknown index: " + notificationDetails.visibility);
            }
            i10 = -1;
        }
        eVar.m21879V(i10);
    }

    private static void setupAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j10, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode == null) {
            notificationDetails.scheduleMode = ScheduleMode.exact;
        }
        if (notificationDetails.scheduleMode.useAllowWhileIdle()) {
            setupAllowWhileIdleAlarm(notificationDetails, alarmManager, j10, pendingIntent);
            return;
        }
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            C5487e.m21778c(alarmManager, 0, j10, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            alarmManager.set(0, j10, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            C5487e.m21776a(alarmManager, j10, pendingIntent, pendingIntent);
        }
    }

    private static void setupAllowWhileIdleAlarm(NotificationDetails notificationDetails, AlarmManager alarmManager, long j10, PendingIntent pendingIntent) {
        if (notificationDetails.scheduleMode.useExactAlarm()) {
            checkCanScheduleExactAlarms(alarmManager);
            C5487e.m21779d(alarmManager, 0, j10, pendingIntent);
        } else if (!notificationDetails.scheduleMode.useAlarmClock()) {
            C5487e.m21777b(alarmManager, 0, j10, pendingIntent);
        } else {
            checkCanScheduleExactAlarms(alarmManager);
            C5487e.m21776a(alarmManager, j10, pendingIntent, pendingIntent);
        }
    }

    private static void setupNotificationChannel(Context context, NotificationChannelDetails notificationChannelDetails) {
        Integer num;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
            NotificationChannel notificationChannel = new NotificationChannel(notificationChannelDetails.f4160id, notificationChannelDetails.name, notificationChannelDetails.importance.intValue());
            notificationChannel.setDescription(notificationChannelDetails.description);
            notificationChannel.setGroup(notificationChannelDetails.groupId);
            if (notificationChannelDetails.playSound.booleanValue()) {
                Integer num2 = notificationChannelDetails.audioAttributesUsage;
                notificationChannel.setSound(retrieveSoundResourceUri(context, notificationChannelDetails.sound, notificationChannelDetails.soundSource), new AudioAttributes.Builder().setUsage(Integer.valueOf(num2 != null ? num2.intValue() : 5).intValue()).build());
            } else {
                notificationChannel.setSound(null, null);
            }
            notificationChannel.enableVibration(BooleanUtils.getValue(notificationChannelDetails.enableVibration));
            long[] jArr = notificationChannelDetails.vibrationPattern;
            if (jArr != null && jArr.length > 0) {
                notificationChannel.setVibrationPattern(jArr);
            }
            boolean value = BooleanUtils.getValue(notificationChannelDetails.enableLights);
            notificationChannel.enableLights(value);
            if (value && (num = notificationChannelDetails.ledColor) != null) {
                notificationChannel.setLightColor(num.intValue());
            }
            notificationChannel.setShowBadge(BooleanUtils.getValue(notificationChannelDetails.showBadge));
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private void show(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (extractNotificationDetails != null) {
            showNotification(this.applicationContext, extractNotificationDetails);
            result.success(null);
        }
    }

    public static void showNotification(Context context, NotificationDetails notificationDetails) {
        Notification createNotification = createNotification(context, notificationDetails);
        C5497o notificationManager = getNotificationManager(context);
        String str = notificationDetails.tag;
        int intValue = notificationDetails.f4164id.intValue();
        if (str != null) {
            notificationManager.m22077j(str, intValue, createNotification);
        } else {
            notificationManager.m22076i(intValue, createNotification);
        }
    }

    private void startForegroundService(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        Map<String, Object> map = (Map) methodCall.argument("notificationData");
        Integer num = (Integer) methodCall.argument("startType");
        ArrayList arrayList = (ArrayList) methodCall.argument("foregroundServiceTypes");
        if (arrayList != null && arrayList.size() == 0) {
            str = "If foregroundServiceTypes is non-null it must not be empty!";
        } else if (map == null || num == null) {
            str = "An argument passed to startForegroundService was null!";
        } else {
            NotificationDetails extractNotificationDetails = extractNotificationDetails(result, map);
            if (extractNotificationDetails == null) {
                return;
            }
            if (extractNotificationDetails.f4164id.intValue() != 0) {
                ForegroundServiceStartParameter foregroundServiceStartParameter = new ForegroundServiceStartParameter(extractNotificationDetails, num.intValue(), arrayList);
                Intent intent = new Intent(this.applicationContext, (Class<?>) ForegroundService.class);
                intent.putExtra(ForegroundServiceStartParameter.EXTRA, foregroundServiceStartParameter);
                C5782a.startForegroundService(this.applicationContext, intent);
                result.success(null);
                return;
            }
            str = "The id of the notification for a foreground service must not be 0!";
        }
        result.error("ARGUMENT_ERROR", str, null);
    }

    private void stopForegroundService(MethodChannel.Result result) {
        this.applicationContext.stopService(new Intent(this.applicationContext, (Class<?>) ForegroundService.class));
        result.success(null);
    }

    private Integer tryParseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private void zonedSchedule(MethodCall methodCall, MethodChannel.Result result) {
        NotificationDetails extractNotificationDetails = extractNotificationDetails(result, (Map) methodCall.arguments());
        if (extractNotificationDetails != null) {
            if (extractNotificationDetails.matchDateTimeComponents != null) {
                extractNotificationDetails.scheduledDateTime = getNextFireDateMatchingDateTimeComponents(extractNotificationDetails);
            }
            try {
                zonedScheduleNotification(this.applicationContext, extractNotificationDetails, Boolean.TRUE);
                result.success(null);
            } catch (PluginException e10) {
                result.error(e10.code, e10.getMessage(), null);
            }
        }
    }

    private static void zonedScheduleNextNotification(Context context, NotificationDetails notificationDetails) {
        String nextFireDate = getNextFireDate(notificationDetails);
        if (nextFireDate == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDate;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNextNotificationMatchingDateComponents(Context context, NotificationDetails notificationDetails) {
        String nextFireDateMatchingDateTimeComponents = getNextFireDateMatchingDateTimeComponents(notificationDetails);
        if (nextFireDateMatchingDateTimeComponents == null) {
            return;
        }
        notificationDetails.scheduledDateTime = nextFireDateMatchingDateTimeComponents;
        zonedScheduleNotification(context, notificationDetails, Boolean.TRUE);
    }

    private static void zonedScheduleNotification(Context context, NotificationDetails notificationDetails, Boolean bool) {
        String m5593q = buildGson().m5593q(notificationDetails);
        Intent intent = new Intent(context, (Class<?>) ScheduledNotificationReceiver.class);
        intent.putExtra(NOTIFICATION_DETAILS, m5593q);
        setupAlarm(notificationDetails, getAlarmManager(context), ZonedDateTime.of(LocalDateTime.parse(notificationDetails.scheduledDateTime), ZoneId.of(notificationDetails.timeZoneName)).toInstant().toEpochMilli(), getBroadcastPendingIntent(context, notificationDetails.f4164id.intValue(), intent));
        if (bool.booleanValue()) {
            saveScheduledNotification(context, notificationDetails);
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 1 && i10 != 2) {
            return false;
        }
        if (this.permissionRequestProgress == PermissionRequestProgress.RequestingExactAlarmsPermission && i10 == 2 && Build.VERSION.SDK_INT >= 31) {
            this.callback.complete(getAlarmManager(this.applicationContext).canScheduleExactAlarms());
            this.permissionRequestProgress = PermissionRequestProgress.None;
        }
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        activityPluginBinding.addRequestPermissionsResultListener(this);
        activityPluginBinding.addActivityResultListener(this);
        Activity activity = activityPluginBinding.getActivity();
        this.mainActivity = activity;
        Intent intent = activity.getIntent();
        if (launchedActivityFromHistory(intent) || !SELECT_FOREGROUND_NOTIFICATION_ACTION.equals(intent.getAction())) {
            return;
        }
        processForegroundNotificationAction(intent, extractNotificationResponseMap(intent));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.applicationContext = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), METHOD_CHANNEL);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
        this.channel = null;
        this.applicationContext = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2096263152:
                if (str.equals(STOP_FOREGROUND_SERVICE)) {
                    c10 = 0;
                    break;
                }
                break;
            case -2041662895:
                if (str.equals(GET_NOTIFICATION_CHANNELS_METHOD)) {
                    c10 = 1;
                    break;
                }
                break;
            case -1873731438:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c10 = 2;
                    break;
                }
                break;
            case -1785484984:
                if (str.equals(REQUEST_NOTIFICATIONS_PERMISSION_METHOD)) {
                    c10 = 3;
                    break;
                }
                break;
            case -1367724422:
                if (str.equals(CANCEL_METHOD)) {
                    c10 = 4;
                    break;
                }
                break;
            case -1108601471:
                if (str.equals(REQUEST_EXACT_ALARMS_PERMISSION_METHOD)) {
                    c10 = 5;
                    break;
                }
                break;
            case -799130106:
                if (str.equals(PENDING_NOTIFICATION_REQUESTS_METHOD)) {
                    c10 = 6;
                    break;
                }
                break;
            case -208611345:
                if (str.equals(GET_NOTIFICATION_APP_LAUNCH_DETAILS_METHOD)) {
                    c10 = 7;
                    break;
                }
                break;
            case 3529469:
                if (str.equals(SHOW_METHOD)) {
                    c10 = '\b';
                    break;
                }
                break;
            case 6625712:
                if (str.equals(PERIODICALLY_SHOW_METHOD)) {
                    c10 = '\t';
                    break;
                }
                break;
            case 116003316:
                if (str.equals(GET_ACTIVE_NOTIFICATION_MESSAGING_STYLE_METHOD)) {
                    c10 = '\n';
                    break;
                }
                break;
            case 476547271:
                if (str.equals(CANCEL_ALL_METHOD)) {
                    c10 = 11;
                    break;
                }
                break;
            case 548573423:
                if (str.equals(ZONED_SCHEDULE_METHOD)) {
                    c10 = '\f';
                    break;
                }
                break;
            case 767006947:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_GROUP_METHOD)) {
                    c10 = '\r';
                    break;
                }
                break;
            case 825311171:
                if (str.equals(GET_CALLBACK_HANDLE_METHOD)) {
                    c10 = 14;
                    break;
                }
                break;
            case 871091088:
                if (str.equals(INITIALIZE_METHOD)) {
                    c10 = 15;
                    break;
                }
                break;
            case 891942317:
                if (str.equals(ARE_NOTIFICATIONS_ENABLED_METHOD)) {
                    c10 = 16;
                    break;
                }
                break;
            case 972029712:
                if (str.equals(CAN_SCHEDULE_EXACT_NOTIFICATIONS_METHOD)) {
                    c10 = 17;
                    break;
                }
                break;
            case 1008472557:
                if (str.equals(DELETE_NOTIFICATION_CHANNEL_METHOD)) {
                    c10 = 18;
                    break;
                }
                break;
            case 1207771056:
                if (str.equals(START_FOREGROUND_SERVICE)) {
                    c10 = 19;
                    break;
                }
                break;
            case 1594833996:
                if (str.equals(GET_ACTIVE_NOTIFICATIONS_METHOD)) {
                    c10 = 20;
                    break;
                }
                break;
            case 1653467900:
                if (str.equals(CREATE_NOTIFICATION_CHANNEL_METHOD)) {
                    c10 = 21;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                stopForegroundService(result);
                return;
            case 1:
                getNotificationChannels(result);
                return;
            case 2:
                deleteNotificationChannelGroup(methodCall, result);
                return;
            case 3:
                requestNotificationsPermission(new PermissionRequestListener() { // from class: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin.2
                    @Override // com.dexterous.flutterlocalnotifications.PermissionRequestListener
                    public void complete(boolean z10) {
                        result.success(Boolean.valueOf(z10));
                    }

                    @Override // com.dexterous.flutterlocalnotifications.PermissionRequestListener
                    public void fail(String str2) {
                        result.error(FlutterLocalNotificationsPlugin.PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE, str2, null);
                    }
                });
                return;
            case 4:
                cancel(methodCall, result);
                return;
            case 5:
                requestExactAlarmsPermission(new PermissionRequestListener() { // from class: com.dexterous.flutterlocalnotifications.FlutterLocalNotificationsPlugin.3
                    @Override // com.dexterous.flutterlocalnotifications.PermissionRequestListener
                    public void complete(boolean z10) {
                        result.success(Boolean.valueOf(z10));
                    }

                    @Override // com.dexterous.flutterlocalnotifications.PermissionRequestListener
                    public void fail(String str2) {
                        result.error(FlutterLocalNotificationsPlugin.PERMISSION_REQUEST_IN_PROGRESS_ERROR_CODE, str2, null);
                    }
                });
                return;
            case 6:
                pendingNotificationRequests(result);
                return;
            case 7:
                getNotificationAppLaunchDetails(result);
                return;
            case '\b':
                show(methodCall, result);
                return;
            case '\t':
                repeat(methodCall, result);
                return;
            case '\n':
                getActiveNotificationMessagingStyle(methodCall, result);
                return;
            case 11:
                cancelAllNotifications(result);
                return;
            case '\f':
                zonedSchedule(methodCall, result);
                return;
            case '\r':
                createNotificationChannelGroup(methodCall, result);
                return;
            case 14:
                getCallbackHandle(result);
                return;
            case 15:
                initialize(methodCall, result);
                return;
            case 16:
                areNotificationsEnabled(result);
                return;
            case 17:
                setCanScheduleExactNotifications(result);
                return;
            case 18:
                deleteNotificationChannel(methodCall, result);
                return;
            case 19:
                startForegroundService(methodCall, result);
                return;
            case 20:
                getActiveNotifications(result);
                return;
            case 21:
                createNotificationChannel(methodCall, result);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        Activity activity;
        boolean booleanValue = sendNotificationPayloadMessage(intent).booleanValue();
        if (booleanValue && (activity = this.mainActivity) != null) {
            activity.setIntent(intent);
        }
        return booleanValue;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        activityPluginBinding.addRequestPermissionsResultListener(this);
        activityPluginBinding.addActivityResultListener(this);
        this.mainActivity = activityPluginBinding.getActivity();
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10 = false;
        if (this.permissionRequestProgress == PermissionRequestProgress.RequestingNotificationPermission && i10 == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                z10 = true;
            }
            this.callback.complete(z10);
            this.permissionRequestProgress = PermissionRequestProgress.None;
        }
        return z10;
    }

    public void requestExactAlarmsPermission(PermissionRequestListener permissionRequestListener) {
        PermissionRequestProgress permissionRequestProgress = this.permissionRequestProgress;
        PermissionRequestProgress permissionRequestProgress2 = PermissionRequestProgress.None;
        if (permissionRequestProgress != permissionRequestProgress2) {
            permissionRequestListener.fail(PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE);
            return;
        }
        this.callback = permissionRequestListener;
        if (Build.VERSION.SDK_INT < 31) {
            permissionRequestListener.complete(true);
            return;
        }
        if (getAlarmManager(this.applicationContext).canScheduleExactAlarms()) {
            this.callback.complete(true);
            this.permissionRequestProgress = permissionRequestProgress2;
            return;
        }
        this.permissionRequestProgress = PermissionRequestProgress.RequestingExactAlarmsPermission;
        this.mainActivity.startActivityForResult(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + this.applicationContext.getPackageName())), 2);
    }

    public void requestNotificationsPermission(PermissionRequestListener permissionRequestListener) {
        PermissionRequestProgress permissionRequestProgress = this.permissionRequestProgress;
        PermissionRequestProgress permissionRequestProgress2 = PermissionRequestProgress.None;
        if (permissionRequestProgress != permissionRequestProgress2) {
            permissionRequestListener.fail(PERMISSION_REQUEST_IN_PROGRESS_ERROR_MESSAGE);
            return;
        }
        this.callback = permissionRequestListener;
        if (Build.VERSION.SDK_INT < 33) {
            this.callback.complete(C5497o.m22067f(this.mainActivity).m22070a());
            return;
        }
        if (C5782a.checkSelfPermission(this.mainActivity, "android.permission.POST_NOTIFICATIONS") == 0) {
            this.callback.complete(true);
            this.permissionRequestProgress = permissionRequestProgress2;
        } else {
            this.permissionRequestProgress = PermissionRequestProgress.RequestingNotificationPermission;
            C5484b.m21745g(this.mainActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
        }
    }
}
