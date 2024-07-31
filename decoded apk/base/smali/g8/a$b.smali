.class public final Lg8/a$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lg8/f0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg8/a$b;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;

.field public static final f:Lq8/d;

.field public static final g:Lq8/d;

.field public static final h:Lq8/d;

.field public static final i:Lq8/d;

.field public static final j:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/a$b;

    invoke-direct {v0}, Lg8/a$b;-><init>()V

    sput-object v0, Lg8/a$b;->a:Lg8/a$b;

    const-string v0, "pid"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$b;->b:Lq8/d;

    const-string v0, "processName"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$b;->c:Lq8/d;

    const-string v0, "reasonCode"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$b;->d:Lq8/d;

    const-string v0, "importance"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$b;->e:Lq8/d;

    const-string v0, "pss"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$b;->f:Lq8/d;

    const-string v0, "rss"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$b;->g:Lq8/d;

    const-string v0, "timestamp"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$b;->h:Lq8/d;

    const-string v0, "traceFile"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$b;->i:Lq8/d;

    const-string v0, "buildIdMappingForArch"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$b;->j:Lq8/d;

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

    check-cast p1, Lg8/f0$a;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg8/a$b;->b(Lg8/f0$a;Lq8/f;)V

    return-void
.end method

.method public b(Lg8/f0$a;Lq8/f;)V
    .locals 3

    sget-object v0, Lg8/a$b;->b:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$a;->d()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lg8/a$b;->c:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$b;->d:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$a;->g()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lg8/a$b;->e:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$a;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lg8/a$b;->f:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$a;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg8/a$b;->g:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$a;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg8/a$b;->h:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$a;->i()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg8/a$b;->i:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$b;->j:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$a;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    return-void
.end method
