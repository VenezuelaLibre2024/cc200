.class public final Lf3/e$b;
.super Lf3/k$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lf3/k$b;

.field public b:Lf3/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf3/k$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lf3/k;
    .locals 4

    new-instance v0, Lf3/e;

    iget-object v1, p0, Lf3/e$b;->a:Lf3/k$b;

    iget-object v2, p0, Lf3/e$b;->b:Lf3/a;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lf3/e;-><init>(Lf3/k$b;Lf3/a;Lf3/e$a;)V

    return-object v0
.end method

.method public b(Lf3/a;)Lf3/k$a;
    .locals 0

    iput-object p1, p0, Lf3/e$b;->b:Lf3/a;

    return-object p0
.end method

.method public c(Lf3/k$b;)Lf3/k$a;
    .locals 0

    iput-object p1, p0, Lf3/e$b;->a:Lf3/k$b;

    return-object p0
.end method
