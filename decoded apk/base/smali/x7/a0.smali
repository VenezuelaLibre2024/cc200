.class public final Lx7/a0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static c:Lx7/a0;


# instance fields
.field public a:Z

.field public b:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx7/a0;->a:Z

    return-void
.end method

.method public static a(Landroid/content/Intent;)Lw7/h;
    .locals 2

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->CREATOR:Landroid/os/Parcelable$Creator;

    const-string v1, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST"

    invoke-static {p0, v1, v0}, Li6/e;->b(Landroid/content/Intent;Ljava/lang/String;Landroid/os/Parcelable$Creator;)Li6/d;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzags;->zzc(Z)Lcom/google/android/gms/internal/firebase-auth-api/zzags;

    move-result-object p0

    invoke-static {p0}, Lw7/z1;->P(Lcom/google/android/gms/internal/firebase-auth-api/zzags;)Lw7/z1;

    move-result-object p0

    return-object p0
.end method

.method public static b()Lx7/a0;
    .locals 1

    sget-object v0, Lx7/a0;->c:Lx7/a0;

    if-nez v0, :cond_0

    new-instance v0, Lx7/a0;

    invoke-direct {v0}, Lx7/a0;-><init>()V

    sput-object v0, Lx7/a0;->c:Lx7/a0;

    :cond_0
    sget-object v0, Lx7/a0;->c:Lx7/a0;

    return-object v0
.end method

.method public static d(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lx7/a0;->c:Lx7/a0;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lx7/a0;->a:Z

    iget-object v0, v0, Lx7/a0;->b:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lh1/a;->b(Landroid/content/Context;)Lh1/a;

    move-result-object p0

    sget-object v0, Lx7/a0;->c:Lx7/a0;

    iget-object v0, v0, Lx7/a0;->b:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lh1/a;->e(Landroid/content/BroadcastReceiver;)V

    :cond_0
    sget-object p0, Lx7/a0;->c:Lx7/a0;

    const/4 v0, 0x0

    iput-object v0, p0, Lx7/a0;->b:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static synthetic e(Lx7/a0;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V
    .locals 0

    const-string p0, "com.google.firebase.auth.internal.RECAPTCHA_TOKEN"

    invoke-virtual {p1, p0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    invoke-static {p3}, Lx7/a0;->d(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic f(Lx7/a0;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Lx7/a0;->a(Landroid/content/Intent;)Lw7/h;

    move-result-object p1

    invoke-virtual {p3, p1}, Lcom/google/firebase/auth/FirebaseAuth;->z(Lw7/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Lx7/c0;

    invoke-direct {p3, p0, p2, p4}, Lx7/c0;-><init>(Lx7/a0;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Lx7/z;

    invoke-direct {p3, p0, p2, p4}, Lx7/z;-><init>(Lx7/a0;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public static synthetic g(Lx7/a0;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Lw7/a0;Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Lx7/a0;->a(Landroid/content/Intent;)Lw7/h;

    move-result-object p1

    invoke-virtual {p3, p1}, Lw7/a0;->P(Lw7/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Lx7/f0;

    invoke-direct {p3, p0, p2, p4}, Lx7/f0;-><init>(Lx7/a0;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Lx7/b0;

    invoke-direct {p3, p0, p2, p4}, Lx7/b0;-><init>(Lx7/a0;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public static synthetic k(Lx7/a0;Landroid/content/Intent;Lcom/google/android/gms/tasks/TaskCompletionSource;Lw7/a0;Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Lx7/a0;->a(Landroid/content/Intent;)Lw7/h;

    move-result-object p1

    invoke-virtual {p3, p1}, Lw7/a0;->Q(Lw7/h;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Lx7/h0;

    invoke-direct {p3, p0, p2, p4}, Lx7/h0;-><init>(Lx7/a0;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance p3, Lx7/e0;

    invoke-direct {p3, p0, p2, p4}, Lx7/e0;-><init>(Lx7/a0;Lcom/google/android/gms/tasks/TaskCompletionSource;Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method


# virtual methods
.method public final c(Landroid/app/Activity;Landroid/content/BroadcastReceiver;)V
    .locals 2

    iput-object p2, p0, Lx7/a0;->b:Landroid/content/BroadcastReceiver;

    invoke-static {p1}, Lh1/a;->b(Landroid/content/Context;)Lh1/a;

    move-result-object p1

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, v0}, Lh1/a;->c(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public final h(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    iget-boolean v0, p0, Lx7/a0;->a:Z

    if-nez v0, :cond_0

    new-instance v0, Lx7/i0;

    invoke-direct {v0, p0, p1, p2}, Lx7/i0;-><init>(Lx7/a0;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-virtual {p0, p1, v0}, Lx7/a0;->c(Landroid/app/Activity;Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx7/a0;->a:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final i(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;)Z
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

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lx7/a0;->j(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lw7/a0;)Z

    move-result p1

    return p1
.end method

.method public final j(Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lw7/a0;)Z
    .locals 7
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

    iget-boolean v0, p0, Lx7/a0;->a:Z

    if-nez v0, :cond_0

    new-instance v0, Lx7/g0;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lx7/g0;-><init>(Lx7/a0;Landroid/app/Activity;Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/firebase/auth/FirebaseAuth;Lw7/a0;)V

    invoke-virtual {p0, p1, v0}, Lx7/a0;->c(Landroid/app/Activity;Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx7/a0;->a:Z

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
