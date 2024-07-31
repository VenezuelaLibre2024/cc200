.class public final Lm9/c$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lm9/e0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm9/c$f;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;

.field public static final f:Lq8/d;

.field public static final g:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm9/c$f;

    invoke-direct {v0}, Lm9/c$f;-><init>()V

    sput-object v0, Lm9/c$f;->a:Lm9/c$f;

    const-string v0, "sessionId"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$f;->b:Lq8/d;

    const-string v0, "firstSessionId"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$f;->c:Lq8/d;

    const-string v0, "sessionIndex"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$f;->d:Lq8/d;

    const-string v0, "eventTimestampUs"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$f;->e:Lq8/d;

    const-string v0, "dataCollectionStatus"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$f;->f:Lq8/d;

    const-string v0, "firebaseInstallationId"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lm9/c$f;->g:Lq8/d;

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

    check-cast p1, Lm9/e0;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lm9/c$f;->b(Lm9/e0;Lq8/f;)V

    return-void
.end method

.method public b(Lm9/e0;Lq8/f;)V
    .locals 3

    sget-object v0, Lm9/c$f;->b:Lq8/d;

    invoke-virtual {p1}, Lm9/e0;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lm9/c$f;->c:Lq8/d;

    invoke-virtual {p1}, Lm9/e0;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lm9/c$f;->d:Lq8/d;

    invoke-virtual {p1}, Lm9/e0;->f()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lm9/c$f;->e:Lq8/d;

    invoke-virtual {p1}, Lm9/e0;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lm9/c$f;->f:Lq8/d;

    invoke-virtual {p1}, Lm9/e0;->a()Lm9/e;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lm9/c$f;->g:Lq8/d;

    invoke-virtual {p1}, Lm9/e0;->c()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    return-void
.end method
