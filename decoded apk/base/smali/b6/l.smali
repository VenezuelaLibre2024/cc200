.class public final Lb6/l;
.super Lb6/e;
.source ""


# instance fields
.field public final synthetic a:Lb6/m;


# direct methods
.method public constructor <init>(Lb6/m;)V
    .locals 0

    iput-object p1, p0, Lb6/l;->a:Lb6/m;

    invoke-direct {p0}, Lb6/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final L0(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, Lb6/l;->a:Lb6/m;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lf6/m;)V

    return-void
.end method
