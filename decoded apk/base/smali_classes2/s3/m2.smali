.class public final synthetic Ls3/m2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ls3/s2$a;

.field public final synthetic i:Landroid/util/Pair;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(Ls3/s2$a;Landroid/util/Pair;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/m2;->h:Ls3/s2$a;

    iput-object p2, p0, Ls3/m2;->i:Landroid/util/Pair;

    iput p3, p0, Ls3/m2;->j:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ls3/m2;->h:Ls3/s2$a;

    iget-object v1, p0, Ls3/m2;->i:Landroid/util/Pair;

    iget v2, p0, Ls3/m2;->j:I

    invoke-static {v0, v1, v2}, Ls3/s2$a;->S(Ls3/s2$a;Landroid/util/Pair;I)V

    return-void
.end method
