.class public final Li7/s0$c;
.super Li7/u;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/u<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final transient j:[Ljava/lang/Object;

.field public final transient k:I

.field public final transient l:I


# direct methods
.method public constructor <init>([Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Li7/u;-><init>()V

    iput-object p1, p0, Li7/s0$c;->j:[Ljava/lang/Object;

    iput p2, p0, Li7/s0$c;->k:I

    iput p3, p0, Li7/s0$c;->l:I

    return-void
.end method


# virtual methods
.method public get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Li7/s0$c;->l:I

    invoke-static {p1, v0}, Lh7/o;->h(II)I

    iget-object v0, p0, Li7/s0$c;->j:[Ljava/lang/Object;

    mul-int/lit8 p1, p1, 0x2

    iget v1, p0, Li7/s0$c;->k:I

    add-int/2addr p1, v1

    aget-object p1, v0, p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Li7/s0$c;->l:I

    return v0
.end method
