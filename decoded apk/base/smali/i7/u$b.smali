.class public Li7/u$b;
.super Li7/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Li7/a<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final j:Li7/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/u<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li7/u;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li7/u<",
            "TE;>;I)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Li7/a;-><init>(II)V

    iput-object p1, p0, Li7/u$b;->j:Li7/u;

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, Li7/u$b;->j:Li7/u;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
