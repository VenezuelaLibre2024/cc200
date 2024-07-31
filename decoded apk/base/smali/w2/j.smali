.class public Lw2/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw2/o;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lw6/m;

.field public final c:Lw6/g;

.field public final d:Lw2/v;

.field public final e:I

.field public final f:Lw2/r;

.field public g:Lv2/a;

.field public h:Lw2/w;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lw2/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw2/j;->a:Landroid/content/Context;

    invoke-static {p1}, Lw6/o;->a(Landroid/content/Context;)Lw6/g;

    move-result-object v0

    iput-object v0, p0, Lw2/j;->c:Lw6/g;

    iput-object p2, p0, Lw2/j;->f:Lw2/r;

    new-instance v0, Lw2/v;

    invoke-direct {v0, p1, p2}, Lw2/v;-><init>(Landroid/content/Context;Lw2/r;)V

    iput-object v0, p0, Lw2/j;->d:Lw2/v;

    invoke-virtual {p0}, Lw2/j;->s()I

    move-result p2

    iput p2, p0, Lw2/j;->e:I

    new-instance p2, Lw2/j$a;

    invoke-direct {p2, p0, p1}, Lw2/j$a;-><init>(Lw2/j;Landroid/content/Context;)V

    iput-object p2, p0, Lw2/j;->b:Lw6/m;

    return-void
.end method

.method public static synthetic g(Lw2/j;Lw6/q;)V
    .locals 0

    invoke-direct {p0, p1}, Lw2/j;->v(Lw6/q;)V

    return-void
.end method

