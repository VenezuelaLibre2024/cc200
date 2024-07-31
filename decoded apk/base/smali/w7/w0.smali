.class public final Lw7/w0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lw7/l0;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/l0;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw7/y0;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p0, Lx7/p;

    invoke-virtual {p0}, Lx7/p;->I()Lx7/i;

    move-result-object v0

    invoke-virtual {v0}, Lw7/a0;->d0()Ln7/g;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(Ln7/g;)Lcom/google/firebase/auth/FirebaseAuth;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/firebase/auth/FirebaseAuth;->Y(Lx7/p;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lw7/y0;Ljava/lang/String;)Lw7/v0;
    .locals 2

    new-instance v0, Lw7/v0;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw7/y0;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lw7/v0;-><init>(Ljava/lang/String;Lw7/y0;Ljava/lang/String;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)Lw7/v0;
    .locals 2

    new-instance v0, Lw7/v0;

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, p0}, Lw7/v0;-><init>(Ljava/lang/String;Lw7/y0;Ljava/lang/String;)V

    return-object v0
.end method
