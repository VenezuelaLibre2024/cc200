.class public final synthetic Lt7/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# instance fields
.field public final synthetic a:Lt7/h;


# direct methods
.method public synthetic constructor <init>(Lt7/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/e;->a:Lt7/h;

    return-void
.end method


# virtual methods
.method public final then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Lt7/e;->a:Lt7/h;

    check-cast p1, Ls7/b;

    invoke-static {v0, p1}, Lt7/h;->d(Lt7/h;Ls7/b;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
