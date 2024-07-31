.class public final enum Lbe/d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbe/d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum i:Lbe/d;

.field public static final enum j:Lbe/d;

.field public static final enum k:Lbe/d;

.field public static final enum l:Lbe/d;

.field public static final enum m:Lbe/d;

.field public static final enum n:Lbe/d;

.field public static final enum o:Lbe/d;

.field public static final synthetic p:[Lbe/d;


# instance fields
.field public final h:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbe/d;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v2, "NANOSECONDS"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lbe/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lbe/d;->i:Lbe/d;

    new-instance v0, Lbe/d;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v2, "MICROSECONDS"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lbe/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lbe/d;->j:Lbe/d;

    new-instance v0, Lbe/d;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v2, "MILLISECONDS"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, Lbe/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lbe/d;->k:Lbe/d;

    new-instance v0, Lbe/d;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v2, "SECONDS"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v1}, Lbe/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lbe/d;->l:Lbe/d;

    new-instance v0, Lbe/d;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-string v2, "MINUTES"

    const/4 v3, 0x4

    invoke-direct {v0, v2, v3, v1}, Lbe/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lbe/d;->m:Lbe/d;

    new-instance v0, Lbe/d;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-string v2, "HOURS"

    const/4 v3, 0x5

    invoke-direct {v0, v2, v3, v1}, Lbe/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lbe/d;->n:Lbe/d;

    new-instance v0, Lbe/d;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-string v2, "DAYS"

    const/4 v3, 0x6

    invoke-direct {v0, v2, v3, v1}, Lbe/d;-><init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V

    sput-object v0, Lbe/d;->o:Lbe/d;

    invoke-static {}, Lbe/d;->b()[Lbe/d;

    move-result-object v0

    sput-object v0, Lbe/d;->p:[Lbe/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/TimeUnit;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lbe/d;->h:Ljava/util/concurrent/TimeUnit;

    return-void
.end method

.method public static final synthetic b()[Lbe/d;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lbe/d;

    sget-object v1, Lbe/d;->i:Lbe/d;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lbe/d;->j:Lbe/d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lbe/d;->k:Lbe/d;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lbe/d;->l:Lbe/d;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lbe/d;->m:Lbe/d;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lbe/d;->n:Lbe/d;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lbe/d;->o:Lbe/d;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lbe/d;
    .locals 1

    const-class v0, Lbe/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbe/d;

    return-object p0
.end method

.method public static values()[Lbe/d;
    .locals 1

    sget-object v0, Lbe/d;->p:[Lbe/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbe/d;

    return-object v0
.end method


# virtual methods
.method public final c()Ljava/util/concurrent/TimeUnit;
    .locals 1

    iget-object v0, p0, Lbe/d;->h:Ljava/util/concurrent/TimeUnit;

    return-object v0
.end method
