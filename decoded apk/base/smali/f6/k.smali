.class public Lf6/k;
.super Lf6/b;
.source ""


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-direct {p0, p1}, Lf6/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;I)V
    .locals 1

    invoke-virtual {p0}, Lf6/b;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/common/api/Status;->O(Landroid/app/Activity;I)V

    return-void
.end method
