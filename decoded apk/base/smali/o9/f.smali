.class public final Lo9/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo9/f$b;
    }
.end annotation


# static fields
.field public static final c:Lo9/f$b;

.field public static final d:Lud/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lud/a<",
            "Landroid/content/Context;",
            "Lr0/f<",
            "Lu0/d;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lo9/h;

.field public final b:Lo9/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lo9/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo9/f$b;-><init>(Ltd/g;)V

    sput-object v0, Lo9/f;->c:Lo9/f$b;

    sget-object v0, Lm9/v;->a:Lm9/v;

    invoke-virtual {v0}, Lm9/v;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ls0/b;

    sget-object v0, Lo9/f$a;->h:Lo9/f$a;

    invoke-direct {v2, v0}, Ls0/b;-><init>(Lsd/l;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lt0/a;->b(Ljava/lang/String;Ls0/b;Lsd/l;Lce/p0;ILjava/lang/Object;)Lud/a;

    move-result-object v0

    sput-object v0, Lo9/f;->d:Lud/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljd/g;Ljd/g;Lz8/h;Lm9/b;)V
    .locals 9

    new-instance v0, Lo9/b;

    invoke-direct {v0, p1}, Lo9/b;-><init>(Landroid/content/Context;)V

    new-instance v7, Lo9/c;

    new-instance v8, Lo9/d;

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v8

    move-object v2, p5

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lo9/d;-><init>(Lm9/b;Ljd/g;Ljava/lang/String;ILtd/g;)V

    sget-object p2, Lo9/f;->c:Lo9/f$b;

    invoke-static {p2, p1}, Lo9/f$b;->a(Lo9/f$b;Landroid/content/Context;)Lr0/f;

    move-result-object v6

    move-object v1, v7

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, v8

    invoke-direct/range {v1 .. v6}, Lo9/c;-><init>(Ljd/g;Lz8/h;Lm9/b;Lo9/a;Lr0/f;)V

    invoke-direct {p0, v0, v7}, Lo9/f;-><init>(Lo9/h;Lo9/h;)V

    return-void
.end method

.method public constructor <init>(Ln7/g;Ljd/g;Ljd/g;Lz8/h;)V
    .locals 7

    const-string v0, "firebaseApp"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "blockingDispatcher"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firebaseInstallationsApi"

    invoke-static {p4, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v2

    const-string v0, "firebaseApp.applicationContext"

    invoke-static {v2, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm9/a0;->a:Lm9/a0;

    invoke-virtual {v0, p1}, Lm9/a0;->b(Ln7/g;)Lm9/b;

    move-result-object v6

    move-object v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lo9/f;-><init>(Landroid/content/Context;Ljd/g;Ljd/g;Lz8/h;Lm9/b;)V

    return-void
.end method

.method public constructor <init>(Lo9/h;Lo9/h;)V
    .locals 1

    const-string v0, "localOverrideSettings"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "remoteSettings"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/f;->a:Lo9/h;

    iput-object p2, p0, Lo9/f;->b:Lo9/h;

    return-void
.end method

.method public static final synthetic a()Lud/a;
    .locals 1

    sget-object v0, Lo9/f;->d:Lud/a;

    return-object v0
.end method


# virtual methods
.method public final b()D
    .locals 3

    iget-object v0, p0, Lo9/f;->a:Lo9/h;

    invoke-interface {v0}, Lo9/h;->c()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo9/f;->e(D)Z

    move-result v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lo9/f;->b:Lo9/h;

    invoke-interface {v0}, Lo9/h;->c()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo9/f;->e(D)Z

    move-result v2

    if-eqz v2, :cond_1

    return-wide v0

    :cond_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    return-wide v0
.end method

.method public final c()J
    .locals 3

    iget-object v0, p0, Lo9/f;->a:Lo9/h;

    invoke-interface {v0}, Lo9/h;->b()Lbe/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lbe/a;->I()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo9/f;->f(J)Z

    move-result v2

    if-eqz v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lo9/f;->b:Lo9/h;

    invoke-interface {v0}, Lo9/h;->b()Lbe/a;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lbe/a;->I()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lo9/f;->f(J)Z

    move-result v2

    if-eqz v2, :cond_1

    return-wide v0

    :cond_1
    sget-object v0, Lbe/a;->i:Lbe/a$a;

    const/16 v0, 0x1e

    sget-object v1, Lbe/d;->m:Lbe/d;

    invoke-static {v0, v1}, Lbe/c;->h(ILbe/d;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lo9/f;->a:Lo9/h;

    invoke-interface {v0}, Lo9/h;->a()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lo9/f;->b:Lo9/h;

    invoke-interface {v0}, Lo9/h;->a()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final e(D)Z
    .locals 4

    const-wide/16 v0, 0x0

    cmpg-double v0, v0, p1

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    cmpg-double p1, p1, v2

    if-gtz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final f(J)Z
    .locals 1

    invoke-static {p1, p2}, Lbe/a;->E(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Lbe/a;->z(J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final g(Ljd/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lo9/f$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo9/f$c;

    iget v1, v0, Lo9/f$c;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo9/f$c;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo9/f$c;

    invoke-direct {v0, p0, p1}, Lo9/f$c;-><init>(Lo9/f;Ljd/d;)V

    :goto_0
    iget-object p1, v0, Lo9/f$c;->i:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lo9/f$c;->k:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lo9/f$c;->h:Ljava/lang/Object;

    check-cast v2, Lo9/f;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo9/f;->a:Lo9/h;

    iput-object p0, v0, Lo9/f$c;->h:Ljava/lang/Object;

    iput v4, v0, Lo9/f$c;->k:I

    invoke-interface {p1, v0}, Lo9/h;->d(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p0

    :goto_1
    iget-object p1, v2, Lo9/f;->b:Lo9/h;

    const/4 v2, 0x0

    iput-object v2, v0, Lo9/f$c;->h:Ljava/lang/Object;

    iput v3, v0, Lo9/f$c;->k:I

    invoke-interface {p1, v0}, Lo9/h;->d(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
