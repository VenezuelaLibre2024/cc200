.class public final Lg6/k0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf6/f$a;
.implements Lf6/f$b;


# instance fields
.field public final a:Ljava/util/Queue;

.field public final b:Lf6/a$f;

.field public final c:Lg6/b;

.field public final f:Lg6/a0;

.field public final g:Ljava/util/Set;

.field public final h:Ljava/util/Map;

.field public final i:I

.field public final j:Lg6/l1;

.field public k:Z

.field public final l:Ljava/util/List;

.field public m:Le6/b;

.field public n:I

.field public final synthetic o:Lg6/f;


# direct methods
.method public constructor <init>(Lg6/f;Lf6/e;)V
    .locals 3

    iput-object p1, p0, Lg6/k0;->o:Lg6/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lg6/k0;->a:Ljava/util/Queue;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lg6/k0;->g:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lg6/k0;->h:Ljava/util/Map;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg6/k0;->l:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Lg6/k0;->m:Le6/b;

    const/4 v1, 0x0

    iput v1, p0, Lg6/k0;->n:I

    invoke-static {p1}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-virtual {p2, v1, p0}, Lf6/e;->zab(Landroid/os/Looper;Lg6/k0;)Lf6/a$f;

    move-result-object v1

    iput-object v1, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-virtual {p2}, Lf6/e;->getApiKey()Lg6/b;

    move-result-object v2

    iput-object v2, p0, Lg6/k0;->c:Lg6/b;

    new-instance v2, Lg6/a0;

    invoke-direct {v2}, Lg6/a0;-><init>()V

    iput-object v2, p0, Lg6/k0;->f:Lg6/a0;

    invoke-virtual {p2}, Lf6/e;->zaa()I

    move-result v2

    iput v2, p0, Lg6/k0;->i:I

    invoke-interface {v1}, Lf6/a$f;->requiresSignIn()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Lg6/f;->r(Lg6/f;)Landroid/content/Context;

    move-result-object v0

    invoke-static {p1}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lf6/e;->zac(Landroid/content/Context;Landroid/os/Handler;)Lg6/l1;

    move-result-object p1

    iput-object p1, p0, Lg6/k0;->j:Lg6/l1;

    return-void

    :cond_0
    iput-object v0, p0, Lg6/k0;->j:Lg6/l1;

    return-void
.end method

.method public static bridge synthetic A(Lg6/k0;I)V
    .locals 0

    invoke-virtual {p0, p1}, Lg6/k0;->k(I)V

    return-void
.end method

