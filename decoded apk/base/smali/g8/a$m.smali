.class public final Lg8/a$m;
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
    name = "m"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lg8/f0$e$d$a$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg8/a$m;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;

.field public static final f:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/a$m;

    invoke-direct {v0}, Lg8/a$m;-><init>()V

    sput-object v0, Lg8/a$m;->a:Lg8/a$m;

    const-string v0, "threads"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$m;->b:Lq8/d;

    const-string v0, "exception"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$m;->c:Lq8/d;

    const-string v0, "appExitInfo"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$m;->d:Lq8/d;

    const-string v0, "signal"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$m;->e:Lq8/d;

    const-string v0, "binaries"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$m;->f:Lq8/d;

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

    check-cast p1, Lg8/f0$e$d$a$b;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg8/a$m;->b(Lg8/f0$e$d$a$b;Lq8/f;)V

    return-void
.end method

.method public b(Lg8/f0$e$d$a$b;Lq8/f;)V
    .locals 2

    sget-object v0, Lg8/a$m;->b:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a$b;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$m;->c:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a$b;->d()Lg8/f0$e$d$a$b$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$m;->d:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a$b;->b()Lg8/f0$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$m;->e:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a$b;->e()Lg8/f0$e$d$a$b$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$m;->f:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a$b;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    return-void
.end method
