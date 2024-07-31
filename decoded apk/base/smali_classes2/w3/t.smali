.class public final synthetic Lw3/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lw3/u$a;

.field public final synthetic i:Lw3/u;

.field public final synthetic j:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lw3/u$a;Lw3/u;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/t;->h:Lw3/u$a;

    iput-object p2, p0, Lw3/t;->i:Lw3/u;

    iput-object p3, p0, Lw3/t;->j:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lw3/t;->h:Lw3/u$a;

    iget-object v1, p0, Lw3/t;->i:Lw3/u;

    iget-object v2, p0, Lw3/t;->j:Ljava/lang/Exception;

    invoke-static {v0, v1, v2}, Lw3/u$a;->e(Lw3/u$a;Lw3/u;Ljava/lang/Exception;)V

    return-void
.end method
