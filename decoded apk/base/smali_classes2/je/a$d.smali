.class public final enum Lje/a$d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lje/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lje/a$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lje/a$d;

.field public static final enum i:Lje/a$d;

.field public static final enum j:Lje/a$d;

.field public static final enum k:Lje/a$d;

.field public static final enum l:Lje/a$d;

.field public static final synthetic m:[Lje/a$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lje/a$d;

    const-string v1, "CPU_ACQUIRED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lje/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lje/a$d;->h:Lje/a$d;

    new-instance v0, Lje/a$d;

    const-string v1, "BLOCKING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lje/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lje/a$d;->i:Lje/a$d;

    new-instance v0, Lje/a$d;

    const-string v1, "PARKING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lje/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lje/a$d;->j:Lje/a$d;

    new-instance v0, Lje/a$d;

    const-string v1, "DORMANT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lje/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lje/a$d;->k:Lje/a$d;

    new-instance v0, Lje/a$d;

    const-string v1, "TERMINATED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lje/a$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lje/a$d;->l:Lje/a$d;

    invoke-static {}, Lje/a$d;->b()[Lje/a$d;

    move-result-object v0

    sput-object v0, Lje/a$d;->m:[Lje/a$d;

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

.method public static final synthetic b()[Lje/a$d;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lje/a$d;

    sget-object v1, Lje/a$d;->h:Lje/a$d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lje/a$d;->i:Lje/a$d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lje/a$d;->j:Lje/a$d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lje/a$d;->k:Lje/a$d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lje/a$d;->l:Lje/a$d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lje/a$d;
    .locals 1

    const-class v0, Lje/a$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lje/a$d;

    return-object p0
.end method

.method public static values()[Lje/a$d;
    .locals 1

    sget-object v0, Lje/a$d;->m:[Lje/a$d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lje/a$d;

    return-object v0
.end method
