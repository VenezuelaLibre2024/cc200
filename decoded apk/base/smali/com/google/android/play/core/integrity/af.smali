.class public final Lcom/google/android/play/core/integrity/af;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg7/j;


# instance fields
.field private final a:Lg7/m;

.field private final b:Lg7/m;


# direct methods
.method public constructor <init>(Lg7/m;Lg7/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/integrity/af;->a:Lg7/m;

    iput-object p2, p0, Lcom/google/android/play/core/integrity/af;->b:Lg7/m;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/play/core/integrity/af;->a:Lg7/m;

    invoke-interface {v0}, Lg7/m;->a()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/play/core/integrity/af;->b:Lg7/m;

    invoke-interface {v1}, Lg7/m;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg7/c0;

    new-instance v2, Lcom/google/android/play/core/integrity/ad;

    check-cast v0, Landroid/content/Context;

    invoke-direct {v2, v0, v1}, Lcom/google/android/play/core/integrity/ad;-><init>(Landroid/content/Context;Lg7/c0;)V

    return-object v2
.end method
