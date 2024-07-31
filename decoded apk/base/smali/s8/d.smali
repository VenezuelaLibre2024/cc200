.class public final Ls8/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr8/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls8/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr8/b<",
        "Ls8/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lq8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq8/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lq8/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq8/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lq8/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq8/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Ls8/d$b;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lq8/e<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lq8/g<",
            "*>;>;"
        }
    .end annotation
.end field

.field public c:Lq8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq8/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    sget-object v0, Ls8/a;->a:Ls8/a;

    sput-object v0, Ls8/d;->e:Lq8/e;

    sget-object v0, Ls8/c;->a:Ls8/c;

    sput-object v0, Ls8/d;->f:Lq8/g;

    sget-object v0, Ls8/b;->a:Ls8/b;

    sput-object v0, Ls8/d;->g:Lq8/g;

    new-instance v0, Ls8/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls8/d$b;-><init>(Ls8/d$a;)V

    sput-object v0, Ls8/d;->h:Ls8/d$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ls8/d;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ls8/d;->b:Ljava/util/Map;

    sget-object v0, Ls8/d;->e:Lq8/e;

    iput-object v0, p0, Ls8/d;->c:Lq8/e;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls8/d;->d:Z

    const-class v0, Ljava/lang/String;

    sget-object v1, Ls8/d;->f:Lq8/g;

    invoke-virtual {p0, v0, v1}, Ls8/d;->p(Ljava/lang/Class;Lq8/g;)Ls8/d;

    const-class v0, Ljava/lang/Boolean;

    sget-object v1, Ls8/d;->g:Lq8/g;

    invoke-virtual {p0, v0, v1}, Ls8/d;->p(Ljava/lang/Class;Lq8/g;)Ls8/d;

    const-class v0, Ljava/util/Date;

    sget-object v1, Ls8/d;->h:Ls8/d$b;

    invoke-virtual {p0, v0, v1}, Ls8/d;->p(Ljava/lang/Class;Lq8/g;)Ls8/d;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;Lq8/f;)V
    .locals 0

    invoke-static {p0, p1}, Ls8/d;->l(Ljava/lang/Object;Lq8/f;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Lq8/h;)V
    .locals 0

    invoke-static {p0, p1}, Ls8/d;->m(Ljava/lang/String;Lq8/h;)V

    return-void
.end method

.method public static synthetic d(Ljava/lang/Boolean;Lq8/h;)V
    .locals 0

    invoke-static {p0, p1}, Ls8/d;->n(Ljava/lang/Boolean;Lq8/h;)V

    return-void
.end method

.method public static synthetic e(Ls8/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ls8/d;->a:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic f(Ls8/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ls8/d;->b:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic g(Ls8/d;)Lq8/e;
    .locals 0

    iget-object p0, p0, Ls8/d;->c:Lq8/e;

    return-object p0
.end method

.method public static synthetic h(Ls8/d;)Z
    .locals 0

    iget-boolean p0, p0, Ls8/d;->d:Z

    return p0
.end method

.method public static synthetic l(Ljava/lang/Object;Lq8/f;)V
    .locals 2

    new-instance p1, Lq8/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lq8/c;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic m(Ljava/lang/String;Lq8/h;)V
    .locals 0

    invoke-interface {p1, p0}, Lq8/h;->d(Ljava/lang/String;)Lq8/h;

    return-void
.end method

.method public static synthetic n(Ljava/lang/Boolean;Lq8/h;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-interface {p1, p0}, Lq8/h;->f(Z)Lq8/h;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;Lq8/e;)Lr8/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ls8/d;->o(Ljava/lang/Class;Lq8/e;)Ls8/d;

    move-result-object p1

    return-object p1
.end method

.method public i()Lq8/a;
    .locals 1

    new-instance v0, Ls8/d$a;

    invoke-direct {v0, p0}, Ls8/d$a;-><init>(Ls8/d;)V

    return-object v0
.end method

.method public j(Lr8/a;)Ls8/d;
    .locals 0

    invoke-interface {p1, p0}, Lr8/a;->a(Lr8/b;)V

    return-object p0
.end method

.method public k(Z)Ls8/d;
    .locals 0

    iput-boolean p1, p0, Ls8/d;->d:Z

    return-object p0
.end method

.method public o(Ljava/lang/Class;Lq8/e;)Ls8/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lq8/e<",
            "-TT;>;)",
            "Ls8/d;"
        }
    .end annotation

    iget-object v0, p0, Ls8/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Ls8/d;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public p(Ljava/lang/Class;Lq8/g;)Ls8/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lq8/g<",
            "-TT;>;)",
            "Ls8/d;"
        }
    .end annotation

    iget-object v0, p0, Ls8/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Ls8/d;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
