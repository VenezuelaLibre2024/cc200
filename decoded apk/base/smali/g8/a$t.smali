.class public final Lg8/a$t;
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
    name = "t"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lg8/f0$e$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg8/a$t;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;

.field public static final f:Lq8/d;

.field public static final g:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/a$t;

    invoke-direct {v0}, Lg8/a$t;-><init>()V

    sput-object v0, Lg8/a$t;->a:Lg8/a$t;

    const-string v0, "timestamp"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$t;->b:Lq8/d;

    const-string v0, "type"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$t;->c:Lq8/d;

    const-string v0, "app"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$t;->d:Lq8/d;

    const-string v0, "device"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$t;->e:Lq8/d;

    const-string v0, "log"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$t;->f:Lq8/d;

    const-string v0, "rollouts"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$t;->g:Lq8/d;

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

    check-cast p1, Lg8/f0$e$d;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg8/a$t;->b(Lg8/f0$e$d;Lq8/f;)V

    return-void
.end method

.method public b(Lg8/f0$e$d;Lq8/f;)V
    .locals 3

    sget-object v0, Lg8/a$t;->b:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg8/a$t;->c:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$t;->d:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d;->b()Lg8/f0$e$d$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$t;->e:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d;->c()Lg8/f0$e$d$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$t;->f:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d;->d()Lg8/f0$e$d$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$t;->g:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d;->e()Lg8/f0$e$d$f;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    return-void
.end method
