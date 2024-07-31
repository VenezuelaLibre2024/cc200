.class public final Lg6/p0;
.super Lg6/d0;
.source ""


# instance fields
.field public final c:Lf6/e;


# direct methods
.method public constructor <init>(Lf6/e;)V
    .locals 1

    const-string v0, "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method."

    invoke-direct {p0, v0}, Lg6/d0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lg6/p0;->c:Lf6/e;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lf6/a$b;",
            "R::",
            "Lf6/m;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/a<",
            "TR;TA;>;>(TT;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lg6/p0;->c:Lf6/e;

    invoke-virtual {v0, p1}, Lf6/e;->doRead(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lf6/a$b;",
            "T:",
            "Lcom/google/android/gms/common/api/internal/a<",
            "+",
            "Lf6/m;",
            "TA;>;>(TT;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lg6/p0;->c:Lf6/e;

    invoke-virtual {v0, p1}, Lf6/e;->doWrite(Lcom/google/android/gms/common/api/internal/a;)Lcom/google/android/gms/common/api/internal/a;

    move-result-object p1

    return-object p1
.end method

.method public final e()Landroid/os/Looper;
    .locals 1

    iget-object v0, p0, Lg6/p0;->c:Lf6/e;

    invoke-virtual {v0}, Lf6/e;->getLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

.method public final h(Lg6/r1;)V
    .locals 0

    return-void
.end method

.method public final i(Lg6/r1;)V
    .locals 0

    return-void
.end method
