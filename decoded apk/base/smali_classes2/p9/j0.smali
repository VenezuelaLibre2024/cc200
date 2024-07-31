.class public final synthetic Lp9/j0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lp9/l0;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lp9/e0$a;


# direct methods
.method public synthetic constructor <init>(Lp9/l0;Ljava/lang/Object;Lp9/e0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp9/j0;->h:Lp9/l0;

    iput-object p2, p0, Lp9/j0;->i:Ljava/lang/Object;

    iput-object p3, p0, Lp9/j0;->j:Lp9/e0$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lp9/j0;->h:Lp9/l0;

    iget-object v1, p0, Lp9/j0;->i:Ljava/lang/Object;

    iget-object v2, p0, Lp9/j0;->j:Lp9/e0$a;

    invoke-static {v0, v1, v2}, Lp9/l0;->b(Lp9/l0;Ljava/lang/Object;Lp9/e0$a;)V

    return-void
.end method
