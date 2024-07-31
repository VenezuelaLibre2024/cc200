.class public final synthetic Lk8/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld3/j;


# instance fields
.field public final synthetic a:Lk8/e;

.field public final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public final synthetic c:Z

.field public final synthetic d:Le8/u;


# direct methods
.method public synthetic constructor <init>(Lk8/e;Lcom/google/android/gms/tasks/TaskCompletionSource;ZLe8/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk8/c;->a:Lk8/e;

    iput-object p2, p0, Lk8/c;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-boolean p3, p0, Lk8/c;->c:Z

    iput-object p4, p0, Lk8/c;->d:Le8/u;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lk8/c;->a:Lk8/e;

    iget-object v1, p0, Lk8/c;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-boolean v2, p0, Lk8/c;->c:Z

    iget-object v3, p0, Lk8/c;->d:Le8/u;

    invoke-static {v0, v1, v2, v3, p1}, Lk8/e;->a(Lk8/e;Lcom/google/android/gms/tasks/TaskCompletionSource;ZLe8/u;Ljava/lang/Exception;)V

    return-void
.end method
