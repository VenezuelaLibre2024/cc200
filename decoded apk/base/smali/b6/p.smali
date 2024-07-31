.class public abstract Lb6/p;
.super Lcom/google/android/gms/common/api/internal/a;
.source ""


# direct methods
.method public constructor <init>(Lf6/f;)V
    .locals 1

    sget-object v0, Lv5/a;->b:Lf6/a;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/common/api/internal/a;-><init>(Lf6/a;Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic setResult(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lf6/m;

    invoke-super {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->setResult(Lf6/m;)V

    return-void
.end method
