.class public final enum Lq2/m;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq2/m;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum i:Lq2/m;

.field public static final enum j:Lq2/m;

.field public static final enum k:Lq2/m;

.field public static final enum l:Lq2/m;

.field public static final enum m:Lq2/m;

.field public static final enum n:Lq2/m;

.field public static final enum o:Lq2/m;

.field public static final enum p:Lq2/m;

.field public static final enum q:Lq2/m;

.field public static final enum r:Lq2/m;

.field public static final synthetic s:[Lq2/m;


# instance fields
.field public final h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lq2/m;

    const-string v1, "AV_LOG_STDERR"

    const/4 v2, 0x0

    const/16 v3, -0x10

    invoke-direct {v0, v1, v2, v3}, Lq2/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/m;->i:Lq2/m;

    new-instance v0, Lq2/m;

    const-string v1, "AV_LOG_QUIET"

    const/4 v3, 0x1

    const/4 v4, -0x8

    invoke-direct {v0, v1, v3, v4}, Lq2/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/m;->j:Lq2/m;

    new-instance v0, Lq2/m;

    const-string v1, "AV_LOG_PANIC"

    const/4 v3, 0x2

    invoke-direct {v0, v1, v3, v2}, Lq2/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/m;->k:Lq2/m;

    new-instance v0, Lq2/m;

    const-string v1, "AV_LOG_FATAL"

    const/4 v2, 0x3

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, v3}, Lq2/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/m;->l:Lq2/m;

    new-instance v0, Lq2/m;

    const-string v1, "AV_LOG_ERROR"

    const/4 v2, 0x4

    const/16 v4, 0x10

    invoke-direct {v0, v1, v2, v4}, Lq2/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/m;->m:Lq2/m;

    new-instance v0, Lq2/m;

    const-string v1, "AV_LOG_WARNING"

    const/4 v2, 0x5

    const/16 v4, 0x18

    invoke-direct {v0, v1, v2, v4}, Lq2/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/m;->n:Lq2/m;

    new-instance v0, Lq2/m;

    const-string v1, "AV_LOG_INFO"

    const/4 v2, 0x6

    const/16 v4, 0x20

    invoke-direct {v0, v1, v2, v4}, Lq2/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/m;->o:Lq2/m;

    new-instance v0, Lq2/m;

    const-string v1, "AV_LOG_VERBOSE"

    const/4 v2, 0x7

    const/16 v4, 0x28

    invoke-direct {v0, v1, v2, v4}, Lq2/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/m;->p:Lq2/m;

    new-instance v0, Lq2/m;

    const-string v1, "AV_LOG_DEBUG"

    const/16 v2, 0x30

    invoke-direct {v0, v1, v3, v2}, Lq2/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/m;->q:Lq2/m;

    new-instance v0, Lq2/m;

    const-string v1, "AV_LOG_TRACE"

    const/16 v2, 0x9

    const/16 v3, 0x38

    invoke-direct {v0, v1, v2, v3}, Lq2/m;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lq2/m;->r:Lq2/m;

    invoke-static {}, Lq2/m;->b()[Lq2/m;

    move-result-object v0

    sput-object v0, Lq2/m;->s:[Lq2/m;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lq2/m;->h:I

    return-void
.end method

.method public static synthetic b()[Lq2/m;
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Lq2/m;

    sget-object v1, Lq2/m;->i:Lq2/m;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lq2/m;->j:Lq2/m;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lq2/m;->k:Lq2/m;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lq2/m;->l:Lq2/m;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lq2/m;->m:Lq2/m;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lq2/m;->n:Lq2/m;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lq2/m;->o:Lq2/m;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lq2/m;->p:Lq2/m;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lq2/m;->q:Lq2/m;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lq2/m;->r:Lq2/m;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static c(I)Lq2/m;
    .locals 2

    sget-object v0, Lq2/m;->i:Lq2/m;

    invoke-virtual {v0}, Lq2/m;->f()I

    move-result v1

    if-ne p0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lq2/m;->j:Lq2/m;

    invoke-virtual {v0}, Lq2/m;->f()I

    move-result v1

    if-ne p0, v1, :cond_1

    return-object v0

    :cond_1
    sget-object v0, Lq2/m;->k:Lq2/m;

    invoke-virtual {v0}, Lq2/m;->f()I

    move-result v1

    if-ne p0, v1, :cond_2

    return-object v0

    :cond_2
    sget-object v0, Lq2/m;->l:Lq2/m;

    invoke-virtual {v0}, Lq2/m;->f()I

    move-result v1

    if-ne p0, v1, :cond_3

    return-object v0

    :cond_3
    sget-object v0, Lq2/m;->m:Lq2/m;

    invoke-virtual {v0}, Lq2/m;->f()I

    move-result v1

    if-ne p0, v1, :cond_4

    return-object v0

    :cond_4
    sget-object v0, Lq2/m;->n:Lq2/m;

    invoke-virtual {v0}, Lq2/m;->f()I

    move-result v1

    if-ne p0, v1, :cond_5

    return-object v0

    :cond_5
    sget-object v0, Lq2/m;->o:Lq2/m;

    invoke-virtual {v0}, Lq2/m;->f()I

    move-result v1

    if-ne p0, v1, :cond_6

    return-object v0

    :cond_6
    sget-object v0, Lq2/m;->p:Lq2/m;

    invoke-virtual {v0}, Lq2/m;->f()I

    move-result v1

    if-ne p0, v1, :cond_7

    return-object v0

    :cond_7
    sget-object v0, Lq2/m;->q:Lq2/m;

    invoke-virtual {v0}, Lq2/m;->f()I

    move-result v1

    if-ne p0, v1, :cond_8

    return-object v0

    :cond_8
    sget-object p0, Lq2/m;->r:Lq2/m;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lq2/m;
    .locals 1

    const-class v0, Lq2/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq2/m;

    return-object p0
.end method

.method public static values()[Lq2/m;
    .locals 1

    sget-object v0, Lq2/m;->s:[Lq2/m;

    invoke-virtual {v0}, [Lq2/m;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq2/m;

    return-object v0
.end method


# virtual methods
.method public f()I
    .locals 1

    iget v0, p0, Lq2/m;->h:I

    return v0
.end method
