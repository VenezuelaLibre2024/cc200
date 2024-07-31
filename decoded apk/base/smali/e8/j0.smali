.class public Le8/j0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Le8/t;

.field public final b:Lj8/e;

.field public final c:Lk8/b;

.field public final d:Lf8/e;

.field public final e:Lf8/m;

.field public final f:Le8/b0;


# direct methods
.method public constructor <init>(Le8/t;Lj8/e;Lk8/b;Lf8/e;Lf8/m;Le8/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/j0;->a:Le8/t;

    iput-object p2, p0, Le8/j0;->b:Lj8/e;

    iput-object p3, p0, Le8/j0;->c:Lk8/b;

    iput-object p4, p0, Le8/j0;->d:Lf8/e;

    iput-object p5, p0, Le8/j0;->e:Lf8/m;

    iput-object p6, p0, Le8/j0;->f:Le8/b0;

    return-void
.end method

.method public static synthetic a(Le8/j0;Lcom/google/android/gms/tasks/Task;)Z
    .locals 0

    invoke-virtual {p0, p1}, Le8/j0;->r(Lcom/google/android/gms/tasks/Task;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lg8/f0$c;Lg8/f0$c;)I
    .locals 0

    invoke-static {p0, p1}, Le8/j0;->o(Lg8/f0$c;Lg8/f0$c;)I

    move-result p0

    return p0
.end method

.method public static f(Landroid/app/ApplicationExitInfo;)Lg8/f0$a;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getTraceInputStream()Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Le8/j0;->g(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not get input trace in application exit info: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " Error: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lb8/g;->k(Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-static {}, Lg8/f0$a;->a()Lg8/f0$a$b;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getImportance()I

    move-result v2

    invoke-virtual {v1, v2}, Lg8/f0$a$b;->c(I)Lg8/f0$a$b;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getProcessName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg8/f0$a$b;->e(Ljava/lang/String;)Lg8/f0$a$b;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getReason()I

    move-result v2

    invoke-virtual {v1, v2}, Lg8/f0$a$b;->g(I)Lg8/f0$a$b;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg8/f0$a$b;->i(J)Lg8/f0$a$b;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getPid()I

    move-result v2

    invoke-virtual {v1, v2}, Lg8/f0$a$b;->d(I)Lg8/f0$a$b;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getPss()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg8/f0$a$b;->f(J)Lg8/f0$a$b;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/ApplicationExitInfo;->getRss()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lg8/f0$a$b;->h(J)Lg8/f0$a$b;

    move-result-object p0

    invoke-virtual {p0, v0}, Lg8/f0$a$b;->j(Ljava/lang/String;)Lg8/f0$a$b;

    move-result-object p0

    invoke-virtual {p0}, Lg8/f0$a$b;->a()Lg8/f0$a;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x2000

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
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h(Landroid/content/Context;Le8/b0;Lj8/f;Le8/a;Lf8/e;Lf8/m;Lm8/d;Ll8/i;Le8/g0;Le8/m;)Le8/j0;
    .locals 9

    move-object/from16 v6, p7

    new-instance v7, Le8/t;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p6

    move-object/from16 v5, p7

    invoke-direct/range {v0 .. v5}, Le8/t;-><init>(Landroid/content/Context;Le8/b0;Le8/a;Lm8/d;Ll8/i;)V

    new-instance v2, Lj8/e;

    move-object v0, p2

    move-object/from16 v1, p9

    invoke-direct {v2, p2, v6, v1}, Lj8/e;-><init>(Lj8/f;Ll8/i;Le8/m;)V

    move-object v0, p0

    move-object/from16 v1, p8

    invoke-static {p0, v6, v1}, Lk8/b;->b(Landroid/content/Context;Ll8/i;Le8/g0;)Lk8/b;

    move-result-object v3

    new-instance v8, Le8/j0;

    move-object v0, v8

    move-object v1, v7

    move-object v4, p4

    move-object v5, p5

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Le8/j0;-><init>(Le8/t;Lj8/e;Lk8/b;Lf8/e;Lf8/m;Le8/b0;)V

    return-object v8
.end method

.method public static m(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lg8/f0$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-static {}, Lg8/f0$c;->a()Lg8/f0$c$a;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lg8/f0$c$a;->b(Ljava/lang/String;)Lg8/f0$c$a;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Lg8/f0$c$a;->c(Ljava/lang/String;)Lg8/f0$c$a;

    move-result-object v1

    invoke-virtual {v1}, Lg8/f0$c$a;->a()Lg8/f0$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p0, Le8/i0;->h:Le8/i0;

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lg8/f0$c;Lg8/f0$c;)I
    .locals 0

    invoke-virtual {p0}, Lg8/f0$c;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lg8/f0$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final c(Lg8/f0$e$d;Lf8/e;Lf8/m;)Lg8/f0$e$d;
    .locals 2

    invoke-virtual {p1}, Lg8/f0$e$d;->h()Lg8/f0$e$d$b;

    move-result-object v0

    invoke-virtual {p2}, Lf8/e;->c()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {}, Lg8/f0$e$d$d;->a()Lg8/f0$e$d$d$a;

    move-result-object v1

    invoke-virtual {v1, p2}, Lg8/f0$e$d$d$a;->b(Ljava/lang/String;)Lg8/f0$e$d$d$a;

    move-result-object p2

    invoke-virtual {p2}, Lg8/f0$e$d$d$a;->a()Lg8/f0$e$d$d;

    move-result-object p2

    invoke-virtual {v0, p2}, Lg8/f0$e$d$b;->d(Lg8/f0$e$d$d;)Lg8/f0$e$d$b;

    goto :goto_0

    :cond_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p2

    const-string v1, "No log data to include with this event."

    invoke-virtual {p2, v1}, Lb8/g;->i(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p3}, Lf8/m;->e()Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Le8/j0;->m(Ljava/util/Map;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3}, Lf8/m;->f()Ljava/util/Map;

    move-result-object p3

    invoke-static {p3}, Le8/j0;->m(Ljava/util/Map;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    invoke-virtual {p1}, Lg8/f0$e$d;->b()Lg8/f0$e$d$a;

    move-result-object p1

    invoke-virtual {p1}, Lg8/f0$e$d$a;->i()Lg8/f0$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lg8/f0$e$d$a$a;->e(Ljava/util/List;)Lg8/f0$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lg8/f0$e$d$a$a;->g(Ljava/util/List;)Lg8/f0$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, Lg8/f0$e$d$a$a;->a()Lg8/f0$e$d$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg8/f0$e$d$b;->b(Lg8/f0$e$d$a;)Lg8/f0$e$d$b;

    :cond_2
    invoke-virtual {v0}, Lg8/f0$e$d$b;->a()Lg8/f0$e$d;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lg8/f0$e$d;)Lg8/f0$e$d;
    .locals 2

    iget-object v0, p0, Le8/j0;->d:Lf8/e;

    iget-object v1, p0, Le8/j0;->e:Lf8/m;

    invoke-virtual {p0, p1, v0, v1}, Le8/j0;->c(Lg8/f0$e$d;Lf8/e;Lf8/m;)Lg8/f0$e$d;

    move-result-object p1

    iget-object v0, p0, Le8/j0;->e:Lf8/m;

    invoke-virtual {p0, p1, v0}, Le8/j0;->e(Lg8/f0$e$d;Lf8/m;)Lg8/f0$e$d;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lg8/f0$e$d;Lf8/m;)Lg8/f0$e$d;
    .locals 1

    invoke-virtual {p2}, Lf8/m;->g()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lg8/f0$e$d;->h()Lg8/f0$e$d$b;

    move-result-object p1

    invoke-static {}, Lg8/f0$e$d$f;->a()Lg8/f0$e$d$f$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lg8/f0$e$d$f$a;->b(Ljava/util/List;)Lg8/f0$e$d$f$a;

    move-result-object p2

    invoke-virtual {p2}, Lg8/f0$e$d$f$a;->a()Lg8/f0$e$d$f;

    move-result-object p2

    invoke-virtual {p1, p2}, Lg8/f0$e$d$b;->e(Lg8/f0$e$d$f;)Lg8/f0$e$d$b;

    invoke-virtual {p1}, Lg8/f0$e$d$b;->a()Lg8/f0$e$d;

    move-result-object p1

    return-object p1
.end method

.method public final i(Le8/u;)Le8/u;
    .locals 2

    invoke-virtual {p1}, Le8/u;->b()Lg8/f0;

    move-result-object v0

    invoke-virtual {v0}, Lg8/f0;->g()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Le8/j0;->f:Le8/b0;

    invoke-virtual {v0}, Le8/b0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Le8/u;->b()Lg8/f0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lg8/f0;->r(Ljava/lang/String;)Lg8/f0;

    move-result-object v0

    invoke-virtual {p1}, Le8/u;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Le8/u;->c()Ljava/io/File;

    move-result-object p1

    invoke-static {v0, v1, p1}, Le8/u;->a(Lg8/f0;Ljava/lang/String;Ljava/io/File;)Le8/u;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public j(Ljava/lang/String;Ljava/util/List;Lg8/f0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Le8/e0;",
            ">;",
            "Lg8/f0$a;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "SessionReportingCoordinator#finalizeSessionWithNativeEvent"

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le8/e0;

    invoke-interface {v1}, Le8/e0;->i()Lg8/f0$d$b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Le8/j0;->b:Lj8/e;

    invoke-static {}, Lg8/f0$d;->a()Lg8/f0$d$a;

    move-result-object v1

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lg8/f0$d$a;->b(Ljava/util/List;)Lg8/f0$d$a;

    move-result-object v0

    invoke-virtual {v0}, Lg8/f0$d$a;->a()Lg8/f0$d;

    move-result-object v0

    invoke-virtual {p2, p1, v0, p3}, Lj8/e;->l(Ljava/lang/String;Lg8/f0$d;Lg8/f0$a;)V

    return-void
.end method

.method public k(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Le8/j0;->b:Lj8/e;

    invoke-virtual {v0, p3, p1, p2}, Lj8/e;->k(Ljava/lang/String;J)V

    return-void
.end method

.method public final l(Ljava/lang/String;Ljava/util/List;)Landroid/app/ApplicationExitInfo;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/app/ApplicationExitInfo;",
            ">;)",
            "Landroid/app/ApplicationExitInfo;"
        }
    .end annotation

    iget-object v0, p0, Le8/j0;->b:Lj8/e;

    invoke-virtual {v0, p1}, Lj8/e;->q(Ljava/lang/String;)J

    move-result-wide v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/ApplicationExitInfo;

    invoke-virtual {p2}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v3

    cmp-long v3, v3, v0

    if-gez v3, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p2}, Landroid/app/ApplicationExitInfo;->getReason()I

    move-result v2

    const/4 v3, 0x6

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    return-object p2

    :cond_2
    return-object v2
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Le8/j0;->b:Lj8/e;

    invoke-virtual {v0}, Lj8/e;->r()Z

    move-result v0

    return v0
.end method

.method public p()Ljava/util/SortedSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/SortedSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le8/j0;->b:Lj8/e;

    invoke-virtual {v0}, Lj8/e;->p()Ljava/util/SortedSet;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;J)V
    .locals 1

    iget-object v0, p0, Le8/j0;->a:Le8/t;

    invoke-virtual {v0, p1, p2, p3}, Le8/t;->e(Ljava/lang/String;J)Lg8/f0;

    move-result-object p1

    iget-object p2, p0, Le8/j0;->b:Lj8/e;

    invoke-virtual {p2, p1}, Lj8/e;->z(Lg8/f0;)V

    return-void
