.class public final Lm9/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm9/b0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/c0$a;
    }
.end annotation


# static fields
.field public static final g:Lm9/c0$a;

.field public static final h:D


# instance fields
.field public final b:Ln7/g;

.field public final c:Lz8/h;

.field public final d:Lo9/f;

.field public final e:Lm9/h;

.field public final f:Ljd/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm9/c0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/c0$a;-><init>(Ltd/g;)V

    sput-object v0, Lm9/c0;->g:Lm9/c0$a;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    sput-wide v0, Lm9/c0;->h:D

    return-void
.end method

.method public constructor <init>(Ln7/g;Lz8/h;Lo9/f;Lm9/h;Ljd/g;)V
    .locals 1

    const-string v0, "firebaseApp"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firebaseInstallations"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionSettings"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventGDTLogger"

    invoke-static {p4, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p5, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/c0;->b:Ln7/g;

    iput-object p2, p0, Lm9/c0;->c:Lz8/h;

    iput-object p3, p0, Lm9/c0;->d:Lo9/f;

    iput-object p4, p0, Lm9/c0;->e:Lm9/h;

    iput-object p5, p0, Lm9/c0;->f:Ljd/g;

    return-void
.end method

.method public static final synthetic b(Lm9/c0;Lm9/z;)V
    .locals 0

    invoke-virtual {p0, p1}, Lm9/c0;->g(Lm9/z;)V

    return-void
.end method

.method public static final synthetic c(Lm9/c0;)Ln7/g;
    .locals 0

    iget-object p0, p0, Lm9/c0;->b:Ln7/g;

    return-object p0
.end method

.method public static final synthetic d(Lm9/c0;Ljd/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lm9/c0;->h(Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lm9/c0;)Lo9/f;
    .locals 0

    iget-object p0, p0, Lm9/c0;->d:Lo9/f;

    return-object p0
.end method

.method public static final synthetic f(Lm9/c0;Ljd/d;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lm9/c0;->j(Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lm9/y;)V
    .locals 7

    const-string v0, "sessionDetails"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm9/c0;->f:Ljd/g;

    invoke-static {v0}, Lce/q0;->a(Ljd/g;)Lce/p0;

    move-result-object v1

    new-instance v4, Lm9/c0$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lm9/c0$c;-><init>(Lm9/c0;Lm9/y;Ljd/d;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lce/i;->d(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/c2;

    return-void
.end method

.method public final g(Lm9/z;)V
    .locals 3

    const-string v0, "SessionFirelogPublisher"

    :try_start_0
    iget-object v1, p0, Lm9/c0;->e:Lm9/h;

    invoke-interface {v1, p1}, Lm9/h;->a(Lm9/z;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Successfully logged Session Start event: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lm9/z;->c()Lm9/e0;

    move-result-object p1

    invoke-virtual {p1}, Lm9/e0;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Error logging Session Start event to DataTransport: "

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method

.method public final h(Ljd/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lm9/c0$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lm9/c0$b;

    iget v1, v0, Lm9/c0$b;->j:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm9/c0$b;->j:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm9/c0$b;

    invoke-direct {v0, p0, p1}, Lm9/c0$b;-><init>(Lm9/c0;Ljd/d;)V

    :goto_0
    iget-object p1, v0, Lm9/c0$b;->h:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lm9/c0$b;->j:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lm9/c0;->c:Lz8/h;

    invoke-interface {p1}, Lz8/h;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    const-string v2, "firebaseInstallations.id"

    invoke-static {p1, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput v3, v0, Lm9/c0$b;->j:I

    invoke-static {p1, v0}, Lme/b;->a(Lcom/google/android/gms/tasks/Task;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    const-string v0, "SessionFirelogPublisher"

    const-string v1, "Error getting Firebase Installation ID. Using an empty ID"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string p1, ""

    :goto_3
    return-object p1
.end method

.method public final i()Z
    .locals 4

    sget-wide v0, Lm9/c0;->h:D

    iget-object v2, p0, Lm9/c0;->d:Lo9/f;

    invoke-virtual {v2}, Lo9/f;->b()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final j(Ljd/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lm9/c0$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lm9/c0$d;

    iget v1, v0, Lm9/c0$d;->k:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm9/c0$d;->k:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm9/c0$d;

    invoke-direct {v0, p0, p1}, Lm9/c0$d;-><init>(Lm9/c0;Ljd/d;)V

    :goto_0
    iget-object p1, v0, Lm9/c0$d;->i:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lm9/c0$d;->k:I

    const-string v3, "SessionFirelogPublisher"

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lm9/c0$d;->h:Ljava/lang/Object;

    check-cast v0, Lm9/c0;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    const-string p1, "Data Collection is enabled for at least one Subscriber"

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lm9/c0;->d:Lo9/f;

    iput-object p0, v0, Lm9/c0$d;->h:Ljava/lang/Object;

    iput v4, v0, Lm9/c0$d;->k:I

    invoke-virtual {p1, v0}, Lo9/f;->g(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p1, v0, Lm9/c0;->d:Lo9/f;

    invoke-virtual {p1}, Lo9/f;->d()Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_4

    const-string p1, "Sessions SDK disabled. Events will not be sent."

    :goto_2
    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v1}, Lld/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {v0}, Lm9/c0;->i()Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "Sessions SDK has dropped this session due to sampling."

    goto :goto_2

    :cond_5
    invoke-static {v4}, Lld/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
