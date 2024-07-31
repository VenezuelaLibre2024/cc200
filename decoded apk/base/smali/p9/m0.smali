.class public Lp9/m0;
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
            "Lp9/o;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Lp9/o;

.field public k:Lp9/o;

.field public l:Lq9/c;


# direct methods
.method public constructor <init>(Lp9/p;Lcom/google/android/gms/tasks/TaskCompletionSource;Lp9/o;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp9/p;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lp9/o;",
            ">;",
            "Lp9/o;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lp9/m0;->k:Lp9/o;

    iput-object p1, p0, Lp9/m0;->h:Lp9/p;

    iput-object p2, p0, Lp9/m0;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Lp9/m0;->j:Lp9/o;

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

    invoke-virtual {p1}, Lp9/f;->j()J

    move-result-wide v4

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lq9/c;-><init>(Landroid/content/Context;Lx7/b;Lv7/b;J)V

    iput-object p2, p0, Lp9/m0;->l:Lq9/c;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    new-instance v0, Lr9/k;

    iget-object v1, p0, Lp9/m0;->h:Lp9/p;

    invoke-virtual {v1}, Lp9/p;->v()Lq9/h;

    move-result-object v1

    iget-object v2, p0, Lp9/m0;->h:Lp9/p;

    invoke-virtual {v2}, Lp9/p;->i()Ln7/g;

    move-result-object v2

    iget-object v3, p0, Lp9/m0;->j:Lp9/o;

    invoke-virtual {v3}, Lp9/o;->q()Lorg/json/JSONObject;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lr9/k;-><init>(Lq9/h;Ln7/g;Lorg/json/JSONObject;)V

    iget-object v1, p0, Lp9/m0;->l:Lq9/c;

    invoke-virtual {v1, v0}, Lq9/c;->d(Lr9/e;)V

    invoke-virtual {v0}, Lr9/e;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    new-instance v1, Lp9/o$b;

    invoke-virtual {v0}, Lr9/e;->n()Lorg/json/JSONObject;

    move-result-object v2

    iget-object v3, p0, Lp9/m0;->h:Lp9/p;

    invoke-direct {v1, v2, v3}, Lp9/o$b;-><init>(Lorg/json/JSONObject;Lp9/p;)V

    invoke-virtual {v1}, Lp9/o$b;->a()Lp9/o;

    move-result-object v1

    iput-object v1, p0, Lp9/m0;->k:Lp9/o;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to parse a valid JSON object from resulting metadata:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lr9/e;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "UpdateMetadataTask"

    invoke-static {v2, v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, p0, Lp9/m0;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v1}, Lp9/n;->d(Ljava/lang/Throwable;)Lp9/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void

    :cond_0
    :goto_0
    iget-object v1, p0, Lp9/m0;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lp9/m0;->k:Lp9/o;

    invoke-virtual {v0, v1, v2}, Lr9/e;->a(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
