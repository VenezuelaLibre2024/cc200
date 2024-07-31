.class public final enum Lv6/c;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv6/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv6/c;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv6/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum i:Lv6/c;

.field public static final enum j:Lv6/c;

.field public static final enum k:Lv6/c;

.field public static final synthetic l:[Lv6/c;


# instance fields
.field public final h:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lv6/c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lv6/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lv6/c;->i:Lv6/c;

    new-instance v1, Lv6/c;

    const-string v3, "V1"

    const/4 v4, 0x1

    const-string v5, "U2F_V1"

    invoke-direct {v1, v3, v4, v5}, Lv6/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lv6/c;->j:Lv6/c;

    new-instance v3, Lv6/c;

    const-string v5, "V2"

    const/4 v6, 0x2

    const-string v7, "U2F_V2"

    invoke-direct {v3, v5, v6, v7}, Lv6/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lv6/c;->k:Lv6/c;

    const/4 v5, 0x3

    new-array v5, v5, [Lv6/c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lv6/c;->l:[Lv6/c;

    new-instance v0, Lv6/i;

    invoke-direct {v0}, Lv6/i;-><init>()V

    sput-object v0, Lv6/c;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lv6/c;->h:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)Lv6/c;
    .locals 5

    if-nez p0, :cond_0

    sget-object p0, Lv6/c;->i:Lv6/c;

    return-object p0

    :cond_0
    invoke-static {}, Lv6/c;->values()[Lv6/c;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    iget-object v4, v3, Lv6/c;->h:Ljava/lang/String;

    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Lv6/c$a;

    invoke-direct {v0, p0}, Lv6/c$a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lv6/c;
    .locals 1

    const-class v0, Lv6/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv6/c;

    return-object p0
.end method

.method public static values()[Lv6/c;
    .locals 1

    sget-object v0, Lv6/c;->l:[Lv6/c;

    invoke-virtual {v0}, [Lv6/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv6/c;

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

    iget-object v0, p0, Lv6/c;->h:Ljava/lang/String;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lv6/c;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
