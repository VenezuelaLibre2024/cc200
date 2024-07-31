.class public final Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-sessions"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final backgroundDispatcher:Ly7/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly7/e0<",
            "Lce/k0;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final blockingDispatcher:Ly7/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly7/e0<",
            "Lce/k0;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final firebaseApp:Ly7/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly7/e0<",
            "Ln7/g;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final firebaseInstallationsApi:Ly7/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly7/e0<",
            "Lz8/h;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final sessionsSettings:Ly7/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly7/e0<",
            "Lo9/f;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field private static final transportFactory:Ly7/e0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly7/e0<",
            "Ld3/i;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const-class v0, Lce/k0;

    new-instance v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;-><init>(Ltd/g;)V

    sput-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->Companion:Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$a;

    const-class v1, Ln7/g;

    invoke-static {v1}, Ly7/e0;->b(Ljava/lang/Class;)Ly7/e0;

    move-result-object v1

    sput-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ly7/e0;

    const-class v1, Lz8/h;

    invoke-static {v1}, Ly7/e0;->b(Ljava/lang/Class;)Ly7/e0;

    move-result-object v1

    sput-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Ly7/e0;

    const-class v1, Lr7/a;

    invoke-static {v1, v0}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v1

    sput-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ly7/e0;

    const-class v1, Lr7/b;

    invoke-static {v1, v0}, Ly7/e0;->a(Ljava/lang/Class;Ljava/lang/Class;)Ly7/e0;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Ly7/e0;

    const-class v0, Ld3/i;

    invoke-static {v0}, Ly7/e0;->b(Ljava/lang/Class;)Ly7/e0;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Ly7/e0;

    const-class v0, Lo9/f;

    invoke-static {v0}, Ly7/e0;->b(Ljava/lang/Class;)Ly7/e0;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Ly7/e0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ly7/d;)Lm9/g0;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-5(Ly7/d;)Lm9/g0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly7/d;)Lm9/d0;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-1(Ly7/d;)Lm9/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly7/d;)Lm9/w;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-4(Ly7/d;)Lm9/w;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ly7/d;)Lm9/b0;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-2(Ly7/d;)Lm9/b0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ly7/d;)Lm9/k;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-0(Ly7/d;)Lm9/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ly7/d;)Lo9/f;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->getComponents$lambda-3(Ly7/d;)Lo9/f;

    move-result-object p0

    return-object p0
.end method

