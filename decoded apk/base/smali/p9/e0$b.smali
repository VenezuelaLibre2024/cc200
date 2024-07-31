.class public Lp9/e0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp9/e0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp9/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/Exception;

.field public final synthetic b:Lp9/e0;


# direct methods
.method public constructor <init>(Lp9/e0;Ljava/lang/Exception;)V
    .locals 0

    iput-object p1, p0, Lp9/e0$b;->b:Lp9/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p2, :cond_2

    invoke-virtual {p1}, Lp9/e0;->isCanceled()Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, Lcom/google/android/gms/common/api/Status;->q:Lcom/google/android/gms/common/api/Status;

    :goto_0
    invoke-static {p1}, Lp9/n;->c(Lcom/google/android/gms/common/api/Status;)Lp9/n;

    move-result-object p1

    :goto_1
    iput-object p1, p0, Lp9/e0$b;->a:Ljava/lang/Exception;

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Lp9/e0;->B()I

    move-result p1

    const/16 p2, 0x40

    if-ne p1, p2, :cond_1

    sget-object p1, Lcom/google/android/gms/common/api/Status;->o:Lcom/google/android/gms/common/api/Status;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    iput-object p2, p0, Lp9/e0$b;->a:Ljava/lang/Exception;

    :goto_2
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lp9/e0$b;->a:Ljava/lang/Exception;

    return-object v0
.end method

.method public b()Lp9/p;
    .locals 1

    invoke-virtual {p0}, Lp9/e0$b;->c()Lp9/e0;

    move-result-object v0

    invoke-virtual {v0}, Lp9/e0;->I()Lp9/p;

    move-result-object v0

    return-object v0
.end method

.method public c()Lp9/e0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lp9/e0<",
            "TResultT;>;"
        }
    .end annotation

    iget-object v0, p0, Lp9/e0$b;->b:Lp9/e0;

    return-object v0
.end method
