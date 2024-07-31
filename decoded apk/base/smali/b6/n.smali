.class public final Lb6/n;
.super Lb6/e;
.source ""


# instance fields
.field public final synthetic a:Lb6/o;


# direct methods
.method public constructor <init>(Lb6/o;)V
    .locals 0

    iput-object p1, p0, Lb6/n;->a:Lb6/o;

    invoke-direct {p0}, Lb6/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final t0(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lb6/n;->a:Lb6/o;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lf6/m;)V

    return-void
.end method
