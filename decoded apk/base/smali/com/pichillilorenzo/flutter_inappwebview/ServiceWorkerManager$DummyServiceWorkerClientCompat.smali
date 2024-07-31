.class final Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager$DummyServiceWorkerClientCompat;
.super La2/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DummyServiceWorkerClientCompat"
.end annotation


# static fields
.field public static final INSTANCE:La2/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager$DummyServiceWorkerClientCompat;

    invoke-direct {v0}, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager$DummyServiceWorkerClientCompat;-><init>()V

    sput-object v0, Lcom/pichillilorenzo/flutter_inappwebview/ServiceWorkerManager$DummyServiceWorkerClientCompat;->INSTANCE:La2/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, La2/b;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
