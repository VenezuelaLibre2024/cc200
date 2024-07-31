.class public final synthetic Ls3/h2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ls3/s2$a;

.field public final synthetic i:Landroid/util/Pair;

.field public final synthetic j:Lu4/q;


# direct methods
.method public synthetic constructor <init>(Ls3/s2$a;Landroid/util/Pair;Lu4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/h2;->h:Ls3/s2$a;

    iput-object p2, p0, Ls3/h2;->i:Landroid/util/Pair;

    iput-object p3, p0, Ls3/h2;->j:Lu4/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ls3/h2;->h:Ls3/s2$a;

    iget-object v1, p0, Ls3/h2;->i:Landroid/util/Pair;

    iget-object v2, p0, Ls3/h2;->j:Lu4/q;

    invoke-static {v0, v1, v2}, Ls3/s2$a;->v(Ls3/s2$a;Landroid/util/Pair;Lu4/q;)V

    return-void
.end method
