.class public Lz3/b$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lz3/b$a;)V
    .locals 0

    invoke-direct {p0}, Lz3/b$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lp5/a0;)V
    .locals 1

    invoke-virtual {p1}, Lp5/a0;->t()I

    move-result v0

    iput v0, p0, Lz3/b$c;->a:I

    invoke-virtual {p1}, Lp5/a0;->t()I

    move-result p1

    iput p1, p0, Lz3/b$c;->b:I

    const/4 p1, 0x0

    iput p1, p0, Lz3/b$c;->c:I

    return-void
.end method

.method public b(Lp5/a0;)V
    .locals 2

    invoke-virtual {p0, p1}, Lz3/b$c;->a(Lp5/a0;)V

    iget v0, p0, Lz3/b$c;->a:I

    const v1, 0x5453494c

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lp5/a0;->t()I

    move-result p1

    iput p1, p0, Lz3/b$c;->c:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "LIST expected, found: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lz3/b$c;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ls3/t2;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ls3/t2;

    move-result-object p1

    throw p1
.end method
