.class public Lg3/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg3/t;


# static fields
.field public static volatile e:Lg3/v;


# instance fields
.field public final a:Lq3/a;

.field public final b:Lq3/a;

.field public final c:Lm3/e;

.field public final d:Ln3/s;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lq3/a;Lq3/a;Lm3/e;Ln3/s;Ln3/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg3/u;->a:Lq3/a;

    iput-object p2, p0, Lg3/u;->b:Lq3/a;

    iput-object p3, p0, Lg3/u;->c:Lm3/e;

    iput-object p4, p0, Lg3/u;->d:Ln3/s;

    invoke-virtual {p5}, Ln3/w;->c()V

    return-void
.end method

.method public static c()Lg3/u;
    .locals 2

    sget-object v0, Lg3/u;->e:Lg3/v;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg3/v;->d()Lg3/u;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(Lg3/f;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg3/f;",
            ")",
            "Ljava/util/Set<",
            "Ld3/c;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Lg3/g;

    if-eqz v0, :cond_0

    check-cast p0, Lg3/g;

    invoke-interface {p0}, Lg3/g;->a()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "proto"

    invoke-static {p0}, Ld3/c;->b(Ljava/lang/String;)Ld3/c;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lg3/u;->e:Lg3/v;

    if-nez v0, :cond_1

    const-class v0, Lg3/u;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg3/u;->e:Lg3/v;

    if-nez v1, :cond_0

    invoke-static {}, Lg3/e;->f()Lg3/v$a;

    move-result-object v1

    invoke-interface {v1, p0}, Lg3/v$a;->b(Landroid/content/Context;)Lg3/v$a;

    move-result-object p0

    invoke-interface {p0}, Lg3/v$a;->a()Lg3/v;

    move-result-object p0

    sput-object p0, Lg3/u;->e:Lg3/v;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lg3/o;Ld3/j;)V
    .locals 3

    iget-object v0, p0, Lg3/u;->c:Lm3/e;

    invoke-virtual {p1}, Lg3/o;->f()Lg3/p;

    move-result-object v1

    invoke-virtual {p1}, Lg3/o;->c()Ld3/d;

    move-result-object v2

    invoke-virtual {v2}, Ld3/d;->c()Ld3/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg3/p;->f(Ld3/e;)Lg3/p;

    move-result-object v1

    invoke-virtual {p0, p1}, Lg3/u;->b(Lg3/o;)Lg3/i;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, Lm3/e;->a(Lg3/p;Lg3/i;Ld3/j;)V

    return-void
.end method

.method public final b(Lg3/o;)Lg3/i;
    .locals 4

    invoke-static {}, Lg3/i;->a()Lg3/i$a;

    move-result-object v0

    iget-object v1, p0, Lg3/u;->a:Lq3/a;

    invoke-interface {v1}, Lq3/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lg3/i$a;->i(J)Lg3/i$a;

    move-result-object v0

    iget-object v1, p0, Lg3/u;->b:Lq3/a;

    invoke-interface {v1}, Lq3/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lg3/i$a;->k(J)Lg3/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lg3/o;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lg3/i$a;->j(Ljava/lang/String;)Lg3/i$a;

    move-result-object v0

    new-instance v1, Lg3/h;

    invoke-virtual {p1}, Lg3/o;->b()Ld3/c;

    move-result-object v2

    invoke-virtual {p1}, Lg3/o;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lg3/h;-><init>(Ld3/c;[B)V

    invoke-virtual {v0, v1}, Lg3/i$a;->h(Lg3/h;)Lg3/i$a;

    move-result-object v0

    invoke-virtual {p1}, Lg3/o;->c()Ld3/d;

    move-result-object p1

    invoke-virtual {p1}, Ld3/d;->a()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg3/i$a;->g(Ljava/lang/Integer;)Lg3/i$a;

    move-result-object p1

    invoke-virtual {p1}, Lg3/i$a;->d()Lg3/i;

    move-result-object p1

    return-object p1
.end method

.method public e()Ln3/s;
    .locals 1

    iget-object v0, p0, Lg3/u;->d:Ln3/s;

    return-object v0
.end method

.method public g(Lg3/f;)Ld3/i;
    .locals 4

    new-instance v0, Lg3/q;

    invoke-static {p1}, Lg3/u;->d(Lg3/f;)Ljava/util/Set;

    move-result-object v1

    invoke-static {}, Lg3/p;->a()Lg3/p$a;

    move-result-object v2

    invoke-interface {p1}, Lg3/f;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lg3/p$a;->b(Ljava/lang/String;)Lg3/p$a;

    move-result-object v2

    invoke-interface {p1}, Lg3/f;->c()[B

    move-result-object p1

    invoke-virtual {v2, p1}, Lg3/p$a;->c([B)Lg3/p$a;

    move-result-object p1

    invoke-virtual {p1}, Lg3/p$a;->a()Lg3/p;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, Lg3/q;-><init>(Ljava/util/Set;Lg3/p;Lg3/t;)V

    return-object v0
.end method
