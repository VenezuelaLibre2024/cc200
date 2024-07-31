.class public Lcom/google/firebase/datatransport/TransportRegistrar;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-transport"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ly7/d;)Ld3/i;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/datatransport/TransportRegistrar;->lambda$getComponents$0(Ly7/d;)Ld3/i;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(Ly7/d;)Ld3/i;
    .locals 1

    const-class v0, Landroid/content/Context;

    invoke-interface {p0, v0}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lg3/u;->f(Landroid/content/Context;)V

    invoke-static {}, Lg3/u;->c()Lg3/u;

    move-result-object p0

    sget-object v0, Le3/a;->h:Le3/a;

    invoke-virtual {p0, v0}, Lg3/u;->g(Lg3/f;)Ld3/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
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

    const-class v1, Ld3/i;

    invoke-static {v1}, Ly7/c;->c(Ljava/lang/Class;)Ly7/c$b;

    move-result-object v1

    const-string v2, "fire-transport"

    invoke-virtual {v1, v2}, Ly7/c$b;->h(Ljava/lang/String;)Ly7/c$b;

    move-result-object v1

    const-class v3, Landroid/content/Context;

    invoke-static {v3}, Ly7/q;->j(Ljava/lang/Class;)Ly7/q;

    move-result-object v3

    invoke-virtual {v1, v3}, Ly7/c$b;->b(Ly7/q;)Ly7/c$b;

    move-result-object v1

    sget-object v3, Ln8/a;->a:Ln8/a;

    invoke-virtual {v1, v3}, Ly7/c$b;->f(Ly7/g;)Ly7/c$b;

    move-result-object v1

    invoke-virtual {v1}, Ly7/c$b;->d()Ly7/c;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "18.1.8"

    invoke-static {v2, v1}, Lj9/h;->b(Ljava/lang/String;Ljava/lang/String;)Ly7/c;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
