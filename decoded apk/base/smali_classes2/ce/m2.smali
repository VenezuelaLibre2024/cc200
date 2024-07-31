.class public final Lce/m2;
.super Lce/u2;
.source ""


# instance fields
.field public final k:Ljd/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/d<",
            "Lgd/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljd/g;Lsd/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/g;",
            "Lsd/p<",
            "-",
            "Lce/p0;",
            "-",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lce/u2;-><init>(Ljd/g;Z)V

    invoke-static {p2, p0, p0}, Lkd/b;->a(Lsd/p;Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    iput-object p1, p0, Lce/m2;->k:Ljd/d;

    return-void
.end method


# virtual methods
.method public w0()V
    .locals 1

    iget-object v0, p0, Lce/m2;->k:Ljd/d;

    invoke-static {v0, p0}, Lie/a;->b(Ljd/d;Ljd/d;)V

    return-void
.end method
