.class public Lb2/s;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final A:Lb2/a$b;

.field public static final B:Lb2/a$b;

.field public static final C:Lb2/a$b;

.field public static final D:Lb2/a$b;

.field public static final E:Lb2/a$b;

.field public static final F:Lb2/a$b;

.field public static final G:Lb2/a$e;

.field public static final H:Lb2/a$e;

.field public static final I:Lb2/a$h;

.field public static final J:Lb2/a$h;

.field public static final K:Lb2/a$g;

.field public static final L:Lb2/a$h;

.field public static final M:Lb2/a$d;

.field public static final N:Lb2/a$d;

.field public static final O:Lb2/a$d;

.field public static final P:Lb2/a$d;

.field public static final Q:Lb2/a$d;

.field public static final R:Lb2/a$d;

.field public static final S:Lb2/a$d;

.field public static final T:Lb2/a$d;

.field public static final U:Lb2/a$d;

.field public static final V:Lb2/a$d;

.field public static final W:Lb2/a$d;

.field public static final X:Lb2/a$d;

.field public static final a:Lb2/a$b;

.field public static final b:Lb2/a$b;

.field public static final c:Lb2/a$e;

.field public static final d:Lb2/a$c;

.field public static final e:Lb2/a$f;

.field public static final f:Lb2/a$f;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final g:Lb2/a$f;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final h:Lb2/a$f;

.field public static final i:Lb2/a$f;

.field public static final j:Lb2/a$f;

.field public static final k:Lb2/a$c;

.field public static final l:Lb2/a$c;

.field public static final m:Lb2/a$c;

.field public static final n:Lb2/a$c;

.field public static final o:Lb2/a$c;

.field public static final p:Lb2/a$c;

.field public static final q:Lb2/a$b;

.field public static final r:Lb2/a$b;

.field public static final s:Lb2/a$c;

.field public static final t:Lb2/a$f;

.field public static final u:Lb2/a$c;

.field public static final v:Lb2/a$b;

.field public static final w:Lb2/a$b;

.field public static final x:Lb2/a$f;

.field public static final y:Lb2/a$f;

