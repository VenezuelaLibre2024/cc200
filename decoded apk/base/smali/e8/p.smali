.class public Le8/p;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final t:Ljava/io/FilenameFilter;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Le8/x;

.field public final c:Le8/s;

.field public final d:Lf8/m;

.field public final e:Le8/n;

.field public final f:Le8/b0;

.field public final g:Lj8/f;

.field public final h:Le8/a;

.field public final i:Lf8/e;

.field public final j:Lb8/a;

.field public final k:Lc8/a;

.field public final l:Le8/m;

.field public final m:Le8/j0;

.field public n:Le8/v;

.field public o:Ll8/i;

.field public final p:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Le8/o;->a:Le8/o;

    sput-object v0, Le8/p;->t:Ljava/io/FilenameFilter;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Le8/n;Le8/b0;Le8/x;Lj8/f;Le8/s;Le8/a;Lf8/m;Lf8/e;Le8/j0;Lb8/a;Lc8/a;Le8/m;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Le8/p;->o:Ll8/i;

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v0, p0, Le8/p;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v0, p0, Le8/p;->q:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    iput-object v0, p0, Le8/p;->r:Lcom/google/android/gms/tasks/TaskCompletionSource;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Le8/p;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Le8/p;->a:Landroid/content/Context;

    iput-object p2, p0, Le8/p;->e:Le8/n;

    iput-object p3, p0, Le8/p;->f:Le8/b0;

    iput-object p4, p0, Le8/p;->b:Le8/x;

    iput-object p5, p0, Le8/p;->g:Lj8/f;

    iput-object p6, p0, Le8/p;->c:Le8/s;

    iput-object p7, p0, Le8/p;->h:Le8/a;

    iput-object p8, p0, Le8/p;->d:Lf8/m;

    iput-object p9, p0, Le8/p;->i:Lf8/e;

    iput-object p11, p0, Le8/p;->j:Lb8/a;

    iput-object p12, p0, Le8/p;->k:Lc8/a;

    iput-object p13, p0, Le8/p;->l:Le8/m;

    iput-object p10, p0, Le8/p;->m:Le8/j0;

    return-void
.end method

