.class public abstract Ln5/m$h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln5/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln5/m$h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ln5/m$h<",
        "TT;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final h:I

.field public final i:Lu4/s0;

.field public final j:I

.field public final k:Ls3/m1;


# direct methods
.method public constructor <init>(ILu4/s0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ln5/m$h;->h:I

    iput-object p2, p0, Ln5/m$h;->i:Lu4/s0;

    iput p3, p0, Ln5/m$h;->j:I

    invoke-virtual {p2, p3}, Lu4/s0;->b(I)Ls3/m1;

    move-result-object p1

    iput-object p1, p0, Ln5/m$h;->k:Ls3/m1;

    return-void
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c(Ln5/m$h;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation
.end method
