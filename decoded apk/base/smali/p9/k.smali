.class public Lp9/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final h:Lp9/p;

.field public final i:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lp9/j;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Lq9/c;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lp9/p;Ljava/lang/Integer;Ljava/lang/String;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp9/p;",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lp9/j;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lp9/k;->h:Lp9/p;

    iput-object p2, p0, Lp9/k;->l:Ljava/lang/Integer;

    iput-object p3, p0, Lp9/k;->k:Ljava/lang/String;

    iput-object p4, p0, Lp9/k;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lp9/p;->u()Lp9/f;

    move-result-object p1

    new-instance p2, Lq9/c;

    invoke-virtual {p1}, Lp9/f;->a()Ln7/g;

    move-result-object p3

    invoke-virtual {p3}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lp9/f;->c()Lx7/b;

    move-result-object v2

    invoke-virtual {p1}, Lp9/f;->b()Lv7/b;

    move-result-object v3

    invoke-virtual {p1}, Lp9/f;->i()J

    move-result-wide v4

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lq9/c;-><init>(Landroid/content/Context;Lx7/b;Lv7/b;J)V

    iput-object p2, p0, Lp9/k;->j:Lq9/c;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    new-instance v0, Lr9/d;

    iget-object v1, p0, Lp9/k;->h:Lp9/p;

    invoke-virtual {v1}, Lp9/p;->v()Lq9/h;

    move-result-object v1

    iget-object v2, p0, Lp9/k;->h:Lp9/p;

    invoke-virtual {v2}, Lp9/p;->i()Ln7/g;

    move-result-object v2

    iget-object v3, p0, Lp9/k;->l:Ljava/lang/Integer;

    iget-object v4, p0, Lp9/k;->k:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lr9/d;-><init>(Lq9/h;Ln7/g;Ljava/lang/Integer;Ljava/lang/String;)V

    iget-object v1, p0, Lp9/k;->j:Lq9/c;

    invoke-virtual {v1, v0}, Lq9/c;->d(Lr9/e;)V

    invoke-virtual {v0}, Lr9/e;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    iget-object v1, p0, Lp9/k;->h:Lp9/p;

    invoke-virtual {v1}, Lp9/p;->u()Lp9/f;

    move-result-object v1

    invoke-virtual {v0}, Lr9/e;->n()Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v1, v2}, Lp9/j;->a(Lp9/f;Lorg/json/JSONObject;)Lp9/j;

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to parse response body. "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lr9/e;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "ListTask"

    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lp9/k;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v1}, Lp9/n;->d(Ljava/lang/Throwable;)Lp9/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lp9/k;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    if-eqz v2, :cond_1

    invoke-virtual {v0, v2, v1}, Lr9/e;->a(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
