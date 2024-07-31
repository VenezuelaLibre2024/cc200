.class public final Li7/c0$c;
.super Li7/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Li7/a<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final l:Li7/e1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li7/e1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final j:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TT;"
        }
    .end annotation
.end field

.field public final k:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Li7/c0$c;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1, v1, v1}, Li7/c0$c;-><init>([Ljava/lang/Object;III)V

    sput-object v0, Li7/c0$c;->l:Li7/e1;

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;III)V"
        }
    .end annotation

    invoke-direct {p0, p3, p4}, Li7/a;-><init>(II)V

    iput-object p1, p0, Li7/c0$c;->j:[Ljava/lang/Object;

    iput p2, p0, Li7/c0$c;->k:I

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    iget-object v0, p0, Li7/c0$c;->j:[Ljava/lang/Object;

    iget v1, p0, Li7/c0$c;->k:I

    add-int/2addr v1, p1

    aget-object p1, v0, v1

    return-object p1
.end method
