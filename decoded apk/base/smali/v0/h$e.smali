.class public final Lv0/h$e;
.super Lv0/h$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final m:I

.field public final n:I


# direct methods
.method public constructor <init>([BII)V
    .locals 1

    invoke-direct {p0, p1}, Lv0/h$j;-><init>([B)V

    add-int v0, p2, p3

    array-length p1, p1

    invoke-static {p2, v0, p1}, Lv0/h;->d(III)I

    iput p2, p0, Lv0/h$e;->m:I

    iput p3, p0, Lv0/h$e;->n:I

    return-void
.end method


# virtual methods
.method public G()I
    .locals 1

    iget v0, p0, Lv0/h$e;->m:I

    return v0
.end method

.method public b(I)B
    .locals 2

    invoke-virtual {p0}, Lv0/h$e;->size()I

    move-result v0

    invoke-static {p1, v0}, Lv0/h;->c(II)V

    iget-object v0, p0, Lv0/h$j;->l:[B

    iget v1, p0, Lv0/h$e;->m:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public k([BIII)V
    .locals 2

    iget-object v0, p0, Lv0/h$j;->l:[B

    invoke-virtual {p0}, Lv0/h$e;->G()I

    move-result v1

    add-int/2addr v1, p2

    invoke-static {v0, v1, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public m(I)B
    .locals 2

    iget-object v0, p0, Lv0/h$j;->l:[B

    iget v1, p0, Lv0/h$e;->m:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lv0/h$e;->n:I

    return v0
.end method
