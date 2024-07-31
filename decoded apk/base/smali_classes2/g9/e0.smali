.class public final synthetic Lg9/e0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lg9/f0;

.field public final synthetic i:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lg9/f0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/e0;->h:Lg9/f0;

    iput-object p2, p0, Lg9/e0;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg9/e0;->h:Lg9/f0;

    iget-object v1, p0, Lg9/e0;->i:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1}, Lg9/f0;->a(Lg9/f0;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
