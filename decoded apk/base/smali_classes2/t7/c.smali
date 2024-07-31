.class public final synthetic Lt7/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/Continuation;


# instance fields
.field public final synthetic a:Lt7/h;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lt7/h;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/c;->a:Lt7/h;

    iput-boolean p2, p0, Lt7/c;->b:Z

    return-void
.end method


# virtual methods
.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lt7/c;->a:Lt7/h;

    iget-boolean v1, p0, Lt7/c;->b:Z

    invoke-static {v0, v1, p1}, Lt7/h;->c(Lt7/h;ZLcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
