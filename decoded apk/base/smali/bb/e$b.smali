.class public final enum Lbb/e$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbb/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbb/e$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lbb/e$b;

.field public static final enum i:Lbb/e$b;

.field public static final enum j:Lbb/e$b;

.field public static final enum k:Lbb/e$b;

.field public static final enum l:Lbb/e$b;

.field public static final enum m:Lbb/e$b;

.field public static final synthetic n:[Lbb/e$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 13

    new-instance v0, Lbb/e$b;

    const-string v1, "ALPHA"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbb/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lbb/e$b;->h:Lbb/e$b;

    new-instance v1, Lbb/e$b;

    const-string v3, "LOWER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lbb/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lbb/e$b;->i:Lbb/e$b;

    new-instance v3, Lbb/e$b;

    const-string v5, "MIXED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lbb/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lbb/e$b;->j:Lbb/e$b;

    new-instance v5, Lbb/e$b;

    const-string v7, "PUNCT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lbb/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lbb/e$b;->k:Lbb/e$b;

    new-instance v7, Lbb/e$b;

    const-string v9, "ALPHA_SHIFT"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lbb/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lbb/e$b;->l:Lbb/e$b;

    new-instance v9, Lbb/e$b;

    const-string v11, "PUNCT_SHIFT"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lbb/e$b;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lbb/e$b;->m:Lbb/e$b;

    const/4 v11, 0x6

    new-array v11, v11, [Lbb/e$b;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lbb/e$b;->n:[Lbb/e$b;

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

.method public static valueOf(Ljava/lang/String;)Lbb/e$b;
    .locals 1

    const-class v0, Lbb/e$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbb/e$b;

    return-object p0
.end method

.method public static values()[Lbb/e$b;
    .locals 1

    sget-object v0, Lbb/e$b;->n:[Lbb/e$b;

    invoke-virtual {v0}, [Lbb/e$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbb/e$b;

    return-object v0
.end method
