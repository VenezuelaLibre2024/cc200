.class public Lx/o$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx/o$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/o$c;->a:Ljava/lang/String;

    const/4 p1, 0x0

    iput p1, p0, Lx/o$c;->b:I

    const/4 p1, 0x0

    iput-object p1, p0, Lx/o$c;->c:Ljava/lang/String;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lx/o$c;->d:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/o$c;->a:Ljava/lang/String;

    iput p2, p0, Lx/o$c;->b:I

    iput-object p3, p0, Lx/o$c;->c:Ljava/lang/String;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lx/o$c;->d:Z

    return-void
.end method


# virtual methods
.method public a(Lc/a;)V
    .locals 3

    iget-boolean v0, p0, Lx/o$c;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx/o$c;->a:Ljava/lang/String;

    invoke-interface {p1, v0}, Lc/a;->P(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lx/o$c;->a:Ljava/lang/String;

    iget v1, p0, Lx/o$c;->b:I

    iget-object v2, p0, Lx/o$c;->c:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lc/a;->J0(Ljava/lang/String;ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CancelTask["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "packageName:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx/o$c;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lx/o$c;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", tag:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lx/o$c;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", all:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lx/o$c;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
