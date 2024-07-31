.class public Li7/o;
.super Li7/y;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li7/y<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final n:Li7/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Li7/o;

    invoke-direct {v0}, Li7/o;-><init>()V

    sput-object v0, Li7/o;->n:Li7/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-static {}, Li7/v;->j()Li7/v;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Li7/y;-><init>(Li7/v;ILjava/util/Comparator;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, Li7/o;->h()Li7/v;

    move-result-object v0

    return-object v0
.end method

.method public h()Li7/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li7/v<",
            "Ljava/lang/Object;",
            "Ljava/util/Collection<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    invoke-super {p0}, Li7/w;->h()Li7/v;

    move-result-object v0

    return-object v0
.end method
