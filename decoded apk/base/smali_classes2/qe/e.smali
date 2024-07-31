.class public final Lqe/e;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Landroid/app/Activity;Lsd/a;Lsd/a;)Lqe/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lsd/a<",
            "Lgd/s;",
            ">;",
            "Lsd/a<",
            "Lgd/s;",
            ">;)",
            "Lqe/g;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqe/e$a;

    invoke-direct {v0, p0, p1, p2}, Lqe/e$a;-><init>(Landroid/app/Activity;Lsd/a;Lsd/a;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    new-instance p1, Lqe/g;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p0

    const-string p2, "application"

    invoke-static {p0, p2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p0, v0}, Lqe/g;-><init>(Landroid/app/Application;Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-object p1
.end method
