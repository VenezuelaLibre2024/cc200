.class public Le8/r;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ln7/g;

.field public final c:Le8/x;

.field public final d:Le8/g0;

.field public final e:J

.field public f:Le8/s;

.field public g:Le8/s;

.field public h:Z

.field public i:Le8/p;

.field public final j:Le8/b0;

.field public final k:Lj8/f;

.field public final l:Ld8/b;

.field public final m:Lc8/a;

.field public final n:Ljava/util/concurrent/ExecutorService;

.field public final o:Le8/n;

.field public final p:Le8/m;

.field public final q:Lb8/a;

.field public final r:Lb8/k;


# direct methods
.method public constructor <init>(Ln7/g;Le8/b0;Lb8/a;Le8/x;Ld8/b;Lc8/a;Lj8/f;Ljava/util/concurrent/ExecutorService;Le8/m;Lb8/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/r;->b:Ln7/g;

    iput-object p4, p0, Le8/r;->c:Le8/x;

    invoke-virtual {p1}, Ln7/g;->m()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Le8/r;->a:Landroid/content/Context;

    iput-object p2, p0, Le8/r;->j:Le8/b0;

    iput-object p3, p0, Le8/r;->q:Lb8/a;

    iput-object p5, p0, Le8/r;->l:Ld8/b;

    iput-object p6, p0, Le8/r;->m:Lc8/a;

    iput-object p8, p0, Le8/r;->n:Ljava/util/concurrent/ExecutorService;

    iput-object p7, p0, Le8/r;->k:Lj8/f;

    new-instance p1, Le8/n;

    invoke-direct {p1, p8}, Le8/n;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p1, p0, Le8/r;->o:Le8/n;

    iput-object p9, p0, Le8/r;->p:Le8/m;

    iput-object p10, p0, Le8/r;->r:Lb8/k;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Le8/r;->e:J

    new-instance p1, Le8/g0;

    invoke-direct {p1}, Le8/g0;-><init>()V

    iput-object p1, p0, Le8/r;->d:Le8/g0;

    return-void
.end method

.method public static synthetic a(Le8/r;Ll8/i;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-virtual {p0, p1}, Le8/r;->i(Ll8/i;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Le8/r;)Le8/s;
    .locals 0

    iget-object p0, p0, Le8/r;->f:Le8/s;

    return-object p0
.end method

.method public static synthetic c(Le8/r;)Le8/p;
    .locals 0

    iget-object p0, p0, Le8/r;->i:Le8/p;

    return-object p0
.end method

.method public static l()Ljava/lang/String;
    .locals 1

    const-string v0, "18.6.2"

    return-object v0
.end method

.method public static m(Ljava/lang/String;Z)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p0

    const-string p1, "Configured not to require a build ID."

    invoke-virtual {p0, p1}, Lb8/g;->i(Ljava/lang/String;)V

    return v0

    :cond_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    return v0

    :cond_1
    const-string p0, "FirebaseCrashlytics"

    const-string p1, "."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ".     |  | "

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, ".     |  |"

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".   \\ |  | /"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".    \\    /"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".     \\  /"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".      \\/"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".      /\\"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".     /  \\"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".    /    \\"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, ".   / |  | \\"

    invoke-static {p0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final d()V
    .locals 2

    iget-object v0, p0, Le8/r;->o:Le8/n;

    new-instance v1, Le8/r$d;

    invoke-direct {v1, p0}, Le8/r$d;-><init>(Le8/r;)V

    invoke-virtual {v0, v1}, Le8/n;->h(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    :try_start_0
    invoke-static {v0}, Le8/q0;->f(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    iput-boolean v0, p0, Le8/r;->h:Z

    return-void

    :catch_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le8/r;->i:Le8/p;

    invoke-virtual {v0}, Le8/p;->o()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le8/r;->i:Le8/p;

    invoke-virtual {v0}, Le8/p;->t()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Le8/r;->h:Z

    return v0
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Le8/r;->f:Le8/s;

    invoke-virtual {v0}, Le8/s;->c()Z

    move-result v0

    return v0
.end method

.method public final i(Ll8/i;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/i;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const-string v0, "Collection of crash reports disabled in Crashlytics settings."

    invoke-virtual {p0}, Le8/r;->r()V

    :try_start_0
    iget-object v1, p0, Le8/r;->l:Ld8/b;

    new-instance v2, Le8/q;

    invoke-direct {v2, p0}, Le8/q;-><init>(Le8/r;)V

    invoke-interface {v1, v2}, Ld8/b;->a(Ld8/a;)V

    iget-object v1, p0, Le8/r;->i:Le8/p;

    invoke-virtual {v1}, Le8/p;->V()V

    invoke-interface {p1}, Ll8/i;->b()Ll8/d;

    move-result-object v1

    iget-object v1, v1, Ll8/d;->b:Ll8/d$a;

    iget-boolean v1, v1, Ll8/d$a;->a:Z

    if-nez v1, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    invoke-virtual {p1, v0}, Lb8/g;->b(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Le8/r;->q()V

    return-object p1

    :cond_0
    :try_start_1
    iget-object v0, p0, Le8/r;->i:Le8/p;

    invoke-virtual {v0, p1}, Le8/p;->B(Ll8/i;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Previous sessions could not be finalized."

    invoke-virtual {v0, v1}, Lb8/g;->k(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Le8/r;->i:Le8/p;

    invoke-interface {p1}, Ll8/i;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    invoke-virtual {v0, p1}, Le8/p;->a0(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0}, Le8/r;->q()V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during asynchronous initialization."

    invoke-virtual {v0, v1, p1}, Lb8/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p0}, Le8/r;->q()V

    return-object p1

    :goto_0
    invoke-virtual {p0}, Le8/r;->q()V

    throw p1
.end method

.method public j(Ll8/i;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll8/i;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le8/r;->n:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Le8/r$a;

    invoke-direct {v1, p0, p1}, Le8/r$a;-><init>(Le8/r;Ll8/i;)V

    invoke-static {v0, v1}, Le8/q0;->h(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ll8/i;)V
    .locals 3

    new-instance v0, Le8/r$b;

    invoke-direct {v0, p0, p1}, Le8/r$b;-><init>(Le8/r;Ll8/i;)V

    iget-object p1, p0, Le8/r;->n:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously."

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    const-wide/16 v0, 0x3

    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v0, v1, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Crashlytics timed out during initialization."

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Crashlytics encountered a problem during initialization."

    goto :goto_0

    :catch_2
    move-exception p1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Crashlytics was interrupted during initialization."

    :goto_0
    invoke-virtual {v0, v1, p1}, Lb8/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Le8/r;->e:J

    sub-long/2addr v0, v2

    iget-object v2, p0, Le8/r;->i:Le8/p;

    invoke-virtual {v2, v0, v1, p1}, Le8/p;->e0(JLjava/lang/String;)V

    return-void
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Le8/r;->i:Le8/p;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Le8/p;->d0(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method public p(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Recorded on-demand fatal events: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le8/r;->d:Le8/g0;

    invoke-virtual {v2}, Le8/g0;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Dropped on-demand fatal events: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Le8/r;->d:Le8/g0;

    invoke-virtual {v2}, Le8/g0;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    iget-object v0, p0, Le8/r;->i:Le8/p;

    iget-object v1, p0, Le8/r;->d:Le8/g0;

    invoke-virtual {v1}, Le8/g0;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.crashlytics.on-demand.recorded-exceptions"

    invoke-virtual {v0, v2, v1}, Le8/p;->Y(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Le8/r;->i:Le8/p;

    iget-object v1, p0, Le8/r;->d:Le8/g0;

    invoke-virtual {v1}, Le8/g0;->a()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.crashlytics.on-demand.dropped-exceptions"

    invoke-virtual {v0, v2, v1}, Le8/p;->Y(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Le8/r;->i:Le8/p;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Le8/p;->Q(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method

.method public q()V
    .locals 2

    iget-object v0, p0, Le8/r;->o:Le8/n;

    new-instance v1, Le8/r$c;

    invoke-direct {v1, p0}, Le8/r$c;-><init>(Le8/r;)V

    invoke-virtual {v0, v1}, Le8/n;->h(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public r()V
    .locals 2

    iget-object v0, p0, Le8/r;->o:Le8/n;

    invoke-virtual {v0}, Le8/n;->b()V

    iget-object v0, p0, Le8/r;->f:Le8/s;

    invoke-virtual {v0}, Le8/s;->a()Z

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Initialization marker file was created."

    invoke-virtual {v0, v1}, Lb8/g;->i(Ljava/lang/String;)V

    return-void
.end method

.method public s(Le8/a;Ll8/i;)Z
    .locals 28

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    iget-object v2, v1, Le8/r;->a:Landroid/content/Context;

    const-string v3, "com.crashlytics.RequireBuildId"

    const/4 v12, 0x1

    invoke-static {v2, v3, v12}, Le8/i;->i(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    move-object/from16 v15, p1

    iget-object v3, v15, Le8/a;->b:Ljava/lang/String;

    invoke-static {v3, v2}, Le8/r;->m(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Le8/h;

    iget-object v3, v1, Le8/r;->j:Le8/b0;

    invoke-direct {v2, v3}, Le8/h;-><init>(Le8/b0;)V

    invoke-virtual {v2}, Le8/h;->toString()Ljava/lang/String;

    move-result-object v14

    const/16 v27, 0x0

    :try_start_0
    new-instance v2, Le8/s;

    const-string v3, "crash_marker"

    iget-object v4, v1, Le8/r;->k:Lj8/f;

    invoke-direct {v2, v3, v4}, Le8/s;-><init>(Ljava/lang/String;Lj8/f;)V

    iput-object v2, v1, Le8/r;->g:Le8/s;

    new-instance v2, Le8/s;

    const-string v3, "initialization_marker"

    iget-object v4, v1, Le8/r;->k:Lj8/f;

    invoke-direct {v2, v3, v4}, Le8/s;-><init>(Ljava/lang/String;Lj8/f;)V

    iput-object v2, v1, Le8/r;->f:Le8/s;

    new-instance v13, Lf8/m;

    iget-object v2, v1, Le8/r;->k:Lj8/f;

    iget-object v3, v1, Le8/r;->o:Le8/n;

    invoke-direct {v13, v14, v2, v3}, Lf8/m;-><init>(Ljava/lang/String;Lj8/f;Le8/n;)V

    new-instance v11, Lf8/e;

    iget-object v2, v1, Le8/r;->k:Lj8/f;

    invoke-direct {v11, v2}, Lf8/e;-><init>(Lj8/f;)V

    new-instance v8, Lm8/a;

    const/16 v2, 0x400

    new-array v3, v12, [Lm8/d;

    new-instance v4, Lm8/c;

    const/16 v5, 0xa

    invoke-direct {v4, v5}, Lm8/c;-><init>(I)V

    aput-object v4, v3, v27

    invoke-direct {v8, v2, v3}, Lm8/a;-><init>(I[Lm8/d;)V

    iget-object v2, v1, Le8/r;->r:Lb8/k;

    invoke-virtual {v2, v13}, Lb8/k;->c(Lf8/m;)V

    iget-object v2, v1, Le8/r;->a:Landroid/content/Context;

    iget-object v3, v1, Le8/r;->j:Le8/b0;

    iget-object v4, v1, Le8/r;->k:Lj8/f;

    iget-object v10, v1, Le8/r;->d:Le8/g0;

    iget-object v9, v1, Le8/r;->p:Le8/m;

    move-object/from16 v5, p1

    move-object v6, v11

    move-object v7, v13

    move-object/from16 v16, v9

    move-object/from16 v9, p2

    move-object/from16 v22, v11

    move-object/from16 v11, v16

    invoke-static/range {v2 .. v11}, Le8/j0;->h(Landroid/content/Context;Le8/b0;Lj8/f;Le8/a;Lf8/e;Lf8/m;Lm8/d;Ll8/i;Le8/g0;Le8/m;)Le8/j0;

    move-result-object v23

    new-instance v2, Le8/p;

    iget-object v3, v1, Le8/r;->a:Landroid/content/Context;

    iget-object v4, v1, Le8/r;->o:Le8/n;

    iget-object v5, v1, Le8/r;->j:Le8/b0;

    iget-object v6, v1, Le8/r;->c:Le8/x;

    iget-object v7, v1, Le8/r;->k:Lj8/f;

    iget-object v8, v1, Le8/r;->g:Le8/s;

    iget-object v9, v1, Le8/r;->q:Lb8/a;

    iget-object v10, v1, Le8/r;->m:Lc8/a;

    iget-object v11, v1, Le8/r;->p:Le8/m;

    move-object/from16 v21, v13

    move-object v13, v2

    move-object v12, v14

    move-object v14, v3

    move-object v15, v4

    move-object/from16 v16, v5

    move-object/from16 v17, v6

    move-object/from16 v18, v7

    move-object/from16 v19, v8

    move-object/from16 v20, p1

    move-object/from16 v24, v9

    move-object/from16 v25, v10

    move-object/from16 v26, v11

    invoke-direct/range {v13 .. v26}, Le8/p;-><init>(Landroid/content/Context;Le8/n;Le8/b0;Le8/x;Lj8/f;Le8/s;Le8/a;Lf8/m;Lf8/e;Le8/j0;Lb8/a;Lc8/a;Le8/m;)V

    iput-object v2, v1, Le8/r;->i:Le8/p;

    invoke-virtual/range {p0 .. p0}, Le8/r;->h()Z

    move-result v2

    invoke-virtual/range {p0 .. p0}, Le8/r;->d()V

    iget-object v3, v1, Le8/r;->i:Le8/p;

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v4

    invoke-virtual {v3, v12, v4, v0}, Le8/p;->z(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Ll8/i;)V

    if-eqz v2, :cond_0

    iget-object v2, v1, Le8/r;->a:Landroid/content/Context;

    invoke-static {v2}, Le8/i;->d(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v2

    const-string v3, "Crashlytics did not finish previous background initialization. Initializing synchronously."

    invoke-virtual {v2, v3}, Lb8/g;->b(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Le8/r;->k(Ll8/i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v27

    :cond_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v2, "Successfully configured exception handler."

    invoke-virtual {v0, v2}, Lb8/g;->b(Ljava/lang/String;)V

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v2

    const-string v3, "Crashlytics was not started due to an exception during initialization"

    invoke-virtual {v2, v3, v0}, Lb8/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    iput-object v0, v1, Le8/r;->i:Le8/p;

    return v27

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app\'s build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public t()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le8/r;->i:Le8/p;

    invoke-virtual {v0}, Le8/p;->W()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Le8/r;->c:Le8/x;

    invoke-virtual {v0, p1}, Le8/x;->h(Ljava/lang/Boolean;)V

    return-void
.end method

.method public v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Le8/r;->i:Le8/p;

    invoke-virtual {v0, p1, p2}, Le8/p;->X(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Le8/r;->i:Le8/p;

    invoke-virtual {v0, p1, p2}, Le8/p;->Y(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Le8/r;->i:Le8/p;

    invoke-virtual {v0, p1}, Le8/p;->Z(Ljava/lang/String;)V

    return-void
.end method
