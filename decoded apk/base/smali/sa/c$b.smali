.class public final enum Lsa/c$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsa/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsa/c$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lsa/c$b;

.field public static final enum i:Lsa/c$b;

.field public static final enum j:Lsa/c$b;

.field public static final enum k:Lsa/c$b;

.field public static final enum l:Lsa/c$b;

.field public static final enum m:Lsa/c$b;

.field public static final enum n:Lsa/c$b;

.field public static final enum o:Lsa/c$b;

.field public static final synthetic p:[Lsa/c$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lsa/c$b;

    const-string v1, "PAD_ENCODE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsa/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsa/c$b;->h:Lsa/c$b;

    new-instance v1, Lsa/c$b;

    const-string v3, "ASCII_ENCODE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lsa/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lsa/c$b;->i:Lsa/c$b;

    new-instance v3, Lsa/c$b;

    const-string v5, "C40_ENCODE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lsa/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lsa/c$b;->j:Lsa/c$b;

    new-instance v5, Lsa/c$b;

    const-string v7, "TEXT_ENCODE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lsa/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lsa/c$b;->k:Lsa/c$b;

    new-instance v7, Lsa/c$b;

    const-string v9, "ANSIX12_ENCODE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lsa/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lsa/c$b;->l:Lsa/c$b;

    new-instance v9, Lsa/c$b;

    const-string v11, "EDIFACT_ENCODE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lsa/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lsa/c$b;->m:Lsa/c$b;

    new-instance v11, Lsa/c$b;

    const-string v13, "BASE256_ENCODE"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lsa/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lsa/c$b;->n:Lsa/c$b;

    new-instance v13, Lsa/c$b;

    const-string v15, "ECI_ENCODE"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lsa/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lsa/c$b;->o:Lsa/c$b;

    const/16 v15, 0x8

    new-array v15, v15, [Lsa/c$b;

    aput-object v0, v15, v2

    aput-object v1, v15, v4

    aput-object v3, v15, v6

    aput-object v5, v15, v8

    aput-object v7, v15, v10

    aput-object v9, v15, v12

    const/4 v0, 0x6

    aput-object v11, v15, v0

    aput-object v13, v15, v14

    sput-object v15, Lsa/c$b;->p:[Lsa/c$b;

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

.method public static valueOf(Ljava/lang/String;)Lsa/c$b;
    .locals 1

    const-class v0, Lsa/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsa/c$b;

    return-object p0
.end method

.method public static values()[Lsa/c$b;
    .locals 1

    sget-object v0, Lsa/c$b;->p:[Lsa/c$b;

    invoke-virtual {v0}, [Lsa/c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsa/c$b;

    return-object v0
.end method
