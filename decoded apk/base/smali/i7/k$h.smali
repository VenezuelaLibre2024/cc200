.class public Li7/k$h;
.super Ljava/util/AbstractCollection;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractCollection<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic h:Li7/k;


# direct methods
.method public constructor <init>(Li7/k;)V
    .locals 0

    iput-object p1, p0, Li7/k$h;->h:Li7/k;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    iget-object v0, p0, Li7/k$h;->h:Li7/k;

    invoke-virtual {v0}, Li7/k;->clear()V

    return-void
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/k$h;->h:Li7/k;

    invoke-virtual {v0}, Li7/k;->X()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Li7/k$h;->h:Li7/k;

    invoke-virtual {v0}, Li7/k;->size()I

    move-result v0

    return v0
.end method
