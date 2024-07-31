.class public Lt8/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/h$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lq8/e<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lq8/g<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final c:Lq8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq8/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Map;Ljava/util/Map;Lq8/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lq8/e<",
            "*>;>;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lq8/g<",
            "*>;>;",
            "Lq8/e<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/h;->a:Ljava/util/Map;

    iput-object p2, p0, Lt8/h;->b:Ljava/util/Map;

    iput-object p3, p0, Lt8/h;->c:Lq8/e;

    return-void
.end method

.method public static a()Lt8/h$a;
    .locals 1

    new-instance v0, Lt8/h$a;

    invoke-direct {v0}, Lt8/h$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/Object;Ljava/io/OutputStream;)V
    .locals 4

    new-instance v0, Lt8/f;

    iget-object v1, p0, Lt8/h;->a:Ljava/util/Map;

    iget-object v2, p0, Lt8/h;->b:Ljava/util/Map;

    iget-object v3, p0, Lt8/h;->c:Lq8/e;

    invoke-direct {v0, p2, v1, v2, v3}, Lt8/f;-><init>(Ljava/io/OutputStream;Ljava/util/Map;Ljava/util/Map;Lq8/e;)V

    invoke-virtual {v0, p1}, Lt8/f;->t(Ljava/lang/Object;)Lt8/f;

    return-void
.end method

.method public c(Ljava/lang/Object;)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lt8/h;->b(Ljava/lang/Object;Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    return-object p1
.end method
