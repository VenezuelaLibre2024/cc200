.class public Lq2/j;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lq2/k;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->y()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lq2/s;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->F()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
