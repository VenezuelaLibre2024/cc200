.class public final Landroidx/lifecycle/z$a;
.super Ltd/n;
.source ""

# interfaces
.implements Lsd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/lifecycle/z;-><init>(Landroidx/savedstate/a;Landroidx/lifecycle/i0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltd/n;",
        "Lsd/a<",
        "Landroidx/lifecycle/a0;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic h:Landroidx/lifecycle/i0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/i0;)V
    .locals 0

    iput-object p1, p0, Landroidx/lifecycle/z$a;->h:Landroidx/lifecycle/i0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ltd/n;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/a0;
    .locals 1

    iget-object v0, p0, Landroidx/lifecycle/z$a;->h:Landroidx/lifecycle/i0;

    invoke-static {v0}, Landroidx/lifecycle/y;->e(Landroidx/lifecycle/i0;)Landroidx/lifecycle/a0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/lifecycle/z$a;->a()Landroidx/lifecycle/a0;

    move-result-object v0

    return-object v0
.end method
