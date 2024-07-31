.class public final enum Lmb/b$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmb/b$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmb/b$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final i:Lmb/b$a$a;

.field public static final enum j:Lmb/b$a;

.field public static final enum k:Lmb/b$a;

.field public static final enum l:Lmb/b$a;

.field public static final enum m:Lmb/b$a;

.field public static final enum n:Lmb/b$a;

.field public static final synthetic o:[Lmb/b$a;


# instance fields
.field public final h:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmb/b$a;

    const-string v1, "IMAGE"

    const/4 v2, 0x0

    const-string v3, "image"

    invoke-direct {v0, v1, v2, v3}, Lmb/b$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/b$a;->j:Lmb/b$a;

    new-instance v0, Lmb/b$a;

    const-string v1, "VIDEO"

    const/4 v2, 0x1

    const-string v3, "video"

    invoke-direct {v0, v1, v2, v3}, Lmb/b$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/b$a;->k:Lmb/b$a;

    new-instance v0, Lmb/b$a;

    const-string v1, "TEXT"

    const/4 v2, 0x2

    const-string v3, "text"

    invoke-direct {v0, v1, v2, v3}, Lmb/b$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/b$a;->l:Lmb/b$a;

    new-instance v0, Lmb/b$a;

    const-string v1, "FILE"

    const/4 v2, 0x3

    const-string v3, "file"

    invoke-direct {v0, v1, v2, v3}, Lmb/b$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/b$a;->m:Lmb/b$a;

    new-instance v0, Lmb/b$a;

    const-string v1, "URL"

    const/4 v2, 0x4

    const-string v3, "url"

    invoke-direct {v0, v1, v2, v3}, Lmb/b$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmb/b$a;->n:Lmb/b$a;

    invoke-static {}, Lmb/b$a;->b()[Lmb/b$a;

    move-result-object v0

    sput-object v0, Lmb/b$a;->o:[Lmb/b$a;

    new-instance v0, Lmb/b$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmb/b$a$a;-><init>(Ltd/g;)V

    sput-object v0, Lmb/b$a;->i:Lmb/b$a$a;

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

    iput-object p3, p0, Lmb/b$a;->h:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic b()[Lmb/b$a;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lmb/b$a;

    sget-object v1, Lmb/b$a;->j:Lmb/b$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lmb/b$a;->k:Lmb/b$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lmb/b$a;->l:Lmb/b$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lmb/b$a;->m:Lmb/b$a;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lmb/b$a;->n:Lmb/b$a;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmb/b$a;
    .locals 1

    const-class v0, Lmb/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmb/b$a;

    return-object p0
.end method

.method public static values()[Lmb/b$a;
    .locals 1

    sget-object v0, Lmb/b$a;->o:[Lmb/b$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmb/b$a;

    return-object v0
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmb/b$a;->h:Ljava/lang/String;

    return-object v0
.end method
