.class public final Lg8/a$k;
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
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lg8/f0$e$d$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg8/a$k;

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

    new-instance v0, Lg8/a$k;

    invoke-direct {v0}, Lg8/a$k;-><init>()V

    sput-object v0, Lg8/a$k;->a:Lg8/a$k;

    const-string v0, "execution"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$k;->b:Lq8/d;

    const-string v0, "customAttributes"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$k;->c:Lq8/d;

    const-string v0, "internalKeys"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$k;->d:Lq8/d;

    const-string v0, "background"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$k;->e:Lq8/d;

    const-string v0, "currentProcessDetails"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$k;->f:Lq8/d;

    const-string v0, "appProcessDetails"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$k;->g:Lq8/d;

    const-string v0, "uiOrientation"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$k;->h:Lq8/d;

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

    check-cast p1, Lg8/f0$e$d$a;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg8/a$k;->b(Lg8/f0$e$d$a;Lq8/f;)V

    return-void
.end method

.method public b(Lg8/f0$e$d$a;Lq8/f;)V
    .locals 2

    sget-object v0, Lg8/a$k;->b:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a;->f()Lg8/f0$e$d$a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$k;->c:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$k;->d:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$k;->e:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a;->c()Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$k;->f:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a;->d()Lg8/f0$e$d$a$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$k;->g:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$k;->h:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a;->h()I

    move-result p1

    invoke-interface {p2, v0, p1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    return-void
.end method
