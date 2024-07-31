.class public Li7/j0$d$a;
.super Li7/j0$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li7/j0$d;->b(I)Li7/j0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/j0$c<",
        "TK0;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li7/j0$d;


# direct methods
.method public constructor <init>(Li7/j0$d;I)V
    .locals 0

    iput-object p1, p0, Li7/j0$d$a;->b:Li7/j0$d;

    iput p2, p0, Li7/j0$d$a;->a:I

    invoke-direct {p0}, Li7/j0$c;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Li7/d0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:TK0;V:",
            "Ljava/lang/Object;",
            ">()",
            "Li7/d0<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Li7/j0$d$a;->b:Li7/j0$d;

    invoke-virtual {v0}, Li7/j0$d;->c()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Li7/j0$b;

    iget v2, p0, Li7/j0$d$a;->a:I

    invoke-direct {v1, v2}, Li7/j0$b;-><init>(I)V

    invoke-static {v0, v1}, Li7/k0;->b(Ljava/util/Map;Lh7/u;)Li7/d0;

    move-result-object v0

    return-object v0
.end method
