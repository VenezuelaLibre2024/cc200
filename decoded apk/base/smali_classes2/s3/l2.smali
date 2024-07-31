.class public final synthetic Ls3/l2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ls3/s2$a;

.field public final synthetic i:Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(Ls3/s2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/l2;->h:Ls3/s2$a;

    iput-object p2, p0, Ls3/l2;->i:Landroid/util/Pair;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ls3/l2;->h:Ls3/s2$a;

    iget-object v1, p0, Ls3/l2;->i:Landroid/util/Pair;

    invoke-static {v0, v1}, Ls3/s2$a;->R(Ls3/s2$a;Landroid/util/Pair;)V

    return-void
.end method
