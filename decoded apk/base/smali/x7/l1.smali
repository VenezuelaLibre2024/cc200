.class public final synthetic Lx7/l1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public synthetic a:Lx7/d0;

.field public synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;

.field public synthetic c:Lcom/google/firebase/auth/FirebaseAuth;

.field public synthetic d:Lx7/j1;

.field public synthetic e:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lx7/d0;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lx7/j1;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx7/l1;->a:Lx7/d0;

    iput-object p2, p0, Lx7/l1;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iput-object p3, p0, Lx7/l1;->c:Lcom/google/firebase/auth/FirebaseAuth;

    iput-object p4, p0, Lx7/l1;->d:Lx7/j1;

    iput-object p5, p0, Lx7/l1;->e:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 6

    iget-object v0, p0, Lx7/l1;->a:Lx7/d0;

    iget-object v1, p0, Lx7/l1;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v2, p0, Lx7/l1;->c:Lcom/google/firebase/auth/FirebaseAuth;

    iget-object v3, p0, Lx7/l1;->d:Lx7/j1;

    iget-object v4, p0, Lx7/l1;->e:Landroid/app/Activity;

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lx7/d0;->d(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lx7/j1;Landroid/app/Activity;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
