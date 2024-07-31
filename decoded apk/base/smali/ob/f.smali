.class public abstract Lob/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:[I

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [I

    iput-object v0, p0, Lob/f;->a:[I

    const/4 v0, -0x1

    iput v0, p0, Lob/f;->b:I

    iput v0, p0, Lob/f;->c:I

    return-void
.end method
