.class public final Lx7/j1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lx7/j1;


# instance fields
.field public final a:Lx7/p0;

.field public final b:Lx7/a0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx7/j1;

    invoke-direct {v0}, Lx7/j1;-><init>()V

    sput-object v0, Lx7/j1;->c:Lx7/j1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-static {}, Lx7/p0;->j()Lx7/p0;

    move-result-object v0

    invoke-static {}, Lx7/a0;->b()Lx7/a0;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lx7/j1;-><init>(Lx7/p0;Lx7/a0;)V

    return-void
.end method

.method public constructor <init>(Lx7/p0;Lx7/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/j1;->a:Lx7/p0;

    iput-object p2, p0, Lx7/j1;->b:Lx7/a0;

    return-void
.end method

.method public static f()Lx7/j1;
    .locals 1

    sget-object v0, Lx7/j1;->c:Lx7/j1;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    iget-object v0, p0, Lx7/j1;->a:Lx7/p0;

    invoke-virtual {v0, p1}, Lx7/p0;->a(Landroid/content/Context;)V

    return-void
.end method

.method public final b(Lcom/google/firebase/auth/FirebaseAuth;)V
    .locals 1

    iget-object v0, p0, Lx7/j1;->a:Lx7/p0;

    invoke-virtual {v0, p1}, Lx7/p0;->h(Lcom/google/firebase/auth/FirebaseAuth;)V

    return-void
.end method

.method public final c(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lw7/i;",
            ">;",
            "Lcom/google/firebase/auth/FirebaseAuth;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Lx7/j1;->b:Lx7/a0;

    invoke-virtual {v0, p1, p2, p3}, Lx7/a0;->i(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;)Z

    move-result p1

    return p1
.end method

.method public final d(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lw7/a0;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Lw7/i;",
            ">;",
            "Lcom/google/firebase/auth/FirebaseAuth;",
            "Lw7/a0;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Lx7/j1;->b:Lx7/a0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lx7/a0;->j(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lw7/a0;)Z

    move-result p1

    return p1
.end method

.method public final e()Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx7/j1;->a:Lx7/p0;

    invoke-virtual {v0}, Lx7/p0;->i()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