.method public static bridge synthetic B(Lg6/k0;Lg6/m0;)V
    .locals 1

    iget-object v0, p0, Lg6/k0;->l:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean p1, p0, Lg6/k0;->k:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {p1}, Lf6/a$f;->isConnected()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lg6/k0;->E()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lg6/k0;->i()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic C(Lg6/k0;Lg6/m0;)V
    .locals 5

    iget-object v0, p0, Lg6/k0;->l:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    invoke-static {p1}, Lg6/m0;->a(Lg6/m0;)Le6/d;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lg6/k0;->a:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lg6/k0;->a:Ljava/util/Queue;

    invoke-interface {v1}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg6/x1;

    instance-of v3, v2, Lg6/t0;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lg6/t0;

    invoke-virtual {v3, p0}, Lg6/t0;->g(Lg6/k0;)[Le6/d;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3, p1}, Lo6/b;->b([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg6/x1;

    iget-object v4, p0, Lg6/k0;->a:Ljava/util/Queue;

    invoke-interface {v4, v3}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    new-instance v4, Lf6/r;

    invoke-direct {v4, p1}, Lf6/r;-><init>(Le6/d;)V

    invoke-virtual {v3, v4}, Lg6/x1;->b(Ljava/lang/Exception;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static bridge synthetic N(Lg6/k0;Z)Z
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lg6/k0;->q(Z)Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic u(Lg6/k0;)Lf6/a$f;
    .locals 0

    iget-object p0, p0, Lg6/k0;->b:Lf6/a$f;

    return-object p0
.end method

.method public static bridge synthetic w(Lg6/k0;)Lg6/b;
    .locals 0

    iget-object p0, p0, Lg6/k0;->c:Lg6/b;

    return-object p0
.end method

.method public static bridge synthetic y(Lg6/k0;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-virtual {p0, p1}, Lg6/k0;->f(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public static bridge synthetic z(Lg6/k0;)V
    .locals 0

    invoke-virtual {p0}, Lg6/k0;->j()V

    return-void
.end method


# virtual methods
.method public final D()V
    .locals 1

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lg6/k0;->m:Le6/b;

    return-void
.end method

.method public final E()V
    .locals 7

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {v0}, Lf6/a$f;->isConnected()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {v0}, Lf6/a$f;->isConnecting()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v0, 0xa

    :try_start_0
    iget-object v1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v1}, Lg6/f;->z(Lg6/f;)Lh6/l0;

    move-result-object v2

    invoke-static {v1}, Lg6/f;->r(Lg6/f;)Landroid/content/Context;

    move-result-object v1

    iget-object v3, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-virtual {v2, v1, v3}, Lh6/l0;->b(Landroid/content/Context;Lf6/a$f;)I

    move-result v1

    if-eqz v1, :cond_1

    new-instance v2, Le6/b;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Le6/b;-><init>(ILandroid/app/PendingIntent;)V

    iget-object v1, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "The service for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " is not available: "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "GoogleApiManager"

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v2, v3}, Lg6/k0;->H(Le6/b;Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    return-void

    :cond_1
    new-instance v1, Lg6/o0;

    iget-object v2, p0, Lg6/k0;->o:Lg6/f;

    iget-object v3, p0, Lg6/k0;->b:Lf6/a$f;

    iget-object v4, p0, Lg6/k0;->c:Lg6/b;

    invoke-direct {v1, v2, v3, v4}, Lg6/o0;-><init>(Lg6/f;Lf6/a$f;Lg6/b;)V

    invoke-interface {v3}, Lf6/a$f;->requiresSignIn()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lg6/k0;->j:Lg6/l1;

    invoke-static {v2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg6/l1;

    invoke-virtual {v2, v1}, Lg6/l1;->O1(Lg6/k1;)V

    :cond_2
    :try_start_1
    iget-object v2, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {v2, v1}, Lf6/a$f;->connect(Lh6/c$c;)V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v1

    new-instance v2, Le6/b;

    invoke-direct {v2, v0}, Le6/b;-><init>(I)V

    :goto_0
    invoke-virtual {p0, v2, v1}, Lg6/k0;->H(Le6/b;Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v1

    new-instance v2, Le6/b;

    invoke-direct {v2, v0}, Le6/b;-><init>(I)V

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final F(Lg6/x1;)V
    .locals 1

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {v0}, Lf6/a$f;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lg6/k0;->o(Lg6/x1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg6/k0;->l()V

    return-void

    :cond_0
    iget-object v0, p0, Lg6/k0;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    iget-object v0, p0, Lg6/k0;->a:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lg6/k0;->m:Le6/b;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Le6/b;->L()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lg6/k0;->m:Le6/b;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lg6/k0;->H(Le6/b;Ljava/lang/Exception;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lg6/k0;->E()V

    return-void
.end method

.method public final G()V
    .locals 1

    iget v0, p0, Lg6/k0;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lg6/k0;->n:I

    return-void
.end method

.method public final H(Le6/b;Ljava/lang/Exception;)V
    .locals 5

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lg6/k0;->j:Lg6/l1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg6/l1;->P1()V

    :cond_0
    invoke-virtual {p0}, Lg6/k0;->D()V

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->z(Lg6/f;)Lh6/l0;

    move-result-object v0

    invoke-virtual {v0}, Lh6/l0;->c()V

    invoke-virtual {p0, p1}, Lg6/k0;->d(Le6/b;)V

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    instance-of v0, v0, Lj6/e;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Le6/b;->I()I

    move-result v0

    const/16 v2, 0x18

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0, v1}, Lg6/f;->G(Lg6/f;Z)V

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v2

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v3, 0x13

    invoke-virtual {v0, v3}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    const-wide/32 v3, 0x493e0

    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    :cond_1
    invoke-virtual {p1}, Le6/b;->I()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_2

    invoke-static {}, Lg6/f;->u()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg6/k0;->f(Lcom/google/android/gms/common/api/Status;)V

    return-void

    :cond_2
    iget-object v0, p0, Lg6/k0;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iput-object p1, p0, Lg6/k0;->m:Le6/b;

    return-void

    :cond_3
    const/4 v0, 0x0

    if-eqz p2, :cond_4

    iget-object p1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {p1}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object p1

    invoke-static {p1}, Lh6/s;->d(Landroid/os/Handler;)V

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p2, p1}, Lg6/k0;->h(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    return-void

    :cond_4
    iget-object p2, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {p2}, Lg6/f;->f(Lg6/f;)Z

    move-result p2

    if-eqz p2, :cond_a

    iget-object p2, p0, Lg6/k0;->c:Lg6/b;

    invoke-static {p2, p1}, Lg6/f;->v(Lg6/b;Le6/b;)Lcom/google/android/gms/common/api/Status;

    move-result-object p2

    invoke-virtual {p0, p2, v0, v1}, Lg6/k0;->h(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    iget-object p2, p0, Lg6/k0;->a:Ljava/util/Queue;

    invoke-interface {p2}, Ljava/util/Queue;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    return-void

    :cond_5
    invoke-virtual {p0, p1}, Lg6/k0;->p(Le6/b;)Z

    move-result p2

    if-eqz p2, :cond_6

    return-void

    :cond_6
    iget-object p2, p0, Lg6/k0;->o:Lg6/f;

    iget v0, p0, Lg6/k0;->i:I

    invoke-virtual {p2, p1, v0}, Lg6/f;->h(Le6/b;I)Z

    move-result p2

    if-nez p2, :cond_9

    invoke-virtual {p1}, Le6/b;->I()I

    move-result p2

    const/16 v0, 0x12

    if-ne p2, v0, :cond_7

    iput-boolean v1, p0, Lg6/k0;->k:Z

    :cond_7
    iget-boolean p2, p0, Lg6/k0;->k:Z

    if-eqz p2, :cond_8

    iget-object p1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {p1}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object p2

    invoke-static {p1}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object p1

    const/16 v0, 0x9

    iget-object v1, p0, Lg6/k0;->c:Lg6/b;

    invoke-static {p1, v0, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->o(Lg6/f;)J

    move-result-wide v0

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void

    :cond_8
    iget-object p2, p0, Lg6/k0;->c:Lg6/b;

    invoke-static {p2, p1}, Lg6/f;->v(Lg6/b;Le6/b;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg6/k0;->f(Lcom/google/android/gms/common/api/Status;)V

    :cond_9
    return-void

    :cond_a
    iget-object p2, p0, Lg6/k0;->c:Lg6/b;

    invoke-static {p2, p1}, Lg6/f;->v(Lg6/b;Le6/b;)Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p0, p1}, Lg6/k0;->f(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final I(Le6/b;)V
    .locals 5

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onSignInFailed for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " with "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lf6/a$f;->disconnect(Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lg6/k0;->H(Le6/b;Ljava/lang/Exception;)V

    return-void
.end method

.method public final J(Lg6/y1;)V
    .locals 1

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lg6/k0;->g:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final K()V
    .locals 1

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    iget-boolean v0, p0, Lg6/k0;->k:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lg6/k0;->E()V

    :cond_0
    return-void
.end method

.method public final L()V
    .locals 6

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    sget-object v0, Lg6/f;->y:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lg6/k0;->f(Lcom/google/android/gms/common/api/Status;)V

    iget-object v0, p0, Lg6/k0;->f:Lg6/a0;

    invoke-virtual {v0}, Lg6/a0;->f()V

    iget-object v0, p0, Lg6/k0;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Lg6/j$a;

    invoke-interface {v0, v2}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg6/j$a;

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_0

    aget-object v3, v0, v1

    new-instance v4, Lg6/w1;

    new-instance v5, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v5}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    invoke-direct {v4, v3, v5}, Lg6/w1;-><init>(Lg6/j$a;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p0, v4}, Lg6/k0;->F(Lg6/x1;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Le6/b;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Le6/b;-><init>(I)V

    invoke-virtual {p0, v0}, Lg6/k0;->d(Le6/b;)V

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {v0}, Lf6/a$f;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    new-instance v1, Lg6/j0;

    invoke-direct {v1, p0}, Lg6/j0;-><init>(Lg6/k0;)V

    invoke-interface {v0, v1}, Lf6/a$f;->onUserSignOut(Lh6/c$e;)V

    :cond_1
    return-void
.end method

.method public final M()V
    .locals 3

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    iget-boolean v0, p0, Lg6/k0;->k:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lg6/k0;->n()V

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->t(Lg6/f;)Le6/e;

    move-result-object v1

    invoke-static {v0}, Lg6/f;->r(Lg6/f;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Le6/e;->g(Landroid/content/Context;)I

    move-result v0

    const/16 v1, 0x12

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x15

    const-string v2, "Connection timed out waiting for Google Play services update to complete."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x16

    const-string v2, "API failed to connect while resuming due to an unknown error."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p0, v0}, Lg6/k0;->f(Lcom/google/android/gms/common/api/Status;)V

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    const-string v1, "Timing out connection while resuming."

    invoke-interface {v0, v1}, Lf6/a$f;->disconnect(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final O()Z
    .locals 1

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {v0}, Lf6/a$f;->isConnected()Z

    move-result v0

    return v0
.end method

.method public final P()Z
    .locals 1

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {v0}, Lf6/a$f;->requiresSignIn()Z

    move-result v0

    return v0
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lg6/k0;->q(Z)Z

    move-result v0

    return v0
.end method

.method public final b([Le6/d;)Le6/d;
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_3

    :cond_0
    iget-object v1, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {v1}, Lf6/a$f;->getAvailableFeatures()[Le6/d;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    new-array v1, v2, [Le6/d;

    :cond_1
    array-length v3, v1

    new-instance v4, Lu/a;

    invoke-direct {v4, v3}, Lu/a;-><init>(I)V

    move v5, v2

    :goto_0
    if-ge v5, v3, :cond_2

    aget-object v6, v1, v5

    invoke-virtual {v6}, Le6/d;->I()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Le6/d;->J()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v4, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    array-length v1, p1

    :goto_1
    if-ge v2, v1, :cond_5

    aget-object v3, p1, v2

    invoke-virtual {v3}, Le6/d;->I()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v3}, Le6/d;->J()J

    move-result-wide v7

    cmp-long v5, v5, v7

    if-gez v5, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    return-object v3

    :cond_5
    :goto_3
    return-object v0
.end method

.method public final c(I)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v1}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, p1}, Lg6/k0;->k(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lg6/h0;

    invoke-direct {v1, p0, p1}, Lg6/h0;-><init>(Lg6/k0;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final d(Le6/b;)V
    .locals 4

    iget-object v0, p0, Lg6/k0;->g:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg6/y1;

    sget-object v2, Le6/b;->l:Le6/b;

    invoke-static {p1, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {v2}, Lf6/a$f;->getEndpointPackageName()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    iget-object v3, p0, Lg6/k0;->c:Lg6/b;

    invoke-virtual {v1, v3, p1, v2}, Lg6/y1;->b(Lg6/b;Le6/b;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lg6/k0;->g:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public final e(Le6/b;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lg6/k0;->H(Le6/b;Ljava/lang/Exception;)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lg6/k0;->h(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V

    return-void
.end method

.method public final g(Landroid/os/Bundle;)V
    .locals 1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lg6/k0;->j()V

    return-void

    :cond_0
    iget-object p1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {p1}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lg6/g0;

    invoke-direct {v0, p0}, Lg6/g0;-><init>(Lg6/k0;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final h(Lcom/google/android/gms/common/api/Status;Ljava/lang/Exception;Z)V
    .locals 4

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eq v2, v0, :cond_6

    iget-object v0, p0, Lg6/k0;->a:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg6/x1;

    if-eqz p3, :cond_3

    iget v2, v1, Lg6/x1;->a:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {v1, p1}, Lg6/x1;->a(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v1, p2}, Lg6/x1;->b(Ljava/lang/Exception;)V

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Status XOR exception should be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i()V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lg6/k0;->a:Ljava/util/Queue;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg6/x1;

    iget-object v4, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {v4}, Lf6/a$f;->isConnected()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v3}, Lg6/k0;->o(Lg6/x1;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lg6/k0;->a:Ljava/util/Queue;

    invoke-interface {v4, v3}, Ljava/util/Queue;->remove(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final j()V
    .locals 4

    invoke-virtual {p0}, Lg6/k0;->D()V

    sget-object v0, Le6/b;->l:Le6/b;

    invoke-virtual {p0, v0}, Lg6/k0;->d(Le6/b;)V

    invoke-virtual {p0}, Lg6/k0;->n()V

    iget-object v0, p0, Lg6/k0;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg6/a1;

    iget-object v2, v1, Lg6/a1;->a:Lg6/o;

    invoke-virtual {v2}, Lg6/o;->c()[Le6/d;

    move-result-object v2

    invoke-virtual {p0, v2}, Lg6/k0;->b([Le6/d;)Le6/d;

    move-result-object v2

    if-eqz v2, :cond_0

    :catch_0
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v1, v1, Lg6/a1;->a:Lg6/o;

    iget-object v2, p0, Lg6/k0;->b:Lf6/a$f;

    new-instance v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    invoke-virtual {v1, v2, v3}, Lg6/o;->d(Lf6/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_1
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lg6/k0;->c(I)V

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    const-string v1, "DeadObjectException thrown while calling register listener method."

    invoke-interface {v0, v1}, Lf6/a$f;->disconnect(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Lg6/k0;->i()V

    invoke-virtual {p0}, Lg6/k0;->l()V

    return-void
.end method

.method public final k(I)V
    .locals 3

    invoke-virtual {p0}, Lg6/k0;->D()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg6/k0;->k:Z

    iget-object v0, p0, Lg6/k0;->f:Lg6/a0;

    iget-object v1, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {v1}, Lf6/a$f;->getLastDisconnectMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lg6/a0;->e(ILjava/lang/String;)V

    iget-object p1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {p1}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object p1

    iget-object v1, p0, Lg6/k0;->c:Lg6/b;

    const/16 v2, 0x9

    invoke-static {p1, v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v1}, Lg6/f;->o(Lg6/f;)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object p1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {p1}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {p1}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object p1

    iget-object v1, p0, Lg6/k0;->c:Lg6/b;

    const/16 v2, 0xb

    invoke-static {p1, v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v1}, Lg6/f;->p(Lg6/f;)J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object p1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {p1}, Lg6/f;->z(Lg6/f;)Lh6/l0;

    move-result-object p1

    invoke-virtual {p1}, Lh6/l0;->c()V

    iget-object p1, p0, Lg6/k0;->h:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/a1;

    iget-object v0, v0, Lg6/a1;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final l()V
    .locals 4

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lg6/k0;->c:Lg6/b;

    const/16 v2, 0xc

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    iget-object v3, p0, Lg6/k0;->c:Lg6/b;

    invoke-virtual {v0, v2, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object v2, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v2}, Lg6/f;->q(Lg6/f;)J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method public final m(Lg6/x1;)V
    .locals 2

    iget-object v0, p0, Lg6/k0;->f:Lg6/a0;

    invoke-virtual {p0}, Lg6/k0;->P()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lg6/x1;->d(Lg6/a0;Z)V

    :try_start_0
    invoke-virtual {p1, p0}, Lg6/x1;->c(Lg6/k0;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lg6/k0;->c(I)V

    iget-object p1, p0, Lg6/k0;->b:Lf6/a$f;

    const-string v0, "DeadObjectException thrown while running ApiCallRunner."

    invoke-interface {p1, v0}, Lf6/a$f;->disconnect(Ljava/lang/String;)V

    return-void
.end method

.method public final n()V
    .locals 3

    iget-boolean v0, p0, Lg6/k0;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xb

    iget-object v2, p0, Lg6/k0;->c:Lg6/b;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x9

    iget-object v2, p0, Lg6/k0;->c:Lg6/b;

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg6/k0;->k:Z

    :cond_0
    return-void
.end method

.method public final o(Lg6/x1;)Z
    .locals 7

    instance-of v0, p1, Lg6/t0;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lg6/k0;->m(Lg6/x1;)V

    return v1

    :cond_0
    move-object v0, p1

    check-cast v0, Lg6/t0;

    invoke-virtual {v0, p0}, Lg6/t0;->g(Lg6/k0;)[Le6/d;

    move-result-object v2

    invoke-virtual {p0, v2}, Lg6/k0;->b([Le6/d;)Le6/d;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {p0, p1}, Lg6/k0;->m(Lg6/x1;)V

    return v1

    :cond_1
    iget-object p1, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2}, Le6/d;->I()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Le6/d;->J()J

    move-result-wide v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " could not execute call because it requires feature ("

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v3, "GoogleApiManager"

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {p1}, Lg6/f;->f(Lg6/f;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0, p0}, Lg6/t0;->f(Lg6/k0;)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Lg6/m0;

    iget-object v0, p0, Lg6/k0;->c:Lg6/b;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v2, v1}, Lg6/m0;-><init>(Lg6/b;Le6/d;Lg6/l0;)V

    iget-object v0, p0, Lg6/k0;->l:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/16 v2, 0xf

    if-ltz v0, :cond_2

    iget-object p1, p0, Lg6/k0;->l:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg6/m0;

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v1

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->o(Lg6/f;)J

    move-result-wide v2

    invoke-virtual {v1, p1, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lg6/k0;->l:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v3

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0, v2, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    iget-object v2, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v2}, Lg6/f;->o(Lg6/f;)J

    move-result-wide v4

    invoke-virtual {v3, v0, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v2

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    const/16 v3, 0x10

    invoke-static {v0, v3, p1}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->p(Lg6/f;)J

    move-result-wide v3

    invoke-virtual {v2, p1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    new-instance p1, Le6/b;

    const/4 v0, 0x2

    invoke-direct {p1, v0, v1}, Le6/b;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {p0, p1}, Lg6/k0;->p(Le6/b;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    iget v1, p0, Lg6/k0;->i:I

    invoke-virtual {v0, p1, v1}, Lg6/f;->h(Le6/b;I)Z

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    new-instance p1, Lf6/r;

    invoke-direct {p1, v2}, Lf6/r;-><init>(Le6/d;)V

    invoke-virtual {v0, p1}, Lg6/x1;->b(Ljava/lang/Exception;)V

    return v1
.end method

.method public final p(Le6/b;)Z
    .locals 3

    invoke-static {}, Lg6/f;->D()Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v1}, Lg6/f;->w(Lg6/f;)Lg6/b0;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lg6/f;->F(Lg6/f;)Ljava/util/Set;

    move-result-object v1

    iget-object v2, p0, Lg6/k0;->c:Lg6/b;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v1}, Lg6/f;->w(Lg6/f;)Lg6/b0;

    move-result-object v1

    iget v2, p0, Lg6/k0;->i:I

    invoke-virtual {v1, p1, v2}, Lg6/c2;->h(Le6/b;I)V

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :cond_0
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final q(Z)Z
    .locals 2

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    invoke-interface {v0}, Lf6/a$f;->isConnected()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lg6/k0;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lg6/k0;->f:Lg6/a0;

    invoke-virtual {v0}, Lg6/a0;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lg6/k0;->l()V

    :cond_0
    return v1

    :cond_1
    iget-object p1, p0, Lg6/k0;->b:Lf6/a$f;

    const-string v0, "Timing out service connection."

    invoke-interface {p1, v0}, Lf6/a$f;->disconnect(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final r()I
    .locals 1

    iget v0, p0, Lg6/k0;->i:I

    return v0
.end method

.method public final s()I
    .locals 1

    iget v0, p0, Lg6/k0;->n:I

    return v0
.end method

.method public final t()Le6/b;
    .locals 1

    iget-object v0, p0, Lg6/k0;->o:Lg6/f;

    invoke-static {v0}, Lg6/f;->s(Lg6/f;)Landroid/os/Handler;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->d(Landroid/os/Handler;)V

    iget-object v0, p0, Lg6/k0;->m:Le6/b;

    return-object v0
.end method

.method public final v()Lf6/a$f;
    .locals 1

    iget-object v0, p0, Lg6/k0;->b:Lf6/a$f;

    return-object v0
.end method

.method public final x()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lg6/k0;->h:Ljava/util/Map;

    return-object v0
.end method
