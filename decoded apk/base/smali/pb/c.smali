.class public Lpb/c;
.super Lpb/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpb/c$a;
    }
.end annotation


# static fields
.field public static final h:[F

.field public static final i:Lpb/c$a;


# instance fields
.field public g:Ljava/nio/FloatBuffer;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpb/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpb/c$a;-><init>(Ltd/g;)V

    sput-object v0, Lpb/c;->i:Lpb/c$a;

    const/16 v0, 0x8

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lpb/c;->h:[F

    return-void

    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lpb/a;-><init>()V

    sget-object v0, Lpb/c;->h:[F

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    invoke-static {v0}, Lqb/a;->b([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lpb/c;->g:Ljava/nio/FloatBuffer;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    const-string v0, "glDrawArrays start"

    invoke-static {v0}, Lob/c;->b(Ljava/lang/String;)V

    invoke-virtual {p0}, Lpb/b;->f()I

    move-result v0

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    const-string v0, "glDrawArrays end"

    invoke-static {v0}, Lob/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method public d()Ljava/nio/FloatBuffer;
    .locals 1

    iget-object v0, p0, Lpb/c;->g:Ljava/nio/FloatBuffer;

    return-object v0
.end method
