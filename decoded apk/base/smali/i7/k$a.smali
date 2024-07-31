.class public Li7/k$a;
.super Li7/k$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/k;->H()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/k<",
        "TK;TV;>.e<TK;>;"
    }
.end annotation


# instance fields
.field public final synthetic l:Li7/k;


# direct methods
.method public constructor <init>(Li7/k;)V
    .locals 1

    iput-object p1, p0, Li7/k$a;->l:Li7/k;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Li7/k$e;-><init>(Li7/k;Li7/k$a;)V

    return-void
.end method


# virtual methods
.method public c(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TK;"
        }
    .end annotation

    iget-object v0, p0, Li7/k$a;->l:Li7/k;

    invoke-static {v0, p1}, Li7/k;->b(Li7/k;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
