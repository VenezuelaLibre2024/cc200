.class public final synthetic Lt7/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lt7/h;

.field public final synthetic i:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lt7/h;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt7/f;->h:Lt7/h;

    iput-object p2, p0, Lt7/f;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt7/f;->h:Lt7/h;

    iget-object v1, p0, Lt7/f;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1}, Lt7/h;->g(Lt7/h;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
