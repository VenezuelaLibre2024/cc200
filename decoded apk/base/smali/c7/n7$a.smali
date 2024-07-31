.class public final enum Lc7/n7$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc7/n7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc7/n7$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum i:Lc7/n7$a;

.field public static final enum j:Lc7/n7$a;

.field public static final enum k:Lc7/n7$a;

.field public static final enum l:Lc7/n7$a;

.field public static final synthetic m:[Lc7/n7$a;


# instance fields
.field public final h:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, Lc7/n7$a;

    const-string v1, "AD_STORAGE"

    const/4 v2, 0x0

    const-string v3, "ad_storage"

    invoke-direct {v0, v1, v2, v3}, Lc7/n7$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lc7/n7$a;->i:Lc7/n7$a;

    new-instance v1, Lc7/n7$a;

    const-string v3, "ANALYTICS_STORAGE"

    const/4 v4, 0x1

    const-string v5, "analytics_storage"

    invoke-direct {v1, v3, v4, v5}, Lc7/n7$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lc7/n7$a;->j:Lc7/n7$a;

    new-instance v3, Lc7/n7$a;

    const-string v5, "AD_USER_DATA"

    const/4 v6, 0x2

    const-string v7, "ad_user_data"

    invoke-direct {v3, v5, v6, v7}, Lc7/n7$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lc7/n7$a;->k:Lc7/n7$a;

    new-instance v5, Lc7/n7$a;

    const-string v7, "AD_PERSONALIZATION"

    const/4 v8, 0x3

    const-string v9, "ad_personalization"

    invoke-direct {v5, v7, v8, v9}, Lc7/n7$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lc7/n7$a;->l:Lc7/n7$a;

    const/4 v7, 0x4

    new-array v7, v7, [Lc7/n7$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lc7/n7$a;->m:[Lc7/n7$a;

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

    iput-object p3, p0, Lc7/n7$a;->h:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lc7/n7$a;
    .locals 1

    sget-object v0, Lc7/n7$a;->m:[Lc7/n7$a;

    invoke-virtual {v0}, [Lc7/n7$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc7/n7$a;

    return-object v0
.end method
