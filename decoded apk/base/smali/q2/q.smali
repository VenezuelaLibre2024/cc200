.class public Lq2/q;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lorg/json/JSONObject;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lq2/c0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lq2/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/util/List<",
            "Lq2/c0;",
            ">;",
            "Ljava/util/List<",
            "Lq2/f;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq2/q;->a:Lorg/json/JSONObject;

    iput-object p2, p0, Lq2/q;->b:Ljava/util/List;

    iput-object p3, p0, Lq2/q;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lq2/q;->a:Lorg/json/JSONObject;

    return-object v0
.end method
