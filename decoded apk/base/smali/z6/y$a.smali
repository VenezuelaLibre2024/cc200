.class public final Lz6/y$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz6/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:F

.field public b:I

.field public c:I

.field public d:Z

.field public e:Lz6/x;


# direct methods
.method public constructor <init>(Lz6/y;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lz6/y;->K()F

    move-result v0

    iput v0, p0, Lz6/y$a;->a:F

    invoke-virtual {p1}, Lz6/y;->L()Landroid/util/Pair;

    move-result-object v0

    iget-object v1, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lz6/y$a;->b:I

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lz6/y$a;->c:I

    invoke-virtual {p1}, Lz6/y;->J()Z

    move-result v0

    iput-boolean v0, p0, Lz6/y$a;->d:Z

    invoke-virtual {p1}, Lz6/y;->I()Lz6/x;

    move-result-object p1

    iput-object p1, p0, Lz6/y$a;->e:Lz6/x;

    return-void
.end method


# virtual methods
.method public a()Lz6/y;
    .locals 7

    new-instance v6, Lz6/y;

    iget v1, p0, Lz6/y$a;->a:F

    iget v2, p0, Lz6/y$a;->b:I

    iget v3, p0, Lz6/y$a;->c:I

    iget-boolean v4, p0, Lz6/y$a;->d:Z

    iget-object v5, p0, Lz6/y$a;->e:Lz6/x;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lz6/y;-><init>(FIIZLz6/x;)V

    return-object v6
.end method

.method public final b(Z)Lz6/y$a;
    .locals 0

    iput-boolean p1, p0, Lz6/y$a;->d:Z

    return-object p0
.end method

.method public final c(F)Lz6/y$a;
    .locals 0

    iput p1, p0, Lz6/y$a;->a:F

    return-object p0
.end method