.method public static C()Z
    .locals 1

    :try_start_0
    const-string v0, "com.google.firebase.crash.FirebaseCrash"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public static E()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Le8/p;->H(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public static F(Lb8/h;Ljava/lang/String;Lj8/f;[B)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb8/h;",
            "Ljava/lang/String;",
            "Lj8/f;",
            "[B)",
            "Ljava/util/List<",
            "Le8/e0;",
            ">;"
        }
    .end annotation

    const-string v0, "user-data"

    invoke-virtual {p2, p1, v0}, Lj8/f;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    const-string v1, "keys"

    invoke-virtual {p2, p1, v1}, Lj8/f;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    const-string v3, "rollouts-state"

    invoke-virtual {p2, p1, v3}, Lj8/f;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Le8/g;

    const-string v4, "logs_file"

    const-string v5, "logs"

    invoke-direct {v3, v4, v5, p3}, Le8/g;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    invoke-interface {p2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Le8/a0;

    invoke-interface {p0}, Lb8/h;->g()Ljava/io/File;

    move-result-object v3

    const-string v4, "crash_meta_file"

    const-string v5, "metadata"

    invoke-direct {p3, v4, v5, v3}, Le8/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Le8/a0;

    invoke-interface {p0}, Lb8/h;->f()Ljava/io/File;

    move-result-object v3

    const-string v4, "session_meta_file"

    const-string v5, "session"

    invoke-direct {p3, v4, v5, v3}, Le8/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Le8/a0;

    invoke-interface {p0}, Lb8/h;->a()Ljava/io/File;

    move-result-object v3

    const-string v4, "app_meta_file"

    const-string v5, "app"

    invoke-direct {p3, v4, v5, v3}, Le8/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Le8/a0;

    invoke-interface {p0}, Lb8/h;->c()Ljava/io/File;

    move-result-object v3

    const-string v4, "device_meta_file"

    const-string v5, "device"

    invoke-direct {p3, v4, v5, v3}, Le8/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p3, Le8/a0;

    invoke-interface {p0}, Lb8/h;->b()Ljava/io/File;

    move-result-object v3

    const-string v4, "os_meta_file"

    const-string v5, "os"

    invoke-direct {p3, v4, v5, v3}, Le8/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p0}, Le8/p;->S(Lb8/h;)Le8/e0;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Le8/a0;

    const-string p3, "user_meta_file"

    const-string v3, "user"

    invoke-direct {p0, p3, v3, v0}, Le8/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Le8/a0;

    const-string p3, "keys_file"

    invoke-direct {p0, p3, v1, v2}, Le8/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p0, Le8/a0;

    const-string p3, "rollouts_file"

    const-string v0, "rollouts"

    invoke-direct {p0, p3, v0, p1}, Le8/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p2
.end method

.method public static H(J)J
    .locals 2

    const-wide/16 v0, 0x3e8

    div-long/2addr p0, v0

    return-wide p0
.end method

.method public static synthetic M(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    const-string p0, ".ae"

    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static R(Ljava/lang/String;Ljava/io/File;Lg8/f0$a;)Z
    .locals 3

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No minidump data found for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/g;->k(Ljava/lang/String;)V

    :cond_1
    if-nez p2, :cond_2

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No Tombstones data found for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lb8/g;->g(Ljava/lang/String;)V

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_4

    :cond_3
    if-nez p2, :cond_4

    const/4 p0, 0x1

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static S(Lb8/h;)Le8/e0;
    .locals 4

    invoke-interface {p0}, Lb8/h;->e()Ljava/io/File;

    move-result-object p0

    const-string v0, "minidump"

    const-string v1, "minidump_file"

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Le8/a0;

    invoke-direct {v2, v1, v0, p0}, Le8/a0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v2, Le8/g;

    const/4 p0, 0x1

    new-array p0, p0, [B

    const/4 v3, 0x0

    aput-byte v3, p0, v3

    invoke-direct {v2, v1, v0, p0}, Le8/g;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    :goto_1
    return-object v2
.end method

.method public static U(Ljava/io/InputStream;)[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x400

    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ljava/io/File;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Le8/p;->M(Ljava/io/File;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(J)J
    .locals 0

    invoke-static {p0, p1}, Le8/p;->H(J)J

    move-result-wide p0

    return-wide p0
.end method

.method public static synthetic c(Le8/p;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Le8/p;->D()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/List;)V
    .locals 0

    invoke-static {p0}, Le8/p;->s(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic e(Le8/p;)Lf8/e;
    .locals 0

    iget-object p0, p0, Le8/p;->i:Lf8/e;

    return-object p0
.end method

.method public static synthetic f(Le8/p;)Lc8/a;
    .locals 0

    iget-object p0, p0, Le8/p;->k:Lc8/a;

    return-object p0
.end method

.method public static synthetic g(Le8/p;)Le8/s;
    .locals 0

    iget-object p0, p0, Le8/p;->c:Le8/s;

    return-object p0
.end method

.method public static synthetic h(Le8/p;)Le8/j0;
    .locals 0

    iget-object p0, p0, Le8/p;->m:Le8/j0;

    return-object p0
.end method

.method public static synthetic i(Le8/p;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Le8/p;->y(J)V

    return-void
.end method

.method public static synthetic j(Le8/p;)Le8/b0;
    .locals 0

    iget-object p0, p0, Le8/p;->f:Le8/b0;

    return-object p0
.end method

.method public static synthetic k(Le8/p;Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Le8/p;->x(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic l(Le8/p;)Le8/x;
    .locals 0

    iget-object p0, p0, Le8/p;->b:Le8/x;

    return-object p0
.end method

.method public static synthetic m(Le8/p;)Le8/n;
    .locals 0

    iget-object p0, p0, Le8/p;->e:Le8/n;

    return-object p0
.end method

.method public static synthetic n(Le8/p;)Lcom/google/android/gms/tasks/Task;
    .locals 0

    invoke-virtual {p0}, Le8/p;->P()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static p(Le8/b0;Le8/a;)Lg8/g0$a;
    .locals 6

    invoke-virtual {p0}, Le8/b0;->f()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Le8/a;->f:Ljava/lang/String;

    iget-object v2, p1, Le8/a;->g:Ljava/lang/String;

    invoke-virtual {p0}, Le8/b0;->a()Le8/c0$a;

    move-result-object p0

    invoke-virtual {p0}, Le8/c0$a;->c()Ljava/lang/String;

    move-result-object v3

    iget-object p0, p1, Le8/a;->d:Ljava/lang/String;

    invoke-static {p0}, Le8/y;->b(Ljava/lang/String;)Le8/y;

    move-result-object p0

    invoke-virtual {p0}, Le8/y;->c()I

    move-result v4

    iget-object v5, p1, Le8/a;->h:Lb8/f;

    invoke-static/range {v0 .. v5}, Lg8/g0$a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILb8/f;)Lg8/g0$a;

    move-result-object p0

    return-object p0
.end method

.method public static q(Landroid/content/Context;)Lg8/g0$b;
    .locals 16

    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v3, v0

    mul-long v10, v1, v3

    invoke-static {}, Le8/i;->k()I

    move-result v5

    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v7

    invoke-static/range {p0 .. p0}, Le8/i;->b(Landroid/content/Context;)J

    move-result-wide v8

    invoke-static {}, Le8/i;->w()Z

    move-result v12

    invoke-static {}, Le8/i;->l()I

    move-result v13

    sget-object v14, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v15, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static/range {v5 .. v15}, Lg8/g0$b;->c(ILjava/lang/String;IJJZILjava/lang/String;Ljava/lang/String;)Lg8/g0$b;

    move-result-object v0

    return-object v0
.end method

.method public static r()Lg8/g0$c;
    .locals 3

    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-static {}, Le8/i;->x()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lg8/g0$c;->a(Ljava/lang/String;Ljava/lang/String;Z)Lg8/g0$c;

    move-result-object v0

    return-object v0
.end method

.method public static s(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)V
    .locals 7

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Finalizing native report for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/g;->i(Ljava/lang/String;)V

    iget-object v0, p0, Le8/p;->j:Lb8/a;

    invoke-interface {v0, p1}, Lb8/a;->a(Ljava/lang/String;)Lb8/h;

    move-result-object v0

    invoke-interface {v0}, Lb8/h;->e()Ljava/io/File;

    move-result-object v1

    invoke-interface {v0}, Lb8/h;->d()Lg8/f0$a;

    move-result-object v2

    invoke-static {p1, v1, v2}, Le8/p;->R(Ljava/lang/String;Ljava/io/File;Lg8/f0$a;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v0, "No native core present"

    invoke-virtual {p1, v0}, Lb8/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v3

    new-instance v1, Lf8/e;

    iget-object v5, p0, Le8/p;->g:Lj8/f;

    invoke-direct {v1, v5, p1}, Lf8/e;-><init>(Lj8/f;Ljava/lang/String;)V

    iget-object v5, p0, Le8/p;->g:Lj8/f;

    invoke-virtual {v5, p1}, Lj8/f;->i(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v0, "Couldn\'t create directory to store native session files, aborting."

    invoke-virtual {p1, v0}, Lb8/g;->k(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p0, v3, v4}, Le8/p;->y(J)V

    iget-object v3, p0, Le8/p;->g:Lj8/f;

    invoke-virtual {v1}, Lf8/e;->b()[B

    move-result-object v4

    invoke-static {v0, p1, v3, v4}, Le8/p;->F(Lb8/h;Ljava/lang/String;Lj8/f;[B)Ljava/util/List;

    move-result-object v0

    invoke-static {v5, v0}, Le8/f0;->b(Ljava/io/File;Ljava/util/List;)V

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v3

    const-string v4, "CrashlyticsController#finalizePreviousNativeSession"

    invoke-virtual {v3, v4}, Lb8/g;->b(Ljava/lang/String;)V

    iget-object v3, p0, Le8/p;->m:Le8/j0;

    invoke-virtual {v3, p1, v0, v2}, Le8/j0;->j(Ljava/lang/String;Ljava/util/List;Lg8/f0$a;)V

    invoke-virtual {v1}, Lf8/e;->a()V

    return-void
.end method

.method public B(Ll8/i;)Z
    .locals 3

    iget-object v0, p0, Le8/p;->e:Le8/n;

    invoke-virtual {v0}, Le8/n;->b()V

    invoke-virtual {p0}, Le8/p;->L()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v0, "Skipping session finalization because a crash has already occurred."

    invoke-virtual {p1, v0}, Lb8/g;->k(Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v2, "Finalizing previously open sessions."

    invoke-virtual {v0, v2}, Lb8/g;->i(Ljava/lang/String;)V

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, v0, p1}, Le8/p;->w(ZLl8/i;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v1, "Closed all previously open sessions."

    invoke-virtual {p1, v1}, Lb8/g;->i(Ljava/lang/String;)V

    return v0

    :catch_0
    move-exception p1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v2, "Unable to finalize previously open sessions."

    invoke-virtual {v0, v2, p1}, Lb8/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return v1
.end method

.method public final D()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Le8/p;->m:Le8/j0;

    invoke-virtual {v0}, Le8/j0;->p()Ljava/util/SortedSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedSet;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/SortedSet;->first()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final G(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v0, "Couldn\'t get Class Loader"

    invoke-virtual {p1, v0}, Lb8/g;->k(Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    if-nez p1, :cond_1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v0, "No version control information found"

    invoke-virtual {p1, v0}, Lb8/g;->g(Ljava/lang/String;)V

    return-object v1

    :cond_1
    return-object p1
.end method

.method public I()Ljava/lang/String;
    .locals 3

    const-string v0, "META-INF/version-control-info.textproto"

    invoke-virtual {p0, v0}, Le8/p;->G(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v1

    const-string v2, "Read version control info"

    invoke-virtual {v1, v2}, Lb8/g;->b(Ljava/lang/String;)V

    invoke-static {v0}, Le8/p;->U(Ljava/io/InputStream;)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public J(Ll8/i;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Le8/p;->K(Ll8/i;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method public declared-synchronized K(Ll8/i;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
    .locals 10

    monitor-enter p0

    :try_start_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Handling uncaught exception \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "\" from thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-object v0, p0, Le8/p;->e:Le8/n;

    new-instance v1, Le8/p$b;

    move-object v2, v1

    move-object v3, p0

    move-object v6, p3

    move-object v7, p2

    move-object v8, p1

    move v9, p4

    invoke-direct/range {v2 .. v9}, Le8/p$b;-><init>(Le8/p;JLjava/lang/Throwable;Ljava/lang/Thread;Ll8/i;Z)V

    invoke-virtual {v0, v1}, Le8/n;->i(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {p1}, Le8/q0;->f(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p2

    const-string p3, "Error handling uncaught exception"

    invoke-virtual {p2, p3, p1}, Lb8/g;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string p2, "Cannot send reports. Timed out while fetching settings."

    invoke-virtual {p1, p2}, Lb8/g;->d(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public L()Z
    .locals 1

    iget-object v0, p0, Le8/p;->n:Le8/v;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le8/v;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public N()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le8/p;->g:Lj8/f;

    sget-object v1, Le8/p;->t:Ljava/io/FilenameFilter;

    invoke-virtual {v0, v1}, Lj8/f;->f(Ljava/io/FilenameFilter;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final O(J)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Le8/p;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string p2, "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists"

    invoke-virtual {p1, p2}, Lb8/g;->k(Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Logging app exception event to Firebase Analytics"

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    new-instance v0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;-><init>(I)V

    new-instance v1, Le8/p$h;

    invoke-direct {v1, p0, p1, p2}, Le8/p$h;-><init>(Le8/p;J)V

    invoke-static {v0, v1}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final P()Lcom/google/android/gms/tasks/Task;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Le8/p;->N()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/File;

    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x3

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {p0, v3, v4}, Le8/p;->O(J)Lcom/google/android/gms/tasks/Task;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Could not parse app exception timestamp from file "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lb8/g;->k(Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->whenAll(Ljava/util/Collection;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public Q(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Le8/p;->o:Ll8/i;

    if-nez v0, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string p2, "settingsProvider not set"

    invoke-virtual {p1, p2}, Lb8/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p0, v0, p1, p2, v1}, Le8/p;->K(Ll8/i;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method public T(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Le8/p;->e:Le8/n;

    new-instance v1, Le8/p$g;

    invoke-direct {v1, p0, p1}, Le8/p$g;-><init>(Le8/p;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le8/n;->h(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public V()V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Le8/p;->I()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "com.crashlytics.version-control-info"

    invoke-virtual {p0, v1, v0}, Le8/p;->Y(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Saved version control info"

    invoke-virtual {v0, v1}, Lb8/g;->g(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v1

    const-string v2, "Unable to save version control info"

    invoke-virtual {v1, v2, v0}, Lb8/g;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public W()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le8/p;->q:Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    iget-object v0, p0, Le8/p;->r:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public X(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Le8/p;->d:Lf8/m;

    invoke-virtual {v0, p1, p2}, Lf8/m;->m(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Le8/p;->a:Landroid/content/Context;

    if-eqz p2, :cond_1

    invoke-static {p2}, Le8/i;->u(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string p2, "Attempting to set custom attribute with null key, ignoring."

    invoke-virtual {p1, p2}, Lb8/g;->d(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public Y(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Le8/p;->d:Lf8/m;

    invoke-virtual {v0, p1, p2}, Lf8/m;->n(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Le8/p;->a:Landroid/content/Context;

    if-eqz p2, :cond_1

    invoke-static {p2}, Le8/i;->u(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string p2, "Attempting to set custom attribute with null key, ignoring."

    invoke-virtual {p1, p2}, Lb8/g;->d(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public Z(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Le8/p;->d:Lf8/m;

    invoke-virtual {v0, p1}, Lf8/m;->p(Ljava/lang/String;)V

    return-void
.end method

.method public a0(Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "TaskMainThread"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Ll8/d;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le8/p;->m:Le8/j0;

    invoke-virtual {v0}, Le8/j0;->n()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string v0, "No crash reports are available to be sent."

    invoke-virtual {p1, v0}, Lb8/g;->i(Ljava/lang/String;)V

    iget-object p1, p0, Le8/p;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Crash reports are available to be sent."

    invoke-virtual {v0, v1}, Lb8/g;->i(Ljava/lang/String;)V

    invoke-virtual {p0}, Le8/p;->b0()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Le8/p$d;

    invoke-direct {v1, p0, p1}, Le8/p$d;-><init>(Le8/p;Lcom/google/android/gms/tasks/Task;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final b0()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le8/p;->b:Le8/x;

    invoke-virtual {v0}, Le8/x;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Automatic data collection is enabled. Allowing upload."

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    iget-object v0, p0, Le8/p;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Automatic data collection is disabled."

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Notifying that unsent reports are available."

    invoke-virtual {v0, v1}, Lb8/g;->i(Ljava/lang/String;)V

    iget-object v0, p0, Le8/p;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    iget-object v0, p0, Le8/p;->b:Le8/x;

    invoke-virtual {v0}, Le8/x;->j()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Le8/p$c;

    invoke-direct {v1, p0}, Le8/p$c;-><init>(Le8/p;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v1

    const-string v2, "Waiting for send/deleteUnsentReports to be called."

    invoke-virtual {v1, v2}, Lb8/g;->b(Ljava/lang/String;)V

    iget-object v1, p0, Le8/p;->q:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    invoke-static {v0, v1}, Le8/q0;->n(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final c0(Ljava/lang/String;)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Le8/p;->a:Landroid/content/Context;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Landroid/app/ActivityManager;->getHistoricalProcessExitReasons(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lf8/e;

    iget-object v2, p0, Le8/p;->g:Lj8/f;

    invoke-direct {v1, v2, p1}, Lf8/e;-><init>(Lj8/f;Ljava/lang/String;)V

    iget-object v2, p0, Le8/p;->g:Lj8/f;

    iget-object v3, p0, Le8/p;->e:Le8/n;

    invoke-static {p1, v2, v3}, Lf8/m;->j(Ljava/lang/String;Lj8/f;Le8/n;)Lf8/m;

    move-result-object v2

    iget-object v3, p0, Le8/p;->m:Le8/j0;

    invoke-virtual {v3, p1, v0, v1, v2}, Le8/j0;->v(Ljava/lang/String;Ljava/util/List;Lf8/e;Lf8/m;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No ApplicationExitInfo available. Session: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb8/g;->i(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ANR feature enabled, but device is API "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb8/g;->i(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public d0(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v6, p0, Le8/p;->e:Le8/n;

    new-instance v7, Le8/p$f;

    move-object v0, v7

    move-object v1, p0

    move-object v4, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Le8/p$f;-><init>(Le8/p;JLjava/lang/Throwable;Ljava/lang/Thread;)V

    invoke-virtual {v6, v7}, Le8/n;->g(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public e0(JLjava/lang/String;)V
    .locals 2

    iget-object v0, p0, Le8/p;->e:Le8/n;

    new-instance v1, Le8/p$e;

    invoke-direct {v1, p0, p1, p2, p3}, Le8/p$e;-><init>(Le8/p;JLjava/lang/String;)V

    invoke-virtual {v0, v1}, Le8/n;->h(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public o()Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le8/p;->s:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "checkForUnsentReports should only be called once per execution."

    invoke-virtual {v0, v1}, Lb8/g;->k(Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Le8/p;->p:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public t()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le8/p;->q:Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    iget-object v0, p0, Le8/p;->r:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public u()Z
    .locals 3

    iget-object v0, p0, Le8/p;->c:Le8/s;

    invoke-virtual {v0}, Le8/s;->c()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Le8/p;->D()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v2, p0, Le8/p;->j:Lb8/a;

    invoke-interface {v2, v0}, Lb8/a;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v2, "Found previous crash marker."

    invoke-virtual {v0, v2}, Lb8/g;->i(Ljava/lang/String;)V

    iget-object v0, p0, Le8/p;->c:Le8/s;

    invoke-virtual {v0}, Le8/s;->d()Z

    return v1
.end method

.method public v(Ll8/i;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Le8/p;->w(ZLl8/i;)V

    return-void
.end method

.method public final w(ZLl8/i;)V
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Le8/p;->m:Le8/j0;

    invoke-virtual {v1}, Le8/j0;->p()Ljava/util/SortedSet;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-gt v1, p1, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p1

    const-string p2, "No open sessions to be closed."

    invoke-virtual {p1, p2}, Lb8/g;->i(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2}, Ll8/i;->b()Ll8/d;

    move-result-object p2

    iget-object p2, p2, Ll8/d;->b:Ll8/d$a;

    iget-boolean p2, p2, Ll8/d$a;->b:Z

    if-eqz p2, :cond_1

    invoke-virtual {p0, v1}, Le8/p;->c0(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p2

    const-string v2, "ANR feature disabled."

    invoke-virtual {p2, v2}, Lb8/g;->i(Ljava/lang/String;)V

    :goto_0
    iget-object p2, p0, Le8/p;->j:Lb8/a;

    invoke-interface {p2, v1}, Lb8/a;->c(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0, v1}, Le8/p;->A(Ljava/lang/String;)V

    :cond_2
    const/4 p2, 0x0

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Ljava/lang/String;

    goto :goto_1

    :cond_3
    iget-object p1, p0, Le8/p;->l:Le8/m;

    invoke-virtual {p1, p2}, Le8/m;->e(Ljava/lang/String;)V

    :goto_1
    iget-object p1, p0, Le8/p;->m:Le8/j0;

    invoke-static {}, Le8/p;->E()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1, p2}, Le8/j0;->k(JLjava/lang/String;)V

    return-void
.end method

.method public final x(Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 8

    invoke-static {}, Le8/p;->E()J

    move-result-wide v6

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Opening a new session with ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {}, Le8/r;->l()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "Crashlytics Android SDK/%s"

    invoke-static {v0, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Le8/p;->f:Le8/b0;

    iget-object v1, p0, Le8/p;->h:Le8/a;

    invoke-static {v0, v1}, Le8/p;->p(Le8/b0;Le8/a;)Lg8/g0$a;

    move-result-object v0

    invoke-static {}, Le8/p;->r()Lg8/g0$c;

    move-result-object v1

    iget-object v3, p0, Le8/p;->a:Landroid/content/Context;

    invoke-static {v3}, Le8/p;->q(Landroid/content/Context;)Lg8/g0$b;

    move-result-object v3

    iget-object v4, p0, Le8/p;->j:Lb8/a;

    invoke-static {v0, v1, v3}, Lg8/g0;->b(Lg8/g0$a;Lg8/g0$c;Lg8/g0$b;)Lg8/g0;

    move-result-object v5

    move-object v0, v4

    move-object v1, p1

    move-wide v3, v6

    invoke-interface/range {v0 .. v5}, Lb8/a;->d(Ljava/lang/String;Ljava/lang/String;JLg8/g0;)V

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    iget-object p2, p0, Le8/p;->d:Lf8/m;

    invoke-virtual {p2, p1}, Lf8/m;->o(Ljava/lang/String;)V

    :cond_0
    iget-object p2, p0, Le8/p;->i:Lf8/e;

    invoke-virtual {p2, p1}, Lf8/e;->e(Ljava/lang/String;)V

    iget-object p2, p0, Le8/p;->l:Le8/m;

    invoke-virtual {p2, p1}, Le8/m;->e(Ljava/lang/String;)V

    iget-object p2, p0, Le8/p;->m:Le8/j0;

    invoke-virtual {p2, p1, v6, v7}, Le8/j0;->q(Ljava/lang/String;J)V

    return-void
.end method

.method public final y(J)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Le8/p;->g:Lj8/f;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ".ae"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lj8/f;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Create new file failed."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p2

    const-string v0, "Could not create app exception marker file."

    invoke-virtual {p2, v0, p1}, Lb8/g;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public z(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Ll8/i;)V
    .locals 2

    iput-object p3, p0, Le8/p;->o:Ll8/i;

    invoke-virtual {p0, p1}, Le8/p;->T(Ljava/lang/String;)V

    new-instance p1, Le8/p$a;

    invoke-direct {p1, p0}, Le8/p$a;-><init>(Le8/p;)V

    new-instance v0, Le8/v;

    iget-object v1, p0, Le8/p;->j:Lb8/a;

    invoke-direct {v0, p1, p3, p2, v1}, Le8/v;-><init>(Le8/v$a;Ll8/i;Ljava/lang/Thread$UncaughtExceptionHandler;Lb8/a;)V

    iput-object v0, p0, Le8/p;->n:Le8/v;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-void
.end method
