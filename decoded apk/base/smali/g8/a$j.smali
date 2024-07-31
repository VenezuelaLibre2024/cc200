.class public final Lg8/a$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lg8/f0$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg8/a$j;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;

.field public static final f:Lq8/d;

.field public static final g:Lq8/d;

.field public static final h:Lq8/d;

.field public static final i:Lq8/d;

.field public static final j:Lq8/d;

.field public static final k:Lq8/d;

.field public static final l:Lq8/d;

.field public static final m:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/a$j;

    invoke-direct {v0}, Lg8/a$j;-><init>()V

    sput-object v0, Lg8/a$j;->a:Lg8/a$j;

    const-string v0, "generator"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$j;->b:Lq8/d;

    const-string v0, "identifier"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$j;->c:Lq8/d;

    const-string v0, "appQualitySessionId"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$j;->d:Lq8/d;

    const-string v0, "startedAt"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$j;->e:Lq8/d;

    const-string v0, "endedAt"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$j;->f:Lq8/d;

    const-string v0, "crashed"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$j;->g:Lq8/d;

    const-string v0, "app"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$j;->h:Lq8/d;

    const-string v0, "user"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$j;->i:Lq8/d;

    const-string v0, "os"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$j;->j:Lq8/d;

    const-string v0, "device"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$j;->k:Lq8/d;

    const-string v0, "events"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$j;->l:Lq8/d;

    const-string v0, "generatorType"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$j;->m:Lq8/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lg8/f0$e;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg8/a$j;->b(Lg8/f0$e;Lq8/f;)V

    return-void
.end method

.method public b(Lg8/f0$e;Lq8/f;)V
    .locals 3

    sget-object v0, Lg8/a$j;->b:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$j;->c:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e;->j()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$j;->d:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$j;->e:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e;->l()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg8/a$j;->f:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e;->e()Ljava/lang/Long;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$j;->g:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e;->n()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->g(Lq8/d;Z)Lq8/f;

    sget-object v0, Lg8/a$j;->h:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e;->b()Lg8/f0$e$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$j;->i:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e;->m()Lg8/f0$e$f;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$j;->j:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e;->k()Lg8/f0$e$e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$j;->k:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e;->d()Lg8/f0$e$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$j;->l:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$j;->m:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e;->h()I

    move-result p1

    invoke-interface {p2, v0, p1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    return-void
.end method
