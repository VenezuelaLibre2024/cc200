.class public final enum Lrb/b$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrb/b$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lrb/b$b;

.field public static final enum i:Lrb/b$b;

.field public static final synthetic j:[Lrb/b$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [Lrb/b$b;

    new-instance v1, Lrb/b$b;

    const-string v2, "ATTRIB"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lrb/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lrb/b$b;->h:Lrb/b$b;

    aput-object v1, v0, v3

    new-instance v1, Lrb/b$b;

    const-string v2, "UNIFORM"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lrb/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lrb/b$b;->i:Lrb/b$b;

    aput-object v1, v0, v3

    sput-object v0, Lrb/b$b;->j:[Lrb/b$b;

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

.method public static valueOf(Ljava/lang/String;)Lrb/b$b;
    .locals 1

    const-class v0, Lrb/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrb/b$b;

    return-object p0
.end method

.method public static values()[Lrb/b$b;
    .locals 1

    sget-object v0, Lrb/b$b;->j:[Lrb/b$b;

    invoke-virtual {v0}, [Lrb/b$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrb/b$b;

    return-object v0
.end method
