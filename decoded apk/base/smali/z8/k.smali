.class public Lz8/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz8/o;


# instance fields
.field public final a:Lz8/p;

.field public final b:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lz8/m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz8/p;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz8/p;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lz8/m;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz8/k;->a:Lz8/p;

    iput-object p2, p0, Lz8/k;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public a(Lb9/d;)Z
    .locals 4

    invoke-virtual {p1}, Lb9/d;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz8/k;->a:Lz8/p;

    invoke-virtual {v0, p1}, Lz8/p;->f(Lb9/d;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lz8/k;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {}, Lz8/m;->a()Lz8/m$a;

    move-result-object v1

    invoke-virtual {p1}, Lb9/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lz8/m$a;->b(Ljava/lang/String;)Lz8/m$a;

    move-result-object v1

    invoke-virtual {p1}, Lb9/d;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lz8/m$a;->d(J)Lz8/m$a;

    move-result-object v1

    invoke-virtual {p1}, Lb9/d;->h()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lz8/m$a;->c(J)Lz8/m$a;

    move-result-object p1

    invoke-virtual {p1}, Lz8/m$a;->a()Lz8/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(Ljava/lang/Exception;)Z
    .locals 1

    iget-object v0, p0, Lz8/k;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    const/4 p1, 0x1

    return p1
.end method
