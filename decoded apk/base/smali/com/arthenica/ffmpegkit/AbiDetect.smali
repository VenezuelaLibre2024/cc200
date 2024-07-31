.class public Lcom/arthenica/ffmpegkit/AbiDetect;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Z = false


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lq2/u;->h()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    sget-boolean v0, Lcom/arthenica/ffmpegkit/AbiDetect;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "arm-v7a-neon"

    return-object v0

    :cond_0
    invoke-static {}, Lcom/arthenica/ffmpegkit/AbiDetect;->getNativeAbi()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lcom/arthenica/ffmpegkit/AbiDetect;->a:Z

    return-void
.end method

.method public static native getNativeAbi()Ljava/lang/String;
.end method

.method public static native getNativeBuildConf()Ljava/lang/String;
.end method

.method public static native getNativeCpuAbi()Ljava/lang/String;
.end method

.method public static native isNativeLTSBuild()Z
.end method
