.class public La8/g;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Le8/r;


# direct methods
.method public constructor <init>(Le8/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La8/g;->a:Le8/r;

    return-void
.end method

.method public static d()La8/g;
    .locals 2

    invoke-static {}, Ln7/g;->o()Ln7/g;

    move-result-object v0

    const-class v1, La8/g;

    invoke-virtual {v0, v1}, Ln7/g;->k(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La8/g;

    const-string v1, "FirebaseCrashlytics component is not present."

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object v0
.end method

.method public static e(Ln7/g;Lz8/h;Ly8/a;Ly8/a;Ly8/a;)La8/g;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/g;",
            "Lz8/h;",
            "Ly8/a<",
            "Lb8/a;",
            ">;",
            "Ly8/a<",
            "Lp7/a;",
            ">;",
            "Ly8/a<",
            "Lk9/a;",
            ">;)",
            "La8/g;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Initializing Firebase Crashlytics "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Le8/r;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lb8/g;->g(Ljava/lang/String;)V

    new-instance v15, Lj8/f;

    invoke-direct {v15, v0}, Lj8/f;-><init>(Landroid/content/Context;)V

    new-instance v3, Le8/x;

    move-object/from16 v2, p0

    invoke-direct {v3, v2}, Le8/x;-><init>(Ln7/g;)V

    new-instance v14, Le8/b0;

    move-object/from16 v4, p1

    invoke-direct {v14, v0, v1, v4, v3}, Le8/b0;-><init>(Landroid/content/Context;Ljava/lang/String;Lz8/h;Le8/x;)V

    new-instance v7, Lb8/d;

    move-object/from16 v1, p2

    invoke-direct {v7, v1}, Lb8/d;-><init>(Ly8/a;)V

    new-instance v1, La8/d;

    move-object/from16 v4, p3

    invoke-direct {v1, v4}, La8/d;-><init>(Ly8/a;)V

    const-string v4, "Crashlytics Exception Handler"

    invoke-static {v4}, Le8/z;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v12

    new-instance v13, Le8/m;

    invoke-direct {v13, v3, v15}, Le8/m;-><init>(Le8/x;Lj8/f;)V

    invoke-static {v13}, Ln9/a;->e(Ln9/b;)V

    new-instance v11, Lb8/k;

    move-object/from16 v4, p4

    invoke-direct {v11, v4}, Lb8/k;-><init>(Ly8/a;)V

    new-instance v10, Le8/r;

    invoke-virtual {v1}, La8/d;->e()Ld8/b;

    move-result-object v9

    invoke-virtual {v1}, La8/d;->d()Lc8/a;

    move-result-object v1

    move-object v4, v10

    move-object/from16 v5, p0

    move-object v6, v14

    move-object v8, v3

    move-object/from16 v16, v10

    move-object v10, v1

    move-object v1, v11

    move-object v11, v15

    move-object/from16 v17, v14

    move-object v14, v1

    invoke-direct/range {v4 .. v14}, Le8/r;-><init>(Ln7/g;Le8/b0;Lb8/a;Le8/x;Ld8/b;Lc8/a;Lj8/f;Ljava/util/concurrent/ExecutorService;Le8/m;Lb8/k;)V

    invoke-virtual/range {p0 .. p0}, Ln7/g;->r()Ln7/p;

    move-result-object v1

    invoke-virtual {v1}, Ln7/p;->c()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0}, Le8/i;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Le8/i;->j(Landroid/content/Context;)Ljava/util/List;

    move-result-object v5

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Mapping file ID is: "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb8/g;->b(Ljava/lang/String;)V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/f;

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v6

    const/4 v8, 0x3

    new-array v8, v8, [Ljava/lang/Object;

    const/4 v9, 0x0

    invoke-virtual {v2}, Le8/f;->c()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x1

    invoke-virtual {v2}, Le8/f;->a()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v8, v9

    const/4 v9, 0x2

    invoke-virtual {v2}, Le8/f;->b()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v8, v9

    const-string v2, "Build id for %s on %s: %s"

    invoke-static {v2, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lb8/g;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v6, Lb8/f;

    invoke-direct {v6, v0}, Lb8/f;-><init>(Landroid/content/Context;)V

    move-object v1, v0

    move-object/from16 v2, v17

    move-object v8, v3

    move-object v3, v7

    :try_start_0
    invoke-static/range {v1 .. v6}, Le8/a;->a(Landroid/content/Context;Le8/b0;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lb8/f;)Le8/a;

    move-result-object v9
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Installer package name is: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v9, Le8/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lb8/g;->i(Ljava/lang/String;)V

    const-string v1, "com.google.firebase.crashlytics.startup"

    invoke-static {v1}, Le8/z;->c(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;

    move-result-object v10

    new-instance v4, Li8/b;

    invoke-direct {v4}, Li8/b;-><init>()V

    iget-object v5, v9, Le8/a;->f:Ljava/lang/String;

    iget-object v6, v9, Le8/a;->g:Ljava/lang/String;

    move-object v1, v0

    move-object v2, v7

    move-object/from16 v3, v17

    move-object v7, v15

    invoke-static/range {v1 .. v8}, Ll8/f;->l(Landroid/content/Context;Ljava/lang/String;Le8/b0;Li8/b;Ljava/lang/String;Ljava/lang/String;Lj8/f;Le8/x;)Ll8/f;

    move-result-object v0

    invoke-virtual {v0, v10}, Ll8/f;->o(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    new-instance v2, La8/g$a;

    invoke-direct {v2}, La8/g$a;-><init>()V

    invoke-virtual {v1, v10, v2}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-object/from16 v1, v16

    invoke-virtual {v1, v9, v0}, Le8/r;->s(Le8/a;Ll8/i;)Z

    move-result v2

    new-instance v3, La8/g$b;

    invoke-direct {v3, v2, v1, v0}, La8/g$b;-><init>(ZLe8/r;Ll8/f;)V

    invoke-static {v10, v3}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    new-instance v0, La8/g;

    invoke-direct {v0, v1}, La8/g;-><init>(Le8/r;)V

    return-object v0

    :catch_0
    move-exception v0

    move-object v1, v0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v2, "Error retrieving app package info."

    invoke-virtual {v0, v2, v1}, Lb8/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La8/g;->a:Le8/r;

    invoke-virtual {v0}, Le8/r;->e()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, La8/g;->a:Le8/r;

    invoke-virtual {v0}, Le8/r;->f()Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, La8/g;->a:Le8/r;

    invoke-virtual {v0}, Le8/r;->g()Z

    move-result v0

    return v0
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, La8/g;->a:Le8/r;

    invoke-virtual {v0, p1}, Le8/r;->n(Ljava/lang/String;)V

    return-void
.end method

.method public g(Ljava/lang/Throwable;)V
    .locals 1

    if-nez p1, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v0, "A null value was passed to recordException. Ignoring."

    invoke-virtual {p1, v0}, Lb8/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, La8/g;->a:Le8/r;

    invoke-virtual {v0, p1}, Le8/r;->o(Ljava/lang/Throwable;)V

    return-void
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, La8/g;->a:Le8/r;

    invoke-virtual {v0}, Le8/r;->t()Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public i(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, La8/g;->a:Le8/r;

    invoke-virtual {v0, p1}, Le8/r;->u(Ljava/lang/Boolean;)V

    return-void
.end method

.method public j(Z)V
    .locals 1

    iget-object v0, p0, La8/g;->a:Le8/r;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p1}, Le8/r;->u(Ljava/lang/Boolean;)V

    return-void
.end method

.method public k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, La8/g;->a:Le8/r;

    invoke-virtual {v0, p1, p2}, Le8/r;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, La8/g;->a:Le8/r;

    invoke-virtual {v0, p1}, Le8/r;->x(Ljava/lang/String;)V

    return-void
.end method
