.class public final Lg6/u1;
.super Lg6/q1;
.source ""


# instance fields
.field public final c:Lg6/a1;


# direct methods
.method public constructor <init>(Lg6/a1;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0, p2}, Lg6/q1;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    iput-object p1, p0, Lg6/u1;->c:Lg6/a1;

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Lg6/a0;Z)V
    .locals 0

    return-void
.end method

.method public final f(Lg6/k0;)Z
    .locals 0

    iget-object p1, p0, Lg6/u1;->c:Lg6/a1;

    iget-object p1, p1, Lg6/a1;->a:Lg6/o;

    invoke-virtual {p1}, Lg6/o;->f()Z

    move-result p1

    return p1
.end method

.method public final g(Lg6/k0;)[Le6/d;
    .locals 0

    iget-object p1, p0, Lg6/u1;->c:Lg6/a1;

    iget-object p1, p1, Lg6/a1;->a:Lg6/o;

    invoke-virtual {p1}, Lg6/o;->c()[Le6/d;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lg6/k0;)V
    .locals 3

    iget-object v0, p0, Lg6/u1;->c:Lg6/a1;

    iget-object v0, v0, Lg6/a1;->a:Lg6/o;

    invoke-virtual {p1}, Lg6/k0;->v()Lf6/a$f;

    move-result-object v1

    iget-object v2, p0, Lg6/q1;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v0, v1, v2}, Lg6/o;->d(Lf6/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object v0, p0, Lg6/u1;->c:Lg6/a1;

    iget-object v0, v0, Lg6/a1;->a:Lg6/o;

    invoke-virtual {v0}, Lg6/o;->b()Lg6/j$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lg6/k0;->x()Ljava/util/Map;

    move-result-object p1

    iget-object v1, p0, Lg6/u1;->c:Lg6/a1;

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
