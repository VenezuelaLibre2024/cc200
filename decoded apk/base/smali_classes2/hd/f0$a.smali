.class public final Lhd/f0$a;
.super Lhd/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhd/f0;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhd/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public j:I

.field public k:I

.field public final synthetic l:Lhd/f0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/f0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/f0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/f0<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lhd/f0$a;->l:Lhd/f0;

    invoke-direct {p0}, Lhd/b;-><init>()V

    invoke-virtual {p1}, Lhd/a;->size()I

    move-result v0

    iput v0, p0, Lhd/f0$a;->j:I

    invoke-static {p1}, Lhd/f0;->d(Lhd/f0;)I

    move-result p1

    iput p1, p0, Lhd/f0$a;->k:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget v0, p0, Lhd/f0$a;->j:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lhd/b;->c()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lhd/f0$a;->l:Lhd/f0;

    invoke-static {v0}, Lhd/f0;->b(Lhd/f0;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lhd/f0$a;->k:I

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lhd/b;->d(Ljava/lang/Object;)V

    iget-object v0, p0, Lhd/f0$a;->l:Lhd/f0;

    iget v1, p0, Lhd/f0$a;->k:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0}, Lhd/f0;->c(Lhd/f0;)I

    move-result v0

    rem-int/2addr v1, v0

    iput v1, p0, Lhd/f0$a;->k:I

    iget v0, p0, Lhd/f0$a;->j:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lhd/f0$a;->j:I

    :goto_0
    return-void
.end method
