.class public final Lf3/b$a;
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
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lf3/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lf3/b$a;

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

    new-instance v0, Lf3/b$a;

    invoke-direct {v0}, Lf3/b$a;-><init>()V

    sput-object v0, Lf3/b$a;->a:Lf3/b$a;

    const-string v0, "sdkVersion"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$a;->b:Lq8/d;

    const-string v0, "model"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$a;->c:Lq8/d;

    const-string v0, "hardware"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$a;->d:Lq8/d;

    const-string v0, "device"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$a;->e:Lq8/d;

    const-string v0, "product"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$a;->f:Lq8/d;

    const-string v0, "osBuild"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$a;->g:Lq8/d;

    const-string v0, "manufacturer"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$a;->h:Lq8/d;

    const-string v0, "fingerprint"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$a;->i:Lq8/d;

    const-string v0, "locale"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$a;->j:Lq8/d;

    const-string v0, "country"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$a;->k:Lq8/d;

    const-string v0, "mccMnc"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$a;->l:Lq8/d;

    const-string v0, "applicationBuild"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lf3/b$a;->m:Lq8/d;

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

    check-cast p1, Lf3/a;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lf3/b$a;->b(Lf3/a;Lq8/f;)V

    return-void
.end method

.method public b(Lf3/a;Lq8/f;)V
    .locals 2

    sget-object v0, Lf3/b$a;->b:Lq8/d;

    invoke-virtual {p1}, Lf3/a;->m()Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$a;->c:Lq8/d;

    invoke-virtual {p1}, Lf3/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$a;->d:Lq8/d;

    invoke-virtual {p1}, Lf3/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$a;->e:Lq8/d;

    invoke-virtual {p1}, Lf3/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$a;->f:Lq8/d;

    invoke-virtual {p1}, Lf3/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$a;->g:Lq8/d;

    invoke-virtual {p1}, Lf3/a;->k()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$a;->h:Lq8/d;

    invoke-virtual {p1}, Lf3/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$a;->i:Lq8/d;

    invoke-virtual {p1}, Lf3/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$a;->j:Lq8/d;

    invoke-virtual {p1}, Lf3/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$a;->k:Lq8/d;

    invoke-virtual {p1}, Lf3/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$a;->l:Lq8/d;

    invoke-virtual {p1}, Lf3/a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lf3/b$a;->m:Lq8/d;

    invoke-virtual {p1}, Lf3/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    return-void
.end method
