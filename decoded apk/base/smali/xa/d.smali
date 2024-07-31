.class public final Lxa/d;
.super Lxa/b;
.source ""


# instance fields
.field public final c:Lxa/c;

.field public d:I


# direct methods
.method public constructor <init>(IILxa/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lxa/b;-><init>(II)V

    iput-object p3, p0, Lxa/d;->c:Lxa/c;

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Lxa/d;->d:I

    return v0
.end method

.method public d()Lxa/c;
    .locals 1

    iget-object v0, p0, Lxa/d;->c:Lxa/c;

    return-object v0
.end method

.method public e()V
    .locals 1

    iget v0, p0, Lxa/d;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lxa/d;->d:I

    return-void
.end method
