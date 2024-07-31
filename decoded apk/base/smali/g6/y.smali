.class public final Lg6/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf6/h$a;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

.field public final synthetic b:Lg6/a0;


# direct methods
.method public constructor <init>(Lg6/a0;Lcom/google/android/gms/common/api/internal/BasePendingResult;)V
    .locals 0

    iput-object p1, p0, Lg6/y;->b:Lg6/a0;

    iput-object p2, p0, Lg6/y;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object p1, p0, Lg6/y;->b:Lg6/a0;

    invoke-static {p1}, Lg6/a0;->a(Lg6/a0;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lg6/y;->a:Lcom/google/android/gms/common/api/internal/BasePendingResult;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
