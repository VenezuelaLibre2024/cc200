.class public final Lg8/a$q;
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
    name = "q"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lg8/f0$e$d$a$b$e$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg8/a$q;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;

.field public static final f:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/a$q;

    invoke-direct {v0}, Lg8/a$q;-><init>()V

    sput-object v0, Lg8/a$q;->a:Lg8/a$q;

    const-string v0, "pc"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$q;->b:Lq8/d;

    const-string v0, "symbol"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$q;->c:Lq8/d;

    const-string v0, "file"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$q;->d:Lq8/d;

    const-string v0, "offset"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$q;->e:Lq8/d;

    const-string v0, "importance"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$q;->f:Lq8/d;

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

    check-cast p1, Lg8/f0$e$d$a$b$e$b;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg8/a$q;->b(Lg8/f0$e$d$a$b$e$b;Lq8/f;)V

    return-void
.end method

.method public b(Lg8/f0$e$d$a$b$e$b;Lq8/f;)V
    .locals 3

    sget-object v0, Lg8/a$q;->b:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a$b$e$b;->e()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg8/a$q;->c:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a$b$e$b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$q;->d:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a$b$e$b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$q;->e:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a$b$e$b;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg8/a$q;->f:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$d$a$b$e$b;->c()I

    move-result p1

    invoke-interface {p2, v0, p1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    return-void
.end method