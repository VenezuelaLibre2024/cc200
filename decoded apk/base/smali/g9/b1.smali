.class public Lg9/b1;
.super Landroid/os/Binder;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg9/b1$a;
    }
.end annotation


# instance fields
.field public final a:Lg9/b1$a;


# direct methods
.method public constructor <init>(Lg9/b1$a;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    iput-object p1, p0, Lg9/b1;->a:Lg9/b1$a;

    return-void
.end method

.method public static synthetic a(Lg9/e1$a;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-static {p0, p1}, Lg9/b1;->b(Lg9/e1$a;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method

.method public static synthetic b(Lg9/e1$a;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    invoke-virtual {p0}, Lg9/e1$a;->d()V

    return-void
.end method


# virtual methods
.method public c(Lg9/e1$a;)V
    .locals 3

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    const-string v1, "FirebaseMessaging"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "service received new intent via bind strategy"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Lg9/b1;->a:Lg9/b1$a;

    iget-object v1, p1, Lg9/e1$a;->a:Landroid/content/Intent;

    invoke-interface {v0, v1}, Lg9/b1$a;->a(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    sget-object v1, Landroidx/window/layout/c;->h:Landroidx/window/layout/c;

    new-instance v2, Lg9/a1;

    invoke-direct {v2, p1}, Lg9/a1;-><init>(Lg9/e1$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnCompleteListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnCompleteListener;)Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/SecurityException;

    const-string v0, "Binding only allowed within app"

    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
