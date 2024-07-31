.class public Lp9/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public h:Lp9/p;

.field public i:Lcom/google/android/gms/tasks/TaskCompletionSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lq9/c;


# direct methods
.method public constructor <init>(Lp9/p;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp9/p;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lp9/d;->h:Lp9/p;

    iput-object p2, p0, Lp9/d;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1}, Lp9/p;->u()Lp9/f;

    move-result-object p1

    new-instance p2, Lq9/c;

    invoke-virtual {p1}, Lp9/f;->a()Ln7/g;

    move-result-object v0

    invoke-virtual {v0}, Ln7/g;->m()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lp9/f;->c()Lx7/b;

    move-result-object v2

    invoke-virtual {p1}, Lp9/f;->b()Lv7/b;

    move-result-object v3

    invoke-virtual {p1}, Lp9/f;->i()J

    move-result-wide v4

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lq9/c;-><init>(Landroid/content/Context;Lx7/b;Lv7/b;J)V

    iput-object p2, p0, Lp9/d;->j:Lq9/c;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Lr9/a;

    iget-object v1, p0, Lp9/d;->h:Lp9/p;

    invoke-virtual {v1}, Lp9/p;->v()Lq9/h;

    move-result-object v1

    iget-object v2, p0, Lp9/d;->h:Lp9/p;

    invoke-virtual {v2}, Lp9/p;->i()Ln7/g;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lr9/a;-><init>(Lq9/h;Ln7/g;)V

    iget-object v1, p0, Lp9/d;->j:Lq9/c;

    invoke-virtual {v1, v0}, Lq9/c;->d(Lr9/e;)V

    iget-object v1, p0, Lp9/d;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lr9/e;->a(Lcom/google/android/gms/tasks/TaskCompletionSource;Ljava/lang/Object;)V

    return-void
.end method
