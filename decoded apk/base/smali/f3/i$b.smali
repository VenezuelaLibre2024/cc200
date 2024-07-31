.class public final Lf3/i$b;
.super Lf3/o$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lf3/o$c;

.field public b:Lf3/o$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf3/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lf3/o;
    .locals 4

    new-instance v0, Lf3/i;

    iget-object v1, p0, Lf3/i$b;->a:Lf3/o$c;

    iget-object v2, p0, Lf3/i$b;->b:Lf3/o$b;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lf3/i;-><init>(Lf3/o$c;Lf3/o$b;Lf3/i$a;)V

    return-object v0
.end method

.method public b(Lf3/o$b;)Lf3/o$a;
    .locals 0

    iput-object p1, p0, Lf3/i$b;->b:Lf3/o$b;

    return-object p0
.end method

.method public c(Lf3/o$c;)Lf3/o$a;
    .locals 0

    iput-object p1, p0, Lf3/i$b;->a:Lf3/o$c;

    return-object p0
.end method
