.class public final Lje/c;
.super Lje/f;
.source ""


# static fields
.field public static final p:Lje/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lje/c;

    invoke-direct {v0}, Lje/c;-><init>()V

    sput-object v0, Lje/c;->p:Lje/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    sget v1, Lje/l;->c:I

    sget v2, Lje/l;->d:I

    sget-wide v3, Lje/l;->e:J

    sget-object v5, Lje/l;->a:Ljava/lang/String;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lje/f;-><init>(IIJLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Dispatchers.Default cannot be closed"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.Default"

    return-object v0
.end method
