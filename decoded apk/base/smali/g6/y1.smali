.class public final Lg6/y1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lu/a;

.field public final b:Lu/a;

.field public final c:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public d:I

.field public e:Z


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lg6/y1;->a:Lu/a;

    invoke-virtual {v0}, Lu/a;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lg6/b;Le6/b;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lg6/y1;->a:Lu/a;

    invoke-virtual {v0, p1, p2}, Lu/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lg6/y1;->b:Lu/a;

    invoke-virtual {v0, p1, p3}, Lu/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Lg6/y1;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lg6/y1;->d:I

    invoke-virtual {p2}, Le6/b;->M()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg6/y1;->e:Z

    :cond_0
    iget p1, p0, Lg6/y1;->d:I

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lg6/y1;->e:Z

    if-eqz p1, :cond_1

    new-instance p1, Lf6/c;

    iget-object p2, p0, Lg6/y1;->a:Lu/a;

    invoke-direct {p1, p2}, Lf6/c;-><init>(Lu/a;)V

    iget-object p2, p0, Lg6/y1;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object p1, p0, Lg6/y1;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object p2, p0, Lg6/y1;->b:Lu/a;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
