.class public final enum Lq2/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq2/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum i:Lq2/a;

.field public static final enum j:Lq2/a;

.field public static final enum k:Lq2/a;

.field public static final enum l:Lq2/a;

.field public static final enum m:Lq2/a;

.field public static final enum n:Lq2/a;

.field public static final enum o:Lq2/a;

.field public static final synthetic p:[Lq2/a;


# instance fields
.field public final h:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lq2/a;

    const-string v1, "ABI_ARMV7A_NEON"

    const/4 v2, 0x0

    const-string v3, "armeabi-v7a-neon"

    invoke-direct {v0, v1, v2, v3}, Lq2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lq2/a;->i:Lq2/a;

    new-instance v0, Lq2/a;

    const-string v1, "ABI_ARMV7A"

    const/4 v2, 0x1

    const-string v3, "armeabi-v7a"

    invoke-direct {v0, v1, v2, v3}, Lq2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lq2/a;->j:Lq2/a;

    new-instance v0, Lq2/a;

    const-string v1, "ABI_ARM"

    const/4 v2, 0x2

    const-string v3, "armeabi"

    invoke-direct {v0, v1, v2, v3}, Lq2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lq2/a;->k:Lq2/a;

    new-instance v0, Lq2/a;

    const-string v1, "ABI_X86"

    const/4 v2, 0x3

    const-string v3, "x86"

    invoke-direct {v0, v1, v2, v3}, Lq2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lq2/a;->l:Lq2/a;

    new-instance v0, Lq2/a;

    const-string v1, "ABI_X86_64"

    const/4 v2, 0x4

    const-string v3, "x86_64"

    invoke-direct {v0, v1, v2, v3}, Lq2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lq2/a;->m:Lq2/a;

    new-instance v0, Lq2/a;

    const-string v1, "ABI_ARM64_V8A"

    const/4 v2, 0x5

    const-string v3, "arm64-v8a"

    invoke-direct {v0, v1, v2, v3}, Lq2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lq2/a;->n:Lq2/a;

    new-instance v0, Lq2/a;

    const-string v1, "ABI_UNKNOWN"

    const/4 v2, 0x6

    const-string v3, "unknown"

    invoke-direct {v0, v1, v2, v3}, Lq2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lq2/a;->o:Lq2/a;

    invoke-static {}, Lq2/a;->b()[Lq2/a;

    move-result-object v0

    sput-object v0, Lq2/a;->p:[Lq2/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lq2/a;->h:Ljava/lang/String;

    return-void
.end method

.method public static synthetic b()[Lq2/a;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lq2/a;

    sget-object v1, Lq2/a;->i:Lq2/a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lq2/a;->j:Lq2/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lq2/a;->k:Lq2/a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lq2/a;->l:Lq2/a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lq2/a;->m:Lq2/a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lq2/a;->n:Lq2/a;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lq2/a;->o:Lq2/a;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lq2/a;
    .locals 1

    const-class v0, Lq2/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq2/a;

    return-object p0
.end method

.method public static values()[Lq2/a;
    .locals 1

    sget-object v0, Lq2/a;->p:[Lq2/a;

    invoke-virtual {v0}, [Lq2/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq2/a;

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq2/a;->h:Ljava/lang/String;

    return-object v0
.end method
