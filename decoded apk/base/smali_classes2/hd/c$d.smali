.class public final Lhd/c$d;
.super Lhd/c;
.source ""

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhd/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lhd/c<",
        "TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field public final i:Lhd/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/c<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final j:I

.field public k:I


# direct methods
.method public constructor <init>(Lhd/c;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/c<",
            "+TE;>;II)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lhd/c;-><init>()V

    iput-object p1, p0, Lhd/c$d;->i:Lhd/c;

    iput p2, p0, Lhd/c$d;->j:I

    sget-object v0, Lhd/c;->h:Lhd/c$a;

    invoke-virtual {p1}, Lhd/a;->size()I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, Lhd/c$a;->c(III)V

    sub-int/2addr p3, p2

    iput p3, p0, Lhd/c$d;->k:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lhd/c$d;->k:I

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    sget-object v0, Lhd/c;->h:Lhd/c$a;

    iget v1, p0, Lhd/c$d;->k:I

    invoke-virtual {v0, p1, v1}, Lhd/c$a;->a(II)V

    iget-object v0, p0, Lhd/c$d;->i:Lhd/c;

    iget v1, p0, Lhd/c$d;->j:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Lhd/c;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
