.class public final Lcom/google/android/play/core/integrity/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg7/j;


# instance fields
.field private final a:Lg7/m;


# direct methods
.method public constructor <init>(Lg7/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/play/core/integrity/x;->a:Lg7/m;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/play/core/integrity/x;->a:Lg7/m;

    invoke-interface {v0}, Lg7/m;->a()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lcom/google/android/play/core/integrity/w;

    check-cast v0, Lcom/google/android/play/core/integrity/ad;

    invoke-direct {v1, v0}, Lcom/google/android/play/core/integrity/w;-><init>(Lcom/google/android/play/core/integrity/ad;)V

    return-object v1
.end method