.end method

.method public final r(Lcom/google/android/gms/tasks/Task;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Le8/u;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Le8/u;

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crashlytics report successfully enqueued to DataTransport: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le8/u;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Le8/u;->c()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Deleted report file: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb8/g;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crashlytics could not delete report file: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb8/g;->k(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    const-string v1, "Crashlytics report could not be enqueued to DataTransport"

    invoke-virtual {v0, v1, p1}, Lb8/g;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final s(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V
    .locals 11

    move-object v0, p0

    const-string v1, "crash"

    move-object v5, p4

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Le8/j0;->a:Le8/t;

    const/4 v8, 0x4

    const/16 v9, 0x8

    move-object v3, p1

    move-object v4, p2

    move-wide/from16 v6, p5

    move/from16 v10, p7

    invoke-virtual/range {v2 .. v10}, Le8/t;->d(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)Lg8/f0$e$d;

    move-result-object v2

    iget-object v3, v0, Le8/j0;->b:Lj8/e;

    invoke-virtual {p0, v2}, Le8/j0;->d(Lg8/f0$e$d;)Lg8/f0$e$d;

    move-result-object v2

    move-object v4, p3

    invoke-virtual {v3, v2, p3, v1}, Lj8/e;->y(Lg8/f0$e$d;Ljava/lang/String;Z)V

    return-void
.end method

.method public t(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V
    .locals 10

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Persisting fatal event for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/g;->i(Ljava/lang/String;)V

    const-string v6, "crash"

    const/4 v9, 0x1

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v7, p4

    invoke-virtual/range {v2 .. v9}, Le8/j0;->s(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V

    return-void
.end method

.method public u(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V
    .locals 10

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Persisting non-fatal event for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/g;->i(Ljava/lang/String;)V

    const-string v6, "error"

    const/4 v9, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v7, p4

    invoke-virtual/range {v2 .. v9}, Le8/j0;->s(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V

    return-void
.end method

.method public v(Ljava/lang/String;Ljava/util/List;Lf8/e;Lf8/m;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/app/ApplicationExitInfo;",
            ">;",
            "Lf8/e;",
            "Lf8/m;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Le8/j0;->l(Ljava/lang/String;Ljava/util/List;)Landroid/app/ApplicationExitInfo;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "No relevant ApplicationExitInfo occurred during session: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lb8/g;->i(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Le8/j0;->a:Le8/t;

    invoke-static {p2}, Le8/j0;->f(Landroid/app/ApplicationExitInfo;)Lg8/f0$a;

    move-result-object p2

    invoke-virtual {v0, p2}, Le8/t;->c(Lg8/f0$a;)Lg8/f0$e$d;

    move-result-object p2

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Persisting anr for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb8/g;->b(Ljava/lang/String;)V

    invoke-virtual {p0, p2, p3, p4}, Le8/j0;->c(Lg8/f0$e$d;Lf8/e;Lf8/m;)Lg8/f0$e$d;

    move-result-object p2

    invoke-virtual {p0, p2, p4}, Le8/j0;->e(Lg8/f0$e$d;Lf8/m;)Lg8/f0$e$d;

    move-result-object p2

    iget-object p3, p0, Le8/j0;->b:Lj8/e;

    const/4 p4, 0x1

    invoke-virtual {p3, p2, p1, p4}, Lj8/e;->y(Lg8/f0$e$d;Ljava/lang/String;Z)V

    return-void
.end method

.method public w()V
    .locals 1

    iget-object v0, p0, Le8/j0;->b:Lj8/e;

    invoke-virtual {v0}, Lj8/e;->i()V

    return-void
.end method

.method public x(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Le8/j0;->y(Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public y(Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le8/j0;->b:Lj8/e;

    invoke-virtual {v0}, Lj8/e;->w()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Le8/u;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Le8/u;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    iget-object v3, p0, Le8/j0;->c:Lk8/b;

    invoke-virtual {p0, v2}, Le8/j0;->i(Le8/u;)Le8/u;

    move-result-object v2

    if-eqz p2, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v3, v2, v4}, Lk8/b;->c(Le8/u;Z)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v3, Le8/h0;

    invoke-direct {v3, p0}, Le8/h0;-><init>(Le8/j0;)V

    invoke-virtual {v2, p1, v3}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->whenAll(Ljava/util/Collection;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
