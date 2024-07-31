.class public final enum Lza/m$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lza/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lza/m$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lza/m$a;

.field public static final enum i:Lza/m$a;

.field public static final enum j:Lza/m$a;

.field public static final synthetic k:[Lza/m$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lza/m$a;

    const-string v1, "NUMERIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lza/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lza/m$a;->h:Lza/m$a;

    new-instance v1, Lza/m$a;

    const-string v3, "ALPHA"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lza/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lza/m$a;->i:Lza/m$a;

    new-instance v3, Lza/m$a;

    const-string v5, "ISO_IEC_646"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lza/m$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lza/m$a;->j:Lza/m$a;

    const/4 v5, 0x3

    new-array v5, v5, [Lza/m$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lza/m$a;->k:[Lza/m$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lza/m$a;
    .locals 1

    const-class v0, Lza/m$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lza/m$a;

    return-object p0
.end method

.method public static values()[Lza/m$a;
    .locals 1

    sget-object v0, Lza/m$a;->k:[Lza/m$a;

    invoke-virtual {v0}, [Lza/m$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lza/m$a;

    return-object v0
.end method
