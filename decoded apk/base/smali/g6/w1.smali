.class public final Lg6/w1;
.super Lg6/q1;
.source ""


# instance fields
.field public final c:Lg6/j$a;


# direct methods
.method public constructor <init>(Lg6/j$a;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0, p2}, Lg6/q1;-><init>(ILcom/google/android/gms/tasks/TaskCompletionSource;)V

    iput-object p1, p0, Lg6/w1;->c:Lg6/j$a;

    return-void
.end method


# virtual methods
.method public final bridge synthetic d(Lg6/a0;Z)V
    .locals 0

    return-void
.end method

.method public final f(Lg6/k0;)Z
    .locals 1

    invoke-virtual {p1}, Lg6/k0;->x()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lg6/w1;->c:Lg6/j$a;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg6/a1;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lg6/a1;->a:Lg6/o;

    invoke-virtual {p1}, Lg6/o;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final g(Lg6/k0;)[Le6/d;
    .locals 1

    invoke-virtual {p1}, Lg6/k0;->x()Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lg6/w1;->c:Lg6/j$a;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg6/a1;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object p1, p1, Lg6/a1;->a:Lg6/o;

    invoke-virtual {p1}, Lg6/o;->c()[Le6/d;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lg6/k0;)V
    .locals 3

    invoke-virtual {p1}, Lg6/k0;->x()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lg6/w1;->c:Lg6/j$a;

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/a1;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lg6/a1;->b:Lg6/x;

    invoke-virtual {p1}, Lg6/k0;->v()Lf6/a$f;

    move-result-object p1

    iget-object v2, p0, Lg6/q1;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {v1, p1, v2}, Lg6/x;->b(Lf6/a$b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    iget-object p1, v0, Lg6/a1;->a:Lg6/o;

    invoke-virtual {p1}, Lg6/o;->a()V

    return-void

    :cond_0
    iget-object p1, p0, Lg6/q1;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    return-void
.end method
