.class public final enum Lu6/q;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu6/q$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lu6/q;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu6/q;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum i:Lu6/q;

.field public static final enum j:Lu6/q;

.field public static final enum k:Lu6/q;

.field public static final enum l:Lu6/q;

.field public static final enum m:Lu6/q;

.field public static final enum n:Lu6/q;

.field public static final enum o:Lu6/q;

.field public static final enum p:Lu6/q;

.field public static final enum q:Lu6/q;

.field public static final enum r:Lu6/q;

.field public static final enum s:Lu6/q;

.field public static final enum t:Lu6/q;

.field public static final synthetic u:[Lu6/q;


# instance fields
.field public final h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lu6/q;

    const-string v1, "NOT_SUPPORTED_ERR"

    const/4 v2, 0x0

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, v3}, Lu6/q;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lu6/q;->i:Lu6/q;

    new-instance v1, Lu6/q;

    const-string v4, "INVALID_STATE_ERR"

    const/4 v5, 0x1

    const/16 v6, 0xb

    invoke-direct {v1, v4, v5, v6}, Lu6/q;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lu6/q;->j:Lu6/q;

    new-instance v4, Lu6/q;

    const-string v7, "SECURITY_ERR"

    const/4 v8, 0x2

    const/16 v9, 0x12

    invoke-direct {v4, v7, v8, v9}, Lu6/q;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lu6/q;->k:Lu6/q;

    new-instance v7, Lu6/q;

    const-string v9, "NETWORK_ERR"

    const/4 v10, 0x3

    const/16 v11, 0x13

    invoke-direct {v7, v9, v10, v11}, Lu6/q;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lu6/q;->l:Lu6/q;

    new-instance v9, Lu6/q;

    const-string v11, "ABORT_ERR"

    const/4 v12, 0x4

    const/16 v13, 0x14

    invoke-direct {v9, v11, v12, v13}, Lu6/q;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lu6/q;->m:Lu6/q;

    new-instance v11, Lu6/q;

    const-string v13, "TIMEOUT_ERR"

    const/4 v14, 0x5

    const/16 v15, 0x17

    invoke-direct {v11, v13, v14, v15}, Lu6/q;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lu6/q;->n:Lu6/q;

    new-instance v13, Lu6/q;

    const-string v15, "ENCODING_ERR"

    const/4 v14, 0x6

    const/16 v12, 0x1b

    invoke-direct {v13, v15, v14, v12}, Lu6/q;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lu6/q;->o:Lu6/q;

    new-instance v12, Lu6/q;

    const-string v15, "UNKNOWN_ERR"

    const/4 v14, 0x7

    const/16 v10, 0x1c

    invoke-direct {v12, v15, v14, v10}, Lu6/q;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lu6/q;->p:Lu6/q;

    new-instance v10, Lu6/q;

    const-string v15, "CONSTRAINT_ERR"

    const/16 v14, 0x8

    const/16 v8, 0x1d

    invoke-direct {v10, v15, v14, v8}, Lu6/q;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lu6/q;->q:Lu6/q;

    new-instance v8, Lu6/q;

    const-string v15, "DATA_ERR"

    const/16 v14, 0x1e

    invoke-direct {v8, v15, v3, v14}, Lu6/q;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lu6/q;->r:Lu6/q;

    new-instance v14, Lu6/q;

    const-string v15, "NOT_ALLOWED_ERR"

    const/16 v3, 0xa

    const/16 v5, 0x23

    invoke-direct {v14, v15, v3, v5}, Lu6/q;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lu6/q;->s:Lu6/q;

    new-instance v5, Lu6/q;

    const-string v15, "ATTESTATION_NOT_PRIVATE_ERR"

    const/16 v3, 0x24

    invoke-direct {v5, v15, v6, v3}, Lu6/q;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lu6/q;->t:Lu6/q;

    const/16 v3, 0xc

    new-array v3, v3, [Lu6/q;

    aput-object v0, v3, v2

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v4, v3, v0

    const/4 v0, 0x3

    aput-object v7, v3, v0

    const/4 v0, 0x4

    aput-object v9, v3, v0

    const/4 v0, 0x5

    aput-object v11, v3, v0

    const/4 v0, 0x6

    aput-object v13, v3, v0

    const/4 v0, 0x7

    aput-object v12, v3, v0

    const/16 v0, 0x8

    aput-object v10, v3, v0

    const/16 v0, 0x9

    aput-object v8, v3, v0

    const/16 v0, 0xa

    aput-object v14, v3, v0

    aput-object v5, v3, v6

    sput-object v3, Lu6/q;->u:[Lu6/q;

    new-instance v0, Lu6/f2;

    invoke-direct {v0}, Lu6/f2;-><init>()V

    sput-object v0, Lu6/q;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lu6/q;->h:I

    return-void
.end method

.method public static f(I)Lu6/q;
    .locals 5

    invoke-static {}, Lu6/q;->values()[Lu6/q;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lu6/q;->h:I

    if-ne p0, v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lu6/q$a;

    invoke-direct {v0, p0}, Lu6/q$a;-><init>(I)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lu6/q;
    .locals 1

    const-class v0, Lu6/q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu6/q;

    return-object p0
.end method

.method public static values()[Lu6/q;
    .locals 1

    sget-object v0, Lu6/q;->u:[Lu6/q;

    invoke-virtual {v0}, [Lu6/q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu6/q;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lu6/q;->h:I

    return v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lu6/q;->h:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
