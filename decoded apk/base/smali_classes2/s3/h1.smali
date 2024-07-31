.class public final synthetic Ls3/h1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ls3/i1;

.field public final synthetic i:Ls3/e3;


# direct methods
.method public synthetic constructor <init>(Ls3/i1;Ls3/e3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/h1;->h:Ls3/i1;

    iput-object p2, p0, Ls3/h1;->i:Ls3/e3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls3/h1;->h:Ls3/i1;

    iget-object v1, p0, Ls3/h1;->i:Ls3/e3;

    invoke-static {v0, v1}, Ls3/i1;->g(Ls3/i1;Ls3/e3;)V

    return-void
.end method
