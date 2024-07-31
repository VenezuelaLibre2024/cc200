.class public final enum Lh9/a$b;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lt8/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lh9/a$b;",
        ">;",
        "Lt8/c;"
    }
.end annotation


# static fields
.field public static final enum i:Lh9/a$b;

.field public static final enum j:Lh9/a$b;

.field public static final enum k:Lh9/a$b;

.field public static final synthetic l:[Lh9/a$b;


# instance fields
.field public final h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lh9/a$b;

    const-string v1, "UNKNOWN_EVENT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lh9/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lh9/a$b;->i:Lh9/a$b;

    new-instance v1, Lh9/a$b;

    const-string v3, "MESSAGE_DELIVERED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lh9/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lh9/a$b;->j:Lh9/a$b;

    new-instance v3, Lh9/a$b;

    const-string v5, "MESSAGE_OPEN"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lh9/a$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lh9/a$b;->k:Lh9/a$b;

    const/4 v5, 0x3

    new-array v5, v5, [Lh9/a$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lh9/a$b;->l:[Lh9/a$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lh9/a$b;->h:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lh9/a$b;
    .locals 1

    const-class v0, Lh9/a$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lh9/a$b;

    return-object p0
.end method

.method public static values()[Lh9/a$b;
    .locals 1

    sget-object v0, Lh9/a$b;->l:[Lh9/a$b;

    invoke-virtual {v0}, [Lh9/a$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh9/a$b;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lh9/a$b;->h:I

    return v0
.end method
