.class public Lre/c0$a;
.super Lre/c0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/c0;->d(Lre/x;[BII)Lre/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lre/x;

.field public final synthetic b:I

.field public final synthetic c:[B

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lre/x;I[BI)V
    .locals 0

    iput p2, p0, Lre/c0$a;->b:I

    iput-object p3, p0, Lre/c0$a;->c:[B

    iput p4, p0, Lre/c0$a;->d:I

    invoke-direct {p0}, Lre/c0;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    iget v0, p0, Lre/c0$a;->b:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public b()Lre/x;
    .locals 1

    iget-object v0, p0, Lre/c0$a;->a:Lre/x;

    return-object v0
.end method

.method public g(Lbf/d;)V
    .locals 3

    iget-object v0, p0, Lre/c0$a;->c:[B

    iget v1, p0, Lre/c0$a;->d:I

    iget v2, p0, Lre/c0$a;->b:I

    invoke-interface {p1, v0, v1, v2}, Lbf/d;->Y([BII)Lbf/d;

    return-void
.end method
