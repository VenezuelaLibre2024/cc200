.class public Lg2/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld2/e;


# static fields
.field public static final l:Ljava/lang/String;


# instance fields
.field public final h:Landroid/content/Context;

.field public final i:Landroid/app/job/JobScheduler;

.field public final j:Ld2/i;

.field public final k:Lg2/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "SystemJobScheduler"

    invoke-static {v0}, Lc2/j;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg2/b;->l:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ld2/i;)V
    .locals 2

    const-string v0, "jobscheduler"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    new-instance v1, Lg2/a;

    invoke-direct {v1, p1}, Lg2/a;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, v0, v1}, Lg2/b;-><init>(Landroid/content/Context;Ld2/i;Landroid/app/job/JobScheduler;Lg2/a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ld2/i;Landroid/app/job/JobScheduler;Lg2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/b;->h:Landroid/content/Context;

    iput-object p2, p0, Lg2/b;->j:Ld2/i;

    iput-object p3, p0, Lg2/b;->i:Landroid/app/job/JobScheduler;

    iput-object p4, p0, Lg2/b;->k:Lg2/a;

    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    const-string v0, "jobscheduler"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Lg2/b;->g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/job/JobInfo;

    invoke-virtual {v1}, Landroid/app/job/JobInfo;->getId()I

    move-result v1

    invoke-static {v0, v1}, Lg2/b;->c(Landroid/app/job/JobScheduler;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static c(Landroid/app/job/JobScheduler;I)V
    .locals 6

    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/job/JobScheduler;->cancel(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    sget-object v1, Lg2/b;->l:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const-string p1, "Exception while trying to cancel job (%d)"

    invoke-static {v2, p1, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v3, [Ljava/lang/Throwable;

    aput-object p0, v2, v5

    invoke-virtual {v0, v1, p1, v2}, Lc2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static e(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/job/JobScheduler;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1}, Lg2/b;->g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobInfo;

    invoke-static {v0}, Lg2/b;->h(Landroid/app/job/JobInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/app/job/JobInfo;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public static g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/job/JobScheduler;",
            ")",
            "Ljava/util/List<",
            "Landroid/app/job/JobInfo;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v1

    sget-object v2, Lg2/b;->l:Ljava/lang/String;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Throwable;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const-string p1, "getAllPendingJobs() is not reliable on this device."

    invoke-virtual {v1, v2, p1, v3}, Lc2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    move-object p1, v0

    :goto_0
    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Landroidx/work/impl/background/systemjob/SystemJobService;

    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/job/JobInfo;

    invoke-virtual {p1}, Landroid/app/job/JobInfo;->getService()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v0
.end method

.method public static h(Landroid/app/job/JobInfo;)Ljava/lang/String;
    .locals 2

    const-string v0, "EXTRA_WORK_SPEC_ID"

    invoke-virtual {p0}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    move-result-object p0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/os/PersistableBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Landroid/os/PersistableBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static i(Landroid/content/Context;Ld2/i;)Z
    .locals 7

    const-string v0, "jobscheduler"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    invoke-static {p0, v0}, Lg2/b;->g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {p1}, Ld2/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->y()Ll2/h;

    move-result-object v1

    invoke-interface {v1}, Ll2/h;->a()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(I)V

    if-eqz p0, :cond_2

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/job/JobInfo;

    invoke-static {v3}, Lg2/b;->h(Landroid/app/job/JobInfo;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-interface {v4, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Landroid/app/job/JobInfo;->getId()I

    move-result v3

    invoke-static {v0, v3}, Lg2/b;->c(Landroid/app/job/JobScheduler;I)V

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v4, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object p0

    sget-object v0, Lg2/b;->l:Ljava/lang/String;

    new-array v2, v2, [Ljava/lang/Throwable;

    const-string v3, "Reconciling jobs"

    invoke-virtual {p0, v0, v3, v2}, Lc2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    const/4 v2, 0x1

    :cond_4
    if-eqz v2, :cond_6

    invoke-virtual {p1}, Ld2/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object p0

    invoke-virtual {p0}, Lo1/e;->c()V

    :try_start_0
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->B()Ll2/q;

    move-result-object p1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-wide/16 v3, -0x1

    invoke-interface {p1, v1, v3, v4}, Ll2/q;->b(Ljava/lang/String;J)I

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Lo1/e;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lo1/e;->g()V

    goto :goto_3

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lo1/e;->g()V

    throw p1

    :cond_6
    :goto_3
    return v2
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lg2/b;->h:Landroid/content/Context;

    iget-object v1, p0, Lg2/b;->i:Landroid/app/job/JobScheduler;

    invoke-static {v0, v1, p1}, Lg2/b;->e(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lg2/b;->i:Landroid/app/job/JobScheduler;

    invoke-static {v2, v1}, Lg2/b;->c(Landroid/app/job/JobScheduler;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg2/b;->j:Ld2/i;

    invoke-virtual {v0}, Ld2/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->y()Ll2/h;

    move-result-object v0

    invoke-interface {v0, p1}, Ll2/h;->d(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public varargs f([Ll2/p;)V
    .locals 10

    iget-object v0, p0, Lg2/b;->j:Ld2/i;

    invoke-virtual {v0}, Ld2/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    new-instance v1, Lm2/c;

    invoke-direct {v1, v0}, Lm2/c;-><init>(Landroidx/work/impl/WorkDatabase;)V

    array-length v2, p1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_7

    aget-object v5, p1, v4

    invoke-virtual {v0}, Lo1/e;->c()V

    :try_start_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->B()Ll2/q;

    move-result-object v6

    iget-object v7, v5, Ll2/p;->a:Ljava/lang/String;

    invoke-interface {v6, v7}, Ll2/q;->n(Ljava/lang/String;)Ll2/p;

    move-result-object v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v7, "Skipping scheduling "

    if-nez v6, :cond_0

    :try_start_1
    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v6

    sget-object v8, Lg2/b;->l:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v5, Ll2/p;->a:Ljava/lang/String;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " because it\'s no longer in the DB"

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v7, v3, [Ljava/lang/Throwable;

    invoke-virtual {v6, v8, v5, v7}, Lc2/j;->h(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    iget-object v6, v6, Ll2/p;->b:Lc2/s$a;

    sget-object v8, Lc2/s$a;->h:Lc2/s$a;

    if-eq v6, v8, :cond_2

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v6

    sget-object v8, Lg2/b;->l:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v5, Ll2/p;->a:Ljava/lang/String;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " because it is no longer enqueued"

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v7, v3, [Ljava/lang/Throwable;

    invoke-virtual {v6, v8, v5, v7}, Lc2/j;->h(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lo1/e;->r()V

    goto/16 :goto_4

    :cond_2
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->y()Ll2/h;

    move-result-object v6

    iget-object v7, v5, Ll2/p;->a:Ljava/lang/String;

    invoke-interface {v6, v7}, Ll2/h;->c(Ljava/lang/String;)Ll2/g;

    move-result-object v6

    if-eqz v6, :cond_3

    iget v7, v6, Ll2/g;->b:I

    goto :goto_2

    :cond_3
    iget-object v7, p0, Lg2/b;->j:Ld2/i;

    invoke-virtual {v7}, Ld2/i;->i()Landroidx/work/a;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/work/a;->i()I

    move-result v7

    iget-object v8, p0, Lg2/b;->j:Ld2/i;

    invoke-virtual {v8}, Ld2/i;->i()Landroidx/work/a;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/work/a;->g()I

    move-result v8

    invoke-virtual {v1, v7, v8}, Lm2/c;->d(II)I

    move-result v7

    :goto_2
    if-nez v6, :cond_4

    new-instance v6, Ll2/g;

    iget-object v8, v5, Ll2/p;->a:Ljava/lang/String;

    invoke-direct {v6, v8, v7}, Ll2/g;-><init>(Ljava/lang/String;I)V

    iget-object v8, p0, Lg2/b;->j:Ld2/i;

    invoke-virtual {v8}, Ld2/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->y()Ll2/h;

    move-result-object v8

    invoke-interface {v8, v6}, Ll2/h;->b(Ll2/g;)V

    :cond_4
    invoke-virtual {p0, v5, v7}, Lg2/b;->j(Ll2/p;I)V

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x17

    if-ne v6, v8, :cond_1

    iget-object v6, p0, Lg2/b;->h:Landroid/content/Context;

    iget-object v8, p0, Lg2/b;->i:Landroid/app/job/JobScheduler;

    iget-object v9, v5, Ll2/p;->a:Ljava/lang/String;

    invoke-static {v6, v8, v9}, Lg2/b;->e(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    if-ltz v7, :cond_5

    invoke-interface {v6, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_5
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_3

    :cond_6
    iget-object v6, p0, Lg2/b;->j:Ld2/i;

    invoke-virtual {v6}, Ld2/i;->i()Landroidx/work/a;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/work/a;->i()I

    move-result v6

    iget-object v7, p0, Lg2/b;->j:Ld2/i;

    invoke-virtual {v7}, Ld2/i;->i()Landroidx/work/a;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/work/a;->g()I

    move-result v7

    invoke-virtual {v1, v6, v7}, Lm2/c;->d(II)I

    move-result v6

    :goto_3
    invoke-virtual {p0, v5, v6}, Lg2/b;->j(Ll2/p;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_1

    :goto_4
    invoke-virtual {v0}, Lo1/e;->g()V

    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lo1/e;->g()V

    throw p1

    :cond_7
    return-void
.end method

.method public j(Ll2/p;I)V
    .locals 8

    iget-object v0, p0, Lg2/b;->k:Lg2/a;

    invoke-virtual {v0, p1, p2}, Lg2/a;->a(Ll2/p;I)Landroid/app/job/JobInfo;

    move-result-object v0

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v1

    sget-object v2, Lg2/b;->l:Ljava/lang/String;

    const/4 v3, 0x2

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p1, Ll2/p;->a:Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v7, 0x1

    aput-object v5, v4, v7

    const-string v5, "Scheduling work ID %s Job ID %s"

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    new-array v5, v6, [Ljava/lang/Throwable;

    invoke-virtual {v1, v2, v4, v5}, Lc2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :try_start_0
    iget-object v1, p0, Lg2/b;->i:Landroid/app/job/JobScheduler;

    invoke-virtual {v1, v0}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    const-string v1, "Unable to schedule work ID %s"

    new-array v4, v7, [Ljava/lang/Object;

    iget-object v5, p1, Ll2/p;->a:Ljava/lang/String;

    aput-object v5, v4, v6

    invoke-static {v1, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v4, v6, [Ljava/lang/Throwable;

    invoke-virtual {v0, v2, v1, v4}, Lc2/j;->h(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-boolean v0, p1, Ll2/p;->q:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll2/p;->r:Lc2/n;

    sget-object v1, Lc2/n;->h:Lc2/n;

    if-ne v0, v1, :cond_0

    iput-boolean v6, p1, Ll2/p;->q:Z

    const-string v0, "Scheduling a non-expedited job (work ID %s)"

    new-array v1, v7, [Ljava/lang/Object;

    iget-object v4, p1, Ll2/p;->a:Ljava/lang/String;

    aput-object v4, v1, v6

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v1

    new-array v4, v6, [Ljava/lang/Throwable;

    invoke-virtual {v1, v2, v0, v4}, Lc2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1, p2}, Lg2/b;->j(Ll2/p;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    sget-object v1, Lg2/b;->l:Ljava/lang/String;

    new-array v2, v7, [Ljava/lang/Object;

    aput-object p1, v2, v6

    const-string p1, "Unable to schedule %s"

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-array v2, v7, [Ljava/lang/Throwable;

    aput-object p2, v2, v6

    invoke-virtual {v0, v1, p1, v2}, Lc2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lg2/b;->h:Landroid/content/Context;

    iget-object v0, p0, Lg2/b;->i:Landroid/app/job/JobScheduler;

    invoke-static {p2, v0}, Lg2/b;->g(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    goto :goto_1

    :cond_1
    move p2, v6

    :goto_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, v6

    iget-object p2, p0, Lg2/b;->j:Ld2/i;

    invoke-virtual {p2}, Ld2/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/work/impl/WorkDatabase;->B()Ll2/q;

    move-result-object p2

    invoke-interface {p2}, Ll2/q;->f()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, v7

    iget-object p2, p0, Lg2/b;->j:Ld2/i;

    invoke-virtual {p2}, Ld2/i;->i()Landroidx/work/a;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/work/a;->h()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v1, v3

    const-string p2, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d."

    invoke-static {v0, p2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lc2/j;->c()Lc2/j;

    move-result-object v0

    sget-object v1, Lg2/b;->l:Ljava/lang/String;

    new-array v2, v6, [Ljava/lang/Throwable;

    invoke-virtual {v0, v1, p2, v2}, Lc2/j;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
