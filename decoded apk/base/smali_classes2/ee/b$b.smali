.class public final Lee/b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lce/j3;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lee/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final h:Lce/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/n<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Lce/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/p<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public final a()Lce/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lce/n<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lee/b$b;->h:Lce/n;

    return-object v0
.end method

.method public j(Lhe/i0;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhe/i0<",
            "*>;I)V"
        }
    .end annotation

    iget-object v0, p0, Lee/b$b;->i:Lce/p;

    invoke-virtual {v0, p1, p2}, Lce/p;->j(Lhe/i0;I)V

    return-void
.end method
