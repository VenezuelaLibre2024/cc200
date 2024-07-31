.class public Ln7/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln7/g$b;,
        Ln7/g$c;,
        Ln7/g$a;
    }
.end annotation


# static fields
.field public static final k:Ljava/lang/Object;

.field public static final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ln7/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Ln7/p;

.field public final d:Ly7/n;

.field public final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final g:Ly7/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly7/w<",
            "Le9/a;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ly8/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/b<",
            "Lv8/f;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln7/g$a;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln7/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ln7/g;->k:Ljava/lang/Object;

    new-instance v0, Lu/a;

    invoke-direct {v0}, Lu/a;-><init>()V

    sput-object v0, Ln7/g;->l:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ln7/p;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ln7/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ln7/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Ln7/g;->i:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Ln7/g;->j:Ljava/util/List;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Ln7/g;->a:Landroid/content/Context;

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ln7/g;->b:Ljava/lang/String;

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln7/p;

    iput-object p2, p0, Ln7/g;->c:Ln7/p;

    invoke-static {}, Lcom/google/firebase/provider/FirebaseInitProvider;->b()Ln7/r;

    move-result-object p2

    const-string v0, "Firebase"

    invoke-static {v0}, Lt9/c;->b(Ljava/lang/String;)V

    const-string v0, "ComponentDiscovery"

    invoke-static {v0}, Lt9/c;->b(Ljava/lang/String;)V

    const-class v0, Lcom/google/firebase/components/ComponentDiscoveryService;

    invoke-static {p1, v0}, Ly7/f;->c(Landroid/content/Context;Ljava/lang/Class;)Ly7/f;

    move-result-object v0

    invoke-virtual {v0}, Ly7/f;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lt9/c;->a()V

    const-string v2, "Runtime"

    invoke-static {v2}, Lt9/c;->b(Ljava/lang/String;)V

    sget-object v2, Lz7/c0;->h:Lz7/c0;

    invoke-static {v2}, Ly7/n;->l(Ljava/util/concurrent/Executor;)Ly7/n$b;

    move-result-object v2

    invoke-virtual {v2, v0}, Ly7/n$b;->d(Ljava/util/Collection;)Ly7/n$b;

    move-result-object v0

    new-instance v2, Lcom/google/firebase/FirebaseCommonRegistrar;

    invoke-direct {v2}, Lcom/google/firebase/FirebaseCommonRegistrar;-><init>()V

    invoke-virtual {v0, v2}, Ly7/n$b;->c(Lcom/google/firebase/components/ComponentRegistrar;)Ly7/n$b;

    move-result-object v0

    new-instance v2, Lcom/google/firebase/concurrent/ExecutorsRegistrar;

    invoke-direct {v2}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;-><init>()V

    invoke-virtual {v0, v2}, Ly7/n$b;->c(Lcom/google/firebase/components/ComponentRegistrar;)Ly7/n$b;

    move-result-object v0

    const-class v2, Landroid/content/Context;

    new-array v3, v1, [Ljava/lang/Class;

    invoke-static {p1, v2, v3}, Ly7/c;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Ly7/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Ly7/n$b;->b(Ly7/c;)Ly7/n$b;

    move-result-object v0

    const-class v2, Ln7/g;

    new-array v3, v1, [Ljava/lang/Class;

    invoke-static {p0, v2, v3}, Ly7/c;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Ly7/c;

    move-result-object v2

    invoke-virtual {v0, v2}, Ly7/n$b;->b(Ly7/c;)Ly7/n$b;

    move-result-object v0

    const-class v2, Ln7/p;

    new-array v3, v1, [Ljava/lang/Class;

    invoke-static {p3, v2, v3}, Ly7/c;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Ly7/c;

    move-result-object p3

    invoke-virtual {v0, p3}, Ly7/n$b;->b(Ly7/c;)Ly7/n$b;

    move-result-object p3

    new-instance v0, Lt9/b;

    invoke-direct {v0}, Lt9/b;-><init>()V

    invoke-virtual {p3, v0}, Ly7/n$b;->g(Ly7/i;)Ly7/n$b;

    move-result-object p3

    invoke-static {p1}, Lg0/q;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/firebase/provider/FirebaseInitProvider;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-class v0, Ln7/r;

    new-array v1, v1, [Ljava/lang/Class;

    invoke-static {p2, v0, v1}, Ly7/c;->s(Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)Ly7/c;

    move-result-object p2

    invoke-virtual {p3, p2}, Ly7/n$b;->b(Ly7/c;)Ly7/n$b;

    :cond_0
    invoke-virtual {p3}, Ly7/n$b;->e()Ly7/n;

    move-result-object p2

    iput-object p2, p0, Ln7/g;->d:Ly7/n;

    invoke-static {}, Lt9/c;->a()V

    new-instance p3, Ly7/w;

    new-instance v0, Ln7/f;

    invoke-direct {v0, p0, p1}, Ln7/f;-><init>(Ln7/g;Landroid/content/Context;)V

    invoke-direct {p3, v0}, Ly7/w;-><init>(Ly8/b;)V

    iput-object p3, p0, Ln7/g;->g:Ly7/w;

    const-class p1, Lv8/f;

    invoke-interface {p2, p1}, Ly7/d;->c(Ljava/lang/Class;)Ly8/b;

    move-result-object p1

    iput-object p1, p0, Ln7/g;->h:Ly8/b;

    new-instance p1, Ln7/e;

    invoke-direct {p1, p0}, Ln7/e;-><init>(Ln7/g;)V

    invoke-virtual {p0, p1}, Ln7/g;->g(Ln7/g$a;)V

    invoke-static {}, Lt9/c;->a()V

    return-void
.end method

.method private synthetic A(Z)V
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, Ln7/g;->h:Ly8/b;

    invoke-interface {p1}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv8/f;

    invoke-virtual {p1}, Lv8/f;->l()Lcom/google/android/gms/tasks/Task;

    :cond_0
    return-void
.end method

.method public static B(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ln7/g;Z)V
    .locals 0

    invoke-direct {p0, p1}, Ln7/g;->A(Z)V

    return-void
.end method

.method public static synthetic b(Ln7/g;Landroid/content/Context;)Le9/a;
    .locals 0

    invoke-direct {p0, p1}, Ln7/g;->z(Landroid/content/Context;)Le9/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Ln7/g;->k:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic d(Ln7/g;)V
    .locals 0

    invoke-virtual {p0}, Ln7/g;->t()V

    return-void
.end method

.method public static synthetic e(Ln7/g;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Ln7/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static synthetic f(Ln7/g;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Ln7/g;->C(Z)V

    return-void
.end method

.method public static l()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Ln7/g;->k:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Ln7/g;->l:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln7/g;

    invoke-virtual {v3}, Ln7/g;->q()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static n(Landroid/content/Context;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Ln7/g;",
            ">;"
        }
    .end annotation

    sget-object p0, Ln7/g;->k:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    sget-object v1, Ln7/g;->l:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public static o()Ln7/g;
    .locals 4

    sget-object v0, Ln7/g;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ln7/g;->l:Ljava/util/Map;

    const-string v2, "[DEFAULT]"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln7/g;

    if-eqz v1, :cond_0

    iget-object v2, v1, Ln7/g;->h:Ly8/b;

    invoke-interface {v2}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lv8/f;

    invoke-virtual {v2}, Lv8/f;->l()Lcom/google/android/gms/tasks/Task;

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Default FirebaseApp is not initialized in this process "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lo6/n;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ". Make sure to call FirebaseApp.initializeApp(Context) first."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static p(Ljava/lang/String;)Ln7/g;
    .locals 5

    sget-object v0, Ln7/g;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ln7/g;->l:Ljava/util/Map;

    invoke-static {p0}, Ln7/g;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln7/g;

    if-eqz v1, :cond_0

    iget-object p0, v1, Ln7/g;->h:Ly8/b;

    invoke-interface {p0}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv8/f;

    invoke-virtual {p0}, Lv8/f;->l()Lcom/google/android/gms/tasks/Task;

    monitor-exit v0

    return-object v1

    :cond_0
    invoke-static {}, Ln7/g;->l()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v1, ""

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Available app names: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-static {v3, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    const-string v2, "FirebaseApp with name %s doesn\'t exist. %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    const/4 p0, 0x1

    aput-object v1, v3, p0

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static u(Landroid/content/Context;)Ln7/g;
    .locals 3

    sget-object v0, Ln7/g;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ln7/g;->l:Ljava/util/Map;

    const-string v2, "[DEFAULT]"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ln7/g;->o()Ln7/g;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :cond_0
    invoke-static {p0}, Ln7/p;->a(Landroid/content/Context;)Ln7/p;

    move-result-object v1

    if-nez v1, :cond_1

    const-string p0, "FirebaseApp"

    const-string v1, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project."

    invoke-static {p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    monitor-exit v0

    return-object p0

    :cond_1
    invoke-static {p0, v1}, Ln7/g;->v(Landroid/content/Context;Ln7/p;)Ln7/g;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static v(Landroid/content/Context;Ln7/p;)Ln7/g;
    .locals 1

    const-string v0, "[DEFAULT]"

    invoke-static {p0, p1, v0}, Ln7/g;->w(Landroid/content/Context;Ln7/p;Ljava/lang/String;)Ln7/g;

    move-result-object p0

    return-object p0
.end method

.method public static w(Landroid/content/Context;Ln7/p;Ljava/lang/String;)Ln7/g;
    .locals 5

    invoke-static {p0}, Ln7/g$b;->b(Landroid/content/Context;)V

    invoke-static {p2}, Ln7/g;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    :goto_0
    sget-object v0, Ln7/g;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ln7/g;->l:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "FirebaseApp name "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " already exists!"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lh6/s;->p(ZLjava/lang/Object;)V

    const-string v2, "Application context cannot be null."

    invoke-static {p0, v2}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ln7/g;

    invoke-direct {v2, p0, p2, p1}, Ln7/g;-><init>(Landroid/content/Context;Ljava/lang/String;Ln7/p;)V

    invoke-interface {v1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Ln7/g;->t()V

    return-object v2

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private synthetic z(Landroid/content/Context;)Le9/a;
    .locals 4

    new-instance v0, Le9/a;

    invoke-virtual {p0}, Ln7/g;->s()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ln7/g;->d:Ly7/n;

    const-class v3, Lu8/c;

    invoke-interface {v2, v3}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu8/c;

    invoke-direct {v0, p1, v1, v2}, Le9/a;-><init>(Landroid/content/Context;Ljava/lang/String;Lu8/c;)V

    return-object v0
.end method


# virtual methods
.method public final C(Z)V
    .locals 2

    const-string v0, "FirebaseApp"

    const-string v1, "Notifying background state change listeners."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ln7/g;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln7/g$a;

    invoke-interface {v1, p1}, Ln7/g$a;->a(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final D()V
    .locals 4

    iget-object v0, p0, Ln7/g;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln7/h;

    iget-object v2, p0, Ln7/g;->b:Ljava/lang/String;

    iget-object v3, p0, Ln7/g;->c:Ln7/p;

    invoke-interface {v1, v2, v3}, Ln7/h;->a(Ljava/lang/String;Ln7/p;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public E(Z)V
    .locals 2

    invoke-virtual {p0}, Ln7/g;->i()V

    iget-object v0, p0, Ln7/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lg6/c;->b()Lg6/c;

    move-result-object v0

    invoke-virtual {v0}, Lg6/c;->d()Z

    move-result v0

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    :goto_0
    invoke-virtual {p0, p1}, Ln7/g;->C(Z)V

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public F(Ljava/lang/Boolean;)V
    .locals 1

    invoke-virtual {p0}, Ln7/g;->i()V

    iget-object v0, p0, Ln7/g;->g:Ly7/w;

    invoke-virtual {v0}, Ly7/w;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le9/a;

    invoke-virtual {v0, p1}, Le9/a;->e(Ljava/lang/Boolean;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ln7/g;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Ln7/g;->b:Ljava/lang/String;

    check-cast p1, Ln7/g;

    invoke-virtual {p1}, Ln7/g;->q()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g(Ln7/g$a;)V
    .locals 1

    invoke-virtual {p0}, Ln7/g;->i()V

    iget-object v0, p0, Ln7/g;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lg6/c;->b()Lg6/c;

    move-result-object v0

    invoke-virtual {v0}, Lg6/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ln7/g$a;->a(Z)V

    :cond_0
    iget-object v0, p0, Ln7/g;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h(Ln7/h;)V
    .locals 1

    invoke-virtual {p0}, Ln7/g;->i()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ln7/g;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ln7/g;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()V
    .locals 2

    iget-object v0, p0, Ln7/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "FirebaseApp was deleted"

    invoke-static {v0, v1}, Lh6/s;->p(ZLjava/lang/Object;)V

    return-void
.end method

.method public j()V
    .locals 3

    iget-object v0, p0, Ln7/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Ln7/g;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ln7/g;->l:Ljava/util/Map;

    iget-object v2, p0, Ln7/g;->b:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ln7/g;->D()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public k(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Ln7/g;->i()V

    iget-object v0, p0, Ln7/g;->d:Ly7/n;

    invoke-interface {v0, p1}, Ly7/d;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public m()Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Ln7/g;->i()V

    iget-object v0, p0, Ln7/g;->a:Landroid/content/Context;

    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Ln7/g;->i()V

    iget-object v0, p0, Ln7/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public r()Ln7/p;
    .locals 1

    invoke-virtual {p0}, Ln7/g;->i()V

    iget-object v0, p0, Ln7/g;->c:Ln7/p;

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ln7/g;->q()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Lo6/c;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ln7/g;->r()Ln7/p;

    move-result-object v1

    invoke-virtual {v1}, Ln7/p;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Lo6/c;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final t()V
    .locals 3

    iget-object v0, p0, Ln7/g;->a:Landroid/content/Context;

    invoke-static {v0}, Lg0/q;->a(Landroid/content/Context;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "FirebaseApp"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ln7/g;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ln7/g;->a:Landroid/content/Context;

    invoke-static {v0}, Ln7/g$c;->a(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Device unlocked: initializing all Firebase APIs for app "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ln7/g;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ln7/g;->d:Ly7/n;

    invoke-virtual {p0}, Ln7/g;->y()Z

    move-result v1

    invoke-virtual {v0, v1}, Ly7/n;->o(Z)V

    iget-object v0, p0, Ln7/g;->h:Ly8/b;

    invoke-interface {v0}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv8/f;

    invoke-virtual {v0}, Lv8/f;->l()Lcom/google/android/gms/tasks/Task;

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lh6/q;->d(Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Ln7/g;->b:Ljava/lang/String;

    const-string v2, "name"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Ln7/g;->c:Ln7/p;

    const-string v2, "options"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    invoke-virtual {v0}, Lh6/q$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x()Z
    .locals 1

    invoke-virtual {p0}, Ln7/g;->i()V

    iget-object v0, p0, Ln7/g;->g:Ly7/w;

    invoke-virtual {v0}, Ly7/w;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le9/a;

    invoke-virtual {v0}, Le9/a;->b()Z

    move-result v0

    return v0
.end method

.method public y()Z
    .locals 2

    invoke-virtual {p0}, Ln7/g;->q()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[DEFAULT]"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
