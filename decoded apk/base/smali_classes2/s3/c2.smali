.class public final synthetic Ls3/c2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ls3/d2;

.field public final synthetic i:Li7/u$a;

.field public final synthetic j:Lu4/t$b;


# direct methods
.method public synthetic constructor <init>(Ls3/d2;Li7/u$a;Lu4/t$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/c2;->h:Ls3/d2;

    iput-object p2, p0, Ls3/c2;->i:Li7/u$a;

    iput-object p3, p0, Ls3/c2;->j:Lu4/t$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ls3/c2;->h:Ls3/d2;

    iget-object v1, p0, Ls3/c2;->i:Li7/u$a;

    iget-object v2, p0, Ls3/c2;->j:Lu4/t$b;

    invoke-static {v0, v1, v2}, Ls3/d2;->a(Ls3/d2;Li7/u$a;Lu4/t$b;)V

    return-void
.end method
