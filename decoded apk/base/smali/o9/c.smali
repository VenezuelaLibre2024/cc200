.class public final Lo9/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo9/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo9/c$a;
    }
.end annotation


# static fields
.field public static final g:Lo9/c$a;


# instance fields
.field public final a:Ljd/g;

.field public final b:Lz8/h;

.field public final c:Lm9/b;

.field public final d:Lo9/a;

.field public final e:Lo9/g;

.field public final f:Lle/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lo9/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo9/c$a;-><init>(Ltd/g;)V

    sput-object v0, Lo9/c;->g:Lo9/c$a;

    return-void
.end method

.method public constructor <init>(Ljd/g;Lz8/h;Lm9/b;Lo9/a;Lr0/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g;",
            "Lz8/h;",
            "Lm9/b;",
            "Lo9/a;",
            "Lr0/f<",
            "Lu0/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "backgroundDispatcher"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firebaseInstallationsApi"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appInfo"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configsFetcher"

    invoke-static {p4, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataStore"

    invoke-static {p5, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9/c;->a:Ljd/g;

    iput-object p2, p0, Lo9/c;->b:Lz8/h;

    iput-object p3, p0, Lo9/c;->c:Lm9/b;

    iput-object p4, p0, Lo9/c;->d:Lo9/a;

    new-instance p1, Lo9/g;

    invoke-direct {p1, p5}, Lo9/g;-><init>(Lr0/f;)V

    iput-object p1, p0, Lo9/c;->e:Lo9/g;

    const/4 p1, 0x0

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lle/c;->b(ZILjava/lang/Object;)Lle/a;

    move-result-object p1

    iput-object p1, p0, Lo9/c;->f:Lle/a;

    return-void
.end method

.method public static final synthetic e(Lo9/c;)Lo9/g;
    .locals 0

    iget-object p0, p0, Lo9/c;->e:Lo9/g;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lo9/c;->e:Lo9/g;

    invoke-virtual {v0}, Lo9/g;->g()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b()Lbe/a;
    .locals 2

    iget-object v0, p0, Lo9/c;->e:Lo9/g;

    invoke-virtual {v0}, Lo9/g;->e()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lbe/a;->i:Lbe/a$a;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sget-object v1, Lbe/d;->l:Lbe/d;

    invoke-static {v0, v1}, Lbe/c;->h(ILbe/d;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lbe/a;->c(J)Lbe/a;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public c()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lo9/c;->e:Lo9/g;

    invoke-virtual {v0}, Lo9/g;->f()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public d(Ljd/d;)Ljava/lang/Object;
    .locals 16
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

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lo9/c$b;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lo9/c$b;

    iget v3, v2, Lo9/c$b;->l:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lo9/c$b;->l:I

    goto :goto_0

    :cond_0
    new-instance v2, Lo9/c$b;

    invoke-direct {v2, v1, v0}, Lo9/c$b;-><init>(Lo9/c;Ljd/d;)V

    :goto_0
    iget-object v0, v2, Lo9/c$b;->j:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v3

    iget v4, v2, Lo9/c$b;->l:I

    const-string v5, "SessionConfigFetcher"

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v2, v2, Lo9/c$b;->h:Ljava/lang/Object;

    check-cast v2, Lle/a;

    :try_start_0
    invoke-static {v0}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v4, v2, Lo9/c$b;->i:Ljava/lang/Object;

    check-cast v4, Lle/a;

    iget-object v10, v2, Lo9/c$b;->h:Ljava/lang/Object;

    check-cast v10, Lo9/c;

    :try_start_1
    invoke-static {v0}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object v2, v4

    goto/16 :goto_4

    :cond_3
    iget-object v4, v2, Lo9/c$b;->i:Ljava/lang/Object;

    check-cast v4, Lle/a;

    iget-object v10, v2, Lo9/c$b;->h:Ljava/lang/Object;

    check-cast v10, Lo9/c;

    invoke-static {v0}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object v0, v1, Lo9/c;->f:Lle/a;

    invoke-interface {v0}, Lle/a;->a()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v1, Lo9/c;->e:Lo9/g;

    invoke-virtual {v0}, Lo9/g;->d()Z

    move-result v0

    if-nez v0, :cond_5

    sget-object v0, Lgd/s;->a:Lgd/s;

    return-object v0

    :cond_5
    iget-object v0, v1, Lo9/c;->f:Lle/a;

    iput-object v1, v2, Lo9/c$b;->h:Ljava/lang/Object;

    iput-object v0, v2, Lo9/c$b;->i:Ljava/lang/Object;

    iput v8, v2, Lo9/c$b;->l:I

    invoke-interface {v0, v9, v2}, Lle/a;->b(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    return-object v3

    :cond_6
    move-object v4, v0

    move-object v10, v1

    :goto_1
    :try_start_2
    iget-object v0, v10, Lo9/c;->e:Lo9/g;

    invoke-virtual {v0}, Lo9/g;->d()Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "Remote settings cache not expired. Using cached values."

    invoke-static {v5, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lgd/s;->a:Lgd/s;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-interface {v4, v9}, Lle/a;->c(Ljava/lang/Object;)V

    return-object v0

    :cond_7
    :try_start_3
    iget-object v0, v10, Lo9/c;->b:Lz8/h;

    invoke-interface {v0}, Lz8/h;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    const-string v11, "firebaseInstallationsApi.id"

    invoke-static {v0, v11}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v2, Lo9/c$b;->h:Ljava/lang/Object;

    iput-object v4, v2, Lo9/c$b;->i:Ljava/lang/Object;

    iput v7, v2, Lo9/c$b;->l:I

    invoke-static {v0, v2}, Lme/b;->a(Lcom/google/android/gms/tasks/Task;Ljd/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_8

    return-object v3

    :cond_8
    :goto_2
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_9

    const-string v0, "Error getting Firebase Installation ID. Skipping this Session Event."

    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lgd/s;->a:Lgd/s;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-interface {v4, v9}, Lle/a;->c(Ljava/lang/Object;)V

    return-object v0

    :cond_9
    const/4 v11, 0x5

    :try_start_4
    new-array v11, v11, [Lgd/j;

    const-string v12, "X-Crashlytics-Installation-ID"

    invoke-static {v12, v0}, Lgd/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lgd/j;

    move-result-object v0

    const/4 v12, 0x0

    aput-object v0, v11, v12

    const-string v0, "X-Crashlytics-Device-Model"

    sget-object v13, Ltd/z;->a:Ltd/z;

    const-string v13, "%s/%s"

    new-array v14, v7, [Ljava/lang/Object;

    sget-object v15, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    aput-object v15, v14, v12

    sget-object v12, Landroid/os/Build;->MODEL:Ljava/lang/String;

    aput-object v12, v14, v8

    invoke-static {v14, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13, v12}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "format(format, *args)"

    invoke-static {v12, v13}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10, v12}, Lo9/c;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v0, v12}, Lgd/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lgd/j;

    move-result-object v0

    aput-object v0, v11, v8

    const-string v0, "X-Crashlytics-OS-Build-Version"

    sget-object v8, Landroid/os/Build$VERSION;->INCREMENTAL:Ljava/lang/String;

    const-string v12, "INCREMENTAL"

    invoke-static {v8, v12}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Lo9/c;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v8}, Lgd/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lgd/j;

    move-result-object v0

    aput-object v0, v11, v7

    const-string v0, "X-Crashlytics-OS-Display-Version"

    sget-object v7, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v8, "RELEASE"

    invoke-static {v7, v8}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Lo9/c;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lgd/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lgd/j;

    move-result-object v0

    aput-object v0, v11, v6

    const/4 v0, 0x4

    const-string v7, "X-Crashlytics-API-Client-Version"

    iget-object v8, v10, Lo9/c;->c:Lm9/b;

    invoke-virtual {v8}, Lm9/b;->f()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lgd/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lgd/j;

    move-result-object v7

    aput-object v7, v11, v0

    invoke-static {v11}, Lhd/e0;->e([Lgd/j;)Ljava/util/Map;

    move-result-object v0

    const-string v7, "Fetching settings from server."

    invoke-static {v5, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v5, v10, Lo9/c;->d:Lo9/a;

    new-instance v7, Lo9/c$c;

    invoke-direct {v7, v10, v9}, Lo9/c$c;-><init>(Lo9/c;Ljd/d;)V

    new-instance v8, Lo9/c$d;

    invoke-direct {v8, v9}, Lo9/c$d;-><init>(Ljd/d;)V

    iput-object v4, v2, Lo9/c$b;->h:Ljava/lang/Object;

    iput-object v9, v2, Lo9/c$b;->i:Ljava/lang/Object;

    iput v6, v2, Lo9/c$b;->l:I

    invoke-interface {v5, v0, v7, v8, v2}, Lo9/a;->a(Ljava/util/Map;Lsd/p;Lsd/p;Ljd/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-ne v0, v3, :cond_a

    return-object v3

    :cond_a
    move-object v2, v4

    :goto_3
    :try_start_5
    sget-object v0, Lgd/s;->a:Lgd/s;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-interface {v2, v9}, Lle/a;->c(Ljava/lang/Object;)V

    return-object v0

    :goto_4
    invoke-interface {v2, v9}, Lle/a;->c(Ljava/lang/Object;)V

    throw v0
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Lae/e;

    const-string v1, "/"

    invoke-direct {v0, v1}, Lae/e;-><init>(Ljava/lang/String;)V

    const-string v1, ""

    invoke-virtual {v0, p1, v1}, Lae/e;->b(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
