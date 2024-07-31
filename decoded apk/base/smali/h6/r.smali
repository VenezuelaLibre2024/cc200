.class public Lh6/r;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh6/r$a;
    }
.end annotation


# static fields
.field public static final a:Lh6/q0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh6/n0;

    invoke-direct {v0}, Lh6/n0;-><init>()V

    sput-object v0, Lh6/r;->a:Lh6/q0;

    return-void
.end method

.method public static a(Lf6/h;Lh6/r$a;)Lcom/google/android/gms/tasks/Task;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lf6/m;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lf6/h<",
            "TR;>;",
            "Lh6/r$a<",
            "TR;TT;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lh6/r;->a:Lh6/q0;

    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    new-instance v2, Lh6/o0;

    invoke-direct {v2, p0, v1, p1, v0}, Lh6/o0;-><init>(Lf6/h;Lcom/google/android/gms/tasks/TaskCompletionSource;Lh6/r$a;Lh6/q0;)V

    invoke-virtual {p0, v2}, Lf6/h;->addStatusListener(Lf6/h$a;)V

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lf6/h;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Lf6/m;",
            ">(",
            "Lf6/h<",
            "TR;>;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lh6/p0;

    invoke-direct {v0}, Lh6/p0;-><init>()V

    invoke-static {p0, v0}, Lh6/r;->a(Lf6/h;Lh6/r$a;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method
