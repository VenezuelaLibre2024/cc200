.class public final synthetic Ls3/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ls3/w0;

.field public final synthetic i:Ls3/i1$e;


# direct methods
.method public synthetic constructor <init>(Ls3/w0;Ls3/i1$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/y;->h:Ls3/w0;

    iput-object p2, p0, Ls3/y;->i:Ls3/i1$e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls3/y;->h:Ls3/w0;

    iget-object v1, p0, Ls3/y;->i:Ls3/i1$e;

    invoke-static {v0, v1}, Ls3/w0;->l0(Ls3/w0;Ls3/i1$e;)V

    return-void
.end method
