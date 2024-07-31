.class public Lg6/s;
.super Lg6/g$a;
.source ""


# instance fields
.field public final a:Lg6/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg6/d<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg6/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg6/d<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lg6/g$a;-><init>()V

    iput-object p1, p0, Lg6/s;->a:Lg6/d;

    return-void
.end method


# virtual methods
.method public onResult(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lg6/s;->a:Lg6/d;

    invoke-interface {v0, p1}, Lg6/d;->setResult(Ljava/lang/Object;)V

    return-void
.end method
