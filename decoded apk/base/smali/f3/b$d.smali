.class public final Lf3/b$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lf3/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lf3/b$d;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;

.field public static final f:Lq8/d;

.field public static final g:Lq8/d;

.field public static final h:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf3/b$d;

    invoke-direct {v0}, Lf3/b$d;-><init>()V

    sput-object v0, Lf3/b$d;->a:Lf3/b$d;

    const-string v0, "eventTimeMs"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$d;->b:Lq8/d;

    const-string v0, "eventCode"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$d;->c:Lq8/d;

    const-string v0, "eventUptimeMs"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$d;->d:Lq8/d;

    const-string v0, "sourceExtension"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$d;->e:Lq8/d;

    const-string v0, "sourceExtensionJsonProto3"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$d;->f:Lq8/d;

    const-string v0, "timezoneOffsetSeconds"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$d;->g:Lq8/d;

    const-string v0, "networkConnectionInfo"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$d;->h:Lq8/d;

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

    check-cast p1, Lf3/l;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lf3/b$d;->b(Lf3/l;Lq8/f;)V

    return-void
.end method

.method public b(Lf3/l;Lq8/f;)V
    .locals 3

    sget-object v0, Lf3/b$d;->b:Lq8/d;

    invoke-virtual {p1}, Lf3/l;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lf3/b$d;->c:Lq8/d;

    invoke-virtual {p1}, Lf3/l;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$d;->d:Lq8/d;

    invoke-virtual {p1}, Lf3/l;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lf3/b$d;->e:Lq8/d;

    invoke-virtual {p1}, Lf3/l;->f()[B

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$d;->f:Lq8/d;

    invoke-virtual {p1}, Lf3/l;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$d;->g:Lq8/d;

    invoke-virtual {p1}, Lf3/l;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lf3/b$d;->h:Lq8/d;

    invoke-virtual {p1}, Lf3/l;->e()Lf3/o;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    return-void
.end method