.method public static synthetic h(Lw2/j;Landroid/app/Activity;Lv2/a;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lw2/j;->w(Landroid/app/Activity;Lv2/a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic i(Lv2/a;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lw2/j;->t(Lv2/a;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic j(Lw2/s;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lw2/j;->u(Lw2/s;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic k(Lw2/j;)Lw2/w;
    .locals 0

    iget-object p0, p0, Lw2/j;->h:Lw2/w;

    return-object p0
.end method

.method public static synthetic l(Lw2/j;)Lw6/m;
    .locals 0

    iget-object p0, p0, Lw2/j;->b:Lw6/m;

    return-object p0
.end method

.method public static synthetic m(Lw2/j;)Lw6/g;
    .locals 0

    iget-object p0, p0, Lw2/j;->c:Lw6/g;

    return-object p0
.end method

.method public static synthetic n(Lw2/j;)Lv2/a;
    .locals 0

    iget-object p0, p0, Lw2/j;->g:Lv2/a;

    return-object p0
.end method

.method public static synthetic o(Lw2/j;)Lw2/v;
    .locals 0

    iget-object p0, p0, Lw2/j;->d:Lw2/v;

    return-object p0
.end method

.method public static p(Lw2/r;)Lcom/google/android/gms/location/LocationRequest;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    invoke-static {p0}, Lw2/j;->q(Lw2/r;)Lcom/google/android/gms/location/LocationRequest;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lcom/google/android/gms/location/LocationRequest$a;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest$a;-><init>(J)V

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lw2/r;->a()Lw2/l;

    move-result-object v1

    invoke-static {v1}, Lw2/j;->y(Lw2/l;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest$a;->h(I)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p0}, Lw2/r;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest$a;->d(J)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p0}, Lw2/r;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest$a;->g(J)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {p0}, Lw2/r;->b()J

    move-result-wide v1

    long-to-float p0, v1

    invoke-virtual {v0, p0}, Lcom/google/android/gms/location/LocationRequest$a;->f(F)Lcom/google/android/gms/location/LocationRequest$a;

    :cond_1
    invoke-virtual {v0}, Lcom/google/android/gms/location/LocationRequest$a;->a()Lcom/google/android/gms/location/LocationRequest;

    move-result-object p0

    return-object p0
.end method

.method public static q(Lw2/r;)Lcom/google/android/gms/location/LocationRequest;
    .locals 5

    invoke-static {}, Lcom/google/android/gms/location/LocationRequest;->I()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lw2/r;->a()Lw2/l;

    move-result-object v1

    invoke-static {v1}, Lw2/j;->y(Lw2/l;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->X(I)Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {p0}, Lw2/r;->c()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->W(J)Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {p0}, Lw2/r;->c()J

    move-result-wide v1

    const-wide/16 v3, 0x2

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/location/LocationRequest;->V(J)Lcom/google/android/gms/location/LocationRequest;

    invoke-virtual {p0}, Lw2/r;->b()J

    move-result-wide v1

    long-to-float p0, v1

    invoke-virtual {v0, p0}, Lcom/google/android/gms/location/LocationRequest;->Y(F)Lcom/google/android/gms/location/LocationRequest;

    :cond_0
    return-object v0
.end method

.method public static r(Lcom/google/android/gms/location/LocationRequest;)Lw6/p;
    .locals 1

    new-instance v0, Lw6/p$a;

    invoke-direct {v0}, Lw6/p$a;-><init>()V

    invoke-virtual {v0, p0}, Lw6/p$a;->a(Lcom/google/android/gms/location/LocationRequest;)Lw6/p$a;

    invoke-virtual {v0}, Lw6/p$a;->b()Lw6/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lv2/a;Ljava/lang/Exception;)V
    .locals 1

    const-string p1, "Geolocator"

    const-string v0, "Error trying to get last the last known GPS location"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p0, :cond_0

    sget-object p1, Lv2/b;->i:Lv2/b;

    invoke-interface {p0, p1}, Lv2/a;->a(Lv2/b;)V

    :cond_0
    return-void
.end method

.method public static synthetic u(Lw2/s;Lcom/google/android/gms/tasks/Task;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lv2/b;->j:Lv2/b;

    invoke-interface {p0, v0}, Lw2/s;->b(Lv2/b;)V

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw6/q;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lw6/q;->b()Lw6/s;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lw6/s;->L()Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v0

    goto :goto_0

    :cond_1
    move v2, v1

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lw6/s;->N()Z

    move-result p1

    if-eqz p1, :cond_2

    move p1, v0

    goto :goto_1

    :cond_2
    move p1, v1

    :goto_1
    if-nez v2, :cond_4

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    move v0, v1

    :cond_4
    :goto_2
    invoke-interface {p0, v0}, Lw2/s;->a(Z)V

    goto :goto_3

    :cond_5
    sget-object p1, Lv2/b;->j:Lv2/b;

    invoke-interface {p0, p1}, Lw2/s;->b(Lv2/b;)V

    :goto_3
    return-void
.end method

.method private synthetic v(Lw6/q;)V
    .locals 0

    iget-object p1, p0, Lw2/j;->f:Lw2/r;

    invoke-virtual {p0, p1}, Lw2/j;->x(Lw2/r;)V

    return-void
.end method

.method private synthetic w(Landroid/app/Activity;Lv2/a;Ljava/lang/Exception;)V
    .locals 2

    instance-of v0, p3, Lf6/k;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    sget-object p1, Lv2/b;->j:Lv2/b;

    invoke-interface {p2, p1}, Lv2/a;->a(Lv2/b;)V

    return-void

    :cond_0
    check-cast p3, Lf6/k;

    invoke-virtual {p3}, Lf6/b;->getStatusCode()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    :try_start_0
    iget v0, p0, Lw2/j;->e:I

    invoke-virtual {p3, p1, v0}, Lf6/k;->a(Landroid/app/Activity;I)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_1
    check-cast p3, Lf6/b;

    invoke-virtual {p3}, Lf6/b;->getStatusCode()I

    move-result p1

    const/16 p3, 0x2136

    if-ne p1, p3, :cond_2

    iget-object p1, p0, Lw2/j;->f:Lw2/r;

    invoke-virtual {p0, p1}, Lw2/j;->x(Lw2/r;)V

    goto :goto_0

    :catch_0
    :cond_2
    sget-object p1, Lv2/b;->j:Lv2/b;

    invoke-interface {p2, p1}, Lv2/a;->a(Lv2/b;)V

    :goto_0
    return-void
.end method

.method public static y(Lw2/l;)I
    .locals 1

    sget-object v0, Lw2/j$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/16 p0, 0x64

    return p0

    :cond_0
    const/16 p0, 0x66

    return p0

    :cond_1
    const/16 p0, 0x68

    return p0

    :cond_2
    const/16 p0, 0x69

    return p0
.end method


# virtual methods
.method public b(Landroid/app/Activity;Lw2/w;Lv2/a;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    iput-object p2, p0, Lw2/j;->h:Lw2/w;

    iput-object p3, p0, Lw2/j;->g:Lv2/a;

    iget-object p2, p0, Lw2/j;->f:Lw2/r;

    invoke-static {p2}, Lw2/j;->p(Lw2/r;)Lcom/google/android/gms/location/LocationRequest;

    move-result-object p2

    invoke-static {p2}, Lw2/j;->r(Lcom/google/android/gms/location/LocationRequest;)Lw6/p;

    move-result-object p2

    iget-object v0, p0, Lw2/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lw6/o;->b(Landroid/content/Context;)Lw6/u;

    move-result-object v0

    invoke-interface {v0, p2}, Lw6/u;->checkLocationSettings(Lw6/p;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    new-instance v0, Lw2/h;

    invoke-direct {v0, p0}, Lw2/h;-><init>(Lw2/j;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p2

    new-instance v0, Lw2/g;

    invoke-direct {v0, p0, p1, p3}, Lw2/g;-><init>(Lw2/j;Landroid/app/Activity;Lv2/a;)V

    invoke-virtual {p2, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public c(II)Z
    .locals 2

    iget v0, p0, Lw2/j;->e:I

    const/4 v1, 0x0

    if-ne p1, v0, :cond_3

    const/4 p1, -0x1

    if-ne p2, p1, :cond_2

    iget-object p1, p0, Lw2/j;->f:Lw2/r;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lw2/j;->h:Lw2/w;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lw2/j;->g:Lv2/a;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lw2/j;->x(Lw2/r;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v1

    :cond_2
    iget-object p1, p0, Lw2/j;->g:Lv2/a;

    if-eqz p1, :cond_3

    sget-object p2, Lv2/b;->j:Lv2/b;

    invoke-interface {p1, p2}, Lv2/a;->a(Lv2/b;)V

    :cond_3
    return v1
.end method

.method public d(Lw2/w;Lv2/a;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    iget-object v0, p0, Lw2/j;->c:Lw6/g;

    invoke-interface {v0}, Lw6/g;->getLastLocation()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lw2/i;

    invoke-direct {v1, p1}, Lw2/i;-><init>(Lw2/w;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lw2/f;

    invoke-direct {v0, p2}, Lw2/f;-><init>(Lv2/a;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public e(Lw2/s;)V
    .locals 2

    iget-object v0, p0, Lw2/j;->a:Landroid/content/Context;

    invoke-static {v0}, Lw6/o;->b(Landroid/content/Context;)Lw6/u;

    move-result-object v0

    new-instance v1, Lw6/p$a;

    invoke-direct {v1}, Lw6/p$a;-><init>()V

    invoke-virtual {v1}, Lw6/p$a;->b()Lw6/p;

    move-result-object v1

    invoke-interface {v0, v1}, Lw6/u;->checkLocationSettings(Lw6/p;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, Lw2/e;

    invoke-direct {v1, p1}, Lw2/e;-><init>(Lw2/s;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lw2/j;->d:Lw2/v;

    invoke-virtual {v0}, Lw2/v;->e()V

    iget-object v0, p0, Lw2/j;->c:Lw6/g;

    iget-object v1, p0, Lw2/j;->b:Lw6/m;

    invoke-interface {v0, v1}, Lw6/g;->removeLocationUpdates(Lw6/m;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final declared-synchronized s()I
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    const/high16 v1, 0x10000

    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final x(Lw2/r;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    invoke-static {p1}, Lw2/j;->p(Lw2/r;)Lcom/google/android/gms/location/LocationRequest;

    move-result-object p1

    iget-object v0, p0, Lw2/j;->d:Lw2/v;

    invoke-virtual {v0}, Lw2/v;->d()V

    iget-object v0, p0, Lw2/j;->c:Lw6/g;

    iget-object v1, p0, Lw2/j;->b:Lw6/m;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Lw6/g;->requestLocationUpdates(Lcom/google/android/gms/location/LocationRequest;Lw6/m;Landroid/os/Looper;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method