.method private static final getComponents$lambda-0(Ly7/d;)Lm9/k;
    .locals 4

    new-instance v0, Lm9/k;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ly7/e0;

    invoke-interface {p0, v1}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "container[firebaseApp]"

    invoke-static {v1, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ln7/g;

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Ly7/e0;

    invoke-interface {p0, v2}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "container[sessionsSettings]"

    invoke-static {v2, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lo9/f;

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ly7/e0;

    invoke-interface {p0, v3}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    const-string v3, "container[backgroundDispatcher]"

    invoke-static {p0, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljd/g;

    invoke-direct {v0, v1, v2, p0}, Lm9/k;-><init>(Ln7/g;Lo9/f;Ljd/g;)V

    return-object v0
.end method

.method private static final getComponents$lambda-1(Ly7/d;)Lm9/d0;
    .locals 3

    new-instance p0, Lm9/d0;

    sget-object v0, Lm9/k0;->a:Lm9/k0;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {p0, v0, v1, v2, v1}, Lm9/d0;-><init>(Lm9/j0;Lsd/a;ILtd/g;)V

    return-object p0
.end method

.method private static final getComponents$lambda-2(Ly7/d;)Lm9/b0;
    .locals 7

    new-instance v6, Lm9/c0;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ly7/e0;

    invoke-interface {p0, v0}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "container[firebaseApp]"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v0

    check-cast v1, Ln7/g;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Ly7/e0;

    invoke-interface {p0, v0}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "container[firebaseInstallationsApi]"

    invoke-static {v0, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lz8/h;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Ly7/e0;

    invoke-interface {p0, v0}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "container[sessionsSettings]"

    invoke-static {v0, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v0

    check-cast v3, Lo9/f;

    new-instance v4, Lm9/g;

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Ly7/e0;

    invoke-interface {p0, v0}, Ly7/d;->b(Ly7/e0;)Ly8/b;

    move-result-object v0

    const-string v5, "container.getProvider(transportFactory)"

    invoke-static {v0, v5}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v0}, Lm9/g;-><init>(Ly8/b;)V

    sget-object v0, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ly7/e0;

    invoke-interface {p0, v0}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "container[backgroundDispatcher]"

    invoke-static {p0, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p0

    check-cast v5, Ljd/g;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lm9/c0;-><init>(Ln7/g;Lz8/h;Lo9/f;Lm9/h;Ljd/g;)V

    return-object v6
.end method

.method private static final getComponents$lambda-3(Ly7/d;)Lo9/f;
    .locals 5

    new-instance v0, Lo9/f;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ly7/e0;

    invoke-interface {p0, v1}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "container[firebaseApp]"

    invoke-static {v1, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ln7/g;

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Ly7/e0;

    invoke-interface {p0, v2}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "container[blockingDispatcher]"

    invoke-static {v2, v3}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljd/g;

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ly7/e0;

    invoke-interface {p0, v3}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "container[backgroundDispatcher]"

    invoke-static {v3, v4}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljd/g;

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Ly7/e0;

    invoke-interface {p0, v4}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    const-string v4, "container[firebaseInstallationsApi]"

    invoke-static {p0, v4}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lz8/h;

    invoke-direct {v0, v1, v2, v3, p0}, Lo9/f;-><init>(Ln7/g;Ljd/g;Ljd/g;Lz8/h;)V

    return-object v0
.end method

.method private static final getComponents$lambda-4(Ly7/d;)Lm9/w;
    .locals 3

    new-instance v0, Lm9/x;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ly7/e0;

    invoke-interface {p0, v1}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln7/g;

    invoke-virtual {v1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v1

    const-string v2, "container[firebaseApp].applicationContext"

    invoke-static {v1, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ly7/e0;

    invoke-interface {p0, v2}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    const-string v2, "container[backgroundDispatcher]"

    invoke-static {p0, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljd/g;

    invoke-direct {v0, v1, p0}, Lm9/x;-><init>(Landroid/content/Context;Ljd/g;)V

    return-object v0
.end method

.method private static final getComponents$lambda-5(Ly7/d;)Lm9/g0;
    .locals 2

    new-instance v0, Lm9/h0;

    sget-object v1, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ly7/e0;

    invoke-interface {p0, v1}, Ly7/d;->a(Ly7/e0;)Ljava/lang/Object;

    move-result-object p0

    const-string v1, "container[firebaseApp]"

    invoke-static {p0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ln7/g;

    invoke-direct {v0, p0}, Lm9/h0;-><init>(Ln7/g;)V

    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly7/c<",
            "+",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x7

    new-array v0, v0, [Ly7/c;

    const-class v1, Lm9/k;

    invoke-static {v1}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-string v2, "fire-sessions"

    invoke-virtual {v1, v2}, Ly7/c$b;->h(Ljava/lang/String;)Ly7/c$b;

    move-result-object v1

    sget-object v3, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseApp:Ly7/e0;

    invoke-static {v3}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->sessionsSettings:Ly7/e0;

    invoke-static {v4}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v5

    invoke-virtual {v1, v5}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v5, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->backgroundDispatcher:Ly7/e0;

    invoke-static {v5}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v6

    invoke-virtual {v1, v6}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v6, Lm9/q;->a:Lm9/q;

    invoke-virtual {v1, v6}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->e()Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const/4 v6, 0x0

    aput-object v1, v0, v6

    const-class v1, Lm9/d0;

    invoke-static {v1}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-string v6, "session-generator"

    invoke-virtual {v1, v6}, Ly7/c$b;->h(Ljava/lang/String;)Ly7/c$b;

    move-result-object v1

    sget-object v6, Lm9/n;->a:Lm9/n;

    invoke-virtual {v1, v6}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const/4 v6, 0x1

    aput-object v1, v0, v6

    const-class v1, Lm9/b0;

    invoke-static {v1}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-string v6, "session-publisher"

    invoke-virtual {v1, v6}, Ly7/c$b;->h(Ljava/lang/String;)Ly7/c$b;

    move-result-object v1

    invoke-static {v3}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v6

    invoke-virtual {v1, v6}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v6, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->firebaseInstallationsApi:Ly7/e0;

    invoke-static {v6}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v7

    invoke-virtual {v1, v7}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    invoke-static {v4}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->transportFactory:Ly7/e0;

    invoke-static {v4}, Ly7/q;->m(Ly7/e0;)Ly7/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    invoke-static {v5}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v4, Lm9/p;->a:Lm9/p;

    invoke-virtual {v1, v4}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-class v1, Lo9/f;

    invoke-static {v1}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-string v4, "sessions-settings"

    invoke-virtual {v1, v4}, Ly7/c$b;->h(Ljava/lang/String;)Ly7/c$b;

    move-result-object v1

    invoke-static {v3}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v4, Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;->blockingDispatcher:Ly7/e0;

    invoke-static {v4}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    invoke-static {v5}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    invoke-static {v6}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v4, Lm9/r;->a:Lm9/r;

    invoke-virtual {v1, v4}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const/4 v4, 0x3

    aput-object v1, v0, v4

    const-class v1, Lm9/w;

    invoke-static {v1}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-string v4, "sessions-datastore"

    invoke-virtual {v1, v4}, Ly7/c$b;->h(Ljava/lang/String;)Ly7/c$b;

    move-result-object v1

    invoke-static {v3}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    invoke-static {v5}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v4

    invoke-virtual {v1, v4}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v4, Lm9/o;->a:Lm9/o;

    invoke-virtual {v1, v4}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const/4 v4, 0x4

    aput-object v1, v0, v4

    const-class v1, Lm9/g0;

    invoke-static {v1}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-string v4, "sessions-service-binder"

    invoke-virtual {v1, v4}, Ly7/c$b;->h(Ljava/lang/String;)Ly7/c$b;

    move-result-object v1

    invoke-static {v3}, Ly7/q;->k(Ly7/e0;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v3, Lm9/m;->a:Lm9/m;

    invoke-virtual {v1, v3}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const-string v1, "1.2.1"

    invoke-static {v2, v1}, Lj9/h;->b(Ljava/lang/String;Ljava/lang/String;)Ly7/c;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    invoke-static {v0}, Lhd/n;->g([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
