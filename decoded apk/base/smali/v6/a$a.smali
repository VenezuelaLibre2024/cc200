.class public final enum Lv6/a$a;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv6/a$a;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lv6/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum i:Lv6/a$a;

.field public static final enum j:Lv6/a$a;

.field public static final enum k:Lv6/a$a;

.field public static final synthetic l:[Lv6/a$a;


# instance fields
.field public final h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lv6/a$a;

    const-string v1, "ABSENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lv6/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lv6/a$a;->i:Lv6/a$a;

    new-instance v1, Lv6/a$a;

    const-string v3, "STRING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lv6/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lv6/a$a;->j:Lv6/a$a;

    new-instance v3, Lv6/a$a;

    const-string v5, "OBJECT"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lv6/a$a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lv6/a$a;->k:Lv6/a$a;

    const/4 v5, 0x3

    new-array v5, v5, [Lv6/a$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lv6/a$a;->l:[Lv6/a$a;

    new-instance v0, Lv6/f;

    invoke-direct {v0}, Lv6/f;-><init>()V

    sput-object v0, Lv6/a$a;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lv6/a$a;->h:I

    return-void
.end method

.method public static bridge synthetic b(Lv6/a$a;)I
    .locals 0

    iget p0, p0, Lv6/a$a;->h:I

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lv6/a$a;
    .locals 1

    const-class v0, Lv6/a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv6/a$a;

    return-object p0
.end method

.method public static values()[Lv6/a$a;
    .locals 1

    sget-object v0, Lv6/a$a;->l:[Lv6/a$a;

    invoke-virtual {v0}, [Lv6/a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv6/a$a;

    return-object v0
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lv6/a$a;->h:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
