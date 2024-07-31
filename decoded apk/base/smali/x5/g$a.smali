.class public final Lx5/g$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lx5/j;

.field public b:Ljava/lang/String;

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lx5/g;
    .locals 4

    new-instance v0, Lx5/g;

    iget-object v1, p0, Lx5/g$a;->a:Lx5/j;

    iget-object v2, p0, Lx5/g$a;->b:Ljava/lang/String;

    iget v3, p0, Lx5/g$a;->c:I

    invoke-direct {v0, v1, v2, v3}, Lx5/g;-><init>(Lx5/j;Ljava/lang/String;I)V

    return-object v0
.end method

.method public b(Lx5/j;)Lx5/g$a;
    .locals 0

    iput-object p1, p0, Lx5/g$a;->a:Lx5/j;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lx5/g$a;
    .locals 0

    iput-object p1, p0, Lx5/g$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final d(I)Lx5/g$a;
    .locals 0

    iput p1, p0, Lx5/g$a;->c:I

    return-object p0
.end method
