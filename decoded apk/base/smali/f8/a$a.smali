.class public final Lf8/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lf8/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lf8/a$a;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;

.field public static final f:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf8/a$a;

    invoke-direct {v0}, Lf8/a$a;-><init>()V

    sput-object v0, Lf8/a$a;->a:Lf8/a$a;

    const-string v0, "rolloutId"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf8/a$a;->b:Lq8/d;

    const-string v0, "parameterKey"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf8/a$a;->c:Lq8/d;

    const-string v0, "parameterValue"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf8/a$a;->d:Lq8/d;

    const-string v0, "variantId"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf8/a$a;->e:Lq8/d;

    const-string v0, "templateVersion"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf8/a$a;->f:Lq8/d;

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

    check-cast p1, Lf8/i;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lf8/a$a;->b(Lf8/i;Lq8/f;)V

    return-void
.end method

.method public b(Lf8/i;Lq8/f;)V
    .locals 3

    sget-object v0, Lf8/a$a;->b:Lq8/d;

    invoke-virtual {p1}, Lf8/i;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf8/a$a;->c:Lq8/d;

    invoke-virtual {p1}, Lf8/i;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf8/a$a;->d:Lq8/d;

    invoke-virtual {p1}, Lf8/i;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf8/a$a;->e:Lq8/d;

    invoke-virtual {p1}, Lf8/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf8/a$a;->f:Lq8/d;

    invoke-virtual {p1}, Lf8/i;->f()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    return-void
.end method
