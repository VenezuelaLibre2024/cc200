.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fcm"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ly7/d;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->lambda$getComponents$0(Ly7/d;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Ly7/d;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 9

    new-instance v8, Lcom/google/firebase/messaging/FirebaseMessaging;

    const-class v0, Ln7/g;

    invoke-interface {p0, v0}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ln7/g;

    const-class v0, Lx8/a;

    invoke-interface {p0, v0}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lx8/a;

    const-class v0, Lj9/i;

    invoke-interface {p0, v0}, Ly7/d;->c(Ljava/lang/Class;)Ly8/b;

    move-result-object v3

    const-class v0, Lv8/j;

    invoke-interface {p0, v0}, Ly7/d;->c(Ljava/lang/Class;)Ly8/b;

    move-result-object v4

    const-class v0, Lz8/h;

    invoke-interface {p0, v0}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lz8/h;

    const-class v0, Ld3/i;

    invoke-interface {p0, v0}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ld3/i;

    const-class v0, Lu8/d;

    invoke-interface {p0, v0}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lu8/d;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Ln7/g;Lx8/a;Ly8/b;Ly8/b;Lz8/h;Ld3/i;Lu8/d;)V

    return-object v8
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ly7/c<",
            "*>;>;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Ly7/c;

    const-class v1, Lcom/google/firebase/messaging/FirebaseMessaging;

    invoke-static {v1}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-string v2, "fire-fcm"

    invoke-virtual {v1, v2}, Ly7/c$b;->h(Ljava/lang/String;)Ly7/c$b;

    move-result-object v1

    const-class v3, Ln7/g;

    invoke-static {v3}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lx8/a;

    invoke-static {v3}, Ly7/q;->h(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lj9/i;

    invoke-static {v3}, Ly7/q;->i(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lv8/j;

    invoke-static {v3}, Ly7/q;->i(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Ld3/i;

    invoke-static {v3}, Ly7/q;->h(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lz8/h;

    invoke-static {v3}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    const-class v3, Lu8/d;

    invoke-static {v3}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v3, Lg9/b0;->a:Lg9/b0;

    invoke-virtual {v1, v3}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->c()Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "23.4.1"

    invoke-static {v2, v1}, Lj9/h;->b(Ljava/lang/String;Ljava/lang/String;)Ly7/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
