.class public final Lg8/a$i;
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
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lg8/f0$e$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg8/a$i;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;

.field public static final f:Lq8/d;

.field public static final g:Lq8/d;

.field public static final h:Lq8/d;

.field public static final i:Lq8/d;

.field public static final j:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg8/a$i;

    invoke-direct {v0}, Lg8/a$i;-><init>()V

    sput-object v0, Lg8/a$i;->a:Lg8/a$i;

    const-string v0, "arch"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$i;->b:Lq8/d;

    const-string v0, "model"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$i;->c:Lq8/d;

    const-string v0, "cores"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$i;->d:Lq8/d;

    const-string v0, "ram"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$i;->e:Lq8/d;

    const-string v0, "diskSpace"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$i;->f:Lq8/d;

    const-string v0, "simulator"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$i;->g:Lq8/d;

    const-string v0, "state"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$i;->h:Lq8/d;

    const-string v0, "manufacturer"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$i;->i:Lq8/d;

    const-string v0, "modelClass"

    invoke-static {v0}, Lq8/d;->d(Ljava/lang/String;)Lq8/d;

    move-result-object v0

    sput-object v0, Lg8/a$i;->j:Lq8/d;

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

    check-cast p1, Lg8/f0$e$c;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg8/a$i;->b(Lg8/f0$e$c;Lq8/f;)V

    return-void
.end method

.method public b(Lg8/f0$e$c;Lq8/f;)V
    .locals 3

    sget-object v0, Lg8/a$i;->b:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$c;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lg8/a$i;->c:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$i;->d:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$c;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lg8/a$i;->e:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$c;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg8/a$i;->f:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$c;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg8/a$i;->g:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$c;->j()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->g(Lq8/d;Z)Lq8/f;

    sget-object v0, Lg8/a$i;->h:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$c;->i()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lg8/a$i;->i:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg8/a$i;->j:Lq8/d;

    invoke-virtual {p1}, Lg8/f0$e$c;->g()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    return-void
.end method
