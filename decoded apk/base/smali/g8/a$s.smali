.class public final Lg8/a$s;
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
    name = "s"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lg8/f0$e$d$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg8/a$s;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;

.field public static final f:Lq8/d;

.field public static final g:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/a$s;

    invoke-direct {v0}, Lg8/a$s;-><init>()V

    sput-object v0, Lg8/a$s;->a:Lg8/a$s;

    const-string v0, "batteryLevel"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$s;->b:Lq8/d;

    const-string v0, "batteryVelocity"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$s;->c:Lq8/d;

    const-string v0, "proximityOn"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$s;->d:Lq8/d;

    const-string v0, "orientation"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$s;->e:Lq8/d;

    const-string v0, "ramUsed"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$s;->f:Lq8/d;

    const-string v0, "diskUsed"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$s;->g:Lq8/d;

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

    check-cast p1, Lg8/f0$e$d$c;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg8/a$s;->b(Lg8/f0$e$d$c;Lq8/f;)V

    return-void
.end method

.method public b(Lg8/f0$e$d$c;Lq8/f;)V
    .locals 3

    sget-object v0, Lg8/a$s;->b:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$c;->b()Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$s;->c:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$c;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lg8/a$s;->d:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$c;->g()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->g(Lq8/d;Z)Lq8/f;

    sget-object v0, Lg8/a$s;->e:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$c;->e()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lg8/a$s;->f:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$c;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg8/a$s;->g:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$c;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    return-void
.end method
