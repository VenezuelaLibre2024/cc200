package io.flutter.plugins.urllauncher;

import android.util.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.urllauncher.Messages;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public class Messages {

    /* loaded from: classes2.dex */
    public static final class BrowserOptions {
        private Boolean showTitle;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Boolean showTitle;

            public BrowserOptions build() {
                BrowserOptions browserOptions = new BrowserOptions();
                browserOptions.setShowTitle(this.showTitle);
                return browserOptions;
            }

            public Builder setShowTitle(Boolean bool) {
                this.showTitle = bool;
                return this;
            }
        }

        public static BrowserOptions fromList(ArrayList<Object> arrayList) {
            BrowserOptions browserOptions = new BrowserOptions();
            browserOptions.setShowTitle((Boolean) arrayList.get(0));
            return browserOptions;
        }

        public Boolean getShowTitle() {
            return this.showTitle;
        }

        public void setShowTitle(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            this.showTitle = bool;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.showTitle);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    /* loaded from: classes2.dex */
    public interface UrlLauncherApi {
        static MessageCodec<Object> getCodec() {
            return UrlLauncherApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, urlLauncherApi.canLaunchUrl((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, urlLauncherApi.launchUrl((String) arrayList2.get(0), (Map) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, urlLauncherApi.openUrlInApp((String) arrayList2.get(0), (Boolean) arrayList2.get(1), (WebViewOptions) arrayList2.get(2), (BrowserOptions) arrayList2.get(3)));
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                arrayList.add(0, urlLauncherApi.supportsCustomTabs());
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(UrlLauncherApi urlLauncherApi, Object obj, BasicMessageChannel.Reply reply) {
            ArrayList<Object> arrayList = new ArrayList<>();
            try {
                urlLauncherApi.closeWebView();
                arrayList.add(0, null);
            } catch (Throwable th) {
                arrayList = Messages.wrapError(th);
            }
            reply.reply(arrayList);
        }

        static void setup(BinaryMessenger binaryMessenger, final UrlLauncherApi urlLauncherApi) {
            BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", getCodec());
            if (urlLauncherApi != null) {
                basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.UrlLauncherApi.lambda$setup$0(Messages.UrlLauncherApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", getCodec());
            if (urlLauncherApi != null) {
                basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.UrlLauncherApi.lambda$setup$1(Messages.UrlLauncherApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", getCodec());
            if (urlLauncherApi != null) {
                basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.UrlLauncherApi.lambda$setup$2(Messages.UrlLauncherApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", getCodec());
            if (urlLauncherApi != null) {
                basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.UrlLauncherApi.lambda$setup$3(Messages.UrlLauncherApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", getCodec());
            if (urlLauncherApi != null) {
                basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.urllauncher.a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                        Messages.UrlLauncherApi.lambda$setup$4(Messages.UrlLauncherApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
        }

        Boolean canLaunchUrl(String str);

        void closeWebView();

        Boolean launchUrl(String str, Map<String, String> map);

        Boolean openUrlInApp(String str, Boolean bool, WebViewOptions webViewOptions, BrowserOptions browserOptions);

        Boolean supportsCustomTabs();
    }

    /* loaded from: classes2.dex */
    public static class UrlLauncherApiCodec extends StandardMessageCodec {
        public static final UrlLauncherApiCodec INSTANCE = new UrlLauncherApiCodec();

        private UrlLauncherApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b10, ByteBuffer byteBuffer) {
            return b10 != Byte.MIN_VALUE ? b10 != -127 ? super.readValueOfType(b10, byteBuffer) : WebViewOptions.fromList((ArrayList) readValue(byteBuffer)) : BrowserOptions.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList<Object> list;
            if (obj instanceof BrowserOptions) {
                byteArrayOutputStream.write(128);
                list = ((BrowserOptions) obj).toList();
            } else if (!(obj instanceof WebViewOptions)) {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                list = ((WebViewOptions) obj).toList();
            }
            writeValue(byteArrayOutputStream, list);
        }
    }

    /* loaded from: classes2.dex */
    public static final class WebViewOptions {
        private Boolean enableDomStorage;
        private Boolean enableJavaScript;
        private Map<String, String> headers;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Boolean enableDomStorage;
            private Boolean enableJavaScript;
            private Map<String, String> headers;

            public WebViewOptions build() {
                WebViewOptions webViewOptions = new WebViewOptions();
                webViewOptions.setEnableJavaScript(this.enableJavaScript);
                webViewOptions.setEnableDomStorage(this.enableDomStorage);
                webViewOptions.setHeaders(this.headers);
                return webViewOptions;
            }

            public Builder setEnableDomStorage(Boolean bool) {
                this.enableDomStorage = bool;
                return this;
            }

            public Builder setEnableJavaScript(Boolean bool) {
                this.enableJavaScript = bool;
                return this;
            }

            public Builder setHeaders(Map<String, String> map) {
                this.headers = map;
                return this;
            }
        }

        public static WebViewOptions fromList(ArrayList<Object> arrayList) {
            WebViewOptions webViewOptions = new WebViewOptions();
            webViewOptions.setEnableJavaScript((Boolean) arrayList.get(0));
            webViewOptions.setEnableDomStorage((Boolean) arrayList.get(1));
            webViewOptions.setHeaders((Map) arrayList.get(2));
            return webViewOptions;
        }

        public Boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        public Boolean getEnableJavaScript() {
            return this.enableJavaScript;
        }

        public Map<String, String> getHeaders() {
            return this.headers;
        }

        public void setEnableDomStorage(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            this.enableDomStorage = bool;
        }

        public void setEnableJavaScript(Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
            }
            this.enableJavaScript = bool;
        }

        public void setHeaders(Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            this.headers = map;
        }

        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.enableJavaScript);
            arrayList.add(this.enableDomStorage);
            arrayList.add(this.headers);
            return arrayList;
        }
    }

    public static ArrayList<Object> wrapError(Throwable th) {
        Object obj;
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            obj = flutterError.details;
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            obj = "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th);
        }
        arrayList.add(obj);
        return arrayList;
    }
}
