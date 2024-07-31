.class public final Lcom/google/android/gms/internal/auth/zzbo;
.super Lf6/e;
.source ""


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lv5/c;)V
    .locals 2

    sget-object v0, Lv5/b;->a:Lf6/a;

    if-nez p2, :cond_0

    sget-object p2, Lv5/c;->i:Lv5/c;

    :cond_0
    sget-object v1, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lf6/e;-><init>(Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lv5/c;)V
    .locals 2

    sget-object v0, Lv5/b;->a:Lf6/a;

    if-nez p2, :cond_0

    sget-object p2, Lv5/c;->i:Lv5/c;

    :cond_0
    sget-object v1, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lf6/e;-><init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method


# virtual methods
.method public final getSpatulaHeader()Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/auth/zzbk;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/auth/zzbk;-><init>(Lcom/google/android/gms/internal/auth/zzbo;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object v0

    const/16 v1, 0x5f0

    invoke-virtual {v0, v1}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object v0

    invoke-virtual {v0}, Lg6/v$a;->a()Lg6/v;

    move-result-object v0

    invoke-virtual {p0, v0}, Lf6/e;->doRead(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final performProxyRequest(Lz5/b;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz5/b;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lz5/c;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/auth/zzbl;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/auth/zzbl;-><init>(Lcom/google/android/gms/internal/auth/zzbo;Lz5/b;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    const/16 v0, 0x5ee

    invoke-virtual {p1, v0}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doWrite(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
