.class public final synthetic Lw3/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lw3/u$a;

.field public final synthetic i:Lw3/u;


# direct methods
.method public synthetic constructor <init>(Lw3/u$a;Lw3/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/q;->h:Lw3/u$a;

    iput-object p2, p0, Lw3/q;->i:Lw3/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw3/q;->h:Lw3/u$a;

    iget-object v1, p0, Lw3/q;->i:Lw3/u;

    invoke-static {v0, v1}, Lw3/u$a;->c(Lw3/u$a;Lw3/u;)V

    return-void
.end method