.field public static final z:Lb2/a$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lb2/a$b;

    const-string v1, "VISUAL_STATE_CALLBACK"

    invoke-direct {v0, v1, v1}, Lb2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->a:Lb2/a$b;

    new-instance v0, Lb2/a$b;

    const-string v1, "OFF_SCREEN_PRERASTER"

    invoke-direct {v0, v1, v1}, Lb2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->b:Lb2/a$b;

    new-instance v0, Lb2/a$e;

    const-string v1, "SAFE_BROWSING_ENABLE"

    invoke-direct {v0, v1, v1}, Lb2/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->c:Lb2/a$e;

    new-instance v0, Lb2/a$c;

    const-string v1, "DISABLED_ACTION_MODE_MENU_ITEMS"

    invoke-direct {v0, v1, v1}, Lb2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->d:Lb2/a$c;

    new-instance v0, Lb2/a$f;

    const-string v1, "START_SAFE_BROWSING"

    invoke-direct {v0, v1, v1}, Lb2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->e:Lb2/a$f;

    new-instance v0, Lb2/a$f;

    const-string v1, "SAFE_BROWSING_WHITELIST"

    invoke-direct {v0, v1, v1}, Lb2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->f:Lb2/a$f;

    new-instance v0, Lb2/a$f;

    const-string v2, "SAFE_BROWSING_ALLOWLIST"

    invoke-direct {v0, v1, v2}, Lb2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->g:Lb2/a$f;

    new-instance v0, Lb2/a$f;

    invoke-direct {v0, v2, v1}, Lb2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->h:Lb2/a$f;

    new-instance v0, Lb2/a$f;

    invoke-direct {v0, v2, v2}, Lb2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->i:Lb2/a$f;

    new-instance v0, Lb2/a$f;

    const-string v1, "SAFE_BROWSING_PRIVACY_POLICY_URL"

    invoke-direct {v0, v1, v1}, Lb2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->j:Lb2/a$f;

    new-instance v0, Lb2/a$c;

    const-string v1, "SERVICE_WORKER_BASIC_USAGE"

    invoke-direct {v0, v1, v1}, Lb2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->k:Lb2/a$c;

    new-instance v0, Lb2/a$c;

    const-string v1, "SERVICE_WORKER_CACHE_MODE"

    invoke-direct {v0, v1, v1}, Lb2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->l:Lb2/a$c;

    new-instance v0, Lb2/a$c;

    const-string v1, "SERVICE_WORKER_CONTENT_ACCESS"

    invoke-direct {v0, v1, v1}, Lb2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->m:Lb2/a$c;

    new-instance v0, Lb2/a$c;

    const-string v1, "SERVICE_WORKER_FILE_ACCESS"

    invoke-direct {v0, v1, v1}, Lb2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->n:Lb2/a$c;

    new-instance v0, Lb2/a$c;

    const-string v1, "SERVICE_WORKER_BLOCK_NETWORK_LOADS"

    invoke-direct {v0, v1, v1}, Lb2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->o:Lb2/a$c;

    new-instance v0, Lb2/a$c;

    const-string v1, "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"

    invoke-direct {v0, v1, v1}, Lb2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->p:Lb2/a$c;

    new-instance v0, Lb2/a$b;

    const-string v1, "RECEIVE_WEB_RESOURCE_ERROR"

    invoke-direct {v0, v1, v1}, Lb2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->q:Lb2/a$b;

    new-instance v0, Lb2/a$b;

    const-string v1, "RECEIVE_HTTP_ERROR"

    invoke-direct {v0, v1, v1}, Lb2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->r:Lb2/a$b;

    new-instance v0, Lb2/a$c;

    const-string v1, "SHOULD_OVERRIDE_WITH_REDIRECTS"

    invoke-direct {v0, v1, v1}, Lb2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->s:Lb2/a$c;

    new-instance v0, Lb2/a$f;

    const-string v1, "SAFE_BROWSING_HIT"

    invoke-direct {v0, v1, v1}, Lb2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->t:Lb2/a$f;

    new-instance v0, Lb2/a$c;

    const-string v1, "WEB_RESOURCE_REQUEST_IS_REDIRECT"

    invoke-direct {v0, v1, v1}, Lb2/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->u:Lb2/a$c;

    new-instance v0, Lb2/a$b;

    const-string v1, "WEB_RESOURCE_ERROR_GET_DESCRIPTION"

    invoke-direct {v0, v1, v1}, Lb2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->v:Lb2/a$b;

    new-instance v0, Lb2/a$b;

    const-string v1, "WEB_RESOURCE_ERROR_GET_CODE"

    invoke-direct {v0, v1, v1}, Lb2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->w:Lb2/a$b;

    new-instance v0, Lb2/a$f;

    const-string v1, "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY"

    invoke-direct {v0, v1, v1}, Lb2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->x:Lb2/a$f;

    new-instance v0, Lb2/a$f;

    const-string v1, "SAFE_BROWSING_RESPONSE_PROCEED"

    const-string v2, "SAFE_BROWSING_RESPONSE_PROCEED"

    invoke-direct {v0, v1, v2}, Lb2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->y:Lb2/a$f;

    new-instance v0, Lb2/a$f;

    const-string v1, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"

    const-string v2, "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL"

    invoke-direct {v0, v1, v2}, Lb2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->z:Lb2/a$f;

    new-instance v0, Lb2/a$b;

    const-string v1, "WEB_MESSAGE_PORT_POST_MESSAGE"

    const-string v2, "WEB_MESSAGE_PORT_POST_MESSAGE"

    invoke-direct {v0, v1, v2}, Lb2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->A:Lb2/a$b;

    new-instance v0, Lb2/a$b;

    const-string v1, "WEB_MESSAGE_PORT_CLOSE"

    const-string v2, "WEB_MESSAGE_PORT_CLOSE"

    invoke-direct {v0, v1, v2}, Lb2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->B:Lb2/a$b;

    new-instance v0, Lb2/a$b;

    const-string v1, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"

    const-string v2, "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK"

    invoke-direct {v0, v1, v2}, Lb2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->C:Lb2/a$b;

    new-instance v0, Lb2/a$b;

    const-string v1, "CREATE_WEB_MESSAGE_CHANNEL"

    const-string v2, "CREATE_WEB_MESSAGE_CHANNEL"

    invoke-direct {v0, v1, v2}, Lb2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->D:Lb2/a$b;

    new-instance v0, Lb2/a$b;

    const-string v1, "POST_WEB_MESSAGE"

    const-string v2, "POST_WEB_MESSAGE"

    invoke-direct {v0, v1, v2}, Lb2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->E:Lb2/a$b;

    new-instance v0, Lb2/a$b;

    const-string v1, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    const-string v2, "WEB_MESSAGE_CALLBACK_ON_MESSAGE"

    invoke-direct {v0, v1, v2}, Lb2/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->F:Lb2/a$b;

    new-instance v0, Lb2/a$e;

    const-string v1, "GET_WEB_VIEW_CLIENT"

    const-string v2, "GET_WEB_VIEW_CLIENT"

    invoke-direct {v0, v1, v2}, Lb2/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->G:Lb2/a$e;

    new-instance v0, Lb2/a$e;

    const-string v1, "GET_WEB_CHROME_CLIENT"

    const-string v2, "GET_WEB_CHROME_CLIENT"

    invoke-direct {v0, v1, v2}, Lb2/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->H:Lb2/a$e;

    new-instance v0, Lb2/a$h;

    const-string v1, "GET_WEB_VIEW_RENDERER"

    const-string v2, "GET_WEB_VIEW_RENDERER"

    invoke-direct {v0, v1, v2}, Lb2/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->I:Lb2/a$h;

    new-instance v0, Lb2/a$h;

    const-string v1, "WEB_VIEW_RENDERER_TERMINATE"

    const-string v2, "WEB_VIEW_RENDERER_TERMINATE"

    invoke-direct {v0, v1, v2}, Lb2/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->J:Lb2/a$h;

    new-instance v0, Lb2/a$g;

    const-string v1, "TRACING_CONTROLLER_BASIC_USAGE"

    const-string v2, "TRACING_CONTROLLER_BASIC_USAGE"

    invoke-direct {v0, v1, v2}, Lb2/a$g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->K:Lb2/a$g;

    new-instance v0, Lb2/a$h;

    const-string v1, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    const-string v2, "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"

    invoke-direct {v0, v1, v2}, Lb2/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->L:Lb2/a$h;

    new-instance v0, Lb2/a$d;

    const-string v1, "PROXY_OVERRIDE"

    const-string v2, "PROXY_OVERRIDE:3"

    invoke-direct {v0, v1, v2}, Lb2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->M:Lb2/a$d;

    new-instance v0, Lb2/a$d;

    const-string v1, "SUPPRESS_ERROR_PAGE"

    const-string v2, "SUPPRESS_ERROR_PAGE"

    invoke-direct {v0, v1, v2}, Lb2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->N:Lb2/a$d;

    new-instance v0, Lb2/a$d;

    const-string v1, "MULTI_PROCESS"

    const-string v2, "MULTI_PROCESS_QUERY"

    invoke-direct {v0, v1, v2}, Lb2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->O:Lb2/a$d;

    new-instance v0, Lb2/a$d;

    const-string v1, "FORCE_DARK"

    const-string v2, "FORCE_DARK"

    invoke-direct {v0, v1, v2}, Lb2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->P:Lb2/a$d;

    new-instance v0, Lb2/a$d;

    const-string v1, "FORCE_DARK_STRATEGY"

    const-string v2, "FORCE_DARK_BEHAVIOR"

    invoke-direct {v0, v1, v2}, Lb2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->Q:Lb2/a$d;

    new-instance v0, Lb2/a$d;

    const-string v1, "ALGORITHMIC_DARKENING"

    const-string v2, "ALGORITHMIC_DARKENING"

    invoke-direct {v0, v1, v2}, Lb2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->R:Lb2/a$d;

    new-instance v0, Lb2/a$d;

    const-string v1, "WEB_MESSAGE_LISTENER"

    const-string v2, "WEB_MESSAGE_LISTENER"

    invoke-direct {v0, v1, v2}, Lb2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->S:Lb2/a$d;

    new-instance v0, Lb2/a$d;

    const-string v1, "DOCUMENT_START_SCRIPT"

    const-string v2, "DOCUMENT_START_SCRIPT:1"

    invoke-direct {v0, v1, v2}, Lb2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->T:Lb2/a$d;

    new-instance v0, Lb2/a$d;

    const-string v1, "PROXY_OVERRIDE_REVERSE_BYPASS"

    const-string v2, "PROXY_OVERRIDE_REVERSE_BYPASS"

    invoke-direct {v0, v1, v2}, Lb2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->U:Lb2/a$d;

    new-instance v0, Lb2/a$d;

    const-string v1, "GET_VARIATIONS_HEADER"

    const-string v2, "GET_VARIATIONS_HEADER"

    invoke-direct {v0, v1, v2}, Lb2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->V:Lb2/a$d;

    new-instance v0, Lb2/a$d;

    const-string v1, "REQUESTED_WITH_HEADER_CONTROL"

    const-string v2, "REQUESTED_WITH_HEADER_CONTROL"

    invoke-direct {v0, v1, v2}, Lb2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->W:Lb2/a$d;

    new-instance v0, Lb2/a$d;

    const-string v1, "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY"

    const-string v2, "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY"

    invoke-direct {v0, v1, v2}, Lb2/a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lb2/s;->X:Lb2/a$d;

    return-void
.end method

.method public static a()Ljava/lang/UnsupportedOperationException;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "This method is not supported by the current version of the framework and the current WebView APK"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    invoke-static {}, Lb2/a;->e()Ljava/util/Set;

    move-result-object v0

    invoke-static {p0, v0}, Lb2/s;->c(Ljava/lang/String;Ljava/util/Collection;)Z

    move-result p0

    return p0
.end method

.method public static c(Ljava/lang/String;Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lb2/h;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "TT;>;)Z"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb2/h;

    invoke-interface {v1}, Lb2/h;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb2/h;

    invoke-interface {p1}, Lb2/h;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown feature "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
