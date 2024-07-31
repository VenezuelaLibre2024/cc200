.class public final Lb6/x;
.super Lb6/s;
.source ""


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lb6/s;-><init>()V

    iput-object p1, p0, Lb6/x;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final D()V
    .locals 3

    invoke-virtual {p0}, Lb6/x;->c()V

    iget-object v0, p0, Lb6/x;->a:Landroid/content/Context;

    invoke-static {v0}, Lb6/c;->b(Landroid/content/Context;)Lb6/c;

    move-result-object v0

    invoke-virtual {v0}, Lb6/c;->c()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->s:Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb6/c;->d()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    move-result-object v2

    :cond_0
    iget-object v0, p0, Lb6/x;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/google/android/gms/auth/api/signin/a;->a(Landroid/content/Context;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)La6/b;

    move-result-object v0

    if-eqz v1, :cond_1

    invoke-virtual {v0}, La6/b;->c()Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_1
    invoke-virtual {v0}, La6/b;->signOut()Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lb6/x;->a:Landroid/content/Context;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    invoke-static {v0, v1}, Lo6/p;->a(Landroid/content/Context;I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/SecurityException;

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Calling UID "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " is not Google Play services."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final n()V
    .locals 1

    invoke-virtual {p0}, Lb6/x;->c()V

    iget-object v0, p0, Lb6/x;->a:Landroid/content/Context;

    invoke-static {v0}, Lb6/r;->c(Landroid/content/Context;)Lb6/r;

    move-result-object v0

    invoke-virtual {v0}, Lb6/r;->d()V

    return-void
.end method
