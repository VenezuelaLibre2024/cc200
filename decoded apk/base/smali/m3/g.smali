.class public final Lm3/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Li3/b<",
        "Ln3/g;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lq3/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Lq3/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/g;->a:Lfd/a;

    return-void
.end method

.method public static a(Lq3/a;)Ln3/g;
    .locals 1

    invoke-static {p0}, Lm3/f;->a(Lq3/a;)Ln3/g;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Li3/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln3/g;

    return-object p0
.end method

.method public static b(Lfd/a;)Lm3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfd/a<",
            "Lq3/a;",
            ">;)",
            "Lm3/g;"
        }
    .end annotation

    new-instance v0, Lm3/g;

    invoke-direct {v0, p0}, Lm3/g;-><init>(Lfd/a;)V

    return-object v0
.end method


# virtual methods
.method public c()Ln3/g;
    .locals 1

    iget-object v0, p0, Lm3/g;->a:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq3/a;

    invoke-static {v0}, Lm3/g;->a(Lq3/a;)Ln3/g;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm3/g;->c()Ln3/g;

    move-result-object v0

    return-object v0
.end method
