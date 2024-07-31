.class public final synthetic Lw3/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lw3/h$f;

.field public final synthetic i:Ls3/m1;


# direct methods
.method public synthetic constructor <init>(Lw3/h$f;Ls3/m1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/j;->h:Lw3/h$f;

    iput-object p2, p0, Lw3/j;->i:Ls3/m1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw3/j;->h:Lw3/h$f;

    iget-object v1, p0, Lw3/j;->i:Ls3/m1;

    invoke-static {v0, v1}, Lw3/h$f;->d(Lw3/h$f;Ls3/m1;)V

    return-void
.end method
