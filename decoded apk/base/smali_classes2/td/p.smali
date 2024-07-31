.class public abstract Ltd/p;
.super Ltd/t;
.source ""

# interfaces
.implements Lyd/f;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Ltd/t;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public computeReflected()Lyd/b;
    .locals 1

    invoke-static {p0}, Ltd/x;->d(Ltd/p;)Lyd/f;

    move-result-object v0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lyd/f;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
