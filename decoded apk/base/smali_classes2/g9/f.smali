.class public final synthetic Lg9/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lg9/g;

.field public final synthetic i:Landroid/content/Intent;

.field public final synthetic j:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lg9/g;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/f;->h:Lg9/g;

    iput-object p2, p0, Lg9/f;->i:Landroid/content/Intent;

    iput-object p3, p0, Lg9/f;->j:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lg9/f;->h:Lg9/g;

    iget-object v1, p0, Lg9/f;->i:Landroid/content/Intent;

    iget-object v2, p0, Lg9/f;->j:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2}, Lg9/g;->b(Lg9/g;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
