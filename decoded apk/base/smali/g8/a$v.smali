.class public final Lg8/a$v;
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
    name = "v"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lg8/f0$e$d$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg8/a$v;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/a$v;

    invoke-direct {v0}, Lg8/a$v;-><init>()V

    sput-object v0, Lg8/a$v;->a:Lg8/a$v;

    const-string v0, "rolloutVariant"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$v;->b:Lq8/d;

    const-string v0, "parameterKey"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$v;->c:Lq8/d;

    const-string v0, "parameterValue"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$v;->d:Lq8/d;

    const-string v0, "templateVersion"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$v;->e:Lq8/d;

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

    check-cast p1, Lg8/f0$e$d$e;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg8/a$v;->b(Lg8/f0$e$d$e;Lq8/f;)V

    return-void
.end method

.method public b(Lg8/f0$e$d$e;Lq8/f;)V
    .locals 3

    sget-object v0, Lg8/a$v;->b:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$e;->d()Lg8/f0$e$d$e$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$v;->c:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$e;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$v;->d:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$v;->e:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$e;->e()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    return-void
.end method