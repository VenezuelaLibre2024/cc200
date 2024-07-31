.class public final enum Lu6/b;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu6/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lu6/b;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lu6/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum i:Lu6/b;

.field public static final enum j:Lu6/b;

.field public static final synthetic k:[Lu6/b;


# instance fields
.field public final h:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lu6/b;

    const-string v1, "PLATFORM"

    const/4 v2, 0x0

    const-string v3, "platform"

    invoke-direct {v0, v1, v2, v3}, Lu6/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lu6/b;->i:Lu6/b;

    new-instance v1, Lu6/b;

    const-string v3, "CROSS_PLATFORM"

    const/4 v4, 0x1

    const-string v5, "cross-platform"

    invoke-direct {v1, v3, v4, v5}, Lu6/b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lu6/b;->j:Lu6/b;

    const/4 v3, 0x2

    new-array v3, v3, [Lu6/b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lu6/b;->k:[Lu6/b;

    new-instance v0, Lu6/i0;

    invoke-direct {v0}, Lu6/i0;-><init>()V

    sput-object v0, Lu6/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lu6/b;->h:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)Lu6/b;
    .locals 5

    invoke-static {}, Lu6/b;->values()[Lu6/b;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-object v4, v3, Lu6/b;->h:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lu6/b$a;

    invoke-direct {v0, p0}, Lu6/b$a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lu6/b;
    .locals 1

    const-class v0, Lu6/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu6/b;

    return-object p0
.end method

.method public static values()[Lu6/b;
    .locals 1

    sget-object v0, Lu6/b;->k:[Lu6/b;

    invoke-virtual {v0}, [Lu6/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu6/b;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu6/b;->h:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lu6/b;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
